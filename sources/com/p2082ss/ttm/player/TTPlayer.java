package com.p2082ss.ttm.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.ttm.player.AbstractC86253m;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.ttm.player.TTPlayer */
public class TTPlayer {

    /* renamed from: a */
    public static final String f192557a = TTPlayer.class.getSimpleName();

    /* renamed from: h */
    static String f192558h;

    /* renamed from: j */
    private static int f192559j;

    /* renamed from: k */
    private static int[] f192560k;

    /* renamed from: l */
    private static String f192561l;

    /* renamed from: m */
    private static boolean f192562m = false;

    /* renamed from: o */
    private static boolean f192563o = false;

    /* renamed from: p */
    private static AbstractC86247g f192564p = new C86232a();

    /* renamed from: b */
    public long f192565b;

    /* renamed from: c */
    long f192566c = Long.MAX_VALUE;

    /* renamed from: d */
    public AbstractC86248h f192567d;

    /* renamed from: e */
    public AbstractC86246f f192568e;

    /* renamed from: f */
    public AbstractC86253m.AbstractC86261h f192569f;

    /* renamed from: g */
    public Context f192570g;

    /* renamed from: i */
    private long f192571i;
    private long mMediaDataSource;

    /* renamed from: n */
    private int f192572n;

    private static final native void _close(long j);

    private final native long _create(Context context, int i, String str);

    private static final native String _getAppPath();

    private static final native int _getCurrentPosition(long j);

    private static final native double _getDoubleValue(long j, int i, double d);

    private static final native int _getDuration(long j);

    static final native float _getFloatValue(long j, int i, float f);

    private static final native int _getIntValue(long j, int i, int i2);

    static final native Object _getJObjectValue(long j, int i);

    static final native long _getLongValue(long j, int i, long j2);

    static final native String _getStringValue(long j, int i);

    private static final native int _getVideoHeight(long j);

    private static final native int _getVideoWidth(long j);

    private static final native int _isLooping(long j);

    private static final native int _isPlaying(long j);

    private static final native void _mouseEvent(long j, int i, int i2, int i3);

    static final native int _pause(long j);

    static final native int _prepare(long j);

    private static final native void _prevClose(long j);

    private static final native void _registerPlayerInfo();

    static final native void _release(long j);

    static final native int _reset(long j);

    private static final native void _rotateCamera(long j, float f, float f2);

    static final native int _seek(long j, int i);

    static final native void _setAudioProcessor(long j, AudioProcessor audioProcessor);

    static final native void _setCacheFile(long j, String str, int i);

    static final native void _setDataSource(long j, IMediaDataSource iMediaDataSource);

    static final native void _setDataSource(long j, String str);

    static final native void _setDataSourceFd(long j, int i);

    private static final native int _setDoubleValue(long j, int i, double d);

    static final native int _setFloatValue(long j, int i, float f);

    static final native int _setIntValue(long j, int i, int i2);

    static final native void _setLoadControl(long j, LoadControl loadControl);

    static final native int _setLongValue(long j, int i, long j2);

    static final native void _setLooping(long j, int i);

    static final native void _setMaskInfo(long j, MaskInfo maskInfo);

    private static final native void _setMediaTransport(long j, MediaTransport mediaTransport);

    static final native int _setStringValue(long j, int i, String str);

    static final native void _setSubInfo(long j, SubInfo subInfo);

    private static final native void _setSupportFormatNB(int i);

    static final native void _setSupprotSampleRates(int[] iArr, int i);

    private static final native int _setSurfaceValue(long j, long j2);

    static final native int _setVideoSurface(long j, Surface surface);

    static final native void _setVolume(long j, float f, float f2);

    static final native int _start(long j);

    static final native void _stop(long j);

    static final native void _switchStream(long j, int i, int i2);

    private static final native void _takeScreenshot(long j);

    public void frameDTSNotify(int i, long j, long j2) {
    }

    public void receiveBinarySei(ByteBuffer byteBuffer) {
    }

    public final void takeScreenshotComplete(Bitmap bitmap) {
    }

    public void updateFrameTerminatedDTS(int i, long j, long j2) {
    }

    public static final String getCrashPath() {
        return f192561l;
    }

    public static boolean isIPPlayer() {
        return f192562m;
    }

    public static int getThreadPoolStackSize() {
        return C86277r.m148503a(25, 32);
    }

    public static int isUsedThreadPool() {
        if (C86277r.m148508a(24)) {
            return 1;
        }
        return 0;
    }

