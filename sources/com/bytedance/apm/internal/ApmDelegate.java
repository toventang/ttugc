package com.bytedance.apm.internal;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.C12450f;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.battery.C12311a;
import com.bytedance.apm.battery.C12314b;
import com.bytedance.apm.battery.C12323c;
import com.bytedance.apm.battery.C12329d;
import com.bytedance.apm.block.C12384b;
import com.bytedance.apm.block.p766a.C12352b;
import com.bytedance.apm.block.p766a.C12364f;
import com.bytedance.apm.block.p766a.C12370g;
import com.bytedance.apm.config.C12417b;
import com.bytedance.apm.config.C12419c;
import com.bytedance.apm.config.SlardarConfigManagerImpl;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.apm.impl.LaunchTraceImpl;
import com.bytedance.apm.impl.MonitorLogManagerImpl;
import com.bytedance.apm.p767c.AbstractC12398a;
import com.bytedance.apm.p767c.p768a.C12404d;
import com.bytedance.apm.p771d.C12442b;
import com.bytedance.apm.p773f.C12451a;
import com.bytedance.apm.p773f.p774a.C12455b;
import com.bytedance.apm.p775g.AbstractC12474b;
import com.bytedance.apm.p779k.C12526c;
import com.bytedance.apm.p779k.C12535e;
import com.bytedance.apm.p779k.C12548j;
import com.bytedance.apm.p779k.p781b.C12517a;
import com.bytedance.apm.p779k.p783c.C12530d;
import com.bytedance.apm.p788p.C12559a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12575a;
import com.bytedance.apm.p789q.C12584g;
import com.bytedance.apm.trace.AbstractC12604a;
import com.bytedance.apm.trace.C12629c;
import com.bytedance.apm.trace.C12633d;
import com.bytedance.apm.trace.p791b.C12625c;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.BinderMonitor;
import com.bytedance.monitor.collector.C21477c;
import com.bytedance.monitor.collector.C21483g;
import com.bytedance.monitor.collector.C21495h;
import com.bytedance.monitor.collector.C21499j;
import com.bytedance.monitor.collector.C21501k;
import com.bytedance.monitor.collector.C21506l;
import com.bytedance.monitor.collector.IOMonitor;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.news.common.service.manager.AbstractC21518a;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.p1562p.p1564b.AbstractC21621d;
import com.bytedance.p1562p.p1564b.C21614c;
import com.bytedance.p802b.C12912a;
import com.bytedance.services.apm.api.AbstractC22712e;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.ILaunchTrace;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.slardar.config.AbstractC22715a;
import com.bytedance.services.slardar.config.IConfigManager;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public class ApmDelegate implements AbstractC22715a {

    /* renamed from: r */
    private static long f30330r;

    /* renamed from: s */
    private static boolean f30331s;

    /* renamed from: t */
    private static boolean f30332t;

    /* renamed from: a */
    C12417b f30333a;

    /* renamed from: b */
    public AbstractC12604a f30334b;

    /* renamed from: c */
    public C12633d f30335c;

    /* renamed from: d */
    public C12419c f30336d;

    /* renamed from: e */
    AbstractC12474b f30337e;

    /* renamed from: f */
    public AbstractC22712e f30338f;

    /* renamed from: g */
    public SlardarConfigManagerImpl f30339g;

    /* renamed from: h */
    public volatile boolean f30340h;

    /* renamed from: i */
    public volatile boolean f30341i;

    /* renamed from: j */
    public volatile boolean f30342j;

    /* renamed from: k */
    public boolean f30343k;

    /* renamed from: l */
    public Set<Object> f30344l;

    /* renamed from: m */
    boolean f30345m;

    /* renamed from: n */
    public boolean f30346n;

    /* renamed from: o */
    List<String> f30347o;

    /* renamed from: p */
    List<String> f30348p;

    /* renamed from: q */
    List<String> f30349q;

    static {
        Covode.recordClassIndex(14309);
    }

    private void initEvilMethodTraceInject() {
        initTraceEvilMethod();
    }

    private ApmDelegate() {
        this.f30346n = true;
    }

    /* renamed from: com.bytedance.apm.internal.ApmDelegate$a */
    public static class C12507a {

        /* renamed from: a */
        public static final ApmDelegate f30372a = new ApmDelegate((byte) 0);

        static {
            Covode.recordClassIndex(14323);
        }
    }

    /* renamed from: b */
    public final C12417b mo20330b() {
        C12417b bVar = this.f30333a;
        if (bVar == null) {
            return C12417b.m22355a().mo20211a();
        }
        return bVar;
    }

    /* renamed from: c */
    private void m22459c() {
        SlardarConfigManagerImpl slardarConfigManagerImpl = new SlardarConfigManagerImpl();
        this.f30339g = slardarConfigManagerImpl;
        C21520c.m40426a(IConfigManager.class, slardarConfigManagerImpl);
        C21520c.m40425a(IMonitorLogManager.class, (AbstractC21518a) new AbstractC21518a<IMonitorLogManager>() {
            /* class com.bytedance.apm.internal.ApmDelegate.C125003 */

            static {
                Covode.recordClassIndex(14316);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.news.common.service.manager.AbstractC21518a
            /* renamed from: a */
            public final /* synthetic */ IMonitorLogManager mo20336a() {
                return new MonitorLogManagerImpl();
            }
        });
        C21520c.m40425a(IActivityLifeManager.class, (AbstractC21518a) new AbstractC21518a<IActivityLifeManager>() {
            /* class com.bytedance.apm.internal.ApmDelegate.C125014 */

            static {
                Covode.recordClassIndex(14317);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.news.common.service.manager.AbstractC21518a
            /* renamed from: a */
            public final /* synthetic */ IActivityLifeManager mo20336a() {
                return ActivityLifeObserver.getInstance();
            }
        });
        C21520c.m40425a(IApmAgent.class, (AbstractC21518a) new AbstractC21518a<IApmAgent>() {
            /* class com.bytedance.apm.internal.ApmDelegate.C125025 */

            static {
                Covode.recordClassIndex(14318);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.news.common.service.manager.AbstractC21518a
            /* renamed from: a */
            public final /* synthetic */ IApmAgent mo20336a() {
                return new ApmAgentServiceImpl();
            }
        });
        C21520c.m40425a(ILaunchTrace.class, (AbstractC21518a) new AbstractC21518a<ILaunchTrace>() {
            /* class com.bytedance.apm.internal.ApmDelegate.C125036 */

            static {
                Covode.recordClassIndex(14319);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.news.common.service.manager.AbstractC21518a
            /* renamed from: a */
            public final /* synthetic */ ILaunchTrace mo20336a() {
                return new LaunchTraceImpl();
            }
        });
    }

    private static void initTraceEvilMethod() {
        C21614c.m40561a(f30330r);
        C21614c.f51258e = f30331s;
        C21614c.f51257d = true;
        C12364f.f29788r.mo20119a();
        C12370g.m22225a();
        new C21614c((byte) 0).mo35280a();
        C21501k.m40384a().f51028f = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20327a() {
        if (!this.f30345m) {
            this.f30345m = true;
            C12559a.f30553a.post(new Runnable() {
                /* class com.bytedance.apm.internal.ApmDelegate.RunnableC124992 */

                static {
                    Covode.recordClassIndex(14315);
                }

                public final void run() {
                    C21495h.m40377a();
                }
            });
            C12384b bVar = new C12384b();
            bVar.f29868c.mo20169a(this.f30336d.f30085k);
            bVar.f29868c.f29906b = this.f30336d.f30084j;
            ActivityLifeObserver.getInstance().register(bVar);
            C12450f.m22415a(bVar);
            bVar.f29868c.f29905a = C12364f.f29788r.f29803o;
            C12364f.f29788r.mo20120a(bVar);
            bVar.f29867b = true;
            if (C12397c.m22288e()) {
                new String[]{"BlockDetector init: "};
            }
            if (ActivityLifeObserver.getInstance().isForeground()) {
                bVar.mo20163a();
            }
        }
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: d */
    public final void mo20038d() {
        this.f30340h = true;
        AbstractC12474b bVar = this.f30337e;
        if (bVar != null) {
            bVar.mo20294a();
        }
        JSONObject config = this.f30339g.getConfig();
        if (this.f30343k) {
            if (C12584g.m22673a(config, "performance_modules", "fd", "enable_upload") == 1) {
                new C12526c().mo20344h();
            }
            new C12548j().mo20344h();
            if (C12584g.m22673a(config, "performance_modules", "traffic", "enable_collect") == 1) {
                C12530d.C12531a.f30440a.mo20344h();
            }
        }
        if (this.f30336d.f30087m && C12584g.m22673a(config, "performance_modules", "battery", "enable_upload") == 1) {
            Context context = C12397c.f29931a;
            String a = C12575a.m22623a(Process.myPid());
            if (a != null && !a.contains(":") && a.equals(context.getPackageName())) {
                new C12329d().mo20344h();
                C12314b.C12317b.f29656a.mo20344h();
            }
            new C12323c().mo20344h();
            C12311a.C12312a.f29626a.mo20344h();
        }
        if (this.f30336d.f30083i && C12535e.C12536a.f30450a.mo20360a("block_monitor")) {
            mo20327a();
        }
    }

    /* synthetic */ ApmDelegate(byte b) {
        this();
    }

    /* renamed from: a */
    public final boolean mo20329a(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.f30340h || (slardarConfigManagerImpl = this.f30339g) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getLogTypeSwitch(str);
    }

    /* renamed from: b */
    public final boolean mo20331b(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.f30340h || (slardarConfigManagerImpl = this.f30339g) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getServiceSwitch(str);
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: a */
    public final void mo20180a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        if (optJSONObject != null) {
            this.f30346n = optJSONObject.optBoolean("enable_active_upload_alog", true);
        } else {
            this.f30346n = true;
        }
    }

    /* renamed from: a */
    public final void mo20328a(final Context context, final C12417b bVar) {
        if (!this.f30341i) {
            long nanoTime = System.nanoTime();
            this.f30341i = true;
            C12397c.m22287d();
            this.f30333a = bVar;
            AbstractC12604a aVar = this.f30334b;
            if (aVar != null) {
                bVar.f30037e = aVar;
            }
            C12633d dVar = this.f30335c;
            if (dVar != null) {
                this.f30333a.f30034b = dVar.f30753b;
                this.f30333a.f30035c = this.f30335c.f30752a;
                this.f30333a.f30038f = this.f30335c.f30755d;
                this.f30333a.f30039g = (long) this.f30335c.f30754c;
            }
            AbstractC12398a.f29957a = bVar.f30033a;
            Application a = C12575a.m22622a(context);
            C12397c.m22280a(a);
            ActivityLifeObserver.init(a);
            m22459c();
            C12397c.f29943m = bVar.f30047o;
            this.f30343k = C12397c.m22285b();
            final Runnable a2 = C12912a.m23153a(context);
            C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                /* class com.bytedance.apm.internal.ApmDelegate.RunnableC124941 */

                static {
                    Covode.recordClassIndex(14310);
                }

                public final void run() {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    ApmDelegate.this.f30339g.registerConfigListener(C12507a.f30372a);
                    if ((bVar.f30043k & 1) == 0 || C12451a.C12452a.f30248a.mo20282a().f30276b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C12404d.f29967i = z;
                    C12417b bVar = bVar;
                    long j = C12451a.C12452a.f30248a.mo20282a().f30280f;
                    if (j == -1) {
                        j = bVar.f30044l;
                    }
                    C12404d.f29966h = j;
                    Context context = context;
                    if (!C12508a.f30373a) {
                        C12508a.f30373a = true;
                        if (C12508a.f30374b == null) {
                            C12508a.f30374b = C34822d.m71158a(context, "monitor_switch_config", 0);
                        }
                        if (C12508a.f30374b != null) {
                            int i = C12508a.f30374b.getInt("monitor_switch_config_first_flag", 0);
                            C12508a.f30375c = i;
                            C12508a.f30376d = i;
                            C12508a.f30377e = C12508a.f30374b.getLong("monitor_switch_config_atrace_flag", 0);
                        }
                    }
                    if (ApmDelegate.this.f30343k) {
                        C12364f.f29788r.f29803o.f30573a.start();
                        C21499j.C21500a aVar = new C21499j.C21500a();
                        aVar.f51020g = C12508a.f30377e;
                        if (C12508a.f30377e == 0 || !C12508a.m22479b(2)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        aVar.f51014a = z2;
                        if (!bVar.f30042j || !C12508a.m22479b(2)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        aVar.f51015b = z3;
                        aVar.f51019f = C12508a.m22479b(64);
                        aVar.f51016c = false;
                        aVar.f51018e = true;
                        aVar.f51021h = (-536870912 & C12508a.f30375c) >>> 29;
                        C21501k a = C21501k.m40384a();
                        Context context2 = C12397c.f29931a;
                        C21499j jVar = new C21499j(aVar);
                        if (!a.f51025c) {
                            synchronized (a) {
                                if (!a.f51025c) {
                                    boolean a2 = C21501k.m40385a(context2);
                                    a.f51029g = jVar.f51011f;
                                    if (a.f51036n != null && !a.f51028f) {
                                        boolean z4 = a.f51029g;
                                    }
                                    if (a2) {
                                        if (C12397c.m22288e()) {
                                            try {
                                                if (C21501k.f51022a) {
                                                    MonitorJni.doSetDebugMode(true);
                                                }
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        a.f51037o = jVar;
                                        try {
                                            if (C21501k.f51022a) {
                                                MonitorJni.doInit();
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                        a.f51031i = new C21506l(jVar.f51013h);
                                        if (jVar.f51007b) {
                                            a.f51030h = new BinderMonitor(jVar.f51013h);
                                            MonitorJni.enableBinderHook();
                                        }
                                        if (jVar.f51006a) {
                                            a.f51032j = new C21477c(jVar.f51013h);
                                            a.f51032j.mo35077a(jVar.f51012g);
                                            if (jVar.f51008c) {
                                                try {
                                                    if (C21501k.f51022a) {
                                                        MonitorJni.doEnableLock();
                                                    }
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                        }
                                        if (jVar.f51009d) {
                                            a.f51033k = new IOMonitor(jVar.f51013h);
                                            if (C21501k.f51022a) {
                                                MonitorJni.doEnableIO();
                                            }
                                        }
                                    }
                                    if (jVar.f51010e) {
                                        a.f51034l = new C21483g(jVar.f51013h);
                                    }
                                    a.f51025c = true;
                                }
                            }
                        }
                        C21501k a3 = C21501k.m40384a();
                        for (int i2 = 0; i2 < a3.f51024b.size(); i2++) {
                            a3.f51024b.get(i2).mo35073a();
                        }
                        a3.f51026d = true;
                    }
                    
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x017f: CONSTRUCTOR  
                          (wrap: com.bytedance.apm.block.f : 0x0179: INVOKE  (r1v2 com.bytedance.apm.block.f) =  type: STATIC call: com.bytedance.apm.block.f.a():com.bytedance.apm.block.f)
                         call: com.bytedance.apm.block.f.1.<init>(com.bytedance.apm.block.f):void type: CONSTRUCTOR in method: com.bytedance.apm.internal.ApmDelegate.1.run():void, file: classes.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.block.f, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 14 more
                        */
                    /*
                    // Method dump skipped, instructions count: 394
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.internal.ApmDelegate.RunnableC124941.run():void");
                }
            });
            if (this.f30343k) {
                C12517a.m22506a(a, this.f30333a.f30045m);
                if (bVar.f30034b) {
                    new C12629c().mo20441a(bVar.f30035c);
                }
                AutoPageTraceHelper.setMaxValidTimeMs(bVar.f30035c);
                AutoLaunchTraceHelper.setMaxValidTimeMs(bVar.f30036d);
                f30332t = bVar.f30040h;
                f30330r = bVar.f30039g;
                f30331s = bVar.f30038f;
                boolean z = bVar.f30041i;
                C12364f.f29788r.mo20119a();
                if (z) {
                    final C12352b bVar2 = new C12352b();
                    C12625c.f30713s = bVar2;
                    C21614c.f51256b = new AbstractC21621d() {
                        /* class com.bytedance.apm.internal.ApmDelegate.C125069 */

                        static {
                            Covode.recordClassIndex(14322);
                        }

                        @Override // com.bytedance.p1562p.p1564b.AbstractC21621d
                        /* renamed from: a */
                        public final void mo20338a(long j, boolean z) {
                            C12364f.f29788r.f29803o.mo20398a(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE  
                                  (wrap: com.bytedance.apm.p.d : 0x0004: IGET  (r1v0 com.bytedance.apm.p.d) = 
                                  (wrap: com.bytedance.apm.block.a.f : 0x0002: SGET  (r0v0 com.bytedance.apm.block.a.f) =  com.bytedance.apm.block.a.f.r com.bytedance.apm.block.a.f)
                                 com.bytedance.apm.block.a.f.o com.bytedance.apm.p.d)
                                  (wrap: com.bytedance.apm.block.a.b$1 : 0x0008: CONSTRUCTOR  (r0v1 com.bytedance.apm.block.a.b$1) = 
                                  (wrap: com.bytedance.apm.block.a.b : 0x0000: IGET  (r2v0 com.bytedance.apm.block.a.b) = (r3v0 'this' com.bytedance.apm.internal.ApmDelegate$9 A[IMMUTABLE_TYPE, THIS]) com.bytedance.apm.internal.ApmDelegate.9.a com.bytedance.apm.block.a.b)
                                  (r4v0 'j' long)
                                  (r6v0 'z' boolean)
                                 call: com.bytedance.apm.block.a.b.1.<init>(com.bytedance.apm.block.a.b, long, boolean):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: com.bytedance.apm.p.d.a(java.lang.Runnable):boolean in method: com.bytedance.apm.internal.ApmDelegate.9.a(long, boolean):void, file: classes.dex
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
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: CONSTRUCTOR  (r0v1 com.bytedance.apm.block.a.b$1) = 
                                  (wrap: com.bytedance.apm.block.a.b : 0x0000: IGET  (r2v0 com.bytedance.apm.block.a.b) = (r3v0 'this' com.bytedance.apm.internal.ApmDelegate$9 A[IMMUTABLE_TYPE, THIS]) com.bytedance.apm.internal.ApmDelegate.9.a com.bytedance.apm.block.a.b)
                                  (r4v0 'j' long)
                                  (r6v0 'z' boolean)
                                 call: com.bytedance.apm.block.a.b.1.<init>(com.bytedance.apm.block.a.b, long, boolean):void type: CONSTRUCTOR in method: com.bytedance.apm.internal.ApmDelegate.9.a(long, boolean):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 14 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.block.a.b, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 20 more
                                */
                            /*
                                this = this;
                                com.bytedance.apm.block.a.b r2 = r1
                                com.bytedance.apm.block.a.f r0 = com.bytedance.apm.block.p766a.C12364f.f29788r
                                com.bytedance.apm.p.d r1 = r0.f29803o
                                com.bytedance.apm.block.a.b$1 r0 = new com.bytedance.apm.block.a.b$1
                                r0.<init>(r4, r6)
                                r1.mo20398a(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.internal.ApmDelegate.C125069.mo20338a(long, boolean):void");
                        }
                    };
                    C12364f.f29788r.mo20120a(bVar2);
                }
                initEvilMethodTraceInject();
                C12455b.m22422c();
                if (bVar.f30049q != null) {
                    C12451a.C12452a.f30248a.mo20283a(bVar.f30049q);
                }
                C12397c.f29944n = bVar.f30048p;
                C12397c.f29945o = bVar.f30050r;
                C12397c.f29934d = System.nanoTime() - nanoTime;
            }
            if (C12397c.m22288e()) {
                if (this.f30343k) {
                    C12442b.C12445a.f30223a.mo20275a("APM_INIT", (String) null);
                } else {
                    C12442b.C12445a.f30223a.mo20275a("APM_INIT_OTHER_PROCESS", (String) null);
                }
            }
            C12912a.m23153a(context);
            C12397c.f29949s = true;
        }
    }
}
