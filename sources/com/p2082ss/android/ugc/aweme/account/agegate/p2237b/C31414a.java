package com.p2082ss.android.ugc.aweme.account.agegate.p2237b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.analytics.C2592b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1712a.C23019c;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.agegate.C31412b;
import com.p2082ss.android.ugc.aweme.account.agegate.api.CalculateDoBApi;
import com.p2082ss.android.ugc.aweme.account.agegate.model.C31541b;
import com.p2082ss.android.ugc.aweme.account.agegate.p2239d.C31534a;
import com.p2082ss.android.ugc.aweme.account.agegate.p2239d.C31536c;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31563f;
import com.p2082ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.p2082ss.android.ugc.aweme.account.experiment.C31637a;
import com.p2082ss.android.ugc.aweme.account.experiment.C31641b;
import com.p2082ss.android.ugc.aweme.account.experiment.C31642c;
import com.p2082ss.android.ugc.aweme.account.experiment.C31643d;
import com.p2082ss.android.ugc.aweme.account.login.p2261f.AbstractC31918a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a */
public final class C31414a extends AbstractC31431b implements DatePicker.AbstractC31600a {

    /* renamed from: A */
    private final AbstractC89244h f75222A = C89250i.m154773a((AbstractC89171a) C31418d.f75237a);

    /* renamed from: B */
    private AbstractC88412b f75223B;

    /* renamed from: C */
    private HashMap f75224C;

    /* renamed from: a */
    public int f75225a;

    /* renamed from: b */
    public int f75226b;

    /* renamed from: c */
    public int f75227c;

    /* renamed from: d */
    public boolean f75228d;

    /* renamed from: e */
    public boolean f75229e = true;

    /* renamed from: j */
    public long f75230j;

    /* renamed from: y */
    private final AbstractC89244h f75231y = C89250i.m154773a((AbstractC89171a) C31415a.f75233a);

    /* renamed from: z */
    private Date f75232z;

    static {
        Covode.recordClassIndex(38131);
    }

    /* renamed from: E */
    private final C88960c<Boolean> m65636E() {
        return (C88960c) this.f75222A.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.agegate.p2237b.AbstractC31431b
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75224C == null) {
            this.f75224C = new HashMap();
        }
        View view = (View) this.f75224C.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75224C.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.agegate.p2237b.AbstractC31431b
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75224C;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a$a */
    static final class C31415a extends AbstractC89220m implements AbstractC89171a<C31536c> {

        /* renamed from: a */
        public static final C31415a f75233a = new C31415a();

        static {
            Covode.recordClassIndex(38132);
        }

