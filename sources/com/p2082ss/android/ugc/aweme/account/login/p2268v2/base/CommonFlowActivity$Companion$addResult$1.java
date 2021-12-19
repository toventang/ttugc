package com.p2082ss.android.ugc.aweme.account.login.p2268v2.base;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1642e.C22362d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity$Companion$addResult$1 */
public final class CommonFlowActivity$Companion$addResult$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ int f77706a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1204m f77707b;

    static {
        Covode.recordClassIndex(39330);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        CommonFlowActivity.f77692f.remove(this.f77706a);
        this.f77707b.getLifecycle().mo4013b(this);
        C22362d.m42100a().mo36727b();
    }

    CommonFlowActivity$Companion$addResult$1(int i, AbstractC1204m mVar) {
        this.f77706a = i;
        this.f77707b = mVar;
    }
}
