package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.net.URLEncoder;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.b */
public final class C56612b {
    static {
        Covode.recordClassIndex(66456);
    }

    /* renamed from: a */
    public static final boolean m102594a(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        C89219l.m154716b(packageManager, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            String concat = "https://api.whatsapp.com/send?phone=".concat(String.valueOf(str));
            if (C80537hk.m139613a(str2)) {
                concat = concat + "&text=" + URLEncoder.encode(str2, "UTF-8");
            }
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse(concat));
            if (intent.resolveActivity(packageManager) == null) {
                return false;
            }
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
