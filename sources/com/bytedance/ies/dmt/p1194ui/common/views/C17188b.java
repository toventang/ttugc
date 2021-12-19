package com.bytedance.ies.dmt.p1194ui.common.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.common.views.b */
public final class C17188b extends ReplacementSpan {

    /* renamed from: a */
    public AbstractC17189a f40969a;

    /* renamed from: com.bytedance.ies.dmt.ui.common.views.b$a */
    public interface AbstractC17189a {
        static {
            Covode.recordClassIndex(19649);
        }

        /* renamed from: a */
        void mo27161a(int i, int i2);
    }

    static {
        Covode.recordClassIndex(19648);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return 0;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        AbstractC17189a aVar = this.f40969a;
        if (aVar != null) {
            aVar.mo27161a((int) f, i3);
        }
    }
}
