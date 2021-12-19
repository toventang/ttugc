package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.AbstractC87236d;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.C87272a;

/* renamed from: com.tencent.wcdb.database.h */
public final class C87254h implements AbstractC87252f {

    /* renamed from: f */
    private static SQLiteDatabase.AbstractC87242a f197720f = C87250e.f197699j;

    /* renamed from: a */
    private final SQLiteDatabase f197721a;

    /* renamed from: b */
    private final String f197722b = null;

    /* renamed from: c */
    private final String f197723c;

    /* renamed from: d */
    private final C87272a f197724d;

    /* renamed from: e */
    private AbstractC87256j f197725e;

    static {
        Covode.recordClassIndex(103143);
    }

    public final String toString() {
        return "SQLiteDirectCursorDriver: " + this.f197723c;
    }

    public C87254h(SQLiteDatabase sQLiteDatabase, String str) {
        this.f197721a = sQLiteDatabase;
        this.f197723c = str;
        this.f197724d = null;
    }

    @Override // com.tencent.wcdb.database.AbstractC87252f
    /* renamed from: a */
    public final AbstractC87236d mo141240a(SQLiteDatabase.AbstractC87242a aVar, Object[] objArr) {
        if (aVar == null) {
            aVar = f197720f;
        }
        AbstractC87256j jVar = null;
        try {
            jVar = aVar.mo141225a(this.f197721a, this.f197723c, objArr, this.f197724d);
            AbstractC87236d a = aVar.mo141224a(this, this.f197722b, jVar);
            this.f197725e = jVar;
            return a;
        } catch (RuntimeException e) {
            if (jVar != null) {
                jVar.close();
            }
            throw e;
        }
    }
}
