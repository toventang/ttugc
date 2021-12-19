package com.p2082ss.android.ugc.aweme.homepage.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.C33796j;
import com.p2082ss.android.ugc.aweme.app.C33802l;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImpl.task.AntispamApiUploadTask;
import com.p2082ss.android.ugc.aweme.legoImpl.task.MobLaunchEventTask;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.business.a */
public final class C52965a {
    static {
        Covode.recordClassIndex(62496);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.business.a$a */
    public static final class RunnableC52966a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f121799a;

        static {
            Covode.recordClassIndex(62497);
        }

        public RunnableC52966a(long j) {
            this.f121799a = j;
        }

        public final void run() {
            C52965a.m97878a(this.f121799a);
        }
    }

    /* renamed from: a */
    public static final void m97878a(long j) {
        boolean z;
        int a = C33802l.m69153a();
        int e = (int) C17867d.m33084e();
        if (a != e) {
            z = true;
        } else {
            z = false;
        }
        C33796j a2 = C33796j.m69147a();
        C89219l.m154716b(a2, "");
        if (a2.f80040a) {
            new C58221f.C58224c().mo95703b((AbstractC58264w) new MobLaunchEventTask(z, j)).mo95706a();
        }
        if (a == 0) {
            C33802l.m69154a(e);
        }
        C33796j a3 = C33796j.m69147a();
        C89219l.m154716b(a3, "");
        a3.f80040a = false;
        new C58221f.C58224c().mo95703b((AbstractC58264w) new AntispamApiUploadTask()).mo95706a();
    }
}