        C31415a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31536c invoke() {
            return new C31536c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a$d */
    static final class C31418d extends AbstractC89220m implements AbstractC89171a<C88960c<Boolean>> {

        /* renamed from: a */
        public static final C31418d f75237a = new C31418d();

        static {
            Covode.recordClassIndex(38135);
        }

        C31418d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88960c<Boolean> invoke() {
            return new C88960c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C2592b.m7537a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        if (C31637a.C31639b.m65949a()) {
            return R.layout.hd;
        }
        return R.layout.he;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2237b.AbstractC31431b, com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: e */
    public final void mo57436e() {
        AbstractC88412b bVar;
        super.mo57436e();
        AbstractC88412b bVar2 = this.f75223B;
        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f75223B) == null)) {
            bVar.dispose();
        }
        this.f75223B = m65636E().mo143291d(200, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C31419e(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.agegate.p2237b.AbstractC31431b, androidx.fragment.app.Fragment
    public final void onStart() {
        String str;
        super.onStart();
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.hl);
        String str2 = null;
        if (inputWithIndicator != null) {
            str = inputWithIndicator.getText();
        } else {
            str = null;
        }
        if (C80537hk.m139613a(str)) {
            C31534a i = mo57450i();
            InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.hl);
            if (inputWithIndicator2 != null) {
                str2 = inputWithIndicator2.getText();
            }
            Date a = i.mo57523a(str2);
            if (a != null) {
                ((DatePicker) mo57434c(R.id.hg)).mo57617a(a);
                C31534a i2 = mo57450i();
                Calendar calendar = i2.f75423b.getCalendar();
                calendar.setTime(a);
                i2.mo57524a(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2237b.AbstractC31431b
    /* renamed from: g */
    public final void mo57437g() {
        String str;
        String str2;
        InputWithIndicator inputWithIndicator;
        EditText editText;
        super.mo57437g();
        ((DatePicker) mo57434c(R.id.hg)).f75562a = this;
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.ho);
        int i = 8;
        if (inputWithIndicator2 == null || inputWithIndicator2.getVisibility() != 8) {
            mo57431a(false);
        } else {
            InputWithIndicator inputWithIndicator3 = (InputWithIndicator) mo57434c(R.id.hl);
            if (!(inputWithIndicator3 == null || (editText = inputWithIndicator3.getEditText()) == null)) {
                editText.setInputType(0);
            }
        }
        if (((AbstractC31431b) this).f75267m) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);
                Bundle arguments = getArguments();
                if (arguments == null || (str = arguments.getString("default_dob")) == null) {
                    str = "";
                }
                Date parse = simpleDateFormat.parse(str);
                Calendar instance = Calendar.getInstance();
                Bundle arguments2 = getArguments();
                if (arguments2 == null || (str2 = arguments2.getString("upper_bound_date")) == null) {
                    str2 = "";
                }
                instance.setTime(simpleDateFormat.parse(str2));
                C31412b.m65630a((DatePicker) mo57434c(R.id.hg), instance, parse);
                if (this.f75268n == 2 && (inputWithIndicator = (InputWithIndicator) mo57434c(R.id.hl)) != null) {
                    String format = DateFormat.getDateInstance(1, new Locale(((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a(), C58071d.m104907a())).format(parse);
                    C89219l.m154716b(format, "");
                    inputWithIndicator.setText(format);
                }
            } catch (Exception unused) {
                C31412b.m65631a((DatePicker) mo57434c(R.id.hg), null);
            }
            mo58495a(mo57434c(R.id.hi), new View$OnClickListenerC31420f(this));
        } else {
            C31412b.m65631a((DatePicker) mo57434c(R.id.hg), this.f75232z);
            mo58495a(mo57434c(R.id.hi), new View$OnClickListenerC31422g(this));
        }
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.cwn);
        C89219l.m154716b(tuxTextView, "");
        if (C31642c.m65951a() && this.f75228d) {
            i = 0;
        }
        tuxTextView.setVisibility(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.account.agegate.p2237b.AbstractC31431b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        super.onDestroyView();
        DateFormat dateInstance = DateFormat.getDateInstance(3, new Locale(((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a(), C58071d.m104907a()));
        Objects.requireNonNull(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String localizedPattern = ((SimpleDateFormat) dateInstance).toLocalizedPattern();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        C89219l.m154716b(localizedPattern, "");
        Locale locale = Locale.ROOT;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(localizedPattern, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = localizedPattern.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        int length = lowerCase.length();
        for (int i = 0; i < length; i++) {
            char charAt = lowerCase.charAt(i);
            if (!hashSet.contains(Character.valueOf(charAt))) {
                if (charAt == 'd') {
                    arrayList.add("dd");
                } else if (charAt == 'm') {
                    arrayList.add("mm");
                } else if (charAt == 'y') {
                    arrayList.add("yyyy");
                }
                hashSet.add(Character.valueOf(charAt));
            }
        }
        String a = C89070n.m154551a(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
        int i2 = this.f75225a;
        int i3 = this.f75226b;
        int i4 = this.f75227c;
        boolean z = this.f75228d;
        boolean z2 = ((AbstractC31431b) this).f75267m;
        C89219l.m154721d(a, "");
        if (z2) {
            str = "age_edit_scroll_results";
        } else {
            str = "age_scroll_result";
        }
        C39162r.m79460a(str, new C31376a().mo57399a("default_format", a).mo57397a("day", i2).mo57397a("month", i3).mo57397a("year", i4).mo57397a("selected_cnt", Math.max(i2, Math.max(i3, i4))).mo57397a("is_submit", z ? 1 : 0).f75156a);
        this.f75225a = 0;
        this.f75226b = 0;
        this.f75227c = 0;
        mo57438h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a$b */
    public static final class C31416b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31414a f75234a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f75235b;

        static {
            Covode.recordClassIndex(38133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31416b(C31414a aVar, AbstractC89172b bVar) {
            super(1);
            this.f75234a = aVar;
            this.f75235b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            this.f75234a.mo57433b(false);
            this.f75235b.invoke(Integer.valueOf(intValue));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a$h */
    static final class C31424h extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31414a f75243a;

        static {
            Covode.recordClassIndex(38141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31424h(C31414a aVar) {
            super(1);
            this.f75243a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(R.string.as0, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31414a.C31424h.C314251 */

                /* renamed from: a */
                final /* synthetic */ C31424h f75244a;

                static {
                    Covode.recordClassIndex(38142);
                }

                {
                    this.f75244a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C39162r.m79460a("age_edit_confirm_popup_result", new C31376a().mo57399a("enter_from", "age_edit_page").mo57397a("is_confirm", 1).f75156a);
                    this.f75244a.f75243a.mo57450i().mo57525a(!((AbstractC31431b) this.f75244a.f75243a).f75266l, ((AbstractC31431b) this.f75244a.f75243a).f75267m);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37416a(R.string.bis, C314262.f75245a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a$e */
    static final class C31419e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C31414a f75238a;

        static {
            Covode.recordClassIndex(38136);
        }

        C31419e(C31414a aVar) {
            this.f75238a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C31414a aVar = this.f75238a;
                InputWithIndicator inputWithIndicator = (InputWithIndicator) aVar.mo57434c(R.id.hl);
                C89219l.m154716b(inputWithIndicator, "");
                IBinder windowToken = inputWithIndicator.getWindowToken();
                C89219l.m154716b(windowToken, "");
                aVar.mo58462a(windowToken);
            }
            this.f75238a.mo57431a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a$i */
    static final class C31427i extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31414a f75246a;

        static {
            Covode.recordClassIndex(38144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31427i(C31414a aVar) {
            super(1);
            this.f75246a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (C31642c.m65951a()) {
                bVar2.mo37416a(R.string.bx, new AbstractC89172b<C23024a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31414a.C31427i.C314281 */

                    /* renamed from: a */
                    final /* synthetic */ C31427i f75247a;

                    static {
                        Covode.recordClassIndex(38145);
                    }

                    {
                        this.f75247a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        String str;
                        C89219l.m154721d(aVar, "");
                        C31376a a = new C31376a().mo57399a("result", "ok");
                        if (((AbstractC31431b) this.f75247a.f75246a).f75266l) {
                            str = "existing";
                        } else {
                            str = "new";
                        }
                        C39162r.m79460a("confirmation_pop_up_response", a.mo57399a("user_type", str).f75156a);
                        TuxTextView tuxTextView = (TuxTextView) this.f75247a.f75246a.mo57434c(R.id.cwn);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setVisibility(0);
                        return C89391z.f203057a;
                    }
                });
            } else {
                bVar2.mo37416a(R.string.fet, new AbstractC89172b<C23024a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31414a.C31427i.C314292 */

                    /* renamed from: a */
                    final /* synthetic */ C31427i f75248a;

                    static {
                        Covode.recordClassIndex(38146);
                    }

                    {
                        this.f75248a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        String str;
                        C89219l.m154721d(aVar, "");
                        C31376a a = new C31376a().mo57399a("result", "go_back_to_edit");
                        if (((AbstractC31431b) this.f75248a.f75246a).f75266l) {
                            str = "existing";
                        } else {
                            str = "new";
                        }
                        C39162r.m79460a("confirmation_pop_up_response", a.mo57399a("user_type", str).f75156a);
                        return C89391z.f203057a;
                    }
                });
                bVar2.mo37416a(R.string.fes, new AbstractC89172b<C23024a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31414a.C31427i.C314303 */

                    /* renamed from: a */
                    final /* synthetic */ C31427i f75249a;

                    static {
                        Covode.recordClassIndex(38147);
                    }

                    {
                        this.f75249a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        String str;
                        C89219l.m154721d(aVar, "");
                        C31376a a = new C31376a().mo57399a("result", "confirm_date");
                        if (((AbstractC31431b) this.f75249a.f75246a).f75266l) {
                            str = "existing";
                        } else {
                            str = "new";
                        }
                        C39162r.m79460a("confirmation_pop_up_response", a.mo57399a("user_type", str).f75156a);
                        this.f75249a.f75246a.mo57450i().mo57525a(!((AbstractC31431b) this.f75249a.f75246a).f75266l, ((AbstractC31431b) this.f75249a.f75246a).f75267m);
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2237b.AbstractC31431b, com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: b */
    public final void mo57432b(int i) {
        ((InputResultIndicator) mo57434c(R.id.hm)).mo58483a(false);
        ((InputWithIndicator) mo57434c(R.id.ho)).getEditText().setEnabled(false);
        super.mo57432b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a$f */
    static final class View$OnClickListenerC31420f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31414a f75239a;

        static {
            Covode.recordClassIndex(38137);
        }

        View$OnClickListenerC31420f(C31414a aVar) {
            this.f75239a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("click_age_edit_confirm", new C31376a().mo57399a("enter_method", this.f75239a.mo58467x()).mo57399a("enter_from", "age_edit_page").mo57398a("input_time", System.currentTimeMillis() - this.f75239a.f75230j).f75156a);
            this.f75239a.f75228d = true;
            ((AbstractC31431b) this.f75239a).f75265k = 0;
            this.f75239a.f75230j = 0;
            this.f75239a.mo57433b(true);
            this.f75239a.mo57427a(2, new AbstractC89172b<Integer, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31414a.View$OnClickListenerC31420f.C314211 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31420f f75240a;

                static {
                    Covode.recordClassIndex(38138);
                }

                {
                    this.f75240a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Integer num) {
                    Editable editable;
                    int i;
                    EditText editText;
                    int intValue = num.intValue();
                    C31414a aVar = this.f75240a.f75239a;
                    if (aVar.getActivity() != null) {
                        C39162r.m79460a("show_age_edit_confirm_popup", new C31376a().mo57399a("enter_from", "age_edit_page").f75156a);
                        ActivityC0945e activity = aVar.getActivity();
                        if (activity == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(activity, "");
                        C23023b bVar = new C23023b(activity);
                        Object[] objArr = new Object[1];
                        InputWithIndicator inputWithIndicator = (InputWithIndicator) aVar.mo57434c(R.id.hl);
                        if (inputWithIndicator == null || (editText = inputWithIndicator.getEditText()) == null || (editable = editText.getText()) == null) {
                            editable = "";
                        }
                        objArr[0] = editable;
                        C23023b a = C23028c.m43435a(bVar.mo37411b(aVar.getString(R.string.qg, objArr)).mo37413d(aVar.mo57425a(intValue)), new C31424h(aVar));
                        ActivityC0945e activity2 = aVar.getActivity();
                        if (activity2 == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(activity2, "");
                        TuxTextView tuxTextView = new TuxTextView(activity2, null, 0, 6);
                        if (aVar.f75269o == 1) {
                            i = R.string.h4d;
                        } else {
                            i = R.string.qf;
                        }
                        tuxTextView.setText(aVar.getString(i));
                        tuxTextView.setTuxFont(41);
                        tuxTextView.setTextColor(C0643b.m2378c(tuxTextView.getContext(), R.color.c4));
                        tuxTextView.setGravity(17);
                        ((C23023b) C23019c.m43408a(a, tuxTextView).mo37482a(false)).mo37405a().mo37396b().show();
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a$g */
    static final class View$OnClickListenerC31422g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31414a f75241a;

        static {
            Covode.recordClassIndex(38139);
        }

        View$OnClickListenerC31422g(C31414a aVar) {
            this.f75241a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("choose_birthday_next", new C31376a().mo57399a("enter_method", this.f75241a.mo58467x()).f75156a);
            ((AbstractC31431b) this.f75241a).f75265k = 0;
            if (C16048b.m29633a().mo25421a(true, "age_gate_only_year_confirm_dialog", false) == C31643d.f75689a && this.f75241a.f75229e && this.f75241a.f75227c > 0 && this.f75241a.f75226b == 0 && this.f75241a.f75225a == 0) {
                this.f75241a.mo57433b(true);
                this.f75241a.mo57427a(1, new AbstractC89172b<Integer, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31414a.View$OnClickListenerC31422g.C314231 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC31422g f75242a;

                    static {
                        Covode.recordClassIndex(38140);
                    }

                    {
                        this.f75242a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Integer num) {
                        String str;
                        String str2;
                        num.intValue();
                        C31414a aVar = this.f75242a.f75241a;
                        if (aVar.getActivity() != null) {
                            C31376a a = new C31376a().mo57399a("enter_method", "only_scroll_year");
                            if (((AbstractC31431b) aVar).f75266l) {
                                str = "existing";
                            } else {
                                str = "new";
                            }
                            C39162r.m79460a("show_confirmation_pop_up", a.mo57399a("user_type", str).f75156a);
                            InputWithIndicator inputWithIndicator = (InputWithIndicator) aVar.mo57434c(R.id.hl);
                            if (inputWithIndicator == null || (str2 = inputWithIndicator.getText()) == null) {
                                str2 = "";
                            }
                            ActivityC0945e activity = aVar.getActivity();
                            if (activity == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(activity, "");
                            C23023b a2 = new C23023b(activity).mo37411b(aVar.getString(R.string.feq));
                            String string = aVar.getString(R.string.fep, str2);
                            C89219l.m154716b(string, "");
                            C23023b c = a2.mo37413d(aVar.mo57426a(string, str2));
                            if (C16048b.m29633a().mo25421a(true, "age_gate_only_year_confirm_dialog_desc", false) == C31641b.f75685a) {
                                ActivityC0945e activity2 = aVar.getActivity();
                                if (activity2 == null) {
                                    C89219l.m154715b();
                                }
                                C89219l.m154716b(activity2, "");
                                TuxTextView tuxTextView = new TuxTextView(activity2, null, 0, 6);
                                tuxTextView.setText(aVar.getString(R.string.fer));
                                tuxTextView.setTuxFont(41);
                                tuxTextView.setTextColor(C0643b.m2378c(tuxTextView.getContext(), R.color.c4));
                                tuxTextView.setGravity(17);
                                C23019c.m43408a(c, tuxTextView);
                            }
                            ((C23023b) C23028c.m43435a(c, new C31427i(aVar)).mo37482a(false)).mo37405a().mo37396b().show();
                            aVar.f75229e = false;
                        }
                        return C89391z.f203057a;
                    }
                });
            } else {
                this.f75241a.mo57450i().mo57525a(!((AbstractC31431b) this.f75241a).f75266l, ((AbstractC31431b) this.f75241a).f75267m);
            }
            this.f75241a.f75228d = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SpannableStringBuilder mo57425a(int i) {
        int i2;
        Locale locale = Locale.ROOT;
        Resources resources = getResources();
        if (this.f75269o == 1) {
            i2 = R.plurals.ie;
        } else {
            i2 = R.plurals.o;
        }
        String quantityString = resources.getQuantityString(i2, i);
        C89219l.m154716b(quantityString, "");
        String a = C1764a.m5929a(locale, quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C89219l.m154716b(a, "");
        int a2 = C89361p.m154888a((CharSequence) a, String.valueOf(i), 0, false, 6);
        int length = String.valueOf(i).length() + a2;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(context, R.color.bx)), a2, length, 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), a2, length, 18);
            return spannableStringBuilder;
        } catch (Exception unused) {
            return new SpannableStringBuilder(a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: b */
    public final void mo57433b(boolean z) {
        if (!af_()) {
            return;
        }
        if (z) {
            ((InputResultIndicator) mo57434c(R.id.hm)).mo58483a(true);
            ((InputWithIndicator) mo57434c(R.id.ho)).getEditText().setEnabled(true);
            LinearLayout linearLayout = (LinearLayout) mo57434c(R.id.hj);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            ((LoadingButton) mo57434c(R.id.hi)).mo58776a(true);
            return;
        }
        ((LoadingButton) mo57434c(R.id.hi)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: a */
    public final void mo57430a(String str) {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.hl);
        if (inputWithIndicator != null) {
            if (str == null) {
                str = "";
            }
            inputWithIndicator.setText(str);
        }
    }

    /* renamed from: a */
    public final void mo57431a(boolean z) {
        int i;
        DatePicker datePicker = (DatePicker) mo57434c(R.id.hg);
        C89219l.m154716b(datePicker, "");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        datePicker.setVisibility(i);
        Button button = (Button) mo57434c(R.id.hk);
        C89219l.m154716b(button, "");
        if (!z) {
            i2 = 8;
        }
        button.setVisibility(i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2237b.AbstractC31431b
    /* renamed from: a */
    public final void mo57428a(View view, boolean z) {
        C89219l.m154721d(view, "");
        super.mo57428a(view, z);
        m65636E().onNext(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SpannableStringBuilder mo57426a(String str, String str2) {
        int a = C89361p.m154888a((CharSequence) str, str2, 0, false, 6);
        int length = str2.length() + a;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(context, R.color.bx)), a, length, 18);
            spannableStringBuilder.setSpan(new C23126b(42), a, length, 18);
            return spannableStringBuilder;
        } catch (Exception unused) {
            return new SpannableStringBuilder(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.a$c */
    public static final class C31417c extends AbstractC89220m implements AbstractC89183m<Integer, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31414a f75236a;

        static {
            Covode.recordClassIndex(38134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31417c(C31414a aVar) {
            super(2);
            this.f75236a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, String str) {
            int intValue = num.intValue();
            String str2 = str;
            C89219l.m154721d(str2, "");
            this.f75236a.mo57433b(false);
            if (intValue == 56004) {
                this.f75236a.mo57448c(str2);
            } else {
                C31563f.m65842a(this.f75236a.mo57441a(new AbstractC31918a.C31923e(intValue)));
                if (AbstractC31431b.f75251r.contains(Integer.valueOf(intValue))) {
                    this.f75236a.mo57444a(str2, intValue);
                } else {
                    C23144b bVar = new C23144b(this.f75236a);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = this.f75236a.getString(R.string.fz3);
                        C89219l.m154716b(str2, "");
                    }
                    bVar.mo37635a(str2).mo37637b();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo57427a(int i, AbstractC89172b<? super Integer, C89391z> bVar) {
        boolean z;
        this.f75231y.getValue();
        String d = ((C31541b) mo57450i().f92286h).mo57545d();
        C89219l.m154716b(d, "");
        C31416b bVar2 = new C31416b(this, bVar);
        C31417c cVar = new C31417c(this);
        int i2 = 1;
        if (((AbstractC31431b) this).f75266l || ((AbstractC31431b) this).f75267m) {
            z = false;
        } else {
            z = true;
        }
        C89219l.m154721d(d, "");
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(cVar, "");
        if (!z) {
            i2 = 2;
        }
        C89219l.m154721d(d, "");
        CalculateDoBApi.C31409a.f75215a.calculateDoB(d, i, i2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C31536c.C31537a(bVar2, cVar), new C31536c.C31538b(cVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker.AbstractC31600a
    /* renamed from: a */
    public final void mo57429a(DatePicker datePicker, int i, int i2, int i3, Calendar calendar, int i4) {
        C89219l.m154721d(datePicker, "");
        C89219l.m154721d(calendar, "");
        mo57450i().mo57524a(i, i2, i3);
        ((InputResultIndicator) mo57434c(R.id.hm)).mo58483a(true);
        ((InputWithIndicator) mo57434c(R.id.ho)).getEditText().setEnabled(true);
        LinearLayout linearLayout = (LinearLayout) mo57434c(R.id.hj);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(8);
        if (this.f75230j == 0) {
            this.f75230j = System.currentTimeMillis();
        }
        this.f75232z = calendar.getTime();
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 && this.f75225a == 0) {
                    this.f75225a = Math.max(this.f75226b, this.f75227c) + 1;
                }
            } else if (this.f75226b == 0) {
                this.f75226b = Math.max(this.f75225a, this.f75227c) + 1;
            }
        } else if (this.f75227c == 0) {
            this.f75227c = Math.max(this.f75225a, this.f75226b) + 1;
        }
    }
}
