package com.bytedance.android.p126a.p127a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.bytedance.android.p126a.p127a.p128a.AbstractC2612a;
import com.bytedance.android.p126a.p127a.p129b.AbstractC2617a;
import com.bytedance.android.p126a.p127a.p129b.C2618b;
import com.bytedance.android.p126a.p127a.p130c.C2620a;
import com.bytedance.android.p126a.p127a.p131d.AbstractC2625a;
import com.bytedance.android.p126a.p127a.p132e.C2631c;
import com.bytedance.android.p126a.p127a.p133f.C2633a;
import com.bytedance.android.p126a.p127a.p134g.AbstractC2637a;
import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.a.a.e */
public final class C2628e extends AbstractC2623d {

    /* renamed from: j */
    private static volatile C2628e f7903j;

    /* renamed from: a */
    public boolean f7904a;

    /* renamed from: b */
    public Context f7905b;

    /* renamed from: c */
    public C2633a f7906c;

    /* renamed from: d */
    public C2610a f7907d = new C2610a();

    /* renamed from: e */
    public C2613b f7908e = new C2613b();

    /* renamed from: f */
    public AbstractC2617a f7909f;

    /* renamed from: g */
    public AbstractC2612a f7910g;

    /* renamed from: h */
    public AbstractC2632f f7911h;

    /* renamed from: i */
    public AbstractC2636g f7912i;

    /* renamed from: k */
    private List<Pair<View, AbstractC2625a>> f7913k = Collections.synchronizedList(new ArrayList());

    static {
        Covode.recordClassIndex(3016);
    }

    @Override // com.bytedance.android.p126a.p127a.AbstractC2623d
    /* renamed from: b */
    public final boolean mo7138b() {
        if (!this.f7904a || !this.f7906c.f7931i) {
            return false;
        }
        return true;
    }

    private C2628e() {
    }

    @Override // com.bytedance.android.p126a.p127a.AbstractC2623d
    /* renamed from: a */
    public final boolean mo7137a() {
        if (!this.f7904a) {
            C2640a.m7643a("AdTrackerSDK not initialized correctly, make sure AdTrackerSDK.init(Context,AdTrackerSetting) has yet been called");
        }
        return this.f7904a;
    }

