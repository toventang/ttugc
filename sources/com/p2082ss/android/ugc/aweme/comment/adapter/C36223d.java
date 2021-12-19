package com.p2082ss.android.ugc.aweme.comment.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.d */
public class C36223d {

    /* renamed from: e */
    private static volatile C36223d f85542e;

    /* renamed from: a */
    public boolean f85543a = true;

    /* renamed from: b */
    public boolean f85544b = true;

    /* renamed from: c */
    public boolean f85545c = true;

    /* renamed from: d */
    public boolean f85546d;

    static {
        Covode.recordClassIndex(43489);
    }

    private C36223d() {
        boolean z = true;
        this.f85546d = SettingsManager.m29616a().mo25394a("aweme_comment_pre_create_viewholder_setting", 1) != 1 ? false : z;
    }

    /* renamed from: a */
    public static C36223d m73822a() {
        MethodCollector.m26663i(9223);
        if (f85542e == null) {
            synchronized (C36223d.class) {
                try {
                    if (f85542e == null) {
                        f85542e = new C36223d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9223);
                    throw th;
                }
            }
        }
        C36223d dVar = f85542e;
        MethodCollector.m26664o(9223);
        return dVar;
    }
}
