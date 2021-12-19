package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.AbstractC35998a;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ac */
public final class C35962ac extends AbstractC35984o {
    static {
        Covode.recordClassIndex(43208);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35984o
    /* renamed from: a */
    public final void mo63097a() {
        float b = C13628n.m24520b(this.f84967b, 16.0f);
        this.f84969d.setPadding(0, 0, 0, 0);
        this.f84969d.setBackgroundColor(0);
        LinearLayout linearLayout = this.f84969d;
        C89219l.m154716b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
        this.f84969d.requestLayout();
        TextView textView = this.f84971f;
        C89219l.m154716b(textView, "");
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i = (int) b;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin += i;
        View view = this.f84972g;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = i;
        View view2 = this.f84972g;
        C89219l.m154716b(view2, "");
        view2.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35984o
    /* renamed from: a */
    public final void mo63098a(C36050s sVar) {
        ((AbstractC35998a) sVar).itemView.setPadding(0, 0, 0, 0);
    }

    public C35962ac(View view, int i) {
        super(view, i);
    }
}
