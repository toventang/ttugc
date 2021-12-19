package com.p2082ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.OmnipotentRoundCornerImgView */
public final class OmnipotentRoundCornerImgView extends SimpleDraweeView {

    /* renamed from: a */
    private final Paint f166499a;

    /* renamed from: b */
    private float f166500b;

    /* renamed from: c */
    private boolean f166501c;

    /* renamed from: d */
    private int f166502d;

    static {
        Covode.recordClassIndex(86889);
    }

    public OmnipotentRoundCornerImgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.facebook.drawee.view.C24262c
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    @Override // com.facebook.drawee.view.C24262c
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f166501c && canvas != null) {
            float f = this.f166500b;
            int intValue = Integer.valueOf(canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31)).intValue();
            this.f166499a.setAntiAlias(true);
            this.f166499a.setColor(this.f166502d);
            RectF rectF = new RectF(0.0f, 0.0f, f, f);
            RectF rectF2 = new RectF(0.0f, ((float) getHeight()) - f, f, (float) getHeight());
            RectF rectF3 = new RectF(((float) getWidth()) - f, 0.0f, (float) getWidth(), f);
            RectF rectF4 = new RectF(((float) getWidth()) - f, ((float) getHeight()) - f, (float) getWidth(), (float) getHeight());
            canvas.drawRect(rectF, this.f166499a);
            canvas.drawRect(rectF2, this.f166499a);
            canvas.drawRect(rectF3, this.f166499a);
            canvas.drawRect(rectF4, this.f166499a);
            this.f166499a.setColor(0);
            this.f166499a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawCircle(f, f, f, this.f166499a);
            canvas.drawCircle(f, ((float) getHeight()) - f, f, this.f166499a);
            canvas.drawCircle(((float) getWidth()) - f, f, f, this.f166499a);
            canvas.drawCircle(((float) getWidth()) - f, ((float) getHeight()) - f, f, this.f166499a);
            this.f166499a.setXfermode(null);
            canvas.restoreToCount(intValue);
        }
    }

    private /* synthetic */ OmnipotentRoundCornerImgView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private OmnipotentRoundCornerImgView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f166499a = new Paint();
        this.f166502d = -1;
    }
}
