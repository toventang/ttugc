package com.p2082ss.android.ugc.aweme.comment.barrage.p2487b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.b.g */
public final class C36313g extends C36315i {

    /* renamed from: a */
    public final int f85840a;

    /* renamed from: b */
    public final int f85841b;

    /* renamed from: c */
    public DataCenter f85842c;

    static {
        Covode.recordClassIndex(43590);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a, com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36315i
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        return aVar instanceof C36313g;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a, com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36315i
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (!(aVar instanceof C36313g) || ((C36313g) aVar).f85840a != this.f85840a) {
            return false;
        }
        return true;
    }

    public C36313g(int i, int i2, DataCenter dataCenter) {
        this.f85840a = i;
        this.f85841b = i2;
        this.f85842c = dataCenter;
    }
}
