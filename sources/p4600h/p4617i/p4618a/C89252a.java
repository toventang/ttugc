package p4600h.p4617i.p4618a;

import com.bytedance.covode.number.Covode;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89251a;

/* renamed from: h.i.a.a */
public final class C89252a extends AbstractC89251a {
    static {
        Covode.recordClassIndex(105336);
    }

    @Override // p4600h.p4617i.AbstractC89251a
    /* renamed from: a */
    public final Random mo143656a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C89219l.m154716b(current, "");
        return current;
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public final double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public final long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public final int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public final long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
