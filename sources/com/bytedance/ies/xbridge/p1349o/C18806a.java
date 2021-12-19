package com.bytedance.ies.xbridge.p1349o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.xbridge.o.a */
public final class C18806a {

    /* renamed from: a */
    public static final C18806a f44594a = new C18806a();

    private C18806a() {
    }

    static {
        Covode.recordClassIndex(21502);
    }

    /* renamed from: a */
    public static Activity m34902a(Context context) {
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
