package com.p2082ss.android.vesdk.audio;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.vesdk.audio.j */
public class C85342j {

    /* renamed from: a */
    public C85345c f191054a;

    /* renamed from: b */
    public int f191055b;

    /* renamed from: c */
    public long f191056c;

    /* renamed from: com.ss.android.vesdk.audio.j$c */
    public static class C85345c {
        static {
            Covode.recordClassIndex(99457);
        }
    }

    static {
        Covode.recordClassIndex(99454);
    }

    /* renamed from: com.ss.android.vesdk.audio.j$a */
    public static class C85343a extends C85345c {

        /* renamed from: a */
        public byte[] f191057a;

        static {
            Covode.recordClassIndex(99455);
        }

        public C85343a(byte[] bArr) {
            this.f191057a = bArr;
        }
    }

    /* renamed from: com.ss.android.vesdk.audio.j$b */
    public static class C85344b extends C85345c {

        /* renamed from: a */
        public ByteBuffer f191058a;

        static {
            Covode.recordClassIndex(99456);
        }

        public C85344b(ByteBuffer byteBuffer) {
            this.f191058a = byteBuffer;
        }
    }

    public C85342j(C85345c cVar, int i) {
        this.f191054a = cVar;
        this.f191055b = i;
    }
}
