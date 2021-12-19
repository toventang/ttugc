package com.bytedance.apm.p779k;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.C12509b;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p775g.AbstractC12476d;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12576b;
import com.bytedance.apm.p789q.C12592m;
import com.bytedance.apm.p789q.C12601u;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.slardar.config.IConfigManager;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.h */
public final class C12539h extends AbstractC12513a {

    /* renamed from: d */
    public static String f30455d;

    /* renamed from: f */
    public static String f30456f;

    /* renamed from: t */
    private static long f30457t = 17179869184L;

    /* renamed from: A */
    private C12601u<C12542b> f30458A;

    /* renamed from: B */
    private C12601u<C12542b> f30459B;

    /* renamed from: C */
    private C12601u<C12544d> f30460C;

    /* renamed from: a */
    public long f30461a = 524288000;

    /* renamed from: b */
    public long f30462b = 524288000;

    /* renamed from: c */
    public AbstractC12476d f30463c;

    /* renamed from: e */
    public String f30464e;

    /* renamed from: g */
    public String f30465g;

    /* renamed from: h */
    public long f30466h;

    /* renamed from: i */
    public long f30467i;

    /* renamed from: j */
    public long f30468j;

    /* renamed from: k */
    public long f30469k;

    /* renamed from: l */
    private boolean f30470l;

    /* renamed from: m */
    private boolean f30471m;

    /* renamed from: r */
    private int f30472r = 20;

    /* renamed from: s */
    private long f30473s = 2592000000L;

    /* renamed from: u */
    private boolean f30474u;

    /* renamed from: v */
    private List<C12541a> f30475v;

    /* renamed from: w */
    private List<String> f30476w = new ArrayList();

    /* renamed from: x */
    private List<String> f30477x = new ArrayList();

    /* renamed from: y */
    private List<String> f30478y = new ArrayList();

