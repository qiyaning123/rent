package until;

public class PageBean {

	private int page; // 页数
    private int pageSize; // 每页条数
    private int start;  // 每页开始
    private int end;	//每页结束
    
    public PageBean(int page, int pageSize) {
        super();
        this.page = page;
        this.pageSize = pageSize;
    }
    
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStart() {
        return (page-1)*pageSize + 1;
    }
    
    public int getEnd() {
    	return page * pageSize;
    }
}
