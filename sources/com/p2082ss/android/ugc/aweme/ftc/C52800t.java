package com.p2082ss.android.ugc.aweme.ftc;

import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.ftc.t */
final /* synthetic */ class C52800t implements AbstractC2565m {

    /* renamed from: a */
    private final FTCVideoRecordNewActivity f121496a;

    static {
        Covode.recordClassIndex(62199);
    }

    C52800t(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f121496a = fTCVideoRecordNewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f121496a;
        if (((Boolean) obj).booleanValue() && fTCVideoRecordNewActivity.f119431w) {
            fTCVideoRecordNewActivity.f119431w = false;
            C84911q.m145921a("VideoRecordNewActivity => addFragment by getFrameAvailableEvent");
            fTCVideoRecordNewActivity.f119416h.post(new RunnableC52798r(fTCVideoRecordNewActivity));
        }
    }
}
