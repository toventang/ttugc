package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1375d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19185e;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.EnumC19189i;
import com.bytedance.ies.xelement.p1364b.C19004g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.d */
public final class C19153d implements AbstractC19185e, AbstractC19187g, AbstractC19192a {

    /* renamed from: b */
    public static final C19154a f45310b = new C19154a((byte) 0);

    /* renamed from: a */
    final CopyOnWriteArrayList<AbstractC19187g> f45311a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(21916);
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.d$a */
    public static final class C19154a {
        static {
            Covode.recordClassIndex(21917);
        }

        private C19154a() {
        }

        public /* synthetic */ C19154a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a
    /* renamed from: a */
    public final void mo30373a() {
        this.f45311a.clear();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19185e
    /* renamed from: b */
    public final void mo30392b(AbstractC19187g gVar) {
        C89219l.m154719c(gVar, "");
        this.f45311a.remove(gVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19185e
    /* renamed from: a */
    public final void mo30382a(AbstractC19187g gVar) {
        C89219l.m154719c(gVar, "");
        if (!this.f45311a.contains(gVar)) {
            this.f45311a.add(gVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g
    /* renamed from: a */
    public final AbstractC19188h mo30497a(AbstractC19188h hVar) {
        Iterator<T> it = this.f45311a.iterator();
        while (it.hasNext()) {
            try {
                hVar = it.next().mo30497a(hVar);
            } catch (Exception e) {
                C19004g.f44970a.mo30157c("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return hVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g
    /* renamed from: a */
    public final EnumC19189i mo30498a(EnumC19189i iVar) {
        C89219l.m154719c(iVar, "");
        Iterator<T> it = this.f45311a.iterator();
        while (it.hasNext()) {
            try {
                iVar = it.next().mo30498a(iVar);
            } catch (Exception e) {
                C19004g.f44970a.mo30157c("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return iVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g
    /* renamed from: a */
    public final AbstractC19186f mo30496a(AbstractC19186f fVar, C19194c cVar) {
        Iterator<T> it = this.f45311a.iterator();
        while (it.hasNext()) {
            try {
                fVar = it.next().mo30496a(fVar, cVar);
            } catch (Exception e) {
                C19004g.f44970a.mo30157c("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return fVar;
    }
}
