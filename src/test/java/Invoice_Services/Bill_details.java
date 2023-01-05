package Invoice_Services;

import java.util.List;

public class Bill_details 

{

	private List<Gst_summary> gst_summary;
	private List<Discount_summary> discount_summary;
	private List<Tax_summary> tax_summary;
	
	public List<Gst_summary> getGst_summary() {
		return gst_summary;
	}
	public void setGst_summary(List<Gst_summary> gst_summary) {
		this.gst_summary = gst_summary;
	}
	public List<Discount_summary> getDiscount_summary() {
		return discount_summary;
	}
	public void setDiscount_summary(List<Discount_summary> discount_summary) {
		this.discount_summary = discount_summary;
	}
	public List<Tax_summary> getTax_summary() {
		return tax_summary;
	}
	public void setTax_summary(List<Tax_summary> tax_summary) {
		this.tax_summary = tax_summary;
	}
	
	
	public static class Gst_summary
	{
		private String cgst;
		private String sgst;
		private String igst;
		private String total_tax;
		public String getCgst() {
			return cgst;
		}
		public void setCgst(String cgst) {
			this.cgst = cgst;
		}
		public String getSgst() {
			return sgst;
		}
		public void setSgst(String sgst) {
			this.sgst = sgst;
		}
		public String getIgst() {
			return igst;
		}
		public void setIgst(String igst) {
			this.igst = igst;
		}
		public String getTotal_tax() {
			return total_tax;
		}
		public void setTotal_tax(String total_tax) {
			this.total_tax = total_tax;
		}
		
		
	}
	public static class Discount_summary
	{
		private String cash_discount;
		private String special_discount;
		private String in_bill_discount;
		private String total_discount;
		public String getCash_discount() {
			return cash_discount;
		}
		public void setCash_discount(String cash_discount) {
			this.cash_discount = cash_discount;
		}
		public String getSpecial_discount() {
			return special_discount;
		}
		public void setSpecial_discount(String special_discount) {
			this.special_discount = special_discount;
		}
		public String getIn_bill_discount() {
			return in_bill_discount;
		}
		public void setIn_bill_discount(String in_bill_discount) {
			this.in_bill_discount = in_bill_discount;
		}
		public String getTotal_discount() {
			return total_discount;
		}
		public void setTotal_discount(String total_discount) {
			this.total_discount = total_discount;
		}
		
		
		
	}
	public static class Tax_summary
	{
		private String tcs_based_value;
		private String tcs_tax_value;
		public String getTcs_based_value() {
			return tcs_based_value;
		}
		public void setTcs_based_value(String tcs_based_value) {
			this.tcs_based_value = tcs_based_value;
		}
		public String getTcs_tax_value() {
			return tcs_tax_value;
		}
		public void setTcs_tax_value(String tcs_tax_value) {
			this.tcs_tax_value = tcs_tax_value;
		}
		
		
		
	}

}
