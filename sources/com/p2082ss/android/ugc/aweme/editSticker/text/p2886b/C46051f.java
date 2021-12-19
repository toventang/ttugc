package com.p2082ss.android.ugc.aweme.editSticker.text.p2886b;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.b.f */
public final class C46051f {

    /* renamed from: a */
    public static final C46051f f107307a = new C46051f();

    /* renamed from: a */
    public static int m88907a(int i) {
        if (i == -14400333) {
            return -864954;
        }
        if (i == -864954) {
            return -16777216;
        }
        if (i == -469015) {
            return -2988141;
        }
        if (i != -27843) {
            return i != -1 ? -1 : -16777216;
        }
        return -12052986;
    }

    private C46051f() {
    }

    static {
        Covode.recordClassIndex(54586);
    }

    /* renamed from: a */
    public static float m88906a(Context context, float f) {
        C89219l.m154721d(context, "");
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (C84912r.m145930a(context, 4.0f) / TypedValue.applyDimension(2, 28.0f, resources.getDisplayMetrics())) * f;
    }
}
