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
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22412g;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32405w;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32555z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32680l;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
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
import p4560f.p4561a.AbstractC88976q;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r */
public final class C32259r extends AbstractView$OnClickListenerC32681m {

    /* renamed from: b */
    public static final C32260a f76962b = new C32260a((byte) 0);

    /* renamed from: a */
    public String f76963a;

    /* renamed from: j */
    private final AbstractC89244h f76964j = C89250i.m154773a((AbstractC89171a) new C32262c(this));

    /* renamed from: k */
    private final AbstractC89244h f76965k = C89250i.m154773a((AbstractC89171a) new C32273j(this));

    /* renamed from: l */
    private final AbstractC89244h f76966l = C89250i.m154773a((AbstractC89171a) new C32272i(this));

    /* renamed from: m */
    private final AbstractC89244h f76967m = C89250i.m154773a((AbstractC89171a) new C32261b(this));

    /* renamed from: n */
    private HashMap f76968n;

    static {
        Covode.recordClassIndex(39024);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f76968n == null) {
            this.f76968n = new HashMap();
        }
        View view = (View) this.f76968n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76968n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.g0;
    }

    /* renamed from: g */
    public final String mo57437g() {
        return (String) this.f76964j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f76968n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: k */
    public final String mo58274k() {
        return (String) this.f76965k.getValue();
    }

    /* renamed from: l */
    public final List<C32291t> mo58275l() {
        return (List) this.f76966l.getValue();
    }

    /* renamed from: m */
    public final C32291t mo58276m() {
        return (C32291t) this.f76967m.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$a */
    public static final class C32260a {
        static {
            Covode.recordClassIndex(39025);
        }

        private C32260a() {
        }

        public /* synthetic */ C32260a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m66641a(String str, Context context) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(context, "");
            int hashCode = str.hashCode();
            if (hashCode != -797498437) {
                if (hashCode == 312290780 && str.equals("mobile_sms_verify")) {
                    String string = context.getString(R.string.cz2);
                    C89219l.m154716b(string, "");
                    return string;
                }
            } else if (str.equals("pwd_verify")) {
                String string2 = context.getString(R.string.gxo);
                C89219l.m154716b(string2, "");
                return string2;
            }
            String string3 = context.getString(R.string.cz1);
            C89219l.m154716b(string3, "");
            return string3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$k */
    public static final class C32274k implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C32259r f76982a;

        static {
            Covode.recordClassIndex(39039);
        }

        C32274k(C32259r rVar) {
            this.f76982a = rVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f76982a.mo58532t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$c */
    static final class C32262c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32259r f76970a;

        static {
            Covode.recordClassIndex(39027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32262c(C32259r rVar) {
            super(0);
            this.f76970a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String email;
            C32291t m = this.f76970a.mo58276m();
            if (m == null || (email = m.getEmail()) == null) {
                return "";
            }
            return email;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$j */
    static final class C32273j extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C32259r f76981a;

        static {
            Covode.recordClassIndex(39038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32273j(C32259r rVar) {
            super(0);
            this.f76981a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f76981a.getArguments();
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
        lVar.mo58526a(mo57437g());
        lVar.f77920b = false;
        lVar.f77922d = false;
        lVar.f77923e = false;
        lVar.f77924f = false;
        return lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: i */
    public final void mo57583i() {
        KeyboardUtils.m70897c(mo57434c(R.id.bo5));
        m66629c("resend").mo143246c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$b */
    static final class C32261b extends AbstractC89220m implements AbstractC89171a<C32291t> {

        /* renamed from: a */
        final /* synthetic */ C32259r f76969a;

        static {
            Covode.recordClassIndex(39026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32261b(C32259r rVar) {
            super(0);
            this.f76969a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32291t invoke() {
            String str;
            Bundle arguments = this.f76969a.getArguments();
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
                if (C89219l.m154714a((Object) str, (Object) "email_verify")) {
                    return tVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$i */
    static final class C32272i extends AbstractC89220m implements AbstractC89171a<List<? extends C32291t>> {

        /* renamed from: a */
        final /* synthetic */ C32259r f76980a;

        static {
            Covode.recordClassIndex(39037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32272i(C32259r rVar) {
            super(0);
            this.f76980a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends C32291t> invoke() {
            Bundle arguments = this.f76980a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable("verify_ways");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays?>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) serializable) {
                C32291t tVar = (C32291t) obj;
                String str = null;
                if (!C32582d.m67078h(this.f76980a)) {
                    if (!C89219l.m154714a((Object) (tVar != null ? tVar.getVerify_way() : null), (Object) "pwd_verify")) {
                    }
                } else {
                    if (!C89219l.m154714a((Object) (tVar != null ? tVar.getVerify_way() : null), (Object) "mobile_sms_verify")) {
                    }
                }
                String verify_way = tVar.getVerify_way();
                C32291t m = this.f76980a.mo58276m();
                if (m != null) {
                    str = m.getVerify_way();
                }
                if (!C89219l.m154714a((Object) verify_way, (Object) str)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f78106e = getString(R.string.fha) + "\n" + getString(R.string.cyk);
        bVar.f78107f = getString(R.string.cyl, mo57437g());
        bVar.f78102a = " ";
        bVar.f78111j = false;
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$h */
    public static final class C32271h extends C31685i {

        /* renamed from: a */
        final /* synthetic */ C32259r f76979a;

        static {
            Covode.recordClassIndex(39036);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32271h(C32259r rVar) {
            this.f76979a = rVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            boolean z;
            TuxButton tuxButton = (TuxButton) this.f76979a.mo57434c(R.id.cs9);
            C89219l.m154716b(tuxButton, "");
            CodeInputView codeInputView = (CodeInputView) this.f76979a.mo57434c(R.id.bo5);
            C89219l.m154716b(codeInputView, "");
            Editable text = codeInputView.getText();
            if (text == null || text.length() != 6) {
                z = false;
            } else {
                z = true;
            }
            tuxButton.setEnabled(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$g */
    static final class View$OnClickListenerC32270g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f76978a;

        static {
            Covode.recordClassIndex(39035);
        }

        View$OnClickListenerC32270g(View view) {
            this.f76978a = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.m70897c(this.f76978a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m
    /* renamed from: a */
    public final void mo57581a(String str) {
        C89219l.m154721d(str, "");
        KeyboardUtils.m70897c(mo57434c(R.id.bo5));
        this.f76963a = str;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C32308a aVar;
        super.onCreate(bundle);
        TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(getActivity(), mo57437g(), mo58458A());
        if (a == null || (aVar = a.f77750a) == null || !aVar.mo58388d()) {
            m66629c("auto_system").mo143246c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$d */
    static final class View$OnClickListenerC32263d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32259r f76971a;

        static {
            Covode.recordClassIndex(39028);
        }

        View$OnClickListenerC32263d(C32259r rVar) {
            this.f76971a = rVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f76971a.mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox, "");
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f76971a.mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox2, "");
            tuxCheckBox.setSelected(!tuxCheckBox2.isSelected());
            Keva repo = Keva.getRepo("two_step_verification");
            TuxCheckBox tuxCheckBox3 = (TuxCheckBox) this.f76971a.mo57434c(R.id.a4f);
            C89219l.m154716b(tuxCheckBox3, "");
            repo.storeBoolean("ask_next_time", tuxCheckBox3.isSelected());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$e */
    static final class View$OnClickListenerC32264e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32259r f76972a;

        static {
            Covode.recordClassIndex(39029);
        }

        View$OnClickListenerC32264e(C32259r rVar) {
            this.f76972a = rVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C32259r rVar = this.f76972a;
            if (rVar.getContext() != null) {
                C39110a aVar = new C39110a(rVar.getContext());
                List<C32291t> l = rVar.mo58275l();
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) l, 10));
                for (T t : l) {
                    if (t == null || (str = t.getVerify_way()) == null) {
                        str = "";
                    }
                    Context context = rVar.getContext();
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(context, "");
                    arrayList.add(C32260a.m66641a(str, context));
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                aVar.mo67871a((String[]) array, new DialogInterface$OnClickListenerC32275l(rVar));
                C80273bt.m139145a(aVar.f92306a.mo453a());
            }
        }
    }

    /* renamed from: c */
    private AbstractC88973n<C22291d<C22412g>> m66629c(String str) {
        HashMap c;
        int i;
        C89219l.m154721d(str, "");
        String f = C32582d.m67076f(this);
        if (C89361p.m154870a((CharSequence) f)) {
            c = C89041ag.m154428c(new C89378p("verify_ticket", C32582d.m67077g(this)));
            i = 6;
        } else {
            c = C89041ag.m154428c(new C89378p("not_login_ticket", f));
            i = 13;
        }
        AbstractC88973n<C22291d<C22412g>> a = C32407x.m66788a(this, mo57437g(), i, str, c, (String) null, 96).mo143235a((AbstractC88428a) new C32274k(this));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$f */
    static final class View$OnClickListenerC32265f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32259r f76973a;

        static {
            Covode.recordClassIndex(39030);
        }

        View$OnClickListenerC32265f(C32259r rVar) {
            this.f76973a = rVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxButton tuxButton = (TuxButton) this.f76973a.mo57434c(R.id.cs9);
            String str = "";
            C89219l.m154716b(tuxButton, str);
            tuxButton.setEnabled(false);
            ((TuxButton) this.f76973a.mo57434c(R.id.cs9)).setLoading(true);
            if (C32582d.m67078h(this.f76973a)) {
                String w = this.f76973a.mo58466w();
                C89219l.m154716b(w, str);
                C32259r rVar = this.f76973a;
                String str2 = rVar.f76963a;
                if (str2 != null) {
                    str = str2;
                }
                C32407x.m66804a(w, rVar, "", str, 6, C89041ag.m154412a(new C89378p("verify_ticket", C32582d.m67077g(this.f76973a))), new AbstractC89172b<C32405w, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32259r.View$OnClickListenerC32265f.C322661 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC32265f f76974a;

                    static {
                        Covode.recordClassIndex(39031);
                    }

                    {
                        this.f76974a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C32405w wVar) {
                        C89219l.m154721d(wVar, "");
                        String k = this.f76974a.f76973a.mo58274k();
                        C89219l.m154716b(k, "");
                        C32258q.m66621a(k, "email", false);
                        return C89391z.f203057a;
                    }
                }).mo143251d(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32259r.View$OnClickListenerC32265f.C322672 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC32265f f76975a;

                    static {
                        Covode.recordClassIndex(39032);
                    }

                    {
                        this.f76975a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C22314a aVar = (C22314a) obj;
                        String k = this.f76975a.f76973a.mo58274k();
                        C89219l.m154716b(k, "");
                        C32258q.m66621a(k, "email", true);
                        Bundle arguments = this.f76975a.f76973a.getArguments();
                        if (arguments == null) {
                            C89219l.m154715b();
                        }
                        Bundle bundle = new Bundle();
                        String str = aVar.f52739j;
                        C89219l.m154716b(str, "");
                        C32582d.m67072d(bundle, str);
                        arguments.putBundle("final_data", bundle);
                        C32259r rVar = this.f76975a.f76973a;
                        Bundle arguments2 = this.f76975a.f76973a.getArguments();
                        if (arguments2 == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(arguments2, "");
                        rVar.mo58463b(arguments2);
                    }
                }).mo143235a(new AbstractC88428a(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32259r.View$OnClickListenerC32265f.C322683 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC32265f f76976a;

                    static {
                        Covode.recordClassIndex(39033);
                    }

                    {
                        this.f76976a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88428a
                    /* renamed from: a */
                    public final void mo8579a() {
                        TuxButton tuxButton = (TuxButton) this.f76976a.f76973a.mo57434c(R.id.cs9);
                        C89219l.m154716b(tuxButton, "");
                        tuxButton.setEnabled(true);
                        ((TuxButton) this.f76976a.f76973a.mo57434c(R.id.cs9)).setLoading(false);
                    }
                }).mo143246c();
                return;
            }
            Bundle arguments = this.f76973a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            String string = arguments.getString("verify_ticket");
            Bundle arguments2 = this.f76973a.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            String string2 = arguments2.getString("not_login_ticket");
            C32259r rVar2 = this.f76973a;
            String str3 = rVar2.f76963a;
            if (str3 == null) {
                str3 = str;
            }
            if (string == null) {
                string = str;
            }
            if (string2 == null) {
                string2 = str;
            }
            C89219l.m154721d(rVar2, str);
            C89219l.m154721d(str3, str);
            C89219l.m154721d("13", str);
            C89219l.m154721d(string, str);
            C89219l.m154721d(string2, str);
            AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32415ae(rVar2, str3, "13", string, string2)).mo143251d(new C32407x.C32417af(rVar2)).mo143244b(new C32407x.C32418ag(rVar2));
            C89219l.m154716b(b, str);
            C32555z.m67011a(rVar2, b).mo143251d(C322694.f76977a).mo143246c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.r$l */
    static final class DialogInterface$OnClickListenerC32275l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32259r f76983a;

        static {
            Covode.recordClassIndex(39040);
        }

        DialogInterface$OnClickListenerC32275l(C32259r rVar) {
            this.f76983a = rVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            EnumC32594j jVar;
            C32291t tVar = this.f76983a.mo58275l().get(i);
            if (tVar != null) {
                C32259r rVar = this.f76983a;
                Bundle arguments = rVar.getArguments();
                if (arguments == null) {
                    C89219l.m154715b();
                }
                String verify_way = tVar.getVerify_way();
                if (verify_way == null) {
                    verify_way = "";
                }
                C89219l.m154721d(verify_way, "");
                int hashCode = verify_way.hashCode();
                if (hashCode != -797498437) {
                    if (hashCode == 312290780 && verify_way.equals("mobile_sms_verify")) {
                        jVar = EnumC32594j.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
                        arguments.putInt("next_page", jVar.getValue());
                        C89219l.m154716b(arguments, "");
                        C32582d.m67061a(arguments, this.f76983a.mo57437g());
                        C89219l.m154716b(arguments, "");
                        rVar.mo58461a(arguments);
                    }
                } else if (verify_way.equals("pwd_verify")) {
                    jVar = EnumC32594j.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV;
                    arguments.putInt("next_page", jVar.getValue());
                    C89219l.m154716b(arguments, "");
                    C32582d.m67061a(arguments, this.f76983a.mo57437g());
                    C89219l.m154716b(arguments, "");
                    rVar.mo58461a(arguments);
                }
                jVar = EnumC32594j.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
                arguments.putInt("next_page", jVar.getValue());
                C89219l.m154716b(arguments, "");
                C32582d.m67061a(arguments, this.f76983a.mo57437g());
                C89219l.m154716b(arguments, "");
                rVar.mo58461a(arguments);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractView$OnClickListenerC32681m, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        String k = mo58274k();
        C89219l.m154716b(k, "");
        C32258q.m66627c(k, "email");
        TuxCheckBox tuxCheckBox = (TuxCheckBox) mo57434c(R.id.a4f);
        C89219l.m154716b(tuxCheckBox, "");
        tuxCheckBox.setSelected(Keva.getRepo("two_step_verification").getBoolean("ask_next_time", true));
        ((TuxCheckBox) mo57434c(R.id.a4f)).setOnClickListener(new View$OnClickListenerC32263d(this));
        if (!mo58275l().isEmpty()) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            ((TuxTextView) mo57434c(R.id.a3v)).setOnClickListener(new View$OnClickListenerC32264e(this));
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
        ((TuxButton) mo57434c(R.id.cs9)).setOnClickListener(new View$OnClickListenerC32265f(this));
        view.setOnClickListener(new View$OnClickListenerC32270g(view));
        ((CodeInputView) mo57434c(R.id.bo5)).setInputLength(6);
        ((CodeInputView) mo57434c(R.id.bo5)).addTextChangedListener(new C32271h(this));
        ((CodeInputView) mo57434c(R.id.bo5)).requestFocus();
    }
}
