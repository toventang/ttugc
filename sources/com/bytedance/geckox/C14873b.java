package com.bytedance.geckox;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.p1015c.C14897b;
import com.bytedance.geckox.utils.BsPatch;
import com.bytedance.geckox.utils.C15050c;
import com.bytedance.geckox.utils.C15052e;
import com.bytedance.geckox.utils.C15058i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.geckox.b */
public final class C14873b {

    /* renamed from: j */
    private static final Map<Integer, String> f36329j;

    /* renamed from: a */
    public Map<String, Long> f36330a = new HashMap();

    /* renamed from: b */
    public Map<String, Long> f36331b = new HashMap();

    /* renamed from: c */
    public RandomAccessFile f36332c;

    /* renamed from: d */
    public File f36333d;

    /* renamed from: e */
    public File f36334e;

    /* renamed from: f */
    public File f36335f;

    /* renamed from: g */
    public int f36336g;

    /* renamed from: h */
    public String f36337h = "";

    /* renamed from: i */
    private List<String> f36338i = new ArrayList();

    /* renamed from: c */
    private String m27308c() {
        byte[] bArr = new byte[32];
        this.f36332c.readFully(bArr);
        return new String(bArr);
    }

    static {
        Covode.recordClassIndex(16984);
        HashMap hashMap = new HashMap();
        f36329j = hashMap;
        hashMap.put(1, "modify");
        hashMap.put(2, "delete");
        hashMap.put(3, "add");
        hashMap.put(4, "rename");
        hashMap.put(5, "rewrite");
        hashMap.put(6, "same");
    }

