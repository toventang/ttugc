package okhttp3.internal.p4655c;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.AbstractC90186m;
import okhttp3.C90029ac;
import okhttp3.C90184l;
import okhttp3.C90198s;
import okhttp3.C90200t;
import p4632k.C89427i;

/* renamed from: okhttp3.internal.c.e */
public final class C90093e {

    /* renamed from: a */
    private static final C89427i f204473a = C89427i.encodeUtf8("\"\\");

    /* renamed from: b */
    private static final C89427i f204474b = C89427i.encodeUtf8("\t ,=");

    static {
        Covode.recordClassIndex(106265);
    }

    /* renamed from: a */
    private static long m156442a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static long m156443a(C90198s sVar) {
        return m156442a(sVar.mo145028a("Content-Length"));
    }

    /* renamed from: b */
    public static Set<String> m156447b(C90198s sVar) {
        Set<String> emptySet = Collections.emptySet();
        int length = sVar.f204855a.length / 2;
        for (int i = 0; i < length; i++) {
            if ("Vary".equalsIgnoreCase(sVar.mo145027a(i))) {
                String b = sVar.mo145031b(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                String[] split = b.split(",");
                for (String str : split) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    /* renamed from: a */
    public static boolean m156446a(C90029ac acVar) {
        if (acVar.f204105a.method().equals("HEAD")) {
            return false;
        }
        int i = acVar.f204107c;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && m156443a(acVar.f204110f) == -1 && !"chunked".equalsIgnoreCase(acVar.mo144718a("Transfer-Encoding", null))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m156440a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static C90198s m156444a(C90198s sVar, C90198s sVar2) {
        Set<String> b = m156447b(sVar2);
        if (b.isEmpty()) {
            return new C90198s.C90199a().mo145040a();
        }
        C90198s.C90199a aVar = new C90198s.C90199a();
        int length = sVar.f204855a.length / 2;
        for (int i = 0; i < length; i++) {
            String a = sVar.mo145027a(i);
            if (b.contains(a)) {
                aVar.mo145039a(a, sVar.mo145031b(i));
            }
        }
        return aVar.mo145040a();
    }

    /* renamed from: a */
    public static int m156441a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static void m156445a(AbstractC90186m mVar, C90200t tVar, C90198s sVar) {
        if (mVar != AbstractC90186m.f204834a) {
            List<C90184l> a = C90184l.m156745a(tVar, sVar);
            if (!a.isEmpty()) {
                mVar.saveFromResponse(tVar, a);
            }
        }
    }
}
