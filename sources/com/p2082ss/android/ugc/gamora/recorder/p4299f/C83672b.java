package com.p2082ss.android.ugc.gamora.recorder.p4299f;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69974j;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69976k;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69977l;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69943c;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69945d;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69946e;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69949f;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.recorder.f.b */
public final class C83672b extends AbstractC22186b implements AbstractC20382b {

    /* renamed from: b */
    public C69946e f186784b;

    /* renamed from: c */
    public AbstractC69974j f186785c;

    /* renamed from: d */
    public int f186786d;

    /* renamed from: e */
    public long f186787e = 15000;

    /* renamed from: f */
    public int f186788f;

    /* renamed from: g */
    public final AbstractC83671a f186789g;

    /* renamed from: h */
    private C69943c f186790h;

    /* renamed from: i */
    private final C69949f.AbstractC69951b f186791i = new C83673a(this);

    /* renamed from: j */
    private final AbstractC69976k f186792j = new C83676d(this);

    static {
        Covode.recordClassIndex(97562);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$b */
    public static final class C83674b implements AbstractC69974j.AbstractC69975a {

        /* renamed from: a */
        final /* synthetic */ C83672b f186794a;

        static {
            Covode.recordClassIndex(97564);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69974j.AbstractC69975a
        /* renamed from: a */
        public final void mo110413a() {
            this.f186794a.f186789g.mo110382b();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69974j.AbstractC69975a
        /* renamed from: c */
        public final void mo110415c() {
            this.f186794a.f186789g.mo110383c();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69974j.AbstractC69975a
        /* renamed from: b */
        public final void mo110414b() {
            this.f186794a.f186789g.mo110378a();
            this.f186794a.f186789g.mo110379a(this.f186794a.f186788f);
            this.f186794a.f186789g.mo110380a((long) this.f186794a.f186786d);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83674b(C83672b bVar) {
            this.f186794a = bVar;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$c */
    public static final class C83675c implements AbstractC69977l {

        /* renamed from: a */
        final /* synthetic */ C83672b f186795a;

        static {
            Covode.recordClassIndex(97565);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69977l
        /* renamed from: b */
        public final void mo110420b() {
            this.f186795a.f186789g.mo110378a();
            mo110419a();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69977l
        /* renamed from: a */
        public final void mo110419a() {
            AbstractC69974j jVar;
            if (this.f186795a.f52549m != null && (jVar = this.f186795a.f186785c) != null && !jVar.mo110390b()) {
                this.f186795a.f186789g.mo110381a(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83675c(C83672b bVar) {
            this.f186795a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$d */
    public static final class C83676d implements AbstractC69976k {

        /* renamed from: a */
        final /* synthetic */ C83672b f186796a;

        static {
            Covode.recordClassIndex(97566);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69976k
        /* renamed from: a */
        public final void mo110416a() {
            C69946e eVar = this.f186796a.f186784b;
            if (eVar != null) {
                eVar.mo110395a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83676d(C83672b bVar) {
            this.f186796a = bVar;
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$d$a */
        static final class C83677a implements C69946e.AbstractC69948a {

            /* renamed from: a */
            final /* synthetic */ C83676d f186797a;

            static {
                Covode.recordClassIndex(97567);
            }

            C83677a(C83676d dVar) {
                this.f186797a = dVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69946e.AbstractC69948a
            /* renamed from: a */
            public final void mo110397a(int i) {
                C69949f fVar = (C69949f) this.f186797a.f186796a.mo36386a("count_down");
                if (fVar != null) {
                    VolumeTapsView volumeTapsView = fVar.f156342a;
                    if (volumeTapsView == null) {
                        C89219l.m154710a("volumeTapsView");
                    }
                    volumeTapsView.setProgress(i);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69976k
        /* renamed from: a */
        public final void mo110417a(int i, int i2) {
            this.f186796a.f186788f = i2;
            C83672b bVar = this.f186796a;
            bVar.f186786d = (int) Math.min(bVar.f186787e, (long) i);
            AbstractC69974j jVar = this.f186796a.f186785c;
            if (jVar != null) {
                jVar.mo110389a(i2);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69976k
        /* renamed from: a */
        public final void mo110418a(String str, int i, int i2) {
            if (str != null && this.f186796a.f52549m != null) {
                C69946e eVar = this.f186796a.f186784b;
                if (eVar != null) {
                    eVar.mo110395a();
                }
                this.f186796a.f186784b = new C69946e(this.f186796a.mo36486t(), Uri.parse(str));
                C69946e eVar2 = this.f186796a.f186784b;
                if (eVar2 != null) {
                    eVar2.f156333c = new C83677a(this);
                }
                C69946e eVar3 = this.f186796a.f186784b;
                if (eVar3 != null && eVar3.f156331a != null) {
                    eVar3.f156331a.seekTo(i);
                    eVar3.f156331a.start();
                    eVar3.f156334d = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004b: IPUT  
                          (wrap: com.ss.android.ugc.aweme.shortvideo.countdown.e$1 : 0x0048: CONSTRUCTOR  (r0v11 com.ss.android.ugc.aweme.shortvideo.countdown.e$1) = (r2v1 'eVar3' com.ss.android.ugc.aweme.shortvideo.countdown.e), (r7v0 'i2' int) call: com.ss.android.ugc.aweme.shortvideo.countdown.e.1.<init>(com.ss.android.ugc.aweme.shortvideo.countdown.e, int):void type: CONSTRUCTOR)
                          (r2v1 'eVar3' com.ss.android.ugc.aweme.shortvideo.countdown.e)
                         com.ss.android.ugc.aweme.shortvideo.countdown.e.d java.lang.Runnable in method: com.ss.android.ugc.gamora.recorder.f.b.d.a(java.lang.String, int, int):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: CONSTRUCTOR  (r0v11 com.ss.android.ugc.aweme.shortvideo.countdown.e$1) = (r2v1 'eVar3' com.ss.android.ugc.aweme.shortvideo.countdown.e), (r7v0 'i2' int) call: com.ss.android.ugc.aweme.shortvideo.countdown.e.1.<init>(com.ss.android.ugc.aweme.shortvideo.countdown.e, int):void type: CONSTRUCTOR in method: com.ss.android.ugc.gamora.recorder.f.b.d.a(java.lang.String, int, int):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 28 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.countdown.e, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 32 more
                        */
                    /*
                        this = this;
                        if (r5 == 0) goto L_0x0008
                        com.ss.android.ugc.gamora.recorder.f.b r0 = r4.f186796a
                        android.app.Activity r0 = r0.f52549m
                        if (r0 != 0) goto L_0x0009
                    L_0x0008:
                        return
                    L_0x0009:
                        com.ss.android.ugc.gamora.recorder.f.b r0 = r4.f186796a
                        com.ss.android.ugc.aweme.shortvideo.countdown.e r0 = r0.f186784b
                        if (r0 == 0) goto L_0x0012
                        r0.mo110395a()
                    L_0x0012:
                        com.ss.android.ugc.gamora.recorder.f.b r3 = r4.f186796a
                        com.ss.android.ugc.aweme.shortvideo.countdown.e r2 = new com.ss.android.ugc.aweme.shortvideo.countdown.e
                        com.ss.android.ugc.gamora.recorder.f.b r0 = r4.f186796a
                        android.app.Activity r1 = r0.mo36486t()
                        android.net.Uri r0 = android.net.Uri.parse(r5)
                        r2.<init>(r1, r0)
                        r3.f186784b = r2
                        com.ss.android.ugc.gamora.recorder.f.b r0 = r4.f186796a
                        com.ss.android.ugc.aweme.shortvideo.countdown.e r1 = r0.f186784b
                        if (r1 == 0) goto L_0x0032
                        com.ss.android.ugc.gamora.recorder.f.b$d$a r0 = new com.ss.android.ugc.gamora.recorder.f.b$d$a
                        r0.<init>(r4)
                        r1.f156333c = r0
                    L_0x0032:
                        com.ss.android.ugc.gamora.recorder.f.b r0 = r4.f186796a
                        com.ss.android.ugc.aweme.shortvideo.countdown.e r2 = r0.f186784b
                        if (r2 == 0) goto L_0x0008
                        android.media.MediaPlayer r0 = r2.f156331a
                        if (r0 == 0) goto L_0x0008
                        android.media.MediaPlayer r0 = r2.f156331a
                        r0.seekTo(r6)
                        android.media.MediaPlayer r0 = r2.f156331a
                        r0.start()
                        com.ss.android.ugc.aweme.shortvideo.countdown.e$1 r0 = new com.ss.android.ugc.aweme.shortvideo.countdown.e$1
                        r0.<init>(r7)
                        r2.f156334d = r0
                        android.os.Handler r1 = r2.f156332b
                        java.lang.Runnable r0 = r2.f156334d
                        r1.post(r0)
                        goto L_0x0008
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.p4299f.C83672b.C83676d.mo110418a(java.lang.String, int, int):void");
                }
            }

            @Override // com.bytedance.scene.AbstractC22219j
            /* renamed from: w */
            public final void mo36490w() {
                super.mo36490w();
                C69946e eVar = this.f186784b;
                if (eVar != null && eVar.f156331a != null) {
                    try {
                        eVar.f156331a.start();
                        if (eVar.f156334d != null) {
                            eVar.f156332b.post(eVar.f156334d);
                        }
                    } catch (Exception unused) {
                    }
                }
            }

            @Override // com.bytedance.scene.AbstractC22219j
            /* renamed from: x */
            public final void mo36491x() {
                super.mo36491x();
                C69946e eVar = this.f186784b;
                if (!(eVar == null || eVar.f156331a == null)) {
                    try {
                        eVar.f156331a.pause();
                        if (eVar.f156334d != null) {
                            eVar.f156332b.removeCallbacks(eVar.f156334d);
                        }
                    } catch (Exception unused) {
                    }
                }
                AbstractC69974j jVar = this.f186785c;
                if (jVar != null) {
                    jVar.mo110388a();
                }
                C69943c cVar = this.f186790h;
                if (cVar != null) {
                    cVar.mo110386b();
                }
            }

            /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$a */
            public static final class C83673a implements C69949f.AbstractC69951b {

                /* renamed from: a */
                final /* synthetic */ C83672b f186793a;

                static {
                    Covode.recordClassIndex(97563);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C83673a(C83672b bVar) {
                    this.f186793a = bVar;
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69949f.AbstractC69951b
                /* renamed from: a */
                public final void mo110403a(int i) {
                    this.f186793a.f186789g.mo110379a(i);
                }
            }

            @Override // com.bytedance.jedi.arch.AbstractC20382b
            public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
                C89219l.m154721d(vm1, "");
                return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
            }

            public C83672b(AbstractC83671a aVar) {
                C89219l.m154721d(aVar, "");
                this.f186789g = aVar;
            }

            @Override // com.bytedance.scene.AbstractC22219j
            /* renamed from: a */
            public final void mo22704a(Bundle bundle) {
                super.mo22704a(bundle);
                C83674b bVar = new C83674b(this);
                Activity t = mo36486t();
                C89219l.m154716b(t, "");
                this.f186790h = new C69943c(t);
                View view = this.f52550n;
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) view;
                C69943c cVar = this.f186790h;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                this.f186785c = new C69945d(frameLayout, bVar, cVar);
                AbstractC1174ac a = C1181ae.m3881a(C22228c.m41832b(this), (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
                C89219l.m154716b(a, "");
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
                C89219l.m154716b(shortVideoContext, "");
                this.f186787e = shortVideoContext.f155817b.mo109899k();
                C14401a aVar = new C14401a();
                Activity t2 = mo36486t();
                C89219l.m154716b(t2, "");
                ((IVideoRecordPreferences) aVar.mo23215a(t2, IVideoRecordPreferences.class)).setShouldShowCountDownNewTag(false);
                C70625d a2 = C70612k.m124745a(shortVideoContext.f155811au);
                C83675c cVar2 = new C83675c(this);
                C69949f fVar = new C69949f(new CountdownState(shortVideoContext.f155817b.f155669y, shortVideoContext.f155819d, shortVideoContext.f155817b.mo109896h(), shortVideoContext.f155817b.mo109895g(), (long) shortVideoContext.f155822g, shortVideoContext.f155817b.mo109899k(), a2));
                fVar.f156343b = this.f186792j;
                fVar.f156344c = cVar2;
                fVar.f156358x = this.f186791i;
                C89219l.m154721d(this, "");
                C89219l.m154721d("count_down", "");
                mo36387a(R.id.dg0, fVar, "count_down");
                this.f186789g.mo110381a(true);
            }

            @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
            /* renamed from: a */
            public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return mo22702a(layoutInflater, viewGroup);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
                C89219l.m154721d(vm1, "");
                C89219l.m154721d(bVar, "");
                return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
            }

            @Override // com.bytedance.scene.group.AbstractC22186b
            /* renamed from: b */
            public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                C89219l.m154721d(layoutInflater, "");
                C89219l.m154721d(viewGroup, "");
                View a = C1764a.m5927a(layoutInflater, R.layout.bhv, viewGroup, false);
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
                return (ViewGroup) a;
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(mVar, "");
                return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20382b
            public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(mVar, "");
                AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(mVar, "");
                return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20382b
            public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(mVar, "");
                AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20382b
            public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(mVar, "");
                AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(kVar2, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(qVar, "");
                return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(ahVar, "");
                return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(kVar2, "");
                C89219l.m154721d(kVar3, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(rVar, "");
                return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
            }

            @Override // com.bytedance.jedi.arch.AbstractC20468h
            public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
                C89219l.m154721d(jediViewModel, "");
                C89219l.m154721d(kVar, "");
                C89219l.m154721d(kVar2, "");
                C89219l.m154721d(kVar3, "");
                C89219l.m154721d(kVar4, "");
                C89219l.m154721d(ahVar, "");
                C89219l.m154721d(sVar, "");
                return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
            }
        }
