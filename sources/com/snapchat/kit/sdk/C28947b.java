package com.snapchat.kit.sdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.snapchat.kit.sdk.creative.C29042a;
import com.snapchat.kit.sdk.creative.CreativeComponent;
import com.snapchat.kit.sdk.creative.api.C29048a;
import com.snapchat.kit.sdk.creative.p2073c.C29054b;
import dagger.p4535a.C88081f;

/* renamed from: com.snapchat.kit.sdk.b */
public final class C28947b {

    /* renamed from: a */
    static CreativeComponent f68392a;

    static {
        Covode.recordClassIndex(35131);
    }

    /* renamed from: a */
    public static C29048a m57967a(Context context) {
        return m57969c(context).getApi();
    }

    /* renamed from: b */
    public static C29054b m57968b(Context context) {
        return m57969c(context).getMediaFactory();
    }

    /* renamed from: c */
    private static synchronized CreativeComponent m57969c(Context context) {
        CreativeComponent creativeComponent;
        synchronized (C28947b.class) {
            MethodCollector.m26663i(2668);
            if (f68392a == null) {
                C29042a.C29043a aVar = new C29042a.C29043a((byte) 0);
                aVar.f68613a = (SnapKitComponent) C88081f.m153152a(C28951c.m57973a(context));
                if (aVar.f68613a != null) {
                    f68392a = new C29042a(aVar, (byte) 0);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(SnapKitComponent.class.getCanonicalName() + " must be set");
                    MethodCollector.m26664o(2668);
                    throw illegalStateException;
                }
            }
            creativeComponent = f68392a;
            MethodCollector.m26664o(2668);
        }
        return creativeComponent;
    }
}
