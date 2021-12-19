package com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b;

import android.app.Activity;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84960d;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.a */
public final class ProgressDialogC83990a extends ProgressDialogC84960d {

    /* renamed from: a */
    public final Handler f187498a = new Handler();

    /* renamed from: b */
    public final Activity f187499b;

    static {
        Covode.recordClassIndex(97883);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84960d
    public final void dismiss() {
        super.dismiss();
        this.f187498a.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.a$a */
    public static final class RunnableC83991a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC83990a f187500a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f187501b;

        static {
            Covode.recordClassIndex(97884);
        }

        RunnableC83991a(ProgressDialogC83990a aVar, AbstractC89171a aVar2) {
            this.f187500a = aVar;
            this.f187501b = aVar2;
        }

        public final void run() {
            if (!this.f187500a.f187499b.isFinishing()) {
                this.f187500a.dismiss();
                this.f187501b.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressDialogC83990a(Activity activity) {
        super(activity);
        C89219l.m154721d(activity, "");
        this.f187499b = activity;
        setCancelable(false);
        setIndeterminate(false);
        setMax(100);
    }

    /* renamed from: a */
    public final void mo128859a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f187498a.postDelayed(new RunnableC83991a(this, aVar), 70);
    }
}
