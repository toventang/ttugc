package com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.AbstractC75296b;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.C75297c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.d.a.a */
public abstract class AbstractC75284a implements AbstractC75292d {

    /* renamed from: a */
    public String f169255a;

    /* renamed from: b */
    public Boolean f169256b;

    /* renamed from: c */
    private Object f169257c;

    /* renamed from: d */
    private final AbstractC89172b<AbstractC75296b<?>, C89391z> f169258d;

    static {
        Covode.recordClassIndex(88186);
    }

    /* renamed from: a */
    public abstract boolean mo118623a();

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.AbstractC75292d
    /* renamed from: a */
    public final <T> boolean mo118624a(AbstractC75296b<T> bVar) {
        C89219l.m154721d(bVar, "");
        if (!(!C89219l.m154714a(this.f169257c, bVar)) || !(bVar instanceof C75297c)) {
            this.f169256b = false;
            return false;
        }
        this.f169257c = bVar;
        if (mo118623a()) {
            this.f169256b = true;
            return true;
        }
        this.f169256b = false;
        this.f169255a = ((C75297c) bVar).f169280a.getEffectId();
        AbstractC89172b<AbstractC75296b<?>, C89391z> bVar2 = this.f169258d;
        if (bVar2 == null) {
            return false;
        }
        bVar2.invoke(bVar);
        return true;
    }
}
