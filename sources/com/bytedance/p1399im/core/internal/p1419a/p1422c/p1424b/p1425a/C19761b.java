package com.bytedance.p1399im.core.internal.p1419a.p1422c.p1424b.p1425a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c;

/* renamed from: com.bytedance.im.core.internal.a.c.b.a.b */
public final class C19761b implements AbstractC19759b {

    /* renamed from: a */
    public SQLiteDatabase f46946a = null;

    static {
        Covode.recordClassIndex(22605);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final boolean mo31715a() {
        return this.f46946a.inTransaction();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: c */
    public final void mo31720c() {
        this.f46946a.setTransactionSuccessful();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: b */
    public final void mo31718b() {
        MethodCollector.m26663i(10581);
        this.f46946a.beginTransaction();
        MethodCollector.m26664o(10581);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: d */
    public final void mo31721d() {
        MethodCollector.m26663i(10721);
        this.f46946a.endTransaction();
        MethodCollector.m26664o(10721);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: e */
    public final void mo31722e() {
        MethodCollector.m26663i(11301);
        this.f46946a.beginTransactionNonExclusive();
        MethodCollector.m26664o(11301);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: b */
    public final AbstractC19766c mo31717b(String str) {
        MethodCollector.m26663i(11009);
        C19762c cVar = new C19762c(this.f46946a.compileStatement(str));
        MethodCollector.m26664o(11009);
        return cVar;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final void mo31714a(String str) {
        MethodCollector.m26663i(10722);
        this.f46946a.execSQL(str);
        MethodCollector.m26664o(10722);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: c */
    public final long mo31719c(String str, ContentValues contentValues) {
        MethodCollector.m26663i(11302);
        long replace = this.f46946a.replace(str, null, contentValues);
        MethodCollector.m26664o(11302);
        return replace;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: b */
    public final long mo31716b(String str, ContentValues contentValues) {
        MethodCollector.m26663i(10875);
        long insertWithOnConflict = this.f46946a.insertWithOnConflict(str, null, contentValues, 5);
        MethodCollector.m26664o(10875);
        return insertWithOnConflict;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final long mo31712a(String str, ContentValues contentValues) {
        MethodCollector.m26663i(10725);
        long insert = this.f46946a.insert(str, null, contentValues);
        MethodCollector.m26664o(10725);
        return insert;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final AbstractC19751a mo31713a(String str, String[] strArr) {
        MethodCollector.m26663i(11157);
        C19760a aVar = new C19760a(this.f46946a.rawQuery(str, strArr));
        MethodCollector.m26664o(11157);
        return aVar;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final int mo31711a(String str, String str2, String[] strArr) {
        MethodCollector.m26663i(10723);
        int delete = this.f46946a.delete(str, str2, strArr);
        MethodCollector.m26664o(10723);
        return delete;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b
    /* renamed from: a */
    public final int mo31710a(String str, ContentValues contentValues, String str2, String[] strArr) {
        MethodCollector.m26663i(10724);
        int update = this.f46946a.update(str, contentValues, str2, strArr);
        MethodCollector.m26664o(10724);
        return update;
    }
}
