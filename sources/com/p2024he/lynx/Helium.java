package com.p2024he.lynx;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.lynx.tasm.base.LLog;
import com.p2024he.lynx.HeliumApp;
import com.p2024he.lynx.loader.MediaLoader;
import com.p2024he.lynx.player.IHeliumPlayer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* renamed from: com.he.lynx.Helium */
public class Helium {
    private static final int AUDIO = 8;
    private static final int VIDEO = 4;
    public static boolean cameraPermission = true;
    private static double[] euler = new double[4];
    static Sensor gyroscopeSensor;
    static volatile boolean helium_loaded;
    private static SensorEventListener orientationListener = new SensorEventListener() {
        /* class com.p2024he.lynx.Helium.C280541 */

        static {
            Covode.recordClassIndex(33757);
        }

        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            MethodCollector.m26663i(1244);
            if (sensorEvent.sensor.getType() == 15) {
                Helium.sendOrientationData(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2], sensorEvent.values[3], sensorEvent.timestamp);
                MethodCollector.m26664o(1244);
                return;
            }
            if (sensorEvent.sensor.getType() == 4) {
                Helium.sendGyroscopeData(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2], sensorEvent.timestamp);
            }
            MethodCollector.m26664o(1244);
        }
    };
    public static final Set<IHeliumPlayer> players = new CopyOnWriteArraySet();
    static Sensor rotationSensor;
    static SensorManager sensorManager;

    public static native void _screenshot(long j, int i, int i2, ByteBuffer byteBuffer);

    public static native long addView(long j, Surface surface);

    public static native void cleanup(long j);

    public static native void dispatch(long j, ByteBuffer byteBuffer);

    public static native void doFrame(long j);

    public static native void flushRecord(long j, long j2);

    private static String getMiniAppSoPluginDir() {
        return null;
    }

    public static native void onMediaRequest(long j, Object obj, String str);

    public static native void onMediaStatusChange(long j, int i);

    public static native void onPause(long j);

    private static native void onRecordRequest(long j, Object obj);

    public static native void onResume(long j);

    public static native void onSurfaceChanged(long j, long j2, int i, int i2);

    public static native void onSurfaceCreated(long j, long j2, Surface surface);

    public static native void onSurfaceDestroyed(long j, long j2);

    public static native String preloadLiteEffectModules();

    public static native void sendGyroscopeData(float f, float f2, float f3, long j);

    public static native void sendOrientationData(float f, float f2, float f3, float f4, long j);

    public static native void setLiteExternalEffectLibraryPath(String str);

    public static native void setSensitivePermissionStatus(int i, boolean z);

    private static native void setupEngine(int i, int i2);

    public static native long setupLite(float f, HeliumApp heliumApp, long j, long[] jArr, AssetManager assetManager, String str, boolean z, boolean z2);

    public static native long startRecord(long j, long j2, Surface surface, int i, ByteBuffer byteBuffer, int i2, int i3, float f, float f2, float f3, float f4);

    private static void startRecord(HeliumApp heliumApp, BaseCameraContext baseCameraContext, String str, int i, int i2, boolean z) {
    }

    public static native void stopAudioCapture(long j);

    public static native void stopRecord(long j, long j2);

    /* renamed from: com.he.lynx.Helium$HostCameraContext */
    static class HostCameraContext extends BaseCameraContext {
        private final IPlatformCamera hostCamera;
        int pageID;

        static {
            Covode.recordClassIndex(33763);
        }

        private void autoFocus() {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.autoFocus();
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.p2024he.lynx.Helium.VideoContext
        public void release() {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.dispose();
            }
            if (this.texture != null) {
                this.texture.release();
                this.texture = null;
            }
        }

        private void onSurfaceTextureReady(SurfaceTexture surfaceTexture) {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.onSurfaceTextureReady(surfaceTexture);
            }
        }

        @Override // com.p2024he.lynx.HeliumApp.StateCallback
        public void pause(HeliumApp.StateCallback.CallType callType) {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.pause(callType);
            }
        }

        @Override // com.p2024he.lynx.HeliumApp.StateCallback
        public void resume(HeliumApp.StateCallback.CallType callType) {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.resume(callType);
            }
        }

        static HostCameraContext requestHostCameraCtx(int i, HeliumApp.PlatformCameraFactory platformCameraFactory, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i & 96) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            IPlatformCamera createPlatformCamera = platformCameraFactory.createPlatformCamera();
            createPlatformCamera.request(z, z2, z3, 0, i2);
            Size cameraResolution = createPlatformCamera.getCameraResolution();
            return new HostCameraContext(cameraResolution.getWidth(), cameraResolution.getHeight(), createPlatformCamera, i2);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2024he.lynx.Helium.VideoContext
        public void setMediaState(HeliumApp heliumApp, int i, long j) {
            int i2 = i & 15;
            if (i2 == 0) {
                release();
                heliumApp.resumables.remove(this);
            } else if (i2 == 1) {
                int i3 = (i >> 8) & 16777215;
                if (i3 != 0) {
                    this.texture = new SurfaceTexture(i3);
                    onSurfaceTextureReady(this.texture);
                }
                resume(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.add(this);
            } else if (i2 == 2) {
                pause(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.remove(this);
            } else if (i2 == 6) {
                this.texture.updateTexImage();
                this.s_timestamp = this.texture.getTimestamp();
            } else if (i2 == 7) {
                autoFocus();
            }
        }

        HostCameraContext(int i, int i2, IPlatformCamera iPlatformCamera, int i3) {
            super(i, i2);
            this.hostCamera = iPlatformCamera;
            this.pageID = i3;
        }
    }

    private static void stopSensors() {
        sensorManager.unregisterListener(orientationListener);
    }

    public static void setupEngine() {
        MethodCollector.m26663i(2097);
        setupEngine(0, 1);
        MethodCollector.m26664o(2097);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.he.lynx.Helium$PlayerContext */
    public static class PlayerContext extends VideoContext implements IHeliumPlayer.IHeliumPlayerListener {
        final HeliumApp app;
        boolean isComplete;
        boolean loop;
        IHeliumPlayer player;
        Surface surface;
        final Uri uri;
        float volume;

        static {
            Covode.recordClassIndex(33764);
        }

        @Override // com.p2024he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public boolean onError(IHeliumPlayer iHeliumPlayer, Object obj) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public float getCurrentTime() {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer != null && !this.isComplete) {
                return ((float) iHeliumPlayer.getCurrentPosition()) / 1000.0f;
            }
            return 0.0f;
        }

        /* access modifiers changed from: protected */
        @Override // com.p2024he.lynx.Helium.VideoContext
        public void release() {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer != null) {
                iHeliumPlayer.release();
                this.player = null;
            }
            Surface surface2 = this.surface;
            if (surface2 != null) {
                surface2.release();
                this.surface = null;
            }
            if (this.texture != null) {
                this.texture.release();
                this.texture = null;
            }
        }

        @Override // com.p2024he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onPrepared(IHeliumPlayer iHeliumPlayer) {
            try {
                iHeliumPlayer.play();
            } catch (IllegalStateException unused) {
            }
        }

        @Override // com.p2024he.lynx.HeliumApp.StateCallback
        public void pause(HeliumApp.StateCallback.CallType callType) {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer != null) {
                try {
                    iHeliumPlayer.pause();
                } catch (IllegalStateException unused) {
                }
            }
        }

        @Override // com.p2024he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onRenderStart(IHeliumPlayer iHeliumPlayer) {
            MethodCollector.m26663i(2868);
            Helium.onMediaStatusChange(this._ptr, 2);
            MethodCollector.m26664o(2868);
        }

        @Override // com.p2024he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onSeekComplete(IHeliumPlayer iHeliumPlayer) {
            MethodCollector.m26663i(2881);
            Helium.onMediaStatusChange(this._ptr, 3);
            MethodCollector.m26664o(2881);
        }

        @Override // com.p2024he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onCompletion(IHeliumPlayer iHeliumPlayer) {
            MethodCollector.m26663i(2889);
            if (this.loop) {
                try {
                    if (!iHeliumPlayer.isPlaying()) {
                        iHeliumPlayer.play();
                    }
                    iHeliumPlayer.seekTo(0);
                } catch (IllegalStateException unused) {
                }
            } else {
                this.isComplete = true;
            }
            if (this._ptr != 0) {
                Helium.onMediaStatusChange(this._ptr, 1);
            }
            MethodCollector.m26664o(2889);
        }

        @Override // com.p2024he.lynx.HeliumApp.StateCallback
        public void resume(HeliumApp.StateCallback.CallType callType) {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer == null) {
                IHeliumPlayer createPlayer = this.app.createPlayer();
                this.player = createPlayer;
                try {
                    createPlayer.setDataSource(this.uri.toString());
                } catch (Exception unused) {
                }
                this.player.setListener(this);
                this.player.prepare();
                this.player.setSurface(this.surface);
                return;
            }
            iHeliumPlayer.setSurface(this.surface);
            IHeliumPlayer iHeliumPlayer2 = this.player;
            float f = this.volume;
            iHeliumPlayer2.setVolume(f, f);
            if (HeliumApp.StateCallback.CallType.SystemCall != callType || !this.isComplete || this.loop) {
                try {
                    this.player.play();
                } catch (IllegalStateException unused2) {
                }
                this.isComplete = false;
                this.player.setListener(this);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.p2024he.lynx.Helium.VideoContext
        public void setMediaState(HeliumApp heliumApp, int i, long j) {
            int i2 = i & 15;
            boolean z = false;
            if (i2 == 1) {
                int i3 = i >> 8;
                if (i3 != 0) {
                    this.texture = new SurfaceTexture(i3 & 16777215);
                    this.surface = new Surface(this.texture);
                }
                if ((i & 128) != 0) {
                    z = true;
                }
                this.loop = z;
                this.volume = (float) Double.longBitsToDouble(j);
            } else if (i2 == 11) {
                if ((i & 128) != 0) {
                    z = true;
                }
                this.loop = z;
            } else if (i2 == 4) {
                if ((i & 128) != 0) {
                    z = true;
                }
                this.loop = z;
                IHeliumPlayer iHeliumPlayer = this.player;
                if (iHeliumPlayer != null) {
                    try {
                        iHeliumPlayer.seekTo((int) (Double.longBitsToDouble(j) * 1000.0d));
                    } catch (IllegalStateException unused) {
                    }
                }
            } else if (i2 == 5) {
                float longBitsToDouble = (float) Double.longBitsToDouble(j);
                this.volume = longBitsToDouble;
                IHeliumPlayer iHeliumPlayer2 = this.player;
                if (iHeliumPlayer2 != null) {
                    iHeliumPlayer2.setVolume(longBitsToDouble, longBitsToDouble);
                }
            }
            super.setMediaState(heliumApp, i, j);
        }

        PlayerContext(HeliumApp heliumApp, Uri uri2, IHeliumPlayer iHeliumPlayer, int i) {
            super(iHeliumPlayer.getVideoWidth(), iHeliumPlayer.getVideoHeight(), iHeliumPlayer.getDuration(), i);
            this.app = heliumApp;
            this.uri = uri2;
            this.player = iHeliumPlayer;
        }
    }

    static {
        Covode.recordClassIndex(33756);
    }

    /* renamed from: com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
    public static ExecutorService m56160xc0a39202() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        return C40780g.m82242a(a.mo70028a());
    }

    private static float getCurrentTime(PlayerContext playerContext) {
        return playerContext.getCurrentTime();
    }

    /* renamed from: com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m56159xf02ddb09(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    private static String getInstallPath(HeliumApp heliumApp) {
        return heliumApp.context.getApplicationInfo().nativeLibraryDir;
    }

    /* renamed from: com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load */
    public static void m56158xaa5c2152(String str) {
        MethodCollector.m26663i(2016);
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        C58032m.m104852a(uptimeMillis, str);
        MethodCollector.m26664o(2016);
    }

    private static void initSensors(HeliumApp heliumApp) {
        SensorManager sensorManager2 = (SensorManager) m56157x1c92c28e(heliumApp.context, "sensor");
        sensorManager = sensorManager2;
        gyroscopeSensor = sensorManager2.getDefaultSensor(4);
        rotationSensor = sensorManager.getDefaultSensor(15);
    }

    private static void onFatalError(String str) {
        LLog.m56856a(6, "HeliumLynx", "onFatalError ".concat(String.valueOf(str)));
        if (HeliumApp.fatalErrorHandler != null) {
            HeliumApp.fatalErrorHandler.handle(str);
        }
    }

    private static void onUncaughtException(String str) {
        LLog.m56856a(6, "HeliumLynx", "onUncaughtException ".concat(String.valueOf(str)));
        if (HeliumApp.uncaughtExceptionHandler != null) {
            HeliumApp.uncaughtExceptionHandler.handle(str);
        }
    }

    private static long getTimeStamp(BaseCameraContext baseCameraContext) {
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - baseCameraContext.s_timestamp);
        int i = Build.VERSION.SDK_INT;
        long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - baseCameraContext.s_timestamp);
        return nanoTime - Math.min(Math.min(abs, abs2), Math.abs((SystemClock.uptimeMillis() * 1000000) - baseCameraContext.s_timestamp));
    }

    private static boolean startSensors(int i) {
        sensorManager.unregisterListener(orientationListener);
        if (!sensorManager.registerListener(orientationListener, rotationSensor, i) || !sensorManager.registerListener(orientationListener, gyroscopeSensor, i)) {
            return false;
        }
        return true;
    }

    public static int getVideoRoration(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        int i = 0;
        if (str != null) {
            try {
                mediaMetadataRetriever.setDataSource(str, new HashMap());
            } catch (Exception e) {
                LLog.m56856a(6, "HeliumLynx", "getVideoRoration MediaMetadataRetriever exception ".concat(String.valueOf(e)));
                e.printStackTrace();
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
        LLog.m56856a(3, "HeliumLynx", "rotation = ".concat(String.valueOf(i)));
        mediaMetadataRetriever.release();
        return i;
    }

    public static boolean loadHelium(String str) {
        boolean z;
        MethodCollector.m26663i(1956);
        if (helium_loaded) {
            MethodCollector.m26664o(1956);
            return true;
        }
        synchronized (Helium.class) {
            try {
                if (!helium_loaded) {
                    if (str != null) {
                        m56158xaa5c2152(str);
                    } else {
                        m56159xf02ddb09("lynx_helium");
                    }
                    helium_loaded = true;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(1956);
                throw th;
            }
            z = helium_loaded;
        }
        MethodCollector.m26664o(1956);
        return z;
    }

    /* renamed from: com.he.lynx.Helium$BaseCameraContext */
    public static abstract class BaseCameraContext extends VideoContext {
        static {
            Covode.recordClassIndex(33762);
        }

        public boolean startRecord(HeliumApp heliumApp, String str, int i, int i2, boolean z) {
            return false;
        }

        public void stopRecord(long j, BaseCameraContext baseCameraContext) {
        }

        protected BaseCameraContext(int i, int i2) {
            super(i, i2, 0, 0);
        }
    }

    public static void onMediaRequest(long j, Object obj) {
        MethodCollector.m26663i(2196);
        onMediaRequest(j, obj, "");
        MethodCollector.m26664o(2196);
    }

    /* renamed from: com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m56157x1c92c28e(ContextWrapper contextWrapper, String str) {
        Object obj;
        MethodCollector.m26663i(2223);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = contextWrapper.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = contextWrapper.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = contextWrapper.getSystemService(str);
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
                    MethodCollector.m26664o(2223);
                }
            }
        } else {
            obj = contextWrapper.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: com.he.lynx.Helium$VideoContext */
    static abstract class VideoContext implements HeliumApp.StateCallback {
        protected long _ptr;
        protected final int duration;
        protected final int height;
        protected final int rotation;
        protected long s_timestamp;
        protected SurfaceTexture texture;
        protected final int width;

        static {
            Covode.recordClassIndex(33765);
        }

        /* access modifiers changed from: protected */
        public abstract void release();

        /* access modifiers changed from: protected */
        public void setMediaState(HeliumApp heliumApp, int i, long j) {
            int i2 = i & 15;
            if (i2 == 0) {
                release();
                heliumApp.resumables.remove(this);
            } else if (i2 == 1) {
                resume(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.add(this);
            } else if (i2 == 2) {
                pause(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.remove(this);
            } else if (i2 == 6) {
                this.texture.updateTexImage();
                this.s_timestamp = this.texture.getTimestamp();
            }
        }

        protected VideoContext(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.duration = i3;
            this.rotation = i4;
        }
    }

    private static void loadMedia(final HeliumApp heliumApp, String str, final long j) {
        if (heliumApp.mediaLoader != null) {
            final Uri loadMedia = heliumApp.mediaLoader.loadMedia(str);
            if (loadMedia == null) {
                onMediaRequest(j, null);
                return;
            }
            final IHeliumPlayer createPlayer = heliumApp.createPlayer();
            players.add(createPlayer);
            final AnonymousClass1MediaListener r2 = new IHeliumPlayer.IHeliumPlayerListener() {
                /* class com.p2024he.lynx.Helium.AnonymousClass1MediaListener */
                private PlayerContext handle;
                private boolean hasRotation;
                private boolean prepared;
                private int rotation;

                static {
                    Covode.recordClassIndex(33759);
                }

                @Override // com.p2024he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public final void onCompletion(IHeliumPlayer iHeliumPlayer) {
                }

                @Override // com.p2024he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public final void onRenderStart(IHeliumPlayer iHeliumPlayer) {
                }

                @Override // com.p2024he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public final void onSeekComplete(IHeliumPlayer iHeliumPlayer) {
                }

                private void checkPrepared() {
                    if (this.prepared && this.hasRotation) {
                        PlayerContext playerContext = new PlayerContext(heliumApp, loadMedia, createPlayer, this.rotation);
                        this.handle = playerContext;
                        Helium.onMediaRequest(j, playerContext);
                    }
                }

                public final void setRotation(int i) {
                    if (!this.hasRotation) {
                        this.hasRotation = true;
                        this.rotation = i;
                        checkPrepared();
                    }
                }

                @Override // com.p2024he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public final void onPrepared(IHeliumPlayer iHeliumPlayer) {
                    if (!this.prepared) {
                        iHeliumPlayer.setListener(null);
                        Helium.players.remove(iHeliumPlayer);
                        this.prepared = true;
                        checkPrepared();
                    }
                }

                @Override // com.p2024he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public final boolean onError(IHeliumPlayer iHeliumPlayer, Object obj) {
                    iHeliumPlayer.setListener(null);
                    Helium.players.remove(iHeliumPlayer);
                    iHeliumPlayer.release();
                    Helium.onMediaRequest(j, this.handle);
                    return true;
                }
            };
            ExecutorService com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor = m56160xc0a39202();
            com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor.execute(new Runnable() {
                /* class com.p2024he.lynx.Helium.RunnableC280552 */

                static {
                    Covode.recordClassIndex(33760);
                }

                public final void run() {
                    final int videoRoration = Helium.getVideoRoration(loadMedia.toString());
                    heliumApp.dispatchToJSThread(new Runnable() {
                        /* class com.p2024he.lynx.Helium.RunnableC280552.RunnableC280561 */

                        static {
                            Covode.recordClassIndex(33761);
                        }

                        public void run() {
                            r2.setRotation(videoRoration);
                        }
                    });
                }
            });
            com_he_lynx_Helium_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor.shutdown();
            createPlayer.setListener(r2);
            try {
                createPlayer.setDataSource(loadMedia.toString());
            } catch (Exception unused) {
            }
            createPlayer.prepare();
        }
    }

    private static void setMediaState(HeliumApp heliumApp, VideoContext videoContext, int i, long j) {
        videoContext.setMediaState(heliumApp, i, j);
    }

    private static void onMonitor(int i, int i2, int i3, String str) {
        if (i == 1) {
            LLog.m56856a(6, "HeliumLynx", "!!! Aurum init fail: ".concat(String.valueOf(str)));
        } else if (i == 2) {
            LLog.m56856a(6, "HeliumLynx", "!!! Effect load fail: ".concat(String.valueOf(str)));
        }
    }

    private static void requestMedia(final HeliumApp heliumApp, final int i, final int i2, final long j) {
        boolean z;
        boolean z2;
        MediaLoader.FacingMode facingMode;
        if (heliumApp.mediaLoader != null) {
            MediaLoader.RequestParams requestParams = new MediaLoader.RequestParams();
            boolean z3 = false;
            if ((i & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            requestParams.audio = z;
            if ((i & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            requestParams.video = z2;
            if ((i & 400) != 0) {
                z3 = true;
            }
            requestParams.effect = z3;
            if ((i & 1) != 0) {
                facingMode = MediaLoader.FacingMode.ENVIRONMENT;
            } else {
                facingMode = MediaLoader.FacingMode.USER;
            }
            requestParams.facingMode = facingMode;
            heliumApp.mediaLoader.onRequest(requestParams, new MediaLoader.Responder() {
                /* class com.p2024he.lynx.Helium.AnonymousClass1Callback */
                private boolean called;

                static {
                    Covode.recordClassIndex(33758);
                }

                @Override // com.p2024he.lynx.loader.MediaLoader.Responder
                public void onResponse(boolean z) {
                    HeliumApp.StateCallback stateCallback;
                    MethodCollector.m26663i(515);
                    if (this.called) {
                        MethodCollector.m26664o(515);
                        return;
                    }
                    this.called = true;
                    if (!z) {
                        Helium.onMediaRequest(j, null, "no authorization");
                        MethodCollector.m26664o(515);
                    } else if ((i & 4) == 0) {
                        Helium.onMediaRequest(j, heliumApp);
                        MethodCollector.m26664o(515);
                    } else {
                        try {
                            HeliumApp.PlatformCameraFactory platformCameraFactory = heliumApp.getPlatformCameraFactory();
                            if (platformCameraFactory != null) {
                                LLog.m56856a(5, "HeliumLynx", "Use Host Camera with pageID = " + i2);
                                try {
                                    stateCallback = HostCameraContext.requestHostCameraCtx(i, platformCameraFactory, i2);
                                } catch (IllegalStateException e) {
                                    Helium.onMediaRequest(j, null, e.getMessage());
                                    MethodCollector.m26664o(515);
                                    return;
                                }
                            } else {
                                LLog.m56856a(5, "HeliumLynx", "Use Helium Camera");
                                try {
                                    stateCallback = (BaseCameraContext) Class.forName("com.he.lynx.player.HeliumCameraContext").getMethod("requestCamera", Integer.TYPE).invoke(null, Integer.valueOf(i));
                                } catch (Throwable th) {
                                    LLog.m56856a(5, "HeliumLynx", "No Helium Camera " + th.toString());
                                    Helium.onMediaRequest(j, null, th.getMessage());
                                    MethodCollector.m26664o(515);
                                    return;
                                }
                            }
                            if (stateCallback != null) {
                                heliumApp.resumables.add(stateCallback);
                                Helium.onMediaRequest(j, stateCallback);
                                MethodCollector.m26664o(515);
                                return;
                            }
                            Helium.onMediaRequest(j, null, "unknown error");
                            MethodCollector.m26664o(515);
                        } catch (Throwable th2) {
                            LLog.m56856a(5, "HeliumLynx", "No Helium Camera " + th2.toString());
                            Helium.onMediaRequest(j, null, th2.getMessage());
                            MethodCollector.m26664o(515);
                        }
                    }
                }
            });
        }
    }

    private static byte[] encodeBitmap(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        Bitmap.CompressFormat compressFormat;
        MethodCollector.m26663i(2240);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer);
        if (i == 1) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        } else if (i == 2) {
            compressFormat = Bitmap.CompressFormat.WEBP;
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i2 * i3) / 4) + 256);
        if (createBitmap.compress(compressFormat, i4, byteArrayOutputStream)) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            MethodCollector.m26664o(2240);
            return byteArray;
        }
        MethodCollector.m26664o(2240);
        return null;
    }
}
