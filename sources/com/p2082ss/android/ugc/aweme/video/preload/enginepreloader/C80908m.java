package com.p2082ss.android.ugc.aweme.video.preload.enginepreloader;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.m */
public class C80908m implements AbstractC80897f {

    /* renamed from: a */
    private final AbstractC89244h f180902a = C89250i.m154773a((AbstractC89171a) new C80909a(this));

    /* renamed from: b */
    public final AbstractC80897f f180903b;

    static {
        Covode.recordClassIndex(94207);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo124300b() {
        return "preloader";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Handler mo124302c() {
        return (Handler) this.f180902a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.m$b */
    static final class RunnableC80910b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C80908m f180905a;

        static {
            Covode.recordClassIndex(94209);
        }

        RunnableC80910b(C80908m mVar) {
            this.f180905a = mVar;
        }

        public final void run() {
            this.f180905a.f180903b.mo124294a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.m$c */
    static final class RunnableC80911c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C80908m f180906a;

        /* renamed from: b */
        final /* synthetic */ C84241i f180907b;

        /* renamed from: c */
        final /* synthetic */ EnumC80893b f180908c;

        static {
            Covode.recordClassIndex(94210);
        }

        RunnableC80911c(C80908m mVar, C84241i iVar, EnumC80893b bVar) {
            this.f180906a = mVar;
            this.f180907b = iVar;
            this.f180908c = bVar;
        }

        public final void run() {
            this.f180906a.f180903b.mo124296a(this.f180907b, this.f180908c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.m$d */
    static final class RunnableC80912d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C80908m f180909a;

        /* renamed from: b */
        final /* synthetic */ C84241i f180910b;

        /* renamed from: c */
        final /* synthetic */ int f180911c;

        static {
            Covode.recordClassIndex(94211);
        }

        RunnableC80912d(C80908m mVar, C84241i iVar, int i) {
            this.f180909a = mVar;
            this.f180910b = iVar;
            this.f180911c = i;
        }

        public final void run() {
            this.f180909a.f180903b.mo124295a(this.f180910b, this.f180911c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.AbstractC80897f
    /* renamed from: a */
    public final void mo124294a() {
        mo124302c().post(new RunnableC80910b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.m$a */
    static final class C80909a extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        final /* synthetic */ C80908m f180904a;

        static {
            Covode.recordClassIndex(94208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80909a(C80908m mVar) {
            super(0);
            this.f180904a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            HandlerThread handlerThread = new HandlerThread(this.f180904a.mo124300b());
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    public C80908m(AbstractC80897f fVar) {
        C89219l.m154719c(fVar, "");
        this.f180903b = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.AbstractC80897f
    /* renamed from: a */
    public final void mo124295a(C84241i iVar, int i) {
        C89219l.m154719c(iVar, "");
        mo124302c().post(new RunnableC80912d(this, iVar, i));
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.AbstractC80897f
    /* renamed from: a */
    public final void mo124296a(C84241i iVar, EnumC80893b bVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(bVar, "");
        mo124302c().post(new RunnableC80911c(this, iVar, bVar));
    }
}
