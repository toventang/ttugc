package com.lynx.component.svg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.lynx.component.svg.b */
public final class C28318b extends AppCompatImageView {
    static {
        Covode.recordClassIndex(34276);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public C28318b(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public final void setImageDrawable(Drawable drawable) {
        setLayerType(1, null);
        super.setImageDrawable(drawable);
    }
}
