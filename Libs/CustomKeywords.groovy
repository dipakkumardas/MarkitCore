
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "com.excel.helper.ExcelHelper.updateTheExcel1"(
    	String fileName	
     , 	String sheetName	
     , 	String columnname	
     , 	String aValue	) {
    (new com.excel.helper.ExcelHelper()).updateTheExcel1(
        	fileName
         , 	sheetName
         , 	columnname
         , 	aValue)
}

def static "com.excel.helper.ExcelHelper.updateTheExcel2"(
    	String fileName	
     , 	String sheetName	
     , 	String columnname	
     , 	String aValue	
     , 	String polnum	) {
    (new com.excel.helper.ExcelHelper()).updateTheExcel2(
        	fileName
         , 	sheetName
         , 	columnname
         , 	aValue
         , 	polnum)
}

def static "com.excel.helper.ExcelHelper.rownext"(
    	String fileName	
     , 	String sheetName	) {
    (new com.excel.helper.ExcelHelper()).rownext(
        	fileName
         , 	sheetName)
}

def static "com.excel.helper.ExcelHelper.columnNumberByColumnName"(
    	String fileName	
     , 	String sheetName	
     , 	String columnnm	) {
    (new com.excel.helper.ExcelHelper()).columnNumberByColumnName(
        	fileName
         , 	sheetName
         , 	columnnm)
}

def static "com.excel.helper.ExcelHelper.rowNumberByPolNum"(
    	String fileName	
     , 	String sheetName	
     , 	String polnum	) {
    (new com.excel.helper.ExcelHelper()).rowNumberByPolNum(
        	fileName
         , 	sheetName
         , 	polnum)
}

def static "com.excel.helper.ExcelHelper.columnDataByPolNum"(
    	String fileName	
     , 	String sheetName	
     , 	String columnname	
     , 	String polnum	) {
    (new com.excel.helper.ExcelHelper()).columnDataByPolNum(
        	fileName
         , 	sheetName
         , 	columnname
         , 	polnum)
}

def static "com.excel.helper.InsurerComission.updateTheExcel"(
    	String fileName	
     , 	String sheetName	
     , 	String aValue	) {
    (new com.excel.helper.InsurerComission()).updateTheExcel(
        	fileName
         , 	sheetName
         , 	aValue)
}

def static "com.excel.helper.InsurerComission.rownext"(
    	String fileName	
     , 	String sheetName	) {
    (new com.excel.helper.InsurerComission()).rownext(
        	fileName
         , 	sheetName)
}

def static "subString.FatchSubstringValue.SubString"(
    	String value	) {
    (new subString.FatchSubstringValue()).SubString(
        	value)
}
