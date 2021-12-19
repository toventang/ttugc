package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68902a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p078c.p083d.C1762a;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.ge */
public final class C80479ge {

    /* renamed from: a */
    public static final C80479ge f180067a = new C80479ge();

    private C80479ge() {
    }

    static {
        Covode.recordClassIndex(93747);
    }

    /* renamed from: a */
    private static String m139495a(Uri uri) {
        String path;
        if (uri == null || (path = uri.getPath()) == null) {
            return null;
        }
        C89219l.m154716b(path, "");
        int b = C89361p.m154909b((CharSequence) path, '/');
        if (b == -1) {
            return null;
        }
        Objects.requireNonNull(path, "null cannot be cast to non-null type java.lang.String");
        String substring = path.substring(b + 1);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: b */
    private static String m139498b(Context context, Uri uri) {
        String a = C1762a.m5918a(context, uri);
        C51423a.m95787a("SystemShareActivity getDataColumn convertUriToPath = ".concat(String.valueOf(a)));
        if (a == null || a.length() == 0) {
            return m139499c(context, uri);
        }
        return a;
    }

    /* renamed from: c */
    private static String m139499c(Context context, Uri uri) {
        String a = m139495a(uri);
        C51423a.m95787a("SystemShareActivity getFilePathFromURI fileName = ".concat(String.valueOf(a)));
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        if (!C80720e.m139927b(AbstractC68902a.f154119e)) {
            C80720e.m139917a(AbstractC68902a.f154119e, false);
        }
        File file = new File(AbstractC68902a.f154119e + File.separator + a);
        m139496a(context, uri, file);
        return file.getAbsolutePath();
    }

    /* renamed from: a */
    private static void m139497a(InputStream inputStream, FileOutputStream fileOutputStream) {
        MethodCollector.m26663i(13337);
        C89219l.m154721d(inputStream, "");
        C89219l.m154721d(fileOutputStream, "");
        byte[] bArr = new byte[2048];
        try {
            InputStream inputStream2 = inputStream;
            try {
                FileOutputStream fileOutputStream2 = fileOutputStream;
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read > 0) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        C89146c.m154636a(fileOutputStream, null);
                        C89146c.m154636a(inputStream, null);
                        inputStream.close();
                        MethodCollector.m26664o(13337);
                        return;
                    }
                }
            } catch (Throwable th) {
                C89146c.m154636a(fileOutputStream, th);
                MethodCollector.m26664o(13337);
                throw th;
            }
        } catch (Throwable th2) {
            C89146c.m154636a(inputStream, th);
            MethodCollector.m26664o(13337);
            throw th2;
        }
    }

    /* renamed from: a */
    public final String mo123759a(Context context, Uri uri) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(uri, "");
        if (C89361p.m154872a("content", uri.getScheme(), true)) {
            return m139498b(context, uri);
        }
        if (C89361p.m154872a("file", uri.getScheme(), true)) {
            return uri.getPath();
        }
        return null;
    }

    /* renamed from: a */
    private static void m139496a(Context context, Uri uri, File file) {
        MethodCollector.m26663i(13281);
        C89219l.m154721d(context, "");
        C89219l.m154721d(file, "");
        if (uri != null) {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream == null) {
                    MethodCollector.m26664o(13281);
                    return;
                }
                C89219l.m154716b(openInputStream, "");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                m139497a(openInputStream, fileOutputStream);
                openInputStream.close();
                fileOutputStream.close();
                MethodCollector.m26664o(13281);
            } catch (IOException e) {
                e.printStackTrace();
                MethodCollector.m26664o(13281);
            }
        } else {
            MethodCollector.m26664o(13281);
        }
    }
}
