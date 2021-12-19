package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
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
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.f */
public final class C46593f {

    /* renamed from: a */
    public static final C46593f f108640a = new C46593f();

    /* renamed from: b */
    private static final String f108641b;

    /* renamed from: c */
    private static final String f108642c;

    /* renamed from: d */
    private static final int f108643d = C34728n.m70946a(32.0d);

    private C46593f() {
    }

    /* renamed from: a */
    public static String m89925a() {
        return f108642c + "tmp/";
    }

    static {
        Covode.recordClassIndex(55183);
        String str = "/data/data/" + C17867d.m33078a().getPackageName() + '/';
        f108641b = str;
        f108642c = str + "system_emoji_res/";
    }

    /* renamed from: a */
    public static String m89926a(String str) {
        C89219l.m154721d(str, "");
        return f108642c + str + File.separator;
    }

    /* renamed from: b */
    public final void mo79189b(String str) {
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
                        mo79189b(path);
                    } else {
                        m89927a(file2);
                    }
                }
                m89927a(file);
            }
        }
    }

    /* renamed from: a */
    public static boolean m89927a(File file) {
        MethodCollector.m26663i(11780);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(11780);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(11780);
        return delete;
    }

    /* renamed from: a */
    public final synchronized void mo79187a(String... strArr) {
        MethodCollector.m26663i(11949);
        C89219l.m154721d(strArr, "");
        File file = new File(f108642c);
        if (!file.exists() || !file.isDirectory()) {
            MethodCollector.m26664o(11949);
            return;
        }
        File[] listFiles = file.listFiles(new C46594a(strArr));
        C89219l.m154716b(listFiles, "");
        for (File file2 : listFiles) {
            C89219l.m154716b(file2, "");
            if (file2.isDirectory()) {
                C46593f fVar = f108640a;
                String absolutePath = file2.getAbsolutePath();
                C89219l.m154716b(absolutePath, "");
                fVar.mo79189b(absolutePath);
            } else {
                m89927a(file2);
            }
        }
        MethodCollector.m26664o(11949);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.f$a */
    public static final class C46594a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String[] f108644a;

        static {
            Covode.recordClassIndex(55184);
        }

        C46594a(String[] strArr) {
            this.f108644a = strArr;
        }

        public final boolean accept(File file, String str) {
            String[] strArr = this.f108644a;
            C89219l.m154716b(str, "");
            if (!C89064i.m154489a(strArr, C89361p.m154913b(str, (CharSequence) ".zip"))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private static long m89924a(InputStream inputStream, File file) {
        MethodCollector.m26663i(11782);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            long j = C89145b.m154635a(inputStream, fileOutputStream, 8192);
            C89146c.m154636a(fileOutputStream, null);
            MethodCollector.m26664o(11782);
            return j;
        } catch (Throwable th) {
            C89146c.m154636a(fileOutputStream, th);
            MethodCollector.m26664o(11782);
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void mo79186a(String str, List<C46605i> list) {
        MethodCollector.m26663i(11781);
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        File file = new File(m89926a(str));
        if (!file.exists() || !file.isDirectory()) {
            C51423a.m95791b(3, null, "ImSysEmojiFileHelper restore, cacheDir not exist");
            MethodCollector.m26664o(11781);
            return;
        }
        C46644f.m90041a(new File(file, "emoji_model_info"), list);
        MethodCollector.m26664o(11781);
    }

    /* renamed from: a */
    public final boolean mo79188a(String str, String str2) {
        int i;
        Throwable th;
        MethodCollector.m26663i(11632);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int i2 = 3;
        C51423a.m95791b(3, null, "ImSysEmojiFileHelper unZipFile: zipFilePath=" + str + ", outputDirPath=" + str2);
        File file = new File(str2);
        if (file.exists()) {
            C51423a.m95791b(3, null, "ImSysEmojiFileHelper unZipFile baseDir exits");
            mo79189b(str2);
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
                        boolean z = true;
                        boolean z2 = false;
                        while (true) {
                            if (!a.hasNext()) {
                                z = z2;
                                break;
                            }
                            ZipEntry zipEntry = (ZipEntry) a.next();
                            C89219l.m154716b(zipEntry, "");
                            String name2 = zipEntry.getName();
                            C89219l.m154716b(name2, "");
                            if (C89361p.m154874b(name2, "system_emoji_", false)) {
                                String name3 = zipEntry.getName();
                                C89219l.m154716b(name3, "");
                                if (!C89361p.m154929e((CharSequence) name3, (CharSequence) "../")) {
                                    C51423a.m95791b(i2, null, "ImSysEmojiFileHelper unZipFile entry=" + zipEntry.getName() + " emoji_info.json");
                                    File file3 = new File(file, "emoji_info.json");
                                    if (zipEntry.isDirectory()) {
                                        file3.mkdirs();
                                    } else {
                                        InputStream inputStream = zipFile2.getInputStream(zipEntry);
                                        try {
                                            InputStream inputStream2 = inputStream;
                                            C89219l.m154716b(inputStream2, "");
                                            m89924a(inputStream2, file3);
                                            C89146c.m154636a(inputStream, null);
                                        } catch (Throwable th2) {
                                            try {
                                                C89146c.m154636a(inputStream, th);
                                                MethodCollector.m26664o(11632);
                                                throw th2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    MethodCollector.m26664o(i);
                                                    throw th;
                                                } catch (Throwable th4) {
                                                    C89146c.m154636a(zipFile, th);
                                                    MethodCollector.m26664o(i);
                                                    throw th4;
                                                }
                                            }
                                        }
                                    }
                                    String a2 = C46644f.m90038a(file3);
                                    if (TextUtils.isEmpty(a2)) {
                                        C51423a.m95791b(i2, null, "ImSysEmojiFileHelper  TextUtils.isEmpty(infoJsonStr)");
                                        break;
                                    }
                                    try {
                                        C46608k kVar = (C46608k) C80342dg.m139301a(a2, C46608k.class);
                                        if (kVar != null) {
                                            ArrayList arrayList = new ArrayList();
                                            List<C46582a> d = kVar.getD();
                                            if (d != null) {
                                                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) d, 10));
                                                for (T t : d) {
                                                    if (Build.VERSION.SDK_INT >= Integer.parseInt(t.getAnd())) {
                                                        C46605i iVar = new C46605i();
                                                        iVar.setBusinessType(t.getBusiness());
                                                        List<String> emoji = t.getEmoji();
                                                        iVar.setPreviewEmoji(emoji != null ? emoji.get(0) : null);
                                                        iVar.setSupportSkinBusinessType(1);
                                                        iVar.setEmojiList(t.getEmoji());
                                                        iVar.setMiniSupportSysVersion(t.getAnd());
                                                        arrayList.add(iVar);
                                                    } else {
                                                        t = null;
                                                    }
                                                    arrayList2.add(t);
                                                }
                                            }
                                            StringBuilder sb = new StringBuilder("ImSysEmojiFileHelper resultResInfo size:  ");
                                            List<C46582a> d2 = kVar.getD();
                                            C51423a.m95791b(3, null, sb.append(d2 != null ? Integer.valueOf(d2.size()) : null).append("   list ").append(arrayList.size()).toString());
                                            C46644f.m90041a(new File(file, "emoji_model_info"), arrayList);
                                        }
                                    } catch (Throwable th5) {
                                        C51423a.m95790a(th5);
                                    }
                                    z2 = true;
                                    i2 = 3;
                                }
                            }
                            C51423a.m95791b(3, null, "ImSysEmojiFileHelper unZipFile invalid entry: " + zipEntry.getName());
                            i2 = 3;
                        }
                        C89146c.m154636a(zipFile, null);
                        MethodCollector.m26664o(11632);
                        return z;
                    } catch (Throwable th6) {
                        th = th6;
                        i = 11632;
                        MethodCollector.m26664o(i);
                        throw th;
                    }
                } catch (Exception e) {
                    C51423a.m95791b(3, null, "ImSysEmojiFileHelper unZipFile cause exception: " + e.getMessage());
                    C51423a.m95790a((Throwable) e);
                    MethodCollector.m26664o(11632);
                    return false;
                }
            }
        }
        m89927a(file2);
        C51423a.m95791b(3, null, "ImSysEmojiFileHelper unZipFile zipFile invalid: " + str + ", " + str2);
        MethodCollector.m26664o(11632);
        return false;
    }
}
