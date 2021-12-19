package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cp */
public final class C70003cp {

    /* renamed from: a */
    private int f156470a = -1;

    static {
        Covode.recordClassIndex(82417);
    }

    /* renamed from: a */
    public final int mo110445a(int i, int i2) {
        int i3 = 98;
        if (i == 0) {
            i3 = Math.min((int) (((float) i2) * 0.59f), 59);
        } else if (i == 2) {
            i3 = 60;
        } else if (i == 1) {
            i3 = Math.min((int) ((((float) i2) * 0.37f) + 61.0f), 98);
        } else if (i != 4) {
            if (i == 3) {
                i3 = 99;
            } else {
                i3 = 100;
            }
        }
        if (i3 < this.f156470a) {
            C84911q.m145926b("Error publish progress. step:" + i + " sdkProgress:" + i2 + " calculateProgress:" + i3 + " lastProgress" + this.f156470a);
            i3 = this.f156470a;
        }
        this.f156470a = i3;
        return i3;
    }
}
