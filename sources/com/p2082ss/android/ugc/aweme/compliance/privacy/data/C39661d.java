package com.p2082ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39254n;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.common.p2660a.C39605a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.d */
public final class C39661d {

    /* renamed from: a */
    static final PrivacyRestrictionApi f93465a = ((PrivacyRestrictionApi) RetrofitFactory.m33635a().mo28816a(C39605a.f93367a).mo28858a(PrivacyRestrictionApi.class));

    /* renamed from: b */
    static long f93466b;

    /* renamed from: c */
    static final long f93467c = 1800000;

    /* renamed from: d */
    public static final C39661d f93468d = new C39661d();

    private C39661d() {
    }

    static {
        Covode.recordClassIndex(47384);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.d$c */
    public static final class C39665c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39665c f93472a = new C39665c();

        static {
            Covode.recordClassIndex(47388);
        }

        C39665c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39617a.m80456a("/tiktok/privacy/agreement/record/agree/v1", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.d$b */
    public static final class C39664b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39664b f93471a = new C39664b();

        static {
            Covode.recordClassIndex(47387);
        }

        C39664b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/tiktok/privacy/setting/restriction/v1", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.d$d */
    public static final class C39666d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39666d f93473a = new C39666d();

        static {
            Covode.recordClassIndex(47389);
        }

        C39666d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/tiktok/privacy/agreement/record/agree/v1", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.d$a */
    public static final class C39662a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39662a f93469a = new C39662a();

        static {
            Covode.recordClassIndex(47385);
        }

        C39662a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39256o oVar;
            final PrivacyRestrictionResponse privacyRestrictionResponse = (PrivacyRestrictionResponse) obj;
            if (privacyRestrictionResponse.status_code == 0) {
                C39661d.f93466b = System.currentTimeMillis();
                C89219l.m154716b(privacyRestrictionResponse, "");
                C89219l.m154721d(privacyRestrictionResponse, "");
                C39670f.m80554a(privacyRestrictionResponse);
                C39254n privacySettingRestriction = privacyRestrictionResponse.getPrivacySettingRestriction();
                if (privacySettingRestriction != null) {
                    oVar = privacySettingRestriction.getTargetRestrictionItem(0, "group_chat");
                } else {
                    oVar = null;
                }
                String a = C39631a.m80484a();
                if (!(a == null || a.length() == 0 || oVar == null)) {
                    C39657a.f93458b.storeString(a, C80342dg.m139300a().mo46674b(oVar));
                }
                C40043a.m80998a("PRIVACY_SETTING_ALOG", new AbstractC89172b<C33743c, C33743c>() {
                    /* class com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39661d.C39662a.C396631 */

                    static {
                        Covode.recordClassIndex(47386);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C33743c invoke(C33743c cVar) {
                        Map<String, C39256o> map;
                        C33743c cVar2 = cVar;
                        C89219l.m154721d(cVar2, "");
                        C40043a.m80991a(cVar2, "Fetch Restriction success");
                        C39254n privacySettingRestriction = privacyRestrictionResponse.getPrivacySettingRestriction();
                        Map<String, C39256o> map2 = null;
                        if (privacySettingRestriction != null) {
                            map = privacySettingRestriction.getAccount();
                        } else {
                            map = null;
                        }
                        C40043a.m80990a(cVar2, map);
                        C39254n privacySettingRestriction2 = privacyRestrictionResponse.getPrivacySettingRestriction();
                        if (privacySettingRestriction2 != null) {
                            map2 = privacySettingRestriction2.getVideoPrivacy();
                        }
                        C40043a.m80992a(cVar2, "restriction_v", map2);
                        PrivacyRestrictionResponse privacyRestrictionResponse = privacyRestrictionResponse;
                        C89219l.m154716b(privacyRestrictionResponse, "");
                        return C40043a.m81000b(cVar2, C40043a.m80993a(privacyRestrictionResponse));
                    }
                });
                C39617a.m80456a("/tiktok/privacy/setting/restriction/v1", 0);
            }
        }
    }
}
