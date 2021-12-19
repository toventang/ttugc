package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.AbstractC23190d;
import com.bytedance.tux.navigation.p1723a.C23191e;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32586h;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32360ad;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32380d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AccountKeyBoardHelper;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32783f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.experiment.C46993gt;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63803y;
import com.p2082ss.android.ugc.aweme.utils.C80346dk;
import com.p2082ss.android.ugc.aweme.utils.C80533hg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.p4592m.AbstractC88971a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.cm */
public final class C64104cm extends AbstractC64098cl implements AbstractC32793k {

    /* renamed from: r */
    public static final C64105a f145424r = new C64105a((byte) 0);

    /* renamed from: a */
    public String f145425a = "";

    /* renamed from: b */
    AbstractC64106b f145426b;

    /* renamed from: c */
    public TextView f145427c;

    /* renamed from: d */
    public TextView f145428d;

    /* renamed from: f */
    public LinearLayout f145429f;

    /* renamed from: g */
    public RecyclerView f145430g;

    /* renamed from: h */
    public C32783f f145431h;

    /* renamed from: i */
    public C32360ad f145432i = new C32360ad();

    /* renamed from: j */
    public EditText f145433j;

    /* renamed from: k */
    public final C32586h f145434k = new C32586h();

    /* renamed from: l */
    public boolean f145435l;

    /* renamed from: m */
    public C32380d f145436m;

    /* renamed from: n */
    public String f145437n = "";

    /* renamed from: s */
    private String f145438s = "";

    /* renamed from: t */
    private String f145439t = "";

    /* renamed from: u */
    private boolean f145440u;

    /* renamed from: v */
    private String f145441v = "";

    /* renamed from: w */
    private int f145442w;

    /* renamed from: x */
    private boolean f145443x;

    /* renamed from: y */
    private AccountKeyBoardHelper f145444y;

    /* renamed from: z */
    private SparseArray f145445z;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cm$b */
    public interface AbstractC64106b {
        static {
            Covode.recordClassIndex(75550);
        }

        /* renamed from: a */
        void mo103715a(String str);
    }

