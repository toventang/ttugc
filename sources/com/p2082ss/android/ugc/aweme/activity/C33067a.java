package com.p2082ss.android.ugc.aweme.activity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a;

/* renamed from: com.ss.android.ugc.aweme.activity.a */
public final class C33067a {
    static {
        Covode.recordClassIndex(39878);
    }

    /* renamed from: a */
    public static final boolean m67725a(Activity activity) {
        if (activity instanceof AbstractActivityC18232a) {
            return ((AbstractActivityC18232a) activity).mo29094u();
        }
        if (!(activity instanceof ActivityC17312a) || ((ActivityC17312a) activity).isDestroyed()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m67726a(Activity activity, boolean z) {
        if (activity == null) {
            return z;
        }
        if (activity instanceof AbstractActivityC18232a) {
            return ((AbstractActivityC18232a) activity).mo29093t();
        }
        if (activity instanceof ActivityC17312a) {
            return ((ActivityC17312a) activity).isActive();
        }
        return z;
    }
}
