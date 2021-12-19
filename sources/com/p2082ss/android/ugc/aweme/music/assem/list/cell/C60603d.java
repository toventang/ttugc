package com.p2082ss.android.ugc.aweme.music.assem.list.cell;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.d */
public final class C60603d implements AbstractC17641a {

    /* renamed from: a */
    public final MusicModel f137817a;

    /* renamed from: b */
    public final EnumC60605f f137818b;

    static {
        Covode.recordClassIndex(71157);
    }

    public final String toString() {
        return "MusicItem(model=" + this.f137817a + ", pinStatus=" + this.f137818b + ")";
    }

    public final int hashCode() {
        return this.f137817a.getMusicId().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C60603d) {
            return C89219l.m154714a((Object) ((C60603d) obj).f137817a.getMusicId(), (Object) this.f137817a.getMusicId());
        }
        return super.equals(obj);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (!(aVar instanceof C60603d)) {
            return aVar.equals(this);
        }
        C60603d dVar = (C60603d) aVar;
        if (C89219l.m154714a((Object) dVar.f137817a.getMusicId(), (Object) this.f137817a.getMusicId()) && dVar.f137818b == this.f137818b && dVar.f137817a.getCollectionType() == this.f137817a.getCollectionType()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar instanceof C60603d) {
            return C89219l.m154714a((Object) ((C60603d) aVar).f137817a.getMusicId(), (Object) this.f137817a.getMusicId());
        }
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        boolean z;
        C89219l.m154721d(aVar, "");
        if (!(aVar instanceof C60603d)) {
            return null;
        }
        C60603d dVar = (C60603d) aVar;
        if (dVar.f137818b == this.f137818b && dVar.f137817a.getCollectionType() == this.f137817a.getCollectionType()) {
            return null;
        }
        boolean z2 = true;
        if (dVar.f137818b != this.f137818b) {
            z = true;
        } else {
            z = false;
        }
        if (dVar.f137817a.getCollectionType() == this.f137817a.getCollectionType()) {
            z2 = false;
        }
        return new C60604e(z, z2);
    }

    public C60603d(MusicModel musicModel, EnumC60605f fVar) {
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(fVar, "");
        this.f137817a = musicModel;
        this.f137818b = fVar;
    }
}
