package com.p2082ss.android.ugc.aweme.kids.p3302a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57154a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.a.a */
public final class C57072a implements AbstractC57123a {

    /* renamed from: a */
    public final AbstractC57123a f129940a;

    static {
        Covode.recordClassIndex(66966);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.a$a */
    static final class CallableC57073a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C57072a f129941a;

        static {
            Covode.recordClassIndex(66967);
        }

        CallableC57073a(C57072a aVar) {
            this.f129941a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f129941a.f129940a.mo94232b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.a$b */
    static final class CallableC57074b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C57072a f129942a;

        /* renamed from: b */
        final /* synthetic */ C57154a f129943b;

        static {
            Covode.recordClassIndex(66968);
        }

        CallableC57074b(C57072a aVar, C57154a aVar2) {
            this.f129942a = aVar;
            this.f129943b = aVar2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f129942a.f129940a.mo94230a(this.f129943b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.a$c */
    static final class CallableC57075c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C57072a f129944a;

        /* renamed from: b */
        final /* synthetic */ int f129945b;

        static {
            Covode.recordClassIndex(66969);
        }

        CallableC57075c(C57072a aVar, int i) {
            this.f129944a = aVar;
            this.f129945b = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f129944a.f129940a.mo94229a(this.f129945b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.a$d */
    static final class CallableC57076d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C57072a f129946a;

        static {
            Covode.recordClassIndex(66970);
        }

        CallableC57076d(C57072a aVar) {
            this.f129946a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f129946a.f129940a.mo94228a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.a$e */
    static final class CallableC57077e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C57072a f129947a;

        /* renamed from: b */
        final /* synthetic */ String f129948b;

        /* renamed from: c */
        final /* synthetic */ MusicWaveBean f129949c;

        static {
            Covode.recordClassIndex(66971);
        }

        CallableC57077e(C57072a aVar, String str, MusicWaveBean musicWaveBean) {
            this.f129947a = aVar;
            this.f129948b = str;
            this.f129949c = musicWaveBean;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f129947a.f129940a.mo94231a(this.f129948b, this.f129949c);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
    /* renamed from: a */
    public final void mo94228a() {
        C1731i.m5640b(new CallableC57076d(this), C1731i.f5564c);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
    /* renamed from: b */
    public final void mo94232b() {
        C1731i.m5640b(new CallableC57073a(this), C1731i.f5564c);
    }

    public C57072a(AbstractC57123a aVar) {
        C89219l.m154721d(aVar, "");
        this.f129940a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
    /* renamed from: a */
    public final void mo94229a(int i) {
        C1731i.m5640b(new CallableC57075c(this, i), C1731i.f5564c);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
    /* renamed from: a */
    public final void mo94230a(C57154a aVar) {
        C89219l.m154721d(aVar, "");
        C1731i.m5640b(new CallableC57074b(this, aVar), C1731i.f5564c);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
    /* renamed from: a */
    public final void mo94231a(String str, MusicWaveBean musicWaveBean) {
        C89219l.m154721d(str, "");
        C1731i.m5640b(new CallableC57077e(this, str, musicWaveBean), C1731i.f5564c);
    }
}
