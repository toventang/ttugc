package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl$needShowDiskManagerGuideView$1 */
final class ProfileDependentComponentImpl$needShowDiskManagerGuideView$1<T> implements AbstractC88983w {
    public static final ProfileDependentComponentImpl$needShowDiskManagerGuideView$1 INSTANCE = new ProfileDependentComponentImpl$needShowDiskManagerGuideView$1();

    static {
        Covode.recordClassIndex(79714);
    }

    ProfileDependentComponentImpl$needShowDiskManagerGuideView$1() {
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v<Boolean> vVar) {
        C89219l.m154721d(vVar, "");
        try {
            vVar.mo143031a(Boolean.valueOf(C68432f.f153189a.mo108871g()));
            vVar.mo143023a();
        } catch (Exception e) {
            vVar.mo143024a(e);
        }
    }
}
