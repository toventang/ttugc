package com.bytedance.android.livesdk.feed.p523a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.a.m */
public final /* synthetic */ class C8489m implements AbstractC1214u {

    /* renamed from: a */
    private final C8476d f20996a;

    static {
        Covode.recordClassIndex(9342);
    }

    C8489m(C8476d dVar) {
        this.f20996a = dVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C8476d dVar = this.f20996a;
        if (dVar.f20968g && !dVar.f20972k) {
            dVar.f20964c.mo14990a("enter_auto");
        }
        if (obj == AbstractC2994b.EnumC2995a.Login && !dVar.f20972k) {
            C3884b value = ((PagingViewModel) dVar.f20964c).f10972b.getValue();
            Boolean value2 = dVar.f20964c.f10974d.getValue();
            boolean z = true;
            boolean z2 = value != null && value.mo9244b();
            if (value2 != null && !value2.booleanValue()) {
                z = false;
            }
            if (z2 && z) {
                dVar.f20964c.mo14990a("enter_auto");
            }
        }
    }
}
