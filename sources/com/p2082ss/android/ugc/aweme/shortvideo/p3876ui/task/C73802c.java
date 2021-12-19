package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.c */
public final class C73802c implements AbstractC73799a {

    /* renamed from: a */
    public final ActivityC0945e f165689a;

    static {
        Covode.recordClassIndex(86545);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        this.f165689a.runOnUiThread(new RunnableC73803a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.c$a */
    static final class RunnableC73803a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73802c f165690a;

        static {
            Covode.recordClassIndex(86546);
        }

        RunnableC73803a(C73802c cVar) {
            this.f165690a = cVar;
        }

        public final void run() {
            C63253l.f143623a.mo73308d().mo101651a().mo101662c(this.f165690a.f165689a);
        }
    }

    public C73802c(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f165689a = eVar;
    }
}
