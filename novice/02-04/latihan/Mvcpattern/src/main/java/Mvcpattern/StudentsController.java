package main.java.Mvcpattern;

public class StudentsController
{
    private Students model;
    private StudentsView view;

    public StudentsController(Students model, StudentsView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setStudentsName(String name)
    {
        model.setName(name);
    }

    public String getStudentsName()
    {
        return model.getName();
    }

    public void setStudentsRollNo(String rollNo)
    {
        model.setRollNo(rollNo);
    }

    public String getStudentsRollNo()
    {
        return model.getRollNo();
    }

    public void updateView()
    {
        view.printStudentsDetails(model.getName(), model.getRollNo());
    }
}