package com.p2082ss.android.ugc.aweme.ttep;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;

/* renamed from: com.ss.android.ugc.aweme.ttep.h */
final /* synthetic */ class C79262h implements AbstractC73799a {

    /* renamed from: a */
    private final TTEPEffectPreviewActivity f178084a;

    /* renamed from: b */
    private final AbstractC84089j f178085b;

    static {
        Covode.recordClassIndex(92451);
    }

    C79262h(TTEPEffectPreviewActivity tTEPEffectPreviewActivity, AbstractC84089j jVar) {
        this.f178084a = tTEPEffectPreviewActivity;
        this.f178085b = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f178084a;
        AbstractC84089j jVar = this.f178085b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jVar.mo23131m();
            return;
        }
        SafeHandler safeHandler = tTEPEffectPreviewActivity.f177931h;
        jVar.getClass();
        safeHandler.post(new RunnableC79270p(jVar));
    }
}
