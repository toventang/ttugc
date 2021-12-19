package com.p2082ss.android.ugc.aweme.runtime.behavior;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.room.AbstractC1511c;
import androidx.room.AbstractC1533j;
import androidx.room.AbstractC1542n;
import androidx.room.C1541m;
import androidx.room.p069b.C1503a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.runtime.behavior.b */
public final class C67208b implements AbstractC67207a {

    /* renamed from: a */
    private final AbstractC1533j f150629a;

    /* renamed from: b */
    private final AbstractC1511c f150630b;

    /* renamed from: c */
    private final AbstractC1542n f150631c;

    /* renamed from: d */
    private final AbstractC1542n f150632d;

    static {
        Covode.recordClassIndex(78827);
    }

    public C67208b(AbstractC1533j jVar) {
        this.f150629a = jVar;
        this.f150630b = new AbstractC1511c<C67212c>(jVar) {
            /* class com.p2082ss.android.ugc.aweme.runtime.behavior.C67208b.C672091 */

            static {
                Covode.recordClassIndex(78828);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "INSERT OR ABORT INTO `runtimeBehaviorEntity`(`id`,`type`,`time`,`msg`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.j.a.f, java.lang.Object] */
            @Override // androidx.room.AbstractC1511c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo5057a(AbstractC1069f fVar, C67212c cVar) {
                C67212c cVar2 = cVar;
                fVar.mo3805a(1, (long) cVar2.f150636a);
                if (cVar2.f150637b == null) {
                    fVar.mo3803a(2);
                } else {
                    fVar.mo3806a(2, cVar2.f150637b);
                }
                fVar.mo3805a(3, cVar2.f150638c);
                if (cVar2.f150639d == null) {
                    fVar.mo3803a(4);
                } else {
                    fVar.mo3806a(4, cVar2.f150639d);
                }
            }
        };
        this.f150631c = new AbstractC1542n(jVar) {
            /* class com.p2082ss.android.ugc.aweme.runtime.behavior.C67208b.C672102 */

            static {
                Covode.recordClassIndex(78829);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "DELETE FROM runtimeBehaviorEntity where type = ? and time < ?";
            }
        };
        this.f150632d = new AbstractC1542n(jVar) {
            /* class com.p2082ss.android.ugc.aweme.runtime.behavior.C67208b.C672113 */

            static {
                Covode.recordClassIndex(78830);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "DELETE FROM runtimeBehaviorEntity";
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.runtime.behavior.AbstractC67207a
    /* renamed from: a */
    public final void mo106101a(C67212c cVar) {
        this.f150629a.mo5090d();
        this.f150629a.mo5091e();
        try {
            this.f150630b.mo5059a(cVar);
            this.f150629a.mo5093g();
        } finally {
            this.f150629a.mo5092f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.runtime.behavior.AbstractC67207a
    /* renamed from: b */
    public final void mo106102b(String str, long j) {
        this.f150629a.mo5090d();
        AbstractC1069f b = this.f150631c.mo5109b();
        if (str == null) {
            b.mo3803a(1);
        } else {
            b.mo3806a(1, str);
        }
        b.mo3805a(2, j);
        this.f150629a.mo5091e();
        try {
            b.mo3809a();
            this.f150629a.mo5093g();
        } finally {
            this.f150629a.mo5092f();
            this.f150631c.mo5108a(b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.runtime.behavior.AbstractC67207a
    /* renamed from: a */
    public final List<C67212c> mo106100a(String str, long j) {
        C1541m a = C1541m.m5201a("SELECT * FROM runtimeBehaviorEntity where type = ?  and time > ?", 2);
        if (str == null) {
            a.f5072e[1] = 1;
        } else {
            a.mo3806a(1, str);
        }
        a.mo3805a(2, j);
        this.f150629a.mo5090d();
        Cursor a2 = this.f150629a.mo5082a(a);
        try {
            int a3 = C1503a.m5129a(a2, "id");
            int a4 = C1503a.m5129a(a2, StringSet.type);
            int a5 = C1503a.m5129a(a2, "time");
            int a6 = C1503a.m5129a(a2, "msg");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C67212c cVar = new C67212c();
                cVar.f150636a = a2.getInt(a3);
                String string = a2.getString(a4);
                C89219l.m154721d(string, "");
                cVar.f150637b = string;
                cVar.f150638c = a2.getLong(a5);
                String string2 = a2.getString(a6);
                C89219l.m154721d(string2, "");
                cVar.f150639d = string2;
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }
}
