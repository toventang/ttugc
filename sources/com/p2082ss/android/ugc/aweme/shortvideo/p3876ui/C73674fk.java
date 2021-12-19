package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.fk */
final /* synthetic */ class C73674fk implements AbstractC73799a {

    /* renamed from: a */
    private final VideoRecordNewActivity f165508a;

    /* renamed from: b */
    private final AbstractC84089j f165509b;

    static {
        Covode.recordClassIndex(86412);
    }

    C73674fk(VideoRecordNewActivity videoRecordNewActivity, AbstractC84089j jVar) {
        this.f165508a = videoRecordNewActivity;
        this.f165509b = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        VideoRecordNewActivity videoRecordNewActivity = this.f165508a;
        AbstractC84089j jVar = this.f165509b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jVar.mo23131m();
            return;
        }
        SafeHandler safeHandler = videoRecordNewActivity.f164813h;
        jVar.getClass();
        safeHandler.post(new RunnableC73682fs(jVar));
    }
}
