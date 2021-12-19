package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22314a;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22419n;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.experiment.C31663o;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32405w;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32259r;
import com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s */
public final class C32276s extends AbstractView$OnClickListenerC32681m {

    /* renamed from: a */
    final AbstractC89244h f76984a = C89250i.m154773a((AbstractC89171a) new C32277a(this));

    /* renamed from: b */
    public String f76985b;

    /* renamed from: j */
    private final AbstractC89244h f76986j = C89250i.m154773a((AbstractC89171a) new C32287h(this));

    /* renamed from: k */
    private final AbstractC89244h f76987k = C89250i.m154773a((AbstractC89171a) new C32286g(this));

    /* renamed from: l */
    private final AbstractC89244h f76988l = C89250i.m154773a((AbstractC89171a) new C32288i(this));

    /* renamed from: m */
    private HashMap f76989m;

    static {
        Covode.recordClassIndex(39041);
    }

    /* renamed from: l */
    private String m66645l() {
        return (String) this.f76986j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f76989m == null) {
            this.f76989m = new HashMap();
        }
        View view = (View) this.f76989m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76989m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.g0;
    }

    /* renamed from: g */
    public final List<C32291t> mo57437g() {
        return (List) this.f76987k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f76989m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: k */
    public final String mo58274k() {
        return (String) this.f76988l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$j */
    public static final class C32289j implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C32276s f77002a;

        static {
            Covode.recordClassIndex(39054);
        }

        C32289j(C32276s sVar) {
            this.f77002a = sVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f77002a.mo58532t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$h */
    static final class C32287h extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32276s f77000a;

        static {
            Covode.recordClassIndex(39052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32287h(C32276s sVar) {
            super(0);
            this.f77000a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String mobile;
            C32291t tVar = (C32291t) this.f77000a.f76984a.getValue();
            if (tVar == null || (mobile = tVar.getMobile()) == null) {
                return "";
            }
            return mobile;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$i */
    static final class C32288i extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32276s f77001a;

        static {
            Covode.recordClassIndex(39053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32288i(C32276s sVar) {
            super(0);
            this.f77001a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f77001a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return arguments.getString("platform", "");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: e */
    public final C32680l mo57582e() {
        C32680l lVar = new C32680l();
        lVar.mo58526a(m66645l());
        lVar.f77920b = true;
        lVar.f77922d = false;
        lVar.f77923e = false;
        lVar.f77924f = false;
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        KeyboardUtils.m70897c(mo57434c(R.id.bo5));
        m66644c("resend").mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$a */
    static final class C32277a extends AbstractC89220m implements AbstractC89171a<C32291t> {

        /* renamed from: a */
        final /* synthetic */ C32276s f76990a;

        static {
            Covode.recordClassIndex(39042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32277a(C32276s sVar) {
            super(0);
            this.f76990a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32291t invoke() {
            String str;
            Bundle arguments = this.f76990a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable("verify_ways");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays?>");
            for (C32291t tVar : (List) serializable) {
                if (tVar != null) {
                    str = tVar.getVerify_way();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) "mobile_sms_verify")) {
                    return tVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$g */
    static final class C32286g extends AbstractC89220m implements AbstractC89171a<List<? extends C32291t>> {

        /* renamed from: a */
        final /* synthetic */ C32276s f76999a;

        static {
            Covode.recordClassIndex(39051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32286g(C32276s sVar) {
            super(0);
            this.f76999a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends C32291t> invoke() {
            String str;
            Bundle arguments = this.f76999a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable("verify_ways");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays?>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) serializable) {
                C32291t tVar = (C32291t) obj;
                if (tVar != null) {
                    str = tVar.getVerify_way();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) "email_verify")) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        int i;
        int i2;
        if (C31663o.m65975a()) {
            i = R.string.aqh;
        } else {
            i = R.string.cz4;
        }
        if (C31663o.m65975a()) {
            i2 = R.string.aqj;
        } else {
            i2 = R.string.cz3;
        }
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78106e = getString(R.string.fha) + "\n" + getString(i2);
        bVar.f78107f = getString(i, m66645l());
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$f */
    public static final class C32285f extends C31685i {

        /* renamed from: a */
        final /* synthetic */ C32276s f76998a;

        static {
            Covode.recordClassIndex(39050);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32285f(C32276s sVar) {
            this.f76998a = sVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            int i;
            boolean z;
            if (C31663o.m65975a()) {
                i = 6;
            } else {
                i = 4;
            }
            TuxButton tuxButton = (TuxButton) this.f76998a.mo57434c(R.id.cs9);
            C89219l.m154716b(tuxButton, "");
            CodeInputView codeInputView = (CodeInputView) this.f76998a.mo57434c(R.id.bo5);
            C89219l.m154716b(codeInputView, "");
            Editable text = codeInputView.getText();
            if (text == null || text.length() != i) {
                z = false;
            } else {
                z = true;
            }
            tuxButton.setEnabled(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$e */
    static final class View$OnClickListenerC32284e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f76997a;

        static {
            Covode.recordClassIndex(39049);
        }

        View$OnClickListenerC32284e(View view) {
            this.f76997a = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.m70897c(this.f76997a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        KeyboardUtils.m70897c(mo57434c(R.id.bo5));
        this.f76985b = str;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C32308a aVar;
        super.onCreate(bundle);
        TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(getActivity(), m66645l(), mo58458A());
        if (a == null || (aVar = a.f77750a) == null || !aVar.mo58388d()) {
            m66644c("auto_system").mo143246c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$b */
    static final class View$OnClickListenerC32278b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32276s f76991a;

        static {
            Covode.recordClassIndex(39043);
        }

        View$OnClickListenerC32278b(C32276s sVar) {
            this.f76991a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f76991a.mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox, "");
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f76991a.mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox2, "");
            tuxCheckBox.setSelected(!tuxCheckBox2.isSelected());
            Keva repo = Keva.getRepo("two_step_verification");
            TuxCheckBox tuxCheckBox3 = (TuxCheckBox) this.f76991a.mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox3, "");
            repo.storeBoolean("ask_next_time", tuxCheckBox3.isSelected());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$c */
    static final class View$OnClickListenerC32279c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32276s f76992a;

        static {
            Covode.recordClassIndex(39044);
        }

        View$OnClickListenerC32279c(C32276s sVar) {
            this.f76992a = sVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C32276s sVar = this.f76992a;
            if (sVar.getContext() != null) {
                C39110a aVar = new C39110a(sVar.getContext());
                List<C32291t> g = sVar.mo57437g();
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) g, 10));
                for (T t : g) {
                    if (t == null || (str = t.getVerify_way()) == null) {
                        str = "";
                    }
                    Context context = sVar.getContext();
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(context, "");
                    arrayList.add(C32259r.C32260a.m66641a(str, context));
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                aVar.mo67871a((String[]) array, new DialogInterface$OnClickListenerC32290k(sVar));
                C80273bt.m139145a(aVar.f92306a.mo453a());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$d */
    static final class View$OnClickListenerC32280d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32276s f76993a;

        static {
            Covode.recordClassIndex(39045);
        }

        View$OnClickListenerC32280d(C32276s sVar) {
            this.f76993a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxButton tuxButton = (TuxButton) this.f76993a.mo57434c(R.id.cs9);
            String str = "";
            C89219l.m154716b(tuxButton, str);
            tuxButton.setEnabled(false);
            ((TuxButton) this.f76993a.mo57434c(R.id.cs9)).setLoading(true);
            C32276s sVar = this.f76993a;
            String str2 = sVar.f76985b;
            if (str2 != null) {
                str = str2;
            }
            C32407x.m66799a(sVar, "", str, 22, C89041ag.m154412a(new C89378p("verify_ticket", C32582d.m67077g(this.f76993a))), new AbstractC89172b<C32405w, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32276s.View$OnClickListenerC32280d.C322811 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC32280d f76994a;

                static {
                    Covode.recordClassIndex(39046);
                }

                {
                    this.f76994a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C32405w wVar) {
                    C89219l.m154721d(wVar, "");
                    String k = this.f76994a.f76993a.mo58274k();
                    C89219l.m154716b(k, "");
                    C32258q.m66621a(k, "sms", false);
                    return C89391z.f203057a;
                }
            }).mo143251d(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32276s.View$OnClickListenerC32280d.C322822 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC32280d f76995a;

                static {
                    Covode.recordClassIndex(39047);
                }

                {
                    this.f76995a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    C22314a aVar = (C22314a) obj;
                    String k = this.f76995a.f76993a.mo58274k();
                    C89219l.m154716b(k, "");
                    C32258q.m66621a(k, "sms", true);
                    Bundle arguments = this.f76995a.f76993a.getArguments();
                    if (arguments == null) {
                        C89219l.m154715b();
                    }
                    Bundle bundle = new Bundle();
                    String str = aVar.f52739j;
                    C89219l.m154716b(str, "");
                    C32582d.m67072d(bundle, str);
                    arguments.putBundle("final_data", bundle);
                    C32276s sVar = this.f76995a.f76993a;
                    Bundle arguments2 = this.f76995a.f76993a.getArguments();
                    if (arguments2 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(arguments2, "");
                    sVar.mo58463b(arguments2);
                }
            }).mo143235a(new AbstractC88428a(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32276s.View$OnClickListenerC32280d.C322833 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC32280d f76996a;

                static {
                    Covode.recordClassIndex(39048);
                }

                {
                    this.f76996a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88428a
                /* renamed from: a */
                public final void mo8579a() {
                    TuxButton tuxButton = (TuxButton) this.f76996a.f76993a.mo57434c(R.id.cs9);
                    C89219l.m154716b(tuxButton, "");
                    tuxButton.setEnabled(true);
                    ((TuxButton) this.f76996a.f76993a.mo57434c(R.id.cs9)).setLoading(false);
                }
            }).mo143246c();
        }
    }

    /* renamed from: c */
    private AbstractC88973n<C22291d<C22419n>> m66644c(String str) {
        HashMap c;
        C89219l.m154721d(str, "");
        String f = C32582d.m67076f(this);
        if (C89361p.m154870a((CharSequence) f)) {
            c = C89041ag.m154428c(new C89378p("verify_ticket", C32582d.m67077g(this)));
        } else {
            c = C89041ag.m154428c(new C89378p("not_login_ticket", f));
        }
        AbstractC88973n<C22291d<C22419n>> a = C32407x.m66796a(this, m66645l(), mo58458A(), mo58460Z_(), "", str, (String) null, c).mo143235a(new C32289j(this));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.s$k */
    static final class DialogInterface$OnClickListenerC32290k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32276s f77003a;

        static {
            Covode.recordClassIndex(39055);
        }

        DialogInterface$OnClickListenerC32290k(C32276s sVar) {
            this.f77003a = sVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f77003a.mo57437g().get(i) != null) {
                C32276s sVar = this.f77003a;
                Bundle arguments = sVar.getArguments();
                if (arguments == null) {
                    C89219l.m154715b();
                }
                arguments.putInt("next_page", EnumC32594j.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV.getValue());
                C89219l.m154716b(arguments, "");
                sVar.mo58461a(arguments);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        String k = mo58274k();
        C89219l.m154716b(k, "");
        C32258q.m66627c(k, "sms");
        TuxCheckBox tuxCheckBox = (TuxCheckBox) mo57434c(R.id.a4f);
        C89219l.m154716b(tuxCheckBox, "");
        tuxCheckBox.setSelected(Keva.getRepo("two_step_verification").getBoolean("ask_next_time", true));
        ((TuxCheckBox) mo57434c(R.id.a4f)).setOnClickListener(new View$OnClickListenerC32278b(this));
        if (!mo57437g().isEmpty()) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            ((TuxTextView) mo57434c(R.id.a3v)).setOnClickListener(new View$OnClickListenerC32279c(this));
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
        TuxButton tuxButton = (TuxButton) mo57434c(R.id.cs9);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setEnabled(true);
        ((TuxButton) mo57434c(R.id.cs9)).setOnClickListener(new View$OnClickListenerC32280d(this));
        view.setOnClickListener(new View$OnClickListenerC32284e(view));
        ((CodeInputView) mo57434c(R.id.bo5)).addTextChangedListener(new C32285f(this));
        ((CodeInputView) mo57434c(R.id.bo5)).requestFocus();
    }
}
