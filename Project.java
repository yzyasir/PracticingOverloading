class Project {

    private String name;
    private String description;

    // Member variables are typically declared inside a class before any method and are accessed via getter and setter methods. 
    // The variables themselves should almost always be declared as private to prevent access directly to the field. 
    // Getters are methods that retrieve a field value and setters are methods that set the field value.

    // Note: Remember that field, attribute, and member variable all refer to the same thing.

    // getters 
    public String getName(){
        return name;
    }
    public String getDescription(){
            return description;
    }

    // setters
    public void setName(String projectName){
        name = projectName;
    }
    public void setDescription(String description){
        this.description = description;
        // The this keyword is necessary here to specify that we are talking about the instance variable and not the parameter variable.
    }

    public String elevatorPitch(String name, String description){
            return "My idea is called, " + name + " " + description;
        }
    
    // Here below I am doing something called overloading, notice hoe the methods have the same name, but different parameters?

    public String projectMaker(){
        return "Hey guys, I have a project idea!";
    }

    public String projectMaker(String name){
        return "My idea is called " + name;
    }

    public String projectMaker(String name, String description){
        return name + " is a cool name right?" + " Its concept of " + description + ", really speaks to me!";
    }
}