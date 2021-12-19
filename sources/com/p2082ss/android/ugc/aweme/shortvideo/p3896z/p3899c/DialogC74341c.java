package com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3899c;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1205n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharedar.C69568g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3897a.C74332a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3899c.C74338b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3900d.C74363a;
import com.p2082ss.android.ugc.aweme.utils.C80420fc;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c */
public final class DialogC74341c extends DialogC26609a implements AbstractC1204m {

    /* renamed from: a */
    public final C69568g f167183a;

    /* renamed from: b */
    public boolean f167184b;

    /* renamed from: c */
    public final ActivityC0945e f167185c;

    /* renamed from: d */
    private final AbstractC89244h f167186d;

    /* renamed from: e */
    private final AbstractC89244h f167187e;

    /* renamed from: f */
    private final AbstractC89244h f167188f;

    /* renamed from: j */
    private final AbstractC89244h f167189j;

    static {
        Covode.recordClassIndex(87113);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C1205n getLifecycle() {
        return (C1205n) this.f167186d.getValue();
    }

    /* renamed from: b */
    public final C74363a mo9590b() {
        return (C74363a) this.f167187e.getValue();
    }

    /* renamed from: c */
    public final C74335a mo116963c() {
        return (C74335a) this.f167188f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$n */
    static final class C74355n extends AbstractC89220m implements AbstractC89171a<C1205n> {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167204a;

        static {
            Covode.recordClassIndex(87127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74355n(DialogC74341c cVar) {
            super(0);
            this.f167204a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1205n invoke() {
            return new C1205n(this.f167204a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$q */
    static final class C74358q extends AbstractC89220m implements AbstractC89171a<C74363a> {

        /* renamed from: a */
        public static final C74358q f167207a = new C74358q();

        static {
            Covode.recordClassIndex(87130);
        }

        C74358q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74363a invoke() {
            return new C74363a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$a */
    static final class C74342a extends AbstractC89220m implements AbstractC89171a<C74335a> {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167190a;

        static {
            Covode.recordClassIndex(87114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74342a(DialogC74341c cVar) {
            super(0);
            this.f167190a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74335a invoke() {
            return new C74335a(this.f167190a.mo9590b());
        }
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public final void onStop() {
        getLifecycle().mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
        super.onStop();
    }

    public final void dismiss() {
        View view;
        Window window = getWindow();
        if (window != null) {
            view = window.getCurrentFocus();
        } else {
            view = null;
        }
        KeyboardUtils.m70897c(view);
        super.dismiss();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLifecycle().mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        mo9590b().f167228i.mo143985a((CancellationException) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$e */
    static final class C74346e implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167195a;

        static {
            Covode.recordClassIndex(87118);
        }

        C74346e(DialogC74341c cVar) {
            this.f167195a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            boolean z;
            if (this.f167195a.f167184b) {
                z = this.f167195a.mo9590b().f167226g;
            } else {
                z = this.f167195a.mo9590b().f167225f;
            }
            if (!z) {
                this.f167195a.mo116963c().ap_();
            } else {
                this.f167195a.mo116963c().ao_();
            }
            if (this.f167195a.f167184b) {
                C74363a b = this.f167195a.mo9590b();
                DmtEditText dmtEditText = (DmtEditText) this.f167195a.findViewById(R.id.dqk);
                C89219l.m154716b(dmtEditText, "");
                b.mo116981a(String.valueOf(dmtEditText.getText()), true);
                return;
            }
            C74363a.m130827a(this.f167195a.mo9590b(), true, null, 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$p */
    static final class C74357p extends AbstractC89220m implements AbstractC89171a<C74338b> {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167206a;

        static {
            Covode.recordClassIndex(87129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74357p(DialogC74341c cVar) {
            super(0);
            this.f167206a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74338b invoke() {
            DmtStatusView dmtStatusView = (DmtStatusView) this.f167206a.findViewById(R.id.e7i);
            C89219l.m154716b(dmtStatusView, "");
            RecyclerView recyclerView = (RecyclerView) this.f167206a.findViewById(R.id.cj6);
            C89219l.m154716b(recyclerView, "");
            View findViewById = this.f167206a.findViewById(R.id.dz3);
            C89219l.m154716b(findViewById, "");
            LinearLayout linearLayout = (LinearLayout) this.f167206a.findViewById(R.id.cee);
            C89219l.m154716b(linearLayout, "");
            ActivityC0945e eVar = this.f167206a.f167185c;
            DialogC74341c cVar = this.f167206a;
            return new C74338b(dmtStatusView, recyclerView, findViewById, linearLayout, eVar, cVar, cVar.mo9590b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$b */
    public static final class C74343b extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167191a;

        static {
            Covode.recordClassIndex(87115);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74343b(DialogC74341c cVar) {
            super(600);
            this.f167191a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            List<C74332a> value = this.f167191a.mo9590b().f167221b.getValue();
            if (value != null) {
                C89219l.m154716b(value, "");
                AbstractC89172b<? super List<? extends User>, C89391z> bVar = this.f167191a.f167183a.f155393b;
                if (bVar != null) {
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) value, 10));
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().f167165a);
                    }
                    bVar.invoke(arrayList);
                }
                this.f167191a.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$h */
    public static final class C74349h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167198a;

        static {
            Covode.recordClassIndex(87121);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74349h(DialogC74341c cVar) {
            this.f167198a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            int i;
            C89219l.m154721d(editable, "");
            if (editable.length() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            ImageButton imageButton = (ImageButton) this.f167198a.findViewById(R.id.a6_);
            C89219l.m154716b(imageButton, "");
            if (imageButton.getVisibility() != i) {
                ImageButton imageButton2 = (ImageButton) this.f167198a.findViewById(R.id.a6_);
                C89219l.m154716b(imageButton2, "");
                imageButton2.setVisibility(i);
            }
            String obj = editable.toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj2 = C89361p.m154910b((CharSequence) obj).toString();
            if (obj2.length() == 0) {
                this.f167198a.mo9590b().mo116980a(C89086z.INSTANCE);
                C74335a c = this.f167198a.mo116963c();
                List<C74332a> value = this.f167198a.mo9590b().f167220a.getValue();
                if (value == null) {
                    value = C89086z.INSTANCE;
                }
                c.mo116961a(value);
                return;
            }
            if (this.f167198a.mo116963c().getItemCount() == 0) {
                ((DmtStatusView) this.f167198a.findViewById(R.id.e7i)).mo27384f();
            }
            this.f167198a.mo9590b().mo116981a(obj2, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$j */
    static final class C74351j extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        public static final C74351j f167200a = new C74351j();

        static {
            Covode.recordClassIndex(87123);
        }

        C74351j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$c */
    static final class View$OnClickListenerC74344c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167192a;

        static {
            Covode.recordClassIndex(87116);
        }

        View$OnClickListenerC74344c(DialogC74341c cVar) {
            this.f167192a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f167192a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$f */
    static final class View$OnClickListenerC74347f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167196a;

        static {
            Covode.recordClassIndex(87119);
        }

        View$OnClickListenerC74347f(DialogC74341c cVar) {
            this.f167196a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f167196a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$k */
    static final class C74352k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167201a;

        static {
            Covode.recordClassIndex(87124);
        }

        C74352k(DialogC74341c cVar) {
            this.f167201a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<C74332a> list = (List) obj;
            if (list != null) {
                this.f167201a.f167184b = false;
                this.f167201a.mo116963c().mo116961a(list);
                this.f167201a.mo116963c().aq_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$o */
    static final class View$OnClickListenerC74356o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167205a;

        static {
            Covode.recordClassIndex(87128);
        }

        View$OnClickListenerC74356o(DialogC74341c cVar) {
            this.f167205a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C58957c.m108318a(this.f167205a.f167185c, "share_page", "share_page");
            this.f167205a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$i */
    static final class View$OnClickListenerC74350i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167199a;

        static {
            Covode.recordClassIndex(87122);
        }

        View$OnClickListenerC74350i(DialogC74341c cVar) {
            this.f167199a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((DmtEditText) this.f167199a.findViewById(R.id.dqk)).setText("");
            ((DmtEditText) this.f167199a.findViewById(R.id.dqk)).clearFocus();
            this.f167199a.mo9590b().mo116980a(C89086z.INSTANCE);
            C39115e.m79412a(this.f167199a.f167185c, this.f167199a.findViewById(R.id.dqk));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$l */
    static final class C74353l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167202a;

        static {
            Covode.recordClassIndex(87125);
        }

        C74353l(DialogC74341c cVar) {
            this.f167202a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            List list = (List) obj;
            DialogC74341c cVar = this.f167202a;
            C89219l.m154716b(list, "");
            Window window = cVar.getWindow();
            if (window != null) {
                view = window.getCurrentFocus();
            } else {
                view = null;
            }
            KeyboardUtils.m70897c(view);
            boolean z = !list.isEmpty();
            TuxButton tuxButton = (TuxButton) cVar.findViewById(R.id.exa);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setEnabled(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$m */
    static final class C74354m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167203a;

        static {
            Covode.recordClassIndex(87126);
        }

        C74354m(DialogC74341c cVar) {
            this.f167203a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            List<C74332a> list = (List) obj;
            if (list != null) {
                String str2 = this.f167203a.mo9590b().f167223d;
                DmtEditText dmtEditText = (DmtEditText) this.f167203a.findViewById(R.id.dqk);
                C89219l.m154716b(dmtEditText, "");
                Editable text = dmtEditText.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str2, (Object) str)) {
                    this.f167203a.f167184b = true;
                    this.f167203a.mo116963c().mo116961a(list);
                    this.f167203a.mo116963c().aq_();
                }
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        getLifecycle().mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
        super.onCreate(bundle);
        setContentView(R.layout.ep);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
            }
            window.setLayout(-1, -1);
            window.setSoftInputMode(16);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.u5;
            }
        }
        if (!C63244g.m114602a().mo73255A().mo93903b()) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.chl);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(0);
            ((TextView) findViewById(R.id.e13)).setOnClickListener(new View$OnClickListenerC74356o(this));
            TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.clr);
            if (tuxIconView != null) {
                tuxIconView.setOnClickListener(new View$OnClickListenerC74344c(this));
            }
        } else {
            Window window2 = getWindow();
            if (window2 != null) {
                C80420fc.m139414a(window2);
            }
            TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.clr);
            if (tuxIconView2 != null) {
                tuxIconView2.setOnClickListener(new View$OnClickListenerC74347f(this));
            }
            ((DmtEditText) findViewById(R.id.dqk)).setHint(R.string.dqd);
            ((DmtEditText) findViewById(R.id.dqk)).setOnKeyListener(new View$OnKeyListenerC74348g(this));
            ((DmtEditText) findViewById(R.id.dqk)).addTextChangedListener(new C74349h(this));
            ((ImageButton) findViewById(R.id.a6_)).setOnClickListener(new View$OnClickListenerC74350i(this));
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cj6);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(mo116963c());
            recyclerView.mo4405a(new C74345d(recyclerView, recyclerView.getContext(), this));
            mo116963c().mo67829d(true);
            mo116963c().mo67814a("");
            mo116963c().mo67813a(new C74346e(this));
            ((TuxButton) findViewById(R.id.exa)).setOnClickListener(new C74343b(this));
            if (!this.f167183a.f155392a) {
                ((TuxButton) findViewById(R.id.exa)).setText(R.string.fro);
            }
            C74338b bVar = (C74338b) this.f167189j.getValue();
            bVar.f167174a.setBuilder(new DmtStatusView.C17269a(bVar.f167175b).mo27397a());
            bVar.f167174a.mo27384f();
            bVar.f167177d.f167220a.observe(bVar.f167176c, new C74338b.C74339a(bVar));
            bVar.f167177d.f167222c.observe(bVar.f167176c, new C74338b.C74340b(bVar));
            C74363a.m130827a(mo9590b(), false, C74351j.f167200a, 1);
            mo9590b().f167220a.observe(this, new C74352k(this));
            mo9590b().f167221b.observe(this, new C74353l(this));
            mo9590b().f167222c.observe(this, new C74354m(this));
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.adj);
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.getLayoutParams().height = C89241a.m154730a(((float) C34723i.m70924a(getContext())) * 0.65f);
        ((LinearLayout) findViewById(R.id.adj)).requestLayout();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$d */
    public static final class C74345d extends C51425a {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f167193a;

        /* renamed from: b */
        final /* synthetic */ DialogC74341c f167194b;

        static {
            Covode.recordClassIndex(87117);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            View view;
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 1) {
                Window window = this.f167194b.getWindow();
                if (window != null) {
                    view = window.getCurrentFocus();
                } else {
                    view = null;
                }
                KeyboardUtils.m70897c(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74345d(RecyclerView recyclerView, Context context, DialogC74341c cVar) {
            super(context);
            this.f167193a = recyclerView;
            this.f167194b = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC74341c(ActivityC0945e eVar, AbstractC89172b<? super C69568g, C89391z> bVar) {
        super(eVar, R.style.u6);
        C89219l.m154721d(eVar, "");
        this.f167185c = eVar;
        C69568g gVar = new C69568g();
        this.f167183a = gVar;
        if (bVar != null) {
            bVar.invoke(gVar);
        }
        this.f167186d = C89250i.m154773a((AbstractC89171a) new C74355n(this));
        this.f167187e = C89250i.m154773a((AbstractC89171a) C74358q.f167207a);
        this.f167188f = C89250i.m154773a((AbstractC89171a) new C74342a(this));
        this.f167189j = C89250i.m154773a((AbstractC89171a) new C74357p(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.c$g */
    static final class View$OnKeyListenerC74348g implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ DialogC74341c f167197a;

        static {
            Covode.recordClassIndex(87120);
        }

        View$OnKeyListenerC74348g(DialogC74341c cVar) {
            this.f167197a = cVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66) {
                return false;
            }
            C39115e.m79412a(this.f167197a.f167185c, this.f167197a.findViewById(R.id.dqk));
            return true;
        }
    }
}
