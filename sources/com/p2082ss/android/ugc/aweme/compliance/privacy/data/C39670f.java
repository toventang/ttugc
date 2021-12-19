package com.p2082ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39252m;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39254n;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.Map;
import org.json.JSONException;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.f */
public final class C39670f {

    /* renamed from: a */
    public static final C39670f f93481a = new C39670f();

    /* renamed from: b */
    private static final Keva f93482b;

    /* renamed from: c */
    private static String f93483c;

    /* renamed from: d */
    private static PrivacyRestrictionResponse f93484d;

    private C39670f() {
    }

    static {
        Covode.recordClassIndex(47393);
        Keva repo = Keva.getRepo("privacy_setting");
        C89219l.m154716b(repo, "");
        f93482b = repo;
    }

    /* renamed from: b */
    public static C39254n m80555b() {
        C39254n privacySettingRestriction;
        PrivacyRestrictionResponse a = m80552a();
        if (a == null || (privacySettingRestriction = a.getPrivacySettingRestriction()) == null) {
            return C39667e.m80545a();
        }
        return privacySettingRestriction;
    }

    /* renamed from: c */
    public static Map<String, C39252m> m80556c() {
        Map<String, C39252m> popupAgreement;
        PrivacyRestrictionResponse a = m80552a();
        if (a == null || (popupAgreement = a.getPopupAgreement()) == null) {
            return C39667e.m80548c();
        }
        return popupAgreement;
    }

    /* renamed from: d */
    public static Map<String, C39252m> m80557d() {
        Map<String, C39252m> postRecord;
        PrivacyRestrictionResponse a = m80552a();
        if (a == null || (postRecord = a.getPostRecord()) == null) {
            return C39667e.m80550e();
        }
        return postRecord;
    }

    /* renamed from: a */
    static PrivacyRestrictionResponse m80552a() {
        String a = C39631a.m80484a();
        String str = f93483c;
        if (str == null || !C89361p.m154872a(str, a, false)) {
            f93484d = null;
        }
        if (f93484d == null) {
            try {
                f93484d = (PrivacyRestrictionResponse) C80342dg.m139300a().mo46670a(f93482b.getString(m80553a("privacy_data"), ""), PrivacyRestrictionResponse.class);
            } catch (JSONException unused) {
            }
            f93483c = a;
        }
        return f93484d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.f$a */
    public static final class C39671a extends AbstractC89220m implements AbstractC89172b<Map<String, ? extends C39252m>, Map<String, ? extends C39252m>> {

        /* renamed from: a */
        final /* synthetic */ String f93485a;

        static {
            Covode.recordClassIndex(47394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39671a(String str) {
            super(1);
            this.f93485a = str;
        }

        /* renamed from: a */
        public final Map<String, C39252m> invoke(Map<String, C39252m> map) {
            C89219l.m154721d(map, "");
            Map<String, C39252m> d = C89041ag.m154431d(map);
            if (d.get(this.f93485a) == null) {
                C89219l.m154715b();
            }
            d.put(this.f93485a, new C39252m());
            return d;
        }
    }

    /* renamed from: a */
    private static String m80553a(String str) {
        String a = C39631a.m80484a();
        if (a == null || a.length() == 0) {
            return str;
        }
        return str + a;
    }

    /* renamed from: a */
    static void m80554a(PrivacyRestrictionResponse privacyRestrictionResponse) {
        if (!C89219l.m154714a(privacyRestrictionResponse, f93484d)) {
            f93484d = privacyRestrictionResponse;
            if (privacyRestrictionResponse == null) {
                f93482b.erase(m80553a("privacy_data"));
            } else {
                f93482b.storeString(m80553a("privacy_data"), C80342dg.m139300a().mo46674b(privacyRestrictionResponse));
            }
            C39667e.m80547b();
            C39667e.m80549d();
            C39667e.m80551f();
        }
    }
}
