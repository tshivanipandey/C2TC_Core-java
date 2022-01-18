package mypro;

public class StudentIdNotFoundException extends Exception {

		// TODO Auto-generated method stub
		int sid;

		StudentIdNotFoundException()
		{		
		}

		public StudentIdNotFoundException(int sid) {
			this.sid = sid;
		}

		@Override
		public String toString() {
	      return "Exception :: Student id not found!!";
		}

		@Override
		public String getMessage() {
			return "Student with id "+ sid + " Not found!!";
		}
		
		

	}


