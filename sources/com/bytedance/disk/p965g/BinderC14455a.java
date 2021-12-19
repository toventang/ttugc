package com.bytedance.disk.p965g;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p956a.AbstractC14423a;
import com.bytedance.disk.p960d.C14440b;
import com.bytedance.disk.p961e.AbstractC14448c;
import com.bytedance.disk.p961e.p962a.C14442a;
import com.bytedance.disk.p961e.p963b.AbstractC14445b;
import com.bytedance.disk.p961e.p963b.C14444a;
import com.bytedance.disk.p964f.AbstractC14454c;
import com.bytedance.disk.p964f.C14450a;
import com.bytedance.disk.p966h.C14468a;
import com.bytedance.disk.p966h.C14473c;
import com.bytedance.disk.p966h.C14474d;
import com.bytedance.disk.p966h.C14476e;
import com.bytedance.disk.p966h.C14479f;
import com.bytedance.disk.parcel.ClientProxyConfig;
import com.bytedance.disk.parcel.MigrationItem;
import com.bytedance.disk.parcel.MigrationOpt;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1746v.p1747a.C23535b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.disk.g.a */
public class BinderC14455a extends AbstractC14423a.AbstractBinderC14424a {

    /* renamed from: a */
    public static volatile BinderC14455a f34958a;

    /* renamed from: b */
    InputStream f34959b = null;

    /* renamed from: c */
    OutputStream f34960c = null;

    /* renamed from: d */
    public SparseArray<ClientProxyConfig> f34961d = new SparseArray<>();

    /* renamed from: e */
    final Object f34962e = new Object();

    /* renamed from: f */
    final SparseArray<Map<String, MigrationItem>> f34963f = new SparseArray<>(3);

    /* renamed from: g */
    final SparseArray<Map<String, MigrationItem>> f34964g = new SparseArray<>(3);

    /* renamed from: h */
    final SparseArray<Map<String, MigrationItem>> f34965h = new SparseArray<>(3);

    /* renamed from: i */
    final SparseArray<Map<String, MigrationItem>> f34966i = new SparseArray<>(3);

    /* renamed from: j */
    final SparseArray<Map<String, MigrationItem>> f34967j = new SparseArray<>(3);

    /* renamed from: k */
    final SparseArray<Map<String, MigrationItem>> f34968k = new SparseArray<>(3);

    /* renamed from: l */
    final List<MigrationItem> f34969l = new ArrayList();

    /* renamed from: m */
    final ConditionVariable f34970m = new ConditionVariable(false);

    /* renamed from: n */
    final AtomicBoolean f34971n = new AtomicBoolean(false);

    /* renamed from: o */
    boolean f34972o = false;

    /* renamed from: p */
    public AbstractC14445b f34973p;

    /* renamed from: q */
    public AbstractC14448c f34974q;

    /* renamed from: r */
    private Context f34975r;

    /* renamed from: s */
    private HandlerThread f34976s = new HandlerThread("MST");

    /* renamed from: t */
    private HandlerC14467a f34977t;

    /* renamed from: u */
    private Executor f34978u;

    /* renamed from: v */
    private C14476e.AbstractC14478b f34979v;

    /* renamed from: w */
    private FileFilter f34980w;

    /* renamed from: x */
    private int f34981x;

    /* renamed from: y */
    private int f34982y;

    static {
        Covode.recordClassIndex(16534);
    }

