package com.bytedance.android.monitor.lynx.p717c.p719b;

import android.view.View;
import com.bytedance.android.monitor.p704b.AbstractC11907a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import java.util.Map;
import java.util.WeakHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.lynx.c.b.a */
public abstract class AbstractC11992a<C extends AbstractC11907a> implements AbstractC11993b<LynxView, C> {

    /* renamed from: a */
    private final Map<LynxView, C> f28741a = new WeakHashMap();

    static {
        Covode.recordClassIndex(13718);
    }

    /* renamed from: a */
    public C mo19193a(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        C a = mo19195a((View) lynxView);
        this.f28741a.put(lynxView, a);
        return a;
    }

    /* renamed from: b */
    public C mo19194b(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        return this.f28741a.get(lynxView);
    }
}
