package com.p2082ss.android.ugc.aweme.music.p3477l;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.music.l.a */
public final class C60833a {

    /* renamed from: a */
    public static final C60833a f138246a = new C60833a();

    private C60833a() {
    }

    static {
        Covode.recordClassIndex(71390);
    }

    /* renamed from: a */
    public static boolean m110436a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo("com.moonvideo.android.resso", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
