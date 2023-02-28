class Decipherer {

	public static String decoder (String message) {
		
		int messageLng = Math.round( message.length() / 2);
		String messageCut = message.substring(5, 5 + messageLng);
		String newCharMessage = messageCut.replace("@#?", " ");
		String realMessage = new StringBuilder(newCharMessage).reverse().toString();
		
		return realMessage;
	}

	public static void main(String[] args){
	
		System.out.println(decoder("0@sn9sirppa@#?ia'jgtvryko1"));

		System.out.println(decoder("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));

		System.out.println(decoder("aopi?sedohtém@#?sedhtmg+p9l!"));
	}
}
