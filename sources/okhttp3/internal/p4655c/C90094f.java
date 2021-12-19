package okhttp3.internal.p4655c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;

/* renamed from: okhttp3.internal.c.f */
public final class C90094f {
    static {
        Covode.recordClassIndex(106266);
    }

    /* renamed from: c */
    public static boolean m156450c(String str) {
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m156448a(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals(C14420a.f34883c) || str.equals(C14420a.f34884d) || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m156449b(String str) {
        if (str.equals("POST") || str.equals(C14420a.f34883c) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }
}
