package lesson_6;
//OCP
 class BaseTeacher {
    private String name;
    private int group;
    public BaseTeacher(String name, int group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getGroup(){
        return group;
    }

    public void teach() {
        System.out.println("Teacher " + name + " teaches a lesson in " + group);
    }
}