    /* renamed from: a */
    public static boolean m26406a(MigrationItem migrationItem) {
        if (!(migrationItem == null || migrationItem.f35012c == null)) {
            File file = new File(migrationItem.f35012c.f35021c);
            if (!file.exists()) {
                return true;
            }
            if (!migrationItem.mo23312c() && !migrationItem.mo23314d() && !migrationItem.mo23316e()) {
                try {
                    migrationItem.f35017h.close();
                    return C14476e.m26457a(file);
                } finally {
                    migrationItem.f35017h.open();
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.disk.p956a.AbstractC14423a
    /* renamed from: a */
    public final int mo23240a(MigrationOpt migrationOpt) {
        MethodCollector.m26663i(486);
        if (!this.f34972o) {
            MethodCollector.m26664o(486);
            return -1;
        }
        MigrationOpt a = MigrationOpt.m26484a(migrationOpt);
        if (!MigrationOpt.m26486a(a, false)) {
            MigrationItem a2 = MigrationItem.C14482a.m26482a();
            a2.f35012c = a;
            HashMap hashMap = new HashMap();
            hashMap.put("reason", "105");
            C14479f.m26470a(this.f34974q, 1, a2, hashMap);
            MigrationItem.C14482a.m26483a(a2);
            MethodCollector.m26664o(486);
            return 99;
        }
        MigrationItem a3 = MigrationItem.C14482a.m26482a();
        a3.f35012c = a;
        synchronized (this.f34962e) {
            try {
                if (m26409b(a3, false, true)) {
                    MigrationItem.C14482a.m26483a(a3);
                    return 98;
                } else if (m26408b(a3, true)) {
                    MigrationItem.C14482a.m26483a(a3);
                    MethodCollector.m26664o(486);
                    return 97;
                } else if (m26410c(a3, false, true)) {
                    MigrationItem.C14482a.m26483a(a3);
                    MethodCollector.m26664o(486);
                    return 98;
                } else if (m26413d(a3, false, true)) {
                    MigrationItem.C14482a.m26483a(a3);
                    MethodCollector.m26664o(486);
                    return 98;
                } else if (m26415e(a3, false, true)) {
                    MigrationItem.C14482a.m26483a(a3);
                    MethodCollector.m26664o(486);
                    return 98;
                } else if (m26407a(a3, false, true)) {
                    MigrationItem.C14482a.m26483a(a3);
                    MethodCollector.m26664o(486);
                    return 98;
                } else if (!MigrationOpt.m26486a(a, true)) {
                    MigrationItem.C14482a.m26483a(a3);
                    MethodCollector.m26664o(486);
                    return 99;
                } else {
                    if (TextUtils.isEmpty(a3.f35012c.f35019a) && a3.f35012c.f35024f == 2) {
                        a3.f35012c.f35019a = a3.f35012c.f35021c;
                    }
                    m26404a(a3, 0);
                    this.f34977t.sendMessage(this.f34977t.obtainMessage(1, a3));
                    this.f34963f.get(a.f35024f).put(a.f35021c, a3);
                    C14479f.m26470a(this.f34974q, 1, a3, null);
                    MethodCollector.m26664o(486);
                    return 0;
                }
            } finally {
                MethodCollector.m26664o(486);
            }
        }
    }

    @Override // com.bytedance.disk.p956a.AbstractC14423a
    /* renamed from: a */
    public final int mo23241a(MigrationOpt migrationOpt, int i) {
        int i2 = -1;
        if (!this.f34972o) {
            return -1;
        }
        if (i != 2 && i != 4 && i != 7 && i != 8) {
            return -1;
        }
        MigrationOpt a = MigrationOpt.m26484a(migrationOpt);
        if (!MigrationOpt.m26486a(a, false)) {
            MigrationOpt.C14484a.m26489a(a);
            return 99;
        }
        MigrationItem a2 = MigrationItem.C14482a.m26482a();
        a2.f35012c = a;
        if (i == 4) {
            i2 = m26417h(a2);
        } else if (i == 2) {
            i2 = m26418i(a2);
        } else if (i == 7) {
            i2 = m26398a(a2, true);
        } else {
            if (i == 8) {
                i2 = m26398a(a2, false);
            }
            MigrationItem.C14482a.m26483a(a2);
            return i2;
        }
        if (i2 == 0) {
            if (i == 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("detail-reason", a2.f35012c.f35020b);
                C14479f.m26470a(this.f34974q, 3, a2, hashMap);
            } else if (i == 2) {
                C14479f.m26470a(this.f34974q, 4, a2, null);
            }
        }
        MigrationItem.C14482a.m26483a(a2);
        return i2;
    }

    @Override // com.bytedance.disk.p956a.AbstractC14423a
    /* renamed from: a */
    public final MigrationItem mo23242a(MigrationOpt migrationOpt, boolean z, boolean z2) {
        MigrationItem migrationItem;
        MigrationItem migrationItem2;
        MigrationItem migrationItem3;
        MigrationItem migrationItem4;
        MigrationItem migrationItem5;
        MigrationItem migrationItem6;
        SparseArray<Map<String, MigrationItem>> sparseArray;
        MethodCollector.m26663i(555);
        if (!this.f34972o) {
            MethodCollector.m26664o(555);
            return null;
        }
        MigrationOpt a = MigrationOpt.m26484a(migrationOpt);
        if (!MigrationOpt.m26486a(a, false)) {
            MethodCollector.m26664o(555);
            return null;
        }
        MigrationItem a2 = MigrationItem.C14482a.m26482a();
        a2.f35012c = a;
        synchronized (this.f34962e) {
            if (z) {
                try {
                    migrationItem = m26402a(a2, this.f34963f, false, z2);
                } catch (Throwable th) {
                    MethodCollector.m26664o(555);
                    throw th;
                }
            } else {
                migrationItem = m26401a(a2, this.f34963f, false);
            }
            if (migrationItem != null) {
                MigrationItem.C14482a.m26483a(a2);
                MigrationItem a3 = MigrationItem.m26472a(migrationItem, false);
                MethodCollector.m26664o(555);
                return a3;
            }
            if (z) {
                migrationItem2 = m26402a(a2, this.f34964g, false, z2);
            } else {
                migrationItem2 = m26401a(a2, this.f34964g, false);
            }
            if (migrationItem2 != null) {
                MigrationItem.C14482a.m26483a(a2);
                MigrationItem a4 = MigrationItem.m26472a(migrationItem2, false);
                MethodCollector.m26664o(555);
                return a4;
            }
            if (z) {
                migrationItem3 = m26402a(a2, this.f34965h, false, z2);
            } else {
                migrationItem3 = m26401a(a2, this.f34965h, false);
            }
            if (migrationItem3 != null) {
                if (migrationItem3.f35011b != -1) {
                    a2.mo23307a(100);
                }
                MigrationItem.C14482a.m26483a(a2);
                MigrationItem a5 = MigrationItem.m26472a(migrationItem3, false);
                MethodCollector.m26664o(555);
                return a5;
            }
            if (z) {
                migrationItem4 = m26402a(a2, this.f34966i, false, z2);
            } else {
                migrationItem4 = m26401a(a2, this.f34966i, false);
            }
            if (migrationItem4 != null) {
                MigrationItem.C14482a.m26483a(a2);
                MigrationItem a6 = MigrationItem.m26472a(migrationItem4, false);
                MethodCollector.m26664o(555);
                return a6;
            }
            if (z) {
                if (z2) {
                    sparseArray = null;
                } else {
                    sparseArray = this.f34967j;
                }
                migrationItem5 = m26402a(a2, sparseArray, false, z2);
            } else {
                migrationItem5 = m26401a(a2, this.f34967j, false);
            }
            if (migrationItem5 != null) {
                a2.mo23307a(100);
                MigrationItem.C14482a.m26483a(a2);
                MigrationItem a7 = MigrationItem.m26472a(migrationItem5, false);
                MethodCollector.m26664o(555);
                return a7;
            }
            if (z) {
                migrationItem6 = m26402a(a2, this.f34968k, false, z2);
            } else {
                migrationItem6 = m26401a(a2, this.f34968k, false);
            }
            if (migrationItem6 != null) {
                MigrationItem.C14482a.m26483a(a2);
                MigrationItem a8 = MigrationItem.m26472a(migrationItem6, false);
                MethodCollector.m26664o(555);
                return a8;
            }
            MethodCollector.m26664o(555);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23283a() {
        MethodCollector.m26663i(765);
        if (this.f34964g.get(0).size() + this.f34964g.get(1).size() + this.f34964g.get(2).size() != 1 || this.f34960c == null) {
            MethodCollector.m26664o(765);
        }
        int i = 3;
        do {
            try {
                this.f34960c.write(1);
                MethodCollector.m26664o(765);
                return;
            } catch (IOException unused) {
                i--;
                if (i <= 0) {
                }
            }
        } while (i <= 0);
        MethodCollector.m26664o(765);
    }

    /* renamed from: a */
    private boolean m26407a(MigrationItem migrationItem, boolean z, boolean z2) {
        MigrationItem migrationItem2;
        MethodCollector.m26663i(818);
        synchronized (this.f34962e) {
            if (z2) {
                try {
                    migrationItem2 = m26402a(migrationItem, this.f34963f, z, false);
                } catch (Throwable th) {
                    MethodCollector.m26664o(818);
                    throw th;
                }
            } else {
                migrationItem2 = m26401a(migrationItem, this.f34963f, z);
            }
            if (migrationItem2 == null) {
                MethodCollector.m26664o(818);
                return false;
            }
            if (z) {
                migrationItem2.mo23308a(true);
                C14468a.m26438a("MMS", "isWaitingRegister pop %s because of %s", migrationItem2, migrationItem);
            }
            MethodCollector.m26664o(818);
            return true;
        }
    }

    /* renamed from: a */
    static void m26404a(MigrationItem migrationItem, int i) {
        switch (i) {
            case 0:
                migrationItem.mo23308a(false);
                migrationItem.f35015f = 0;
                return;
            case 1:
                migrationItem.f35012c.f35025g = C14473c.m26447b(migrationItem.f35012c.f35021c);
                migrationItem.f35015f = 1;
                migrationItem.f35013d = System.currentTimeMillis();
                return;
            case 2:
                migrationItem.f35015f = 2;
                return;
            case 3:
                migrationItem.f35015f = 3;
                migrationItem.f35014e = System.currentTimeMillis() - migrationItem.f35013d;
                return;
            case 4:
                migrationItem.f35015f = 4;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                migrationItem.f35015f = 5;
                migrationItem.f35014e = System.currentTimeMillis() - migrationItem.f35013d;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                migrationItem.f35015f = 6;
                migrationItem.f35014e = System.currentTimeMillis() - migrationItem.f35013d;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m26405a(MigrationItem migrationItem, IOException iOException) {
        boolean z;
        MethodCollector.m26663i(903);
        synchronized (this.f34962e) {
            try {
                Map<String, MigrationItem> map = this.f34965h.get(migrationItem.f35012c.f35024f);
                if (map == null) {
                    z = false;
                } else if (map.remove(migrationItem.f35012c.f35021c) != null) {
                    z = true;
                    m26404a(migrationItem, 6);
                    Map<String, MigrationItem> map2 = this.f34968k.get(migrationItem.f35012c.f35024f);
                    if (map2 != null) {
                        map2.put(migrationItem.f35012c.f35021c, migrationItem);
                    }
                    C14468a.m26437a("MMS", "migrationFailed %s!", iOException, migrationItem);
                    mo23289g(migrationItem);
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(903);
                throw th;
            }
        }
        if (z) {
            m26416f(migrationItem);
            MethodCollector.m26664o(903);
            return;
        }
        C14468a.m26437a("MMS", "migrationFailed %s", null, migrationItem.f35012c.f35021c);
        MethodCollector.m26664o(903);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23284a(MigrationItem migrationItem, boolean z, String str) {
        boolean z2;
        MethodCollector.m26663i(935);
        synchronized (this.f34962e) {
            try {
                m26404a(migrationItem, 4);
                if (m26401a(migrationItem, this.f34966i, false) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                    MigrationItem a = m26401a(migrationItem, this.f34965h, true);
                    if (a != null) {
                        this.f34966i.get(a.f35012c.f35024f).put(a.f35012c.f35021c, a);
                        z2 = true;
                    } else {
                        MigrationItem a2 = m26401a(migrationItem, this.f34963f, true);
                        if (a2 != null) {
                            this.f34966i.get(a2.f35012c.f35024f).put(a2.f35012c.f35021c, a2);
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    if (z) {
                        MigrationItem a3 = MigrationItem.m26472a(migrationItem, false);
                        a3.f35012c.f35020b = str;
                        C14468a.m26438a("MMS", "migrationSuspend %s", a3);
                        mo23289g(a3);
                    } else {
                        C14468a.m26438a("MMS", "migrationSuspend %s", migrationItem);
                        mo23289g(migrationItem);
                    }
                } else if (migrationItem.f35011b != -1) {
                    C14468a.m26437a("MMS", "migrationSuspend get type->%s failed %s", null, MigrationOpt.m26485a(migrationItem.f35012c.f35024f), migrationItem);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(935);
                throw th;
            }
        }
        if (migrationItem.f35011b == -1) {
            m26411d(migrationItem);
            MethodCollector.m26664o(935);
            return;
        }
        m26416f(migrationItem);
        MethodCollector.m26664o(935);
    }

    /* renamed from: c */
    public final MigrationItem mo23287c() {
        MethodCollector.m26663i(1186);
        synchronized (this.f34969l) {
            try {
                if (this.f34969l.size() == 0) {
                    return null;
                }
                MigrationItem remove = this.f34969l.remove(0);
                MethodCollector.m26664o(1186);
                return remove;
            } finally {
                MethodCollector.m26664o(1186);
            }
        }
    }

    /* renamed from: b */
    public final MigrationItem mo23285b() {
        MigrationItem d;
        Map<String, MigrationItem> map;
        MethodCollector.m26663i(1161);
        synchronized (this.f34962e) {
            try {
                d = m26412d();
                if (!(d == null || d.f35012c == null || (map = this.f34965h.get(d.f35012c.f35024f)) == null)) {
                    map.put(d.f35012c.f35021c, d);
                }
            } finally {
                MethodCollector.m26664o(1161);
            }
        }
        if (d == null && this.f34959b != null) {
            int i = 3;
            do {
                try {
                    this.f34959b.read();
                    break;
                } catch (IOException unused) {
                    i--;
                    if (i <= 0) {
                    }
                }
            } while (i <= 0);
        }
        return d;
    }

    /* renamed from: d */
    private MigrationItem m26412d() {
        MethodCollector.m26663i(1151);
        synchronized (this.f34962e) {
            try {
                Map<String, MigrationItem> map = this.f34964g.get(2);
                Map<String, MigrationItem> map2 = this.f34964g.get(1);
                Map<String, MigrationItem> map3 = this.f34964g.get(0);
                if (map.size() + map2.size() + map3.size() <= 0) {
                    return null;
                }
                System.currentTimeMillis();
                if (map.size() > 0) {
                    ArrayList arrayList = new ArrayList(map.entrySet());
                    Collections.sort(arrayList, new Comparator<Map.Entry<String, MigrationItem>>() {
                        /* class com.bytedance.disk.p965g.BinderC14455a.C1445710 */

                        static {
                            Covode.recordClassIndex(16536);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Map.Entry<String, MigrationItem> entry, Map.Entry<String, MigrationItem> entry2) {
                            return Long.valueOf(entry.getValue().f35013d).compareTo(Long.valueOf(entry2.getValue().f35013d));
                        }
                    });
                    MigrationItem migrationItem = (MigrationItem) ((Map.Entry) arrayList.get(0)).getValue();
                    map.remove(migrationItem.f35012c.f35021c);
                    MethodCollector.m26664o(1151);
                    return migrationItem;
                } else if (map2.size() > 0) {
                    ArrayList arrayList2 = new ArrayList(map2.entrySet());
                    Collections.sort(arrayList2, new Comparator<Map.Entry<String, MigrationItem>>() {
                        /* class com.bytedance.disk.p965g.BinderC14455a.C1445811 */

                        static {
                            Covode.recordClassIndex(16537);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Map.Entry<String, MigrationItem> entry, Map.Entry<String, MigrationItem> entry2) {
                            return entry.getValue().compareTo(entry2.getValue());
                        }
                    });
                    MigrationItem migrationItem2 = (MigrationItem) ((Map.Entry) arrayList2.get(0)).getValue();
                    map2.remove(migrationItem2.f35012c.f35021c);
                    MethodCollector.m26664o(1151);
                    return migrationItem2;
                } else if (map3.size() > 0) {
                    MigrationItem migrationItem3 = (MigrationItem) ((Map.Entry) new ArrayList(map3.entrySet()).get(0)).getValue();
                    map3.remove(migrationItem3.f35012c.f35021c);
                    MethodCollector.m26664o(1151);
                    return migrationItem3;
                } else {
                    MethodCollector.m26664o(1151);
                    return null;
                }
            } finally {
                MethodCollector.m26664o(1151);
            }
        }
    }

    /* renamed from: e */
    static void m26414e(MigrationItem migrationItem) {
        System.currentTimeMillis();
        C14440b.m26365a(C14450a.C14451a.f34951a, "_id=?", new String[]{String.valueOf(migrationItem.f35011b)});
    }

    @Override // com.bytedance.disk.p956a.AbstractC14423a
    /* renamed from: a */
    public final void mo23243a(long j) {
        if (j <= 0) {
            this.f34970m.block();
        } else {
            this.f34970m.block(j);
        }
    }

    /* renamed from: a */
    static Cursor m26399a(int i) {
        if (!C14442a.m26375b(i)) {
            return null;
        }
        System.currentTimeMillis();
        String[] strArr = C14450a.AbstractC14452b.f34952a;
        return C14440b.m26366a(C14450a.C14451a.f34951a, strArr, "mig_event=? AND (mig_opt_dir ISNULL OR mig_opt_dir=mig_opt_from)", new String[]{String.valueOf(i)}, "mig_opt_file_len ASC");
    }

    /* renamed from: f */
    public static void m26416f(MigrationItem migrationItem) {
        System.currentTimeMillis();
        Uri withAppendedId = ContentUris.withAppendedId(C14450a.C14451a.f34951a, migrationItem.f35011b);
        ContentValues contentValues = new ContentValues();
        if (migrationItem.f35012c.f35024f == 0) {
            migrationItem.mo23306a();
            contentValues.put("mig_opt_type", Integer.valueOf(migrationItem.f35012c.f35024f));
        } else if (migrationItem.f35012c != null && migrationItem.f35012c.f35025g <= 0) {
            migrationItem.f35012c.f35025g = C14473c.m26447b(migrationItem.f35012c.f35021c);
        }
        contentValues.put("mig_opt_file_len", Long.valueOf(migrationItem.f35012c.f35025g));
        contentValues.put("mig_event", Integer.valueOf(migrationItem.f35015f));
        contentValues.put("mig_event_time", Long.valueOf(migrationItem.f35013d));
        contentValues.put("mig_event_elapsed", Long.valueOf(migrationItem.f35014e));
        contentValues.put("mig_deleted", Boolean.valueOf(migrationItem.f35016g));
        C14440b.m26364a(withAppendedId, contentValues);
    }

    /* renamed from: j */
    private void m26419j(MigrationItem migrationItem) {
        boolean z;
        MethodCollector.m26663i(917);
        synchronized (this.f34962e) {
            try {
                if (m26401a(migrationItem, this.f34965h, true) == null && m26401a(migrationItem, this.f34966i, true) == null) {
                    z = false;
                } else {
                    z = true;
                    m26404a(migrationItem, 5);
                    Map<String, MigrationItem> map = this.f34967j.get(migrationItem.f35012c.f35024f);
                    if (map != null) {
                        map.put(migrationItem.f35012c.f35021c, migrationItem);
                        migrationItem.f35017h.close();
                    }
                    C14468a.m26438a("MMS", "migrationSuccess %s", migrationItem);
                    mo23289g(migrationItem);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(917);
                throw th;
            }
        }
        if (z) {
            m26416f(migrationItem);
            if (m26406a(migrationItem)) {
                migrationItem.f35016g = true;
                m26416f(migrationItem);
            }
            migrationItem.f35017h.open();
            MethodCollector.m26664o(917);
            return;
        }
        C14468a.m26437a("MMS", "migrationSuccess? but can't find key: %s", null, migrationItem.f35012c.f35021c);
        MethodCollector.m26664o(917);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo23289g(MigrationItem migrationItem) {
        MethodCollector.m26663i(1240);
        synchronized (this.f34961d) {
            try {
                int size = this.f34961d.size();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < size; i++) {
                    try {
                        this.f34961d.valueAt(i).f35009c.mo23248a(migrationItem);
                    } catch (RemoteException unused) {
                        arrayList.add(Integer.valueOf(this.f34961d.keyAt(i)));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!this.f34961d.get(intValue).f35009c.asBinder().pingBinder()) {
                        this.f34961d.remove(intValue);
                    }
                }
            } finally {
                MethodCollector.m26664o(1240);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.disk.g.a$a */
    public class HandlerC14467a extends Handler {
        static {
            Covode.recordClassIndex(16546);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
            if (r6 == false) goto L_0x00cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
            if (r4.f35011b != -1) goto L_0x00d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
            r4.f35011b = com.bytedance.disk.p965g.BinderC14455a.m26411d(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
            r4.f35017h.open();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cd, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3373);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
            com.bytedance.disk.p965g.BinderC14455a.m26416f(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r14) {
            /*
            // Method dump skipped, instructions count: 219
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.p965g.BinderC14455a.HandlerC14467a.handleMessage(android.os.Message):void");
        }

        public HandlerC14467a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: d */
    public static long m26411d(MigrationItem migrationItem) {
        Uri uri;
        AbstractC14454c a;
        System.currentTimeMillis();
        Uri uri2 = C14450a.C14451a.f34951a;
        ContentValues contentValues = new ContentValues();
        if (TextUtils.isEmpty(migrationItem.f35012c.f35020b)) {
            migrationItem.f35012c.f35020b = "INVALID";
        }
        contentValues.put("mig_opt_reason", migrationItem.f35012c.f35020b);
        contentValues.put("mig_opt_file_len", Long.valueOf(migrationItem.f35012c.f35025g));
        String str = migrationItem.f35012c.f35019a;
        String str2 = migrationItem.f35012c.f35021c;
        String str3 = migrationItem.f35012c.f35022d;
        try {
            if (!TextUtils.isEmpty(str)) {
                str = C14473c.m26443a(str, 1);
            }
            str2 = C14473c.m26443a(str2, 1);
            str3 = C14473c.m26443a(str3, 1);
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            contentValues.put("mig_opt_dir", str);
        }
        contentValues.put("mig_opt_from", str2);
        contentValues.put("mig_opt_to", str3);
        contentValues.put("mig_opt_policy", Integer.valueOf(migrationItem.f35012c.f35023e));
        contentValues.put("mig_opt_type", Integer.valueOf(migrationItem.f35012c.f35024f));
        contentValues.put("mig_event", Integer.valueOf(migrationItem.f35015f));
        contentValues.put("mig_event_time", Long.valueOf(migrationItem.f35013d));
        contentValues.put("mig_event_elapsed", Long.valueOf(migrationItem.f35014e));
        contentValues.put("mig_deleted", Boolean.valueOf(migrationItem.f35016g));
        if (C14440b.f34934a == null || (a = C14440b.f34934a.mo23270a(uri2)) == null) {
            uri = null;
        } else {
            uri = a.mo23281a(uri2, contentValues);
        }
        long parseId = ContentUris.parseId(uri);
        migrationItem.f35011b = parseId;
        return parseId;
    }

    /* renamed from: h */
    private int m26417h(MigrationItem migrationItem) {
        MethodCollector.m26663i(725);
        synchronized (this.f34962e) {
            try {
                if (m26401a(migrationItem, this.f34966i, false) != null) {
                    return 98;
                }
                MigrationItem a = m26401a(migrationItem, this.f34963f, true);
                if (a != null) {
                    a.mo23310b(true);
                    this.f34966i.get(a.f35012c.f35024f).put(a.f35012c.f35021c, a);
                    MethodCollector.m26664o(725);
                    return 0;
                }
                MigrationItem a2 = m26401a(migrationItem, this.f34964g, true);
                if (a2 != null) {
                    a2.mo23310b(true);
                    this.f34966i.get(a2.f35012c.f35024f).put(a2.f35012c.f35021c, a2);
                    MethodCollector.m26664o(725);
                    return 0;
                }
                MigrationItem a3 = m26401a(migrationItem, this.f34965h, true);
                if (a3 != null) {
                    a3.mo23310b(true);
                    this.f34966i.get(a3.f35012c.f35024f).put(a3.f35012c.f35021c, a3);
                    MethodCollector.m26664o(725);
                    return 0;
                }
                MigrationItem a4 = m26401a(migrationItem, this.f34968k, false);
                if (a4 != null) {
                    a4.mo23310b(true);
                    MethodCollector.m26664o(725);
                    return 98;
                } else if (m26401a(migrationItem, this.f34967j, false) != null) {
                    MethodCollector.m26664o(725);
                    return 97;
                } else {
                    MethodCollector.m26664o(725);
                    return -1;
                }
            } finally {
                MethodCollector.m26664o(725);
            }
        }
    }

    /* renamed from: i */
    private int m26418i(MigrationItem migrationItem) {
        MethodCollector.m26663i(787);
        synchronized (this.f34962e) {
            try {
                MigrationItem a = m26401a(migrationItem, this.f34966i, true);
                if (a != null) {
                    if (a.f35015f == 0) {
                        a.mo23310b(false);
                        this.f34963f.get(a.f35012c.f35024f).put(a.f35012c.f35021c, a);
                        return 0;
                    } else if (a.f35015f == 1) {
                        a.mo23310b(false);
                        this.f34964g.get(a.f35012c.f35024f).put(a.f35012c.f35021c, a);
                        mo23283a();
                        MethodCollector.m26664o(787);
                        return 0;
                    } else if (a.f35015f == 4) {
                        a.mo23310b(false);
                        this.f34964g.get(a.f35012c.f35024f).put(a.f35012c.f35021c, a);
                        mo23283a();
                        MethodCollector.m26664o(787);
                        return 0;
                    } else if (a.f35015f == 2) {
                        a.mo23310b(false);
                        this.f34965h.get(a.f35012c.f35024f).put(a.f35012c.f35021c, a);
                        MethodCollector.m26664o(787);
                        return 0;
                    }
                }
                MigrationItem a2 = m26401a(migrationItem, this.f34968k, true);
                if (a2 != null) {
                    a2.mo23310b(false);
                    this.f34964g.get(a2.f35012c.f35024f).put(a2.f35012c.f35021c, a2);
                    mo23283a();
                    MethodCollector.m26664o(787);
                    return 0;
                } else if (m26401a(migrationItem, this.f34967j, false) != null) {
                    MethodCollector.m26664o(787);
                    return 97;
                } else {
                    MethodCollector.m26664o(787);
                    return -1;
                }
            } finally {
                MethodCollector.m26664o(787);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r2 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        m26414e(r2);
        com.bytedance.disk.parcel.MigrationItem.C14482a.m26483a(r2);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(571);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(571);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        return -1;
     */
    @Override // com.bytedance.disk.p956a.AbstractC14423a
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo23245c(com.bytedance.disk.parcel.MigrationOpt r9) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.p965g.BinderC14455a.mo23245c(com.bytedance.disk.parcel.MigrationOpt):int");
    }

    @Override // com.bytedance.disk.p956a.AbstractC14423a
    /* renamed from: b */
    public final int mo23244b(MigrationOpt migrationOpt) {
        MethodCollector.m26663i(505);
        if (!this.f34972o) {
            MethodCollector.m26664o(505);
            return -1;
        }
        MigrationOpt a = MigrationOpt.m26484a(migrationOpt);
        if (!MigrationOpt.m26486a(a, false)) {
            MigrationOpt.C14484a.m26489a(a);
            MethodCollector.m26664o(505);
            return 99;
        }
        MigrationItem a2 = MigrationItem.C14482a.m26482a();
        a2.f35012c = a;
        synchronized (this.f34962e) {
            try {
                if (m26407a(a2, true, false)) {
                    MigrationItem.C14482a.m26483a(a2);
                    C14479f.m26470a(this.f34974q, 6, a2, null);
                    return 0;
                } else if (m26408b(a2, false)) {
                    MigrationItem.C14482a.m26483a(a2);
                    MethodCollector.m26664o(505);
                    return 97;
                } else if (m26410c(a2, true, false)) {
                    MigrationItem.C14482a.m26483a(a2);
                    C14479f.m26470a(this.f34974q, 6, a2, null);
                    MethodCollector.m26664o(505);
                    return 0;
                } else if (m26413d(a2, true, false) || m26409b(a2, true, false) || m26415e(a2, true, false)) {
                    MigrationItem.C14482a.m26483a(a2);
                    C14479f.m26470a(this.f34974q, 6, a2, null);
                    MethodCollector.m26664o(505);
                    return 0;
                } else {
                    MethodCollector.m26664o(505);
                    return -1;
                }
            } finally {
                MethodCollector.m26664o(505);
            }
        }
    }

    /* renamed from: c */
    public final void mo23288c(MigrationItem migrationItem) {
        int i;
        String a;
        if (migrationItem.f35012c != null) {
            m26404a(migrationItem, 2);
            mo23289g(migrationItem);
            C14468a.m26438a("MMS", "migrationStart %s", migrationItem);
            migrationItem.mo23307a(0);
            m26416f(migrationItem);
            C14479f.m26470a(this.f34974q, 2, migrationItem, null);
            HashMap hashMap = new HashMap();
            try {
                if (!C14473c.m26446a(migrationItem.f35012c.f35021c, true) && C14473c.m26446a(migrationItem.f35012c.f35022d, true)) {
                    m26419j(migrationItem);
                    hashMap.put("status", "5");
                    C14479f.m26470a(this.f34974q, 5, migrationItem, hashMap);
                } else if (migrationItem.f35012c.f35024f == 0) {
                    m26405a(migrationItem, new IOException("unknow file type"));
                    hashMap.put("status", "4");
                    C14479f.m26470a(this.f34974q, 5, migrationItem, hashMap);
                } else {
                    if (migrationItem.f35012c.f35024f == 1) {
                        String str = migrationItem.f35012c.f35021c;
                        String str2 = migrationItem.f35012c.f35022d;
                        C14476e.m26458a(str);
                        i = C14476e.m26454a(migrationItem, new File(str), new File(str2), null);
                    } else if (migrationItem.f35012c.f35024f == 2) {
                        ArrayList arrayList = new ArrayList();
                        Cursor a2 = m26400a(migrationItem.f35012c.f35021c, new String[]{"mig_opt_from"});
                        if (a2 != null) {
                            while (a2.moveToNext()) {
                                try {
                                    a = C14473c.m26443a(a2.getString(0), 0);
                                } catch (Exception unused) {
                                }
                                arrayList.add(a);
                            }
                            a2.close();
                        }
                        String str3 = migrationItem.f35012c.f35021c;
                        String str4 = migrationItem.f35012c.f35022d;
                        FileFilter fileFilter = this.f34980w;
                        C14476e.AbstractC14478b bVar = this.f34979v;
                        C14476e.m26458a(str3);
                        i = C14476e.m26455a(migrationItem, new File(str3), new File(str4), fileFilter, arrayList, bVar);
                    } else {
                        return;
                    }
                    if (i == 3) {
                        mo23286b(migrationItem);
                        hashMap.put("status", "2");
                        C14479f.m26470a(this.f34974q, 5, migrationItem, hashMap);
                    } else if (i == 4) {
                        mo23284a(migrationItem, false, (String) null);
                        hashMap.put("status", "3");
                        C14479f.m26470a(this.f34974q, 5, migrationItem, hashMap);
                    } else if (i == 5) {
                        m26419j(migrationItem);
                        hashMap.put("status", "0");
                        C14479f.m26470a(this.f34974q, 5, migrationItem, hashMap);
                    } else if (i == 6) {
                        m26405a(migrationItem, new IOException("smaller disk space"));
                        String b = C23535b.m44235b();
                        hashMap.put("status", "1");
                        hashMap.put("ava_size", new StringBuilder().append(C14473c.m26449d(b)).toString());
                        C14479f.m26470a(this.f34974q, 5, migrationItem, hashMap);
                    }
                }
            } catch (Exception e) {
                if (e instanceof IOException) {
                    m26405a(migrationItem, (IOException) e);
                } else {
                    m26405a(migrationItem, new IOException(e));
                }
                String b2 = C23535b.m44235b();
                hashMap.put("status", "1");
                hashMap.put("ava_size", new StringBuilder().append(C14473c.m26449d(b2)).toString());
                if (e instanceof C14476e.C14477a) {
                    hashMap.put("reason", "104");
                } else {
                    hashMap.put("detail-reason", Log.getStackTraceString(e));
                }
                C14479f.m26470a(this.f34974q, 5, migrationItem, hashMap);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo23286b(MigrationItem migrationItem) {
        MethodCollector.m26663i(971);
        synchronized (this.f34962e) {
            try {
                m26404a(migrationItem, 3);
                if (migrationItem.f35011b != -1) {
                    Map<String, MigrationItem> map = this.f34965h.get(migrationItem.f35012c.f35024f);
                    if (map == null || !map.containsKey(migrationItem.f35012c.f35021c)) {
                        mo23289g(migrationItem);
                    }
                } else {
                    Map<String, MigrationItem> map2 = this.f34963f.get(migrationItem.f35012c.f35024f);
                    if (map2 != null && map2.get(migrationItem.f35012c.f35021c) == migrationItem) {
                        map2.remove(migrationItem.f35012c.f35021c);
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(971);
                throw th;
            }
        }
        if (migrationItem.f35011b != -1) {
            m26414e(migrationItem);
            C14468a.m26438a("MMS", "migrationCanceled %s", migrationItem);
        }
        MigrationItem.C14482a.m26483a(migrationItem);
        MethodCollector.m26664o(971);
    }

    /* renamed from: a */
    private int m26398a(MigrationItem migrationItem, boolean z) {
        MethodCollector.m26663i(809);
        synchronized (this.f34962e) {
            try {
                MigrationItem a = m26401a(migrationItem, this.f34966i, false);
                if (a != null) {
                    a.mo23311c(z);
                    return 0;
                }
                MigrationItem a2 = m26401a(migrationItem, this.f34963f, false);
                if (a2 != null) {
                    a2.mo23311c(z);
                    MethodCollector.m26664o(809);
                    return 0;
                }
                MigrationItem a3 = m26401a(migrationItem, this.f34964g, true);
                if (a3 != null) {
                    a3.mo23311c(z);
                    MethodCollector.m26664o(809);
                    return 0;
                }
                MigrationItem a4 = m26401a(migrationItem, this.f34965h, true);
                if (a4 != null) {
                    a4.mo23311c(z);
                    MethodCollector.m26664o(809);
                    return 0;
                }
                MigrationItem a5 = m26401a(migrationItem, this.f34968k, false);
                if (a5 != null) {
                    a5.mo23311c(z);
                    MethodCollector.m26664o(809);
                    return 0;
                } else if (m26401a(migrationItem, this.f34967j, false) != null) {
                    MethodCollector.m26664o(809);
                    return 97;
                } else {
                    MethodCollector.m26664o(809);
                    return -1;
                }
            } finally {
                MethodCollector.m26664o(809);
            }
        }
    }

    /* renamed from: a */
    private static Cursor m26400a(String str, String[] strArr) {
        if (!C14442a.m26375b(5)) {
            return null;
        }
        System.currentTimeMillis();
        Uri uri = C14450a.C14451a.f34951a;
        try {
            str = C14473c.m26443a(str, 1);
        } catch (Exception unused) {
        }
        return C14440b.m26366a(uri, strArr, "mig_opt_dir=? AND mig_event=?", new String[]{str, "5"}, "mig_opt_file_len ASC");
    }

    /* renamed from: b */
    private boolean m26408b(MigrationItem migrationItem, boolean z) {
        MethodCollector.m26663i(852);
        synchronized (this.f34962e) {
            try {
                SparseArray<Map<String, MigrationItem>> sparseArray = this.f34967j;
                if (sparseArray != null) {
                    if (m26401a(migrationItem, sparseArray, false) == null) {
                        if (z) {
                            Iterator<Map.Entry<String, MigrationItem>> it = sparseArray.get(2).entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    MigrationItem value = it.next().getValue();
                                    if (!(value == null || value.f35012c == null || !TextUtils.equals(value.f35012c.f35022d, migrationItem.f35012c.f35022d))) {
                                        break;
                                    }
                                } else {
                                    Iterator<Map.Entry<String, MigrationItem>> it2 = sparseArray.get(0).entrySet().iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            MigrationItem value2 = it2.next().getValue();
                                            if (!(value2 == null || value2.f35012c == null || !TextUtils.equals(value2.f35012c.f35022d, migrationItem.f35012c.f35022d))) {
                                                break;
                                            }
                                        } else {
                                            for (Map.Entry<String, MigrationItem> entry : sparseArray.get(1).entrySet()) {
                                                MigrationItem value3 = entry.getValue();
                                                if (value3 == null || value3.f35012c == null || !TextUtils.equals(value3.f35012c.f35022d, migrationItem.f35012c.f35022d)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
                MethodCollector.m26664o(852);
                return false;
            } finally {
                MethodCollector.m26664o(852);
            }
        }
    }

    /* renamed from: b */
    private boolean m26409b(MigrationItem migrationItem, boolean z, boolean z2) {
        MigrationItem migrationItem2;
        MethodCollector.m26663i(824);
        synchronized (this.f34962e) {
            if (z2) {
                try {
                    migrationItem2 = m26402a(migrationItem, this.f34964g, z, false);
                } catch (Throwable th) {
                    MethodCollector.m26664o(824);
                    throw th;
                }
            } else {
                migrationItem2 = m26401a(migrationItem, this.f34964g, z);
            }
            if (migrationItem2 == null) {
                MethodCollector.m26664o(824);
                return false;
            }
            if (z) {
                migrationItem2.mo23308a(true);
                this.f34977t.sendMessage(this.f34977t.obtainMessage(2, migrationItem2));
            }
            MethodCollector.m26664o(824);
            return true;
        }
    }

    /* renamed from: d */
    private boolean m26413d(MigrationItem migrationItem, boolean z, boolean z2) {
        MigrationItem migrationItem2;
        MethodCollector.m26663i(832);
        synchronized (this.f34962e) {
            if (z2) {
                try {
                    migrationItem2 = m26402a(migrationItem, this.f34965h, z, false);
                } catch (Throwable th) {
                    MethodCollector.m26664o(832);
                    throw th;
                }
            } else {
                migrationItem2 = m26401a(migrationItem, this.f34965h, z);
            }
            if (migrationItem2 == null) {
                MethodCollector.m26664o(832);
                return false;
            }
            if (z) {
                migrationItem2.mo23308a(true);
                C14468a.m26438a("MMS", "isMigrating pop %s because of %s", migrationItem2, migrationItem);
            }
            MethodCollector.m26664o(832);
            return true;
        }
    }

    /* renamed from: e */
    private boolean m26415e(MigrationItem migrationItem, boolean z, boolean z2) {
        MigrationItem migrationItem2;
        MethodCollector.m26663i(858);
        synchronized (this.f34962e) {
            if (z2) {
                try {
                    migrationItem2 = m26402a(migrationItem, this.f34968k, z, false);
                } catch (Throwable th) {
                    MethodCollector.m26664o(858);
                    throw th;
                }
            } else {
                migrationItem2 = m26401a(migrationItem, this.f34968k, z);
            }
            if (migrationItem2 == null) {
                MethodCollector.m26664o(858);
                return false;
            }
            MethodCollector.m26664o(858);
            return true;
        }
    }

    /* renamed from: c */
    private boolean m26410c(MigrationItem migrationItem, boolean z, boolean z2) {
        MigrationItem migrationItem2;
        MethodCollector.m26663i(829);
        synchronized (this.f34962e) {
            if (z2) {
                try {
                    migrationItem2 = m26402a(migrationItem, this.f34966i, false, false);
                } catch (Throwable th) {
                    MethodCollector.m26664o(829);
                    throw th;
                }
            } else {
                migrationItem2 = m26401a(migrationItem, this.f34966i, false);
            }
            if (migrationItem2 == null) {
                MethodCollector.m26664o(829);
                return false;
            }
            if (z) {
                migrationItem2.mo23308a(true);
                this.f34977t.sendMessage(this.f34977t.obtainMessage(2, migrationItem2));
                C14468a.m26438a("MMS", "isSuspend pop %s because of %s", migrationItem2, migrationItem);
            }
            MethodCollector.m26664o(829);
            return true;
        }
    }

    /* renamed from: a */
    private MigrationItem m26401a(MigrationItem migrationItem, SparseArray<Map<String, MigrationItem>> sparseArray, boolean z) {
        if (sparseArray == null) {
            return null;
        }
        C144669 r2 = new C14474d.AbstractC14475a<String, MigrationItem>() {
            /* class com.bytedance.disk.p965g.BinderC14455a.C144669 */

            static {
                Covode.recordClassIndex(16545);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object, boolean] */
            @Override // com.bytedance.disk.p966h.C14474d.AbstractC14475a
            /* renamed from: a */
            public final /* synthetic */ MigrationItem mo23298a(Map<String, MigrationItem> map, String str, boolean z) {
                if (z) {
                    return map.remove(str);
                }
                return map.get(str);
            }
        };
        Map<String, MigrationItem> map = sparseArray.get(2);
        if (!TextUtils.isEmpty(migrationItem.f35012c.f35019a)) {
            return (MigrationItem) r2.mo23298a(map, migrationItem.f35012c.f35019a, z);
        }
        MigrationItem migrationItem2 = (MigrationItem) r2.mo23298a(map, migrationItem.f35012c.f35021c, z);
        if (migrationItem2 != null) {
            return migrationItem2;
        }
        MigrationItem migrationItem3 = (MigrationItem) r2.mo23298a(sparseArray.get(0), migrationItem.f35012c.f35021c, z);
        if (migrationItem3 != null) {
            return migrationItem3;
        }
        return (MigrationItem) r2.mo23298a(sparseArray.get(1), migrationItem.f35012c.f35021c, z);
    }

    public BinderC14455a(Context context, int i, int i2, AbstractC14448c cVar) {
        MethodCollector.m26663i(416);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        this.f34978u = C40780g.m82242a(a.mo70028a());
        this.f34981x = -1;
        this.f34982y = -1;
        this.f34974q = null;
        this.f34975r = context;
        this.f34981x = i;
        this.f34982y = i2;
        this.f34974q = cVar;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            this.f34959b = new ParcelFileDescriptor.AutoCloseInputStream(createPipe[0]);
            this.f34960c = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
        } catch (IOException e) {
            C14468a.m26437a("MMS", "initPipe failed!", e, new Object[0]);
            this.f34959b = null;
            this.f34960c = null;
        }
        this.f34963f.put(0, new ConcurrentHashMap());
        this.f34963f.put(1, new ConcurrentHashMap());
        this.f34963f.put(2, new ConcurrentHashMap());
        this.f34964g.put(0, new ConcurrentHashMap());
        this.f34964g.put(1, new ConcurrentHashMap());
        this.f34964g.put(2, new ConcurrentHashMap());
        this.f34965h.put(0, new ConcurrentHashMap());
        this.f34965h.put(1, new ConcurrentHashMap());
        this.f34965h.put(2, new ConcurrentHashMap());
        this.f34966i.put(0, new ConcurrentHashMap());
        this.f34966i.put(1, new ConcurrentHashMap());
        this.f34966i.put(2, new ConcurrentHashMap());
        this.f34967j.put(0, new ConcurrentHashMap());
        this.f34967j.put(1, new ConcurrentHashMap());
        this.f34967j.put(2, new ConcurrentHashMap());
        this.f34968k.put(0, new ConcurrentHashMap());
        this.f34968k.put(1, new ConcurrentHashMap());
        this.f34968k.put(2, new ConcurrentHashMap());
        C14440b.m26367a(context).mo23271a();
        this.f34979v = new C14476e.AbstractC14478b() {
            /* class com.bytedance.disk.p965g.BinderC14455a.C144561 */

            static {
                Covode.recordClassIndex(16535);
            }

            @Override // com.bytedance.disk.p966h.C14476e.AbstractC14478b
            /* renamed from: a */
            public final void mo23290a(MigrationItem migrationItem) {
                if (migrationItem.f35011b != -1) {
                    BinderC14455a.m26416f(migrationItem);
                } else {
                    BinderC14455a.m26411d(migrationItem);
                }
                if (BinderC14455a.m26406a(migrationItem)) {
                    migrationItem.f35016g = true;
                    BinderC14455a.m26416f(migrationItem);
                }
            }
        };
        this.f34980w = new FileFilter() {
            /* class com.bytedance.disk.p965g.BinderC14455a.C144614 */

            static {
                Covode.recordClassIndex(16540);
            }

            public final boolean accept(File file) {
                String name = file.getName();
                if (TextUtils.isEmpty(name) || !name.toLowerCase().startsWith(".trashed-")) {
                    return true;
                }
                return false;
            }
        };
        this.f34973p = new AbstractC14445b() {
            /* class com.bytedance.disk.p965g.BinderC14455a.C144625 */

            static {
                Covode.recordClassIndex(16541);
            }

            @Override // com.bytedance.disk.p961e.p963b.AbstractC14445b
            /* renamed from: a */
            public final void mo23273a(Object obj) {
                if (obj != null && (obj instanceof MigrationItem)) {
                    BinderC14455a.this.mo23288c((MigrationItem) obj);
                }
            }
        };
        this.f34976s.start();
        this.f34977t = new HandlerC14467a(this.f34976s.getLooper());
        C14444a.m26379a(context);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f34977t.post(new Runnable() {
            /* class com.bytedance.disk.p965g.BinderC14455a.RunnableC144636 */

            static {
                Covode.recordClassIndex(16542);
            }

            public final void run() {
                Map<String, MigrationItem> map;
                BinderC14455a aVar = BinderC14455a.this;
                CountDownLatch countDownLatch = countDownLatch;
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                Cursor a = BinderC14455a.m26399a(5);
                if (a != null) {
                    while (a.moveToNext()) {
                        MigrationItem a2 = MigrationItem.m26471a(a);
                        if (MigrationOpt.m26486a(a2.f35012c, false) && (map = aVar.f34967j.get(a2.f35012c.f35024f)) != null && !map.containsKey(a2.f35012c.f35021c)) {
                            map.put(a2.f35012c.f35021c, a2);
                        } else if (!a2.f35016g) {
                            aVar.f34969l.add(a2);
                        }
                    }
                    a.close();
                }
                Cursor a3 = BinderC14455a.m26399a(6);
                if (a3 != null) {
                    while (a3.moveToNext()) {
                        MigrationItem a4 = MigrationItem.m26471a(a3);
                        if (MigrationOpt.m26486a(a4.f35012c, false)) {
                            a4.mo23306a();
                            Map<String, MigrationItem> map2 = aVar.f34968k.get(a4.f35012c.f35024f);
                            if (map2 != null && !map2.containsKey(a4.f35012c.f35021c)) {
                                BinderC14455a.m26404a(a4, 0);
                                map2.put(a4.f35012c.f35021c, a4);
                            }
                        }
                    }
                    a3.close();
                }
                Map<String, MigrationItem> map3 = aVar.f34968k.get(2);
                if (map3 != null) {
                    aVar.f34964g.get(2).putAll(map3);
                    map3.clear();
                }
                Map<String, MigrationItem> map4 = aVar.f34968k.get(1);
                if (map4 != null) {
                    aVar.f34964g.get(1).putAll(map4);
                    map4.clear();
                }
                Cursor a5 = BinderC14455a.m26399a(2);
                if (a5 != null) {
                    while (a5.moveToNext()) {
                        MigrationItem a6 = MigrationItem.m26471a(a5);
                        if (MigrationOpt.m26486a(a6.f35012c, false)) {
                            a6.mo23306a();
                            Map<String, MigrationItem> map5 = aVar.f34965h.get(a6.f35012c.f35024f);
                            if (map5 != null && !map5.containsKey(a6.f35012c.f35021c)) {
                                BinderC14455a.m26404a(a6, 0);
                                map5.put(a6.f35012c.f35021c, a6);
                            }
                        }
                    }
                    a5.close();
                }
                Map<String, MigrationItem> map6 = aVar.f34965h.get(2);
                if (map6 != null) {
                    aVar.f34964g.get(2).putAll(map6);
                    map6.clear();
                }
                Map<String, MigrationItem> map7 = aVar.f34965h.get(1);
                if (map7 != null) {
                    aVar.f34964g.get(1).putAll(map7);
                    map7.clear();
                }
                Cursor a7 = BinderC14455a.m26399a(4);
                if (a7 != null) {
                    while (a7.moveToNext()) {
                        MigrationItem a8 = MigrationItem.m26471a(a7);
                        if (MigrationOpt.m26486a(a8.f35012c, false)) {
                            a8.mo23306a();
                            Map<String, MigrationItem> map8 = aVar.f34966i.get(a8.f35012c.f35024f);
                            if (map8 != null && !map8.containsKey(a8.f35012c.f35021c)) {
                                BinderC14455a.m26404a(a8, 0);
                                map8.put(a8.f35012c.f35021c, a8);
                            }
                        }
                    }
                    a7.close();
                }
                Map<String, MigrationItem> map9 = aVar.f34966i.get(2);
                if (map9 != null) {
                    aVar.f34964g.get(2).putAll(map9);
                    map9.clear();
                }
                Map<String, MigrationItem> map10 = aVar.f34966i.get(1);
                if (map10 != null) {
                    aVar.f34964g.get(1).putAll(map10);
                    map10.clear();
                }
                Cursor a9 = BinderC14455a.m26399a(1);
                if (a9 != null) {
                    while (a9.moveToNext()) {
                        MigrationItem a10 = MigrationItem.m26471a(a9);
                        if (MigrationOpt.m26486a(a10.f35012c, false)) {
                            a10.mo23306a();
                            Map<String, MigrationItem> map11 = aVar.f34964g.get(a10.f35012c.f35024f);
                            if (map11 != null && !map11.containsKey(a10.f35012c.f35021c)) {
                                BinderC14455a.m26404a(a10, 1);
                                map11.put(a10.f35012c.f35021c, a10);
                            }
                        }
                    }
                    a9.close();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MigrationItem migrationItem = (MigrationItem) it.next();
                    BinderC14455a.m26414e(migrationItem);
                    MigrationItem.C14482a.m26483a(migrationItem);
                }
                arrayList.clear();
                if (!aVar.f34971n.get()) {
                    new Thread(new Runnable() {
                        /* class com.bytedance.disk.p965g.BinderC14455a.RunnableC144603 */

                        static {
                            Covode.recordClassIndex(16539);
                        }

                        public final void run() {
                            while (true) {
                                MigrationItem c = BinderC14455a.this.mo23287c();
                                if (c == null) {
                                    return;
                                }
                                if (BinderC14455a.m26406a(c)) {
                                    c.f35016g = true;
                                    BinderC14455a.m26416f(c);
                                }
                            }
                        }
                    }, "MS-DEL").start();
                    new Thread(new Runnable() {
                        /* class com.bytedance.disk.p965g.BinderC14455a.RunnableC144592 */

                        static {
                            Covode.recordClassIndex(16538);
                        }

                        public final void run() {
                            while (true) {
                                MigrationItem b = BinderC14455a.this.mo23285b();
                                if (!(b == null || BinderC14455a.this.f34974q == null)) {
                                    if (b.f35012c.f35024f == 0) {
                                        BinderC14455a.this.mo23288c(b);
                                    } else {
                                        BinderC14455a.this.f34974q.mo23276a(b, BinderC14455a.this.f34973p, b.f35012c.f35023e);
                                    }
                                }
                            }
                        }
                    }, "MS-CONS").start();
                    aVar.f34970m.open();
                    aVar.f34972o = true;
                    countDownLatch.countDown();
                }
            }
        });
        new Thread(new Runnable() {
            /* class com.bytedance.disk.p965g.BinderC14455a.RunnableC144647 */

            static {
                Covode.recordClassIndex(16543);
            }

            public final void run() {
                BinderC14455a aVar = BinderC14455a.this;
                try {
                    if (!countDownLatch.await(5, TimeUnit.SECONDS)) {
                        C14468a.m26437a("MMS", "Latch wait for " + "waitLateInit" + " elapsed", null, new Object[0]);
                        aVar.f34972o = false;
                        aVar.f34971n.set(true);
                        aVar.f34970m.open();
                    }
                } catch (InterruptedException unused) {
                    aVar.f34972o = false;
                    aVar.f34971n.set(true);
                    aVar.f34970m.open();
                    Thread.currentThread().interrupt();
                    C14468a.m26437a("MMS", "Latch wait for " + "waitLateInit" + " interrupted", null, new Object[0]);
                }
            }
        }).start();
        MethodCollector.m26664o(416);
    }

    /* renamed from: a */
    private MigrationItem m26402a(MigrationItem migrationItem, SparseArray<Map<String, MigrationItem>> sparseArray, boolean z, boolean z2) {
        if (sparseArray == null) {
            return null;
        }
        C144658 r5 = new C14474d.AbstractC14475a<String, MigrationItem>() {
            /* class com.bytedance.disk.p965g.BinderC14455a.C144658 */

            static {
                Covode.recordClassIndex(16544);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object, boolean] */
            @Override // com.bytedance.disk.p966h.C14474d.AbstractC14475a
            /* renamed from: a */
            public final /* synthetic */ MigrationItem mo23298a(Map<String, MigrationItem> map, String str, boolean z) {
                if (z) {
                    return map.remove(str);
                }
                return map.get(str);
            }
        };
        Map<String, MigrationItem> map = sparseArray.get(1);
        MigrationItem migrationItem2 = (MigrationItem) r5.mo23298a(map, migrationItem.f35012c.f35021c, z);
        if (migrationItem2 == null) {
            migrationItem2 = (MigrationItem) r5.mo23298a(map, migrationItem.f35012c.f35022d, z);
            if (migrationItem2 == null) {
                Iterator<MigrationItem> it = map.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    migrationItem2 = it.next();
                    if (TextUtils.equals(migrationItem2.f35012c.f35022d, migrationItem.f35012c.f35021c)) {
                        C14468a.m26439b("MMS", "getItemFromSparsedMapStrictCheck filterSuccess(%s) file duplicate! (%s) vs (%s)", Boolean.valueOf(z2), migrationItem, migrationItem2);
                        break;
                    }
                }
            } else {
                C14468a.m26439b("MMS", "getItemFromSparsedMapStrictCheck filterSuccess(%s) file duplicate! (%s) vs (%s)", Boolean.valueOf(z2), migrationItem, migrationItem2);
            }
        }
        if ((!z2 || migrationItem2.f35015f != 5) && migrationItem2 != null) {
            return migrationItem2;
        }
        Map<String, MigrationItem> map2 = sparseArray.get(0);
        MigrationItem migrationItem3 = (MigrationItem) r5.mo23298a(map2, migrationItem.f35012c.f35021c, z);
        if (migrationItem3 == null) {
            migrationItem3 = (MigrationItem) r5.mo23298a(map2, migrationItem.f35012c.f35022d, z);
            if (migrationItem3 != null) {
                C14468a.m26439b("MMS", "getItemFromSparsedMapStrictCheck filterSuccess(%s) file duplicate! (%s) vs (%s)", Boolean.valueOf(z2), migrationItem, migrationItem3);
            } else {
                Iterator<MigrationItem> it2 = map2.values().iterator();
                while (it2.hasNext()) {
                    migrationItem3 = it2.next();
                    if (TextUtils.equals(migrationItem3.f35012c.f35022d, migrationItem.f35012c.f35021c)) {
                        C14468a.m26439b("MMS", "getItemFromSparsedMapStrictCheck filterSuccess(%s) file duplicate! (%s) vs (%s)", Boolean.valueOf(z2), migrationItem, migrationItem3);
                    }
                }
                MigrationItem a = m26403a(map2, migrationItem, z, r5, z2);
                if (a != null) {
                    return a;
                }
                return m26403a(sparseArray.get(2), migrationItem, z, r5, z2);
            }
        }
        return migrationItem3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r1 == null) goto L_0x005c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.disk.parcel.MigrationItem m26403a(java.util.Map<java.lang.String, com.bytedance.disk.parcel.MigrationItem> r10, com.bytedance.disk.parcel.MigrationItem r11, boolean r12, com.bytedance.disk.p966h.C14474d.AbstractC14475a<java.lang.String, com.bytedance.disk.parcel.MigrationItem> r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.p965g.BinderC14455a.m26403a(java.util.Map, com.bytedance.disk.parcel.MigrationItem, boolean, com.bytedance.disk.h.d$a, boolean):com.bytedance.disk.parcel.MigrationItem");
    }
}
