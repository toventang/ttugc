package com.p2082ss.android.ugc.aweme.p2719cv;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.C40789m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.cv.g */
public class C40780g {

    /* renamed from: a */
    public static C40782h f95475a = C40782h.m82258a().mo70024a();

    /* renamed from: b */
    public static AbstractC40766c f95476b = new AbstractC40766c() {
        /* class com.p2082ss.android.ugc.aweme.p2719cv.C40780g.C407811 */

        static {
            Covode.recordClassIndex(48633);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
        /* renamed from: a */
        public final void mo70004a(JSONObject jSONObject) {
        }

        @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
        /* renamed from: a */
        public final boolean mo70005a() {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
        /* renamed from: b */
        public final void mo70006b(JSONObject jSONObject) {
        }

        @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
        /* renamed from: b */
        public final boolean mo70007b() {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
        /* renamed from: c */
        public final void mo70008c(JSONObject jSONObject) {
        }

        @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
        /* renamed from: c */
        public final boolean mo70009c() {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
        /* renamed from: d */
        public final void mo70010d(JSONObject jSONObject) {
        }

        @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
        /* renamed from: d */
        public final boolean mo70011d() {
            return false;
        }
    };

    /* renamed from: c */
    private static volatile ExecutorService f95477c;

    /* renamed from: d */
    private static volatile ExecutorService f95478d;

    /* renamed from: e */
    private static volatile ExecutorService f95479e;

    /* renamed from: f */
    private static volatile ScheduledExecutorService f95480f;

    /* renamed from: g */
    private static volatile ExecutorService f95481g;

    static {
        Covode.recordClassIndex(48632);
    }

    /* renamed from: a */
    public static ExecutorService m82241a() {
        MethodCollector.m26663i(5263);
        if (f95477c == null) {
            synchronized (C40780g.class) {
                try {
                    if (f95477c == null) {
                        f95477c = C40789m.C40791b.f95512a.mo70029a(C40787l.m82269a(EnumC40793o.IO).mo70028a(), true);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5263);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f95477c;
        MethodCollector.m26664o(5263);
        return executorService;
    }

    /* renamed from: b */
    public static ExecutorService m82245b() {
        MethodCollector.m26663i(5358);
        if (f95478d == null) {
            synchronized (C40780g.class) {
                try {
                    if (f95478d == null) {
                        f95478d = C40789m.C40791b.f95512a.mo70029a(C40787l.m82269a(EnumC40793o.DEFAULT).mo70028a(), true);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5358);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f95478d;
        MethodCollector.m26664o(5358);
        return executorService;
    }

    /* renamed from: c */
    public static ExecutorService m82246c() {
        MethodCollector.m26663i(5471);
        if (f95479e == null) {
            synchronized (C40780g.class) {
                try {
                    if (f95479e == null) {
                        f95479e = C40789m.C40791b.f95512a.mo70029a(C40787l.m82269a(EnumC40793o.BACKGROUND).mo70028a(), true);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5471);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f95479e;
        MethodCollector.m26664o(5471);
        return executorService;
    }

    /* renamed from: d */
    public static ScheduledExecutorService m82247d() {
        MethodCollector.m26663i(5582);
        if (f95480f == null) {
            synchronized (C40780g.class) {
                try {
                    if (f95480f == null) {
                        C40789m mVar = C40789m.C40791b.f95512a;
                        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
                        a.f95505c = 1;
                        f95480f = (ScheduledExecutorService) mVar.mo70029a(a.mo70028a(), true);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5582);
                    throw th;
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f95480f;
        MethodCollector.m26664o(5582);
        return scheduledExecutorService;
    }

    /* renamed from: e */
    public static ExecutorService m82248e() {
        MethodCollector.m26663i(5583);
        if (f95481g == null) {
            synchronized (C40780g.class) {
                try {
                    if (f95481g == null) {
                        f95481g = C40789m.C40791b.f95512a.mo70029a(C40787l.m82269a(EnumC40793o.SERIAL).mo70028a(), true);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5583);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f95481g;
        MethodCollector.m26664o(5583);
        return executorService;
    }

    /* renamed from: a */
    public static ExecutorService m82242a(C40787l lVar) {
        if (lVar.f95496a != EnumC40793o.IO && lVar.f95496a != EnumC40793o.DEFAULT && lVar.f95496a != EnumC40793o.BACKGROUND) {
            return C40789m.C40791b.f95512a.mo70029a(lVar, false);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    static boolean m82243a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f95475a.f95484c) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m82244a(ExecutorService executorService) {
        if (f95477c != null && executorService == m82241a()) {
            return true;
        }
        if (f95478d != null && executorService == m82245b()) {
            return true;
        }
        if (f95479e != null && executorService == m82246c()) {
            return true;
        }
        if (f95480f != null && executorService == m82247d()) {
            return true;
        }
        if (f95481g == null || executorService != m82248e()) {
            return false;
        }
        return true;
    }
}
