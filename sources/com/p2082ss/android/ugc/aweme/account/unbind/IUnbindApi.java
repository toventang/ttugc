package com.p2082ss.android.ugc.aweme.account.unbind;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89725i;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.account.unbind.IUnbindApi */
public interface IUnbindApi {

    /* renamed from: a */
    public static final C32996a f78524a = C32996a.f78526b;

    static {
        Covode.recordClassIndex(39800);
    }

    @AbstractC89731o(mo144285a = "/passport/email/unbind/")
    @AbstractC89721e
    C1731i<C33022d> unbindEmail(@AbstractC89719c(mo144273a = "ticket") String str, @AbstractC89725i(mo144281a = "x-tt-passport-csrf-token") String str2);

    @AbstractC89731o(mo144285a = "/passport/mobile/unbind/")
    @AbstractC89721e
    C1731i<C33022d> unbindMobile(@AbstractC89719c(mo144273a = "ticket") String str, @AbstractC89725i(mo144281a = "x-tt-passport-csrf-token") String str2);

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.IUnbindApi$a */
    public static final class C32996a {

        /* renamed from: a */
        static final IUnbindApi f78525a = ((IUnbindApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(IUnbindApi.class));

        /* renamed from: b */
        static final /* synthetic */ C32996a f78526b = new C32996a();

        private C32996a() {
        }

        static {
            Covode.recordClassIndex(39801);
        }
    }
}
