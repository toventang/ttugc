package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.C20379aq;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.b */
public final class C62514b implements AbstractC12853j {

    /* renamed from: a */
    public final String f141793a;

    /* renamed from: b */
    public final AbstractC20362a<Boolean> f141794b;

    /* renamed from: c */
    public final int f141795c;

    /* renamed from: d */
    public final C62516d f141796d;

    /* renamed from: e */
    public final C62516d f141797e;

    static {
        Covode.recordClassIndex(73310);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62514b)) {
            return false;
        }
        C62514b bVar = (C62514b) obj;
        return C89219l.m154714a(this.f141793a, bVar.f141793a) && C89219l.m154714a(this.f141794b, bVar.f141794b) && this.f141795c == bVar.f141795c && C89219l.m154714a(this.f141796d, bVar.f141796d) && C89219l.m154714a(this.f141797e, bVar.f141797e);
    }

    public final int hashCode() {
        String str = this.f141793a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC20362a<Boolean> aVar = this.f141794b;
        int hashCode2 = (((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f141795c) * 31;
        C62516d dVar = this.f141796d;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C62516d dVar2 = this.f141797e;
        if (dVar2 != null) {
            i = dVar2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "GameResponseState(statusMsg=" + this.f141793a + ", open=" + this.f141794b + ", statusCode=" + this.f141795c + ", cacheEvent=" + this.f141796d + ", networkEvent=" + this.f141797e + ")";
    }

    public /* synthetic */ C62514b() {
        this("", C20379aq.f48273a, -1, null, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C62514b m112954a(C62514b bVar, AbstractC20362a aVar, int i, C62516d dVar) {
        String str = bVar.f141793a;
        C62516d dVar2 = bVar.f141796d;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        return new C62514b(str, aVar, i, dVar2, dVar);
    }

    private C62514b(String str, AbstractC20362a<Boolean> aVar, int i, C62516d dVar, C62516d dVar2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.f141793a = str;
        this.f141794b = aVar;
        this.f141795c = i;
        this.f141796d = dVar;
        this.f141797e = dVar2;
    }
}
