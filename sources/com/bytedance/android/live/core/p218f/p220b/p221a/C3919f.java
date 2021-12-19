package com.bytedance.android.live.core.p218f.p220b.p221a;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.core.p218f.p220b.AbstractC3924c;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.f.b.a.f */
public final class C3919f implements AbstractC3924c {

    /* renamed from: a */
    public static final List<String> f10803a = Arrays.asList("ONEPLUS A6000");

    static {
        Covode.recordClassIndex(4448);
    }

    @Override // com.bytedance.android.live.core.p218f.p220b.AbstractC3924c
    /* renamed from: a */
    public final boolean mo9270a(Context context) {
        return f10803a.contains(Build.MODEL);
    }
}
