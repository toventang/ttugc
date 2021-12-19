package com.p2082ss.android.ugc.aweme.search.p3696l;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.n */
public final class C67644n {
    static {
        Covode.recordClassIndex(79283);
    }

    /* renamed from: a */
    public static final AbstractC40912d m119788a(Context context) {
        C89219l.m154721d(context, "");
        if (context instanceof AbstractC40912d) {
            return (AbstractC40912d) context;
        }
        if (!(context instanceof MutableContextWrapper)) {
            return null;
        }
        MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context;
        if (!(mutableContextWrapper.getBaseContext() instanceof AbstractC40912d)) {
            return null;
        }
        Context baseContext = mutableContextWrapper.getBaseContext();
        Objects.requireNonNull(baseContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
        return (AbstractC40912d) baseContext;
    }
}