    static {
        int i;
        MethodCollector.m26663i(4935);
        Covode.recordClassIndex(101405);
        f192559j = 0;
        synchronized (TTPlayer.class) {
            try {
                C86282t.m148514a();
                try {
                    if (f192559j == 0) {
                        int[] iArr = new int[AudioFormats.f192521a.length];
                        f192560k = iArr;
                        int length = AudioFormats.f192521a.length;
                        if (Build.VERSION.SDK_INT >= 23) {
                            i = length - 3;
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            i = length - 5;
                        } else {
                            i = length - 9;
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            iArr[i2] = AudioFormats.f192521a[i2];
                        }
                        f192559j = i;
                        _setSupprotSampleRates(f192560k, i);
                    }
                } catch (UnsatisfiedLinkError e) {
                    String str = C86282t.f192731b;
                    if (str != null) {
                        UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(str);
                        MethodCollector.m26664o(4935);
                        throw unsatisfiedLinkError;
                    }
                    MethodCollector.m26664o(4935);
                    throw e;
                }
            } finally {
                MethodCollector.m26664o(4935);
            }
        }
    }

    /* renamed from: com.ss.ttm.player.TTPlayer$a */
    static class C86232a implements AbstractC86247g {

        /* renamed from: a */
        boolean f192573a = true;

        static {
            Covode.recordClassIndex(101406);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86247g
        /* renamed from: a */
        public final boolean mo136716a(List<String> list) {
            MethodCollector.m26663i(4964);
            for (String str : list) {
                try {
                    if (this.f192573a) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        System.load(str);
                        C58032m.m104852a(uptimeMillis, str);
                    } else {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        Librarian.m38962a(str);
                        C58032m.m104852a(uptimeMillis2, str);
                    }
                } catch (Throwable th) {
                    th.getMessage();
                    MethodCollector.m26664o(4964);
                    return false;
                }
            }
            MethodCollector.m26664o(4964);
            return true;
        }
    }

    public TTPlayer(Context context, long j) {
        MethodCollector.m26663i(4726);
        this.f192570g = context;
        this.f192567d = null;
        boolean z = f192562m;
        long _create = _create(context, z ? 1 : 0, f192558h);
        this.f192565b = _create;
        this.f192571i = j;
        if (_create != 0) {
            MethodCollector.m26664o(4726);
            return;
        }
        Exception exc = new Exception("create native player is fail.");
        MethodCollector.m26664o(4726);
        throw exc;
    }

    /* renamed from: a */
    public final int mo136708a(int i, int i2) {
        MethodCollector.m26663i(4731);
        if (i == 11) {
            int _getIntValue = _getIntValue(this.f192565b, i, i2);
            MethodCollector.m26664o(4731);
            return _getIntValue;
        } else if (i != 51) {
            switch (i) {
                case 1:
                    int _getDuration = _getDuration(this.f192565b);
                    MethodCollector.m26664o(4731);
                    return _getDuration;
                case 2:
                    int _getCurrentPosition = _getCurrentPosition(this.f192565b);
                    MethodCollector.m26664o(4731);
                    return _getCurrentPosition;
                case 3:
                    int _getVideoWidth = _getVideoWidth(this.f192565b);
                    MethodCollector.m26664o(4731);
                    return _getVideoWidth;
                case 4:
                    int _getVideoHeight = _getVideoHeight(this.f192565b);
                    MethodCollector.m26664o(4731);
                    return _getVideoHeight;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    int _isLooping = _isLooping(this.f192565b);
                    MethodCollector.m26664o(4731);
                    return _isLooping;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    int _isPlaying = _isPlaying(this.f192565b);
                    MethodCollector.m26664o(4731);
                    return _isPlaying;
                default:
                    int _getIntValue2 = _getIntValue(this.f192565b, i, i2);
                    MethodCollector.m26664o(4731);
                    return _getIntValue2;
            }
        } else {
            int i3 = this.f192572n;
            MethodCollector.m26664o(4731);
            return i3;
        }
    }

    public final void onLogInfo(int i, int i2, String str) {
        AbstractC86248h hVar = this.f192567d;
        if (hVar != null) {
            try {
                hVar.mo136806a(i, i2, str);
            } catch (Throwable unused) {
            }
        }
    }

    public void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map) {
        try {
            AbstractC86246f fVar = this.f192568e;
            if (fVar != null) {
                fVar.mo136804a(j, j2, map);
            }
        } catch (Throwable unused) {
        }
    }

    public void onNotify(int i, int i2, int i3, String str) {
        if (((this.f192566c >> i2) & 1) == 1) {
            try {
                AbstractC86248h hVar = this.f192567d;
                if (hVar != null) {
                    hVar.mo136805a(i, i2, i3, str);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
