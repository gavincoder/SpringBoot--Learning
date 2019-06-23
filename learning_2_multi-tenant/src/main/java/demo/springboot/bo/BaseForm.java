package demo.springboot.bo;

/*
*定义租户基本信息
*
*/
public class BaseForm {
    private String tenantId; //租户编号（客户英文名+客户号）,租户编号对应schema名称

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
