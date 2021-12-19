package com.p2082ss.android.ugc.aweme.question.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.question.widget.a */
public final class C66579a extends PopupWindow {

    /* renamed from: a */
    public final Context f149696a;

    /* renamed from: b */
    public final View f149697b;

    /* renamed from: c */
    public final AbstractC66580a f149698c;

    /* renamed from: d */
    private final View f149699d;

    /* renamed from: com.ss.android.ugc.aweme.question.widget.a$a */
    public interface AbstractC66580a {
        static {
            Covode.recordClassIndex(78130);
        }

        /* renamed from: s */
        void mo105539s();
    }

    static {
        Covode.recordClassIndex(78129);
    }

    /* renamed from: com.ss.android.ugc.aweme.question.widget.a$e */
    public static final class RunnableC66584e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C66579a f149703a;

        static {
            Covode.recordClassIndex(78134);
        }

        public RunnableC66584e(C66579a aVar) {
            this.f149703a = aVar;
        }

        public final void run() {
            this.f149703a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.widget.a$d */
    public static final class RunnableC66583d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C66579a f149702a;

        static {
            Covode.recordClassIndex(78133);
        }

        public RunnableC66583d(C66579a aVar) {
            this.f149702a = aVar;
        }

        public final void run() {
            int i;
            C66579a aVar = this.f149702a;
            View view = aVar.f149697b;
            Context context = aVar.f149696a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar.showAtLocation(view, 80, 0, (int) (((float) i) + TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.widget.a$c */
    static final class View$OnClickListenerC66582c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66579a f149701a;

        static {
            Covode.recordClassIndex(78132);
        }

        View$OnClickListenerC66582c(C66579a aVar) {
            this.f149701a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC66580a aVar = this.f149701a.f149698c;
            if (aVar != null) {
                aVar.mo105539s();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.widget.a$b */
    static final class C66581b extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C66581b f149700a = new C66581b();

        static {
            Covode.recordClassIndex(78131);
        }

        C66581b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.a2);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66579a(Context context, View view, AbstractC66580a aVar) {
        super(context);
        int i;
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        MethodCollector.m26663i(10749);
        this.f149698c = aVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.aqm, (ViewGroup) null);
        this.f149699d = inflate;
        this.f149696a = context;
        this.f149697b = view;
        setContentView(inflate);
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            i = displayMetrics.widthPixels;
        } else {
            i = 0;
        }
        setWidth(i - (((int) C13628n.m24520b(context, 12.0f)) * 2));
        setHeight(-2);
        setTouchable(true);
        setFocusable(false);
        setOutsideTouchable(false);
        setAnimationStyle(R.style.a0m);
        C89219l.m154716b(inflate, "");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.ah3);
        C89219l.m154716b(constraintLayout, "");
        constraintLayout.setBackground(C23009f.m43397a(C66581b.f149700a).mo37389a(context));
        String string = C17879g.m33106c().getString(R.string.f3a);
        C89219l.m154716b(string, "");
        String a = C89361p.m154868a(C89361p.m154868a(string, "[", "<b><front>"), "]", "</front></b>");
        if (Build.VERSION.SDK_INT >= 24) {
            C89219l.m154716b(inflate, "");
            ((TuxTextView) inflate.findViewById(R.id.ah5)).setText(Html.fromHtml(a, 63));
        } else {
            C89219l.m154716b(inflate, "");
            ((TuxTextView) inflate.findViewById(R.id.ah5)).setText(Html.fromHtml(a));
        }
        C89219l.m154716b(inflate, "");
        ((TuxTextView) inflate.findViewById(R.id.ah5)).setOnClickListener(new View$OnClickListenerC66582c(this));
        setBackgroundDrawable(new ColorDrawable(0));
        MethodCollector.m26664o(10749);
    }
}
