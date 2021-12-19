package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.u */
public final class C46192u extends FrameLayout {

    /* renamed from: a */
    private float f107600a;

    static {
        Covode.recordClassIndex(54751);
    }

    public final float getScale() {
        return this.f107600a;
    }

    public final void setScale(float f) {
        this.f107600a = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C46192u(Context context) {
        super(context, null);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11183);
        this.f107600a = 1.0f;
        MethodCollector.m26664o(11183);
    }

    public /* synthetic */ C46192u(Context context, byte b) {
        this(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(11035);
        super.onMeasure(i, i2);
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec((int) (((float) getMeasuredHeight()) * this.f107600a), View.MeasureSpec.getMode(i2)));
        MethodCollector.m26664o(11035);
    }
}
