public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		getServletContext().getRequestDispatcher("index.jsp").forward(request, response);
    	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}