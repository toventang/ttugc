package com.p2082ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39252m;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39254n;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39657a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39661d;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39670f;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39673h;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api.C39742b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.UseOldApiSetting;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.b */
public final class C39659b {

    /* renamed from: a */
    public static final C39659b f93464a = new C39659b();

    private C39659b() {
    }

    /* renamed from: c */
    public static void m80543c() {
        C39672g.m80559a((C39258q) null);
        C39672g.f93487b = null;
    }

    static {
        Covode.recordClassIndex(47382);
    }

    /* renamed from: a */
    public static String m80538a() {
        LogPbBean logPb;
        String imprId;
        PrivacyRestrictionResponse a = C39670f.m80552a();
        if (a == null || (logPb = a.getLogPb()) == null || (imprId = logPb.getImprId()) == null) {
            return "";
        }
        return imprId;
    }

    /* renamed from: b */
    public static C39258q m80540b() {
        C39258q qVar = C39672g.f93486a;
        if (qVar != null) {
            return C39258q.m79639a(qVar, null, null, null, null, null, null, null, 0, 255);
        }
        return null;
    }

    /* renamed from: a */
    public static C39252m m80536a(String str) {
        C39252m mVar;
        C89219l.m154721d(str, "");
        Map<String, C39252m> c = C39670f.m80556c();
        if (c != null && (mVar = c.get(str)) != null) {
            return mVar;
        }
        Map<String, C39252m> d = C39670f.m80557d();
        if (d != null) {
            return d.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m80539a(boolean z) {
        if (!C39631a.m80488d()) {
            return;
        }
        if (z || System.currentTimeMillis() - C39661d.f93466b >= C39661d.f93467c) {
            C39661d.f93465a.fetchPrivacyRestriction().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C39661d.C39662a.f93469a, C39661d.C39664b.f93471a);
        }
    }

    /* renamed from: b */
    public static void m80541b(String str) {
        PrivacyRestrictionResponse privacyRestrictionResponse;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        C39661d.f93465a.updateAgreement(str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C39661d.C39665c.f93472a, C39661d.C39666d.f93473a);
        C89219l.m154721d(str, "");
        C39670f.C39671a aVar = new C39670f.C39671a(str);
        Map<String, C39252m> c = C39670f.m80556c();
        PrivacyRestrictionResponse privacyRestrictionResponse2 = null;
        if (c != null && c.containsKey(str)) {
            PrivacyRestrictionResponse a = C39670f.m80552a();
            if (a != null) {
                Map<String, C39252m> c2 = C39670f.m80556c();
                if (c2 == null) {
                    C89219l.m154715b();
                }
                privacyRestrictionResponse = PrivacyRestrictionResponse.copy$default(a, null, aVar.invoke(c2), null, null, 13, null);
            } else {
                privacyRestrictionResponse = null;
            }
            C39670f.m80554a(privacyRestrictionResponse);
        }
        Map<String, C39252m> d = C39670f.m80557d();
        if (d != null && d.containsKey(str)) {
            PrivacyRestrictionResponse a2 = C39670f.m80552a();
            if (a2 != null) {
                Map<String, C39252m> d2 = C39670f.m80557d();
                if (d2 == null) {
                    C89219l.m154715b();
                }
                privacyRestrictionResponse2 = PrivacyRestrictionResponse.copy$default(a2, null, null, aVar.invoke(d2), null, 11, null);
            }
            C39670f.m80554a(privacyRestrictionResponse2);
        }
    }

    /* renamed from: b */
    public static void m80542b(boolean z) {
        if (!C39631a.m80488d()) {
            return;
        }
        if (!z && System.currentTimeMillis() - C39673h.f93490b < C39673h.f93491c) {
            return;
        }
        if (UseOldApiSetting.INSTANCE.useOldApiSource()) {
            AbstractC88979t b = AbstractC88979t.m154294a(new C39673h.C39682h(C39673h.f93489a.getPrivacyUserSettings().mo143280b(C39673h.C39689j.f93521a).mo143264a(C39673h.C39691k.f93523a).mo143280b(C39673h.C39692l.f93524a), C39742b.m80624a().mo143280b(C39673h.C39693m.f93525a).mo143264a(C39673h.C39695n.f93527a))).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143280b((AbstractC88433f) C39673h.C39688i.f93520a);
            C89219l.m154716b(b, "");
            b.mo143254a(C39673h.C39678d.f93497a, C39673h.C39679e.f93498a);
            return;
        }
        AbstractC88979t<PrivacyUserSettingsResponse> b2 = C39673h.f93489a.getPrivacyUserSettings().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143280b(C39673h.C39674a.f93493a).mo143264a(C39673h.C39676b.f93495a).mo143280b(C39673h.C39677c.f93496a);
        C89219l.m154716b(b2, "");
        b2.mo143254a(C39673h.C39680f.f93499a, C39673h.C39681g.f93500a);
    }

    /* renamed from: a */
    public static C39256o m80537a(int i, String str) {
        C39256o oVar;
        C89219l.m154721d(str, "");
        if (i != 0 || !C89219l.m154714a((Object) str, (Object) "group_chat")) {
            C39254n b = C39670f.m80555b();
            if (b != null) {
                return b.getTargetRestrictionItem(i, str);
            }
            return null;
        }
        String a = C39631a.m80484a();
        if (C39657a.f93457a == null || !C89361p.m154872a(C39657a.f93457a, a, false)) {
            C39256o a2 = C39657a.m80535a(a);
            if (a2 == null) {
                oVar = C39657a.f93459c;
            } else {
                oVar = a2;
            }
            C39657a.f93460d = oVar;
            C40043a.m80998a("PRIVACY_SETTING_ALOG", new C39657a.C39658a(a2));
            C39657a.f93457a = a;
        }
        return C39657a.f93460d;
    }
}
