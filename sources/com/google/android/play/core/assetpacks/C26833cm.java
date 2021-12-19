package com.google.android.play.core.assetpacks;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1963b.C26915bf;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* renamed from: com.google.android.play.core.assetpacks.cm */
final class C26833cm {

    /* renamed from: a */
    private static final C26909b f63657a = new C26909b("SliceMetadataManager");

    /* renamed from: b */
    private final byte[] f63658b = new byte[8192];

    /* renamed from: c */
    private final C26769ac f63659c;

    /* renamed from: d */
    private final String f63660d;

    /* renamed from: e */
    private final int f63661e;

    /* renamed from: f */
    private final long f63662f;

    /* renamed from: g */
    private final String f63663g;

    /* renamed from: h */
    private int f63664h;

    static {
        Covode.recordClassIndex(32308);
    }

    C26833cm(C26769ac acVar, String str, int i, long j, String str2) {
        this.f63659c = acVar;
        this.f63660d = str;
        this.f63661e = i;
        this.f63662f = j;
        this.f63663g = str2;
        this.f63664h = -1;
    }

    /* renamed from: e */
    private final File m53287e() {
        File e = this.f63659c.mo44456e(this.f63660d, this.f63661e, this.f63662f, this.f63663g);
        if (!e.exists()) {
            e.mkdirs();
        }
        return e;
    }

