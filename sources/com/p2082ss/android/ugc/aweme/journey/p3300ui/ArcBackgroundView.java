package com.p2082ss.android.ugc.aweme.journey.p3300ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.ui.ArcBackgroundView */
public final class ArcBackgroundView extends View {

    /* renamed from: a */
    private int f129885a;

    /* renamed from: b */
    private int f129886b;

    /* renamed from: c */
    private int f129887c;

    /* renamed from: d */
    private Path f129888d;

    /* renamed from: e */
    private int f129889e;

    /* renamed from: f */
    private ShapeDrawable f129890f;

    /* renamed from: g */
    private PathShape f129891g;

    /* renamed from: h */
    private RectF f129892h;

    /* renamed from: i */
    private boolean f129893i;

    static {
        Covode.recordClassIndex(66936);
    }

    public ArcBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(6633);
        C89219l.m154721d(canvas, "");
        super.onDraw(canvas);
        Path path = this.f129888d;
        if (path == null) {
            C89219l.m154715b();
        }
        path.reset();
        Path path2 = this.f129888d;
        if (path2 == null) {
            C89219l.m154715b();
        }
        path2.moveTo(0.0f, 0.0f);
        RectF rectF = this.f129892h;
        if (rectF != null) {
            Path path3 = this.f129888d;
            if (path3 == null) {
                C89219l.m154715b();
            }
            path3.arcTo(rectF, 0.0f, 180.0f);
        }
        Path path4 = this.f129888d;
        if (path4 == null) {
            C89219l.m154715b();
        }
        path4.lineTo(0.0f, (float) this.f129886b);
        Path path5 = this.f129888d;
        if (path5 == null) {
            C89219l.m154715b();
        }
        path5.lineTo((float) this.f129885a, (float) this.f129886b);
        Path path6 = this.f129888d;
        if (path6 == null) {
            C89219l.m154715b();
        }
        path6.lineTo((float) this.f129885a, 0.0f);
        Path path7 = this.f129888d;
        if (path7 == null) {
            C89219l.m154715b();
        }
        path7.close();
        if (this.f129891g == null || this.f129893i) {
            Path path8 = this.f129888d;
            if (path8 == null) {
                C89219l.m154715b();
            }
            this.f129891g = new PathShape(path8, (float) this.f129885a, (float) this.f129886b);
            if (this.f129893i) {
                this.f129893i = false;
            }
        }
        ShapeDrawable shapeDrawable = this.f129890f;
        if (shapeDrawable == null) {
            C89219l.m154715b();
        }
        shapeDrawable.setShape(this.f129891g);
        ShapeDrawable shapeDrawable2 = this.f129890f;
        if (shapeDrawable2 == null) {
            C89219l.m154715b();
        }
        shapeDrawable2.setBounds(0, 0, this.f129885a, this.f129886b);
        ShapeDrawable shapeDrawable3 = this.f129890f;
        if (shapeDrawable3 == null) {
            C89219l.m154715b();
        }
        Paint paint = shapeDrawable3.getPaint();
        C89219l.m154716b(paint, "");
        paint.setColor(this.f129889e);
        ShapeDrawable shapeDrawable4 = this.f129890f;
        if (shapeDrawable4 == null) {
            C89219l.m154715b();
        }
        shapeDrawable4.draw(canvas);
        MethodCollector.m26664o(6633);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(6482);
        super.onMeasure(i, i2);
        this.f129885a = View.MeasureSpec.getSize(i);
        this.f129886b = View.MeasureSpec.getSize(i2);
        this.f129893i = true;
        MethodCollector.m26664o(6482);
    }

    private /* synthetic */ ArcBackgroundView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ArcBackgroundView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6766);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a, R.attr.b});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f129889e = obtainStyledAttributes.getColor(0, this.f129889e);
        this.f129887c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f129888d = new Path();
        obtainStyledAttributes.recycle();
        this.f129890f = new ShapeDrawable();
        int i = this.f129887c;
        this.f129892h = new RectF(0.0f, (float) (-i), (float) (i * 2), (float) i);
        MethodCollector.m26664o(6766);
    }
}
