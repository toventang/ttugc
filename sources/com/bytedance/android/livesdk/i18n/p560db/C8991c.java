package com.bytedance.android.livesdk.i18n.p560db;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.room.AbstractC1511c;
import androidx.room.AbstractC1533j;
import androidx.room.C1541m;
import androidx.room.p069b.C1503a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.i18n.db.c */
public final class C8991c implements AbstractC8990b {

    /* renamed from: a */
    private final AbstractC1533j f22120a;

    /* renamed from: b */
    private final AbstractC1511c f22121b;

    static {
        Covode.recordClassIndex(9888);
    }

    public C8991c(AbstractC1533j jVar) {
        this.f22120a = jVar;
        this.f22121b = new AbstractC1511c<C8989a>(jVar) {
            /* class com.bytedance.android.livesdk.i18n.p560db.C8991c.C89921 */

            static {
                Covode.recordClassIndex(9889);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "INSERT OR REPLACE INTO `information`(`key`,`value`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.j.a.f, java.lang.Object] */
            @Override // androidx.room.AbstractC1511c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo5057a(AbstractC1069f fVar, C8989a aVar) {
                C8989a aVar2 = aVar;
                if (aVar2.f22118a == null) {
                    fVar.mo3803a(1);
                } else {
                    fVar.mo3806a(1, aVar2.f22118a);
                }
                if (aVar2.f22119b == null) {
                    fVar.mo3803a(2);
                } else {
                    fVar.mo3806a(2, aVar2.f22119b);
                }
            }
        };
    }

    @Override // com.bytedance.android.livesdk.i18n.p560db.AbstractC8990b
    /* renamed from: a */
    public final void mo15225a(C8989a aVar) {
        this.f22120a.mo5090d();
        this.f22120a.mo5091e();
        try {
            this.f22121b.mo5059a(aVar);
            this.f22120a.mo5093g();
        } finally {
            this.f22120a.mo5092f();
        }
    }

    @Override // com.bytedance.android.livesdk.i18n.p560db.AbstractC8990b
    /* renamed from: a */
    public final C8989a mo15224a(String str) {
        C8989a aVar;
        C1541m a = C1541m.m5201a("SELECT * FROM information WHERE `key` = ?", 1);
        a.mo3806a(1, str);
        this.f22120a.mo5090d();
        Cursor a2 = this.f22120a.mo5082a(a);
        try {
            int a3 = C1503a.m5129a(a2, "key");
            int a4 = C1503a.m5129a(a2, "value");
            if (a2.moveToFirst()) {
                aVar = new C8989a();
                aVar.f22118a = a2.getString(a3);
                aVar.f22119b = a2.getString(a4);
            } else {
                aVar = null;
            }
            return aVar;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }
}
