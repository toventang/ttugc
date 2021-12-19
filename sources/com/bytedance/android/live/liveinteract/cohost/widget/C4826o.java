package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.cohost.p279ui.view.LinkCrossTitleLayout;
import com.bytedance.android.live.liveinteract.match.p295b.p299d.C4961a;
import com.bytedance.android.live.liveinteract.platform.common.view.C5753b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.o */
final /* synthetic */ class C4826o implements C5753b.AbstractC5756b {

    /* renamed from: a */
    private final C4961a f12677a;

    static {
        Covode.recordClassIndex(5408);
    }

    C4826o(C4961a aVar) {
        this.f12677a = aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5756b
    /* renamed from: a */
    public final void mo10550a(View view, Object obj) {
        LinkCrossTitleLayout linkCrossTitleLayout = (LinkCrossTitleLayout) view;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (linkCrossTitleLayout != null) {
            ViewGroup.LayoutParams layoutParams = linkCrossTitleLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            if (booleanValue) {
                aVar.f2271i = R.id.d_f;
                aVar.f2270h = -1;
            } else {
                aVar.f2271i = -1;
                aVar.f2270h = R.id.ade;
            }
            linkCrossTitleLayout.setLayoutParams(aVar);
        }
    }
}
