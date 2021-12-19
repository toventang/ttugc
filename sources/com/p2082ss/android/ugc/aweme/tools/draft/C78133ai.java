package com.p2082ss.android.ugc.aweme.tools.draft;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C28023p;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.C43221a;
import com.p2082ss.android.ugc.aweme.draft.model.C43222b;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.DraftDBSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.p2082ss.android.ugc.aweme.effect.EffectListModel;
import com.p2082ss.android.ugc.aweme.experiment.C46788ce;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl;
import com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78204d;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78236g;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ai */
public class C78133ai {

    /* renamed from: b */
    private static volatile C78133ai f175465b;

    /* renamed from: a */
    public SQLiteDatabase f175466a = C78204d.m136688a().getReadableDatabase();

    /* renamed from: c */
    private SQLiteDatabase f175467c = C78204d.m136688a().getWritableDatabase();

    /* renamed from: d */
    private ReentrantReadWriteLock f175468d = new ReentrantReadWriteLock();

    static {
        Covode.recordClassIndex(91248);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0117, code lost:
        if (0 == 0) goto L_0x011c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.tools.draft.p4111i.AbstractC78387a> mo122067a(java.util.List<java.lang.String> r9) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78133ai.mo122067a(java.util.List):java.util.List");
    }

    /* renamed from: a */
    public final List<Integer> mo122068a(boolean z) {
        MethodCollector.m26663i(11824);
        ArrayList arrayList = new ArrayList();
        String str = "select count(*) as user_draft_count from local_draft";
        if (!z) {
            str = str + " where user_id != " + m136606f();
        }
        try {
            Cursor rawQuery = this.f175466a.rawQuery(str + " group by user_id", null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() > 0) {
                        while (rawQuery.moveToNext()) {
                            arrayList.add(Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("user_draft_count"))));
                        }
                    }
                } catch (Throwable th) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    MethodCollector.m26664o(11824);
                    throw th;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e) {
            C84911q.m145923a("aweme-draft-monitor", e);
        }
        MethodCollector.m26664o(11824);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (0 == 0) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063 A[Catch:{ Exception -> 0x0082, all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0048 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.draft.model.C43223c> mo122069a(boolean r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78133ai.mo122069a(boolean, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (0 == 0) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063 A[Catch:{ Exception -> 0x0084, all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0048 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.draft.model.C43223c> mo122070a(boolean r9, java.util.List<java.lang.String> r10) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78133ai.mo122070a(boolean, java.util.List):java.util.List");
    }

    /* renamed from: f */
    private static String m136606f() {
        return C63244g.m114602a().mo73255A().mo93904c();
    }

    /* renamed from: g */
    private boolean m136607g() {
        this.f175468d.readLock().lock();
        return true;
    }

    private C78133ai() {
    }

    /* renamed from: a */
    public static C78133ai m136600a() {
        MethodCollector.m26663i(10431);
        if (f175465b == null) {
            synchronized (C78133ai.class) {
                try {
                    if (f175465b == null) {
                        f175465b = new C78133ai();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10431);
                    throw th;
                }
            }
        }
        C78133ai aiVar = f175465b;
        MethodCollector.m26664o(10431);
        return aiVar;
    }

    /* renamed from: e */
    private static String m136605e() {
        String str;
        if (!C78212bg.m136694a() || !C46788ce.m90134a()) {
            str = "time";
        } else {
            str = "save_time";
        }
        return "local_draft' where user_id = '" + m136606f() + "' or user_id is null order by " + str + " asc";
    }

    /* renamed from: d */
    public final int mo122075d() {
        MethodCollector.m26663i(11493);
        int i = 0;
        try {
            Cursor rawQuery = this.f175466a.rawQuery("select * from 'local_draft' order by 'time' desc", null);
            if (rawQuery != null) {
                try {
                    i = rawQuery.getCount();
                    rawQuery.close();
                } catch (Throwable th) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    MethodCollector.m26664o(11493);
                    throw th;
                }
            }
        } catch (Exception e) {
            C84911q.m145923a("aweme-draft-monitor", e);
        }
        MethodCollector.m26664o(11493);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (0 == 0) goto L_0x0033;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo122071b() {
        /*
            r6 = this;
            r5 = 11039(0x2b1f, float:1.5469E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            r4 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.f175466a     // Catch:{ Exception -> 0x0028 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = "select * from '"
            r1.<init>(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = m136605e()     // Catch:{ Exception -> 0x0028 }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0028 }
            android.database.Cursor r3 = r2.rawQuery(r0, r3)     // Catch:{ Exception -> 0x0028 }
            if (r3 != 0) goto L_0x0023
            goto L_0x0033
        L_0x0023:
            int r4 = r3.getCount()     // Catch:{ Exception -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "aweme-draft-monitor"
            com.p2082ss.android.ugc.tools.utils.C84911q.m145923a(r0, r1)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0033
        L_0x0030:
            r3.close()
        L_0x0033:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        L_0x0037:
            r0 = move-exception
            if (r3 == 0) goto L_0x003d
            r3.close()
        L_0x003d:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78133ai.mo122071b():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (0 == 0) goto L_0x0037;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.draft.model.C43223c> mo122074c() {
        /*
            r5 = this;
            r4 = 11338(0x2c4a, float:1.5888E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.f175466a     // Catch:{ Exception -> 0x002c }
            java.lang.String r0 = "select * from 'local_draft' order by 'time' desc"
            android.database.Cursor r2 = r1.rawQuery(r0, r2)     // Catch:{ Exception -> 0x002c }
            if (r2 == 0) goto L_0x0029
            int r0 = r2.getCount()     // Catch:{ Exception -> 0x002c }
            if (r0 <= 0) goto L_0x0029
        L_0x001b:
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.draft.model.c r0 = m136599a(r2)     // Catch:{ Exception -> 0x002c }
            r3.add(r0)     // Catch:{ Exception -> 0x002c }
            goto L_0x001b
        L_0x0029:
            if (r2 == 0) goto L_0x0037
            goto L_0x0034
        L_0x002c:
            r1 = move-exception
            java.lang.String r0 = "aweme-draft-monitor"
            com.p2082ss.android.ugc.tools.utils.C84911q.m145923a(r0, r1)     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0037
        L_0x0034:
            r2.close()
        L_0x0037:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        L_0x003b:
            r0 = move-exception
            if (r2 == 0) goto L_0x0041
            r2.close()
        L_0x0041:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78133ai.mo122074c():java.util.List");
    }

    /* renamed from: b */
    private void m136602b(boolean z) {
        try {
            this.f175468d.readLock().unlock();
        } catch (Throwable th) {
            C40971f.m82490a(th, "crash happened in DraftDBHelper.unlock()");
        }
    }

    /* renamed from: d */
    public static EffectListModel m136604d(String str) {
        try {
            return (EffectListModel) C63244g.m114602a().mo73261G().mo46670a(str, EffectListModel.class);
        } catch (Exception e) {
            C84911q.m145923a("aweme-draft-monitor", e);
            return null;
        }
    }

    /* renamed from: b */
    public static C43221a m136601b(String str) {
        try {
            return (C43221a) C63244g.m114602a().mo73261G().mo46670a(str, C43221a.class);
        } catch (C28023p e) {
            C40970e.m82485a(str);
            C84911q.m145923a("aweme-draft-monitor", e);
            return new C43221a();
        } catch (Exception e2) {
            C40970e.m82485a(str);
            C84911q.m145923a("aweme-draft-monitor", e2);
            return new C43221a();
        }
    }

    /* renamed from: c */
    public static C69905c m136603c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return DraftUpdateServiceImpl.createDraftUpdateServicebyMonsterPlugin(false).transformNewAVMusic(str);
        } catch (C28023p e) {
            C40970e.m82485a(str);
            C84911q.m145923a("aweme-draft-monitor", e);
            return new C69905c();
        } catch (Exception e2) {
            C40970e.m82485a(str);
            C84911q.m145923a("aweme-draft-monitor", e2);
            return new C69905c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (0 == 0) goto L_0x0054;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.draft.model.C43223c> mo122065a(com.p2082ss.android.ugc.aweme.draft.AbstractC43215m r7) {
        /*
            r6 = this;
            r5 = 10890(0x2a8a, float:1.526E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.f175466a     // Catch:{ Exception -> 0x0049 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
            java.lang.String r0 = "select * from '"
            r1.<init>(r0)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r0 = m136605e()     // Catch:{ Exception -> 0x0049 }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0049 }
            android.database.Cursor r3 = r2.rawQuery(r0, r3)     // Catch:{ Exception -> 0x0049 }
            if (r3 == 0) goto L_0x0046
            int r0 = r3.getCount()     // Catch:{ Exception -> 0x0049 }
            if (r0 <= 0) goto L_0x0046
        L_0x002c:
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x0049 }
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.draft.model.c r1 = m136599a(r3)     // Catch:{ Exception -> 0x0049 }
            if (r7 == 0) goto L_0x0042
            boolean r0 = r7.mo69505a(r1)     // Catch:{ Exception -> 0x0049 }
            if (r0 == 0) goto L_0x002c
            r4.add(r1)     // Catch:{ Exception -> 0x0049 }
            goto L_0x002c
        L_0x0042:
            r4.add(r1)     // Catch:{ Exception -> 0x0049 }
            goto L_0x002c
        L_0x0046:
            if (r3 == 0) goto L_0x0054
            goto L_0x0051
        L_0x0049:
            r1 = move-exception
            java.lang.String r0 = "aweme-draft-monitor"
            com.p2082ss.android.ugc.tools.utils.C84911q.m145923a(r0, r1)     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x0054
        L_0x0051:
            r3.close()
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        L_0x0058:
            r0 = move-exception
            if (r3 == 0) goto L_0x005e
            r3.close()
        L_0x005e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78133ai.mo122065a(com.ss.android.ugc.aweme.draft.m):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r2 != null) goto L_0x0044;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.draft.model.C43223c mo122076e(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 11495(0x2ce7, float:1.6108E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            r3 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.String r0 = "select * from local_draft where video_path = '"
            r1.<init>(r0)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            android.database.sqlite.SQLiteDatabase r0 = r5.f175466a     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            android.database.Cursor r2 = r0.rawQuery(r1, r3)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            if (r2 == 0) goto L_0x0047
            int r0 = r2.getCount()     // Catch:{ Exception -> 0x0037 }
            if (r0 <= 0) goto L_0x0044
            r2.moveToNext()     // Catch:{ Exception -> 0x0037 }
            com.ss.android.ugc.aweme.draft.model.c r0 = m136599a(r2)     // Catch:{ Exception -> 0x0037 }
            r2.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        L_0x0037:
            r1 = move-exception
            goto L_0x003d
        L_0x0039:
            r0 = move-exception
            goto L_0x0051
        L_0x003b:
            r1 = move-exception
            r2 = r3
        L_0x003d:
            java.lang.String r0 = "aweme-draft-monitor"
            com.p2082ss.android.ugc.tools.utils.C84911q.m145923a(r0, r1)     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0047
        L_0x0044:
            r2.close()
        L_0x0047:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        L_0x004b:
            r0 = move-exception
            if (r2 == 0) goto L_0x0051
            r2.close()
        L_0x0051:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78133ai.mo122076e(java.lang.String):com.ss.android.ugc.aweme.draft.model.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r2 != null) goto L_0x0052;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.draft.model.C43223c mo122077f(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 11662(0x2d8e, float:1.6342E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            r3 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r0 = "select * from local_draft where user_id = '"
            r1.<init>(r0)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r0 = m136606f()     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r0 = "' and video_path = '"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.StringBuilder r1 = r0.append(r6)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            android.database.sqlite.SQLiteDatabase r0 = r5.f175466a     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            android.database.Cursor r2 = r0.rawQuery(r1, r3)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            if (r2 == 0) goto L_0x0055
            int r0 = r2.getCount()     // Catch:{ Exception -> 0x0045 }
            if (r0 <= 0) goto L_0x0052
            r2.moveToNext()     // Catch:{ Exception -> 0x0045 }
            com.ss.android.ugc.aweme.draft.model.c r0 = m136599a(r2)     // Catch:{ Exception -> 0x0045 }
            r2.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        L_0x0045:
            r1 = move-exception
            goto L_0x004b
        L_0x0047:
            r0 = move-exception
            goto L_0x005f
        L_0x0049:
            r1 = move-exception
            r2 = r3
        L_0x004b:
            java.lang.String r0 = "aweme-draft-monitor"
            com.p2082ss.android.ugc.tools.utils.C84911q.m145923a(r0, r1)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0055
        L_0x0052:
            r2.close()
        L_0x0055:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        L_0x0059:
            r0 = move-exception
            if (r2 == 0) goto L_0x005f
            r2.close()
        L_0x005f:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78133ai.mo122077f(java.lang.String):com.ss.android.ugc.aweme.draft.model.c");
    }

    /* renamed from: b */
    public final synchronized void mo122072b(C43223c cVar) {
        MethodCollector.m26663i(10604);
        mo122073b(cVar, "publish_auto_trigger");
        MethodCollector.m26664o(10604);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010b, code lost:
        if (0 == 0) goto L_0x0110;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.tools.draft.p4111i.AbstractC78387a> mo122066a(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.C78133ai.mo122066a(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public static C43223c m136599a(Cursor cursor) {
        C43223c cVar = new C43223c();
        String string = cursor.getString(cursor.getColumnIndex("user_id"));
        if (TextUtils.isEmpty(string)) {
            string = m136606f();
        }
        cVar.f100905e = cursor.getString(cursor.getColumnIndex("video_path"));
        cVar.f100885H = string;
        cVar.f100902b = m136601b(cursor.getString(cursor.getColumnIndex("aweme")));
        cVar.f100906f = m136603c(cursor.getString(cursor.getColumnIndex("music")));
        cVar.f100908h = cursor.getString(cursor.getColumnIndex("music_path"));
        C84911q.m145928d("getDraft() called, musicModel:" + cVar.f100906f + " ,musicPath:" + cVar.f100908h);
        cVar.f100910j = cursor.getInt(cursor.getColumnIndex("video_volume"));
        cVar.f100911k = cursor.getInt(cursor.getColumnIndex("music_volume"));
        C43225d.m86325a(cVar, cursor.getInt(cursor.getColumnIndex("filter")));
        cVar.f100914n = cursor.getInt(cursor.getColumnIndex("music_start"));
        cVar.f100909i = cursor.getString(cursor.getColumnIndex("voice_path"));
        cVar.f100886I = cursor.getLong(cursor.getColumnIndex("time"));
        cVar.f100915o = cursor.getInt(cursor.getColumnIndex("effect"));
        cVar.f100916p = cursor.getInt(cursor.getColumnIndex("origin"));
        cVar.f100884G = cursor.getInt(cursor.getColumnIndex("face_beauty"));
        cVar.f100888K = cursor.getString(cursor.getColumnIndex("segment_video"));
        cVar.f100889L = cursor.getInt(cursor.getColumnIndex("hard_encode"));
        cVar.f100890M = cursor.getInt(cursor.getColumnIndex("special_points"));
        cVar.f100891N = cursor.getString(cursor.getColumnIndex("sticker_path"));
        cVar.f100892O = cursor.getString(cursor.getColumnIndex("sticker_id"));
        cVar.f100922v = cursor.getInt(cursor.getColumnIndex("camera_poi"));
        cVar.f100921u = cursor.getString(cursor.getColumnIndex("filter_label"));
        cVar.f100882E = m136604d(cursor.getString(cursor.getColumnIndex("effect_list")));
        cVar.f100923w = cursor.getInt(cursor.getColumnIndex("beauty_label"));
        cVar.f100917q = cursor.getString(cursor.getColumnIndex("reverse_path"));
        cVar.f100918r = cursor.getString(cursor.getColumnIndex("video_speed"));
        cVar.f100881D = cursor.getInt(cursor.getColumnIndex("is_private"));
        cVar.f100883F = (long) cursor.getInt(cursor.getColumnIndex("max_duration"));
        cVar.f100919s = (UrlModel) C63244g.m114602a().mo73261G().mo46670a(cursor.getString(cursor.getColumnIndex("audio_track")), UrlModel.class);
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) C63244g.m114602a().mo73261G().mo46670a(cursor.getString(cursor.getColumnIndex("photo_movie")), PhotoMovieContext.class);
        if (photoMovieContext != null) {
            cVar.f100903c = photoMovieContext;
        }
        cVar.f100894Q = cursor.getString(cursor.getColumnIndex("music_effect_segments"));
        cVar.f100895R = cursor.getInt(cursor.getColumnIndex("new_version"));
        cVar.f100896S = cursor.getFloat(cursor.getColumnIndex("custom_cover_start"));
        cVar.f100897T = cursor.getString(cursor.getColumnIndex("duet_from"));
        cVar.f100898U = cursor.getString(cursor.getColumnIndex("sync_platforms"));
        try {
            cVar.mo73624a((C43222b) C63244g.m114602a().mo73261G().mo46670a(cursor.getString(cursor.getColumnIndex("draft_extras")), C43222b.class));
        } catch (Exception e) {
            C84911q.m145923a("aweme-draft-monitor", e);
        }
        if (cVar.f100900W == null || TextUtils.isEmpty(cVar.f100900W.f100759S)) {
            String string2 = cursor.getString(cursor.getColumnIndex("video_path"));
            cVar.f100907g = string2;
            if (cVar.f100900W != null) {
                cVar.f100900W.f100759S = string2;
            }
        }
        cVar.f100887J = cursor.getLong(cursor.getColumnIndex("save_time"));
        return cVar;
    }

    /* renamed from: a */
    public final DraftDBSaveResult mo122064a(C43223c cVar) {
        String b;
        String b2;
        if (cVar.f100900W != null && TextUtils.isEmpty(cVar.f100900W.f100796ac)) {
            cVar.f100900W.f100796ac = C50648c.m94911b(C63244g.m114602a().mo73290r().mo86005c().mo86019a(cVar.f100913m));
        }
        ContentValues contentValues = new ContentValues();
        String str = "";
        if (cVar.f100902b == null) {
            b = str;
        } else {
            b = C63244g.m114602a().mo73261G().mo46674b(cVar.f100902b);
        }
        contentValues.put("aweme", b);
        contentValues.put("video_path", cVar.mo73726r());
        contentValues.put("music_path", cVar.f100908h);
        contentValues.put("video_volume", Integer.valueOf(cVar.f100910j));
        contentValues.put("music_volume", Integer.valueOf(cVar.f100911k));
        if (cVar.f100906f == null) {
            b2 = str;
        } else {
            b2 = C63244g.m114602a().mo73261G().mo46674b(cVar.f100906f);
        }
        contentValues.put("music", b2);
        contentValues.put("filter", Integer.valueOf(cVar.f100913m));
        contentValues.put("music_start", Integer.valueOf(cVar.f100914n));
        contentValues.put("time", Long.valueOf(cVar.f100886I));
        contentValues.put("effect", Integer.valueOf(cVar.f100915o));
        contentValues.put("origin", Integer.valueOf(cVar.f100916p));
        contentValues.put("face_beauty", Integer.valueOf(cVar.f100884G));
        contentValues.put("user_id", cVar.f100885H);
        contentValues.put("segment_video", cVar.f100888K);
        contentValues.put("hard_encode", Integer.valueOf(cVar.f100889L));
        contentValues.put("special_points", Integer.valueOf(cVar.f100890M));
        contentValues.put("sticker_path", cVar.f100891N);
        contentValues.put("sticker_id", cVar.f100892O);
        contentValues.put("camera_poi", Integer.valueOf(cVar.f100922v));
        contentValues.put("filter_label", cVar.f100921u);
        contentValues.put("beauty_label", Integer.valueOf(cVar.f100923w));
        contentValues.put("video_speed", cVar.f100918r);
        contentValues.put("music_effect_segments", cVar.f100894Q);
        contentValues.put("is_private", Integer.valueOf(cVar.f100881D));
        contentValues.put("max_duration", Long.valueOf(cVar.f100883F));
        contentValues.put("audio_track", C63244g.m114602a().mo73261G().mo46674b(cVar.f100919s));
        if (cVar.f100903c != null) {
            str = C63244g.m114602a().mo73261G().mo46674b(cVar.f100903c);
        }
        contentValues.put("photo_movie", str);
        contentValues.put("effect_list", C43225d.m86332c(cVar));
        contentValues.put("music_id", C43225d.m86329b(cVar));
        contentValues.put("new_version", Integer.valueOf(cVar.f100895R));
        contentValues.put("custom_cover_start", Float.valueOf(cVar.f100896S));
        contentValues.put("duet_from", cVar.f100897T);
        contentValues.put("sync_platforms", cVar.f100898U);
        contentValues.put("draft_extras", C63244g.m114602a().mo73261G().mo46674b(cVar.f100900W));
        C43223c e = mo122076e(cVar.mo73726r());
        long j = cVar.f100886I;
        if (!(e == null || e.f100887J == 0)) {
            j = e.f100887J;
        }
        cVar.f100887J = j;
        contentValues.put("save_time", Long.valueOf(j));
        contentValues.put("draft_view_info", C63244g.m114602a().mo73261G().mo46674b(C78236g.m136717a(cVar)));
        DraftDBSaveResult draftDBSaveResult = new DraftDBSaveResult();
        try {
            C84911q.m145928d("start draft save, musicModel: " + cVar.f100906f + ", musicPath:" + cVar.f100908h);
            long replaceOrThrow = this.f175467c.replaceOrThrow("local_draft", null, contentValues);
            C84911q.m145928d("draft save done, rowId: ".concat(String.valueOf(replaceOrThrow)));
            if (replaceOrThrow < 0) {
                return new DraftDBSaveResult(new DraftDBSaveException(-1000, new RuntimeException("rowId : ".concat(String.valueOf(replaceOrThrow)))));
            }
            return draftDBSaveResult;
        } catch (Exception e2) {
            return new DraftDBSaveResult(new DraftDBSaveException(-1001, e2));
        }
    }

    /* renamed from: a */
    public final synchronized int mo122063a(C43223c cVar, String str) {
        String message;
        MethodCollector.m26663i(10599);
        String r = cVar.mo73726r();
        C43213k.m86181a("update draft db creation id = " + cVar.mo73676f() + "  primaryKey = " + r);
        if (TextUtils.isEmpty(r)) {
            C63244g.m114602a().mo73275c().mo101843a().mo101856a(1, "primary key is null", cVar);
            MethodCollector.m26664o(10599);
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("draft_extras", C63244g.m114602a().mo73261G().mo46674b(cVar.f100900W));
            this.f175467c.update("local_draft", contentValues, "video_path = ?", new String[]{r});
            C63244g.m114602a().mo73275c().mo101843a().mo101856a(0, str, cVar);
        } catch (Exception e) {
            C43213k.m86181a("update draft db failed creation id = " + cVar.mo73676f());
            if (e.getMessage() == null) {
                message = e.toString();
            } else {
                message = e.getMessage();
            }
            C63244g.m114602a().mo73275c().mo101843a().mo101856a(1, message, cVar);
        }
        MethodCollector.m26664o(10599);
        return 0;
    }

    /* renamed from: b */
    public final synchronized void mo122073b(C43223c cVar, String str) {
        MethodCollector.m26663i(10744);
        if (cVar == null || TextUtils.isEmpty(cVar.mo73726r()) || TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(10744);
            return;
        }
        int i = -1;
        try {
            this.f175467c.beginTransaction();
            i = this.f175467c.delete("local_draft", "video_path = ?", new String[]{cVar.mo73726r()});
            this.f175467c.setTransactionSuccessful();
            this.f175467c.endTransaction();
        } catch (Exception e) {
            C63244g.m114602a();
            e.printStackTrace();
        }
        C63244g.m114602a().mo73275c().mo101843a().mo101861a(str, i, cVar);
        MethodCollector.m26664o(10744);
    }
}
