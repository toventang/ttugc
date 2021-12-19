package com.p2082ss.android.ugc.aweme.kids.setting.items.language.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3380c.C57952c;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.api.LanguageApi */
public interface LanguageApi {

    /* renamed from: a */
    public static final C57947a f132104a = C57947a.f132105a;

    static {
        Covode.recordClassIndex(67970);
    }

    @AbstractC22012t(mo35799a = "/tiktok/v1/kids/edit/user/")
    @AbstractC21999g
    AbstractC88979t<C57952c> editLanguageConfig(@AbstractC21997e(mo35786a = "language_change") String str);

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.api.LanguageApi$a */
    public static final class C57947a {

        /* renamed from: a */
        static final /* synthetic */ C57947a f132105a = new C57947a();

        private C57947a() {
        }

        static {
            Covode.recordClassIndex(67971);
        }
    }
}
