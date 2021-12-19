package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.live.design.widget.p235b.C4124b;
import com.bytedance.android.live.design.widget.p235b.C4127e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class LiveSwitch extends SwitchCompat {

    /* renamed from: a */
    private C4124b f11513a;

    /* renamed from: b */
    private C4127e f11514b;

    static {
        Covode.recordClassIndex(4677);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void draw(Canvas canvas) {
        boolean a = this.f11513a.mo9630a(canvas);
        super.draw(canvas);
        C4124b.m10013a(canvas, a);
    }

    public LiveSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        this.f11514b.mo9633a(i);
    }

    private LiveSwitch(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.ag5);
        C4124b bVar = new C4124b(this);
        this.f11513a = bVar;
        bVar.mo9537a(attributeSet, R.attr.ag5, 0);
        C4127e eVar = new C4127e(this);
        this.f11514b = eVar;
        eVar.mo9537a(attributeSet, R.attr.ag5, 0);
    }
}
