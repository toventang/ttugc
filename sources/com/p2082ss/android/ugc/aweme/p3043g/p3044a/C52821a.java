package com.p2082ss.android.ugc.aweme.p3043g.p3044a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52851e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.g.a.a */
public final class C52821a implements AbstractC52856g {

    /* renamed from: a */
    final ViewGroup f121525a;

    /* renamed from: b */
    public final AbstractC52851e f121526b;

    /* renamed from: c */
    public final AbstractC52855f f121527c;

    /* renamed from: d */
    public final AbstractC52855f f121528d;

    /* renamed from: e */
    public boolean f121529e;

    /* renamed from: f */
    public boolean f121530f;

    /* renamed from: g */
    public boolean f121531g;

    /* renamed from: h */
    public final Context f121532h;

    /* renamed from: i */
    public final ViewGroup f121533i;

    /* renamed from: j */
    private boolean f121534j = true;

    static {
        Covode.recordClassIndex(62221);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: a */
    public final void mo70355a() {
        this.f121534j = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: d */
    public final void mo70358d() {
        m97684g();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: f */
    public final void mo70360f() {
        m97684g();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: b */
    public final void mo70356b() {
        this.f121526b.mo88483b(AbstractC52851e.C52852a.C52854b.f121591a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.g.a.a$a */
    public static final class C52823a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52821a f121536a;

        static {
            Covode.recordClassIndex(62223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52823a(C52821a aVar) {
            super(0);
            this.f121536a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f121536a.f121527c.mo88484c(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3043g.p3044a.C52821a.C52823a.C528241 */

                /* renamed from: a */
                final /* synthetic */ C52823a f121537a;

                static {
                    Covode.recordClassIndex(62224);
                }

                {
                    this.f121537a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f121537a.f121536a.f121526b.mo88482a(AbstractC52851e.C52852a.C52853a.f121590a);
                    this.f121537a.f121536a.f121529e = false;
                    this.f121537a.f121536a.f121531g = false;
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.a$b */
    static final class C52825b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52821a f121538a;

        static {
            Covode.recordClassIndex(62225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52825b(C52821a aVar) {
            super(0);
            this.f121538a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f121538a.f121528d.mo88482a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3043g.p3044a.C52821a.C52825b.C528261 */

                /* renamed from: a */
                final /* synthetic */ C52825b f121539a;

                static {
                    Covode.recordClassIndex(62226);
                }

                {
                    this.f121539a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ C89391z invoke() {
                    this.f121539a.f121538a.f121529e = true;
                    this.f121539a.f121538a.f121530f = false;
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: g */
    private final void m97684g() {
        if (this.f121529e && !this.f121531g) {
            this.f121525a.clearAnimation();
            this.f121531g = true;
            this.f121528d.mo88484c(new C52823a(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: c */
    public final void mo70357c() {
        View findViewById = this.f121525a.findViewById(R.id.e6v);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.f121526b.mo88482a(AbstractC52851e.C52852a.C52853a.f121590a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g
    /* renamed from: e */
    public final void mo70359e() {
        if (!this.f121529e && !this.f121530f) {
            this.f121525a.clearAnimation();
            this.f121526b.mo88483b(AbstractC52851e.C52852a.C52854b.f121591a);
            this.f121530f = true;
            this.f121527c.mo88482a(new C52825b(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.a$c  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC52827c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C52821a f121540a;

        static {
            Covode.recordClassIndex(62227);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        animationAnimation$AnimationListenerC52827c(C52821a aVar) {
            this.f121540a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            if (!this.f121540a.f121529e) {
                this.f121540a.f121526b.mo88482a(AbstractC52851e.C52852a.C52853a.f121590a);
            }
        }
    }

    public C52821a(Context context, ViewGroup viewGroup) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        this.f121532h = context;
        this.f121533i = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.e6q);
        C89219l.m154716b(findViewById, "");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.f121525a = viewGroup2;
        this.f121526b = new C52828b(context, viewGroup2);
        this.f121527c = new C52832d(context, viewGroup2);
        this.f121528d = new C52829c(context, viewGroup2);
        viewGroup2.setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.p2082ss.android.ugc.aweme.p3043g.p3044a.C52821a.View$OnTouchListenerC528221 */

            /* renamed from: a */
            final /* synthetic */ C52821a f121535a;

            static {
                Covode.recordClassIndex(62222);
            }

            {
                this.f121535a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                MethodCollector.m26663i(13385);
                C89219l.m154716b(motionEvent, "");
                int action = motionEvent.getAction();
                if (action == 0) {
                    C52821a aVar = this.f121535a;
                    aVar.f121525a.clearAnimation();
                    if (!aVar.f121529e) {
                        aVar.f121526b.mo88483b(AbstractC52851e.C52852a.C52854b.f121591a);
                    }
                    aVar.f121525a.startAnimation(AnimationUtils.loadAnimation(aVar.f121532h, R.anim.b3));
                } else if (action == 1) {
                    C52821a aVar2 = this.f121535a;
                    aVar2.f121525a.clearAnimation();
                    Animation loadAnimation = AnimationUtils.loadAnimation(aVar2.f121532h, R.anim.b4);
                    loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC52827c(aVar2));
                    aVar2.f121525a.startAnimation(loadAnimation);
                }
                MethodCollector.m26664o(13385);
                return false;
            }
        });
    }
}
