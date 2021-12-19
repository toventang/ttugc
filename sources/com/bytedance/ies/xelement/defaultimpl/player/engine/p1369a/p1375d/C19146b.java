package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1375d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19180a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.EnumC19189i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1375d.p1376a.C19142b;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.b */
public final class C19146b {

    /* renamed from: c */
    public static final C19147a f45298c = new C19147a((byte) 0);

    /* renamed from: f */
    private static final EnumC19189i f45299f = EnumC19189i.SEQUENCE;

    /* renamed from: g */
    private static final AbstractC19180a f45300g = C19142b.m35683a(EnumC19189i.SEQUENCE);

    /* renamed from: a */
    public AbstractC19188h f45301a;

    /* renamed from: b */
    public EnumC19189i f45302b = f45299f;

    /* renamed from: d */
    private AbstractC19180a f45303d = f45300g;

    /* renamed from: e */
    private final AbstractC19183c f45304e;

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.b$a */
    public static final class C19147a {
        static {
            Covode.recordClassIndex(21910);
        }

        private C19147a() {
        }

        public /* synthetic */ C19147a(byte b) {
            this();
        }
    }

    /* renamed from: f */
    public final void mo30515f() {
        this.f45301a = null;
        this.f45303d = null;
    }

    /* renamed from: a */
    public final boolean mo30510a() {
        if (mo30513d() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo30511b() {
        if (mo30514e() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final AbstractC19186f mo30512c() {
        AbstractC19180a aVar = this.f45303d;
        if (aVar != null) {
            return aVar.mo30505b(this.f45301a);
        }
        return null;
    }

    /* renamed from: d */
    public final AbstractC19186f mo30513d() {
        AbstractC19180a aVar = this.f45303d;
        if (aVar != null) {
            return aVar.mo30506c(this.f45301a);
        }
        return null;
    }

    /* renamed from: e */
    public final AbstractC19186f mo30514e() {
        AbstractC19180a aVar = this.f45303d;
        if (aVar != null) {
            return aVar.mo30504a(this.f45301a);
        }
        return null;
    }

    static {
        Covode.recordClassIndex(21909);
    }

    public C19146b(AbstractC19183c cVar) {
        C89219l.m154719c(cVar, "");
        this.f45304e = cVar;
    }

    /* renamed from: a */
    public final void mo30508a(AbstractC19188h hVar) {
        AbstractC19186f fVar;
        List<AbstractC19186f> b;
        this.f45301a = hVar;
        this.f45304e.mo30500a_(hVar);
        if (hVar == null || (b = hVar.mo30539b()) == null) {
            fVar = null;
        } else {
            fVar = (AbstractC19186f) C89070n.m154561b((List) b, hVar.mo30540c());
        }
        mo30507a(fVar);
    }

    /* renamed from: a */
    public final void mo30507a(AbstractC19186f fVar) {
        String str;
        AbstractC19188h hVar = this.f45301a;
        if (hVar != null) {
            int i = -1;
            List<AbstractC19186f> b = hVar.mo30539b();
            if (b != null) {
                int i2 = 0;
                Iterator<AbstractC19186f> it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String id = it.next().getId();
                    if (fVar != null) {
                        str = fVar.getId();
                    } else {
                        str = null;
                    }
                    if (C89219l.m154714a((Object) id, (Object) str)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            hVar.mo30538a(i);
        }
        this.f45304e.mo30499a(fVar);
    }

    /* renamed from: a */
    public final void mo30509a(EnumC19189i iVar) {
        C89219l.m154719c(iVar, "");
        this.f45302b = iVar;
        this.f45303d = C19142b.m35683a(iVar);
        this.f45304e.mo30501a_(iVar);
    }
}
