package com.p2082ss.android.ugc.aweme.request_combine.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.request_combine.api.SettingCombineApi */
public interface SettingCombineApi {

    /* renamed from: a */
    public static final C67118a f150526a = C67118a.f150528b;

    static {
        Covode.recordClassIndex(78703);
    }

    @AbstractC22000h(mo35789a = "tfe/api/request_combine/v1/")
    AbstractC88979t<C22099u<String>> request(@AbstractC21987aa Map<String, String> map);

    /* renamed from: com.ss.android.ugc.aweme.request_combine.api.SettingCombineApi$a */
    public static final class C67118a {

        /* renamed from: a */
        public static final String f150527a = ("https://" + C17867d.f42587k.f42569a);

        /* renamed from: b */
        static final /* synthetic */ C67118a f150528b = new C67118a();

        private C67118a() {
        }

        static {
            Covode.recordClassIndex(78704);
        }
    }
}
