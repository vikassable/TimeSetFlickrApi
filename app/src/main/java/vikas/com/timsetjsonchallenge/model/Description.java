package vikas.com.timsetjsonchallenge.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description implements Serializable
{

    @SerializedName("_content")
    @Expose
    private String content;
    private final static long serialVersionUID = -7246696345172748803L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Description{" +
                "content='" + content + '\'' +
                '}';
    }
}