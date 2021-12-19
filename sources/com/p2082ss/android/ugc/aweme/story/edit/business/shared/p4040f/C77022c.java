package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.c */
public final class C77022c extends AppCompatImageView {

    /* renamed from: a */
    final float[] f172804a = {0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: b */
    private final RectF f172805b = new RectF();

    /* renamed from: c */
    private float f172806c;

    /* renamed from: d */
    private final Path f172807d = new Path();

    static {
        Covode.recordClassIndex(90021);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public final void setRenderRadius(float f) {
        this.f172806c = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77022c(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            this.f172807d.reset();
            RectF rectF = this.f172805b;
            float[] fArr = this.f172804a;
            rectF.set(fArr[0], fArr[1], ((float) getWidth()) - this.f172804a[2], ((float) getHeight()) - this.f172804a[3]);
            Path path = this.f172807d;
            RectF rectF2 = this.f172805b;
            float f = this.f172806c;
            path.addRoundRect(rectF2, f, f, Path.Direction.CW);
            canvas.clipPath(this.f172807d);
        }
        super.onDraw(canvas);
    }
}
