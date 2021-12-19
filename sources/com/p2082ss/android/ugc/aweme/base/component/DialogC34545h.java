package com.p2082ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32360ad;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32380d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32783f;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34573d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63828ae;
import com.p2082ss.android.ugc.aweme.utils.C80346dk;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import p4560f.p4561a.p4592m.AbstractC88971a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.component.h */
public final class DialogC34545h extends DialogC81459o implements KeyboardUtils.AbstractC34711a, AbstractC63860x {

    /* renamed from: a */
    C32360ad f81561a = new C32360ad();

    /* renamed from: b */
    public C32783f f81562b;

    /* renamed from: c */
    C63828ae f81563c = new C63828ae();

    /* renamed from: d */
    public EditText f81564d;

    /* renamed from: e */
    public String f81565e = "background";

    /* renamed from: f */
    public boolean f81566f;

    /* renamed from: g */
    public final Activity f81567g;

    /* renamed from: h */
    public final User f81568h;

    /* renamed from: i */
    private final AbstractC89244h f81569i = C89250i.m154773a((AbstractC89171a) new C34547b(this));

    /* renamed from: j */
    private final AbstractC89244h f81570j = C89250i.m154773a((AbstractC89171a) new C34557l(this));

    /* renamed from: k */
    private final AbstractC89244h f81571k = C89250i.m154773a((AbstractC89171a) new C34555j(this));

    /* renamed from: n */
    private final AbstractC89244h f81572n = C89250i.m154773a((AbstractC89171a) new C34548c(this));

    /* renamed from: o */
    private final AbstractC89244h f81573o = C89250i.m154773a((AbstractC89171a) new C34553h(this));

    /* renamed from: p */
    private final AbstractC89244h f81574p = C89250i.m154773a((AbstractC89171a) new C34554i(this));

    /* renamed from: q */
    private String f81575q;

    static {
        Covode.recordClassIndex(41507);
    }

