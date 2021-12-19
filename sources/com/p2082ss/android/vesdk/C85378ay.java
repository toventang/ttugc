package com.p2082ss.android.vesdk;

import android.content.Context;
import android.os.Build;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.p2082ss.android.medialib.VideoSdkCore;
import com.p2082ss.android.ttve.log.C30653a;
import com.p2082ss.android.ttve.log.TELog2ClientInvoker;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30685c;
import com.p2082ss.android.ttve.monitor.C30689e;
import com.p2082ss.android.ttve.monitor.C30693g;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttve.monitor.TEMonitorInvoker;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.vesdk.C85568t;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESensService;
import com.p2082ss.android.vesdk.runtime.C85554c;
import com.p2082ss.android.vesdk.runtime.C85557f;
import com.p2082ss.android.vesdk.runtime.VEEffectConfig;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import com.p2082ss.android.vesdk.runtime.p4393a.C85551a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.ay */
public class C85378ay {

    /* renamed from: a */
    public static int f191110a = C30695h.f73417a;

    /* renamed from: a */
    public static void m146868a() {
        C30689e.f73394e = true;
    }

    /* renamed from: a */
    public static void m146876a(boolean z) {
        MethodCollector.m26663i(2263);
        if (!VERuntime.EnumC85549a.INSTANCE.f191667b.f191652k) {
            C85315al.m146642d("VERuntime", "runtime not init");
            C85615x xVar = new C85615x(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.m26664o(2263);
            throw xVar;
        }
        VERuntime.nativeEnableImport10BitByteVC1Video(false);
        MethodCollector.m26664o(2263);
    }

    /* renamed from: a */
    public static void m146877a(boolean z, int i) {
        MethodCollector.m26663i(3135);
        VERuntime vERuntime = VERuntime.EnumC85549a.INSTANCE.f191667b;
        if (!vERuntime.f191652k) {
            C85315al.m146642d("VERuntime", "runtime not init");
            C85615x xVar = new C85615x(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.m26664o(3135);
            throw xVar;
        }
        if (i <= 320) {
            i = 330;
        }
        vERuntime.nativeEnableHDH264HWDecoder(z, i);
        MethodCollector.m26664o(3135);
    }

    /* renamed from: a */
    public static void m146878a(boolean z, int i, int i2) {
        MethodCollector.m26663i(3168);
        VERuntime vERuntime = VERuntime.EnumC85549a.INSTANCE.f191667b;
        if (!vERuntime.f191652k) {
            C85315al.m146642d("VERuntime", "runtime not init");
            C85615x xVar = new C85615x(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.m26664o(3168);
            throw xVar;
        }
        vERuntime.nativeEnableHighFpsByteVC1HWDecoder(z, i, i2);
        MethodCollector.m26664o(3168);
    }

    /* renamed from: c */
    public static void m146882c() {
        VEEffectConfig.setUseNewEffectAlgorithmApi(true);
    }

    static {
        Covode.recordClassIndex(99490);
    }

    /* renamed from: b */
    public static void m146879b() {
        MethodCollector.m26663i(3130);
        VERuntime vERuntime = VERuntime.EnumC85549a.INSTANCE.f191667b;
        if (!vERuntime.f191652k) {
            C85315al.m146642d("VERuntime", "runtime not init");
            C85615x xVar = new C85615x(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.m26664o(3130);
            throw xVar;
        }
        vERuntime.nativeEnableTTByteVC1Decoder(true);
        MethodCollector.m26664o(3130);
    }

    /* renamed from: d */
    private static void m146884d() {
        MethodCollector.m26663i(1815);
        int i = 0;
        if (((Integer) C85568t.m147473a().mo131557a("use_open_gl_three", (Object) 1)).intValue() == 1) {
            int i2 = Build.VERSION.SDK_INT;
            VERuntime.EnumC85549a.INSTANCE.f191667b.f191646e = true;
            VideoSdkCore.enableGLES3(true);
        } else {
            C85315al.m146637a("VESDK", "No gles config");
        }
        VERuntime.nativeEnableAudioSDKApiV2(((Boolean) C85568t.m147473a().mo131557a("aeabtest_v2api", (Object) false)).booleanValue());
        VERuntime.nativeEnableCrossPlatGLBaseFBO(((Boolean) C85568t.m147473a().mo131557a("crossplat_glbase_fbo", (Object) false)).booleanValue());
        VERuntime.nativeEnableRenderLib(((Boolean) C85568t.m147473a().mo131557a("enable_render_lib", (Object) false)).booleanValue());
        VESensService.getInstance().init();
        int registerSensCheckObject = VESensService.getInstance().registerSensCheckObject(VESensService.SENS_SERVICE_TYPE_MIC);
        int registerSensCheckObject2 = VESensService.getInstance().registerSensCheckObject(VESensService.SENS_SERVICE_TYPE_CAMERA);
        VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject, VESensService.EnumC85265a.ACTION_TYPE_ALOG);
        VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject2, VESensService.EnumC85265a.ACTION_TYPE_ALOG);
        C85315al.m146637a("VESDK", "error action type default value:ACTION_TYPE_ALOG");
        C85568t.C85573d a = C85568t.m147473a().mo131556a("privacy_error_action");
        if (!(a == null || a.f191742b == null || !(a.f191742b instanceof Integer))) {
            int intValue = ((Integer) a.f191742b).intValue();
            VESensService.EnumC85265a[] values = VESensService.EnumC85265a.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                VESensService.EnumC85265a aVar = values[i];
                if (intValue == aVar.getActionType()) {
                    VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject, aVar);
                    VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject2, aVar);
                    break;
                }
                i++;
            }
            C85315al.m146637a("VESDK", "error action type value:".concat(String.valueOf(intValue)));
        }
        C85568t.C85573d a2 = C85568t.m147473a().mo131556a("privacy_error_check_interval");
        if (!(a2 == null || a2.f191742b == null || !(a2.f191742b instanceof Integer))) {
            int intValue2 = ((Integer) a2.f191742b).intValue();
            VESensService.getInstance().setObjectStatusCheckInterval(intValue2);
            C85315al.m146637a("VESDK", "error monitor time out value:".concat(String.valueOf(intValue2)));
        }
        C85568t.C85573d a3 = C85568t.m147473a().mo131556a("privacy_error_check_threshold");
        if (!(a3 == null || a3.f191742b == null || !(a3.f191742b instanceof Integer))) {
            int intValue3 = ((Integer) a3.f191742b).intValue();
            VESensService.getInstance().setObjectStatusCheckThreshold(registerSensCheckObject, intValue3);
            VESensService.getInstance().setObjectStatusCheckThreshold(registerSensCheckObject2, intValue3);
            C85315al.m146637a("VESDK", "error threshold time out value:".concat(String.valueOf(intValue3)));
        }
        MethodCollector.m26664o(1815);
    }

    /* renamed from: a */
    public static void m146870a(ResourceFinder resourceFinder) {
        VERuntime.EnumC85549a.INSTANCE.f191667b.mo131509a(resourceFinder);
    }

    /* renamed from: a */
    public static void m146871a(VEListener.AbstractC85224ac acVar) {
        VERuntime vERuntime = VERuntime.EnumC85549a.INSTANCE.f191667b;
        vERuntime.f191653l = new WeakReference<>(acVar);
        C30695h.f73419c = new WeakReference<>(vERuntime.f191656o);
    }

    /* renamed from: c */
    public static void m146883c(boolean z) {
        if (VERuntime.EnumC85549a.INSTANCE.f191667b.f191645d == null) {
            throw new C85615x(-108, "please set VEEnv or VEEnv#init");
        }
        VEEffectConfig.setEnableStickerAmazing(z);
    }

    /* renamed from: d */
    public static void m146885d(boolean z) {
        if (VERuntime.EnumC85549a.INSTANCE.f191667b.f191645d == null) {
            throw new C85615x(-108, "please set VEEnv or VEEnv#init");
        }
        VEEffectConfig.setEffectAsynAPI(z);
    }

    /* renamed from: a */
    public static int m146867a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    C85376ax.f191107h.put(next, Long.valueOf(jSONObject.getLong(next)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return 0;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static void m146872a(VEListener.AbstractC85235d dVar) {
        VERuntime vERuntime = VERuntime.EnumC85549a.INSTANCE.f191667b;
        vERuntime.f191654m = new WeakReference<>(dVar);
        C30683b.m63030a(vERuntime.f191657p);
    }

    /* renamed from: b */
    public static void m146880b(boolean z) {
        MethodCollector.m26663i(3140);
        VERuntime vERuntime = VERuntime.EnumC85549a.INSTANCE.f191667b;
        if (!vERuntime.f191652k) {
            C85315al.m146642d("VERuntime", "runtime not init");
            C85615x xVar = new C85615x(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.m26664o(3140);
            throw xVar;
        }
        vERuntime.nativeEnableHighFpsH264HWDecoder(z, 40, 1070);
        MethodCollector.m26664o(3140);
    }

    /* renamed from: a */
    public static void m146873a(VEListener.AbstractC85252u uVar) {
        WeakReference<C30693g.AbstractC30694a> weakReference;
        VERuntime vERuntime = VERuntime.EnumC85549a.INSTANCE.f191667b;
        vERuntime.f191655n = uVar;
        C30693g.AbstractC30694a aVar = vERuntime.f191658q;
        if (aVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(aVar);
        }
        C30693g.f73416a = weakReference;
    }

    /* renamed from: a */
    public static void m146875a(C85515j jVar) {
        C30689e.m63054a("user_id", jVar.f191561b);
        C30689e.m63054a("device_id", jVar.f191562c);
        C85551a.EnumC85552a.INSTANCE.f191679b.mo131520a("KEY_DEVICEID", jVar.f191562c, true);
        C30689e.m63054a("app_version", jVar.f191560a);
    }

    /* renamed from: b */
    public static void m146881b(boolean z, int i) {
        MethodCollector.m26663i(3157);
        VERuntime vERuntime = VERuntime.EnumC85549a.INSTANCE.f191667b;
        if (!vERuntime.f191652k) {
            C85315al.m146642d("VERuntime", "runtime not init");
            C85615x xVar = new C85615x(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.m26664o(3157);
            throw xVar;
        }
        if (i <= 720) {
            i = 730;
        }
        vERuntime.nativeEnableHDByteVC1HWDecoder(z, i);
        MethodCollector.m26664o(3157);
    }

    /* renamed from: a */
    public static void m146869a(Context context, String str) {
        MethodCollector.m26663i(2103);
        C85394bg.m146927a();
        VERuntime vERuntime = VERuntime.EnumC85549a.INSTANCE.f191667b;
        if (!vERuntime.f191652k) {
            vERuntime.f191652k = true;
            vERuntime.f191642a = context;
            Context context2 = vERuntime.f191642a;
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = context2.getCacheDir();
            }
            VEEffectConfig.setCacheDir(C58016d.f132221b.getAbsolutePath());
            C30731d.m63115a(context);
            vERuntime.f191645d = new C85554c();
            vERuntime.f191645d.f191692a = str;
            vERuntime.f191649h = new C85514i();
            vERuntime.f191644c = new C85557f(VERuntime.EnumC85549a.INSTANCE.f191667b.f191645d.f191692a);
            vERuntime.f191659r = C85551a.EnumC85552a.INSTANCE.f191679b;
            C85551a aVar = vERuntime.f191659r;
            synchronized (aVar) {
                try {
                    if (!aVar.f191674a) {
                        aVar.f191675b = C34822d.m71158a(context, context.getPackageName(), 0);
                        aVar.f191674a = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2103);
                    throw th;
                }
            }
            Context context3 = vERuntime.f191642a;
            String str2 = (String) vERuntime.f191659r.mo131519a("KEY_DEVICEID", "");
            TEMonitorInvoker.nativeInit();
            Context applicationContext = context3.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (C30689e.f73390a) {
                SDKMonitorUtils.m27204a("1357", new ArrayList(Arrays.asList("https://mon-sg.tiktokv.com/monitor/appmonitor/v2/settings", "https://mon.tiktokv.com/monitor/appmonitor/v2/settings", "https://mon.tiktokv.com/monitor/appmonitor/v2/settings")));
                SDKMonitorUtils.m27205b("1357", new ArrayList(Arrays.asList("https://mon-sg.tiktokv.com/monitor/collect/", "https://mon-sg.tiktokv.com/monitor/collect/", "https://mon-sg.tiktokv.com/monitor/collect/", "https://mon-sg.tiktokv.com/monitor/collect/")));
                if (!C30689e.f73394e) {
                    C30685c.m63037a(applicationContext, str2, null, null);
                    C30689e.f73392c = true;
                } else if (!C30689e.f73392c && C30689e.f73391b == null) {
                    Thread thread = new Thread(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d6: CONSTRUCTOR  (r1v5 'thread' java.lang.Thread) = 
                          (wrap: com.ss.android.ttve.monitor.e$1 : 0x00d3: CONSTRUCTOR  (r0v37 com.ss.android.ttve.monitor.e$1) = (r4v3 'applicationContext' android.content.Context), (r5v1 'str2' java.lang.String) call: com.ss.android.ttve.monitor.e.1.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR)
                         call: java.lang.Thread.<init>(java.lang.Runnable):void type: CONSTRUCTOR in method: com.ss.android.vesdk.ay.a(android.content.Context, java.lang.String):void, file: classes.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d3: CONSTRUCTOR  (r0v37 com.ss.android.ttve.monitor.e$1) = (r4v3 'applicationContext' android.content.Context), (r5v1 'str2' java.lang.String) call: com.ss.android.ttve.monitor.e.1.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR in method: com.ss.android.vesdk.ay.a(android.content.Context, java.lang.String):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 31 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ttve.monitor.e, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 37 more
                        */
                    /*
                    // Method dump skipped, instructions count: 300
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.C85378ay.m146869a(android.content.Context, java.lang.String):void");
                }

                /* renamed from: a */
                public static void m146874a(AbstractC85314ak akVar, boolean z) {
                    MethodCollector.m26663i(3173);
                    C30653a.f73293a = akVar;
                    TELog2ClientInvoker.nativeInit();
                    TELog2ClientInvoker.nativeSetIsToLogcat(false);
                    MethodCollector.m26664o(3173);
                }
            }
