package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.C40106a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.d */
public final /* synthetic */ class C40112d implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC40108a f94192a;

    static {
        Covode.recordClassIndex(47895);
    }

    C40112d(AbstractC40108a aVar) {
        this.f94192a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC40108a aVar = this.f94192a;
        ActivityC0945e activity = aVar.getActivity();
        int e = aVar.mo69257e();
        if (e == 0) {
            new C79459a(activity).mo123050a(R.string.ge0).mo123053a();
        } else {
            new C79459a(activity).mo123050a(R.string.gb4).mo123053a();
        }
        C40106a.m81127a(activity, e);
    }
}
