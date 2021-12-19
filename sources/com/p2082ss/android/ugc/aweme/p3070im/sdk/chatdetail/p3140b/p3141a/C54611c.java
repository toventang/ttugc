package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c */
public final class C54611c {

    /* renamed from: a */
    public final boolean f125179a;

    /* renamed from: b */
    public final boolean f125180b;

    /* renamed from: c */
    public final String f125181c;

    /* renamed from: d */
    public final boolean f125182d;

    /* renamed from: e */
    public final boolean f125183e;

    /* renamed from: f */
    public final boolean f125184f;

    /* renamed from: g */
    public final C54006a f125185g;

    /* renamed from: h */
    public final C54006a f125186h;

    /* renamed from: i */
    public final C54006a f125187i;

    /* renamed from: j */
    public final C54006a f125188j;

    /* renamed from: k */
    public final boolean f125189k;

    /* renamed from: l */
    public final Pair<Integer, String> f125190l;

    /* renamed from: m */
    public final boolean f125191m;

    static {
        Covode.recordClassIndex(64324);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54611c)) {
            return false;
        }
        C54611c cVar = (C54611c) obj;
        return this.f125179a == cVar.f125179a && this.f125180b == cVar.f125180b && C89219l.m154714a(this.f125181c, cVar.f125181c) && this.f125182d == cVar.f125182d && this.f125183e == cVar.f125183e && this.f125184f == cVar.f125184f && C89219l.m154714a(this.f125185g, cVar.f125185g) && C89219l.m154714a(this.f125186h, cVar.f125186h) && C89219l.m154714a(this.f125187i, cVar.f125187i) && C89219l.m154714a(this.f125188j, cVar.f125188j) && this.f125189k == cVar.f125189k && C89219l.m154714a(this.f125190l, cVar.f125190l) && this.f125191m == cVar.f125191m;
    }

    public final int hashCode() {
        boolean z = this.f125179a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f125180b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        String str = this.f125181c;
        int i10 = 0;
        int hashCode = (i9 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.f125182d;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (hashCode + i11) * 31;
        boolean z4 = this.f125183e;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.f125184f;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        C54006a aVar = this.f125185g;
        int hashCode2 = (i22 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C54006a aVar2 = this.f125186h;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C54006a aVar3 = this.f125187i;
        int hashCode4 = (hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        C54006a aVar4 = this.f125188j;
        int hashCode5 = (hashCode4 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        boolean z6 = this.f125189k;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (hashCode5 + i23) * 31;
        Pair<Integer, String> pair = this.f125190l;
        if (pair != null) {
            i10 = pair.hashCode();
        }
        int i27 = (i26 + i10) * 31;
        if (!this.f125191m) {
            i = 0;
        }
        return i27 + i;
    }

    public final String toString() {
        return "GroupChatSignalModel(dissolveGroup=" + this.f125179a + ", leaveGroup=" + this.f125180b + ", toast=" + this.f125181c + ", finish=" + this.f125182d + ", jumpToRequestInfo=" + this.f125183e + ", chooseAdminDialog=" + this.f125184f + ", userToBeOperated=" + this.f125185g + ", userToBeBlocked=" + this.f125186h + ", userToBeAppointed=" + this.f125187i + ", userToBeRemoved=" + this.f125188j + ", addGroupMember=" + this.f125189k + ", iconToast=" + this.f125190l + ", showSuicideNoticeDialog=" + this.f125191m + ")";
    }

    public /* synthetic */ C54611c() {
        this(false, false, "", false, false, false, null, null, null, null, false, null, false);
    }

    private C54611c(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, C54006a aVar, C54006a aVar2, C54006a aVar3, C54006a aVar4, boolean z6, Pair<Integer, String> pair, boolean z7) {
        C89219l.m154721d(str, "");
        this.f125179a = z;
        this.f125180b = z2;
        this.f125181c = str;
        this.f125182d = z3;
        this.f125183e = z4;
        this.f125184f = z5;
        this.f125185g = aVar;
        this.f125186h = aVar2;
        this.f125187i = aVar3;
        this.f125188j = aVar4;
        this.f125189k = z6;
        this.f125190l = pair;
        this.f125191m = z7;
    }

    /* renamed from: a */
    public static /* synthetic */ C54611c m100123a(C54611c cVar, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, C54006a aVar, C54006a aVar2, C54006a aVar3, C54006a aVar4, boolean z6, Pair pair, boolean z7, int i) {
        boolean z8 = z7;
        Pair pair2 = pair;
        boolean z9 = z6;
        boolean z10 = z3;
        String str2 = str;
        boolean z11 = z2;
        boolean z12 = z;
        boolean z13 = z4;
        boolean z14 = z5;
        C54006a aVar5 = aVar;
        C54006a aVar6 = aVar2;
        C54006a aVar7 = aVar3;
        C54006a aVar8 = aVar4;
        if ((i & 1) != 0) {
            z12 = cVar.f125179a;
        }
        if ((i & 2) != 0) {
            z11 = cVar.f125180b;
        }
        if ((i & 4) != 0) {
            str2 = cVar.f125181c;
        }
        if ((i & 8) != 0) {
            z10 = cVar.f125182d;
        }
        if ((i & 16) != 0) {
            z13 = cVar.f125183e;
        }
        if ((i & 32) != 0) {
            z14 = cVar.f125184f;
        }
        if ((i & 64) != 0) {
            aVar5 = cVar.f125185g;
        }
        if ((i & 128) != 0) {
            aVar6 = cVar.f125186h;
        }
        if ((i & 256) != 0) {
            aVar7 = cVar.f125187i;
        }
        if ((i & 512) != 0) {
            aVar8 = cVar.f125188j;
        }
        if ((i & 1024) != 0) {
            z9 = cVar.f125189k;
        }
        if ((i & 2048) != 0) {
            pair2 = cVar.f125190l;
        }
        if ((i & 4096) != 0) {
            z8 = cVar.f125191m;
        }
        C89219l.m154721d(str2, "");
        return new C54611c(z12, z11, str2, z10, z13, z14, aVar5, aVar6, aVar7, aVar8, z9, pair2, z8);
    }
}
