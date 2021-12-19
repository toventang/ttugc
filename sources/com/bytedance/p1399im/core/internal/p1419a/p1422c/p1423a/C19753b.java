package com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.tencent.wcdb.AbstractC87265g;
import java.io.File;

/* renamed from: com.bytedance.im.core.internal.a.c.a.b */
public class C19753b implements AbstractC87265g {

    /* renamed from: b */
    private static final String[] f46936b = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};

    /* renamed from: a */
    private final boolean f46937a;

    static {
        Covode.recordClassIndex(22597);
    }

    /* renamed from: a */
    private static boolean m37039a(File file) {
        MethodCollector.m26663i(11636);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(11636);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(11636);
        return delete;
    }

    /* renamed from: a */
    private void m37038a(String str) {
        MethodCollector.m26663i(11635);
        if (str == null || str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            MethodCollector.m26664o(11635);
            return;
        }
        C19512f.m36457b("imsdk", "WCDB.DefaultDatabaseErrorHandler Remove database file: ".concat(String.valueOf(str)), (Throwable) null);
        int i = 0;
        if (!this.f46937a) {
            File file = new File(str);
            File file2 = new File(file.getParentFile(), "corrupted");
            if (!file2.mkdirs()) {
                C19512f.m36457b("imsdk", "WCDB.DefaultDatabaseErrorHandler Could not create directory for corrupted database. Corruption backup may be unavailable.", (Throwable) null);
            }
            String str2 = file2.getPath() + "/" + file.getName();
            String[] strArr = f46936b;
            int length = strArr.length;
            while (i < length) {
                String str3 = strArr[i];
                String str4 = str2 + str3;
                File file3 = new File(str + str3);
                if (!file3.renameTo(new File(str4))) {
                    m37039a(file3);
                }
                i++;
            }
            MethodCollector.m26664o(11635);
            return;
        }
        String[] strArr2 = f46936b;
        int length2 = strArr2.length;
        while (i < length2) {
            m37039a(new File(str + strArr2[i]));
            i++;
        }
        MethodCollector.m26664o(11635);
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.InvokeNode.isSame(InvokeNode.java:77)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.tencent.wcdb.AbstractC87265g
    /* renamed from: a */
    public void mo31697a(com.tencent.wcdb.database.SQLiteDatabase r5) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.C19753b.mo31697a(com.tencent.wcdb.database.SQLiteDatabase):void");
    }
}
