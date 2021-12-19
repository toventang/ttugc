package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23319b;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.google.gson.C27910f;
import com.google.gson.C28027t;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49681i;
import com.p2082ss.android.ugc.aweme.p2757dg.C41469a;
import com.p2082ss.android.ugc.aweme.p2757dg.C41472d;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a */
public abstract class AbstractC72946a implements AbstractC72924e {

    /* renamed from: b */
    public C41472d f163688b;

    /* renamed from: c */
    public Runnable f163689c;

    /* renamed from: d */
    public AbstractC23317a f163690d;

    /* renamed from: e */
    public boolean f163691e;

    /* renamed from: f */
    public InteractStickerStruct f163692f;

    /* renamed from: g */
    public List<? extends NormalTrackTimeStamp> f163693g;

    /* renamed from: h */
    public final int f163694h;

    /* renamed from: i */
    public Context f163695i;

    /* renamed from: j */
    public final View f163696j;

    /* renamed from: k */
    public C75391j f163697k;

    static {
        Covode.recordClassIndex(85649);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo115233a(C23322d dVar) {
        C89219l.m154721d(dVar, "");
        return 0;
    }

    /* renamed from: a */
    public void mo115354a(C41472d dVar) {
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public void mo115315b(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo115227d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract View mo115228e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo115229f();

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: j */
    public void mo115312j() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: k */
    public void mo115313k() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: l */
    public final InteractStickerStruct mo115316l() {
        return this.f163692f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a$b */
    public static final class RunnableC72952b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC72946a f163705a;

        static {
            Covode.recordClassIndex(85655);
        }

        RunnableC72952b(AbstractC72946a aVar) {
            this.f163705a = aVar;
        }

        public final void run() {
            C29339a.m58754b(this.f163705a.f163689c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: m */
    public final int mo115317m() {
        return hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a$d */
    public static final class C72954d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC72946a f163710a;

        /* renamed from: b */
        final /* synthetic */ long f163711b = 300;

        static {
            Covode.recordClassIndex(85657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72954d(AbstractC72946a aVar) {
            super(0);
            this.f163710a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC81915c.m141874a(new C49681i());
            new Handler().postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a.C72954d.RunnableC729551 */

                /* renamed from: a */
                final /* synthetic */ C72954d f163712a;

                static {
                    Covode.recordClassIndex(85658);
                }

                {
                    this.f163712a = r1;
                }

                public final void run() {
                    this.f163712a.f163710a.f163691e = false;
                }
            }, this.f163711b);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: i */
    public void mo115311i() {
        Runnable runnable = this.f163689c;
        if (runnable != null) {
            C29339a.m58755c(runnable);
            this.f163689c = null;
        }
        C41472d dVar = this.f163688b;
        if (dVar != null) {
            dVar.dismiss();
            this.f163688b = null;
        }
        C75391j jVar = this.f163697k;
        if (jVar != null && jVar.f169460o != null) {
            mo115226b();
        }
    }

    /* renamed from: n */
    public final void mo115357n() {
        AbstractC23317a aVar;
        AbstractC23317a aVar2 = this.f163690d;
        if (aVar2 != null && aVar2.isShowing() && (aVar = this.f163690d) != null) {
            aVar.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a$a */
    public static final class RunnableC72948a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC72946a f163698a;

        /* renamed from: b */
        final /* synthetic */ float f163699b;

        /* renamed from: c */
        final /* synthetic */ float f163700c;

        static {
            Covode.recordClassIndex(85651);
        }

        RunnableC72948a(AbstractC72946a aVar, float f, float f2) {
            this.f163698a = aVar;
            this.f163699b = f;
            this.f163700c = f2;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            if (this.f163698a.f163688b == null) {
                AbstractC72946a aVar = this.f163698a;
                Context context = this.f163698a.f163695i;
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                aVar.f163688b = new C41472d((Activity) context);
                C41472d dVar = this.f163698a.f163688b;
                if (dVar != null) {
                    dVar.f96765r = 300;
                }
                C41472d dVar2 = this.f163698a.f163688b;
                if (dVar2 != null) {
                    dVar2.f96758k = false;
                    if (dVar2.f96749b != null) {
                        dVar2.f96749b.setNeedPath(false);
                    }
                }
                C41472d dVar3 = this.f163698a.f163688b;
                if (dVar3 != null) {
                    dVar3.f96759l = true;
                }
                C41472d dVar4 = this.f163698a.f163688b;
                if (dVar4 != null) {
                    dVar4.f96760m = true;
                }
                C41472d dVar5 = this.f163698a.f163688b;
                if (dVar5 != null) {
                    View e = this.f163698a.mo115228e();
                    dVar5.f96749b = new C41469a(dVar5.f96750c);
                    dVar5.f96749b.setBackgroundColor(0);
                    dVar5.f96749b.addView(e);
                    dVar5.f96749b.setGravity(17);
                    dVar5.f96749b.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                    dVar5.f96749b.setVisibility(8);
                    if (dVar5.f96757j != 0) {
                        dVar5.f96749b.setBgColor(dVar5.f96757j);
                    }
                    dVar5.f96749b.setNeedPath(dVar5.f96758k);
                    dVar5.f96749b.setNeedPressFade(dVar5.f96759l);
                    dVar5.f96749b.setOnClickListener(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009f: INVOKE  
                          (wrap: com.ss.android.ugc.aweme.dg.a : 0x0098: IGET  (r1v22 com.ss.android.ugc.aweme.dg.a) = (r2v11 'dVar5' com.ss.android.ugc.aweme.dg.d) com.ss.android.ugc.aweme.dg.d.b com.ss.android.ugc.aweme.dg.a)
                          (wrap: com.ss.android.ugc.aweme.dg.d$2 : 0x009c: CONSTRUCTOR  (r0v85 com.ss.android.ugc.aweme.dg.d$2) = (r2v11 'dVar5' com.ss.android.ugc.aweme.dg.d) call: com.ss.android.ugc.aweme.dg.d.2.<init>(com.ss.android.ugc.aweme.dg.d):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.ss.android.ugc.aweme.dg.a.setOnClickListener(android.view.View$OnClickListener):void in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a.run():void, file: classes7.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009c: CONSTRUCTOR  (r0v85 com.ss.android.ugc.aweme.dg.d$2) = (r2v11 'dVar5' com.ss.android.ugc.aweme.dg.d) call: com.ss.android.ugc.aweme.dg.d.2.<init>(com.ss.android.ugc.aweme.dg.d):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a.run():void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 24 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.dg.d, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 30 more
                        */
                    /*
                    // Method dump skipped, instructions count: 470
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a.RunnableC72948a.run():void");
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
            /* renamed from: a */
            public void mo115314a(InteractStickerStruct interactStickerStruct) {
                this.f163692f = interactStickerStruct;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
            /* renamed from: a */
            public void mo115236a(C75391j jVar) {
                C89219l.m154721d(jVar, "");
                this.f163697k = jVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
            /* renamed from: b */
            public void mo115310b(int i) {
                Runnable runnable = this.f163689c;
                if (runnable != null) {
                    C29339a.m58755c(runnable);
                    this.f163689c = null;
                }
                C41472d dVar = this.f163688b;
                if (dVar != null) {
                    dVar.mo70742a();
                }
                this.f163688b = null;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a$c */
            public static final class C72953c extends AbstractC89220m implements AbstractC89172b<C23322d, C89391z> {

                /* renamed from: a */
                final /* synthetic */ AbstractC72946a f163706a;

                /* renamed from: b */
                final /* synthetic */ C89233z.C89236c f163707b;

                /* renamed from: c */
                final /* synthetic */ C89233z.C89236c f163708c;

                /* renamed from: d */
                final /* synthetic */ double f163709d = 42.0d;

                static {
                    Covode.recordClassIndex(85656);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C72953c(AbstractC72946a aVar, C89233z.C89236c cVar, C89233z.C89236c cVar2) {
                    super(1);
                    this.f163706a = aVar;
                    this.f163707b = cVar;
                    this.f163708c = cVar2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23322d dVar) {
                    C23322d dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    this.f163707b.element = this.f163706a.mo115233a(dVar2);
                    C89233z.C89236c cVar = this.f163708c;
                    int i = cVar.element;
                    double d = (double) this.f163707b.element;
                    double d2 = this.f163709d;
                    Double.isNaN(d);
                    cVar.element = i + C34728n.m70946a(d * d2);
                    return C89391z.f203057a;
                }
            }

            /* renamed from: b */
            public boolean mo115356b(float f, float f2) {
                AbstractC81915c.m141874a(new C49681i(hashCode()));
                C41472d dVar = this.f163688b;
                if (dVar == null || !dVar.isShowing()) {
                    mo115227d();
                    this.f163689c = new RunnableC72948a(this, f, f2);
                    this.f163696j.post(new RunnableC72952b(this));
                    return true;
                }
                AbstractC81915c.m141874a(new C49681i());
                return false;
            }

            /* renamed from: a */
            public final boolean mo115355a(float f, float f2) {
                AbstractC81915c.m141874a(new C49681i(hashCode()));
                AbstractC23317a aVar = this.f163690d;
                if ((aVar == null || !aVar.isShowing()) && !this.f163691e) {
                    mo115227d();
                    int a = C34728n.m70946a(58.0d);
                    int a2 = C34728n.m70946a(16.0d);
                    C89233z.C89236c cVar = new C89233z.C89236c();
                    cVar.element = C34728n.m70946a(10.0d);
                    C89233z.C89236c cVar2 = new C89233z.C89236c();
                    cVar2.element = 0;
                    int[] iArr = new int[2];
                    this.f163696j.getLocationOnScreen(iArr);
                    Context context = this.f163695i;
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    AbstractC23332b a3 = ((C23319b) new C23319b((Activity) context).mo38030a(-1001L).mo38040b(300L).mo38046d(a2)).mo38011a(new C72953c(this, cVar2, cVar)).mo38035a(new C72954d(this));
                    if (f2 < ((float) (cVar.element + a + a2))) {
                        a3.mo38034a(EnumC23352h.BOTTOM);
                        if (f2 > ((float) (a - a2))) {
                            a3.mo38039b(a2);
                        } else {
                            f2 = (float) a;
                        }
                    } else {
                        a3.mo38034a(EnumC23352h.TOP);
                        a3.mo38039b(-a2);
                    }
                    a3.mo38029a(((int) f) + iArr[0], ((int) f2) + iArr[1]);
                    if (cVar2.element <= 0) {
                        return false;
                    }
                    AbstractC23317a d = a3.mo38012d();
                    this.f163690d = d;
                    if (d != null) {
                        d.mo38001a();
                    }
                    this.f163691e = true;
                    return true;
                }
                AbstractC81915c.m141874a(new C49681i());
                AbstractC23317a aVar2 = this.f163690d;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
                return false;
            }

            public AbstractC72946a(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar) {
                String str;
                C89219l.m154721d(context, "");
                C89219l.m154721d(view, "");
                C89219l.m154721d(interactStickerStruct, "");
                this.f163694h = i;
                this.f163695i = context;
                this.f163696j = view;
                this.f163697k = jVar;
                this.f163692f = interactStickerStruct;
                try {
                    C27910f b = GsonHolder.m138943c().mo123620b();
                    InteractStickerStruct interactStickerStruct2 = this.f163692f;
                    if (interactStickerStruct2 != null) {
                        str = interactStickerStruct2.getTrackList();
                    } else {
                        str = null;
                    }
                    this.f163693g = (List) b.mo46671a(str, new C27895a<List<? extends NormalTrackTimeStamp>>() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a.C729471 */

                        static {
                            Covode.recordClassIndex(85650);
                        }
                    }.type);
                } catch (C28027t unused) {
                }
            }
        }
