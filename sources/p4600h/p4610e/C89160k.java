package p4600h.p4610e;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: h.e.k */
class C89160k {
    static {
        Covode.recordClassIndex(105244);
    }

    /* renamed from: a */
    public static final boolean m154645a(File file) {
        C89219l.m154721d(file, "");
        String path = file.getPath();
        C89219l.m154716b(path, "");
        if (m154644a(path) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static final int m154644a(String str) {
        int a;
        int a2 = C89361p.m154882a((CharSequence) str, File.separatorChar, 0, false, 4);
        if (a2 != 0) {
            if (a2 > 0) {
                if (str.charAt(a2 - 1) == ':') {
                    return a2 + 1;
                }
            } else if (a2 == -1 && C89361p.m154906a((CharSequence) str, ':')) {
                return str.length();
            }
            return 0;
        } else if (str.length() <= 1 || str.charAt(1) != File.separatorChar || (a = C89361p.m154882a((CharSequence) str, File.separatorChar, 2, false, 4)) < 0) {
            return 1;
        } else {
            int a3 = C89361p.m154882a((CharSequence) str, File.separatorChar, a + 1, false, 4);
            if (a3 >= 0) {
                return a3 + 1;
            }
            return str.length();
        }
    }

    /* renamed from: b */
    public static final C89148e m154646b(File file) {
        ArrayList arrayList;
        C89219l.m154721d(file, "");
        String path = file.getPath();
        C89219l.m154716b(path, "");
        int a = m154644a(path);
        String substring = path.substring(0, a);
        C89219l.m154716b(substring, "");
        String substring2 = path.substring(a);
        C89219l.m154716b(substring2, "");
        if (substring2.length() == 0) {
            arrayList = C89086z.INSTANCE;
        } else {
            List<String> a2 = C89361p.m154904a((CharSequence) substring2, new char[]{File.separatorChar});
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) a2, 10));
            Iterator<T> it = a2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new File((String) it.next()));
            }
            arrayList = arrayList2;
        }
        return new C89148e(new File(substring), arrayList);
    }
}
