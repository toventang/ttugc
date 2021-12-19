package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.ActivityC17733a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.cy */
public final class C80320cy {
    static {
        Covode.recordClassIndex(93588);
    }

    /* renamed from: a */
    public static final Fragment m139242a(Activity activity) {
        Fragment rootFragment;
        C89219l.m154721d(activity, "");
        if (!(activity instanceof ActivityC17733a)) {
            activity = null;
        }
        ActivityC17733a aVar = (ActivityC17733a) activity;
        if (aVar == null || (rootFragment = aVar.getRootFragment()) == null) {
            return null;
        }
        return rootFragment;
    }
}
