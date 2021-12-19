package com.lynx.tasm;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.C28180a;
import com.lynx.devtoolwrapper.C28333d;
import com.lynx.jsbridge.C28357b;
import com.lynx.jsbridge.LynxIntersectionObserverModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.LynxSetModule;
import com.lynx.jsbridge.LynxUIMethodModule;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.C28783h;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.AbstractC28459h;
import com.lynx.tasm.base.C28460i;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC28510f;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28524l;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.C28576t;
import com.lynx.tasm.behavior.C28717w;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.p2048a.AbstractC28464a;
import com.lynx.tasm.behavior.p2049b.C28471b;
import com.lynx.tasm.behavior.p2050c.p2051a.C28479a;
import com.lynx.tasm.behavior.p2050c.p2051a.C28481b;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.shadow.C28534a;
import com.lynx.tasm.behavior.shadow.C28546k;
import com.lynx.tasm.behavior.shadow.EnumC28540e;
import com.lynx.tasm.component.DynamicComponentLoader;
import com.lynx.tasm.core.ExternalSourceLoader;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.ResourceLoader;
import com.lynx.tasm.p2047b.C28443a;
import com.lynx.tasm.p2059g.C28782a;
import com.lynx.tasm.provider.AbstractC28843b;
import com.lynx.tasm.provider.AbstractC28850h;
import com.lynx.tasm.provider.AbstractC28854l;
import com.lynx.tasm.provider.C28845c;
import com.lynx.tasm.provider.CanvasProvider;
import com.lynx.tasm.utils.C28929m;
import com.lynx.tasm.utils.C28930n;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class LynxTemplateRender {
    static boolean sIsFirstRender = true;
    private TemplateData globalProps;
    private boolean mAsyncRender;
    private C28820n mBuilder;
    public final C28841p mClient = new C28841p();
    private Context mContext;
    public C28333d mDevtool;
    public C28717w mEventDispatcher;
    private long mFirstMeasureTime = -1;
    public boolean mFirstScreen = false;
    private float mFontScale = 1.0f;
    private C28818l mGroup;
    private boolean mHasDestory;
    private boolean mHasEnvPrepared;
    private boolean mHasPageStart;
    public long mInitEnd;
    public long mInitStart;
    private C28524l mIntersectionObserverManager;
    private ExternalSourceLoader mLoader;
    private AbstractC28520j mLynxContext;
    public C28529q mLynxUIOwner;
    public LynxView mLynxView;
    private LynxModuleManager mModuleManager;
    private long mPageLoadedTime;
    private PaintingContext mPaintingContext;
    private int mPreHeightMeasureSpec;
    private int mPreWidthMeasureSpec;
    private C28576t mShadowNodeOwner;
    private boolean mShouldUpdateViewport = true;
    private List<AbstractC28767e> mStateListeners;
    public TemplateAssembler mTemplateAssembler;
    public C28782a mTheme;
    private EnumC28856r mThreadStrategyForRendering;
    private String mUrl;
    private C28546k mViewLayoutTick;
    private boolean mWillContentSizeChange;
    private boolean reload;

    public void onDispatchTouchEvent(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: package-private */
    public void onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: package-private */
    public void onTouchEvent(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: package-private */
    public void showErrorMessage(String str) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.LynxTemplateRender$c */
    public static class C28384c extends AbstractC28838o {

        /* renamed from: a */
        private long f66681a;

        static {
            Covode.recordClassIndex(34371);
        }

        C28384c() {
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: a */
        public final void mo14467a() {
            LLog.m56856a(3, "LynxTemplateRender", "onLoadSuccess time: " + (System.currentTimeMillis() - this.f66681a));
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: b */
        public final void mo14470b() {
            LLog.m56856a(3, "LynxTemplateRender", "onFirstScreen time: " + (System.currentTimeMillis() - this.f66681a));
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: c */
        public final void mo16280c() {
            LLog.m56856a(3, "LynxTemplateRender", "onPageUpdate time:" + (System.currentTimeMillis() - this.f66681a));
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: a */
        public final void mo14469a(String str) {
            this.f66681a = System.currentTimeMillis();
        }
    }

    private boolean checkIfEnvPrepared() {
        return this.mHasEnvPrepared;
    }

    public C28333d getDevTool() {
        return this.mDevtool;
    }

    /* access modifiers changed from: package-private */
    public long getFirstMeasureTime() {
        return this.mFirstMeasureTime;
    }

    public AbstractC28520j getLynxContext() {
        return this.mLynxContext;
    }

    public C28782a getTheme() {
        return this.mTheme;
    }

    public final EnumC28856r getThreadStrategyForRendering() {
        return this.mThreadStrategyForRendering;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        destroyNative();
    }

    public UIGroup<UIBody.C28581a> getLynxRootUI() {
        return this.mLynxUIOwner.f67110b;
    }

    public String getTemplateUrl() {
        String str = this.mUrl;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void onEnterBackground() {
        onEnterBackground(true);
    }

    public void onEnterForeground() {
        onEnterForeground(true);
    }

    public void pauseRootLayoutAnimation() {
        this.mLynxUIOwner.f67116h = false;
    }

    public void resumeRootLayoutAnimation() {
        this.mLynxUIOwner.f67116h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.LynxTemplateRender$b */
    public class C28380b implements AbstractC28459h {
        static {
            Covode.recordClassIndex(34367);
        }

        @Override // com.lynx.tasm.base.AbstractC28459h
        /* renamed from: c */
        public final void mo48675c() {
            try {
                C28929m.m57947a(new Runnable() {
                    /* class com.lynx.tasm.LynxTemplateRender.C28380b.RunnableC283833 */

                    static {
                        Covode.recordClassIndex(34370);
                    }

                    public final void run() {
                        if (LynxTemplateRender.this.mClient != null) {
                            LynxTemplateRender.this.mClient.mo33421f();
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // com.lynx.tasm.base.AbstractC28459h
        /* renamed from: a */
        public final void mo48673a() {
            LLog.m56856a(4, "LynxTemplateRender", "onFirstScreen");
            LynxTemplateRender.this.mLynxUIOwner.f67115g = false;
            try {
                C28929m.m57947a(new Runnable() {
                    /* class com.lynx.tasm.LynxTemplateRender.C28380b.RunnableC283811 */

                    static {
                        Covode.recordClassIndex(34368);
                    }

                    public final void run() {
                        MethodCollector.m26663i(41);
                        LynxTemplateRender.this.mFirstScreen = true;
                        if (LynxTemplateRender.this.mTemplateAssembler != null) {
                            TemplateAssembler templateAssembler = LynxTemplateRender.this.mTemplateAssembler;
                            templateAssembler.nativeOnFirstScreen(templateAssembler.f66686a);
                        }
                        if (LynxTemplateRender.this.mClient != null) {
                            LynxTemplateRender.this.mClient.mo14470b();
                        }
                        MethodCollector.m26664o(41);
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // com.lynx.tasm.base.AbstractC28459h
        /* renamed from: b */
        public final void mo48674b() {
            try {
                LLog.m56856a(4, "LynxTemplateRender", "onPageUpdate");
                C28929m.m57947a(new Runnable() {
                    /* class com.lynx.tasm.LynxTemplateRender.C28380b.RunnableC283822 */

                    static {
                        Covode.recordClassIndex(34369);
                    }

                    public final void run() {
                        if (LynxTemplateRender.this.mClient != null) {
                            LynxTemplateRender.this.mClient.mo16280c();
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }

        private C28380b() {
        }

        /* synthetic */ C28380b(LynxTemplateRender lynxTemplateRender, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.LynxTemplateRender$d */
    public class C28385d implements TemplateAssembler.AbstractC28391a {

        /* renamed from: b */
        private TemplateAssembler f66683b;

        static {
            Covode.recordClassIndex(34372);
        }

        @Override // com.lynx.tasm.TemplateAssembler.AbstractC28391a
        /* renamed from: b */
        public final void mo48687b() {
            if (LynxTemplateRender.this.mClient != null) {
                LynxTemplateRender.this.mClient.mo19152d();
            }
        }

        @Override // com.lynx.tasm.TemplateAssembler.AbstractC28391a
        /* renamed from: a */
        public final void mo48680a() {
            C28471b bVar = C28471b.C28474a.f66975a;
            LynxView lynxView = LynxTemplateRender.this.mLynxView;
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (LynxUI lynxUI : bVar.f66963b.keySet()) {
                if (lynxUI.mContext.f67068i.f67258a == lynxView) {
                    atomicInteger.incrementAndGet();
                    lynxUI.execEnterAnim(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: INVOKE  
                          (r1v2 'lynxUI' com.lynx.tasm.behavior.ui.LynxUI)
                          (wrap: com.lynx.tasm.behavior.b.b$1 : 0x002f: CONSTRUCTOR  (r0v12 com.lynx.tasm.behavior.b.b$1) = (r5v0 'bVar' com.lynx.tasm.behavior.b.b), (r3v0 'atomicInteger' java.util.concurrent.atomic.AtomicInteger) call: com.lynx.tasm.behavior.b.b.1.<init>(com.lynx.tasm.behavior.b.b, java.util.concurrent.atomic.AtomicInteger):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.lynx.tasm.behavior.ui.LynxUI.execEnterAnim(com.lynx.tasm.behavior.b.b$b):void in method: com.lynx.tasm.LynxTemplateRender.d.a():void, file: classes9.dex
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
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: CONSTRUCTOR  (r0v12 com.lynx.tasm.behavior.b.b$1) = (r5v0 'bVar' com.lynx.tasm.behavior.b.b), (r3v0 'atomicInteger' java.util.concurrent.atomic.AtomicInteger) call: com.lynx.tasm.behavior.b.b.1.<init>(com.lynx.tasm.behavior.b.b, java.util.concurrent.atomic.AtomicInteger):void type: CONSTRUCTOR in method: com.lynx.tasm.LynxTemplateRender.d.a():void, file: classes9.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 24 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.lynx.tasm.behavior.b.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 30 more
                        */
                    /*
                        this = this;
                        com.lynx.tasm.behavior.b.b r5 = com.lynx.tasm.behavior.p2049b.C28471b.C28474a.f66975a
                        com.lynx.tasm.LynxTemplateRender r0 = com.lynx.tasm.LynxTemplateRender.this
                        com.lynx.tasm.LynxView r4 = r0.mLynxView
                        java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
                        r0 = 0
                        r3.<init>(r0)
                        java.util.WeakHashMap<com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.a.b> r0 = r5.f66963b
                        java.util.Set r0 = r0.keySet()
                        java.util.Iterator r2 = r0.iterator()
                    L_0x0016:
                        boolean r0 = r2.hasNext()
                        if (r0 == 0) goto L_0x0036
                        java.lang.Object r1 = r2.next()
                        com.lynx.tasm.behavior.ui.LynxUI r1 = (com.lynx.tasm.behavior.p2052ui.LynxUI) r1
                        com.lynx.tasm.behavior.j r0 = r1.mContext
                        com.lynx.tasm.behavior.ui.UIBody r0 = r0.f67068i
                        com.lynx.tasm.behavior.ui.UIBody$a r0 = r0.f67258a
                        if (r0 != r4) goto L_0x0016
                        r3.incrementAndGet()
                        com.lynx.tasm.behavior.b.b$1 r0 = new com.lynx.tasm.behavior.b.b$1
                        r0.<init>(r3)
                        r1.execEnterAnim(r0)
                        goto L_0x0016
                    L_0x0036:
                        r3.get()
                        com.lynx.tasm.LynxTemplateRender r0 = com.lynx.tasm.LynxTemplateRender.this
                        com.lynx.tasm.p r0 = r0.mClient
                        if (r0 == 0) goto L_0x0048
                        com.lynx.tasm.LynxTemplateRender r1 = com.lynx.tasm.LynxTemplateRender.this
                        com.lynx.tasm.TemplateAssembler r0 = r6.f66683b
                        int r0 = r0.f66691f
                        r1.dispatchLoadSuccess(r0)
                    L_0x0048:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.LynxTemplateRender.C28385d.mo48680a():void");
                }

                @Override // com.lynx.tasm.TemplateAssembler.AbstractC28391a
                /* renamed from: a */
                public final void mo48683a(C28782a aVar) {
                    if (LynxTemplateRender.this.mTheme == null) {
                        LynxTemplateRender.this.mTheme = aVar;
                    } else {
                        LynxTemplateRender.this.mTheme.mo49899a(aVar);
                    }
                }

                @Override // com.lynx.tasm.TemplateAssembler.AbstractC28391a
                /* renamed from: b */
                public final void mo48688b(LynxPerfMetric lynxPerfMetric) {
                    if (LynxTemplateRender.this.mClient != null) {
                        LynxTemplateRender.this.mClient.mo14471b(lynxPerfMetric);
                    }
                }

                @Override // com.lynx.tasm.TemplateAssembler.AbstractC28391a
                /* renamed from: a */
                public final String mo48679a(String str) {
                    AbstractC28854l lVar = LynxEnv.m56706b().f66637d;
                    if (lVar == null) {
                        return null;
                    }
                    if (str != null) {
                        try {
                            str.isEmpty();
                        } catch (Throwable th) {
                            LLog.m56856a(3, "LynxTemplateRender", "translateResourceForTheme exception " + th.toString());
                            return null;
                        }
                    }
                    return lVar.mo49983a();
                }

                @Override // com.lynx.tasm.TemplateAssembler.AbstractC28391a
                /* renamed from: a */
                public final void mo48682a(LynxPerfMetric lynxPerfMetric) {
                    lynxPerfMetric.setInitTiming(LynxTemplateRender.this.mInitStart, LynxTemplateRender.this.mInitEnd);
                    lynxPerfMetric.setIsColdBoot(LynxTemplateRender.sIsFirstRender);
                    if (!(LynxTemplateRender.this.mLynxView == null || LynxTemplateRender.this.mLynxView.getLynxUIRoot() == null || LynxTemplateRender.this.mLynxView.getLynxUIRoot().mView == null)) {
                        lynxPerfMetric.correctFirstPageLayout(((UIBody.C28581a) LynxTemplateRender.this.mLynxView.getLynxUIRoot().mView).getMeaningfulPaintTiming());
                    }
                    LynxTemplateRender.sIsFirstRender = false;
                    if (LynxTemplateRender.this.mClient != null) {
                        LynxTemplateRender.this.mClient.mo14468a(lynxPerfMetric);
                    }
                }

                @Override // com.lynx.tasm.TemplateAssembler.AbstractC28391a
                /* renamed from: a */
                public final void mo48684a(C28855q qVar) {
                    if (LynxTemplateRender.this.mEventDispatcher != null) {
                        if (qVar != null) {
                            LynxTemplateRender.this.mEventDispatcher.f67718c = C28930n.m57957a(qVar.f68114n, LynxTemplateRender.this.getLynxContext().f67075p);
                        } else {
                            return;
                        }
                    } else if (qVar == null) {
                        return;
                    }
                    LynxTemplateRender.this.mLynxUIOwner.f67110b.f67259b.f67334f = qVar.f68116p;
                }

                @Override // com.lynx.tasm.TemplateAssembler.AbstractC28391a
                /* renamed from: a */
                public final void mo48686a(HashMap<String, Object> hashMap) {
                    if (LynxTemplateRender.this.mClient != null) {
                        LynxTemplateRender.this.mClient.mo49971a(hashMap);
                    }
                }

                public C28385d(TemplateAssembler templateAssembler) {
                    this.f66683b = templateAssembler;
                }

                @Override // com.lynx.tasm.TemplateAssembler.AbstractC28391a
                /* renamed from: a */
                public final void mo48681a(int i, String str) {
                    LynxTemplateRender.this.onNativeErrorOccurred(i, str);
                }

                @Override // com.lynx.tasm.TemplateAssembler.AbstractC28391a
                /* renamed from: a */
                public final void mo48685a(String str, String str2, int i) {
                    if (LynxTemplateRender.this.mClient != null) {
                        LynxTemplateRender.this.mClient.mo33420a(str, str2, i);
                    }
                }
            }

            static {
                Covode.recordClassIndex(34359);
            }

            public String getPageVersion() {
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler == null) {
                    return "";
                }
                return templateAssembler.mo48759a();
            }

            private void requestLayoutWhenSafepointEnable() {
                if (this.mLynxView != null && this.mBuilder.f68028e && getThreadStrategyForRendering() == EnumC28856r.PART_ON_LAYOUT) {
                    this.mLynxView.requestLayout();
                }
            }

            /* access modifiers changed from: package-private */
            public boolean blockNativeEvent() {
                C28717w wVar = this.mEventDispatcher;
                if (wVar.f67716a == null) {
                    return false;
                }
                AbstractC28464a aVar = wVar.f67716a;
                while (aVar != null && aVar.parent() != aVar) {
                    if (aVar.blockNativeEvent()) {
                        return true;
                    }
                    aVar = aVar.parent();
                }
                return false;
            }

            public boolean enableEventThrough() {
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    if (templateAssembler.f66695j == null) {
                        LLog.m56856a(6, "TemplateAssembler", "PageConfig is null. EnableEventThrough get default false!");
                    } else if (templateAssembler.f66695j.f68102b) {
                        return true;
                    }
                }
                return false;
            }

            public Map<String, Object> getAllJsSource() {
                JavaOnlyMap javaOnlyMap;
                MethodCollector.m26663i(1690);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    javaOnlyMap = templateAssembler.nativeGetAllJsSource(templateAssembler.f66686a);
                } else {
                    javaOnlyMap = null;
                }
                MethodCollector.m26664o(1690);
                return javaOnlyMap;
            }

            /* access modifiers changed from: package-private */
            public C28783h getLynxConfigInfo() {
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler == null) {
                    return new C28783h.C28784a().mo49900a();
                }
                return templateAssembler.mo48765d();
            }

            public void syncFlush() {
                C28929m.m57951b();
                if (this.mAsyncRender) {
                    LLog.m56856a(4, "LynxTemplateRender", "syncFlush wait layout finish");
                    this.mPaintingContext.flush();
                }
            }

            /* access modifiers changed from: package-private */
            public void onAttachedToWindow() {
                UIBody uIBody;
                LLog.m56856a(4, "LynxTemplateRender", "lynxview onAttachedToWindow " + toString());
                TraceEvent.m56867a("onAttachedToWindow", "#e6ee9c");
                onEnterForeground(false);
                C28529q qVar = this.mLynxUIOwner;
                if (qVar != null && (uIBody = qVar.f67110b) != null) {
                    uIBody.onAttach();
                }
            }

            /* access modifiers changed from: package-private */
            public void onDetachedFromWindow() {
                UIBody uIBody;
                LLog.m56856a(4, "LynxTemplateRender", "lynxview onDetachedFromWindow " + toString());
                TraceEvent.m56867a("onDetachedFromWindow", "#fff59d");
                this.mClient.mo49973a(this.mLynxUIOwner.mo49075a());
                C28529q qVar = this.mLynxUIOwner;
                if (!(qVar == null || (uIBody = qVar.f67110b) == null)) {
                    uIBody.onDetach();
                }
                onEnterBackground(false);
            }

            private void destroyNative() {
                LLog.m56856a(4, "LynxTemplateRender", "destroyNative url " + getTemplateUrl() + " in " + toString());
                C28333d dVar = this.mDevtool;
                if (dVar != null) {
                    if (dVar.f66539e != null) {
                        dVar.f66539e = null;
                    }
                    if (dVar.f66535a != null) {
                        dVar.f66535a = null;
                    }
                    if (dVar.f66536b != null) {
                        dVar.f66536b = null;
                    }
                    this.mDevtool = null;
                }
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    templateAssembler.mo48763b();
                    this.mTemplateAssembler = null;
                }
                this.mHasDestory = true;
            }

            private void reloadAndInit() {
                if (!this.mHasDestory) {
                    if (this.reload) {
                        this.mHasPageStart = false;
                        this.mFirstScreen = false;
                        if (this.mLynxView != null) {
                            if (C28929m.m57950a()) {
                                this.mLynxView.removeAllViews();
                            } else {
                                C28929m.m57947a(new Runnable() {
                                    /* class com.lynx.tasm.LynxTemplateRender.RunnableC283742 */

                                    static {
                                        Covode.recordClassIndex(34361);
                                    }

                                    public final void run() {
                                        LynxTemplateRender.this.mLynxView.removeAllViews();
                                    }
                                });
                            }
                        }
                        PaintingContext paintingContext = this.mPaintingContext;
                        if (paintingContext != null) {
                            paintingContext.f66940a.f66983b = true;
                        }
                        TemplateAssembler templateAssembler = this.mTemplateAssembler;
                        if (templateAssembler != null) {
                            templateAssembler.mo48763b();
                            this.mTemplateAssembler = null;
                        }
                        int i = this.mPreWidthMeasureSpec;
                        int i2 = this.mPreHeightMeasureSpec;
                        this.mPreWidthMeasureSpec = 0;
                        this.mPreHeightMeasureSpec = 0;
                        C28529q qVar = this.mLynxUIOwner;
                        qVar.f67115g = true;
                        qVar.f67109a = -1;
                        if (qVar.f67113e != null) {
                            qVar.f67113e.clear();
                        }
                        if (qVar.f67110b != null) {
                            qVar.f67110b.removeAll();
                        }
                        if (qVar.f67114f != null) {
                            qVar.f67114f.clear();
                        }
                        createTemplateAssembler();
                        updateViewport(i, i2);
                        return;
                    }
                    this.reload = true;
                }
            }

            public void destroy() {
                LynxBaseUI value;
                destroyNative();
                this.mClient.mo49973a(this.mLynxUIOwner.mo49075a());
                for (Map.Entry<Integer, LynxBaseUI> entry : this.mLynxUIOwner.f67113e.entrySet()) {
                    if ((entry.getValue() instanceof LynxBaseUI) && (value = entry.getValue()) != null) {
                        value.destroy();
                    }
                }
                this.mShadowNodeOwner = null;
                if (this.mLynxContext.f67079t != null) {
                    this.mLynxContext.f67079t.f68085a.clear();
                }
                this.mLynxContext = null;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: com.lynx.tasm.behavior.shadow.k */
            /* JADX WARN: Multi-variable type inference failed */
            private void createTemplateAssembler() {
                C28479a aVar;
                C28534a aVar2;
                String str;
                boolean z;
                boolean z2;
                AbstractC28520j jVar;
                MethodCollector.m26663i(945);
                if (!checkIfEnvPrepared()) {
                    MethodCollector.m26664o(945);
                    return;
                }
                if (this.mThreadStrategyForRendering == EnumC28856r.MULTI_THREADS) {
                    aVar = new C28481b(this.mLynxUIOwner);
                } else {
                    aVar = new C28479a(this.mLynxUIOwner, this.mBuilder.f68035m);
                }
                if (this.mThreadStrategyForRendering == EnumC28856r.ALL_ON_UI) {
                    C28546k kVar = new C28546k(this.mLynxView);
                    this.mViewLayoutTick = kVar;
                    aVar2 = kVar;
                } else {
                    int i = Build.VERSION.SDK_INT;
                    aVar2 = new C28534a();
                }
                this.mPaintingContext = new PaintingContext(this.mLynxUIOwner, aVar);
                C28576t tVar = new C28576t(this.mLynxContext, this.mBuilder.f68025b, this.mPaintingContext, aVar2, new C28380b(this, (byte) 0));
                this.mShadowNodeOwner = tVar;
                this.mLynxContext.f67074o = new WeakReference<>(tVar);
                TemplateAssembler templateAssembler = new TemplateAssembler(this.mPaintingContext, this.mShadowNodeOwner, new DynamicComponentLoader(this.mBuilder.f68031h, this), this.mGroup, this.mThreadStrategyForRendering, this.mBuilder.f68028e, this.mBuilder.f68033k, this.mBuilder.f68034l);
                this.mTemplateAssembler = templateAssembler;
                this.mLynxUIOwner.f67117i = templateAssembler;
                this.mLynxContext.f67064e = new C28719c(this.mTemplateAssembler);
                this.mLynxContext.f67073n = new WeakReference<>(this.mLynxView);
                this.mLynxContext.f67066g = new C28781g(this.mTemplateAssembler);
                C28845c cVar = new C28845c();
                for (Map.Entry<String, AbstractC28850h> entry : LynxEnv.m56706b().f66655v.entrySet()) {
                    cVar.mo49981a(entry.getKey(), entry.getValue());
                }
                for (Map.Entry<String, AbstractC28850h> entry2 : this.mBuilder.f68032i.entrySet()) {
                    cVar.mo49981a(entry2.getKey(), entry2.getValue());
                }
                this.mLynxContext.f67079t = cVar;
                this.mTemplateAssembler.f66694i = new WeakReference<>(this.mLynxContext);
                LynxModuleManager lynxModuleManager = new LynxModuleManager(this.mLynxContext);
                this.mModuleManager = lynxModuleManager;
                lynxModuleManager.mo48442a(this.mBuilder.f68026c);
                String[] strArr = null;
                this.mModuleManager.mo48441a("IntersectionObserverModule", LynxIntersectionObserverModule.class, null);
                this.mModuleManager.mo48441a("LynxUIMethodModule", LynxUIMethodModule.class, null);
                this.mModuleManager.mo48441a("LynxSetModule", LynxSetModule.class, null);
                ExternalSourceLoader externalSourceLoader = new ExternalSourceLoader(this.mBuilder.f68032i.get("EXTERNAL_JS_SOURCE"), this.mBuilder.f68032i.get("DYNAMIC_COMPONENT"), this.mBuilder.f68031h, this);
                this.mLoader = externalSourceLoader;
                TemplateAssembler templateAssembler2 = this.mTemplateAssembler;
                LynxModuleManager lynxModuleManager2 = this.mModuleManager;
                boolean z3 = this.mBuilder.f68029f;
                long j = templateAssembler2.f66686a;
                ResourceLoader resourceLoader = new ResourceLoader();
                if (templateAssembler2.f66693h != null) {
                    str = templateAssembler2.f66693h.f68018a;
                } else {
                    str = C28818l.f68017f;
                }
                if (templateAssembler2.f66693h != null) {
                    strArr = templateAssembler2.f66693h.f68020c;
                }
                if (templateAssembler2.f66693h == null || !templateAssembler2.f66693h.f68019b) {
                    z = false;
                } else {
                    z = true;
                }
                if (templateAssembler2.f66693h == null || !templateAssembler2.f66693h.f68021d) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                templateAssembler2.nativeInitRuntime(j, resourceLoader, externalSourceLoader, lynxModuleManager2, str, strArr, z, z2, z3, true);
                templateAssembler2.f66690e = new JSProxy(templateAssembler2.f66686a, templateAssembler2.f66694i);
                this.mLynxContext.f67067h = new WeakReference<>(this.mTemplateAssembler.f66690e);
                this.mLoader.f67760b = new WeakReference<>(this.mTemplateAssembler.f66690e);
                C28524l lVar = new C28524l(this.mLynxContext, this.mTemplateAssembler.f66690e);
                this.mIntersectionObserverManager = lVar;
                this.mLynxContext.f67070k = new WeakReference<>(lVar);
                C28719c cVar2 = this.mLynxContext.f67064e;
                C28524l lVar2 = this.mIntersectionObserverManager;
                if (!cVar2.f67729a.contains(lVar2)) {
                    cVar2.f67729a.add(lVar2);
                }
                C28782a aVar3 = this.mTheme;
                if (aVar3 != null) {
                    this.mTemplateAssembler.mo48762a(aVar3);
                }
                TemplateData templateData = this.globalProps;
                if (templateData != null) {
                    this.mTemplateAssembler.mo48760a(templateData);
                }
                float f = this.mFontScale;
                if (f != 1.0f) {
                    TemplateAssembler templateAssembler3 = this.mTemplateAssembler;
                    templateAssembler3.nativeSetFontScale(templateAssembler3.f66686a, f);
                }
                if (!(this.mDevtool == null || (jVar = this.mLynxContext) == null)) {
                    jVar.mo49043c().longValue();
                }
                MethodCollector.m26664o(945);
            }

            public void addLStateListener(AbstractC28767e eVar) {
                if (eVar != null) {
                    this.mStateListeners.add(eVar);
                }
            }

            /* access modifiers changed from: package-private */
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return this.mEventDispatcher.mo49830a(motionEvent, (UIGroup) null);
            }

            public void removeStateListener(AbstractC28767e eVar) {
                if (eVar != null) {
                    this.mStateListeners.remove(eVar);
                }
            }

            public void setImageInterceptor(AbstractC28510f fVar) {
                this.mLynxContext.f67061b = fVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.lynx.tasm.LynxTemplateRender$a */
            public class C28379a implements AbstractC28843b.AbstractC28844a {

                /* renamed from: a */
                public TemplateData f66672a;

                /* renamed from: b */
                public String f66673b;

                /* renamed from: c */
                public Map<String, Object> f66674c;

                /* renamed from: e */
                private String f66676e;

                static {
                    Covode.recordClassIndex(34366);
                }

                @Override // com.lynx.tasm.provider.AbstractC28843b.AbstractC28844a
                /* renamed from: a */
                public final void mo48671a(String str) {
                    m56724b("onFailed");
                    LynxTemplateRender.this.onErrorOccurred(103, str);
                }

                /* renamed from: b */
                private static void m56724b(String str) {
                    if (!Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
                        throw new IllegalThreadStateException("Callback " + str + "must be fired on main thread.");
                    }
                }

                @Override // com.lynx.tasm.provider.AbstractC28843b.AbstractC28844a
                /* renamed from: a */
                public final void mo48672a(byte[] bArr) {
                    m56724b("onSuccess");
                    if (bArr == null || bArr.length == 0) {
                        mo48671a("Source is null!");
                        return;
                    }
                    TemplateData templateData = this.f66672a;
                    if (templateData != null) {
                        LynxTemplateRender.this.renderTemplate(bArr, templateData);
                        return;
                    }
                    Map<String, Object> map = this.f66674c;
                    if (map != null) {
                        LynxTemplateRender.this.renderTemplate(bArr, map);
                        return;
                    }
                    LynxTemplateRender lynxTemplateRender = LynxTemplateRender.this;
                    String str = this.f66673b;
                    if (str == null) {
                        str = "";
                    }
                    lynxTemplateRender.renderTemplate(bArr, str);
                }

                public C28379a(String str, TemplateData templateData) {
                    this.f66672a = templateData;
                    this.f66676e = str;
                }

                public C28379a(String str, String str2) {
                    this.f66673b = str2;
                    this.f66676e = str;
                }

                public C28379a(String str, Map<String, Object> map) {
                    this.f66674c = map;
                    this.f66676e = str;
                }
            }

            public void addLynxViewClient(AbstractC28838o oVar) {
                if (oVar != null) {
                    this.mClient.mo49977a(oVar);
                }
            }

            public LynxBaseUI findUIByIndex(int i) {
                return this.mLynxUIOwner.f67113e.get(Integer.valueOf(i));
            }

            /* access modifiers changed from: package-private */
            public View findViewByIdSelector(String str) {
                LynxBaseUI findUIByIdSelector = findUIByIdSelector(str);
                if (findUIByIdSelector instanceof LynxUI) {
                    return ((LynxUI) findUIByIdSelector).mView;
                }
                return null;
            }

            /* access modifiers changed from: package-private */
            public View findViewByName(String str) {
                LynxBaseUI findUIByName = findUIByName(str);
                if (findUIByName instanceof LynxUI) {
                    return ((LynxUI) findUIByName).mView;
                }
                return null;
            }

            /* access modifiers changed from: package-private */
            public C28357b getJSModule(String str) {
                AbstractC28520j jVar = this.mLynxContext;
                if (jVar != null) {
                    return jVar.mo49033a(str);
                }
                return null;
            }

            public void removeLynxViewClient(AbstractC28838o oVar) {
                C28841p pVar;
                if (oVar != null && (pVar = this.mClient) != null) {
                    pVar.f68084a.remove(oVar);
                }
            }

            private void setUrl(String str) {
                this.mUrl = str;
                AbstractC28520j jVar = this.mLynxContext;
                if (jVar != null) {
                    LLog.m56856a(6, "LynxContext", "setTemplateUrl: ".concat(String.valueOf(str)));
                    jVar.f67071l = str;
                }
            }

            public void resetData(TemplateData templateData) {
                MethodCollector.m26663i(1191);
                if (prepareUpdateData(templateData)) {
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    templateAssembler.nativeResetDataByPreParsedData(templateAssembler.f66686a, templateData.f66711a, templateData.f66712b, templateData.f66713c);
                }
                MethodCollector.m26664o(1191);
            }

            public void runOnTasmThread(Runnable runnable) {
                MethodCollector.m26663i(1707);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler == null) {
                    MethodCollector.m26664o(1707);
                    return;
                }
                templateAssembler.nativeRunOnTasmThread(templateAssembler.f66686a, runnable);
                MethodCollector.m26664o(1707);
            }

            /* access modifiers changed from: package-private */
            public void setGlobalProps(TemplateData templateData) {
                TemplateAssembler templateAssembler;
                if (templateData != null) {
                    this.globalProps = templateData;
                    if (checkIfEnvPrepared() && (templateAssembler = this.mTemplateAssembler) != null) {
                        templateAssembler.mo48760a(this.globalProps);
                    }
                }
            }

            public void updateData(TemplateData templateData) {
                MethodCollector.m26663i(1182);
                if (prepareUpdateData(templateData)) {
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    templateAssembler.nativeUpdateDataByPreParsedData(templateAssembler.f66686a, templateData.f66711a, templateData.f66712b, templateData.f66713c);
                }
                MethodCollector.m26664o(1182);
            }

            /* access modifiers changed from: package-private */
            public void updateFontScale(float f) {
                TemplateAssembler templateAssembler;
                MethodCollector.m26663i(1275);
                if (!checkIfEnvPrepared() || (templateAssembler = this.mTemplateAssembler) == null) {
                    MethodCollector.m26664o(1275);
                    return;
                }
                templateAssembler.nativeUpdateFontScale(templateAssembler.f66686a, f);
                MethodCollector.m26664o(1275);
            }

            private void dispatchOnPageStart(String str) {
                LLog.m56856a(4, "LynxTemplateRender", "dispatchOnPageStart url " + str + " in " + toString());
                if (!this.mHasPageStart && this.mClient != null) {
                    this.mHasPageStart = true;
                    TraceEvent.m56867a("StartLoad", "#4caf50");
                    this.mClient.mo14469a(str);
                }
            }

            private void onEnterBackground(boolean z) {
                MethodCollector.m26663i(1446);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null && (z || templateAssembler.mo48764c())) {
                    templateAssembler.nativeOnEnterBackground(templateAssembler.f66686a);
                }
                Iterator<AbstractC28767e> it = this.mStateListeners.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                MethodCollector.m26664o(1446);
            }

            private void onEnterForeground(boolean z) {
                MethodCollector.m26663i(1442);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null && (z || templateAssembler.mo48764c())) {
                    templateAssembler.nativeOnEnterForeground(templateAssembler.f66686a);
                }
                Iterator<AbstractC28767e> it = this.mStateListeners.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                MethodCollector.m26664o(1442);
            }

            /* access modifiers changed from: package-private */
            public boolean attach(LynxView lynxView) {
                if (this.mLynxView != null) {
                    LLog.m56856a(5, "Lynx", "already attached " + lynxView.toString());
                    return false;
                }
                this.mLynxView = lynxView;
                lynxView.removeAllViews();
                C28546k kVar = this.mViewLayoutTick;
                if (kVar != null) {
                    kVar.f67154a = lynxView;
                }
                UIBody uIBody = this.mLynxUIOwner.f67110b;
                uIBody.f67258a = lynxView;
                uIBody.initialize();
                C28333d dVar = this.mDevtool;
                if (dVar == null) {
                    return true;
                }
                dVar.f66538d = new WeakReference<>(lynxView);
                return true;
            }

            public void dispatchLoadSuccess(int i) {
                LLog.m56856a(4, "LynxTemplateRender", "dispatchLoadSuccess templateSize in " + toString());
                C28841p pVar = this.mClient;
                if (pVar != null) {
                    pVar.mo14467a();
                    this.mClient.mo49968a(getLynxConfigInfo());
                }
            }

            public LynxBaseUI findUIByIdSelector(String str) {
                C28529q qVar = this.mLynxUIOwner;
                for (Integer num : qVar.f67113e.keySet()) {
                    LynxBaseUI lynxBaseUI = qVar.f67113e.get(num);
                    if (lynxBaseUI != null && str.equals(lynxBaseUI.mIdSelector)) {
                        return lynxBaseUI;
                    }
                }
                return null;
            }

            public LynxBaseUI findUIByName(String str) {
                C28529q qVar = this.mLynxUIOwner;
                for (Integer num : qVar.f67113e.keySet()) {
                    LynxBaseUI lynxBaseUI = qVar.f67113e.get(num);
                    if (lynxBaseUI != null && str.equals(lynxBaseUI.mName)) {
                        return lynxBaseUI;
                    }
                }
                return null;
            }

            public void getCurrentData(AbstractC28817k kVar) {
                TemplateAssembler templateAssembler;
                MethodCollector.m26663i(1194);
                if (!checkIfEnvPrepared() || (templateAssembler = this.mTemplateAssembler) == null) {
                    MethodCollector.m26664o(1194);
                    return;
                }
                int incrementAndGet = templateAssembler.f66697l.incrementAndGet();
                templateAssembler.f66698m.put(incrementAndGet, kVar);
                templateAssembler.nativeGetDataAsync(templateAssembler.f66686a, incrementAndGet);
                MethodCollector.m26664o(1194);
            }

            /* access modifiers changed from: package-private */
            public void setGlobalProps(Map<String, Object> map) {
                if (checkIfEnvPrepared() && this.mTemplateAssembler != null) {
                    setGlobalProps(TemplateData.m56772a(map));
                }
            }

            public void setTheme(C28782a aVar) {
                if (aVar != null) {
                    C28782a aVar2 = this.mTheme;
                    if (aVar2 == null) {
                        this.mTheme = aVar;
                    } else {
                        aVar2.mo49899a(aVar);
                    }
                    if (checkIfEnvPrepared() && this.mTemplateAssembler != null) {
                        this.mWillContentSizeChange = true;
                        this.mPaintingContext.f66940a.mo49003b();
                        requestLayoutWhenSafepointEnable();
                        this.mTemplateAssembler.mo48762a(aVar);
                    }
                }
            }

            private void init(Context context) {
                this.reload = false;
                this.mHasPageStart = false;
                this.mHasDestory = false;
                this.mLynxContext.f67061b = this.mClient;
                this.mLynxContext.f67072m = this.mClient;
                C28529q qVar = new C28529q(this.mLynxContext, this.mBuilder.f68025b, this.mLynxView);
                this.mLynxUIOwner = qVar;
                this.mLynxContext.f67069j = new WeakReference<>(qVar);
                C28717w wVar = new C28717w(this.mLynxUIOwner);
                this.mEventDispatcher = wVar;
                this.mLynxContext.f67065f = wVar;
                this.mDevtool = new C28333d(this.mLynxView, this);
                createTemplateAssembler();
            }

            private boolean prepareUpdateData(TemplateData templateData) {
                if (!checkIfEnvPrepared() || this.mTemplateAssembler == null) {
                    return false;
                }
                if (templateData == null) {
                    LLog.m56856a(6, "LynxTemplateRender", "updateData with null TemplateData");
                    return false;
                }
                templateData.mo48813b();
                if (templateData.f66711a == 0) {
                    LLog.m56856a(6, "LynxTemplateRender", "updateData with TemplateData after flush is nullptr");
                    return false;
                }
                C28333d dVar = this.mDevtool;
                if (!(dVar == null || dVar.f66537c == null)) {
                    dVar.f66537c.f66928d.f66933c = templateData;
                }
                this.mWillContentSizeChange = true;
                this.mPaintingContext.f66940a.mo49003b();
                requestLayoutWhenSafepointEnable();
                return true;
            }

            private String[] processUrl(String str) {
                ArrayList arrayList = new ArrayList();
                String[] split = str.split("=|&");
                String str2 = "";
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i2 < split.length) {
                        if (split[i].equalsIgnoreCase("compile_path") || split[i].equalsIgnoreCase("compilePath")) {
                            str = split[i2];
                        } else if (split[i].equalsIgnoreCase("post_url") || split[i].equalsIgnoreCase("postUrl")) {
                            str2 = split[i2];
                        }
                        i += 2;
                    } else {
                        arrayList.add(str);
                        arrayList.add(str2);
                        return (String[]) arrayList.toArray(new String[arrayList.size()]);
                    }
                }
            }

            public void onErrorOccurred(int i, String str) {
                onErrorOccurred(-3, i, str, null);
            }

            public void onNativeErrorOccurred(int i, String str) {
                onErrorOccurred(-1, i, str, null);
            }

            public void renderTemplateUrl(String str, TemplateData templateData) {
                renderTemplateUrlInternal(str, new C28379a(str, templateData));
            }

            /* access modifiers changed from: package-private */
            public void updateData(String str, String str2) {
                TemplateData a = TemplateData.m56771a(str);
                a.f66712b = str2;
                a.f66713c = true;
                updateData(a);
            }

            public void hotModuleReplace(String str, final String str2) {
                if (this.mBuilder.f68024a != null) {
                    this.mBuilder.f68024a.mo33448a(str, new AbstractC28843b.AbstractC28844a() {
                        /* class com.lynx.tasm.LynxTemplateRender.C283786 */

                        static {
                            Covode.recordClassIndex(34365);
                        }

                        @Override // com.lynx.tasm.provider.AbstractC28843b.AbstractC28844a
                        /* renamed from: a */
                        public final void mo48671a(String str) {
                            LLog.m56856a(6, "LynxTemplateRender", "failed to load template: ".concat(String.valueOf(str)));
                        }

                        @Override // com.lynx.tasm.provider.AbstractC28843b.AbstractC28844a
                        /* renamed from: a */
                        public final void mo48672a(byte[] bArr) {
                            MethodCollector.m26663i(158);
                            if (LynxTemplateRender.this.mTemplateAssembler != null) {
                                TemplateAssembler templateAssembler = LynxTemplateRender.this.mTemplateAssembler;
                                templateAssembler.nativeHotModuleReplace(templateAssembler.f66686a, bArr, str2);
                            }
                            MethodCollector.m26664o(158);
                        }
                    });
                }
            }

            /* access modifiers changed from: package-private */
            public void renderTemplateUrl(String str, String str2) {
                renderTemplateUrlInternal(str, new C28379a(str, str2));
            }

            LynxTemplateRender(Context context, C28819m mVar) {
                init(context, null, mVar);
            }

            private void dispatchError(int i, C28816j jVar) {
                int i2 = jVar.f68013a;
                if (i2 == 100 || i2 == 103) {
                    this.mClient.mo14472b(jVar.mo49932a());
                } else {
                    this.mClient.mo14473c(jVar.mo49932a());
                }
                this.mClient.mo19151a(jVar);
                if (i2 == 201) {
                    this.mClient.mo36952b(jVar);
                } else if (i == -1) {
                    this.mClient.mo36954d(jVar);
                } else {
                    this.mClient.mo36953c(jVar);
                }
            }

            /* access modifiers changed from: package-private */
            public void renderTemplateUrl(String str, Map<String, Object> map) {
                renderTemplateUrlInternal(str, new C28379a(str, map));
            }

            /* access modifiers changed from: package-private */
            public void sendGlobalEvent(String str, JavaOnlyArray javaOnlyArray) {
                AbstractC28520j jVar;
                if (!checkIfEnvPrepared() || (jVar = this.mLynxContext) == null) {
                    LLog.m56856a(6, "LynxTemplateRender", "sendGlobalEvent error, can't get GlobalEventEmitter in " + toString());
                } else {
                    jVar.mo49038a(str, javaOnlyArray);
                }
            }

            /* access modifiers changed from: package-private */
            public void updateData(Map<String, Object> map, String str) {
                TemplateData a = TemplateData.m56772a(map);
                a.f66712b = str;
                a.f66713c = true;
                updateData(a);
            }

            public void updateScreenMetrics(int i, int i2) {
                MethodCollector.m26663i(706);
                if (!(i == this.mLynxContext.f67075p.widthPixels && i2 == this.mLynxContext.f67075p.heightPixels)) {
                    this.mShouldUpdateViewport = true;
                    AbstractC28520j jVar = this.mLynxContext;
                    jVar.f67075p.widthPixels = i;
                    jVar.f67075p.heightPixels = i2;
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    templateAssembler.nativeUpdateScreenMetrics(templateAssembler.f66686a, i, i2, 1.0f);
                    if (this.mDevtool != null) {
                        float f = this.mLynxContext.f67075p.density;
                    }
                }
                MethodCollector.m26664o(706);
            }

            private void renderTemplateUrlInternal(String str, C28379a aVar) {
                if (!checkIfEnvPrepared()) {
                    onErrorOccurred(100, "LynxEnv has not been prepared successfully!");
                    return;
                }
                setUrl(processUrl(str)[0]);
                C28333d dVar = this.mDevtool;
                if (dVar != null) {
                    String str2 = this.mUrl;
                    TemplateData templateData = aVar.f66672a;
                    Map<String, Object> map = aVar.f66674c;
                    String str3 = aVar.f66673b;
                    if (dVar.f66537c != null) {
                        C28460i iVar = dVar.f66537c;
                        if (templateData != null) {
                            iVar.mo48916a(str2, templateData);
                        } else if (map != null) {
                            iVar.mo48916a(str2, TemplateData.m56772a(map));
                        } else if (str3 != null) {
                            iVar.mo48916a(str2, TemplateData.m56771a(str3));
                        } else {
                            iVar.mo48916a(str2, null);
                        }
                    }
                }
                if (this.mBuilder.f68024a == null || TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("LynxTemplateRender template url is null or TemplateProvider is not init");
                }
                dispatchOnPageStart(this.mUrl);
                this.mBuilder.f68024a.mo33448a(this.mUrl, aVar);
            }

            public void renderTemplate(final byte[] bArr, final String str) {
                MethodCollector.m26663i(1089);
                if (!this.mAsyncRender && !C28929m.m57950a()) {
                    C28929m.m57947a(new Runnable() {
                        /* class com.lynx.tasm.LynxTemplateRender.RunnableC283775 */

                        static {
                            Covode.recordClassIndex(34364);
                        }

                        public final void run() {
                            LynxTemplateRender.this.renderTemplate(bArr, str);
                        }
                    });
                    MethodCollector.m26664o(1089);
                } else if (!checkIfEnvPrepared()) {
                    onErrorOccurred(100, "LynxEnv has not been prepared successfully!");
                    MethodCollector.m26664o(1089);
                } else {
                    this.mWillContentSizeChange = true;
                    this.mPaintingContext.f66940a.mo49003b();
                    reloadAndInit();
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    if (templateAssembler != null) {
                        templateAssembler.f66688c = this.mClient;
                        dispatchOnPageStart(this.mUrl);
                        TemplateAssembler templateAssembler2 = this.mTemplateAssembler;
                        String templateUrl = getTemplateUrl();
                        C28385d dVar = new C28385d(this.mTemplateAssembler);
                        if (bArr == null) {
                            LLog.m56856a(6, "TA", "Load Template with null template");
                            MethodCollector.m26664o(1089);
                            return;
                        }
                        templateAssembler2.f66689d = templateUrl;
                        templateAssembler2.f66687b = dVar;
                        templateAssembler2.f66691f = bArr.length;
                        templateAssembler2.nativeLoadTemplateByJson(templateAssembler2.f66686a, templateAssembler2.f66689d, bArr, str);
                    }
                    MethodCollector.m26664o(1089);
                }
            }

            /* access modifiers changed from: package-private */
            public void sendGlobalEventToLepus(String str, List<Object> list) {
                TemplateAssembler templateAssembler;
                int position;
                MethodCollector.m26663i(981);
                if (!checkIfEnvPrepared() || (templateAssembler = this.mTemplateAssembler) == null) {
                    LLog.m56856a(6, "LynxTemplateRender", "sendGlobalEventToLepus error, Env not prepared or mTemplateAssembler is null in " + toString());
                    MethodCollector.m26664o(981);
                    return;
                }
                ByteBuffer a = C28443a.f66899a.mo48885a(list);
                long j = templateAssembler.f66686a;
                if (a == null) {
                    position = 0;
                } else {
                    position = a.position();
                }
                templateAssembler.nativeSendGlobalEventToLepus(j, str, a, position);
                MethodCollector.m26664o(981);
            }

            /* access modifiers changed from: package-private */
            public void updateViewport(int i, int i2) {
                MethodCollector.m26663i(1271);
                if (!checkIfEnvPrepared() || this.mTemplateAssembler == null) {
                    MethodCollector.m26664o(1271);
                } else if (this.mPreWidthMeasureSpec == i && this.mPreHeightMeasureSpec == i2 && !this.mShouldUpdateViewport) {
                    MethodCollector.m26664o(1271);
                } else {
                    if (this.mShouldUpdateViewport) {
                        this.mShouldUpdateViewport = false;
                    }
                    int fromMeasureSpec = EnumC28540e.fromMeasureSpec(i);
                    int size = View.MeasureSpec.getSize(i);
                    int fromMeasureSpec2 = EnumC28540e.fromMeasureSpec(i2);
                    int size2 = View.MeasureSpec.getSize(i2);
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    templateAssembler.nativeUpdateViewport(templateAssembler.f66686a, size, fromMeasureSpec, size2, fromMeasureSpec2);
                    this.mPreWidthMeasureSpec = i;
                    this.mPreHeightMeasureSpec = i2;
                    MethodCollector.m26664o(1271);
                }
            }

            /* access modifiers changed from: package-private */
            public void onMeasure(int i, int i2) {
                long j;
                int i3;
                int i4;
                TemplateAssembler templateAssembler;
                MethodCollector.m26663i(1207);
                if (this.mFirstMeasureTime == -1) {
                    j = System.currentTimeMillis();
                } else {
                    j = 0;
                }
                TraceEvent.m56864a(1, "Platform.onMeasure");
                syncFlush();
                updateViewport(i, i2);
                if (this.mThreadStrategyForRendering == EnumC28856r.PART_ON_LAYOUT && (templateAssembler = this.mTemplateAssembler) != null && !this.mFirstScreen && this.mWillContentSizeChange) {
                    templateAssembler.nativeSyncFetchLayoutResult(templateAssembler.f66686a);
                    this.mFirstScreen = true;
                    this.mWillContentSizeChange = false;
                }
                C28546k kVar = this.mViewLayoutTick;
                if (kVar != null) {
                    if (kVar.f67155b != null) {
                        kVar.f67155b.run();
                    }
                    kVar.f67155b = null;
                }
                C28529q qVar = this.mLynxUIOwner;
                if (qVar.f67111c.f67076q) {
                    for (LynxBaseUI lynxBaseUI : qVar.f67110b.getChildren()) {
                        lynxBaseUI.measure();
                    }
                } else {
                    qVar.f67110b.measureChildren();
                }
                int mode = View.MeasureSpec.getMode(i);
                if (mode == Integer.MIN_VALUE || mode == 0) {
                    i3 = this.mLynxUIOwner.f67110b.getWidth();
                } else {
                    i3 = View.MeasureSpec.getSize(i);
                }
                int mode2 = View.MeasureSpec.getMode(i2);
                if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                    i4 = this.mLynxUIOwner.f67110b.getHeight();
                } else {
                    i4 = View.MeasureSpec.getSize(i2);
                }
                this.mLynxView.innerSetMeasuredDimension(i3, i4);
                TraceEvent.m56869b(1, "Platform.onMeasure");
                if (this.mFirstMeasureTime == -1) {
                    this.mFirstMeasureTime = System.currentTimeMillis() - j;
                }
                MethodCollector.m26664o(1207);
            }

            /* access modifiers changed from: package-private */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
                if (r15 == 0) goto L_0x007a;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void renderTemplate(final byte[] r20, final com.lynx.tasm.TemplateData r21) {
                /*
                // Method dump skipped, instructions count: 153
                */
                throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.LynxTemplateRender.renderTemplate(byte[], com.lynx.tasm.TemplateData):void");
            }

            /* access modifiers changed from: package-private */
            public void renderTemplate(final byte[] bArr, final Map<String, Object> map) {
                int position;
                MethodCollector.m26663i(1072);
                if (!this.mAsyncRender && !C28929m.m57950a()) {
                    C28929m.m57947a(new Runnable() {
                        /* class com.lynx.tasm.LynxTemplateRender.RunnableC283753 */

                        static {
                            Covode.recordClassIndex(34362);
                        }

                        public final void run() {
                            LynxTemplateRender.this.renderTemplate(bArr, map);
                        }
                    });
                    MethodCollector.m26664o(1072);
                } else if (!checkIfEnvPrepared()) {
                    onErrorOccurred(100, "LynxEnv has not been prepared successfully!");
                    MethodCollector.m26664o(1072);
                } else {
                    this.mWillContentSizeChange = true;
                    this.mPaintingContext.f66940a.mo49003b();
                    reloadAndInit();
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    if (templateAssembler != null) {
                        templateAssembler.f66688c = this.mClient;
                        dispatchOnPageStart(this.mUrl);
                        TemplateAssembler templateAssembler2 = this.mTemplateAssembler;
                        String templateUrl = getTemplateUrl();
                        C28385d dVar = new C28385d(this.mTemplateAssembler);
                        if (bArr == null) {
                            LLog.m56856a(6, "TA", "Load Template with null template");
                            MethodCollector.m26664o(1072);
                            return;
                        }
                        ByteBuffer a = C28443a.f66899a.mo48885a(map);
                        templateAssembler2.f66689d = templateUrl;
                        templateAssembler2.f66687b = dVar;
                        templateAssembler2.f66691f = bArr.length;
                        long j = templateAssembler2.f66686a;
                        String str = templateAssembler2.f66689d;
                        if (a == null) {
                            position = 0;
                        } else {
                            position = a.position();
                        }
                        templateAssembler2.nativeLoadTemplate(j, str, bArr, a, position);
                    }
                    MethodCollector.m26664o(1072);
                }
            }

            public void renderTemplateWithBaseUrl(byte[] bArr, TemplateData templateData, String str) {
                C28333d dVar = this.mDevtool;
                if (dVar != null) {
                    dVar.mo48415a(bArr, templateData, str);
                }
                setUrl(str);
                renderTemplate(bArr, templateData);
            }

            LynxTemplateRender(Context context, LynxView lynxView, C28820n nVar) {
                init(context, lynxView, nVar);
            }

            public void loadComponent(String str, byte[] bArr, int i) {
                MethodCollector.m26663i(1091);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    templateAssembler.nativeLoadComponent(templateAssembler.f66686a, str, bArr, i);
                }
                MethodCollector.m26664o(1091);
            }

            /* access modifiers changed from: package-private */
            public void renderTemplateWithBaseUrl(byte[] bArr, String str, String str2) {
                TemplateData a = TemplateData.m56771a(str);
                C28333d dVar = this.mDevtool;
                if (dVar != null) {
                    dVar.mo48415a(bArr, a, str2);
                }
                setUrl(str2);
                renderTemplate(bArr, a);
            }

            /* access modifiers changed from: package-private */
            public void renderTemplateWithBaseUrl(byte[] bArr, Map<String, Object> map, String str) {
                TemplateData a = TemplateData.m56772a(map);
                C28333d dVar = this.mDevtool;
                if (dVar != null) {
                    dVar.mo48415a(bArr, a, str);
                }
                setUrl(str);
                renderTemplate(bArr, a);
            }

            /* access modifiers changed from: package-private */
            public void init(Context context, LynxView lynxView, C28820n nVar) {
                boolean z;
                boolean z2;
                boolean z3;
                MethodCollector.m26663i(683);
                this.mInitStart = System.currentTimeMillis();
                this.mContext = context;
                this.mLynxView = lynxView;
                this.mGroup = nVar.f68027d;
                EnumC28856r rVar = nVar.f68036n;
                this.mThreadStrategyForRendering = rVar;
                boolean z4 = false;
                if (rVar == EnumC28856r.MULTI_THREADS) {
                    z = true;
                } else {
                    z = false;
                }
                this.mAsyncRender = z;
                this.mBuilder = nVar;
                this.mHasEnvPrepared = LynxEnv.m56706b().mo48573f();
                this.mFontScale = nVar.f68041s;
                Float f = nVar.f68030g;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                if (DisplayMetricsHolder.f68336b == null || (displayMetrics.widthPixels == DisplayMetricsHolder.f68336b.widthPixels && displayMetrics.heightPixels == DisplayMetricsHolder.f68336b.heightPixels)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (f != null) {
                    displayMetrics.density = f.floatValue();
                }
                if (DisplayMetricsHolder.f68335a == null) {
                    DisplayMetricsHolder.f68335a = new DisplayMetrics();
                }
                DisplayMetricsHolder.f68335a.setTo(displayMetrics);
                int i = context.getResources().getConfiguration().orientation;
                if (DisplayMetricsHolder.f68337c != i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                DisplayMetricsHolder.f68337c = i;
                if (DisplayMetricsHolder.f68338d != displayMetrics.scaledDensity) {
                    z4 = true;
                }
                DisplayMetricsHolder.f68338d = displayMetrics.scaledDensity;
                if (DisplayMetricsHolder.m57911a() == null || z3 || z4 || z2 || !DisplayMetricsHolder.f68339e) {
                    DisplayMetrics a = DisplayMetricsHolder.m57912a(context);
                    if (f != null) {
                        a.density = f.floatValue();
                    }
                    boolean f2 = LynxEnv.m56706b().mo48573f();
                    synchronized (DisplayMetricsHolder.class) {
                        try {
                            DisplayMetricsHolder.f68336b = a;
                            if (f2) {
                                DisplayMetricsHolder.f68339e = true;
                                DisplayMetricsHolder.nativeUpdateDevice(a.widthPixels, a.heightPixels, a.density, String.valueOf(Build.VERSION.SDK_INT));
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(683);
                            throw th;
                        }
                    }
                }
                DisplayMetrics a2 = DisplayMetricsHolder.m57911a();
                if (!(nVar.f68039q == -1 || nVar.f68040r == -1)) {
                    a2.widthPixels = nVar.f68039q;
                    a2.heightPixels = nVar.f68040r;
                }
                C283731 r1 = new AbstractC28520j(context, a2) {
                    /* class com.lynx.tasm.LynxTemplateRender.C283731 */

                    static {
                        Covode.recordClassIndex(34360);
                    }

                    @Override // com.lynx.tasm.behavior.AbstractC28509e, com.lynx.tasm.behavior.AbstractC28520j
                    /* renamed from: a */
                    public final void mo48666a(Exception exc) {
                        LynxTemplateRender.this.onErrorOccurred(-3, 601, null, exc);
                    }
                };
                this.mLynxContext = r1;
                r1.f67076q = C28180a.f65960b.booleanValue();
                init(context);
                if (!(this.mLynxContext.f67076q && EnumC28540e.fromMeasureSpec(nVar.f68037o) == 0 && EnumC28540e.fromMeasureSpec(nVar.f68038p) == 0)) {
                    updateViewport(nVar.f68037o, nVar.f68038p);
                }
                this.mClient.mo49977a(LynxEnv.m56706b().f66648o);
                this.mClient.mo49977a(new C28384c());
                CanvasProvider canvasProvider = LynxEnv.m56706b().f66650q;
                if (canvasProvider != null) {
                    canvasProvider.onLynxViewFrameCallbackInit(context);
                }
                this.mInitEnd = System.currentTimeMillis();
                this.mStateListeners = new ArrayList();
                MethodCollector.m26664o(683);
            }

            public void onErrorOccurred(int i, int i2, String str, Throwable th) {
                String str2 = "error";
                if (TextUtils.isEmpty(str)) {
                    if (th != null) {
                        str2 = "throwable";
                        str = Log.getStackTraceString(th);
                        if (str.length() > 300) {
                            str = str.substring(0, 300);
                        }
                    } else {
                        str = "Unknown error";
                    }
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.mUrl);
                    jSONObject.put(str2, str);
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    if (templateAssembler != null) {
                        jSONObject.put("card_version", templateAssembler.mo48759a());
                    }
                    LynxEnv.m56706b();
                    jSONObject.put("sdk", "2.1.5-rc.22-cxxshared");
                } catch (Throwable unused) {
                }
                dispatchError(i, new C28816j(jSONObject, i2));
                LLog.m56856a(6, "LynxTemplateRender", "LynxTemplateRender " + toString() + ": onErrorOccurred type " + i + ",errCode:" + i2 + ",detail:" + jSONObject.toString());
                showErrorMessage(str);
            }

            /* access modifiers changed from: package-private */
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                TraceEvent.m56864a(1, "Platform.onLayout");
                C28529q qVar = this.mLynxUIOwner;
                if (qVar.f67111c.f67076q) {
                    for (LynxBaseUI lynxBaseUI : qVar.f67110b.getChildren()) {
                        lynxBaseUI.layout();
                    }
                } else {
                    qVar.f67110b.layoutChildren();
                }
                if (qVar.f67110b.mContext.f67064e != null) {
                    qVar.f67110b.mContext.f67064e.mo49833a(C28719c.EnumC28722c.kLynxEventTypeLayoutEvent, null);
                }
                TraceEvent.m56869b(1, "Platform.onLayout");
            }
        }
