package com.p2082ss.android.ugc.aweme.account.agegate.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.api.CalculateDoBApi */
public interface CalculateDoBApi {

    /* renamed from: a */
    public static final C31409a f75214a = C31409a.f75216b;

    static {
        Covode.recordClassIndex(38125);
    }

    @AbstractC89722f(mo144276a = "/tiktok/v1/calculate/age/")
    AbstractC88979t<C31411b> calculateDoB(@AbstractC89736t(mo144292a = "birthday") String str, @AbstractC89736t(mo144292a = "update_birthdate_type") int i, @AbstractC89736t(mo144292a = "session_register_type") int i2);

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.api.CalculateDoBApi$a */
    public static final class C31409a {

        /* renamed from: a */
        public static final CalculateDoBApi f75215a = ((CalculateDoBApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(CalculateDoBApi.class));

        /* renamed from: b */
        static final /* synthetic */ C31409a f75216b = new C31409a();

        private C31409a() {
        }

        static {
            Covode.recordClassIndex(38126);
        }
    }
}
