package Nonpro_page;

public class answerclass {

    private int optionA, optionB, optionC, optionD, questionid, answerid;

    public answerclass(int questionide, int optiona, int optionb, int optionc, int optiond, int answerids)
    {
    questionid = questionide;
    optionA = optiona;
    optionB = optionb;
    optionC = optionc;
    optionD = optiond;
    answerid = answerids;

    }

    public int getOptionA() {
        return optionA;
    }

    public int getOptionB() {
        return optionB;
    }

    public int getOptionC() {
        return optionC;
    }

    public int getOptionD() {
        return optionD;
    }

    public int getQuestionid() {
        return questionid;
    }

    public int getAnswerid() {
        return answerid;
    }
}
