package com.benchmark.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.benchmark.mediacodec.c */
public final class C2482c extends AbstractC2484d {

    /* renamed from: a */
    protected C2483a f7489a;

    /* renamed from: b */
    public LinkedBlockingQueue<Integer> f7490b = new LinkedBlockingQueue<>();

    static {
        Covode.recordClassIndex(2838);
    }

    @Override // com.benchmark.mediacodec.AbstractC2484d
    /* renamed from: b */
    public final int mo6882b() {
        int b = super.mo6882b();
        if (b == C2490g.f7516a) {
            this.f7490b.clear();
        }
        return b;
    }

    /* access modifiers changed from: protected */
    @Override // com.benchmark.mediacodec.AbstractC2484d
    /* renamed from: a */
    public final int mo6880a() {
        this.f7489a = new C2483a();
        if (Build.VERSION.SDK_INT > 23) {
            this.f7495d.setCallback(this.f7489a, this.f7500i);
        } else if (Build.VERSION.SDK_INT < 21) {
            return C2490g.f7521f;
        } else {
            this.f7495d.setCallback(this.f7489a);
        }
        return C2490g.f7516a;
    }

    /* renamed from: com.benchmark.mediacodec.c$a */
    protected class C2483a extends MediaCodec.Callback {
        static {
            Covode.recordClassIndex(2839);
        }

        protected C2483a() {
        }

        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            codecException.getMessage();
        }

        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            C2482c.this.f7496e = mediaFormat;
        }

        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            if (!C2482c.this.f7494c.useSurfaceInput()) {
                C2482c.this.f7490b.offer(Integer.valueOf(i));
            }
        }

        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            C2482c.this.mo6890a(mediaCodec, i, bufferInfo);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.benchmark.mediacodec.AbstractC2484d
    /* renamed from: a */
    public final int mo6881a(C2492i iVar) {
        if (this.f7490b.isEmpty()) {
            return C2490g.f7527l;
        }
        return mo6888a(iVar, this.f7490b.poll().intValue());
    }
}
