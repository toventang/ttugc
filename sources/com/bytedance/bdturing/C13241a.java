package com.bytedance.bdturing;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import com.bytedance.bdturing.C13290j;
import com.bytedance.bdturing.C13301m;
import com.bytedance.bdturing.p861a.C13244a;
import com.bytedance.bdturing.p863c.C13261c;
import com.bytedance.bdturing.p864d.AbstractC13269a;
import com.bytedance.bdturing.p865e.C13280g;
import com.bytedance.bdturing.twiceverify.C13314c;
import com.bytedance.bdturing.verify.AbstractC13321a;
import com.bytedance.bdturing.verify.RiskControlService;
import com.bytedance.bdturing.verify.TwiceVerifyService;
import com.bytedance.bdturing.verify.p867a.AbstractC13322a;
import com.bytedance.bdturing.verify.p867a.C13327f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.a */
public final class C13241a {

    /* renamed from: a */
    public C13252c f32353a;

    /* renamed from: b */
    public boolean f32354b;

    /* renamed from: c */
    private RiskControlService f32355c;

    /* renamed from: d */
    private final HashMap<String, AbstractC13321a> f32356d;

    /* renamed from: e */
    private long f32357e;

    static {
        Covode.recordClassIndex(15203);
    }

    /* renamed from: a */
    public static C13241a m23797a() {
        return C13243a.f32360a;
    }

    /* renamed from: com.bytedance.bdturing.a$a */
    public static class C13243a {

        /* renamed from: a */
        public static C13241a f32360a = new C13241a((byte) 0);

        static {
            Covode.recordClassIndex(15205);
        }
    }

    private C13241a() {
        this.f32356d = new HashMap<>();
        this.f32357e = 0;
    }

    /* renamed from: b */
    public final void mo21397b() {
        if (this.f32354b) {
            this.f32355c.dismissVerifyDialog();
        }
    }

    /* renamed from: c */
    private boolean m23801c() {
        boolean z;
        if (System.currentTimeMillis() - this.f32357e < 500) {
            z = true;
        } else {
            z = false;
        }
        this.f32357e = System.currentTimeMillis();
        return z;
    }

    /* synthetic */ C13241a(byte b) {
        this();
    }

    /* renamed from: a */
    private void m23798a(AbstractC13321a aVar) {
        if (!this.f32356d.containsKey(aVar.getClass().getName())) {
            this.f32356d.put(aVar.getClass().getName(), aVar);
        }
    }

