public class MyTest1 {
    //Integer i = new Integer(5);
    //static int i = 5;
    public static void main (String args[]) {

        boolean is_file_copied=false;
        int i=0;
        while(! is_file_copied && i <5) {
            try {
                is_file_copied=true;
                //Files.copy(SIMULATOR_ZIP,stageSimulatorTestsDir.resolve(SIMULATOR_ZIP.getFileName()));
                //throw new Exception("new Exception");
            }
            catch (Exception e) {
                is_file_copied=false;
                System.out.println("Inside file copy catch , will retry ...");
                try { Thread.sleep(1000); } catch (Exception e1) { System.out.print(e1.toString()); }
                i++;
            }

        }


    }

}
