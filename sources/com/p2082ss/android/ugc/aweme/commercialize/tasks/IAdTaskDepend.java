package com.p2082ss.android.ugc.aweme.commercialize.tasks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend */
public interface IAdTaskDepend {
    static {
        Covode.recordClassIndex(46022);
    }

    /* renamed from: a */
    Intent mo65610a(Context context);

    /* renamed from: a */
    String mo65611a();

    /* renamed from: a */
    JSONObject mo65612a(Context context, Aweme aweme, String str);

    /* renamed from: a */
    void mo65613a(Context context, int i, int i2);

    /* renamed from: a */
    void mo65614a(Context context, String str, String str2, Bundle bundle);

    /* renamed from: a */
    void mo65615a(String str);

    /* renamed from: a */
    boolean mo65616a(Context context, int i);

    /* renamed from: a */
    boolean mo65617a(Context context, AwemeRawAd awemeRawAd, String str, String str2, String str3, int i);

    /* renamed from: a */
    boolean mo65618a(Context context, String str);

    /* renamed from: a */
    boolean mo65619a(Context context, String str, String str2);

    /* renamed from: a */
    boolean mo65620a(Context context, String str, String str2, String str3, String str4);

    /* renamed from: a */
    boolean mo65621a(Aweme aweme);

    /* renamed from: a */
    boolean mo65622a(AwemeRawAd awemeRawAd);

    /* renamed from: a */
    boolean mo65623a(String str, Context context, AwemeRawAd awemeRawAd);

    /* renamed from: a */
    boolean mo65624a(boolean z, String str, String str2);

    /* renamed from: b */
    void mo65625b(Context context);

    /* renamed from: b */
    boolean mo65626b();

    /* renamed from: b */
    boolean mo65627b(String str);

    /* renamed from: c */
    boolean mo65628c(String str);

    /* renamed from: d */
    void mo65629d(String str);
}
