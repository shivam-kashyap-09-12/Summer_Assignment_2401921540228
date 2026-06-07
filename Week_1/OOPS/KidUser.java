package Week_1.OOPS;
class KidUser implements LibraryUser{
    int age;
    String BookType;
    public void registerAccount(){
        if(age<12){
            System.out.println("You have successfully registered under a kids account");
        }
        else{
            System.out.println("Sorry, age must be less than 12 to register as a kid");
        }
    }
    public void requestBook(){
        if (BookType.equalsIgnoreCase("Kids")){
            System.out.println("Book Issued Successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
