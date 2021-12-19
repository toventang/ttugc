package com.bytedance.sdk.p1625a.p1657l.p1660c;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.account.C29351f;

/* renamed from: com.bytedance.sdk.a.l.c.b */
public final class C22490b {

    /* renamed from: a */
    public SQLiteDatabase f53157a;

    /* renamed from: b */
    private C22489a f53158b;

    static {
        Covode.recordClassIndex(26306);
    }

    /* renamed from: com.bytedance.sdk.a.l.c.b$a */
    public static class C22491a {

        /* renamed from: a */
        public static final C22490b f53159a = new C22490b((byte) 0);

        static {
            Covode.recordClassIndex(26307);
        }
    }

    private C22490b() {
        this.f53158b = new C22489a(C29351f.m58781a().mo52210b());
        this.f53157a = null;
    }

    /* renamed from: a */
    public final boolean mo36778a() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f53157a;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                return true;
            }
            C22489a aVar = this.f53158b;
            if (aVar == null) {
                return false;
            }
            this.f53157a = aVar.getWritableDatabase();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* synthetic */ C22490b(byte b) {
        this();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bytedance.sdk.p1625a.p1657l.p1661d.C22494c> mo36777a(int r26, java.lang.Object r27) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.p1625a.p1657l.p1660c.C22490b.mo36777a(int, java.lang.Object):java.util.List");
    }
}
