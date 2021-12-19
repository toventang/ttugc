package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65417d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.b */
public final class C73800b implements AbstractC73799a {

    /* renamed from: a */
    private final Activity f165687a;

    static {
        Covode.recordClassIndex(86543);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.b$a */
    static final class RunnableC73801a implements Runnable {

        /* renamed from: a */
        public static final RunnableC73801a f165688a = new RunnableC73801a();

        static {
            Covode.recordClassIndex(86544);
        }

        RunnableC73801a() {
        }

        public final void run() {
            C63244g.m114602a().mo73265K().mo101702a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        if (C65417d.m117136a()) {
            this.f165687a.runOnUiThread(RunnableC73801a.f165688a);
        }
    }

    public C73800b(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f165687a = activity;
    }
}
