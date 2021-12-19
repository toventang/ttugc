package com.lynx.tasm.image;

import android.util.DisplayMetrics;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.image.C28794b;
import com.lynx.tasm.utils.C28930n;
import com.lynx.tasm.utils.ColorUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.image.a */
public final class C28792a {
    static {
        Covode.recordClassIndex(34899);
    }

    /* renamed from: a */
    public static C28794b.C28795a m57642a(String str, LynxBaseUI lynxBaseUI) {
        int round;
        if (str == null) {
            return null;
        }
        String[] split = str.split(" +");
        if (split.length != 4) {
            return null;
        }
        try {
            UIBody uIBody = lynxBaseUI.mContext.f67068i;
            float f = lynxBaseUI.mFontSize;
            DisplayMetrics displayMetrics = lynxBaseUI.mContext.f67075p;
            int round2 = Math.round(C28930n.m57955a(split[0], uIBody.mFontSize, f, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, displayMetrics));
            int round3 = Math.round(C28930n.m57955a(split[1], uIBody.mFontSize, f, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, displayMetrics));
            int a = ColorUtils.m57910a(split[3]);
            if (a != 0 && (round = Math.round(C28930n.m57955a(split[2], uIBody.mFontSize, f, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, displayMetrics))) > 0) {
                return new C28794b.C28795a(round2, round3, a, round);
            }
            return null;
        } catch (Exception e) {
            LLog.m56862d("Drop Shadow", str + Log.getStackTraceString(e));
            return null;
        }
    }
}
