package com.p2082ss.android.ugc.aweme.ftc;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;

/* renamed from: com.ss.android.ugc.aweme.ftc.i */
final /* synthetic */ class C52613i implements AbstractC73799a {

    /* renamed from: a */
    private final FTCVideoRecordNewActivity f121128a;

    /* renamed from: b */
    private final AbstractC84089j f121129b;

    static {
        Covode.recordClassIndex(62009);
    }

    C52613i(FTCVideoRecordNewActivity fTCVideoRecordNewActivity, AbstractC84089j jVar) {
        this.f121128a = fTCVideoRecordNewActivity;
        this.f121129b = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f121128a;
        AbstractC84089j jVar = this.f121129b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jVar.mo23131m();
            return;
        }
        SafeHandler safeHandler = fTCVideoRecordNewActivity.f119416h;
        jVar.getClass();
        safeHandler.post(new RunnableC52797q(jVar));
    }
}
