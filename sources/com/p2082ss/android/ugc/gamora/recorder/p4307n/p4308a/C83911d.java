package com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.n.a.d */
public final class C83911d extends C1445j.AbstractC1447a {

    /* renamed from: a */
    private final List<C83938b> f187312a;

    /* renamed from: b */
    private final List<C83938b> f187313b;

    static {
        Covode.recordClassIndex(97802);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final int mo3768a() {
        return this.f187312a.size();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final int mo3770b() {
        return this.f187313b.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.n.b> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.n.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public C83911d(List<? extends C83938b> list, List<? extends C83938b> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f187312a = list;
        this.f187313b = list2;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final boolean mo3771b(int i, int i2) {
        if (this.f187312a.get(i).f187373a == this.f187313b.get(i2).f187373a) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: c */
    public final boolean mo3772c(int i, int i2) {
        if (this.f187312a.get(i).f187384l != this.f187313b.get(i2).f187384l || !C89219l.m154714a(this.f187312a.get(i), this.f187313b.get(i2))) {
            return false;
        }
        return true;
    }
}
