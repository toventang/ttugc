package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.ICrossPlatformLegacyService */
public interface ICrossPlatformLegacyService {
    static {
        Covode.recordClassIndex(37948);
    }

    /* renamed from: a */
    <T> T mo57032a(Object obj, Class<T> cls);

    /* renamed from: a */
    String mo57033a(String str);

    /* renamed from: a */
    void mo57034a();

    /* renamed from: a */
    void mo57035a(Activity activity, Uri.Builder builder);

    /* renamed from: a */
    void mo57036a(Activity activity, View view, float f, String... strArr);

    /* renamed from: a */
    void mo57037a(Activity activity, String str);

    /* renamed from: a */
    void mo57038a(Context context, Aweme aweme, String str);

    /* renamed from: a */
    boolean mo57039a(Context context);

    /* renamed from: a */
    boolean mo57040a(Context context, Uri uri);

    /* renamed from: a */
    boolean mo57041a(Context context, String str);

    /* renamed from: a */
    boolean mo57042a(Uri uri);

    /* renamed from: b */
    int mo57043b();

    /* renamed from: b */
    void mo57044b(Context context, Aweme aweme, String str);

    /* renamed from: b */
    boolean mo57045b(Context context, Uri uri);

    /* renamed from: c */
    Locale mo57046c();

    /* renamed from: c */
    void mo57047c(Context context, Aweme aweme, String str);

    /* renamed from: c */
    boolean mo57048c(Context context, Uri uri);

    /* renamed from: d */
    String mo57049d();

    /* renamed from: d */
    boolean mo57050d(Context context, Uri uri);

    /* renamed from: e */
    String mo57051e();

    /* renamed from: e */
    boolean mo57052e(Context context, Uri uri);

    /* renamed from: f */
    boolean mo57053f(Context context, Uri uri);
}
