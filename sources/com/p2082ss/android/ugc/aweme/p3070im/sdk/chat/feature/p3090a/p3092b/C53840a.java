package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3092b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56203d;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.b.a */
public final class C53840a {

    /* renamed from: a */
    public AbstractC54386c.AbstractC54391a f123461a;

    /* renamed from: b */
    public boolean f123462b;

    /* renamed from: c */
    public C19538ai f123463c;

    static {
        Covode.recordClassIndex(63500);
    }

    /* renamed from: a */
    public final void mo90986a() {
        C19538ai aiVar = this.f123463c;
        if (aiVar != null) {
            C55231t.m101000a(aiVar, (AbstractC19479b<C19538ai>) null);
            this.f123463c = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo90987a(AbstractC17434e eVar, boolean z) {
        T t;
        MethodCollector.m26663i(5069);
        C89219l.m154721d(eVar, "");
        if (!C56203d.m102113b() || this.f123462b) {
            MethodCollector.m26664o(5069);
            return;
        }
        List<C19538ai> i = eVar.mo27768i();
        if (i.size() > 5) {
            this.f123462b = true;
            MethodCollector.m26664o(5069);
            return;
        }
        Iterator<T> it = i.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getMsgType() == 15) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null || z) {
            this.f123463c = t2;
            this.f123462b = true;
        }
        if (!(this.f123463c == null || this.f123461a == null)) {
            AbstractC54386c.AbstractC54391a aVar = this.f123461a;
            if (aVar == null) {
                C89219l.m154710a("onSayHiMessageDetected");
            }
            aVar.mo91473a(this.f123463c);
        }
        MethodCollector.m26664o(5069);
    }
}
