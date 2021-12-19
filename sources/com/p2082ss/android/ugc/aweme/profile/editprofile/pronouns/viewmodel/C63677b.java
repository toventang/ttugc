package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.b */
public final class C63677b implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<Boolean> f144382a;

    static {
        Covode.recordClassIndex(74996);
    }

    /* renamed from: a */
    public static C63677b m115213a(C12776a<Boolean> aVar) {
        return new C63677b(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C63677b) && C89219l.m154714a(this.f144382a, ((C63677b) obj).f144382a);
        }
        return true;
    }

    public final int hashCode() {
        C12776a<Boolean> aVar = this.f144382a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProfileEditPronounsSearchAndDisplayState(editTextContentChange=" + this.f144382a + ")";
    }

    public /* synthetic */ C63677b() {
        this(null);
    }

    private C63677b(C12776a<Boolean> aVar) {
        this.f144382a = aVar;
    }
}
