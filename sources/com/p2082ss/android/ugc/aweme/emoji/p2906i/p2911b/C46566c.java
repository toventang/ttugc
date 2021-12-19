package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a.C46560c;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46644f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.b.c */
public final class C46566c {

    /* renamed from: a */
    public static final C46566c f108575a = new C46566c();

    /* renamed from: b */
    private static final String f108576b;

    /* renamed from: c */
    private static final String f108577c;

    /* renamed from: d */
    private static final int f108578d = C34728n.m70946a(32.0d);

    private C46566c() {
    }

    /* renamed from: a */
    public static String m89865a() {
        return f108577c + "tmp/";
    }

    static {
        Covode.recordClassIndex(55153);
        String str = "/data/data/" + C17867d.m33078a().getPackageName() + '/';
        f108576b = str;
        f108577c = str + "small_emoji_res/";
    }

    /* renamed from: a */
    public static String m89866a(String str) {
        C89219l.m154721d(str, "");
        return f108577c + str + File.separator;
    }

    /* renamed from: c */
    public static C46560c m89870c(String str) {
        C89219l.m154721d(str, "");
        File file = new File(m89866a(str));
        if (!file.exists() || !file.isDirectory()) {
            C51423a.m95791b(3, null, "OnlineEmojiFileHelper loadCache, cacheDir not exist");
            return null;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            C51423a.m95791b(3, null, "OnlineEmojiFileHelper loadCache, cacheDirFileList is empty");
            return null;
        }
        File file2 = listFiles[0];
        File file3 = new File(file2, "info.json");
        if (!file3.exists() || !file3.isFile()) {
            C51423a.m95791b(3, null, "OnlineEmojiFileHelper loadCache, infoFile not exist");
            return null;
        }
        String a = C46644f.m90038a(file3);
        if (TextUtils.isEmpty(a)) {
            C51423a.m95791b(3, null, "OnlineEmojiFileHelper loadCache, infoJsonStr is empty");
            return null;
        }
        try {
            C46560c cVar = (C46560c) C80342dg.m139301a(a, C46560c.class);
            if (cVar == null) {
                C51423a.m95791b(3, null, "OnlineEmojiFileHelper loadCache resultResInfo is null");
                return null;
            }
            cVar.setMd5(str);
            C89219l.m154716b(file2, "");
            String absolutePath = file2.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            cVar.setResDirPath(absolutePath);
            String absolutePath2 = new File(file2, "static/").getAbsolutePath();
            C89219l.m154716b(absolutePath2, "");
            cVar.setPicFileDirPath(absolutePath2);
            return cVar;
        } catch (Throwable th) {
            C51423a.m95790a(th);
        }
    }

