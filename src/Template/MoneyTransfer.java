package Template;

public class MoneyTransfer extends Task{
    public MoneyTransfer(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    public void doExecute() {
        System.out.println("Transfer Money");
    }
}
