package com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.CircularAnimateButton */
public class CircularAnimateButton extends AppCompatButton {

    /* renamed from: a */
    public int f177558a;

    /* renamed from: b */
    public int f177559b;

    /* renamed from: c */
    public int f177560c;

    /* renamed from: e */
    public int f177561e;

    /* renamed from: f */
    private C79012b f177562f;

    static {
        Covode.recordClassIndex(92171);
    }

    /* renamed from: a */
    public final void mo122819a() {
        int i = this.f177561e;
        C79009a a = mo122818a((float) i, (float) this.f177558a, i, this.f177560c);
        a.f177566d = this.f177559b;
        a.f177567e = this.f177559b;
        a.f177568f = 0;
        a.f177569g = 0;
        a.mo122823a();
    }

    public void setBackgroundCompat(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        setBackground(drawable);
    }

    public void setBackgroundColor(int i) {
        this.f177559b = i;
        C79012b a = m137833a(i);
        this.f177562f = a;
        setBackgroundCompat(a.f177580c);
    }

    /* renamed from: a */
    private C79012b m137833a(int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) C84916a.m145947a(i, i, 0, this.f177558a);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius((float) this.f177558a);
        C79012b bVar = new C79012b(gradientDrawable);
        bVar.mo122827a(i);
        bVar.mo122826a();
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f177560c, this.f177561e);
    }

    public CircularAnimateButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177559b = C0643b.m2378c(context, R.color.bh);
        this.f177558a = (int) C13628n.m24520b(context, 22.0f);
        this.f177560c = (int) C13628n.m24520b(context, 230.0f);
        this.f177561e = (int) C13628n.m24520b(context, 44.0f);
        if (this.f177562f == null) {
            this.f177562f = m137833a(this.f177559b);
        }
        setBackgroundCompat(this.f177562f.f177580c);
    }

    /* renamed from: a */
    public final C79009a mo122818a(float f, float f2, int i, int i2) {
        C79009a aVar = new C79009a(this, this.f177562f);
        aVar.f177570h = f;
        aVar.f177571i = f2;
        aVar.f177564b = i;
        aVar.f177565c = i2;
        aVar.f177563a = 300;
        return aVar;
    }
}
