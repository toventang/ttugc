package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.widget.C23409b;
import com.bytedance.tux.widget.VisualLayout;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36405d;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39112b;
import com.p2082ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.br */
public final class C37057br extends C39112b {

    /* renamed from: b */
    public static final C37062c f87311b = new C37062c((byte) 0);

    /* renamed from: a */
    public AbstractC37063d f87312a;

    /* renamed from: c */
    private CommentRethinkPopup f87313c;

    /* renamed from: d */
    private SparseArray f87314d;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.br$a */
    static final class C37058a {

        /* renamed from: c */
        public static final C37059a f87315c = new C37059a((byte) 0);

        /* renamed from: a */
        final List<C37061b> f87316a = new ArrayList();

        /* renamed from: b */
        final Context f87317b;

        static {
            Covode.recordClassIndex(44412);
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.ui.br$a$a */
        public static final class C37059a {
            static {
                Covode.recordClassIndex(44413);
            }

            private C37059a() {
            }

            public /* synthetic */ C37059a(byte b) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.ui.br$a$b */
        static final class View$OnClickListenerC37060b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C37061b f87318a;

            /* renamed from: b */
            final /* synthetic */ C23409b f87319b;

            /* renamed from: c */
            final /* synthetic */ C37058a f87320c;

            static {
                Covode.recordClassIndex(44414);
            }

            View$OnClickListenerC37060b(C37061b bVar, C23409b bVar2, C37058a aVar) {
                this.f87318a = bVar;
                this.f87319b = bVar2;
                this.f87320c = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC89171a<C89391z> aVar = this.f87318a.f87323c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public C37058a(Context context) {
            C89219l.m154721d(context, "");
            this.f87317b = context;
        }

        /* renamed from: a */
        static TuxButton m74749a(Context context) {
            TuxButton tuxButton = new TuxButton(context, null, 0, 6);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            tuxButton.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, C89241a.m154730a(TypedValue.applyDimension(1, 47.5f, system.getDisplayMetrics()))));
            tuxButton.setGravity(17);
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            tuxButton.setPadding(a, 0, C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())), 0);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(C0643b.m2378c(context, R.color.j)));
            stateListDrawable.addState(new int[0], new ColorDrawable(C0643b.m2378c(context, R.color.l)));
            tuxButton.setBackground(stateListDrawable);
            return tuxButton;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.br$d */
    public interface AbstractC37063d {
        static {
            Covode.recordClassIndex(44417);
        }

        /* renamed from: a */
        void mo63310a();

        /* renamed from: b */
        void mo63311b();

        /* renamed from: c */
        void mo63312c();
    }

    static {
        Covode.recordClassIndex(44411);
    }

