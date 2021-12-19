package com.p2082ss.android.ugc.aweme.challenge.data;

import android.database.Cursor;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.room.AbstractC1502b;
import androidx.room.AbstractC1511c;
import androidx.room.AbstractC1533j;
import androidx.room.AbstractC1542n;
import androidx.room.C1541m;
import androidx.room.p069b.C1503a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.data.c */
public final class C35507c implements AbstractC35506b {

    /* renamed from: a */
    private final AbstractC1533j f83734a;

    /* renamed from: b */
    private final AbstractC1511c f83735b;

    /* renamed from: c */
    private final AbstractC1502b f83736c;

    /* renamed from: d */
    private final AbstractC1542n f83737d;

    static {
        Covode.recordClassIndex(42701);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.data.AbstractC35506b
    /* renamed from: a */
    public final List<C35514e> mo62410a() {
        Long l;
        C1541m a = C1541m.m5201a("SELECT * FROM localHashTag order by time desc", 0);
        this.f83734a.mo5090d();
        Cursor a2 = this.f83734a.mo5082a(a);
        try {
            int a3 = C1503a.m5129a(a2, StringSet.name);
            int a4 = C1503a.m5129a(a2, "time");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C35514e eVar = new C35514e();
                eVar.f83751a = a2.getString(a3);
                if (a2.isNull(a4)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(a4));
                }
                eVar.f83752b = l;
                arrayList.add(eVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo5106a();
        }
    }

    public C35507c(AbstractC1533j jVar) {
        this.f83734a = jVar;
        this.f83735b = new AbstractC1511c<C35514e>(jVar) {
            /* class com.p2082ss.android.ugc.aweme.challenge.data.C35507c.C355081 */

            static {
                Covode.recordClassIndex(42702);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "INSERT OR FAIL INTO `localHashTag`(`name`,`time`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.j.a.f, java.lang.Object] */
            @Override // androidx.room.AbstractC1511c
            /* renamed from: a */
            public final /* synthetic */ void mo5057a(AbstractC1069f fVar, C35514e eVar) {
                C35514e eVar2 = eVar;
                if (eVar2.f83751a == null) {
                    fVar.mo3803a(1);
                } else {
                    fVar.mo3806a(1, eVar2.f83751a);
                }
                if (eVar2.f83752b == null) {
                    fVar.mo3803a(2);
                } else {
                    fVar.mo3805a(2, eVar2.f83752b.longValue());
                }
            }
        };
        this.f83736c = new AbstractC1502b<C35514e>(jVar) {
            /* class com.p2082ss.android.ugc.aweme.challenge.data.C35507c.C355092 */

            static {
                Covode.recordClassIndex(42703);
            }

            @Override // androidx.room.AbstractC1542n, androidx.room.AbstractC1502b
            /* renamed from: a */
            public final String mo5043a() {
                return "UPDATE OR FAIL `localHashTag` SET `name` = ?,`time` = ? WHERE `name` = ?";
            }
        };
        this.f83737d = new AbstractC1542n(jVar) {
            /* class com.p2082ss.android.ugc.aweme.challenge.data.C35507c.C355103 */

            static {
                Covode.recordClassIndex(42704);
            }

            @Override // androidx.room.AbstractC1542n
            /* renamed from: a */
            public final String mo5043a() {
                return "DELETE FROM localHashTag WHERE time in(SELECT time FROM localHashTag ORDER BY time ASC LIMIT ?)";
            }
        };
    }
}
