package beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rolv-Arild on 19.09.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Question {

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "question")
    private String question;

    @XmlElement(name = "options")
    private List<String> options = new ArrayList<>();

    @XmlElement(name = "answerIndex")
    private int answerIndex;


    /* Getters */
    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getAnswerIndex() {
        return answerIndex;
    }


    /* Setters */
    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public void setAnswerIndex(int answerIndex) {
        this.answerIndex = answerIndex;
    }
}