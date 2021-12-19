package com.bytedance.ttnet.p1700a;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14703k;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.retrofit.C22958a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ttnet.a.i */
public class C22915i implements SsHttpCall.AbstractC21971a {

    /* renamed from: a */
    private static final String f54148a = C22915i.class.getSimpleName();

    /* renamed from: b */
    private static volatile C22915i f54149b;

    /* renamed from: c */
    private boolean f54150c;

    /* renamed from: d */
    private int f54151d;

    /* renamed from: e */
    private boolean f54152e;

    /* renamed from: f */
    private Set<String> f54153f = new HashSet();

    /* renamed from: g */
    private Map<String, Integer> f54154g = new HashMap();

    @Override // com.bytedance.retrofit2.SsHttpCall.AbstractC21971a
    /* renamed from: a */
    public final boolean mo35772a() {
        return this.f54150c;
    }

    static {
        Covode.recordClassIndex(26823);
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.AbstractC21971a
    /* renamed from: b */
    public final boolean mo35773b() {
        return C14703k.m26921a().mo23709b();
    }

    private C22915i() {
        mo37251d();
    }

    /* renamed from: c */
    public static C22915i m43207c() {
        MethodCollector.m26663i(5123);
        if (f54149b == null) {
            synchronized (C22915i.class) {
                try {
                    if (f54149b == null) {
                        f54149b = new C22915i();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5123);
                    throw th;
                }
            }
        }
        C22915i iVar = f54149b;
        MethodCollector.m26664o(5123);
        return iVar;
    }

    /* renamed from: d */
    public final void mo37251d() {
        boolean z;
        boolean z2 = true;
        if (TTNetInit.getTTNetDepend().mo37258a(TTNetInit.getTTNetDepend().mo37259a(), "app_delay_enable", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f54150c = z;
        if (TTNetInit.getTTNetDepend().mo37258a(TTNetInit.getTTNetDepend().mo37259a(), "app_delay_use_black_list", 0) <= 0) {
            z2 = false;
        }
        this.f54152e = z2;
        this.f54151d = TTNetInit.getTTNetDepend().mo37258a(TTNetInit.getTTNetDepend().mo37259a(), "app_delay_whitelist_delay_time", 0);
        this.f54153f = C22910g.m43197d(TTNetInit.getTTNetDepend().mo37260a(TTNetInit.getTTNetDepend().mo37259a(), "app_delay_white_list", ""));
        this.f54154g = C22910g.m43196c(TTNetInit.getTTNetDepend().mo37260a(TTNetInit.getTTNetDepend().mo37259a(), "app_delay_black_list", ""));
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.AbstractC21971a
    /* renamed from: a */
    public final int mo35770a(String str) {
        if (this.f54152e) {
            return this.f54154g.get(str).intValue();
        }
        return this.f54151d;
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.AbstractC21971a
    /* renamed from: b */
    public final boolean mo35774b(String str) {
        if (!this.f54150c) {
            return false;
        }
        if (this.f54152e) {
            boolean a = C22958a.m43273a(str, this.f54154g.keySet());
            if (a) {
                Logger.debug();
            } else {
                Logger.debug();
            }
            return a;
        } else if (C22958a.m43273a(str, this.f54153f)) {
            Logger.debug();
            return false;
        } else {
            Logger.debug();
            return true;
        }
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.AbstractC21971a
    /* renamed from: a */
    public final int mo35771a(String str, String str2) {
        return C14703k.m26921a().mo23705a(str, str2);
    }
}
