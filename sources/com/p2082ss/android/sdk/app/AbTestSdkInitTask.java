package com.p2082ss.android.sdk.app;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.abmock.C16087n;
import com.bytedance.ies.abmock.datacenter.p1116a.AbstractC16052a;
import com.bytedance.ies.abmock.debugtool.mock.ConfigMock;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.p1007g.AbstractC14862g;
import com.bytedance.p1007g.AbstractC14863h;
import com.bytedance.p1007g.AbstractC14864i;
import com.bytedance.p1007g.AbstractC14865j;
import com.bytedance.p1007g.C14853c;
import com.bytedance.p1007g.C14866k;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.google.gson.C27910f;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.C29739c;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: com.ss.android.sdk.app.AbTestSdkInitTask */
public class AbTestSdkInitTask implements AbstractC58084a, AbstractC58264w {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.sdk.app.AbTestSdkInitTask$AbTestApi */
    public interface AbTestApi {
        static {
            Covode.recordClassIndex(36738);
        }

        @AbstractC22000h
        AbstractFutureC27655q<String> doGet(@AbstractC21993ag String str);
    }

    static {
        Covode.recordClassIndex(36735);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: c */
    public final String[] mo28603c() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: d */
    public final int mo28604d() {
        return 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.sdk.app.AbTestSdkInitTask$a */
    public static class C30229a extends C16087n {
        static {
            Covode.recordClassIndex(36739);
        }

        @Override // com.bytedance.ies.abmock.C16087n, com.bytedance.ies.abmock.datacenter.AbstractC16067f
        /* renamed from: a */
        public final boolean mo25497a() {
            return true;
        }

        @Override // com.bytedance.ies.abmock.C16087n, com.bytedance.ies.abmock.datacenter.AbstractC16067f
        /* renamed from: c */
        public final AbstractC16052a mo25499c() {
            return ConfigMock.INSTANCE;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: e */
    public final EnumC58149ac mo28605e() {
        return EnumC58149ac.CPU;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    static final /* synthetic */ String m61167a(String str) {
        try {
            return ((AbTestApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(AbTestApi.class)).doGet(str).get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        MethodCollector.m26663i(3421);
        C51423a.m95784a(3, null, "AbTestSdkInitTask");
        String str = C29739c.f70927a;
        C16083j a = C16083j.m29874a();
        a.f38736d = new C30229a();
        if (!(a.f38736d == null || !a.f38736d.mo25497a() || a.f38736d.mo25499c() == null)) {
            a.f38736d.mo25499c().init(context);
        }
        Application application = (Application) context;
        String trim = str.trim();
        C302271 r10 = new AbstractC14865j() {
            /* class com.p2082ss.android.sdk.app.AbTestSdkInitTask.C302271 */

            static {
                Covode.recordClassIndex(36736);
            }

            @Override // com.bytedance.p1007g.AbstractC14865j
            /* renamed from: a */
            public final <T> T mo23899a(String str, Type type) {
                return (T) new C33594aj(str, type).mo59938b();
            }
        };
        C302282 r7 = new AbstractC14864i() {
            /* class com.p2082ss.android.sdk.app.AbTestSdkInitTask.C302282 */

            /* renamed from: b */
            private C27910f f72113b = new C27910f();

            static {
                Covode.recordClassIndex(36737);
            }

            @Override // com.bytedance.p1007g.AbstractC14864i
            /* renamed from: a */
            public final <T> T mo23898a(String str, Type type) {
                return (T) this.f72113b.mo46671a(str, type);
            }
        };
        AbstractC14862g gVar = C30230a.f72114a;
        AbstractC14863h hVar = C30231b.f72115a;
        if (!C14853c.f36267d) {
            synchronized (C14853c.f36268e) {
                try {
                    if (!C14853c.f36267d) {
                        C14853c.f36266c = C14866k.m27292a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0060: SPUT  
                              (wrap: java.util.concurrent.Future : 0x005c: INVOKE  (r0v8 java.util.concurrent.Future) = 
                              (wrap: com.bytedance.g.c$1 : 0x0059: CONSTRUCTOR  (r4v0 com.bytedance.g.c$1) = 
                              (r5v1 'application' android.app.Application)
                              (r6v0 'trim' java.lang.String)
                              (r7v0 'r7' com.ss.android.sdk.app.AbTestSdkInitTask$2)
                              (r8v0 'gVar' com.bytedance.g.g)
                              (r9v0 'hVar' com.bytedance.g.h)
                              (r10v0 'r10' com.ss.android.sdk.app.AbTestSdkInitTask$1)
                             call: com.bytedance.g.c.1.<init>(android.app.Application, java.lang.String, com.bytedance.g.i, com.bytedance.g.g, com.bytedance.g.h, com.bytedance.g.j):void type: CONSTRUCTOR)
                             type: STATIC call: com.bytedance.g.k.a(java.lang.Runnable):java.util.concurrent.Future)
                             com.bytedance.g.c.c java.util.concurrent.Future in method: com.ss.android.sdk.app.AbTestSdkInitTask.a(android.content.Context):void, file: classes.dex
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
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005c: INVOKE  (r0v8 java.util.concurrent.Future) = 
                              (wrap: com.bytedance.g.c$1 : 0x0059: CONSTRUCTOR  (r4v0 com.bytedance.g.c$1) = 
                              (r5v1 'application' android.app.Application)
                              (r6v0 'trim' java.lang.String)
                              (r7v0 'r7' com.ss.android.sdk.app.AbTestSdkInitTask$2)
                              (r8v0 'gVar' com.bytedance.g.g)
                              (r9v0 'hVar' com.bytedance.g.h)
                              (r10v0 'r10' com.ss.android.sdk.app.AbTestSdkInitTask$1)
                             call: com.bytedance.g.c.1.<init>(android.app.Application, java.lang.String, com.bytedance.g.i, com.bytedance.g.g, com.bytedance.g.h, com.bytedance.g.j):void type: CONSTRUCTOR)
                             type: STATIC call: com.bytedance.g.k.a(java.lang.Runnable):java.util.concurrent.Future in method: com.ss.android.sdk.app.AbTestSdkInitTask.a(android.content.Context):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:439)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 36 more
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0059: CONSTRUCTOR  (r4v0 com.bytedance.g.c$1) = 
                              (r5v1 'application' android.app.Application)
                              (r6v0 'trim' java.lang.String)
                              (r7v0 'r7' com.ss.android.sdk.app.AbTestSdkInitTask$2)
                              (r8v0 'gVar' com.bytedance.g.g)
                              (r9v0 'hVar' com.bytedance.g.h)
                              (r10v0 'r10' com.ss.android.sdk.app.AbTestSdkInitTask$1)
                             call: com.bytedance.g.c.1.<init>(android.app.Application, java.lang.String, com.bytedance.g.i, com.bytedance.g.g, com.bytedance.g.h, com.bytedance.g.j):void type: CONSTRUCTOR in method: com.ss.android.sdk.app.AbTestSdkInitTask.a(android.content.Context):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 40 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.g.c, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 46 more
                            */
                        /*
                        // Method dump skipped, instructions count: 130
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.sdk.app.AbTestSdkInitTask.mo28600a(android.content.Context):void");
                    }
                }
