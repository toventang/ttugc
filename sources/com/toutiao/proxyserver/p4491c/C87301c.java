package com.toutiao.proxyserver.p4491c;

import android.content.Context;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.toutiao.proxyserver.c.c */
public class C87301c {

    /* renamed from: e */
    private static volatile C87301c f197885e;

    /* renamed from: a */
    public final SparseArray<Map<String, C87299a>> f197886a;

    /* renamed from: b */
    public final C87304d f197887b;

    /* renamed from: c */
    public final Executor f197888c = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* renamed from: d */
    public volatile SQLiteStatement f197889d;

    static {
        Covode.recordClassIndex(103197);
    }

    /* renamed from: b */
    public final void mo141335b(final int i) {
        Map<String, C87299a> map = this.f197886a.get(i);
        if (map != null) {
            map.clear();
        }
        this.f197888c.execute(new Runnable() {
            /* class com.toutiao.proxyserver.p4491c.C87301c.RunnableC873032 */

            static {
                Covode.recordClassIndex(103199);
            }

            public final void run() {
                MethodCollector.m26663i(8199);
                try {
                    C87301c.this.f197887b.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i)});
                    MethodCollector.m26664o(8199);
                } catch (Throwable unused) {
                    MethodCollector.m26664o(8199);
                }
            }
        });
    }

    /* renamed from: a */
    public static C87301c m151508a(Context context) {
        MethodCollector.m26663i(12662);
        if (f197885e == null) {
            synchronized (C87301c.class) {
                try {
                    if (f197885e == null) {
                        f197885e = new C87301c(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12662);
                    throw th;
                }
            }
        }
        C87301c cVar = f197885e;
        MethodCollector.m26664o(12662);
        return cVar;
    }

    private C87301c(Context context) {
        SparseArray<Map<String, C87299a>> sparseArray = new SparseArray<>(2);
        this.f197886a = sparseArray;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f197887b = new C87304d(applicationContext);
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    /* renamed from: a */
    public static String m151509a(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i << 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        if (r4 != null) goto L_0x0093;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.toutiao.proxyserver.p4491c.C87299a mo141334a(java.lang.String r18, int r19) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p4491c.C87301c.mo141334a(java.lang.String, int):com.toutiao.proxyserver.c.a");
    }
}
