package com.p2082ss.android.ugc.aweme.feed.trending;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.trending.TrendingCurChangeCallBack;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.trending.a */
public final class C49948a extends RecyclerView.ViewHolder {

    /* renamed from: e */
    public static final C49950a f115135e = new C49950a((byte) 0);

    /* renamed from: a */
    public ViewPropertyAnimator f115136a;

    /* renamed from: b */
    public Aweme f115137b;

    /* renamed from: c */
    public View f115138c;

    /* renamed from: d */
    public ActivityC0945e f115139d;

    /* renamed from: f */
    private TuxTextView f115140f;

    /* renamed from: g */
    private AbstractC88412b f115141g;

    static {
        Covode.recordClassIndex(59060);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.trending.a$a */
    public static final class C49950a {
        static {
            Covode.recordClassIndex(59062);
        }

        private C49950a() {
        }

        public /* synthetic */ C49950a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo84993a() {
        String str;
        Aweme aweme = this.f115137b;
        if (aweme != null) {
            aweme.getAid();
        }
        AbstractC88412b bVar = this.f115141g;
        if (bVar != null) {
            bVar.dispose();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f115136a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        View view = this.f115138c;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f115138c;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        TuxTextView tuxTextView = this.f115140f;
        if (tuxTextView != null) {
            Aweme aweme2 = this.f115137b;
            if (aweme2 != null) {
                str = aweme2.getTrendingName();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
    }

    /* renamed from: b */
    public final void mo84994b() {
        this.f115141g = AbstractC88979t.m154310b("").mo143295e(1000, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C49951b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.trending.a$b */
    public static final class C49951b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C49948a f115143a;

        static {
            Covode.recordClassIndex(59063);
        }

        C49951b(C49948a aVar) {
            this.f115143a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ViewPropertyAnimator viewPropertyAnimator;
            Aweme aweme = this.f115143a.f115137b;
            if (aweme != null) {
                aweme.getAid();
            }
            View view = this.f115143a.f115138c;
            if (view == null || view.getVisibility() != 8) {
                C49948a aVar = this.f115143a;
                View view2 = aVar.f115138c;
                if (view2 != null) {
                    viewPropertyAnimator = view2.animate();
                } else {
                    viewPropertyAnimator = null;
                }
                aVar.f115136a = viewPropertyAnimator;
                ViewPropertyAnimator viewPropertyAnimator2 = this.f115143a.f115136a;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.setDuration(100);
                    viewPropertyAnimator2.alpha(0.0f);
                    viewPropertyAnimator2.start();
                    viewPropertyAnimator2.setListener(new AnimatorListenerAdapter(this) {
                        /* class com.p2082ss.android.ugc.aweme.feed.trending.C49948a.C49951b.C499521 */

                        /* renamed from: a */
                        final /* synthetic */ C49951b f115144a;

                        static {
                            Covode.recordClassIndex(59064);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f115144a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            View view = this.f115144a.f115143a.f115138c;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            Aweme aweme = this.f115144a.f115143a.f115137b;
                            if (aweme != null) {
                                aweme.getAid();
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.trending.a$c */
    static final class C49953c extends AbstractC89220m implements AbstractC89183m<Aweme, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C49948a f115145a;

        static {
            Covode.recordClassIndex(59065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49953c(C49948a aVar) {
            super(2);
            this.f115145a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Aweme aweme, Boolean bool) {
            String str;
            Aweme aweme2 = aweme;
            boolean booleanValue = bool.booleanValue();
            if (aweme2 != null) {
                Aweme aweme3 = this.f115145a.f115137b;
                if (aweme3 != null) {
                    str = aweme3.getAid();
                } else {
                    str = null;
                }
                if (!(!C89219l.m154714a((Object) str, (Object) aweme2.getAid()))) {
                    Aweme aweme4 = this.f115145a.f115137b;
                    if (aweme4 != null) {
                        aweme4.getAid();
                    }
                    Aweme aweme5 = this.f115145a.f115137b;
                    if (aweme5 != null) {
                        aweme5.getDesc();
                    }
                    if (booleanValue) {
                        this.f115145a.mo84993a();
                    } else {
                        View view = this.f115145a.f115138c;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49948a(View view, ActivityC0945e eVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        this.f115139d = eVar;
        this.f115138c = view.findViewById(R.id.ens);
        this.f115140f = (TuxTextView) view.findViewById(R.id.ent);
        ActivityC0945e eVar2 = this.f115139d;
        C49953c cVar = new C49953c(this);
        C89219l.m154721d(eVar2, "");
        C89219l.m154721d(eVar2, "");
        C89219l.m154721d(cVar, "");
        TrendingCurChangeCallBack.C49946a.m93789a(eVar2).observe(eVar2, new TrendingCurChangeCallBack.C49946a.C49947a(cVar));
        View view2 = this.f115138c;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.trending.C49948a.View$OnClickListenerC499491 */

                /* renamed from: a */
                final /* synthetic */ C49948a f115142a;

                static {
                    Covode.recordClassIndex(59061);
                }

                {
                    this.f115142a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    View view2 = this.f115142a.f115138c;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
            });
        }
    }
}
