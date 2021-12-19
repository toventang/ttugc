package com.p2082ss.android.ugc.aweme.kids.p3314b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.kids.p3318c.C57170a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.external.ICacheService;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.kids.b.d */
public class C57166d {

    /* renamed from: d */
    public static int f130149d = 30000;

    /* renamed from: e */
    public static long f130150e = ((long) C57170a.f130157a);

    /* renamed from: f */
    private static C57166d f130151f;

    /* renamed from: a */
    public AbstractC57167a f130152a;

    /* renamed from: b */
    public AbstractC57167a f130153b;

    /* renamed from: c */
    public Context f130154c;

    /* renamed from: com.ss.android.ugc.aweme.kids.b.d$a */
    public interface AbstractC57167a {
        static {
            Covode.recordClassIndex(67067);
        }

        /* renamed from: a */
        String mo94369a();
    }

    static {
        Covode.recordClassIndex(67066);
    }

    /* renamed from: b */
    public final String mo94368b() {
        String a = this.f130152a.mo94369a();
        if (a.endsWith("/")) {
            return a;
        }
        return a + File.separator;
    }

    /* renamed from: a */
    public static C57166d m103601a() {
        MethodCollector.m26663i(11177);
        if (f130151f == null) {
            synchronized (C57166d.class) {
                try {
                    if (f130151f == null) {
                        f130151f = new C57166d();
                        ICacheService cacheConfig = AVExternalServiceImpl.m113114a().configService().cacheConfig();
                        f130151f.f130154c = C17867d.m33078a();
                        f130151f.f130153b = new C57168e(cacheConfig);
                        f130151f.f130152a = new C57169f(cacheConfig);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11177);
                    throw th;
                }
            }
        }
        C57166d dVar = f130151f;
        MethodCollector.m26664o(11177);
        return dVar;
    }
}
