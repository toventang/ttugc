package com.p2082ss.android.ugc.aweme.specact.popup.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22016x;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3928b.C74958a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.api.ISpecApi */
public interface ISpecApi {

    /* renamed from: a */
    public static final C75138a f168952a = C75138a.f168953a;

    static {
        Covode.recordClassIndex(88011);
    }

    @AbstractC22012t(mo35799a = "/luckycat/tiktokm/v1/task/done/{task_id}")
    AbstractFutureC27655q<C74958a> getTaskAwardByTaskId(@AbstractC22016x(mo35804a = "task_id") String str, @AbstractC22018z(mo35807a = "task_time") int i);

    @AbstractC22000h(mo35789a = "/luckycat/tiktokm/v1/task/page")
    AbstractFutureC27655q<C75126k> getTaskInfo(@AbstractC22018z(mo35807a = "component") String str);

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.api.ISpecApi$a */
    public static final class C75138a {

        /* renamed from: a */
        static final /* synthetic */ C75138a f168953a = new C75138a();

        private C75138a() {
        }

        static {
            Covode.recordClassIndex(88012);
        }

        /* renamed from: a */
        public static ISpecApi m131890a() {
            LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi, "");
            Object a = RetrofitFactory.m33635a().mo28816a(localTestApi.getResFakerService().mo96418a().getString("spce_api_force_use_host", Api.f79771d)).mo28858a(ISpecApi.class);
            C89219l.m154716b(a, "");
            return (ISpecApi) a;
        }
    }
}
