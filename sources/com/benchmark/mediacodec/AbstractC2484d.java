package com.benchmark.mediacodec;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.benchmark.C2416b;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.benchmark.mediacodec.d */
public abstract class AbstractC2484d {

    /* renamed from: a */
    private int f7492a;

    /* renamed from: b */
    private boolean f7493b;

    /* renamed from: c */
    protected TEMediaCodecEncodeSettings f7494c;

    /* renamed from: d */
    protected MediaCodec f7495d;

    /* renamed from: e */
    public MediaFormat f7496e;

    /* renamed from: f */
    public Surface f7497f;

    /* renamed from: g */
    public AbstractC2488e f7498g;

    /* renamed from: h */
    protected HandlerThread f7499h;

    /* renamed from: i */
    protected Handler f7500i;

    /* renamed from: j */
    public int f7501j;

    /* renamed from: k */
    public int f7502k;

    /* renamed from: l */
    public boolean f7503l;

    /* renamed from: m */
    public int f7504m = -1;

    /* renamed from: n */
    public long f7505n = -1;

    /* renamed from: o */
    public long f7506o = -1;

    /* renamed from: p */
    protected long f7507p = -1;

    /* renamed from: q */
    protected LinkedBlockingQueue<Long> f7508q = new LinkedBlockingQueue<>();

    /* renamed from: r */
    protected volatile EnumC2487c f7509r = EnumC2487c.UNSET;

    /* renamed from: s */
    public byte[] f7510s;

    /* renamed from: t */
    private int f7511t;

