package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1733u.C23435d;
import com.bytedance.p1733u.EnumC23438f;
import com.bytedance.refcache.FileLocker;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p2001c.C27512l;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.experiment.p2914a.C46680a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.services.external.ICacheService;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.musicprovider.C84158e;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.am */
public final class C73955am {

    /* renamed from: a */
    public static volatile boolean f166030a;

    /* renamed from: b */
    public static String f166031b;

    /* renamed from: c */
    private static String f166032c;

    /* renamed from: d */
    private static File f166033d;

    /* renamed from: e */
    private static File f166034e;

    static {
        Covode.recordClassIndex(86705);
    }

    /* renamed from: a */
    static void m130058a(File[] fileArr, Set<String> set) {
        if (!(fileArr == null || fileArr.length == 0)) {
            for (File file : fileArr) {
                if (f166030a) {
                    if (file != null && file.exists()) {
                        String absolutePath = file.getAbsolutePath();
                        if (TextUtils.isEmpty(absolutePath)) {
                            return;
                        }
                        if (file.isFile()) {
                            if (!set.contains(absolutePath) && (absolutePath.endsWith(".mp4") || absolutePath.endsWith(".mp3") || absolutePath.endsWith(".wav") || absolutePath.endsWith("-concat-v") || absolutePath.endsWith("-concat-a") || absolutePath.endsWith("_synthetise"))) {
                                C80720e.m139931c(absolutePath);
                            }
                        } else if (!set.contains(file.getName()) && !set.contains(file.getAbsolutePath())) {
                            m130058a(file.listFiles(), set);
                            if (file.length() == 0) {
                                m130059a(file);
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m130057a(List<File> list) {
        if (list != null && list.size() > 0) {
            for (File file : list) {
                if (file != null && file.exists()) {
                    file.getAbsolutePath();
                    if (FileLocker.m41317a(file.getAbsolutePath())) {
                        file.getAbsolutePath();
                    } else {
                        m130059a(file);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m130059a(File file) {
        MethodCollector.m26663i(7975);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7975);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7975);
        return delete;
    }

    /* renamed from: a */
    public static void m130053a() {
        C29339a.m58752a(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am.RunnableC739561 */

            /* renamed from: a */
            final /* synthetic */ boolean f166035a = true;

            static {
                Covode.recordClassIndex(86706);
            }

            public final void run() {
                String str;
                File[] listFiles;
                C33830n.m70668a("aweme_clean_cached_files", new C33743c().mo59971a("force", (Boolean) false).mo59977a());
                boolean z = this.f166035a;
                if (!C73955am.f166030a) {
                    try {
                        str = AVExternalServiceImpl.m113114a().configService().cacheConfig().rootDir();
                    } catch (Exception unused) {
                        str = "";
                    }
                    File file = new File(str);
                    if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                        if (z || C80720e.m139933d(str) >= 52428800) {
                            C73955am.f166030a = true;
                            C73955am.m130058a(listFiles, C73955am.m130061b());
                            C73955am.f166030a = false;
                        }
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public static File m130065c() {
        File file = f166033d;
        if (file != null) {
            return file;
        }
        File b = C23435d.m44117b(C17867d.m33078a(), EnumC23438f.PREFER_SD_CARD);
        if (b == null) {
            File b2 = C80720e.m139923b();
            f166033d = b2;
            return b2;
        }
        File file2 = new File(b, "picture");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        file2.getAbsolutePath();
        f166033d = file2;
        return file2;
    }

    /* renamed from: e */
    private static List<File> m130074e() {
        ICacheService iCacheService;
        String str = null;
        try {
            iCacheService = AVExternalServiceImpl.m113114a().configService().cacheConfig();
        } catch (Exception unused) {
            iCacheService = null;
        }
        if (iCacheService == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        try {
            str = iCacheService.compatMusDraftDir();
        } catch (Exception unused2) {
        }
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                ArrayList arrayList2 = new ArrayList();
                m130056a(file, arrayList2);
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Set<String> m130061b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(m130070d());
        if (f166031b == null) {
            f166031b = Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/Camera/";
        }
        hashSet.add(new File(f166031b).getAbsolutePath());
        hashSet.add(m130050a(C17867d.m33078a(), (String) null) + "/splashad");
        hashSet.add(C80720e.m139928c(C17867d.m33078a()).getPath() + "/LiveWallpaper");
        Collection a = C27512l.m54996a((Collection) hashSet, (AbstractC27235f) new AbstractC27235f<String, String>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am.C739572 */

            static {
                Covode.recordClassIndex(86707);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.p1998c.p1999a.AbstractC27235f
            /* renamed from: a */
            public final /* synthetic */ String mo45319a(String str) {
                return str.replaceFirst("/data/data/", "/data/user/0/");
            }
        });
        Collection a2 = C27512l.m54996a((Collection) hashSet, (AbstractC27235f) new AbstractC27235f<String, String>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am.C739583 */

            static {
                Covode.recordClassIndex(86708);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.p1998c.p1999a.AbstractC27235f
            /* renamed from: a */
            public final /* synthetic */ String mo45319a(String str) {
                return str.replaceFirst("/data/user/0/", "/data/data/");
            }
        });
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(hashSet);
        hashSet2.addAll(a);
        hashSet2.addAll(a2);
        return hashSet2;
    }

    /* renamed from: d */
    private static Set<String> m130070d() {
        ICacheService iCacheService;
        HashSet hashSet = new HashSet();
        try {
            iCacheService = AVExternalServiceImpl.m113114a().configService().cacheConfig();
        } catch (Exception unused) {
            iCacheService = null;
        }
        if (iCacheService == null) {
            return hashSet;
        }
        if (C46680a.m90086a()) {
            hashSet.addAll(iCacheService.allowList());
        } else {
            hashSet.addAll(iCacheService.draftAllowList());
        }
        hashSet.addAll(iCacheService.tempVideoFile());
        hashSet.addAll(iCacheService.originSoundFile());
        hashSet.add(iCacheService.mvRootDir());
        return hashSet;
    }

    /* renamed from: a */
    public static File m130049a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: b */
    public static File m130060b(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: c */
    public static File m130066c(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: e */
    public static String m130073e(Context context) {
        return m130069d(context) + "tmp/";
    }

    /* renamed from: f */
    public static String m130076f(Context context) {
        return m130069d(context) + "pic/";
    }

    /* renamed from: g */
    public static String m130077g(Context context) {
        return m130069d(context) + "out/";
    }

    /* renamed from: i */
    private static File m130079i(Context context) {
        File a;
        if (context == null || (a = m130049a(context)) == null || !a.exists()) {
            return null;
        }
        return new File(a.getAbsolutePath() + File.separator + "music/download");
    }

    /* renamed from: j */
    private static File m130080j(Context context) {
        File a;
        if (context == null || (a = m130049a(context)) == null || !a.exists()) {
            return null;
        }
        return new File(a.getAbsolutePath() + File.separator + "music/rhythm");
    }

    /* renamed from: d */
    public static String m130069d(Context context) {
        String path;
        if (context == null) {
            return "";
        }
        String str = f166032c;
        if (str != null && !str.isEmpty()) {
            return f166032c;
        }
        File a = C23435d.m44110a(context, EnumC23438f.PREFER_SD_CARD);
        if (a != null) {
            path = a.getPath();
        } else if (m130050a(context, (String) null) == null) {
            path = Environment.getExternalStorageDirectory().getPath();
        } else {
            path = m130050a(context, (String) null).getPath();
        }
        String str2 = path + "/share/";
        f166032c = str2;
        return str2;
    }

    /* renamed from: h */
    public static File m130078h(Context context) {
        File file = f166034e;
        if (file != null) {
            return file;
        }
        File a = C23435d.m44110a(context, EnumC23438f.PREFER_SD_CARD);
        if (a == null) {
            try {
                f166034e = m130050a(context, "logs");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (f166034e == null) {
                f166034e = new File(m130049a(context), "logs");
            }
            if (!f166034e.exists()) {
                f166034e.mkdirs();
            }
            return f166034e;
        }
        File file2 = new File(a, "logs");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        file2.getAbsolutePath();
        f166034e = file2;
        return file2;
    }

    /* renamed from: a */
    public static void m130054a(int i) {
        File[] fileArr = null;
        try {
            ICacheService cacheConfig = AVExternalServiceImpl.m113114a().configService().cacheConfig();
            if (cacheConfig != null) {
                try {
                    fileArr = cacheConfig.tempDuetFile();
                } catch (Throwable unused) {
                }
                m130057a(m130052a(fileArr, i * 2));
                try {
                    fileArr = cacheConfig.rawDuetFile();
                } catch (Throwable unused2) {
                }
                m130064b(m130052a(fileArr, i));
            }
        } catch (Exception unused3) {
        }
    }

    /* renamed from: b */
    private static void m130064b(List<File> list) {
        if (list != null && list.size() > 0) {
            Set<String> b = m130061b();
            for (File file : list) {
                if (file != null && file.exists() && !b.contains(file.getAbsolutePath())) {
                    if (FileLocker.m41317a(file.getAbsolutePath())) {
                        file.getAbsolutePath();
                    } else {
                        m130059a(file);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static File m130050a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    /* renamed from: b */
    public static void m130062b(Context context, int i) {
        ArrayList arrayList = new ArrayList();
        if (context != null) {
            if (m130049a(context) != null) {
                arrayList.addAll(m130067c(m130049a(context), i));
            }
            try {
                if (m130050a(context, (String) null) != null) {
                    arrayList.addAll(m130067c(m130050a(context, (String) null), i));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        arrayList.addAll(m130074e());
        m130064b(arrayList);
    }

    /* renamed from: d */
    public static void m130071d(Context context, int i) {
        File e;
        if (context != null && (e = C80937s.m140453b().mo124062a(AbstractC80918i.EnumC80919a.VideoCache).mo124023e()) != null && e.exists()) {
            m130057a(m130051a(e, i));
        }
    }

    /* renamed from: a */
    public static List<File> m130051a(File file, int i) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            List asList = Arrays.asList(listFiles);
            Collections.sort(asList, C73960an.f166036a);
            if (asList.size() > i) {
                return asList.subList(0, asList.size() - i);
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: b */
    private static void m130063b(File file, int i) {
        File[] listFiles;
        File file2 = new File(file.getAbsolutePath() + File.separator + "cache");
        if (file2.exists() && (listFiles = file2.listFiles(new FileFilter() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am.C739594 */

            static {
                Covode.recordClassIndex(86709);
            }

            public final boolean accept(File file) {
                if (file == null || !file.getName().endsWith("-concat-v")) {
                    return false;
                }
                return true;
            }
        })) != null && listFiles.length > 0) {
            m130064b(m130052a(listFiles, i));
        }
    }

    /* renamed from: c */
    private static List<File> m130067c(File file, int i) {
        ICacheService iCacheService;
        File[] fileArr;
        File[] fileArr2;
        File[] fileArr3;
        List<File> a;
        if (!file.exists()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArr4 = null;
        try {
            iCacheService = AVExternalServiceImpl.m113114a().configService().cacheConfig();
        } catch (Throwable unused) {
            iCacheService = null;
        }
        if (iCacheService == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            fileArr = iCacheService.rawVideoFile();
        } catch (Exception unused2) {
            fileArr = null;
        }
        if (!(fileArr == null || (a = m130052a(fileArr, i * 2)) == null)) {
            arrayList.addAll(a);
        }
        try {
            fileArr2 = iCacheService.voiceFile();
        } catch (Exception unused3) {
            fileArr2 = null;
        }
        List<File> a2 = m130052a(fileArr2, i);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        try {
            fileArr3 = iCacheService.outputFile();
        } catch (Exception unused4) {
            fileArr3 = null;
        }
        List<File> a3 = m130052a(fileArr3, i);
        if (a3 != null) {
            arrayList.addAll(a3);
        }
        try {
            fileArr4 = iCacheService.synthesisFile();
        } catch (Exception unused5) {
        }
        List<File> a4 = m130052a(fileArr4, i);
        if (a4 != null) {
            arrayList.addAll(a4);
        }
        File file2 = new File(C84158e.m144733a().mo128988c());
        if (file2.exists() && m130051a(file2, i * 2) != null) {
            arrayList.addAll(a4);
        }
        return arrayList;
    }

    /* renamed from: e */
    public static void m130075e(Context context, int i) {
        File i2;
        if (context != null && (i2 = m130079i(context)) != null) {
            if (i2.exists()) {
                m130057a(m130051a(i2, i));
            }
            File j = m130080j(context);
            if (j != null && j.exists()) {
                m130057a(m130051a(j, i));
            }
        }
    }

    /* renamed from: a */
    private static List<File> m130052a(File[] fileArr, int i) {
        if (fileArr != null && fileArr.length > 0) {
            List asList = Arrays.asList(fileArr);
            Collections.sort(asList, C73961ao.f166037a);
            if (asList.size() > i) {
                return asList.subList(0, asList.size() - i);
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: c */
    public static void m130068c(Context context, int i) {
        if (context != null) {
            if (m130049a(context) != null) {
                m130063b(m130049a(context), i);
            }
            try {
                if (m130050a(context, (String) null) != null) {
                    m130063b(m130050a(context, (String) null), i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private static void m130072d(File file, int i) {
        m130057a(m130051a(new File(file, "out"), i));
        m130057a(m130051a(new File(file, "tmp"), i));
        m130057a(m130051a(new File(file, "pic"), i));
    }

    /* renamed from: a */
    public static void m130055a(Context context, int i) {
        try {
            Boolean cleanShareFiles = C52912c.f121688a.f121689b.getCleanShareFiles();
            if (cleanShareFiles != null && cleanShareFiles.booleanValue()) {
                i = 0;
            }
        } catch (C16041a e) {
            e.printStackTrace();
        }
        if (context != null) {
            File file = new File(m130077g(context));
            if (file.exists()) {
                m130057a(m130051a(file, i));
                m130057a(m130051a(new File(m130073e(context)), i));
                m130057a(m130051a(new File(m130076f(context)), i));
            }
            File file2 = new File(m130069d(context));
            File file3 = new File(m130050a(context, (String) null), "share");
            if (file3.exists() && !TextUtils.equals(file3.getAbsolutePath(), file2.getAbsolutePath())) {
                m130072d(file3, i);
            }
            File a = C23435d.m44109a(context);
            if (a != null) {
                File file4 = new File(a, "share");
                if (file4.exists() && !TextUtils.equals(file4.getAbsolutePath(), file4.getAbsolutePath())) {
                    m130072d(file4, i);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m130056a(File file, List<File> list) {
        if (file != null) {
            if (file.isFile()) {
                list.add(file);
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    m130056a(file2, list);
                }
            }
        }
    }
}
