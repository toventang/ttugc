package com.bytedance.ies.android.base.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.android.base.runtime.depend.IAdThirdTrackerDepend;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.ies.android.base.runtime.depend.IPermissionDepend;
import com.bytedance.ies.android.base.runtime.depend.IPointDepend;
import com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend;
import com.bytedance.ies.android.base.runtime.depend.IUserDepend;
import com.bytedance.ies.android.base.runtime.p1119a.C16094c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.android.base.runtime.a */
public final class C16091a {

    /* renamed from: a */
    public static IAppLogDepend f38741a;

    /* renamed from: b */
    public static IMonitorDepend f38742b;

    /* renamed from: c */
    public static IHostContextDepend f38743c;

    /* renamed from: d */
    public static IThreadPoolExecutorDepend f38744d;

    /* renamed from: e */
    public static final C16091a f38745e = new C16091a();

    /* renamed from: f */
    private static IHostStyleUIDepend f38746f;

    /* renamed from: g */
    private static IAdThirdTrackerDepend f38747g;

    /* renamed from: h */
    private static IHostRouterDepend f38748h;

    /* renamed from: i */
    private static IPermissionDepend f38749i;

    /* renamed from: j */
    private static IPointDepend f38750j;

    /* renamed from: k */
    private static IUserDepend f38751k;

    /* renamed from: l */
    private static volatile boolean f38752l;

    private C16091a() {
    }

    static {
        Covode.recordClassIndex(18369);
    }

    /* renamed from: a */
    public final synchronized void mo25542a(C16099b bVar) {
        MethodCollector.m26663i(14204);
        C89219l.m154719c(bVar, "");
        if (f38752l) {
            MethodCollector.m26664o(14204);
            return;
        }
        f38741a = bVar.f38773b;
        f38742b = bVar.f38774c;
        f38743c = bVar.f38772a;
        f38746f = bVar.f38777f;
        f38744d = bVar.f38775d;
        f38747g = bVar.f38778g;
        f38748h = bVar.f38779h;
        f38749i = bVar.f38780i;
        f38750j = bVar.f38781j;
        f38751k = bVar.f38782k;
        C16094c.f38753l = bVar.f38776e;
        f38752l = true;
        MethodCollector.m26664o(14204);
    }
}
