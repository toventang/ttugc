package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.HollowTextView */
public final class HollowTextView extends TuxTextView {

    /* renamed from: a */
    private final Paint f86036a;

    /* renamed from: b */
    private final PorterDuffXfermode f86037b;

    /* renamed from: e */
    private final RectF f86038e;

    static {
        Covode.recordClassIndex(43671);
    }

    public HollowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        RectF rectF = this.f86038e;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = (float) getWidth();
        rectF.bottom = (float) getHeight();
        canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
        RectF rectF2 = this.f86038e;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        float applyDimension = TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics());
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        canvas.drawRoundRect(rectF2, applyDimension, TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()), this.f86036a);
        TextPaint paint = getPaint();
        C89219l.m154716b(paint, "");
        paint.setXfermode(this.f86037b);
        super.onDraw(canvas);
        canvas.restore();
    }

    private /* synthetic */ HollowTextView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private HollowTextView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        Paint paint = new Paint(1);
        this.f86036a = paint;
        this.f86038e = new RectF();
        paint.setColor(-1);
        this.f86037b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }
}
