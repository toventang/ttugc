package com.p2082ss.android.ugc.aweme.commercialize.adsetting;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.AdSettingsApi */
public interface AdSettingsApi {

    /* renamed from: a */
    public static final C37594a f88876a = C37594a.f88877a;

    static {
        Covode.recordClassIndex(45011);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/ad/settings/")
    AbstractC21983b<String> requestAdSettings(@AbstractC89736t(mo144292a = "item_id") String str);

    @AbstractC89731o(mo144285a = "/aweme/v1/ad/settings/code/delete/")
    AbstractC21983b<String> requestCodeDelete(@AbstractC89736t(mo144292a = "item_id") String str, @AbstractC89736t(mo144292a = "confirm") boolean z);

    @AbstractC89731o(mo144285a = "/tiktok/v1/ad/auth/extend/")
    AbstractC21983b<String> requestCodeExtend(@AbstractC89736t(mo144292a = "item_id") String str, @AbstractC89736t(mo144292a = "extend_time") long j);

    @AbstractC89731o(mo144285a = "/aweme/v1/ad/settings/code/generate/")
    AbstractC21983b<String> requestCodeGenerate(@AbstractC89736t(mo144292a = "item_id") String str, @AbstractC89736t(mo144292a = "start_time") long j, @AbstractC89736t(mo144292a = "end_time") long j2);

    @AbstractC89731o(mo144285a = "/tiktok/v1/ad/dark/post/update/")
    AbstractC21983b<String> requestDarkPostUpdate(@AbstractC89736t(mo144292a = "item_id") String str, @AbstractC89736t(mo144292a = "status") int i);

    @AbstractC89731o(mo144285a = "/aweme/v1/ad/settings/promote/update/")
    AbstractC21983b<String> requestPromoteUpdate(@AbstractC89736t(mo144292a = "item_id") String str, @AbstractC89736t(mo144292a = "promotable") boolean z);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.AdSettingsApi$a */
    public static final class C37594a {

        /* renamed from: a */
        static final /* synthetic */ C37594a f88877a = new C37594a();

        private C37594a() {
        }

        static {
            Covode.recordClassIndex(45012);
        }
    }
}
