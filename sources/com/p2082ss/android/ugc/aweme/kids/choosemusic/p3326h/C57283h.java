package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.h */
public final class C57283h extends AbstractC57273b {
    static {
        Covode.recordClassIndex(67188);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57273b
    /* renamed from: a */
    public final void mo94473a() {
        float b = C13628n.m24520b(this.f130464b, 16.0f);
        this.f130466d.setPadding(0, 0, 0, 0);
        this.f130466d.setBackgroundColor(0);
        LinearLayout linearLayout = this.f130466d;
        C89219l.m154716b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
        this.f130466d.requestLayout();
        TextView textView = this.f130467e;
        C89219l.m154716b(textView, "");
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i = (int) b;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin += i;
        View view = this.f130469g;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = i;
        View view2 = this.f130469g;
        C89219l.m154716b(view2, "");
        view2.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57273b
    /* renamed from: a */
    public final void mo94475a(C57320o oVar) {
        oVar.mo94504b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57283h(View view, int i) {
        super(view, i);
        C89219l.m154721d(view, "");
    }
}
