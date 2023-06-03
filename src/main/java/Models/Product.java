package Models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import Models.Types.ProductType;

public class Product {

	public UUID Id;
	public int Code;
	public Enum<ProductType> Type;
	public String ShortName;
	public String FullName;
	public String Sku;
	public double CostValue;
	public double SaleValue;
	public double Height;
	public double Width;
	public double Weight;
	public double Length;
	public double PackagingWeight;
	public List<String> Images;
	public List<String> BarCodes;
	public String BrandName;
	public String UnitMeasurementName;
	public int ExpirationTime; //Em Dias
	public int MinStock;
	public int MaxStock;
	public int Quantity;
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
