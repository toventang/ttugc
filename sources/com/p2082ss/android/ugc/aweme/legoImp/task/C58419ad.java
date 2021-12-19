package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80551ht;
import java.lang.reflect.Array;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ad */
final /* synthetic */ class C58419ad implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f133009a = new C58419ad();

    static {
        Covode.recordClassIndex(68660);
    }

    private C58419ad() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        if (((Boolean) obj).booleanValue() && Build.VERSION.SDK_INT < 23 && C80551ht.f180161a != null) {
            try {
                Object obj2 = C80551ht.f180161a.get(null);
                if (obj2 != null) {
                    int length = Array.getLength(obj2);
                    for (int i = 0; i < length; i++) {
                        Array.set(obj2, i, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
