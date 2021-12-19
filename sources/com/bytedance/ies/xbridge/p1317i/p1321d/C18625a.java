package com.bytedance.ies.xbridge.p1317i.p1321d;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.io.File;
import p4600h.C89379q;
import p4600h.C89382r;

/* renamed from: com.bytedance.ies.xbridge.i.d.a */
public final class C18625a {

    /* renamed from: a */
    public static final C18625a f44363a = new C18625a();

    private C18625a() {
    }

    static {
        Covode.recordClassIndex(21319);
    }

    /* renamed from: a */
    private static boolean m34595a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static File m34593a(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                C89379q.m157068constructorimpl(Boolean.valueOf(file.createNewFile()));
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0190 A[SYNTHETIC, Splitter:B:101:0x0190] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0195 A[Catch:{ IOException -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x019a A[Catch:{ IOException -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019f A[Catch:{ IOException -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m34594a(android.content.Context r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 462
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.p1317i.p1321d.C18625a.m34594a(android.content.Context, java.lang.String):java.lang.String");
    }
}
