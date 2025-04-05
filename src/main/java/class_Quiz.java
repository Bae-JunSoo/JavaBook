public class class_Quiz {
    public static void main(String[] args) {

        String log = "127.0.0.1 - Scott [10/Dec/2019:13:55:36 -0700] \"GET /server-status HTTP/1.1\" 200 232";

        System.out.println(log.indexOf("GET"));

        System.out.println(log.substring(log.indexOf("\"") + 1, log.indexOf(" ", log.indexOf("\""))));

        //------------------------------------------------------------------------------------------------------

        int idx = log.indexOf("\"");
        int idx2 = log.indexOf(" ", idx);

        String result = log.substring(idx + 1, idx2);

        System.out.println(result);
    }
}
