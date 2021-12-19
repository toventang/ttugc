package com.p2082ss.android.socialbase.downloader.p2180c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30430v;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2179b.AbstractC30289c;
import com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.segment.C30607i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.c.e */
public class BinderC30305e extends AbstractC30301c.AbstractBinderC30302a implements AbstractC30430v {

    /* renamed from: a */
    public static volatile SQLiteDatabase f72280a;

    /* renamed from: b */
    public C30324g f72281b;

    /* renamed from: c */
    public C30324g f72282c;

    /* renamed from: d */
    public volatile boolean f72283d;

    /* renamed from: e */
    AbstractC30298b f72284e;

    /* renamed from: f */
    private C30324g f72285f;

    static {
        Covode.recordClassIndex(36817);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final void mo53772a(int i, List<DownloadChunk> list) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: b */
    public final List<DownloadInfo> mo53779b() {
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: b */
    public final List<DownloadInfo> mo53780b(String str) {
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: b */
    public final void mo53783b(DownloadInfo downloadInfo) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: c */
    public final List<DownloadInfo> mo53786c(String str) {
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: d */
    public final List<DownloadInfo> mo53789d(String str) {
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: e */
    public final boolean mo53793e() {
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: g */
    public final DownloadInfo mo53796g(int i) {
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30430v
    /* renamed from: a */
    public final void mo53805a(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<DownloadChunk>> sparseArray2, final AbstractC30304d dVar) {
        try {
            RunnableC303061 r1 = new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303061 */

                static {
                    Covode.recordClassIndex(36818);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:107:0x024a, code lost:
                    if (r0 == null) goto L_0x025d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:110:0x024f, code lost:
                    if (r0 == null) goto L_0x025d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:113:0x0254, code lost:
                    if (r0 == null) goto L_0x025d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:114:0x0256, code lost:
                    r0.mo53803a();
                    r19.f72289d.f72283d = true;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:115:0x025d, code lost:
                    r19.f72289d.mo53804a(r3, r4);
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(11819);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:116:0x0269, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a8, code lost:
                    if (r0 != null) goto L_0x0256;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 618
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303061.run():void");
                }
            };
            ExecutorService l = C30399c.m61728l();
            if (l != null) {
                l.execute(r1);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m61373a(List<DownloadInfo> list) {
        try {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                    C30535g.m62550a(downloadInfo);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x01a4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53806a(java.util.List<com.p2082ss.android.socialbase.downloader.model.DownloadInfo> r15, java.util.List<java.lang.Integer> r16, android.util.SparseArray<com.p2082ss.android.socialbase.downloader.model.DownloadInfo> r17, android.util.SparseArray<com.p2082ss.android.socialbase.downloader.model.DownloadInfo> r18, android.util.SparseArray<java.util.List<com.p2082ss.android.socialbase.downloader.model.DownloadChunk>> r19) {
        /*
        // Method dump skipped, instructions count: 438
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.mo53806a(java.util.List, java.util.List, android.util.SparseArray, android.util.SparseArray, android.util.SparseArray):void");
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final boolean mo53775a(int i) {
        try {
            return mo53777b(i) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final List<DownloadInfo> mo53767a(String str) {
        MethodCollector.m26663i(6527);
        mo53809f();
        ArrayList arrayList = new ArrayList();
        if (f72280a != null) {
            try {
                Cursor rawQuery = f72280a.rawQuery(C1764a.m5928a("SELECT * FROM %s WHERE %s = ?", new Object[]{"downloader", "url"}), new String[]{str});
                if (rawQuery.moveToNext()) {
                    arrayList.add(new DownloadInfo(rawQuery));
                }
                C30535g.m62556a(rawQuery);
            } catch (Throwable unused) {
                C30535g.m62556a(null);
            }
        }
        MethodCollector.m26664o(6527);
        return arrayList;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final void mo53774a(final DownloadChunk downloadChunk) {
        mo53809f();
        if (f72280a != null && this.f72282c != null) {
            C30399c.m61710b(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303125 */

                static {
                    Covode.recordClassIndex(36824);
                }

                public final void run() {
                    try {
                        BinderC30305e.m61371a(downloadChunk, BinderC30305e.this.f72282c.mo53833a());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final void mo53771a(final int i, final int i2, final long j) {
        mo53809f();
        if (i != 0 && i2 >= 0 && j >= 0 && f72280a != null && this.f72282c != null) {
            C30399c.m61710b(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303136 */

                static {
                    Covode.recordClassIndex(36825);
                }

                public final void run() {
                    try {
                        BinderC30305e.m61368a(i, i2, j, BinderC30305e.this.f72282c.mo53835c());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final void mo53770a(final int i, final int i2, final int i3, final long j) {
        mo53809f();
        if (i != 0 && i2 >= 0 && i3 >= 0 && j >= 0 && f72280a != null && this.f72282c != null) {
            C30399c.m61710b(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303147 */

                static {
                    Covode.recordClassIndex(36826);
                }

                public final void run() {
                    try {
                        BinderC30305e.m61367a(i, i2, i3, j, BinderC30305e.this.f72282c.mo53835c());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final void mo53769a(final int i, final int i2, final int i3, final int i4) {
        mo53809f();
        if (i != 0 && i3 >= 0 && i4 != i2 && i4 >= 0 && f72280a != null && this.f72282c != null) {
            C30399c.m61710b(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303158 */

                static {
                    Covode.recordClassIndex(36827);
                }

                public final void run() {
                    try {
                        BinderC30305e.m61366a(i, i2, i3, i4, BinderC30305e.this.f72282c.mo53835c());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.socialbase.downloader.model.DownloadInfo mo53764a(int r10, int r11) {
        /*
            r9 = this;
            r8 = 7132(0x1bdc, float:9.994E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r8)
            r9.mo53809f()
            android.database.sqlite.SQLiteDatabase r0 = com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.f72280a
            r7 = 0
            if (r0 != 0) goto L_0x0011
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
            return r7
        L_0x0011:
            r2 = 10
        L_0x0013:
            android.database.sqlite.SQLiteDatabase r0 = com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.f72280a     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.isDbLockedByCurrentThread()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0025
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0025
            r0 = 5
            java.lang.Thread.sleep(r0)     // Catch:{ all -> 0x0013 }
            goto L_0x0013
        L_0x0025:
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r1 = "chunkCount"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r6.put(r1, r0)
            android.database.sqlite.SQLiteDatabase r5 = com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.f72280a
            java.lang.String r4 = "downloader"
            java.lang.String r3 = "_id = ? "
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = java.lang.Integer.toString(r10)
            r2[r1] = r0
            r5.update(r4, r6, r3, r2)
        L_0x0046:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.mo53764a(int, int):com.ss.android.socialbase.downloader.model.DownloadInfo");
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final boolean mo53776a(final DownloadInfo downloadInfo) {
        mo53809f();
        if (downloadInfo == null || f72280a == null) {
            return false;
        }
        C30399c.m61710b(new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC3030710 */

            static {
                Covode.recordClassIndex(36819);
            }

            public final void run() {
                BinderC30305e.this.mo53808c(downloadInfo);
            }
        });
        return true;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final DownloadInfo mo53766a(int i, long j, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 3);
        contentValues.put("totalBytes", Long.valueOf(j));
        contentValues.put("eTag", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put(StringSet.name, str2);
        }
        m61369a(i, contentValues);
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final DownloadInfo mo53765a(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 4);
        contentValues.put("curBytes", Long.valueOf(j));
        m61369a(i, contentValues);
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final boolean mo53807a(int i, Map<Long, C30607i> map) {
        MethodCollector.m26663i(8054);
        long currentTimeMillis = System.currentTimeMillis();
        mo53809f();
        if (f72280a == null) {
            MethodCollector.m26664o(8054);
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Long l : map.keySet()) {
                C30607i iVar = map.get(Long.valueOf(l.longValue()));
                JSONObject jSONObject = iVar.f73074g;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    iVar.f73074g = jSONObject;
                }
                jSONObject.put("st", iVar.f73068a);
                jSONObject.put("cu", iVar.mo54841c());
                jSONObject.put("en", iVar.f73070c);
                jSONArray.put(jSONObject);
            }
        } catch (Throwable unused) {
        }
        SQLiteStatement d = this.f72285f.mo53836d();
        synchronized (d) {
            try {
                d.clearBindings();
                d.bindLong(1, (long) i);
                d.bindString(2, jSONArray.toString());
                d.execute();
            } catch (Throwable th) {
                MethodCollector.m26664o(8054);
                throw th;
            }
        }
        C30434a.m62027b("SqlDownloadCache", "updateSegments cost=" + (System.currentTimeMillis() - currentTimeMillis));
        MethodCollector.m26664o(8054);
        return false;
    }

    /* renamed from: a */
    public final void mo53804a(SparseArray<DownloadInfo> sparseArray, SparseArray<List<DownloadChunk>> sparseArray2) {
        try {
            HashMap a = C30535g.m62545a(sparseArray);
            HashMap a2 = C30535g.m62545a(sparseArray2);
            AbstractC30298b bVar = this.f72284e;
            if (bVar != null) {
                bVar.mo53760a(a, a2);
            }
        } catch (Throwable unused) {
        }
    }

    public BinderC30305e() {
        this((byte) 0);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: d */
    public final boolean mo53791d() {
        return this.f72283d;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final void mo53768a() {
        mo53805a(new SparseArray<>(), new SparseArray<>(), (AbstractC30304d) null);
    }

    /* renamed from: h */
    private static void m61376h() {
        MethodCollector.m26663i(7276);
        try {
            if (f72280a != null && f72280a.inTransaction()) {
                f72280a.endTransaction();
            }
            MethodCollector.m26664o(7276);
        } catch (Throwable unused) {
            MethodCollector.m26664o(7276);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: c */
    public final void mo53787c() {
        mo53809f();
        if (f72280a != null) {
            C30399c.m61710b(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303092 */

                static {
                    Covode.recordClassIndex(36821);
                }

                public final void run() {
                    BinderC30305e.this.mo53810g();
                }
            });
        }
    }

    /* renamed from: g */
    public final synchronized void mo53810g() {
        MethodCollector.m26663i(7419);
        try {
            f72280a.beginTransaction();
            f72280a.delete("downloader", null, null);
            f72280a.delete("downloadChunk", null, null);
            f72280a.setTransactionSuccessful();
            m61376h();
            MethodCollector.m26664o(7419);
        } catch (Throwable unused) {
            m61376h();
            MethodCollector.m26664o(7419);
        }
    }

    /* renamed from: f */
    public final void mo53809f() {
        MethodCollector.m26663i(6220);
        if (f72280a == null) {
            synchronized (BinderC30305e.class) {
                try {
                    if (f72280a == null) {
                        try {
                            f72280a = C30297a.m61290a().getWritableDatabase();
                            this.f72281b = new C30324g(f72280a, "downloader", AbstractC30289c.f72254a, AbstractC30289c.f72255b);
                            this.f72282c = new C30324g(f72280a, "downloadChunk", AbstractC30289c.f72256c, AbstractC30289c.f72257d);
                            this.f72285f = new C30324g(f72280a, "segments", AbstractC30289c.f72258e, AbstractC30289c.f72259f);
                        } catch (Throwable unused) {
                        }
                    }
                } finally {
                    MethodCollector.m26664o(6220);
                }
            }
            return;
        }
        MethodCollector.m26664o(6220);
    }

    private BinderC30305e(byte b) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: a */
    public final void mo53773a(AbstractC30298b bVar) {
        this.f72284e = bVar;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: b */
    public final void mo53782b(DownloadChunk downloadChunk) {
        mo53774a(downloadChunk);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: f */
    public final boolean mo53795f(final int i) {
        C30399c.m61710b(new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC3030811 */

            static {
                Covode.recordClassIndex(36820);
            }

            public final void run() {
                BinderC30305e.this.mo53794e(i);
                BinderC30305e.this.mo53790d(i);
                BinderC30305e.this.mo53812l(i);
            }
        });
        return true;
    }

    /* renamed from: d */
    private void m61375d(final DownloadInfo downloadInfo) {
        mo53809f();
        if (f72280a != null && this.f72281b != null) {
            C30399c.m61710b(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303169 */

                static {
                    Covode.recordClassIndex(36828);
                }

                public final void run() {
                    try {
                        BinderC30305e.m61372a(downloadInfo, BinderC30305e.this.f72281b.mo53833a());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: i */
    public final DownloadInfo mo53798i(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 1);
        m61369a(i, contentValues);
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: j */
    public final DownloadInfo mo53799j(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) -7);
        m61369a(i, contentValues);
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: l */
    public final void mo53812l(int i) {
        mo53809f();
        if (f72280a != null) {
            try {
                m61370a(i, this.f72285f.mo53834b());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: m */
    public final /* synthetic */ List mo53813m(int i) {
        Map<Long, C30607i> k = mo53811k(i);
        if (k == null || k.isEmpty()) {
            return null;
        }
        return new ArrayList(k.values());
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: e */
    public final boolean mo53794e(int i) {
        C30324g gVar;
        mo53809f();
        if (!(f72280a == null || (gVar = this.f72281b) == null)) {
            try {
                m61370a(i, gVar.mo53834b());
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: h */
    public final DownloadInfo mo53797h(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 5);
        contentValues.put("isFirstDownload", (Integer) 0);
        m61369a(i, contentValues);
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: b */
    public final DownloadInfo mo53777b(int i) {
        Cursor cursor;
        MethodCollector.m26663i(6387);
        mo53809f();
        if (f72280a != null) {
            try {
                cursor = f72280a.rawQuery(C1764a.m5928a("SELECT * FROM %s WHERE %s = ?", new Object[]{"downloader", "_id"}), new String[]{Integer.toString(i)});
                try {
                    if (cursor.moveToNext()) {
                        DownloadInfo downloadInfo = new DownloadInfo(cursor);
                        C30535g.m62556a(cursor);
                        MethodCollector.m26664o(6387);
                        return downloadInfo;
                    }
                    C30535g.m62556a(cursor);
                } catch (Throwable unused) {
                    C30535g.m62556a(cursor);
                    MethodCollector.m26664o(6387);
                    return null;
                }
            } catch (Throwable unused2) {
                cursor = null;
                C30535g.m62556a(cursor);
                MethodCollector.m26664o(6387);
                return null;
            }
        }
        MethodCollector.m26664o(6387);
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: c */
    public final List<DownloadChunk> mo53785c(int i) {
        MethodCollector.m26663i(6529);
        ArrayList arrayList = new ArrayList();
        mo53809f();
        if (f72280a != null) {
            try {
                Cursor rawQuery = f72280a.rawQuery(C1764a.m5928a("SELECT * FROM %s WHERE %s = ?", new Object[]{"downloadChunk", "_id"}), new String[]{Integer.toString(i)});
                while (rawQuery.moveToNext()) {
                    arrayList.add(new DownloadChunk(rawQuery));
                }
                C30535g.m62556a(rawQuery);
            } catch (Throwable unused) {
                C30535g.m62556a(null);
            }
        }
        MethodCollector.m26664o(6529);
        return arrayList;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: d */
    public final void mo53790d(final int i) {
        mo53809f();
        if (f72280a != null && this.f72282c != null) {
            C30399c.m61710b(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303114 */

                static {
                    Covode.recordClassIndex(36823);
                }

                public final void run() {
                    try {
                        BinderC30305e.m61370a(i, BinderC30305e.this.f72282c.mo53834b());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final synchronized void mo53808c(DownloadInfo downloadInfo) {
        MethodCollector.m26663i(7274);
        if (downloadInfo == null) {
            MethodCollector.m26664o(7274);
            return;
        }
        try {
            if (!mo53775a(downloadInfo.getId())) {
                m61375d(downloadInfo);
                MethodCollector.m26664o(7274);
                return;
            }
            C30324g gVar = this.f72281b;
            if (gVar == null) {
                MethodCollector.m26664o(7274);
                return;
            }
            try {
                m61374b(downloadInfo, gVar.mo53835c());
                MethodCollector.m26664o(7274);
            } catch (Throwable unused) {
                MethodCollector.m26664o(7274);
            }
        } catch (Throwable unused2) {
            MethodCollector.m26664o(7274);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: k */
    public final Map<Long, C30607i> mo53811k(int i) {
        Cursor cursor;
        MethodCollector.m26663i(7905);
        mo53809f();
        if (f72280a != null) {
            try {
                cursor = f72280a.rawQuery(C1764a.m5928a("SELECT * FROM %s WHERE %s = ?", new Object[]{"segments", "_id"}), new String[]{Integer.toString(i)});
                try {
                    if (cursor.moveToNext()) {
                        int columnIndex = cursor.getColumnIndex("info");
                        String string = columnIndex >= 0 ? cursor.getString(columnIndex) : null;
                        HashMap hashMap = new HashMap();
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            C30607i iVar = new C30607i(jSONArray.getJSONObject(i2));
                            hashMap.put(Long.valueOf(iVar.f73068a), iVar);
                        }
                        C30535g.m62556a(cursor);
                        MethodCollector.m26664o(7905);
                        return hashMap;
                    }
                    C30535g.m62556a(cursor);
                } catch (Throwable unused) {
                    C30535g.m62556a(cursor);
                    MethodCollector.m26664o(7905);
                    return null;
                }
            } catch (Throwable unused2) {
                cursor = null;
                C30535g.m62556a(cursor);
                MethodCollector.m26664o(7905);
                return null;
            }
        }
        MethodCollector.m26664o(7905);
        return null;
    }

    /* renamed from: a */
    private void m61369a(final int i, final ContentValues contentValues) {
        mo53809f();
        if (f72280a != null) {
            C30399c.m61710b(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303103 */

                static {
                    Covode.recordClassIndex(36822);
                }

                /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|20|19|2|1) */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8440);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
                    return;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x000b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r9 = this;
                        r8 = 8440(0x20f8, float:1.1827E-41)
                        com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r8)
                        int r7 = r2
                        android.content.ContentValues r6 = r3
                        r2 = 10
                    L_0x000b:
                        android.database.sqlite.SQLiteDatabase r0 = com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.f72280a     // Catch:{ all -> 0x0038 }
                        boolean r0 = r0.isDbLockedByCurrentThread()     // Catch:{ all -> 0x0038 }
                        if (r0 == 0) goto L_0x001d
                        int r2 = r2 + -1
                        if (r2 < 0) goto L_0x001d
                        r0 = 5
                        java.lang.Thread.sleep(r0)     // Catch:{ all -> 0x000b }
                        goto L_0x000b
                    L_0x001d:
                        android.database.sqlite.SQLiteDatabase r5 = com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.f72280a     // Catch:{ all -> 0x0034 }
                        java.lang.String r4 = "downloader"
                        java.lang.String r3 = "_id = ? "
                        r0 = 1
                        java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0034 }
                        r1 = 0
                        java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0034 }
                        r2[r1] = r0     // Catch:{ all -> 0x0034 }
                        r5.update(r4, r6, r3, r2)     // Catch:{ all -> 0x0034 }
                        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
                        return
                    L_0x0034:
                        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
                        return
                    L_0x0038:
                        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e.RunnableC303103.run():void");
                }
            });
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: e */
    public final DownloadInfo mo53792e(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) -4);
        contentValues.put("curBytes", Long.valueOf(j));
        m61369a(i, contentValues);
        return null;
    }

    /* renamed from: b */
    private static void m61374b(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        MethodCollector.m26663i(7130);
        if (downloadInfo == null || sQLiteStatement == null) {
            MethodCollector.m26664o(7130);
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                try {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, (long) downloadInfo.getId());
                    sQLiteStatement.execute();
                } finally {
                    MethodCollector.m26664o(7130);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.m26664o(7130);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: c */
    public final DownloadInfo mo53784c(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) -3);
        contentValues.put("curBytes", Long.valueOf(j));
        contentValues.put("isFirstDownload", (Integer) 0);
        contentValues.put("isFirstSuccess", (Integer) 0);
        m61369a(i, contentValues);
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: d */
    public final DownloadInfo mo53788d(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) -2);
        contentValues.put("curBytes", Long.valueOf(j));
        m61369a(i, contentValues);
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: b */
    public final DownloadInfo mo53778b(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) -1);
        contentValues.put("curBytes", Long.valueOf(j));
        if (j > 0) {
            contentValues.put("isFirstDownload", (Integer) 0);
        }
        m61369a(i, contentValues);
        return null;
    }

    /* renamed from: a */
    public static void m61370a(int i, SQLiteStatement sQLiteStatement) {
        MethodCollector.m26663i(6531);
        if (sQLiteStatement == null) {
            MethodCollector.m26664o(6531);
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                try {
                    sQLiteStatement.bindLong(1, (long) i);
                    sQLiteStatement.execute();
                } finally {
                    MethodCollector.m26664o(6531);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.m26664o(6531);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l, com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c
    /* renamed from: b */
    public final void mo53781b(int i, List<DownloadChunk> list) {
        try {
            mo53790d(i);
            if (list != null) {
                for (DownloadChunk downloadChunk : list) {
                    if (downloadChunk != null) {
                        mo53774a(downloadChunk);
                        if (downloadChunk.mo54405d()) {
                            for (DownloadChunk downloadChunk2 : downloadChunk.f72918g) {
                                mo53774a(downloadChunk2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m61371a(DownloadChunk downloadChunk, SQLiteStatement sQLiteStatement) {
        MethodCollector.m26663i(6825);
        if (downloadChunk == null || sQLiteStatement == null) {
            MethodCollector.m26664o(6825);
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                try {
                    downloadChunk.f72920i = 0;
                    sQLiteStatement.clearBindings();
                    int i = downloadChunk.f72920i + 1;
                    downloadChunk.f72920i = i;
                    sQLiteStatement.bindLong(i, (long) downloadChunk.f72912a);
                    int i2 = downloadChunk.f72920i + 1;
                    downloadChunk.f72920i = i2;
                    sQLiteStatement.bindLong(i2, (long) downloadChunk.f72916e);
                    int i3 = downloadChunk.f72920i + 1;
                    downloadChunk.f72920i = i3;
                    sQLiteStatement.bindLong(i3, downloadChunk.f72913b);
                    int i4 = downloadChunk.f72920i + 1;
                    downloadChunk.f72920i = i4;
                    sQLiteStatement.bindLong(i4, downloadChunk.mo54411i());
                    int i5 = downloadChunk.f72920i + 1;
                    downloadChunk.f72920i = i5;
                    sQLiteStatement.bindLong(i5, downloadChunk.f72914c);
                    int i6 = downloadChunk.f72920i + 1;
                    downloadChunk.f72920i = i6;
                    sQLiteStatement.bindLong(i6, downloadChunk.f72915d);
                    int i7 = downloadChunk.f72920i + 1;
                    downloadChunk.f72920i = i7;
                    sQLiteStatement.bindLong(i7, (long) downloadChunk.mo54396a());
                    sQLiteStatement.executeInsert();
                } finally {
                    MethodCollector.m26664o(6825);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.m26664o(6825);
        }
    }

    /* renamed from: a */
    public static void m61372a(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        MethodCollector.m26663i(6683);
        if (downloadInfo == null || sQLiteStatement == null) {
            MethodCollector.m26664o(6683);
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                try {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.executeInsert();
                } finally {
                    MethodCollector.m26664o(6683);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.m26664o(6683);
        }
    }

    /* renamed from: a */
    public static void m61368a(int i, int i2, long j, SQLiteStatement sQLiteStatement) {
        MethodCollector.m26663i(6978);
        try {
            synchronized (sQLiteStatement) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("curOffset", Long.valueOf(j));
                    f72280a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2)});
                } finally {
                    MethodCollector.m26664o(6978);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.m26664o(6978);
        }
    }

    /* renamed from: a */
    public static void m61366a(int i, int i2, int i3, int i4, SQLiteStatement sQLiteStatement) {
        MethodCollector.m26663i(6828);
        try {
            synchronized (sQLiteStatement) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("chunkIndex", Integer.valueOf(i4));
                    f72280a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)});
                } finally {
                    MethodCollector.m26664o(6828);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.m26664o(6828);
        }
    }

    /* renamed from: a */
    public static void m61367a(int i, int i2, int i3, long j, SQLiteStatement sQLiteStatement) {
        MethodCollector.m26663i(7128);
        try {
            synchronized (sQLiteStatement) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("curOffset", Long.valueOf(j));
                    f72280a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)});
                } finally {
                    MethodCollector.m26664o(7128);
                }
            }
        } catch (Throwable unused) {
            MethodCollector.m26664o(7128);
        }
    }
}
