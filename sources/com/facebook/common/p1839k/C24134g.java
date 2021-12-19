package com.facebook.common.p1839k;

import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.facebook.common.k.g */
public final class C24134g {

    /* renamed from: a */
    public static final Uri f57081a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    static {
        Covode.recordClassIndex(28262);
    }

    /* renamed from: c */
    public static boolean m45738c(Uri uri) {
        return "file".equals(m45743h(uri));
    }

    /* renamed from: d */
    public static boolean m45739d(Uri uri) {
        return "content".equals(m45743h(uri));
    }

    /* renamed from: f */
    public static boolean m45741f(Uri uri) {
        return "asset".equals(m45743h(uri));
    }

    /* renamed from: g */
    public static boolean m45742g(Uri uri) {
        return "res".equals(m45743h(uri));
    }

    /* renamed from: h */
    public static String m45743h(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* renamed from: a */
    public static Uri m45734a(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    /* renamed from: b */
    public static boolean m45737b(Uri uri) {
        String h = m45743h(uri);
        if ("https".equals(h) || "http".equals(h)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m45740e(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static URL m45736a(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m45735a(android.content.ContentResolver r11, android.net.Uri r12) {
        /*
            r4 = 10023(0x2727, float:1.4045E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            r6 = r12
            boolean r0 = m45739d(r6)
            r1 = 0
            if (r0 == 0) goto L_0x003f
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r11
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x002f
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "_data"
            int r2 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x002c }
            r0 = -1
            if (r2 == r0) goto L_0x002f
            java.lang.String r1 = r3.getString(r2)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r0 = move-exception
            r1 = r3
            goto L_0x0036
        L_0x002f:
            if (r3 == 0) goto L_0x0049
            r3.close()
            goto L_0x0049
        L_0x0035:
            r0 = move-exception
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r1.close()
        L_0x003b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        L_0x003f:
            boolean r0 = m45738c(r6)
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = r6.getPath()
        L_0x0049:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.p1839k.C24134g.m45735a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
