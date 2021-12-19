package com.bytedance.tux.p1719f.p1720a;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22978b;
import com.bytedance.tux.p1708b.C22982f;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1711d.C23011a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.f.a.b */
public final class C23126b extends MetricAffectingSpan {

    /* renamed from: a */
    private Typeface f54734a;

    /* renamed from: b */
    private Float f54735b;

    static {
        Covode.recordClassIndex(27055);
    }

    public C23126b() {
    }

    public /* synthetic */ C23126b(int i) {
        this(i, false);
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            updateMeasureState(textPaint);
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        C89219l.m154719c(textPaint, "");
        Typeface typeface = textPaint.getTypeface();
        Typeface typeface2 = this.f54734a;
        if (typeface2 != null && (!C89219l.m154714a(typeface, typeface2))) {
            textPaint.setTypeface(this.f54734a);
        }
        float textSize = textPaint.getTextSize();
        Float f = this.f54735b;
        if (f != null && (!C89219l.m154711a(textSize, f))) {
            textPaint.setTextSize(f.floatValue());
        }
    }

    public C23126b(Typeface typeface, Float f) {
        this();
        this.f54734a = typeface;
        this.f54735b = f;
    }

    public C23126b(int i, boolean z) {
        this();
        Map<Integer, Object> map;
        C22978b a = C22982f.m43324a((int) R.attr.ap2, i);
        if (!(a == null || (map = a.f54330a) == null)) {
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                if (intValue == C22983g.m43334h().f54332a) {
                    if (!z) {
                        C22983g.m43334h();
                        Object value = entry.getValue();
                        C89219l.m154719c(value, "");
                        float floatValue = ((Number) value).floatValue();
                        Resources system = Resources.getSystem();
                        C89219l.m154709a((Object) system, "");
                        this.f54735b = Float.valueOf(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
                    }
                } else if (intValue == C22983g.m43336j().f54332a) {
                    C22983g.m43336j();
                    Object value2 = entry.getValue();
                    C89219l.m154719c(value2, "");
                    this.f54734a = C23011a.m43398a((String) value2);
                }
            }
        }
    }
}
