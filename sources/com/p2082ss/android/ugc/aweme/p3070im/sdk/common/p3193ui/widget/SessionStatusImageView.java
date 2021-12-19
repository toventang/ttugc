package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.SessionStatusImageView */
public class SessionStatusImageView extends AutoRTLImageView {
    static {
        Covode.recordClassIndex(65081);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.views.AutoRTLImageView, androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        int i;
        if (drawable == null) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
        super.setImageDrawable(drawable);
    }

    public SessionStatusImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
