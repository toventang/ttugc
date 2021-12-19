package com.p2082ss.android.ugc.aweme.specact.popup.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.net.CommonApi;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75124i;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi */
public final class SpecActRedPacketApi {

    /* renamed from: a */
    public static final ISpecActRedPacketApi f168954a = ((ISpecActRedPacketApi) RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(ISpecActRedPacketApi.class));

    /* renamed from: b */
    public static final CommonApi f168955b;

    /* renamed from: c */
    public static final C75139a f168956c = new C75139a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi$ISpecActRedPacketApi */
    public interface ISpecActRedPacketApi {
        static {
            Covode.recordClassIndex(88014);
        }

        @AbstractC22012t(mo35799a = "/luckycat/tiktokm/v1/popup/click")
        C1731i<String> requestOnPopupClick(@AbstractC22018z(mo35807a = "name") String str, @AbstractC22018z(mo35807a = "source") String str2, @AbstractC22018z(mo35807a = "cancel") String str3, @AbstractC22018z(mo35807a = "activity_id") String str4, @AbstractC22018z(mo35807a = "activity_start_time") long j, @AbstractC22018z(mo35807a = "activity_end_time") long j2);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi$a */
    public static final class C75139a {
        static {
            Covode.recordClassIndex(88015);
        }

        private C75139a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi$a$a */
        static final class CallableC75140a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C75124i f168957a;

            /* renamed from: b */
            final /* synthetic */ String f168958b;

            static {
                Covode.recordClassIndex(88016);
            }

            CallableC75140a(C75124i iVar, String str) {
                this.f168957a = iVar;
                this.f168958b = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return SpecActRedPacketApi.f168954a.requestOnPopupClick(this.f168957a.f168883c, "client", this.f168958b, this.f168957a.f168884d, this.f168957a.f168896p, this.f168957a.f168897q).mo5534a(C751411.f168959a, C1731i.f5562a, null);
            }
        }

        public /* synthetic */ C75139a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m131891a(C75124i iVar, String str) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(str, "");
            C1731i.m5640b(new CallableC75140a(iVar, str), C1731i.f5562a);
        }
    }

    static {
        Covode.recordClassIndex(88013);
        Object a = RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(CommonApi.class);
        C89219l.m154716b(a, "");
        f168955b = (CommonApi) a;
    }
}
