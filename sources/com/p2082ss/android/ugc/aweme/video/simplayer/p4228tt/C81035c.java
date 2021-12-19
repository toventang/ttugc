package com.p2082ss.android.ugc.aweme.video.simplayer.p4228tt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63052m;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63029p;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63030q;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.aweme.video.AbstractC80773m;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81007g;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81023p;
import com.p2082ss.android.ugc.aweme.video.simplayer.C80993aa;
import com.p2082ss.android.ugc.aweme.video.simplayer.C81014l;
import com.p2082ss.android.ugc.aweme.video.simplayer.C81018n;
import com.p2082ss.android.ugc.aweme.video.simplayer.C81027s;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import com.p2082ss.android.ugc.playerkit.p4324d.C84189d;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84240h;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4417j.C86539s;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.tt.c */
public final class C81035c extends AbstractC81023p {
    static {
        Covode.recordClassIndex(94354);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f, com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81023p
    /* renamed from: l */
    public final void mo124464l() {
        if (this.f181118a != null) {
            this.f181118a.mo100996a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81023p
    /* renamed from: n */
    public final C80993aa mo124478n() {
        return new C81039f(this.f181118a, this, this.f181126i);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81023p
    /* renamed from: a */
    public final AbstractC80773m mo124475a(boolean z) {
        return new C81034b(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81023p
    /* renamed from: a */
    public final AbstractC81007g mo124476a(C84240h hVar) {
        return new C81040g(C81041h.m140705a(hVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f, com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81023p
    /* renamed from: a */
    public final void mo124445a(int i) {
        if (this.f181118a != null) {
            this.f181118a.mo101007c(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f, com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81023p
    /* renamed from: a */
    public final void mo124449a(AbstractC63052m mVar) {
        if (this.f181118a != null) {
            this.f181118a.mo100990a(mVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f, com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81023p
    /* renamed from: a */
    public final void mo124444a(float f) {
        C86539s sVar;
        super.mo124444a(f);
        AbstractC63042j.C63048f c = this.f181124g.mo124416c();
        C86535p a = C63030q.m113713a(this.f181121d);
        AbstractC81007g gVar = this.f181122e;
        if (gVar == null || gVar.mo124471a() == null) {
            sVar = null;
        } else {
            sVar = (C86539s) gVar.mo124471a();
        }
        if (!(c == null || c.f143216i == null)) {
            a = C63030q.m113713a(c.f143216i);
        }
        if (!(a == null || a.f194859d == null || a.f194859d.mo137798b() == null || a.f194859d.mo137798b().size() <= 0)) {
            sVar = a.f194859d.mo137798b().get(0);
        }
        if (sVar != null) {
            if (!new File(C80716a.C80717a.f180462a.mo123864a().getThumbCacheDir(C84231a.f188309a) + "/" + C81041h.m140706a(sVar)).exists()) {
                C80716a.C80717a.f180462a.mo123864a().downloadFile(sVar.f194949c, C81041h.m140706a(sVar), C80716a.C80717a.f180462a.mo123864a().getThumbCacheDir(C84231a.f188309a), "legacy_video_thumb");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81023p
    /* renamed from: a */
    public final C84217p mo124477a(C81018n nVar) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean isAsyncInit = C80716a.C80717a.f180462a.mo123865b().isAsyncInit();
        C84241i a = C81027s.m140679a(nVar.f181096a);
        IALog d = C84231a.m144838d();
        StringBuilder sb = new StringBuilder("createDashPrepareData aid:");
        if (a != null) {
            str = a.getSourceId();
        } else {
            str = "null";
        }
        d.mo124333e("SimPlayerHelper", sb.append(str).toString());
        C84217p pVar = null;
        if (a == null) {
            return null;
        }
        String sourceId = a.getSourceId();
        C86535p a2 = C81032a.m140692a(nVar.f181096a.getVideoModelStr());
        if (!(a2 == null || a2.f194859d == null)) {
            C63059e a3 = C84189d.m144771a(a, new C63029p(a2));
            if (nVar.f181103h != null) {
                a3.f143247l = nVar.f181103h.isUseSuperResolution();
            }
            if (nVar.f181096a.getPlayAddr() != null) {
                str2 = nVar.f181096a.getPlayAddr().getUri();
            } else {
                str2 = a2.f194859d.f194919h;
            }
            String str3 = a2.f194859d.f194919h;
            boolean a4 = C81037e.m140703a(a2);
            nVar.f181096a.getPlayAddr().setDashVideoId(str3);
            C84229a.f188297a.mo129053c(sourceId, str3);
            nVar.f181096a.getPlayAddr().setDashVideoModelStr(nVar.f181096a.getVideoModelStr());
            if (nVar.f181104i != null) {
                z = nVar.f181104i.f180633l;
            } else {
                z = false;
            }
            pVar = r9;
            C84217p pVar2 = new C84217p(C81027s.m140677a(sourceId, z, (long) a.getDuration()), null, C84231a.f188309a, sourceId, nVar.f181097b, nVar.f181103h, false, a4, C84199c.f187979a.getRenderType(), null, str2, !nVar.f181098c, isAsyncInit, C80716a.C80717a.f180462a.mo123865b().get265DecodeType(), 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d7: CONSTRUCTOR  (r9v0 'pVar2' com.ss.android.ugc.playerkit.model.p) = 
                  (wrap: com.ss.android.ugc.playerkit.a.d<com.ss.android.ugc.playerkit.model.u> : 0x00a8: INVOKE  (r10v0 com.ss.android.ugc.playerkit.a.d<com.ss.android.ugc.playerkit.model.u>) = 
                  (r13v0 'sourceId' java.lang.String)
                  (r8v1 'z' boolean)
                  (wrap: long : 0x00a7: CAST (r2v17 long) = (long) (wrap: double : 0x00a3: INVOKE  (r4v1 double) = (r4v0 'a' com.ss.android.ugc.playerkit.simapicommon.a.i) type: VIRTUAL call: com.ss.android.ugc.playerkit.simapicommon.a.i.getDuration():double))
                 type: STATIC call: com.ss.android.ugc.aweme.video.simplayer.s.a(java.lang.String, boolean, long):com.ss.android.ugc.playerkit.a.d)
                  (null com.ss.android.ugc.playerkit.a.d)
                  (wrap: android.app.Application : 0x00ad: SGET  (r12v0 android.app.Application) =  com.ss.android.ugc.playerkit.simapicommon.a.a android.app.Application)
                  (r13v0 'sourceId' java.lang.String)
                  (wrap: boolean : 0x00af: IGET  (r14v0 boolean) = (r26v0 'nVar' com.ss.android.ugc.aweme.video.simplayer.n) com.ss.android.ugc.aweme.video.simplayer.n.b boolean)
                  (wrap: com.ss.android.ugc.aweme.video.x : 0x00b1: IGET  (r15v0 com.ss.android.ugc.aweme.video.x) = (r26v0 'nVar' com.ss.android.ugc.aweme.video.simplayer.n) com.ss.android.ugc.aweme.video.simplayer.n.h com.ss.android.ugc.aweme.video.x)
                  false
                  (r17v0 'a4' boolean)
                  (wrap: int : 0x00b7: INVOKE  (r18v0 int) = 
                  (wrap: com.ss.android.ugc.playerkit.model.c : 0x00b5: SGET  (r2v18 com.ss.android.ugc.playerkit.model.c) =  com.ss.android.ugc.playerkit.model.c.a com.ss.android.ugc.playerkit.model.c)
                 type: VIRTUAL call: com.ss.android.ugc.playerkit.model.c.getRenderType():int)
                  (null com.ss.android.ugc.playerkit.a.d)
                  (r7v1 'str2' java.lang.String)
                  (wrap: boolean : ?: NOT  
                  (wrap: boolean : 0x00bd: IGET  (r2v19 boolean) = (r26v0 'nVar' com.ss.android.ugc.aweme.video.simplayer.n) com.ss.android.ugc.aweme.video.simplayer.n.c boolean)
                )
                  (r22v0 'isAsyncInit' boolean)
                  (wrap: int : 0x00c8: INVOKE  (r23v0 int) = 
                  (wrap: com.ss.android.ugc.aweme.video.config.IPlayerExperiment : 0x00c4: INVOKE  (r2v21 com.ss.android.ugc.aweme.video.config.IPlayerExperiment) = 
                  (wrap: com.ss.android.ugc.aweme.video.config.a : 0x00c2: SGET  (r2v20 com.ss.android.ugc.aweme.video.config.a) =  com.ss.android.ugc.aweme.video.config.a.a.a com.ss.android.ugc.aweme.video.config.a)
                 type: VIRTUAL call: com.ss.android.ugc.aweme.video.config.a.b():com.ss.android.ugc.aweme.video.config.IPlayerExperiment)
                 type: INTERFACE call: com.ss.android.ugc.aweme.video.config.IPlayerExperiment.get265DecodeType():int)
                  (wrap: com.ss.android.ugc.aweme.video.simplayer.tt.e$1 : 0x00ce: CONSTRUCTOR  (r3v6 com.ss.android.ugc.aweme.video.simplayer.tt.e$1) = (r6v0 'a3' com.ss.android.ugc.aweme.player.sdk.b.e) call: com.ss.android.ugc.aweme.video.simplayer.tt.e.1.<init>(com.ss.android.ugc.aweme.player.sdk.b.e):void type: CONSTRUCTOR)
                 call: com.ss.android.ugc.playerkit.model.p.<init>(com.ss.android.ugc.playerkit.a.d, com.ss.android.ugc.playerkit.a.d, android.content.Context, java.lang.String, boolean, com.ss.android.ugc.playerkit.model.i, boolean, boolean, int, com.ss.android.ugc.playerkit.a.d, java.lang.String, boolean, boolean, int, java.lang.Runnable):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.simplayer.tt.c.a(com.ss.android.ugc.aweme.video.simplayer.n):com.ss.android.ugc.playerkit.model.p, file: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ce: CONSTRUCTOR  (r3v6 com.ss.android.ugc.aweme.video.simplayer.tt.e$1) = (r6v0 'a3' com.ss.android.ugc.aweme.player.sdk.b.e) call: com.ss.android.ugc.aweme.video.simplayer.tt.e.1.<init>(com.ss.android.ugc.aweme.player.sdk.b.e):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.simplayer.tt.c.a(com.ss.android.ugc.aweme.video.simplayer.n):com.ss.android.ugc.playerkit.model.p, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.video.simplayer.tt.e, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 677
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.simplayer.p4228tt.C81035c.mo124477a(com.ss.android.ugc.aweme.video.simplayer.n):com.ss.android.ugc.playerkit.model.p");
        }

        public C81035c(AbstractC63051l lVar, boolean z, C81014l lVar2) {
            super(lVar, z, lVar2);
        }
    }
