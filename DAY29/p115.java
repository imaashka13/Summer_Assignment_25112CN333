import java.util.*;
public class p115 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Welcome to the String Operations System!\n");
        System.out.print("Enter your primary string: ");
        String str=sc.nextLine();
        int choice;
        while(true)
        {
            System.out.println("Menu:");
            System.out.println("Current String: " + str);
            System.out.println("1. Reverse String");
            System.out.println("2. Check Palindrome");
            System.out.println("3. Convert to Uppercase/Lowercase");
            System.out.println("4. Count Vowels and Consonants");
            System.out.println("5. Enter a new string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 6) 
            {
                System.out.println("Exiting...");
                break;
            }
            switch (choice)
            {
                case 1:
                    String rev="";
                    for(int i=str.length()-1;i>=0;i--)
                        rev+=str.charAt(i);
                    System.out.println("Reversed String: " + rev);
                    break;
                case 2:
                    String revStr="";
                    for(int i=str.length()-1;i>=0;i--)
                        revStr+=str.charAt(i);
                    if(str.equals(revStr))
                        System.out.println("The string is a palindrome.");
                    else
                        System.out.println("The string is not a palindrome.");
                    break;
                case 3:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;
                case 4:
                    int vowels=0, consonants=0;
                    str=str.toLowerCase();
                    for(int i=0;i<str.length();i++)
                    {
                        char ch=str.charAt(i);
                        if(ch>='a' && ch<='z')
                        {
                            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                                vowels++;
                            else
                                consonants++;
                        }
                    }
                    System.out.println("Vowels: " + vowels);
                    System.out.println("Consonants: " + consonants);
                    break;
                case 5:
                    System.out.print("Enter your new string: ");
                    str=sc.nextLine();
                    System.out.println("String updated successfully.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

