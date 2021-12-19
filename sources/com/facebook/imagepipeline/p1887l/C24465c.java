package com.facebook.imagepipeline.p1887l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.facebook.common.p1832d.C24082a;
import com.facebook.common.p1832d.C24083b;
import com.facebook.common.p1832d.C24098m;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1835g.C24114j;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1838j.C24125a;
import com.facebook.common.p1840l.AbstractC24136b;
import com.facebook.common.p1840l.C24138c;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

/* renamed from: com.facebook.imagepipeline.l.c */
public final class C24465c extends DalvikPurgeableDecoder {

    /* renamed from: a */
    private static Method f58114a;

    /* renamed from: b */
    private final AbstractC24136b f58115b = C24138c.m45745a();

    static {
        Covode.recordClassIndex(28608);
    }

    /* renamed from: a */
    private synchronized Method m46715a() {
        Method method;
        MethodCollector.m26663i(5109);
        if (f58114a == null) {
            try {
                f58114a = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                RuntimeException b = C24098m.m45632b(e);
                MethodCollector.m26664o(5109);
                throw b;
            }
        }
        method = f58114a;
        MethodCollector.m26664o(5109);
        return method;
    }

    /* renamed from: a */
    private FileDescriptor m46714a(MemoryFile memoryFile) {
        Object invoke;
        try {
            Method a = m46715a();
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a2 = C15346a.m28238a(a, new Object[]{memoryFile, objArr}, 110000, "java.lang.Object", true, "com_facebook_imagepipeline_platform_GingerbreadPurgeableDecoder_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                invoke = a2.second;
            } else {
                invoke = a.invoke(memoryFile, objArr);
                C15346a.m28242a(invoke, a, new Object[]{memoryFile, objArr}, "com_facebook_imagepipeline_platform_GingerbreadPurgeableDecoder_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            return (FileDescriptor) invoke;
        } catch (Exception e) {
            throw C24098m.m45632b(e);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeByteArrayAsPurgeable(C24117a<AbstractC24111h> aVar, BitmapFactory.Options options) {
        return m46712a(aVar, aVar.mo39695a().mo39673a(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeJPEGByteArrayAsPurgeable(C24117a<AbstractC24111h> aVar, int i, BitmapFactory.Options options) {
        byte[] bArr;
        if (endsWithEOI(aVar, i)) {
            bArr = null;
        } else {
            bArr = EOI;
        }
        return m46712a(aVar, i, bArr, options);
    }

    /* renamed from: a */
    private static MemoryFile m46713a(C24117a<AbstractC24111h> aVar, int i, byte[] bArr) {
        int length;
        Closeable closeable;
        C24125a aVar2;
        Throwable th;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        C24114j jVar = null;
        MemoryFile memoryFile = new MemoryFile(null, length + i);
        memoryFile.allowPurging(false);
        try {
            C24114j jVar2 = new C24114j(aVar.mo39695a());
            try {
                aVar2 = new C24125a(jVar2, i);
                try {
                    OutputStream outputStream = memoryFile.getOutputStream();
                    C24082a.m45598a(aVar2, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    C24117a.m45712c(aVar);
                    C24083b.m45600a((InputStream) jVar2);
                    C24083b.m45600a((InputStream) aVar2);
                    C24083b.m45599a(outputStream);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = null;
                    jVar = jVar2;
                    C24117a.m45712c(aVar);
                    C24083b.m45600a((InputStream) jVar);
                    C24083b.m45600a((InputStream) aVar2);
                    C24083b.m45599a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                aVar2 = null;
                jVar = jVar2;
                C24117a.m45712c(aVar);
                C24083b.m45600a((InputStream) jVar);
                C24083b.m45600a((InputStream) aVar2);
                C24083b.m45599a(closeable);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            aVar2 = null;
            C24117a.m45712c(aVar);
            C24083b.m45600a((InputStream) jVar);
            C24083b.m45600a((InputStream) aVar2);
            C24083b.m45599a(closeable);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m46712a(com.facebook.common.p1836h.C24117a<com.facebook.common.p1835g.AbstractC24111h> r5, int r6, byte[] r7, android.graphics.BitmapFactory.Options r8) {
        /*
            r4 = this;
            r3 = 0
            android.os.MemoryFile r2 = m46713a(r5, r6, r7)     // Catch:{ IOException -> 0x002b }
            java.io.FileDescriptor r1 = r4.m46714a(r2)     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            com.facebook.common.l.b r0 = r4.f58115b     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            if (r0 == 0) goto L_0x001d
            android.graphics.Bitmap r1 = r0.decodeFileDescriptor(r1, r3, r8)     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            java.lang.String r0 = "BitmapFactory returned null"
            java.lang.Object r0 = com.facebook.common.p1832d.C24091i.m45618a(r1, r0)     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            r2.close()
            return r0
        L_0x001d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "WebpBitmapFactory is null"
            r1.<init>(r0)
            throw r1
        L_0x0025:
            r0 = move-exception
            r3 = r2
            goto L_0x0032
        L_0x0028:
            r0 = move-exception
            r3 = r2
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            java.lang.RuntimeException r0 = com.facebook.common.p1832d.C24098m.m45632b(r0)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
        L_0x0032:
            if (r3 == 0) goto L_0x0037
            r3.close()
        L_0x0037:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1887l.C24465c.m46712a(com.facebook.common.h.a, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
