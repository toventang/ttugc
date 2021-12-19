package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.tiktok.homepage.mainactivity.h */
public class C22752h {

    /* renamed from: a */
    public final Activity f53739a;

    static {
        Covode.recordClassIndex(26645);
    }

    public C22752h(Activity activity) {
        this.f53739a = activity;
    }

    /* renamed from: a */
    public static String m42919a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
