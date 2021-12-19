package com.bytedance.p1399im.core.internal.p1419a.p1420a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1415g.C19699c;

/* renamed from: com.bytedance.im.core.internal.a.a.b */
public final class C19742b {
    static {
        Covode.recordClassIndex(22586);
    }

    /* renamed from: a */
    public static boolean m36977a(String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C19699c.m36829a().mo31655b();
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        if (c == null) {
            C19699c.m36829a().mo31652a("delete", 0, (Throwable) null);
            return false;
        }
        try {
            int a = c.mo31711a(str, str2, strArr);
            C19699c.m36829a();
            C19699c.m36831a("delete");
            if (a > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMDBProxy delete, table:" + str + ", whereClause:" + str2, e);
            C19510e.m36439a(e);
            C19699c.m36829a().mo31652a("delete", 1, e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m36976a() {
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        if (c == null || !c.mo31715a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m36979b(String str) {
        C19699c.m36829a().mo31655b();
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        boolean z = false;
        if (c == null) {
            C19699c.m36829a().mo31652a("execSQL", 0, (Throwable) null);
            return false;
        }
        try {
            c.mo31714a(str);
            C19699c.m36829a();
            C19699c.m36831a("execSQL");
            z = true;
            return true;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMDBProxy execSQL:".concat(String.valueOf(str)), e);
            C19510e.m36439a(e);
            C19699c.m36829a().mo31652a("execSQL", 1, e);
            return z;
        }
    }

    /* renamed from: c */
    public static AbstractC19766c m36981c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C19699c.m36829a().mo31655b();
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        if (c == null) {
            C19699c.m36829a().mo31652a("compile_statement", 0, (Throwable) null);
            return null;
        }
        try {
            AbstractC19766c b = c.mo31717b(str);
            C19699c.m36829a();
            C19699c.m36831a("compile_statement");
            return b;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMDBProxy compileStatement:".concat(String.valueOf(str)), e);
            C19510e.m36439a(e);
            C19699c.m36829a().mo31652a("compile_statement", 1, e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m36974a(String str) {
        C19699c.m36829a().mo31655b();
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        if (c == null) {
            C19512f.m36457b("imsdk", "IMDBProxy " + str + " startTransaction failed, db = null", (Throwable) null);
            C19699c.m36829a().mo31652a("startTransaction", 0, (Throwable) null);
        } else if (C19483d.m36365a().mo31141b().f46220aB || !c.mo31715a()) {
            try {
                if (C19483d.m36365a().mo31141b().f46243ah) {
                    c.mo31722e();
                } else {
                    c.mo31718b();
                }
                C19699c.m36829a();
                C19699c.m36831a("startTransaction");
                C19512f.m36457b("imsdk", "IMDBProxy " + str + " startTransaction successfully", (Throwable) null);
            } catch (Exception e) {
                C19512f.m36457b("imsdk", "IMDBProxy " + str + " startTransaction failed", e);
                C19510e.m36439a(e);
                C19699c.m36829a().mo31652a("startTransaction", 1, e);
            }
        } else {
            C19512f.m36457b("imsdk", "IMDBProxy " + str + " startTransaction, already inTransaction, current tid=" + Thread.currentThread(), new RuntimeException());
        }
    }

    /* renamed from: b */
    public static long m36978b(String str, ContentValues contentValues) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C19699c.m36829a().mo31655b();
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        if (c == null) {
            C19699c.m36829a().mo31652a("insertOrReplace", 0, (Throwable) null);
            return -1;
        }
        try {
            long b = c.mo31716b(str, contentValues);
            C19512f.m36457b("imsdk", "CreateConversationHandler insertOrReplace id = " + b + " table = " + str, (Throwable) null);
            C19699c.m36829a();
            C19699c.m36831a("insert");
            return b;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMDBProxy insertOrReplace, table:" + str + ", nullColumnHack:" + ((String) null), e);
            C19510e.m36439a(e);
            C19699c.m36829a().mo31652a("insertOrReplace", 1, e);
            return -1;
        }
    }

    /* renamed from: c */
    public static long m36980c(String str, ContentValues contentValues) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C19699c.m36829a().mo31655b();
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        if (c == null) {
            C19699c.m36829a().mo31652a("replace", 0, (Throwable) null);
            return -1;
        }
        try {
            long c2 = c.mo31719c(str, contentValues);
            C19699c.m36829a();
            C19699c.m36831a("replace");
            return c2;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMDBProxy replace, table:" + str + ", nullColumnHack:" + ((String) null), e);
            C19510e.m36439a(e);
            C19699c.m36829a().mo31652a("replace", 1, e);
            return -1;
        }
    }

    /* renamed from: a */
    public static long m36972a(String str, ContentValues contentValues) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C19699c.m36829a().mo31655b();
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        if (c == null) {
            C19699c.m36829a().mo31652a("insert", 0, (Throwable) null);
            return -1;
        }
        try {
            long a = c.mo31712a(str, contentValues);
            C19699c.m36829a();
            C19699c.m36831a("insert");
            return a;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMDBProxy insert, table:" + str + ", nullColumnHack:" + ((String) null), e);
            C19510e.m36439a(e);
            C19699c.m36829a().mo31652a("insert", 1, e);
            return -1;
        }
    }

    /* renamed from: a */
    public static AbstractC19751a m36973a(String str, String[] strArr) {
        C19699c.m36829a().mo31655b();
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        AbstractC19751a aVar = null;
        if (c == null) {
            C19699c.m36829a().mo31652a("rawQuery", 0, (Throwable) null);
            return null;
        }
        try {
            aVar = c.mo31713a(str, strArr);
            C19699c.m36829a();
            C19699c.m36831a("rawQuery");
            return aVar;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMDBProxy rawQuery:".concat(String.valueOf(str)), e);
            C19510e.m36439a(e);
            C19699c.m36829a().mo31652a("rawQuery", 1, e);
            return aVar;
        }
    }

    /* renamed from: a */
    public static void m36975a(String str, boolean z) {
        C19699c.m36829a().mo31655b();
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        if (c == null) {
            C19512f.m36457b("imsdk", "IMDBProxy " + str + " endTransaction failed, db = null", (Throwable) null);
            C19699c.m36829a().mo31652a("endTransaction", 0, (Throwable) null);
        } else if (c.mo31715a()) {
            if (z) {
                try {
                    c.mo31720c();
                } catch (Exception e) {
                    C19512f.m36457b("imsdk", "IMDBProxy " + str + " endTransaction failed", e);
                    C19510e.m36439a(e);
                    C19699c.m36829a().mo31652a("endTransaction", 1, e);
                    return;
                }
            }
            c.mo31721d();
            C19512f.m36457b("imsdk", "IMDBProxy " + str + " endTransaction, successful:" + z, (Throwable) null);
            C19699c.m36829a();
            C19699c.m36831a("endTransaction");
        } else {
            C19512f.m36457b("imsdk", "IMDBProxy " + str + " endTransaction, no transaction, current tid=" + Thread.currentThread(), new RuntimeException());
        }
    }

    /* renamed from: a */
    public static int m36971a(String str, ContentValues contentValues, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C19699c.m36829a().mo31655b();
        AbstractC19759b c = C19741a.m36958a().mo31684c();
        if (c == null) {
            C19699c.m36829a().mo31652a("update", 0, (Throwable) null);
            return -1;
        }
        try {
            int a = c.mo31710a(str, contentValues, str2, strArr);
            C19699c.m36829a();
            C19699c.m36831a("update");
            return a;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMDBProxy update, table:" + str + ", whereClause:" + str2, e);
            C19510e.m36439a(e);
            C19699c.m36829a().mo31652a("update", 1, e);
            return -1;
        }
    }
}
