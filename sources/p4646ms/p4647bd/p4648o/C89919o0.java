package p4646ms.p4647bd.p4648o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.o0 */
public final class C89919o0 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(106016);
    }

    C89919o0() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        MethodCollector.m26663i(499);
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        String name = nextElement.getName();
                        if (!TextUtils.isEmpty(name) && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address)) {
                            if (name.startsWith((String) C89889h.m155966a(16777217, 0, 0, "9fe6d9", new byte[]{58, 105, 24, 71, 79}))) {
                                C89889h.m155966a(16777217, 0, 0, "aafc13", new byte[]{121, 109, 16, 3, 47, 32, 102, 82, 50, 32, 99, 35, 27, 22, 3, 33, 56});
                                nextElement.getName();
                                String name2 = nextElement.getName();
                                MethodCollector.m26664o(499);
                                return name2;
                            }
                        }
                    }
                }
            }
            MethodCollector.m26664o(499);
            return "";
        } catch (SocketException unused) {
            C89889h.m155966a(16777217, 0, 0, "7b67b4", new byte[]{33, 101, 81, 3, 116, 51, 21, 71, 99, 117, 35, 115, 86, 3, 91, 34, 61, 79, 61});
            MethodCollector.m26664o(499);
            return "";
        }
    }
}
