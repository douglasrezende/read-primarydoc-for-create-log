import com.sterlingcommerce.woodstock.workflow.Document;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

String fileName = (String)wfc.getWFContent("nomeArquivo");    
String line = null;
Document document = new Document();     
Document srcDoc = wfc.getPrimaryDocument();
InputStream is = srcDoc.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(is));
StringBuffer sb = new StringBuffer();
while((line = br.readLine()) != null){    
   sb.append(line + System.getProperty("line.separator"));
}
br.close();
log.log("FALHA NA REQUISICAO DO ARQUIVO: "+ fileName + " MOTIVO: " + sb.toString());    
return "000";
