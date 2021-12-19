package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl$setPrivateSettingItem$1 */
final class ProfileDependentComponentImpl$setPrivateSettingItem$1<T> implements AbstractC88407af {
    final /* synthetic */ String $field;
    final /* synthetic */ int $value;

    static {
        Covode.recordClassIndex(79719);
    }

    ProfileDependentComponentImpl$setPrivateSettingItem$1(String str, int i) {
        this.$field = str;
        this.$value = i;
    }

    @Override // p4560f.p4561a.AbstractC88407af
    public final void subscribe(AbstractC88405ad<BaseResponse> adVar) {
        C89219l.m154721d(adVar, "");
        adVar.mo142931a(C68432f.f153189a.mo108856a(this.$field, this.$value));
    }
}
