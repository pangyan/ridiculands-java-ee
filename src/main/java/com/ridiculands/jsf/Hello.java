/**
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package com.ridiculands.jsf;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("helloDnlm")
@SessionScoped
public class Hello implements Serializable {

	private static final long serialVersionUID = 5443351151396868723L;
	private String name;

	public Hello() {
	}

	public String getName() {
		return name + ".  I DNLM.";
	}

	public void setName(String user_name) {
		this.name = user_name;
	}
}
