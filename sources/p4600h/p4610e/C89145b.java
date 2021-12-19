package p4600h.p4610e;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.io.OutputStream;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.e.b */
public final class C89145b {
    static {
        Covode.recordClassIndex(105229);
    }

    /* renamed from: a */
    public static final long m154635a(InputStream inputStream, OutputStream outputStream, int i) {
        C89219l.m154721d(inputStream, "");
        C89219l.m154721d(outputStream, "");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }
}
