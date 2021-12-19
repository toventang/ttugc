package com.p2082ss.android.ugc.aweme.account.login;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IGuestModeService;
import com.p2082ss.android.ugc.aweme.account.base.p2243a.DialogC31590a;
import com.p2082ss.android.ugc.aweme.account.experiment.C31653j;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.account.login.C32821z;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.AbstractC31817c;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.AbstractC31843l;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31816b;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31824e;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31828h;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31840j;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31842k;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32867m;
import com.p2082ss.android.ugc.aweme.account.util.C33046o;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;
import com.p2082ss.android.ugc.aweme.account.views.C33064a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p2307ai.View$OnTouchListenerC33468a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.j */
public final class C31943j {

    /* renamed from: a */
    final AbstractC89244h f76290a = C89250i.m154774a(EnumC89331m.NONE, new C31957n(this));

    /* renamed from: b */
    final AbstractC89244h f76291b = C89250i.m154774a(EnumC89331m.NONE, new C31945b(this));

    /* renamed from: c */
    public Dialog f76292c;

    /* renamed from: d */
    public Dialog f76293d;

    /* renamed from: e */
    public Dialog f76294e;

    /* renamed from: f */
    public C31840j f76295f;

    /* renamed from: g */
    public final int f76296g;

    /* renamed from: h */
    public final I18nSignUpActivity f76297h;

    /* renamed from: i */
    public final View f76298i;

    /* renamed from: j */
    public final boolean f76299j;

    /* renamed from: k */
    public final boolean f76300k;

    /* renamed from: l */
    public final boolean f76301l;

    /* renamed from: m */
    public final boolean f76302m;

    /* renamed from: n */
    private final AbstractC89244h f76303n = C89250i.m154774a(EnumC89331m.NONE, new C31956m(this));

    /* renamed from: o */
    private final AbstractC89244h f76304o = C89250i.m154774a(EnumC89331m.NONE, new C31955l(this));

    /* renamed from: p */
    private final AbstractC89244h f76305p = C89250i.m154774a(EnumC89331m.NONE, new C31944a(this));

    /* renamed from: q */
    private final AbstractC89244h f76306q = C89250i.m154774a(EnumC89331m.NONE, new C31958o(this));

    /* renamed from: r */
    private final boolean f76307r;

    static {
        Covode.recordClassIndex(38687);
    }

    /* renamed from: b */
    private final TextView m66318b() {
        return (TextView) this.f76304o.getValue();
    }

    /* renamed from: c */
    private final TextView m66319c() {
        return (TextView) this.f76306q.getValue();
    }

