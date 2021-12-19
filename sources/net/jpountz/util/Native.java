package net.jpountz.util;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public enum Native {
    ;
    
    private static boolean loaded;

    private static String arch() {
        return System.getProperty("os.arch");
    }

    static {
        Covode.recordClassIndex(106098);
    }

    public static synchronized boolean isLoaded() {
        boolean z;
        synchronized (Native.class) {
            MethodCollector.m26663i(4943);
            z = loaded;
            MethodCollector.m26664o(4943);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.jpountz.util.Native$OS */
    public enum EnumC89962OS {
        WINDOWS("win32", "so"),
        LINUX("linux", "so"),
        MAC("darwin", "dylib"),
        SOLARIS("solaris", "so");
        
        public final String libExtension;
        public final String name;

        static {
            Covode.recordClassIndex(106099);
        }

        private EnumC89962OS(String str, String str2) {
            this.name = str;
            this.libExtension = str2;
        }
    }

    /* renamed from: os */
    private static EnumC89962OS m156092os() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return EnumC89962OS.LINUX;
        }
        if (property.contains("Mac")) {
            return EnumC89962OS.MAC;
        }
        if (property.contains("Windows")) {
            return EnumC89962OS.WINDOWS;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return EnumC89962OS.SOLARIS;
        }
        throw new UnsupportedOperationException("Unsupported operating system: ".concat(String.valueOf(property)));
    }

    private static String resourceName() {
        EnumC89962OS os = m156092os();
        return "/" + Native.class.getPackage().getName().replace('.', '/') + "/" + os.name + "/" + arch() + "/liblz4-java." + os.libExtension;
    }

    public static synchronized void load() {
        File createTempFile;
        FileOutputStream fileOutputStream;
        synchronized (Native.class) {
            MethodCollector.m26663i(5013);
            if (loaded) {
                MethodCollector.m26664o(5013);
                return;
            }
            try {
                m156089x4a508b84("lz4-java");
                loaded = true;
                MethodCollector.m26664o(5013);
            } catch (UnsatisfiedLinkError unused) {
                String resourceName = resourceName();
                InputStream resourceAsStream = Native.class.getResourceAsStream(resourceName);
                if (resourceAsStream != null) {
                    try {
                        createTempFile = File.createTempFile("liblz4-java", "." + m156092os().libExtension);
                        fileOutputStream = new FileOutputStream(createTempFile);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = resourceAsStream.read(bArr);
                            if (read != -1) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                try {
                                    break;
                                } catch (IOException unused2) {
                                }
                            }
                        }
                        fileOutputStream.close();
                        fileOutputStream = null;
                        m156088xe1b3537(createTempFile.getAbsolutePath());
                        loaded = true;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (!createTempFile.exists()) {
                            MethodCollector.m26664o(5013);
                        } else if (!loaded) {
                            m156090x7de0bbfe(createTempFile);
                            MethodCollector.m26664o(5013);
                        } else {
                            m156091xcc95653b(createTempFile);
                            MethodCollector.m26664o(5013);
                        }
                    } catch (IOException unused4) {
                        ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError("Cannot unpack liblz4-java");
                        MethodCollector.m26664o(5013);
                        throw exceptionInInitializerError;
                    }
                } else {
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unsupported OS/arch, cannot find " + resourceName + ". Please try building from source.");
                    MethodCollector.m26664o(5013);
                    throw unsupportedOperationException;
                }
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                if (createTempFile != null && createTempFile.exists()) {
                    if (!loaded) {
                        m156090x7de0bbfe(createTempFile);
                    } else {
                        m156091xcc95653b(createTempFile);
                    }
                }
                MethodCollector.m26664o(5013);
                throw th;
            }
        }
    }

    /* renamed from: net_jpountz_util_Native_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m156089x4a508b84(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38962a(str);
        C58032m.m104852a(uptimeMillis, str);
    }

    /* renamed from: net_jpountz_util_Native_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load */
    public static void m156088xe1b3537(String str) {
        MethodCollector.m26663i(5112);
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        C58032m.m104852a(uptimeMillis, str);
        MethodCollector.m26664o(5112);
    }

    /* renamed from: net_jpountz_util_Native_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m156090x7de0bbfe(File file) {
        MethodCollector.m26663i(5175);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5175);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5175);
        return delete;
    }

    /* renamed from: net_jpountz_util_Native_com_ss_android_ugc_aweme_storage_FileLancet_deleteOnExit */
    public static void m156091xcc95653b(File file) {
        MethodCollector.m26663i(5186);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5186);
                return;
            }
        } catch (Throwable unused) {
        }
        file.deleteOnExit();
        MethodCollector.m26664o(5186);
    }
}
