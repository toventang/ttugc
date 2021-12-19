package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2386be.C34797e;
import com.p2082ss.android.ugc.aweme.p2386be.C34798f;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2727db.C40937d;
import com.p2082ss.android.ugc.aweme.p2727db.C40941f;
import com.p2082ss.android.ugc.aweme.p2727db.C40945h;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68346d;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68347e;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68349a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68352d;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68362h;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68371k;
import com.p2082ss.android.ugc.aweme.setting.utils.C68695j;
import com.p2082ss.android.ugc.aweme.setting.utils.C68696k;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m */
public final class C68395m extends AbstractC34586a implements AbstractC68349a, AbstractC68352d {

    /* renamed from: t */
    public static C68346d f153119t;

    /* renamed from: u */
    public static final C68396a f153120u = new C68396a((byte) 0);

    /* renamed from: a */
    public TextView f153121a;

    /* renamed from: b */
    public ImageView f153122b;

    /* renamed from: c */
    public C40941f f153123c;

    /* renamed from: d */
    public C68415n f153124d;

    /* renamed from: e */
    public C68415n f153125e;

    /* renamed from: j */
    public C68371k f153126j;

    /* renamed from: k */
    public C68362h f153127k;

    /* renamed from: l */
    public C40937d f153128l;

    /* renamed from: m */
    public C40937d f153129m;

    /* renamed from: n */
    public List<C68415n> f153130n = new ArrayList();

    /* renamed from: o */
    public C68415n f153131o;

    /* renamed from: p */
    public boolean f153132p;

    /* renamed from: q */
    public boolean f153133q;

    /* renamed from: r */
    public List<Runnable> f153134r = new ArrayList();

    /* renamed from: s */
    public C68346d f153135s;

    /* renamed from: v */
    SparseArray f153136v;

    /* renamed from: w */
    private final AbstractC89244h f153137w = C89250i.m154773a((AbstractC89171a) new C68407k(this));

    /* renamed from: y */
    private Keva f153138y;

    static {
        Covode.recordClassIndex(80624);
    }

