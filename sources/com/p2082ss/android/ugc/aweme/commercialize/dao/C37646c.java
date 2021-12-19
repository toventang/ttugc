package com.p2082ss.android.ugc.aweme.commercialize.dao;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.room.AbstractC1502b;
import androidx.room.AbstractC1511c;
import androidx.room.AbstractC1533j;
import androidx.room.AbstractC1542n;
import androidx.room.C1541m;
import androidx.room.p069b.C1503a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.dao.c */
public final class C37646c implements AbstractC37645b {

    /* renamed from: a */
    private final AbstractC1533j f89010a;

    /* renamed from: b */
    private final AbstractC1511c f89011b;

    /* renamed from: c */
    private final AbstractC1502b f89012c;

    /* renamed from: d */
    private final AbstractC1542n f89013d;

    static {
        Covode.recordClassIndex(45074);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.dao.AbstractC37645b
    /* renamed from: a */
    public final void mo65598a() {
        this.f89010a.mo5090d();
        AbstractC1069f b = this.f89013d.mo5109b();
        this.f89010a.mo5091e();
        try {
            b.mo3809a();
            this.f89010a.mo5093g();
        } finally {
            this.f89010a.mo5092f();
            this.f89013d.mo5108a(b);
        }
    }

    public C37646c(AbstractC1533j jVar) {
        this.f89010a = jVar;
        this.f89011b = new AbstractC1511c<C37644a>(jVar) {
            /* class com.p2082ss.android.ugc.aweme.commercialize.dao.C37646c.C376471 */

            static {
                Covode.recordClassIndex(45075);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "INSERT OR ABORT INTO `showAd`(`awemeId`) VALUES (?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.j.a.f, java.lang.Object] */
            @Override // androidx.room.AbstractC1511c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo5057a(AbstractC1069f fVar, C37644a aVar) {
                C37644a aVar2 = aVar;
                if (aVar2.f89009a == null) {
                    fVar.mo3803a(1);
                } else {
                    fVar.mo3806a(1, aVar2.f89009a);
                }
            }
        };
        this.f89012c = new AbstractC1502b<C37644a>(jVar) {
            /* class com.p2082ss.android.ugc.aweme.commercialize.dao.C37646c.C376482 */

            static {
                Covode.recordClassIndex(45076);
            }

            @Override // androidx.room.AbstractC1542n, androidx.room.AbstractC1502b
            /* renamed from: a */
            public final String mo5043a() {
                return "DELETE FROM `showAd` WHERE `awemeId` = ?";
            }
        };
        this.f89013d = new AbstractC1542n(jVar) {
            /* class com.p2082ss.android.ugc.aweme.commercialize.dao.C37646c.C376493 */

            static {
                Covode.recordClassIndex(45077);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "delete from showAd";
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.dao.AbstractC37645b
    /* renamed from: a */
    public final List<C37644a> mo65597a(String str) {
        C1541m a = C1541m.m5201a("SELECT * FROM showAd where awemeId = ?", 1);
        if (str == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3806a(1, str);
        }
        this.f89010a.mo5090d();
        Cursor a2 = this.f89010a.mo5082a(a);
        try {
            int a3 = C1503a.m5129a(a2, "awemeId");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(new C37644a(a2.getString(a3)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.dao.AbstractC37645b
    /* renamed from: a */
    public final void mo65599a(C37644a aVar) {
        this.f89010a.mo5090d();
        this.f89010a.mo5091e();
        try {
            this.f89011b.mo5059a(aVar);
            this.f89010a.mo5093g();
        } finally {
            this.f89010a.mo5092f();
        }
    }
}
