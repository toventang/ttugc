package com.google.android.play.core.p1963b;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.play.core.b.an */
public final class C26896an {
    static {
        Covode.recordClassIndex(32371);
    }

    /* renamed from: a */
    public static <T> C26895am<T> m53408a(Object obj, String str, Class<T> cls) {
        return new C26895am<>(obj, m53414a(obj, str), cls);
    }

    /* renamed from: a */
    public static <R, P0> R m53409a(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(m53413a(m53415a((Class<?>) cls, "isDexOptNeeded", (Class<?>[]) new Class[]{cls3}), (Object) null, new Object[]{p0}));
        } catch (Exception e) {
            throw new C26897ao(C1764a.m5928a("Failed to invoke static method %s on type %s", new Object[]{"isDexOptNeeded", cls}), e);
        }
    }

    /* renamed from: a */
    public static <R, P0, P1> R m53410a(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0, Class<P1> cls4, P1 p1) {
        try {
            return cls2.cast(m53413a(m53415a((Class<?>) cls, "optimizedPathFor", (Class<?>[]) new Class[]{cls3, cls4}), (Object) null, new Object[]{p0, p1}));
        } catch (Exception e) {
            throw new C26897ao(C1764a.m5928a("Failed to invoke static method %s on type %s", new Object[]{"optimizedPathFor", cls}), e);
        }
    }

    /* renamed from: a */
    public static <R, P0> R m53411a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(m53413a(m53416a(obj, str, cls2), obj, new Object[]{p0}));
        } catch (Exception e) {
            throw new C26897ao(C1764a.m5928a("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: a */
    public static <R, P0, P1, P2> R m53412a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(m53413a(m53416a(obj, str, cls2, cls3, cls4), obj, new Object[]{p0, p1, p2}));
        } catch (Exception e) {
            throw new C26897ao(C1764a.m5928a("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: a */
    private static Object m53413a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_google_android_play_core_internal_br_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_google_android_play_core_internal_br_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    private static Field m53414a(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new C26897ao(C1764a.m5928a("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    /* renamed from: a */
    private static Method m53415a(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new C26897ao(C1764a.m5928a("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    /* renamed from: a */
    private static Method m53416a(Object obj, String str, Class<?>... clsArr) {
        return m53415a(obj.getClass(), str, clsArr);
    }

    /* renamed from: a */
    public static void m53417a(PackageManager packageManager, ComponentName componentName, int i) {
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i2 = 0;
                    while (true) {
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i2];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    break;
                                }
                                ComponentInfo componentInfo = componentInfoArr2[i3];
                                if (!componentInfo.name.equals(className)) {
                                    i3++;
                                } else if (componentInfo.isEnabled()) {
                                    return;
                                }
                            }
                        }
                        i2++;
                        if (i2 >= 3) {
                            break;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* renamed from: a */
    public static void m53418a(AbstractC26906ax axVar, InputStream inputStream, OutputStream outputStream, long j) {
        MethodCollector.m26663i(13288);
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(C1764a.m5928a("%x", new Object[]{Integer.valueOf(readInt)}));
            C26905aw awVar = new C26905aw(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
            MethodCollector.m26664o(13288);
            throw awVar;
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j2 = 0;
            while (true) {
                long j3 = j - j2;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        IOException iOException = new IOException("Patch file overrun");
                        MethodCollector.m26664o(13288);
                        throw iOException;
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                m53422a(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                m53422a(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m53421a(bArr, axVar, outputStream, readUnsignedShort, read2, j3);
                                    break;
                                } else {
                                    IOException iOException2 = new IOException("Unexpected end of patch");
                                    MethodCollector.m26664o(13288);
                                    throw iOException2;
                                }
                            case 250:
                                read2 = dataInputStream.readUnsignedShort();
                                m53421a(bArr, axVar, outputStream, (long) dataInputStream.readUnsignedShort(), read2, j3);
                                break;
                            case 251:
                                read2 = dataInputStream.readInt();
                                m53421a(bArr, axVar, outputStream, (long) dataInputStream.readUnsignedShort(), read2, j3);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m53421a(bArr, axVar, outputStream, readInt2, read2, j3);
                                    break;
                                } else {
                                    IOException iOException3 = new IOException("Unexpected end of patch");
                                    MethodCollector.m26664o(13288);
                                    throw iOException3;
                                }
                            case 253:
                                read2 = dataInputStream.readUnsignedShort();
                                m53421a(bArr, axVar, outputStream, (long) dataInputStream.readInt(), read2, j3);
                                break;
                            case 254:
                                read2 = dataInputStream.readInt();
                                m53421a(bArr, axVar, outputStream, (long) dataInputStream.readInt(), read2, j3);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                m53421a(bArr, axVar, outputStream, readLong, read2, j3);
                                break;
                            default:
                                m53422a(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                        }
                        j2 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    outputStream.flush();
                    MethodCollector.m26664o(13288);
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(read);
            C26905aw awVar2 = new C26905aw(sb.toString());
            MethodCollector.m26664o(13288);
            throw awVar2;
        }
    }

    /* renamed from: a */
    public static <T> void m53419a(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static <T> void m53420a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    /* renamed from: a */
    private static void m53421a(byte[] bArr, AbstractC26906ax axVar, OutputStream outputStream, long j, int i, long j2) {
        int i2 = i;
        MethodCollector.m26663i(13215);
        if (i2 < 0) {
            IOException iOException = new IOException("copyLength negative");
            MethodCollector.m26664o(13215);
            throw iOException;
        } else if (j >= 0) {
            long j3 = (long) i2;
            if (j3 <= j2) {
                try {
                    InputStream b = new C26907ay(axVar, j, j3).mo44592b();
                    while (i2 > 0) {
                        try {
                            int min = Math.min(i2, 16384);
                            int i3 = 0;
                            while (i3 < min) {
                                int read = b.read(bArr, i3, min - i3);
                                if (read != -1) {
                                    i3 += read;
                                } else {
                                    IOException iOException2 = new IOException("truncated input stream");
                                    MethodCollector.m26664o(13215);
                                    throw iOException2;
                                }
                            }
                            outputStream.write(bArr, 0, min);
                            i2 -= min;
                        } catch (Throwable th) {
                            C26915bf.m53466a(th, th);
                        }
                    }
                    b.close();
                    MethodCollector.m26664o(13215);
                    return;
                } catch (EOFException e) {
                    IOException iOException3 = new IOException("patch underrun", e);
                    MethodCollector.m26664o(13215);
                    throw iOException3;
                }
            } else {
                IOException iOException4 = new IOException("Output length overrun");
                MethodCollector.m26664o(13215);
                throw iOException4;
            }
        } else {
            IOException iOException5 = new IOException("inputOffset negative");
            MethodCollector.m26664o(13215);
            throw iOException5;
        }
        MethodCollector.m26664o(13215);
        throw th;
    }

    /* renamed from: a */
    private static void m53422a(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) {
        MethodCollector.m26663i(13214);
        if (i < 0) {
            IOException iOException = new IOException("copyLength negative");
            MethodCollector.m26664o(13214);
            throw iOException;
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException unused) {
                    IOException iOException2 = new IOException("patch underrun");
                    MethodCollector.m26664o(13214);
                    throw iOException2;
                }
            }
            MethodCollector.m26664o(13214);
        } else {
            IOException iOException3 = new IOException("Output length overrun");
            MethodCollector.m26664o(13214);
            throw iOException3;
        }
    }

    /* renamed from: b */
    public static <T> C26895am m53423b(Object obj, String str, Class<T> cls) {
        return new C26895am(obj, m53414a(obj, str), cls, (byte) 0);
    }
}
