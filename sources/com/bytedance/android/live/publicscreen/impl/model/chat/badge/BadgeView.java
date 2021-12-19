package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

public final class BadgeView extends View {

    /* renamed from: a */
    private Collection<? extends AbstractC5996b> f15047a;

    /* renamed from: b */
    private final int f15048b;

    /* renamed from: c */
    private final int f15049c;

    /* renamed from: d */
    private final Paint f15050d;

    /* renamed from: e */
    private int f15051e;

    static {
        Covode.recordClassIndex(6605);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setBadges(Collection<? extends AbstractC5996b> collection) {
        C89219l.m154721d(collection, "");
        this.f15047a = collection;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        List j;
        float f;
        MethodCollector.m26663i(6004);
        super.onDraw(canvas);
        if (canvas == null) {
            MethodCollector.m26664o(6004);
            return;
        }
        Collection<? extends AbstractC5996b> collection = this.f15047a;
        if (collection == null || (j = C89070n.m154590j(collection)) == null) {
            MethodCollector.m26664o(6004);
            return;
        }
        boolean z = true;
        if (C0792v.m2768e(this) != 1) {
            z = false;
        }
        int i = this.f15051e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC5996b bVar = (AbstractC5996b) j.get(i3);
            if (i3 > 0) {
                i2 += this.f15048b;
            }
            canvas.save();
            if (z) {
                f = (((float) getWidth()) - ((float) i2)) - ((float) bVar.mo11891b().mo11887a(this.f15050d));
            } else {
                f = (float) i2;
            }
            canvas.translate(f, 0.0f);
            AbstractC5995a b = bVar.mo11891b();
            Paint paint = this.f15050d;
            C89219l.m154721d(canvas, "");
            C89219l.m154721d(paint, "");
            b.mo11888a(canvas, paint);
            Runnable runnable = b.f15054c;
            if (runnable != null) {
                runnable.run();
            }
            canvas.restore();
            i2 += bVar.mo11891b().mo11887a(this.f15050d);
        }
        MethodCollector.m26664o(6004);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(5865);
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        Collection<? extends AbstractC5996b> collection = this.f15047a;
        int i3 = 0;
        if (collection != null && (!collection.isEmpty())) {
            int i4 = 0;
            int i5 = 0;
            for (T t : collection) {
                int i6 = i4 + 1;
                if (i4 < 0) {
                    C89070n.m154520a();
                }
                i5 += t.mo11891b().mo11887a(this.f15050d);
                if (i4 > 0) {
                    i5 += this.f15048b;
                }
                i4 = i6;
            }
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(i5, size);
                } else {
                    size = i5;
                }
            }
            if (mode2 != 1073741824) {
                size2 = this.f15049c;
            }
            this.f15051e = collection.size();
            Iterator<T> it = collection.iterator();
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                int i9 = i7 + 1;
                if (i7 < 0) {
                    C89070n.m154520a();
                }
                i8 += next.mo11891b().mo11887a(this.f15050d);
                if (i7 > 0) {
                    i8 += this.f15048b;
                }
                if (i8 > size) {
                    this.f15051e = i7;
                    break;
                }
                i7 = i9;
            }
            if (this.f15051e != 0) {
                i3 = size;
                setMeasuredDimension(i3, size2);
                MethodCollector.m26664o(5865);
            }
        }
        size2 = 0;
        setMeasuredDimension(i3, size2);
        MethodCollector.m26664o(5865);
    }

    private /* synthetic */ BadgeView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BadgeView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6153);
        this.f15048b = context.getResources().getDimensionPixelSize(R.dimen.xv);
        this.f15049c = context.getResources().getDimensionPixelSize(R.dimen.xu);
        this.f15050d = new Paint(1);
        MethodCollector.m26664o(6153);
    }
}
