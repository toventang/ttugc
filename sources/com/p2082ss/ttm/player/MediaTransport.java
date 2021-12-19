package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.ttm.player.MediaTransport */
public abstract class MediaTransport extends NativeObject {
    static {
        Covode.recordClassIndex(101393);
    }

    private native void nativeSetFilterType(int i);

    /* access modifiers changed from: protected */
    public abstract void sendPacket(MediaPacket mediaPacket);

    /* renamed from: com.ss.ttm.player.MediaTransport$MediaPacket */
    public static class MediaPacket {

        /* renamed from: a */
        public ByteBuffer f192532a;

        /* renamed from: b */
        public boolean f192533b;

        /* renamed from: c */
        public int f192534c;

        /* renamed from: d */
        public int f192535d;

        /* renamed from: e */
        public long f192536e;

        /* renamed from: f */
        public int f192537f;

        /* renamed from: g */
        public int f192538g;

        /* renamed from: h */
        public boolean f192539h;

        static {
            Covode.recordClassIndex(101394);
        }

        public void set(ByteBuffer byteBuffer, boolean z, boolean z2, int i, int i2, long j, int i3, int i4) {
            this.f192532a = byteBuffer;
            this.f192534c = i;
            this.f192535d = i2;
            this.f192536e = j;
            this.f192537f = i3;
            this.f192533b = z;
            this.f192538g = i4;
            this.f192539h = z2;
        }
    }
}
