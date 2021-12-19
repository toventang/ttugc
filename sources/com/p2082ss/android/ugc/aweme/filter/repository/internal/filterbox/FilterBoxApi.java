package com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxApi */
public interface FilterBoxApi {
    static {
        Covode.recordClassIndex(59887);
    }

    @AbstractC89722f(mo144276a = "effect/api/filterbox/list")
    AbstractC88403ab<C50742g> listFilterBox(@AbstractC89736t(mo144292a = "access_key") String str, @AbstractC89736t(mo144292a = "sdk_version") String str2, @AbstractC89736t(mo144292a = "app_version") String str3, @AbstractC89736t(mo144292a = "region") String str4, @AbstractC89736t(mo144292a = "panel") String str5);

    @AbstractC89731o(mo144285a = "effect/api/filterbox/update")
    AbstractC88403ab<BaseNetResponse> updateFilterBox(@AbstractC89717a C50744i iVar);
}
