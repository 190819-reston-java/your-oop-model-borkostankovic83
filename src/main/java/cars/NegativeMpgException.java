package cars;

public class NegativeMpgException extends RuntimeException {



		public NegativeMpgException(){
			this("A Car cannot have negative Mpg");
		}

		public NegativeMpgException(String message){
			super(message);

		}
	
}
