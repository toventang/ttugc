package com.bytedance.p1399im.core.p1407c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.C19738a;
import com.bytedance.p1399im.core.p1404a.AbstractC19481b;
import com.bytedance.p1399im.core.p1404a.C19483d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.im.core.c.j */
public final class C19518j {

    /* renamed from: a */
    public static final Handler f46330a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static Runnable f46331b = new RunnableC19519a();

    /* renamed from: c */
    public static final C19518j f46332c = new C19518j();

    /* renamed from: com.bytedance.im.core.c.j$a */
    public static final class RunnableC19519a implements Runnable {
        static {
            Covode.recordClassIndex(22363);
        }

        RunnableC19519a() {
        }

        public final void run() {
            C19517i a = C19517i.m36463a().mo31179a("imsdk_ws_connection_survival").mo31180a("is_background", Boolean.valueOf(C19512f.f46310a));
            C19483d a2 = C19483d.m36365a();
            C89219l.m154709a((Object) a2, "");
            AbstractC19481b bVar = a2.f46157b;
            C89219l.m154709a((Object) bVar, "");
            C19517i a3 = a.mo31180a("is_connected", Boolean.valueOf(bVar.mo27968i()));
            C19483d a4 = C19483d.m36365a();
            C89219l.m154709a((Object) a4, "");
            AbstractC19481b bVar2 = a4.f46157b;
            C89219l.m154709a((Object) bVar2, "");
            a3.mo31180a("net_connected", Boolean.valueOf(bVar2.mo27964e())).mo31181b();
            if (C19738a.m36949o() > 0) {
                C19518j.f46330a.postDelayed(this, (long) (C19738a.m36949o() * 1000));
            }
        }
    }

    private C19518j() {
    }

    static {
        Covode.recordClassIndex(22362);
    }
}
