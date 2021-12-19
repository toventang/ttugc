package com.bytedance.ies.bullet.service.popup.round;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.popup.p1183b.C16933b;

public class RoundLinearLayout extends LinearLayout {

    /* renamed from: a */
    private C16933b f40439a;

    static {
        Covode.recordClassIndex(19425);
    }

    public void setRadius(int i) {
        this.f40439a.mo26756a((float) i);
    }

    public void draw(Canvas canvas) {
        this.f40439a.mo26758a(canvas);
        super.draw(canvas);
        this.f40439a.mo26760b(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(269);
        super.onDraw(canvas);
        MethodCollector.m26664o(269);
    }

    public RoundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private RoundLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, -1);
        MethodCollector.m26663i(264);
        C16933b bVar = new C16933b();
        this.f40439a = bVar;
        bVar.mo26759a(this);
        MethodCollector.m26664o(264);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f40439a.mo26757a(i, i2);
    }
}
