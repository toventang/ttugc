package com.p2082ss.android.ugc.aweme.ftc.countdown;

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
import com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52496l;
import com.p2082ss.android.ugc.aweme.ftc.countdown.C52462e;
import com.p2082ss.android.ugc.aweme.ftc.countdown.C52465f;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.countdown.j */
public final class C52489j extends AbstractC22186b implements AbstractC20382b {

    /* renamed from: b */
    public C52462e f120881b;

    /* renamed from: c */
    public AbstractC52496l f120882c;

    /* renamed from: d */
    public int f120883d;

    /* renamed from: e */
    public long f120884e = 15000;

    /* renamed from: f */
    public int f120885f;

    /* renamed from: g */
    public final AbstractC52488i f120886g;

    /* renamed from: h */
    private C52459c f120887h;

    /* renamed from: i */
    private final C52465f.AbstractC52467b f120888i = new C52490a(this);

    /* renamed from: j */
    private final AbstractC52498m f120889j = new C52493d(this);

    static {
        Covode.recordClassIndex(61885);
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.j$b */
    public static final class C52491b implements AbstractC52496l.AbstractC52497a {

        /* renamed from: a */
        final /* synthetic */ C52489j f120891a;

        static {
            Covode.recordClassIndex(61887);
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52496l.AbstractC52497a
        /* renamed from: a */
        public final void mo88270a() {
            this.f120891a.f120886g.mo88236b();
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52496l.AbstractC52497a
        /* renamed from: b */
        public final void mo88271b() {
            this.f120891a.f120886g.mo88237c();
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52496l.AbstractC52497a
        /* renamed from: c */
        public final void mo88272c() {
            this.f120891a.f120886g.mo88232a();
            this.f120891a.f120886g.mo88233a(this.f120891a.f120885f);
            this.f120891a.f120886g.mo88234a((long) this.f120891a.f120883d);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52491b(C52489j jVar) {
            this.f120891a = jVar;
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.j$c */
    public static final class C52492c implements AbstractC52499n {

        /* renamed from: a */
        final /* synthetic */ C52489j f120892a;

        static {
            Covode.recordClassIndex(61888);
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52499n
        /* renamed from: b */
        public final void mo88274b() {
            this.f120892a.f120886g.mo88232a();
            mo88273a();
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52499n
        /* renamed from: a */
        public final void mo88273a() {
            AbstractC52496l lVar;
            if (this.f120892a.f52549m != null && (lVar = this.f120892a.f120882c) != null && !lVar.mo88244b()) {
                this.f120892a.f120886g.mo88235a(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52492c(C52489j jVar) {
            this.f120892a = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.j$d */
    public static final class C52493d implements AbstractC52498m {

        /* renamed from: a */
        final /* synthetic */ C52489j f120893a;

        static {
            Covode.recordClassIndex(61889);
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52498m
        /* renamed from: a */
        public final void mo88275a() {
            C52462e eVar = this.f120893a.f120881b;
            if (eVar != null) {
                eVar.mo88249a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52493d(C52489j jVar) {
            this.f120893a = jVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.j$d$a */
        static final class C52494a implements C52462e.AbstractC52464a {

            /* renamed from: a */
            final /* synthetic */ C52493d f120894a;

            static {
                Covode.recordClassIndex(61890);
            }

            C52494a(C52493d dVar) {
                this.f120894a = dVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.C52462e.AbstractC52464a
            /* renamed from: a */
            public final void mo88251a(int i) {
                C52465f fVar = (C52465f) this.f120894a.f120893a.mo36386a("count_down");
                if (fVar != null) {
                    VolumeTapsView volumeTapsView = fVar.f120833a;
                    if (volumeTapsView == null) {
                        C89219l.m154710a("volumeTapsView");
                    }
                    volumeTapsView.setProgress(i);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52498m
        /* renamed from: a */
        public final void mo88276a(int i, int i2) {
            this.f120893a.f120885f = i2;
            C52489j jVar = this.f120893a;
            jVar.f120883d = (int) Math.min(jVar.f120884e, (long) i);
            AbstractC52496l lVar = this.f120893a.f120882c;
            if (lVar != null) {
                lVar.mo88243a(i2);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52498m
        /* renamed from: a */
        public final void mo88277a(String str, int i, int i2) {
            if (str != null && this.f120893a.f52549m != null) {
                C52462e eVar = this.f120893a.f120881b;
                if (eVar != null) {
                    eVar.mo88249a();
                }
                this.f120893a.f120881b = new C52462e(this.f120893a.mo36486t(), Uri.parse(str));
                C52462e eVar2 = this.f120893a.f120881b;
                if (eVar2 != null) {
                    eVar2.f120824c = new C52494a(this);
                }
                C52462e eVar3 = this.f120893a.f120881b;
                if (eVar3 != null && eVar3.f120822a != null) {
                    eVar3.f120822a.seekTo(i);
                    eVar3.f120822a.start();
                    eVar3.f120825d = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004b: IPUT  
                          (wrap: com.ss.android.ugc.aweme.ftc.countdown.e$1 : 0x0048: CONSTRUCTOR  (r0v11 com.ss.android.ugc.aweme.ftc.countdown.e$1) = (r2v1 'eVar3' com.ss.android.ugc.aweme.ftc.countdown.e), (r7v0 'i2' int) call: com.ss.android.ugc.aweme.ftc.countdown.e.1.<init>(com.ss.android.ugc.aweme.ftc.countdown.e, int):void type: CONSTRUCTOR)
                          (r2v1 'eVar3' com.ss.android.ugc.aweme.ftc.countdown.e)
                         com.ss.android.ugc.aweme.ftc.countdown.e.d java.lang.Runnable in method: com.ss.android.ugc.aweme.ftc.countdown.j.d.a(java.lang.String, int, int):void, file: classes10.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: CONSTRUCTOR  (r0v11 com.ss.android.ugc.aweme.ftc.countdown.e$1) = (r2v1 'eVar3' com.ss.android.ugc.aweme.ftc.countdown.e), (r7v0 'i2' int) call: com.ss.android.ugc.aweme.ftc.countdown.e.1.<init>(com.ss.android.ugc.aweme.ftc.countdown.e, int):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.ftc.countdown.j.d.a(java.lang.String, int, int):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 28 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.ftc.countdown.e, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 32 more
                        */
                    /*
                        this = this;
                        if (r5 == 0) goto L_0x0008
                        com.ss.android.ugc.aweme.ftc.countdown.j r0 = r4.f120893a
                        android.app.Activity r0 = r0.f52549m
                        if (r0 != 0) goto L_0x0009
                    L_0x0008:
                        return
                    L_0x0009:
                        com.ss.android.ugc.aweme.ftc.countdown.j r0 = r4.f120893a
                        com.ss.android.ugc.aweme.ftc.countdown.e r0 = r0.f120881b
                        if (r0 == 0) goto L_0x0012
                        r0.mo88249a()
                    L_0x0012:
                        com.ss.android.ugc.aweme.ftc.countdown.j r3 = r4.f120893a
                        com.ss.android.ugc.aweme.ftc.countdown.e r2 = new com.ss.android.ugc.aweme.ftc.countdown.e
                        com.ss.android.ugc.aweme.ftc.countdown.j r0 = r4.f120893a
                        android.app.Activity r1 = r0.mo36486t()
                        android.net.Uri r0 = android.net.Uri.parse(r5)
                        r2.<init>(r1, r0)
                        r3.f120881b = r2
                        com.ss.android.ugc.aweme.ftc.countdown.j r0 = r4.f120893a
                        com.ss.android.ugc.aweme.ftc.countdown.e r1 = r0.f120881b
                        if (r1 == 0) goto L_0x0032
                        com.ss.android.ugc.aweme.ftc.countdown.j$d$a r0 = new com.ss.android.ugc.aweme.ftc.countdown.j$d$a
                        r0.<init>(r4)
                        r1.f120824c = r0
                    L_0x0032:
                        com.ss.android.ugc.aweme.ftc.countdown.j r0 = r4.f120893a
                        com.ss.android.ugc.aweme.ftc.countdown.e r2 = r0.f120881b
                        if (r2 == 0) goto L_0x0008
                        android.media.MediaPlayer r0 = r2.f120822a
                        if (r0 == 0) goto L_0x0008
                        android.media.MediaPlayer r0 = r2.f120822a
                        r0.seekTo(r6)
                        android.media.MediaPlayer r0 = r2.f120822a
                        r0.start()
                        com.ss.android.ugc.aweme.ftc.countdown.e$1 r0 = new com.ss.android.ugc.aweme.ftc.countdown.e$1
                        r0.<init>(r7)
                        r2.f120825d = r0
                        android.os.Handler r1 = r2.f120823b
                        java.lang.Runnable r0 = r2.f120825d
                        r1.post(r0)
                        goto L_0x0008
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.countdown.C52489j.C52493d.mo88277a(java.lang.String, int, int):void");
                }
            }

            @Override // com.bytedance.scene.AbstractC22219j
            /* renamed from: w */
            public final void mo36490w() {
                super.mo36490w();
                C52462e eVar = this.f120881b;
                if (eVar != null && eVar.f120822a != null) {
                    try {
                        eVar.f120822a.start();
                        if (eVar.f120825d != null) {
                            eVar.f120823b.post(eVar.f120825d);
                        }
                    } catch (Exception unused) {
                    }
                }
            }

            @Override // com.bytedance.scene.AbstractC22219j
            /* renamed from: x */
            public final void mo36491x() {
                super.mo36491x();
                C52462e eVar = this.f120881b;
                if (!(eVar == null || eVar.f120822a == null)) {
                    try {
                        eVar.f120822a.pause();
                        if (eVar.f120825d != null) {
                            eVar.f120823b.removeCallbacks(eVar.f120825d);
                        }
                    } catch (Exception unused) {
                    }
                }
                AbstractC52496l lVar = this.f120882c;
                if (lVar != null) {
                    lVar.mo88242a();
                }
                C52459c cVar = this.f120887h;
                if (cVar != null) {
                    cVar.mo88240b();
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.j$a */
            public static final class C52490a implements C52465f.AbstractC52467b {

                /* renamed from: a */
                final /* synthetic */ C52489j f120890a;

                static {
                    Covode.recordClassIndex(61886);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C52490a(C52489j jVar) {
                    this.f120890a = jVar;
                }

                @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.C52465f.AbstractC52467b
                /* renamed from: a */
                public final void mo88257a(int i) {
                    this.f120890a.f120886g.mo88233a(i);
                }
            }

            @Override // com.bytedance.jedi.arch.AbstractC20382b
            public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
                C89219l.m154721d(vm1, "");
                return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
            }

            public C52489j(AbstractC52488i iVar) {
                C89219l.m154721d(iVar, "");
                this.f120886g = iVar;
            }

            @Override // com.bytedance.scene.AbstractC22219j
            /* renamed from: a */
            public final void mo22704a(Bundle bundle) {
                super.mo22704a(bundle);
                C52491b bVar = new C52491b(this);
                Activity t = mo36486t();
                C89219l.m154716b(t, "");
                this.f120887h = new C52459c(t);
                View view = this.f52550n;
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) view;
                C52459c cVar = this.f120887h;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                this.f120882c = new C52461d(frameLayout, bVar, cVar);
                AbstractC1174ac a = C1181ae.m3881a(C22228c.m41832b(this), (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
                C89219l.m154716b(a, "");
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
                C89219l.m154716b(shortVideoContext, "");
                this.f120884e = shortVideoContext.f155817b.mo109899k();
                C14401a aVar = new C14401a();
                Activity t2 = mo36486t();
                C89219l.m154716b(t2, "");
                ((IVideoRecordPreferences) aVar.mo23215a(t2, IVideoRecordPreferences.class)).setShouldShowCountDownNewTag(false);
                C70625d a2 = C70612k.m124745a(shortVideoContext.f155811au);
                C52492c cVar2 = new C52492c(this);
                FTCCountdownState fTCCountdownState = new FTCCountdownState(shortVideoContext.f155817b.f155669y, shortVideoContext.f155819d, shortVideoContext.f155817b.mo109896h(), shortVideoContext.f155817b.mo109895g(), (long) shortVideoContext.f155822g, shortVideoContext.f155817b.mo109899k(), a2);
                C89219l.m154721d(fTCCountdownState, "");
                C52465f fVar = new C52465f(fTCCountdownState);
                fVar.f120834b = this.f120889j;
                fVar.f120835c = cVar2;
                fVar.f120849x = this.f120888i;
                C89219l.m154721d(this, "");
                C89219l.m154721d("count_down", "");
                mo36387a(R.id.dg0, fVar, "count_down");
                this.f120886g.mo88235a(true);
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
                View a = C1764a.m5927a(layoutInflater, R.layout.a35, viewGroup, false);
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
