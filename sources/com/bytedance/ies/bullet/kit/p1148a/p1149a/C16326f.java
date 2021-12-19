package com.bytedance.ies.bullet.kit.p1148a.p1149a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16666i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import java.io.InputStream;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.kit.a.a.f */
public final class C16326f {

    /* renamed from: a */
    public static final C16326f f39226a = new C16326f();

    private C16326f() {
    }

    static {
        Covode.recordClassIndex(18619);
    }

    /* renamed from: a */
    private static void m30333a(InputStream inputStream) {
        C89219l.m154719c(inputStream, "");
        try {
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static String m30331a(Uri uri) {
        C89219l.m154719c(uri, "");
        if (!uri.isHierarchical()) {
            String uri2 = uri.toString();
            C89219l.m154709a((Object) uri2, "");
            return uri2;
        }
        try {
            String builder = uri.buildUpon().clearQuery().toString();
            C89219l.m154709a((Object) builder, "");
            return builder;
        } catch (Throwable unused) {
            String uri3 = uri.toString();
            C89219l.m154709a((Object) uri3, "");
            return uri3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r2 == null) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double m30329a(java.io.File r7) {
        /*
            r6 = 5654(0x1616, float:7.923E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r7, r0)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x003e
            boolean r0 = r7.isDirectory()
            if (r0 != 0) goto L_0x003e
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002a }
            r1.<init>(r7)     // Catch:{ Exception -> 0x002a }
            int r0 = r1.available()     // Catch:{ Exception -> 0x0027, all -> 0x0024 }
            m30333a(r1)
            goto L_0x003f
        L_0x0024:
            r0 = move-exception
            r2 = r1
            goto L_0x0032
        L_0x0027:
            r0 = move-exception
            r2 = r1
            goto L_0x002b
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            r0.printStackTrace()     // Catch:{ all -> 0x002f }
            goto L_0x0039
        L_0x002f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0035
        L_0x0032:
            m30333a(r2)
        L_0x0035:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        L_0x0039:
            if (r2 == 0) goto L_0x003e
            m30333a(r2)
        L_0x003e:
            r0 = 0
        L_0x003f:
            double r4 = (double) r0
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r2
            int r0 = p4600h.p4615g.C89241a.m154729a(r4)
            double r0 = (double) r0
            java.lang.Double.isNaN(r0)
            double r0 = r0 / r2
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p1148a.p1149a.C16326f.m30329a(java.io.File):double");
    }

    /* renamed from: a */
    public static boolean m30334a(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static GeckoConfig m30330a(C16666i iVar, String str) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(str, "");
        GeckoConfig geckoConfig = iVar.f39835n.get(str);
        if (geckoConfig == null) {
            return iVar.f39834m;
        }
        return geckoConfig;
    }

    /* renamed from: a */
    public static String m30332a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        if (str2.length() == 0) {
            return str;
        }
        return str + '/' + C89361p.m154899a(str2, (CharSequence) "/");
    }
}
