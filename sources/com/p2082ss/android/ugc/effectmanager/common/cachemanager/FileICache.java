package com.p2082ss.android.ugc.effectmanager.common.cachemanager;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.InputStream;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.cachemanager.FileICache */
public class FileICache implements ICache {
    private String cacheDir;

    static {
        Covode.recordClassIndex(95448);
    }

    public final String getCacheDir() {
        return this.cacheDir;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void clear() {
        FileUtils.INSTANCE.removeDir(this.cacheDir);
    }

    public final void setCacheDir(String str) {
        C89219l.m154719c(str, "");
        this.cacheDir = str;
    }

    public FileICache(String str) {
        C89219l.m154719c(str, "");
        this.cacheDir = str;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public boolean has(String str) {
        C89219l.m154719c(str, "");
        return FileUtils.INSTANCE.checkFileExists(generatePath(str));
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void removePattern(String str) {
        C89219l.m154719c(str, "");
        removePattern(Pattern.compile(str));
    }

    private final String generatePath(String str) {
        return this.cacheDir + File.separator + str;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public InputStream queryToStream(String str) {
        InputStream fileStream;
        MethodCollector.m26663i(7092);
        C89219l.m154719c(str, "");
        String generatePath = generatePath(str);
        synchronized (FileICache.class) {
            try {
                fileStream = FileUtils.INSTANCE.getFileStream(generatePath);
            } finally {
                MethodCollector.m26664o(7092);
            }
        }
        return fileStream;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public String queryToValue(String str) {
        String fileContent;
        MethodCollector.m26663i(6939);
        C89219l.m154719c(str, "");
        String generatePath = generatePath(str);
        synchronized (FileICache.class) {
            try {
                fileContent = FileUtils.INSTANCE.getFileContent(generatePath);
                if (TextUtils.isEmpty(fileContent)) {
                    fileContent = "";
                }
            } finally {
                MethodCollector.m26664o(6939);
            }
        }
        return fileContent;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public boolean remove(String str) {
        boolean removeFile;
        MethodCollector.m26663i(7239);
        C89219l.m154719c(str, "");
        synchronized (FileICache.class) {
            try {
                removeFile = FileUtils.INSTANCE.removeFile(generatePath(str));
            } finally {
                MethodCollector.m26664o(7239);
            }
        }
        return removeFile;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void removePattern(Pattern pattern) {
        MethodCollector.m26663i(7388);
        if (pattern != null) {
            synchronized (FileICache.class) {
                try {
                    File[] listFiles = new File(this.cacheDir).listFiles(new FileICache$removePattern$$inlined$apply$lambda$1(pattern, this));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            m141887x8efe3e82(file);
                        }
                        MethodCollector.m26664o(7388);
                    }
                } finally {
                    MethodCollector.m26664o(7388);
                }
            }
        } else {
            MethodCollector.m26664o(7388);
        }
    }

    /* renamed from: com_ss_android_ugc_effectmanager_common_cachemanager_FileICache_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m141887x8efe3e82(File file) {
        MethodCollector.m26663i(7390);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7390);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7390);
        return delete;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public long save(String str, InputStream inputStream) {
        long writeToExternal;
        MethodCollector.m26663i(6791);
        C89219l.m154719c(str, "");
        C89219l.m154719c(inputStream, "");
        synchronized (FileICache.class) {
            try {
                writeToExternal = FileUtils.INSTANCE.writeToExternal(inputStream, generatePath(str));
            } finally {
                MethodCollector.m26664o(6791);
            }
        }
        return writeToExternal;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public long save(String str, String str2) {
        long writeToExternal;
        MethodCollector.m26663i(6653);
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        synchronized (FileICache.class) {
            try {
                writeToExternal = FileUtils.INSTANCE.writeToExternal(str2, generatePath(str));
            } finally {
                MethodCollector.m26664o(6653);
            }
        }
        return writeToExternal;
    }
}