    static {
        Covode.recordClassIndex(75548);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    /* renamed from: a */
    public final View mo102214a(int i) {
        if (this.f145445z == null) {
            this.f145445z = new SparseArray();
        }
        View view = (View) this.f145445z.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f145445z.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public final void cj_() {
        SparseArray sparseArray = this.f145445z;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cm$a */
    public static final class C64105a {
        static {
            Covode.recordClassIndex(75549);
        }

        private C64105a() {
        }

        public /* synthetic */ C64105a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final TextView mo103725a() {
        TextView textView = this.f145427c;
        if (textView == null) {
            C89219l.m154710a("mUserLinkHint");
        }
        return textView;
    }

    /* renamed from: c */
    public final EditText mo103728c() {
        EditText editText = this.f145433j;
        if (editText == null) {
            C89219l.m154710a("etUserName");
        }
        return editText;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: f */
    public final void mo58496f() {
        RecyclerView recyclerView = this.f145430g;
        if (recyclerView == null) {
            C89219l.m154710a("setUsernameRv");
        }
        recyclerView.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f145444y;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f77753a = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: u */
    public final void mo58497u() {
        RecyclerView recyclerView = this.f145430g;
        if (recyclerView == null) {
            C89219l.m154710a("setUsernameRv");
        }
        recyclerView.setVisibility(8);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64020bf
    public final void onDestroyView() {
        this.f145436m = null;
        this.f145432i.mo58412b();
        this.f145434k.mo58470a();
        super.onDestroyView();
        cj_();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl
    public final boolean ch_() {
        Dialog dialog;
        EditText editText = this.f145433j;
        if (editText == null) {
            C89219l.m154710a("etUserName");
        }
        KeyboardUtils.m70897c(editText);
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl
    /* renamed from: d */
    public final void mo102217d() {
        AbstractC64106b bVar = this.f145426b;
        if (bVar != null) {
            EditText editText = this.f145433j;
            if (editText == null) {
                C89219l.m154710a("etUserName");
            }
            bVar.mo103715a(editText.getText().toString());
        }
        EditText editText2 = this.f145433j;
        if (editText2 == null) {
            C89219l.m154710a("etUserName");
        }
        if (!C46993gt.m90272a(editText2.getText().toString())) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_status", 1);
            C12290b.m22066a("check_user_name_status", jSONObject, (JSONObject) null, (JSONObject) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f145444y;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f77753a = this;
        }
        if (AccountKeyBoardHelper.C32598a.m67091a()) {
            EditText editText = this.f145433j;
            if (editText == null) {
                C89219l.m154710a("etUserName");
            }
            C32776c.m67375a(editText);
            return;
        }
        EditText editText2 = this.f145433j;
        if (editText2 == null) {
            C89219l.m154710a("etUserName");
        }
        editText2.requestFocus();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cm$c */
    public static final class C64107c implements AbstractC23190d {

        /* renamed from: a */
        final /* synthetic */ C64104cm f145446a;

        static {
            Covode.recordClassIndex(75551);
        }

        @Override // com.bytedance.tux.navigation.p1723a.AbstractC23190d
        /* renamed from: a */
        public final void mo37744a() {
            if (C80346dk.m139311a(this.f145446a.mo103728c().getText().toString(), C17867d.m33078a())) {
                KeyboardUtils.m70897c(this.f145446a.mo103728c());
                C63803y.m115397a("save_profile", "click_save", StringSet.name);
                C64104cm cmVar = this.f145446a;
                ActivityC0945e activity = cmVar.getActivity();
                if (activity != null) {
                    ((C23023b) C23028c.m43435a((C23023b) new C23023b(activity).mo37479a(R.string.fjh).mo37483b(R.string.fjf), new C64113h(cmVar)).mo37481a(new C64116i(cmVar))).mo37405a().mo37396b().show();
                    return;
                }
                return;
            }
            C63803y.m115398b(0, this.f145446a.f145425a, null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64107c(C64104cm cmVar) {
            this.f145446a = cmVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cm$f */
    public static final class C64110f implements C32586h.AbstractC32587a {

        /* renamed from: a */
        final /* synthetic */ C64104cm f145449a;

        static {
            Covode.recordClassIndex(75554);
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.ui.cm$f$a */
        public static final class C64111a extends AbstractC88971a<C32380d> {

            /* renamed from: a */
            final /* synthetic */ C64110f f145450a;

            static {
                Covode.recordClassIndex(75555);
            }

            @Override // org.p4663a.AbstractC90214c
            public final void onComplete() {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C64111a(C64110f fVar) {
                this.f145450a = fVar;
            }

            @Override // org.p4663a.AbstractC90214c
            public final void onError(Throwable th) {
                String str;
                List<String> list;
                List<String> list2;
                List f;
                C89219l.m154721d(th, "");
                C64104cm cmVar = this.f145450a.f145449a;
                C89219l.m154721d(th, "");
                if (th instanceof C34485a) {
                    C34485a aVar = (C34485a) th;
                    if (aVar.getRawResponse() != null) {
                        Object rawResponse = aVar.getRawResponse();
                        if (rawResponse instanceof C32380d) {
                            C32380d dVar = (C32380d) rawResponse;
                            list = dVar.f77215b;
                            str = dVar.status_msg;
                        } else {
                            str = null;
                            list = null;
                        }
                        C32783f fVar = cmVar.f145431h;
                        if (fVar == null) {
                            C89219l.m154715b();
                        }
                        if (list == null || (f = C89070n.m154580f((Iterable) list)) == null) {
                            list2 = null;
                        } else {
                            list2 = C89070n.m154585g((Collection) f);
                        }
                        fVar.mo58585a(list2);
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        cmVar.mo103727a(false, 1, str);
                        return;
                    }
                }
                cmVar.mo103727a(true, 1, (String) null);
            }

            @Override // org.p4663a.AbstractC90214c
            public final /* synthetic */ void onNext(Object obj) {
                List f;
                C32380d dVar = (C32380d) obj;
                C89219l.m154721d(dVar, "");
                C64104cm cmVar = this.f145450a.f145449a;
                C89219l.m154721d(dVar, "");
                List<String> list = null;
                if (!C89219l.m154714a((Object) dVar.f77214a, (Object) false)) {
                    cmVar.mo103727a(true, 3, (String) null);
                    return;
                }
                cmVar.mo103727a(false, 1, dVar.status_msg);
                C32783f fVar = cmVar.f145431h;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                List<String> list2 = dVar.f77215b;
                if (!(list2 == null || (f = C89070n.m154580f((Iterable) list2)) == null)) {
                    list = C89070n.m154585g((Collection) f);
                }
                fVar.mo58585a(list);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64110f(C64104cm cmVar) {
            this.f145449a = cmVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32586h.AbstractC32587a
        /* renamed from: a */
        public final void mo58473a(String str) {
            C89219l.m154721d(str, "");
            if (!TextUtils.isEmpty(str)) {
                LinearLayout linearLayout = this.f145449a.f145429f;
                if (linearLayout == null) {
                    C89219l.m154710a("setUsernameInclude");
                }
                ((InputWithIndicator) linearLayout.findViewById(R.id.bon)).mo58760a(2, 0);
                this.f145449a.f145432i.mo58411a(str, new C64111a(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cm$d */
    public static final class C64108d extends AbstractC88971a<C32380d> {

        /* renamed from: a */
        final /* synthetic */ C64104cm f145447a;

        static {
            Covode.recordClassIndex(75552);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64108d(C64104cm cmVar) {
            this.f145447a = cmVar;
        }

        @Override // org.p4663a.AbstractC90214c
        public final /* synthetic */ void onNext(Object obj) {
            C32380d dVar = (C32380d) obj;
            C89219l.m154721d(dVar, "");
            List<String> list = dVar.f77215b;
            if (list != null && (!list.isEmpty())) {
                this.f145447a.mo103726a(dVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cm$g */
    public static final class C64112g extends C34699o {

        /* renamed from: a */
        final /* synthetic */ C64104cm f145451a;

        static {
            Covode.recordClassIndex(75556);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64112g(C64104cm cmVar) {
            this.f145451a = cmVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            String obj = this.f145451a.mo103728c().getText().toString();
            boolean isEmpty = TextUtils.isEmpty(obj);
            if (isEmpty || this.f145451a.f145435l) {
                this.f145451a.f145432i.mo58412b();
                this.f145451a.f145434k.mo58472a("");
            }
            if (this.f145451a.f145435l) {
                this.f145451a.mo103728c().setSelection(obj.length());
                this.f145451a.mo103727a(true, 3, (String) null);
                this.f145451a.f145435l = false;
                return;
            }
            C32783f fVar = this.f145451a.f145431h;
            if (fVar == null) {
                C89219l.m154715b();
            }
            fVar.mo58585a(null);
            this.f145451a.mo103727a(false, 1, (String) null);
            if (!isEmpty) {
                this.f145451a.f145434k.mo58472a(obj);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            this.f145451a.mo103725a().setText("www.tiktok.com/");
            TextView a = this.f145451a.mo103725a();
            C64104cm cmVar = this.f145451a;
            String obj = cmVar.mo103728c().getText().toString();
            C89219l.m154721d(obj, "");
            if (C89219l.m154714a((Object) obj, (Object) "")) {
                obj = "username";
            }
            SpannableString spannableString = new SpannableString("@".concat(String.valueOf(obj)));
            Context context = cmVar.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(context, R.color.bx)), 0, obj.length() + 1, 33);
            a.append(spannableString);
            boolean z = this.f145451a.f145435l;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cm$e */
    static final class C64109e extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64104cm f145448a;

        static {
            Covode.recordClassIndex(75553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64109e(C64104cm cmVar) {
            super(1);
            this.f145448a = cmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            if (!TextUtils.isEmpty(str2)) {
                this.f145448a.f145435l = true;
                this.f145448a.mo103728c().setText(str2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cm$h */
    static final class C64113h extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64104cm f145452a;

        static {
            Covode.recordClassIndex(75557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64113h(C64104cm cmVar) {
            super(1);
            this.f145452a = cmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.fjg, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64104cm.C64113h.C641141 */

                /* renamed from: a */
                final /* synthetic */ C64113h f145453a;

                static {
                    Covode.recordClassIndex(75558);
                }

                {
                    this.f145453a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f145453a.f145452a.mo102217d();
                    this.f145453a.f145452a.dismiss();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, C641152.f145454a);
            bVar2.f54513b = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cm$i */
    static final class C64116i extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64104cm f145455a;

        static {
            Covode.recordClassIndex(75560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64116i(C64104cm cmVar) {
            super(1);
            this.f145455a = cmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            C23013a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Object obj = aVar2.f54577j;
            if (obj == null) {
                C63803y.m115396a(0, this.f145455a.f145425a, "blank");
            } else if (C89219l.m154714a(obj, (Object) 0)) {
                C63803y.m115396a(1, this.f145455a.f145425a, "button");
            } else if (C89219l.m154714a(obj, (Object) 1)) {
                C63803y.m115396a(0, this.f145455a.f145425a, "button");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo103726a(C32380d dVar) {
        List f;
        List g;
        C89219l.m154721d(dVar, "");
        List<String> list = dVar.f77215b;
        if (list != null && (f = C89070n.m154580f((Iterable) list)) != null && (g = C89070n.m154585g((Collection) f)) != null && (!g.isEmpty())) {
            this.f145435l = true;
            EditText editText = this.f145433j;
            if (editText == null) {
                C89219l.m154710a("etUserName");
            }
            editText.setText((CharSequence) g.get(0));
            this.f145437n = (String) g.get(0);
            C32783f fVar = this.f145431h;
            if (fVar == null) {
                C89219l.m154715b();
            }
            fVar.mo58585a(g.subList(1, g.size()));
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64098cl, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("content_name");
            if (string == null) {
                C89219l.m154715b();
            }
            this.f145438s = string;
            String string2 = arguments.getString("content_value");
            if (string2 == null) {
                C89219l.m154715b();
            }
            this.f145439t = string2;
            this.f145440u = arguments.getBoolean("is_edit_enabled");
            String string3 = arguments.getString("edit_hint");
            if (string3 == null) {
                C89219l.m154715b();
            }
            this.f145441v = string3;
            this.f145442w = arguments.getInt("content_max_length");
            this.f145443x = arguments.getBoolean("is_enable_null");
            String string4 = arguments.getString("enter_from");
            if (string4 == null) {
                C89219l.m154715b();
            }
            this.f145425a = string4;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("new_user_need_get_recommend_username")) {
            this.f145432i.mo58411a("", new C64108d(this));
        }
    }

    /* renamed from: a */
    public final void mo103727a(boolean z, int i, String str) {
        if (!z || !this.f145440u) {
            mo103722i();
        } else {
            mo103721h();
        }
        if (str == null) {
            LinearLayout linearLayout = this.f145429f;
            if (linearLayout == null) {
                C89219l.m154710a("setUsernameInclude");
            }
            ((InputResultIndicator) linearLayout.findViewById(R.id.boo)).mo58481a();
        } else {
            LinearLayout linearLayout2 = this.f145429f;
            if (linearLayout2 == null) {
                C89219l.m154710a("setUsernameInclude");
            }
            ((InputResultIndicator) linearLayout2.findViewById(R.id.boo)).mo58482a(str);
        }
        LinearLayout linearLayout3 = this.f145429f;
        if (linearLayout3 == null) {
            C89219l.m154710a("setUsernameInclude");
        }
        ((InputWithIndicator) linearLayout3.findViewById(R.id.bon)).mo58760a(i, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.and, viewGroup, false);
        ActivityC0945e activity = getActivity();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        C80533hg.m139603a(activity, window, true);
        View findViewById = a.findViewById(R.id.f_x);
        C89219l.m154716b(findViewById, "");
        this.f145427c = (TextView) findViewById;
        View findViewById2 = a.findViewById(R.id.evk);
        C89219l.m154716b(findViewById2, "");
        this.f145428d = (TextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.dwd);
        C89219l.m154716b(findViewById3, "");
        this.f145429f = (LinearLayout) findViewById3;
        View findViewById4 = a.findViewById(R.id.dwf);
        C89219l.m154716b(findViewById4, "");
        this.f145430g = (RecyclerView) findViewById4;
        this.f145418o = (TuxNavBar) a.findViewById(R.id.cpv);
        AbstractC23189c j = mo103723j();
        C23194g b = m116006b(this.f145438s);
        C23191e a2 = new C23191e().mo37748a((Object) "save");
        String string = getString(R.string.bk9);
        C89219l.m154716b(string, "");
        C23191e a3 = a2.mo37749a(string).mo37745a((AbstractC23190d) new C64107c(this));
        TuxNavBar tuxNavBar = this.f145418o;
        if (tuxNavBar != null) {
            TuxNavBar.C23179a b2 = new TuxNavBar.C23179a().mo37732a(j).mo37731a(b).mo37733b(a3);
            b2.f54919d = true;
            tuxNavBar.setNavActions(b2);
        }
        LinearLayout linearLayout = this.f145429f;
        if (linearLayout == null) {
            C89219l.m154710a("setUsernameInclude");
        }
        EditText editText = ((InputWithIndicator) linearLayout.findViewById(R.id.bon)).getEditText();
        this.f145433j = editText;
        if (!this.f145440u) {
            if (editText == null) {
                C89219l.m154710a("etUserName");
            }
            editText.setEnabled(false);
            EditText editText2 = this.f145433j;
            if (editText2 == null) {
                C89219l.m154710a("etUserName");
            }
            editText2.setFocusable(false);
            EditText editText3 = this.f145433j;
            if (editText3 == null) {
                C89219l.m154710a("etUserName");
            }
            editText3.setFocusableInTouchMode(false);
        }
        mo103722i();
        if (TextUtils.isEmpty(this.f145441v)) {
            TextView textView = this.f145428d;
            if (textView == null) {
                C89219l.m154710a("mIdEditHintText");
            }
            textView.setVisibility(8);
        } else {
            TextView textView2 = this.f145428d;
            if (textView2 == null) {
                C89219l.m154710a("mIdEditHintText");
            }
            textView2.setText(this.f145441v);
        }
        C89219l.m154716b(a, "");
        this.f145444y = new AccountKeyBoardHelper(a, this);
        LinearLayout linearLayout2 = this.f145429f;
        if (linearLayout2 == null) {
            C89219l.m154710a("setUsernameInclude");
        }
        EditText editText4 = ((InputWithIndicator) linearLayout2.findViewById(R.id.bon)).getEditText();
        this.f145433j = editText4;
        if (editText4 == null) {
            C89219l.m154710a("etUserName");
        }
        editText4.setNextFocusDownId(editText4.getId());
        editText4.setHint(getString(R.string.ar0));
        RecyclerView recyclerView = this.f145430g;
        if (recyclerView == null) {
            C89219l.m154710a("setUsernameRv");
        }
        C32783f fVar = new C32783f(recyclerView, null, new C64109e(this));
        this.f145431h = fVar;
        fVar.f78124a = true;
        this.f145434k.mo58471a(new C64110f(this), TimeUnit.MILLISECONDS);
        EditText editText5 = this.f145433j;
        if (editText5 == null) {
            C89219l.m154710a("etUserName");
        }
        editText5.addTextChangedListener(new C64112g(this));
        EditText editText6 = this.f145433j;
        if (editText6 == null) {
            C89219l.m154710a("etUserName");
        }
        editText6.setText(this.f145439t);
        EditText editText7 = this.f145433j;
        if (editText7 == null) {
            C89219l.m154710a("etUserName");
        }
        EditText editText8 = this.f145433j;
        if (editText8 == null) {
            C89219l.m154710a("etUserName");
        }
        editText7.setSelection(editText8.getText().length());
        EditText editText9 = this.f145433j;
        if (editText9 == null) {
            C89219l.m154710a("etUserName");
        }
        editText9.setFocusable(true);
        EditText editText10 = this.f145433j;
        if (editText10 == null) {
            C89219l.m154710a("etUserName");
        }
        editText10.setFocusableInTouchMode(true);
        EditText editText11 = this.f145433j;
        if (editText11 == null) {
            C89219l.m154710a("etUserName");
        }
        editText11.requestFocus();
        C32380d dVar = this.f145436m;
        if (dVar != null) {
            mo103726a(dVar);
        }
        return a;
    }
}
