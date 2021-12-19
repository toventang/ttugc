package com.p2082ss.android.ugc.aweme.zerorating;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.api.AbstractC33535d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.zerorating.a */
public final class C81804a implements AbstractC33535d {
    static {
        Covode.recordClassIndex(95213);
    }

    @Override // com.p2082ss.android.ugc.aweme.api.AbstractC33535d
    /* renamed from: b */
    public final void mo59655b() {
        C39162r.onEventV3("data_saver_show");
    }

    @Override // com.p2082ss.android.ugc.aweme.api.AbstractC33535d
    /* renamed from: c */
    public final void mo59657c() {
        C39162r.onEventV3("network_authorization_tab_show");
    }

    @Override // com.p2082ss.android.ugc.aweme.api.AbstractC33535d
    /* renamed from: d */
    public final void mo59659d() {
        C39162r.onEventV3("data_plan_tab_show");
    }

    @Override // com.p2082ss.android.ugc.aweme.api.AbstractC33535d
    /* renamed from: e */
    public final void mo59660e() {
        C39162r.onEventV3("data_plan_tab_click");
    }

    @Override // com.p2082ss.android.ugc.aweme.api.AbstractC33535d
    /* renamed from: a */
    public final void mo59652a() {
        C39162r.m79460a("zero_toast_show", new C33744d().mo59983a("enter_from", "feed").f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.api.AbstractC33535d
    /* renamed from: b */
    public final void mo59656b(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("data_plan_list_show", new C33744d().mo59983a("plan_id_list", str).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.api.AbstractC33535d
    /* renamed from: c */
    public final void mo59658c(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("data_plan_detail_show", new C33744d().mo59983a("plan_id", str).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.api.AbstractC33535d
    /* renamed from: a */
    public final void mo59653a(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("network_authorization_switch", new C33744d().mo59983a("to_status", str).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.api.AbstractC33535d
    /* renamed from: a */
    public final void mo59654a(String str, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C39162r.m79460a("zero_rating_status", new C33744d().mo59983a("plan_id", str).mo59983a("start_date", str2).mo59983a("status", str3).mo59983a("network_carrier", str4).mo59983a("network_mccmnc", str5).f79943a);
    }
}
