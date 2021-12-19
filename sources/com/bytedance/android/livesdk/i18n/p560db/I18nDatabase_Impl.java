package com.bytedance.android.livesdk.i18n.p560db;

import androidx.p054j.p055a.AbstractC1061b;
import androidx.p054j.p055a.AbstractC1062c;
import androidx.room.AbstractC1533j;
import androidx.room.C1500a;
import androidx.room.C1519g;
import androidx.room.C1539l;
import androidx.room.p069b.C1504b;
import androidx.room.p069b.C1506d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.bytedance.android.livesdk.i18n.db.I18nDatabase_Impl */
public final class I18nDatabase_Impl extends I18nDatabase {

    /* renamed from: k */
    private volatile AbstractC8994e f22115k;

    /* renamed from: l */
    private volatile AbstractC8990b f22116l;

    static {
        Covode.recordClassIndex(9884);
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: a */
    public final C1519g mo5084a() {
        return new C1519g(this, new HashMap(0), new HashMap(0), "translation", "information");
    }

    @Override // com.bytedance.android.livesdk.i18n.p560db.I18nDatabase
    /* renamed from: i */
    public final AbstractC8994e mo15222i() {
        AbstractC8994e eVar;
        MethodCollector.m26663i(11669);
        if (this.f22115k != null) {
            AbstractC8994e eVar2 = this.f22115k;
            MethodCollector.m26664o(11669);
            return eVar2;
        }
        synchronized (this) {
            try {
                if (this.f22115k == null) {
                    this.f22115k = new C8995f(this);
                }
                eVar = this.f22115k;
            } finally {
                MethodCollector.m26664o(11669);
            }
        }
        return eVar;
    }

    @Override // com.bytedance.android.livesdk.i18n.p560db.I18nDatabase
    /* renamed from: j */
    public final AbstractC8990b mo15223j() {
        AbstractC8990b bVar;
        MethodCollector.m26663i(11671);
        if (this.f22116l != null) {
            AbstractC8990b bVar2 = this.f22116l;
            MethodCollector.m26664o(11671);
            return bVar2;
        }
        synchronized (this) {
            try {
                if (this.f22116l == null) {
                    this.f22116l = new C8991c(this);
                }
                bVar = this.f22116l;
            } finally {
                MethodCollector.m26664o(11671);
            }
        }
        return bVar;
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: b */
    public final AbstractC1062c mo5087b(C1500a aVar) {
        C1539l lVar = new C1539l(aVar, new C1539l.AbstractC1540a() {
            /* class com.bytedance.android.livesdk.i18n.p560db.I18nDatabase_Impl.C89881 */

            static {
                Covode.recordClassIndex(9885);
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: a */
            public final void mo5100a() {
                if (I18nDatabase_Impl.this.f5040g != null) {
                    int size = I18nDatabase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        I18nDatabase_Impl.this.f5040g.get(i);
                    }
                }
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: e */
            public final void mo5105e(AbstractC1061b bVar) {
                C1504b.m5130a(bVar);
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: a */
            public final void mo5101a(AbstractC1061b bVar) {
                bVar.mo3785c("DROP TABLE IF EXISTS `translation`");
                bVar.mo3785c("DROP TABLE IF EXISTS `information`");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: b */
            public final void mo5102b(AbstractC1061b bVar) {
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `translation` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `information` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo3785c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'db08c04e8a10c6c1ddb9d9ab384c2f17')");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: c */
            public final void mo5103c(AbstractC1061b bVar) {
                I18nDatabase_Impl.this.f5034a = bVar;
                I18nDatabase_Impl.this.mo5085a(bVar);
                if (I18nDatabase_Impl.this.f5040g != null) {
                    int size = I18nDatabase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC1533j.AbstractC1535b) I18nDatabase_Impl.this.f5040g.get(i)).mo5097a(bVar);
                    }
                }
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: d */
            public final void mo5104d(AbstractC1061b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("key", new C1506d.C1507a("key", "TEXT", true, 1));
                hashMap.put("value", new C1506d.C1507a("value", "TEXT", false, 0));
                C1506d dVar = new C1506d("translation", hashMap, new HashSet(0), new HashSet(0));
                C1506d a = C1506d.m5133a(bVar, "translation");
                if (dVar.equals(a)) {
                    HashMap hashMap2 = new HashMap(2);
                    hashMap2.put("key", new C1506d.C1507a("key", "TEXT", true, 1));
                    hashMap2.put("value", new C1506d.C1507a("value", "TEXT", false, 0));
                    C1506d dVar2 = new C1506d("information", hashMap2, new HashSet(0), new HashSet(0));
                    C1506d a2 = C1506d.m5133a(bVar, "information");
                    if (!dVar2.equals(a2)) {
                        throw new IllegalStateException("Migration didn't properly handle information(com.bytedance.android.livesdk.i18n.db.I18nInformation).\n Expected:\n" + dVar2 + "\n Found:\n" + a2);
                    }
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle translation(com.bytedance.android.livesdk.i18n.db.I18nTranslation).\n Expected:\n" + dVar + "\n Found:\n" + a);
            }
        }, "db08c04e8a10c6c1ddb9d9ab384c2f17", "e3af7f9b450df7204a5f65d0fd2a1eaa");
        AbstractC1062c.C1064b.C1065a a = AbstractC1062c.C1064b.m3606a(aVar.f4949b);
        a.f3710b = aVar.f4950c;
        a.f3711c = lVar;
        return aVar.f4948a.mo3802a(a.mo3815a());
    }
}
