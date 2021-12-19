package com.p2082ss.android.ugc.aweme.tools.draft.viewholder;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78230a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78242m;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.b */
public final class C78443b extends C1445j.AbstractC1447a {

    /* renamed from: a */
    public List<C78230a> f176265a;

    /* renamed from: b */
    public List<C78230a> f176266b;

    static {
        Covode.recordClassIndex(91571);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final int mo3768a() {
        return this.f176265a.size();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final int mo3770b() {
        return this.f176266b.size();
    }

    public C78443b(List<C78230a> list, List<C78230a> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f176265a = list;
        this.f176266b = list2;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final Object mo3769a(int i, int i2) {
        return super.mo3769a(i, i2);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final boolean mo3771b(int i, int i2) {
        return C89219l.m154714a(this.f176265a.get(i), this.f176266b.get(i2));
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: c */
    public final boolean mo3772c(int i, int i2) {
        C78230a aVar = this.f176265a.get(i);
        C78230a aVar2 = this.f176266b.get(i2);
        if (!(aVar instanceof C78242m) || !(aVar2 instanceof C78242m)) {
            return C89219l.m154714a(aVar, aVar2);
        }
        C78242m mVar = (C78242m) aVar;
        C78242m mVar2 = (C78242m) aVar2;
        if (!C89219l.m154714a((Object) mVar.f175707d, (Object) mVar2.f175707d) || mVar.f175709f != mVar2.f175709f || !C89219l.m154714a((Object) mVar.f175711h, (Object) mVar2.f175711h) || !C89219l.m154714a((Object) mVar.f175738i, (Object) mVar2.f175738i)) {
            return false;
        }
        return true;
    }
}
