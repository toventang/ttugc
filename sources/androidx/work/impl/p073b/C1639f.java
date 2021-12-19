package androidx.work.impl.p073b;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.room.AbstractC1511c;
import androidx.room.AbstractC1533j;
import androidx.room.AbstractC1542n;
import androidx.room.C1541m;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.impl.b.f */
public final class C1639f implements AbstractC1638e {

    /* renamed from: a */
    private final AbstractC1533j f5299a;

    /* renamed from: b */
    private final AbstractC1511c f5300b;

    /* renamed from: c */
    private final AbstractC1542n f5301c;

    static {
        Covode.recordClassIndex(1795);
    }

    public C1639f(AbstractC1533j jVar) {
        this.f5299a = jVar;
        this.f5300b = new AbstractC1511c<C1637d>(jVar) {
            /* class androidx.work.impl.p073b.C1639f.C16401 */

            static {
                Covode.recordClassIndex(1796);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.j.a.f, java.lang.Object] */
            @Override // androidx.room.AbstractC1511c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo5057a(AbstractC1069f fVar, C1637d dVar) {
                C1637d dVar2 = dVar;
                if (dVar2.f5297a == null) {
                    fVar.mo3803a(1);
                } else {
                    fVar.mo3806a(1, dVar2.f5297a);
                }
                fVar.mo3805a(2, (long) dVar2.f5298b);
            }
        };
        this.f5301c = new AbstractC1542n(jVar) {
            /* class androidx.work.impl.p073b.C1639f.C16412 */

            static {
                Covode.recordClassIndex(1797);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    @Override // androidx.work.impl.p073b.AbstractC1638e
    /* renamed from: a */
    public final void mo5417a(C1637d dVar) {
        this.f5299a.mo5091e();
        try {
            this.f5300b.mo5059a(dVar);
            this.f5299a.mo5093g();
        } finally {
            this.f5299a.mo5092f();
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1638e
    /* renamed from: b */
    public final void mo5418b(String str) {
        AbstractC1069f b = this.f5301c.mo5109b();
        this.f5299a.mo5091e();
        if (str == null) {
            try {
                b.mo3803a(1);
            } catch (Throwable th) {
                this.f5299a.mo5092f();
                this.f5301c.mo5108a(b);
                throw th;
            }
        } else {
            b.mo3806a(1, str);
        }
        b.mo3809a();
        this.f5299a.mo5093g();
        this.f5299a.mo5092f();
        this.f5301c.mo5108a(b);
    }

    @Override // androidx.work.impl.p073b.AbstractC1638e
    /* renamed from: a */
    public final C1637d mo5416a(String str) {
        C1637d dVar;
        C1541m a = C1541m.m5201a("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3806a(1, str);
        }
        Cursor a2 = this.f5299a.mo5082a(a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("work_spec_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("system_id");
            if (a2.moveToFirst()) {
                dVar = new C1637d(a2.getString(columnIndexOrThrow), a2.getInt(columnIndexOrThrow2));
            } else {
                dVar = null;
            }
            return dVar;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }
}
