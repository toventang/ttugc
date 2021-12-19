package com.bytedance.android.livesdk.i18n.p560db;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.room.AbstractC1511c;
import androidx.room.AbstractC1533j;
import androidx.room.AbstractC1542n;
import androidx.room.C1541m;
import androidx.room.p069b.C1503a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.i18n.db.f */
public final class C8995f implements AbstractC8994e {

    /* renamed from: a */
    private final AbstractC1533j f22125a;

    /* renamed from: b */
    private final AbstractC1511c f22126b;

    /* renamed from: c */
    private final AbstractC1542n f22127c;

    static {
        Covode.recordClassIndex(9892);
    }

    @Override // com.bytedance.android.livesdk.i18n.p560db.AbstractC8994e
    /* renamed from: b */
    public final void mo15228b() {
        this.f22125a.mo5090d();
        AbstractC1069f b = this.f22127c.mo5109b();
        this.f22125a.mo5091e();
        try {
            b.mo3809a();
            this.f22125a.mo5093g();
        } finally {
            this.f22125a.mo5092f();
            this.f22127c.mo5108a(b);
        }
    }

    @Override // com.bytedance.android.livesdk.i18n.p560db.AbstractC8994e
    /* renamed from: a */
    public final List<C8993d> mo15226a() {
        C1541m a = C1541m.m5201a("SELECT * FROM translation", 0);
        this.f22125a.mo5090d();
        Cursor a2 = this.f22125a.mo5082a(a);
        try {
            int a3 = C1503a.m5129a(a2, "key");
            int a4 = C1503a.m5129a(a2, "value");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C8993d dVar = new C8993d();
                dVar.f22123a = a2.getString(a3);
                dVar.f22124b = a2.getString(a4);
                arrayList.add(dVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }

    public C8995f(AbstractC1533j jVar) {
        this.f22125a = jVar;
        this.f22126b = new AbstractC1511c<C8993d>(jVar) {
            /* class com.bytedance.android.livesdk.i18n.p560db.C8995f.C89961 */

            static {
                Covode.recordClassIndex(9893);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "INSERT OR REPLACE INTO `translation`(`key`,`value`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.j.a.f, java.lang.Object] */
            @Override // androidx.room.AbstractC1511c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo5057a(AbstractC1069f fVar, C8993d dVar) {
                C8993d dVar2 = dVar;
                if (dVar2.f22123a == null) {
                    fVar.mo3803a(1);
                } else {
                    fVar.mo3806a(1, dVar2.f22123a);
                }
                if (dVar2.f22124b == null) {
                    fVar.mo3803a(2);
                } else {
                    fVar.mo3806a(2, dVar2.f22124b);
                }
            }
        };
        this.f22127c = new AbstractC1542n(jVar) {
            /* class com.bytedance.android.livesdk.i18n.p560db.C8995f.C89972 */

            static {
                Covode.recordClassIndex(9894);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "DELETE FROM translation";
            }
        };
    }

    @Override // com.bytedance.android.livesdk.i18n.p560db.AbstractC8994e
    /* renamed from: a */
    public final void mo15227a(List<C8993d> list) {
        this.f22125a.mo5090d();
        this.f22125a.mo5091e();
        try {
            this.f22126b.mo5058a((Iterable) list);
            this.f22125a.mo5093g();
        } finally {
            this.f22125a.mo5092f();
        }
    }
}
