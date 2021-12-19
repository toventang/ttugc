package com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.p2624a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a.c */
public final class C38668c {

    /* renamed from: a */
    public static final C38668c f91373a = new C38668c();

    private C38668c() {
    }

    static {
        Covode.recordClassIndex(46209);
    }

    /* renamed from: a */
    public static final boolean m78458a(Context context, String str) {
        if (str == null) {
            return false;
        }
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=".concat(String.valueOf(str))));
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        return C38767w.m78632a(context, intent);
    }
}
