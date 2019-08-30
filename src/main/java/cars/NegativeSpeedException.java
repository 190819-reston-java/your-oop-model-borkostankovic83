package cars;

public class NegativeSpeedException extends RuntimeException {



		public NegativeSpeedException(){
			this("A Car cannot have negative speed");
		}

		public NegativeSpeedException(String message){
			super(message);

		}
	
}
