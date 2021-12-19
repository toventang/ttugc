package com.p2082ss.android.ugc.aweme.tools.draft.p4101b;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.tools.draft.p4110h.C78380b;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.b.a */
public final class C78187a implements DatabaseErrorHandler {
    static {
        Covode.recordClassIndex(91302);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r1.hasNext() != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r0 = r1.next().second;
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
        m136671a((java.lang.String) r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r0 = r6.getPath();
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
        m136671a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9634);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e A[ExcHandler: all (r2v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v13 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v13 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0036, B:7:0x003a, B:8:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r6) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78187a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }

    /* renamed from: a */
    private static void m136671a(String str, SQLiteDatabase sQLiteDatabase) {
        int i;
        boolean z;
        MethodCollector.m26663i(9924);
        if (!C89361p.m154872a(str, ":memory:", true)) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (C89219l.m154703a(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z) {
                        break;
                    }
                    length--;
                } else if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() != 0) {
                C63244g.m114602a().mo73275c().mo101843a().mo101863b(sQLiteDatabase);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                    MethodCollector.m26664o(9924);
                    return;
                } catch (Exception e) {
                    C78380b.m136886a("delete failed: " + e.getMessage(), false);
                    MethodCollector.m26664o(9924);
                    return;
                }
            }
        }
        MethodCollector.m26664o(9924);
    }
}
