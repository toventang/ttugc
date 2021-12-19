package com.p2082ss.android.common.applog;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* renamed from: com.ss.android.common.applog.f */
public class RunnableC29791f implements Runnable {

    /* renamed from: a */
    public static String f71057a;

    /* renamed from: d */
    private static volatile RunnableC29791f f71058d;

    /* renamed from: b */
    public boolean f71059b;

    /* renamed from: c */
    BlockingQueue<C29792a> f71060c = new LinkedBlockingQueue();

    static {
        Covode.recordClassIndex(36196);
    }

    private RunnableC29791f() {
    }

    /* renamed from: a */
    public static RunnableC29791f m60009a() {
        MethodCollector.m26663i(7359);
        if (f71058d == null) {
            synchronized (RunnableC29791f.class) {
                try {
                    if (f71058d == null) {
                        f71058d = new RunnableC29791f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7359);
                    throw th;
                }
            }
        }
        RunnableC29791f fVar = f71058d;
        MethodCollector.m26664o(7359);
        return fVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017 A[Catch:{ all -> 0x00ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.RunnableC29791f.run():void");
    }

    /* renamed from: a */
    public final void mo52073a(String str, JSONArray jSONArray) {
        if (this.f71059b && !TextUtils.isEmpty(str) && jSONArray != null && jSONArray.length() > 0) {
            this.f71060c.add(new C29792a(str, jSONArray));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.common.applog.f$a */
    public class C29792a {

        /* renamed from: a */
        String f71061a;

        /* renamed from: b */
        JSONArray f71062b;

        static {
            Covode.recordClassIndex(36197);
        }

        public C29792a(String str, JSONArray jSONArray) {
            this.f71061a = str;
            this.f71062b = jSONArray;
        }
    }
}
