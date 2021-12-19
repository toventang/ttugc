package androidx.room;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1061b;
import androidx.p054j.p055a.AbstractC1062c;
import androidx.p054j.p055a.C1052a;
import androidx.room.AbstractC1533j;
import androidx.room.p068a.AbstractC1501a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.room.l */
public final class C1539l extends AbstractC1062c.AbstractC1063a {

    /* renamed from: b */
    private C1500a f5062b;

    /* renamed from: c */
    private final AbstractC1540a f5063c;

    /* renamed from: d */
    private final String f5064d;

    /* renamed from: e */
    private final String f5065e;

    static {
        Covode.recordClassIndex(1678);
    }

    /* renamed from: androidx.room.l$a */
    public static abstract class AbstractC1540a {

        /* renamed from: a */
        public final int f5066a;

        static {
            Covode.recordClassIndex(1679);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo5100a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo5101a(AbstractC1061b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo5102b(AbstractC1061b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo5103c(AbstractC1061b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo5104d(AbstractC1061b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo5105e(AbstractC1061b bVar) {
        }

        public AbstractC1540a(int i) {
            this.f5066a = i;
        }
    }

    /* renamed from: d */
    private static void m5189d(AbstractC1061b bVar) {
        bVar.mo3785c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: c */
    private void m5188c(AbstractC1061b bVar) {
        m5189d(bVar);
        bVar.mo3785c(C1538k.m5187a(this.f5064d));
    }

    @Override // androidx.p054j.p055a.AbstractC1062c.AbstractC1063a
    /* renamed from: a */
    public final void mo3811a(AbstractC1061b bVar) {
        m5188c(bVar);
        this.f5063c.mo5102b(bVar);
        this.f5063c.mo5100a();
    }

    /* renamed from: e */
    private static boolean m5190e(AbstractC1061b bVar) {
        Cursor b = bVar.mo3782b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (b.moveToFirst() && b.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            b.close();
        }
    }

    @Override // androidx.p054j.p055a.AbstractC1062c.AbstractC1063a
    /* renamed from: b */
    public final void mo3813b(AbstractC1061b bVar) {
        String str;
        super.mo3813b(bVar);
        if (m5190e(bVar)) {
            Cursor a = bVar.mo3779a(new C1052a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", (byte) 0));
            try {
                if (a.moveToFirst()) {
                    str = a.getString(0);
                } else {
                    str = null;
                }
            } finally {
                a.close();
            }
        } else {
            str = null;
        }
        if (this.f5064d.equals(str) || this.f5065e.equals(str)) {
            this.f5063c.mo5103c(bVar);
            this.f5062b = null;
            return;
        }
        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
    }

    @Override // androidx.p054j.p055a.AbstractC1062c.AbstractC1063a
    /* renamed from: b */
    public final void mo3814b(AbstractC1061b bVar, int i, int i2) {
        mo3812a(bVar, i, i2);
    }

    @Override // androidx.p054j.p055a.AbstractC1062c.AbstractC1063a
    /* renamed from: a */
    public final void mo3812a(AbstractC1061b bVar, int i, int i2) {
        boolean z;
        List<AbstractC1501a> a;
        C1500a aVar = this.f5062b;
        if (aVar != null) {
            AbstractC1533j.C1537d dVar = aVar.f4951d;
            if (i == i2) {
                a = Collections.emptyList();
            } else {
                if (i2 > i) {
                    z = true;
                } else {
                    z = false;
                }
                a = dVar.mo5098a(new ArrayList(), z, i, i2);
            }
            if (a != null) {
                this.f5063c.mo5105e(bVar);
                for (AbstractC1501a aVar2 : a) {
                    aVar2.mo5042a(bVar);
                }
                this.f5063c.mo5104d(bVar);
                m5188c(bVar);
                return;
            }
        }
        C1500a aVar3 = this.f5062b;
        if (aVar3 == null || ((i <= i2 || !aVar3.f4959l) && aVar3.f4958k && (aVar3.f4960m == null || !aVar3.f4960m.contains(Integer.valueOf(i))))) {
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f5063c.mo5101a(bVar);
        this.f5063c.mo5102b(bVar);
    }

    public C1539l(C1500a aVar, AbstractC1540a aVar2, String str, String str2) {
        super(aVar2.f5066a);
        this.f5062b = aVar;
        this.f5063c = aVar2;
        this.f5064d = str;
        this.f5065e = str2;
    }
}