    /* renamed from: d */
    public static C2628e m7607d() {
        MethodCollector.m26663i(377);
        if (f7903j == null) {
            synchronized (C2628e.class) {
                try {
                    if (f7903j == null) {
                        f7903j = new C2628e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(377);
                    throw th;
                }
            }
        }
        C2628e eVar = f7903j;
        MethodCollector.m26664o(377);
        return eVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.p126a.p127a.AbstractC2623d
    /* renamed from: c */
    public final void mo7139c() {
        List<Pair<View, AbstractC2625a>> list = this.f7913k;
        if (list != null && !list.isEmpty()) {
            for (Pair<View, AbstractC2625a> pair : this.f7913k) {
                this.f7908e.mo7118a((View) pair.first, (AbstractC2625a) pair.second);
            }
            this.f7913k.clear();
        }
        if (C2631c.f7916a.compareAndSet(false, true)) {
            C2628e d = m7607d();
            C89219l.m154709a((Object) d, "");
            AbstractC2632f fVar = d.f7911h;
            Object obj = null;
            JSONObject putOpt = new JSONObject().putOpt("sdk_aid", 2705).putOpt("sdk_version", "1.6.0-i18n").putOpt("app_version", fVar != null ? "" : null);
            if (fVar != null) {
                obj = "";
            }
            JSONObject putOpt2 = putOpt.putOpt("update_version_code", obj).putOpt("os_version", Build.VERSION.RELEASE);
            C2628e d2 = m7607d();
            C89219l.m154709a((Object) d2, "");
            AbstractC2612a aVar = d2.f7910g;
            if (aVar != null) {
                aVar.mo7117a("sdk_session_launch", putOpt2);
            }
        }
    }

    @Override // com.bytedance.android.p126a.p127a.AbstractC2623d
    /* renamed from: a */
    public final void mo7132a(AbstractC2612a aVar) {
        this.f7910g = aVar;
    }

    @Override // com.bytedance.android.p126a.p127a.AbstractC2623d
    /* renamed from: a */
    public final void mo7134a(AbstractC2632f fVar) {
        this.f7911h = fVar;
    }

    @Override // com.bytedance.android.p126a.p127a.AbstractC2623d
    /* renamed from: a */
    public final void mo7136a(ExecutorService executorService) {
        if (!(executorService == C2620a.f7870a || C2620a.f7870a == null)) {
            C2620a.f7870a.shutdown();
        }
        C2620a.f7870a = executorService;
    }

    @Override // com.bytedance.android.p126a.p127a.AbstractC2623d
    /* renamed from: a */
    public final void mo7133a(C2633a aVar) {
        C2640a.m7643a("updating setting");
        if (mo7137a()) {
            this.f7906c = aVar;
            C2613b bVar = this.f7908e;
            if (!m7607d().mo7138b()) {
                C2640a.m7643a("ByteAdTracker is not available now");
            } else {
                C2620a.m7588a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0025: INVOKE  
                      (wrap: com.bytedance.android.a.a.b$3 : 0x0022: CONSTRUCTOR  (r0v4 com.bytedance.android.a.a.b$3) = (r1v0 'bVar' com.bytedance.android.a.a.b) call: com.bytedance.android.a.a.b.3.<init>(com.bytedance.android.a.a.b):void type: CONSTRUCTOR)
                     type: STATIC call: com.bytedance.android.a.a.c.a.a(com.bytedance.android.a.a.c.c):void in method: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.f.a):void, file: classes10.dex
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: CONSTRUCTOR  (r0v4 com.bytedance.android.a.a.b$3) = (r1v0 'bVar' com.bytedance.android.a.a.b) call: com.bytedance.android.a.a.b.3.<init>(com.bytedance.android.a.a.b):void type: CONSTRUCTOR in method: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.f.a):void, file: classes10.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.a.a.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = "updating setting"
                    com.bytedance.android.p126a.p127a.p135h.C2640a.m7643a(r0)
                    boolean r0 = r2.mo7137a()
                    if (r0 != 0) goto L_0x000c
                    return
                L_0x000c:
                    r2.f7906c = r3
                    com.bytedance.android.a.a.b r1 = r2.f7908e
                    com.bytedance.android.a.a.e r0 = m7607d()
                    boolean r0 = r0.mo7138b()
                    if (r0 != 0) goto L_0x0020
                    java.lang.String r0 = "ByteAdTracker is not available now"
                    com.bytedance.android.p126a.p127a.p135h.C2640a.m7643a(r0)
                    return
                L_0x0020:
                    com.bytedance.android.a.a.b$3 r0 = new com.bytedance.android.a.a.b$3
                    r0.<init>()
                    com.bytedance.android.p126a.p127a.p130c.C2620a.m7588a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p126a.p127a.C2628e.mo7133a(com.bytedance.android.a.a.f.a):void");
            }

            @Override // com.bytedance.android.p126a.p127a.AbstractC2623d
            /* renamed from: a */
            public final void mo7135a(AbstractC2637a aVar) {
                if (mo7137a()) {
                    C2613b bVar = this.f7908e;
                    if (aVar == null || TextUtils.isEmpty(aVar.mo7156b())) {
                        C2640a.m7643a("invalid tracker: null or empty key");
                    } else {
                        C2620a.m7588a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: INVOKE  
                              (wrap: com.bytedance.android.a.a.b$2 : 0x001d: CONSTRUCTOR  (r0v4 com.bytedance.android.a.a.b$2) = (r1v0 'bVar' com.bytedance.android.a.a.b), (r3v0 'aVar' com.bytedance.android.a.a.g.a) call: com.bytedance.android.a.a.b.2.<init>(com.bytedance.android.a.a.b, com.bytedance.android.a.a.g.a):void type: CONSTRUCTOR)
                             type: STATIC call: com.bytedance.android.a.a.c.a.a(com.bytedance.android.a.a.c.c):void in method: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.g.a):void, file: classes10.dex
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
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r0v4 com.bytedance.android.a.a.b$2) = (r1v0 'bVar' com.bytedance.android.a.a.b), (r3v0 'aVar' com.bytedance.android.a.a.g.a) call: com.bytedance.android.a.a.b.2.<init>(com.bytedance.android.a.a.b, com.bytedance.android.a.a.g.a):void type: CONSTRUCTOR in method: com.bytedance.android.a.a.e.a(com.bytedance.android.a.a.g.a):void, file: classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 24 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.a.a.b, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 30 more
                            */
                        /*
                            this = this;
                            boolean r0 = r2.mo7137a()
                            if (r0 != 0) goto L_0x0007
                            return
                        L_0x0007:
                            com.bytedance.android.a.a.b r1 = r2.f7908e
                            if (r3 == 0) goto L_0x0015
                            java.lang.String r0 = r3.mo7156b()
                            boolean r0 = android.text.TextUtils.isEmpty(r0)
                            if (r0 == 0) goto L_0x001b
                        L_0x0015:
                            java.lang.String r0 = "invalid tracker: null or empty key"
                            com.bytedance.android.p126a.p127a.p135h.C2640a.m7643a(r0)
                            return
                        L_0x001b:
                            com.bytedance.android.a.a.b$2 r0 = new com.bytedance.android.a.a.b$2
                            r0.<init>(r3)
                            com.bytedance.android.p126a.p127a.p130c.C2620a.m7588a(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p126a.p127a.C2628e.mo7135a(com.bytedance.android.a.a.g.a):void");
                    }

                    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
                        if (r1.equals("cpv_6s") == false) goto L_0x001f;
                     */
                    @Override // com.bytedance.android.p126a.p127a.p134g.AbstractC2638b
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo7147a(com.bytedance.android.p126a.p127a.p131d.C2626b r8) {
                        /*
                        // Method dump skipped, instructions count: 314
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p126a.p127a.C2628e.mo7147a(com.bytedance.android.a.a.d.b):void");
                    }

                    @Override // com.bytedance.android.p126a.p127a.AbstractC2623d
                    /* renamed from: a */
                    public final void mo7131a(Context context, C2633a aVar) {
                        if (!this.f7904a) {
                            C2640a.m7643a("1.6.0-i18n/106000");
                            if (context == null || aVar == null) {
                                C2640a.m7643a("ByteAdTracker init incorrectly, context or setting is null");
                                return;
                            }
                            Context applicationContext = context.getApplicationContext();
                            if (C58003a.f132201c && applicationContext == null) {
                                applicationContext = C58003a.f132199a;
                            }
                            this.f7905b = applicationContext;
                            this.f7909f = new C2618b(context, "byte_ad_tracker_preferences");
                            this.f7906c = aVar;
                            this.f7904a = true;
                        }
                    }
                }
