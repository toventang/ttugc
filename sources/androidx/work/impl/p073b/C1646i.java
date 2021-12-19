package androidx.work.impl.p073b;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.room.AbstractC1511c;
import androidx.room.AbstractC1533j;
import androidx.room.AbstractC1542n;
import androidx.room.C1541m;
import androidx.room.p069b.C1505c;
import androidx.work.C1593c;
import androidx.work.C1597e;
import androidx.work.C1603i;
import androidx.work.EnumC1590a;
import androidx.work.EnumC1602h;
import androidx.work.impl.p073b.C1660m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.b.i */
public final class C1646i implements AbstractC1645h {

    /* renamed from: a */
    public final AbstractC1533j f5326a;

    /* renamed from: b */
    private final AbstractC1511c f5327b;

    /* renamed from: c */
    private final AbstractC1542n f5328c;

    /* renamed from: d */
    private final AbstractC1542n f5329d;

    /* renamed from: e */
    private final AbstractC1542n f5330e;

    /* renamed from: f */
    private final AbstractC1542n f5331f;

    /* renamed from: g */
    private final AbstractC1542n f5332g;

    /* renamed from: h */
    private final AbstractC1542n f5333h;

    /* renamed from: i */
    private final AbstractC1542n f5334i;

    /* renamed from: j */
    private final AbstractC1542n f5335j;

