/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.basicmodule;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.BaseModuleActivator;

/**
 * This class contains the logic that is run every time this module is either started or shutdown
 */
public class BasicModuleActivator extends BaseModuleActivator {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	private String author;
	
	private String code;
	
	private String destination;
	
	private String destinationuri;
	
	private String enterer;
	
	private String event;
	
	private String receiver;
	
	private String responseid;
	
	private String resposible;
	
	private String sender;
	
	private String source;
	
	private String sourceuri;
	
	private String target;
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getDestinationuri() {
		return destinationuri;
	}
	
	public void setDestinationuri(String destinationuri) {
		this.destinationuri = destinationuri;
	}
	
	public String getenterer() {
		return enterer;
	}
	
	public void setenterer(String enterer) {
		this.enterer = enterer;
	}
	
	public String getevent() {
		return event;
	}
	
	public void setevent(String event) {
		this.event = event;
	}
	
	public String getreceiver() {
		return receiver;
	}
	
	public void setreceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public String getresponseid() {
		return responseid;
	}
	
	public void setresponseid(String responseid) {
		this.responseid = responseid;
	}
	
	public String getresponsible() {
		return resposible;
	}
	
	public void setresponsible(String resposible) {
		this.resposible = resposible;
	}
	
	public String getsender() {
		return sender;
	}
	
	public void setsender(String sender) {
		this.sender = sender;
	}
	
	public String getsource() {
		return source;
	}
	
	public void setsource(String source) {
		this.source = source;
	}
	
	public String getsourceuri() {
		return sourceuri;
	}
	
	public void setsourceuri(String sourceuri) {
		this.sourceuri = sourceuri;
	}
	
	public String gettarget() {
		return target;
	}
	
	public void settarget(String target) {
		this.target = target;
	}
	
}
