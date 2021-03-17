public class ranking
{
    public static void leaderboard(String [] names, int [] scores)
    {
        int temp1, n = names.length;
        String temp2;
        for(int i=0; i < n; i++)
        {
            for(int j=0; j < n; j++)
            {
                if(scores[i] < scores[j])
                {
                    temp1 = scores[i];       temp2 = names[i];        
                    scores[i] = scores[j];   names[i] = names[j]; 
                    scores[j] = temp1;       names[j] = temp2;
                }
            }
        }
        System.out.println("\n=--LEADERBOARD--=");
        for(int i=0; i < n; i++)
        {
            System.out.println((i+1)+". "+names[i]+"\t"+scores[i]);
        }
        return;
    }
    
    public static String[] addName(String [] names, String el_name)
    {
        int n = names.length;
        String new_names[] = new String[n+1];
        
        for(int i=0; i < n; i++)
            new_names[i] = names[i];
        new_names[n] = el_name;
        return new_names;
    }
    
    public static int[] addScore(int [] scores, int el_score)
    {
        int n = scores.length;
        int new_scores[] = new int[n+1];
        
        for(int i=0; i < n; i++)
            new_scores[i] = scores[i];
        new_scores[n] = el_score;
        return new_scores;
    }
}