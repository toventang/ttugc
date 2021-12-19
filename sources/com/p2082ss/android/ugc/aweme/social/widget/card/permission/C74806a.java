package com.p2082ss.android.ugc.aweme.social.widget.card.permission;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.a */
public final class C74806a extends C74808c {

    /* renamed from: b */
    private final EnumC74754a f168129b;

    static {
        Covode.recordClassIndex(87660);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74808c
    /* renamed from: a */
    public final EnumC74754a mo117859a() {
        return this.f168129b;
    }

    public final int hashCode() {
        EnumC74754a aVar = this.f168129b;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ContactItem(variant=" + this.f168129b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74806a(EnumC74754a aVar) {
        super(EnumC74761f.CONTACT, aVar);
        C89219l.m154721d(aVar, "");
        this.f168129b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74806a) || !C89219l.m154714a(this.f168129b, ((C74806a) obj).f168129b)) {
            return false;
        }
        return true;
    }
}
