import org.csource.fastdfs.*;

public class FastClientTest {
    public static void main(String[] args) throws Exception{
        //注释啊啊啊啊啊
        ClientGlobal.init("E:/client.conf");
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer,storageServer);
        String[] strings = storageClient.upload_file("E:/1.jpg","jpg",null);
        for (String string : strings){
            System.out.println(string);
        }
    }
}
