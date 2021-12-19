package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89725i;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.setting.api.IUnbindValidateApi */
public interface IUnbindValidateApi {

    /* renamed from: a */
    public static final C67992a f152329a = C67992a.f152331b;

    static {
        Covode.recordClassIndex(80179);
    }

    @AbstractC89731o(mo144285a = "/passport/email/unbind_validate/")
    C1731i<C68000c> unbindEmailValidate(@AbstractC89725i(mo144281a = "x-tt-passport-csrf-token") String str);

    @AbstractC89731o(mo144285a = "/passport/mobile/unbind_validate/")
    C1731i<C68000c> unbindMobileValidate(@AbstractC89725i(mo144281a = "x-tt-passport-csrf-token") String str);

    /* renamed from: com.ss.android.ugc.aweme.setting.api.IUnbindValidateApi$a */
    public static final class C67992a {

        /* renamed from: a */
        public static final IUnbindValidateApi f152330a = ((IUnbindValidateApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(IUnbindValidateApi.class));

        /* renamed from: b */
        static final /* synthetic */ C67992a f152331b = new C67992a();

        private C67992a() {
        }

        static {
            Covode.recordClassIndex(80180);
        }
    }
}
