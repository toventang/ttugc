package com.bytedance.assem.arch.p795b;

import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.b.b */
public final class C12651b {

    /* renamed from: a */
    public final EnumC12650a f30811a;

    /* renamed from: b */
    public final AbstractC12693u<? extends AbstractC22876d> f30812b;

    static {
        Covode.recordClassIndex(14471);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12651b)) {
            return false;
        }
        C12651b bVar = (C12651b) obj;
        return C89219l.m154714a(this.f30811a, bVar.f30811a) && C89219l.m154714a(this.f30812b, bVar.f30812b);
    }

    public final int hashCode() {
        EnumC12650a aVar = this.f30811a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        AbstractC12693u<? extends AbstractC22876d> uVar = this.f30812b;
        if (uVar != null) {
            i = uVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FireReason(case=" + this.f30811a + ", host=" + this.f30812b + ")";
    }

    public C12651b(EnumC12650a aVar, AbstractC12693u<? extends AbstractC22876d> uVar) {
        C89219l.m154719c(aVar, "");
        this.f30811a = aVar;
        this.f30812b = uVar;
    }
}
