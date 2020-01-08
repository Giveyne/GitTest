package newGitTest;


public class newFileToGit {

    public static double func (double x){

        return (Math.cos(Math.pow(x, 5))+Math.pow(x, 4)-345.3*x-23);

    }

    public static double solve(double start, double end){
        if ((end - start) <= 0.001)
            return start;
        double midle = start + ((end - start) / 2);
        if (func(start)*func(midle) > 0) {
            return solve(midle, end);
        }
        else {return solve(start, midle);}


    }

    public static void main(String[] args) {
        System.out.println(solve (0, 10));
    }
}