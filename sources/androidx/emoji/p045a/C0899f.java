package androidx.emoji.p045a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.emoji.a.f */
final class C0899f {

    /* renamed from: androidx.emoji.a.f$c */
    interface AbstractC0902c {
        static {
            Covode.recordClassIndex(988);
        }

        /* renamed from: a */
        int mo3192a();

        /* renamed from: a */
        void mo3193a(int i);

        /* renamed from: b */
        long mo3194b();

        /* renamed from: c */
        int mo3195c();

        /* renamed from: d */
        long mo3196d();
    }

    static {
        Covode.recordClassIndex(985);
    }

    /* renamed from: androidx.emoji.a.f$a */
    static class C0900a implements AbstractC0902c {

        /* renamed from: a */
        private final ByteBuffer f3248a;

        static {
            Covode.recordClassIndex(986);
        }

        @Override // androidx.emoji.p045a.C0899f.AbstractC0902c
        /* renamed from: c */
        public final int mo3195c() {
            return this.f3248a.getInt();
        }

        @Override // androidx.emoji.p045a.C0899f.AbstractC0902c
        /* renamed from: d */
        public final long mo3196d() {
            return (long) this.f3248a.position();
        }

        @Override // androidx.emoji.p045a.C0899f.AbstractC0902c
        /* renamed from: a */
        public final int mo3192a() {
            return this.f3248a.getShort() & 65535;
        }

        @Override // androidx.emoji.p045a.C0899f.AbstractC0902c
        /* renamed from: b */
        public final long mo3194b() {
            return ((long) this.f3248a.getInt()) & 4294967295L;
        }

        C0900a(ByteBuffer byteBuffer) {
            this.f3248a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji.p045a.C0899f.AbstractC0902c
        /* renamed from: a */
        public final void mo3193a(int i) {
            ByteBuffer byteBuffer = this.f3248a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* renamed from: a */
    static C0901b m3094a(AbstractC0902c cVar) {
        cVar.mo3193a(4);
        int a = cVar.mo3192a();
        if (a <= 100) {
            cVar.mo3193a(6);
            int i = 0;
            while (true) {
                if (i >= a) {
                    break;
                }
                int c = cVar.mo3195c();
                cVar.mo3193a(4);
                long b = cVar.mo3194b();
                cVar.mo3193a(4);
                if (1835365473 != c) {
                    i++;
                } else if (b != -1) {
                    cVar.mo3193a((int) (b - cVar.mo3196d()));
                    cVar.mo3193a(12);
                    long b2 = cVar.mo3194b();
                    for (int i2 = 0; ((long) i2) < b2; i2++) {
                        int c2 = cVar.mo3195c();
                        long b3 = cVar.mo3194b();
                        long b4 = cVar.mo3194b();
                        if (1164798569 == c2 || 1701669481 == c2) {
                            return new C0901b(b3 + b, b4);
                        }
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: androidx.emoji.a.f$b */
    static class C0901b {

        /* renamed from: a */
        public final long f3249a;

        /* renamed from: b */
        public final long f3250b;

        static {
            Covode.recordClassIndex(987);
        }

        C0901b(long j, long j2) {
            this.f3249a = j;
            this.f3250b = j2;
        }
    }
}
