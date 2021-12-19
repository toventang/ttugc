package com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class SearchAdTransformButton extends AbstractC17929a {
    static {
        Covode.recordClassIndex(20542);
    }

    public SearchAdTransformButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.AbstractC17929a
    public final int getLayoutId$commercialize_search_impl_release() {
        return R.layout.att;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.AbstractC17929a
    /* renamed from: a */
    public final boolean mo28584a() {
        if (getMAwemeRawAd$commercialize_search_impl_release() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.AbstractC17929a
    public final void setTransformButtonVisibility$commercialize_search_impl_release(int i) {
        setVisibility(i);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.AbstractC17929a
    /* renamed from: a */
    public final void mo28583a(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) getResources().getDimensionPixelOffset(R.dimen.rq));
        if (i2 == 0) {
            gradientDrawable.setColor(i);
            setBackground(gradientDrawable);
            return;
        }
        gradientDrawable.setColor(getBackGroundColor());
        C38545a.m78163a(this, gradientDrawable, getBackGroundColor(), i, (long) i2);
    }

    private /* synthetic */ SearchAdTransformButton(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchAdTransformButton(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        setDefaultBackgroundColor(C0643b.m2378c(context, R.color.bz));
    }
}
