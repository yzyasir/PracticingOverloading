class ProjectTest {
    public static void main(String[] args){
        Project p = new Project(); // Here I am instantiating it as you usually need to do

        String pitch = p.projectMaker();
        System.out.println(pitch); //Need to print here to get a response in the terminal
        String pitchWithName = p.projectMaker("Wise Words");
        System.out.println(pitchWithName);
        String pitchWithDesc = p.projectMaker("Wise Words", "a place where you can share wise words with others");
        System.out.println(pitchWithDesc);
    }

    // In order to compile, aim it into the test file because thats where the main function is
    // We type out "javac ProjectTest.java", if nothing shows up, then it compiled successfully
    // Then "java ProjectTest"
}