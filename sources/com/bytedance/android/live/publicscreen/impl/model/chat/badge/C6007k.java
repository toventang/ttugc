package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.android.live.design.widget.C4128c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.k */
public final class C6007k extends AbstractC5995a {

    /* renamed from: e */
    public int f15071e = -16777216;

    /* renamed from: f */
    public int f15072f;

    /* renamed from: g */
    public int f15073g;

    /* renamed from: h */
    public String f15074h = "";

    /* renamed from: i */
    public int f15075i = -16777216;

    /* renamed from: j */
    public int f15076j;

    /* renamed from: k */
    public int f15077k = 8;

    /* renamed from: l */
    public int f15078l = 400;

    /* renamed from: m */
    private final RectF f15079m = new RectF();

    static {
        Covode.recordClassIndex(6618);
    }

    /* renamed from: a */
    public final void mo11897a(String str) {
        C89219l.m154721d(str, "");
        this.f15074h = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6007k(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5995a
    /* renamed from: b */
    public final int mo11889b(Paint paint) {
        C89219l.m154721d(paint, "");
        C4128c.m10030a(this.f15055d, paint, this.f15077k, this.f15078l);
        return ((int) paint.measureText(this.f15074h)) + (this.f15073g * 2) + this.f15076j;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5995a
    /* renamed from: a */
    public final void mo11888a(Canvas canvas, Paint paint) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(paint, "");
        paint.setAntiAlias(true);
        this.f15079m.bottom = (float) this.f15053b;
        this.f15079m.right = (float) this.f15052a;
        paint.setColor(this.f15071e);
        RectF rectF = this.f15079m;
        int i = this.f15072f;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        C4128c.m10030a(this.f15055d, paint, this.f15077k, this.f15078l);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        paint.setColor(this.f15075i);
        canvas.drawText(this.f15074h, (float) this.f15073g, ((float) ((this.f15053b - fontMetricsInt.bottom) - fontMetricsInt.top)) / 2.0f, paint);
    }
}
