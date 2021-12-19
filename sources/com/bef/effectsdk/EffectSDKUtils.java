package com.bef.effectsdk;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EffectSDKUtils {
    private static List<String> assetFiles = ModelsList.list;
    private static Set<File> localFiles = new HashSet();
    private static Set<File> needRemoveFiles = new HashSet();

    private static native String nativeGetSdkVersion();

    public static String getSdkVersion() {
        MethodCollector.m26663i(5703);
        String nativeGetSdkVersion = nativeGetSdkVersion();
        MethodCollector.m26664o(5703);
        return nativeGetSdkVersion;
    }

    static {
        Covode.recordClassIndex(2668);
    }

    private static void deleteNoUseModel() {
        for (File file : localFiles) {
            if (needRemoveFiles.contains(file) && file.exists()) {
                m7234xcd12e541(file);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    private static String getAssetRelativePath(String str) {
        int indexOf = str.indexOf("model/");
        if (indexOf >= 0) {
            return str.substring(indexOf + 6, str.length());
        }
        return str;
    }

    private static String getFileName(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1, str.length());
        }
        return "";
    }

    /* renamed from: com_bef_effectsdk_EffectSDKUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m7234xcd12e541(File file) {
        MethodCollector.m26663i(5575);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5575);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5575);
        return delete;
    }

    public static void flushAlgorithmModelFiles(Context context, String str) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, null, false);
        deleteNoUseModel();
        localFiles.clear();
    }

    private static File takeFirstMatchingOrNull(Set<File> set, FileFilter fileFilter) {
        for (File file : set) {
            if (fileFilter.accept(file)) {
                return file;
            }
        }
        return null;
    }

    private static void scanRecursive(String str, Set<File> set) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    scanRecursive(file2.getAbsolutePath(), set);
                } else {
                    set.add(file2);
                }
            }
        }
    }

    public static boolean needUpdate(final Context context, String str) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        try {
            if (assetFiles.size() > localFiles.size()) {
                return true;
            }
            for (final String str2 : assetFiles) {
                if (takeFirstMatchingOrNull(localFiles, new FileFilter() {
                    /* class com.bef.effectsdk.EffectSDKUtils.C23821 */

                    static {
                        Covode.recordClassIndex(2669);
                    }

                    public final boolean accept(File file) {
                        MethodCollector.m26663i(5812);
                        boolean z = false;
                        if (str2.contains(file.getName())) {
                            InputStream inputStream = null;
                            try {
                                inputStream = context.getAssets().open(str2);
                                if (file.length() == ((long) inputStream.available())) {
                                    z = true;
                                }
                                return z;
                            } catch (IOException unused) {
                                return false;
                            } finally {
                                EffectSDKUtils.closeQuietly(inputStream);
                                MethodCollector.m26664o(5812);
                            }
                        } else {
                            MethodCollector.m26664o(5812);
                            return false;
                        }
                    }
                }) == null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    private static void copyFile(Context context, String str, String str2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        MethodCollector.m26663i(5465);
        InputStream inputStream = null;
        try {
            InputStream open = context.getAssets().open(str);
            try {
                String str3 = str2 + str.substring(str.indexOf("model") + 6, str.lastIndexOf("/"));
                File file = new File(str3);
                if (file.exists() || file.mkdirs()) {
                    fileOutputStream = new FileOutputStream(new File(str3 + "/" + getFileName(str)));
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = open.read(bArr);
                            if (read > 0) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                try {
                                    closeQuietly(open);
                                    return;
                                } finally {
                                    closeQuietly(fileOutputStream);
                                    MethodCollector.m26664o(5465);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = open;
                        try {
                            closeQuietly(inputStream);
                            throw th;
                        } finally {
                            closeQuietly(fileOutputStream);
                            MethodCollector.m26664o(5465);
                        }
                    }
                } else {
                    IOException iOException = new IOException("Can not mkdirs " + file.getPath());
                    MethodCollector.m26664o(5465);
                    throw iOException;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                inputStream = open;
                closeQuietly(inputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            closeQuietly(inputStream);
            throw th;
        }
    }

    public static void flushAlgorithmModelFiles(Context context, String str, String[] strArr, boolean z) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, strArr, z);
        deleteNoUseModel();
        localFiles.clear();
    }

    private static void copyAssets(Context context, String str, String[] strArr, boolean z) {
        if (!needRemoveFiles.isEmpty()) {
            needRemoveFiles.clear();
        }
        needRemoveFiles.addAll(localFiles);
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        for (String str2 : assetFiles) {
            final String fileName = getFileName(str2);
            File takeFirstMatchingOrNull = takeFirstMatchingOrNull(needRemoveFiles, new FileFilter() {
                /* class com.bef.effectsdk.EffectSDKUtils.C23832 */

                static {
                    Covode.recordClassIndex(2670);
                }

                public final boolean accept(File file) {
                    return file.getName().contains(fileName);
                }
            });
            if (takeFirstMatchingOrNull == null || !new File(str, getAssetRelativePath(str2)).exists()) {
                if (strArr != null && !TextUtils.isEmpty(fileName)) {
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (!fileName.equals(strArr[i])) {
                            i++;
                        } else if (z) {
                            copyFile(context, str2, str);
                        }
                    }
                }
                if (!z) {
                    copyFile(context, str2, str);
                }
            } else {
                needRemoveFiles.remove(takeFirstMatchingOrNull);
            }
        }
    }
}
