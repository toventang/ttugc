package com.bytedance.geckox.p1020g;

import android.os.Process;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.p1021h.C14954b;
import com.bytedance.geckox.p1021h.C14955c;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.p1023j.C14960b;
import com.bytedance.geckox.utils.C15051d;
import com.bytedance.geckox.utils.C15064m;
import com.bytedance.geckox.utils.ExecutorC15060k;
import com.bytedance.geckox.utils.FileLock;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.geckox.g.a */
public final class C14949a {

    /* renamed from: a */
    public String f36519a;

    /* renamed from: b */
    public volatile Long f36520b;

    /* renamed from: c */
    private String f36521c;

    /* renamed from: d */
    private String f36522d;

    /* renamed from: e */
    private volatile File f36523e;

    /* renamed from: f */
    private volatile C14950b f36524f;

    /* renamed from: g */
    private AtomicBoolean f36525g = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17062);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
        try {
            m27532a();
        } catch (Exception e) {
            C15051d.m27710a(e);
        }
    }

    /* renamed from: a */
    private void m27532a() {
        MethodCollector.m26663i(2729);
        if (this.f36525g.getAndSet(true)) {
            MethodCollector.m26664o(2729);
            return;
        }
        C14954b a = C14954b.m27539a(this.f36522d + File.separator + this.f36519a + File.separator + "select.lock");
        C14957a.m27543a("channel version loader clean");
        try {
            if (this.f36523e != null) {
                String str = this.f36523e.getAbsolutePath() + File.separator + "using.lock";
                synchronized (C14955c.f36538a) {
                    try {
                        Pair<FileLock, AtomicLong> pair = C14955c.f36538a.get(str);
                        if (pair != null) {
                            long decrementAndGet = ((AtomicLong) pair.second).decrementAndGet();
                            if (decrementAndGet < 0) {
                                RuntimeException runtimeException = new RuntimeException("using.lock count illegal");
                                MethodCollector.m26664o(2729);
                                throw runtimeException;
                            } else if (decrementAndGet == 0) {
                                ((FileLock) pair.first).mo24325a();
                                C14955c.f36538a.remove(str);
                            }
                        } else {
                            RuntimeException runtimeException2 = new RuntimeException("using.lock illegal state");
                            MethodCollector.m26664o(2729);
                            throw runtimeException2;
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(2729);
                        throw th;
                    }
                }
                a.mo24076a();
                ExecutorC15060k.m27731a().execute(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c6: INVOKE  
                      (wrap: com.bytedance.geckox.utils.k : 0x00bd: INVOKE  (r1v15 com.bytedance.geckox.utils.k) =  type: STATIC call: com.bytedance.geckox.utils.k.a():com.bytedance.geckox.utils.k)
                      (wrap: com.bytedance.geckox.b.b$1 : 0x00c3: CONSTRUCTOR  (r0v29 com.bytedance.geckox.b.b$1) = 
                      (wrap: java.lang.Long : 0x00bb: IGET  (r2v2 java.lang.Long) = (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.b java.lang.Long)
                      (wrap: java.lang.String : ?: STR_CONCAT  (r3v1 java.lang.String) = 
                      (wrap: java.lang.String : 0x00a5: IGET  (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.d java.lang.String)
                      (wrap: java.lang.String : 0x00ab: SGET   java.io.File.separator java.lang.String)
                      (wrap: java.lang.String : 0x00b1: IGET  (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.a java.lang.String)
                    )
                     call: com.bytedance.geckox.b.b.1.<init>(java.lang.Long, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: com.bytedance.geckox.utils.k.execute(java.lang.Runnable):void in method: com.bytedance.geckox.g.a.a():void, file: classes2.dex
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c3: CONSTRUCTOR  (r0v29 com.bytedance.geckox.b.b$1) = 
                      (wrap: java.lang.Long : 0x00bb: IGET  (r2v2 java.lang.Long) = (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.b java.lang.Long)
                      (wrap: java.lang.String : ?: STR_CONCAT  (r3v1 java.lang.String) = 
                      (wrap: java.lang.String : 0x00a5: IGET  (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.d java.lang.String)
                      (wrap: java.lang.String : 0x00ab: SGET   java.io.File.separator java.lang.String)
                      (wrap: java.lang.String : 0x00b1: IGET  (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.a java.lang.String)
                    )
                     call: com.bytedance.geckox.b.b.1.<init>(java.lang.Long, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.geckox.g.a.a():void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.geckox.b.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 36 more
                    */
                /*
                // Method dump skipped, instructions count: 241
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p1020g.C14949a.m27532a():void");
            }

            /* renamed from: b */
            private synchronized File m27533b(String str) {
                MethodCollector.m26663i(2697);
                if (this.f36523e != null) {
                    File file = this.f36523e;
                    MethodCollector.m26664o(2697);
                    return file;
                }
                C14954b a = C14954b.m27539a(this.f36522d + File.separator + str + File.separator + "select.lock");
                try {
                    if (this.f36520b == null) {
                        this.f36520b = C15064m.m27738a(new File(this.f36522d, str));
                    }
                    if (this.f36520b == null) {
                        a.mo24076a();
                        MethodCollector.m26664o(2697);
                        return null;
                    }
                    File file2 = new File(this.f36522d, File.separator + str + File.separator + this.f36520b + File.separator + "using.lock");
                    this.f36523e = file2.getParentFile();
                    String absolutePath = file2.getAbsolutePath();
                    synchronized (C14955c.f36538a) {
                        try {
                            Pair<FileLock, AtomicLong> pair = C14955c.f36538a.get(absolutePath);
                            if (pair == null) {
                                pair = new Pair<>(FileLock.m27696a(absolutePath, Process.myPid()), new AtomicLong(0));
                                C14955c.f36538a.put(absolutePath, pair);
                            }
                            ((AtomicLong) pair.second).incrementAndGet();
                        } catch (Throwable th) {
                            MethodCollector.m26664o(2697);
                            throw th;
                        }
                    }
                    return this.f36523e;
                } finally {
                    a.mo24076a();
                    MethodCollector.m26664o(2697);
                }
            }

            /* renamed from: a */
            public final synchronized C14950b mo24071a(String str) {
                MethodCollector.m26663i(2666);
                if (this.f36524f != null) {
                    C14950b bVar = this.f36524f;
                    MethodCollector.m26664o(2666);
                    return bVar;
                }
                File b = m27533b(str);
                if (b != null) {
                    C14960b.m27549a(this.f36521c, str, b.getName(), "1", "true", System.currentTimeMillis());
                    File file = new File(b, "res");
                    if (!file.exists() || !file.isDirectory()) {
                        RuntimeException runtimeException = new RuntimeException("can not find res, dir:" + b.getAbsolutePath());
                        MethodCollector.m26664o(2666);
                        throw runtimeException;
                    }
                    this.f36524f = new C14950b(b);
                    C14950b bVar2 = this.f36524f;
                    MethodCollector.m26664o(2666);
                    return bVar2;
                }
                C14960b.m27549a(this.f36521c, str, "null", "1", "false", System.currentTimeMillis());
                FileNotFoundException fileNotFoundException = new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
                MethodCollector.m26664o(2666);
                throw fileNotFoundException;
            }

            C14949a(String str, String str2, String str3) {
                this.f36521c = str;
                this.f36522d = str2;
                this.f36519a = str3;
            }
        }
