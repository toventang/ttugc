package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.d.d */
public final /* synthetic */ class RunnableC3869d implements Runnable {

    /* renamed from: a */
    private final Map f10692a;

    /* renamed from: b */
    private final String f10693b;

    /* renamed from: c */
    private final int f10694c;

    static {
        Covode.recordClassIndex(4398);
    }

    RunnableC3869d(Map map, String str, int i) {
        this.f10692a = map;
        this.f10693b = str;
        this.f10694c = i;
    }

    public final void run() {
        C3868c.m9492a(this.f10693b, this.f10694c, C3868c.m9486a(this.f10692a));
    }
}
