package com.p2082ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.b */
public final class C46640b {

    /* renamed from: a */
    public static final EmojiApi f108757a;

    /* renamed from: b */
    public static final C46640b f108758b = new C46640b();

    /* renamed from: c */
    private static final String f108759c;

    /* renamed from: d */
    private static final String f108760d;

    private C46640b() {
    }

    static {
        Covode.recordClassIndex(55232);
        String str = "https://" + C17867d.f42587k.f42569a;
        f108759c = str;
        String str2 = str + "/aweme/v1/";
        f108760d = str2;
        Object a = RetrofitFactory.m33635a().mo28816a(str2).mo28858a(EmojiApi.class);
        C89219l.m154716b(a, "");
        f108757a = (EmojiApi) a;
    }
}
