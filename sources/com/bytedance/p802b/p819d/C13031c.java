package com.bytedance.p802b.p819d;

import android.app.Application;
import android.app.usage.StorageStatsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.p775g.AbstractC12476d;
import com.bytedance.apm.p789q.C12601u;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p802b.p819d.p820a.C13028a;
import com.bytedance.p802b.p841k.C13113a;
import com.bytedance.p802b.p841k.C13120c;
import com.bytedance.p802b.p841k.C13130f;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.d.c */
public final class C13031c {

    /* renamed from: a */
    public static C13031c f31773a = new C13031c();

    /* renamed from: b */
    public String f31774b;

    /* renamed from: c */
    String f31775c;

    /* renamed from: d */
    public String f31776d;

    /* renamed from: e */
    String f31777e;

    /* renamed from: f */
    volatile boolean f31778f;

    /* renamed from: g */
    List<String> f31779g;

    /* renamed from: h */
    List<String> f31780h;

    /* renamed from: i */
    boolean f31781i;

    /* renamed from: j */
    public C13028a f31782j;

    /* renamed from: k */
    public AbstractC12476d f31783k;

    /* renamed from: l */
    private long f31784l;

    /* renamed from: m */
    private long f31785m;

    /* renamed from: n */
    private long f31786n;

    /* renamed from: o */
    private long f31787o;

    /* renamed from: a */
    private static Object m23401a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm6_disk_DiskStatistics_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_apm6_disk_DiskStatistics_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    public static boolean m23406a(long j) {
        return j < 0 || j > 17179869184L;
    }

    /* renamed from: b */
    static boolean m23413b(long j) {
        return j >= 104857600 && j <= 17179869184L;
    }

