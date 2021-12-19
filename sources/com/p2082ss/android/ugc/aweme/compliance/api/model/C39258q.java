package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.q */
public final class C39258q {
    @AbstractC27891c(mo46611a = "item_settings")

    /* renamed from: a */
    public final C39246g f92742a;
    @AbstractC27891c(mo46611a = "suggest_settings")

    /* renamed from: b */
    public final C39261t f92743b;
    @AbstractC27891c(mo46611a = "liked_list")

    /* renamed from: c */
    public final C39247h f92744c;
    @AbstractC27891c(mo46611a = "follow_list")

    /* renamed from: d */
    public final C39242c f92745d;
    @AbstractC27891c(mo46611a = "im_settings")

    /* renamed from: e */
    public final C39243d f92746e;
    @AbstractC27891c(mo46611a = "involve_settings")

    /* renamed from: f */
    public final C39245f f92747f;
    @AbstractC27891c(mo46611a = "recommendation")

    /* renamed from: g */
    public final C39260s f92748g;
    @AbstractC27891c(mo46611a = "private_account")

    /* renamed from: h */
    public int f92749h;

    static {
        Covode.recordClassIndex(46916);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39258q)) {
            return false;
        }
        C39258q qVar = (C39258q) obj;
        return C89219l.m154714a(this.f92742a, qVar.f92742a) && C89219l.m154714a(this.f92743b, qVar.f92743b) && C89219l.m154714a(this.f92744c, qVar.f92744c) && C89219l.m154714a(this.f92745d, qVar.f92745d) && C89219l.m154714a(this.f92746e, qVar.f92746e) && C89219l.m154714a(this.f92747f, qVar.f92747f) && C89219l.m154714a(this.f92748g, qVar.f92748g) && this.f92749h == qVar.f92749h;
    }

    public final int hashCode() {
        C39246g gVar = this.f92742a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        C39261t tVar = this.f92743b;
        int hashCode2 = (hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31;
        C39247h hVar = this.f92744c;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        C39242c cVar = this.f92745d;
        int hashCode4 = (hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C39243d dVar = this.f92746e;
        int hashCode5 = (hashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C39245f fVar = this.f92747f;
        int hashCode6 = (hashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C39260s sVar = this.f92748g;
        if (sVar != null) {
            i = sVar.hashCode();
        }
        return ((hashCode6 + i) * 31) + this.f92749h;
    }

    public final String toString() {
        return "PrivacyUserSettings(itemSettings=" + this.f92742a + ", suggestSettings=" + this.f92743b + ", likedList=" + this.f92744c + ", followList=" + this.f92745d + ", imSettings=" + this.f92746e + ", involveSettings=" + this.f92747f + ", recommendation=" + this.f92748g + ", privateAccount=" + this.f92749h + ")";
    }

    public C39258q(C39246g gVar, C39261t tVar, C39247h hVar, C39242c cVar, C39243d dVar, C39245f fVar, C39260s sVar, int i) {
        this.f92742a = gVar;
        this.f92743b = tVar;
        this.f92744c = hVar;
        this.f92745d = cVar;
        this.f92746e = dVar;
        this.f92747f = fVar;
        this.f92748g = sVar;
        this.f92749h = i;
    }

    /* renamed from: a */
    public static /* synthetic */ C39258q m79639a(C39258q qVar, C39246g gVar, C39261t tVar, C39247h hVar, C39242c cVar, C39243d dVar, C39245f fVar, C39260s sVar, int i, int i2) {
        int i3 = i;
        C39260s sVar2 = sVar;
        C39245f fVar2 = fVar;
        C39243d dVar2 = dVar;
        C39246g gVar2 = gVar;
        C39261t tVar2 = tVar;
        C39247h hVar2 = hVar;
        C39242c cVar2 = cVar;
        if ((i2 & 1) != 0) {
            gVar2 = qVar.f92742a;
        }
        if ((i2 & 2) != 0) {
            tVar2 = qVar.f92743b;
        }
        if ((i2 & 4) != 0) {
            hVar2 = qVar.f92744c;
        }
        if ((i2 & 8) != 0) {
            cVar2 = qVar.f92745d;
        }
        if ((i2 & 16) != 0) {
            dVar2 = qVar.f92746e;
        }
        if ((i2 & 32) != 0) {
            fVar2 = qVar.f92747f;
        }
        if ((i2 & 64) != 0) {
            sVar2 = qVar.f92748g;
        }
        if ((i2 & 128) != 0) {
            i3 = qVar.f92749h;
        }
        return new C39258q(gVar2, tVar2, hVar2, cVar2, dVar2, fVar2, sVar2, i3);
    }
}
