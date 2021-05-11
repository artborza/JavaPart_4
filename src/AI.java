	public class AI implements IWebsiteCreator{

		public String name;
		public String language;
		public AI(String nameInput, String languageInput) {
			// TODO Auto-generated constructor stub
			this.name = nameInput;
			this.language = languageInput;
		}
		@Override
		public void creatorWebsite(String template, String titleName) {
			// TODO Auto-generated method stub
			System.out.println(language + " automated Setup template: "+ template);
			System.out.println(language + " automated Set Title name: "+ titleName);
		}
		

		
	}