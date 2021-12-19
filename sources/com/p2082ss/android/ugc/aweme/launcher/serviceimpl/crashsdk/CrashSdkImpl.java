package com.p2082ss.android.ugc.aweme.launcher.serviceimpl.crashsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.p932j.AbstractC13901d;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi;
import com.p2082ss.android.ugc.aweme.p2305ag.C33441a;
import com.p2082ss.android.ugc.aweme.p2305ag.C33442b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl */
public final class CrashSdkImpl implements ICrashSdkApi {
    static {
        Covode.recordClassIndex(68134);
    }

    /* renamed from: b */
    public static ICrashSdkApi m104974b() {
        MethodCollector.m26663i(638);
        Object a = C81908b.m141854a(ICrashSdkApi.class, false);
        if (a != null) {
            ICrashSdkApi iCrashSdkApi = (ICrashSdkApi) a;
            MethodCollector.m26664o(638);
            return iCrashSdkApi;
        }
        if (C81908b.f183277ca == null) {
            synchronized (ICrashSdkApi.class) {
                try {
                    if (C81908b.f183277ca == null) {
                        C81908b.f183277ca = new CrashSdkImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(638);
                    throw th;
                }
            }
        }
        CrashSdkImpl crashSdkImpl = (CrashSdkImpl) C81908b.f183277ca;
        MethodCollector.m26664o(638);
        return crashSdkImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    /* renamed from: a */
    public final void mo95582a() {
        C33442b bVar = new C33442b();
        C33441a.f79487a = bVar;
        if (AbstractC13901d.f33870a == null) {
            return;
        }
        if (AbstractC13901d.f33871b) {
            C14019n.m25421b().mo22551a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: INVOKE  
                  (wrap: com.bytedance.crash.runtime.s : 0x000f: INVOKE  (r1v0 com.bytedance.crash.runtime.s) =  type: STATIC call: com.bytedance.crash.runtime.n.b():com.bytedance.crash.runtime.s)
                  (wrap: com.bytedance.crash.j.d$1 : 0x0015: CONSTRUCTOR  (r0v3 com.bytedance.crash.j.d$1) = (r2v0 'bVar' com.ss.android.ugc.aweme.ag.b) call: com.bytedance.crash.j.d.1.<init>(com.bytedance.crash.j.d):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.crash.runtime.s.a(java.lang.Runnable):boolean in method: com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl.a():void, file: classes9.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: CONSTRUCTOR  (r0v3 com.bytedance.crash.j.d$1) = (r2v0 'bVar' com.ss.android.ugc.aweme.ag.b) call: com.bytedance.crash.j.d.1.<init>(com.bytedance.crash.j.d):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl.a():void, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.crash.j.d, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
                this = this;
                com.ss.android.ugc.aweme.ag.b r2 = new com.ss.android.ugc.aweme.ag.b
                r2.<init>()
                com.p2082ss.android.ugc.aweme.p2305ag.C33441a.f79487a = r2
                java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.j.d> r0 = com.bytedance.crash.p932j.AbstractC13901d.f33870a
                if (r0 == 0) goto L_0x0021
                boolean r0 = com.bytedance.crash.p932j.AbstractC13901d.f33871b
                if (r0 == 0) goto L_0x001c
                com.bytedance.crash.runtime.s r1 = com.bytedance.crash.runtime.C14019n.m25421b()
                com.bytedance.crash.j.d$1 r0 = new com.bytedance.crash.j.d$1
                r0.<init>(r2)
                r1.mo22551a(r0)
                return
            L_0x001c:
                java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.j.d> r0 = com.bytedance.crash.p932j.AbstractC13901d.f33870a
                r0.add(r2)
            L_0x0021:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl.mo95582a():void");
        }

        @Override // com.p2082ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
        /* renamed from: a */
        public final boolean mo95584a(long j) {
            Keva repo;
            long j2 = 0;
            if (!(C33441a.f79487a == null || (repo = Keva.getRepo("crash_marker_repo")) == null)) {
                j2 = repo.getLong("key_last_time", 0);
            }
            if (System.currentTimeMillis() - j2 > j) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
        /* renamed from: a */
        public final void mo95583a(Throwable th, String str) {
            C89219l.m154721d(th, "");
            C89219l.m154721d(str, "");
            C13849d.m25015a(th, str);
        }
    }
