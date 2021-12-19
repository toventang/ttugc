package com.p2082ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39259r;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.g */
public final class C39672g {

    /* renamed from: a */
    static C39258q f93486a;

    /* renamed from: b */
    public static LogPbBean f93487b;

    /* renamed from: c */
    public static final C39672g f93488c = new C39672g();

    private C39672g() {
    }

    static {
        Covode.recordClassIndex(47395);
    }

    /* renamed from: a */
    public static void m80560a(PrivacyUserSettingsResponse privacyUserSettingsResponse) {
        C89219l.m154721d(privacyUserSettingsResponse, "");
        m80559a(privacyUserSettingsResponse.getPrivacyUserSettings());
        f93487b = privacyUserSettingsResponse.getLogPb();
    }

    /* renamed from: a */
    public static void m80559a(C39258q qVar) {
        C39258q qVar2;
        if (qVar != null) {
            qVar2 = C39258q.m79639a(qVar, null, null, null, null, null, null, null, 0, 255);
        } else {
            qVar2 = null;
        }
        f93486a = qVar2;
        if (qVar != null) {
            AbstractC81915c.m141874a(new C39259r(C39258q.m79639a(qVar, null, null, null, null, null, null, null, 0, 255)));
        }
    }
}
