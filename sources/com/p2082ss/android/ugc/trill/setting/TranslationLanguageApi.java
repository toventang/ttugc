package com.p2082ss.android.ugc.trill.setting;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.trill.setting.TranslationLanguageApi */
public interface TranslationLanguageApi {

    /* renamed from: a */
    public static final C85111a f190432a = C85111a.f190433a;

    static {
        Covode.recordClassIndex(99146);
    }

    @AbstractC89731o(mo144285a = "/aweme/v1/user/set/settings/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> setTranslationLanguage(@AbstractC89719c(mo144273a = "field") String str, @AbstractC89719c(mo144273a = "value") String str2);

    /* renamed from: com.ss.android.ugc.trill.setting.TranslationLanguageApi$a */
    public static final class C85111a {

        /* renamed from: a */
        static final /* synthetic */ C85111a f190433a = new C85111a();

        private C85111a() {
        }

        static {
            Covode.recordClassIndex(99147);
        }
    }
}
