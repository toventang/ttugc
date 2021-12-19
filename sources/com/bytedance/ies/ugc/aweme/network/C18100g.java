package com.bytedance.ies.ugc.aweme.network;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.ies.ugc.aweme.network.zstd.C18108a;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.p1700a.C22898a;
import com.bytedance.ttnet.p1701b.AbstractC22917a;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.legoImp.NetworkConfigProvider;
import com.p2082ss.android.ugc.aweme.net.p3490c.C61312b;
import com.p2082ss.android.ugc.aweme.network.AbstractC61491c;
import com.p2082ss.android.ugc.aweme.network.C61464a;
import com.p2082ss.android.ugc.aweme.network.p3503a.C61474b;
import com.p2082ss.android.ugc.aweme.network.p3503a.C61477d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.chromium.C90228c;
import org.chromium.C90229d;
import org.chromium.C90232f;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.ugc.aweme.network.g */
public final class C18100g {

    /* renamed from: a */
    static final Object f43087a = new Object();

    /* renamed from: b */
    static volatile boolean f43088b;

    /* renamed from: c */
    static volatile boolean f43089c;

    /* renamed from: d */
    static final List<String> f43090d = C89070n.m154522b("MI PAD 2", "YT3-X90L", "YT3-X90F", "GT-810");

    /* renamed from: e */
    public static final C18100g f43091e = new C18100g();

    /* renamed from: f */
    private static final AbstractC89244h f43092f = C89250i.m154773a((AbstractC89171a) C18102b.f43094a);

    /* renamed from: a */
    public static C61464a m33701a() {
        return (C61464a) f43092f.getValue();
    }

    private C18100g() {
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$b */
    static final class C18102b extends AbstractC89220m implements AbstractC89171a<C61464a> {

        /* renamed from: a */
        public static final C18102b f43094a = new C18102b();

        static {
            Covode.recordClassIndex(20741);
        }

        C18102b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61464a invoke() {
            INetworkConfigProvider b = NetworkConfigProvider.m105243b();
            if (b == null) {
                C89219l.m154715b();
            }
            return b.mo28814a();
        }
    }

    /* renamed from: c */
    static boolean m33703c() {
        if (Build.VERSION.SDK_INT <= 19) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(20739);
    }

    /* renamed from: b */
    public static void m33702b() {
        MethodCollector.m26663i(10789);
        if (C61474b.f139556a) {
            MethodCollector.m26664o(10789);
        } else if (f43088b) {
            MethodCollector.m26664o(10789);
        } else {
            Object obj = f43087a;
            synchronized (obj) {
                try {
                    if (!f43088b) {
                        try {
                            obj.wait();
                            f43088b = true;
                        } catch (Throwable unused) {
                        }
                    }
                } finally {
                    MethodCollector.m26664o(10789);
                }
            }
        }
    }

    /* renamed from: d */
    static boolean m33704d() {
        List a;
        try {
            if (Build.VERSION.SDK_INT == 18) {
                return true;
            }
            if (Build.VERSION.SDK_INT < 21) {
                a = C89070n.m154516a(Build.CPU_ABI);
            } else if (Build.VERSION.SDK_INT >= 21) {
                String[] strArr = Build.SUPPORTED_ABIS;
                C89219l.m154716b(strArr, "");
                a = C89064i.m154463a(strArr);
            } else {
                a = C89070n.m154516a("");
            }
            if (a.contains("x86") || a.contains("x86_64")) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$a */
    static final class CallableC18101a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC61491c f43093a;

        static {
            Covode.recordClassIndex(20740);
        }

        CallableC18101a(AbstractC61491c cVar) {
            this.f43093a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            MethodCollector.m26663i(10940);
            TTNetInit.useCustomizedCookieStoreName();
            C61464a a = C18100g.m33701a();
            AbstractC61491c cVar = this.f43093a;
            if (cVar != null) {
                cVar.mo98930a(a);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C89219l.m154721d(a, "");
            TTNetInit.setDelayTime(a.f139540m.mo99140a().intValue());
            if (((Boolean) C61477d.f139560a.getValue()).booleanValue()) {
                TTNetInit.setBypassOfflineCheck(true);
            }
            TTNetInit.setTTNetDepend(a.f139529b);
            if (!C18100g.m33703c() && C29843f.m60129a(a.f139528a)) {
                TTNetInit.setFirstRequestWaitTime(0);
            }
            C14731e.f35923l = a.f139536i;
            C14731e.f35914c = new C18108a();
            TTNetInit.setCronetDepend(a.f139530c);
            String b = C29843f.m60132b(a.f139528a);
            boolean z2 = false;
            if (b == null || !C89361p.m154908a((CharSequence) b, (CharSequence) "miniapp", false)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (!C18100g.m33703c()) {
                    TTNetInit.setFirstRequestWaitTime(0);
                }
                TTNetInit.tryInitTTNet(a.f139528a, a.f139528a, new C61312b(), a.f139538k, null, true, true);
            } else {
                TTNetInit.tryInitTTNet(a.f139528a, a.f139528a, new C61312b(), a.f139538k, null, true, false);
            }
            try {
                C22898a.m43150a(a.f139528a);
                if (C18100g.m33704d() || C18100g.f43090d.contains(Build.MODEL) || (z && Build.VERSION.SDK_INT == 22)) {
                    z2 = true;
                }
                if (z2) {
                    C22898a.m43150a(a.f139528a);
                    C22898a.f54059l = true;
                } else {
                    C22898a.m43150a(a.f139528a);
                }
                C90229d.m156924a().setAdapter(a.f139530c);
                C90228c a2 = C90228c.m156904a();
                AbstractC22917a aVar = a.f139530c;
                if (aVar != null) {
                    try {
                        Class<?> cls = aVar.getClass();
                        if (cls != null) {
                            List a3 = C90232f.m156943a(cls);
                            if (a3 != null) {
                                if (!a3.isEmpty()) {
                                    Iterator it = a3.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        } else if ("com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider".equals(((Class) it.next()).getName())) {
                                            if (C90229d.m156924a().loggerDebug()) {
                                                C90229d.m156924a().loggerD("CronetAppProviderManager", "inject CronetAppProviderManager success");
                                            }
                                            a2.f204965a = aVar;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                TTNetInit.preInitCronetKernel();
                C18100g.f43089c = true;
            } catch (Throwable unused2) {
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ttnet_init_time", elapsedRealtime2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C12290b.m22064a("ttnet_init_time", jSONObject);
            if (cVar != null) {
                cVar.mo98931b(a);
            }
            synchronized (C18100g.f43087a) {
                try {
                    C18100g.f43088b = true;
                    C18100g.f43087a.notifyAll();
                } catch (Throwable th) {
                    MethodCollector.m26664o(10940);
                    throw th;
                }
            }
            AbstractC61491c cVar2 = this.f43093a;
            if (cVar2 != null) {
                cVar2.mo98932c(C18100g.m33701a());
                C89391z zVar = C89391z.f203057a;
                MethodCollector.m26664o(10940);
                return zVar;
            }
            MethodCollector.m26664o(10940);
            return null;
        }
    }
}
