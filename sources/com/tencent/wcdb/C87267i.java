package com.tencent.wcdb;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.tencent.wcdb.support.Log;
import java.io.File;

/* renamed from: com.tencent.wcdb.i */
public final class C87267i implements AbstractC87265g {

    /* renamed from: b */
    private static final String[] f197765b = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};

    /* renamed from: a */
    private final boolean f197766a;

    public C87267i() {
    }

    static {
        Covode.recordClassIndex(103156);
    }

    public C87267i(byte b) {
        this.f197766a = true;
    }

    /* renamed from: a */
    private static boolean m151450a(File file) {
        MethodCollector.m26663i(4230);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(4230);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(4230);
        return delete;
    }

    /* renamed from: a */
    private void m151449a(String str) {
        MethodCollector.m26663i(6966);
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            MethodCollector.m26664o(6966);
            return;
        }
        Log.m151457a(6, "WCDB.DefaultDatabaseErrorHandler", "Remove database file: ".concat(String.valueOf(str)));
        int i = 0;
        if (!this.f197766a) {
            File file = new File(str);
            File file2 = new File(file.getParentFile(), "corrupted");
            if (!file2.mkdirs()) {
                Log.m151457a(6, "WCDB.DefaultDatabaseErrorHandler", "Could not create directory for corrupted database. Corruption backup may be unavailable.");
            }
            String str2 = file2.getPath() + "/" + file.getName();
            String[] strArr = f197765b;
            int length = strArr.length;
            while (i < length) {
                String str3 = strArr[i];
                String str4 = str2 + str3;
                File file3 = new File(str + str3);
                if (!file3.renameTo(new File(str4))) {
                    m151450a(file3);
                }
                i++;
            }
            MethodCollector.m26664o(6966);
            return;
        }
        String[] strArr2 = f197765b;
        int length2 = strArr2.length;
        while (i < length2) {
            m151450a(new File(str + strArr2[i]));
            i++;
        }
        MethodCollector.m26664o(6966);
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.tencent.wcdb.AbstractC87265g
    /* renamed from: a */
    public final void mo31697a(com.tencent.wcdb.database.SQLiteDatabase r4) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.C87267i.mo31697a(com.tencent.wcdb.database.SQLiteDatabase):void");
    }
}
