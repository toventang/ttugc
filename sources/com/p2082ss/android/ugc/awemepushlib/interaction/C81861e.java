package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.e */
public final class C81861e {

    /* renamed from: a */
    public static final List<String> f183022a = new ArrayList();

    static {
        Covode.recordClassIndex(95275);
    }

    /* renamed from: a */
    public static void m141757a(Intent intent) {
        if (intent != null) {
            intent.putExtra("from_notification", true);
            String uuid = UUID.randomUUID().toString();
            f183022a.add(uuid);
            intent.putExtra("from_notification_uuid", uuid);
        }
    }

    /* renamed from: a */
    static boolean m141758a(int i, Context context, Intent intent) {
        if (i == 0) {
            try {
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
