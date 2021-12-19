package com.p2082ss.android.ugc.aweme.contentlanguage.api;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService */
public interface IContentLanguageService {
    static {
        Covode.recordClassIndex(47978);
    }

    /* renamed from: a */
    int mo69367a();

    /* renamed from: a */
    Pair<Boolean, String> mo69368a(Context context);

    /* renamed from: a */
    C40186a mo69369a(List<String> list, List<C68343a> list2);

    /* renamed from: a */
    void mo69370a(Activity activity);

    /* renamed from: a */
    void mo69371a(C68343a aVar);

    /* renamed from: a */
    void mo69372a(AbstractC68342a aVar);

    /* renamed from: a */
    void mo69373a(String str);

    /* renamed from: a */
    void mo69374a(boolean z);

    /* renamed from: a */
    boolean mo69375a(Aweme aweme);

    /* renamed from: b */
    Activity mo69376b();

    /* renamed from: c */
    List<String> mo69377c();

    /* renamed from: d */
    String mo69378d();

    /* renamed from: e */
    String mo69379e();
}
