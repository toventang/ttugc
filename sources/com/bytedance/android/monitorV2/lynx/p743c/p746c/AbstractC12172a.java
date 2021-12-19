package com.bytedance.android.monitorV2.lynx.p743c.p746c;

import android.view.View;
import com.bytedance.android.monitorV2.p728a.AbstractC12066a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import java.util.Map;
import java.util.WeakHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.c.c.a */
public abstract class AbstractC12172a<C extends AbstractC12066a> implements AbstractC12173b<LynxView, C> {

    /* renamed from: a */
    private final Map<LynxView, C> f29306a = new WeakHashMap();

    static {
        Covode.recordClassIndex(13901);
    }

    /* renamed from: a */
    public C mo19535a(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        C a = mo19537a((View) lynxView);
        this.f29306a.put(lynxView, a);
        return a;
    }

    /* renamed from: b */
    public C mo19536b(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        return this.f29306a.get(lynxView);
    }
}
