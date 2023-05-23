package Invoice_Services;

public class ServiceDetailsPOJO 
{
		private String invoice_amount;
		private String invoice_date;
		private String invoice_number;
		private String invoice_type;
		private String buyerGST;
		private String sellerGST;
		private Bill_details bill_details;
		private String total_tax_amount;
		public String getInvoice_amount() {
			return invoice_amount;
		}
		public void setInvoice_amount(String invoice_amount) {
			this.invoice_amount = invoice_amount;
		}
		public String getInvoice_date() {
			return invoice_date;
		}
		public void setInvoice_date(String invoice_date) {
			this.invoice_date = invoice_date;
		}
		public String getInvoice_number() {
			return invoice_number;
		}
		public void setInvoice_number(String invoice_number) {
			this.invoice_number = invoice_number;
		}
		public String getInvoice_type() {
			return invoice_type;
		}
		public void setInvoice_type(String invoice_type) {
			this.invoice_type = invoice_type;
		}
		public String getBuyerGST() {
			return buyerGST;
		}
		public void setBuyerGST(String buyerGST) {
			this.buyerGST = buyerGST;
		}
		public String getSellerGST() {
			return sellerGST;
		}
		public void setSellerGST(String sellerGST) {
			this.sellerGST = sellerGST;
		}
		public Bill_details getBill_details() {
			return bill_details;
		}
		public void setBill_details(Bill_details bill_details) {
			this.bill_details = bill_details;
		}
		public void total_tax_amount(String total_tax_amount) {
			
			this.total_tax_amount=total_tax_amount;
		}
		
		
		
}
