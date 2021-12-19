package com.p2082ss.android.ugc.aweme.p2719cv;

import android.os.SystemClock;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40774f;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.cv.b */
public final class RunnableC40765b implements Comparable, Runnable {

    /* renamed from: a */
    public Runnable f95429a;

    /* renamed from: b */
    public C40764a f95430b;

    /* renamed from: c */
    public long f95431c = SystemClock.uptimeMillis();

    /* renamed from: d */
    public Thread f95432d;

    static {
        Covode.recordClassIndex(48617);
    }

    public final int hashCode() {
        return this.f95429a.hashCode();
    }

    public final void run() {
        int i;
        Object obj;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f95432d = Thread.currentThread();
            Object obj2 = null;
            if ((this.f95429a instanceof FutureTask) && (C40780g.f95476b.mo70005a() || C40780g.f95476b.mo70007b())) {
                obj2 = (Callable) C40794p.m82281b(this.f95429a);
            }
            C40774f fVar = C40774f.C40778a.f95473a;
            if (C40780g.f95476b.mo70009c()) {
                fVar.f95456d.lock();
                try {
                    fVar.f95455c.put(this, fVar.f95454b);
                } finally {
                    fVar.f95456d.unlock();
                }
            }
            long j = uptimeMillis - this.f95431c;
            if (j < C40780g.f95475a.f95485d || !C40780g.f95476b.mo70005a()) {
                i = 3;
            } else {
                C1764a.m5928a("Task<%s> target=%s dispatch time cost: %d ms", new Object[]{Thread.currentThread().getName(), this.f95429a, Long.valueOf(j)});
                C40774f fVar2 = C40774f.C40778a.f95473a;
                if (obj2 != null) {
                    obj = obj2;
                } else {
                    obj = this.f95429a;
                }
                String name = this.f95430b.f95428a.name();
                int poolSize = this.f95430b.getPoolSize();
                int size = this.f95430b.getQueue().size();
                WeakReference weakReference = new WeakReference(obj);
                i = 3;
                C40774f.f95453a.execute(new Runnable(weakReference, name, poolSize, size, j) {
                    /* class com.p2082ss.android.ugc.aweme.p2719cv.C40774f.RunnableC407751 */

                    /* renamed from: a */
                    final /* synthetic */ WeakReference f95457a;

                    /* renamed from: b */
                    final /* synthetic */ String f95458b;

                    /* renamed from: c */
                    final /* synthetic */ int f95459c;

                    /* renamed from: d */
                    final /* synthetic */ int f95460d;

                    /* renamed from: e */
                    final /* synthetic */ long f95461e;

                    static {
                        /*
                            r0 = 48627(0xbdf3, float:6.8141E-41)
                            com.bytedance.covode.number.Covode.recordClassIndex(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2719cv.C40774f.RunnableC407751.<clinit>():void");
                    }

                    public final void run(
/*
[22] Method generation error in method: com.ss.android.ugc.aweme.cv.f.1.run():void, file: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.ss.android.ugc.aweme.cv.f.1.run():void, class status: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:266)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:132)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    
*/

                    {
                        /*
                            r0 = this;
                            com.p2082ss.android.ugc.aweme.p2719cv.C40774f.this = r1
                            r0.f95457a = r2
                            r0.f95458b = r3
                            r0.f95459c = r4
                            r0.f95460d = r5
                            r0.f95461e = r6
                            r0.<init>()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2719cv.C40774f.RunnableC407751.<init>(com.ss.android.ugc.aweme.cv.f, java.lang.ref.WeakReference, java.lang.String, int, int, long):void");
                    }
                });
            }
            this.f95429a.run();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 >= C40780g.f95475a.f95486e && C40780g.f95476b.mo70007b()) {
                Object[] objArr = new Object[i];
                objArr[0] = Thread.currentThread().getName();
                objArr[1] = this.f95429a;
                objArr[2] = Long.valueOf(uptimeMillis2);
                C1764a.m5928a("Task<%s> target=%s execute cost %d ms !!!", objArr);
                C40774f fVar3 = C40774f.C40778a.f95473a;
                if (obj2 == null) {
                    obj2 = this.f95429a;
                }
                String name2 = this.f95430b.f95428a.name();
                int poolSize2 = this.f95430b.getPoolSize();
                int size2 = this.f95430b.getQueue().size();
                C40774f.f95453a.execute(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0111: INVOKE  
                      (wrap: java.util.concurrent.ExecutorService : 0x010a: SGET  (r1v7 java.util.concurrent.ExecutorService) =  com.ss.android.ugc.aweme.cv.f.a java.util.concurrent.ExecutorService)
                      (wrap: com.ss.android.ugc.aweme.cv.f$2 : 0x010e: CONSTRUCTOR  (r5v1 com.ss.android.ugc.aweme.cv.f$2) = 
                      (r6v1 'fVar3' com.ss.android.ugc.aweme.cv.f)
                      (wrap: java.lang.ref.WeakReference : 0x0107: CONSTRUCTOR  (r7v1 java.lang.ref.WeakReference) = (r1v6 'obj2' java.lang.Object) call: java.lang.ref.WeakReference.<init>(java.lang.Object):void type: CONSTRUCTOR)
                      (r8v1 'name2' java.lang.String)
                      (r9v1 'poolSize2' int)
                      (r10v0 'size2' int)
                      (r11v1 'uptimeMillis2' long)
                     call: com.ss.android.ugc.aweme.cv.f.2.<init>(com.ss.android.ugc.aweme.cv.f, java.lang.ref.WeakReference, java.lang.String, int, int, long):void type: CONSTRUCTOR)
                     type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.cv.b.run():void, file: classes.dex
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x010e: CONSTRUCTOR  (r5v1 com.ss.android.ugc.aweme.cv.f$2) = 
                      (r6v1 'fVar3' com.ss.android.ugc.aweme.cv.f)
                      (wrap: java.lang.ref.WeakReference : 0x0107: CONSTRUCTOR  (r7v1 java.lang.ref.WeakReference) = (r1v6 'obj2' java.lang.Object) call: java.lang.ref.WeakReference.<init>(java.lang.Object):void type: CONSTRUCTOR)
                      (r8v1 'name2' java.lang.String)
                      (r9v1 'poolSize2' int)
                      (r10v0 'size2' int)
                      (r11v1 'uptimeMillis2' long)
                     call: com.ss.android.ugc.aweme.cv.f.2.<init>(com.ss.android.ugc.aweme.cv.f, java.lang.ref.WeakReference, java.lang.String, int, int, long):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.cv.b.run():void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.cv.f, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                // Method dump skipped, instructions count: 293
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2719cv.RunnableC40765b.run():void");
            }

            @Override // java.lang.Comparable
            public final int compareTo(Object obj) {
                Runnable runnable = this.f95429a;
                if (!(runnable instanceof Comparable) || !(obj instanceof RunnableC40765b)) {
                    return 0;
                }
                return ((Comparable) runnable).compareTo(((RunnableC40765b) obj).f95429a);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof RunnableC40765b) || !this.f95429a.equals(((RunnableC40765b) obj).f95429a)) {
                    return false;
                }
                return true;
            }

            RunnableC40765b(Runnable runnable, C40764a aVar) {
                this.f95429a = runnable;
                this.f95430b = aVar;
            }
        }