    /* renamed from: z */
    private List<String> f30479z = new ArrayList();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final boolean mo20036b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: c */
    public final long mo20037c() {
        return 120000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm.k.h$b */
    public static class C12542b implements Comparable {

        /* renamed from: a */
        public String f30491a;

        /* renamed from: b */
        public long f30492b;

        /* renamed from: c */
        private int f30493c;

        static {
            Covode.recordClassIndex(14358);
        }

        public C12542b() {
        }

        /* renamed from: a */
        public JSONObject mo20367a() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.f30491a;
                if (str.contains(C12539h.f30455d)) {
                    str = str.replace(C12539h.f30455d, "internal");
                } else if (str.contains(C12539h.f30456f)) {
                    str = str.replace(C12539h.f30456f, "external");
                }
                jSONObject.put(StringSet.name, str);
                jSONObject.put("size", this.f30492b);
                int i = this.f30493c;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j = this.f30492b;
            long j2 = ((C12542b) obj).f30492b;
            if (j == j2) {
                return 0;
            }
            if (j > j2) {
                return 1;
            }
            return -1;
        }

        public C12542b(String str, long j, int i) {
            this.f30491a = str;
            this.f30492b = j;
            this.f30493c = i;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20034a(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("dump_switch", true);
        this.f30471m = optBoolean;
        if (optBoolean) {
            long currentTimeMillis = System.currentTimeMillis() - C12509b.C12510a.f30379a.mo20342b("check_disk_last_time");
            if (currentTimeMillis < 86400000 && currentTimeMillis > 0) {
                this.f30470l = true;
            }
            if (jSONObject.optInt("dump_threshold") > 0) {
                this.f30461a = ((long) jSONObject.optInt("dump_threshold")) * 1024 * 1024;
            }
            if (jSONObject.optInt("abnormal_folder_size") > 0) {
                this.f30462b = ((long) jSONObject.optInt("abnormal_folder_size")) * 1024 * 1024;
            }
            if (jSONObject.optInt("dump_top_count") > 0) {
                this.f30472r = jSONObject.optInt("dump_top_count");
            }
            if (jSONObject.optInt("outdated_days") > 0) {
                this.f30473s = ((long) jSONObject.optInt("outdated_days")) * 86400000;
            }
            this.f30476w = C12592m.m22694c(jSONObject, "disk_customed_paths");
            this.f30477x = C12592m.m22693b(jSONObject, "ignored_relative_paths");
        }
        if (jSONObject.optBoolean("enable_collect_apm6", false)) {
            this.f30470l = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm.k.h$a */
    public static class C12541a {

        /* renamed from: a */
        public String f30485a;

        /* renamed from: b */
        public long f30486b;

        /* renamed from: c */
        public float f30487c;

        /* renamed from: d */
        public boolean f30488d;

        /* renamed from: e */
        public String f30489e;

        /* renamed from: f */
        public List<C12541a> f30490f;

        static {
            Covode.recordClassIndex(14357);
        }

        private C12541a() {
            this.f30489e = "normal";
            this.f30490f = new ArrayList();
        }

        /* renamed from: a */
        public final JSONObject mo20366a() {
            JSONObject jSONObject = new JSONObject();
            try {
                String str = this.f30485a;
                if (str.contains(C12539h.f30455d)) {
                    str = str.replace(C12539h.f30455d, "internal");
                } else if (str.contains(C12539h.f30456f)) {
                    str = str.replace(C12539h.f30456f, "external");
                }
                jSONObject.put("path", str);
                jSONObject.put("size", this.f30486b);
                jSONObject.put("size_rate", (double) this.f30487c);
                jSONObject.put("is_folder", this.f30488d);
                jSONObject.put("report_type", this.f30489e);
                if (!this.f30490f.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (C12541a aVar : this.f30490f) {
                        jSONArray.put(aVar.mo20366a());
                    }
                    jSONObject.put("next_disk", jSONArray);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* synthetic */ C12541a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.apm.k.h$c */
    class C12543c {

        /* renamed from: a */
        public String f30494a;

        /* renamed from: b */
        public C12543c f30495b;

        /* renamed from: c */
        public long f30496c;

        /* renamed from: d */
        public int f30497d;

        /* renamed from: e */
        public boolean f30498e;

        /* renamed from: f */
        public long f30499f;

        /* renamed from: h */
        private int f30501h;

        /* renamed from: i */
        private boolean f30502i;

        static {
            Covode.recordClassIndex(14359);
        }

        /* renamed from: a */
        private boolean m22554a() {
            if (this.f30501h == this.f30497d) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private void m22555b() {
            if (TextUtils.equals(this.f30494a, C12539h.f30455d)) {
                C12539h.this.f30466h = this.f30496c;
            } else if (TextUtils.equals(this.f30494a, C12539h.f30456f)) {
                C12539h.this.f30467i = this.f30496c;
            } else if (TextUtils.equals(this.f30494a, C12539h.this.f30464e)) {
                C12539h.this.f30468j = this.f30496c;
            } else if (TextUtils.equals(this.f30494a, C12539h.this.f30465g)) {
                C12539h.this.f30469k = this.f30496c;
            }
        }

        private C12543c() {
        }

        /* renamed from: a */
        public final void mo20369a(long j) {
            this.f30496c += j;
            this.f30501h++;
            if (this.f30495b != null && m22554a()) {
                if (this.f30502i) {
                    this.f30495b.f30502i = true;
                }
                if (this.f30496c >= C12539h.this.f30462b && !this.f30502i) {
                    C12539h.this.mo20363a(this.f30494a, this.f30496c, this.f30497d);
                    this.f30495b.f30502i = true;
                }
                this.f30495b.mo20369a(this.f30496c);
                if (this.f30498e) {
                    C12539h.this.mo20364a(this.f30494a, this.f30496c, this.f30497d, this.f30499f);
                }
                m22555b();
            }
        }

        /* synthetic */ C12543c(C12539h hVar, byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(14355);
    }

    public C12539h() {
        this.f30391p = "disk";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm.k.h$d */
    public static class C12544d extends C12542b {

        /* renamed from: c */
        public long f30503c;

        /* renamed from: d */
        private String f30504d;

        /* renamed from: e */
        private int f30505e;

        /* renamed from: f */
        private long f30506f;

        static {
            Covode.recordClassIndex(14360);
        }

        @Override // com.bytedance.apm.p779k.C12539h.C12542b
        /* renamed from: a */
        public final JSONObject mo20367a() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.f30504d;
                if (str.contains(C12539h.f30455d)) {
                    str = str.replace(C12539h.f30455d, "internal");
                } else if (str.contains(C12539h.f30456f)) {
                    str = str.replace(C12539h.f30456f, "external");
                }
                jSONObject.put(StringSet.name, str);
                jSONObject.put("size", this.f30503c);
                int i = this.f30505e;
                if (i > 0) {
                    jSONObject.put("num", i);
                }
                jSONObject.put("outdate_interval", this.f30506f);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable, com.bytedance.apm.p779k.C12539h.C12542b
        public final int compareTo(Object obj) {
            long j = this.f30506f;
            long j2 = ((C12544d) obj).f30506f;
            if (j == j2) {
                return 0;
            }
            if (j > j2) {
                return 1;
            }
            return -1;
        }

        public C12544d(String str, long j, int i, long j2) {
            this.f30504d = str;
            this.f30503c = j;
            this.f30505e = i;
            this.f30506f = j2;
        }
    }

    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: e */
    public final void mo20039e() {
        List<C12541a> list;
        File file;
        boolean z = this.f30390o;
        if (!this.f30470l && z) {
            if (f30455d == null) {
                Context context = C12397c.f29931a;
                try {
                    context.getPackageName();
                    if (C58016d.f132222c == null || !C58016d.f132224e) {
                        C58016d.f132222c = context.getFilesDir();
                    }
                    f30455d = C58016d.f132222c.getParent();
                    if (C58016d.f132221b == null || !C58016d.f132224e) {
                        C58016d.f132221b = context.getCacheDir();
                    }
                    this.f30464e = C58016d.f132221b.getAbsolutePath();
                    if (!TextUtils.isEmpty(null)) {
                        file = context.getExternalFilesDir(null);
                    } else {
                        if (C58016d.f132223d == null || !C58016d.f132224e) {
                            C58016d.f132223d = context.getExternalFilesDir(null);
                        }
                        file = C58016d.f132223d;
                    }
                    f30456f = file.getParentFile().getAbsolutePath();
                    if (C58016d.f132220a == null || !C58016d.f132224e) {
                        C58016d.f132220a = context.getExternalCacheDir();
                    }
                    File file2 = C58016d.f132220a;
                    if (file2 != null) {
                        this.f30465g = file2.getAbsolutePath();
                    }
                    List<String> list2 = this.f30477x;
                    if (list2 != null) {
                        for (String str : list2) {
                            if (str.contains("internal")) {
                                this.f30478y.add(str.replace("internal", f30455d));
                            } else if (str.contains("external")) {
                                this.f30478y.add(str.replace("external", f30456f));
                            }
                        }
                    }
                    List<String> list3 = this.f30476w;
                    if (list3 != null) {
                        for (String str2 : list3) {
                            if (str2.contains("internal")) {
                                this.f30479z.add(str2.replace("internal", f30455d));
                            } else if (str2.contains("external")) {
                                this.f30479z.add(str2.replace("external", f30456f));
                            }
                        }
                    }
                } catch (Exception unused) {
                    this.f30474u = true;
                }
            }
            if (this.f30474u) {
                this.f30470l = true;
                return;
            }
            if (this.f30471m) {
                try {
                    byte b = 0;
                    String[] strArr = {f30455d, f30456f};
                    this.f30475v = new ArrayList();
                    int i = 0;
                    while (true) {
                        String str3 = strArr[i];
                        m22543a(new File(str3), 1, true, this.f30475v);
                        File file3 = new File(str3);
                        C12543c cVar = new C12543c(this, b);
                        cVar.f30494a = str3;
                        cVar.f30495b = new C12543c(this, b);
                        File[] listFiles = file3.listFiles();
                        if (!(listFiles == null || listFiles.length == 0)) {
                            cVar.f30497d = listFiles.length;
                            LinkedList linkedList = new LinkedList();
                            linkedList.offer(cVar);
                            while (!linkedList.isEmpty()) {
                                int size = linkedList.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    C12543c cVar2 = (C12543c) linkedList.poll();
                                    if (cVar2 != null) {
                                        String str4 = cVar2.f30494a;
                                        File file4 = new File(str4);
                                        if (!file4.exists() || this.f30478y.contains(str4)) {
                                            cVar2.f30495b.f30497d--;
                                        } else if (file4.isFile()) {
                                            long length = file4.length();
                                            if (length > 0) {
                                                if (C12397c.m22288e()) {
                                                    String[] strArr2 = new String[1];
                                                    String str5 = "appendExceptionFileQueue: path: " + str4 + ", size: " + length;
                                                }
                                                if (length <= f30457t) {
                                                    if (this.f30458A == null) {
                                                        this.f30458A = new C12601u<>(this.f30472r);
                                                    }
                                                    this.f30458A.mo20416a(new C12542b(str4, length, 1));
                                                }
                                            }
                                            if (cVar2.f30495b != null) {
                                                cVar2.f30495b.mo20369a(length);
                                                if (!cVar2.f30495b.f30498e) {
                                                    long b2 = m22545b(file4.lastModified());
                                                    if (b2 > 0) {
                                                        mo20364a(str4, length, 0, b2);
                                                    }
                                                }
                                            }
                                        } else {
                                            File[] listFiles2 = file4.listFiles();
                                            if (listFiles2 == null || listFiles2.length == 0) {
                                                cVar2.f30495b.mo20369a(0);
                                            } else {
                                                cVar2.f30497d = listFiles2.length;
                                                int length2 = listFiles2.length;
                                                int i3 = 0;
                                                while (i3 < length2) {
                                                    File file5 = listFiles2[i3];
                                                    C12543c cVar3 = new C12543c(this, b);
                                                    cVar3.f30495b = cVar2;
                                                    cVar3.f30494a = file5.getAbsolutePath();
                                                    if (file5.isDirectory() && !cVar2.f30498e) {
                                                        long b3 = m22545b(file5.lastModified());
                                                        if (b3 > 0) {
                                                            cVar3.f30498e = true;
                                                            cVar3.f30499f = b3;
                                                        }
                                                    }
                                                    linkedList.offer(cVar3);
                                                    i3++;
                                                    b = 0;
                                                }
                                            }
                                        }
                                    }
                                    i2++;
                                    b = 0;
                                }
                            }
                        }
                        i++;
                        b = 0;
                        if (i >= 2) {
                            break;
                        }
                    }
                    List<String> list4 = this.f30479z;
                    if (list4 != null && list4.size() > 0) {
                        for (String str6 : this.f30479z) {
                            m22543a(new File(str6), 1, false, this.f30475v);
                        }
                    }
                    for (C12541a aVar : this.f30475v) {
                        if ("normal".equals(aVar.f30489e) && (list = aVar.f30490f) != null && !list.isEmpty()) {
                            for (C12541a aVar2 : list) {
                                aVar.f30486b += aVar2.f30486b;
                            }
                        }
                    }
                    m22542a(this.f30467i + this.f30466h, this.f30469k + this.f30468j, Environment.getRootDirectory().getTotalSpace() + Environment.getDataDirectory().getTotalSpace(), Environment.getDataDirectory().getFreeSpace());
                    C12509b.C12510a.f30379a.mo20340a("check_disk_last_time", System.currentTimeMillis());
                } catch (Throwable unused2) {
                }
            } else {
                m22542a(C12576b.m22627a(C12397c.f29931a), C12576b.m22634b(C12397c.f29931a), C12576b.m22639f() + C12576b.m22628a(Environment.getRootDirectory()), Environment.getDataDirectory().getFreeSpace());
            }
            this.f30470l = true;
            mo20345i();
            ActivityLifeObserver.getInstance().unregister(this);
            ((IConfigManager) C21520c.m40424a(IConfigManager.class)).unregisterConfigListener(this);
        }
    }

    /* renamed from: a */
    private boolean m22544a(C12541a aVar) {
        for (String str : this.f30478y) {
            if (aVar.f30485a.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private long m22545b(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < this.f30473s || currentTimeMillis >= 62899200000L) {
            return 0;
        }
        return currentTimeMillis;
    }

    /* renamed from: a */
    private long m22540a(File file) {
        long j;
        long j2 = 0;
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            j = m22540a(file2);
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

    /* renamed from: a */
    private static List<String> m22541a(C12601u<? extends C12542b> uVar) {
        if (uVar == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (C12542b bVar : uVar.mo20415a()) {
            linkedList.add(bVar.f30491a);
        }
        return linkedList;
    }

    /* renamed from: a */
    private static float m22539a(long j, BigDecimal bigDecimal) {
        return (float) new BigDecimal(j).divide(bigDecimal, 4, 4).doubleValue();
    }

    /* renamed from: a */
    public final void mo20363a(String str, long j, int i) {
        if (j <= f30457t) {
            if (this.f30459B == null) {
                this.f30459B = new C12601u<>(this.f30472r);
            }
            this.f30459B.mo20416a(new C12542b(str, j, i));
        }
    }

    /* renamed from: a */
    private void m22543a(File file, int i, boolean z, List<C12541a> list) {
        if (i <= 2 && file != null && file.exists() && !this.f30478y.contains(file.getAbsolutePath())) {
            if (!file.isDirectory()) {
                C12541a aVar = new C12541a((byte) 0);
                aVar.f30488d = false;
                aVar.f30485a = file.getAbsolutePath();
                aVar.f30486b = file.length();
                if (!z) {
                    aVar.f30489e = "custom";
                }
                list.add(aVar);
            } else if (z) {
                File[] listFiles = file.listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists() && !this.f30478y.contains(file2.getAbsolutePath())) {
                            C12541a aVar2 = new C12541a((byte) 0);
                            aVar2.f30488d = file2.isDirectory();
                            aVar2.f30485a = file2.getAbsolutePath();
                            if (file2.isDirectory()) {
                                ArrayList arrayList = new ArrayList();
                                aVar2.f30490f = arrayList;
                                if (i == 2) {
                                    aVar2.f30486b = m22540a(file2);
                                }
                                m22543a(file2, i + 1, z, arrayList);
                                list.add(aVar2);
                            } else {
                                aVar2.f30486b = file2.length();
                                list.add(aVar2);
                            }
                        }
                    }
                }
            } else {
                C12541a aVar3 = new C12541a((byte) 0);
                aVar3.f30488d = true;
                aVar3.f30489e = "custom";
                aVar3.f30485a = file.getAbsolutePath();
                aVar3.f30486b = m22540a(file);
                list.add(aVar3);
            }
        }
    }

    /* renamed from: a */
    private void m22542a(long j, long j2, long j3, long j4) {
        final long j5;
        try {
            if (C12397c.m22288e()) {
                String[] strArr = new String[1];
                String str = "disk: data: " + j + " , cache: " + j2 + " , total: " + j3 + " , free: " + j4;
            }
            long j6 = f30457t;
            if (j > j6) {
                j5 = j6;
            } else {
                j5 = j;
            }
            if (j2 <= j6) {
                j6 = j2;
            }
            JSONObject jSONObject = new JSONObject();
            if (j > 0) {
                jSONObject.put("data", j5);
            }
            if (j2 > 0) {
                jSONObject.put("cache", j6);
            }
            if (j3 > 0) {
                jSONObject.put("total", j3 / 1073741824);
            }
            if (j4 > 0) {
                jSONObject.put("rom_free", j4 / 1073741824);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.f30471m && j5 > this.f30461a) {
                if (this.f30458A != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (C12542b bVar : this.f30458A.mo20415a()) {
                        JSONObject a = bVar.mo20367a();
                        if (a != null) {
                            jSONArray.put(a);
                        }
                    }
                    jSONObject2.put("top_usage", jSONArray);
                }
                if (this.f30459B != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (C12542b bVar2 : this.f30459B.mo20415a()) {
                        JSONObject a2 = bVar2.mo20367a();
                        if (a2 != null) {
                            jSONArray2.put(a2);
                        }
                    }
                    jSONObject2.put("exception_folders", jSONArray2);
                }
                if (this.f30460C != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (C12544d dVar : this.f30460C.mo20415a()) {
                        JSONObject a3 = dVar.mo20367a();
                        if (a3 != null) {
                            jSONArray3.put(a3);
                        }
                    }
                    jSONObject2.put("outdated_files", jSONArray3);
                }
                List<C12541a> list = this.f30475v;
                if (list != null && !list.isEmpty()) {
                    BigDecimal bigDecimal = new BigDecimal(j5);
                    JSONArray jSONArray4 = new JSONArray();
                    for (C12541a aVar : this.f30475v) {
                        if (m22544a(aVar)) {
                            aVar.f30487c = 0.0f;
                        } else {
                            aVar.f30487c = m22539a(aVar.f30486b, bigDecimal);
                        }
                        List<C12541a> list2 = aVar.f30490f;
                        if (list2 != null && list2.size() > 0) {
                            for (C12541a aVar2 : list2) {
                                if (m22544a(aVar2)) {
                                    aVar2.f30487c = 0.0f;
                                } else {
                                    aVar2.f30487c = m22539a(aVar2.f30486b, bigDecimal);
                                }
                            }
                        }
                        jSONArray4.put(aVar.mo20366a());
                    }
                    jSONObject2.put("disk_info", jSONArray4);
                }
                if (this.f30463c != null) {
                    final List<String> a4 = m22541a(this.f30458A);
                    final List<String> a5 = m22541a(this.f30459B);
                    final List<String> a6 = m22541a(this.f30460C);
                    C12560b.C12564a.f30567a.mo20391b(new Runnable() {
                        /* class com.bytedance.apm.p779k.C12539h.RunnableC125401 */

                        static {
                            Covode.recordClassIndex(14356);
                        }

                        public final void run() {
                        }
                    });
                }
                this.f30458A = null;
                this.f30459B = null;
                this.f30460C = null;
                this.f30475v = null;
            }
            m22485a(new C12412f("disk", "storageUsed", jSONObject, null, jSONObject2));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo20364a(String str, long j, int i, long j2) {
        if (C12397c.m22288e()) {
            String[] strArr = new String[1];
            String str2 = "appendutdatedFileQueue: path: " + str + ", size: " + j;
        }
        if (j >= 102400 && j <= f30457t) {
            if (this.f30460C == null) {
                this.f30460C = new C12601u<>(this.f30472r);
            }
            this.f30460C.mo20416a(new C12544d(str, j, i, j2));
        }
    }
}
