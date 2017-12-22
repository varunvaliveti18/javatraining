package com.sapient.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.IDao;
import com.sapient.util.ExamUtil;
import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public class ExamSerImpl implements IExamSer{
	
	private static IExamSer ser = new ExamSerImpl(); 
	
	private static Map<Integer,Question> qmap;
	private ExamSerImpl(){}
	
	static{
		IDao dao = ExamDaoImpl.getDaoInstance();
		qmap = dao.viewQuestions();
		
	}
	
	
	public static IExamSer getInstance(){
		return ser;
	}

	@Override
	public List<Question> genrateQuestions() {
		List<Question> lst = new ArrayList<>();
		Set<Integer> qids = ExamUtil.generateUniqueNos(5);
		Question ques = null;
		for (int qno: qids){
			ques = qmap.get(qno);
			lst.add(ques);
		}
		
			return lst;
	}

	@Override
	public int evaluate(List<Answer> alist) {
		int score = 0;
		Question ques = null;
		for (Answer answer : alist){
			ques = qmap.get(answer.getQid());
			if(ques.getAnswer().equalsIgnoreCase(answer.getAnswer()))
				++score;
		}
	
		return score;
	}
	
	
}
