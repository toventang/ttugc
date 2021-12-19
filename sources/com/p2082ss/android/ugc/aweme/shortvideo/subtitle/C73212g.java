package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g */
public final class C73212g extends FrameLayout {

    /* renamed from: d */
    public static final C73216a f164425d = new C73216a((byte) 0);

    /* renamed from: a */
    public ImageView f164426a;

    /* renamed from: b */
    public LinearLayout f164427b;

    /* renamed from: c */
    public AbstractC73233l f164428c;

    /* renamed from: e */
    private ImageView f164429e;

    /* renamed from: f */
    private View f164430f;

    /* renamed from: g */
    private final AbstractC89244h f164431g;

    static {
        Covode.recordClassIndex(85930);
    }

    public final Animation getMShakeAnim() {
        return (Animation) this.f164431g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g$a */
    public static final class C73216a {
        static {
            Covode.recordClassIndex(85934);
        }

        private C73216a() {
        }

        public /* synthetic */ C73216a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g$b */
    static final class C73217b extends AbstractC89220m implements AbstractC89171a<Animation> {

        /* renamed from: a */
        final /* synthetic */ Context f164435a;

        static {
            Covode.recordClassIndex(85935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73217b(Context context) {
            super(0);
            this.f164435a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Animation invoke() {
            MethodCollector.m26663i(12337);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f164435a, R.anim.dc);
            loadAnimation.setInterpolator(new CycleInterpolator(3.0f));
            MethodCollector.m26664o(12337);
            return loadAnimation;
        }
    }

    public final void setOnCaptionWelcomeViewCallback(AbstractC73233l lVar) {
        this.f164428c = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C73212g(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12079);
        View inflate = View.inflate(context, R.layout.n_, this);
        this.f164429e = (ImageView) inflate.findViewById(R.id.bu5);
        this.f164426a = (ImageView) inflate.findViewById(R.id.btw);
        this.f164430f = inflate.findViewById(R.id.f4_);
        this.f164427b = (LinearLayout) inflate.findViewById(R.id.ccv);
        ImageView imageView = this.f164429e;
        if (imageView != null) {
            imageView.setOnClickListener(new AbstractView$OnClickListenerC81432d(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73212g.C732131 */

                /* renamed from: a */
                final /* synthetic */ C73212g f164432a;

                static {
                    Covode.recordClassIndex(85931);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f164432a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
                /* renamed from: a */
                public final void mo77200a(View view) {
                    AbstractC73233l lVar = this.f164432a.f164428c;
                    if (lVar != null) {
                        lVar.mo115769a();
                    }
                }
            });
        }
        LinearLayout linearLayout = this.f164427b;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new AbstractView$OnClickListenerC81432d(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73212g.C732142 */

                /* renamed from: a */
                final /* synthetic */ C73212g f164433a;

                static {
                    Covode.recordClassIndex(85932);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f164433a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
                /* renamed from: a */
                public final void mo77200a(View view) {
                    boolean z;
                    ImageView imageView = this.f164433a.f164426a;
                    if (imageView != null) {
                        ImageView imageView2 = this.f164433a.f164426a;
                        if (imageView2 != null) {
                            z = imageView2.isSelected();
                        } else {
                            z = false;
                        }
                        imageView.setSelected(!z);
                    }
                }
            });
        }
        View view = this.f164430f;
        if (view != null) {
            view.setOnClickListener(new AbstractView$OnClickListenerC81432d(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73212g.C732153 */

                /* renamed from: a */
                final /* synthetic */ C73212g f164434a;

                static {
                    Covode.recordClassIndex(85933);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f164434a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
                /* renamed from: a */
                public final void mo77200a(View view) {
                    ImageView imageView = this.f164434a.f164426a;
                    if (imageView == null || !imageView.isSelected()) {
                        LinearLayout linearLayout = this.f164434a.f164427b;
                        if (linearLayout != null) {
                            linearLayout.startAnimation(this.f164434a.getMShakeAnim());
                            return;
                        }
                        return;
                    }
                    AbstractC73233l lVar = this.f164434a.f164428c;
                    if (lVar != null) {
                        lVar.mo115769a();
                    }
                    AbstractC73233l lVar2 = this.f164434a.f164428c;
                    if (lVar2 != null) {
                        lVar2.mo115770b();
                    }
                }
            });
        }
        this.f164431g = C89250i.m154773a((AbstractC89171a) new C73217b(context));
        MethodCollector.m26664o(12079);
    }

    public /* synthetic */ C73212g(Context context, byte b) {
        this(context);
    }
}
