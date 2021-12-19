package com.p2082ss.android.ugc.aweme.compliance.api.services.consent;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService */
public interface ITpcConsentService {

    /* renamed from: com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService$a */
    public enum EnumC39272a {
        US,
        EU,
        KR,
        ROW;

        static {
            Covode.recordClassIndex(46937);
        }
    }

    static {
        Covode.recordClassIndex(46936);
    }

    /* renamed from: a */
    void mo68634a();

    /* renamed from: a */
    void mo68635a(int i);

    /* renamed from: a */
    void mo68636a(Activity activity, String str);

    /* renamed from: a */
    boolean mo68637a(AbstractC39273a aVar);

    /* renamed from: b */
    void mo68638b(int i);

    /* renamed from: b */
    boolean mo68639b();

    /* renamed from: c */
    void mo68640c();

    /* renamed from: d */
    void mo68641d();

    /* renamed from: e */
    boolean mo68642e();

    /* renamed from: f */
    EnumC39272a mo68643f();

    /* renamed from: g */
    void mo68644g();

    /* renamed from: h */
    void mo68645h();

    /* renamed from: i */
    void mo68646i();
}
