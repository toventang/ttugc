package com.bytedance.tux.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.widget.a */
public final class C23407a extends ShapeDrawable {

    /* renamed from: a */
    public final RoundRectShape f55497a;

    /* renamed from: b */
    public final AbstractC23408a f55498b;

    /* renamed from: c */
    public final ColorDrawable f55499c;

    /* renamed from: com.bytedance.tux.widget.a$a */
    public interface AbstractC23408a {
        static {
            Covode.recordClassIndex(27367);
        }

        /* renamed from: a */
        boolean mo38140a();

        /* renamed from: b */
        float[] mo38141b();
    }

    static {
        Covode.recordClassIndex(27366);
    }

    public final void draw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        if (!this.f55498b.mo38140a()) {
            this.f55499c.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public C23407a(AbstractC23408a aVar, ColorDrawable colorDrawable) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(colorDrawable, "");
        this.f55498b = aVar;
        this.f55499c = colorDrawable;
        RoundRectShape roundRectShape = new RoundRectShape(aVar.mo38141b(), null, null);
        this.f55497a = roundRectShape;
        setShape(roundRectShape);
        Paint paint = getPaint();
        C89219l.m154709a((Object) paint, "");
        paint.setColor(colorDrawable.getColor());
    }
}
