package com.p2082ss.android.ugc.aweme.money.growth;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.android.gms.p1930a.p1931a.C25248a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi */
public final class GoogleCampaignInfoApi {

    /* renamed from: a */
    public static final GoogleCampaignApi f137152a = ((GoogleCampaignApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(GoogleCampaignApi.class));

    /* renamed from: b */
    public static final C60165a f137153b = new C60165a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$GoogleCampaignApi */
    public interface GoogleCampaignApi {
        static {
            Covode.recordClassIndex(70693);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/activity/campaign/")
        C1731i<C60169b> querySettings(@AbstractC89736t(mo144292a = "google_aid") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$a */
    public static final class C60165a {
        static {
            Covode.recordClassIndex(70694);
        }

        private C60165a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$a$a */
        public static final class CallableC60166a<V> implements Callable {

            /* renamed from: a */
            public static final CallableC60166a f137154a = new CallableC60166a();

            static {
                Covode.recordClassIndex(70695);
            }

            CallableC60166a() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                C25248a.C25249a a = C25248a.m48579a(C17867d.m33078a());
                GoogleCampaignApi googleCampaignApi = GoogleCampaignInfoApi.f137152a;
                C89219l.m154716b(a, "");
                String str = a.f59857a;
                C89219l.m154716b(str, "");
                return googleCampaignApi.querySettings(str).mo5534a(C601671.f137155a, C1731i.f5562a, null);
            }
        }

        public /* synthetic */ C60165a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(70692);
    }
}
