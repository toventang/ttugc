package com.bytedance.android.live.design.widget.rtl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

public class LiveAutoRtlImageView extends AppCompatImageView {
    static {
        Covode.recordClassIndex(4689);
    }

    /* renamed from: a */
    private void m10035a() {
        m10036b();
        m10037c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: b */
    private void m10036b() {
        Drawable background = getBackground();
        if (background != null && !C0705a.m2501a(background)) {
            background.mutate();
            C0705a.m2500a(background, true);
        }
    }

    /* renamed from: c */
    private void m10037c() {
        Drawable drawable = getDrawable();
        if (drawable != null && !C0705a.m2501a(drawable)) {
            drawable.mutate();
            C0705a.m2500a(drawable, true);
        }
    }

    public LiveAutoRtlImageView(Context context) {
        super(context);
        m10035a();
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        m10036b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m10037c();
    }

    public LiveAutoRtlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10035a();
    }
}
