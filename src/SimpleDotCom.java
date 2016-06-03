/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs)  {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess)  {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell:locationCells)  {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.print(result);
        return result;
    }
}
