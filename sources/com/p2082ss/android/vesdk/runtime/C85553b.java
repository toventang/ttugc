package com.p2082ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.vesdk.runtime.b */
public final class C85553b {

    /* renamed from: a */
    public String f191680a;

    /* renamed from: b */
    public String[] f191681b;

    /* renamed from: c */
    public String[] f191682c;

    /* renamed from: d */
    public String[] f191683d;

    /* renamed from: e */
    public String[] f191684e;

    /* renamed from: f */
    public String[] f191685f;

    /* renamed from: g */
    public boolean f191686g;

    /* renamed from: h */
    public boolean f191687h;

    /* renamed from: i */
    public int f191688i;

    /* renamed from: j */
    public int f191689j;

    /* renamed from: k */
    public int f191690k;

    /* renamed from: l */
    public ArrayList<String> f191691l = new ArrayList<>();

    static {
        Covode.recordClassIndex(99727);
    }

    public C85553b(String str) {
        this.f191680a = str;
    }

    /* renamed from: a */
    public final String mo131521a(String str) {
        String str2 = C85557f.m147458a(this.f191680a, "concat") + File.separator + str + "_reverse.mp4";
        this.f191691l.add(str2);
        return str2;
    }

    /* renamed from: a */
    public static boolean m147445a(File file) {
        MethodCollector.m26663i(6000);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(6000);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(6000);
        return delete;
    }
}
