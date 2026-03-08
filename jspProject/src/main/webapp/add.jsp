<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<body>
 
   <div  class="container mt-5">
      <div class="row justify-content-center">
        <div class="col-md-5">
          <div class="card shadow">
           <div class="card-header text-center bg-primary text-light">
           <h4>Add Two Numbers</h3>
            <div class ="card-body">
              <form>
               <div class="mb-3">
               <label class="form-label mt-2">First Number.</label>
               <input type="text" class="form-control" name="num1" required>
                              <label class="form-label mt-2">Second Number</label>
               <input type="text" class="form-control" name="num2" required>
               <button class="btn btn-success mt-5">Addition</button>
               </div>
              </form>
            </div>
           </div>
          </div>
        </div>
      </div>
   </div>
   
   
 
   <%!  int addNums(String n1, String n2) {
	   if(n1!=null && n2!=null) {
		   int res = Integer.parseInt(n1) + Integer.parseInt(n2);
		   return res;
	   }
	   return 0;
   }
   %>
   
   <%
   String n1 = request.getParameter("num1");
   String n2=request.getParameter("num2");
   out.println("Sum is :" + addNums(n1, n2));
   %>
	   
       


   
</body>
</html>