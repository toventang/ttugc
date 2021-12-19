package com.p2082ss.android.ugc.musicprovider.p4320c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;
import com.p2082ss.android.ugc.musicprovider.p4318a.C84126a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.musicprovider.c.a */
public final class C84131a implements AbstractC61066c {

    /* renamed from: a */
    public AbstractC61066c f187748a;

    /* renamed from: b */
    private ExecutorService f187749b;

    /* renamed from: c */
    private final String f187750c;

    static {
        Covode.recordClassIndex(98030);
    }

    public C84131a(byte b) {
        this();
    }

    private /* synthetic */ C84131a() {
        this("");
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.a$a */
    static final class CallableC84132a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C84131a f187751a;

        static {
            Covode.recordClassIndex(98031);
        }

        CallableC84132a(C84131a aVar) {
            this.f187751a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC61066c cVar = this.f187751a.f187748a;
            if (cVar == null) {
                return null;
            }
            cVar.mo98590b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.a$b */
    static final class CallableC84133b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C84131a f187752a;

        static {
            Covode.recordClassIndex(98032);
        }

        CallableC84133b(C84131a aVar) {
            this.f187752a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC61066c cVar = this.f187752a.f187748a;
            if (cVar == null) {
                return null;
            }
            cVar.mo98585a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.a$e */
    static final class CallableC84136e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C84131a f187757a;

        static {
            Covode.recordClassIndex(98035);
        }

        CallableC84136e(C84131a aVar) {
            this.f187757a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC61066c cVar = this.f187757a.f187748a;
            if (cVar == null) {
                return null;
            }
            cVar.mo98592d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.a$f */
    static final class CallableC84137f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C84131a f187758a;

        /* renamed from: b */
        final /* synthetic */ AbstractC84160a f187759b;

        static {
            Covode.recordClassIndex(98036);
        }

        CallableC84137f(C84131a aVar, AbstractC84160a aVar2) {
            this.f187758a = aVar;
            this.f187759b = aVar2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC61066c cVar = this.f187758a.f187748a;
            if (cVar == null) {
                return null;
            }
            cVar.mo98587a(this.f187759b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.a$g */
    static final class CallableC84138g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C84131a f187760a;

        /* renamed from: b */
        final /* synthetic */ AbstractC84161b f187761b;

        static {
            Covode.recordClassIndex(98037);
        }

        CallableC84138g(C84131a aVar, AbstractC84161b bVar) {
            this.f187760a = aVar;
            this.f187761b = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC61066c cVar = this.f187760a.f187748a;
            if (cVar == null) {
                return null;
            }
            cVar.mo98588a(this.f187761b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.a$h */
    static final class CallableC84139h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C84131a f187762a;

        /* renamed from: b */
        final /* synthetic */ AbstractC84162c f187763b;

        static {
            Covode.recordClassIndex(98038);
        }

        CallableC84139h(C84131a aVar, AbstractC84162c cVar) {
            this.f187762a = aVar;
            this.f187763b = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC61066c cVar = this.f187762a.f187748a;
            if (cVar == null) {
                return null;
            }
            cVar.mo98589a(this.f187763b);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98585a() {
        C1731i.m5640b(new CallableC84133b(this), this.f187749b);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: b */
    public final void mo98590b() {
        C1731i.m5640b(new CallableC84132a(this), this.f187749b);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: c */
    public final void mo98591c() {
        C1731i.m5640b(new CallableC84135d(this), this.f187749b);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: d */
    public final void mo98592d() {
        C1731i.m5640b(new CallableC84136e(this), this.f187749b);
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.a$c */
    static final class CallableC84134c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C84131a f187753a;

        /* renamed from: b */
        final /* synthetic */ C84126a f187754b;

        /* renamed from: c */
        final /* synthetic */ boolean f187755c;

        static {
            Covode.recordClassIndex(98033);
        }

        CallableC84134c(C84131a aVar, C84126a aVar2, boolean z) {
            this.f187753a = aVar;
            this.f187754b = aVar2;
            this.f187755c = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC61066c cVar = this.f187753a.f187748a;
            if (cVar == null) {
                return null;
            }
            cVar.mo98586a(this.f187754b, this.f187755c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.a$d */
    static final class CallableC84135d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C84131a f187756a;

        static {
            Covode.recordClassIndex(98034);
        }

        CallableC84135d(C84131a aVar) {
            this.f187756a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC61066c cVar = this.f187756a.f187748a;
            if (cVar != null) {
                cVar.mo98591c();
            }
            this.f187756a.f187748a = null;
            return C89391z.f203057a;
        }
    }

    private C84131a(String str) {
        this.f187750c = str;
        this.f187748a = new C84154e(str);
        this.f187749b = C84145d.f187790j.f187793b;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98587a(AbstractC84160a aVar) {
        C1731i.m5640b(new CallableC84137f(this, aVar), this.f187749b);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98588a(AbstractC84161b bVar) {
        C1731i.m5640b(new CallableC84138g(this, bVar), this.f187749b);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98589a(AbstractC84162c cVar) {
        C1731i.m5640b(new CallableC84139h(this, cVar), this.f187749b);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c
    /* renamed from: a */
    public final void mo98586a(C84126a aVar, boolean z) {
        C89219l.m154721d(aVar, "");
        C1731i.m5640b(new CallableC84134c(this, aVar, z), this.f187749b);
    }
}
