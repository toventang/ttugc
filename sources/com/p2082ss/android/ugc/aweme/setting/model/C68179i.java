package com.p2082ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.model.i */
public final class C68179i extends BaseResponse {
    @AbstractC27891c(mo46611a = "should_display")

    /* renamed from: a */
    public boolean f152655a;
    @AbstractC27891c(mo46611a = "link_sug_switch_status")

    /* renamed from: b */
    public Boolean f152656b;
    @AbstractC27891c(mo46611a = "is_displayed_before")

    /* renamed from: c */
    public boolean f152657c;

    static {
        Covode.recordClassIndex(80378);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68179i)) {
            return false;
        }
        C68179i iVar = (C68179i) obj;
        return this.f152655a == iVar.f152655a && C89219l.m154714a(this.f152656b, iVar.f152656b) && this.f152657c == iVar.f152657c;
    }

    public final int hashCode() {
        boolean z = this.f152655a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        Boolean bool = this.f152656b;
        int hashCode = (i5 + (bool != null ? bool.hashCode() : 0)) * 31;
        if (!this.f152657c) {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "LinkPrivacyPopupStatusResponse(shouldDisplay=" + this.f152655a + ", linkSugSwitchStatus=" + this.f152656b + ", isDisplayedBefore=" + this.f152657c + ")";
    }
}
