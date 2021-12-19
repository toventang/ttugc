package com.p2082ss.android.ugc.aweme.p2432c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.c.b */
public final class C35335b extends AbstractC35338e {

    /* renamed from: a */
    public final String f83365a;

    /* renamed from: b */
    public final long f83366b;

    /* renamed from: c */
    public final long f83367c;

    static {
        Covode.recordClassIndex(42503);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2432c.AbstractC35338e
    /* renamed from: a */
    public final boolean mo62216a(AbstractC35338e eVar) {
        C89219l.m154721d(eVar, "");
        if (C89219l.m154714a(eVar, this)) {
            return true;
        }
        if (!(eVar instanceof C35335b)) {
            return false;
        }
        C35335b bVar = (C35335b) eVar;
        if (!(!C89219l.m154714a((Object) this.f83365a, (Object) bVar.f83365a)) && this.f83366b == bVar.f83366b && this.f83367c == bVar.f83367c) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35335b(String str, long j, long j2) {
        super((byte) 0);
        C89219l.m154721d(str, "");
        this.f83365a = str;
        this.f83366b = j;
        this.f83367c = j2;
    }
}
