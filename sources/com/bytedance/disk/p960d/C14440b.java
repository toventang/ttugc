package com.bytedance.disk.p960d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p964f.AbstractC14454c;
import com.bytedance.disk.p964f.C14453b;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.disk.d.b */
public class C14440b {

    /* renamed from: a */
    public static volatile C14440b f34934a;

    /* renamed from: b */
    private static final String[] f34935b = {"com.bytedance.disk:migration"};

    /* renamed from: c */
    private static final AbstractC14454c[] f34936c = {new C14453b()};

    /* renamed from: d */
    private Context f34937d;

    /* renamed from: e */
    private Map<String, AbstractC14454c> f34938e = new HashMap();

    static {
        Covode.recordClassIndex(16519);
    }

    /* renamed from: a */
    public final void mo23271a() {
        MethodCollector.m26663i(1074);
        synchronized (this.f34938e) {
            int i = 0;
            while (true) {
                try {
                    String[] strArr = f34935b;
                    if (i < strArr.length) {
                        AbstractC14454c[] cVarArr = f34936c;
                        cVarArr[i].mo23282a(this.f34937d);
                        this.f34938e.put(strArr[i], cVarArr[i]);
                        i++;
                    }
                } finally {
                    MethodCollector.m26664o(1074);
                }
            }
        }
    }

    private C14440b(Context context) {
        this.f34937d = context;
    }

    /* renamed from: a */
    public static C14440b m26367a(Context context) {
        MethodCollector.m26663i(1071);
        if (f34934a == null) {
            synchronized (C14440b.class) {
                try {
                    if (f34934a == null) {
                        f34934a = new C14440b(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1071);
                    throw th;
                }
            }
        }
        C14440b bVar = f34934a;
        MethodCollector.m26664o(1071);
        return bVar;
    }

    /* renamed from: a */
    public final AbstractC14454c mo23270a(Uri uri) {
        String authority;
        if ("content".equals(uri.getScheme()) && (authority = uri.getAuthority()) != null) {
            return this.f34938e.get(authority);
        }
        return null;
    }

    /* renamed from: a */
    public static int m26364a(Uri uri, ContentValues contentValues) {
        AbstractC14454c a;
        if (f34934a == null || (a = f34934a.mo23270a(uri)) == null) {
            return -1;
        }
        return a.mo23278a(uri, contentValues, (String) null);
    }

    /* renamed from: a */
    public static int m26365a(Uri uri, String str, String[] strArr) {
        AbstractC14454c a;
        if (f34934a == null || (a = f34934a.mo23270a(uri)) == null) {
            return -1;
        }
        return a.mo23279a(uri, str, strArr);
    }

    /* renamed from: a */
    public static Cursor m26366a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC14454c a;
        if (f34934a == null || (a = f34934a.mo23270a(uri)) == null) {
            return null;
        }
        return a.mo23280a(uri, strArr, str, strArr2, str2);
    }
}
