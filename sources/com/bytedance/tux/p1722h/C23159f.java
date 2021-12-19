package com.bytedance.tux.p1722h;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.h.f */
public final class C23159f {
    static {
        Covode.recordClassIndex(27088);
    }

    /* renamed from: a */
    public static final float m43648a(Number number) {
        C89219l.m154719c(number, "");
        float floatValue = number.floatValue();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics());
    }

    /* renamed from: b */
    public static final int m43650b(Number number) {
        C89219l.m154719c(number, "");
        float floatValue = number.floatValue();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return C89241a.m154730a(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
    }

    /* renamed from: a */
    public static final int m43649a(Context context) {
        C89219l.m154719c(context, "");
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }
}
