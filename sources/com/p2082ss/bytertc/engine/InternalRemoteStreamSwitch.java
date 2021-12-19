package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.InternalRemoteStreamSwitch */
public class InternalRemoteStreamSwitch {
    public boolean after_enable;
    public int after_video_index;
    public boolean before_enable;
    public int before_video_index;
    public boolean isScreen;
    public int reason;
    public String uid;

    static {
        Covode.recordClassIndex(100900);
    }

    public InternalRemoteStreamSwitch() {
    }

    public static InternalRemoteStreamSwitch create(String str, boolean z, int i, int i2, boolean z2, boolean z3, int i3) {
        return new InternalRemoteStreamSwitch(str, z, i, i2, z2, z3, i3);
    }

    public InternalRemoteStreamSwitch(String str, boolean z, int i, int i2, boolean z2, boolean z3, int i3) {
        this.uid = str;
        this.isScreen = z;
        this.before_video_index = i;
        this.after_video_index = i2;
        this.before_enable = z2;
        this.after_enable = z3;
        this.reason = i3;
    }
}
