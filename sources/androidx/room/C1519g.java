package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.p012a.p013a.p015b.C0182b;
import androidx.p025c.C0484a;
import androidx.p025c.C0486b;
import androidx.p054j.p055a.AbstractC1061b;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.p054j.p055a.C1052a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.room.g */
public final class C1519g {

    /* renamed from: j */
    private static final String[] f4989j = {"UPDATE", C14420a.f34884d, "INSERT"};

    /* renamed from: a */
    final C0484a<String, Integer> f4990a;

    /* renamed from: b */
    final String[] f4991b;

    /* renamed from: c */
    final AbstractC1533j f4992c;

    /* renamed from: d */
    AtomicBoolean f4993d;

    /* renamed from: e */
    volatile boolean f4994e;

    /* renamed from: f */
    volatile AbstractC1069f f4995f;

    /* renamed from: g */
    final C0182b<AbstractC1522b, C1523c> f4996g;

    /* renamed from: h */
    C1524h f4997h;

    /* renamed from: i */
    Runnable f4998i;

    /* renamed from: k */
    private Map<String, Set<String>> f4999k;

    /* renamed from: l */
    private C1521a f5000l;

    /* renamed from: m */
    private final C1518f f5001m;

    static {
        Covode.recordClassIndex(1658);
    }

