package com.bytedance.android.p150e.p151a.p152a;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.android.e.a.a.d */
public final class C2726d {

    /* renamed from: com.bytedance.android.e.a.a.d$b */
    public interface AbstractC2728b {
        static {
            Covode.recordClassIndex(3154);
        }

        /* renamed from: a */
        void mo7299a(long j);

        /* renamed from: a */
        boolean mo7300a();

        /* renamed from: b */
        byte mo7301b();

        /* renamed from: b */
        byte[] mo7302b(long j);

        /* renamed from: c */
        int mo7305c();

        /* renamed from: c */
        String mo7303c(long j);

        /* renamed from: d */
        long mo7306d();
    }

    static {
        Covode.recordClassIndex(3152);
    }

    /* renamed from: com.bytedance.android.e.a.a.d$a */
    static abstract class AbstractC2727a implements AbstractC2728b {

        /* renamed from: a */
        static final Charset f8136a = Charset.forName("UTF-8");

        AbstractC2727a() {
        }

        static {
            Covode.recordClassIndex(3153);
        }

        @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
        /* renamed from: d */
        public final long mo7306d() {
            long j = 0;
            int i = 0;
            do {
                j |= (255 & ((long) mo7301b())) << (i * 8);
                i++;
            } while (i < 8);
            return j;
        }

        @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
        /* renamed from: c */
        public final int mo7305c() {
            return (mo7301b() & 255) | ((mo7301b() & 255) << 8) | ((mo7301b() & 255) << 16) | ((mo7301b() & 255) << 24);
        }
    }

    /* renamed from: a */
    public static AbstractC2728b m7875a(InputStream inputStream) {
        return new C2725c(inputStream);
    }

    /* renamed from: a */
    public static AbstractC2728b m7876a(byte[] bArr) {
        return new C2723a(bArr);
    }
}
