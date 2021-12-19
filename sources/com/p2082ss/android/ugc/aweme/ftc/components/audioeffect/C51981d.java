package com.p2082ss.android.ugc.aweme.ftc.components.audioeffect;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.d */
public final class C51981d extends RecyclerView.ViewHolder {

    /* renamed from: e */
    public static final C51983a f119745e = new C51983a((byte) 0);

    /* renamed from: a */
    ImageView f119746a = ((ImageView) this.itemView.findViewById(R.id.bsq));

    /* renamed from: b */
    AVDmtImageTextView f119747b = ((AVDmtImageTextView) this.itemView.findViewById(R.id.bmd));

    /* renamed from: c */
    public final FrameLayout f119748c;

    /* renamed from: d */
    public final AbstractC51984b f119749d;

    /* renamed from: f */
    private ObjectAnimator f119750f;

    /* renamed from: g */
    private int f119751g = -1;

    /* renamed from: h */
    private long f119752h;

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.d$b */
    public interface AbstractC51984b {
        static {
            Covode.recordClassIndex(61356);
        }

        /* renamed from: a */
        void mo87703a(View view, int i);
    }

    static {
        Covode.recordClassIndex(61353);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.d$a */
    public static final class C51983a {
        static {
            Covode.recordClassIndex(61355);
        }

        private C51983a() {
        }

        public /* synthetic */ C51983a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.d$c */
    static final class RunnableC51985c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C51981d f119754a;

        static {
            Covode.recordClassIndex(61357);
        }

        RunnableC51985c(C51981d dVar) {
            this.f119754a = dVar;
        }

        public final void run() {
            this.f119754a.mo87712b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo87711a() {
        if (getAdapterPosition() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo87712b() {
        ImageView imageView = this.f119746a;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        m96713d();
    }

    /* renamed from: d */
    private final void m96713d() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f119750f;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f119750f) == null)) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.f119746a;
        if (imageView != null) {
            imageView.setRotation(0.0f);
        }
    }

    /* renamed from: c */
    private final void m96712c() {
        ImageView imageView = this.f119746a;
        if (imageView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
            this.f119750f = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(800L);
            }
            ObjectAnimator objectAnimator = this.f119750f;
            if (objectAnimator != null) {
                objectAnimator.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator2 = this.f119750f;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator3 = this.f119750f;
            if (objectAnimator3 != null) {
                objectAnimator3.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo87710a(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f119747b;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo121340a(z);
        }
    }

    /* renamed from: a */
    public final void mo87709a(int i) {
        int i2;
        if (!mo87711a() && i != (i2 = this.f119751g)) {
            this.f119751g = i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.f119752h = System.currentTimeMillis();
                        ImageView imageView = this.f119746a;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        ImageView imageView2 = this.f119746a;
                        if (imageView2 != null) {
                            imageView2.setImageResource(2131230947);
                        }
                        m96712c();
                        return;
                    } else if (i != 3) {
                        return;
                    }
                } else if (2 != i2 || this.f119752h <= 0) {
                    mo87712b();
                    return;
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - this.f119752h;
                    if (currentTimeMillis >= 100) {
                        mo87712b();
                        return;
                    } else {
                        this.itemView.postDelayed(new RunnableC51985c(this), 100 - currentTimeMillis);
                        return;
                    }
                }
            }
            ImageView imageView3 = this.f119746a;
            if (imageView3 != null) {
                imageView3.setImageResource(2131232478);
            }
            ImageView imageView4 = this.f119746a;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            m96713d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51981d(FrameLayout frameLayout, AbstractC51984b bVar) {
        super(frameLayout);
        C89219l.m154721d(frameLayout, "");
        this.f119748c = frameLayout;
        this.f119749d = bVar;
        this.itemView.setOnClickListener(new AbstractView$OnClickListenerC81432d(this) {
            /* class com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51981d.C519821 */

            /* renamed from: a */
            final /* synthetic */ C51981d f119753a;

            static {
                Covode.recordClassIndex(61354);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f119753a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                C89219l.m154721d(view, "");
                AbstractC51984b bVar = this.f119753a.f119749d;
                if (bVar != null) {
                    bVar.mo87703a(view, this.f119753a.getAdapterPosition());
                }
            }
        });
    }
}
