package com.bytedance.tux.p1719f;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22978b;
import com.bytedance.tux.p1708b.C22982f;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1711d.C23011a;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.p1719f.p1720a.C23129d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.f.d */
public final class C23142d extends SpannableString {
    static {
        Covode.recordClassIndex(27071);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23142d(CharSequence charSequence) {
        super(charSequence == null ? "" : charSequence);
    }

    /* renamed from: a */
    public final void mo37629a(Object obj) {
        setSpan(obj, 0, length(), 17);
    }

    /* renamed from: a */
    public final void mo37628a(int i) {
        C22978b a;
        Map<Integer, Object> map;
        if (!(length() == 0 || (a = C22982f.m43324a((int) R.attr.ap2, i)) == null || (map = a.f54330a) == null)) {
            Typeface typeface = null;
            Float f = null;
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                if (intValue == C22983g.m43337k().f54332a) {
                    C22983g.m43337k();
                    Object value = entry.getValue();
                    C89219l.m154719c(value, "");
                    mo37629a(new C23129d(((Number) value).intValue()));
                } else if (intValue == C22983g.m43334h().f54332a) {
                    C22983g.m43334h();
                    Object value2 = entry.getValue();
                    C89219l.m154719c(value2, "");
                    float floatValue = ((Number) value2).floatValue();
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    f = Float.valueOf(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
                } else if (intValue == C22983g.m43336j().f54332a) {
                    C22983g.m43336j();
                    Object value3 = entry.getValue();
                    C89219l.m154719c(value3, "");
                    typeface = C23011a.m43398a((String) value3);
                }
            }
            if (!(typeface == null && f == null)) {
                mo37629a(new C23126b(typeface, f));
            }
        }
    }
}
