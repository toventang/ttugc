package com.bytedance.android.livesdk.p456as;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

/* renamed from: com.bytedance.android.livesdk.as.h */
public enum EnumC6874h {
    COMMENT(UGCMonitor.EVENT_COMMENT),
    AT("AT"),
    INTERACT("interact"),
    GIFT("gift"),
    TASK_GIFT("task_gift"),
    RECHARGE("recharge"),
    TURNTABLE("turntable"),
    LUCKYBOX("lucky_box"),
    GUARD("guard"),
    START_LIVE("start_live"),
    COMMENT_GUIDE("comment_guide"),
    RECHARGE_GUIDE("recharge_guide");
    

    /* renamed from: a */
    String f17224a;

    public final String getFunc() {
        return this.f17224a;
    }

    static {
        Covode.recordClassIndex(7612);
    }

    private EnumC6874h(String str) {
        this.f17224a = str;
    }
}
