package com.bytedance.android.live.publicscreen.impl.p399e;

import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.d */
public final class C5946d {

    /* renamed from: a */
    long f14865a;

    /* renamed from: b */
    final ArrayList<AbstractC5944b> f14866b = new ArrayList<>();

    /* renamed from: c */
    private long f14867c;

    /* renamed from: d */
    private long f14868d;

    static {
        Covode.recordClassIndex(6554);
    }

    /* renamed from: a */
    public final void mo11809a() {
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11798c();
        }
    }

    /* renamed from: a */
    public final void mo11812a(AbstractC5944b bVar) {
        C89219l.m154721d(bVar, "");
        this.f14866b.add(bVar);
    }

    /* renamed from: b */
    public final void mo11814b(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11796b(hVar);
        }
    }

    /* renamed from: c */
    public final void mo11815c(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11799c(hVar);
        }
    }

    /* renamed from: d */
    public final void mo11816d(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11802d(hVar);
        }
    }

    /* renamed from: e */
    public final void mo11817e(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11803e(hVar);
        }
    }

    /* renamed from: f */
    public final void mo11818f(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11804f(hVar);
        }
    }

    /* renamed from: g */
    public final void mo11819g(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11805g(hVar);
        }
    }

    /* renamed from: h */
    public final void mo11820h(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11806h(hVar);
        }
    }

    /* renamed from: i */
    public final void mo11821i(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11807i(hVar);
        }
    }

    /* renamed from: j */
    public final void mo11822j(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            long j = this.f14868d;
            this.f14868d = 1 + j;
            it.next().mo11800c(hVar, j);
        }
    }

    /* renamed from: a */
    public final void mo11811a(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            long j = this.f14867c;
            this.f14867c = 1 + j;
            it.next().mo11797b(hVar, j);
        }
    }

    /* renamed from: a */
    public final void mo11813a(AbstractC6571a aVar) {
        C89219l.m154721d(aVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11794a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo11810a(AbstractC5859b<? extends IMessage> bVar, AbstractC6571a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        Iterator<AbstractC5944b> it = this.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11791a(bVar, aVar);
        }
    }
}
