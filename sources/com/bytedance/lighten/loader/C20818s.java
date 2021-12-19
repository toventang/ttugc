package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1835g.AbstractC24106c;
import com.facebook.common.p1835g.AbstractC24107d;
import com.facebook.common.p1835g.EnumC24105b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.lighten.loader.s */
public final class C20818s implements AbstractC24107d {

    /* renamed from: a */
    private CopyOnWriteArraySet<AbstractC24106c> f49248a;

    static {
        Covode.recordClassIndex(24394);
    }

    /* renamed from: com.bytedance.lighten.loader.s$a */
    public static class C20819a {

        /* renamed from: a */
        public static C20818s f49249a = new C20818s((byte) 0);

        static {
            Covode.recordClassIndex(24395);
        }
    }

    private C20818s() {
        this.f49248a = new CopyOnWriteArraySet<>();
    }

    /* synthetic */ C20818s(byte b) {
        this();
    }

    @Override // com.facebook.common.p1835g.AbstractC24107d
    /* renamed from: a */
    public final void mo34255a(AbstractC24106c cVar) {
        this.f49248a.add(cVar);
    }

    /* renamed from: a */
    public final void mo34254a(EnumC24105b bVar) {
        this.f49248a.size();
        try {
            Iterator<AbstractC24106c> it = this.f49248a.iterator();
            while (it.hasNext()) {
                it.next().mo39663a(bVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
