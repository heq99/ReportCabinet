package com.reportcabinet;

import java.util.List;

public class ReportCabinet {
	
	private List<Report> reportList = null;
	
	private List<ReportCabinet> childCabnet = null;
	
	private ReportCabinet parentCabinet = null;

	public void addReport(Report report) {
		this.reportList.add(report);
	}
	
	public void removeReport(Report report) {
		this.reportList.remove(report);
	}
	
	public void addChildCabinet(ReportCabinet childReportCabinet) {
		this.childCabnet.add(childReportCabinet);
	}
	
	public void removeChildCabinet(ReportCabinet childReportCabinet) {
		this.childCabnet.remove(childReportCabinet);
	}

	public List<Report> getReportList() {
		return reportList;
	}

	public void setReportList(List<Report> reportList) {
		this.reportList = reportList;
	}

	public List<ReportCabinet> getChildCabnet() {
		return childCabnet;
	}

	public void setChildCabnet(List<ReportCabinet> childCabnet) {
		this.childCabnet = childCabnet;
	}

	public ReportCabinet getParentCabinet() {
		return parentCabinet;
	}

	public void setParentCabinet(ReportCabinet parentCabinet) {
		this.parentCabinet = parentCabinet;
	}


}