    /* renamed from: a */
    public final synchronized C13241a mo21394a(final C13252c cVar) {
        MethodCollector.m26663i(1117);
        if (this.f32354b) {
            MethodCollector.m26664o(1117);
            return this;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f32353a = cVar;
        if (cVar == null || cVar.f32388o == null) {
            RuntimeException runtimeException = new RuntimeException("config or applicationContext is null");
            MethodCollector.m26664o(1117);
            throw runtimeException;
        }
        if (cVar.f32395v == null) {
            try {
                cVar.f32395v = (AbstractC13269a) Class.forName("com.bytedance.bdturing.ttnet.TTNetHttpClient").getConstructor(Context.class).newInstance(cVar.f32388o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (cVar.f32395v == null || cVar.f32394u == null) {
            RuntimeException runtimeException2 = new RuntimeException("httpClient or eventClient is null");
            MethodCollector.m26664o(1117);
            throw runtimeException2;
        }
        C13301m mVar = C13301m.C13302a.f32548a;
        if (mVar.f32546a == null) {
            synchronized (C13301m.class) {
                try {
                    if (mVar.f32546a == null) {
                        mVar.f32546a = new HandlerThread("TuringVerifyThread");
                        mVar.f32546a.start();
                        mVar.f32547b = new C13301m.HandlerC13303b(mVar, mVar.f32546a.getLooper(), (byte) 0);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1117);
                    throw th;
                }
            }
        }
        C13301m.C13302a.f32548a.mo21472a(new Runnable() {
            /* class com.bytedance.bdturing.C13241a.RunnableC132421 */

            static {
                Covode.recordClassIndex(15204);
            }

            public final void run() {
                MethodCollector.m26663i(974);
                Context context = cVar.f32388o;
                C13280g gVar = C13280g.f32476h;
                C13244a.C132462 r1 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: CONSTRUCTOR  (r1v0 'r1' com.bytedance.bdturing.a.a$2) =  call: com.bytedance.bdturing.a.a.2.<init>():void type: CONSTRUCTOR in method: com.bytedance.bdturing.a.1.run():void, file: classes6.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.bdturing.a.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 14 more
                    */
                /*
                // Method dump skipped, instructions count: 273
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.C13241a.RunnableC132421.run():void");
            }
        });
        RiskControlService riskControlService = new RiskControlService();
        this.f32355c = riskControlService;
        m23798a(riskControlService);
        m23798a(new TwiceVerifyService());
        try {
            m23798a((AbstractC13321a) Class.forName("com.bytedance.bdturing.verify.IdentityService").newInstance());
        } catch (ClassNotFoundException e2) {
            C13285g.m23900a(e2);
        } catch (IllegalAccessException e3) {
            C13285g.m23900a(e3);
        } catch (InstantiationException e4) {
            C13285g.m23900a(e4);
        }
        C13314c.m23939a().f32564a = this.f32353a.f32396w;
        this.f32354b = true;
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", currentTimeMillis2);
            jSONObject.put("key", "init");
            C13270e.m23849a("turing_verify_sdk", jSONObject);
        } catch (JSONException e5) {
            C13285g.m23900a(e5);
        }
        MethodCollector.m26664o(1117);
        return this;
    }

    /* renamed from: a */
    public final void mo21395a(Activity activity, AbstractC13248b bVar) {
        if (m23800b(activity, bVar)) {
            C13327f fVar = new C13327f(this.f32353a.f32367B);
            fVar.f32579c = this.f32353a.f32390q;
            m23799b(activity, fVar, bVar);
        }
    }

    /* renamed from: b */
    private boolean m23800b(Activity activity, AbstractC13248b bVar) {
        if (!this.f32354b || bVar == null || activity == null) {
            bVar.mo21411a(2);
            return false;
        } else if (m23801c()) {
            C13285g.m23901a("invoke multi times, u should take a breath");
            bVar.mo21411a(1000);
            return false;
        } else {
            int i = Build.VERSION.SDK_INT;
            return true;
        }
    }

    /* renamed from: b */
    private void m23799b(Activity activity, AbstractC13322a aVar, AbstractC13248b bVar) {
        C13285g.m23901a("BdTuring showVerifyDialog");
        aVar.f32577a = activity;
        for (AbstractC13321a aVar2 : this.f32356d.values()) {
            if (aVar2.isProcess(aVar.mo21495b())) {
                aVar2.execute(aVar, bVar);
                return;
            }
        }
        bVar.mo21411a(996);
    }

    /* renamed from: a */
    public final void mo21396a(Activity activity, AbstractC13322a aVar, AbstractC13248b bVar) {
        aVar.mo21495b();
        if (m23800b(activity, bVar)) {
            C13290j jVar = C13290j.C13291a.f32506a;
            int b = aVar.mo21495b();
            if (jVar.f32502a != null) {
                DialogC13293l lVar = jVar.f32502a.get();
                if (jVar.f32505d && lVar != null && b == lVar.f32523o.mo21495b()) {
                    jVar.f32505d = false;
                    jVar.f32504c = System.currentTimeMillis();
                    lVar.mo21458a(C13261c.m23830a("bytedcert.refreshVerifyView", "call", new JSONObject(), "bytedcert.refreshVerifyView"));
                    lVar.show();
                    return;
                }
            }
            m23799b(activity, aVar, bVar);
        }
    }
}
