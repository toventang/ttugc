package com.p2082ss.android.ugc.aweme.ftc;

import android.widget.FrameLayout;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73657f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73806f;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84090k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.x */
public final /* synthetic */ class RunnableC52814x implements Runnable {

    /* renamed from: a */
    private final FTCVideoRecordNewActivity f121519a;

    static {
        Covode.recordClassIndex(62214);
    }

    RunnableC52814x(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f121519a = fTCVideoRecordNewActivity;
    }

    public final void run() {
        C70625d a;
        C69905c cVar;
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f121519a;
        C51913c cVar2 = fTCVideoRecordNewActivity.f119428t;
        C84911q.m145921a("addFragment onFragmentActivityCreated PlanC");
        C73657f.m129769a(fTCVideoRecordNewActivity.f119430v);
        if (cVar2 instanceof AbstractC52500d) {
            fTCVideoRecordNewActivity.f119421m = (FrameLayout) fTCVideoRecordNewActivity.findViewById(R.id.c5m);
            C84911q.m145921a("addFragment onFragmentActivityCreated initFilterModule");
            AbstractC84089j m = fTCVideoRecordNewActivity.mo87541m();
            m.mo128903K();
            m.mo23132n();
            C73806f.m129872a(new C52613i(fTCVideoRecordNewActivity, m));
            fTCVideoRecordNewActivity.mo87541m().mo128895C().mo128853a();
            if (fTCVideoRecordNewActivity.getIntent() != null && (((a = C63238c.f143581h.mo101535a(fTCVideoRecordNewActivity.getIntent().getSerializableExtra("music_wave_data"))) != null && C70612k.C70614b.m124761a(a.getMusicWavePointArray())) || ((cVar = C70005cr.m123611a().f156482a) != null && C70612k.C70614b.m124761a(cVar.getMusicWaveData()) && (a = C70612k.m124748b(cVar)) != null && C70612k.C70614b.m124761a(a.getMusicWavePointArray())))) {
                fTCVideoRecordNewActivity.f119415g.f155811au = C70612k.m124745a(a);
            } else if (fTCVideoRecordNewActivity.f119415g.f155817b.f155669y != null) {
                C70612k.m124747a(fTCVideoRecordNewActivity.f119415g.f155817b.f155669y, new C52639j(fTCVideoRecordNewActivity));
            }
            C84090k.m144600a((AbstractC75649i) fTCVideoRecordNewActivity.f119405E, true);
            if (fTCVideoRecordNewActivity.f119424p) {
                fTCVideoRecordNewActivity.f119416h.post(new RunnableC52803w(fTCVideoRecordNewActivity));
            }
            if (fTCVideoRecordNewActivity.f119415g.f155817b.f155653i) {
                AbstractC52568a aVar = (AbstractC52568a) ApiCenter.C2545a.m7450a(fTCVideoRecordNewActivity).mo7013a(AbstractC52568a.class);
                aVar.mo88322a(fTCVideoRecordNewActivity.f119415g.mo110038n());
                aVar.mo88321a(0);
                fTCVideoRecordNewActivity.f119402B.mo22917x();
            }
            fTCVideoRecordNewActivity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b4: INVOKE  
                  (wrap: android.view.ViewTreeObserver : 0x00ab: INVOKE  (r1v4 android.view.ViewTreeObserver) = 
                  (wrap: android.view.View : 0x00a7: INVOKE  (r0v23 android.view.View) = 
                  (wrap: android.view.Window : 0x00a3: INVOKE  (r0v22 android.view.Window) = (r2v0 'fTCVideoRecordNewActivity' com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity) type: VIRTUAL call: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.getWindow():android.view.Window)
                 type: VIRTUAL call: android.view.Window.getDecorView():android.view.View)
                 type: VIRTUAL call: android.view.View.getViewTreeObserver():android.view.ViewTreeObserver)
                  (wrap: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity$1 : 0x00b1: CONSTRUCTOR  (r0v24 com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity$1) = (r2v0 'fTCVideoRecordNewActivity' com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity) call: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.1.<init>(com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.view.ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener):void in method: com.ss.android.ugc.aweme.ftc.x.run():void, file: classes10.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b1: CONSTRUCTOR  (r0v24 com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity$1) = (r2v0 'fTCVideoRecordNewActivity' com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity) call: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.1.<init>(com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.ftc.x.run():void, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 243
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.RunnableC52814x.run():void");
        }
    }
