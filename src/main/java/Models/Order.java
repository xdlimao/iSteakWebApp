package Models;

import java.util.Date;
import java.util.UUID;

import Models.Types.OrderType;
import Models.Types.OperationType;

public class Order {

	public UUID Id;
	public int Code;
	public Enum<OrderType> Type;
	public Enum<OperationType> OperationType;
	public String SenderType;
	public String SenderName;
	public String RecipientType;
	public String RecipientName;
	public String IssueDate;
	public String ShippingDate;
	public String ReceiptDate;
	public String StatusName;
	public int Quantity;
	public double Value;
	public String Note;
	public Date CreationDate;
	public UUID CreationUserId;
	public String CreationUserName;
	public Date ChangeDate;
	public UUID ChangeUserId;
	public String ChangeUserName;
	public Date ExclusionDate;
	public int RecordStaus;
	
}
