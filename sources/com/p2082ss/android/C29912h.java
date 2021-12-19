package com.p2082ss.android;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.h */
public final class C29912h {

    /* renamed from: a */
    public final String f71347a;

    /* renamed from: b */
    public final int f71348b;

    /* renamed from: c */
    public final List<C29910g> f71349c;

    /* renamed from: d */
    public final String f71350d;

    static {
        Covode.recordClassIndex(36323);
    }

    public C29912h(String str, int i, List<C29910g> list, String str2) {
        this.f71347a = str;
        this.f71348b = i;
        this.f71349c = Collections.unmodifiableList(new ArrayList(list));
        this.f71350d = str2;
    }
}
