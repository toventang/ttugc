package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VEUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.el */
public final /* synthetic */ class RunnableC73642el implements Runnable {

    /* renamed from: a */
    private final C73560cj f165468a;

    /* renamed from: b */
    private final Pair f165469b;

    /* renamed from: c */
    private final VERecordData f165470c;

    static {
        Covode.recordClassIndex(86380);
    }

    RunnableC73642el(C73560cj cjVar, Pair pair, VERecordData vERecordData) {
        this.f165468a = cjVar;
        this.f165469b = pair;
        this.f165470c = vERecordData;
    }

    public final void run() {
        C73560cj cjVar = this.f165468a;
        Pair pair = this.f165469b;
        VERecordData vERecordData = this.f165470c;
        int i = (int) (cjVar.f165268K.mVideoCoverStartTm * 1000.0f);
        if (cjVar.f165268K.isUseTimeReverseEffect()) {
            i = (((Integer) pair.second).intValue() - ((Integer) pair.first).intValue()) - i;
        }
        VEUtils.getVideoThumb(vERecordData, i, -1, cjVar.f165346u.getHeight(), false, new C73644en(cjVar));
    }
}
