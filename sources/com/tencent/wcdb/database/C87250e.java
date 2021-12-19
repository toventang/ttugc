package com.tencent.wcdb.database;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.AbstractC87234b;
import com.tencent.wcdb.AbstractC87236d;
import com.tencent.wcdb.C87266h;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.C87272a;
import com.tencent.wcdb.support.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.wcdb.database.e */
public final class C87250e extends AbstractC87234b {

    /* renamed from: j */
    public static final SQLiteDatabase.AbstractC87242a f197699j = new SQLiteDatabase.AbstractC87242a() {
        /* class com.tencent.wcdb.database.C87250e.C872511 */

        static {
            Covode.recordClassIndex(103140);
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.AbstractC87242a
        /* renamed from: a */
        public final AbstractC87236d mo141224a(AbstractC87252f fVar, String str, AbstractC87256j jVar) {
            return new C87250e(fVar, str, (C87257k) jVar);
        }

        @Override // com.tencent.wcdb.database.SQLiteDatabase.AbstractC87242a
        /* renamed from: a */
        public final AbstractC87256j mo141225a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C87272a aVar) {
            return new C87257k(sQLiteDatabase, str, objArr, aVar);
        }
    };

    /* renamed from: k */
    private final String f197700k;

    /* renamed from: l */
    private final String[] f197701l;

    /* renamed from: m */
    private final C87257k f197702m;

    /* renamed from: n */
    private final AbstractC87252f f197703n;

    /* renamed from: o */
    private int f197704o = -1;

    /* renamed from: p */
    private int f197705p;

    /* renamed from: q */
    private Map<String, Integer> f197706q;

    /* renamed from: r */
    private final Throwable f197707r;

    @Override // com.tencent.wcdb.AbstractC87232a
    public final void deactivate() {
        super.deactivate();
    }

    @Override // com.tencent.wcdb.AbstractC87232a
    public final String[] getColumnNames() {
        return this.f197701l;
    }

    static {
        Covode.recordClassIndex(103139);
    }

    @Override // java.lang.Object, com.tencent.wcdb.AbstractC87232a
    public final void finalize() {
        try {
            if (this.f197599i != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.tencent.wcdb.AbstractC87236d, com.tencent.wcdb.AbstractC87232a
    public final int getCount() {
        if (this.f197704o == -1) {
            m151394b(0);
        }
        return this.f197704o;
    }

    @Override // java.io.Closeable, com.tencent.wcdb.AbstractC87236d, java.lang.AutoCloseable, com.tencent.wcdb.AbstractC87232a
    public final void close() {
        MethodCollector.m26663i(5389);
        super.close();
        synchronized (this) {
            try {
                this.f197702m.close();
            } finally {
                MethodCollector.m26664o(5389);
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractC87232a
    public final boolean requery() {
        MethodCollector.m26663i(5509);
        if (isClosed()) {
            MethodCollector.m26664o(5509);
            return false;
        }
        synchronized (this) {
            try {
                if (!((AbstractC87256j) this.f197702m).f197740a.mo141215m()) {
                    return false;
                }
                if (this.f197599i != null) {
                    this.f197599i.mo141104a();
                }
                this.f197586b = -1;
                this.f197704o = -1;
                try {
                    boolean requery = super.requery();
                    MethodCollector.m26664o(5509);
                    return requery;
                } catch (IllegalStateException e) {
                    Log.m151457a(5, "WCDB.SQLiteCursor", C1764a.m5928a("requery() failed " + e.getMessage(), new Object[]{e}));
                    MethodCollector.m26664o(5509);
                    return false;
                }
            } finally {
                MethodCollector.m26664o(5509);
            }
        }
    }

    @Override // com.tencent.wcdb.AbstractC87232a
    /* renamed from: a */
    public final boolean mo141118a(int i) {
        if (this.f197599i != null && i >= this.f197599i.f197583b && i < this.f197599i.f197583b + this.f197599i.mo141105b()) {
            return true;
        }
        m151394b(i);
        return true;
    }

    /* renamed from: b */
    private void m151394b(int i) {
        mo141159a(((AbstractC87256j) this.f197702m).f197740a.mo141216n());
        try {
            if (this.f197704o == -1) {
                this.f197704o = this.f197702m.mo141251a(this.f197599i, C87266h.m151442a(i, 0), i, true);
                this.f197705p = this.f197599i.mo141105b();
                return;
            }
            this.f197702m.mo141251a(this.f197599i, C87266h.m151442a(i, this.f197705p), i, false);
        } catch (RuntimeException e) {
            mo141160c();
            throw e;
        }
    }

    @Override // com.tencent.wcdb.AbstractC87236d, com.tencent.wcdb.AbstractC87232a
    public final int getColumnIndex(String str) {
        if (this.f197706q == null) {
            String[] strArr = this.f197701l;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.f197706q = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            Log.m151458a("WCDB.SQLiteCursor", "requesting column name with table name -- ".concat(String.valueOf(str)), exc);
            str = str.substring(lastIndexOf + 1);
        }
        Integer num = this.f197706q.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public C87250e(AbstractC87252f fVar, String str, C87257k kVar) {
        if (kVar != null) {
            this.f197707r = null;
            this.f197703n = fVar;
            this.f197700k = str;
            this.f197706q = null;
            this.f197702m = kVar;
            String[] strArr = kVar.f197742c;
            this.f197701l = strArr;
            this.f197587c = C87266h.m151443a(strArr);
            return;
        }
        throw new IllegalArgumentException("query object cannot be null");
    }
}
