package com.p2082ss.android.ugc.aweme.social.widget.card.permission;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.b */
public final class C74807b extends C74808c {

    /* renamed from: b */
    private final EnumC74754a f168130b;

    static {
        Covode.recordClassIndex(87661);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74808c
    /* renamed from: a */
    public final EnumC74754a mo117859a() {
        return this.f168130b;
    }

    public final int hashCode() {
        EnumC74754a aVar = this.f168130b;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FacebookItem(variant=" + this.f168130b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74807b(EnumC74754a aVar) {
        super(EnumC74761f.FACEBOOK, aVar);
        C89219l.m154721d(aVar, "");
        this.f168130b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74807b) || !C89219l.m154714a(this.f168130b, ((C74807b) obj).f168130b)) {
            return false;
        }
        return true;
    }
}
