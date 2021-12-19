package com.p2082ss.android.socialbase.downloader.p2184g.p2185a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.g.a.a */
public final class C30443a {

    /* renamed from: a */
    public int f72559a;

    /* renamed from: b */
    private final Map<String, C30447c> f72560b;

    /* renamed from: c */
    private final Map<String, C30448d> f72561c;

    static {
        Covode.recordClassIndex(36970);
    }

    /* renamed from: com.ss.android.socialbase.downloader.g.a.a$a */
    public static final class C30444a {

        /* renamed from: a */
        public static final C30443a f72562a = new C30443a((byte) 0);

        static {
            Covode.recordClassIndex(36971);
        }
    }

    private C30443a() {
        this.f72560b = new HashMap();
        this.f72561c = new LinkedHashMap(3);
        this.f72559a = 3;
    }

    /* synthetic */ C30443a(byte b) {
        this();
    }

    /* renamed from: a */
    public final C30447c mo54230a(String str, List<HttpHeader> list) {
        C30447c remove;
        MethodCollector.m26663i(6433);
        synchronized (this.f72560b) {
            try {
                remove = this.f72560b.remove(str);
            } catch (Throwable th) {
                MethodCollector.m26664o(6433);
                throw th;
            }
        }
        if (remove != null) {
            if (C30535g.m62569a(remove.f72568a, list)) {
                try {
                    remove.mo54236c();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (System.currentTimeMillis() - remove.f72570c < C30445b.f72566d && remove.f72572e) {
                    MethodCollector.m26664o(6433);
                    return remove;
                }
            }
            try {
                remove.mo54235b();
            } catch (Throwable unused) {
            }
        }
        MethodCollector.m26664o(6433);
        return null;
    }

    /* renamed from: b */
    public final C30448d mo54231b(String str, List<HttpHeader> list) {
        C30448d remove;
        MethodCollector.m26663i(6564);
        synchronized (this.f72561c) {
            try {
                remove = this.f72561c.remove(str);
            } catch (Throwable th) {
                MethodCollector.m26664o(6564);
                throw th;
            }
        }
        if (remove != null) {
            if (C30535g.m62569a(remove.f72577b, list)) {
                try {
                    remove.mo54239e();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (System.currentTimeMillis() - remove.f72578c < C30445b.f72565c && remove.mo54240f()) {
                    MethodCollector.m26664o(6564);
                    return remove;
                }
            }
            try {
                remove.mo54238d();
            } catch (Throwable unused) {
            }
        }
        MethodCollector.m26664o(6564);
        return null;
    }
}
