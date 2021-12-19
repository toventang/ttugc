package p4632k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.x */
public final class C89446x extends C89427i {

    /* renamed from: a */
    private final transient byte[][] f203141a;

    /* renamed from: b */
    private final transient int[] f203142b;

    static {
        Covode.recordClassIndex(105530);
    }

    public final int[] getDirectory() {
        return this.f203142b;
    }

    public final byte[][] getSegments() {
        return this.f203141a;
    }

    private final Object writeReplace() {
        return m155225a();
    }

    @Override // p4632k.C89427i
    public final byte[] internalArray$jvm() {
        return toByteArray();
    }

    /* renamed from: a */
    private final C89427i m155225a() {
        return new C89427i(toByteArray());
    }

    @Override // p4632k.C89427i
    public final ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // p4632k.C89427i
    public final String base64() {
        return m155225a().base64();
    }

    @Override // p4632k.C89427i
    public final String base64Url() {
        return m155225a().base64Url();
    }

    @Override // p4632k.C89427i
    public final int getSize$jvm() {
        return this.f203142b[this.f203141a.length - 1];
    }

    @Override // p4632k.C89427i
    public final String hex() {
        return m155225a().hex();
    }

    @Override // p4632k.C89427i
    public final C89427i md5() {
        return m155225a().md5();
    }

    @Override // p4632k.C89427i
    public final C89427i sha1() {
        return m155225a().sha1();
    }

    @Override // p4632k.C89427i
    public final C89427i sha256() {
        return m155225a().sha256();
    }

    @Override // p4632k.C89427i
    public final C89427i sha512() {
        return m155225a().sha512();
    }

    @Override // p4632k.C89427i
    public final C89427i toAsciiLowercase() {
        return m155225a().toAsciiLowercase();
    }

    @Override // p4632k.C89427i
    public final C89427i toAsciiUppercase() {
        return m155225a().toAsciiUppercase();
    }

    @Override // p4632k.C89427i
    public final String toString() {
        return m155225a().toString();
    }

    @Override // p4632k.C89427i
    public final String utf8() {
        return m155225a().utf8();
    }