    /* renamed from: f */
    private final File m53288f() {
        File c = this.f63659c.mo44452c(this.f63660d, this.f63661e, this.f63662f, this.f63663g);
        c.getParentFile().mkdirs();
        c.createNewFile();
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26832cl mo44521a() {
        MethodCollector.m26663i(14175);
        File c = this.f63659c.mo44452c(this.f63660d, this.f63661e, this.f63662f, this.f63663g);
        if (c.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(c);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    C26787au auVar = new C26787au("Slice checkpoint file corrupt.");
                    MethodCollector.m26664o(14175);
                    throw auVar;
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f63664h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    C26832cl clVar = new C26832cl(parseInt, property, parseLong, parseLong2, parseInt2);
                    MethodCollector.m26664o(14175);
                    return clVar;
                } catch (NumberFormatException e) {
                    C26787au auVar2 = new C26787au("Slice checkpoint file corrupt.", e);
                    MethodCollector.m26664o(14175);
                    throw auVar2;
                }
            } catch (Throwable th) {
                C26915bf.m53466a(th, th);
            }
        } else {
            C26787au auVar3 = new C26787au("Slice checkpoint file does not exist.");
            MethodCollector.m26664o(14175);
            throw auVar3;
        }
        MethodCollector.m26664o(14175);
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44522a(int i) {
        MethodCollector.m26663i(14159);
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(mo44529b().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f63664h));
        FileOutputStream fileOutputStream = new FileOutputStream(m53288f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            MethodCollector.m26664o(14159);
            return;
        } catch (Throwable th) {
            C26915bf.m53466a(th, th);
        }
        MethodCollector.m26664o(14159);
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44523a(long j, byte[] bArr, int i, int i2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo44529b(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C26915bf.m53466a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44524a(InputStream inputStream, long j) {
        int read;
        MethodCollector.m26663i(14190);
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo44529b(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f63658b);
                if (read <= 0) {
                    break;
                }
                randomAccessFile.write(this.f63658b, 0, read);
            } while (read == 8192);
            randomAccessFile.close();
            MethodCollector.m26664o(14190);
            return;
        } catch (Throwable th) {
            C26915bf.m53466a(th, th);
        }
        MethodCollector.m26664o(14190);
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44525a(String str, long j, long j2, int i) {
        MethodCollector.m26663i(14110);
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f63664h));
        FileOutputStream fileOutputStream = new FileOutputStream(m53288f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            MethodCollector.m26664o(14110);
            return;
        } catch (Throwable th) {
            C26915bf.m53466a(th, th);
        }
        MethodCollector.m26664o(14110);
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44526a(byte[] bArr) {
        MethodCollector.m26663i(14191);
        this.f63664h++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m53287e(), C1764a.m5928a("%s-LFH.dat", new Object[]{Integer.valueOf(this.f63664h)})));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                MethodCollector.m26664o(14191);
                return;
            } catch (Throwable th) {
                C26915bf.m53466a(th, th);
            }
            MethodCollector.m26664o(14191);
            throw th;
        } catch (IOException e) {
            C26787au auVar = new C26787au("Could not write metadata file.", e);
            MethodCollector.m26664o(14191);
            throw auVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44527a(byte[] bArr, int i) {
        MethodCollector.m26663i(14130);
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f63664h));
        FileOutputStream fileOutputStream = new FileOutputStream(m53288f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File d = this.f63659c.mo44454d(this.f63660d, this.f63661e, this.f63662f, this.f63663g);
            if (d.exists()) {
                m53286a(d);
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(d);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                MethodCollector.m26664o(14130);
                return;
            } catch (Throwable th) {
                C26915bf.m53466a(th, th);
            }
            MethodCollector.m26664o(14130);
            throw th;
            MethodCollector.m26664o(14130);
            throw th;
        } catch (Throwable th2) {
            C26915bf.m53466a(th, th2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44528a(byte[] bArr, InputStream inputStream) {
        MethodCollector.m26663i(14206);
        this.f63664h++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo44529b());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f63658b);
            while (read > 0) {
                fileOutputStream.write(this.f63658b, 0, read);
                read = inputStream.read(this.f63658b);
            }
            fileOutputStream.close();
            MethodCollector.m26664o(14206);
            return;
        } catch (Throwable th) {
            C26915bf.m53466a(th, th);
        }
        MethodCollector.m26664o(14206);
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo44529b() {
        return new File(m53287e(), C1764a.m5928a("%s-NAM.dat", new Object[]{Integer.valueOf(this.f63664h)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo44530b(int i) {
        MethodCollector.m26663i(14160);
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f63664h));
        FileOutputStream fileOutputStream = new FileOutputStream(m53288f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            MethodCollector.m26664o(14160);
            return;
        } catch (Throwable th) {
            C26915bf.m53466a(th, th);
        }
        MethodCollector.m26664o(14160);
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo44531b(byte[] bArr, int i) {
        MethodCollector.m26663i(14231);
        this.f63664h++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo44529b());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            MethodCollector.m26664o(14231);
            return;
        } catch (Throwable th) {
            C26915bf.m53466a(th, th);
        }
        MethodCollector.m26664o(14231);
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo44532c() {
        int parseInt;
        MethodCollector.m26663i(14216);
        File c = this.f63659c.mo44452c(this.f63660d, this.f63661e, this.f63662f, this.f63663g);
        if (!c.exists()) {
            parseInt = 0;
        } else {
            FileInputStream fileInputStream = new FileInputStream(c);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                    parseInt = -1;
                } else if (properties.getProperty("previousChunk") != null) {
                    parseInt = Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                } else {
                    C26787au auVar = new C26787au("Slice checkpoint file corrupt.");
                    MethodCollector.m26664o(14216);
                    throw auVar;
                }
            } catch (Throwable th) {
                C26915bf.m53466a(th, th);
            }
        }
        MethodCollector.m26664o(14216);
        return parseInt;
        MethodCollector.m26664o(14216);
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo44533d() {
        MethodCollector.m26663i(14224);
        File c = this.f63659c.mo44452c(this.f63660d, this.f63661e, this.f63662f, this.f63663g);
        if (!c.exists()) {
            MethodCollector.m26664o(14224);
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(c);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null) {
                    f63657a.mo44596b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                    MethodCollector.m26664o(14224);
                    return false;
                }
                int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                MethodCollector.m26664o(14224);
                return parseInt == 4;
            } catch (Throwable th) {
                C26915bf.m53466a(th, th);
            }
        } catch (IOException e) {
            f63657a.mo44596b("Could not read checkpoint while checking if extraction finished. %s", e);
        }
        MethodCollector.m26664o(14224);
        throw th;
    }

    /* renamed from: a */
    private static boolean m53286a(File file) {
        MethodCollector.m26663i(14131);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(14131);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(14131);
        return delete;
    }
}
