package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.w */
public final class C73818w implements AbstractC30012b {

    /* renamed from: a */
    public Handler f165720a;

    /* renamed from: b */
    public AbstractC30012b f165721b;

    static {
        Covode.recordClassIndex(86563);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.w$a */
    static final class RunnableC73819a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73818w f165722a;

        /* renamed from: b */
        final /* synthetic */ int f165723b;

        static {
            Covode.recordClassIndex(86564);
        }

        RunnableC73819a(C73818w wVar, int i) {
            this.f165722a = wVar;
            this.f165723b = i;
        }

        public final void run() {
            this.f165722a.f165721b.mo52865a(this.f165723b);
        }
    }

    @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
    /* renamed from: a */
    public final void mo52865a(int i) {
        this.f165720a.post(new RunnableC73819a(this, i));
    }

    @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
    /* renamed from: a */
    public final void mo52866a(int i, int i2) {
        this.f165721b.mo52866a(i, i2);
    }

    public C73818w(Handler handler, AbstractC30012b bVar) {
        C89219l.m154721d(handler, "");
        C89219l.m154721d(bVar, "");
        this.f165720a = handler;
        this.f165721b = bVar;
    }
}
