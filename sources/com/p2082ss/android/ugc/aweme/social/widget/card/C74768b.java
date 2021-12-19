package com.p2082ss.android.ugc.aweme.social.widget.card;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.b */
public final class C74768b implements RecyclerView.AbstractC1368k {

    /* renamed from: a */
    public final int f168067a;

    static {
        Covode.recordClassIndex(87613);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1368k
    /* renamed from: b */
    public final void mo4748b(View view) {
        C89219l.m154721d(view, "");
    }

    public C74768b(int i) {
        this.f168067a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1368k
    /* renamed from: a */
    public final void mo4747a(View view) {
        C89219l.m154721d(view, "");
        if (view.getLayoutParams().height != this.f168067a) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f168067a;
                view.setLayoutParams(layoutParams);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }
}
