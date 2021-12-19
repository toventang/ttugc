package com.bytedance.p802b.p806b.p807a.p811d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.C12927a;
import com.bytedance.p802b.p806b.p807a.C12930b;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p841k.C13113a;
import com.bytedance.p802b.p841k.C13120c;
import com.bytedance.p802b.p841k.C13122d;
import com.bytedance.p802b.p841k.C13130f;
import com.bytedance.p802b.p841k.p843b.C13118b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.b.b.a.d.a */
public final class C12950a {

    /* renamed from: a */
    private SharedPreferences f31533a;

    /* renamed from: b */
    private volatile boolean f31534b;

    /* renamed from: c */
    private File f31535c;

    /* renamed from: d */
    private ConcurrentHashMap<String, C12953b> f31536d;

    /* renamed from: e */
    private long f31537e;

    /* renamed from: f */
    private volatile boolean f31538f;

    /* renamed from: g */
    private ArrayList<String> f31539g;

    static {
        Covode.recordClassIndex(14786);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo20800a() {
        m23240c();
        return this.f31535c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.b.a.d.a$a */
    public static class C12952a {

        /* renamed from: a */
        public static C12950a f31541a = new C12950a((byte) 0);

        static {
            Covode.recordClassIndex(14788);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File[] mo20806b() {
        m23240c();
        File file = this.f31535c;
        if (file == null) {
            return null;
        }
        return file.listFiles();
    }

    private C12950a() {
        this.f31536d = new ConcurrentHashMap<>();
        this.f31537e = 0;
        this.f31538f = false;
        this.f31539g = new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.b.a.d.a$b */
    public static class C12953b {

        /* renamed from: a */
        public int f31542a;

        /* renamed from: b */
        public long f31543b;

        static {
            Covode.recordClassIndex(14789);
        }

        /* renamed from: a */
        public final String mo20808a() {
            return this.f31542a + "_" + this.f31543b;
        }

        /* renamed from: a */
        public static C12953b m23249a(String str) {
            try {
                String[] split = str.split("_");
                return new C12953b(Integer.parseInt(split[0]), Long.parseLong(split[1]));
            } catch (Exception unused) {
                return null;
            }
        }

        public C12953b(int i, long j) {
            this.f31542a = i;
            this.f31543b = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo20809a(int i, long j) {
            this.f31542a = i;
            this.f31543b = j;
        }
    }

    /* renamed from: c */
    private synchronized void m23240c() {
        if (!this.f31534b) {
            File file = new File(C12930b.m23206a(), "log");
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f31535c = file;
            this.f31533a = C34822d.m71158a(C13113a.f31955g, "log_report_message", 0);
            this.f31534b = true;
        }
    }

    /* renamed from: d */
    private synchronized void m23241d() {
        int i = 0;
        if (!this.f31538f) {
            String[] list = C12952a.f31541a.mo20800a().list();
            int length = list.length;
            while (i < length) {
                String str = list[i];
                if (!this.f31539g.contains(str)) {
                    m23238b(str);
                }
                i++;
            }
            this.f31538f = true;
            return;
        }
        if (this.f31537e > 0 && this.f31539g.size() == 0) {
            String[] list2 = C12952a.f31541a.mo20800a().list();
            int length2 = list2.length;
            while (i < length2) {
                String str2 = list2[i];
                if (!this.f31539g.contains(str2)) {
                    m23238b(str2);
                }
                i++;
            }
            this.f31537e -= (long) this.f31539g.size();
        }
    }

    /* synthetic */ C12950a(byte b) {
        this();
    }

    /* renamed from: b */
    private void m23238b(String str) {
        if (((long) this.f31539g.size()) > 5000) {
            this.f31537e++;
        } else {
            this.f31539g.add(str);
        }
    }

    /* renamed from: c */
    static long m23239c(File file) {
        try {
            String[] split = file.getName().split("_");
            if (split.length != 2) {
                return -1;
            }
            return Long.parseLong(split[0]);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo20802a(File file) {
        if (file != null) {
            this.f31539g.remove(file.getName());
            m23240c();
            C13120c.m23592b(file);
            this.f31536d.remove(file.getName());
            SharedPreferences.Editor edit = this.f31533a.edit();
            edit.remove(file.getName());
            edit.commit();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C12953b mo20805b(File file) {
        C12953b bVar = null;
        if (file == null) {
            return null;
        }
        m23240c();
        String name = file.getName();
        if (this.f31536d.containsKey(name)) {
            return this.f31536d.get(name);
        }
        if (this.f31533a.contains(name)) {
            String string = this.f31533a.getString(name, "");
            if (!TextUtils.isEmpty(string) && (bVar = C12953b.m23249a(string)) != null) {
                this.f31536d.put(name, bVar);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized File mo20801a(String str) {
        File file;
        String concat = ".".concat(String.valueOf(str));
        m23241d();
        File file2 = null;
        if (this.f31539g.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f31539g.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.endsWith(concat)) {
                arrayList.add(next);
            }
        }
        if (C13130f.m23608a(arrayList)) {
            return null;
        }
        Collections.sort(arrayList, new Comparator<String>() {
            /* class com.bytedance.p802b.p806b.p807a.p811d.C12950a.C129511 */

            static {
                Covode.recordClassIndex(14787);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
                return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
            }
        });
        Iterator it2 = arrayList.iterator();
        C12953b bVar = null;
        while (true) {
            if (it2.hasNext()) {
                file = new File(C12952a.f31541a.mo20800a(), (String) it2.next());
                C12953b b = mo20805b(file);
                if (b == null) {
                    break;
                }
                if (C13037a.m23579r()) {
                    file.getName();
                    System.currentTimeMillis();
                }
                if (b.f31542a == 0 || b.f31543b < System.currentTimeMillis()) {
                    break;
                } else if (bVar == null || bVar.f31543b > b.f31543b) {
                    bVar = b;
                    file2 = file;
                }
            } else {
                break;
            }
        }
        file2 = file;
        return file2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20803a(File file, int i, long j) {
        C12953b bVar;
        if (file != null) {
            try {
                m23240c();
                SharedPreferences.Editor edit = this.f31533a.edit();
                String name = file.getName();
                if (this.f31536d.containsKey(name)) {
                    bVar = this.f31536d.get(name);
                } else {
                    bVar = new C12953b(i, j);
                    this.f31536d.put(name, bVar);
                }
                bVar.mo20809a(i, j);
                edit.putString(name, bVar.mo20808a());
                edit.commit();
            } catch (Throwable th) {
                C13118b.m23587a(C12927a.f31456a, "updateRetryMessage", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo20804a(byte[] bArr, String str, int i, long j) {
        m23240c();
        if (this.f31535c == null) {
            return false;
        }
        String a = C1764a.m5928a("%d%s%s%s%s", new Object[]{Long.valueOf(System.currentTimeMillis()), "_", UUID.randomUUID().toString(), ".", str});
        File file = new File(this.f31535c, a);
        FileChannel fileChannel = null;
        try {
            mo20803a(file, i, j);
            fileChannel = new FileOutputStream(file).getChannel();
            fileChannel.write(ByteBuffer.wrap(bArr));
            if (!this.f31539g.contains(a)) {
                m23238b(a);
            }
            if (C13037a.m23579r()) {
                file.getName();
            }
            return true;
        } catch (Throwable th) {
            C13118b.m23587a(C12927a.f31456a, "saveFile", th);
            return false;
        } finally {
            C13122d.m23595a(fileChannel);
        }
    }
}
