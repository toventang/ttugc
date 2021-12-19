package com.p2082ss.android.ugc.aweme.shoutouts.review;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsPublishReviewApi;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b */
public final class View$OnClickListenerC74531b extends Fragment implements View.OnClickListener {

    /* renamed from: g */
    public static final C74532a f167591g = new C74532a((byte) 0);

    /* renamed from: a */
    public TuxTextView f167592a;

    /* renamed from: b */
    public AbstractC74533b f167593b;

    /* renamed from: c */
    public int f167594c;

    /* renamed from: d */
    public boolean f167595d;

    /* renamed from: e */
    public TuxButton f167596e;

    /* renamed from: f */
    public EditText f167597f;

    /* renamed from: h */
    private View f167598h;

    /* renamed from: i */
    private ShoutOutRatingBar f167599i;

    /* renamed from: j */
    private final String f167600j;

    /* renamed from: k */
    private final String f167601k;

    /* renamed from: l */
    private SparseArray f167602l;

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b$b */
    public interface AbstractC74533b {
        static {
            Covode.recordClassIndex(87339);
        }

        /* renamed from: a */
        void mo117173a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b$e */
    static final class C74536e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C74536e f167605a = new C74536e();

        static {
            Covode.recordClassIndex(87342);
        }

        C74536e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(87337);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b$a */
    public static final class C74532a {
        static {
            Covode.recordClassIndex(87338);
        }

        private C74532a() {
        }

        public /* synthetic */ C74532a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b$i */
    public static final class C74540i implements KeyboardUtils.AbstractC34711a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC74531b f167609a;

