package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.setting.model.C68178h;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.DoBStatusApi */
public interface DoBStatusApi {

    /* renamed from: a */
    public static final C67990a f152323a = C67990a.f152324a;

    static {
        Covode.recordClassIndex(80175);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/edibility/birthdate/")
    AbstractC88979t<C68178h> getDoBStatus();

    /* renamed from: com.ss.android.ugc.aweme.setting.api.DoBStatusApi$a */
    public static final class C67990a {

        /* renamed from: a */
        static final /* synthetic */ C67990a f152324a = new C67990a();

        /* renamed from: b */
        private static final DoBStatusApi f152325b = ((DoBStatusApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(DoBStatusApi.class));

        private C67990a() {
        }

        /* renamed from: a */
        public static AbstractC88979t<C68178h> m120303a() {
            return f152325b.getDoBStatus();
        }

        static {
            Covode.recordClassIndex(80176);
        }
    }
}
