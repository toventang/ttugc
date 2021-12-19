package com.p2082ss.android.ugc.aweme.notification.p3520b;

import android.os.Looper;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.b.a */
public final class C61862a {
    static {
        Covode.recordClassIndex(72605);
    }

    /* renamed from: a */
    public static final <T> AbstractC89244h<T> m111996a(AbstractC89171a<? extends T> aVar) {
        C89219l.m154721d(aVar, "");
        return C89250i.m154774a(EnumC89331m.NONE, aVar);
    }

    /* renamed from: b */
    public static final void m111999b(View view) {
        C89219l.m154721d(view, "");
        C13628n.m24510a(view, 0);
    }

    /* renamed from: a */
    public static final void m111997a(View view) {
        C89219l.m154721d(view, "");
        C13628n.m24510a(view, 8);
    }

    /* renamed from: a */
    public static final <T> void m111998a(C33943c<T> cVar, T t) {
        C89219l.m154721d(cVar, "");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        if (currentThread == mainLooper.getThread()) {
            cVar.setValue(t);
        } else {
            cVar.postValue(t);
        }
    }
}
