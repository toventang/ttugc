package com.bytedance.tux.p1722h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.h.c */
public final class C23154c {
    static {
        Covode.recordClassIndex(27083);
    }

    /* renamed from: a */
    public static final Activity m43640a(Context context) {
        C89219l.m154719c(context, "");
        while (context != null) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (Activity) context;
            }
        }
        return null;
    }
}
