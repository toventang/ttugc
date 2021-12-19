package com.p2024he.lynx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.utils.C28929m;
import com.p2024he.lynx.loader.MediaLoader;
import com.p2024he.lynx.player.HeliumPlayerImpl;
import com.p2024he.lynx.player.IHeliumPlayer;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.he.lynx.HeliumApp */
public final class HeliumApp {
    static ScriptErrorHandler fatalErrorHandler;
    static LoadSoInHostCallback loadSoInHostCallback;
    static ScriptErrorHandler uncaughtExceptionHandler;
    public ContextWrapper context;
    private final Delegate delegate = new Delegate();
    public final List<Drawable> drawables = new ArrayList(1);
    public WeakReference<LynxDelegate> lynxDelegate = null;
    private PlatformCameraFactory mPlatformCameraFactory;
    public MediaLoader mediaLoader = new MediaLoader() {
        /* class com.p2024he.lynx.HeliumApp.C280582 */

        static {
            Covode.recordClassIndex(33768);
        }

        @Override // com.p2024he.lynx.loader.MediaLoader
        public Uri loadMedia(String str) {
            return Uri.parse(str);
        }

        @Override // com.p2024he.lynx.loader.MediaLoader
        public void onRequest(MediaLoader.RequestParams requestParams, MediaLoader.Responder responder) {
            if (responder != null) {
                responder.onResponse(true);
            }
        }
    };
    private IHeliumPlayer.HeliumPlayerFactory playerFactory = new IHeliumPlayer.HeliumPlayerFactory() {
        /* class com.p2024he.lynx.HeliumApp.C280571 */

        static {
            Covode.recordClassIndex(33767);
        }

        @Override // com.p2024he.lynx.player.IHeliumPlayer.HeliumPlayerFactory
        public IHeliumPlayer create() {
            return new HeliumPlayerImpl();
        }
    };
    public long ptr;
    public Set<StateCallback> resumables = new CopyOnWriteArraySet();
    private BroadcastReceiver screenReceiver;

    /* renamed from: com.he.lynx.HeliumApp$EffectResourceDownloadInfo */
    public static class EffectResourceDownloadInfo {
        public String appId;
        public String hostUrl;

        static {
            Covode.recordClassIndex(33775);
        }
    }

    /* renamed from: com.he.lynx.HeliumApp$LoadSoCallback */
    public interface LoadSoCallback {
        static {
            Covode.recordClassIndex(33776);
        }

        void complete(boolean z, String str);
    }

    /* renamed from: com.he.lynx.HeliumApp$LoadSoInHostCallback */
    public interface LoadSoInHostCallback {
        static {
            Covode.recordClassIndex(33777);
        }

        void loadSoInHost(String str, LoadSoCallback loadSoCallback);
    }

    /* renamed from: com.he.lynx.HeliumApp$LynxDelegate */
    public interface LynxDelegate {
        static {
            Covode.recordClassIndex(33778);
        }

        EffectResourceDownloadInfo effectResourceDownloadInfo();

        void runOnJsThread(Runnable runnable);
    }

    /* renamed from: com.he.lynx.HeliumApp$PlatformCameraFactory */
    public interface PlatformCameraFactory {
        static {
            Covode.recordClassIndex(33779);
        }

        IPlatformCamera createPlatformCamera();
    }

    /* renamed from: com.he.lynx.HeliumApp$ScriptErrorHandler */
    public interface ScriptErrorHandler {
        static {
            Covode.recordClassIndex(33780);
        }

        void handle(String str);
    }

    static {
        Covode.recordClassIndex(33766);
    }

    public final PlatformCameraFactory getPlatformCameraFactory() {
        return this.mPlatformCameraFactory;
    }

    public final IHeliumPlayer createPlayer() {
        return this.playerFactory.create();
    }

    public final EffectResourceDownloadInfo effectResourceDownloadInfo() {
        LynxDelegate lynxDelegate2 = this.lynxDelegate.get();
        if (lynxDelegate2 != null) {
            return lynxDelegate2.effectResourceDownloadInfo();
        }
        LLog.m56856a(6, "HeliumApp", "effectResourceDownloadUrl delegate error ");
        return null;
    }

