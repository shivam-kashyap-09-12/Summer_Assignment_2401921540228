package Week_1.OOPS;

class AdultUser implements LibraryUser{
    int age;
    String BookType;
    public void registerAccount(){
        if(age>12){
            System.out.println("You have successfully registered under an Adult account");
        }
        else{
            System.out.println("Sorry, age must be greater than 12 to register as an adult");
        }
    }
    public void requestBook(){
        if (BookType.equalsIgnoreCase("Fiction")){
            System.out.println("Book Issued Successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

