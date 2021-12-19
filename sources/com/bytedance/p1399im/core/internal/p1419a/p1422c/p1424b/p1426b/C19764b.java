package com.bytedance.p1399im.core.internal.p1419a.p1422c.p1424b.p1426b;

import android.content.ContentValues;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.tencent.wcdb.database.SQLiteDatabase;

/* renamed from: com.bytedance.im.core.internal.a.c.b.b.b */
public final class C19764b implements AbstractC19759b {

    /* renamed from: a */
    public SQLiteDatabase f46949a = null;

    static {
        Covode.recordClassIndex(22608);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: b */
    public final void mo31718b() {
        this.f46949a.mo141206b(true);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: d */
    public final void mo31721d() {
        this.f46949a.mo141209g();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: e */
    public final void mo31722e() {
        this.f46949a.mo141206b(false);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: c */
    public final void mo31720c() {
        this.f46949a.mo141210h();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final boolean mo31715a() {
        return this.f46949a.mo141211i();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: b */
    public final AbstractC19766c mo31717b(String str) {
        return new C19765c(this.f46949a.mo141200a(str));
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final void mo31714a(String str) {
        C20002j.m37782c("imsdkdb".concat(String.valueOf(str)));
        this.f46949a.mo141203b(str);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: c */
    public final long mo31719c(String str, ContentValues contentValues) {
        return this.f46949a.mo141204b(str, (String) null, contentValues);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: b */
    public final long mo31716b(String str, ContentValues contentValues) {
        return this.f46949a.mo141197a(str, (String) null, contentValues, 5);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final long mo31712a(String str, ContentValues contentValues) {
        return this.f46949a.mo141196a(str, (String) null, contentValues);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final AbstractC19751a mo31713a(String str, String[] strArr) {
        C20002j.m37782c("imsdkdb".concat(String.valueOf(str)));
        return new C19763a(this.f46949a.mo141199a(str, strArr));
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final int mo31711a(String str, String str2, String[] strArr) {
        return this.f46949a.mo141195a(str, str2, strArr);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final int mo31710a(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.f46949a.mo141194a(str, contentValues, str2, strArr);
    }
}
