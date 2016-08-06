package com.cmpe202.g62.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cmpe202.g62.model.Member;
import com.cmpe202.g62.notification.MemberObserver;
import com.cmpe202.g62.util.DBConnection;

public class Membership {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Member createMember(Member m){
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement("INSERT INTO Member(username, first_name, last_name, password, member_type) VALUES (?, ?, ?, ?, ?)",
					PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, m.getUserName());
			pstmt.setString(2, m.getFirstName());
			pstmt.setString(3, m.getLastName());
			pstmt.setString(4, m.getPassword());
			pstmt.setString(5, m.getMemberType());
			int result = pstmt.executeUpdate();
			if(result > 0){
				rs = pstmt.getGeneratedKeys();
				while(rs.next()){
					m.setMemberId(rs.getInt(1));
					new MemberObserver(m);
					m.setMessage("Dear " +m.getFirstName() +" "+m.getLastName() +", your membership is confirmed");
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong. Cannot add member");
			e.printStackTrace();
		} finally{
			DBConnection.close(conn, pstmt, null);
		}
		return m;
	}
	
	public Member updateMember(Member m){
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement("UPDATE member SET first_name=?, last_name=?, password=?, member_type=? WHERE username=?");
			pstmt.setString(1, m.getFirstName());
			pstmt.setString(2, m.getLastName());
			pstmt.setString(3, m.getPassword());
			pstmt.setString(4, m.getMemberType());
			pstmt.setString(5, m.getUserName());
			pstmt.executeUpdate();
			new MemberObserver(m);
			m.setMessage("Dear " +m.getFirstName() +" "+m.getLastName() +", your details are updated");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong. Cannot update member");
			e.printStackTrace();
		} finally{
			DBConnection.close(conn, pstmt, null);
		}
		return m;
	}

	
	public void deleteMember(String username){
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement("DELETE FROM member WHERE username=?");
			pstmt.setString(1, username);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong. Cannot delete member");
			e.printStackTrace();
		} finally{
			DBConnection.close(conn, pstmt, null);
		}
	}

	
	public Member getMember(String username){
		Member m=null;
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement("SELECT member_id, username, first_name, last_name, password, member_type FROM member where username=?");
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			m = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong. Cannot fetch member");
			e.printStackTrace();
		} finally{
			DBConnection.close(conn, pstmt, rs);
		}
		return m;
	}


}
