package com.bytedance.ies.bullet.p1129c.p1132c;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.t */
public final class C16232t implements AbstractC16215n {

    /* renamed from: a */
    private final Map<Class<? extends AbstractC16203d<?, ?, ?, ?>>, AbstractC16208i> f39024a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(18525);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        Map<Class<? extends AbstractC16203d<?, ?, ?, ?>>, AbstractC16208i> map = this.f39024a;
        for (Map.Entry<Class<? extends AbstractC16203d<?, ?, ?, ?>>, AbstractC16208i> entry : map.entrySet()) {
            entry.getValue().mo25766a((Throwable) null);
        }
        map.clear();
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final <T extends AbstractC16203d<?, ?, ?, ?>> AbstractC16208i mo25682a(Class<? extends T> cls) {
        C89219l.m154719c(cls, "");
        return this.f39024a.get(cls);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final AbstractC16208i mo25683a(String str) {
        C89219l.m154719c(str, "");
        for (Map.Entry<Class<? extends AbstractC16203d<?, ?, ?, ?>>, AbstractC16208i> entry : this.f39024a.entrySet()) {
            if (C89219l.m154714a((Object) entry.getValue().mo25762a().f39033a, (Object) str)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16215n
    /* renamed from: a */
    public final <T extends AbstractC16203d<?, ?, ?, ?>> void mo25788a(Class<? extends T> cls, AbstractC16208i iVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(iVar, "");
        this.f39024a.put(cls, iVar);
    }
}
