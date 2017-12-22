package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sapient.service.ExamSerImpl;
import com.sapient.service.IExamSer;
import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public class Client {
	
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Start quiz");
		IExamSer ser = ExamSerImpl.getInstance();
		List<Question> lst = ser.genrateQuestions();
		List<Answer> alist = new ArrayList<Answer>();
		Answer answer = null;   
		int i =0;
		int score =0;
		for(Question ques : lst){
			System.out.println(++i + " " + ques.getQdesc());
			System.out.println(ques.getOpta());
			System.out.println(ques.getOptb());
			System.out.println(ques.getOptc());
			String str =scan.next();
			answer = new Answer(ques.getQid(),str);
			alist.add(answer);
			System.out.println("-----------------------------");
			
			
		}
		int score1 = ser.evaluate(alist);
		System.out.println("your score is " + score1);
		
	}

}