    @Override // p4632k.C89427i
    public final int hashCode() {
        int hashCode$jvm = getHashCode$jvm();
        if (hashCode$jvm != 0) {
            return hashCode$jvm;
        }
        int length = this.f203141a.length;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i < length) {
            byte[] bArr = this.f203141a[i];
            int[] iArr = this.f203142b;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = (i5 - i2) + i4;
            while (i4 < i6) {
                i3 = (i3 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i2 = i5;
        }
        setHashCode$jvm(i3);
        return i3;
    }

    @Override // p4632k.C89427i
    public final byte[] toByteArray() {
        int[] iArr = this.f203142b;
        byte[][] bArr = this.f203141a;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f203142b;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            C89412b.m154996a(this.f203141a[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // p4632k.C89427i
    public final C89427i hmacSha1(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        return m155225a().hmacSha1(iVar);
    }

    @Override // p4632k.C89427i
    public final C89427i hmacSha256(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        return m155225a().hmacSha256(iVar);
    }

    @Override // p4632k.C89427i
    public final C89427i hmacSha512(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        return m155225a().hmacSha512(iVar);
    }

    @Override // p4632k.C89427i
    public final String string(Charset charset) {
        C89219l.m154719c(charset, "");
        return m155225a().string(charset);
    }

    /* renamed from: a */
    private final int m155224a(int i) {
        int binarySearch = Arrays.binarySearch(this.f203142b, 0, this.f203141a.length, i + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return binarySearch ^ -1;
    }

    @Override // p4632k.C89427i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89427i) {
            C89427i iVar = (C89427i) obj;
            if (iVar.size() != size() || !rangeEquals(0, iVar, 0, size())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // p4632k.C89427i
    public final byte internalGet$jvm(int i) {
        int i2;
        C89413c.m155000a((long) this.f203142b[this.f203141a.length - 1], (long) i, 1);
        int a = m155224a(i);
        if (a == 0) {
            i2 = 0;
        } else {
            i2 = this.f203142b[a - 1];
        }
        int[] iArr = this.f203142b;
        byte[][] bArr = this.f203141a;
        return bArr[a][(i - i2) + iArr[bArr.length + a]];
    }

    @Override // p4632k.C89427i
    public final void write(OutputStream outputStream) {
        MethodCollector.m26663i(3754);
        C89219l.m154719c(outputStream, "");
        int length = this.f203141a.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f203142b;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            outputStream.write(this.f203141a[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        MethodCollector.m26664o(3754);
    }

    @Override // p4632k.C89427i
    public final void write$jvm(C89420f fVar) {
        C89219l.m154719c(fVar, "");
        int length = this.f203141a.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f203142b;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C89443v vVar = new C89443v(this.f203141a[i], i3, (i3 + i4) - i2, true, false);
            if (fVar.f203090a == null) {
                vVar.f203137g = vVar;
                vVar.f203136f = vVar.f203137g;
                fVar.f203090a = vVar.f203136f;
            } else {
                C89443v vVar2 = fVar.f203090a;
                if (vVar2 == null) {
                    C89219l.m154707a();
                }
                C89443v vVar3 = vVar2.f203137g;
                if (vVar3 == null) {
                    C89219l.m154707a();
                }
                vVar3.mo143949a(vVar);
            }
            i++;
            i2 = i4;
        }
        fVar.f203091b += (long) i2;
    }

    @Override // p4632k.C89427i
    public final int indexOf(byte[] bArr, int i) {
        C89219l.m154719c(bArr, "");
        return m155225a().indexOf(bArr, i);
    }

    @Override // p4632k.C89427i
    public final int lastIndexOf(byte[] bArr, int i) {
        C89219l.m154719c(bArr, "");
        return m155225a().lastIndexOf(bArr, i);
    }

    @Override // p4632k.C89427i
    public final C89427i substring(int i, int i2) {
        return m155225a().substring(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89446x(C89420f fVar, int i) {
        super(C89427i.EMPTY.getData$jvm());
        C89219l.m154719c(fVar, "");
        C89413c.m155000a(fVar.f203091b, 0, (long) i);
        C89443v vVar = fVar.f203090a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (vVar == null) {
                C89219l.m154707a();
            }
            if (vVar.f203133c != vVar.f203132b) {
                i3 += vVar.f203133c - vVar.f203132b;
                i4++;
                vVar = vVar.f203136f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        this.f203142b = new int[(i4 * 2)];
        C89443v vVar2 = fVar.f203090a;
        int i5 = 0;
        while (i2 < i) {
            if (vVar2 == null) {
                C89219l.m154707a();
            }
            bArr[i5] = vVar2.f203131a;
            i2 += vVar2.f203133c - vVar2.f203132b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f203142b;
            iArr[i5] = i2;
            iArr[bArr.length + i5] = vVar2.f203132b;
            vVar2.f203134d = true;
            i5++;
            vVar2 = vVar2.f203136f;
        }
        this.f203141a = bArr;
    }

    @Override // p4632k.C89427i
    public final boolean rangeEquals(int i, C89427i iVar, int i2, int i3) {
        int i4;
        C89219l.m154719c(iVar, "");
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int a = m155224a(i);
        while (i3 > 0) {
            if (a == 0) {
                i4 = 0;
            } else {
                i4 = this.f203142b[a - 1];
            }
            int min = Math.min(i3, ((this.f203142b[a] - i4) + i4) - i);
            int[] iArr = this.f203142b;
            byte[][] bArr = this.f203141a;
            if (!iVar.rangeEquals(i2, bArr[a], (i - i4) + iArr[bArr.length + a], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            a++;
        }
        return true;
    }

    @Override // p4632k.C89427i
    public final boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C89219l.m154719c(bArr, "");
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int a = m155224a(i);
        while (i3 > 0) {
            if (a == 0) {
                i4 = 0;
            } else {
                i4 = this.f203142b[a - 1];
            }
            int min = Math.min(i3, ((this.f203142b[a] - i4) + i4) - i);
            int[] iArr = this.f203142b;
            byte[][] bArr2 = this.f203141a;
            if (!C89413c.m155001a(bArr2[a], (i - i4) + iArr[bArr2.length + a], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            a++;
        }
        return true;
    }
}
