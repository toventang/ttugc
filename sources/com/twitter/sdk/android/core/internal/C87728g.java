package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.twitter.sdk.android.core.C87794k;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.twitter.sdk.android.core.internal.g */
public final class C87728g {

    /* renamed from: a */
    private static Boolean f199246a;

    static {
        Covode.recordClassIndex(103717);
    }

    /* renamed from: a */
    public static void m152670a(Context context) {
        if (m152679b(context)) {
            C87794k.m152811c().mo142116e();
        }
    }

    /* renamed from: b */
    public static void m152678b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                C87794k.m152811c().mo142112a();
            }
        }
    }

    /* renamed from: a */
    public static void m152672a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static boolean m152679b(Context context) {
        if (f199246a == null) {
            f199246a = Boolean.valueOf(m152675a(context, "com.twitter.sdk.android.TRACE_ENABLED", false));
        }
        return f199246a.booleanValue();
    }

    /* renamed from: b */
    public static void m152677b(Context context, String str) {
        if (m152679b(context)) {
            C87794k.m152811c().mo142115d();
        }
    }

    /* renamed from: a */
    public static void m152671a(Context context, String str) {
        if (m152679b(context)) {
            C87794k.m152811c().mo142113b();
        }
    }

    /* renamed from: a */
    public static void m152674a(String str, String str2) {
        if (!C87794k.m152810b()) {
            C87794k.m152811c().mo142114c();
            return;
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: a */
    public static String m152669a(Context context, String str, String str2) {
        Resources resources;
        int b;
        if (context == null || (resources = context.getResources()) == null || (b = m152676b(context, str, "string")) <= 0) {
            return str2;
        }
        return resources.getString(b);
    }

    /* renamed from: b */
    private static int m152676b(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        int i = applicationContext.getApplicationInfo().icon;
        if (i > 0) {
            packageName = context.getResources().getResourcePackageName(i);
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    /* renamed from: a */
    public static void m152673a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        MethodCollector.m26663i(5267);
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                MethodCollector.m26664o(5267);
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m152675a(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int b = m152676b(context, str, "bool");
            if (b > 0) {
                return resources.getBoolean(b);
            }
            int b2 = m152676b(context, str, "string");
            if (b2 > 0) {
                return Boolean.parseBoolean(context.getString(b2));
            }
        }
        return z;
    }
}
