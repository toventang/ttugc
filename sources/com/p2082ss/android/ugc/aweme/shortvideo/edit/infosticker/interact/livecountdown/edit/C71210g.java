package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit;

import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.g */
public final class C71210g {
    static {
        Covode.recordClassIndex(83720);
    }

    /* renamed from: a */
    public static final String m125829a(int i) {
        if (i <= 9) {
            return "0".concat(String.valueOf(i));
        }
        return String.valueOf(i);
    }

    /* renamed from: a */
    public static final boolean m125830a(View view, int i, int i2) {
        C89219l.m154721d(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (i < i3 || i > i3 + width || i2 < i4 || i2 > i4 + height) {
            return false;
        }
        return true;
    }
}
