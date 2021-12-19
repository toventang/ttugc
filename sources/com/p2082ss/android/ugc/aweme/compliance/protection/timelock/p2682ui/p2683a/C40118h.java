package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.C40106a;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.h */
public final /* synthetic */ class C40118h implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC40114f f94200a;

    /* renamed from: b */
    private final int f94201b;

    static {
        Covode.recordClassIndex(47901);
    }

    C40118h(AbstractC40114f fVar, int i) {
        this.f94200a = fVar;
        this.f94201b = i;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        int i;
        AbstractC40114f fVar = this.f94200a;
        int i2 = this.f94201b;
        if (i2 == 1) {
            i = R.string.fby;
        } else {
            i = R.string.gdp;
        }
        String string = C17867d.m33078a().getString(i);
        if (fVar.getActivity() != null) {
            string = fVar.getActivity().getString(i);
        }
        new C23144b(fVar).mo37635a(string).mo37637b();
        C40106a.m81130b(fVar.getActivity(), i2);
    }
}