    private C13031c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20893a(List<C13034c> list) {
        if (!C13130f.m23608a(list)) {
            for (C13034c cVar : list) {
                if (TextUtils.equals(cVar.f31799a, this.f31774b)) {
                    this.f31784l = cVar.f31801c;
                } else if (TextUtils.equals(cVar.f31799a, this.f31776d)) {
                    this.f31785m = cVar.f31801c;
                } else if (TextUtils.equals(cVar.f31799a, this.f31775c)) {
                    this.f31786n = cVar.f31801c;
                } else if (TextUtils.equals(cVar.f31799a, this.f31777e)) {
                    this.f31787o = cVar.f31801c;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C13030b mo20890a(C12601u<C13033b> uVar, C12601u<C13033b> uVar2, C12601u<C13033b> uVar3, List<C13032a> list) {
        try {
            long j = this.f31784l + this.f31785m;
            long j2 = this.f31786n + this.f31787o;
            long totalSpace = Environment.getDataDirectory().getTotalSpace() + Environment.getRootDirectory().getTotalSpace();
            long freeSpace = Environment.getDataDirectory().getFreeSpace();
            long j3 = j > 17179869184L ? 17179869184L : j;
            if (j2 > 17179869184L) {
                j2 = 17179869184L;
            }
            if (j3 < 0) {
                return null;
            }
            if (this.f31783k != null) {
                m23404a(uVar);
                m23404a(uVar2);
                m23404a(uVar3);
            }
            Pair<Long, Long> a = m23398a();
            long b = m23409b();
            try {
                return new C13030b(j, j2, totalSpace, freeSpace, b, ((Long) a.first).longValue(), ((Long) a.second).longValue(), (double) m23396a(b, new BigDecimal(totalSpace)), m23412b(uVar), m23412b(uVar2), m23412b(uVar3), m23405a(list, j3));
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m23403a(Class cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private JSONArray m23405a(List<C13032a> list, long j) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        BigDecimal bigDecimal = new BigDecimal(j);
        JSONArray jSONArray = new JSONArray();
        for (C13032a aVar : list) {
            if (m23407a(aVar)) {
                aVar.f31790c = 0.0f;
            } else {
                aVar.f31790c = m23396a(aVar.f31789b, bigDecimal);
            }
            List<C13032a> list2 = aVar.f31793f;
            if (list2 != null && list2.size() > 0) {
                for (C13032a aVar2 : list2) {
                    if (m23407a(aVar2)) {
                        aVar2.f31790c = 0.0f;
                    } else {
                        aVar2.f31790c = m23396a(aVar2.f31789b, bigDecimal);
                    }
                }
            }
            jSONArray.put(aVar.mo20896a());
        }
        return jSONArray;
    }

    /* renamed from: a */
    private boolean m23407a(C13032a aVar) {
        for (String str : this.f31779g) {
            if (aVar.f31788a.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static List<String> m23404a(C12601u<? extends C13033b> uVar) {
        if (uVar == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (C13033b bVar : uVar.mo20415a()) {
            linkedList.add(bVar.f31795a);
        }
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<C13034c> mo20891a(String str, C12601u<C13033b> uVar, C12601u<C13033b> uVar2, C12601u<C13033b> uVar3, List<String> list) {
        String str2;
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        C13034c cVar = new C13034c(this, (byte) 0);
        cVar.f31799a = str;
        cVar.f31800b = new C13034c(this, (byte) 0);
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        if (list.contains(file.getAbsolutePath())) {
            arrayList.add(cVar);
            list.remove(file.getAbsolutePath());
        }
        cVar.f31802d = listFiles.length;
        LinkedList linkedList = new LinkedList();
        linkedList.offer(cVar);
        while (!linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i = 0; i < size; i++) {
                C13034c cVar2 = (C13034c) linkedList.poll();
                if (cVar2 != null) {
                    String str3 = cVar2.f31799a;
                    File file2 = new File(str3);
                    if (!file2.exists() || m23408a(file2)) {
                        cVar2.f31800b.f31802d--;
                    } else if (file2.isFile()) {
                        long length = file2.length();
                        if (!m23406a(length)) {
                            str2 = str3;
                            uVar.mo20416a(new C13033b(str3, length, 1));
                        } else {
                            str2 = str3;
                        }
                        if (cVar2.f31800b != null) {
                            cVar2.f31800b.mo20899a(length, uVar3, uVar2);
                            if (!cVar2.f31800b.f31803e) {
                                long c = m23415c(file2.lastModified());
                                if (c > 0 && m23413b(length)) {
                                    uVar3.mo20416a(new C13035d(str2, (long) size, 0, c));
                                }
                            }
                        }
                    } else {
                        if (list.contains(file2.getAbsolutePath())) {
                            arrayList.add(cVar2);
                            list.remove(file2.getAbsolutePath());
                        }
                        File[] listFiles2 = file2.listFiles();
                        if (listFiles2 == null || listFiles2.length == 0) {
                            cVar2.f31800b.mo20899a(0, uVar3, uVar2);
                        } else {
                            cVar2.f31802d = listFiles2.length;
                            for (File file3 : listFiles2) {
                                C13034c cVar3 = new C13034c(this, (byte) 0);
                                cVar3.f31800b = cVar2;
                                cVar3.f31799a = file3.getAbsolutePath();
                                if (file3.isDirectory() && !cVar2.f31803e) {
                                    long c2 = m23415c(file3.lastModified());
                                    if (c2 > 0) {
                                        cVar3.f31803e = true;
                                        cVar3.f31804f = c2;
                                    }
                                }
                                linkedList.offer(cVar3);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20892a(File file, List<C13032a> list) {
        File[] listFiles = file.listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                m23411b(file2, list);
            }
        }
    }

    /* renamed from: a */
    private boolean m23408a(File file) {
        if (!C13130f.m23608a(this.f31779g)) {
            return this.f31779g.contains(file.getAbsolutePath());
        }
        return false;
    }

    /* renamed from: com.bytedance.b.d.c$c */
    class C13034c {

        /* renamed from: a */
        public String f31799a;

        /* renamed from: b */
        public C13034c f31800b;

        /* renamed from: c */
        public long f31801c;

        /* renamed from: d */
        public int f31802d;

        /* renamed from: e */
        public boolean f31803e;

        /* renamed from: f */
        public long f31804f;

        /* renamed from: h */
        private int f31806h;

        /* renamed from: i */
        private boolean f31807i;

        static {
            Covode.recordClassIndex(14870);
        }

        /* renamed from: a */
        private boolean m23424a() {
            if (this.f31806h == this.f31802d) {
                return true;
            }
            return false;
        }

        private C13034c() {
        }

        /* synthetic */ C13034c(C13031c cVar, byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo20899a(long j, C12601u<C13033b> uVar, C12601u<C13033b> uVar2) {
            this.f31801c += j;
            this.f31806h++;
            if (this.f31800b != null && m23424a()) {
                if (this.f31807i) {
                    this.f31800b.f31807i = true;
                }
                if (this.f31801c >= C13031c.this.f31782j.f31751c && !this.f31807i) {
                    if (!C13031c.m23406a(this.f31801c)) {
                        uVar2.mo20416a(new C13033b(this.f31799a, this.f31801c, this.f31802d));
                    }
                    this.f31800b.f31807i = true;
                }
                this.f31800b.mo20899a(this.f31801c, uVar, uVar2);
                if (this.f31803e && C13031c.m23413b(this.f31801c)) {
                    C13031c cVar = C13031c.this;
                    String str = this.f31799a;
                    long j2 = this.f31801c;
                    int i = this.f31802d;
                    uVar.mo20416a(new C13035d(str, j2, i, (long) i));
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(14867);
    }

    /* renamed from: c */
    private long m23414c() {
        long j = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            Context applicationContext = C13113a.f31955g.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            for (File file : applicationContext.getExternalMediaDirs()) {
                j += m23410b(file);
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.d.c$b */
    public class C13033b implements Comparable {

        /* renamed from: a */
        public String f31795a;

        /* renamed from: b */
        public long f31796b;

        /* renamed from: d */
        private int f31798d;

        static {
            Covode.recordClassIndex(14869);
        }

        /* renamed from: a */
        public JSONObject mo20897a() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.f31795a;
                if (str.contains(C13031c.this.f31774b)) {
                    str = str.replace(C13031c.this.f31774b, "internal");
                } else if (str.contains(C13031c.this.f31776d)) {
                    str = str.replace(C13031c.this.f31776d, "external");
                }
                jSONObject.put(StringSet.name, str);
                jSONObject.put("size", this.f31796b);
                int i = this.f31798d;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public C13033b() {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.f31796b;
            long j2 = ((C13033b) obj).f31796b;
            if (j == j2) {
                return 0;
            }
            if (j > j2) {
                return 1;
            }
            return -1;
        }

        public C13033b(String str, long j, int i) {
            this.f31795a = str;
            this.f31796b = j;
            this.f31798d = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.d.c$d */
    public class C13035d extends C13033b {

        /* renamed from: d */
        public long f31808d;

        /* renamed from: f */
        private final String f31810f;

        /* renamed from: g */
        private int f31811g;

        /* renamed from: h */
        private long f31812h;

        static {
            Covode.recordClassIndex(14871);
        }

        @Override // com.bytedance.p802b.p819d.C13031c.C13033b
        /* renamed from: a */
        public final JSONObject mo20897a() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.f31810f;
                if (str.contains(C13031c.this.f31774b)) {
                    str = str.replace(C13031c.this.f31774b, "internal");
                } else if (str.contains(C13031c.this.f31776d)) {
                    str = str.replace(C13031c.this.f31776d, "external");
                }
                jSONObject.put(StringSet.name, str);
                jSONObject.put("size", this.f31808d);
                int i = this.f31811g;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                jSONObject.put("outdate_interval", this.f31812h);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.p802b.p819d.C13031c.C13033b, java.lang.Comparable
        public final int compareTo(Object obj) {
            long j = this.f31812h;
            long j2 = ((C13035d) obj).f31812h;
            if (j == j2) {
                return 0;
            }
            if (j > j2) {
                return 1;
            }
            return -1;
        }

        public C13035d(String str, long j, int i, long j2) {
            super();
            this.f31810f = str;
            this.f31808d = j;
            this.f31811g = i;
            this.f31812h = j2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.d.c$a */
    public class C13032a {

        /* renamed from: a */
        public String f31788a;

        /* renamed from: b */
        public long f31789b;

        /* renamed from: c */
        public float f31790c;

        /* renamed from: d */
        public boolean f31791d;

        /* renamed from: e */
        public String f31792e;

        /* renamed from: f */
        public List<C13032a> f31793f;

        static {
            Covode.recordClassIndex(14868);
        }

        /* renamed from: a */
        public final JSONObject mo20896a() {
            JSONObject jSONObject = new JSONObject();
            try {
                String str = this.f31788a;
                if (str.contains(C13031c.this.f31774b)) {
                    str = str.replace(C13031c.this.f31774b, "internal");
                } else if (str.contains(C13031c.this.f31776d)) {
                    str = str.replace(C13031c.this.f31776d, "external");
                }
                jSONObject.put("path", str);
                jSONObject.put("size", this.f31789b);
                jSONObject.put("size_rate", (double) this.f31790c);
                jSONObject.put("is_folder", this.f31791d);
                jSONObject.put("report_type", this.f31792e);
                if (!this.f31793f.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (C13032a aVar : this.f31793f) {
                        jSONArray.put(aVar.mo20896a());
                    }
                    jSONObject.put("next_disk", jSONArray);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        private C13032a() {
            this.f31792e = "normal";
            this.f31793f = new ArrayList();
        }

        /* synthetic */ C13032a(C13031c cVar, byte b) {
            this();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(5:2|3|(1:5)|6|7)|8|9|(1:11)|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0080, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0071 A[Catch:{ Exception -> 0x0080 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m23409b() {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p819d.C13031c.m23409b():long");
    }

    /* renamed from: a */
    private static Pair<Long, Long> m23398a() {
        UUID fromString;
        try {
            long j = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                StorageStatsManager storageStatsManager = (StorageStatsManager) m23399a(C13113a.f31955g, "storagestats");
                StorageManager storageManager = (StorageManager) m23399a(C13113a.f31955g, "storage");
                long j2 = 0;
                for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                    String uuid = storageVolume.getUuid();
                    if (uuid == null) {
                        fromString = StorageManager.UUID_DEFAULT;
                    } else {
                        fromString = UUID.fromString(uuid);
                    }
                    j += storageStatsManager.getTotalBytes(fromString);
                    j2 += storageManager.getAllocatableBytes(fromString);
                }
                return new Pair<>(Long.valueOf(((j / 1000) / 1000) * 1024 * 1024), Long.valueOf(((j2 / 1000) / 1000) * 1024 * 1024));
            } else if (Build.VERSION.SDK_INT >= 24) {
                List<StorageVolume> storageVolumes = ((StorageManager) m23399a(C13113a.f31955g, "storage")).getStorageVolumes();
                if (C13130f.m23608a(storageVolumes)) {
                    return null;
                }
                long j3 = 0;
                for (StorageVolume storageVolume2 : storageVolumes) {
                    File file = (File) m23401a(m23403a(storageVolume2.getClass(), "getPathFile", new Class[0]), storageVolume2, new Object[0]);
                    j += file.getTotalSpace();
                    j3 += file.getFreeSpace();
                }
                return new Pair<>(Long.valueOf(((j / 1000) / 1000) * 1024 * 1024), Long.valueOf(((j3 / 1000) / 1000) * 1024 * 1024));
            } else {
                StorageManager storageManager2 = (StorageManager) m23399a(C13113a.f31955g, "storage");
                long j4 = 0;
                for (Object obj : (List) m23401a(m23403a(storageManager2.getClass(), "getVolumes", new Class[0]), storageManager2, new Object[0])) {
                    File file2 = (File) m23401a(m23403a(obj.getClass(), "getPathFile", new Class[0]), obj, new Object[0]);
                    j4 += file2.getFreeSpace();
                    j += file2.getFreeSpace();
                }
                return new Pair<>(Long.valueOf(j), Long.valueOf(j4));
            }
        } catch (Throwable unused) {
            Long valueOf = Long.valueOf(C13120c.m23590a(Environment.getDataDirectory().getPath()) + C13120c.m23590a(Environment.getRootDirectory().getPath()));
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            int i = Build.VERSION.SDK_INT;
            return new Pair<>(valueOf, Long.valueOf(statFs.getAvailableBytes()));
        }
    }

    /* renamed from: c */
    private long m23415c(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < this.f31782j.f31757i || currentTimeMillis >= 62899200000L) {
            return 0;
        }
        return currentTimeMillis;
    }

    /* renamed from: b */
    private long m23410b(File file) {
        long j;
        long j2 = 0;
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            j = m23410b(file2);
                        } else {
                            j = file2.length();
                        }
                        j2 += j;
                    }
                    return j2;
                }
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo20895c(List<C13032a> list) {
        if (!C13130f.m23608a(this.f31780h)) {
            for (String str : this.f31780h) {
                File file = new File(str);
                if (file.exists() && !m23408a(file)) {
                    if (file.isFile()) {
                        long length = file.length();
                        C13032a aVar = new C13032a(this, (byte) 0);
                        aVar.f31791d = false;
                        aVar.f31788a = file.getAbsolutePath();
                        aVar.f31789b = length;
                        aVar.f31792e = "custom";
                        list.add(aVar);
                    } else {
                        C13032a aVar2 = new C13032a(this, (byte) 0);
                        aVar2.f31791d = true;
                        aVar2.f31792e = "custom";
                        aVar2.f31788a = file.getAbsolutePath();
                        aVar2.f31789b = m23410b(file);
                        list.add(aVar2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static JSONArray m23412b(C12601u<C13033b> uVar) {
        JSONArray jSONArray = new JSONArray();
        for (C13033b bVar : uVar.mo20415a()) {
            JSONObject a = bVar.mo20897a();
            if (a != null) {
                jSONArray.put(a);
            }
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List<String> mo20894b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (C13130f.m23608a(list)) {
            return arrayList;
        }
        for (String str : list) {
            if (str.contains("internal")) {
                arrayList.add(str.replace("internal", this.f31774b));
            } else if (str.contains("external")) {
                arrayList.add(str.replace("external", this.f31776d));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static String m23402a(Context context) {
        File file;
        try {
            if (!TextUtils.isEmpty(null)) {
                file = context.getExternalFilesDir(null);
            } else {
                if (C58016d.f132223d == null || !C58016d.f132224e) {
                    C58016d.f132223d = context.getExternalFilesDir(null);
                }
                file = C58016d.f132223d;
            }
            return file.getParentFile().getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static float m23396a(long j, BigDecimal bigDecimal) {
        return (float) new BigDecimal(j).divide(bigDecimal, 4, 4).doubleValue();
    }

    /* renamed from: a */
    private static Object m23399a(Application application, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return application.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return application.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = application.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: b */
    private long m23411b(File file, List<C13032a> list) {
        long j = 0;
        if (file != null && file.exists() && !m23408a(file)) {
            if (file.isFile()) {
                long length = file.length();
                if (length < this.f31782j.f31752d) {
                    return length;
                }
                C13032a aVar = new C13032a(this, (byte) 0);
                aVar.f31791d = false;
                aVar.f31788a = file.getAbsolutePath();
                aVar.f31789b = length;
                list.add(aVar);
                return length;
            }
            File[] listFiles = file.listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                C13032a aVar2 = new C13032a(this, (byte) 0);
                aVar2.f31791d = file.isDirectory();
                aVar2.f31788a = file.getAbsolutePath();
                ArrayList arrayList = new ArrayList();
                aVar2.f31793f = arrayList;
                list.add(aVar2);
                for (File file2 : listFiles) {
                    if (file2 != null && file2.exists() && !m23408a(file2)) {
                        j += m23411b(file2, arrayList);
                    }
                }
                aVar2.f31789b = j;
            }
        }
        return j;
    }

    /* renamed from: a */
    private static Object m23400a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: a */
    private static ApplicationInfo m23397a(PackageManager packageManager, String str, int i) {
        if (!TextUtils.equals(str, C17867d.m33078a().getPackageName()) || i != 128) {
            return packageManager.getApplicationInfo(str, i);
        }
        if (C58014b.f132218a == null) {
            C58014b.f132218a = packageManager.getApplicationInfo(str, i);
        }
        return C58014b.f132218a;
    }
}
