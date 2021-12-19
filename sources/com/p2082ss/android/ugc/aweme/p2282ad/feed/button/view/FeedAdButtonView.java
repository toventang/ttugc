package com.p2082ss.android.ugc.aweme.p2282ad.feed.button.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2282ad.p2283a.AbstractC33108a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.button.view.FeedAdButtonView */
public final class FeedAdButtonView extends AbstractC33108a {
    static {
        Covode.recordClassIndex(40037);
    }

    public FeedAdButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2283a.AbstractC33108a
    public final int getLayoutId$c_feed_impl_tiktokI18nRelease() {
        return R.layout.a_6;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2283a.AbstractC33108a
    public final void setLabelVisibility$c_feed_impl_tiktokI18nRelease(int i) {
        setVisibility(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2283a.AbstractC33108a
    /* renamed from: a */
    public final void mo58888a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) getResources().getDimensionPixelOffset(R.dimen.jw));
        gradientDrawable.setColor(i);
        setBackground(gradientDrawable);
    }

    private /* synthetic */ FeedAdButtonView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdButtonView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        setDefaultBackgroundColor$c_feed_impl_tiktokI18nRelease(C0643b.m2378c(context, R.color.ob));
    }
}
