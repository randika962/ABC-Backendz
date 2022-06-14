package com.bank.abcmanage.services;

import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.abcmanage.model.BankAccount;
import com.bank.abcmanage.model.BankTransaction;
import com.bank.abcmanage.model.BankUser;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class BankPdfExporter {

	private BankAccount acc;
	private BankAccountService accServ;
	
	
	
	public BankPdfExporter(BankAccountService accServ, BankAccount acc) {
		super();
		this.acc = acc;
		this.accServ = accServ;
	}



	public BankPdfExporter() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void CreateBankPdf (HttpServletResponse response,int id) throws DocumentException, IOException {
		
		acc = accServ.getBankAccountById(id);//new
		
		Date date = new Date();
		String strDateFormat = "hh:mm:ss a";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
		
		Document doc = new Document(PageSize.A4);
		Font font = new Font(Font.TIMES_ROMAN, 14, Font.NORMAL, Color.BLUE);
		Font hfont = new Font(Font.TIMES_ROMAN, 28, Font.NORMAL, Color.MAGENTA);
		PdfWriter.getInstance(doc, response.getOutputStream());
		
		doc.open();
		
		Paragraph header = new Paragraph();
		header.add("ABC Export Service");
		doc.add(header);
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph("Welcome ABC Bank PDF Export Service !",font));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph("Are You Want Good Service ?",hfont));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph("Generated Time: " + formattedDate));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph("Owner ID: " + acc.getOwner().getuId()));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph("Owner Full Name: " + acc.getOwner().getfName()+"  "+ acc.getOwner().getlName()));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph("Owner Address: " + acc.getOwner().getAddres()));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph("Bank Email: " + acc.getOwner().getUserEmail()));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph("Owner Password: ******** "));
		
		PdfPTable tb = new PdfPTable(8);
		tb.setSpacingBefore(20);
		tb.setWidthPercentage(80);
		
		PdfPCell ce = new PdfPCell();
		ce.setBackgroundColor(Color.CYAN);
		ce.setPhrase(new Phrase("Transaction ID"));
		tb.addCell(ce);
		
		ce.setPhrase(new Phrase("Transaction Amount"));
		tb.addCell(ce);
		
		ce.setPhrase(new Phrase("Transaction Description"));
		tb.addCell(ce);
		
		ce.setPhrase(new Phrase("Transaction Type"));
		tb.addCell(ce);
		
		ce.setPhrase(new Phrase("Transaction Time"));
		tb.addCell(ce);
		
		ce.setPhrase(new Phrase("Account ID"));
		tb.addCell(ce);
		
		ce.setPhrase(new Phrase("Source Account ID"));
		tb.addCell(ce);
		
		ce.setPhrase(new Phrase("Destination Account ID"));
		tb.addCell(ce);
		
		
		
	
		for(BankTransaction transaction : acc.getTransaction()) {
			tb.addCell(Integer.toString(transaction.gettId()));
			tb.addCell(Float.toString(transaction.getTransacAmount()));
			tb.addCell(transaction.getTransacDecription());
			tb.addCell(transaction.getTransacType());
			tb.addCell(transaction.getTransacTime().toString());
			tb.addCell(Integer.toString(transaction.getaId()));
			tb.addCell(Integer.toString(transaction.getSourceAccId()));
			tb.addCell(Integer.toString(transaction.getDestinationAccId()));
		}
		
		doc.add(tb);
		doc.close();
		
		
	}

	
	
}
