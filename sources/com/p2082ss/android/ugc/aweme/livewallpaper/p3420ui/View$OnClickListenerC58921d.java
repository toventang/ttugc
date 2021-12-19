package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.content.Context;
import android.view.View;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.d */
final /* synthetic */ class View$OnClickListenerC58921d implements View.OnClickListener {

    /* renamed from: a */
    private final LiveWallPaperPreviewActivity f134147a;

    static {
        Covode.recordClassIndex(69240);
    }

    View$OnClickListenerC58921d(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.f134147a = liveWallPaperPreviewActivity;
    }

    public final void onClick(View view) {
        MethodCollector.m26663i(6891);
        ClickAgent.onClick(view);
        LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = this.f134147a;
        if (!C58901f.m108226a(liveWallPaperPreviewActivity, liveWallPaperPreviewActivity.f134120e.getId(), (Aweme) null)) {
            C58895d.f134069e.mo96318a("paper_set", new C58895d.AbstractC58899a() {
                /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui.LiveWallPaperPreviewActivity.C589111 */

                static {
                    Covode.recordClassIndex(69229);
                }

                @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d.AbstractC58899a
                /* renamed from: a */
                public final void mo96314a(boolean z, String str) {
                    if (z) {
                        Context applicationContext = LiveWallPaperPreviewActivity.this.getApplicationContext();
                        if (C58003a.f132201c && applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                        new C79459a(applicationContext).mo123050a(R.string.hay).mo123053a();
                        C58901f.m108220a(0, "");
                        LiveWallPaperPreviewActivity.this.finish();
                    } else {
                        C58901f.m108220a(1, str);
                    }
                    C58901f.m108224a(LiveWallPaperPreviewActivity.this.f134120e.getId(), LiveWallPaperPreviewActivity.this.f134124i, z);
                }
            });
            liveWallPaperPreviewActivity.f134120e.setSource("paper_set");
            liveWallPaperPreviewActivity.mo96358a();
            C58895d dVar = C58895d.f134069e;
            LiveWallPaperBean liveWallPaperBean = liveWallPaperPreviewActivity.f134120e;
            dVar.f134072c.setId(liveWallPaperBean.getId());
            dVar.f134072c.setThumbnailPath(liveWallPaperBean.getThumbnailPath());
            dVar.f134072c.setVideoPath(liveWallPaperBean.getVideoPath());
            dVar.f134072c.setWidth(liveWallPaperBean.getWidth());
            dVar.f134072c.setHeight(liveWallPaperBean.getHeight());
            dVar.f134072c.setSource(liveWallPaperBean.getSource());
            dVar.f134072c.setVolume(liveWallPaperBean.getVolume());
            dVar.f134072c.setShouldMute(liveWallPaperBean.isShouldMute());
            C58895d dVar2 = C58895d.f134069e;
            if (liveWallPaperPreviewActivity.isFinishing()) {
                C58901f.m108220a(1, "context is finish");
            } else if (!C80720e.m139927b(dVar2.f134072c.getVideoPath())) {
                C1764a.m5928a("Start setting dynamic desktop: file does not exist, path: %s", new Object[]{dVar2.f134072c.getVideoPath()});
                C58901f.m108220a(1, "video path is not exist");
            } else {
                if (dVar2.f134071b != null) {
                    dVar2.f134071b.mo60966d(dVar2.f134072c.getVideoPath());
                    dVar2.f134071b.mo60959a(dVar2.f134072c.getWidth());
                    dVar2.f134071b.mo60962b(dVar2.f134072c.getHeight());
                    dVar2.f134071b.mo60969f(dVar2.f134072c.getSource());
                    dVar2.f134071b.mo60958a(dVar2.f134072c.getVolume());
                    dVar2.f134071b.mo60960a(dVar2.f134072c.isShouldMute());
                }
                C1731i.m5640b(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0139: INVOKE  
                      (wrap: com.ss.android.ugc.aweme.livewallpaper.f.d$3 : 0x0134: CONSTRUCTOR  (r1v10 com.ss.android.ugc.aweme.livewallpaper.f.d$3) = (r2v2 'dVar2' com.ss.android.ugc.aweme.livewallpaper.f.d) call: com.ss.android.ugc.aweme.livewallpaper.f.d.3.<init>(com.ss.android.ugc.aweme.livewallpaper.f.d):void type: CONSTRUCTOR)
                      (wrap: java.util.concurrent.ExecutorService : 0x0137: SGET  (r0v18 java.util.concurrent.ExecutorService) =  b.i.a java.util.concurrent.ExecutorService)
                     type: STATIC call: b.i.b(java.util.concurrent.Callable, java.util.concurrent.Executor):b.i in method: com.ss.android.ugc.aweme.livewallpaper.ui.d.onClick(android.view.View):void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0134: CONSTRUCTOR  (r1v10 com.ss.android.ugc.aweme.livewallpaper.f.d$3) = (r2v2 'dVar2' com.ss.android.ugc.aweme.livewallpaper.f.d) call: com.ss.android.ugc.aweme.livewallpaper.f.d.3.<init>(com.ss.android.ugc.aweme.livewallpaper.f.d):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.livewallpaper.ui.d.onClick(android.view.View):void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.livewallpaper.f.d, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 32 more
                    */
                /*
                // Method dump skipped, instructions count: 541
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui.View$OnClickListenerC58921d.onClick(android.view.View):void");
            }
        }
