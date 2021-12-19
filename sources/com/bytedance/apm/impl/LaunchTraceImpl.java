package com.bytedance.apm.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.block.p766a.C12370g;
import com.bytedance.apm.internal.C12508a;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12410d;
import com.bytedance.apm.p772e.C12448b;
import com.bytedance.apm.p773f.C12451a;
import com.bytedance.apm.p773f.C12463b;
import com.bytedance.apm.p773f.C12468e;
import com.bytedance.apm.p773f.p774a.C12453a;
import com.bytedance.apm.p773f.p774a.C12455b;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.trace.C12609b;
import com.bytedance.apm.trace.C12634e;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.C21501k;
import com.bytedance.monitor.collector.LockMonitorManager;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.p1562p.p1564b.C21614c;
import com.bytedance.p802b.p831i.p832a.C13099c;
import com.bytedance.services.apm.api.ILaunchTrace;
import org.json.JSONObject;

public class LaunchTraceImpl implements ILaunchTrace {
    static {
        Covode.recordClassIndex(14305);
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startTrace() {
        C12609b.m22738a();
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void cancelTrace() {
        if (C12609b.f30661b) {
            C12455b.m22421b();
        }
        if (C12609b.f30660a != null) {
            C12609b.f30660a.f30759d.clear();
            C12609b.f30660a = null;
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endSpan(String str, String str2) {
        if (C12609b.f30660a != null) {
            C12634e eVar = C12609b.f30660a;
            C12448b bVar = eVar.f30759d.get(str + "#" + str2);
            if (bVar != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String name = Thread.currentThread().getName();
                bVar.f30238b = currentTimeMillis;
                bVar.f30239c = name;
                eVar.f30759d.put(str + "#" + str2, bVar);
            }
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startSpan(String str, String str2) {
        if (C12609b.f30660a != null) {
            C12634e eVar = C12609b.f30660a;
            if (eVar.f30759d.get(str + "#" + str2) == null) {
                eVar.f30759d.put(str + "#" + str2, new C12448b(System.currentTimeMillis()));
            }
        }
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endTrace(int i, String str, long j) {
        if (C12609b.f30661b) {
            C12455b.m22421b();
        }
        if (C12609b.f30660a != null) {
            C12634e eVar = C12609b.f30660a;
            if (i != -1 || !C12397c.m22288e()) {
                C12468e.C12469a aVar = null;
                if (eVar.mo20445a() && !C12463b.f30274a) {
                    C12463b.f30274a = true;
                    if (C12451a.C12452a.f30248a.mo20282a().f30275a && C12508a.m22479b(4)) {
                        aVar = C12468e.m22431a();
                    }
                }
                eVar.f30758c = System.currentTimeMillis();
                long j2 = eVar.f30758c - eVar.f30757b;
                if (j <= 0 || j2 <= j) {
                    if (eVar.mo20445a() && C21614c.f51258e && C12634e.f30756a) {
                        C12634e.f30756a = false;
                        long j3 = eVar.f30757b;
                        long j4 = eVar.f30758c;
                        long[] b = C12370g.m22231b();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (b != null) {
                            C12560b.C12564a.f30567a.mo20387a(new Runnable(b, uptimeMillis, j4, j3, i, "") {
                                /* class com.bytedance.apm.trace.C12634e.RunnableC126373 */

                                /* renamed from: a */
                                final /* synthetic */ long[] f30772a;

                                /* renamed from: b */
                                final /* synthetic */ long f30773b;

                                /* renamed from: c */
                                final /* synthetic */ long f30774c;

                                /* renamed from: d */
                                final /* synthetic */ long f30775d;

                                /* renamed from: e */
                                final /* synthetic */ int f30776e;

                                /* renamed from: f */
                                final /* synthetic */ String f30777f;

                                static {
                                    Covode.recordClassIndex(14454);
                                }

                                public final void run() {
                                    try {
                                        String a = C12370g.m22224a(this.f30772a, this.f30773b);
                                        if (!TextUtils.isEmpty(a)) {
                                            long j = this.f30774c - this.f30775d;
                                            JSONObject c = C21501k.m40384a().mo35102c();
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("is_main_process", C12397c.m22285b());
                                            jSONObject.put("block_duration", j);
                                            jSONObject.put("stack", a);
                                            jSONObject.put("stack_key", "1048574\n");
                                            jSONObject.put("scene", "launchTrace");
                                            jSONObject.put("cost_time", j);
                                            jSONObject.put("method_time", j);
                                            jSONObject.put("message", "launchTrace");
                                            jSONObject.put("event_type", "lag_drop_frame");
                                            JSONObject a2 = C13099c.m23558a().mo20937a(true);
                                            a2.put("crash_section", C12397c.m22279a(System.currentTimeMillis()));
                                            a2.put("trace_type", "launchTrace");
                                            a2.put("launchMode", String.valueOf(this.f30776e));
                                            a2.put("customLaunchMode", this.f30777f);
                                            jSONObject.put("custom", c);
                                            jSONObject.put("filters", a2);
                                            C12401a.m22303b().mo20179a(new C12410d("drop_frame_stack", jSONObject));
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }

                                {
                                    this.f30772a = r2;
                                    this.f30773b = r3;
                                    this.f30774c = r5;
                                    this.f30775d = r7;
                                    this.f30776e = r9;
                                    this.f30777f = r10;
                                }
                            });
                        }
                    }
                    if (!eVar.mo20445a() || !C12451a.C12452a.f30248a.mo20284b().f30663b || !C12508a.m22479b(8)) {
                        C12560b.C12564a.f30567a.mo20387a(new Runnable(aVar, i, "", str) {
                            /* class com.bytedance.apm.trace.C12634e.RunnableC126362 */

                            /* renamed from: a */
                            final /* synthetic */ C12468e.C12469a f30767a;

                            /* renamed from: b */
                            final /* synthetic */ int f30768b;

                            /* renamed from: c */
                            final /* synthetic */ String f30769c;

                            /* renamed from: d */
                            final /* synthetic */ String f30770d;

                            static {
                                Covode.recordClassIndex(14453);
                            }

                            public final void run() {
                                C12468e.C12469a aVar;
                                if (C12634e.this.mo20445a()) {
                                    long a = C12453a.m22419a();
                                    if (!(a == 0 || (aVar = this.f30767a) == null)) {
                                        aVar.f30308l = a;
                                    }
                                }
                                C12634e eVar = C12634e.this;
                                eVar.mo20444a(this.f30768b, this.f30769c, this.f30770d, eVar.f30758c, this.f30767a);
                            }

                            {
                                this.f30767a = r2;
                                this.f30768b = r3;
                                this.f30769c = r4;
                                this.f30770d = r5;
                            }
                        });
                    } else {
                        C12634e.C126351 r5 = new C12634e.AbstractC12638a(aVar, i, "", str) {
                            /* class com.bytedance.apm.trace.C12634e.C126351 */

                            /* renamed from: a */
                            final /* synthetic */ C12468e.C12469a f30762a;

                            /* renamed from: b */
                            final /* synthetic */ int f30763b;

                            /* renamed from: c */
                            final /* synthetic */ String f30764c;

                            /* renamed from: d */
                            final /* synthetic */ String f30765d;

                            static {
                                Covode.recordClassIndex(14452);
                            }

                            @Override // com.bytedance.apm.trace.C12634e.AbstractC12638a
                            /* renamed from: a */
                            public final void mo20446a(long j) {
                                C12468e.C12469a aVar;
                                C12468e.C12469a aVar2;
                                if (!(j == -1 || (aVar2 = this.f30762a) == null)) {
                                    aVar2.f30307k = j;
                                }
                                long a = C12453a.m22419a();
                                if (!(a == 0 || (aVar = this.f30762a) == null)) {
                                    aVar.f30308l = a;
                                }
                                C12634e eVar = C12634e.this;
                                eVar.mo20444a(this.f30763b, this.f30764c, this.f30765d, eVar.f30758c, this.f30762a);
                            }

                            {
                                this.f30762a = r2;
                                this.f30763b = r3;
                                this.f30764c = r4;
                                this.f30765d = r5;
                            }
                        };
                        if (!C12451a.C12452a.f30248a.mo20284b().f30666e) {
                            C21501k.m40384a();
                            LockMonitorManager.setOpenFetchStack(false);
                            if (C21501k.f51022a) {
                                try {
                                    MonitorJni.doCloseLockStackTrace();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        C12560b.C12564a.f30567a.mo20387a(new Runnable(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00da: INVOKE  
                              (wrap: com.bytedance.apm.p.b : 0x00d3: SGET  (r1v4 com.bytedance.apm.p.b) =  com.bytedance.apm.p.b.a.a com.bytedance.apm.p.b)
                              (wrap: com.bytedance.monitor.collector.k$3 : 0x00d7: CONSTRUCTOR  (r0v24 com.bytedance.monitor.collector.k$3) = 
                              (wrap: com.bytedance.monitor.collector.k : 0x00c8: INVOKE  (r3v0 com.bytedance.monitor.collector.k) =  type: STATIC call: com.bytedance.monitor.collector.k.a():com.bytedance.monitor.collector.k)
                              (wrap: com.bytedance.apm.f.a.c$1 : 0x00d0: CONSTRUCTOR  (r2v2 com.bytedance.apm.f.a.c$1) = ("is_launch_lock"), (r5v0 'r5' com.bytedance.apm.trace.e$1) call: com.bytedance.apm.f.a.c.1.<init>(java.lang.String, com.bytedance.apm.trace.e$a):void type: CONSTRUCTOR)
                             call: com.bytedance.monitor.collector.k.3.<init>(com.bytedance.monitor.collector.k, com.bytedance.monitor.collector.k$a):void type: CONSTRUCTOR)
                             type: VIRTUAL call: com.bytedance.apm.p.b.a(java.lang.Runnable):void in method: com.bytedance.apm.impl.LaunchTraceImpl.endTrace(int, java.lang.String, long):void, file: classes.dex
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d7: CONSTRUCTOR  (r0v24 com.bytedance.monitor.collector.k$3) = 
                              (wrap: com.bytedance.monitor.collector.k : 0x00c8: INVOKE  (r3v0 com.bytedance.monitor.collector.k) =  type: STATIC call: com.bytedance.monitor.collector.k.a():com.bytedance.monitor.collector.k)
                              (wrap: com.bytedance.apm.f.a.c$1 : 0x00d0: CONSTRUCTOR  (r2v2 com.bytedance.apm.f.a.c$1) = ("is_launch_lock"), (r5v0 'r5' com.bytedance.apm.trace.e$1) call: com.bytedance.apm.f.a.c.1.<init>(java.lang.String, com.bytedance.apm.trace.e$a):void type: CONSTRUCTOR)
                             call: com.bytedance.monitor.collector.k.3.<init>(com.bytedance.monitor.collector.k, com.bytedance.monitor.collector.k$a):void type: CONSTRUCTOR in method: com.bytedance.apm.impl.LaunchTraceImpl.endTrace(int, java.lang.String, long):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 40 more
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d0: CONSTRUCTOR  (r2v2 com.bytedance.apm.f.a.c$1) = ("is_launch_lock"), (r5v0 'r5' com.bytedance.apm.trace.e$1) call: com.bytedance.apm.f.a.c.1.<init>(java.lang.String, com.bytedance.apm.trace.e$a):void type: CONSTRUCTOR in method: com.bytedance.apm.impl.LaunchTraceImpl.endTrace(int, java.lang.String, long):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:697)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:631)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 46 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.f.a.c, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 53 more
                            */
                        /*
                        // Method dump skipped, instructions count: 275
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.impl.LaunchTraceImpl.endTrace(int, java.lang.String, long):void");
                    }
                }
