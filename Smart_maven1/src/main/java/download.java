
import com.mongodb.DB;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/download"})

    public class download extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
static final long serialVersionUID = 1L;
    private static final int BUFSIZE = 4096;
   String fileName;

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        /*MongoClient mongoClient = new MongoClient("localhost", 27017);

        DB db = mongoClient.getDB("smart");*/
        String dbURI = "mongodb://Bharath:Bharath@ds033097.mongolab.com:33097/smart";
            MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
            DB db = mongoClient.getDB("smart");
          
     
        String dbFileName = request.getParameter("download");
           
        GridFS gfs = new GridFS(db,"files");
        GridFSDBFile gfsFile1 = gfs.findOne(dbFileName);
        fileName = gfsFile1.getFilename();
        File outFile = new File(fileName);
    	File file = outFile;
        int length   = 0;
     
        try (ServletOutputStream outStream = response.getOutputStream())
        {
            response.setContentType("text/html");
            response.setContentLength((int)file.length());
            response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
         
            byte[] byteBuffer = new byte[BUFSIZE];
            try (DataInputStream in = new DataInputStream(new FileInputStream(file)))
                {
                    while ((in != null) && ((length = in.read(byteBuffer)) != -1))
                    {
                        outStream.write(byteBuffer,0,length);
                    }
                }
        }
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    }
@Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
