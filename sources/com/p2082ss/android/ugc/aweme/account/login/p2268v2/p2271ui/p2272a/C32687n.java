package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AccountKeyBoardHelper;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32783f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.util.C33038h;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.n */
public final class C32687n extends AbstractC32613a {

    /* renamed from: a */
    public EditText f77940a;

    /* renamed from: b */
    private HashMap f77941b;

    static {
        Covode.recordClassIndex(39466);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77941b == null) {
            this.f77941b = new HashMap();
        }
        View view = (View) this.f77941b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77941b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hl;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77941b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.bo9)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        ((LoadingButton) mo57434c(R.id.bo9)).mo58776a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.n$c */
    static final class CallableC32690c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C32687n f77944a;

        static {
            Covode.recordClassIndex(39469);
        }

        CallableC32690c(C32687n nVar) {
            this.f77944a = nVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f77944a);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.TWO_FACTOR_AUTH;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32687n.CallableC32690c.C326911 */

                /* renamed from: a */
                final /* synthetic */ CallableC32690c f77945a;

                static {
                    Covode.recordClassIndex(39470);
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27202a(List<Integer> list) {
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27203a(List<Integer> list, int i) {
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27201a() {
                    if (this.f77945a.f77944a.getActivity() != null) {
                        ActivityC0945e activity = this.f77945a.f77944a.getActivity();
                        if (!(activity instanceof AbstractActivityC32568a)) {
                            activity = null;
                        }
                        AbstractActivityC32568a aVar = (AbstractActivityC32568a) activity;
                        if (aVar != null && !aVar.isFinishing()) {
                            ActivityC0945e activity2 = this.f77945a.f77944a.getActivity();
                            if (activity2 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(activity2, "");
                            ((C23023b) C23028c.m43435a(new C23023b(activity2).mo37411b(this.f77945a.f77944a.getString(R.string.gy4)).mo37413d(this.f77945a.f77944a.getString(R.string.gy2)), new C32692a(this)).mo37482a(false)).mo37405a().mo37396b().show();
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f77945a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.n$c$1$a */
                static final class C32692a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C326911 f77946a;

                    static {
                        Covode.recordClassIndex(39471);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C32692a(C326911 r2) {
                        super(1);
                        this.f77946a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23025b bVar) {
                        C23025b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        String string = this.f77946a.f77945a.f77944a.getString(R.string.gy1);
                        C89219l.m154716b(string, "");
                        bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32687n.CallableC32690c.C326911.C32692a.C326931 */

                            /* renamed from: a */
                            final /* synthetic */ C32692a f77947a;

                            static {
                                Covode.recordClassIndex(39472);
                            }

                            {
                                this.f77947a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                C29844g gVar = new C29844g("aweme://i18n_feedback_input");
                                gVar.mo52130a("feedback_id", "5695");
                                SmartRouter.buildRoute(this.f77947a.f77946a.f77945a.f77944a.getActivity(), gVar.mo52126a()).open();
                                C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TWO_FACTOR_AUTH);
                                return C89391z.f203057a;
                            }
                        });
                        String string2 = this.f77946a.f77945a.f77944a.getString(R.string.as_);
                        C89219l.m154716b(string2, "");
                        bVar2.mo37419b(string2, C326942.f77948a);
                        bVar2.f54513b = true;
                        return C89391z.f203057a;
                    }
                }
            }));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: f */
    public final void mo58496f() {
        super.mo58496f();
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.bo7);
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: u */
    public final void mo58497u() {
        super.mo58497u();
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.bo7);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (AccountKeyBoardHelper.C32598a.m67091a()) {
            EditText editText = this.f77940a;
            if (editText == null) {
                C89219l.m154710a("emailInput");
            }
            C32776c.m67375a(editText);
            return;
        }
        EditText editText2 = this.f77940a;
        if (editText2 == null) {
            C89219l.m154710a("emailInput");
        }
        editText2.requestFocus();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b mo57457p() {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32687n.mo57457p():com.ss.android.ugc.aweme.account.login.v2.ui.b");
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.n$a */
    public static final class C32688a extends C34699o {

        /* renamed from: a */
        final /* synthetic */ C32687n f77942a;

        static {
            Covode.recordClassIndex(39467);
        }

        C32688a(C32687n nVar) {
            this.f77942a = nVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            InputResultIndicator inputResultIndicator;
            LoadingButton loadingButton = (LoadingButton) this.f77942a.mo57434c(R.id.bo9);
            if (loadingButton != null) {
                EditText editText = this.f77942a.f77940a;
                if (editText == null) {
                    C89219l.m154710a("emailInput");
                }
                loadingButton.setEnabled(!TextUtils.isEmpty(editText.getText()));
            }
            View c = this.f77942a.mo57434c(R.id.bo8);
            if (c != null && (inputResultIndicator = (InputResultIndicator) c.findViewById(R.id.boo)) != null) {
                inputResultIndicator.mo58481a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.n$d */
    static final class C32695d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32687n f77949a;

        /* renamed from: b */
        final /* synthetic */ String f77950b;

        static {
            Covode.recordClassIndex(39474);
        }

        C32695d(C32687n nVar, String str) {
            this.f77949a = nVar;
            this.f77950b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77949a.mo58534a(this.f77950b, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.n$b */
    static final class View$OnClickListenerC32689b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32687n f77943a;

        static {
            Covode.recordClassIndex(39468);
        }

        View$OnClickListenerC32689b(C32687n nVar) {
            this.f77943a = nVar;
        }

        public final void onClick(View view) {
            C32308a aVar;
            ClickAgent.onClick(view);
            C32687n nVar = this.f77943a;
            EditText editText = nVar.f77940a;
            if (editText == null) {
                C89219l.m154710a("emailInput");
            }
            String obj = editText.getText().toString();
            TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(nVar.getActivity(), obj, nVar.mo58458A());
            if (a != null && (aVar = a.f77750a) != null && aVar.mo58388d()) {
                nVar.mo58534a(obj, false);
            } else if (!C33038h.m67672a(obj)) {
                View c = nVar.mo57434c(R.id.bo8);
                C89219l.m154716b(c, "");
                String string = nVar.getString(R.string.apo);
                C89219l.m154716b(string, "");
                ((InputResultIndicator) c.findViewById(R.id.boo)).mo58482a(string);
            } else {
                C32407x.m66788a(nVar, obj, 4, "user_click", (Map) null, (String) null, 112).mo143251d(new C32695d(nVar, obj)).mo143246c();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        InputResultIndicator inputResultIndicator;
        C89219l.m154721d(str, "");
        View c = mo57434c(R.id.bo8);
        if (!(c == null || (inputResultIndicator = (InputResultIndicator) c.findViewById(R.id.boo)) == null)) {
            inputResultIndicator.mo58482a(str);
        }
        if (i == 1356) {
            C1731i.m5640b(new CallableC32690c(this), C1731i.f5564c);
        }
    }

    /* renamed from: a */
    public final void mo58534a(String str, boolean z) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C32582d.m67063a(this, str);
        arguments.putBoolean("code_sent", z);
        arguments.putInt("next_page", EnumC32594j.EMAIL_SMS_FIND_PASSWORD.getValue());
        C89219l.m154716b(arguments, "");
        mo58461a(arguments);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        EditText editText = ((InputWithIndicator) mo57434c(R.id.bon)).getEditText();
        this.f77940a = editText;
        if (editText == null) {
            C89219l.m154710a("emailInput");
        }
        editText.setInputType(32);
        editText.addTextChangedListener(new C32688a(this));
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.aow));
        String a = C32582d.m67060a(this);
        if (!TextUtils.isEmpty(a)) {
            editText.setText(a);
            editText.setSelection(a.length());
        }
        mo58495a(mo57434c(R.id.bo9), new View$OnClickListenerC32689b(this));
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.bo7);
        C89219l.m154716b(recyclerView, "");
        EditText editText2 = this.f77940a;
        if (editText2 == null) {
            C89219l.m154710a("emailInput");
        }
        String w = mo58466w();
        C89219l.m154716b(w, "");
        String x = mo58467x();
        C89219l.m154716b(x, "");
        C32783f.C32787c.m67382a(recyclerView, editText2, w, x);
    }
}
