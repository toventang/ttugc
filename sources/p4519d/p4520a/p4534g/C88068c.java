package p4519d.p4520a.p4534g;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.g.c */
public final class C88068c {

    /* renamed from: a */
    public static final C88068c f199978a = new C88068c();

    private C88068c() {
    }

    static {
        Covode.recordClassIndex(104094);
    }

    /* renamed from: a */
    public static String m153143a(String str) {
        C89219l.m154719c(str, "");
        try {
            InetAddress byName = InetAddress.getByName(new URL(str).getHost());
            if (byName == null) {
                return "";
            }
            String hostAddress = byName.getHostAddress();
            if (hostAddress == null) {
                return "";
            }
            return hostAddress;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
