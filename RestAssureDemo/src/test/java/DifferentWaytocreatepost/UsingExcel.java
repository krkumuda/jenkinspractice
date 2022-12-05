package DifferentWaytocreatepost;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import io.restassured.http.ContentType;
import utility.ExcelUtility;
import utility.JavaUtility;

public class UsingExcel {
	@Test(dataProvider="getDataByExcel")
	public void dataTest(String createdBy,String projectName, String status,int teamSize) {
		
		UsingPojo pojo = new UsingPojo(createdBy, projectName, status, teamSize);
		given().body(pojo).contentType(ContentType.JSON)
		.when().post("http://rmgtestingserver:8084/addProject")
		.then().assertThat().statusCode(201).log().all();
	}

	@DataProvider(name="getDataByExcel")
	public Object[][] getDataByExcel() throws EncryptedDocumentException, IOException
	{
		ExcelUtility excelUtil=new ExcelUtility();
		JavaUtility javaUtil=new JavaUtility();
		Object[][] data = new Object[4][4];
		data[0][0]=excelUtil.getDataFromExcel(DEFAULT_PATH, DEFAULT_BODY_ROOT_PATH, 1, 0);
		data[0][1]=excelUtil.getDataFromExcel("DataProvider","" , 1, 1)+javaUtil.getRanDomNum(1000);
		data[0][2]=excelUtil.getDataFromExcel("DataProvider", " ", 1, 2);
		data[0][3]=Integer.parseInt(excelUtil.getDataFromExcel(""," ", 1, 3));
		
		data[1][0]=excelUtil.getDataFromExcel("DataProvider","", 2, 0);
		data[1][1]=excelUtil.getDataFromExcel("DataProvider","", 2, 1)+javaUtil.getRanDomNum(1000);
		data[1][2]=excelUtil.getDataFromExcel("DataProvider", "",2, 2);
		data[1][3]=Integer.parseInt(excelUtil.getDataFromExcel("DataProvider","", 2, 3));
		
		data[2][0]=excelUtil.getDataFromExcel("DataProvider","", 3, 0);
		data[2][1]=excelUtil.getDataFromExcel("DataProvider","", 3, 1)+javaUtil.getRanDomNum(1000);
		data[2][2]=excelUtil.getDataFromExcel("DataProvider","", 3, 2);
		data[2][3]=Integer.parseInt(excelUtil.getDataFromExcel("DataProvider","", 3, 3));
		
		data[3][0]=excelUtil.getDataFromExcel("DataProvider","", 4, 0);
		data[3][1]=excelUtil.getDataFromExcel("DataProvider","", 4, 1)+javaUtil.getRanDomNum(1000);
		data[3][2]=excelUtil.getDataFromExcel("DataProvider","", 4, 2);
		data[3][3]=Integer.parseInt(excelUtil.getDataFromExcel("DataProvider", "",4, 3));
		
		return data;
	}
	

}