    /* renamed from: d */
    private final C43047dm m120685d() {
        return (C43047dm) this.f153137w.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$a */
    public static final class C68396a {
        static {
            Covode.recordClassIndex(80625);
        }

        private C68396a() {
        }

        public /* synthetic */ C68396a(byte b) {
            this();
        }
    }

    /* renamed from: g */
    private final void m120687g() {
        for (Runnable runnable : this.f153134r) {
            runnable.run();
            this.f153134r.remove(runnable);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68352d
    /* renamed from: b */
    public final void mo108812b() {
        new C79459a(C17867d.m33078a()).mo123050a(R.string.dck).mo123053a();
        this.f153133q = false;
        m120687g();
    }

    /* renamed from: c */
    public final Keva mo108834c() {
        if (this.f153138y == null) {
            this.f153138y = Keva.getRepo("push_logout");
        }
        Keva keva = this.f153138y;
        if (keva == null) {
            C89219l.m154715b();
        }
        return keva;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C68371k kVar = this.f153126j;
        if (kVar != null) {
            kVar.ck_();
        }
        SparseArray sparseArray = this.f153136v;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$k */
    static final class C68407k extends AbstractC89220m implements AbstractC89171a<C43047dm> {

        /* renamed from: a */
        final /* synthetic */ C68395m f153150a;

        static {
            Covode.recordClassIndex(80636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68407k(C68395m mVar) {
            super(0);
            this.f153150a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43047dm invoke() {
            C68395m mVar = this.f153150a;
            if (mVar.f153136v == null) {
                mVar.f153136v = new SparseArray();
            }
            View view = (View) mVar.f153136v.get(R.id.d54);
            if (view == null) {
                View view2 = mVar.getView();
                if (view2 == null) {
                    view = null;
                } else {
                    view = view2.findViewById(R.id.d54);
                    mVar.f153136v.put(R.id.d54, view);
                }
            }
            PowerList powerList = (PowerList) view;
            C89219l.m154716b(powerList, "");
            return new C43047dm(powerList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$i */
    static final class RunnableC68404i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C68395m f153146a;

        /* renamed from: b */
        final /* synthetic */ C68415n f153147b;

        static {
            Covode.recordClassIndex(80633);
        }

        RunnableC68404i(C68395m mVar, C68415n nVar) {
            this.f153146a = mVar;
            this.f153147b = nVar;
        }

        public final void run() {
            this.f153146a.f153131o = this.f153147b;
            this.f153146a.f153132p = true;
            C68362h hVar = this.f153146a.f153127k;
            if (hVar != null) {
                String str = this.f153147b.f153162a;
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                hVar.mo57616a(C68395m.m120682a(str), 1);
            }
            this.f153147b.mo70126a((AbstractC89172b) C684051.f153148a);
            C68395m mVar = this.f153146a;
            String str2 = this.f153147b.f153162a;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            mVar.mo108833a(str2, ((C34800h) this.f153147b.mo70132l()).f82200c ? 1 : 0);
            this.f153146a.mo108834c().storeString("need_sync_channel_push_logout", "");
        }
    }

    /* renamed from: e */
    private final void m120686e() {
        String string;
        boolean a = C80428fg.m139432a(getContext());
        if (a) {
            string = getString(R.string.fon);
            C89219l.m154716b(string, "");
            C40941f fVar = this.f153123c;
            if (fVar != null) {
                fVar.mo70135a(8);
            }
            C40937d dVar = this.f153128l;
            if (dVar != null) {
                dVar.mo70126a(C68409m.f153154a);
            }
            C40937d dVar2 = this.f153129m;
            if (dVar2 != null) {
                dVar2.mo70126a(C68410n.f153155a);
            }
        } else {
            string = getString(R.string.fom);
            C89219l.m154716b(string, "");
            m120684a(a);
            C40941f fVar2 = this.f153123c;
            if (fVar2 != null) {
                fVar2.mo70135a(0);
            }
            C40937d dVar3 = this.f153128l;
            if (dVar3 != null) {
                dVar3.mo70126a(C68411o.f153156a);
            }
            C40937d dVar4 = this.f153129m;
            if (dVar4 != null) {
                dVar4.mo70126a(C68412p.f153157a);
            }
        }
        C40941f fVar3 = this.f153123c;
        if (fVar3 != null) {
            fVar3.mo70136a(string);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68349a
    /* renamed from: a */
    public final void mo108809a() {
        new C79459a(C17867d.m33078a()).mo123050a(R.string.dck).mo123053a();
        this.f153132p = false;
        C68415n nVar = this.f153131o;
        if (nVar != null) {
            nVar.mo70126a((AbstractC89172b) C68401f.f153143a);
            String str = nVar.f153162a;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            mo108833a(str, ((C34800h) nVar.mo70132l()).f82200c ? 1 : 0);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        Integer valueOf;
        C68347e eVar;
        C68347e eVar2;
        super.onResume();
        this.f153135s = f153119t;
        m120686e();
        boolean a = C80428fg.m139432a(getContext());
        m120683a(this.f153124d, a);
        m120683a(this.f153125e, a);
        for (C68415n nVar : this.f153130n) {
            if (this.f153135s != null) {
                String str = nVar.f153162a;
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                C68346d dVar = this.f153135s;
                if (dVar != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -2075815212) {
                        if (hashCode == 277061569 && str.equals("recommend_video_push") && (eVar2 = dVar.f152935a) != null) {
                            i = eVar2.f152936a;
                            valueOf = Integer.valueOf(i);
                            if (valueOf.intValue() == -1 || valueOf == null) {
                                break;
                            }
                            nVar.mo70126a((AbstractC89172b) new C68408l(valueOf.intValue(), this, nVar));
                        }
                    } else if (str.equals("other_channel") && (eVar = dVar.f152935a) != null) {
                        i = eVar.f152937b;
                        valueOf = Integer.valueOf(i);
                        nVar.mo70126a((AbstractC89172b) new C68408l(valueOf.intValue(), this, nVar));
                    }
                }
                i = -1;
                valueOf = Integer.valueOf(i);
                nVar.mo70126a((AbstractC89172b) new C68408l(valueOf.intValue(), this, nVar));
            }
        }
        mo108834c().getString("need_sync_channel_push_logout", "");
        if (!TextUtils.isEmpty(mo108834c().getString("need_sync_channel_push_logout", "")) && C80428fg.m139432a(getContext())) {
            String string = mo108834c().getString("need_sync_channel_push_logout", "");
            for (C68415n nVar2 : this.f153130n) {
                if (nVar2.f153162a != null) {
                    String str2 = nVar2.f153162a;
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
                    if (TextUtils.equals(str2, string) && C68696k.m121133a(string)) {
                        RunnableC68404i iVar = new RunnableC68404i(this, nVar2);
                        if (this.f153133q) {
                            this.f153134r.add(iVar);
                        } else {
                            iVar.run();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$c */
    static final class View$OnClickListenerC68398c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68395m f153140a;

        static {
            Covode.recordClassIndex(80627);
        }

        View$OnClickListenerC68398c(C68395m mVar) {
            this.f153140a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C68395m mVar = this.f153140a;
            C68415n nVar = mVar.f153124d;
            if (nVar == null) {
                C89219l.m154715b();
            }
            mVar.mo108832a(nVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$d */
    static final class View$OnClickListenerC68399d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68395m f153141a;

        static {
            Covode.recordClassIndex(80628);
        }

        View$OnClickListenerC68399d(C68395m mVar) {
            this.f153141a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C68395m mVar = this.f153141a;
            C68415n nVar = mVar.f153125e;
            if (nVar == null) {
                C89219l.m154715b();
            }
            mVar.mo108832a(nVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$e */
    static final class View$OnClickListenerC68400e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68395m f153142a;

        static {
            Covode.recordClassIndex(80629);
        }

        View$OnClickListenerC68400e(C68395m mVar) {
            this.f153142a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f153142a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$m */
    public static final class C68409m extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        public static final C68409m f153154a = new C68409m();

        static {
            Covode.recordClassIndex(80638);
        }

        C68409m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C34797e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C34797e.m71059a(eVar2, null, false, false, null, 11);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$n */
    public static final class C68410n extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        public static final C68410n f153155a = new C68410n();

        static {
            Covode.recordClassIndex(80639);
        }

        C68410n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C34797e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C34797e.m71059a(eVar2, null, false, true, null, 11);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$o */
    public static final class C68411o extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        public static final C68411o f153156a = new C68411o();

        static {
            Covode.recordClassIndex(80640);
        }

        C68411o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C34797e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C34797e.m71059a(eVar2, null, false, true, null, 11);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$p */
    public static final class C68412p extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        public static final C68412p f153157a = new C68412p();

        static {
            Covode.recordClassIndex(80641);
        }

        C68412p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C34797e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C34797e.m71059a(eVar2, null, false, false, null, 11);
        }
    }

    /* renamed from: a */
    private static void m120684a(boolean z) {
        String str;
        C33744d dVar = new C33744d();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C39162r.m79460a("notifications_show", dVar.mo59983a("status", str).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$b */
    static final class View$OnClickListenerC68397b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68395m f153139a;

        static {
            Covode.recordClassIndex(80626);
        }

        View$OnClickListenerC68397b(C68395m mVar) {
            this.f153139a = mVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C80428fg.m139434b(this.f153139a.getContext());
            C33744d dVar = new C33744d();
            if (C80428fg.m139432a(this.f153139a.getContext())) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("notifications_click", dVar.mo59983a("status", str).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$f */
    static final class C68401f extends AbstractC89220m implements AbstractC89172b<C34800h, C34800h> {

        /* renamed from: a */
        public static final C68401f f153143a = new C68401f();

        static {
            Covode.recordClassIndex(80630);
        }

        C68401f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34800h invoke(C34800h hVar) {
            C34800h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            return C34800h.m71083a(hVar2, !hVar2.f82200c, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$g */
    static final class C68402g extends AbstractC89220m implements AbstractC89172b<C34800h, C34800h> {

        /* renamed from: a */
        public static final C68402g f153144a = new C68402g();

        static {
            Covode.recordClassIndex(80631);
        }

        C68402g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34800h invoke(C34800h hVar) {
            C34800h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            return C34800h.m71083a(hVar2, !hVar2.f82200c, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$h */
    public static final class C68403h extends AbstractC89220m implements AbstractC89172b<C34800h, C34800h> {

        /* renamed from: a */
        public static final C68403h f153145a = new C68403h();

        static {
            Covode.recordClassIndex(80632);
        }

        C68403h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34800h invoke(C34800h hVar) {
            C34800h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            return C34800h.m71083a(hVar2, !hVar2.f82200c, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$j */
    public static final class C68406j extends AbstractC89220m implements AbstractC89172b<C34800h, C34800h> {

        /* renamed from: a */
        final /* synthetic */ boolean f153149a;

        static {
            Covode.recordClassIndex(80635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68406j(boolean z) {
            super(1);
            this.f153149a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34800h invoke(C34800h hVar) {
            C34800h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            return C34800h.m71083a(hVar2, false, null, null, false, null, null, null, null, null, false, null, this.f153149a, false, null, 14335);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$l */
    static final class C68408l extends AbstractC89220m implements AbstractC89172b<C34800h, C34800h> {

        /* renamed from: a */
        final /* synthetic */ int f153151a;

        /* renamed from: b */
        final /* synthetic */ C68395m f153152b;

        /* renamed from: c */
        final /* synthetic */ C68415n f153153c;

        static {
            Covode.recordClassIndex(80637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68408l(int i, C68395m mVar, C68415n nVar) {
            super(1);
            this.f153151a = i;
            this.f153152b = mVar;
            this.f153153c = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34800h invoke(C34800h hVar) {
            boolean z;
            C34800h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            if (this.f153151a == 1) {
                String str = this.f153153c.f153162a;
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                if (C68696k.m121133a(str)) {
                    z = true;
                    return C34800h.m71083a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            }
            z = false;
            return C34800h.m71083a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$q */
    static final class C68413q extends AbstractC89220m implements AbstractC89172b<C34800h, C34800h> {

        /* renamed from: a */
        final /* synthetic */ C68347e f153158a;

        /* renamed from: b */
        final /* synthetic */ C68395m f153159b;

        static {
            Covode.recordClassIndex(80642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68413q(C68347e eVar, C68395m mVar) {
            super(1);
            this.f153158a = eVar;
            this.f153159b = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34800h invoke(C34800h hVar) {
            boolean z;
            String str;
            C34800h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            if (this.f153158a.f152936a == 1) {
                C68415n nVar = this.f153159b.f153124d;
                if (nVar != null) {
                    str = nVar.f153162a;
                } else {
                    str = null;
                }
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                if (C68696k.m121133a(str)) {
                    z = true;
                    return C34800h.m71083a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            }
            z = false;
            return C34800h.m71083a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$r */
    static final class C68414r extends AbstractC89220m implements AbstractC89172b<C34800h, C34800h> {

        /* renamed from: a */
        final /* synthetic */ C68347e f153160a;

        /* renamed from: b */
        final /* synthetic */ C68395m f153161b;

        static {
            Covode.recordClassIndex(80643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68414r(C68347e eVar, C68395m mVar) {
            super(1);
            this.f153160a = eVar;
            this.f153161b = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34800h invoke(C34800h hVar) {
            boolean z;
            String str;
            C34800h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            if (this.f153160a.f152937b == 1) {
                C68415n nVar = this.f153161b.f153125e;
                if (nVar != null) {
                    str = nVar.f153162a;
                } else {
                    str = null;
                }
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                if (C68696k.m121133a(str)) {
                    z = true;
                    return C34800h.m71083a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            }
            z = false;
            return C34800h.m71083a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    /* renamed from: a */
    public static String m120682a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -2075815212) {
            if (hashCode == 277061569 && str.equals("recommend_video_push")) {
                return "push_device_recommend_video";
            }
            return null;
        } else if (str.equals("other_channel")) {
            return "push_device_other_channel";
        } else {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68349a
    /* renamed from: a */
    public final void mo108810a(BaseResponse baseResponse) {
        C68415n nVar;
        C89219l.m154721d(baseResponse, "");
        this.f153132p = false;
        if (baseResponse.status_code != 0 && (nVar = this.f153131o) != null) {
            nVar.mo70126a((AbstractC89172b) C68402g.f153144a);
            String str = nVar.f153162a;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            mo108833a(str, ((C34800h) nVar.mo70132l()).f82200c ? 1 : 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68352d
    /* renamed from: a */
    public final void mo108811a(C68346d dVar) {
        C89219l.m154721d(dVar, "");
        this.f153135s = dVar;
        C68347e eVar = dVar.f152935a;
        if (eVar != null) {
            C68415n nVar = this.f153124d;
            if (nVar != null) {
                nVar.mo70126a((AbstractC89172b) new C68413q(eVar, this));
            }
            C68415n nVar2 = this.f153125e;
            if (nVar2 != null) {
                nVar2.mo70126a((AbstractC89172b) new C68414r(eVar, this));
            }
        }
        f153119t = dVar;
        this.f153133q = false;
        m120687g();
    }

    /* renamed from: a */
    public final void mo108832a(C68415n nVar) {
        String str;
        if (!this.f153132p) {
            this.f153131o = nVar;
            this.f153132p = true;
            if (!C68386g.m120670a(getContext())) {
                this.f153132p = false;
                return;
            }
            if (!((C34800h) nVar.mo70132l()).f82200c) {
                String str2 = nVar.f153162a;
                Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
                if (!C68696k.m121133a(str2)) {
                    String str3 = nVar.f153162a;
                    Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
                    if (Build.VERSION.SDK_INT >= 26) {
                        String a = C68386g.m120667a(str3, C68695j.m121129a());
                        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                        intent.setFlags(268435456);
                        intent.putExtra("android.provider.extra.APP_PACKAGE", C17867d.m33078a().getPackageName());
                        intent.putExtra("android.provider.extra.CHANNEL_ID", a);
                        if (C17867d.m33078a().getPackageManager().resolveActivity(intent, 65536) != null) {
                            startActivity(intent);
                        }
                    } else {
                        C80428fg.m139435c(C17867d.m33078a());
                    }
                    Keva c = mo108834c();
                    String str4 = nVar.f153162a;
                    Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
                    c.storeString("need_sync_channel_push_logout", str4);
                    this.f153132p = false;
                    return;
                }
            }
            nVar.mo70126a((AbstractC89172b) C68403h.f153145a);
            String str5 = nVar.f153162a;
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            mo108833a(str5, ((C34800h) nVar.mo70132l()).f82200c ? 1 : 0);
            C68362h hVar = this.f153127k;
            if (hVar != null) {
                String str6 = nVar.f153162a;
                Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
                hVar.mo57616a(m120682a(str6), Integer.valueOf(((C34800h) nVar.mo70132l()).f82200c ? 1 : 0));
            }
            String str7 = nVar.f153162a;
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            if (((C34800h) nVar.mo70132l()).f82200c) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("notification_switch", new C33744d().mo59983a("label", str7).mo59983a("to_status", str).f79943a);
        }
    }

    /* renamed from: a */
    private static void m120683a(C40945h hVar, boolean z) {
        if (hVar != null) {
            hVar.mo70126a(new C68406j(z));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            this.f153121a = (TextView) activity.findViewById(R.id.title);
            this.f153122b = (ImageView) activity.findViewById(R.id.pi);
            String string = activity.getString(R.string.foc);
            C89219l.m154716b(string, "");
            C40941f fVar = new C40941f(new C34798f("", false, null, string, null, null, false, false, new View$OnClickListenerC68397b(this), null, 6134));
            m120685d().mo73247a(fVar);
            this.f153123c = fVar;
            String string2 = activity.getString(R.string.h7i);
            C89219l.m154716b(string2, "");
            C40937d dVar = new C40937d(new C34797e(string2, false, false, 14));
            m120685d().mo73247a(dVar);
            this.f153129m = dVar;
            String string3 = activity.getString(R.string.h7i);
            C89219l.m154716b(string3, "");
            C40937d dVar2 = new C40937d(new C34797e(string3, true, false, 12));
            m120685d().mo73247a(dVar2);
            this.f153128l = dVar2;
            String string4 = activity.getString(R.string.h7h);
            C89219l.m154716b(string4, "");
            C68415n nVar = new C68415n(new C34800h(false, string4, new View$OnClickListenerC68398c(this), false, null, null, null, null, null, false, 16377));
            m120685d().mo73247a(nVar);
            this.f153124d = nVar;
            C43047dm d = m120685d();
            String string5 = activity.getString(R.string.dl5);
            C89219l.m154716b(string5, "");
            d.mo73247a(new C40937d(new C34797e(string5, true, false, 12)));
            String string6 = activity.getString(R.string.dl4);
            C89219l.m154716b(string6, "");
            C68415n nVar2 = new C68415n(new C34800h(false, string6, new View$OnClickListenerC68399d(this), false, null, null, null, null, null, false, 16377));
            m120685d().mo73247a(nVar2);
            this.f153125e = nVar2;
            ImageView imageView = this.f153122b;
            if (imageView != null) {
                imageView.setOnClickListener(new View$OnClickListenerC68400e(this));
            }
        }
        TextView textView = this.f153121a;
        if (textView == null) {
            C89219l.m154715b();
        }
        textView.setText(R.string.fl4);
        m120686e();
        C68415n nVar3 = this.f153124d;
        if (nVar3 != null) {
            nVar3.f153162a = "recommend_video_push";
            this.f153130n.add(nVar3);
        }
        C68415n nVar4 = this.f153125e;
        if (nVar4 != null) {
            nVar4.f153162a = "other_channel";
            this.f153130n.add(nVar4);
        }
        C68371k kVar = new C68371k();
        this.f153126j = kVar;
        kVar.mo67839a_(this);
        C68371k kVar2 = this.f153126j;
        if (kVar2 != null) {
            kVar2.mo57616a(new Object[0]);
        }
        this.f153133q = true;
        C68362h hVar = new C68362h();
        this.f153127k = hVar;
        hVar.mo67839a_(this);
    }

    /* renamed from: a */
    public final void mo108833a(String str, int i) {
        C68347e eVar;
        C68347e eVar2;
        C68346d dVar = this.f153135s;
        if (dVar != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2075815212) {
                if (hashCode == 277061569 && str.equals("recommend_video_push") && (eVar2 = dVar.f152935a) != null) {
                    eVar2.f152936a = i;
                }
            } else if (str.equals("other_channel") && (eVar = dVar.f152935a) != null) {
                eVar.f152937b = i;
            }
        }
        f153119t = this.f153135s;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ay0, viewGroup, false);
    }
}