    static {
        Covode.recordClassIndex(1802);
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: a */
    public final List<String> mo5430a() {
        C1541m a = C1541m.m5201a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        Cursor a2 = this.f5326a.mo5082a(a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: b */
    public final int mo5434b() {
        AbstractC1069f b = this.f5334i.mo5109b();
        this.f5326a.mo5091e();
        try {
            int a = b.mo3809a();
            this.f5326a.mo5093g();
            return a;
        } finally {
            this.f5326a.mo5092f();
            this.f5334i.mo5108a(b);
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: c */
    public final List<C1642g> mo5438c() {
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C1541m a = C1541m.m5201a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        Cursor a2 = this.f5326a.mo5082a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("minimum_retention_duration");
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("required_network_type");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("requires_charging");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("requires_device_idle");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("requires_battery_not_low");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("requires_storage_not_low");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("trigger_content_update_delay");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("trigger_max_content_delay");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("content_uri_triggers");
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(columnIndexOrThrow);
                    String string2 = a2.getString(columnIndexOrThrow3);
                    C1593c cVar = new C1593c();
                    cVar.f5204b = C1660m.m5478c(a2.getInt(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f5205c = z;
                    if (a2.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f5206d = z2;
                    if (a2.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f5207e = z3;
                    if (a2.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.f5208f = z4;
                    cVar.f5209g = a2.getLong(columnIndexOrThrow21);
                    cVar.f5210h = a2.getLong(columnIndexOrThrow22);
                    cVar.f5211i = C1660m.m5474a(a2.getBlob(columnIndexOrThrow23));
                    C1642g gVar = new C1642g(string, string2);
                    gVar.f5307b = C1660m.m5475a(a2.getInt(columnIndexOrThrow2));
                    gVar.f5309d = a2.getString(columnIndexOrThrow4);
                    gVar.f5310e = C1597e.m5311a(a2.getBlob(columnIndexOrThrow5));
                    gVar.f5311f = C1597e.m5311a(a2.getBlob(columnIndexOrThrow6));
                    gVar.f5312g = a2.getLong(columnIndexOrThrow7);
                    gVar.f5313h = a2.getLong(columnIndexOrThrow8);
                    gVar.f5314i = a2.getLong(columnIndexOrThrow9);
                    gVar.f5316k = a2.getInt(columnIndexOrThrow10);
                    gVar.f5317l = C1660m.m5477b(a2.getInt(columnIndexOrThrow11));
                    gVar.f5318m = a2.getLong(columnIndexOrThrow12);
                    gVar.f5319n = a2.getLong(columnIndexOrThrow13);
                    gVar.f5320o = a2.getLong(columnIndexOrThrow14);
                    gVar.f5321p = a2.getLong(columnIndexOrThrow15);
                    gVar.f5315j = cVar;
                    arrayList.add(gVar);
                }
                a2.close();
                a.mo5106a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                a.mo5106a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a2.close();
            a.mo5106a();
            throw th;
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: d */
    public final List<C1642g> mo5440d() {
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C1541m a = C1541m.m5201a("SELECT * FROM workspec WHERE state=0", 0);
        Cursor a2 = this.f5326a.mo5082a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("minimum_retention_duration");
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("required_network_type");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("requires_charging");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("requires_device_idle");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("requires_battery_not_low");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("requires_storage_not_low");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("trigger_content_update_delay");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("trigger_max_content_delay");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("content_uri_triggers");
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(columnIndexOrThrow);
                    String string2 = a2.getString(columnIndexOrThrow3);
                    C1593c cVar = new C1593c();
                    cVar.f5204b = C1660m.m5478c(a2.getInt(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f5205c = z;
                    if (a2.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f5206d = z2;
                    if (a2.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f5207e = z3;
                    if (a2.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.f5208f = z4;
                    cVar.f5209g = a2.getLong(columnIndexOrThrow21);
                    cVar.f5210h = a2.getLong(columnIndexOrThrow22);
                    cVar.f5211i = C1660m.m5474a(a2.getBlob(columnIndexOrThrow23));
                    C1642g gVar = new C1642g(string, string2);
                    gVar.f5307b = C1660m.m5475a(a2.getInt(columnIndexOrThrow2));
                    gVar.f5309d = a2.getString(columnIndexOrThrow4);
                    gVar.f5310e = C1597e.m5311a(a2.getBlob(columnIndexOrThrow5));
                    gVar.f5311f = C1597e.m5311a(a2.getBlob(columnIndexOrThrow6));
                    gVar.f5312g = a2.getLong(columnIndexOrThrow7);
                    gVar.f5313h = a2.getLong(columnIndexOrThrow8);
                    gVar.f5314i = a2.getLong(columnIndexOrThrow9);
                    gVar.f5316k = a2.getInt(columnIndexOrThrow10);
                    gVar.f5317l = C1660m.m5477b(a2.getInt(columnIndexOrThrow11));
                    gVar.f5318m = a2.getLong(columnIndexOrThrow12);
                    gVar.f5319n = a2.getLong(columnIndexOrThrow13);
                    gVar.f5320o = a2.getLong(columnIndexOrThrow14);
                    gVar.f5321p = a2.getLong(columnIndexOrThrow15);
                    gVar.f5315j = cVar;
                    arrayList.add(gVar);
                }
                a2.close();
                a.mo5106a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                a.mo5106a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a2.close();
            a.mo5106a();
            throw th;
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: c */
    public final int mo5437c(String str) {
        AbstractC1069f b = this.f5332g.mo5109b();
        this.f5326a.mo5091e();
        if (str == null) {
            try {
                b.mo3803a(1);
            } catch (Throwable th) {
                this.f5326a.mo5092f();
                this.f5332g.mo5108a(b);
                throw th;
            }
        } else {
            b.mo3806a(1, str);
        }
        int a = b.mo3809a();
        this.f5326a.mo5093g();
        this.f5326a.mo5092f();
        this.f5332g.mo5108a(b);
        return a;
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: d */
    public final C1603i.EnumC1604a mo5439d(String str) {
        C1603i.EnumC1604a aVar;
        C1541m a = C1541m.m5201a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3806a(1, str);
        }
        Cursor a2 = this.f5326a.mo5082a(a);
        try {
            if (a2.moveToFirst()) {
                aVar = C1660m.m5475a(a2.getInt(0));
            } else {
                aVar = null;
            }
            return aVar;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }

    public C1646i(AbstractC1533j jVar) {
        this.f5326a = jVar;
        this.f5327b = new AbstractC1511c<C1642g>(jVar) {
            /* class androidx.work.impl.p073b.C1646i.C16471 */

            static {
                Covode.recordClassIndex(1803);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.j.a.f, java.lang.Object] */
            @Override // androidx.room.AbstractC1511c
            /* renamed from: a */
            public final /* synthetic */ void mo5057a(AbstractC1069f fVar, C1642g gVar) {
                int i;
                C1642g gVar2 = gVar;
                int i2 = 1;
                if (gVar2.f5306a == null) {
                    fVar.mo3803a(1);
                } else {
                    fVar.mo3806a(1, gVar2.f5306a);
                }
                fVar.mo3805a(2, (long) C1660m.m5473a(gVar2.f5307b));
                if (gVar2.f5308c == null) {
                    fVar.mo3803a(3);
                } else {
                    fVar.mo3806a(3, gVar2.f5308c);
                }
                if (gVar2.f5309d == null) {
                    fVar.mo3803a(4);
                } else {
                    fVar.mo3806a(4, gVar2.f5309d);
                }
                byte[] a = C1597e.m5312a(gVar2.f5310e);
                if (a == null) {
                    fVar.mo3803a(5);
                } else {
                    fVar.mo3807a(5, a);
                }
                byte[] a2 = C1597e.m5312a(gVar2.f5311f);
                if (a2 == null) {
                    fVar.mo3803a(6);
                } else {
                    fVar.mo3807a(6, a2);
                }
                fVar.mo3805a(7, gVar2.f5312g);
                fVar.mo3805a(8, gVar2.f5313h);
                fVar.mo3805a(9, gVar2.f5314i);
                fVar.mo3805a(10, (long) gVar2.f5316k);
                EnumC1590a aVar = gVar2.f5317l;
                int i3 = C1660m.C16611.f5351b[aVar.ordinal()];
                if (i3 == 1) {
                    i = 0;
                } else if (i3 == 2) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("Could not convert " + aVar + " to int");
                }
                fVar.mo3805a(11, (long) i);
                fVar.mo3805a(12, gVar2.f5318m);
                fVar.mo3805a(13, gVar2.f5319n);
                fVar.mo3805a(14, gVar2.f5320o);
                fVar.mo3805a(15, gVar2.f5321p);
                C1593c cVar = gVar2.f5315j;
                if (cVar != null) {
                    EnumC1602h hVar = cVar.f5204b;
                    int i4 = C1660m.C16611.f5352c[hVar.ordinal()];
                    if (i4 == 1) {
                        i2 = 0;
                    } else if (i4 != 2) {
                        if (i4 == 3) {
                            i2 = 2;
                        } else if (i4 == 4) {
                            i2 = 3;
                        } else if (i4 == 5) {
                            i2 = 4;
                        } else {
                            throw new IllegalArgumentException("Could not convert " + hVar + " to int");
                        }
                    }
                    fVar.mo3805a(16, (long) i2);
                    fVar.mo3805a(17, cVar.f5205c ? 1 : 0);
                    fVar.mo3805a(18, cVar.f5206d ? 1 : 0);
                    fVar.mo3805a(19, cVar.f5207e ? 1 : 0);
                    fVar.mo3805a(20, cVar.f5208f ? 1 : 0);
                    fVar.mo3805a(21, cVar.f5209g);
                    fVar.mo3805a(22, cVar.f5210h);
                    byte[] a3 = C1660m.m5476a(cVar.f5211i);
                    if (a3 == null) {
                        fVar.mo3803a(23);
                    } else {
                        fVar.mo3807a(23, a3);
                    }
                } else {
                    fVar.mo3803a(16);
                    fVar.mo3803a(17);
                    fVar.mo3803a(18);
                    fVar.mo3803a(19);
                    fVar.mo3803a(20);
                    fVar.mo3803a(21);
                    fVar.mo3803a(22);
                    fVar.mo3803a(23);
                }
            }
        };
        this.f5328c = new AbstractC1542n(jVar) {
            /* class androidx.work.impl.p073b.C1646i.C16482 */

            static {
                Covode.recordClassIndex(1804);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.f5329d = new AbstractC1542n(jVar) {
            /* class androidx.work.impl.p073b.C1646i.C16493 */

            static {
                Covode.recordClassIndex(1805);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.f5330e = new AbstractC1542n(jVar) {
            /* class androidx.work.impl.p073b.C1646i.C16504 */

            static {
                Covode.recordClassIndex(1806);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f5331f = new AbstractC1542n(jVar) {
            /* class androidx.work.impl.p073b.C1646i.C16515 */

            static {
                Covode.recordClassIndex(1807);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.f5332g = new AbstractC1542n(jVar) {
            /* class androidx.work.impl.p073b.C1646i.C16526 */

            static {
                Covode.recordClassIndex(1808);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.f5333h = new AbstractC1542n(jVar) {
            /* class androidx.work.impl.p073b.C1646i.C16537 */

            static {
                Covode.recordClassIndex(1809);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.f5334i = new AbstractC1542n(jVar) {
            /* class androidx.work.impl.p073b.C1646i.C16548 */

            static {
                Covode.recordClassIndex(1810);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.f5335j = new AbstractC1542n(jVar) {
            /* class androidx.work.impl.p073b.C1646i.C16559 */

            static {
                Covode.recordClassIndex(1811);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: b */
    public final int mo5435b(String str) {
        AbstractC1069f b = this.f5331f.mo5109b();
        this.f5326a.mo5091e();
        if (str == null) {
            try {
                b.mo3803a(1);
            } catch (Throwable th) {
                this.f5326a.mo5092f();
                this.f5331f.mo5108a(b);
                throw th;
            }
        } else {
            b.mo3806a(1, str);
        }
        int a = b.mo3809a();
        this.f5326a.mo5093g();
        this.f5326a.mo5092f();
        this.f5331f.mo5108a(b);
        return a;
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: e */
    public final List<C1597e> mo5441e(String str) {
        C1541m a = C1541m.m5201a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3806a(1, str);
        }
        Cursor a2 = this.f5326a.mo5082a(a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(C1597e.m5311a(a2.getBlob(0)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: a */
    public final C1642g mo5429a(String str) {
        Throwable th;
        C1642g gVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C1541m a = C1541m.m5201a("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3806a(1, str);
        }
        Cursor a2 = this.f5326a.mo5082a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("minimum_retention_duration");
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("required_network_type");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("requires_charging");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("requires_device_idle");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("requires_battery_not_low");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("requires_storage_not_low");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("trigger_content_update_delay");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("trigger_max_content_delay");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("content_uri_triggers");
                if (a2.moveToFirst()) {
                    String string = a2.getString(columnIndexOrThrow);
                    String string2 = a2.getString(columnIndexOrThrow3);
                    C1593c cVar = new C1593c();
                    cVar.f5204b = C1660m.m5478c(a2.getInt(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f5205c = z;
                    if (a2.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f5206d = z2;
                    if (a2.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f5207e = z3;
                    if (a2.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.f5208f = z4;
                    cVar.f5209g = a2.getLong(columnIndexOrThrow21);
                    cVar.f5210h = a2.getLong(columnIndexOrThrow22);
                    cVar.f5211i = C1660m.m5474a(a2.getBlob(columnIndexOrThrow23));
                    gVar = new C1642g(string, string2);
                    gVar.f5307b = C1660m.m5475a(a2.getInt(columnIndexOrThrow2));
                    gVar.f5309d = a2.getString(columnIndexOrThrow4);
                    gVar.f5310e = C1597e.m5311a(a2.getBlob(columnIndexOrThrow5));
                    gVar.f5311f = C1597e.m5311a(a2.getBlob(columnIndexOrThrow6));
                    gVar.f5312g = a2.getLong(columnIndexOrThrow7);
                    gVar.f5313h = a2.getLong(columnIndexOrThrow8);
                    gVar.f5314i = a2.getLong(columnIndexOrThrow9);
                    gVar.f5316k = a2.getInt(columnIndexOrThrow10);
                    gVar.f5317l = C1660m.m5477b(a2.getInt(columnIndexOrThrow11));
                    gVar.f5318m = a2.getLong(columnIndexOrThrow12);
                    gVar.f5319n = a2.getLong(columnIndexOrThrow13);
                    gVar.f5320o = a2.getLong(columnIndexOrThrow14);
                    gVar.f5321p = a2.getLong(columnIndexOrThrow15);
                    gVar.f5315j = cVar;
                } else {
                    gVar = null;
                }
                a2.close();
                a.mo5106a();
                return gVar;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                a.mo5106a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a2.close();
            a.mo5106a();
            throw th;
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: a */
    public final List<C1642g> mo5431a(int i) {
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C1541m a = C1541m.m5201a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a.mo3805a(1, (long) i);
        Cursor a2 = this.f5326a.mo5082a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("minimum_retention_duration");
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("required_network_type");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("requires_charging");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("requires_device_idle");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("requires_battery_not_low");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("requires_storage_not_low");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("trigger_content_update_delay");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("trigger_max_content_delay");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("content_uri_triggers");
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(columnIndexOrThrow);
                    String string2 = a2.getString(columnIndexOrThrow3);
                    C1593c cVar = new C1593c();
                    cVar.f5204b = C1660m.m5478c(a2.getInt(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f5205c = z;
                    if (a2.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f5206d = z2;
                    if (a2.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f5207e = z3;
                    if (a2.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.f5208f = z4;
                    cVar.f5209g = a2.getLong(columnIndexOrThrow21);
                    cVar.f5210h = a2.getLong(columnIndexOrThrow22);
                    cVar.f5211i = C1660m.m5474a(a2.getBlob(columnIndexOrThrow23));
                    C1642g gVar = new C1642g(string, string2);
                    gVar.f5307b = C1660m.m5475a(a2.getInt(columnIndexOrThrow2));
                    gVar.f5309d = a2.getString(columnIndexOrThrow4);
                    gVar.f5310e = C1597e.m5311a(a2.getBlob(columnIndexOrThrow5));
                    gVar.f5311f = C1597e.m5311a(a2.getBlob(columnIndexOrThrow6));
                    gVar.f5312g = a2.getLong(columnIndexOrThrow7);
                    gVar.f5313h = a2.getLong(columnIndexOrThrow8);
                    gVar.f5314i = a2.getLong(columnIndexOrThrow9);
                    gVar.f5316k = a2.getInt(columnIndexOrThrow10);
                    gVar.f5317l = C1660m.m5477b(a2.getInt(columnIndexOrThrow11));
                    gVar.f5318m = a2.getLong(columnIndexOrThrow12);
                    gVar.f5319n = a2.getLong(columnIndexOrThrow13);
                    gVar.f5320o = a2.getLong(columnIndexOrThrow14);
                    gVar.f5321p = a2.getLong(columnIndexOrThrow15);
                    gVar.f5315j = cVar;
                    arrayList.add(gVar);
                }
                a2.close();
                a.mo5106a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                a.mo5106a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a2.close();
            a.mo5106a();
            throw th;
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: a */
    public final int mo5428a(C1603i.EnumC1604a aVar, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        C1505c.m5131a(sb);
        sb.append(")");
        AbstractC1069f a = this.f5326a.mo5083a(sb.toString());
        a.mo3805a(1, (long) C1660m.m5473a(aVar));
        int i = 0;
        do {
            String str = strArr[0];
            if (str == null) {
                a.mo3803a(2);
            } else {
                a.mo3806a(2, str);
            }
            i++;
        } while (i <= 0);
        this.f5326a.mo5091e();
        try {
            int a2 = a.mo3809a();
            this.f5326a.mo5093g();
            return a2;
        } finally {
            this.f5326a.mo5092f();
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: a */
    public final void mo5432a(String str, long j) {
        AbstractC1069f b = this.f5330e.mo5109b();
        this.f5326a.mo5091e();
        try {
            b.mo3805a(1, j);
            if (str == null) {
                b.mo3803a(2);
            } else {
                b.mo3806a(2, str);
            }
            b.mo3809a();
            this.f5326a.mo5093g();
        } finally {
            this.f5326a.mo5092f();
            this.f5330e.mo5108a(b);
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: b */
    public final int mo5436b(String str, long j) {
        AbstractC1069f b = this.f5333h.mo5109b();
        this.f5326a.mo5091e();
        try {
            b.mo3805a(1, j);
            if (str == null) {
                b.mo3803a(2);
            } else {
                b.mo3806a(2, str);
            }
            int a = b.mo3809a();
            this.f5326a.mo5093g();
            return a;
        } finally {
            this.f5326a.mo5092f();
            this.f5333h.mo5108a(b);
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1645h
    /* renamed from: a */
    public final void mo5433a(String str, C1597e eVar) {
        AbstractC1069f b = this.f5329d.mo5109b();
        this.f5326a.mo5091e();
        try {
            byte[] a = C1597e.m5312a(eVar);
            if (a == null) {
                b.mo3803a(1);
            } else {
                b.mo3807a(1, a);
            }
            if (str == null) {
                b.mo3803a(2);
            } else {
                b.mo3806a(2, str);
            }
            b.mo3809a();
            this.f5326a.mo5093g();
        } finally {
            this.f5326a.mo5092f();
            this.f5329d.mo5108a(b);
        }
    }
}
