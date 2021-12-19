package com.airbnb.epoxy;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.airbnb.epoxy.a */
public final class C1892a {

    /* renamed from: a */
    final ArrayList<PoolReference> f5725a = new ArrayList<>(5);

    static {
        Covode.recordClassIndex(2083);
    }

    /* renamed from: a */
    static AbstractC1196i m6074a(Context context) {
        while (!(context instanceof AbstractC1204m)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C89219l.m154709a((Object) context, "");
        }
        return ((AbstractC1204m) context).getLifecycle();
    }
}