    /* renamed from: d */
    private final LinearLayout m70575d() {
        return (LinearLayout) this.f81571k.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final TextView mo61021a() {
        return (TextView) this.f81573o.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61023a(User user, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
    /* renamed from: b */
    public final void mo61027b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
    /* renamed from: c */
    public final void mo61028c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$b */
    static final class C34547b extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81577a;

        static {
            Covode.recordClassIndex(41509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34547b(DialogC34545h hVar) {
            super(0);
            this.f81577a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f81577a.findViewById(R.id.btr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$c */
    static final class C34548c extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81578a;

        static {
            Covode.recordClassIndex(41510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34548c(DialogC34545h hVar) {
            super(0);
            this.f81578a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f81578a.findViewById(R.id.crd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$h */
    static final class C34553h extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81583a;

        static {
            Covode.recordClassIndex(41515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34553h(DialogC34545h hVar) {
            super(0);
            this.f81583a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f81583a.findViewById(R.id.d4u);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$i */
    static final class C34554i extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81584a;

        static {
            Covode.recordClassIndex(41516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34554i(DialogC34545h hVar) {
            super(0);
            this.f81584a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return this.f81584a.findViewById(R.id.don);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$j */
    static final class C34555j extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81585a;

        static {
            Covode.recordClassIndex(41517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34555j(DialogC34545h hVar) {
            super(0);
            this.f81585a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f81585a.findViewById(R.id.x6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$l */
    static final class C34557l extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81588a;

        static {
            Covode.recordClassIndex(41519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34557l(DialogC34545h hVar) {
            super(0);
            this.f81588a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f81588a.findViewById(R.id.eth);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        EditText editText = this.f81564d;
        if (editText == null) {
            C89219l.m154710a("etUserName");
        } else {
            KeyboardUtils.m70897c(editText);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$a */
    public static final class C34546a extends C34699o {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81576a;

        static {
            Covode.recordClassIndex(41508);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34546a(DialogC34545h hVar) {
            this.f81576a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            String obj = DialogC34545h.m70574a(this.f81576a).getText().toString();
            if (this.f81576a.f81566f) {
                this.f81576a.f81566f = false;
            } else {
                C32783f fVar = this.f81576a.f81562b;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                fVar.mo58585a(null);
            }
            DialogC34545h.m70574a(this.f81576a).setTextColor(C0643b.m2378c(this.f81576a.getContext(), R.color.bx));
            if (TextUtils.isEmpty(obj)) {
                this.f81576a.mo61022a(0);
            } else {
                this.f81576a.mo61022a(1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$g */
    public static final class C34552g extends AbstractC88971a<C32380d> {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81582a;

        static {
            Covode.recordClassIndex(41514);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34552g(DialogC34545h hVar) {
            this.f81582a = hVar;
        }

        @Override // org.p4663a.AbstractC90214c
        public final /* synthetic */ void onNext(Object obj) {
            List f;
            List g;
            C32380d dVar = (C32380d) obj;
            C89219l.m154721d(dVar, "");
            List<String> list = dVar.f77215b;
            if (list != null && (!list.isEmpty())) {
                DialogC34545h hVar = this.f81582a;
                C89219l.m154721d(dVar, "");
                List<String> list2 = dVar.f77215b;
                if (list2 != null && (f = C89070n.m154580f((Iterable) list2)) != null && (g = C89070n.m154585g((Collection) f)) != null && (!g.isEmpty())) {
                    EditText editText = hVar.f81564d;
                    if (editText == null) {
                        C89219l.m154710a("etUserName");
                    }
                    editText.setText((CharSequence) g.get(0));
                    C32783f fVar = hVar.f81562b;
                    if (fVar == null) {
                        C89219l.m154715b();
                    }
                    fVar.mo58585a(g.subList(1, g.size()));
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m70574a(DialogC34545h hVar) {
        EditText editText = hVar.f81564d;
        if (editText == null) {
            C89219l.m154710a("etUserName");
        }
        return editText;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$f */
    static final class View$OnClickListenerC34551f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81581a;

        static {
            Covode.recordClassIndex(41513);
        }

        View$OnClickListenerC34551f(DialogC34545h hVar) {
            this.f81581a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DialogC34545h hVar = this.f81581a;
            C89219l.m154721d("cancel", "");
            hVar.f81565e = "cancel";
            this.f81581a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$d */
    static final class C34549d extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81579a;

        static {
            Covode.recordClassIndex(41511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34549d(DialogC34545h hVar) {
            super(1);
            this.f81579a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            if (!TextUtils.isEmpty(str2)) {
                this.f81579a.f81566f = true;
                DialogC34545h.m70574a(this.f81579a).setText(str2);
                DialogC34545h.m70574a(this.f81579a).setSelection(str2.length());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$e */
    static final class View$OnClickListenerC34550e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81580a;

        static {
            Covode.recordClassIndex(41512);
        }

        View$OnClickListenerC34550e(DialogC34545h hVar) {
            this.f81580a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DialogC34545h hVar = this.f81580a;
            String obj = DialogC34545h.m70574a(hVar).getText().toString();
            if (!TextUtils.isEmpty(obj)) {
                hVar.mo61022a(2);
                hVar.f81561a.mo58411a(obj, new C34556k(hVar, obj));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$k */
    public static final class C34556k extends AbstractC88971a<C32380d> {

        /* renamed from: a */
        final /* synthetic */ DialogC34545h f81586a;

        /* renamed from: b */
        final /* synthetic */ String f81587b;

        static {
            Covode.recordClassIndex(41518);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
        }

        @Override // org.p4663a.AbstractC90214c
        public final /* synthetic */ void onNext(Object obj) {
            List<String> list;
            List f;
            C32380d dVar = (C32380d) obj;
            C89219l.m154721d(dVar, "");
            DialogC34545h hVar = this.f81586a;
            String str = this.f81587b;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(str, "");
            if (!C89219l.m154714a((Object) dVar.f77214a, (Object) false)) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                g.getCurUser();
                if (C80346dk.m139311a(str, hVar.getContext())) {
                    hVar.f81563c.mo103293a(str);
                }
            } else {
                C32783f fVar = hVar.f81562b;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                List<String> list2 = dVar.f77215b;
                if (list2 == null || (f = C89070n.m154580f((Iterable) list2)) == null) {
                    list = null;
                } else {
                    list = C89070n.m154585g((Collection) f);
                }
                fVar.mo58585a(list);
            }
            hVar.mo61022a(1);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            String str;
            List<String> list;
            List f;
            C89219l.m154721d(th, "");
            DialogC34545h hVar = this.f81586a;
            C89219l.m154721d(th, "");
            List<String> list2 = null;
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
                    C32783f fVar = hVar.f81562b;
                    if (fVar == null) {
                        C89219l.m154715b();
                    }
                    if (!(list == null || (f = C89070n.m154580f((Iterable) list)) == null)) {
                        list2 = C89070n.m154585g((Collection) f);
                    }
                    fVar.mo58585a(list2);
                    if (str != null && !TextUtils.isEmpty(str)) {
                        new C23144b(hVar.f81567g).mo37635a(str).mo37637b();
                    }
                }
            }
            hVar.mo61022a(1);
            EditText editText = hVar.f81564d;
            if (editText == null) {
                C89219l.m154710a("etUserName");
            }
            editText.setTextColor(C0643b.m2378c(hVar.getContext(), R.color.ly));
            hVar.mo61021a().setEnabled(false);
            hVar.mo61021a().setTextColor(C0643b.m2378c(hVar.getContext(), R.color.c5));
        }

        C34556k(DialogC34545h hVar, String str) {
            this.f81586a = hVar;
            this.f81587b = str;
        }
    }

    /* renamed from: a */
    public final void mo61022a(int i) {
        ((InputWithIndicator) m70575d().findViewById(R.id.bon)).mo58760a(i, 0);
        if (i == 0) {
            mo61021a().setEnabled(false);
            mo61021a().setTextColor(C0643b.m2378c(getContext(), R.color.c5));
            return;
        }
        mo61021a().setEnabled(true);
        mo61021a().setTextColor(C0643b.m2378c(getContext(), R.color.bx));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61026a(boolean z) {
        if (z) {
            new C23144b(this.f81567g).mo37640e(R.string.h7r).mo37637b();
            AbstractC81915c.m141874a(new C34573d());
            this.f81565e = "save";
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.afj);
        this.f81563c.f144692c = this;
        EditText editText = ((InputWithIndicator) m70575d().findViewById(R.id.bon)).getEditText();
        this.f81564d = editText;
        if (editText == null) {
            C89219l.m154710a("etUserName");
        }
        editText.setFocusable(true);
        EditText editText2 = this.f81564d;
        if (editText2 == null) {
            C89219l.m154710a("etUserName");
        }
        editText2.setFocusableInTouchMode(true);
        EditText editText3 = this.f81564d;
        if (editText3 == null) {
            C89219l.m154710a("etUserName");
        }
        editText3.requestFocus();
        EditText editText4 = this.f81564d;
        if (editText4 == null) {
            C89219l.m154710a("etUserName");
        }
        if (editText4 instanceof DmtEditText) {
            EditText editText5 = this.f81564d;
            if (editText5 == null) {
                C89219l.m154710a("etUserName");
            }
            Objects.requireNonNull(editText5, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtEditText");
            ((DmtEditText) editText5).setFontType(C17303d.f41567a);
        }
        UrlModel urlModel = null;
        C32783f fVar = new C32783f((RecyclerView) this.f81574p.getValue(), null, new C34549d(this));
        this.f81562b = fVar;
        fVar.f78124a = true;
        mo61021a().setOnClickListener(new View$OnClickListenerC34550e(this));
        ((TextView) this.f81572n.getValue()).setOnClickListener(new View$OnClickListenerC34551f(this));
        this.f81561a.mo58411a("", new C34552g(this));
        mo61022a(0);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(37);
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        User user = this.f81568h;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        }
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48957a = true;
        a.f49126w = aVar.mo34169a();
        a.f49092E = (SmartImageView) this.f81569i.getValue();
        a.mo34186c();
        String b = C80580in.m139684b(user);
        C89219l.m154716b(b, "");
        this.f81575q = b;
        TextView textView = (TextView) this.f81570j.getValue();
        String str = this.f81575q;
        if (str == null) {
            C89219l.m154710a("currentUserName");
        }
        textView.setText(str);
        EditText editText6 = this.f81564d;
        if (editText6 == null) {
            C89219l.m154710a("etUserName");
        }
        editText6.addTextChangedListener(new C34546a(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61024a(Exception exc, int i) {
        if (exc != null) {
            if ((exc instanceof ExecutionException) && (exc.getCause() instanceof C34485a)) {
                Throwable cause = exc.getCause();
                Objects.requireNonNull(cause, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                exc = (Exception) cause;
            }
            if (exc instanceof C34485a) {
                C34485a aVar = (C34485a) exc;
                String valueOf = String.valueOf(aVar.getErrorCode());
                String errorMsg = aVar.getErrorMsg();
                String str = this.f81575q;
                if (str == null) {
                    C89219l.m154710a("currentUserName");
                }
                C80346dk.m139312a(valueOf, errorMsg, str, getContext());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC34545h(Activity activity, User user) {
        super(activity, R.style.fk, true, false, false);
        C89219l.m154721d(activity, "");
        this.f81567g = activity;
        this.f81568h = user;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61025a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            new C23144b(this.f81567g).mo37635a(str).mo37637b();
        }
    }
}
