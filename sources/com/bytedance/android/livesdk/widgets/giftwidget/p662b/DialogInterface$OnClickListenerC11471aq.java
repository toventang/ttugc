package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.content.DialogInterface;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.C6380c;
import com.bytedance.android.live.wallet.model.C6384g;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.aq */
final /* synthetic */ class DialogInterface$OnClickListenerC11471aq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C11455ag.C114572 f27527a;

    /* renamed from: b */
    private final C6384g f27528b;

    /* renamed from: c */
    private final C10700d f27529c;

    /* renamed from: d */
    private final RevenueExchange f27530d;

    /* renamed from: e */
    private final long f27531e;

    static {
        Covode.recordClassIndex(13130);
    }

    DialogInterface$OnClickListenerC11471aq(C11455ag.C114572 r1, C6384g gVar, C10700d dVar, RevenueExchange revenueExchange, long j) {
        this.f27527a = r1;
        this.f27528b = gVar;
        this.f27529c = dVar;
        this.f27530d = revenueExchange;
        this.f27531e = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C11455ag.C114572 r4 = this.f27527a;
        C6384g gVar = this.f27528b;
        C10700d dVar = this.f27529c;
        RevenueExchange revenueExchange = this.f27530d;
        long j = this.f27531e;
        if (gVar.f15958d != null && gVar.f15958d.getBasePackage() != null) {
            C11477aw.m20314b(C11455ag.this.f27481c, dVar.f25760b);
            C6380c cVar = new C6380c();
            cVar.f15938a = (int) gVar.f15958d.getBasePackage().getId();
            cVar.f15941d = 1;
            cVar.f15940c = revenueExchange.getCurrency();
            cVar.f15942e = 0;
            cVar.f15943f = j;
            cVar.f15944g = gVar.f15958d.getBasePackage().getPrice() * j;
            cVar.f15945h = (long) gVar.f15958d.getBasePackage().getRealDot();
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12368a(cVar, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006b: INVOKE  
                  (wrap: com.bytedance.android.live.wallet.d : 0x0062: INVOKE  (r1v0 com.bytedance.android.live.wallet.d) = 
                  (wrap: com.bytedance.android.live.wallet.IWalletService : 0x0060: CHECK_CAST (r0v21 com.bytedance.android.live.wallet.IWalletService) = (com.bytedance.android.live.wallet.IWalletService) (wrap: com.bytedance.android.live.base.a : 0x005c: INVOKE  (r0v20 com.bytedance.android.live.base.a) = (wrap: java.lang.Class : 0x005a: CONST_CLASS   com.bytedance.android.live.wallet.IWalletService.class) type: STATIC call: com.bytedance.android.live.t.a.a(java.lang.Class):com.bytedance.android.live.base.a))
                 type: INTERFACE call: com.bytedance.android.live.wallet.IWalletService.walletCenter():com.bytedance.android.live.wallet.d)
                  (r2v1 'cVar' com.bytedance.android.live.wallet.model.c)
                  (wrap: com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2$1 : 0x0068: CONSTRUCTOR  (r0v22 com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2$1) = 
                  (r4v0 'r4' com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2)
                  (r3v0 'dVar' com.bytedance.android.livesdk.service.b.d)
                  (r2v1 'cVar' com.bytedance.android.live.wallet.model.c)
                 call: com.bytedance.android.livesdk.widgets.giftwidget.b.ag.2.1.<init>(com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2, com.bytedance.android.livesdk.service.b.d, com.bytedance.android.live.wallet.model.c):void type: CONSTRUCTOR)
                 type: INTERFACE call: com.bytedance.android.live.wallet.d.a(com.bytedance.android.live.wallet.model.c, com.bytedance.android.livesdkapi.depend.d.b.a):void in method: com.bytedance.android.livesdk.widgets.giftwidget.b.aq.onClick(android.content.DialogInterface, int):void, file: classes6.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0068: CONSTRUCTOR  (r0v22 com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2$1) = 
                  (r4v0 'r4' com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2)
                  (r3v0 'dVar' com.bytedance.android.livesdk.service.b.d)
                  (r2v1 'cVar' com.bytedance.android.live.wallet.model.c)
                 call: com.bytedance.android.livesdk.widgets.giftwidget.b.ag.2.1.<init>(com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2, com.bytedance.android.livesdk.service.b.d, com.bytedance.android.live.wallet.model.c):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.widgets.giftwidget.b.aq.onClick(android.content.DialogInterface, int):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.widgets.giftwidget.b.ag, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.giftwidget.p662b.DialogInterface$OnClickListenerC11471aq.onClick(android.content.DialogInterface, int):void");
        }
    }
