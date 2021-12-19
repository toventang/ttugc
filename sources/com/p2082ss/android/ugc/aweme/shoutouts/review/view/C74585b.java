package com.p2082ss.android.ugc.aweme.shoutouts.review.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3905c.EnumC74550a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.b */
public final class C74585b extends LinearLayout {

    /* renamed from: a */
    public EnumC74550a f167723a;

    /* renamed from: b */
    public AbstractC74587a f167724b;

    /* renamed from: c */
    private final AbstractC89244h f167725c;

    /* renamed from: d */
    private final AbstractC89244h f167726d;

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.b$a */
    public interface AbstractC74587a {
        static {
            Covode.recordClassIndex(87401);
        }

        /* renamed from: a */
        void mo117187a(EnumC74550a aVar);
    }

    static {
        Covode.recordClassIndex(87399);
    }

    private final TuxTextView getBottomBtn() {
        return (TuxTextView) this.f167725c.getValue();
    }

    private final TuxTextView getTvAgeRestrict() {
        return (TuxTextView) this.f167726d.getValue();
    }

    public final EnumC74550a getCurrentStyle() {
        return this.f167723a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.b$b */
    static final class C74588b extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C74585b f167729a;

        static {
            Covode.recordClassIndex(87402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74588b(C74585b bVar) {
            super(0);
            this.f167729a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f167729a.findViewById(R.id.et1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.b$c */
    static final class C74589c extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C74585b f167730a;

        static {
            Covode.recordClassIndex(87403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74589c(C74585b bVar) {
            super(0);
            this.f167730a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f167730a.findViewById(R.id.ewz);
        }
    }

    public final void setReviewBottomBtnClickListener(AbstractC74587a aVar) {
        C89219l.m154721d(aVar, "");
        this.f167724b = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.b$d */
    static final class C74590d extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C74590d f167731a = new C74590d();

        static {
            Covode.recordClassIndex(87404);
        }

        C74590d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54462a = Integer.valueOf(Color.parseColor("#fe2c55"));
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54470i = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54471j = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            eVar2.f54472k = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            eVar2.f54473l = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.b$e */
    static final class C74591e extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74585b f167732a;

        static {
            Covode.recordClassIndex(87405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74591e(C74585b bVar) {
            super(1);
            this.f167732a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54462a = Integer.valueOf(C0643b.m2378c(this.f167732a.getContext(), R.color.bz));
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54470i = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54471j = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            eVar2.f54472k = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            eVar2.f54473l = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.b$g */
    static final class C74593g extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C74593g f167734a = new C74593g();

        static {
            Covode.recordClassIndex(87407);
        }

        C74593g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54462a = Integer.valueOf(Color.parseColor("#fe2c55"));
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54470i = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54471j = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            eVar2.f54472k = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            eVar2.f54473l = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C74585b(final Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(1957);
        this.f167725c = C89250i.m154773a((AbstractC89171a) new C74588b(this));
        this.f167726d = C89250i.m154773a((AbstractC89171a) new C74589c(this));
        C1764a.m5927a(LayoutInflater.from(context), R.layout.azu, this, true);
        getBottomBtn().setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.shoutouts.review.view.C74585b.View$OnClickListenerC745861 */

            /* renamed from: a */
            final /* synthetic */ C74585b f167727a;

            static {
                Covode.recordClassIndex(87400);
            }

            {
                this.f167727a = r1;
            }

            public final void onClick(View view) {
                EnumC74550a aVar;
                ClickAgent.onClick(view);
                if (this.f167727a.f167723a != null && this.f167727a.f167724b != null) {
                    AbstractC74587a aVar2 = this.f167727a.f167724b;
                    if (aVar2 == null) {
                        C89219l.m154715b();
                    }
                    EnumC74550a aVar3 = this.f167727a.f167723a;
                    if (aVar3 == null) {
                        C89219l.m154715b();
                    }
                    aVar2.mo117187a(aVar3);
                } else if (this.f167727a.f167723a != null && (aVar = this.f167727a.f167723a) != null && C74594c.f167735a[aVar.ordinal()] == 1) {
                    Context context = context;
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    new C23144b((Activity) context).mo37635a(this.f167727a.getResources().getString(R.string.fxb)).mo37637b();
                }
            }
        });
        MethodCollector.m26664o(1957);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.b$f */
    static final class C74592f extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74585b f167733a;

        static {
            Covode.recordClassIndex(87406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74592f(C74585b bVar) {
            super(1);
            this.f167733a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54462a = Integer.valueOf(C0643b.m2378c(this.f167733a.getContext(), R.color.l));
            eVar2.f54466e = Integer.valueOf(C0643b.m2378c(this.f167733a.getContext(), R.color.b6));
            eVar2.f54465d = 1;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54470i = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54471j = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            eVar2.f54472k = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            eVar2.f54473l = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo117265a(EnumC74550a aVar) {
        C89219l.m154721d(aVar, "");
        this.f167723a = aVar;
        int i = C74594c.f167736b[aVar.ordinal()];
        if (i == 1) {
            getBottomBtn().setTextColor(-1);
            TuxTextView bottomBtn = getBottomBtn();
            Context context = getContext();
            C89219l.m154716b(context, "");
            bottomBtn.setText(context.getResources().getString(R.string.fx2));
            TuxTextView bottomBtn2 = getBottomBtn();
            C23008e a = C23009f.m43397a(C74590d.f167731a);
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            bottomBtn2.setBackground(a.mo37389a(context2));
        } else if (i == 2 || i == 3) {
            getBottomBtn().setTextColor(-1);
            TuxTextView bottomBtn3 = getBottomBtn();
            C23008e a2 = C23009f.m43397a(new C74591e(this));
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            bottomBtn3.setBackground(a2.mo37389a(context3));
            if (aVar == EnumC74550a.CONSUMER_OUT_OF_SERVICE) {
                TuxTextView bottomBtn4 = getBottomBtn();
                Context context4 = getContext();
                C89219l.m154716b(context4, "");
                bottomBtn4.setText(context4.getResources().getText(R.string.fwj));
                return;
            }
            TuxTextView bottomBtn5 = getBottomBtn();
            Context context5 = getContext();
            C89219l.m154716b(context5, "");
            bottomBtn5.setText(context5.getResources().getString(R.string.fx2));
            TuxTextView tvAgeRestrict = getTvAgeRestrict();
            String string = getResources().getString(R.string.fxa);
            C89219l.m154716b(string, "");
            String a3 = C1764a.m5928a(string, Arrays.copyOf(new Object[]{"18"}, 1));
            C89219l.m154716b(a3, "");
            tvAgeRestrict.setText(a3);
            getTvAgeRestrict().setVisibility(0);
        } else if (i == 4) {
            getBottomBtn().setTextColor(Color.parseColor("#161823"));
            TuxTextView bottomBtn6 = getBottomBtn();
            Context context6 = getContext();
            C89219l.m154716b(context6, "");
            bottomBtn6.setText(context6.getResources().getString(R.string.fvt));
            TuxTextView bottomBtn7 = getBottomBtn();
            C23008e a4 = C23009f.m43397a(new C74592f(this));
            Context context7 = getContext();
            C89219l.m154716b(context7, "");
            bottomBtn7.setBackground(a4.mo37389a(context7));
        } else if (i == 5) {
            getBottomBtn().setTextColor(-1);
            TuxTextView bottomBtn8 = getBottomBtn();
            Context context8 = getContext();
            C89219l.m154716b(context8, "");
            bottomBtn8.setText(context8.getResources().getString(R.string.fvv));
            TuxTextView bottomBtn9 = getBottomBtn();
            C23008e a5 = C23009f.m43397a(C74593g.f167734a);
            Context context9 = getContext();
            C89219l.m154716b(context9, "");
            bottomBtn9.setBackground(a5.mo37389a(context9));
        }
    }

    public /* synthetic */ C74585b(Context context, byte b) {
        this(context);
    }
}
