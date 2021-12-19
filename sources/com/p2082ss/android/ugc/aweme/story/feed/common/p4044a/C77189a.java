package com.p2082ss.android.ugc.aweme.story.feed.common.p4044a;

import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77190b;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.a.a */
public final class C77189a extends AbstractC77190b {
    static {
        Covode.recordClassIndex(90201);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77190b
    /* renamed from: a */
    public final void mo120805a(Aweme aweme, int i) {
        C89219l.m154721d(aweme, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77190b
    /* renamed from: b */
    public final void mo120806b(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77190b
    /* renamed from: g */
    public final void mo120807g() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* bridge */ /* synthetic */ void onChanged(C33942b bVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77190b
    /* renamed from: a */
    public final void mo120804a(int i) {
        Aweme c = mo120808a().mo80287c(i);
        if (c == null) {
            return;
        }
        if (C76660b.m134242b() || !C76706a.m134280f(c)) {
            LinearLayout linearLayout = (LinearLayout) mo120813f().findViewById(R.id.cez);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo120813f().findViewById(R.id.cez);
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.setVisibility(0);
        TuxTextView tuxTextView = (TuxTextView) mo120813f().findViewById(R.id.f6v);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText("@" + C80580in.m139684b(c.getAuthor()));
        TuxTextView tuxTextView2 = (TuxTextView) mo120813f().findViewById(R.id.f1q);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(" · " + mo120812e().getString(R.string.cpa));
    }
}
