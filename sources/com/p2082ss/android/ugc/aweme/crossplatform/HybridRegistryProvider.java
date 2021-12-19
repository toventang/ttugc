package com.p2082ss.android.ugc.aweme.crossplatform;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.web.AbstractC81548i;
import com.p2082ss.android.ugc.aweme.web.C81531b;
import com.p2082ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.HybridRegistryProvider */
public class HybridRegistryProvider implements IHybridRegistryProvider {
    static {
        Covode.recordClassIndex(48330);
    }

    /* renamed from: a */
    public static IHybridRegistryProvider m81713a() {
        Object a = C81908b.m141854a(IHybridRegistryProvider.class, false);
        if (a != null) {
            return (IHybridRegistryProvider) a;
        }
        return new HybridRegistryProvider();
    }

    @Override // com.p2082ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider
    /* renamed from: a */
    public final AbstractC81548i mo69604a(Context context) {
        return new C81531b(context);
    }
}
