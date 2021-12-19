package p4600h.p4610e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: h.e.n */
public class C89163n extends C89162m {
    static {
        Covode.recordClassIndex(105247);
    }

    /* renamed from: e */
    public static final String m154654e(File file) {
        C89219l.m154721d(file, "");
        String name = file.getName();
        C89219l.m154716b(name, "");
        return C89361p.m154918c(name, '.', "");
    }

    /* renamed from: f */
    public static final String m154655f(File file) {
        C89219l.m154721d(file, "");
        String name = file.getName();
        C89219l.m154716b(name, "");
        return C89361p.m154936h(name, ".");
    }

    /* renamed from: g */
    public static final boolean m154656g(File file) {
        C89219l.m154721d(file, "");
        Iterator a = C89159j.m154649d(file).mo2926a();
        while (true) {
            boolean z = true;
            while (true) {
                if (!a.hasNext()) {
                    return z;
                }
                File file2 = (File) a.next();
                if (m154658i(file2) || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: h */
    public static final File m154657h(File file) {
        C89219l.m154721d(file, "");
        C89148e b = C89159j.m154646b(file);
        File file2 = b.f202851a;
        List<File> a = m154652a(b.f202852b);
        String str = File.separator;
        C89219l.m154716b(str, "");
        return C89159j.m154651a(file2, C89070n.m154551a(a, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
    }

    /* renamed from: i */
    private static boolean m154658i(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    /* renamed from: a */
    private static final List<File> m154652a(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != 46) {
                    if (hashCode == 1472 && name.equals("..")) {
                        if (arrayList.isEmpty() || !(!C89219l.m154714a((Object) ((File) C89070n.m154586h((List) arrayList)).getName(), (Object) ".."))) {
                            arrayList.add(file);
                        } else {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                } else if (name.equals(".")) {
                }
            }
            arrayList.add(file);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final File m154651a(File file, String str) {
        C89219l.m154721d(file, "");
        C89219l.m154721d(str, "");
        return C89159j.m154653b(file, new File(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        p4600h.p4610e.C89146c.m154636a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        p4600h.p4610e.C89146c.m154636a(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File m154650a(java.io.File r5, java.io.File r6) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4610e.C89163n.m154650a(java.io.File, java.io.File):java.io.File");
    }

    /* renamed from: b */
    public static final File m154653b(File file, File file2) {
        C89219l.m154721d(file, "");
        C89219l.m154721d(file2, "");
        if (C89159j.m154645a(file2)) {
            return file2;
        }
        String file3 = file.toString();
        C89219l.m154716b(file3, "");
        if (file3.length() != 0 && !C89361p.m154906a((CharSequence) file3, File.separatorChar)) {
            return new File(file3 + File.separatorChar + file2);
        }
        return new File(file3 + file2);
    }
}
