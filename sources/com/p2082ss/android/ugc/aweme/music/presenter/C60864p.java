package com.p2082ss.android.ugc.aweme.music.presenter;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.p */
final /* synthetic */ class C60864p implements AbstractC84162c {

    /* renamed from: a */
    private final C60860n f138323a;

    static {
        Covode.recordClassIndex(71452);
    }

    C60864p(C60860n nVar) {
        this.f138323a = nVar;
    }

    @Override // com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c
    /* renamed from: a */
    public final void mo63046a(int i) {
        C60860n nVar = this.f138323a;
        nVar.f138318z = SystemClock.elapsedRealtime();
        ((AbstractC60866r) nVar.f92287i).mo98514b();
        MusicModel musicModel = nVar.f138301f;
        if (C16048b.m29633a().mo25421a(true, "remove_15s_cap_music", true)) {
            if (nVar.f138309q != null) {
                nVar.f138309q.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                long realAuditionDuration = (long) musicModel.getRealAuditionDuration();
                if (realAuditionDuration <= 0) {
                    C51423a.m95787a("MusicDetailFragment: audition_duration is zero, music id: " + musicModel.getMusicId());
                } else {
                    nVar.f138309q = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0134: IPUT  
                          (wrap: com.ss.android.ugc.aweme.music.presenter.n$2 : 0x0131: CONSTRUCTOR  (r0v43 com.ss.android.ugc.aweme.music.presenter.n$2) = (r4v0 'nVar' com.ss.android.ugc.aweme.music.presenter.n), (r1v22 'realAuditionDuration' long) call: com.ss.android.ugc.aweme.music.presenter.n.2.<init>(com.ss.android.ugc.aweme.music.presenter.n, long):void type: CONSTRUCTOR)
                          (r4v0 'nVar' com.ss.android.ugc.aweme.music.presenter.n)
                         com.ss.android.ugc.aweme.music.presenter.n.q android.os.CountDownTimer in method: com.ss.android.ugc.aweme.music.presenter.p.a(int):void, file: classes5.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0131: CONSTRUCTOR  (r0v43 com.ss.android.ugc.aweme.music.presenter.n$2) = (r4v0 'nVar' com.ss.android.ugc.aweme.music.presenter.n), (r1v22 'realAuditionDuration' long) call: com.ss.android.ugc.aweme.music.presenter.n.2.<init>(com.ss.android.ugc.aweme.music.presenter.n, long):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.music.presenter.p.a(int):void, file: classes5.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.music.presenter.n, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 33 more
                        */
                    /*
                    // Method dump skipped, instructions count: 317
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.presenter.C60864p.mo63046a(int):void");
                }
            }
