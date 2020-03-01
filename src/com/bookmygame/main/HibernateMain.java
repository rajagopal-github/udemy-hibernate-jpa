package com.bookmygame.main;

import org.hibernate.SessionFactory;

import com.bookmygame.hibernate.HibernateUtil;

public class HibernateMain {

	public static void main(String[] args) {
		SessionFactory session = HibernateUtil.getSessionFactory();
	}

}
