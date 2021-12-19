package com.p2082ss.android.ugc.aweme.music;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.c */
public final class C60741c implements AbstractC61065b {

    /* renamed from: a */
    public final AbstractC61065b f138032a;

    static {
        Covode.recordClassIndex(71297);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.c$a */
    static final class CallableC60742a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C60741c f138033a;

        static {
            Covode.recordClassIndex(71298);
        }

        CallableC60742a(C60741c cVar) {
            this.f138033a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f138033a.f138032a.mo69324a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.c$b */
    static final class CallableC60743b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C60741c f138034a;

        /* renamed from: b */
        final /* synthetic */ C84125a f138035b;

        static {
            Covode.recordClassIndex(71299);
        }

        CallableC60743b(C60741c cVar, C84125a aVar) {
            this.f138034a = cVar;
            this.f138035b = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f138034a.f138032a.mo69326a(this.f138035b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.c$c */
    static final class CallableC60744c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C60741c f138036a;

        /* renamed from: b */
        final /* synthetic */ int f138037b;

        static {
            Covode.recordClassIndex(71300);
        }

        CallableC60744c(C60741c cVar, int i) {
            this.f138036a = cVar;
            this.f138037b = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f138036a.f138032a.mo69325a(this.f138037b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.c$d */
    static final class CallableC60745d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C60741c f138038a;

        static {
            Covode.recordClassIndex(71301);
        }

        CallableC60745d(C60741c cVar) {
            this.f138038a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f138038a.f138032a.mo69328b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.c$e */
    static final class CallableC60746e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C60741c f138039a;

        /* renamed from: b */
        final /* synthetic */ String f138040b;

        /* renamed from: c */
        final /* synthetic */ MusicWaveBean f138041c;

        static {
            Covode.recordClassIndex(71302);
        }

        CallableC60746e(C60741c cVar, String str, MusicWaveBean musicWaveBean) {
            this.f138039a = cVar;
            this.f138040b = str;
            this.f138041c = musicWaveBean;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f138039a.f138032a.mo69327a(this.f138040b, this.f138041c);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
    /* renamed from: a */
    public final void mo69324a() {
        C1731i.m5640b(new CallableC60742a(this), C1731i.f5564c);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
    /* renamed from: b */
    public final void mo69328b() {
        C1731i.m5640b(new CallableC60745d(this), C1731i.f5564c);
    }

    public C60741c(AbstractC61065b bVar) {
        C89219l.m154721d(bVar, "");
        this.f138032a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
    /* renamed from: a */
    public final void mo69325a(int i) {
        C1731i.m5640b(new CallableC60744c(this, i), C1731i.f5564c);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
    /* renamed from: a */
    public final void mo69326a(C84125a aVar) {
        C89219l.m154721d(aVar, "");
        C1731i.m5640b(new CallableC60743b(this, aVar), C1731i.f5564c);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
    /* renamed from: a */
    public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
        C89219l.m154721d(str, "");
        C1731i.m5640b(new CallableC60746e(this, str, musicWaveBean), C1731i.f5564c);
    }
}
