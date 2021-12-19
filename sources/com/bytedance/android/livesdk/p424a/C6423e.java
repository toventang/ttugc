package com.bytedance.android.livesdk.p424a;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.e */
public final class C6423e {
    static {
        Covode.recordClassIndex(7159);
    }

    /* renamed from: a */
    public static final String m13819a(C3265j jVar, Context context) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(context, "");
        if (jVar.f9352a == -1) {
            String string = context.getString(R.string.ee1);
            C89219l.m154716b(string, "");
            return string;
        } else if (jVar.f9352a < 60) {
            String quantityString = context.getResources().getQuantityString(R.plurals.gd, (int) jVar.f9352a, Integer.valueOf((int) jVar.f9352a));
            C89219l.m154716b(quantityString, "");
            return quantityString;
        } else {
            Resources resources = context.getResources();
            int i = (int) (jVar.f9352a / 60);
            String quantityString2 = resources.getQuantityString(R.plurals.gc, i, Integer.valueOf(i));
            C89219l.m154716b(quantityString2, "");
            return quantityString2;
        }
    }
}
