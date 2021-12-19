package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DialogC70499c;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d */
public final class C70444d {

    /* renamed from: a */
    public static final C70445a f157393a = new C70445a((byte) 0);

    /* renamed from: b */
    private DialogC70499c f157394b;

    /* renamed from: c */
    private Activity f157395c;

    /* renamed from: d */
    private Handler f157396d = new Handler();

    static {
        Covode.recordClassIndex(82887);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d$a */
    public static final class C70445a {
        static {
            Covode.recordClassIndex(82888);
        }

        private C70445a() {
        }

        public /* synthetic */ C70445a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo111006c() {
        this.f157396d.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d$b */
    public static final class RunnableC70446b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DialogC70499c f157397a;

        static {
            Covode.recordClassIndex(82889);
        }

        RunnableC70446b(DialogC70499c cVar) {
            this.f157397a = cVar;
        }

        public final void run() {
            try {
                this.f157397a.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo111005b() {
        DialogC70499c cVar = this.f157394b;
        if (cVar != null && cVar.isShowing()) {
            DialogC70499c cVar2 = this.f157394b;
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            cVar2.dismiss();
        }
        mo111006c();
    }

    /* renamed from: a */
    public final void mo111003a() {
        Activity activity = this.f157395c;
        if (activity != null && !activity.isFinishing()) {
            if (this.f157394b == null) {
                Activity activity2 = this.f157395c;
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                this.f157394b = new DialogC70499c(activity2);
            }
            DialogC70499c cVar = this.f157394b;
            if (cVar != null && (!cVar.isShowing())) {
                this.f157396d.postDelayed(new RunnableC70446b(cVar), 350);
            }
        }
    }

    /* renamed from: a */
    public final void mo111004a(Context context) {
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        this.f157395c = activity;
        if (activity != null) {
            Activity activity2 = this.f157395c;
            if (activity2 == null) {
                C89219l.m154715b();
            }
            this.f157394b = new DialogC70499c(activity2);
        }
    }
}
