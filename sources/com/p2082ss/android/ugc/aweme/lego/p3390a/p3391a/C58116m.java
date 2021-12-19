package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58220d;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.m */
public final class C58116m extends AbstractC58137v {
    static {
        Covode.recordClassIndex(68182);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95597a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public final void mo95599b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v
    /* renamed from: c */
    public final EnumC58151ae mo95603c() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
        for (AbstractC58252n nVar : C58221f.f132578b.mo95689a(EnumC58151ae.MAIN, list)) {
            C58220d dVar = C58221f.f132578b;
            Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
            dVar.mo95695b((AbstractC58264w) nVar);
        }
    }
}
