package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.common.AbstractC39091d;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.openshare.Share;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;

/* renamed from: com.ss.android.ugc.aweme.utils.ha */
public final class C80522ha {
    static {
        Covode.recordClassIndex(93795);
    }

    /* renamed from: a */
    public static void m139586a() {
        for (Activity activity : ActivityStack.getActivityStack()) {
            activity.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ha$a */
    static class C80523a {
        @AbstractC27891c(mo46611a = "create_by")

        /* renamed from: a */
        String f180137a;

        static {
            Covode.recordClassIndex(93796);
        }

        C80523a(String str) {
            this.f180137a = str;
        }
    }

    /* renamed from: c */
    private static Bundle m139591c(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C39078ad m139583a(Intent intent) {
        Bundle d = m139593d(intent);
        if (d == null) {
            return null;
        }
        return new C39078ad(d);
    }

    /* renamed from: b */
    public static boolean m139590b(String str) {
        if (str != null) {
            return str.startsWith("image/");
        }
        return false;
    }

    /* renamed from: a */
    public static C39078ad m139584a(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null) {
            return null;
        }
        return AVExternalServiceImpl.m113114a().infoService().shareContextInfo(baseShortVideoContext);
    }

    /* renamed from: c */
    public static String m139592c(String str) {
        int lastIndexOf;
        if (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf >= str.length() - 1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: d */
    private static Bundle m139593d(Intent intent) {
        Bundle c = m139591c(intent);
        if (c == null || !TextUtils.isEmpty(c.getString("_aweme_open_sdk_params_client_key"))) {
            return c;
        }
        return null;
    }

    /* renamed from: a */
    public static Share.Request m139585a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Share.Request request = new Share.Request();
        request.fromBundle(bundle);
        return request;
    }

    /* renamed from: b */
    public static C39078ad m139589b(Intent intent) {
        Bundle c = m139591c(intent);
        if (c == null) {
            return null;
        }
        c.putString("_open_platform_content_json", new C27910f().mo46674b(new C80523a("system_share")));
        return new C39078ad(c);
    }

    /* renamed from: a */
    public static boolean m139587a(AbstractC39091d dVar) {
        if (dVar == null || TextUtils.isEmpty(dVar.mClientKey) || !dVar.mNeedShowDialog) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m139588a(String str) {
        if (str != null) {
            return str.startsWith("video/");
        }
        return false;
    }
}
