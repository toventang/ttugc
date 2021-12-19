package com.p2082ss.android.ugc.aweme.story.avatar;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ext_power_list.C14533l;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.b */
public final class C76503b implements AbstractC14527i<C76503b, C76589r> {

    /* renamed from: a */
    private final C14515a<C76589r> f171789a;

    static {
        Covode.recordClassIndex(89486);
    }

    /* renamed from: a */
    public static C76503b m134090a(C14515a<C76589r> aVar) {
        C89219l.m154721d(aVar, "");
        return new C76503b(aVar);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14526h
    /* renamed from: a */
    public final C14515a<C76589r> mo23367a() {
        return this.f171789a;
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: b */
    public final AbstractC12783f<C14533l> mo23368b() {
        return AbstractC14527i.C14528a.m26536a(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: c */
    public final List<C76589r> mo23369c() {
        return AbstractC14527i.C14528a.m26537b(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: d */
    public final AbstractC12783f<C14533l> mo23370d() {
        return AbstractC14527i.C14528a.m26538c(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: e */
    public final AbstractC12783f<C14533l> mo23371e() {
        return AbstractC14527i.C14528a.m26539d(this);
    }

    public /* synthetic */ C76503b() {
        this(new C14515a(null, null, null, null, 15));
    }

    public final int hashCode() {
        C14515a<C76589r> aVar = this.f171789a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AvatarEntryState(listState=" + this.f171789a + ")";
    }

    private C76503b(C14515a<C76589r> aVar) {
        C89219l.m154721d(aVar, "");
        this.f171789a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76503b) || !C89219l.m154714a(this.f171789a, ((C76503b) obj).f171789a)) {
            return false;
        }
        return true;
    }
}
