package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e */
public final class C70851e extends RecyclerView.ViewHolder {

    /* renamed from: e */
    public static final C70853a f158625e = new C70853a((byte) 0);

    /* renamed from: a */
    ImageView f158626a = ((ImageView) this.itemView.findViewById(R.id.bsq));

    /* renamed from: b */
    AVDmtImageTextView f158627b = ((AVDmtImageTextView) this.itemView.findViewById(R.id.bmd));

    /* renamed from: c */
    public final FrameLayout f158628c;

    /* renamed from: d */
    public final AbstractC70854b f158629d;

    /* renamed from: f */
    private ObjectAnimator f158630f;

    /* renamed from: g */
    private int f158631g = -1;

    /* renamed from: h */
    private long f158632h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e$b */
    public interface AbstractC70854b {
        static {
            Covode.recordClassIndex(83345);
        }

        /* renamed from: a */
        void mo112016a(View view, int i);
    }

    static {
        Covode.recordClassIndex(83342);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e$a */
    public static final class C70853a {
        static {
            Covode.recordClassIndex(83344);
        }

        private C70853a() {
        }

        public /* synthetic */ C70853a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e$c */
    static final class RunnableC70855c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70851e f158634a;

        static {
            Covode.recordClassIndex(83346);
        }

        RunnableC70855c(C70851e eVar) {
            this.f158634a = eVar;
        }

        public final void run() {
            this.f158634a.mo112025b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo112024a() {
        if (getAdapterPosition() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo112025b() {
        ImageView imageView = this.f158626a;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        m125125d();
    }

    /* renamed from: d */
    private final void m125125d() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f158630f;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f158630f) == null)) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.f158626a;
        if (imageView != null) {
            imageView.setRotation(0.0f);
        }
    }

    /* renamed from: c */
    private final void m125124c() {
        ImageView imageView = this.f158626a;
        if (imageView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
            this.f158630f = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(800L);
            }
            ObjectAnimator objectAnimator = this.f158630f;
            if (objectAnimator != null) {
                objectAnimator.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator2 = this.f158630f;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator3 = this.f158630f;
            if (objectAnimator3 != null) {
                objectAnimator3.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo112023a(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f158627b;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo121340a(z);
        }
    }

    /* renamed from: a */
    public final void mo112022a(int i) {
        int i2;
        if (!mo112024a() && i != (i2 = this.f158631g)) {
            this.f158631g = i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.f158632h = System.currentTimeMillis();
                        ImageView imageView = this.f158626a;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        ImageView imageView2 = this.f158626a;
                        if (imageView2 != null) {
                            imageView2.setImageResource(2131230947);
                        }
                        m125124c();
                        return;
                    } else if (i != 3) {
                        return;
                    }
                } else if (2 != i2 || this.f158632h <= 0) {
                    mo112025b();
                    return;
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - this.f158632h;
                    if (currentTimeMillis >= 100) {
                        mo112025b();
                        return;
                    } else {
                        this.itemView.postDelayed(new RunnableC70855c(this), 100 - currentTimeMillis);
                        return;
                    }
                }
            }
            ImageView imageView3 = this.f158626a;
            if (imageView3 != null) {
                imageView3.setImageResource(2131232478);
            }
            ImageView imageView4 = this.f158626a;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            m125125d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70851e(FrameLayout frameLayout, AbstractC70854b bVar) {
        super(frameLayout);
        C89219l.m154721d(frameLayout, "");
        this.f158628c = frameLayout;
        this.f158629d = bVar;
        this.itemView.setOnClickListener(new AbstractView$OnClickListenerC81432d(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70851e.C708521 */

            /* renamed from: a */
            final /* synthetic */ C70851e f158633a;

            static {
                Covode.recordClassIndex(83343);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f158633a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                C89219l.m154721d(view, "");
                AbstractC70854b bVar = this.f158633a.f158629d;
                if (bVar != null) {
                    bVar.mo112016a(view, this.f158633a.getAdapterPosition());
                }
            }
        });
    }
}
