package com.p2082ss.android.ugc.aweme.sticker.panel.p3971a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.a.d */
public final class C75476d implements AbstractC75474b {

    /* renamed from: a */
    private boolean f169592a = true;

    /* renamed from: b */
    private final Map<Class<? extends AbstractC75473a>, AbstractC75473a> f169593b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(88398);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.Class<? extends com.ss.android.ugc.aweme.sticker.panel.a.a>, com.ss.android.ugc.aweme.sticker.panel.a.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75474b
    /* renamed from: a */
    public final void mo119150a(AbstractC75473a aVar) {
        C89219l.m154721d(aVar, "");
        this.f169593b.put(aVar.getClass(), aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75473a
    /* renamed from: a */
    public final boolean mo119149a(Effect effect, int i, int i2) {
        C89219l.m154721d(effect, "");
        if (this.f169592a && !C75466g.m132349b(effect) && !C75466g.m132368t(effect)) {
            Map<Class<? extends AbstractC75473a>, AbstractC75473a> map = this.f169593b;
            if (!map.isEmpty()) {
                for (Map.Entry<Class<? extends AbstractC75473a>, AbstractC75473a> entry : map.entrySet()) {
                    if (entry.getValue().mo119149a(effect, i, i2)) {
                        this.f169592a = false;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
