package com.ttnet.org.chromium.base;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.IOException;

public abstract class ContentUriUtils {

    /* renamed from: a */
    static final /* synthetic */ boolean f198248a = true;

    /* renamed from: b */
    private static final Object f198249b = new Object();

    private ContentUriUtils() {
    }

    static {
        Covode.recordClassIndex(103338);
    }

    public static boolean contentUriExists(String str) {
        AssetFileDescriptor a = m151724a(str);
        if (a == null) {
            return false;
        }
        try {
            a.close();
            return true;
        } catch (IOException unused) {
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m151727a(Cursor cursor) {
        int columnIndex;
        if (Build.VERSION.SDK_INT >= 24 && (columnIndex = cursor.getColumnIndex("flags")) >= 0 && (cursor.getLong(columnIndex) & 512) != 0) {
            return true;
        }
        return false;
    }

    public static String maybeGetDisplayName(String str) {
        try {
            String a = m151725a(Uri.parse(str), C87445c.f198342a, "_display_name");
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            return a;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int openContentUriForRead(String str) {
        AssetFileDescriptor a = m151724a(str);
        if (a != null) {
            return a.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        m151726a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m151728a(android.net.Uri r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r0 = 19
            r5 = r9
            if (r5 != 0) goto L_0x0009
            return r3
        L_0x0009:
            android.content.Context r0 = com.ttnet.org.chromium.base.C87445c.f198342a
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r5)
            if (r0 != 0) goto L_0x0012
            return r3
        L_0x0012:
            android.content.Context r0 = com.ttnet.org.chromium.base.C87445c.f198342a
            android.content.ContentResolver r4 = r0.getContentResolver()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ NullPointerException -> 0x003f }
            r1 = 0
            if (r2 == 0) goto L_0x003f
            int r0 = r2.getCount()     // Catch:{ all -> 0x0038 }
            if (r0 <= 0) goto L_0x0034
            r2.moveToFirst()     // Catch:{ all -> 0x0038 }
            boolean r0 = m151727a(r2)     // Catch:{ all -> 0x0038 }
            m151726a(r1, r2)
            return r0
        L_0x0034:
            m151726a(r1, r2)
            goto L_0x003f
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            m151726a(r1, r2)
            throw r0
        L_0x003f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.ContentUriUtils.m151728a(android.net.Uri):boolean");
    }

    public static boolean delete(String str) {
        Uri parse;
        if (!f198248a && (str == null || (parse = Uri.parse(str)) == null || !"content".equals(parse.getScheme()))) {
            throw new AssertionError();
        } else if (C87445c.f198342a.getContentResolver().delete(Uri.parse(str), null, null) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String getMimeType(String str) {
        ContentResolver contentResolver = C87445c.f198342a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (!m151728a(parse)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ExcHandler: FileNotFoundException | Exception | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x0033] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.AssetFileDescriptor m151724a(java.lang.String r6) {
        /*
            android.content.Context r0 = com.ttnet.org.chromium.base.C87445c.f198342a
            android.content.ContentResolver r3 = r0.getContentResolver()
            android.net.Uri r2 = android.net.Uri.parse(r6)
            r6 = 0
            boolean r0 = m151728a(r2)
            if (r0 == 0) goto L_0x003c
        */
        //  java.lang.String r0 = "*/*"
        /*
            java.lang.String[] r1 = r3.getStreamTypes(r2, r0)
            if (r1 == 0) goto L_0x004e
            int r0 = r1.length
            if (r0 <= 0) goto L_0x004e
            r0 = 0
            r0 = r1[r0]
            android.content.res.AssetFileDescriptor r5 = r3.openTypedAssetFileDescriptor(r2, r0, r6)
            if (r5 == 0) goto L_0x003b
            long r3 = r5.getStartOffset()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
            goto L_0x003b
        L_0x0030:
            r5.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x004e, FileNotFoundException | Exception | SecurityException -> 0x004e }
            java.lang.String r0 = "Cannot open files with non-zero offset type."
            r1.<init>(r0)     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x004e, FileNotFoundException | Exception | SecurityException -> 0x004e }
            throw r1     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x004e, FileNotFoundException | Exception | SecurityException -> 0x004e }
        L_0x003b:
            return r5
        L_0x003c:
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r1 = r3.openFileDescriptor(r2, r0)     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x004e, FileNotFoundException | Exception | SecurityException -> 0x004e }
            if (r1 == 0) goto L_0x004e
            android.content.res.AssetFileDescriptor r0 = new android.content.res.AssetFileDescriptor     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x004e, FileNotFoundException | Exception | SecurityException -> 0x004e }
            r2 = 0
            r4 = -1
            r0.<init>(r1, r2, r4)     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x004e, FileNotFoundException | Exception | SecurityException -> 0x004e }
            return r0
        L_0x004e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.ContentUriUtils.m151724a(java.lang.String):android.content.res.AssetFileDescriptor");
    }

    /* renamed from: a */
    private static /* synthetic */ void m151726a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        m151726a(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m151725a(android.net.Uri r11, android.content.Context r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.ContentUriUtils.m151725a(android.net.Uri, android.content.Context, java.lang.String):java.lang.String");
    }
}
