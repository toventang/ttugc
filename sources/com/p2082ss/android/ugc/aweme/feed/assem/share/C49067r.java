package com.p2082ss.android.ugc.aweme.feed.assem.share;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.share.r */
public final class C49067r implements AbstractC12853j {

    /* renamed from: a */
    public final boolean f113000a;

    /* renamed from: b */
    public final C49019e f113001b;

    /* renamed from: c */
    public final C49020f f113002c;

    /* renamed from: d */
    public final C12776a<Boolean> f113003d;

    /* renamed from: e */
    public final C89378p<Integer, Integer> f113004e;

    /* renamed from: f */
    public final C49018d f113005f;

    /* renamed from: g */
    public final C12776a<C89378p<EnumC49016b, Object>> f113006g;

    static {
        Covode.recordClassIndex(57858);
    }

    public C49067r() {
        this(null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49067r)) {
            return false;
        }
        C49067r rVar = (C49067r) obj;
        return this.f113000a == rVar.f113000a && C89219l.m154714a(this.f113001b, rVar.f113001b) && C89219l.m154714a(this.f113002c, rVar.f113002c) && C89219l.m154714a(this.f113003d, rVar.f113003d) && C89219l.m154714a(this.f113004e, rVar.f113004e) && C89219l.m154714a(this.f113005f, rVar.f113005f) && C89219l.m154714a(this.f113006g, rVar.f113006g);
    }

    public final int hashCode() {
        boolean z = this.f113000a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        C49019e eVar = this.f113001b;
        int i5 = 0;
        int hashCode = (i4 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C49020f fVar = this.f113002c;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar = this.f113003d;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C89378p<Integer, Integer> pVar = this.f113004e;
        int hashCode4 = (hashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C49018d dVar = this.f113005f;
        int hashCode5 = (hashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C12776a<C89378p<EnumC49016b, Object>> aVar2 = this.f113006g;
        if (aVar2 != null) {
            i5 = aVar2.hashCode();
        }
        return hashCode5 + i5;
    }

    public final String toString() {
        return "VideoShareState(shareVisibility=" + this.f113000a + ", shareCountState=" + this.f113001b + ", shareIconState=" + this.f113002c + ", containerAnimation=" + this.f113003d + ", containerScale=" + this.f113004e + ", shareContainerState=" + this.f113005f + ", animationEvent=" + this.f113006g + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C49067r(C49018d dVar, int i) {
        this(false, null, null, null, null, (i & 32) != 0 ? null : dVar, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends h.p<? extends com.ss.android.ugc.aweme.feed.assem.share.b, ? extends java.lang.Object>> */
    /* JADX WARN: Multi-variable type inference failed */
    private C49067r(boolean z, C49019e eVar, C49020f fVar, C12776a<Boolean> aVar, C89378p<Integer, Integer> pVar, C49018d dVar, C12776a<? extends C89378p<? extends EnumC49016b, ? extends Object>> aVar2) {
        this.f113000a = z;
        this.f113001b = eVar;
        this.f113002c = fVar;
        this.f113003d = aVar;
        this.f113004e = pVar;
        this.f113005f = dVar;
        this.f113006g = aVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ C49067r m92201a(C49067r rVar, boolean z, C49019e eVar, C49020f fVar, C12776a aVar, C89378p pVar, C49018d dVar, C12776a aVar2, int i) {
        C12776a aVar3 = aVar2;
        C49018d dVar2 = dVar;
        C89378p pVar2 = pVar;
        boolean z2 = z;
        C49019e eVar2 = eVar;
        C49020f fVar2 = fVar;
        C12776a aVar4 = aVar;
        if ((i & 1) != 0) {
            z2 = rVar.f113000a;
        }
        if ((i & 2) != 0) {
            eVar2 = rVar.f113001b;
        }
        if ((i & 4) != 0) {
            fVar2 = rVar.f113002c;
        }
        if ((i & 8) != 0) {
            aVar4 = rVar.f113003d;
        }
        if ((i & 16) != 0) {
            pVar2 = rVar.f113004e;
        }
        if ((i & 32) != 0) {
            dVar2 = rVar.f113005f;
        }
        if ((i & 64) != 0) {
            aVar3 = rVar.f113006g;
        }
        return new C49067r(z2, eVar2, fVar2, aVar4, pVar2, dVar2, aVar3);
    }
}
