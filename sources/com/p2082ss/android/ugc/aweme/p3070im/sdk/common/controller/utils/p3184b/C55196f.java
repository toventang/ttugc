package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f */
public final class C55196f {
    static {
        Covode.recordClassIndex(64941);
    }

    /* renamed from: a */
    public static final boolean m100911a(Context context) {
        if (context == null) {
            return false;
        }
        if ((context instanceof Application) || !(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m100912a(Fragment fragment) {
        Context context = fragment.getContext();
        if (context == null || !fragment.isAdded() || !m100911a(context)) {
            return false;
        }
        return true;
    }
}
