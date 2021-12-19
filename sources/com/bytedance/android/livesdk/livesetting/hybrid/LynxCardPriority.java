package com.bytedance.android.livesdk.livesetting.hybrid;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import p4600h.p4601a.C89064i;

public final class LynxCardPriority {
    @Group(isDefault = true, value = "default")
    private static final String[] DEFAULT = {"shortTouchEcommerceUg", "shortTouchEcommerceVoucher", "shortTouchTreasureBox"};
    public static final LynxCardPriority INSTANCE = new LynxCardPriority();

    private LynxCardPriority() {
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    private final String[] getPriorityArray() {
        return SettingsManager.INSTANCE.getStringArrayValue(LynxCardPriority.class);
    }

    static {
        Covode.recordClassIndex(10463);
    }

    public final int getPriority(String str) {
        String[] priorityArray = getPriorityArray();
        if (TextUtils.isEmpty(str) || priorityArray.length == 0 || !C89064i.m154489a(priorityArray, str)) {
            return Integer.MAX_VALUE;
        }
        return C89064i.m154493b(priorityArray, str);
    }
}
