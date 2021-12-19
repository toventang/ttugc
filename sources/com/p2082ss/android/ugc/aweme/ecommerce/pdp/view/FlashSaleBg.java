package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.FlashSaleBg */
public final class FlashSaleBg extends FrameLayout {

    /* renamed from: a */
    private Bitmap f104956a;

    /* renamed from: b */
    private Bitmap f104957b;

    /* renamed from: c */
    private Paint f104958c;

    static {
        Covode.recordClassIndex(53409);
    }

    public FlashSaleBg(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public FlashSaleBg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setFlashSaleBg(Bitmap bitmap) {
        C89219l.m154721d(bitmap, "");
        this.f104956a = bitmap;
        if (this.f104957b == null && getWidth() > 0 && getHeight() > 0) {
            m87669a(bitmap);
        }
        invalidate();
    }

    /* renamed from: a */
    private final void m87669a(Bitmap bitmap) {
        MethodCollector.m26663i(7418);
        float width = ((float) bitmap.getWidth()) / (((float) bitmap.getHeight()) / ((float) getHeight()));
        if (this.f104957b == null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) width, getHeight(), true);
            if (C80471gb.m139482a()) {
                C89219l.m154716b(createScaledBitmap, "");
                int width2 = createScaledBitmap.getWidth();
                int height = createScaledBitmap.getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale(-1.0f, 1.0f);
                createScaledBitmap = Bitmap.createBitmap(createScaledBitmap, 0, 0, width2, height, matrix, true);
            }
            this.f104957b = createScaledBitmap;
        }
        MethodCollector.m26664o(7418);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(7426);
        try {
            Bitmap bitmap = this.f104956a;
            if (bitmap != null) {
                this.f104958c.setColor(bitmap.getPixel(bitmap.getWidth() - 1, bitmap.getHeight() - 1));
                m87669a(bitmap);
            }
            Context context = getContext();
            C89219l.m154716b(context, "");
            if (C23163i.m43663a(context)) {
                if (canvas != null) {
                    Bitmap bitmap2 = this.f104957b;
                    if (bitmap2 == null) {
                        C89219l.m154715b();
                    }
                    int width = getWidth();
                    Bitmap bitmap3 = this.f104957b;
                    if (bitmap3 == null) {
                        C89219l.m154715b();
                    }
                    canvas.drawBitmap(bitmap2, (float) (width - bitmap3.getWidth()), 0.0f, this.f104958c);
                    canvas.drawRect(0.0f, 0.0f, ((float) getWidth()) - 100.0f, (float) getHeight(), this.f104958c);
                }
            } else if (canvas != null) {
                Bitmap bitmap4 = this.f104957b;
                if (bitmap4 == null) {
                    C89219l.m154715b();
                }
                canvas.drawBitmap(bitmap4, 0.0f, 0.0f, this.f104958c);
                canvas.drawRect(100.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f104958c);
            }
        } catch (Exception unused) {
        }
        super.onDraw(canvas);
        MethodCollector.m26664o(7426);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FlashSaleBg(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6944);
        this.f104958c = new Paint();
        setWillNotDraw(false);
        MethodCollector.m26664o(6944);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ FlashSaleBg(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
