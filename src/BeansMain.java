import beans.DataInfos;
import beans.MemberBean;

public class BeansMain {
    
    public static void main(String[] args) {
        DataInfos dataInfos = new DataInfos();
        MemberBean memberBean = dataInfos.getDataWithMemberBean();

        System.out.println(memberBean.getFirstName() + "" 
                          + memberBean.getSecondName() + "" + memberBean.getHandleName());
    }
}
