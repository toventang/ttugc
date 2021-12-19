package com.bytedance.geckox;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.p1017e.C14911b;
import com.bytedance.geckox.p1019f.C14934b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.policy.loop.C14994b;
import com.bytedance.geckox.policy.p1031e.C14992a;
import com.bytedance.geckox.policy.p1032v4.C15001a;
import com.bytedance.geckox.settings.C15010b;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.p1033a.AbstractC15009b;
import com.bytedance.geckox.settings.p1033a.C15008a;
import com.bytedance.geckox.statistic.AbstractC15017a;
import com.bytedance.geckox.statistic.C15020b;
import com.bytedance.geckox.statistic.C15035c;
import com.bytedance.geckox.utils.C15044a;
import com.bytedance.geckox.utils.C15057h;
import com.bytedance.geckox.utils.C15059j;
import com.bytedance.geckox.utils.C15067n;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.f */
public class C14930f {

    /* renamed from: i */
    public static boolean f36473i = true;

    /* renamed from: k */
    private static C14930f f36474k;

    /* renamed from: a */
    public Map<String, String> f36475a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> f36476b = new ConcurrentHashMap();

    /* renamed from: c */
    public Context f36477c;

    /* renamed from: d */
    public GeckoGlobalConfig f36478d;

    /* renamed from: e */
    public C15010b f36479e;

    /* renamed from: f */
    public C15001a f36480f;

    /* renamed from: g */
    public long f36481g;

    /* renamed from: h */
    public boolean f36482h = false;

    /* renamed from: j */
    public AbstractC15017a f36483j;

    /* renamed from: l */
    private Common f36484l;

    /* renamed from: m */
    private AtomicBoolean f36485m = new AtomicBoolean(false);

    /* renamed from: d */
    public final GeckoGlobalConfig mo24033d() {
        mo24038i();
        return this.f36478d;
    }

    static {
        Covode.recordClassIndex(17043);
    }

    private C14930f() {
    }

