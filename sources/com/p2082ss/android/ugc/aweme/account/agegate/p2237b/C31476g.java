package com.p2082ss.android.ugc.aweme.account.agegate.p2237b;

import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.AgeGateService;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.login.p2258c.AbstractC31895a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;
import com.p2082ss.android.ugc.aweme.account.views.C33064a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.services.IWebViewService;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.share.ShareServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.b.g */
public final class C31476g extends AbstractC34586a implements AbstractC31895a {

    /* renamed from: a */
    public static final C31477a f75327a = new C31477a((byte) 0);

    /* renamed from: b */
    private HashMap f75328b;

    static {
        Covode.recordClassIndex(38193);
    }

    /* renamed from: a */
    private View m65703a(int i) {
        if (this.f75328b == null) {
            this.f75328b = new HashMap();
        }
        View view = (View) this.f75328b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75328b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.g$a */
    public static final class C31477a {
        static {
            Covode.recordClassIndex(38194);
        }

        private C31477a() {
        }

        public /* synthetic */ C31477a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f75328b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.g$c */
    public static final class C31479c extends AbstractC33066c {

        /* renamed from: a */
        final /* synthetic */ C31476g f75331a;

        /* renamed from: b */
        final /* synthetic */ int f75332b;

        /* renamed from: c */
        final /* synthetic */ int f75333c;

        static {
            Covode.recordClassIndex(38196);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            if (this.f75331a.getContext() != null) {
                IWebViewService iWebViewService = (IWebViewService) C31291a.m65463a(IWebViewService.class);
                Context context = this.f75331a.getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context, "");
                iWebViewService.mo60088a(context, "https://www.tiktok.com/en/privacy-policy-for-younger-users");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31479c(C31476g gVar, int i, int i2, int i3, int i4) {
            super(i3, i4);
            this.f75331a = gVar;
            this.f75332b = i;
            this.f75333c = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.g$d */
    public static final class C31480d extends AbstractC33066c {

        /* renamed from: a */
        final /* synthetic */ C31476g f75334a;

        /* renamed from: b */
        final /* synthetic */ int f75335b;

        /* renamed from: c */
        final /* synthetic */ int f75336c;

        static {
            Covode.recordClassIndex(38197);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            if (this.f75334a.getContext() != null) {
                IWebViewService iWebViewService = (IWebViewService) C31291a.m65463a(IWebViewService.class);
                Context context = this.f75334a.getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context, "");
                iWebViewService.mo60088a(context, "https://www.tiktok.com/en/terms-of-use");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31480d(C31476g gVar, int i, int i2, int i3, int i4) {
            super(i3, i4);
            this.f75334a = gVar;
            this.f75335b = i;
            this.f75336c = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.g$b */
    static final class View$OnClickListenerC31478b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31476g f75329a;

        /* renamed from: b */
        final /* synthetic */ AgeGateResponse f75330b;

        static {
            Covode.recordClassIndex(38195);
        }

        View$OnClickListenerC31478b(C31476g gVar, AgeGateResponse ageGateResponse) {
            this.f75329a = gVar;
            this.f75330b = ageGateResponse;
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            C31376a a = new C31376a().mo57399a("enter_method", "pop_up").mo57397a("pass_export", 1);
            AgeGateResponse ageGateResponse = this.f75330b;
            if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 0) {
                i = 0;
            } else {
                i = 1;
            }
            C39162r.m79460a("age_gate_complete_click", a.mo57397a("pass_gate", i).f75156a);
            ActivityC0945e activity = this.f75329a.getActivity();
            if (activity != null) {
                activity.setResult(-1);
            }
            AgeGateResponse ageGateResponse2 = this.f75330b;
            if (ageGateResponse2 == null || ageGateResponse2.getAgeGatePostAction() != 0) {
                Context j = C17873f.m33102j();
                if (j == null) {
                    j = C17867d.m33078a();
                }
                C39223a.m79603q().mo68626a(j);
                ShareServiceImpl.m121448d().mo109407a(C17867d.m33078a(), true);
            } else {
                AgeGateService c = C36085cj.m73549c();
                String str = C31566h.f75502a;
                if (str == null) {
                    str = "";
                }
                c.mo57395a(str, true);
                C31566h.m65848a();
                ShareServiceImpl.m121448d().mo109407a(C17867d.m33078a(), false);
            }
            ActivityC0945e activity2 = this.f75329a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        int i;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("age_gate_response");
        } else {
            serializable = null;
        }
        AgeGateResponse ageGateResponse = (AgeGateResponse) serializable;
        if (ageGateResponse != null) {
            if (ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.is_prompt()) {
                ((TuxTextView) m65703a(R.id.ajd)).setText(R.string.c2d);
            } else if (ageGateResponse.getAgeGatePostAction() == 1) {
                String string = getString(R.string.c2f);
                C89219l.m154716b(string, "");
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(getString(R.string.c2e, string));
                newSpannable.setSpan(new ForegroundColorSpan(C0643b.m2378c(view.getContext(), R.color.bx)), newSpannable.length() - string.length(), newSpannable.length(), 17);
                TuxTextView tuxTextView = (TuxTextView) m65703a(R.id.ajd);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(newSpannable);
                ImageView imageView = (ImageView) m65703a(R.id.cgw);
                C89219l.m154716b(imageView, "");
                imageView.getLayoutParams().width = (C13628n.m24504a(getContext()) * 160) / 375;
                ImageView imageView2 = (ImageView) m65703a(R.id.cgw);
                C89219l.m154716b(imageView2, "");
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                ImageView imageView3 = (ImageView) m65703a(R.id.cgw);
                C89219l.m154716b(imageView3, "");
                layoutParams.height = imageView3.getLayoutParams().width;
                Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(getString(R.string.c2g));
                String string2 = getString(R.string.c2h);
                C89219l.m154716b(string2, "");
                String string3 = getString(R.string.c2i);
                C89219l.m154716b(string3, "");
                String string4 = getString(R.string.c2g);
                C89219l.m154716b(string4, "");
                int a = C89361p.m154888a((CharSequence) string4, string2, 0, false, 6);
                String string5 = getString(R.string.c2g);
                C89219l.m154716b(string5, "");
                int a2 = C89361p.m154888a((CharSequence) string5, string3, 0, false, 6);
                if (a < 0 || a2 < 0) {
                    JSONObject a3 = new C33743c().mo59976a("enter_from", "ftc_complete").mo59977a();
                    C89219l.m154716b(a3, "");
                    C32837b.m67404a("text_highlight_not_match", "", a3);
                }
                int c = C0643b.m2378c(view.getContext(), R.color.gq);
                int c2 = C0643b.m2378c(view.getContext(), R.color.lj);
                C31479c cVar = new C31479c(this, c, c2, c, c2);
                C31480d dVar = new C31480d(this, c, c2, c, c2);
                newSpannable2.setSpan(cVar, a, string2.length() + a, 17);
                newSpannable2.setSpan(dVar, a2, string3.length() + a2, 17);
                TextView textView = (TextView) view.findViewById(R.id.d6j);
                C89219l.m154716b(textView, "");
                textView.setText(newSpannable2);
                textView.setVisibility(0);
                textView.setMovementMethod(C33064a.m67722a());
                ((TuxTextView) m65703a(R.id.abo)).setOnClickListener(new View$OnClickListenerC31478b(this, ageGateResponse));
                C31376a a4 = new C31376a().mo57399a("enter_method", "pop_up");
                if (ageGateResponse == null && ageGateResponse.getAgeGatePostAction() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                C39162r.m79460a("age_gate_complete", a4.mo57397a("pass_gate", i).mo57397a("pass_export", 1).f75156a);
            }
        }
        ((TuxTextView) m65703a(R.id.abo)).setOnClickListener(new View$OnClickListenerC31478b(this, ageGateResponse));
        C31376a a42 = new C31376a().mo57399a("enter_method", "pop_up");
        if (ageGateResponse == null) {
        }
        i = 0;
        C39162r.m79460a("age_gate_complete", a42.mo57397a("pass_gate", i).mo57397a("pass_export", 1).f75156a);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ga, viewGroup, false);
    }
}