    static {
        Covode.recordClassIndex(2840);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo6880a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo6881a(C2492i iVar);

    /* renamed from: b */
    public int mo6882b() {
        mo6896f();
        return C2490g.f7516a;
    }

    /* renamed from: c */
    public final int mo6893c() {
        return mo6895e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo6895e() {
        if (this.f7509r != EnumC2487c.INITED) {
            return C2490g.f7529n;
        }
        this.f7495d.start();
        this.f7509r = EnumC2487c.STARTED;
        return C2490g.f7516a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo6896f() {
        if (this.f7509r != EnumC2487c.STARTED) {
            return C2490g.f7529n;
        }
        int i = C2490g.f7516a;
        this.f7509r = EnumC2487c.STOPPED;
        MediaCodec mediaCodec = this.f7495d;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        return i;
    }

    protected AbstractC2484d() {
        HandlerThread handlerThread = new HandlerThread("TECodecEncoder");
        this.f7499h = handlerThread;
        handlerThread.start();
        this.f7500i = new Handler(this.f7499h.getLooper(), new C2485a(this));
    }

    /* renamed from: d */
    public final int mo6894d() {
        mo6897g();
        int i = Build.VERSION.SDK_INT;
        this.f7499h.quitSafely();
        this.f7500i = null;
        this.f7499h = null;
        this.f7501j = 0;
        this.f7502k = 0;
        this.f7510s = null;
        this.f7496e = null;
        this.f7509r = EnumC2487c.UNSET;
        return C2490g.f7516a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo6897g() {
        if (this.f7509r != EnumC2487c.UNSET && this.f7509r != EnumC2487c.RELEASED) {
            if (this.f7509r != EnumC2487c.STOPPED) {
                mo6882b();
            }
            Surface surface = this.f7497f;
            if (surface != null) {
                surface.release();
                this.f7497f = null;
            }
            MediaCodec mediaCodec = this.f7495d;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            this.f7494c = null;
            this.f7495d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.benchmark.mediacodec.d$c */
    public enum EnumC2487c {
        UNSET,
        INITED,
        STARTED,
        STOPPED,
        RELEASED;

        static {
            Covode.recordClassIndex(2843);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r2 == null) goto L_0x0028;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m7336h() {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.mediacodec.AbstractC2484d.m7336h():int");
    }

    /* renamed from: com.benchmark.mediacodec.d$a */
    protected static class C2485a implements Handler.Callback {

        /* renamed from: a */
        private WeakReference<AbstractC2484d> f7512a;

        static {
            Covode.recordClassIndex(2841);
        }

        public C2485a(AbstractC2484d dVar) {
            this.f7512a = new WeakReference<>(dVar);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            AbstractC2484d dVar = this.f7512a.get();
            if (i == 1) {
                C2486b bVar = (C2486b) obj;
                dVar.mo6891b(bVar.f7513a);
                bVar.f7514b.open();
                return false;
            } else if (i == 2) {
                dVar.mo6895e();
                return false;
            } else if (i == 3) {
                dVar.mo6896f();
                return false;
            } else if (i != 4) {
                return false;
            } else {
                dVar.mo6897g();
                return true;
            }
        }
    }

    /* renamed from: a */
    public final int mo6887a(TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings) {
        int i = Build.VERSION.SDK_INT;
        if (tEMediaCodecEncodeSettings.getBitRateMode() < 0 || tEMediaCodecEncodeSettings.getBitRateMode() > 2) {
            tEMediaCodecEncodeSettings.getBitRateMode();
            return C2490g.f7520e;
        } else if (tEMediaCodecEncodeSettings.getWidth() <= 0 || tEMediaCodecEncodeSettings.getHeight() <= 0) {
            return C2490g.f7526k;
        } else {
            Message message = new Message();
            message.what = 1;
            ConditionVariable conditionVariable = new ConditionVariable();
            conditionVariable.close();
            message.obj = new C2486b(tEMediaCodecEncodeSettings, conditionVariable);
            this.f7500i.sendMessage(message);
            if (!conditionVariable.block(500000)) {
                return C2490g.f7522g;
            }
            if (this.f7509r != EnumC2487c.INITED) {
                return C2490g.f7522g;
            }
            return C2490g.f7516a;
        }
    }

    /* renamed from: b */
    public final int mo6892b(C2492i iVar) {
        int a;
        if (this.f7509r != EnumC2487c.STARTED) {
            return C2490g.f7529n;
        }
        if (this.f7498g == null) {
            return C2490g.f7528m;
        }
        if (!iVar.mo6901a() && !iVar.f7538g) {
            return C2490g.f7520e;
        }
        int i = this.f7492a;
        if (i > 0 && i == this.f7501j + 1) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.f7495d.setParameters(bundle);
            this.f7492a = 0;
            this.f7493b = true;
        }
        if (this.f7511t > 0 && this.f7501j + 1 == 26) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("video-bitrate", this.f7511t);
            this.f7495d.setParameters(bundle2);
            this.f7511t = 0;
        }
        try {
            if (!this.f7494c.useSurfaceInput()) {
                a = mo6881a(iVar);
            } else if (this.f7509r != EnumC2487c.STARTED) {
                a = C2490g.f7529n;
            } else {
                if (iVar.mo6901a()) {
                    this.f7498g.mo6899a(iVar);
                }
                if (iVar.f7538g) {
                    this.f7495d.signalEndOfInputStream();
                }
                a = C2490g.f7516a;
            }
            if (iVar.f7535d == 0) {
                this.f7507p = System.currentTimeMillis();
            }
            if (a == C2490g.f7516a) {
                this.f7501j++;
                this.f7508q.offer(Long.valueOf(iVar.f7535d));
                if (iVar.f7538g) {
                    this.f7503l = true;
                }
            }
            return a;
        } catch (Exception e) {
            throw new C2489f(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo6891b(TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings) {
        this.f7494c = tEMediaCodecEncodeSettings;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int h = m7336h();
            if (h < 0) {
                return h;
            }
            MediaCodecInfo.CodecCapabilities capabilitiesForType = this.f7495d.getCodecInfo().getCapabilitiesForType(this.f7494c.getMimeType());
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.f7494c.getMimeType(), this.f7494c.getWidth(), this.f7494c.getHeight());
            createVideoFormat.setInteger("color-format", this.f7494c.getInputColorFormat());
            createVideoFormat.setInteger("frame-rate", this.f7494c.getFrameRate());
            createVideoFormat.setInteger("i-frame-interval", this.f7494c.getIFrameInternal());
            createVideoFormat.setInteger("color-range", this.f7494c.getColorRange());
            createVideoFormat.setInteger("color-standard", this.f7494c.getColorStandard());
            createVideoFormat.setInteger("color-transfer", this.f7494c.getColorTransfer());
            this.f7494c.getColorRange();
            this.f7494c.getColorStandard();
            this.f7494c.getColorTransfer();
            int i = 0;
            if (this.f7494c.isOffBFrame()) {
                createVideoFormat.setInteger("max-bframes", 0);
            }
            int encodeProfile = this.f7494c.getEncodeProfile();
            if (Build.VERSION.SDK_INT >= 24) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                int length = codecProfileLevelArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i];
                    if (codecProfileLevel.profile == encodeProfile) {
                        createVideoFormat.setInteger("profile", codecProfileLevel.profile);
                        createVideoFormat.setInteger("level", codecProfileLevel.level);
                        break;
                    }
                    i++;
                }
            }
            createVideoFormat.setInteger("bitrate", this.f7494c.getBitRate());
            if (Build.VERSION.SDK_INT >= 21) {
                if (capabilitiesForType.getEncoderCapabilities().isBitrateModeSupported(this.f7494c.getBitRateMode())) {
                    createVideoFormat.setInteger("bitrate-mode", this.f7494c.getBitRateMode());
                } else {
                    this.f7494c.getBitRateMode();
                }
            }
            int a = mo6880a();
            if (a != C2490g.f7516a) {
                return a;
            }
            this.f7495d.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f7505n = System.currentTimeMillis() - currentTimeMillis;
            if (this.f7494c.useSurfaceInput()) {
                this.f7497f = this.f7495d.createInputSurface();
            }
            this.f7509r = EnumC2487c.INITED;
            return C2490g.f7516a;
        } catch (Exception unused) {
            this.f7509r = EnumC2487c.UNSET;
        }
    }

    /* renamed from: com.benchmark.mediacodec.d$b */
    protected static class C2486b {

        /* renamed from: a */
        TEMediaCodecEncodeSettings f7513a;

        /* renamed from: b */
        ConditionVariable f7514b;

        static {
            Covode.recordClassIndex(2842);
        }

        public C2486b(TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings, ConditionVariable conditionVariable) {
            this.f7513a = tEMediaCodecEncodeSettings;
            this.f7514b = conditionVariable;
        }
    }

    /* renamed from: a */
    public final void mo6889a(int i, int i2) {
        if (this.f7495d != null) {
            if (i == 301) {
                this.f7511t = i2;
            } else if (i == 302) {
                try {
                    this.f7492a = i2;
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo6888a(C2492i iVar, int i) {
        byte[] bArr;
        if (this.f7509r != EnumC2487c.STARTED) {
            return C2490g.f7529n;
        }
        if (iVar == null) {
            return C2490g.f7520e;
        }
        if (iVar.mo6901a()) {
            if (this.f7494c.getInputColorFormat() == C2416b.f7253a) {
                Image inputImage = this.f7495d.getInputImage(i);
                if (inputImage == null || inputImage.getPlanes()[1].getPixelStride() != 2) {
                    bArr = iVar.f7533b;
                } else {
                    bArr = new byte[iVar.f7533b.length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < this.f7494c.getHeight(); i3++) {
                        for (int i4 = 0; i4 < this.f7494c.getWidth(); i4++) {
                            bArr[i2] = iVar.f7533b[(this.f7494c.getWidth() * i3) + i4];
                            i2++;
                        }
                    }
                    for (int i5 = 0; i5 < this.f7494c.getHeight() / 4; i5++) {
                        for (int i6 = 0; i6 < this.f7494c.getWidth(); i6++) {
                            int width = (this.f7494c.getWidth() * this.f7494c.getHeight()) + (this.f7494c.getWidth() * i5) + i6;
                            bArr[i2] = iVar.f7533b[width];
                            bArr[i2 + 1] = iVar.f7533b[width + ((this.f7494c.getWidth() * this.f7494c.getHeight()) / 4)];
                            i2 += 2;
                        }
                    }
                }
            } else {
                bArr = iVar.f7533b;
            }
            ByteBuffer inputBuffer = this.f7495d.getInputBuffer(i);
            inputBuffer.clear();
            inputBuffer.put(bArr);
            inputBuffer.position(0);
            inputBuffer.limit(bArr.length);
            this.f7495d.queueInputBuffer(i, 0, iVar.f7533b.length, iVar.f7535d, 0);
        } else if (!iVar.f7538g) {
            return C2490g.f7520e;
        } else {
            this.f7495d.queueInputBuffer(i, 0, 0, iVar.f7535d, 4);
        }
        return C2490g.f7516a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6890a(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        if (this.f7509r == EnumC2487c.STARTED) {
            boolean z2 = false;
            if ((bufferInfo.flags & 2) != 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                outputBuffer.get(4);
                this.f7510s = new byte[bufferInfo.size];
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                outputBuffer.get(this.f7510s);
                this.f7504m = this.f7510s[5];
                mediaCodec.releaseOutputBuffer(i, false);
                return;
            }
            int i2 = this.f7502k + 1;
            this.f7502k = i2;
            if (i2 == 1) {
                this.f7506o = System.currentTimeMillis() - this.f7507p;
            }
            C2492i iVar = new C2492i();
            ByteBuffer outputBuffer2 = mediaCodec.getOutputBuffer(i);
            outputBuffer2.position(bufferInfo.offset);
            outputBuffer2.limit(bufferInfo.offset + bufferInfo.size);
            if (bufferInfo.size > 0) {
                iVar.f7533b = new byte[bufferInfo.size];
                outputBuffer2.get(iVar.f7533b);
            } else if ((bufferInfo.flags & 4) == 0) {
                int i3 = bufferInfo.size;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            if ((bufferInfo.flags & 1) != 0) {
                z = true;
                if (this.f7510s != null && iVar.f7533b != null && iVar.f7533b.length > this.f7510s.length + 4 && iVar.f7533b[4] == this.f7510s[4] && (iVar.f7533b[this.f7510s.length + 4] & 31) == 5) {
                    int length = iVar.f7533b.length - this.f7510s.length;
                    byte[] bArr = new byte[length];
                    System.arraycopy(iVar.f7533b, this.f7510s.length, bArr, 0, length);
                    iVar.f7533b = bArr;
                }
            } else {
                z = false;
            }
            Long poll = this.f7508q.poll();
            if (poll != null) {
                if ((bufferInfo.flags & 4) != 0) {
                    z2 = true;
                    iVar.f7535d = poll.longValue();
                } else {
                    iVar.f7535d = bufferInfo.presentationTimeUs;
                }
                iVar.f7536e = poll.longValue();
                iVar.f7538g = z2;
                iVar.f7537f = z;
                AbstractC2488e eVar = this.f7498g;
                if (eVar != null) {
                    eVar.mo6900b(iVar);
                }
            }
        }
    }
}
