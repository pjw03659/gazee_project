package com.multi.gazee.customerService;

public class FaqVO {
	private String faqTitle;
	private String faqContent;
	private int faqView;
	private String faqCategory;
	public String getFaqTitle() {
		return faqTitle;
	}
	public void setFaqTitle(String faqTitle) {
		this.faqTitle = faqTitle;
	}
	public String getFaqContent() {
		return faqContent;
	}
	public void setFaqContent(String faqContent) {
		this.faqContent = faqContent;
	}
	public int getFaqView() {
		return faqView;
	}
	public void setFaqView(int faqView) {
		this.faqView = faqView;
	}
	public String getFaqCategory() {
		return faqCategory;
	}
	public void setFaqCategory(String faqCategory) {
		this.faqCategory = faqCategory;
	}
	@Override
	public String toString() {
		return "faqVO [faqTitle=" + faqTitle + ", faqContent=" + faqContent + ", faqView=" + faqView + ", faqCategory="
				+ faqCategory + "]";
	}
	
	
}
