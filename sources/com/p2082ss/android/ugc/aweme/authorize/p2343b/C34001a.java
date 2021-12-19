package com.p2082ss.android.ugc.aweme.authorize.p2343b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62703g;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.b.a */
public final class C34001a {

    /* renamed from: a */
    public static final C34001a f80415a = new C34001a();

    private C34001a() {
    }

    static {
        Covode.recordClassIndex(40933);
    }

    /* renamed from: a */
    private static void m69590a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m69591a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("hide_nav_bar", false);
        intent.putExtra("use_webview_title", true);
        m69590a(context, intent);
    }

    /* renamed from: a */
    public static String m69589a(String str, int i, List<C62703g> list) {
        C89219l.m154721d(list, "");
        if (str == null) {
            return list.get(i).getScopeName();
        }
        return str + "," + list.get(i).getScopeName();
    }
}
