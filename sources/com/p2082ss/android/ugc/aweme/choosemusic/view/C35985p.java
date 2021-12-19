package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.p */
public final class C35985p extends AbstractC35965b {
    static {
        Covode.recordClassIndex(43231);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35965b
    /* renamed from: a */
    public final void mo63100a() {
        float b = C13628n.m24520b(this.f84896b, 16.0f);
        this.f84898d.setPadding(0, 0, 0, 0);
        this.f84898d.setBackgroundColor(0);
        LinearLayout linearLayout = this.f84898d;
        C89219l.m154716b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
        this.f84898d.requestLayout();
        View view = this.f84902h;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) b;
        View view2 = this.f84902h;
        C89219l.m154716b(view2, "");
        view2.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35965b
    /* renamed from: a */
    public final void mo63101a(C36050s sVar) {
        sVar.mo63156b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35985p(View view, int i) {
        super(view, i);
        C89219l.m154721d(view, "");
    }
}
