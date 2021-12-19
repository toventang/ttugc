package com.p2082ss.android.ugc.playerkit.videoview.p4327b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62970h;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i;
import com.p2082ss.android.ugc.playerkit.model.C84209m;

/* renamed from: com.ss.android.ugc.playerkit.videoview.b.d */
public final class C84259d {

    /* renamed from: a */
    static C84259d f188438a = new C84259d();

    /* renamed from: b */
    private AbstractC63051l f188439b;

    /* renamed from: c */
    private C84209m.EnumC84214e f188440c;

    static {
        Covode.recordClassIndex(98174);
    }

    /* renamed from: a */
    public final synchronized AbstractC63051l mo129280a(C84209m.EnumC84214e eVar) {
        AbstractC63051l lVar;
        MethodCollector.m26663i(1678);
        if (this.f188439b == null) {
            this.f188440c = eVar;
            this.f188439b = new C62970h(new C62976i(eVar));
        } else {
            C84209m.EnumC84214e eVar2 = this.f188440c;
            if (eVar2 != null && !eVar2.equals(eVar)) {
                this.f188439b.mo101013g();
                this.f188440c = eVar;
                this.f188439b = new C62970h(new C62976i(eVar));
            }
        }
        lVar = this.f188439b;
        MethodCollector.m26664o(1678);
        return lVar;
    }
}
