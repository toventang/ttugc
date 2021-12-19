package androidx.work.impl.p073b;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.room.AbstractC1511c;
import androidx.room.AbstractC1533j;
import androidx.room.C1541m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.b.l */
public final class C1658l implements AbstractC1657k {

    /* renamed from: a */
    private final AbstractC1533j f5347a;

    /* renamed from: b */
    private final AbstractC1511c f5348b;

    static {
        Covode.recordClassIndex(1814);
    }

    public C1658l(AbstractC1533j jVar) {
        this.f5347a = jVar;
        this.f5348b = new AbstractC1511c<C1656j>(jVar) {
            /* class androidx.work.impl.p073b.C1658l.C16591 */

            static {
                Covode.recordClassIndex(1815);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.j.a.f, java.lang.Object] */
            @Override // androidx.room.AbstractC1511c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo5057a(AbstractC1069f fVar, C1656j jVar) {
                C1656j jVar2 = jVar;
                if (jVar2.f5345a == null) {
                    fVar.mo3803a(1);
                } else {
                    fVar.mo3806a(1, jVar2.f5345a);
                }
                if (jVar2.f5346b == null) {
                    fVar.mo3803a(2);
                } else {
                    fVar.mo3806a(2, jVar2.f5346b);
                }
            }
        };
    }

    @Override // androidx.work.impl.p073b.AbstractC1657k
    /* renamed from: a */
    public final List<String> mo5442a(String str) {
        C1541m a = C1541m.m5201a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3806a(1, str);
        }
        Cursor a2 = this.f5347a.mo5082a(a);
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
