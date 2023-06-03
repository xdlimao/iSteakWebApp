package Models.Types;

import java.util.UUID;

public class Address {

	public UUID Id;
	public Enum<AddressType> Type;
	public String Street;
	public String Number;
	public String Complement;
	public String City;
	public String State;
	public String ZipCode;
	public String Note;
}
