import java.util.*;
public class Main
{
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st string:");
    String s1=sc.nextLine();
    System.out.println("Enter 2st string:");
    String s2=sc.nextLine();
    System.out.println("concatenated string is: "+s1+s2);
    
    
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    System.out.println("Enter char to replace:");
    char oldchar=sc.next().charAt(0);
    System.out.println("Enter char to replace:");
    char newchar=sc.next().charAt(0);
    System.out.println("relaced result:"+str.replace(oldchar,newchar));
   
    System.out.println("Enter string to split:");
    String toSplit=sc.nextLine();
    System.out.println("Split by Character:");
    String delimiter=sc.nextLine();
    String splitparts[]=toSplit.split(delimiter);
    System.out.println("split results:");
    for(String part : splitparts)
    {
        System.out.println(part);
    }
    
    System.out.println("enter the main string:");
    String mainstr=sc.nextLine();
    System.out.println("ENter substring to search:");
    String substr=sc.nextLine();
    int Index=mainstr.indexOf(substr);
    if(Index!=-1)
    System.out.println("found at index:"+Index);
    else
    System.out.println("substring not found");
    
    
    System.out.println("enter a string");
    String input=sc.nextLine();
    System.out.println("enter position:");
    int pos=sc.nextInt();
    if(pos>=0&&pos<input.length())
    System.out.println("char at position"+pos+":"+input.charAt(pos));
    else
    System.out.println("invalid position");
}
}
