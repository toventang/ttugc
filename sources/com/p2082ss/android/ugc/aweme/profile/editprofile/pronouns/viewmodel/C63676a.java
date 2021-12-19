package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.a */
public final class C63676a implements AbstractC12853j {

    /* renamed from: a */
    public final boolean f144379a;

    /* renamed from: b */
    public final String f144380b;

    /* renamed from: c */
    public final C12776a<Integer> f144381c;

    static {
        Covode.recordClassIndex(74995);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63676a)) {
            return false;
        }
        C63676a aVar = (C63676a) obj;
        return this.f144379a == aVar.f144379a && C89219l.m154714a(this.f144380b, aVar.f144380b) && C89219l.m154714a(this.f144381c, aVar.f144381c);
    }

    public final int hashCode() {
        boolean z = this.f144379a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f144380b;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        C12776a<Integer> aVar = this.f144381c;
        if (aVar != null) {
            i5 = aVar.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "ProfileEditPronounsNavBarState(isUpdate=" + this.f144379a + ", newPronouns=" + this.f144380b + ", toastMessageId=" + this.f144381c + ")";
    }

    public /* synthetic */ C63676a() {
        this(false, "", null);
    }

    private C63676a(boolean z, String str, C12776a<Integer> aVar) {
        C89219l.m154721d(str, "");
        this.f144379a = z;
        this.f144380b = str;
        this.f144381c = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C63676a m115212a(C63676a aVar, boolean z, String str, C12776a aVar2, int i) {
        if ((i & 1) != 0) {
            z = aVar.f144379a;
        }
        if ((i & 2) != 0) {
            str = aVar.f144380b;
        }
        if ((i & 4) != 0) {
            aVar2 = aVar.f144381c;
        }
        C89219l.m154721d(str, "");
        return new C63676a(z, str, aVar2);
    }
}
