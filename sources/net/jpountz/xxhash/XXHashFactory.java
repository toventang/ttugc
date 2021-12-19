package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Random;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;
import net.jpountz.xxhash.StreamingXXHash32;
import net.jpountz.xxhash.StreamingXXHash64;

public final class XXHashFactory {
    private static XXHashFactory JAVA_SAFE_INSTANCE;
    private static XXHashFactory JAVA_UNSAFE_INSTANCE;
    private static XXHashFactory NATIVE_INSTANCE;
    private final XXHash32 hash32;
    private final XXHash64 hash64;
    private final String impl;
    private final StreamingXXHash32.Factory streamingHash32Factory;
    private final StreamingXXHash64.Factory streamingHash64Factory;

    static {
        Covode.recordClassIndex(106132);
    }

    public final XXHash32 hash32() {
        return this.hash32;
    }

    public final XXHash64 hash64() {
        return this.hash64;
    }

    public static XXHashFactory fastestJavaInstance() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return safeInstance();
        }
        try {
            return unsafeInstance();
        } catch (Throwable unused) {
            return safeInstance();
        }
    }

    public static synchronized XXHashFactory nativeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            MethodCollector.m26663i(7655);
            if (NATIVE_INSTANCE == null) {
                NATIVE_INSTANCE = instance("JNI");
            }
            xXHashFactory = NATIVE_INSTANCE;
            MethodCollector.m26664o(7655);
        }
        return xXHashFactory;
    }

    public static synchronized XXHashFactory safeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            MethodCollector.m26663i(7656);
            if (JAVA_SAFE_INSTANCE == null) {
                JAVA_SAFE_INSTANCE = instance("JavaSafe");
            }
            xXHashFactory = JAVA_SAFE_INSTANCE;
            MethodCollector.m26664o(7656);
        }
        return xXHashFactory;
    }

    public static synchronized XXHashFactory unsafeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            MethodCollector.m26663i(7657);
            if (JAVA_UNSAFE_INSTANCE == null) {
                JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
            }
            xXHashFactory = JAVA_UNSAFE_INSTANCE;
            MethodCollector.m26664o(7657);
        }
        return xXHashFactory;
    }

    public static XXHashFactory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + ":" + this.impl;
    }

    public final StreamingXXHash32 newStreamingHash32(int i) {
        return this.streamingHash32Factory.newStreamingHash(i);
    }

    public final StreamingXXHash64 newStreamingHash64(long j) {
        return this.streamingHash64Factory.newStreamingHash(j);
    }

    private static XXHashFactory instance(String str) {
        try {
            return new XXHashFactory(str);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    private static <T> T classInstance(String str) {
        ClassLoader classLoader = XXHashFactory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static void main(String[] strArr) {
        System.out.println("Fastest instance is " + fastestInstance());
        System.out.println("Fastest Java instance is " + fastestJavaInstance());
    }

    private XXHashFactory(String str) {
        this.impl = str;
        XXHash32 xXHash32 = (XXHash32) classInstance("net.jpountz.xxhash.XXHash32".concat(String.valueOf(str)));
        this.hash32 = xXHash32;
        this.streamingHash32Factory = (StreamingXXHash32.Factory) classInstance("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory");
        XXHash64 xXHash64 = (XXHash64) classInstance("net.jpountz.xxhash.XXHash64".concat(String.valueOf(str)));
        this.hash64 = xXHash64;
        this.streamingHash64Factory = (StreamingXXHash64.Factory) classInstance("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory");
        byte[] bArr = new byte[100];
        Random random = new Random();
        random.nextBytes(bArr);
        int nextInt = random.nextInt();
        int hash = xXHash32.hash(bArr, 0, 100, nextInt);
        StreamingXXHash32 newStreamingHash32 = newStreamingHash32(nextInt);
        newStreamingHash32.update(bArr, 0, 100);
        int value = newStreamingHash32.getValue();
        long j = (long) nextInt;
        long hash2 = xXHash64.hash(bArr, 0, 100, j);
        StreamingXXHash64 newStreamingHash64 = newStreamingHash64(j);
        newStreamingHash64.update(bArr, 0, 100);
        long value2 = newStreamingHash64.getValue();
        if (hash != value) {
            throw new AssertionError();
        } else if (hash2 != value2) {
            throw new AssertionError();
        }
    }
}
