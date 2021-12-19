package com.bytedance.android.livesdk.widget.roundcorner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class RoundCornerFrameLayout extends FrameLayout implements AbstractC11433a {

    /* renamed from: a */
    private final C11434b f27412a;

    static {
        Covode.recordClassIndex(13089);
    }

    public RoundCornerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.bytedance.android.livesdk.widget.roundcorner.AbstractC11433a
    /* renamed from: a */
    public final void mo18270a(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        super.draw(canvas);
    }

    public final void draw(Canvas canvas) {
        C11435c cVar = this.f27412a.f27413a;
        if (canvas != null) {
            if (cVar.f27414a == 0 && cVar.f27416c == 0 && cVar.f27415b == 0 && cVar.f27417d == 0) {
                cVar.f27423j.mo18270a(canvas);
                return;
            }
            int a = C11435c.m20250a(canvas, cVar.f27418e, cVar.f27421h);
            cVar.f27420g.reset();
            cVar.f27420g.addRoundRect(cVar.f27418e, cVar.f27419f, Path.Direction.CW);
            canvas.drawPath(cVar.f27420g, cVar.f27421h);
            cVar.f27421h.setXfermode(cVar.f27422i);
            C11435c.m20250a(canvas, cVar.f27418e, cVar.f27421h);
            cVar.f27423j.mo18270a(canvas);
            cVar.f27421h.setXfermode(null);
            cVar.f27421h.setColorFilter(null);
            canvas.restoreToCount(a);
        }
    }

    private /* synthetic */ RoundCornerFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RoundCornerFrameLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9998);
        C11434b bVar = new C11434b(this);
        this.f27412a = bVar;
        C89219l.m154721d(context, "");
        C11435c cVar = bVar.f27413a;
        C89219l.m154721d(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.amx, R.attr.an3, R.attr.an4, R.attr.ang, R.attr.anh}, 0, 0);
        C89219l.m154716b(obtainStyledAttributes, "");
        if (obtainStyledAttributes != null) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            cVar.f27414a = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
            cVar.f27415b = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
            cVar.f27416c = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
            cVar.f27417d = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
            cVar.f27419f[0] = (float) cVar.f27414a;
            cVar.f27419f[1] = cVar.f27419f[0];
            cVar.f27419f[2] = (float) cVar.f27416c;
            cVar.f27419f[3] = cVar.f27419f[2];
            cVar.f27419f[4] = (float) cVar.f27417d;
            cVar.f27419f[5] = cVar.f27419f[4];
            cVar.f27419f[6] = (float) cVar.f27415b;
            cVar.f27419f[7] = cVar.f27419f[6];
            obtainStyledAttributes.recycle();
        }
        if (cVar.f27415b > 0 || cVar.f27414a > 0 || cVar.f27416c > 0 || cVar.f27417d > 0) {
            AbstractC11433a aVar = cVar.f27423j;
            ViewGroup viewGroup = (ViewGroup) (!(aVar instanceof ViewGroup) ? null : aVar);
            if (viewGroup != null) {
                viewGroup.setWillNotDraw(false);
                MethodCollector.m26664o(9998);
                return;
            }
        }
        MethodCollector.m26664o(9998);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C11434b bVar = this.f27412a;
        int width = getWidth();
        int height = getHeight();
        C11435c cVar = bVar.f27413a;
        if ((cVar.f27414a != 0 || cVar.f27416c != 0 || cVar.f27417d != 0 || cVar.f27415b != 0) && width != 0 && height != 0) {
            cVar.f27418e.set(0.0f, 0.0f, (float) width, (float) height);
        }
    }
}
