package p4600h.p4617i;

import com.bytedance.covode.number.Covode;
import java.util.Random;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.i.a */
public abstract class AbstractC89251a extends AbstractC89255c {
    static {
        Covode.recordClassIndex(105335);
    }

    /* renamed from: a */
    public abstract Random mo143656a();

    @Override // p4600h.p4617i.AbstractC89255c
    public boolean nextBoolean() {
        return mo143656a().nextBoolean();
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public double nextDouble() {
        return mo143656a().nextDouble();
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public float nextFloat() {
        return mo143656a().nextFloat();
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public int nextInt() {
        return mo143656a().nextInt();
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public long nextLong() {
        return mo143656a().nextLong();
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public int nextBits(int i) {
        return C89258d.m154744a(mo143656a().nextInt(), i);
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public byte[] nextBytes(byte[] bArr) {
        C89219l.m154721d(bArr, "");
        mo143656a().nextBytes(bArr);
        return bArr;
    }

    @Override // p4600h.p4617i.AbstractC89255c
    public int nextInt(int i) {
        return mo143656a().nextInt(i);
    }
}
