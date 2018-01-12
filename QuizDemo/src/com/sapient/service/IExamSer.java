package com.sapient.service;

import java.util.List;

import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public interface IExamSer {
	
	List<Question> genrateQuestions(int nos);
	int evaluate(List<Answer> alist);

}