    /* renamed from: a */
    public final View mo64561a(int i) {
        if (this.f87314d == null) {
            this.f87314d = new SparseArray();
        }
        View view = (View) this.f87314d.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f87314d.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.br$c */
    public static final class C37062c {
        static {
            Covode.recordClassIndex(44416);
        }

        private C37062c() {
        }

        public /* synthetic */ C37062c(byte b) {
            this();
        }

        /* renamed from: a */
        public static C37057br m74750a(CommentRethinkPopup commentRethinkPopup) {
            C89219l.m154721d(commentRethinkPopup, "");
            C37057br brVar = new C37057br();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_comment_rethink_popup", commentRethinkPopup);
            brVar.setArguments(bundle);
            return brVar;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f87314d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.br$e */
    static final class C37064e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C37057br f87324a;

        static {
            Covode.recordClassIndex(44418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37064e(C37057br brVar) {
            super(0);
            this.f87324a = brVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC37063d dVar = this.f87324a.f87312a;
            if (dVar != null) {
                dVar.mo63311b();
            }
            this.f87324a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.br$f */
    static final class C37065f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C37057br f87325a;

        static {
            Covode.recordClassIndex(44419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37065f(C37057br brVar) {
            super(0);
            this.f87325a = brVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC37063d dVar = this.f87325a.f87312a;
            if (dVar != null) {
                dVar.mo63310a();
            }
            this.f87325a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        CommentRethinkPopup commentRethinkPopup = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_comment_rethink_popup");
        } else {
            serializable = null;
        }
        if (serializable instanceof CommentRethinkPopup) {
            commentRethinkPopup = serializable;
        }
        this.f87313c = commentRethinkPopup;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.br$g */
    public static final class C37066g extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C37057br f87326a;

        /* renamed from: b */
        final /* synthetic */ CommentRethinkPopup f87327b;

        static {
            Covode.recordClassIndex(44420);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            if (this.f87326a.getContext() != null) {
                TuxTextView tuxTextView = (TuxTextView) this.f87326a.mo64561a(R.id.ere);
                C89219l.m154716b(tuxTextView, "");
                textPaint.setColor(C0643b.m2378c(tuxTextView.getContext(), R.color.bx));
            }
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C29844g gVar = new C29844g(this.f87327b.getLink());
            gVar.mo52130a("lang", LocalServiceImpl.m108272a().mo96421a(this.f87326a.getActivity()));
            SmartRouter.buildRoute(this.f87326a.getActivity(), "aweme://webview/").withParam("url", gVar.mo52126a()).open();
            AbstractC37063d dVar = this.f87326a.f87312a;
            if (dVar != null) {
                dVar.mo63312c();
            }
        }

        C37066g(C37057br brVar, CommentRethinkPopup commentRethinkPopup) {
            this.f87326a = brVar;
            this.f87327b = commentRethinkPopup;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog;
        Context context = getContext();
        if (context != null) {
            onCreateDialog = new Dialog(context, R.style.us);
        } else {
            onCreateDialog = super.onCreateDialog(bundle);
            C89219l.m154716b(onCreateDialog, "");
        }
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getAttributes().width = -1;
            window.getAttributes().height = -1;
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        TuxButton a;
        MethodCollector.m26663i(7952);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            dismiss();
            MethodCollector.m26664o(7952);
            return;
        }
        C37058a aVar = new C37058a(context);
        String string = getString(R.string.l);
        C89219l.m154716b(string, "");
        C37064e eVar = new C37064e(this);
        C89219l.m154721d(string, "");
        aVar.f87316a.add(new C37061b(0, string, eVar));
        String string2 = getString(R.string.k);
        C89219l.m154716b(string2, "");
        C37065f fVar = new C37065f(this);
        C89219l.m154721d(string2, "");
        aVar.f87316a.add(new C37061b(1, string2, fVar));
        LinearLayout linearLayout = (LinearLayout) mo64561a(R.id.bnv);
        C23409b bVar = new C23409b(aVar.f87317b, (byte) 0);
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bVar.setForceVertical(false);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        bVar.setDividerLineSize(C89241a.m154730a(TypedValue.applyDimension(1, 0.5f, system.getDisplayMetrics())));
        bVar.setDividerLine(new ColorDrawable(C0643b.m2378c(bVar.getContext(), R.color.b6)));
        Context context2 = bVar.getContext();
        C89219l.m154716b(context2, "");
        if (C23163i.m43663a(context2)) {
            C0792v.m2759b((View) bVar, 0);
        } else {
            C0792v.m2759b((View) bVar, 1);
        }
        int i = 0;
        for (T t : aVar.f87316a) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            if (t2.f87321a != 1) {
                a = C37058a.m74749a(aVar.f87317b);
                a.setTextColor(C0643b.m2378c(a.getContext(), R.color.bx));
                a.setTuxFont(43);
            } else {
                a = C37058a.m74749a(aVar.f87317b);
                a.setTextColor(C0643b.m2378c(a.getContext(), R.color.c4));
                a.setTuxFont(41);
            }
            a.setText(t2.f87322b);
            a.setOnClickListener(new C37058a.View$OnClickListenerC37060b(t2, bVar, aVar));
            bVar.addView(a);
            i = i2;
        }
        linearLayout.addView(bVar);
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
        VisualLayout visualLayout = (VisualLayout) mo64561a(R.id.dnc);
        C89219l.m154716b(visualLayout, "");
        ViewGroup.LayoutParams layoutParams = visualLayout.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (C36405d.m74107a() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((VisualLayout) mo64561a(R.id.dnc)).setRadius(a2);
            if (layoutParams2 != null) {
                int b = (int) C13628n.m24520b(getContext(), 360.0f);
                double a3 = (double) C13628n.m24504a(getContext());
                Double.isNaN(a3);
                int i3 = (int) (a3 * 0.8d);
                if (i3 <= b) {
                    b = i3;
                }
                layoutParams2.width = b;
                layoutParams2.gravity = 17;
                VisualLayout visualLayout2 = (VisualLayout) mo64561a(R.id.dnc);
                C89219l.m154716b(visualLayout2, "");
                visualLayout2.setLayoutParams(layoutParams2);
            }
            TuxTextView tuxTextView = (TuxTextView) mo64561a(R.id.bfo);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
        } else {
            ((VisualLayout) mo64561a(R.id.dnc)).setTopLeftRadius(a2);
            ((VisualLayout) mo64561a(R.id.dnc)).setTopRightRadius(a2);
            if (layoutParams2 != null) {
                layoutParams2.gravity = 80;
                VisualLayout visualLayout3 = (VisualLayout) mo64561a(R.id.dnc);
                C89219l.m154716b(visualLayout3, "");
                visualLayout3.setLayoutParams(layoutParams2);
            }
            TuxTextView tuxTextView2 = (TuxTextView) mo64561a(R.id.bfo);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(4);
            Space space = new Space(context);
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            space.setLayoutParams(new LinearLayout.LayoutParams(-1, C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system3.getDisplayMetrics()))));
            ((LinearLayout) mo64561a(R.id.bnv)).addView(space);
        }
        CommentRethinkPopup commentRethinkPopup = this.f87313c;
        if (commentRethinkPopup == null) {
            commentRethinkPopup = new CommentRethinkPopup(null, null, null, null, 15, null);
        }
        if (TextUtils.isEmpty(commentRethinkPopup.getTitle()) || TextUtils.isEmpty(commentRethinkPopup.getBody()) || TextUtils.isEmpty(commentRethinkPopup.getHighlight())) {
            String string3 = getString(R.string.al_);
            C89219l.m154716b(string3, "");
            commentRethinkPopup.setTitle(string3);
            String string4 = getString(R.string.al8);
            C89219l.m154716b(string4, "");
            commentRethinkPopup.setBody(string4);
            String string5 = getString(R.string.al9);
            C89219l.m154716b(string5, "");
            commentRethinkPopup.setHighlight(string5);
        }
        String a4 = C1764a.m5928a(commentRethinkPopup.getBody(), Arrays.copyOf(new Object[]{commentRethinkPopup.getHighlight()}, 1));
        C89219l.m154716b(a4, "");
        int a5 = C89361p.m154888a((CharSequence) a4, commentRethinkPopup.getHighlight(), 0, false, 6);
        SpannableString spannableString = new SpannableString(a4);
        if (a5 >= 0) {
            int length = commentRethinkPopup.getHighlight().length() + a5;
            spannableString.setSpan(new StyleSpan(1), a5, length, 18);
            if (!TextUtils.isEmpty(commentRethinkPopup.getLink())) {
                spannableString.setSpan(new C37066g(this, commentRethinkPopup), a5, length, 18);
                TuxTextView tuxTextView3 = (TuxTextView) mo64561a(R.id.ere);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        TuxTextView tuxTextView4 = (TuxTextView) mo64561a(R.id.ers);
        C89219l.m154716b(tuxTextView4, "");
        tuxTextView4.setText(commentRethinkPopup.getTitle());
        TuxTextView tuxTextView5 = (TuxTextView) mo64561a(R.id.ere);
        C89219l.m154716b(tuxTextView5, "");
        tuxTextView5.setText(spannableString);
        MethodCollector.m26664o(7952);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.br$b */
    static final class C37061b {

        /* renamed from: a */
        public final int f87321a;

        /* renamed from: b */
        public final CharSequence f87322b;

        /* renamed from: c */
        public final AbstractC89171a<C89391z> f87323c;

        static {
            Covode.recordClassIndex(44415);
        }

        public C37061b(int i, CharSequence charSequence, AbstractC89171a<C89391z> aVar) {
            C89219l.m154721d(charSequence, "");
            this.f87321a = i;
            this.f87322b = charSequence;
            this.f87323c = aVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        setCancelable(false);
        return C1764a.m5927a(layoutInflater, R.layout.i6, viewGroup, false);
    }
}
