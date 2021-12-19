package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.b */
public final class ProgressDialogC78977b extends ProgressDialogC84958b {

    /* renamed from: c */
    public static final C78979b f177491c = new C78979b((byte) 0);

    /* renamed from: a */
    public final Handler f177492a = new Handler();

    /* renamed from: b */
    public final Activity f177493b;

    /* renamed from: e */
    private final ValueAnimator f177494e;

    static {
        Covode.recordClassIndex(92135);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.b$b */
    public static final class C78979b {
        static {
            Covode.recordClassIndex(92137);
        }

        private C78979b() {
        }

        public /* synthetic */ C78979b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b
    public final void dismiss() {
        super.dismiss();
        this.f177492a.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.b$c */
    public static final class RunnableC78980c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC78977b f177496a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f177497b;

        static {
            Covode.recordClassIndex(92138);
        }

        RunnableC78980c(ProgressDialogC78977b bVar, AbstractC89171a aVar) {
            this.f177496a = bVar;
            this.f177497b = aVar;
        }

        public final void run() {
            if (!this.f177496a.f177493b.isFinishing()) {
                this.f177496a.dismiss();
                this.f177497b.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.b$a */
    static final class C78978a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ProgressDialogC78977b f177495a;

        static {
            Covode.recordClassIndex(92136);
        }

        C78978a(ProgressDialogC78977b bVar) {
            this.f177495a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ProgressDialogC78977b bVar = this.f177495a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            bVar.setProgress(((Integer) animatedValue).intValue());
        }
    }

    /* renamed from: a */
    public final void mo122797a(String str) {
        C89219l.m154721d(str, "");
        if (!this.f177493b.isFinishing()) {
            show();
        }
        setMessage(str);
        mo129720a();
        this.f177494e.start();
    }

    /* renamed from: a */
    public final void mo122796a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (this.f177494e.isRunning()) {
            this.f177494e.end();
        }
        setProgress(100);
        this.f177492a.postDelayed(new RunnableC78980c(this, aVar), 70);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressDialogC78977b(Activity activity) {
        super(activity);
        C89219l.m154721d(activity, "");
        this.f177493b = activity;
        setCancelable(false);
        setIndeterminate(false);
        setMax(100);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 83);
        ofInt.setDuration(5000L);
        ofInt.addUpdateListener(new C78978a(this));
        C89219l.m154716b(ofInt, "");
        this.f177494e = ofInt;
    }
}
