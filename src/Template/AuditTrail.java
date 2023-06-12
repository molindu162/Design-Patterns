package Template;

public class AuditTrail implements Record{
    @Override
    public void record() {
        System.out.println("Audit");
    }

}