        static {
            Covode.recordClassIndex(87346);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
        /* renamed from: b */
        public final void mo61027b() {
            this.f167609a.f167595d = true;
            TuxTextView tuxTextView = this.f167609a.f167592a;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
        /* renamed from: c */
        public final void mo61028c() {
            String obj;
            Integer valueOf;
            TuxTextView tuxTextView;
            this.f167609a.f167595d = false;
            EditText editText = this.f167609a.f167597f;
            if (editText == null) {
                C89219l.m154710a("etInput");
            }
            Editable text = editText.getText();
            if (text != null && (obj = text.toString()) != null && (valueOf = Integer.valueOf(obj.length())) != null && valueOf.intValue() == 0 && (tuxTextView = this.f167609a.f167592a) != null) {
                tuxTextView.setVisibility(8);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74540i(View$OnClickListenerC74531b bVar) {
            this.f167609a = bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f167602l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b$h */
    public static final class C74539h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC74531b f167608a;

        static {
            Covode.recordClassIndex(87345);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74539h(View$OnClickListenerC74531b bVar) {
            this.f167608a = bVar;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Integer num;
            TuxTextView tuxTextView;
            if (charSequence != null) {
                num = Integer.valueOf(charSequence.length());
            } else {
                num = null;
            }
            C89269g gVar = new C89269g(0, 200);
            if (num != null && gVar.mo143686a(num.intValue())) {
                TuxTextView tuxTextView2 = this.f167608a.f167592a;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(0);
                }
                if (!(charSequence == null || (tuxTextView = this.f167608a.f167592a) == null)) {
                    tuxTextView.setText(charSequence.length() + "/200");
                }
                if (num != null && num.intValue() == 200) {
                    SpannableString spannableString = new SpannableString("200/200");
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF4C3A")), 0, C89361p.m154882a((CharSequence) spannableString, '/', 0, false, 6), 17);
                    TuxTextView tuxTextView3 = this.f167608a.f167592a;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(spannableString);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxButton m130961a(View$OnClickListenerC74531b bVar) {
        TuxButton tuxButton = bVar.f167596e;
        if (tuxButton == null) {
            C89219l.m154710a("btnSubmit");
        }
        return tuxButton;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b$g */
    static final class C74538g implements ShoutOutRatingBar.AbstractC74572a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC74531b f167607a;

        static {
            Covode.recordClassIndex(87344);
        }

        C74538g(View$OnClickListenerC74531b bVar) {
            this.f167607a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar.AbstractC74572a
        /* renamed from: a */
        public final void mo117196a(float f) {
            this.f167607a.f167594c = (int) f;
            if (this.f167607a.f167594c > 0 && this.f167607a.getContext() != null) {
                View$OnClickListenerC74531b.m130961a(this.f167607a).setEnabled(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b$c */
    static final class C74534c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC74531b f167603a;

        static {
            Covode.recordClassIndex(87340);
        }

        C74534c(View$OnClickListenerC74531b bVar) {
            this.f167603a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            View$OnClickListenerC74531b.m130961a(this.f167603a).setLoading(false);
            new C23144b(this.f167603a).mo37635a(this.f167603a.getResources().getString(R.string.g1d)).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b$f */
    static final class C74537f extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C74537f f167606a = new C74537f();

        static {
            Covode.recordClassIndex(87343);
        }

        C74537f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54462a = -1;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54470i = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54471j = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.b$d */
    static final class C74535d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC74531b f167604a;

        static {
            Covode.recordClassIndex(87341);
        }

        C74535d(View$OnClickListenerC74531b bVar) {
            this.f167604a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (((BaseResponse) obj).status_code == 0) {
                new C23144b(this.f167604a).mo37635a(this.f167604a.getResources().getString(R.string.h56)).mo37637b();
                Context context = this.f167604a.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).finish();
            } else {
                new C23144b(this.f167604a).mo37635a(this.f167604a.getResources().getString(R.string.g1d)).mo37637b();
            }
            View$OnClickListenerC74531b.m130961a(this.f167604a).setLoading(false);
        }
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.z0) {
                ShoutOutRatingBar shoutOutRatingBar = this.f167599i;
                if (shoutOutRatingBar == null) {
                    C89219l.m154710a("ratingBar");
                }
                if (shoutOutRatingBar.getStarStep() > 0.0f) {
                    TuxButton tuxButton = this.f167596e;
                    if (tuxButton == null) {
                        C89219l.m154710a("btnSubmit");
                    }
                    tuxButton.setLoading(true);
                    Object a = RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(ShoutoutsPublishReviewApi.class);
                    C89219l.m154716b(a, "");
                    ShoutoutsPublishReviewApi shoutoutsPublishReviewApi = (ShoutoutsPublishReviewApi) a;
                    String str2 = this.f167600j;
                    String str3 = this.f167601k;
                    int i = this.f167594c;
                    EditText editText = this.f167597f;
                    if (editText == null) {
                        C89219l.m154710a("etInput");
                    }
                    shoutoutsPublishReviewApi.publishReview(str2, str3, i, editText.getText().toString()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143264a(new C74534c(this)).mo143254a(new C74535d(this), C74536e.f167605a);
                    C89378p[] pVarArr = new C89378p[4];
                    pVarArr[0] = C89387v.m154943a("enter_from", "chat");
                    pVarArr[1] = C89387v.m154943a("order_id", this.f167601k);
                    pVarArr[2] = C89387v.m154943a("score", String.valueOf(this.f167594c));
                    EditText editText2 = this.f167597f;
                    if (editText2 == null) {
                        C89219l.m154710a("etInput");
                    }
                    if (TextUtils.isEmpty(editText2.getText().toString())) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    pVarArr[3] = C89387v.m154943a("review_text", str);
                    C39162r.m79460a("show_review_pop_up", C89041ag.m154421a(pVarArr));
                    return;
                }
                new C23144b(this).mo37635a(getResources().getString(R.string.h53)).mo37637b();
            } else if (id == R.id.bu5) {
                AbstractC74533b bVar = this.f167593b;
                if (bVar != null) {
                    bVar.mo117173a();
                }
            } else if (id != R.id.s6) {
            } else {
                if (this.f167595d) {
                    View view2 = this.f167598h;
                    if (view2 == null) {
                        C89219l.m154710a("bgGray");
                    }
                    KeyboardUtils.m70897c(view2);
                    return;
                }
                AbstractC74533b bVar2 = this.f167593b;
                if (bVar2 != null) {
                    bVar2.mo117173a();
                }
            }
        }
    }

    private View$OnClickListenerC74531b(String str, String str2) {
        this.f167600j = str;
        this.f167601k = str2;
    }

    public /* synthetic */ View$OnClickListenerC74531b(String str, String str2, byte b) {
        this(str, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.azn, viewGroup, false);
        View findViewById = a.findViewById(R.id.s6);
        C89219l.m154716b(findViewById, "");
        this.f167598h = findViewById;
        if (findViewById == null) {
            C89219l.m154710a("bgGray");
        }
        findViewById.setOnClickListener(this);
        if (viewGroup != null) {
            View findViewById2 = a.findViewById(R.id.dnb);
            C23008e a2 = C23009f.m43397a(C74537f.f167606a);
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            findViewById2.setBackground(a2.mo37389a(context));
            findViewById2.setClickable(true);
        }
        View findViewById3 = a.findViewById(R.id.bu5);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        View findViewById4 = a.findViewById(R.id.z0);
        C89219l.m154716b(findViewById4, "");
        TuxButton tuxButton = (TuxButton) findViewById4;
        this.f167596e = tuxButton;
        if (tuxButton == null) {
            C89219l.m154710a("btnSubmit");
        }
        tuxButton.setEnabled(false);
        TuxButton tuxButton2 = this.f167596e;
        if (tuxButton2 == null) {
            C89219l.m154710a("btnSubmit");
        }
        tuxButton2.setOnClickListener(this);
        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.eti);
        this.f167592a = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText("0/200");
        }
        View findViewById5 = a.findViewById(R.id.def);
        C89219l.m154716b(findViewById5, "");
        ShoutOutRatingBar shoutOutRatingBar = (ShoutOutRatingBar) findViewById5;
        this.f167599i = shoutOutRatingBar;
        if (shoutOutRatingBar == null) {
            C89219l.m154710a("ratingBar");
        }
        shoutOutRatingBar.setOnRatingChangeListener(new C74538g(this));
        View findViewById6 = a.findViewById(R.id.ax1);
        C89219l.m154716b(findViewById6, "");
        EditText editText = (EditText) findViewById6;
        this.f167597f = editText;
        if (editText == null) {
            C89219l.m154710a("etInput");
        }
        editText.addTextChangedListener(new C74539h(this));
        Context context2 = getContext();
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        KeyboardUtils.m70895a((AbstractC1204m) context2, viewGroup, new C74540i(this));
        C39162r.m79460a("show_review_pop_up", C89041ag.m154421a(C89387v.m154943a("enter_from", "chat"), C89387v.m154943a("order_id", this.f167601k)));
        return a;
    }
}
