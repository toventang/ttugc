package com.lynx.tasm.behavior.p2052ui.canvas;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.lynx.tasm.AbstractC28773f;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.provider.CanvasProvider;
import com.lynx.tasm.utils.C28921h;
import com.lynx.tasm.utils.C28929m;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.p2024he.lynx.Drawable;
import com.p2024he.lynx.Helium;
import com.p2024he.lynx.HeliumApp;
import com.p2024he.lynx.loader.MediaLoader;
import com.p2024he.lynx.loader.TTAppLoader;
import com.p2024he.lynx.player.IHeliumPlayer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHelium */
public class LynxHelium extends CanvasProvider implements C28921h.AbstractC28923a {
    private static LynxHelium mInstance = new LynxHelium();
    private final HashMap<Long, ArrayList> mCanvasMap = new HashMap<>();
    private ContextWrapper mContextWrapper = null;
    public LynxHeliumEffectInfoInterface mEffect = null;
    private ErrorHandler mErrorHandler = null;
    private boolean mExternalPauseResume = false;
    private C28921h mFrameRateControl;
    private volatile boolean mHasCanvasView = false;
    private Runnable mHeliumOnFrameRunable;
    private Runnable mHeliumPauseRunnable;
    private Runnable mHeliumResumeRunable;
    public HeliumApp mHeliumapp;
    private volatile boolean mInited;
    private LynxDelegateImpl mLynxDelegate;
    private AbstractC28773f mNativeSoLoader = null;
    public PermissionHandler mPermissionHandler = null;
    private IHeliumPlayer.HeliumPlayerFactory mPlayerFactory = null;
    public TTAppLoader mResourceLoader;

    /* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHelium$ErrorHandler */
    public interface ErrorHandler {
        static {
            Covode.recordClassIndex(34649);
        }

        void onReceivedError(C28816j jVar);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHelium$OnPermissionListener */
    public interface OnPermissionListener {
        static {
            Covode.recordClassIndex(34653);
        }

        void onPermissionDenied();

        void onPermissionGranted();
    }

    /* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHelium$PermissionHandler */
    public interface PermissionHandler {
        static {
            Covode.recordClassIndex(34654);
        }

        void requestPermissions(String[] strArr, OnPermissionListener onPermissionListener);

        boolean verifyHasPermission(String[] strArr);
    }

    public static LynxHelium getInstance() {
        return mInstance;
    }

    public boolean isHeliumInitSuccess() {
        return this.mInited;
    }

    public void onPause() {
        this.mExternalPauseResume = true;
        pause();
    }

    public void onResume() {
        this.mExternalPauseResume = true;
        resume();
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public boolean onValidateEffectFromJS() {
        return validateEffect(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHelium$CanvasViewInfo */
    public class CanvasViewInfo {
        private WeakReference<LynxHeliumCanvas> weakCanvas;
        private WeakReference<LynxHeliumCanvasView> weakView;

        static {
            Covode.recordClassIndex(34648);
        }

        /* access modifiers changed from: package-private */
        public LynxHeliumCanvas getCanvas() {
            return this.weakCanvas.get();
        }

        /* access modifiers changed from: package-private */
        public LynxHeliumCanvasView getView() {
            return this.weakView.get();
        }

        public void updateView() {
            T t;
            LynxHeliumCanvas lynxHeliumCanvas = this.weakCanvas.get();
            if (lynxHeliumCanvas != null) {
                t = lynxHeliumCanvas.mView;
            } else {
                t = null;
            }
            this.weakView = new WeakReference<>(t);
        }

        public CanvasViewInfo(LynxHeliumCanvas lynxHeliumCanvas) {
            this.weakCanvas = new WeakReference<>(lynxHeliumCanvas);
            updateView();
        }
    }

    static {
        Covode.recordClassIndex(34637);
    }

    private void updatePlayerFactory() {
        IHeliumPlayer.HeliumPlayerFactory heliumPlayerFactory;
        HeliumApp heliumApp = this.mHeliumapp;
        if (heliumApp != null && (heliumPlayerFactory = this.mPlayerFactory) != null) {
            heliumApp.setHeliumPlayerFactory(heliumPlayerFactory);
        }
    }

    public String getCacheDirAbsolutePath() {
        ContextWrapper contextWrapper = this.mContextWrapper;
        if (contextWrapper != null) {
            return contextWrapper.getCacheDir().getAbsolutePath();
        }
        return null;
    }

    private void initHeliumErrorHandler() {
        HeliumApp.setFatalErrorHandler(new HeliumApp.ScriptErrorHandler() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.C286053 */

            static {
                Covode.recordClassIndex(34641);
            }

            @Override // com.p2024he.lynx.HeliumApp.ScriptErrorHandler
            public void handle(String str) {
                LynxHelium.this.onHeliumError(true, str);
            }
        });
        HeliumApp.setUncaughtExceptionHandler(new HeliumApp.ScriptErrorHandler() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.C286064 */

            static {
                Covode.recordClassIndex(34642);
            }

            @Override // com.p2024he.lynx.HeliumApp.ScriptErrorHandler
            public void handle(String str) {
                LynxHelium.this.onHeliumError(false, str);
            }
        });
    }

    private void initHeliumRunables() {
        this.mHeliumPauseRunnable = new Runnable() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.RunnableC286086 */

            static {
                Covode.recordClassIndex(34644);
            }

            public void run() {
                LynxHelium.this.mHeliumapp.pause();
            }
        };
        this.mHeliumResumeRunable = new Runnable() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.RunnableC286097 */

            static {
                Covode.recordClassIndex(34645);
            }

            public void run() {
                LynxHelium.this.mHeliumapp.resume();
            }
        };
        this.mHeliumOnFrameRunable = new Runnable() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.RunnableC286108 */

