public class MadLibs {
public String classmate = "Enzo";
public String city = "Dallas";
public String noun = "tree";
public String adjective = "purple";
public String pluralNoun = "leaves";
public String pluralAnimal = "chipmunks";
public boolean trueOrFalse = true;
public double decimalBiggerThan1 = 1.10 ;
public int number1 = 72;
public int number2 = 2;
public int wholeNumberBetween1And4 = 3;
public String miltonTeacher = "Mr. McDonald";
public String miltonDean = "Ms. Sugrue";
public char letterGrade = 'B';
public String season = "fall";
public char worseLetterGrade = 'C';

    public static void main(String[] args) {
        MadLibs myStory = new MadLibs();
    }

    public MadLibs(){
        System.out.println("word");
        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class." + " I hope we do well. Right now I have a " + worseLetterGrade + ".";
        //now print story to the dos window
        System.out.println(story);

    }
}
