package com.bytedance.geckox.utils;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileLock {

    /* renamed from: a */
    private static final Map<String, Integer> f36772a = new HashMap();

    /* renamed from: b */
    private final int f36773b;

    /* renamed from: c */
    private final String f36774c;

    private static native int nGetFD(String str);

    private static native void nLockFile(int i);

    private static native void nLockFileSegment(int i, int i2);

    private static native void nRelease(int i);

    private static native boolean nTryLock(int i);

    private static native void nUnlockFile(int i);

    static {
        Covode.recordClassIndex(17211);
        C15057h.m27722a("file_lock");
    }

    /* renamed from: a */
    public final void mo24325a() {
        MethodCollector.m26663i(3985);
        try {
            nUnlockFile(this.f36773b);
            MethodCollector.m26664o(3985);
        } catch (Exception unused) {
            RuntimeException runtimeException = new RuntimeException("release lock failed，path:" + this.f36774c);
            MethodCollector.m26664o(3985);
            throw runtimeException;
        }
    }

    /* renamed from: b */
    public final void mo24326b() {
        Integer remove;
        MethodCollector.m26663i(3993);
        Map<String, Integer> map = f36772a;
        synchronized (map) {
            try {
                remove = map.remove(this.f36774c);
            } catch (Throwable th) {
                MethodCollector.m26664o(3993);
                throw th;
            }
        }
        try {
            nRelease(remove.intValue());
            MethodCollector.m26664o(3993);
        } catch (Exception e) {
            RuntimeException runtimeException = new RuntimeException("release lock failed, file:" + this.f36774c + " caused by:" + e.getMessage());
            MethodCollector.m26664o(3993);
            throw runtimeException;
        }
    }

    /* renamed from: d */
    private static int m27699d(String str) {
        Integer num;
        MethodCollector.m26663i(3983);
        Map<String, Integer> map = f36772a;
        synchronized (map) {
            try {
                num = map.get(str);
                if (num == null) {
                    new File(str).getParentFile().mkdirs();
                    num = Integer.valueOf(nGetFD(str));
                    map.put(str, num);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(3983);
                throw th;
            }
        }
        int intValue = num.intValue();
        MethodCollector.m26664o(3983);
        return intValue;
    }

    /* renamed from: a */
    public static FileLock m27695a(String str) {
        MethodCollector.m26663i(3916);
        try {
            int d = m27699d(str);
            nLockFile(d);
            FileLock fileLock = new FileLock(str, d);
            MethodCollector.m26664o(3916);
            return fileLock;
        } catch (Exception e) {
            RuntimeException runtimeException = new RuntimeException("lock failed, file:" + str + ", pid:" + Process.myPid() + " caused by:" + e.getMessage());
            MethodCollector.m26664o(3916);
            throw runtimeException;
        }
    }

    /* renamed from: b */
    public static FileLock m27697b(String str) {
        MethodCollector.m26663i(3921);
        try {
            int d = m27699d(str);
            if (!nTryLock(d)) {
                MethodCollector.m26664o(3921);
                return null;
            }
            FileLock fileLock = new FileLock(str, d);
            MethodCollector.m26664o(3921);
            return fileLock;
        } catch (Exception e) {
            RuntimeException runtimeException = new RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
            MethodCollector.m26664o(3921);
            throw runtimeException;
        }
    }

    /* renamed from: c */
    public static FileLock m27698c(String str) {
        MethodCollector.m26663i(3930);
        try {
            int d = m27699d(str);
            if (!nTryLock(d)) {
                new FileLock(str, d).mo24326b();
                MethodCollector.m26664o(3930);
                return null;
            }
            FileLock fileLock = new FileLock(str, d);
            MethodCollector.m26664o(3930);
            return fileLock;
        } catch (Exception e) {
            RuntimeException runtimeException = new RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
            MethodCollector.m26664o(3930);
            throw runtimeException;
        }
    }

    private FileLock(String str, int i) {
        this.f36774c = str;
        this.f36773b = i;
    }

    /* renamed from: a */
    public static FileLock m27696a(String str, int i) {
        MethodCollector.m26663i(3936);
        try {
            int d = m27699d(str);
            nLockFileSegment(d, i);
            FileLock fileLock = new FileLock(str, d);
            MethodCollector.m26664o(3936);
            return fileLock;
        } catch (Exception e) {
            RuntimeException runtimeException = new RuntimeException("lock segment failed, file:" + str + " caused by:" + e.getMessage());
            MethodCollector.m26664o(3936);
            throw runtimeException;
        }
    }
}