    /* renamed from: a */
    public final RecyclerView mo57871a() {
        return (RecyclerView) this.f76305p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$b */
    static final class C31945b extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C31943j f76309a;

        static {
            Covode.recordClassIndex(38689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31945b(C31943j jVar) {
            super(0);
            this.f76309a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f76309a.f76297h.findViewById(R.id.amc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$l */
    static final class C31955l extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C31943j f76320a;

        static {
            Covode.recordClassIndex(38699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31955l(C31943j jVar) {
            super(0);
            this.f76320a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f76320a.f76298i.findViewById(R.id.cdo);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$m */
    static final class C31956m extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C31943j f76321a;

        static {
            Covode.recordClassIndex(38700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31956m(C31943j jVar) {
            super(0);
            this.f76321a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f76321a.f76297h.findViewById(R.id.a3y);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$n */
    static final class C31957n extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C31943j f76322a;

        static {
            Covode.recordClassIndex(38701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31957n(C31943j jVar) {
            super(0);
            this.f76322a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f76322a.f76297h.findViewById(R.id.eiz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$o */
    static final class C31958o extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C31943j f76323a;

        static {
            Covode.recordClassIndex(38702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31958o(C31943j jVar) {
            super(0);
            this.f76323a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f76323a.f76298i.findViewById(R.id.f6u);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$a */
    static final class C31944a extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C31943j f76308a;

        static {
            Covode.recordClassIndex(38688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31944a(C31943j jVar) {
            super(0);
            this.f76308a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            RecyclerView recyclerView = (RecyclerView) this.f76308a.f76298i.findViewById(R.id.a3z);
            RecyclerView recyclerView2 = (RecyclerView) this.f76308a.f76298i.findViewById(R.id.a40);
            if (this.f76308a.f76302m) {
                C89219l.m154716b(recyclerView, "");
                recyclerView.setVisibility(8);
                C89219l.m154716b(recyclerView2, "");
                recyclerView2.setVisibility(0);
                recyclerView2.setNestedScrollingEnabled(true);
                return recyclerView2;
            }
            C89219l.m154716b(recyclerView, "");
            recyclerView.setVisibility(0);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setVisibility(8);
            return recyclerView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$d */
    public static final class C31947d implements AbstractC31843l {

        /* renamed from: a */
        final /* synthetic */ C31943j f76311a;

        static {
            Covode.recordClassIndex(38691);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2254a.AbstractC31843l
        /* renamed from: a */
        public final void mo57785a() {
            C39162r.onEventV3("signup_channel_unfold");
            List<? extends C31828h> g = C89070n.m154585g((Collection) this.f76311a.f76297h.mo57728n());
            C31840j a = C31943j.m66317a(this.f76311a);
            C89269g a2 = C89271h.m154766a(0, g.size() - Math.min(this.f76311a.f76296g, this.f76311a.f76297h.mo57728n().size()));
            ArrayList arrayList = new ArrayList(C89070n.m154526a(a2, 10));
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AbstractC89040af) it).mo143429a() + this.f76311a.f76296g));
            }
            a.mo57783a(arrayList);
            C31943j.m66317a(this.f76311a).mo57784b(g);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31947d(C31943j jVar) {
            this.f76311a = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$h */
    public static final class C31951h implements AbstractC31817c {

        /* renamed from: a */
        final /* synthetic */ C31943j f76315a;

        static {
            Covode.recordClassIndex(38695);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2254a.AbstractC31817c
        /* renamed from: a */
        public final void mo57768a() {
            String b = this.f76315a.f76297h.mo57715b();
            C89219l.m154716b(b, "");
            String c = this.f76315a.f76297h.mo57717c();
            C89219l.m154716b(c, "");
            C89219l.m154721d(b, "");
            C89219l.m154721d(c, "");
            C39162r.m79460a("click_guestmode", new C33744d().mo59983a("enter_from", b).mo59983a("enter_method", c).f79943a);
            IGuestModeService d = GuestModeServiceImpl.m65990d();
            I18nSignUpActivity i18nSignUpActivity = this.f76315a.f76297h;
            Bundle bundle = new Bundle();
            bundle.putString("enter_method", this.f76315a.f76297h.mo57717c());
            bundle.putString("enter_from", this.f76315a.f76297h.mo57715b());
            d.mo57216a(i18nSignUpActivity, bundle);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31951h(C31943j jVar) {
            this.f76315a = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$j */
    public static final class C31953j implements AbstractC31843l {

        /* renamed from: a */
        final /* synthetic */ C31943j f76317a;

        /* renamed from: b */
        final /* synthetic */ IGuestModeService f76318b;

        static {
            Covode.recordClassIndex(38697);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2254a.AbstractC31843l
        /* renamed from: a */
        public final void mo57785a() {
            C39162r.onEventV3("signup_channel_unfold");
            List<? extends C31828h> g = C89070n.m154585g((Collection) this.f76317a.f76297h.mo57727m());
            C31840j a = C31943j.m66317a(this.f76317a);
            C89269g a2 = C89271h.m154766a(0, g.size() - Math.min(this.f76317a.f76296g, this.f76317a.f76297h.mo57727m().size()));
            ArrayList arrayList = new ArrayList(C89070n.m154526a(a2, 10));
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AbstractC89040af) it).mo143429a() + this.f76317a.f76296g));
            }
            a.mo57783a(arrayList);
            if (this.f76318b.mo57218b() && !this.f76318b.mo57219c()) {
                g.add(C31816b.f76045a);
            }
            this.f76317a.f76297h.f75944c = true;
            this.f76317a.f76297h.mo57711a(this.f76317a.f76299j);
            C31943j.m66317a(this.f76317a).mo57784b(g);
        }

        C31953j(C31943j jVar, IGuestModeService iGuestModeService) {
            this.f76317a = jVar;
            this.f76318b = iGuestModeService;
        }
    }

    /* renamed from: d */
    private final void m66320d() {
        int i;
        IGuestModeService d = GuestModeServiceImpl.m65990d();
        I18nSignUpActivity i18nSignUpActivity = this.f76297h;
        TextView c = m66319c();
        View$OnClickListenerC31948e eVar = new View$OnClickListenerC31948e(this);
        View$OnClickListenerC31949f fVar = new View$OnClickListenerC31949f(this);
        View$OnClickListenerC31950g gVar = new View$OnClickListenerC31950g(this);
        if (C32821z.f78187a.contains(C58071d.m104907a().toUpperCase())) {
            if (!this.f76299j || !d.mo57218b() || d.mo57219c()) {
                i = R.string.asw;
            } else {
                i = R.string.asv;
            }
        } else if (!this.f76299j || !d.mo57218b() || d.mo57219c()) {
            i = R.string.at4;
        } else {
            i = R.string.at3;
        }
        String string = i18nSignUpActivity.getString(R.string.asz);
        String string2 = i18nSignUpActivity.getString(R.string.asy);
        String string3 = i18nSignUpActivity.getString(R.string.asx);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i18nSignUpActivity.getString(i, string, string2, string3));
        int c2 = C0643b.m2378c(i18nSignUpActivity, R.color.a2);
        int c3 = C0643b.m2378c(i18nSignUpActivity, R.color.a2);
        C32821z.C328276 r10 = new AbstractC33066c(c2, c3, eVar) {
            /* class com.p2082ss.android.ugc.aweme.account.login.C32821z.C328276 */

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f78193a;

            static {
                Covode.recordClassIndex(39607);
            }

            public final void onClick(View view) {
                View.OnClickListener onClickListener = this.f78193a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setFakeBoldText(true);
                textPaint.setUnderlineText(false);
            }

            {
                this.f78193a = r3;
            }
        };
        C32821z.C328287 r9 = new AbstractC33066c(c2, c3, fVar) {
            /* class com.p2082ss.android.ugc.aweme.account.login.C32821z.C328287 */

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f78194a;

            static {
                Covode.recordClassIndex(39608);
            }

            public final void onClick(View view) {
                View.OnClickListener onClickListener = this.f78194a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setFakeBoldText(true);
                textPaint.setUnderlineText(false);
            }

            {
                this.f78194a = r3;
            }
        };
        C32821z.C328298 r7 = new AbstractC33066c(c2, c3, gVar) {
            /* class com.p2082ss.android.ugc.aweme.account.login.C32821z.C328298 */

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f78195a;

            static {
                Covode.recordClassIndex(39609);
            }

            public final void onClick(View view) {
                View.OnClickListener onClickListener = this.f78195a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setFakeBoldText(true);
                textPaint.setUnderlineText(false);
            }

            {
                this.f78195a = r3;
            }
        };
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf = spannableStringBuilder2.indexOf(string);
        int indexOf2 = spannableStringBuilder2.indexOf(string2);
        int indexOf3 = spannableStringBuilder2.indexOf(string3);
        if (indexOf < 0 || indexOf2 < 0) {
            C32837b.m67404a("text_highlight_not_match", "", new C33743c().mo59976a("enter_from", "login").mo59977a());
        }
        spannableStringBuilder.setSpan(r10, indexOf, string.length() + indexOf, 34);
        spannableStringBuilder.setSpan(r9, indexOf2, string2.length() + indexOf2, 34);
        if (indexOf3 >= 0) {
            spannableStringBuilder.setSpan(r7, indexOf3, string3.length() + indexOf3, 34);
        }
        c.setHighlightColor(C0643b.m2378c(i18nSignUpActivity, R.color.c9));
        c.setText(spannableStringBuilder);
        c.setMovementMethod(C33064a.m67722a());
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$k */
    public static final class C31954k extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C31943j f76319a;

        static {
            Covode.recordClassIndex(38698);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31954k(C31943j jVar) {
            this.f76319a = jVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            View childAt = this.f76319a.mo57871a().getChildAt(0);
            if (childAt != null && childAt.getParent() != null) {
                RecyclerView.ViewHolder a = this.f76319a.mo57871a().mo4393a(childAt);
                float f = 1.0f;
                if (a instanceof C31824e) {
                    C31824e eVar = (C31824e) a;
                    if (eVar.f76056a.getHeight() > 0) {
                        int top = eVar.f76057b.getTop();
                        int top2 = eVar.f76056a.getTop();
                        if (top >= 0) {
                            f = 0.0f;
                        } else if (top > (-(eVar.f76056a.getHeight() + top2))) {
                            f = ((float) (Math.abs(top) - top2)) / ((float) eVar.f76056a.getHeight());
                        }
                    }
                }
                ((TextView) this.f76319a.f76290a.getValue()).setAlpha(f);
                ((View) this.f76319a.f76291b.getValue()).setAlpha(f);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C31840j m66317a(C31943j jVar) {
        C31840j jVar2 = jVar.f76295f;
        if (jVar2 == null) {
            C89219l.m154710a("adapter");
        }
        return jVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$c */
    static final class View$OnClickListenerC31946c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31943j f76310a;

        static {
            Covode.recordClassIndex(38690);
        }

        View$OnClickListenerC31946c(C31943j jVar) {
            this.f76310a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f76310a.f76300k || this.f76310a.f76301l) {
                I18nSignUpActivity i18nSignUpActivity = this.f76310a.f76297h;
                if ((i18nSignUpActivity instanceof I18nSignUpActivity) && i18nSignUpActivity != null) {
                    i18nSignUpActivity.mo57726l();
                    i18nSignUpActivity.mo57716b("click_login_signup");
                    return;
                }
                return;
            }
            C32867m.m67466a(this.f76310a.f76297h).withParam(new Bundle(this.f76310a.f76297h.mo57719e())).open();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.j$e */
    public static final class View$OnClickListenerC31948e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31943j f76312a;

        static {
            Covode.recordClassIndex(38692);
        }

        View$OnClickListenerC31948e(C31943j jVar) {
            this.f76312a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f76312a.f76297h.isFinishing()) {
                if (this.f76312a.f76292c == null) {
                    C31943j jVar = this.f76312a;
                    DialogC31590a.C31591a aVar = new DialogC31590a.C31591a();
                    aVar.f75549a = C33046o.m67682a("terms-of-use");
                    jVar.f76292c = aVar.mo57591a(this.f76312a.f76297h);
                }
                Dialog dialog = this.f76312a.f76292c;
                if (dialog == null) {
                    C89219l.m154715b();
                }
                dialog.show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.j$f */
    public static final class View$OnClickListenerC31949f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31943j f76313a;

        static {
            Covode.recordClassIndex(38693);
        }

        View$OnClickListenerC31949f(C31943j jVar) {
            this.f76313a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f76313a.f76297h.isFinishing()) {
                if (this.f76313a.f76293d == null) {
                    C31943j jVar = this.f76313a;
                    DialogC31590a.C31591a aVar = new DialogC31590a.C31591a();
                    aVar.f75549a = C33046o.m67682a("privacy-policy");
                    jVar.f76293d = aVar.mo57591a(this.f76313a.f76297h);
                }
                Dialog dialog = this.f76313a.f76293d;
                if (dialog == null) {
                    C89219l.m154715b();
                }
                dialog.show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.j$g */
    public static final class View$OnClickListenerC31950g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31943j f76314a;

        static {
            Covode.recordClassIndex(38694);
        }

        View$OnClickListenerC31950g(C31943j jVar) {
            this.f76314a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f76314a.f76297h.isFinishing()) {
                if (this.f76314a.f76294e == null) {
                    C31943j jVar = this.f76314a;
                    DialogC31590a.C31591a aVar = new DialogC31590a.C31591a();
                    aVar.f75549a = C33046o.m67682a("cookie-policy");
                    jVar.f76294e = aVar.mo57591a(this.f76314a.f76297h);
                }
                Dialog dialog = this.f76314a.f76294e;
                if (dialog == null) {
                    C89219l.m154715b();
                }
                dialog.show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$i */
    static final class View$OnClickListenerC31952i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31943j f76316a;

        static {
            Covode.recordClassIndex(38696);
        }

        View$OnClickListenerC31952i(C31943j jVar) {
            this.f76316a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            I18nSignUpActivity i18nSignUpActivity = this.f76316a.f76297h;
            if ((i18nSignUpActivity instanceof I18nSignUpActivity) && i18nSignUpActivity != null) {
                i18nSignUpActivity.mo57726l();
                i18nSignUpActivity.mo57716b("click_login_signup");
            }
            C39162r.m79460a("click_login", new C31376a().mo57399a("enter_method", this.f76316a.f76297h.mo57717c()).f75156a);
        }
    }

    /* renamed from: a */
    private final SpannableStringBuilder m66316a(int i, int i2) {
        String string = this.f76297h.getString(i2);
        C89219l.m154716b(string, "");
        String string2 = this.f76297h.getString(i, new Object[]{string});
        C89219l.m154716b(string2, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int a = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
        int c = C0643b.m2378c(this.f76297h, R.color.bh);
        spannableStringBuilder.setSpan(new I18nLoginViewV2$getBottomText$1(c, c), a, string.length() + a, 34);
        return spannableStringBuilder;
    }

    public C31943j(I18nSignUpActivity i18nSignUpActivity, View view, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        List g;
        C89219l.m154721d(i18nSignUpActivity, "");
        C89219l.m154721d(view, "");
        this.f76297h = i18nSignUpActivity;
        this.f76298i = view;
        this.f76299j = z;
        this.f76307r = z2;
        this.f76300k = z3;
        this.f76301l = z4;
        this.f76302m = z5;
        int o = i18nSignUpActivity.mo57729o();
        this.f76296g = o;
        mo57871a().mo4405a(new C31954k(this));
        m66318b().setOnTouchListener(new View$OnTouchListenerC33468a(0.5f));
        if (z) {
            List g2 = C89070n.m154585g((Collection) i18nSignUpActivity.mo57727m().subList(0, Math.min(i18nSignUpActivity.mo57729o(), i18nSignUpActivity.mo57727m().size())));
            if (i18nSignUpActivity.mo57727m().size() > i18nSignUpActivity.mo57729o()) {
                g2.add(C31842k.f76098a);
                i18nSignUpActivity.f75944c = false;
            }
            IGuestModeService d = GuestModeServiceImpl.m65990d();
            if (d.mo57218b() && !d.mo57219c()) {
                g2.add(C31816b.f76045a);
            }
            C31840j jVar = new C31840j(g2, z, 1, z2, z5);
            this.f76295f = jVar;
            C31951h hVar = new C31951h(this);
            C89219l.m154721d(hVar, "");
            jVar.f76090a = hVar;
            RecyclerView a = mo57871a();
            C31840j jVar2 = this.f76295f;
            if (jVar2 == null) {
                C89219l.m154710a("adapter");
            }
            a.setAdapter(jVar2);
            mo57871a().setLayoutManager(new LinearLayoutManager());
            m66318b().setText(m66316a(R.string.aq3, R.string.aq4));
            m66318b().setOnClickListener(new View$OnClickListenerC31952i(this));
            m66320d();
            C31840j jVar3 = this.f76295f;
            if (jVar3 == null) {
                C89219l.m154710a("adapter");
            }
            jVar3.mo57782a(new C31953j(this, d));
        } else {
            if (C31653j.m65965b()) {
                g = C89070n.m154585g((Collection) i18nSignUpActivity.mo57728n().subList(0, Math.min(o, i18nSignUpActivity.mo57728n().size())));
            } else {
                g = C89070n.m154585g((Collection) i18nSignUpActivity.mo57728n());
            }
            m66319c().setVisibility(8);
            if (C31653j.m65964a()) {
                m66319c().setVisibility(0);
                m66320d();
            }
            if (C31653j.m65965b() && i18nSignUpActivity.mo57728n().size() > o) {
                g.add(C31842k.f76098a);
            }
            this.f76295f = new C31840j(g, false, o, z2, z5);
            RecyclerView a2 = mo57871a();
            C31840j jVar4 = this.f76295f;
            if (jVar4 == null) {
                C89219l.m154710a("adapter");
            }
            a2.setAdapter(jVar4);
            m66318b().setOnClickListener(new View$OnClickListenerC31946c(this));
            C31840j jVar5 = this.f76295f;
            if (jVar5 == null) {
                C89219l.m154710a("adapter");
            }
            jVar5.mo57782a(new C31947d(this));
            m66318b().setText(m66316a(R.string.aof, R.string.aog));
            view.setBackgroundResource(R.color.l);
            mo57871a().setLayoutManager(new LinearLayoutManager());
        }
        C31840j jVar6 = this.f76295f;
        if (jVar6 == null) {
            C89219l.m154710a("adapter");
        }
        jVar6.notifyDataSetChanged();
    }
}
