package com.p2082ss.android.ugc.aweme.comment.adapter;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.n */
public final /* synthetic */ class C36241n implements AbstractC1214u {

    /* renamed from: a */
    private final C36229h f85613a;

    static {
        Covode.recordClassIndex(43507);
    }

    C36241n(C36229h hVar) {
        this.f85613a = hVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C36229h hVar = this.f85613a;
        Boolean bool = (Boolean) obj;
        if (hVar.f85600y != null && hVar.f85579d != null) {
            hVar.f85579d.setVisibility(bool.booleanValue() ? !(hVar.f85600y.getAliasAweme() != null) ? 0 : 4 : 8);
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) hVar.f85580e.getLayoutParams();
            aVar.f2264b = (int) C13628n.m24520b(hVar.itemView.getContext(), bool.booleanValue() ? 16.0f : 52.0f);
            hVar.f85580e.setLayoutParams(aVar);
            if (bool.booleanValue()) {
                C34729o.m70959b(false, hVar.f85582g, hVar.f85581f, hVar.f85583h);
            } else if (hVar.f85600y.getAliasAweme() == null) {
                C34729o.m70959b(true, hVar.f85582g, hVar.f85581f, hVar.f85583h);
                hVar.mo63400d();
            }
        }
    }
}
