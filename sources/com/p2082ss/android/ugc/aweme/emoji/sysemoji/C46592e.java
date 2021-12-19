package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.e */
public final class C46592e {

    /* renamed from: a */
    public static ImSysEmojiApi f108637a;

    /* renamed from: b */
    private static final String f108638b;

    /* renamed from: c */
    private static final String f108639c;

    static {
        Covode.recordClassIndex(55182);
        String str = "https://" + C17867d.f42587k.f42569a;
        f108638b = str;
        String str2 = str + "/aweme/v1/";
        f108639c = str2;
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        if (createIRetrofitServicebyMonsterPlugin != null) {
            f108637a = (ImSysEmojiApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(str2).create(ImSysEmojiApi.class);
        }
    }
}
