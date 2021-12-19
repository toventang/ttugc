package com.bytedance.p1782z.p1783a.p1785b;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;
import com.bytedance.p1782z.p1783a.p1784a.C23721a;
import com.bytedance.p1782z.p1783a.p1785b.p1786a.C23728a;
import com.bytedance.p1782z.p1783a.p1785b.p1787b.C23730a;
import com.bytedance.p1782z.p1783a.p1785b.p1788c.C23731a;
import com.bytedance.p1782z.p1783a.p1785b.p1789d.C23736a;
import com.bytedance.p1782z.p1783a.p1791d.C23743a;
import com.bytedance.p1782z.p1783a.p1791d.C23751b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.bytedance.z.a.b.a */
public class C23727a implements AbstractC23724c {

    /* renamed from: a */
    private static volatile C23727a f56147a;

    /* renamed from: b */
    private Context f56148b;

    /* renamed from: c */
    private C23730a f56149c;

    /* renamed from: d */
    private C23736a f56150d;

    /* renamed from: e */
    private C23731a f56151e;

    /* renamed from: f */
    private C23728a f56152f;

    /* renamed from: g */
    private C23721a f56153g;

    static {
        Covode.recordClassIndex(27832);
    }

    @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
    /* renamed from: a */
    public final C23721a mo39163a() {
        return this.f56153g;
    }

    @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
    /* renamed from: c */
    public final boolean mo39166c() {
        C23730a aVar = this.f56149c;
        aVar.mo39177b();
        return aVar.f56160d;
    }

    @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
    /* renamed from: e */
    public final int mo39168e() {
        C23730a aVar = this.f56149c;
        aVar.mo39177b();
        return aVar.f56161e;
    }

    @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
    /* renamed from: f */
    public final float mo39169f() {
        C23730a aVar = this.f56149c;
        aVar.mo39177b();
        return aVar.f56162f;
    }

    @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
    /* renamed from: g */
    public final void mo39170g() {
        this.f56151e.mo39178b();
    }

    @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
    /* renamed from: h */
    public final AbstractC23724c.C23726b mo39171h() {
        return this.f56151e.mo39180d();
    }

    @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
    /* renamed from: i */
    public final boolean mo39172i() {
        return this.f56152f.mo39175a();
    }

    @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
    /* renamed from: b */
    public final AbstractC23724c mo39165b() {
        this.f56149c.mo39176a();
        this.f56150d.mo39176a();
        this.f56151e.mo39176a();
        return this;
    }

    @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
    /* renamed from: d */
    public final int mo39167d() {
        C23730a aVar = this.f56149c;
        if (Build.VERSION.SDK_INT < 21) {
            return -1;
        }
        if (aVar.f56159c.isPowerSaveMode()) {
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
    /* renamed from: j */
    public final AbstractC23724c.C23725a mo39173j() {
        String str;
        int i;
        AbstractC23724c.C23725a aVar = new AbstractC23724c.C23725a();
        if (C23743a.f56200a != null) {
            str = C23743a.f56200a;
        } else {
            C23751b.m44899a("/proc/cpuinfo", 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0045: INVOKE  
                  ("/proc/cpuinfo")
                  (wrap: com.bytedance.z.a.d.a$2 : 0x0040: CONSTRUCTOR  (r1v0 com.bytedance.z.a.d.a$2) =  call: com.bytedance.z.a.d.a.2.<init>():void type: CONSTRUCTOR)
                 type: STATIC call: com.bytedance.z.a.d.b.a(java.lang.String, com.bytedance.z.a.d.b$a):void in method: com.bytedance.z.a.b.a.j():com.bytedance.z.a.a.c$a, file: classes.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR  (r1v0 com.bytedance.z.a.d.a$2) =  call: com.bytedance.z.a.d.a.2.<init>():void type: CONSTRUCTOR in method: com.bytedance.z.a.b.a.j():com.bytedance.z.a.a.c$a, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.z.a.d.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
                this = this;
                com.bytedance.z.a.a.c$a r2 = new com.bytedance.z.a.a.c$a
                r2.<init>()
                java.lang.String r0 = com.bytedance.p1782z.p1783a.p1791d.C23743a.f56200a
                if (r0 == 0) goto L_0x003e
                java.lang.String r0 = com.bytedance.p1782z.p1783a.p1791d.C23743a.f56200a
            L_0x000b:
                r2.f56125a = r0
                boolean r0 = r3.mo39166c()
                r2.f56126b = r0
                int r0 = r3.mo39168e()
                r2.f56127c = r0
                com.bytedance.z.a.b.d.a r1 = r3.f56150d
                android.os.PowerManager r0 = r1.f56194c
                if (r0 == 0) goto L_0x003c
                android.os.PowerManager r0 = r1.f56194c
                int r0 = r0.getCurrentThermalStatus()
            L_0x0025:
                r2.f56128d = r0
                int r0 = r3.mo39167d()
                r2.f56129e = r0
                float r0 = r3.mo39169f()
                r2.f56130f = r0
                com.bytedance.z.a.b.c.a r0 = r3.f56151e
                java.util.List r0 = r0.mo39179c()
                r2.f56131g = r0
                return r2
            L_0x003c:
                r0 = 0
                goto L_0x0025
            L_0x003e:
                com.bytedance.z.a.d.a$2 r1 = new com.bytedance.z.a.d.a$2
                r1.<init>()
                java.lang.String r0 = "/proc/cpuinfo"
                com.bytedance.p1782z.p1783a.p1791d.C23751b.m44899a(r0, r1)
                java.lang.String r0 = com.bytedance.p1782z.p1783a.p1791d.C23743a.f56200a
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1782z.p1783a.p1785b.C23727a.mo39173j():com.bytedance.z.a.a.c$a");
        }

        private C23727a(Context context) {
            this(context, C23721a.f56113a);
        }

        /* renamed from: a */
        public static C23727a m44844a(Context context) {
            MethodCollector.m26663i(1205);
            if (f56147a == null) {
                synchronized (C23727a.class) {
                    try {
                        if (f56147a == null) {
                            f56147a = new C23727a(context);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1205);
                        throw th;
                    }
                }
            }
            C23727a aVar = f56147a;
            MethodCollector.m26664o(1205);
            return aVar;
        }

        @Override // com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c
        /* renamed from: a */
        public final boolean mo39164a(float f) {
            AbstractC23724c.C23726b h;
            C23728a aVar = this.f56152f;
            if (aVar.mo39175a()) {
                C23721a.C23722a aVar2 = aVar.f56154a.mo39163a().f56118f;
                if (aVar2 == null) {
                    return true;
                }
                float f2 = aVar2.f56121c;
                float f3 = aVar2.f56124f;
                if (f >= f2) {
                    if (((double) f3) <= 0.0d || (h = aVar.f56154a.mo39171h()) == null || h.f56146o > f3) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        private C23727a(Context context, C23721a aVar) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f56148b = applicationContext;
            this.f56153g = aVar == null ? C23721a.f56113a : aVar;
            this.f56149c = new C23730a(this.f56148b, this);
            this.f56150d = new C23736a(this.f56148b, this);
            this.f56151e = new C23731a(this.f56148b, this);
            this.f56152f = new C23728a(this);
        }
    }
