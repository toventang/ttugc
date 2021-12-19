package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68023bi;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f;
import p4560f.p4561a.AbstractC88973n;

/* renamed from: com.ss.android.ugc.aweme.share.ShareExtService */
public interface ShareExtService {

    /* renamed from: com.ss.android.ugc.aweme.share.ShareExtService$a */
    public static final class C68824a {
        static {
            Covode.recordClassIndex(81115);
        }
    }

    static {
        Covode.recordClassIndex(81114);
    }

    /* renamed from: a */
    Drawable mo109353a(Activity activity);

    /* renamed from: a */
    Drawable mo109354a(Activity activity, String str);

    /* renamed from: a */
    AbstractC68023bi mo109355a();

    /* renamed from: a */
    AbstractC69693h mo109356a(Activity activity, Aweme aweme, String str, String str2);

    /* renamed from: a */
    AbstractC69693h mo109357a(Aweme aweme, String str, String str2);

    /* renamed from: a */
    AbstractC88973n<String> mo109358a(String str, String str2, String str3);

    /* renamed from: a */
    void mo109359a(Context context, String str);

    /* renamed from: a */
    void mo109360a(String str);

    /* renamed from: a */
    void mo109361a(String str, int i);

    /* renamed from: a */
    void mo109362a(String str, Aweme aweme, Bundle bundle);

    /* renamed from: a */
    boolean mo109363a(Aweme aweme, Context context);

    /* renamed from: a */
    boolean mo109364a(C71900f fVar, Activity activity);

    /* renamed from: b */
    String mo109365b(Activity activity);

    /* renamed from: b */
    String[] mo109366b();

    /* renamed from: c */
    String mo109367c();

    /* renamed from: d */
    String mo109368d();
}
