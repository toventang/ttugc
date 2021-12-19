package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0439n;
import com.bytedance.android.live.design.widget.p235b.C4123a;
import com.bytedance.android.live.design.widget.p235b.C4124b;
import com.bytedance.android.live.design.widget.p235b.C4127e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class LiveRadioButton extends C0439n {

    /* renamed from: a */
    private C4127e f11510a;

    /* renamed from: b */
    private C4124b f11511b;

    /* renamed from: c */
    private C4123a f11512c;

    static {
        Covode.recordClassIndex(4676);
    }

    public void draw(Canvas canvas) {
        boolean a = this.f11511b.mo9630a(canvas);
        super.draw(canvas);
        C4124b.m10013a(canvas, a);
    }

    public LiveRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        this.f11510a.mo9633a(i);
    }

    private LiveRadioButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.a8m);
        C4124b bVar = new C4124b(this);
        this.f11511b = bVar;
        bVar.mo9537a(attributeSet, R.attr.a8m, 0);
        C4127e eVar = new C4127e(this);
        this.f11510a = eVar;
        eVar.mo9537a(attributeSet, R.attr.a8m, 0);
        C4123a aVar = new C4123a(this);
        this.f11512c = aVar;
        aVar.mo9537a(attributeSet, R.attr.a8m, 0);
    }
}
