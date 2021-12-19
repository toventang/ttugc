package com.p2082ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.b */
public final class C79005b {

    /* renamed from: a */
    public static final C79005b f177544a = new C79005b();

    /* renamed from: b */
    private static int f177545b;

    private C79005b() {
    }

    static {
        Covode.recordClassIndex(92165);
    }

    /* renamed from: a */
    public static int m137829a(Context context) {
        C89219l.m154721d(context, "");
        if (f177545b <= 0) {
            f177545b = (int) (context.getResources().getDimension(R.dimen.e0) + 0.5f);
        }
        return f177545b;
    }
}