    /* renamed from: a */
    public final void mo23959a() {
        while (this.f36332c.getFilePointer() != this.f36332c.length()) {
            String readUTF = this.f36332c.readUTF();
            if (!readUTF.isEmpty()) {
                this.f36338i.add(readUTF);
                File file = new File(this.f36333d, readUTF);
                if (!readUTF.startsWith("__MACOSX/") && !readUTF.equals(".DS_Store")) {
                    byte readByte = this.f36332c.readByte();
                    Map<Integer, String> map = f36329j;
                    this.f36337h = C1764a.m5928a("patch failed, type:%s, path:%s, detail:", new Object[]{map.get(Integer.valueOf(readByte)), readUTF});
                    switch (readByte) {
                        case 1:
                            m27304a(readUTF, file);
                            continue;
                        case 2:
                            break;
                        case 3:
                            File file2 = new File(this.f36334e, readUTF);
                            m27311e(file2.getParentFile());
                            m27310d(file2);
                            if (this.f36336g == 0) {
                                m27312f(file2);
                            }
                            this.f36330a.put(readUTF, Long.valueOf(file2.lastModified()));
                            continue;
                        case 4:
                            String readUTF2 = this.f36332c.readUTF();
                            if (!readUTF2.isEmpty()) {
                                m27307b(readUTF2, file);
                                continue;
                            } else {
                                throw new C14897b(1006, this.f36337h + "read path is nil");
                            }
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            String readUTF3 = this.f36332c.readUTF();
                            if (!readUTF3.isEmpty()) {
                                this.f36337h = C1764a.m5928a("patch failed, type:%s, path:%s, newPath: %s, detail:", new Object[]{map.get(Integer.valueOf(readByte)), readUTF, readUTF3});
                                m27304a(readUTF3, file);
                                continue;
                            } else {
                                throw new C14897b(1006, this.f36337h + "read path is nil");
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            m27307b(readUTF, file);
                            continue;
                        default:
                            throw new C14897b(1006, this.f36337h + "not support change type");
                    }
                }
            } else {
                throw new C14897b(1006, "read path is empty");
            }
        }
    }

    /* renamed from: b */
    public final void mo23960b() {
        for (String str : this.f36331b.keySet()) {
            if (!this.f36338i.contains(str)) {
                Long l = this.f36331b.get(str);
                File file = new File(this.f36333d, str);
                Long valueOf = Long.valueOf(file.lastModified());
                if (l.equals(valueOf)) {
                    File file2 = new File(this.f36334e, str);
                    m27306b(file, file2);
                    this.f36330a.put(str, Long.valueOf(file2.lastModified()));
                } else {
                    throw new C14897b(1003, C1764a.m5928a("checkDirModifyTime failed: %d-%d-%s", new Object[]{l, valueOf, str}));
                }
            }
        }
    }

    /* renamed from: c */
    private void m27309c(File file) {
        if (this.f36336g != 0) {
            String a = m27302a(file, this.f36333d);
            Long l = this.f36331b.get(a);
            Long valueOf = Long.valueOf(file.lastModified());
            if (!l.equals(valueOf)) {
                throw new C14897b(1003, C1764a.m5928a("checkDirModifyTime failed: %d-%d-%s", new Object[]{l, valueOf, a}));
            }
        }
    }

    /* renamed from: e */
    private void m27311e(File file) {
        try {
            C15052e.m27716e(file);
        } catch (Exception e) {
            throw new C14897b(1012, this.f36337h + e.getMessage());
        }
    }

    /* renamed from: f */
    private void m27312f(File file) {
        String c = m27308c();
        String a = C15058i.m27724a(file, "MD5");
        if (!a.equals(c)) {
            throw new C14897b(1011, this.f36337h + "md5 check failed, local md5:" + a + ", expect md5:" + c);
        }
    }

    /* renamed from: b */
    public final void mo23961b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    String a = m27302a(file2, this.f36333d);
                    if (!this.f36338i.contains(a)) {
                        File file3 = new File(this.f36334e, a);
                        m27306b(file2, file3);
                        this.f36330a.put(a, Long.valueOf(file3.lastModified()));
                    }
                } else {
                    mo23961b(file2);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m27305a(File file) {
        MethodCollector.m26663i(5181);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5181);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5181);
        return delete;
    }

    /* renamed from: d */
    private void m27310d(File file) {
        Throwable th;
        Exception e;
        MethodCollector.m26663i(5377);
        if (!file.exists() || m27305a(file)) {
            FileOutputStream fileOutputStream = null;
            try {
                long readLong = this.f36332c.readLong();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1048576];
                    long j = 0;
                    while (true) {
                        if (j >= readLong) {
                            break;
                        }
                        long j2 = readLong - j;
                        if (j2 < 1048576) {
                            int i = (int) j2;
                            this.f36332c.readFully(bArr, 0, i);
                            fileOutputStream2.write(bArr, 0, i);
                            break;
                        }
                        j += 1048576;
                        this.f36332c.readFully(bArr);
                        fileOutputStream2.write(bArr);
                    }
                    C15050c.m27709a(fileOutputStream2);
                    MethodCollector.m26664o(5377);
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C14897b bVar = new C14897b(1007, this.f36337h + e.getMessage());
                        MethodCollector.m26664o(5377);
                        throw bVar;
                    } catch (Throwable th2) {
                        th = th2;
                        C15050c.m27709a(fileOutputStream);
                        MethodCollector.m26664o(5377);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    C15050c.m27709a(fileOutputStream);
                    MethodCollector.m26664o(5377);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                C14897b bVar2 = new C14897b(1007, this.f36337h + e.getMessage());
                MethodCollector.m26664o(5377);
                throw bVar2;
            }
        } else {
            C14897b bVar3 = new C14897b(1007, this.f36337h + "remove old file error: " + file.getPath());
            MethodCollector.m26664o(5377);
            throw bVar3;
        }
    }

    /* renamed from: a */
    private static String m27302a(File file, File file2) {
        return file.getAbsolutePath().substring(file2.getAbsolutePath().length() + 1);
    }

    /* renamed from: b */
    private void m27306b(File file, File file2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e;
        MethodCollector.m26663i(5380);
        m27311e(file2.getParentFile());
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                try {
                    C14897b bVar = new C14897b(1012, this.f36337h + e.getMessage());
                    MethodCollector.m26664o(5380);
                    throw bVar;
                } catch (Throwable th2) {
                    th = th2;
                    C15050c.m27709a(fileInputStream);
                    C15050c.m27709a(fileOutputStream);
                    MethodCollector.m26664o(5380);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                C15050c.m27709a(fileInputStream);
                C15050c.m27709a(fileOutputStream);
                MethodCollector.m26664o(5380);
                throw th;
            }
            try {
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        C15050c.m27709a(fileInputStream2);
                        C15050c.m27709a(fileOutputStream);
                        MethodCollector.m26664o(5380);
                        return;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                fileInputStream = fileInputStream2;
                C14897b bVar2 = new C14897b(1012, this.f36337h + e.getMessage());
                MethodCollector.m26664o(5380);
                throw bVar2;
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = fileInputStream2;
                C15050c.m27709a(fileInputStream);
                C15050c.m27709a(fileOutputStream);
                MethodCollector.m26664o(5380);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
            C14897b bVar22 = new C14897b(1012, this.f36337h + e.getMessage());
            MethodCollector.m26664o(5380);
            throw bVar22;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            C15050c.m27709a(fileInputStream);
            C15050c.m27709a(fileOutputStream);
            MethodCollector.m26664o(5380);
            throw th;
        }
    }

    /* renamed from: a */
    private void m27304a(String str, File file) {
        if (file.exists()) {
            File file2 = new File(this.f36334e, str);
            m27311e(file2.getParentFile());
            File file3 = new File(this.f36335f.getParentFile(), "bytepatch_patch_temp_file");
            m27310d(file3);
            try {
                BsPatch.m27693a(file, file3, this.f36334e, str);
                m27305a(file3);
                String c = m27308c();
                String a = C15058i.m27724a(file2, "MD5");
                if (!a.equals(c)) {
                    m27309c(file);
                    if (C15058i.m27724a(file, "MD5").equals(c)) {
                        throw new C14897b(1024, this.f36337h + "old file is same");
                    }
                    throw new C14897b(1011, this.f36337h + "md5 check failed, local md5:" + a + ", expect md5:" + c);
                }
                this.f36330a.put(str, Long.valueOf(file2.lastModified()));
            } catch (Exception e) {
                throw new C14897b(1010, this.f36337h + "bspatch error:" + e.getMessage());
            }
        } else {
            throw new C14897b(1006, this.f36337h + "path not exists: ");
        }
    }

    /* renamed from: b */
    private void m27307b(String str, File file) {
        if (file.exists()) {
            File file2 = new File(this.f36334e, str);
            m27306b(file, file2);
            if (this.f36336g == 0) {
                m27312f(file2);
            } else {
                m27309c(file);
            }
            this.f36330a.put(str, Long.valueOf(file2.lastModified()));
            return;
        }
        throw new C14897b(1006, this.f36337h + "path not exists: ");
    }

    /* renamed from: a */
    public static void m27303a(File file, File file2, Map<String, Long> map) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file3 : listFiles) {
                if (file3.isFile()) {
                    map.put(m27302a(file3, file2), Long.valueOf(file3.lastModified()));
                } else {
                    m27303a(file3, file2, map);
                }
            }
        }
    }
}
