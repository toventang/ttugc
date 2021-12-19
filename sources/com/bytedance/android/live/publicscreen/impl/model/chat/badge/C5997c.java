package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.c */
public final class C5997c extends AbstractC5995a {

    /* renamed from: e */
    public final Bitmap f15058e;

    /* renamed from: f */
    private final Rect f15059f = new Rect();

    static {
        Covode.recordClassIndex(6608);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5995a
    /* renamed from: b */
    public final int mo11889b(Paint paint) {
        C89219l.m154721d(paint, "");
        int width = (this.f15053b * this.f15058e.getWidth()) / this.f15058e.getHeight();
        this.f15059f.right = width;
        this.f15059f.bottom = this.f15053b;
        return width;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5997c(Context context, Bitmap bitmap) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(bitmap, "");
        this.f15058e = bitmap;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5995a
    /* renamed from: a */
    public final void mo11888a(Canvas canvas, Paint paint) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(paint, "");
        if (!this.f15058e.isRecycled()) {
            canvas.drawBitmap(this.f15058e, (Rect) null, this.f15059f, (Paint) null);
        }
    }
}
