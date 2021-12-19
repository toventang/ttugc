package p4632k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p4600h.p4611f.p4613b.C89219l;
import p4632k.p4633a.C89407a;

/* renamed from: k.i */
public class C89427i implements Serializable, Comparable<C89427i> {
    public static final C89428a Companion = new C89428a((byte) 0);
    public static final C89427i EMPTY = C89407a.f203071b;
    public static final char[] HEX_DIGITS = C89407a.f203070a;
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private transient int f203101a;

    /* renamed from: b */
    private transient String f203102b;

    /* renamed from: c */
    private final byte[] f203103c;

    public static final C89427i encodeUtf8(String str) {
        return C89428a.m155139a(str);
    }

    /* renamed from: of */
    public static final C89427i m155136of(byte... bArr) {
        return C89428a.m155140a(bArr);
    }

    public static final C89427i read(InputStream inputStream, int i) {
        return C89428a.m155138a(inputStream, i);
    }

    public final int indexOf(C89427i iVar) {
        return indexOf$default(this, iVar, 0, 2, (Object) null);
    }

    public int indexOf(byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int lastIndexOf(C89427i iVar) {
        return lastIndexOf$default(this, iVar, 0, 2, (Object) null);
    }

    public int lastIndexOf(byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public C89427i substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public C89427i substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    /* renamed from: k.i$a */
    public static final class C89428a {
        static {
            Covode.recordClassIndex(105512);
        }

        private C89428a() {
        }

        public /* synthetic */ C89428a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C89427i m155139a(String str) {
            C89219l.m154719c(str, "");
            return C89407a.m154981a(str);
        }

        /* renamed from: a */
        public static C89427i m155140a(byte... bArr) {
            C89219l.m154719c(bArr, "");
            return C89407a.m154983a(bArr);
        }

        /* renamed from: a */
        public static C89427i m155138a(InputStream inputStream, int i) {
            MethodCollector.m26663i(5250);
            C89219l.m154719c(inputStream, "");
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        EOFException eOFException = new EOFException();
                        MethodCollector.m26664o(5250);
                        throw eOFException;
                    }
                }
                C89427i iVar = new C89427i(bArr);
                MethodCollector.m26664o(5250);
                return iVar;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i)).toString());
            MethodCollector.m26664o(5250);
            throw illegalArgumentException;
        }
    }

    public final byte[] getData$jvm() {
        return this.f203103c;
    }

    public final int getHashCode$jvm() {
        return this.f203101a;
    }

    public final String getUtf8$jvm() {
        return this.f203102b;
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m157078deprecated_size() {
        return size();
    }

    public C89427i md5() {
        return m155133a("MD5");
    }

    public C89427i sha1() {
        return m155133a("SHA-1");
    }

    public C89427i sha256() {
        return m155133a("SHA-256");
    }

    public C89427i sha512() {
        return m155133a("SHA-512");
    }

    public final int size() {
        return getSize$jvm();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.f203103c).asReadOnlyBuffer();
        C89219l.m154709a((Object) asReadOnlyBuffer, "");
        return asReadOnlyBuffer;
    }

    public String base64() {
        C89219l.m154719c(this, "");
        return C89406a.m154979a(getData$jvm(), C89406a.f203068a);
    }

    public String base64Url() {
        C89219l.m154719c(this, "");
        return C89406a.m154979a(getData$jvm(), C89406a.f203069b);
    }

    public int getSize$jvm() {
        C89219l.m154719c(this, "");
        return getData$jvm().length;
    }

    public byte[] internalArray$jvm() {
        C89219l.m154719c(this, "");
        return getData$jvm();
    }

    static {
        Covode.recordClassIndex(105511);
    }

    public int hashCode() {
        C89219l.m154719c(this, "");
        int hashCode$jvm = getHashCode$jvm();
        if (hashCode$jvm != 0) {
            return hashCode$jvm;
        }
        byte[] data$jvm = getData$jvm();
        C89219l.m154719c(data$jvm, "");
        setHashCode$jvm(Arrays.hashCode(data$jvm));
        return getHashCode$jvm();
    }

    public byte[] toByteArray() {
        C89219l.m154719c(this, "");
        byte[] data$jvm = getData$jvm();
        byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
        C89219l.m154709a((Object) copyOf, "");
        return copyOf;
    }

    public String utf8() {
        C89219l.m154719c(this, "");
        String utf8$jvm = getUtf8$jvm();
        if (utf8$jvm != null) {
            return utf8$jvm;
        }
        String a = C89412b.m154995a(getData$jvm());
        setUtf8$jvm(a);
        return a;
    }

    public String hex() {
        C89219l.m154719c(this, "");
        char[] cArr = new char[(getData$jvm().length * 2)];
        byte[] data$jvm = getData$jvm();
        int i = 0;
        for (byte b : data$jvm) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        C89219l.m154719c(cArr, "");
        return new String(cArr);
    }

    public C89427i toAsciiLowercase() {
        C89219l.m154719c(this, "");
        for (int i = 0; i < getData$jvm().length; i++) {
            byte b = getData$jvm()[i];
            if (b >= 65 && b <= 90) {
                byte[] data$jvm = getData$jvm();
                byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                C89219l.m154709a((Object) copyOf, "");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C89427i(copyOf);
            }
        }
        return this;
    }

    public C89427i toAsciiUppercase() {
        C89219l.m154719c(this, "");
        for (int i = 0; i < getData$jvm().length; i++) {
            byte b = getData$jvm()[i];
            if (b >= 97 && b <= 122) {
                byte[] data$jvm = getData$jvm();
                byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                C89219l.m154709a((Object) copyOf, "");
                copyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        copyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new C89427i(copyOf);
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r6 <= 1114111) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (55296 <= r6) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (r6 >= r13) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        if (57343 < r6) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r6 == 10) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r6 == 13) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r6 < 0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        if (31 >= r6) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (127 <= r6) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r6 != 65533) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (159 < r6) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        if (r6 >= 65536) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        r7 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ae, code lost:
        if (r6 >= 128) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        if (r6 >= 2048) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
        if (r6 >= 65536) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bc, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00be, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
        r0 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: p4632k.C89427i.toString():java.lang.String");
    }

    public final void setHashCode$jvm(int i) {
        this.f203101a = i;
    }

    public final void setUtf8$jvm(String str) {
        this.f203102b = str;
    }

    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m157077deprecated_getByte(int i) {
        return getByte(i);
    }

    public final byte getByte(int i) {
        return internalGet$jvm(i);
    }

    public C89427i(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        this.f203103c = bArr;
    }

    public C89427i hmacSha1(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        return m155134a("HmacSHA1", iVar);
    }

    public C89427i hmacSha256(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        return m155134a("HmacSHA256", iVar);
    }

    public C89427i hmacSha512(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        return m155134a("HmacSHA512", iVar);
    }

    public byte internalGet$jvm(int i) {
        C89219l.m154719c(this, "");
        return getData$jvm()[i];
    }

    public String string(Charset charset) {
        C89219l.m154719c(charset, "");
        return new String(this.f203103c, charset);
    }

    public void write$jvm(C89420f fVar) {
        C89219l.m154719c(fVar, "");
        byte[] bArr = this.f203103c;
        fVar.mo68852a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private final C89427i m155133a(String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.f203103c);
        C89219l.m154709a((Object) digest, "");
        return new C89427i(digest);
    }

    /* renamed from: of */
    public static final C89427i m155135of(ByteBuffer byteBuffer) {
        C89219l.m154719c(byteBuffer, "");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new C89427i(bArr);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        C89427i a = C89428a.m155138a(objectInputStream, objectInputStream.readInt());
        Field declaredField = C89427i.class.getDeclaredField("c");
        C89219l.m154709a((Object) declaredField, "");
        declaredField.setAccessible(true);
        declaredField.set(this, a.f203103c);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        MethodCollector.m26663i(3651);
        objectOutputStream.writeInt(this.f203103c.length);
        objectOutputStream.write(this.f203103c);
        MethodCollector.m26664o(3651);
    }

    public final boolean endsWith(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(iVar, "");
        return rangeEquals(size() - iVar.size(), iVar, 0, iVar.size());
    }

    public final boolean startsWith(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(iVar, "");
        return rangeEquals(0, iVar, 0, iVar.size());
    }

    public void write(OutputStream outputStream) {
        MethodCollector.m26663i(3226);
        C89219l.m154719c(outputStream, "");
        outputStream.write(this.f203103c);
        MethodCollector.m26664o(3226);
    }

    public int compareTo(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(iVar, "");
        int size = size();
        int size2 = iVar.size();
        int min = Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int i2 = getByte(i) & 255;
            int i3 = iVar.getByte(i) & 255;
            if (i2 != i3) {
                if (i2 < i3) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (size == size2) {
            return 0;
        }
        if (size < size2) {
            return -1;
        }
        return 1;
    }

    public final boolean endsWith(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(bArr, "");
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public boolean equals(Object obj) {
        C89219l.m154719c(this, "");
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89427i) {
            C89427i iVar = (C89427i) obj;
            if (iVar.size() != getData$jvm().length || !iVar.rangeEquals(0, getData$jvm(), 0, getData$jvm().length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean startsWith(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(bArr, "");
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public static final C89427i decodeHex(String str) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str, "");
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((C89407a.m154980a(str.charAt(i2)) << 4) + C89407a.m154980a(str.charAt(i2 + 1)));
            }
            return new C89427i(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)).toString());
    }

    public static final C89427i decodeBase64(String str) {
        int i;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str, "");
        int length = str.length();
        while (length > 0 && ((r1 = str.charAt(length - 1)) == '=' || r1 == '\n' || r1 == '\r' || r1 == ' ' || r1 == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if ('A' <= charAt && 'Z' >= charAt) {
                i = charAt - 'A';
            } else if ('a' <= charAt && 'z' >= charAt) {
                i = charAt - 'G';
            } else if ('0' <= charAt && '9' >= charAt) {
                i = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i = 62;
            } else if (charAt == '/' || charAt == '_') {
                i = 63;
            } else {
                if (!(charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                int i7 = i5 + 1;
                bArr[i5] = (byte) (i4 >> 16);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (i4 >> 8);
                i5 = i8 + 1;
                bArr[i8] = (byte) i4;
            }
        }
        int i9 = i3 % 4;
        if (i9 == 1) {
            return null;
        }
        if (i9 == 2) {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        } else if (i9 == 3) {
            int i10 = i4 << 6;
            int i11 = i5 + 1;
            bArr[i5] = (byte) (i10 >> 16);
            i5 = i11 + 1;
            bArr[i11] = (byte) (i10 >> 8);
        }
        if (i5 != i2) {
            byte[] bArr2 = new byte[i5];
            C89412b.m154996a(bArr, 0, bArr2, 0, i5);
            bArr = bArr2;
        }
        return new C89427i(bArr);
    }

    public final int indexOf(C89427i iVar, int i) {
        C89219l.m154719c(iVar, "");
        return indexOf(iVar.internalArray$jvm(), i);
    }

    public final int lastIndexOf(C89427i iVar, int i) {
        C89219l.m154719c(iVar, "");
        return lastIndexOf(iVar.internalArray$jvm(), i);
    }

    public static final C89427i encodeString(String str, Charset charset) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(charset, "");
        byte[] bytes = str.getBytes(charset);
        C89219l.m154709a((Object) bytes, "");
        return new C89427i(bytes);
    }

    public C89427i substring(int i, int i2) {
        return C89407a.m154982a(this, i, i2);
    }

    /* renamed from: a */
    private final C89427i m155134a(String str, C89427i iVar) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(iVar.toByteArray(), str));
            byte[] doFinal = instance.doFinal(this.f203103c);
            C89219l.m154709a((Object) doFinal, "");
            return new C89427i(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int indexOf(byte[] bArr, int i) {
        C89219l.m154719c(bArr, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(bArr, "");
        int length = getData$jvm().length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!C89413c.m155001a(getData$jvm(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public int lastIndexOf(byte[] bArr, int i) {
        C89219l.m154719c(bArr, "");
        for (int min = Math.min(i, this.f203103c.length - bArr.length); min >= 0; min--) {
            if (C89413c.m155001a(this.f203103c, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    /* renamed from: of */
    public static final C89427i m155137of(byte[] bArr, int i, int i2) {
        C89219l.m154719c(bArr, "");
        C89413c.m155000a((long) bArr.length, (long) i, (long) i2);
        byte[] bArr2 = new byte[i2];
        C89412b.m154996a(bArr, i, bArr2, 0, i2);
        return new C89427i(bArr2);
    }

    public boolean rangeEquals(int i, C89427i iVar, int i2, int i3) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(iVar, "");
        return iVar.rangeEquals(i2, getData$jvm(), i, i3);
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        C89219l.m154719c(bArr, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(bArr, "");
        if (i < 0 || i > getData$jvm().length - i3 || i2 < 0 || i2 > bArr.length - i3 || !C89413c.m155001a(getData$jvm(), i, bArr, i2, i3)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ int indexOf$default(C89427i iVar, C89427i iVar2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return iVar.indexOf(iVar2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(C89427i iVar, C89427i iVar2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = iVar.size();
            }
            return iVar.lastIndexOf(iVar2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ C89427i substring$default(C89427i iVar, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = iVar.size();
            }
            return iVar.substring(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static /* synthetic */ int indexOf$default(C89427i iVar, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return iVar.indexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(C89427i iVar, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = iVar.size();
            }
            return iVar.lastIndexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }
}
