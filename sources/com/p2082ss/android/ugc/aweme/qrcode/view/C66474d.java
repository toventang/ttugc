package com.p2082ss.android.ugc.aweme.qrcode.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.d */
public final class C66474d extends View {

    /* renamed from: a */
    float f149442a;

    /* renamed from: b */
    float f149443b;

    /* renamed from: c */
    float f149444c;

    /* renamed from: d */
    float f149445d;

    /* renamed from: e */
    private Paint f149446e = new Paint();

    /* renamed from: f */
    private float f149447f;

    static {
        Covode.recordClassIndex(78010);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        this.f149446e.setColor(C0643b.m2378c(getContext(), R.color.bk));
        this.f149446e.setAntiAlias(true);
        int c = C34723i.m70930c(getContext());
        int a = C34723i.m70924a(getContext());
        float f = this.f149442a;
        float f2 = this.f149447f;
        float f3 = f - f2;
        float f4 = this.f149443b + f2;
        float f5 = this.f149444c - f2;
        float f6 = (float) c;
        canvas.drawRect(0.0f, 0.0f, f6, f3, this.f149446e);
        float f7 = f4 + 1.0f;
        canvas.drawRect(0.0f, f3, f5, f7, this.f149446e);
        canvas.drawRect(f2 + this.f149445d + 1.0f, f3, f6, f7, this.f149446e);
        canvas.drawRect(0.0f, f7, f6, (float) a, this.f149446e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66474d(Context context, float f, float f2, float f3, float f4) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(301);
        this.f149442a = f2;
        this.f149443b = f4;
        this.f149444c = f;
        this.f149445d = f3;
        MethodCollector.m26664o(301);
    }
}
