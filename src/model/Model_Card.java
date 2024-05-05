package model;

import javax.swing.Icon;

public class Model_Card {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Model_Card(String title) {
        this.title = title;
//        this.icon = icon;
//        this.values = values;
//        this.description = description;
    }

    public Model_Card() {
    }
    
    private Icon icon;
    private String title;
    private String values;
    private String description;
}
