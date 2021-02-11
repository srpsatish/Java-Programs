class NoMatchFoundException extends Exception {
    NoMatchFoundException(String str) {
        super(str);
    }
}

public class AssignmentEight{
    public static void main(String arg[]) {
        try{
            int flag= 0;
            for(int i=0; i<arg.length; i++){
                if(arg[i].equals("kolkata")){
                    flag=1;
                    break;
                } else
                    flag=0;
            }
            if(flag==1){
                System.out.println("Found");
            }else 
                throw new NoMatchFoundException("kolkata not found");
        }catch(NoMatchFoundException e){
            System.out.println(e);
        }
    }
}
