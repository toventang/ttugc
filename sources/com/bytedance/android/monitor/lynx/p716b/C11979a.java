package com.bytedance.android.monitor.lynx.p716b;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import java.util.Map;
import java.util.WeakHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.lynx.b.a */
public final class C11979a {

    /* renamed from: a */
    public final Map<LynxView, C11980b> f28672a = new WeakHashMap();

    static {
        Covode.recordClassIndex(13705);
    }

    /* renamed from: a */
    public final C11980b mo19190a(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        return this.f28672a.get(lynxView);
    }
}
