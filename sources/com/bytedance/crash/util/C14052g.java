package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.bytedance.crash.util.g */
public final class C14052g extends PrintWriter {

    /* renamed from: a */
    private MessageDigest f34230a;

    /* renamed from: b */
    private Charset f34231b;

    /* renamed from: c */
    private C14053a f34232c;

    /* renamed from: com.bytedance.crash.util.g$a */
    public static class C14053a {
        static {
            Covode.recordClassIndex(16120);
        }

        /* renamed from: a */
        public boolean mo22305a(String str) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(16119);
    }

    /* renamed from: a */
    public static String m25539a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return C14042ab.m25490a(instance.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i) {
        MethodCollector.m26663i(1330);
        super.write(i);
        MessageDigest messageDigest = this.f34230a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
        MethodCollector.m26664o(1330);
    }

    public C14052g(OutputStream outputStream, MessageDigest messageDigest, C14053a aVar) {
        super(outputStream);
        this.f34230a = messageDigest;
        this.f34232c = aVar;
        if (messageDigest != null) {
            this.f34231b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        C14053a aVar;
        MethodCollector.m26663i(1346);
        super.write(str, i, i2);
        if (this.f34230a != null && ((aVar = this.f34232c) == null || aVar.mo22305a(str))) {
            this.f34230a.update(this.f34231b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
        }
        MethodCollector.m26664o(1346);
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        MethodCollector.m26663i(1327);
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f34230a;
        if (messageDigest != null) {
            messageDigest.update(this.f34231b.encode(CharBuffer.wrap(cArr)).array());
        }
        MethodCollector.m26664o(1327);
    }
}