    /* renamed from: e */
    public final GlobalConfigSettings mo24034e() {
        mo24038i();
        if (this.f36478d == null) {
            return null;
        }
        mo24039j();
        C15010b bVar = this.f36479e;
        if (bVar == null) {
            return null;
        }
        return bVar.f36671c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.geckox.f$1 */
    public static /* synthetic */ class C149311 {

        /* renamed from: a */
        static final /* synthetic */ int[] f36486a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 17044(0x4294, float:2.3884E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.geckox.GeckoGlobalConfig$ENVType[] r0 = com.bytedance.geckox.GeckoGlobalConfig.ENVType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.geckox.C14930f.C149311.f36486a = r2
                com.bytedance.geckox.GeckoGlobalConfig$ENVType r0 = com.bytedance.geckox.GeckoGlobalConfig.ENVType.BOE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.geckox.C14930f.C149311.f36486a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.geckox.GeckoGlobalConfig$ENVType r0 = com.bytedance.geckox.GeckoGlobalConfig.ENVType.DEV     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.geckox.C14930f.C149311.f36486a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.geckox.GeckoGlobalConfig$ENVType r0 = com.bytedance.geckox.GeckoGlobalConfig.ENVType.PROD     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.C14930f.C149311.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C14930f m27473a() {
        MethodCollector.m26663i(3200);
        if (f36474k == null) {
            synchronized (C14930f.class) {
                try {
                    if (f36474k == null) {
                        f36474k = new C14930f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3200);
                    throw th;
                }
            }
        }
        C14930f fVar = f36474k;
        MethodCollector.m26664o(3200);
        return fVar;
    }

    /* renamed from: b */
    public final Common mo24031b() {
        if (this.f36484l == null) {
            this.f36484l = new Common(this.f36478d.getAppId(), this.f36478d.getAppVersion(), this.f36478d.getDeviceId(), this.f36478d.getRegion());
        }
        return this.f36484l;
    }

    /* renamed from: c */
    public final Common mo24032c() {
        Common common = new Common(this.f36478d.getAppId(), this.f36478d.getAppVersion(), this.f36478d.getDeviceId(), this.f36478d.getRegion());
        common.appName = C15044a.m27705b(this.f36477c);
        common.f36579ac = C15059j.m27729a(this.f36477c);
        return common;
    }

    /* renamed from: f */
    public final void mo24035f() {
        int i = C149311.f36486a[mo24033d().getEnv().ordinal()];
        if (i == 1 || i == 2) {
            C15067n a = C15067n.m27740a();
            a.mo24339a(this.f36477c);
            f36473i = a.f36786a.getBoolean("gecko_switch", true);
        }
    }

    /* renamed from: j */
    public final synchronized void mo24039j() {
        MethodCollector.m26663i(3292);
        if (this.f36479e == null) {
            this.f36479e = new C15010b(this.f36478d);
            C14932a aVar = new C14932a(this, (byte) 0);
            C15010b bVar = this.f36479e;
            if (bVar != null) {
                C15008a aVar2 = bVar.f36672d;
                if (aVar2.f36668a == null) {
                    aVar2.f36668a = new CopyOnWriteArrayList();
                }
                aVar2.f36668a.add(aVar);
            }
        }
        MethodCollector.m26664o(3292);
    }

    /* renamed from: g */
    public final boolean mo24036g() {
        boolean z;
        mo24035f();
        GlobalConfigSettings e = mo24034e();
        if (e == null || e.getReqMeta() == null) {
            C14957a.m27543a("gecko update enable:", Boolean.valueOf(f36473i));
            return f36473i;
        }
        if (e.getReqMeta().getEnable() != 1 || !f36473i) {
            z = false;
        } else {
            z = true;
        }
        C14957a.m27543a("gecko update enable:", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: h */
    public final boolean mo24037h() {
        boolean z;
        GlobalConfigSettings e = mo24034e();
        if (e == null || e.getReqMeta() == null) {
            boolean g = mo24036g();
            C14957a.m27543a("gecko update combine enable:", Boolean.valueOf(g));
            return g;
        }
        if (!mo24036g() || e.getReqMeta().getPollEnable() != 1) {
            z = false;
        } else {
            z = true;
        }
        C14957a.m27543a("gecko update combine enable:", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: i */
    public final synchronized void mo24038i() {
        IGeckoGlobalInit iGeckoGlobalInit;
        String str;
        MethodCollector.m26663i(3290);
        if (!(this.f36485m.get() || (iGeckoGlobalInit = (IGeckoGlobalInit) ServiceManager.get().getServiceForReal(IGeckoGlobalInit.class)) == null || iGeckoGlobalInit.mo23936a() == null)) {
            GeckoGlobalConfig a = iGeckoGlobalInit.mo23936a();
            this.f36485m.set(true);
            this.f36478d = a;
            Context context = a.getContext();
            this.f36477c = context;
            C15057h.m27721a(context);
            C14994b a2 = C14994b.m27595a();
            GeckoGlobalConfig geckoGlobalConfig = this.f36478d;
            C14957a.m27543a("loop manager init");
            C14905e.C14906a a3 = new C14905e.C14906a(geckoGlobalConfig.getContext()).mo24005a(geckoGlobalConfig.getAppId());
            a3.f36428j = geckoGlobalConfig.getDeviceId();
            a3.f36419a = geckoGlobalConfig.getNetWork();
            a3.f36424f = geckoGlobalConfig.getStatisticMonitor();
            a3.f36429k = geckoGlobalConfig.getHost();
            a2.f36629a = a3.mo24014b("gecko").mo24012a("gecko").mo24015b();
            C14992a a4 = C14992a.m27593a();
            GeckoGlobalConfig geckoGlobalConfig2 = this.f36478d;
            if (a4.f36627c.compareAndSet(false, true)) {
                C14905e.C14906a a5 = new C14905e.C14906a(geckoGlobalConfig2.getContext()).mo24005a(geckoGlobalConfig2.getAppId());
                a5.f36428j = geckoGlobalConfig2.getDeviceId();
                a5.f36419a = geckoGlobalConfig2.getNetWork();
                a5.f36424f = geckoGlobalConfig2.getStatisticMonitor();
                a5.f36429k = geckoGlobalConfig2.getHost();
                a4.f36626a = a5.mo24014b("gecko").mo24012a("gecko").mo24015b();
                C14992a.f36624b = System.currentTimeMillis();
            }
            this.f36481g = System.currentTimeMillis();
            if (!C15020b.f36693a) {
                C15020b.f36693a = true;
                C14934b.m27506a(C14911b.class, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f4: INVOKE  
                      (wrap: java.lang.Class : 0x00ed: CONST_CLASS   com.bytedance.geckox.e.b.class)
                      (wrap: com.bytedance.geckox.statistic.b$1 : 0x00f1: CONSTRUCTOR  (r0v52 com.bytedance.geckox.statistic.b$1) =  call: com.bytedance.geckox.statistic.b.1.<init>():void type: CONSTRUCTOR)
                     type: STATIC call: com.bytedance.geckox.f.b.a(java.lang.Class, com.bytedance.q.b.a):void in method: com.bytedance.geckox.f.i():void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f1: CONSTRUCTOR  (r0v52 com.bytedance.geckox.statistic.b$1) =  call: com.bytedance.geckox.statistic.b.1.<init>():void type: CONSTRUCTOR in method: com.bytedance.geckox.f.i():void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.geckox.statistic.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                // Method dump skipped, instructions count: 543
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.C14930f.mo24038i():void");
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.geckox.f$a */
            public class C14932a extends AbstractC15009b {
                static {
                    Covode.recordClassIndex(17045);
                }

                @Override // com.bytedance.geckox.settings.p1033a.AbstractC15009b
                /* renamed from: a */
                public final void mo24041a(GlobalConfigSettings globalConfigSettings) {
                    m27486b(globalConfigSettings);
                }

                private C14932a() {
                }

                /* renamed from: b */
                private void m27486b(GlobalConfigSettings globalConfigSettings) {
                    if (C14930f.this.f36478d != null && globalConfigSettings != null && globalConfigSettings.getReqMeta() != null) {
                        if (C14930f.this.f36480f == null) {
                            C14930f.this.f36480f = new C15001a(C14930f.this.f36478d);
                        }
                        C14930f.this.f36480f.mo24236a(C14930f.this.f36481g, globalConfigSettings.getReqMeta());
                        C14994b.m27595a().mo24209a(C14930f.this.mo24037h());
                        C14994b.m27595a().mo24208a(globalConfigSettings.getReqMeta().getCheckUpdate());
                    }
                }

                /* synthetic */ C14932a(C14930f fVar, byte b) {
                    this();
                }

                @Override // com.bytedance.geckox.settings.p1033a.AbstractC15009b
                /* renamed from: a */
                public final void mo24040a(int i, String str) {
                    super.mo24040a(i, str);
                    if (i == 2103) {
                        C14994b.m27595a().mo24210b();
                    } else if (!C14930f.this.f36482h) {
                        C14930f.this.f36482h = true;
                        m27486b(C14930f.this.mo24034e());
                    }
                }
            }

            /* renamed from: a */
            public final boolean mo24030a(boolean z) {
                GlobalConfigSettings e = mo24034e();
                if (e == null || e.getReqMeta() == null) {
                    return z;
                }
                if (e.getReqMeta().getFreControlEnable() != 1 || !z) {
                    return false;
                }
                return true;
            }

            /* renamed from: a */
            public final void mo24029a(String str, Map<String, OptionCheckUpdateParams.CustomValue> map) {
                C14957a.m27543a("gecko register custom params,accessKey:" + str + ",custom params:" + map.keySet());
                Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map2 = this.f36476b;
                if (!TextUtils.isEmpty(str) && !map.isEmpty()) {
                    Map<String, OptionCheckUpdateParams.CustomValue> map3 = map2.get(str);
                    if (map3 != null) {
                        map3.putAll(map);
                    } else {
                        map2.put(str, map);
                    }
                }
            }

            /* renamed from: a */
            public final void mo24028a(String str, String str2) {
                String str3 = this.f36475a.get(str);
                if (TextUtils.isEmpty(str3)) {
                    this.f36475a.put(str, str2);
                    C14957a.m27543a("gecko register root dir,accessKey:" + str + ",root dir:" + str2);
                    return;
                }
                if (str3.endsWith("/")) {
                    str3 = str3.substring(0, str3.length() - 1);
                }
                if (str2.endsWith("/")) {
                    str2 = str2.substring(0, str2.length() - 1);
                }
                if (!str3.equals(str2)) {
                    String a = C1764a.m5928a("oldPath: %s, newPath: %s, stackTrace: %s", new Object[]{str3, str2, Log.getStackTraceString(new Throwable())});
                    C14957a.m27543a(C1764a.m5928a("registerAccessKey2Dir error for ak: %s, %s", new Object[]{str, a}), true);
                    C15035c.m27678a(1, 11, a, str);
                }
            }
        }