    /* renamed from: b */
    public final void mo79170b(String str) {
        File[] listFiles;
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    C89219l.m154716b(file2, "");
                    if (file2.isDirectory()) {
                        String path = file2.getPath();
                        C89219l.m154716b(path, "");
                        mo79170b(path);
                    } else {
                        m89868a(file2);
                    }
                }
                m89868a(file);
            }
        }
    }

    /* renamed from: a */
    public static boolean m89868a(File file) {
        MethodCollector.m26663i(12370);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12370);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12370);
        return delete;
    }

    /* renamed from: a */
    public final synchronized void mo79168a(String... strArr) {
        MethodCollector.m26663i(12601);
        C89219l.m154721d(strArr, "");
        File file = new File(f108577c);
        if (!file.exists() || !file.isDirectory()) {
            MethodCollector.m26664o(12601);
            return;
        }
        File[] listFiles = file.listFiles(new C46567a(strArr));
        C89219l.m154716b(listFiles, "");
        for (File file2 : listFiles) {
            C89219l.m154716b(file2, "");
            if (file2.isDirectory()) {
                C46566c cVar = f108575a;
                String absolutePath = file2.getAbsolutePath();
                C89219l.m154716b(absolutePath, "");
                cVar.mo79170b(absolutePath);
            } else {
                m89868a(file2);
            }
        }
        MethodCollector.m26664o(12601);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.c$b */
    public static final class C46568b implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ List f108580a;

        static {
            Covode.recordClassIndex(55155);
        }

        C46568b(List list) {
            this.f108580a = list;
        }

        public final boolean accept(File file, String str) {
            return this.f108580a.contains(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.i.b.c$a */
    public static final class C46567a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String[] f108579a;

        static {
            Covode.recordClassIndex(55154);
        }

        C46567a(String[] strArr) {
            this.f108579a = strArr;
        }

        public final boolean accept(File file, String str) {
            String[] strArr = this.f108579a;
            C89219l.m154716b(str, "");
            if (!C89064i.m154489a(strArr, C89361p.m154913b(str, (CharSequence) ".zip"))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private static long m89864a(InputStream inputStream, File file) {
        MethodCollector.m26663i(12493);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            long j = C89145b.m154635a(inputStream, fileOutputStream, 8192);
            C89146c.m154636a(fileOutputStream, null);
            MethodCollector.m26664o(12493);
            return j;
        } catch (Throwable th) {
            C89146c.m154636a(fileOutputStream, th);
            MethodCollector.m26664o(12493);
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m89869b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        LinkedHashMap<String, Bitmap> a = m89867a(str, C89070n.m154524c(str2));
        if (a == null || a.size() != 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(a.size());
        for (Map.Entry<String, Bitmap> entry : a.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return (Bitmap) arrayList.get(0);
    }

    /* renamed from: a */
    private static LinkedHashMap<String, Bitmap> m89867a(String str, List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        File[] listFiles = file.listFiles(new C46568b(list));
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        LinkedHashMap<String, Bitmap> linkedHashMap = new LinkedHashMap<>();
        for (File file2 : listFiles) {
            C89219l.m154716b(file2, "");
            Bitmap decodeBitmap = BitmapUtils.decodeBitmap(file2, f108578d);
            if (decodeBitmap != null) {
                String name = file2.getName();
                C89219l.m154716b(name, "");
                linkedHashMap.put(name, decodeBitmap);
            } else {
                file2.getName();
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final boolean mo79169a(String str, String str2) {
        MethodCollector.m26663i(12368);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        File file = new File(str2);
        if (file.exists()) {
            mo79170b(str2);
        }
        file.mkdirs();
        File file2 = new File(str);
        if (file2.exists()) {
            String name = file2.getName();
            C89219l.m154716b(name, "");
            if (C89361p.m154876c(name, ".zip", false)) {
                try {
                    ZipFile zipFile = new ZipFile(file2);
                    try {
                        ZipFile zipFile2 = zipFile;
                        Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                        C89219l.m154716b(entries, "");
                        Iterator a = C89070n.m154529a((Enumeration) entries);
                        boolean z = false;
                        while (a.hasNext()) {
                            ZipEntry zipEntry = (ZipEntry) a.next();
                            C89219l.m154716b(zipEntry, "");
                            String name2 = zipEntry.getName();
                            C89219l.m154716b(name2, "");
                            if (C89361p.m154874b(name2, "emoji_", false)) {
                                String name3 = zipEntry.getName();
                                C89219l.m154716b(name3, "");
                                if (!C89361p.m154929e((CharSequence) name3, (CharSequence) "../")) {
                                    z = true;
                                    zipEntry.getName();
                                    File file3 = new File(file, zipEntry.getName());
                                    if (zipEntry.isDirectory()) {
                                        file3.mkdirs();
                                    } else {
                                        InputStream inputStream = zipFile2.getInputStream(zipEntry);
                                        try {
                                            InputStream inputStream2 = inputStream;
                                            C89219l.m154716b(inputStream2, "");
                                            m89864a(inputStream2, file3);
                                            C89146c.m154636a(inputStream, null);
                                        } catch (Throwable th) {
                                            C89146c.m154636a(inputStream, th);
                                            MethodCollector.m26664o(12368);
                                            throw th;
                                        }
                                    }
                                }
                            }
                            zipEntry.getName();
                        }
                        C89146c.m154636a(zipFile, null);
                        MethodCollector.m26664o(12368);
                        return z;
                    } catch (Throwable th2) {
                        C89146c.m154636a(zipFile, th);
                        MethodCollector.m26664o(12368);
                        throw th2;
                    }
                } catch (Exception e) {
                    C51423a.m95791b(3, null, "OnlineEmojiFileHelper unZipFile cause exception: " + e.getMessage());
                    C51423a.m95790a((Throwable) e);
                    MethodCollector.m26664o(12368);
                    return false;
                }
            }
        }
        m89868a(file2);
        C51423a.m95791b(3, null, "OnlineEmojiFileHelper unZipFile zipFile invalid: " + str + ", " + str2);
        MethodCollector.m26664o(12368);
        return false;
    }
}
