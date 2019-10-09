package com.nad.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Service;
import org.apache.axis.client.ServiceFactory;

public class WSTest {

	public static void main(String[] args) throws ServiceException, MalformedURLException {
		javax.xml.rpc.ServiceFactory factory=ServiceFactory.newInstance();
		javax.xml.rpc.Service service= factory.createService(new URL(""), new QName(""));
	}
}
