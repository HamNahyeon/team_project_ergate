package edu.kh.semi.questions.model.service;

import static edu.kh.ergate.common.JDBCTemplate.*;

import java.sql.Connection;

import edu.kh.semi.questions.model.dao.QuestionsDAO;
import edu.kh.semi.questions.model.vo.Questions;



public class QuestionsService {
	
	private QuestionsDAO dao = new QuestionsDAO();

	public int freQuestionsSend(Questions questions) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.freQuestionsSend(conn, questions);
		
		if(result > 0)	commit(conn);
		else			rollback(conn);
		
		close(conn);

		return result;
	}

}