    /* renamed from: com.he.lynx.HeliumApp$StateCallback */
    public interface StateCallback {
        static {
            Covode.recordClassIndex(33781);
        }

        void pause(CallType callType);

        void resume(CallType callType);

        /* renamed from: com.he.lynx.HeliumApp$StateCallback$CallType */
        public enum CallType {
            SystemCall,
            JSBridge;

            static {
                Covode.recordClassIndex(33782);
            }
        }
    }

    public static boolean loadEffectInHost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        LoadSoInHostCallback loadSoInHostCallback2 = loadSoInHostCallback;
        if (loadSoInHostCallback2 != null) {
            loadSoInHostCallback2.loadSoInHost("libeffect.so", new LoadSoCallback() {
                /* class com.p2024he.lynx.HeliumApp.C280593 */

                static {
                    Covode.recordClassIndex(33769);
                }

                @Override // com.p2024he.lynx.HeliumApp.LoadSoCallback
                public final void complete(boolean z, String str) {
                    zArr[0] = z;
                    if (!z) {
                        LLog.m56856a(6, "HeliumApp", "loadEffectInHost failed with msg : ".concat(String.valueOf(str)));
                    }
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                LLog.m56856a(6, "HeliumApp", e.getMessage());
            }
        }
        return zArr[0];
    }

    public final void cleanup() {
        MethodCollector.m26663i(1592);
        this.delegate.destroyed = true;
        BroadcastReceiver broadcastReceiver = this.screenReceiver;
        if (broadcastReceiver != null) {
            this.context.unregisterReceiver(broadcastReceiver);
            this.screenReceiver = null;
        }
        this.context = null;
        for (Drawable drawable : this.drawables) {
            if (drawable.view != null) {
                drawable.view.setOnTouchListener(null);
            }
            drawable.holder.removeCallback(this.delegate);
        }
        this.drawables.clear();
        this.resumables.clear();
        synchronized (this.delegate) {
            try {
                long j = this.ptr;
                if (j != 0) {
                    Helium.cleanup(j);
                    this.ptr = 0;
                }
            } finally {
                MethodCollector.m26664o(1592);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r2 = r4.resumables.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r2.hasNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r2.next().pause(com.p2024he.lynx.HeliumApp.StateCallback.CallType.SystemCall);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1673);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void pause() {
        /*
            r4 = this;
            r3 = 1673(0x689, float:2.344E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L_0x000f
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x000f:
            com.he.lynx.HeliumApp$Delegate r2 = r4.delegate
            monitor-enter(r2)
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate     // Catch:{ all -> 0x004a }
            boolean r0 = r0.destroyed     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x001e
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate     // Catch:{ all -> 0x004a }
            boolean r0 = r0.paused     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0023
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0023:
            com.he.lynx.HeliumApp$Delegate r1 = r4.delegate
            r0 = 1
            r1.paused = r0
            long r0 = r4.ptr
            com.p2024he.lynx.Helium.onPause(r0)
            monitor-exit(r2)
            java.util.Set<com.he.lynx.HeliumApp$StateCallback> r0 = r4.resumables
            java.util.Iterator r2 = r0.iterator()
        L_0x0034:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r2.next()
            com.he.lynx.HeliumApp$StateCallback r1 = (com.p2024he.lynx.HeliumApp.StateCallback) r1
            com.he.lynx.HeliumApp$StateCallback$CallType r0 = com.p2024he.lynx.HeliumApp.StateCallback.CallType.SystemCall
            r1.pause(r0)
            goto L_0x0034
        L_0x0046:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2024he.lynx.HeliumApp.pause():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r2 = r4.resumables.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r2.hasNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r2.next().resume(com.p2024he.lynx.HeliumApp.StateCallback.CallType.SystemCall);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1683);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resume() {
        /*
            r4 = this;
            r3 = 1683(0x693, float:2.358E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L_0x000f
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x000f:
            com.he.lynx.HeliumApp$Delegate r2 = r4.delegate
            monitor-enter(r2)
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate     // Catch:{ all -> 0x004a }
            boolean r0 = r0.destroyed     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x001e
            com.he.lynx.HeliumApp$Delegate r0 = r4.delegate     // Catch:{ all -> 0x004a }
            boolean r0 = r0.paused     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0023
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0023:
            com.he.lynx.HeliumApp$Delegate r1 = r4.delegate
            r0 = 0
            r1.paused = r0
            long r0 = r4.ptr
            com.p2024he.lynx.Helium.onResume(r0)
            monitor-exit(r2)
            java.util.Set<com.he.lynx.HeliumApp$StateCallback> r0 = r4.resumables
            java.util.Iterator r2 = r0.iterator()
        L_0x0034:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r2.next()
            com.he.lynx.HeliumApp$StateCallback r1 = (com.p2024he.lynx.HeliumApp.StateCallback) r1
            com.he.lynx.HeliumApp$StateCallback$CallType r0 = com.p2024he.lynx.HeliumApp.StateCallback.CallType.SystemCall
            r1.resume(r0)
            goto L_0x0034
        L_0x0046:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2024he.lynx.HeliumApp.resume():void");
    }

    public static void setFatalErrorHandler(ScriptErrorHandler scriptErrorHandler) {
        fatalErrorHandler = scriptErrorHandler;
    }

    public static void setLoadSoInHostCallback(LoadSoInHostCallback loadSoInHostCallback2) {
        loadSoInHostCallback = loadSoInHostCallback2;
    }

    public static void setUncaughtExceptionHandler(ScriptErrorHandler scriptErrorHandler) {
        uncaughtExceptionHandler = scriptErrorHandler;
    }

    public final void setHeliumPlayerFactory(IHeliumPlayer.HeliumPlayerFactory heliumPlayerFactory) {
        this.playerFactory = heliumPlayerFactory;
    }

    public final void setPlatformCameraFactory(PlatformCameraFactory platformCameraFactory) {
        this.mPlatformCameraFactory = platformCameraFactory;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.he.lynx.HeliumApp$Delegate */
    public class Delegate implements SurfaceHolder.Callback, View.OnTouchListener {
        public boolean destroyed;
        public boolean paused;

        static {
            Covode.recordClassIndex(33774);
        }

        Delegate() {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            MethodCollector.m26663i(302);
            long findSurface = findSurface(surfaceHolder);
            if (findSurface != 0) {
                Helium.onSurfaceCreated(HeliumApp.this.ptr, findSurface, surfaceHolder.getSurface());
            }
            MethodCollector.m26664o(302);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            MethodCollector.m26663i(307);
            long findSurface = findSurface(surfaceHolder);
            if (findSurface != 0) {
                Helium.onSurfaceDestroyed(HeliumApp.this.ptr, findSurface);
            }
            MethodCollector.m26664o(307);
        }

        private long findSurface(SurfaceHolder surfaceHolder) {
            for (int i = 0; i < HeliumApp.this.drawables.size(); i++) {
                Drawable drawable = HeliumApp.this.drawables.get(i);
                if (drawable.holder == surfaceHolder) {
                    return drawable.ptr;
                }
            }
            return 0;
        }

        public final void doFrame(long j) {
            MethodCollector.m26663i(311);
            if (this.destroyed || this.paused) {
                MethodCollector.m26664o(311);
                return;
            }
            if (HeliumApp.this.ptr != 0) {
                Helium.doFrame(HeliumApp.this.ptr);
            }
            MethodCollector.m26664o(311);
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            for (int i = 0; i < HeliumApp.this.drawables.size(); i++) {
                Drawable drawable = HeliumApp.this.drawables.get(i);
                if (drawable.view == view) {
                    HeliumApp.this.dispatch(drawable, motionEvent);
                }
            }
            return true;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            MethodCollector.m26663i(304);
            long findSurface = findSurface(surfaceHolder);
            if (findSurface != 0) {
                Helium.onSurfaceChanged(HeliumApp.this.ptr, findSurface, i2, i3);
            }
            MethodCollector.m26664o(304);
        }
    }

    public final void doFrame(long j) {
        this.delegate.doFrame(j);
    }

    public final Drawable addView(SurfaceView surfaceView) {
        return addView(surfaceView, surfaceView.getHolder());
    }

    private Surface getSurface(SurfaceHolder surfaceHolder) {
        MethodCollector.m26663i(1412);
        Surface surface = surfaceHolder.getSurface();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(17);
            } catch (InterruptedException unused) {
            }
            surface = surfaceHolder.getSurface();
        }
        MethodCollector.m26664o(1412);
        return surface;
    }

    public final void dispatchToJSThread(Runnable runnable) {
        LynxDelegate lynxDelegate2;
        if (runnable != null && (lynxDelegate2 = this.lynxDelegate.get()) != null) {
            lynxDelegate2.runOnJsThread(runnable);
        }
    }

    public final Drawable addView(TextureView textureView) {
        if (Build.VERSION.SDK_INT >= 24 && this.screenReceiver == null) {
            this.screenReceiver = new BroadcastReceiver() {
                /* class com.p2024he.lynx.HeliumApp.C280604 */

                static {
                    Covode.recordClassIndex(33770);
                }

                public void onReceive(Context context, Intent intent) {
                    HeliumApp.this.dispatchToJSThread(new Runnable() {
                        /* class com.p2024he.lynx.HeliumApp.C280604.RunnableC280611 */

                        static {
                            Covode.recordClassIndex(33771);
                        }

                        public void run() {
                            for (Drawable drawable : HeliumApp.this.drawables) {
                                final View view = drawable.view;
                                C28929m.m57947a(new Runnable() {
                                    /* class com.p2024he.lynx.HeliumApp.C280604.RunnableC280611.RunnableC280621 */

                                    static {
                                        Covode.recordClassIndex(33772);
                                    }

                                    public void run() {
                                        View view = view;
                                        if (view != null && (view instanceof TextureView) && view.getVisibility() == 0) {
                                            view.setVisibility(4);
                                            view.setVisibility(0);
                                            view.invalidate();
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            m56162x34e5cc39(this.context, this.screenReceiver, intentFilter);
        }
        return addView(textureView, new TextureViewHolder(textureView));
    }

    public final void removeView(Drawable drawable) {
        MethodCollector.m26663i(1441);
        this.drawables.remove(drawable);
        if (drawable.view instanceof TextureView) {
            Helium.onSurfaceDestroyed(this.ptr, drawable.ptr);
        }
        if (drawable.holder != null) {
            drawable.holder.removeCallback(this.delegate);
        }
        if (drawable.view != null) {
            drawable.view.setOnTouchListener(null);
        }
        MethodCollector.m26664o(1441);
    }

    public final Drawable addSurfaceHolder(SurfaceHolder surfaceHolder) {
        MethodCollector.m26663i(1417);
        if (surfaceHolder == null) {
            MethodCollector.m26664o(1417);
            return null;
        }
        Surface surface = getSurface(surfaceHolder);
        if (surface != null) {
            long j = this.ptr;
            if (j != 0) {
                long addView = Helium.addView(j, surface);
                if (addView != 0) {
                    Drawable createDrawable = createDrawable(addView, null, surfaceHolder);
                    MethodCollector.m26664o(1417);
                    return createDrawable;
                }
                RuntimeException runtimeException = new RuntimeException("failed to create EGLSurface");
                MethodCollector.m26664o(1417);
                throw runtimeException;
            }
            RuntimeException runtimeException2 = new RuntimeException("heliumAppPtr is null");
            MethodCollector.m26664o(1417);
            throw runtimeException2;
        }
        RuntimeException runtimeException3 = new RuntimeException("surface is null");
        MethodCollector.m26664o(1417);
        throw runtimeException3;
    }

    public HeliumApp(ContextWrapper contextWrapper, LynxDelegate lynxDelegate2) {
        this.context = contextWrapper;
        this.lynxDelegate = new WeakReference<>(lynxDelegate2);
    }

    public static boolean setHostSensitivePermissionStatus(String str, boolean z) {
        MethodCollector.m26663i(1394);
        if (str != null) {
            if (str.equals("camera")) {
                Helium.setSensitivePermissionStatus(0, z);
                Helium.cameraPermission = z;
                MethodCollector.m26664o(1394);
                return true;
            } else if (str.equals("record")) {
                Helium.setSensitivePermissionStatus(1, z);
                MethodCollector.m26664o(1394);
                return true;
            }
        }
        MethodCollector.m26664o(1394);
        return false;
    }

    private Drawable addView(View view, SurfaceHolder surfaceHolder) {
        MethodCollector.m26663i(1427);
        Surface surface = getSurface(surfaceHolder);
        if (surface != null) {
            long j = this.ptr;
            if (j != 0) {
                long addView = Helium.addView(j, surface);
                if (addView != 0) {
                    Drawable createDrawable = createDrawable(addView, view, surfaceHolder);
                    MethodCollector.m26664o(1427);
                    return createDrawable;
                }
                RuntimeException runtimeException = new RuntimeException("failed to create EGLSurface");
                MethodCollector.m26664o(1427);
                throw runtimeException;
            }
            RuntimeException runtimeException2 = new RuntimeException("heliumAppPtr is null");
            MethodCollector.m26664o(1427);
            throw runtimeException2;
        }
        RuntimeException runtimeException3 = new RuntimeException("surface is null");
        MethodCollector.m26664o(1427);
        throw runtimeException3;
    }

    public final void dispatch(Drawable drawable, MotionEvent motionEvent) {
        LynxDelegate lynxDelegate2 = this.lynxDelegate.get();
        if (lynxDelegate2 != null) {
            int actionIndex = motionEvent.getActionIndex();
            int i = 5;
            if (actionIndex < 5) {
                int pointerCount = motionEvent.getPointerCount();
                if (pointerCount <= 5) {
                    i = pointerCount;
                }
                final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(112);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                allocateDirect.clear();
                allocateDirect.put((byte) 1).put((byte) motionEvent.getActionMasked()).put((byte) i).put((byte) actionIndex);
                float rawX = motionEvent.getRawX() - motionEvent.getX();
                float rawY = motionEvent.getRawY() - motionEvent.getY();
                for (int i2 = 0; i2 < i; i2++) {
                    allocateDirect.putInt(motionEvent.getPointerId(i2)).putFloat(motionEvent.getX(i2)).putFloat(motionEvent.getY(i2)).putFloat(motionEvent.getX(i2) + rawX).putFloat(motionEvent.getY(i2) + rawY);
                }
                allocateDirect.putLong(104, drawable.ptr);
                lynxDelegate2.runOnJsThread(new Runnable() {
                    /* class com.p2024he.lynx.HeliumApp.RunnableC280635 */

                    static {
                        Covode.recordClassIndex(33773);
                    }

                    public void run() {
                        MethodCollector.m26663i(933);
                        Helium.dispatch(HeliumApp.this.ptr, allocateDirect);
                        MethodCollector.m26664o(933);
                    }
                });
            }
        }
    }

    /* renamed from: com_he_lynx_HeliumApp_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m56161x6b17ee95(ContextWrapper contextWrapper, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return contextWrapper.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    private Drawable createDrawable(long j, View view, SurfaceHolder surfaceHolder) {
        Drawable drawable = new Drawable(j, view, surfaceHolder);
        this.drawables.add(drawable);
        if (view != null) {
            view.setOnTouchListener(this.delegate);
        }
        surfaceHolder.addCallback(this.delegate);
        return drawable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: com_he_lynx_HeliumApp_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m56162x34e5cc39(android.content.ContextWrapper r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m56161x6b17ee95(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2024he.lynx.HeliumApp.m56162x34e5cc39(android.content.ContextWrapper, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
