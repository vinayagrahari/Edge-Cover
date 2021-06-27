import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Main {
    public static void main (String[] args) throws IOException {
        Vector<Edge> notUsed = new Vector<Edge>();
        DSU vertices;
        String line = "";
        String splitBy = " ";
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            line = br.readLine();
            int n = Integer.parseInt(line);
            while ((line = br.readLine()) != null) {
                vertices = new DSU(n);
                String[] edge = line.split(splitBy);
                int e1 = Integer.parseInt(edge[1]);
                int e2 = Integer.parseInt(edge[2]);
                int e3 = Integer.parseInt(edge[3]);
                Edge e = new Edge(e1, e2, e3);
                if (Integer.parseInt(edge[0]) == 0) {
                    notUsed.add(e);
                }
                else {
                    vertices.arr[e3] = e2;
                }
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
}