    /* renamed from: a */
    private void m5151a() {
        if (this.f4992c.mo5088b()) {
            mo5067a(this.f4992c.f5037d.mo3792a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.room.g$a */
    public static class C1521a {

        /* renamed from: a */
        final long[] f5003a;

        /* renamed from: b */
        final boolean[] f5004b;

        /* renamed from: c */
        final int[] f5005c;

        /* renamed from: d */
        boolean f5006d;

        /* renamed from: e */
        boolean f5007e;

        static {
            Covode.recordClassIndex(1660);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int[] mo5072a() {
            boolean z;
            synchronized (this) {
                if (!this.f5006d || this.f5007e) {
                    return null;
                }
                int length = this.f5003a.length;
                int i = 0;
                while (true) {
                    int i2 = 1;
                    if (i < length) {
                        if (this.f5003a[i] > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean[] zArr = this.f5004b;
                        if (z != zArr[i]) {
                            int[] iArr = this.f5005c;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.f5005c[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    } else {
                        this.f5007e = true;
                        this.f5006d = false;
                        return this.f5005c;
                    }
                }
            }
        }

        C1521a(int i) {
            long[] jArr = new long[i];
            this.f5003a = jArr;
            boolean[] zArr = new boolean[i];
            this.f5004b = zArr;
            this.f5005c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo5071a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f5003a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f5006d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo5073b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f5003a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f5006d = true;
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    /* renamed from: androidx.room.g$b */
    public static abstract class AbstractC1522b {

        /* renamed from: a */
        final String[] f5008a;

        static {
            Covode.recordClassIndex(1661);
        }

        /* renamed from: a */
        public abstract void mo5074a(Set<String> set);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5075a() {
            return false;
        }

        public AbstractC1522b(String[] strArr) {
            this.f5008a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }

    /* renamed from: b */
    public final void mo5069b(AbstractC1522b bVar) {
        C1523c b;
        synchronized (this.f4996g) {
            b = this.f4996g.mo344b(bVar);
        }
        if (b != null && this.f5000l.mo5073b(b.f5009a)) {
            m5151a();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5067a(AbstractC1061b bVar) {
        if (!bVar.mo3787d()) {
            while (true) {
                ReentrantReadWriteLock.ReadLock readLock = this.f4992c.f5041h.readLock();
                readLock.lock();
                try {
                    int[] a = this.f5000l.mo5072a();
                    if (a == null) {
                        readLock.unlock();
                        return;
                    }
                    int length = a.length;
                    bVar.mo3781a();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = a[i];
                            if (i2 == 1) {
                                bVar.mo3785c("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
                                String str = this.f4991b[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f4989j;
                                for (String str2 : strArr) {
                                    sb.setLength(0);
                                    sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
                                    m5153a(sb, str, str2);
                                    sb.append(" AFTER ").append(str2).append(" ON `").append(str).append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ").append(i).append(" AND invalidated = 0; END");
                                    bVar.mo3785c(sb.toString());
                                }
                            } else if (i2 == 2) {
                                m5152a(bVar, i);
                            }
                        } catch (Throwable th) {
                            bVar.mo3783b();
                            throw th;
                        }
                    }
                    bVar.mo3784c();
                    bVar.mo3783b();
                    C1521a aVar = this.f5000l;
                    synchronized (aVar) {
                        aVar.f5007e = false;
                    }
                    try {
                        readLock.unlock();
                    } catch (SQLiteException | IllegalStateException unused) {
                        return;
                    }
                } catch (Throwable th2) {
                    readLock.unlock();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo5068a(AbstractC1522b bVar) {
        C1523c a;
        String[] strArr = bVar.f5008a;
        C0486b bVar2 = new C0486b();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4999k.containsKey(lowerCase)) {
                bVar2.addAll(this.f4999k.get(lowerCase));
            } else {
                bVar2.add(str);
            }
        }
        String[] strArr2 = (String[]) bVar2.toArray(new String[bVar2.size()]);
        int[] iArr = new int[strArr2.length];
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.f4990a.get(strArr2[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name " + strArr2[i]);
            }
        }
        C1523c cVar = new C1523c(bVar, iArr, strArr2);
        synchronized (this.f4996g) {
            a = this.f4996g.mo343a(bVar, cVar);
        }
        if (a == null && this.f5000l.mo5071a(iArr)) {
            m5151a();
        }
    }

    public C1519g(AbstractC1533j jVar, String... strArr) {
        this(jVar, new HashMap(), Collections.emptyMap(), strArr);
    }

    /* renamed from: a */
    private void m5152a(AbstractC1061b bVar, int i) {
        String str = this.f4991b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f4989j;
        for (String str2 : strArr) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m5153a(sb, str, str2);
            bVar.mo3785c(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.room.g$c */
    public static class C1523c {

        /* renamed from: a */
        final int[] f5009a;

        /* renamed from: b */
        final String[] f5010b;

        /* renamed from: c */
        final AbstractC1522b f5011c;

        /* renamed from: d */
        final Set<String> f5012d;

        static {
            Covode.recordClassIndex(1662);
        }

        C1523c(AbstractC1522b bVar, int[] iArr, String[] strArr) {
            this.f5011c = bVar;
            this.f5009a = iArr;
            this.f5010b = strArr;
            if (iArr.length == 1) {
                C0486b bVar2 = new C0486b();
                bVar2.add(strArr[0]);
                this.f5012d = Collections.unmodifiableSet(bVar2);
                return;
            }
            this.f5012d = null;
        }
    }

    /* renamed from: a */
    private static void m5153a(StringBuilder sb, String str, String str2) {
        sb.append("`room_table_modification_trigger_").append(str).append("_").append(str2).append("`");
    }

    public C1519g(AbstractC1533j jVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4993d = new AtomicBoolean(false);
        this.f4994e = false;
        this.f4996g = new C0182b<>();
        this.f4998i = new Runnable() {
            /* class androidx.room.C1519g.RunnableC15201 */

            static {
                Covode.recordClassIndex(1659);
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: a */
            private Set<Integer> m5157a() {
                C0486b bVar = new C0486b();
                Cursor a = C1519g.this.f4992c.mo5082a(new C1052a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", (byte) 0));
                while (a.moveToNext()) {
                    try {
                        bVar.add(Integer.valueOf(a.getInt(0)));
                    } catch (Throwable th) {
                        a.close();
                        throw th;
                    }
                }
                a.close();
                if (!bVar.isEmpty()) {
                    C1519g.this.f4995f.mo3809a();
                }
                return bVar;
            }

            public final void run() {
                Set<Integer> set;
                Throwable th;
                ReentrantReadWriteLock.ReadLock readLock = C1519g.this.f4992c.f5041h.readLock();
                try {
                    readLock.lock();
                    C1519g gVar = C1519g.this;
                    if (gVar.f4992c.mo5088b()) {
                        if (!gVar.f4994e) {
                            gVar.f4992c.f5037d.mo3792a();
                        }
                        if (gVar.f4994e) {
                            try {
                                if (!C1519g.this.f4993d.compareAndSet(true, false)) {
                                    readLock.unlock();
                                } else if (C1519g.this.f4992c.mo5094h()) {
                                    readLock.unlock();
                                } else {
                                    if (C1519g.this.f4992c.f5039f) {
                                        AbstractC1061b a = C1519g.this.f4992c.f5037d.mo3792a();
                                        a.mo3781a();
                                        try {
                                            set = m5157a();
                                            try {
                                                a.mo3784c();
                                                a.mo3783b();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                try {
                                                    a.mo3783b();
                                                    throw th;
                                                } catch (SQLiteException | IllegalStateException unused) {
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            set = null;
                                            a.mo3783b();
                                            throw th;
                                        }
                                    } else {
                                        set = m5157a();
                                    }
                                    readLock.unlock();
                                    if (!(set == null || set.isEmpty())) {
                                        synchronized (C1519g.this.f4996g) {
                                            Iterator<Map.Entry<AbstractC1522b, C1523c>> it = C1519g.this.f4996g.iterator();
                                            while (it.hasNext()) {
                                                C1523c value = it.next().getValue();
                                                int length = value.f5009a.length;
                                                Set<String> set2 = null;
                                                for (int i = 0; i < length; i++) {
                                                    if (set.contains(Integer.valueOf(value.f5009a[i]))) {
                                                        if (length == 1) {
                                                            set2 = value.f5012d;
                                                        } else {
                                                            if (set2 == null) {
                                                                set2 = new C0486b<>(length);
                                                            }
                                                            set2.add(value.f5010b[i]);
                                                        }
                                                    }
                                                }
                                                if (set2 != null) {
                                                    value.f5011c.mo5074a(set2);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (SQLiteException | IllegalStateException unused2) {
                                set = null;
                            }
                        }
                    }
                } finally {
                    readLock.unlock();
                }
            }
        };
        this.f4992c = jVar;
        this.f5000l = new C1521a(strArr.length);
        this.f4990a = new C0484a<>();
        this.f4999k = map2;
        this.f5001m = new C1518f(jVar);
        int length = strArr.length;
        this.f4991b = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f4990a.put(lowerCase, Integer.valueOf(i));
            String str = map.get(strArr[i]);
            if (str != null) {
                this.f4991b[i] = str.toLowerCase(Locale.US);
            } else {
                this.f4991b[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String lowerCase2 = entry.getValue().toLowerCase(Locale.US);
            if (this.f4990a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(Locale.US);
                C0484a<String, Integer> aVar = this.f4990a;
                aVar.put(lowerCase3, aVar.get(lowerCase2));
            }
        }
    }
}
