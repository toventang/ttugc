package com.bytedance.common.p894a.p896b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dalvik.system.DexFile;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.common.a.b.c */
public final class C13487c {

    /* renamed from: a */
    static Constructor<?> f32843a;

    static {
        Covode.recordClassIndex(15495);
    }

    /* renamed from: a */
    public static DexFile m24252a(byte[] bArr) {
        if (f32843a == null) {
            f32843a = m24253a(DexFile.class, ByteBuffer.class);
        }
        return (DexFile) f32843a.newInstance(ByteBuffer.wrap(bArr));
    }

    /* renamed from: a */
    public static List<DexFile> m24254a(String str) {
        MethodCollector.m26663i(1670);
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        try {
            byte[] bArr = new byte[1024];
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                if (!nextEntry.isDirectory() && nextEntry.getName().startsWith("classes") && nextEntry.getName().endsWith("dex")) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
                    while (true) {
                        int read = zipInputStream.read(bArr, 0, 1024);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    DexFile a = m24252a(byteArrayOutputStream.toByteArray());
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            zipInputStream.close();
            MethodCollector.m26664o(1670);
            return arrayList;
        } catch (Throwable th) {
            try {
                zipInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            MethodCollector.m26664o(1670);
            throw th;
        }
    }

    /* renamed from: a */
    private static Constructor<?> m24253a(Class<?> cls, Class<?> cls2) {
        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
        declaredMethod.setAccessible(true);
        Constructor<?> constructor = (Constructor) declaredMethod.invoke(cls, new Class[]{cls2});
        if (constructor != null && !constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        return constructor;
    }
}
