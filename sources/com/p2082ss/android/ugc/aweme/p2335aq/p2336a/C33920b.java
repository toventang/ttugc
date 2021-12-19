package com.p2082ss.android.ugc.aweme.p2335aq.p2336a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34501a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40520b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.net.URLEncoder;

/* renamed from: com.ss.android.ugc.aweme.aq.a.b */
public final class C33920b {

    /* renamed from: a */
    public static AbstractC33921c f80231a;

    static {
        Covode.recordClassIndex(40839);
        try {
            f80231a = (AbstractC33921c) C34501a.m70486a(C17867d.m33078a(), AbstractC33921c.class);
        } catch (Throwable th) {
            C51423a.m95791b(3, null, "Get show xmas tree SP failed." + th.getMessage());
        }
    }

    /* renamed from: a */
    private static void m69458a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m69459a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (str.startsWith("https://") || str.startsWith("http://")) {
                try {
                    sb.append("aweme://ame/webview/?url=").append(URLEncoder.encode(str, "ISO-8859-1"));
                } catch (Exception unused) {
                }
                Intent a = C40520b.m81719a(context, Uri.parse(sb.toString()));
                a.setClass(context, CrossPlatformActivity.class);
                a.putExtra("hide_more", false);
                a.putExtra("bundle_auto_play_audio", true);
                m69458a(context, a);
                return;
            }
            sb.append(str);
            C36125t.m73598a(C36125t.m73591a(), sb.toString());
        }
    }
}
