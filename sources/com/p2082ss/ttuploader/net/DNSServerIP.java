package com.p2082ss.ttuploader.net;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: com.ss.ttuploader.net.DNSServerIP */
public class DNSServerIP {
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;

    static {
        Covode.recordClassIndex(101502);
    }

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    public static void updateDNSServerIP() {
        if (System.currentTimeMillis() - mServerIPTime >= 300000) {
            TTUploadThreadPool.addExecuteTask(new Runnable() {
                /* class com.p2082ss.ttuploader.net.DNSServerIP.RunnableC862911 */

                static {
                    Covode.recordClassIndex(101503);
                }

                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            DNSServerIP.mServerIP = byName.getHostAddress();
                            DNSServerIP.mServerIPTime = System.currentTimeMillis();
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }
}
