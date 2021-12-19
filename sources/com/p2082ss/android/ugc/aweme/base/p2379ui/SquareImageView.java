package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.SquareImageView */
public class SquareImageView extends AnimatedImageView {
    static {
        Covode.recordClassIndex(41647);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAspectRatio(1.0f);
    }
}