            static {
                Covode.recordClassIndex(34646);
            }

            public void run() {
                LynxHelium.this.mHeliumapp.doFrame(0);
            }
        };
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public String onPreloadEffectModuleFromJS() {
        MethodCollector.m26663i(299);
        if (this.mEffect == null) {
            MethodCollector.m26664o(299);
            return null;
        }
        String preloadLiteEffectModules = Helium.preloadLiteEffectModules();
        MethodCollector.m26664o(299);
        return preloadLiteEffectModules;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHelium$LynxDelegateImpl */
    public class LynxDelegateImpl implements HeliumApp.LynxDelegate {
        static {
            Covode.recordClassIndex(34650);
        }

        @Override // com.p2024he.lynx.HeliumApp.LynxDelegate
        public HeliumApp.EffectResourceDownloadInfo effectResourceDownloadInfo() {
            if (LynxHelium.this.mEffect == null) {
                return null;
            }
            HeliumApp.EffectResourceDownloadInfo effectResourceDownloadInfo = new HeliumApp.EffectResourceDownloadInfo();
            effectResourceDownloadInfo.appId = LynxHelium.this.mEffect.getEffectAppId();
            effectResourceDownloadInfo.hostUrl = LynxHelium.this.mEffect.getEffectResourceDownloadUrl();
            return effectResourceDownloadInfo;
        }

        LynxDelegateImpl() {
        }

        @Override // com.p2024he.lynx.HeliumApp.LynxDelegate
        public void runOnJsThread(Runnable runnable) {
            LynxHelium.this.nativeRunOnJSThread(runnable);
        }
    }

    private void pause() {
        if (this.mInited) {
            LLog.m56856a(4, "LynxHelium", "Pause");
            C28921h hVar = this.mFrameRateControl;
            if (hVar != null) {
                hVar.f68351e = hVar.f68350d;
                if (hVar.f68350d) {
                    hVar.mo50118b();
                }
            }
            Runnable runnable = this.mHeliumPauseRunnable;
            if (runnable != null) {
                nativeCallRunnableInstanceOnJSThread(runnable, 1);
            }
        }
    }

    private void resume() {
        if (this.mInited) {
            LLog.m56856a(4, "LynxHelium", "Resume");
            C28921h hVar = this.mFrameRateControl;
            if (hVar != null && hVar.f68351e) {
                hVar.mo50117a();
            }
            Runnable runnable = this.mHeliumResumeRunable;
            if (runnable != null) {
                nativeCallRunnableInstanceOnJSThread(runnable, 2);
            }
        }
    }

    private LynxHeliumEffectInfoInterface tryToLoadEffectInfoImpl() {
        try {
            Class<?> cls = Class.forName("com.lynx.tasm.behavior.ui.canvas.LynxHeliumEffectInfo");
            LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = (LynxHeliumEffectInfoInterface) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (lynxHeliumEffectInfoInterface != null) {
                cls.getMethod("init", LynxHelium.class).invoke(lynxHeliumEffectInfoInterface, this);
                return lynxHeliumEffectInfoInterface;
            }
            LLog.m56856a(5, "LynxHelium", "tryToLoadEffectInfoImpl error");
            return null;
        } catch (Throwable th) {
            LLog.m56861c("LynxHelium", "tryToLoadEffectInfoImpl exception " + th.toString());
            return null;
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public void onLynxViewFrameCallbackInit(Context context) {
        initForFrameCallback(context);
    }

    public void setPermissionHandler(PermissionHandler permissionHandler) {
        this.mPermissionHandler = permissionHandler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHelium$LynxMediaLoaderImpl */
    public class LynxMediaLoaderImpl implements MediaLoader {
        static {
            Covode.recordClassIndex(34651);
        }

        LynxMediaLoaderImpl() {
        }

        @Override // com.p2024he.lynx.loader.MediaLoader
        public Uri loadMedia(String str) {
            if (LynxHelium.this.mResourceLoader != null) {
                return LynxHelium.this.mResourceLoader.loadMedia(str);
            }
            return null;
        }

        @Override // com.p2024he.lynx.loader.MediaLoader
        public void onRequest(MediaLoader.RequestParams requestParams, final MediaLoader.Responder responder) {
            String str;
            if (responder != null) {
                if (requestParams == null || (!requestParams.video && !requestParams.audio)) {
                    responder.onResponse(true);
                    return;
                }
                if (requestParams.video && requestParams.effect && LynxHelium.this.mEffect != null) {
                    LynxHelium.this.mEffect.validateLibrary(true);
                }
                if (LynxHelium.this.mPermissionHandler == null) {
                    LLog.m56856a(5, "LynxHelium", "WARNING: PermissionHandler not set!!!");
                    responder.onResponse(true);
                    return;
                }
                String[] strArr = new String[1];
                if (requestParams.audio) {
                    str = "android.permission.RECORD_AUDIO";
                } else {
                    str = "android.permission.CAMERA";
                }
                strArr[0] = str;
                if (LynxHelium.this.mPermissionHandler.verifyHasPermission(strArr)) {
                    responder.onResponse(true);
                } else {
                    LynxHelium.this.mPermissionHandler.requestPermissions(strArr, new OnPermissionListener() {
                        /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.LynxMediaLoaderImpl.C286121 */

                        static {
                            Covode.recordClassIndex(34652);
                        }

                        @Override // com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.OnPermissionListener
                        public void onPermissionDenied() {
                            MediaLoader.Responder responder = responder;
                            if (responder != null) {
                                responder.onResponse(false);
                            }
                        }

                        @Override // com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.OnPermissionListener
                        public void onPermissionGranted() {
                            MediaLoader.Responder responder = responder;
                            if (responder != null) {
                                responder.onResponse(true);
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public void executeRunnableCalledOnJSThread(Runnable runnable) {
        if (this.mInited) {
            runnable.run();
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public void onJSException(String str) {
        onHeliumError(true, str);
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public void onLynxRuntimeDestroy(Long l) {
        removeCanvasByRuntimeId(l, Boolean.FALSE);
    }

    public void setPlayerFactory(IHeliumPlayer.HeliumPlayerFactory heliumPlayerFactory) {
        this.mPlayerFactory = heliumPlayerFactory;
        updatePlayerFactory();
    }

    /* renamed from: com_lynx_tasm_behavior_ui_canvas_LynxHelium_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m57201xb66c7b5b(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public void onLynxCanvasDetach(LynxBaseUI lynxBaseUI) {
        LLog.m56856a(3, "LynxHelium", "onLynxCanvasDetach");
    }

    private static boolean checkGLES30Support(Context context) {
        try {
            if (((ActivityManager) m57200xbdf933fc(context, "activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    @Override // com.lynx.tasm.utils.C28921h.AbstractC28923a
    public void OnVSync(long j) {
        Runnable runnable;
        if (this.mInited && this.mHasCanvasView && (runnable = this.mHeliumOnFrameRunable) != null) {
            nativeCallRunnableInstanceOnJSThread(runnable, 0);
        }
    }

    public void removeAllCanvasRefs(LynxView lynxView) {
        if (lynxView != null && this.mInited) {
            removeCanvasByRuntimeId(lynxView.getLynxContext().mo49043c(), Boolean.TRUE);
        }
    }

    public void useLocalEffectPlatformAndRender(boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            lynxHeliumEffectInfoInterface.setUseLocalEffectPlatformAndRender(z);
        } else {
            LLog.m56856a(5, "LynxHelium", "Error: Please call useLocalEffectPlatformAndRender after LynxHelium init.");
        }
    }

    public boolean validateEffect(boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface == null) {
            return false;
        }
        if (lynxHeliumEffectInfoInterface.validateLibrary(false)) {
            return true;
        }
        if (z) {
            this.mEffect.backendPreloadLibrary();
        }
        return false;
    }

    private ArrayList addCanvasMapWithLynxRuntimeId(Long l) {
        ArrayList arrayList = this.mCanvasMap.get(l);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.mCanvasMap.put(l, arrayList);
        }
        if (!this.mHasCanvasView) {
            this.mHasCanvasView = true;
        }
        C28921h hVar = this.mFrameRateControl;
        if (hVar != null) {
            hVar.mo50117a();
        }
        return arrayList;
    }

    private CanvasViewInfo findCanvasInfo(LynxBaseUI lynxBaseUI) {
        Long runtimeId;
        ArrayList arrayList;
        if (!(lynxBaseUI == null || !(lynxBaseUI instanceof LynxHeliumCanvas) || (runtimeId = ((LynxHeliumCanvas) lynxBaseUI).getRuntimeId()) == null || (arrayList = this.mCanvasMap.get(runtimeId)) == null)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                CanvasViewInfo canvasViewInfo = (CanvasViewInfo) arrayList.get(size);
                if (canvasViewInfo.getCanvas() == lynxBaseUI) {
                    return canvasViewInfo;
                }
            }
        }
        return null;
    }

    private void initHeliumApp(ContextWrapper contextWrapper) {
        int i = Build.VERSION.SDK_INT;
        initHeliumErrorHandler();
        HeliumApp.setLoadSoInHostCallback(new HeliumApp.LoadSoInHostCallback() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.C286075 */

            static {
                Covode.recordClassIndex(34643);
            }

            @Override // com.p2024he.lynx.HeliumApp.LoadSoInHostCallback
            public void loadSoInHost(String str, HeliumApp.LoadSoCallback loadSoCallback) {
                boolean z;
                String str2;
                try {
                    if (str.endsWith(".so") && str.startsWith("lib")) {
                        str = str.substring(3, str.length() - 3);
                    }
                    z = LynxHelium.this.loadNativeLibrary(str);
                    str2 = "";
                } catch (Throwable th) {
                    str2 = th.getMessage();
                    z = false;
                }
                if (loadSoCallback != null) {
                    loadSoCallback.complete(z, str2);
                }
            }
        });
        this.mHeliumapp = new HeliumApp(contextWrapper, this.mLynxDelegate);
        this.mResourceLoader = new TTAppLoader(new LynxHeliumResourceLoader(contextWrapper, null));
        this.mHeliumapp.mediaLoader = new LynxMediaLoaderImpl();
        this.mInited = false;
        initHeliumRunables();
        initForFrameCallback(contextWrapper);
    }

    public void initForFrameCallback(final Context context) {
        if (!C28929m.m57950a()) {
            if (this.mFrameRateControl == null) {
                C28929m.m57947a(new Runnable() {
                    /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.RunnableC286021 */

                    static {
                        Covode.recordClassIndex(34638);
                    }

                    public void run() {
                        LynxHelium.this.initForFrameCallback(context);
                    }
                });
            }
        } else if (this.mFrameRateControl == null) {
            LLog.m56856a(3, "LynxHelium", "initForFrameCallback");
            this.mFrameRateControl = new C28921h(this);
            if (this.mHasCanvasView) {
                LLog.m56856a(3, "LynxHelium", "initForFrameCallback mFrameRateControl.start()");
                this.mFrameRateControl.mo50117a();
            }
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public void onEnsureHeliumLoaded(Long l) {
        MethodCollector.m26663i(212);
        if (l == null) {
            LLog.m56856a(6, "LynxHelium", "registerLynxRuntimeWithId error");
            MethodCollector.m26664o(212);
            return;
        }
        synchronized (this.mCanvasMap) {
            try {
                addCanvasMapWithLynxRuntimeId(l);
            } finally {
                MethodCollector.m26664o(212);
            }
        }
    }

    public void onLynxCanvasAttatch(LynxBaseUI lynxBaseUI) {
        MethodCollector.m26663i(179);
        synchronized (this.mCanvasMap) {
            try {
                CanvasViewInfo findCanvasInfo = findCanvasInfo(lynxBaseUI);
                if (findCanvasInfo != null) {
                    LLog.m56856a(3, "LynxHelium", "onLynxCanvasAttatch");
                    findCanvasInfo.updateView();
                }
            } finally {
                MethodCollector.m26664o(179);
            }
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public boolean autoLoadNativeCanvasProvider(boolean z) {
        if (this.mInited) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        ContextWrapper contextWrapper = this.mContextWrapper;
        if (contextWrapper == null || !checkGLES30Support(contextWrapper)) {
            onHeliumError(true, "Helium do not support, do not support openglES3");
            return false;
        } else if (this.mHeliumapp == null) {
            onHeliumError(true, "LynxHelium init should be run before this function.");
            return false;
        } else if (!loadNativeLibrary("lynx_helium")) {
            onHeliumError(true, "Helium load lynx_helium failed.");
            return false;
        } else {
            Helium.setupEngine();
            if (!nativeInit(z) || this.mHeliumapp.ptr == 0) {
                onHeliumError(true, "Helium setup failed.");
                return false;
            }
            this.mResourceLoader.setup(null);
            LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
            if (lynxHeliumEffectInfoInterface != null) {
                lynxHeliumEffectInfoInterface.updateEffectPathToHelium();
            }
            updatePlayerFactory();
            this.mInited = true;
            return true;
        }
    }

    public boolean loadNativeLibrary(String str) {
        try {
            AbstractC28773f fVar = this.mNativeSoLoader;
            if (fVar != null) {
                fVar.mo33431a(str);
            } else {
                m57201xb66c7b5b(str);
            }
            LLog.m56860b("LynxHelium", "Native Library " + str + " load success");
            return true;
        } catch (UnsatisfiedLinkError e) {
            String str2 = "Native Library " + str + " load with error message " + e.getMessage();
            LLog.m56862d("LynxHelium", str2);
            onHeliumError(true, str2);
            return false;
        }
    }

    public void onLynxCanvasUIInit(LynxBaseUI lynxBaseUI) {
        Long runtimeId;
        MethodCollector.m26663i(155);
        if (!(lynxBaseUI instanceof LynxHeliumCanvas) || (runtimeId = ((LynxHeliumCanvas) lynxBaseUI).getRuntimeId()) == null) {
            LLog.m56856a(6, "LynxHelium", "onLynxCanvasUIInit canvas error");
            MethodCollector.m26664o(155);
            return;
        }
        synchronized (this.mCanvasMap) {
            try {
                addCanvasMapWithLynxRuntimeId(runtimeId).add(new CanvasViewInfo((LynxHeliumCanvas) lynxBaseUI));
                LLog.m56859a("LynxHelium", "onLynxCanvasUIInit " + runtimeId + ", name " + lynxBaseUI.mName);
            } finally {
                MethodCollector.m26664o(155);
            }
        }
    }

    public void removeCanvasFromHeliumOnJSThread(View view) {
        HeliumApp heliumApp;
        if (!(view == null || (heliumApp = this.mHeliumapp) == null)) {
            ArrayList arrayList = null;
            for (Drawable drawable : heliumApp.drawables) {
                if (drawable.view == view) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(drawable);
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.mHeliumapp.removeView((Drawable) it.next());
                }
            }
        }
    }

    public void setEffectLibraryUrlFallback(String str, boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            lynxHeliumEffectInfoInterface.setEffectLibraryUrlFallback(str, z);
        } else {
            LLog.m56856a(5, "LynxHelium", "Error: Please call setEffectLibraryUrlFallback after LynxHelium init.");
        }
    }

    public void setSmashUrlFallback(String str, boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            lynxHeliumEffectInfoInterface.setSmashUrlFallback(str, z);
        } else {
            LLog.m56856a(5, "LynxHelium", "Error: Please call setSmashUrlFallback after LynxHelium init.");
        }
    }

    public void useExternalEffectLibrary(String str, boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            lynxHeliumEffectInfoInterface.setUseExternalEffectLibrary(str, z);
        } else {
            LLog.m56856a(5, "LynxHelium", "Error: Please call useExternalEffectLibrary after LynxHelium init.");
        }
    }

    public void onHeliumError(boolean z, String str) {
        int i;
        if (z) {
            LLog.m56856a(6, "LynxHelium", "!!! on helium fatal error ".concat(String.valueOf(str)));
        } else {
            LLog.m56856a(6, "LynxHelium", "on helium error ".concat(String.valueOf(str)));
        }
        if (this.mErrorHandler != null) {
            if (z) {
                i = 501;
            } else {
                i = 502;
            }
            this.mErrorHandler.onReceivedError(new C28816j(str, i));
        }
    }

    /* renamed from: com_lynx_tasm_behavior_ui_canvas_LynxHelium_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m57200xbdf933fc(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2462);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2462);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    public boolean setupHeliumApp(long j, long[] jArr) {
        boolean z;
        MethodCollector.m26663i(109);
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            z = lynxHeliumEffectInfoInterface.getUseLocalEffectPlatformAndRender();
        } else {
            z = false;
        }
        this.mHeliumapp.ptr = Helium.setupLite(DisplayMetricsHolder.m57911a().density, this.mHeliumapp, j, jArr, this.mContextWrapper.getAssets(), this.mContextWrapper.getCacheDir().getAbsolutePath(), z, z);
        if (this.mHeliumapp.ptr != 0) {
            MethodCollector.m26664o(109);
            return true;
        }
        MethodCollector.m26664o(109);
        return false;
    }

    private void removeCanvasByRuntimeId(Long l, Boolean bool) {
        C28921h hVar;
        MethodCollector.m26663i(222);
        if (l == null) {
            LLog.m56856a(6, "LynxHelium", "onLynxRuntimeDestroy runtimeId error");
            MethodCollector.m26664o(222);
            return;
        }
        LLog.m56856a(3, "LynxHelium", "onLynxRuntimeDestroy ".concat(String.valueOf(l)));
        final ArrayList arrayList = new ArrayList();
        synchronized (this.mCanvasMap) {
            try {
                ArrayList arrayList2 = this.mCanvasMap.get(l);
                boolean z = true;
                if (arrayList2 != null) {
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        LynxHeliumCanvasView view = ((CanvasViewInfo) arrayList2.get(size)).getView();
                        if (view != null) {
                            arrayList.add(view);
                        }
                    }
                    if (!bool.booleanValue()) {
                        this.mCanvasMap.remove(l);
                    }
                }
                if (this.mCanvasMap.isEmpty()) {
                    z = false;
                }
                this.mHasCanvasView = z;
                if (!this.mHasCanvasView && (hVar = this.mFrameRateControl) != null) {
                    hVar.mo50118b();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(222);
                throw th;
            }
        }
        if (!this.mInited || arrayList.isEmpty()) {
            MethodCollector.m26664o(222);
            return;
        }
        nativeRunOnJSThread(new Runnable() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.RunnableC286119 */

            static {
                Covode.recordClassIndex(34647);
            }

            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LynxHelium.this.removeCanvasFromHeliumOnJSThread((View) it.next());
                }
            }
        });
        MethodCollector.m26664o(222);
    }

    public LynxHeliumCanvas findCanvasById(String str, Long l) {
        MethodCollector.m26663i(241);
        synchronized (this.mCanvasMap) {
            try {
                ArrayList arrayList = this.mCanvasMap.get(l);
                if (arrayList != null && !arrayList.isEmpty()) {
                    LynxHeliumCanvas lynxHeliumCanvas = null;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        LynxHeliumCanvas canvas = ((CanvasViewInfo) arrayList.get(size)).getCanvas();
                        if (canvas != null && str.equals(canvas.mName)) {
                            int i = Build.VERSION.SDK_INT;
                            if (canvas.mView == null || !((LynxHeliumCanvasView) canvas.mView).isAttachedToWindow()) {
                                lynxHeliumCanvas = canvas;
                            } else {
                                LLog.m56859a("LynxHelium", "findCanvasById " + str + ", runtime: " + l);
                                return canvas;
                            }
                        }
                    }
                    if (lynxHeliumCanvas != null) {
                        LLog.m56859a("LynxHelium", "findCanvasById " + str + " not showing , runtime: " + l);
                        MethodCollector.m26664o(241);
                        return lynxHeliumCanvas;
                    }
                }
                LLog.m56859a("LynxHelium", "findCanvasById " + str + " result null , runtime: " + l);
                MethodCollector.m26664o(241);
                return null;
            } finally {
                MethodCollector.m26664o(241);
            }
        }
    }

    public void setEffectResourceDownloadInfo(String str, String str2, boolean z) {
        LynxHeliumEffectInfoInterface lynxHeliumEffectInfoInterface = this.mEffect;
        if (lynxHeliumEffectInfoInterface != null) {
            lynxHeliumEffectInfoInterface.setEffectResourceDownloadInfo(str, str2, z);
        } else {
            LLog.m56856a(5, "LynxHelium", "Error: Please call setEffectResourceDownloadInfo after LynxHelium init.");
        }
    }

    private void createCanvasAsyncOnJSThread(final String str, final Long l, final JSProxy jSProxy, final int i) {
        LLog.m56859a("LynxHelium", "createCanvas should wait for surface ready in async thread, runtime:" + l + ", canvasId:" + str);
        new Thread(new Runnable() {
            /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.RunnableC286032 */

            static {
                Covode.recordClassIndex(34639);
            }

            public void run() {
                MethodCollector.m26663i(873);
                TextureView textureView = null;
                int i = 0;
                do {
                    LynxHeliumCanvas findCanvasById = LynxHelium.this.findCanvasById(str, l);
                    if (findCanvasById != null && (textureView = (TextureView) findCanvasById.mView) != null) {
                        int i2 = 0;
                        do {
                            try {
                                Thread.sleep(17);
                                if (textureView.getSurfaceTexture() != null) {
                                    break;
                                }
                                i2++;
                            } catch (InterruptedException unused) {
                            }
                        } while (i2 < 8);
                    }
                    i++;
                } while (i < 20);
                if (textureView == null) {
                    LLog.m56859a("LynxHelium", "createCanvas error timeout, runtime:" + l + ", canvasId:" + str);
                    jSProxy.mo49859a(i, 0);
                    MethodCollector.m26664o(873);
                    return;
                }
                final WeakReference weakReference = new WeakReference(textureView);
                LynxHelium.this.nativeRunOnJSThread(new Runnable() {
                    /* class com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.RunnableC286032.RunnableC286041 */

                    static {
                        Covode.recordClassIndex(34640);
                    }

                    public void run() {
                        long j;
                        Drawable addView;
                        TextureView textureView = (TextureView) weakReference.get();
                        if (textureView == null || (addView = LynxHelium.this.mHeliumapp.addView(textureView)) == null) {
                            j = 0;
                        } else {
                            j = addView.ptr;
                        }
                        LLog.m56859a("LynxHelium", "createCanvas async result " + j + ", runtime:" + l + ", canvasId:" + str);
                        jSProxy.mo49859a(i, j);
                    }
                });
                MethodCollector.m26664o(873);
            }
        }).start();
    }

    public void init(ContextWrapper contextWrapper, AbstractC28773f fVar, ErrorHandler errorHandler, PermissionHandler permissionHandler) {
        if (this.mLynxDelegate == null) {
            this.mLynxDelegate = new LynxDelegateImpl();
        }
        this.mNativeSoLoader = fVar;
        this.mErrorHandler = errorHandler;
        this.mPermissionHandler = permissionHandler;
        this.mContextWrapper = contextWrapper;
        if (this.mEffect == null) {
            this.mEffect = tryToLoadEffectInfoImpl();
        }
        if (this.mHeliumapp == null) {
            initHeliumApp(contextWrapper);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e1, code lost:
        if (r7 != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        return 0;
     */
    @Override // com.lynx.tasm.provider.CanvasProvider
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long createCanvasOnJSThread(java.lang.String r9, java.lang.Long r10, boolean r11, com.lynx.tasm.core.JSProxy r12, int r13) {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.createCanvasOnJSThread(java.lang.String, java.lang.Long, boolean, com.lynx.tasm.core.JSProxy, int):long");
    }
}
