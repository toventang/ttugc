package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public final class MultiDex {
    private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));
    private static final Set<File> installedApk = new HashSet();

    /* renamed from: androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m4102x41ff6b5e(String str, String str2) {
        return 0;
    }

    /* renamed from: androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m4103x41ff6b5e(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m4104x41ff6b62(String str, String str2) {
        return 0;
    }

    /* renamed from: androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m4105x41ff6b70(String str, String str2) {
        return 0;
    }

    /* renamed from: androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m4106x41ff6b70(String str, String str2, Throwable th) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static final class V19 {
        static {
            Covode.recordClassIndex(1453);
        }

        /* renamed from: androidx_multidex_MultiDex$V19_com_ss_android_ugc_aweme_lancet_LogLancet_w */
        public static int m4109x5a1be64a(String str, String str2, Throwable th) {
            return 0;
        }

        private V19() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list, File file) {
            Object obj;
            Object obj2 = MultiDex.findField(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            MultiDex.expandFieldArray(obj2, "dexElements", makeDexElements(obj2, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m4109x5a1be64a("MultiDex", "Exception in makeDexElement", (Throwable) it.next());
                }
                Field findField = MultiDex.findField(obj2, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr = (IOException[]) findField.get(obj2);
                if (iOExceptionArr == null) {
                    obj = arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    obj = new IOException[(arrayList.size() + iOExceptionArr.length)];
                    arrayList.toArray(obj);
                    System.arraycopy(iOExceptionArr, 0, obj, arrayList.size(), iOExceptionArr.length);
                }
                findField.set(obj2, obj);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) MultiDex.findMethod(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* renamed from: androidx.multidex.MultiDex$V4 */
    static final class C1333V4 {
        static {
            Covode.recordClassIndex(1454);
        }

        private C1333V4() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field findField = MultiDex.findField(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) findField.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':').append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            findField.set(classLoader, sb.toString());
            MultiDex.expandFieldArray(classLoader, "mPaths", strArr);
            MultiDex.expandFieldArray(classLoader, "mFiles", fileArr);
            MultiDex.expandFieldArray(classLoader, "mZips", zipFileArr);
            MultiDex.expandFieldArray(classLoader, "mDexs", dexFileArr);
        }
    }

    private MultiDex() {
    }

    static final class V14 {
        private static final int EXTRACTED_SUFFIX_LENGTH = 4;
        private final ElementConstructor elementConstructor;

        /* access modifiers changed from: package-private */
        public interface ElementConstructor {
            static {
                Covode.recordClassIndex(1449);
            }

            Object newInstance(File file, DexFile dexFile);
        }

        /* renamed from: androidx_multidex_MultiDex$V14_com_ss_android_ugc_aweme_lancet_LogLancet_w */
        public static int m4108x54f819c5(String str, String str2, Throwable th) {
            return 0;
        }

        static {
            Covode.recordClassIndex(1448);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private V14() {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r1 = java.lang.Class.forName(r0)
                androidx.multidex.MultiDex$V14$ICSElementConstructor r0 = new androidx.multidex.MultiDex$V14$ICSElementConstructor     // Catch:{ NoSuchMethodException -> 0x000f }
                r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                androidx.multidex.MultiDex$V14$JBMR11ElementConstructor r0 = new androidx.multidex.MultiDex$V14$JBMR11ElementConstructor     // Catch:{ NoSuchMethodException -> 0x0015 }
                r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                androidx.multidex.MultiDex$V14$JBMR2ElementConstructor r0 = new androidx.multidex.MultiDex$V14$JBMR2ElementConstructor
                r0.<init>(r1)
            L_0x001a:
                r2.elementConstructor = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDex.V14.<init>():void");
        }

        static class ICSElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            static {
                Covode.recordClassIndex(1450);
            }

            ICSElementConstructor(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        static class JBMR11ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            static {
                Covode.recordClassIndex(1451);
            }

            JBMR11ElementConstructor(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(file, file, dexFile);
            }
        }

        static class JBMR2ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            static {
                Covode.recordClassIndex(1452);
            }

            JBMR2ElementConstructor(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        private Object[] makeDexElements(List<? extends File> list) {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.elementConstructor.newInstance(file, DexFile.loadDex(file.getPath(), optimizedPathFor(file), 0));
            }
            return objArr;
        }

        private static String optimizedPathFor(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - EXTRACTED_SUFFIX_LENGTH) + ".dex").getPath();
        }

        static void install(ClassLoader classLoader, List<? extends File> list) {
            Object obj = MultiDex.findField(classLoader, "pathList").get(classLoader);
            Object[] makeDexElements = new V14().makeDexElements(list);
            try {
                MultiDex.expandFieldArray(obj, "dexElements", makeDexElements);
            } catch (NoSuchFieldException e) {
                m4108x54f819c5("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
                MultiDex.expandFieldArray(obj, "pathElements", makeDexElements);
            }
        }
    }

    static {
        Covode.recordClassIndex(1447);
    }

    private static ApplicationInfo getApplicationInfo(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            m4106x41ff6b70("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    /* renamed from: androidx_multidex_MultiDex_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m4101x92467f0(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: androidx_multidex_MultiDex_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m4107x47143ef0(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    public static void install(Context context) {
        m4104x41ff6b62("MultiDex", "Installing application");
        if (IS_VM_MULTIDEX_CAPABLE) {
            m4104x41ff6b62("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            ApplicationInfo applicationInfo = getApplicationInfo(context);
            if (applicationInfo == null) {
                m4104x41ff6b62("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            doInstallation(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
            m4104x41ff6b62("MultiDex", "install done");
        } catch (Exception e) {
            m4103x41ff6b5e("MultiDex", "MultiDex installation failure", e);
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    static boolean isVMMultidexCapable(String str) {
        String str2;
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder append = new StringBuilder("VM with version ").append(str);
        if (z) {
            str2 = " has multidex support";
        } else {
            str2 = " does not have multidex support";
        }
        m4104x41ff6b62("MultiDex", append.append(str2).toString());
        return z;
    }

    private static void clearOldDexDir(Context context) {
        File file = new File(m4101x92467f0(context), "secondary-dexes");
        if (file.isDirectory()) {
            m4104x41ff6b62("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                m4105x41ff6b70("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                m4104x41ff6b62("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!m4107x47143ef0(file2)) {
                    m4105x41ff6b70("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    m4104x41ff6b62("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!m4107x47143ef0(file)) {
                m4105x41ff6b70("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
            } else {
                m4104x41ff6b62("MultiDex", "Deleted old secondary dex dir " + file.getPath());
            }
        }
    }

    private static void mkdirChecked(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                m4102x41ff6b5e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                m4102x41ff6b5e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }

    public static Field findField(Object obj, String str) {
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
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static void installInstrumentation(Context context, Context context2) {
        m4104x41ff6b62("MultiDex", "Installing instrumentation");
        if (IS_VM_MULTIDEX_CAPABLE) {
            m4104x41ff6b62("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            ApplicationInfo applicationInfo = getApplicationInfo(context);
            if (applicationInfo == null) {
                m4104x41ff6b62("MultiDex", "No ApplicationInfo available for instrumentation, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            ApplicationInfo applicationInfo2 = getApplicationInfo(context2);
            if (applicationInfo2 == null) {
                m4104x41ff6b62("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            String str = context.getPackageName() + ".";
            File file = new File(applicationInfo2.dataDir);
            doInstallation(context2, new File(applicationInfo.sourceDir), file, str + "secondary-dexes", str, false);
            doInstallation(context2, new File(applicationInfo2.sourceDir), file, "secondary-dexes", "", false);
            m4104x41ff6b62("MultiDex", "Installation done");
        } catch (Exception e) {
            m4103x41ff6b5e("MultiDex", "MultiDex installation failure", e);
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    private static void installSecondaryDexes(ClassLoader classLoader, File file, List<? extends File> list) {
        if (!list.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            V19.install(classLoader, list, file);
        }
    }

    private static File getDexDir(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            mkdirChecked(file2);
        } catch (IOException unused) {
            file2 = new File(m4101x92467f0(context), "code_cache");
            mkdirChecked(file2);
        }
        File file3 = new File(file2, str);
        mkdirChecked(file3);
        return file3;
    }

    public static void expandFieldArray(Object obj, String str, Object[] objArr) {
        Field findField = findField(obj, str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        findField.set(obj, objArr3);
    }

    public static Method findMethod(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    private static void doInstallation(Context context, File file, File file2, String str, String str2, boolean z) {
        Set<File> set = installedApk;
        synchronized (set) {
            if (!set.contains(file)) {
                set.add(file);
                if (Build.VERSION.SDK_INT > 20) {
                    m4105x41ff6b70("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                }
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (classLoader == null) {
                        m4102x41ff6b5e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                        return;
                    }
                    try {
                        clearOldDexDir(context);
                    } catch (Throwable th) {
                        m4106x41ff6b70("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                    }
                    File dexDir = getDexDir(context, file2, str);
                    MultiDexExtractor multiDexExtractor = new MultiDexExtractor(file, dexDir);
                    try {
                        try {
                            installSecondaryDexes(classLoader, dexDir, multiDexExtractor.load(context, str2, false));
                        } catch (IOException e) {
                            if (z) {
                                m4106x41ff6b70("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e);
                                installSecondaryDexes(classLoader, dexDir, multiDexExtractor.load(context, str2, true));
                            } else {
                                throw e;
                            }
                        }
                        try {
                        } catch (IOException e2) {
                            throw e2;
                        }
                    } finally {
                        try {
                            multiDexExtractor.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (RuntimeException e3) {
                    m4106x41ff6b70("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e3);
                }
            }
        }
    }
}
