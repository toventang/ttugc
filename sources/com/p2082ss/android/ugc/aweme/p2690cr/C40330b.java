package com.p2082ss.android.ugc.aweme.p2690cr;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2690cr.p2691a.p2693b.p2694a.C40327a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40385a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40387b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40390d;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40391e;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40392f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.b */
public final class C40330b implements AbstractC40392f {

    /* renamed from: a */
    private AbstractC40385a f94502a;

    /* renamed from: b */
    private final AtomicBoolean f94503b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(48131);
    }

    /* renamed from: f */
    private final void m81482f() {
        C63244g.m114602a().mo73275c().mo101845a(mo69469b());
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40392f
    /* renamed from: a */
    public final AbstractC40387b mo69467a() {
        AbstractC40385a aVar = this.f94502a;
        if (aVar == null) {
            C89219l.m154710a("mProxy");
        }
        return aVar.getMonitor();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40392f
    /* renamed from: b */
    public final AbstractC40391e mo69469b() {
        AbstractC40385a aVar = this.f94502a;
        if (aVar == null) {
            C89219l.m154710a("mProxy");
        }
        return aVar.getAllowListService();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40392f
    /* renamed from: c */
    public final AbstractC40389c mo69470c() {
        AbstractC40385a aVar = this.f94502a;
        if (aVar == null) {
            C89219l.m154710a("mProxy");
        }
        return aVar.getFileProvider();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40392f
    /* renamed from: d */
    public final AbstractC40390d mo69471d() {
        AbstractC40385a aVar = this.f94502a;
        if (aVar == null) {
            C89219l.m154710a("mProxy");
        }
        return aVar.getPersistedAllowListManager();
    }

    /* renamed from: e */
    private final void m81481e() {
        AbstractC40385a aVar = this.f94502a;
        if (aVar == null) {
            C89219l.m154710a("mProxy");
        }
        aVar.getPersistedAllowListManager().mo69483a(new C40327a());
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40392f
    /* renamed from: a */
    public final void mo69468a(AbstractC40385a aVar) {
        C89219l.m154721d(aVar, "");
        if (!this.f94503b.get()) {
            this.f94503b.set(true);
            this.f94502a = aVar;
            m81481e();
            m81482f();
        }
    }
}
