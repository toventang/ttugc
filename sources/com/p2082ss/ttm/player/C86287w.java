package com.p2082ss.ttm.player;

import android.content.Context;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.view.Surface;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Locale;

/* renamed from: com.ss.ttm.player.w */
public class C86287w extends AbstractC86251k implements AbstractC86248h {

    /* renamed from: a */
    private static final String f192745a = C86287w.class.getSimpleName();

    /* renamed from: d */
    private static String f192746d = null;

    /* renamed from: e */
    private static String f192747e = null;

    /* renamed from: b */
    private long f192748b = System.currentTimeMillis();

    /* renamed from: c */
    private TTPlayer f192749c;

    /* renamed from: f */
    private TTPlayerClient f192750f;

    /* renamed from: g */
    private Context f192751g;

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: h */
    public final Context mo136839h() {
        return this.f192751g;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136823a(String str) {
        MethodCollector.m26663i(6203);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._setDataSource(tTPlayer.f192565b, str);
        }
        MethodCollector.m26664o(6203);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136818a(IMediaDataSource iMediaDataSource) {
        MethodCollector.m26663i(6363);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._setDataSource(tTPlayer.f192565b, iMediaDataSource);
        }
        MethodCollector.m26664o(6363);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136816a(Surface surface) {
        MethodCollector.m26663i(6797);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._setVideoSurface(tTPlayer.f192565b, surface);
        }
        MethodCollector.m26664o(6797);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136815a(long j) {
        MethodCollector.m26663i(6947);
        TTPlayer tTPlayer = this.f192749c;
        tTPlayer.f192566c = j;
        TTPlayer._setIntValue(tTPlayer.f192565b, 16, (int) j);
        TTPlayer._setLongValue(tTPlayer.f192565b, 16, j);
        MethodCollector.m26664o(6947);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136824a(String str, int i) {
        MethodCollector.m26663i(7243);
        TTPlayer._setCacheFile(this.f192749c.f192565b, str, 1);
        MethodCollector.m26664o(7243);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86248h
    /* renamed from: a */
    public final void mo136806a(int i, int i2, String str) {
        TTPlayerClient tTPlayerClient = this.f192750f;
        if (i != 2) {
            if (i == 0) {
                tTPlayerClient.f192594e = i2;
            }
            if (str != null) {
                if (tTPlayerClient.f192591b.size() > 40) {
                    tTPlayerClient.f192591b.removeFirst();
                }
                tTPlayerClient.f192591b.addLast(C1764a.m5929a(Locale.US, "%s&&time:%d", new Object[]{str, Long.valueOf(System.currentTimeMillis())}));
            }
        } else if (i2 == 1) {
            tTPlayerClient.f192597h = str;
        } else if (i2 == 0) {
            tTPlayerClient.f192596g = str;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136819a(LoadControl loadControl) {
        MethodCollector.m26663i(7861);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._setLoadControl(tTPlayer.f192565b, loadControl);
        }
        MethodCollector.m26664o(7861);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136820a(MaskInfo maskInfo) {
        MethodCollector.m26663i(7862);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._setMaskInfo(tTPlayer.f192565b, maskInfo);
        }
        MethodCollector.m26664o(7862);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136821a(SubInfo subInfo) {
        MethodCollector.m26663i(7863);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._setSubInfo(tTPlayer.f192565b, subInfo);
        }
        MethodCollector.m26664o(7863);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136822a(AbstractC86246f fVar) {
        this.f192749c.f192568e = fVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136817a(AudioProcessor audioProcessor) {
        MethodCollector.m26663i(8005);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._setAudioProcessor(tTPlayer.f192565b, audioProcessor);
        }
        MethodCollector.m26664o(8005);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: i */
    public final boolean mo136840i() {
        if (this.f192749c == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: j */
    public final int mo136841j() {
        return this.f192749c.mo136708a(35, -1);
    }

    static {
        Covode.recordClassIndex(101464);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: c */
    public final void mo136830c() {
        MethodCollector.m26663i(5762);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._start(tTPlayer.f192565b);
        }
        MethodCollector.m26664o(5762);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: f */
    public final void mo136837f() {
        MethodCollector.m26663i(6047);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._stop(tTPlayer.f192565b);
        }
        MethodCollector.m26664o(6047);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: g */
    public final void mo136838g() {
        MethodCollector.m26663i(6048);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._prepare(tTPlayer.f192565b);
        }
        MethodCollector.m26664o(6048);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: d */
    public final void mo136834d() {
        MethodCollector.m26663i(5902);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._pause(tTPlayer.f192565b);
        }
        MethodCollector.m26664o(5902);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: e */
    public final void mo136836e() {
        MethodCollector.m26663i(5903);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._reset(tTPlayer.f192565b);
        }
        MethodCollector.m26664o(5903);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: b */
    public final void mo136828b() {
        MethodCollector.m26663i(5630);
        TTPlayer tTPlayer = this.f192749c;
        this.f192749c = null;
        tTPlayer.f192566c = 0;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._release(tTPlayer.f192565b);
            tTPlayer.f192565b = 0;
        }
        tTPlayer.f192567d = null;
        tTPlayer.f192569f = null;
        MethodCollector.m26664o(5630);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136812a() {
        MethodCollector.m26663i(5519);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._setVideoSurface(tTPlayer.f192565b, null);
        }
        MethodCollector.m26664o(5519);
    }

    private C86287w(Context context) {
        this.f192751g = context;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: b */
    public final void mo136829b(int i) {
        MethodCollector.m26663i(6504);
        TTPlayer._setLooping(this.f192749c.f192565b, i);
        MethodCollector.m26664o(6504);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: c */
    public final void mo136831c(int i) {
        MethodCollector.m26663i(6795);
        TTPlayer._seek(this.f192749c.f192565b, i);
        MethodCollector.m26664o(6795);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: d */
    public final String mo136833d(int i) {
        MethodCollector.m26663i(7392);
        String _getStringValue = TTPlayer._getStringValue(this.f192749c.f192565b, i);
        MethodCollector.m26664o(7392);
        return _getStringValue;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: e */
    public final Object mo136835e(int i) {
        MethodCollector.m26663i(8293);
        Object _getJObjectValue = TTPlayer._getJObjectValue(this.f192749c.f192565b, i);
        MethodCollector.m26664o(8293);
        return _getJObjectValue;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136814a(int i) {
        MethodCollector.m26663i(6204);
        TTPlayer tTPlayer = this.f192749c;
        if (tTPlayer.f192565b != 0) {
            TTPlayer._setDataSourceFd(tTPlayer.f192565b, i);
        }
        MethodCollector.m26664o(6204);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final int mo136809a(int i, int i2) {
        return this.f192749c.mo136708a(i, i2);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final void mo136813a(float f, float f2) {
        MethodCollector.m26663i(6656);
        TTPlayer._setVolume(this.f192749c.f192565b, f, f2);
        MethodCollector.m26664o(6656);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final int mo136808a(int i, float f) {
        MethodCollector.m26663i(8154);
        int _setFloatValue = TTPlayer._setFloatValue(this.f192749c.f192565b, i, f);
        MethodCollector.m26664o(8154);
        return _setFloatValue;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: b */
    public final float mo136825b(int i, float f) {
        MethodCollector.m26663i(8292);
        float _getFloatValue = TTPlayer._getFloatValue(this.f192749c.f192565b, i, 0.0f);
        MethodCollector.m26664o(8292);
        return _getFloatValue;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final int mo136810a(int i, long j) {
        MethodCollector.m26663i(7540);
        int _setLongValue = TTPlayer._setLongValue(this.f192749c.f192565b, i, j);
        MethodCollector.m26664o(7540);
        return _setLongValue;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: b */
    public final long mo136827b(int i, long j) {
        MethodCollector.m26663i(7541);
        TTPlayer tTPlayer = this.f192749c;
        if (i == 50) {
            long j2 = tTPlayer.f192565b;
            MethodCollector.m26664o(7541);
            return j2;
        }
        long _getLongValue = TTPlayer._getLongValue(tTPlayer.f192565b, i, j);
        MethodCollector.m26664o(7541);
        return _getLongValue;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: c */
    public final void mo136832c(int i, int i2) {
        MethodCollector.m26663i(7860);
        TTPlayer._switchStream(this.f192749c.f192565b, i, i2);
        MethodCollector.m26664o(7860);
    }

    /* renamed from: a */
    public static final synchronized C86287w m148519a(TTPlayerClient tTPlayerClient, Context context) {
        C86287w wVar;
        StringBuffer stringBuffer;
        String str;
        synchronized (C86287w.class) {
            MethodCollector.m26663i(5403);
            if (f192746d == null) {
                f192746d = C86277r.m148513d(context);
                try {
                    if (TTPlayer.f192558h == null) {
                        TTPlayer.f192558h = f192746d;
                    }
                } catch (UnsatisfiedLinkError e) {
                    f192747e = e.getMessage();
                }
            }
            if (f192747e == null) {
                wVar = new C86287w(context);
                wVar.f192750f = tTPlayerClient;
                try {
                    TTPlayer tTPlayer = new TTPlayer(context, wVar.f192748b);
                    wVar.f192749c = tTPlayer;
                    tTPlayer.f192567d = wVar;
                    MethodCollector.m26664o(5403);
                } catch (Throwable th) {
                    str = th.toString();
                }
            } else {
                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(f192747e);
                MethodCollector.m26664o(5403);
                throw unsatisfiedLinkError;
            }
        }
        return wVar;
        stringBuffer.append(th.toString()).append(",player:").append(str);
        RuntimeException runtimeException = new RuntimeException(stringBuffer.toString());
        MethodCollector.m26664o(5403);
        throw runtimeException;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: b */
    public final int mo136826b(int i, int i2) {
        int i3;
        MethodCollector.m26663i(7097);
        try {
            TTPlayer tTPlayer = this.f192749c;
            i3 = 0;
            if (i == 22) {
                if (!(i2 == 0 || i2 == 2 || i2 != 1)) {
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    throw new NullPointerException("endsWith");
                }
            } else if (i == 111) {
                int length = C86281s.f192729a.length;
                int[] iArr = new int[C86281s.f192729a.length];
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    if (((1 << i5) & i2) == 0) {
                        iArr[i4] = C86281s.f192729a[i5];
                        i4++;
                    }
                }
                TTPlayer._setSupprotSampleRates(iArr, i4);
                MethodCollector.m26664o(7097);
                return i3;
            }
            i3 = TTPlayer._setIntValue(tTPlayer.f192565b, i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
            i3 = -1;
        }
        MethodCollector.m26664o(7097);
        return i3;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86251k
    /* renamed from: a */
    public final int mo136811a(int i, String str) {
        MethodCollector.m26663i(7244);
        int _setStringValue = TTPlayer._setStringValue(this.f192749c.f192565b, i, str);
        MethodCollector.m26664o(7244);
        return _setStringValue;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86248h
    /* renamed from: a */
    public final void mo136805a(int i, int i2, int i3, String str) {
        MethodCollector.m26663i(7718);
        TTPlayerClient tTPlayerClient = this.f192750f;
        synchronized (tTPlayerClient.f192592c) {
            try {
                if (tTPlayerClient.f192598i != null) {
                    if (i2 != 40 || str == null) {
                        Message obtainMessage = tTPlayerClient.f192598i.obtainMessage(i2, i3, i);
                        obtainMessage.obj = str;
                        obtainMessage.sendToTarget();
                        MethodCollector.m26664o(7718);
                        return;
                    }
                    tTPlayerClient.mo136724a(i, i2, i3, str);
                    MethodCollector.m26664o(7718);
                }
            } finally {
                MethodCollector.m26664o(7718);
            }
        }
    }
}
