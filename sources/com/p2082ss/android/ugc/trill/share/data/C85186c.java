package com.p2082ss.android.ugc.trill.share.data;

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

/* renamed from: com.ss.android.ugc.trill.share.data.c */
public final class C85186c implements AbstractC85185b {

    /* renamed from: a */
    private final AbstractC1533j f190610a;

    /* renamed from: b */
    private final AbstractC1511c f190611b;

    /* renamed from: c */
    private final AbstractC1542n f190612c;

    static {
        Covode.recordClassIndex(99232);
    }

    public C85186c(AbstractC1533j jVar) {
        this.f190610a = jVar;
        this.f190611b = new AbstractC1511c<C85184a>(jVar) {
            /* class com.p2082ss.android.ugc.trill.share.data.C85186c.C851871 */

            static {
                Covode.recordClassIndex(99233);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "INSERT OR ABORT INTO `Record`(`rid`,`time`,`channel`,`share_type`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.j.a.f, java.lang.Object] */
            @Override // androidx.room.AbstractC1511c
            /* renamed from: a */
            public final /* synthetic */ void mo5057a(AbstractC1069f fVar, C85184a aVar) {
                C85184a aVar2 = aVar;
                fVar.mo3805a(1, (long) aVar2.f190606a);
                if (aVar2.f190607b == null) {
                    fVar.mo3803a(2);
                } else {
                    fVar.mo3805a(2, aVar2.f190607b.longValue());
                }
                if (aVar2.f190608c == null) {
                    fVar.mo3803a(3);
                } else {
                    fVar.mo3806a(3, aVar2.f190608c);
                }
                if (aVar2.f190609d == null) {
                    fVar.mo3803a(4);
                } else {
                    fVar.mo3805a(4, (long) aVar2.f190609d.intValue());
                }
            }
        };
        this.f190612c = new AbstractC1542n(jVar) {
            /* class com.p2082ss.android.ugc.trill.share.data.C85186c.C851882 */

            static {
                Covode.recordClassIndex(99234);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "DELETE FROM record WHERE rid = ?";
            }
        };
    }

    @Override // com.p2082ss.android.ugc.trill.share.data.AbstractC85185b
    /* renamed from: a */
    public final void mo130110a(C85184a aVar) {
        this.f190610a.mo5090d();
        this.f190610a.mo5091e();
        try {
            this.f190611b.mo5059a(aVar);
            this.f190610a.mo5093g();
        } finally {
            this.f190610a.mo5092f();
        }
    }

    @Override // com.p2082ss.android.ugc.trill.share.data.AbstractC85185b
    /* renamed from: b */
    public final void mo130111b(Integer num) {
        this.f190610a.mo5090d();
        AbstractC1069f b = this.f190612c.mo5109b();
        if (num == null) {
            b.mo3803a(1);
        } else {
            b.mo3805a(1, (long) num.intValue());
        }
        this.f190610a.mo5091e();
        try {
            b.mo3809a();
            this.f190610a.mo5093g();
        } finally {
            this.f190610a.mo5092f();
            this.f190612c.mo5108a(b);
        }
    }

    @Override // com.p2082ss.android.ugc.trill.share.data.AbstractC85185b
    /* renamed from: c */
    public final long mo130112c(Integer num) {
        long j;
        C1541m a = C1541m.m5201a("SELECT count(*) FROM record WHERE share_type = ?", 1);
        if (num == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3805a(1, (long) num.intValue());
        }
        this.f190610a.mo5090d();
        Cursor a2 = this.f190610a.mo5082a(a);
        try {
            if (a2.moveToFirst()) {
                j = a2.getLong(0);
            } else {
                j = 0;
            }
            return j;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }

    @Override // com.p2082ss.android.ugc.trill.share.data.AbstractC85185b
    /* renamed from: a */
    public final List<C85184a> mo130108a(Integer num) {
        Long l;
        C1541m a = C1541m.m5201a("SELECT * FROM record where share_type = ? order by time desc limit 10", 1);
        if (num == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3805a(1, (long) num.intValue());
        }
        this.f190610a.mo5090d();
        Cursor a2 = this.f190610a.mo5082a(a);
        try {
            int a3 = C1503a.m5129a(a2, "rid");
            int a4 = C1503a.m5129a(a2, "time");
            int a5 = C1503a.m5129a(a2, "channel");
            int a6 = C1503a.m5129a(a2, "share_type");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C85184a aVar = new C85184a();
                aVar.f190606a = a2.getInt(a3);
                Integer num2 = null;
                if (a2.isNull(a4)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(a4));
                }
                aVar.f190607b = l;
                aVar.f190608c = a2.getString(a5);
                if (!a2.isNull(a6)) {
                    num2 = Integer.valueOf(a2.getInt(a6));
                }
                aVar.f190609d = num2;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }

    @Override // com.p2082ss.android.ugc.trill.share.data.AbstractC85185b
    /* renamed from: a */
    public final List<C85184a> mo130109a(Integer num, Integer num2) {
        Long l;
        C1541m a = C1541m.m5201a("SELECT * FROM record where share_type = ? order by time desc limit ?", 2);
        if (num == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3805a(1, (long) num.intValue());
        }
        if (num2 == null) {
            a.f5072e[2] = 1;
        } else {
            a.mo3805a(2, (long) num2.intValue());
        }
        this.f190610a.mo5090d();
        Cursor a2 = this.f190610a.mo5082a(a);
        try {
            int a3 = C1503a.m5129a(a2, "rid");
            int a4 = C1503a.m5129a(a2, "time");
            int a5 = C1503a.m5129a(a2, "channel");
            int a6 = C1503a.m5129a(a2, "share_type");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C85184a aVar = new C85184a();
                aVar.f190606a = a2.getInt(a3);
                Integer num3 = null;
                if (a2.isNull(a4)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(a4));
                }
                aVar.f190607b = l;
                aVar.f190608c = a2.getString(a5);
                if (!a2.isNull(a6)) {
                    num3 = Integer.valueOf(a2.getInt(a6));
                }
                aVar.f190609d = num3;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }
}
