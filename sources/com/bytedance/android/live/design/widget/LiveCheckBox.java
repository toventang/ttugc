package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.android.live.design.widget.p235b.C4123a;
import com.bytedance.android.live.design.widget.p235b.C4124b;
import com.bytedance.android.live.design.widget.p235b.C4127e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class LiveCheckBox extends AppCompatCheckBox {

    /* renamed from: a */
    private C4127e f11503a;

    /* renamed from: b */
    private C4124b f11504b;

    /* renamed from: c */
    private C4123a f11505c;

    static {
        Covode.recordClassIndex(4674);
    }

    public void draw(Canvas canvas) {
        boolean a = this.f11504b.mo9630a(canvas);
        super.draw(canvas);
        C4124b.m10013a(canvas, a);
    }

    public LiveCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        this.f11503a.mo9633a(i);
    }

    private LiveCheckBox(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.mn);
        C4124b bVar = new C4124b(this);
        this.f11504b = bVar;
        bVar.mo9537a(attributeSet, R.attr.mn, 0);
        C4127e eVar = new C4127e(this);
        this.f11503a = eVar;
        eVar.mo9537a(attributeSet, R.attr.mn, 0);
        C4123a aVar = new C4123a(this);
        this.f11505c = aVar;
        aVar.mo9537a(attributeSet, R.attr.mn, 0);
    }
}
