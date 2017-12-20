package utils;

import java.util.List;

/**
 * 分页对象
 * 
 * @author YHwin
 * 
 */
public class Page {
	
	/**
	 *当前页码 （已知）
	 */
	private int pageNum = 1;
	
	/**
	 * 每页记录数（已知）
	 */
	private int pageSize = 3;
	
	/**
	 * 当前查询条件下的总记录数
	 */
	private int totalCount = 0;
	
	/**
	 * 当前查询条件下的页面总页数
	 */
	private int totalPage = 1;
	
	/**
	 * 开始行号
	 */
	private int startNum = 0;
	
	/**
	 * 结束行号
	 */
	private int endNum = 0;
	
	/**
	 *查询结果集 
	 */
	private List<?> list;

	
	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	/**
	 * totalCount   pageSize   totalPage
	 *    0				10		  1
	 * 	  85			10		  9
	 * 	  100           10        10
	 * 
	 * @return
	 */
	public int getTotalPage() {
		//计算总页数
		totalPage = totalCount/pageSize;
		if(totalCount == 0 || totalCount%pageSize != 0){
			//totalPage = totalCount/pageSize +1;
			totalPage++;
		}
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartNum() {
		
		return (pageNum-1)*pageSize;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return (pageNum*pageSize)+1;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
	
	
}
