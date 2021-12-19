package com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19160e;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19162g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19184d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19185e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b */
public final class C19175b {

    /* renamed from: a */
    public final AbstractC19184d f45325a;

    /* renamed from: b */
    public final AbstractC19160e f45326b;

    /* renamed from: c */
    public final AbstractC19185e f45327c;

    /* renamed from: d */
    public final AbstractC19162g f45328d;

    /* renamed from: e */
    public final AbstractC19158c f45329e;

    /* renamed from: f */
    public final AbstractC19181b f45330f;

    /* renamed from: g */
    public final AbstractC19173b f45331g;

    static {
        Covode.recordClassIndex(21938);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19175b)) {
            return false;
        }
        C19175b bVar = (C19175b) obj;
        return C89219l.m154714a(this.f45325a, bVar.f45325a) && C89219l.m154714a(this.f45326b, bVar.f45326b) && C89219l.m154714a(this.f45327c, bVar.f45327c) && C89219l.m154714a(this.f45328d, bVar.f45328d) && C89219l.m154714a(this.f45329e, bVar.f45329e) && C89219l.m154714a(this.f45330f, bVar.f45330f) && C89219l.m154714a(this.f45331g, bVar.f45331g);
    }

    public final int hashCode() {
        AbstractC19184d dVar = this.f45325a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        AbstractC19160e eVar = this.f45326b;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        AbstractC19185e eVar2 = this.f45327c;
        int hashCode3 = (hashCode2 + (eVar2 != null ? eVar2.hashCode() : 0)) * 31;
        AbstractC19162g gVar = this.f45328d;
        int hashCode4 = (hashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        AbstractC19158c cVar = this.f45329e;
        int hashCode5 = (hashCode4 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        AbstractC19181b bVar = this.f45330f;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        AbstractC19173b bVar2 = this.f45331g;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "AttachInfo(queueListenerRegistry=" + this.f45325a + ", playerListenerRegistry=" + this.f45326b + ", queueOperationInterceptorRegistry=" + this.f45327c + ", playerOperationInterceptorRegistry=" + this.f45328d + ", audioPlayer=" + this.f45329e + ", audioQueue=" + this.f45330f + ", audioPlayerQueueController=" + this.f45331g + ")";
    }

    public C19175b(AbstractC19184d dVar, AbstractC19160e eVar, AbstractC19185e eVar2, AbstractC19162g gVar, AbstractC19158c cVar, AbstractC19181b bVar, AbstractC19173b bVar2) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(eVar2, "");
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        this.f45325a = dVar;
        this.f45326b = eVar;
        this.f45327c = eVar2;
        this.f45328d = gVar;
        this.f45329e = cVar;
        this.f45330f = bVar;
        this.f45331g = bVar2;
    }
}
