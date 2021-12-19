package com.p2082ss.android.account;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22294b;
import com.bytedance.sdk.p1625a.p1626a.C22287a;
import com.bytedance.sdk.p1625a.p1643f.C22375e;
import com.p2082ss.android.p2203ug.bus.C30981c;
import com.p2082ss.android.p2203ug.bus.p2204a.AbstractC30974a;
import com.p2082ss.android.p2203ug.bus.p2204a.p2205a.C30976a;
import com.p2082ss.android.p2203ug.bus.p2204a.p2205a.C30977b;
import com.p2082ss.android.p2203ug.bus.p2204a.p2205a.C30978c;

/* renamed from: com.ss.android.account.b */
public class C29343b implements AbstractC22294b, AbstractC30974a {

    /* renamed from: b */
    private static volatile C29343b f69619b;

    /* renamed from: a */
    volatile boolean f69620a;

    /* renamed from: c */
    private boolean f69621c;

    /* renamed from: d */
    private String f69622d = "";

    static {
        Covode.recordClassIndex(35731);
    }

    /* renamed from: d */
    private void m58768d() {
        if (!this.f69620a) {
            mo51306b();
        }
    }

    @Override // com.p2082ss.android.p2203ug.bus.p2204a.AbstractC30974a
    /* renamed from: c */
    public final String mo51307c() {
        m58768d();
        return C22375e.m42171a(C29351f.m58781a().mo52210b()).mo36623c();
    }

    /* renamed from: a */
    public static C29343b m58767a() {
        MethodCollector.m26663i(2129);
        if (f69619b == null) {
            synchronized (C29343b.class) {
                try {
                    if (f69619b == null) {
                        f69619b = new C29343b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2129);
                    throw th;
                }
            }
        }
        C29343b bVar = f69619b;
        MethodCollector.m26664o(2129);
        return bVar;
    }

    /* renamed from: b */
    public final void mo51306b() {
        this.f69620a = true;
        C22375e.m42171a(C29351f.m58781a().mo52210b()).mo36614a(this);
        String c = C22375e.m42171a(C29351f.m58781a().mo52210b()).mo36623c();
        this.f69622d = c;
        this.f69621c = true ^ TextUtils.isEmpty(c);
    }

    @Override // com.p2082ss.android.p2203ug.bus.p2204a.AbstractC30974a
    /* renamed from: a */
    public final void mo51305a(final AbstractC30974a.AbstractC30975a aVar) {
        m58768d();
        
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: INVOKE  
              (wrap: com.bytedance.sdk.a.l.a$1 : 0x000a: CONSTRUCTOR  (r0v0 com.bytedance.sdk.a.l.a$1) = 
              (wrap: com.ss.android.account.b$1 : 0x0005: CONSTRUCTOR  (r1v0 com.ss.android.account.b$1) = (r2v0 'this' com.ss.android.account.b A[IMMUTABLE_TYPE, THIS]), (r3v0 'aVar' com.ss.android.ug.bus.a.a$a A[SKIP_ARG]) call: com.ss.android.account.b.1.<init>(com.ss.android.account.b, com.ss.android.ug.bus.a.a$a):void type: CONSTRUCTOR)
             call: com.bytedance.sdk.a.l.a.1.<init>(com.bytedance.sdk.a.l.b.b):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.sdk.a.l.a.a.b():void in method: com.ss.android.account.b.a(com.ss.android.ug.bus.a.a$a):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: CONSTRUCTOR  (r0v0 com.bytedance.sdk.a.l.a$1) = 
              (wrap: com.ss.android.account.b$1 : 0x0005: CONSTRUCTOR  (r1v0 com.ss.android.account.b$1) = (r2v0 'this' com.ss.android.account.b A[IMMUTABLE_TYPE, THIS]), (r3v0 'aVar' com.ss.android.ug.bus.a.a$a A[SKIP_ARG]) call: com.ss.android.account.b.1.<init>(com.ss.android.account.b, com.ss.android.ug.bus.a.a$a):void type: CONSTRUCTOR)
             call: com.bytedance.sdk.a.l.a.1.<init>(com.bytedance.sdk.a.l.b.b):void type: CONSTRUCTOR in method: com.ss.android.account.b.a(com.ss.android.ug.bus.a.a$a):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.sdk.a.l.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            r2.m58768d()
            com.ss.android.account.b$1 r1 = new com.ss.android.account.b$1
            r1.<init>(r3)
            com.bytedance.sdk.a.l.a$1 r0 = new com.bytedance.sdk.a.l.a$1
            r0.<init>(r1)
            r0.mo36770b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.account.C29343b.mo51305a(com.ss.android.ug.bus.a.a$a):void");
    }

    @Override // com.bytedance.sdk.p1625a.p1626a.AbstractC22294b
    /* renamed from: a */
    public final void mo36607a(C22287a aVar) {
        m58768d();
        if (aVar.f52708a == 1 || aVar.f52708a == 2) {
            this.f69621c = false;
            this.f69622d = "";
            C30981c.m63697a(new C30977b());
        } else if (!this.f69621c) {
            String c = mo51307c();
            if (!this.f69621c) {
                C30981c.m63697a(new C30976a(c));
                this.f69622d = c;
                this.f69621c = true;
            }
        } else {
            String c2 = mo51307c();
            if (!this.f69622d.equals(c2)) {
                this.f69622d = c2;
                C30981c.m63697a(new C30978c(c2));
            }
        }
    }
}
