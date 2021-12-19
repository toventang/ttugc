package com.bytedance.android.livesdk.rank.impl.p608a;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.bytedance.android.livesdk.rank.impl.a.b */
public final class C10361b extends C89399f {

    /* renamed from: a */
    private C10360a f25040a;

    /* renamed from: d */
    private List<?> f25041d = new ArrayList();

    static {
        Covode.recordClassIndex(11929);
    }

    @Override // p4628j.p4629a.p4630a.C89399f
    /* renamed from: a */
    public final void mo17153a(List list) {
        if (list != null) {
            C10360a aVar = new C10360a(this.f25041d, list);
            this.f25040a = aVar;
            AbstractC88979t.m154310b(C1445j.m4922a(aVar, true)).mo143271a(new C11191f()).mo143254a(new C10362c(this, list), C10363d.f25044a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo17154a(List list, C1445j.C1450d dVar) {
        super.mo17153a(list);
        try {
            dVar.mo4951a(this);
        } catch (Exception e) {
            C6555i.m14021b();
            C3854a.m9455a(6, "ttlive_exception", e.getStackTrace());
        }
        this.f25041d.clear();
        this.f25041d.addAll(list);
    }
}
