package edu.kh.ergate.admin.model.dao;
import static edu.kh.ergate.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
public class DMLDAO {
	private Statement stmt=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private Properties prop =null;
	
	public DMLDAO() {
	prop = new Properties();
	try {
		String filePath = adminBoardDAO.class.getResource("/edu/kh/ergate/sql/adminBoard/board-query.xml").getPath();
		
		prop.loadFromXML(new FileInputStream(filePath));
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

	/** 게시글 블라인드
	 * @param conn
	 * @param boardNo
	 * @param boardTypeNo
	 * @return
	 * @throws Exception
	 */
	public int boardDel(Connection conn, int boardNo, int boardTypeNo) throws Exception{
		// TODO Auto-generated method stub
		int result =0;
		String sql = prop.getProperty("boardDel");
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			result = pstmt.executeUpdate();
		}finally {
			close(pstmt);
		}
		return result;
	}
}
