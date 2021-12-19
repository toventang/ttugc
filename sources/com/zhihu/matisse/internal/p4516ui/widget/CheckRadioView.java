package com.zhihu.matisse.internal.p4516ui.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.p032a.C0637f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.CheckRadioView */
public class CheckRadioView extends AppCompatImageView {

    /* renamed from: a */
    private Drawable f199814a;

    /* renamed from: b */
    private int f199815b = C0637f.m2349b(getResources(), R.color.a31, getContext().getTheme());

    /* renamed from: c */
    private int f199816c = C0637f.m2349b(getResources(), R.color.a30, getContext().getTheme());

    static {
        Covode.recordClassIndex(103997);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public void setColor(int i) {
        if (this.f199814a == null) {
            this.f199814a = getDrawable();
        }
        this.f199814a.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setChecked(boolean z) {
        if (z) {
            setImageResource(2131232384);
            Drawable drawable = getDrawable();
            this.f199814a = drawable;
            if (drawable != null) {
                drawable.setColorFilter(this.f199815b, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        setImageResource(2131232383);
        Drawable drawable2 = getDrawable();
        this.f199814a = drawable2;
        if (drawable2 != null) {
            drawable2.setColorFilter(this.f199816c, PorterDuff.Mode.SRC_IN);
        }
    }

    public CheckRadioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setChecked(false);
    }
}
