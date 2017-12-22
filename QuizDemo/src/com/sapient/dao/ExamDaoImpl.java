package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.sapient.util.ExamUtil;
import com.sapient.vo.Question;
import static com.sapient.util.ExamUtil.*;

public class ExamDaoImpl implements IDao {
	
	private static IDao dao = new ExamDaoImpl();
	
	private ExamDaoImpl(){
	}
	
	public static IDao getDaoInstance(){
		return dao;
	}
	

	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());
		}
	}

	@Override
	public Map<Integer, Question> viewQuestions() {
		Map<Integer, Question> map = new HashMap<>();
		Question ques = null;
		String url = ExamUtil.URL;
		try (Connection conn = DriverManager.getConnection(url, UNAME, PWD)) {
			String sql = "select * from questions";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				ques = new Question(rs.getInt("qid"), rs.getString("qdesc"), rs.getString("optiona"),
						rs.getString("optionb"), rs.getString("optionc"), rs.getString("answer"));
				map.put(ques.getQid(), ques);
			}

		} catch (Exception e) {
			e.getMessage();

		}
		return map;
	}

}
