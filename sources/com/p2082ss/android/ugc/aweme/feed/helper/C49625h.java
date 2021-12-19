package com.p2082ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.h */
public class C49625h {

    /* renamed from: j */
    private static volatile C49625h f114188j;

    /* renamed from: a */
    public AbstractC80747i f114189a;

    /* renamed from: b */
    public String f114190b;

    /* renamed from: c */
    public long f114191c = -1;

    /* renamed from: d */
    public boolean f114192d;

    /* renamed from: e */
    public int f114193e;

    /* renamed from: f */
    public boolean f114194f;

    /* renamed from: g */
    public boolean f114195g;

    /* renamed from: h */
    public int f114196h = -1;

    /* renamed from: i */
    public int f114197i = -1;

    static {
        Covode.recordClassIndex(58472);
    }

    private C49625h() {
    }

    /* renamed from: a */
    public static C49625h m93072a() {
        MethodCollector.m26663i(3417);
        if (f114188j == null) {
            synchronized (C49625h.class) {
                try {
                    if (f114188j == null) {
                        f114188j = new C49625h();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3417);
                    throw th;
                }
            }
        }
        C49625h hVar = f114188j;
        MethodCollector.m26664o(3417);
        return hVar;
    }
}
