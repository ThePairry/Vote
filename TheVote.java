import java.util.Scanner;
class TheVote
{
    static Scanner sc = new Scanner(System.in);
    static Scanner se = new Scanner(System.in);
    
    public static void ShowData() 
    {
     System.out.println("ID.1 = Mr.Odinson");
     System.out.println("ID.2 = Miss.Romanoff");
     System.out.println("ID.3 = Mr.Thanos");
     System.out.println("ID.4 = Mr.Stark");
     System.out.println("ID.5 = Mr.Rogers");
    }

    public static void getVote(int[] vote,String [] name) 
    {
        for(int i = 1; i <= 200; i++)
        {
            System.out.print("Vote ID you want : ");
            vote[i] = sc.nextInt();
            int k = vote[i];
            System.out.println("Name "+name[k]);
            System.out.println("");
        }
    }

    public static void countVote(int[] count,int[] vote) 
    {
        for (int i = 1; i <= 200; i++)
        {
            count[vote[i]]++;
        }
    }

    public static int findMax(int[] count) 
    {
        int max = 1;
        for (int i = 2; i <= 200; i++) 
        {
            if (count[i] > count[max]) 
            {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        int[] id = new int[] {0,1,2,3,4,5};
        String[] name = new String[] {"","Mr.Odinson","Miss.Romanoff","Mr.Thanos","Mr.Stark","Mr.Rogers"};
        int[] vote = new int[201];
        int[] count = new int[201];

        ShowData();
        getVote(vote,name);
        countVote(count,vote);
        int max = findMax(count);
        System.out.println("The winner who became to Prime minister is: " + name[max]+"  Score is "+count[max]);
    }
}