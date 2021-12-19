package com.p2082ss.android.p2092ad.splash.core.p2101f;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.C29687y;
import com.p2082ss.android.p2092ad.splash.core.C29387a;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.C29535k;
import com.p2082ss.android.p2092ad.splash.core.C29548u;
import com.p2082ss.android.p2092ad.splash.core.C29628x;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.p2094b.C29381b;
import com.p2082ss.android.p2092ad.splash.p2109f.C29638a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29645h;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.f.a */
public final class C29479a {

    /* renamed from: a */
    private static ExecutorService f70154a;

    static {
        Covode.recordClassIndex(35873);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        f70154a = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static void m59084a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            /* class com.p2082ss.android.p2092ad.splash.core.p2101f.C29479a.RunnableC294801 */

            static {
                Covode.recordClassIndex(35874);
            }

            public final void run() {
                C29495h.f70232h.submit(new Runnable() {
                    /* class com.p2082ss.android.p2092ad.splash.core.p2101f.C29479a.RunnableC294801.RunnableC294811 */

                    static {
                        Covode.recordClassIndex(35875);
                    }

                    public final void run() {
                        JSONArray jSONArray;
                        MethodCollector.m26663i(10877);
                        C29387a.m58870a();
                        if (C29495h.f70201Y) {
                            C29548u a = C29548u.m59321a();
                            C29638a.m59659a(0, " in non-realtime mode, prepare to request ");
                            if (!C29628x.m59641a().f70681h) {
                                if (!C29645h.m59695b(C29495h.f70242r)) {
                                    C29638a.m59659a(0, " network is unavailable, requesting data is impossible");
                                    MethodCollector.m26664o(10877);
                                    return;
                                } else if (a.mo51720c()) {
                                    a.mo51717b();
                                    MethodCollector.m26664o(10877);
                                    return;
                                } else {
                                    C29638a.m59659a(0, " too short to request ");
                                }
                            }
                            MethodCollector.m26664o(10877);
                            return;
                        }
                        C29548u a2 = C29548u.m59321a();
                        C29638a.m59659a(0, " in realtime mode, prepare to send preload request ");
                        if (!C29628x.m59641a().f70681h) {
                            if (!C29645h.m59695b(C29495h.f70242r)) {
                                C29638a.m59659a(0, " network is unavailable, requesting data is impossible");
                                MethodCollector.m26664o(10877);
                                return;
                            } else if (a2.mo51720c()) {
                                long currentTimeMillis = System.currentTimeMillis();
                                C29381b.m58846a().f69766b = false;
                                Future submit = C29495h.f70230f.submit(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007e: INVOKE  (r1v2 'submit' java.util.concurrent.Future) = 
                                      (wrap: java.util.concurrent.ExecutorService : 0x0077: SGET  (r1v1 java.util.concurrent.ExecutorService) =  com.ss.android.ad.splash.core.h.f java.util.concurrent.ExecutorService)
                                      (wrap: com.ss.android.ad.splash.core.u$2 : 0x007b: CONSTRUCTOR  (r0v9 com.ss.android.ad.splash.core.u$2) = (r10v0 'a2' com.ss.android.ad.splash.core.u) call: com.ss.android.ad.splash.core.u.2.<init>(com.ss.android.ad.splash.core.u):void type: CONSTRUCTOR)
                                     type: INTERFACE call: java.util.concurrent.ExecutorService.submit(java.util.concurrent.Callable):java.util.concurrent.Future in method: com.ss.android.ad.splash.core.f.a.1.1.run():void, file: classes9.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007b: CONSTRUCTOR  (r0v9 com.ss.android.ad.splash.core.u$2) = (r10v0 'a2' com.ss.android.ad.splash.core.u) call: com.ss.android.ad.splash.core.u.2.<init>(com.ss.android.ad.splash.core.u):void type: CONSTRUCTOR in method: com.ss.android.ad.splash.core.f.a.1.1.run():void, file: classes9.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 30 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ad.splash.core.u, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 36 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 677
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.p2101f.C29479a.RunnableC294801.RunnableC294811.run():void");
                            }
                        });
                    }
                }, C29495h.f70205ab);
            }

            /* renamed from: a */
            public static void m59085a(final C29455b bVar) {
                final Future<?> submit = C29495h.f70230f.submit(new Runnable() {
                    /* class com.p2082ss.android.p2092ad.splash.core.p2101f.C29479a.RunnableC294822 */

                    static {
                        Covode.recordClassIndex(35876);
                    }

                    public final void run() {
                        JSONObject jSONObject;
                        if (C29495h.f70227c != null && C29535k.m59196a().f70375h) {
                            long currentTimeMillis = System.currentTimeMillis() / 1000;
                            String e = C29654j.m59750e();
                            if (!TextUtils.isEmpty(e)) {
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    JSONArray jSONArray = new JSONArray();
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("ad_id", bVar.f70026d);
                                    jSONObject3.put("log_extra", bVar.f70032j);
                                    jSONObject3.put("timestamp", currentTimeMillis);
                                    jSONObject3.put("position", 0);
                                    jSONArray.put(jSONObject3);
                                    jSONObject2.put("ads", jSONArray);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                                int i = 0;
                                do {
                                    C29687y a = C29495h.f70227c.mo28696a(e, jSONObject2);
                                    if (a != null && a.f70828b && (jSONObject = a.f70827a) != null && jSONObject.optInt("code", -1) == 30001) {
                                        i++;
                                    } else {
                                        return;
                                    }
                                } while (i < 4);
                            }
                        }
                    }
                });
                f70154a.execute(new Runnable() {
                    /* class com.p2082ss.android.p2092ad.splash.core.p2101f.C29479a.RunnableC294833 */

                    static {
                        Covode.recordClassIndex(35877);
                    }

                    public final void run() {
                        try {
                            submit.get(5, TimeUnit.SECONDS);
                            C29644g.m59688b("show ack ends...");
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            C29479a.m59084a();
                        }
                    }
                });
            }

            /* renamed from: a */
            public static void m59086a(final boolean z) {
                if (C29495h.f70227c != null) {
                    long j = C29495h.f70206ac;
                    if (j <= 0) {
                        j = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        /* class com.p2082ss.android.p2092ad.splash.core.p2101f.C29479a.RunnableC294844 */

                        static {
                            Covode.recordClassIndex(35878);
                        }

                        public final void run() {
                            C29495h.f70230f.submit(new Callable<C29687y>() {
                                /* class com.p2082ss.android.p2092ad.splash.core.p2101f.C29479a.RunnableC294844.CallableC294851 */

                                static {
                                    Covode.recordClassIndex(35879);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // java.util.concurrent.Callable
                                public final /* synthetic */ C29687y call() {
                                    if (C29495h.f70227c == null) {
                                        return null;
                                    }
                                    String a = C29654j.m59716a(z);
                                    if (!C29657l.m59760a(a)) {
                                        return C29495h.f70227c.mo28699b(a);
                                    }
                                    return null;
                                }
                            });
                        }
                    }, j);
                }
            }
        }
