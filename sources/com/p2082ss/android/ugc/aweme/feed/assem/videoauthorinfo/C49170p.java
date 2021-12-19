package com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.p */
public final class C49170p implements AbstractC12853j {

    /* renamed from: a */
    public final boolean f113143a;

    /* renamed from: b */
    public final Boolean f113144b;

    /* renamed from: c */
    public final MutualStruct f113145c;

    /* renamed from: d */
    public final String f113146d;

    /* renamed from: e */
    public final Aweme f113147e;

    /* renamed from: f */
    public final C89378p<Integer, Integer> f113148f;

    /* renamed from: g */
    public final C12776a<Boolean> f113149g;

    static {
        Covode.recordClassIndex(57964);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49170p)) {
            return false;
        }
        C49170p pVar = (C49170p) obj;
        return this.f113143a == pVar.f113143a && C89219l.m154714a(this.f113144b, pVar.f113144b) && C89219l.m154714a(this.f113145c, pVar.f113145c) && C89219l.m154714a(this.f113146d, pVar.f113146d) && C89219l.m154714a(this.f113147e, pVar.f113147e) && C89219l.m154714a(this.f113148f, pVar.f113148f) && C89219l.m154714a(this.f113149g, pVar.f113149g);
    }

    public final int hashCode() {
        boolean z = this.f113143a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        Boolean bool = this.f113144b;
        int i5 = 0;
        int hashCode = (i4 + (bool != null ? bool.hashCode() : 0)) * 31;
        MutualStruct mutualStruct = this.f113145c;
        int hashCode2 = (hashCode + (mutualStruct != null ? mutualStruct.hashCode() : 0)) * 31;
        String str = this.f113146d;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Aweme aweme = this.f113147e;
        int hashCode4 = (hashCode3 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        C89378p<Integer, Integer> pVar = this.f113148f;
        int hashCode5 = (hashCode4 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar = this.f113149g;
        if (aVar != null) {
            i5 = aVar.hashCode();
        }
        return hashCode5 + i5;
    }

    public final String toString() {
        return "VideoAuthorInfoRelationState(showRelation=" + this.f113143a + ", hideRelationAnimation=" + this.f113144b + ", mutualRelation=" + this.f113145c + ", relationText=" + this.f113146d + ", aweme=" + this.f113147e + ", followBtnStatus=" + this.f113148f + ", updateSocialTaggedView=" + this.f113149g + ")";
    }

    public /* synthetic */ C49170p() {
        this(false, null, null, null, null, null, null);
    }

    private C49170p(boolean z, Boolean bool, MutualStruct mutualStruct, String str, Aweme aweme, C89378p<Integer, Integer> pVar, C12776a<Boolean> aVar) {
        this.f113143a = z;
        this.f113144b = bool;
        this.f113145c = mutualStruct;
        this.f113146d = str;
        this.f113147e = aweme;
        this.f113148f = pVar;
        this.f113149g = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C49170p m92261a(C49170p pVar, boolean z, Boolean bool, MutualStruct mutualStruct, String str, Aweme aweme, C89378p pVar2, C12776a aVar, int i) {
        C12776a aVar2 = aVar;
        C89378p pVar3 = pVar2;
        Aweme aweme2 = aweme;
        boolean z2 = z;
        Boolean bool2 = bool;
        MutualStruct mutualStruct2 = mutualStruct;
        String str2 = str;
        if ((i & 1) != 0) {
            z2 = pVar.f113143a;
        }
        if ((i & 2) != 0) {
            bool2 = pVar.f113144b;
        }
        if ((i & 4) != 0) {
            mutualStruct2 = pVar.f113145c;
        }
        if ((i & 8) != 0) {
            str2 = pVar.f113146d;
        }
        if ((i & 16) != 0) {
            aweme2 = pVar.f113147e;
        }
        if ((i & 32) != 0) {
            pVar3 = pVar.f113148f;
        }
        if ((i & 64) != 0) {
            aVar2 = pVar.f113149g;
        }
        return new C49170p(z2, bool2, mutualStruct2, str2, aweme2, pVar3, aVar2);
    }
}
