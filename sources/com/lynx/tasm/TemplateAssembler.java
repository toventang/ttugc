package com.lynx.tasm;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.C28783h;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.component.DynamicComponentLoader;
import com.lynx.tasm.core.ExternalSourceLoader;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.ResourceLoader;
import com.lynx.tasm.p2047b.C28443a;
import com.lynx.tasm.p2054c.C28724b;
import com.lynx.tasm.p2059g.C28782a;
import com.lynx.tasm.provider.AbstractC28849g;
import com.lynx.tasm.provider.AbstractC28850h;
import com.lynx.tasm.provider.C28845c;
import com.lynx.tasm.provider.C28851i;
import com.lynx.tasm.provider.C28852j;
import com.lynx.tasm.utils.C28929m;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TemplateAssembler {

    /* renamed from: a */
    public long f66686a;

    /* renamed from: b */
    AbstractC28391a f66687b;

    /* renamed from: c */
    public AbstractC28838o f66688c;

    /* renamed from: d */
    String f66689d;

    /* renamed from: e */
    public JSProxy f66690e;

    /* renamed from: f */
    public int f66691f;

    /* renamed from: g */
    public volatile boolean f66692g;

    /* renamed from: h */
    C28818l f66693h;

    /* renamed from: i */
    public WeakReference<AbstractC28520j> f66694i;

    /* renamed from: j */
    public C28855q f66695j;

    /* renamed from: k */
    public EnumC28856r f66696k;

    /* renamed from: l */
    AtomicInteger f66697l = new AtomicInteger(0);

    /* renamed from: m */
    SparseArray<AbstractC28817k> f66698m = new SparseArray<>();

    /* renamed from: n */
    private PaintingContext f66699n;

    /* renamed from: o */
    private LayoutContext f66700o;

    /* renamed from: p */
    private boolean f66701p;

    /* renamed from: q */
    private boolean f66702q;

    /* renamed from: r */
    private DynamicComponentLoader f66703r;

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.TemplateAssembler$a */
    public interface AbstractC28391a {
        static {
            Covode.recordClassIndex(34380);
        }

        /* renamed from: a */
        String mo48679a(String str);

        /* renamed from: a */
        void mo48680a();

        /* renamed from: a */
        void mo48681a(int i, String str);

        /* renamed from: a */
        void mo48682a(LynxPerfMetric lynxPerfMetric);

        /* renamed from: a */
        void mo48683a(C28782a aVar);

        /* renamed from: a */
        void mo48684a(C28855q qVar);

        /* renamed from: a */
        void mo48685a(String str, String str2, int i);

        /* renamed from: a */
        void mo48686a(HashMap<String, Object> hashMap);

        /* renamed from: b */
        void mo48687b();

        /* renamed from: b */
        void mo48688b(LynxPerfMetric lynxPerfMetric);
    }

    static {
        Covode.recordClassIndex(34375);
    }

    private native long nativeCreate(Object obj, Object obj2, Object obj3, int i, boolean z, boolean z2, int i2, int i3, String str);

    private native void nativeDestroy(long j);

    private native void nativeSendCustomEvent(long j, String str, int i, ByteBuffer byteBuffer, int i2, String str2);

    private native void nativeSetGlobalProps(long j, long j2);

    private native void nativeUpdateConfig(long j, ByteBuffer byteBuffer, int i);

    /* access modifiers changed from: package-private */
    public native JavaOnlyMap nativeGetAllJsSource(long j);

    /* access modifiers changed from: package-private */
    public native void nativeGetDataAsync(long j, int i);

    public native JavaOnlyMap nativeGetListPlatformInfo(long j, int i);

    /* access modifiers changed from: package-private */
    public native void nativeHotModuleReplace(long j, byte[] bArr, String str);

    /* access modifiers changed from: package-private */
    public native void nativeInitRuntime(long j, ResourceLoader resourceLoader, ExternalSourceLoader externalSourceLoader, LynxModuleManager lynxModuleManager, String str, String[] strArr, boolean z, boolean z2, boolean z3, boolean z4);

    /* access modifiers changed from: package-private */
    public native void nativeLoadComponent(long j, String str, byte[] bArr, int i);

    /* access modifiers changed from: package-private */
    public native void nativeLoadTemplate(long j, String str, byte[] bArr, ByteBuffer byteBuffer, int i);

    /* access modifiers changed from: package-private */
    public native void nativeLoadTemplateByJson(long j, String str, byte[] bArr, String str2);

    /* access modifiers changed from: package-private */
    public native void nativeLoadTemplateByPreParsedData(long j, String str, byte[] bArr, long j2, boolean z, String str2);

    public native int nativeObtainChild(long j, int i, int i2, long j2);

    /* access modifiers changed from: package-private */
    public native void nativeOnEnterBackground(long j);

    /* access modifiers changed from: package-private */
    public native void nativeOnEnterForeground(long j);

    /* access modifiers changed from: package-private */
    public native void nativeOnFirstScreen(long j);

    public native void nativeRecycleChild(long j, int i, int i2);

    public native void nativeRemoveChild(long j, int i, int i2);

    public native void nativeRenderChild(long j, int i, int i2, long j2);

    /* access modifiers changed from: package-private */
    public native void nativeResetDataByPreParsedData(long j, long j2, String str, boolean z);

    /* access modifiers changed from: package-private */
    public native void nativeRunOnTasmThread(long j, Runnable runnable);

    /* access modifiers changed from: package-private */
    public native void nativeSendGlobalEventToLepus(long j, String str, ByteBuffer byteBuffer, int i);

    /* access modifiers changed from: package-private */
    public native void nativeSendInternalEvent(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    /* access modifiers changed from: package-private */
    public native void nativeSendTouchEvent(long j, String str, int i, float f, float f2, float f3, float f4, float f5, float f6);

    /* access modifiers changed from: package-private */
    public native void nativeSetFontScale(long j, float f);

    /* access modifiers changed from: package-private */
    public native void nativeSyncFetchLayoutResult(long j);

    public native void nativeUpdateChild(long j, int i, int i2, int i3, long j2);

    /* access modifiers changed from: package-private */
    public native void nativeUpdateDataByPreParsedData(long j, long j2, String str, boolean z);

    /* access modifiers changed from: package-private */
    public native void nativeUpdateFontScale(long j, float f);

    public native void nativeUpdateI18nResource(long j, String str, String str2, int i);

    /* access modifiers changed from: package-private */
    public native void nativeUpdateScreenMetrics(long j, int i, int i2, float f);

    /* access modifiers changed from: package-private */
    public native void nativeUpdateViewport(long j, int i, int i2, int i3, int i4);

    private long getPtr() {
        return this.f66686a;
    }

    private void dispatchOnLoaded() {
        AbstractC28391a aVar = this.f66687b;
        if (aVar != null) {
            aVar.mo48680a();
        }
    }

    public void onRuntimeReady() {
        AbstractC28391a aVar = this.f66687b;
        if (aVar != null) {
            aVar.mo48687b();
        }
    }

    /* renamed from: a */
    public final String mo48759a() {
        C28855q qVar = this.f66695j;
        if (qVar != null) {
            return qVar.f68104d;
        }
        LLog.m56856a(6, "TemplateAssembler", "PageConfig is null.GetPageVersion get default error;");
        return "error";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo48764c() {
        if (!this.f66701p) {
            return false;
        }
        C28855q qVar = this.f66695j;
        if (qVar != null) {
            return qVar.f68101a;
        }
        LLog.m56856a(6, "TemplateAssembler", "PageConfig is null.GetAutoExpose get default true!");
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo48763b() {
        MethodCollector.m26663i(920);
        this.f66700o.f66939b = true;
        this.f66699n.f66940a.f66983b = true;
        this.f66692g = true;
        nativeDestroy(this.f66686a);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.lynx.tasm.TemplateAssembler.RunnableC283871 */

            static {
                Covode.recordClassIndex(34376);
            }

            public final void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.lynx.tasm.TemplateAssembler.RunnableC283871.RunnableC283881 */

                    static {
                        Covode.recordClassIndex(34377);
                    }

                    public final void run() {
                        if (TemplateAssembler.this.f66688c != null) {
                            TemplateAssembler.this.f66688c.mo19153e();
                        }
                    }
                });
            }
        });
        this.f66690e.mo49857a();
        this.f66686a = 0;
        MethodCollector.m26664o(920);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C28783h mo48765d() {
        if (this.f66695j == null) {
            return new C28783h.C28784a().mo49900a();
        }
        HashSet hashSet = new HashSet();
        for (C28463a aVar : LynxEnv.m56706b().mo48569c()) {
            hashSet.add(aVar.f66942b);
        }
        C28783h.C28784a aVar2 = new C28783h.C28784a();
        aVar2.f67884a = this.f66695j.f68104d;
        aVar2.f67885b = this.f66695j.f68106f;
        aVar2.f67886c = this.f66695j.f68107g;
        aVar2.f67887d = this.f66695j.f68108h;
        aVar2.f67888e = this.f66689d;
        aVar2.f67889f = this.f66695j.f68110j;
        aVar2.f67890g = this.f66695j.f68111k;
        aVar2.f67891h = this.f66696k;
        aVar2.f67892i = this.f66695j.f68112l;
        aVar2.f67893j = this.f66695j.f68113m;
        aVar2.f67894k = this.f66695j.f68118r;
        aVar2.f67895l = hashSet;
        return aVar2.mo49900a();
    }

    public void executeRunnable(Runnable runnable) {
        runnable.run();
    }

    public void onDynamicComponentPerfReady(ReadableMap readableMap) {
        AbstractC28391a aVar = this.f66687b;
        if (aVar != null) {
            aVar.mo48686a(readableMap.toHashMap());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r2 == 0) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48760a(com.lynx.tasm.TemplateData r8) {
        /*
            r7 = this;
            r6 = 896(0x380, float:1.256E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            r4 = 0
            if (r8 == 0) goto L_0x0023
            r8.mo48813b()
            long r2 = r8.f66711a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
        L_0x0012:
            r4 = 6
            java.lang.String r1 = "TA"
            java.lang.String r0 = "SetGlobalProps with zero templatedata"
            com.lynx.tasm.base.LLog.m56856a(r4, r1, r0)
        L_0x001a:
            long r0 = r7.f66686a
            r7.nativeSetGlobalProps(r0, r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return
        L_0x0023:
            r2 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.TemplateAssembler.mo48760a(com.lynx.tasm.TemplateData):void");
    }

    public void onPageConfigDecoded(ReadableMap readableMap) {
        C28855q qVar = new C28855q(readableMap);
        this.f66695j = qVar;
        AbstractC28391a aVar = this.f66687b;
        if (aVar != null) {
            aVar.mo48684a(qVar);
        }
        AbstractC28520j jVar = this.f66694i.get();
        if (jVar != null) {
            jVar.f67077r = this.f66695j.f68117q;
            jVar.f67078s = this.f66695j.f68103c;
            return;
        }
        LLog.m56856a(6, "TemplateAssembler", "lynx context free in used: default overflow visible may be not valid");
    }

    /* renamed from: a */
    public final void mo48761a(C28724b bVar) {
        int position;
        MethodCollector.m26663i(909);
        String str = bVar.f67739e;
        if (this.f66692g) {
            LLog.m56856a(6, "TemplateAssembler", "SendCustomEvent: " + str + " error: TemplateAssemble is destroyed.");
            MethodCollector.m26664o(909);
            return;
        }
        ByteBuffer a = C28443a.f66899a.mo48885a(bVar.mo30096a());
        if (a == null) {
            position = 0;
        } else {
            position = a.position();
        }
        nativeSendCustomEvent(this.f66686a, str, bVar.f67738d, a, position, bVar.mo30328b());
        MethodCollector.m26664o(909);
    }

    /* renamed from: a */
    public final void mo48762a(C28782a aVar) {
        MethodCollector.m26663i(913);
        if (aVar == null) {
            MethodCollector.m26664o(913);
            return;
        }
        HashMap hashMap = new HashMap();
        aVar.mo49898a(hashMap, "theme");
        ByteBuffer a = C28443a.f66899a.mo48885a(hashMap);
        if (a != null) {
            nativeUpdateConfig(this.f66686a, a, a.position());
        }
        MethodCollector.m26664o(913);
    }

    public void reportError(int i, String str) {
        AbstractC28391a aVar = this.f66687b;
        if (aVar != null) {
            aVar.mo48681a(i, str);
        }
    }

    public String translateResourceForTheme(String str, String str2) {
        AbstractC28391a aVar = this.f66687b;
        if (aVar != null) {
            return aVar.mo48679a(str2);
        }
        return null;
    }

    public void getDataBack(ByteBuffer byteBuffer, int i) {
        this.f66698m.get(i);
        Object a = C28443a.f66899a.mo48884a(byteBuffer);
        if (a instanceof Map) {
            JavaOnlyMap.from((Map) a);
        }
    }

    public void onFirstLoadPerfReady(ReadableMap readableMap, ReadableMap readableMap2) {
        LynxPerfMetric lynxPerfMetric = new LynxPerfMetric(readableMap, readableMap2, this.f66689d, mo48765d());
        AbstractC28391a aVar = this.f66687b;
        if (aVar != null) {
            aVar.mo48682a(lynxPerfMetric);
        }
    }

    public void onUpdatePerfReady(ReadableMap readableMap, ReadableMap readableMap2) {
        LynxPerfMetric lynxPerfMetric = new LynxPerfMetric(readableMap, readableMap2, this.f66689d, mo48765d());
        AbstractC28391a aVar = this.f66687b;
        if (aVar != null) {
            aVar.mo48688b(lynxPerfMetric);
        }
    }

    public void getI18nResourceByNative(final String str, String str2) {
        AbstractC28850h hVar;
        AbstractC28520j jVar = this.f66694i.get();
        if (jVar != null) {
            C28845c cVar = jVar.f67079t;
            if (!TextUtils.isEmpty("I18N_TEXT") && (hVar = cVar.f68085a.get("I18N_TEXT")) != null) {
                Bundle bundle = new Bundle();
                bundle.putString("fallbackUrl", str2);
                hVar.mo33453a(new C28851i(str.toLowerCase(), bundle), new AbstractC28849g<String>() {
                    /* class com.lynx.tasm.TemplateAssembler.C283892 */

                    /* renamed from: a */
                    final WeakReference<TemplateAssembler> f66706a;

                    static {
                        Covode.recordClassIndex(34378);
                    }

                    @Override // com.lynx.tasm.provider.AbstractC28849g
                    /* renamed from: a */
                    public final void mo48809a(final C28852j<String> jVar) {
                        super.mo48809a(jVar);
                        if (!C28929m.m57950a()) {
                            C28929m.m57947a(new Runnable() {
                                /* class com.lynx.tasm.TemplateAssembler.C283892.RunnableC283901 */

                                static {
                                    Covode.recordClassIndex(34379);
                                }

                                public final void run() {
                                    C283892.this.mo48810b(jVar);
                                }
                            });
                        } else {
                            mo48810b(jVar);
                        }
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: b */
                    public final void mo48810b(C28852j<String> jVar) {
                        AbstractC28520j jVar2;
                        MethodCollector.m26663i(2162);
                        TemplateAssembler templateAssembler = this.f66706a.get();
                        if (templateAssembler != null && !templateAssembler.f66692g) {
                            if (!TextUtils.isEmpty(jVar.f68100c) || (jVar2 = templateAssembler.f66694i.get()) == null) {
                                templateAssembler.nativeUpdateI18nResource(TemplateAssembler.this.f66686a, str, jVar.f68100c, jVar.f68099b);
                            } else {
                                jVar2.mo49039a(str, "I18nResource", "empty i18n resource return");
                                templateAssembler.nativeUpdateI18nResource(TemplateAssembler.this.f66686a, str, "", -1);
                                MethodCollector.m26664o(2162);
                                return;
                            }
                        }
                        MethodCollector.m26664o(2162);
                    }

                    {
                        this.f66706a = new WeakReference<>(TemplateAssembler.this);
                    }
                });
                return;
            }
            jVar.mo49039a(str, "I18nResource", "no i18n provider found");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigUpdatedByJS(String str, Object obj) {
        if (!(str == null || obj == null || !(obj instanceof HashMap))) {
            HashMap hashMap = (HashMap) obj;
            if ("theme".equals(str)) {
                C28782a aVar = new C28782a();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (str2 != null && !str2.isEmpty() && !str2.startsWith("__")) {
                        if (value == null) {
                            aVar.f67870a.remove(str2);
                        } else {
                            aVar.f67870a.put(str2, value);
                        }
                        aVar.f67871b++;
                    }
                }
                AbstractC28391a aVar2 = this.f66687b;
                if (aVar2 != null) {
                    aVar2.mo48683a(aVar);
                }
            }
        }
    }

    public void onModuleFunctionInvoked(String str, String str2, int i) {
        AbstractC28391a aVar = this.f66687b;
        if (aVar != null) {
            try {
                aVar.mo48685a(str, str2, i);
            } catch (Exception e) {
                reportError(904, "onModuleFunctionInvoked threw an exception: " + e.getMessage());
            }
        }
    }

    TemplateAssembler(PaintingContext paintingContext, LayoutContext layoutContext, DynamicComponentLoader dynamicComponentLoader, C28818l lVar, EnumC28856r rVar, boolean z, boolean z2, boolean z3) {
        int id;
        MethodCollector.m26663i(890);
        this.f66699n = paintingContext;
        this.f66700o = layoutContext;
        this.f66693h = lVar;
        this.f66703r = dynamicComponentLoader;
        DisplayMetrics a = layoutContext.mo48917a();
        this.f66696k = rVar;
        DynamicComponentLoader dynamicComponentLoader2 = this.f66703r;
        if (rVar == null) {
            id = EnumC28856r.ALL_ON_UI.mo49985id();
        } else {
            id = rVar.mo49985id();
        }
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        LynxEnv b = LynxEnv.m56706b();
        if (b.f66656w == null) {
            b.f66656w = Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
        }
        this.f66686a = nativeCreate(paintingContext, layoutContext, dynamicComponentLoader2, id, z, z3, i, i2, b.f66656w);
        this.f66692g = false;
        this.f66701p = z2;
        this.f66702q = z3;
        MethodCollector.m26664o(890);
    }
}
