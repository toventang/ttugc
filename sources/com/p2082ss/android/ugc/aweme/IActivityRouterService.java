package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.IActivityRouterService */
public interface IActivityRouterService {
    static {
        Covode.recordClassIndex(37941);
    }

    /* renamed from: a */
    Intent mo57025a(Context context, Uri uri);

    /* renamed from: a */
    Class<? extends Activity> mo57026a();

    /* renamed from: a */
    void mo57027a(Activity activity, Uri uri);
}
