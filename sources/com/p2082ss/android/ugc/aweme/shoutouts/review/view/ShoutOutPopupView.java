package com.p2082ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView */
public final class ShoutOutPopupView extends LinearLayout {

    /* renamed from: a */
    public View f167671a;

    /* renamed from: b */
    public View f167672b;

    /* renamed from: c */
    public TuxButton f167673c;

    /* renamed from: d */
    public AbstractC89172b<? super AbstractC89171a<C89391z>, C89391z> f167674d;

    /* renamed from: e */
    public AbstractC89171a<C89391z> f167675e;

    static {
        Covode.recordClassIndex(87374);
    }

    public ShoutOutPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.a62);
        C89219l.m154716b(findViewById, "");
        this.f167671a = findViewById;
        View findViewById2 = findViewById(R.id.a5z);
        C89219l.m154716b(findViewById2, "");
        this.f167672b = findViewById2;
        View findViewById3 = findViewById(R.id.f1d);
        C89219l.m154716b(findViewById3, "");
        this.f167673c = (TuxButton) findViewById3;
    }

    public final void setPostIntroVideoListener(AbstractC89172b<? super AbstractC89171a<C89391z>, C89391z> bVar) {
        this.f167674d = bVar;
    }

    public final void setGotoSeeNewRequestListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f167675e = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView$a */
    public static final class View$OnClickListenerC74567a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutOutPopupView f167676a;

        static {
            Covode.recordClassIndex(87375);
        }

        public View$OnClickListenerC74567a(ShoutOutPopupView shoutOutPopupView) {
            this.f167676a = shoutOutPopupView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a<C89391z> aVar = this.f167676a.f167675e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxButton m130988a(ShoutOutPopupView shoutOutPopupView) {
        TuxButton tuxButton = shoutOutPopupView.f167673c;
        if (tuxButton == null) {
            C89219l.m154710a("clPostView");
        }
        return tuxButton;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView$b */
    public static final class View$OnClickListenerC74568b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutOutPopupView f167677a;

        static {
            Covode.recordClassIndex(87376);
        }

        public View$OnClickListenerC74568b(ShoutOutPopupView shoutOutPopupView) {
            this.f167677a = shoutOutPopupView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f167677a.f167671a;
            if (view2 == null) {
                C89219l.m154710a("clPostIntroView");
            }
            view2.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView$c */
    public static final class View$OnClickListenerC74569c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutOutPopupView f167678a;

        static {
            Covode.recordClassIndex(87377);
        }

        public View$OnClickListenerC74569c(ShoutOutPopupView shoutOutPopupView) {
            this.f167678a = shoutOutPopupView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ShoutOutPopupView.m130988a(this.f167678a).setLoading(true);
            AbstractC89172b<? super AbstractC89171a<C89391z>, C89391z> bVar = this.f167678a.f167674d;
            if (bVar != null) {
                bVar.invoke(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView.View$OnClickListenerC74569c.C745701 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC74569c f167679a;

                    static {
                        Covode.recordClassIndex(87378);
                    }

                    {
                        this.f167679a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        ShoutOutPopupView.m130988a(this.f167679a.f167678a).post(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView.View$OnClickListenerC74569c.C745701.RunnableC745711 */

                            /* renamed from: a */
                            final /* synthetic */ C745701 f167680a;

                            static {
                                Covode.recordClassIndex(87379);
                            }

                            {
                                this.f167680a = r1;
                            }

                            public final void run() {
                                ShoutOutPopupView.m130988a(this.f167680a.f167679a.f167678a).setLoading(false);
                            }
                        });
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    private /* synthetic */ ShoutOutPopupView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutOutPopupView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(102);
        MethodCollector.m26664o(102);
    }
}
