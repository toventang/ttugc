package com.bytedance.android.live.design.widget.rtl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.widget.C0823h;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

public class LiveAutoRtlTextView extends LiveTextView {
    static {
        Covode.recordClassIndex(4690);
    }

    /* renamed from: a */
    private void m10038a() {
        Drawable background = getBackground();
        if (background != null && !C0705a.m2501a(background)) {
            background.mutate();
            C0705a.m2500a(background, true);
        }
    }

    /* renamed from: b */
    private void m10039b() {
        Drawable[] compoundDrawables = getCompoundDrawables();
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null && !C0705a.m2501a(drawable)) {
                drawable.mutate();
                C0705a.m2500a(drawable, true);
            }
        }
    }

    /* renamed from: c */
    private void m10040c() {
        Drawable[] b = C0823h.m2912b(this);
        for (Drawable drawable : b) {
            if (drawable != null && !C0705a.m2501a(drawable)) {
                drawable.mutate();
                C0705a.m2500a(drawable, true);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m10038a();
    }

    public LiveAutoRtlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10038a();
        m10039b();
        m10040c();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m10039b();
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        m10040c();
    }
}
