package androidx.work.impl.p073b;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.room.AbstractC1511c;
import androidx.room.AbstractC1533j;
import androidx.room.C1541m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.b.c */
public final class C1635c implements AbstractC1634b {

    /* renamed from: a */
    private final AbstractC1533j f5294a;

    /* renamed from: b */
    private final AbstractC1511c f5295b;

    static {
        Covode.recordClassIndex(1791);
    }

    public C1635c(AbstractC1533j jVar) {
        this.f5294a = jVar;
        this.f5295b = new AbstractC1511c<C1633a>(jVar) {
            /* class androidx.work.impl.p073b.C1635c.C16361 */

            static {
                Covode.recordClassIndex(1792);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.j.a.f, java.lang.Object] */
            @Override // androidx.room.AbstractC1511c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo5057a(AbstractC1069f fVar, C1633a aVar) {
                C1633a aVar2 = aVar;
                if (aVar2.f5292a == null) {
                    fVar.mo3803a(1);
                } else {
                    fVar.mo3806a(1, aVar2.f5292a);
                }
                if (aVar2.f5293b == null) {
                    fVar.mo3803a(2);
                } else {
                    fVar.mo3806a(2, aVar2.f5293b);
                }
            }
        };
    }

    @Override // androidx.work.impl.p073b.AbstractC1634b
    /* renamed from: a */
    public final boolean mo5412a(String str) {
        boolean z = true;
        C1541m a = C1541m.m5201a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3806a(1, str);
        }
        Cursor a2 = this.f5294a.mo5082a(a);
        try {
            boolean z2 = false;
            if (a2.moveToFirst()) {
                if (a2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }

    @Override // androidx.work.impl.p073b.AbstractC1634b
    /* renamed from: b */
    public final List<String> mo5413b(String str) {
        C1541m a = C1541m.m5201a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3806a(1, str);
        }
        Cursor a2 = this.f5294a.mo5082a(a);
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
}
