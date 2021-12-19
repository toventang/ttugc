package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.fa */
public final class C46922fa {
    @AbstractC27891c(mo46611a = "permission_popup_accept_text")

    /* renamed from: a */
    public String f109345a;
    @AbstractC27891c(mo46611a = "permission_popup_reject_text")

    /* renamed from: b */
    public String f109346b;
    @AbstractC27891c(mo46611a = "permission_popup_facebook_title")

    /* renamed from: c */
    public String f109347c;
    @AbstractC27891c(mo46611a = "permission_popup_contact_title")

    /* renamed from: d */
    public String f109348d;
    @AbstractC27891c(mo46611a = "permission_popup_sync_facebook_body_text")

    /* renamed from: e */
    public String f109349e;
    @AbstractC27891c(mo46611a = "permission_popup_sync_contact_body_text")

    /* renamed from: f */
    public String f109350f;

    static {
        Covode.recordClassIndex(55523);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46922fa)) {
            return false;
        }
        C46922fa faVar = (C46922fa) obj;
        return C89219l.m154714a(this.f109345a, faVar.f109345a) && C89219l.m154714a(this.f109346b, faVar.f109346b) && C89219l.m154714a(this.f109347c, faVar.f109347c) && C89219l.m154714a(this.f109348d, faVar.f109348d) && C89219l.m154714a(this.f109349e, faVar.f109349e) && C89219l.m154714a(this.f109350f, faVar.f109350f);
    }

    public final int hashCode() {
        String str = this.f109345a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f109346b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f109347c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f109348d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f109349e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f109350f;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "PermissionPopUpStyleConfig(primaryButtonStringKey=" + this.f109345a + ", secondaryButtonStringKey=" + this.f109346b + ", fbTitleKey=" + this.f109347c + ", contactTitleKey=" + this.f109348d + ", dialogFBTextKey=" + this.f109349e + ", dialogContactTextKey=" + this.f109350f + ")";
    }

    public /* synthetic */ C46922fa() {
        this("disclosure_continue", "none_close", "access_request_FB_description", "contact_access_disclosure");
    }

    private C46922fa(String str, String str2, String str3, String str4) {
        this.f109345a = str;
        this.f109346b = str2;
        this.f109347c = null;
        this.f109348d = null;
        this.f109349e = str3;
        this.f109350f = str4;
    }
}
