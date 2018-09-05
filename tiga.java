/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author LAB_TI
 */
public class tiga {

    public static void main(String[] args) throws UnknownHostException {
        try {
            String host = "localhost";
            InetAddress[] alm = InetAddress.getAllByName(host);
            for (InetAddress add : alm) {
                System.out.println(add.getHostName()+","+add.getHostAddress());
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
