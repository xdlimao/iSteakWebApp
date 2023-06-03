package Models;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import Models.Types.ProfileType;
import Models.Types.Address;

public class User {

	public UUID Id;
	public int Code;
	public String Name;
	public String BirthDate;
	public String Identity;
	public List<Address> Adress;
	public String Phone;
	public String Email;
	public String Password;
	public Enum<ProfileType> ProfileType;	
	public int AccessCount;
	public String Note;
	public Date CreationDate;
	public UUID CreationUserId;
	public String CreationUserName;
	public Date ChangeDate;
	public UUID ChangeUserId;
	public String ChangeUserName;
	public Date ExclusionDate;
	public int RecordStatus;
}
