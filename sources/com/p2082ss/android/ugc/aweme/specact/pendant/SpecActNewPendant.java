package com.p2082ss.android.ugc.aweme.specact.pendant;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.airbnb.lottie.AbstractC2186i;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2108f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.pendant.C62766b;
import com.p2082ss.android.ugc.aweme.pendant.C62772f;
import com.p2082ss.android.ugc.aweme.pendant.C62797j;
import com.p2082ss.android.ugc.aweme.pendant.OptimizedLottieAnimationView;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3927a.C74951a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74972b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3934d.C74999c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3936d.C75013a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75023d;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75025f;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75026g;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3938f.C75029a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3938f.C75040b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75060a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75062c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75063d;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75068h;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75069i;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75081k;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75083m;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3941i.View$OnClickListenerC75084a;
import com.p2082ss.android.ugc.aweme.specact.pendant.views.C75098b;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import com.p2082ss.android.ugc.aweme.specact.popup.p3944c.C75183a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3945d.View$OnClickListenerC75197b;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.SpecActNewPendant */
public final class SpecActNewPendant extends BasePendant implements View.OnClickListener, AbstractC33974au, AbstractC75024e {

    /* renamed from: j */
    public static final AbstractC89244h f168491j = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C74948b.f168495a);

    /* renamed from: k */
    public static final C74947a f168492k = new C74947a((byte) 0);

    /* renamed from: h */
    public boolean f168493h;

    /* renamed from: i */
    public boolean f168494i;

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.BasePendant, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.SpecActNewPendant$a */
    public static final class C74947a {
        static {
            Covode.recordClassIndex(87817);
        }

        /* renamed from: a */
        public static SpecActNewPendant m131596a() {
            return (SpecActNewPendant) SpecActNewPendant.f168491j.getValue();
        }

        private C74947a() {
        }

        public /* synthetic */ C74947a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.SpecActNewPendant$c */
    public static final class C74949c implements AbstractC75025f {
        static {
            Covode.recordClassIndex(87819);
        }

        C74949c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75025f
        /* renamed from: a */
        public final void mo118086a() {
            C75029a a = C75029a.C75030a.m131750a();
            UgActivityTasks h = a.mo118166h();
            if (h != null) {
                if (a.f168642d > 0) {
                    h = h.clone(Integer.valueOf(a.f168642d));
                }
                C89219l.m154716b(h, "");
                a.mo118160a(h);
            }
        }
    }

    private SpecActNewPendant() {
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.BasePendant
    /* renamed from: c */
    public final boolean mo118054c() {
        return this.f168493h;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.SpecActNewPendant$b */
    static final class C74948b extends AbstractC89220m implements AbstractC89171a<SpecActNewPendant> {

        /* renamed from: a */
        public static final C74948b f168495a = new C74948b();

        static {
            Covode.recordClassIndex(87818);
        }

        C74948b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SpecActNewPendant invoke() {
            return new SpecActNewPendant((byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: q */
    public final void mo118083q() {
        mo118047a().mo118143f();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: r */
    public final void mo118084r() {
        mo118047a().mo118134b();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.BasePendant
    /* renamed from: k */
    public final AbstractC75020a mo118063k() {
        View$OnClickListenerC75084a aVar = new View$OnClickListenerC75084a();
        C89219l.m154721d(this, "");
        aVar.f168747b = this;
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.BasePendant
    /* renamed from: l */
    public final AbstractC75023d mo118064l() {
        return (C75013a) C75013a.f168625a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: n */
    public final boolean mo118079n() {
        return mo118047a().mo118147j();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: o */
    public final boolean mo118080o() {
        return mo118047a().mo118132a();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: p */
    public final boolean mo118082p() {
        return mo118047a().mo118141d();
    }

    static {
        Covode.recordClassIndex(87816);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.BasePendant
    /* renamed from: h */
    public final boolean mo118060h() {
        boolean f = C75029a.C75030a.m131750a().mo118164f();
        boolean f2 = C75040b.C75041a.m131765a().mo118173f();
        if (f || f2) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.BasePendant
    /* renamed from: e */
    public final void mo118057e() {
        super.mo118057e();
        if (this.f168493h) {
            C75029a a = C75029a.C75030a.m131750a();
            a.f168641c = false;
            a.f168640b = false;
            a.mo118163e().mo118150a(false);
        }
        if (this.f168494i) {
            C75040b a2 = C75040b.C75041a.m131765a();
            a2.f168666c = false;
            a2.f168668e = false;
            a2.mo118172e().mo118150a(false);
        }
        mo118047a().mo118130a(false, C75060a.m131814p(this.f168480a), C75060a.m131815q(this.f168480a));
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.BasePendant
    /* renamed from: i */
    public final void mo118061i() {
        LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
        C89219l.m154716b(localTestApi, "");
        localTestApi.getSpecActDebugService().mo106976a("SpecPendant", "--  activatePendant ");
        C75069i a = C75069i.C75071b.m131841a();
        Activity g = mo118059g();
        if (g == null) {
            C89219l.m154715b();
        }
        a.mo118183a(g, new C74950d(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: s */
    public final void mo118085s() {
        AbstractC75020a a = mo118047a();
        if (a != null && a.mo118132a() && a.mo118141d()) {
            Iterator<AbstractC74981c> it = C74972b.f168548a.iterator();
            while (it.hasNext()) {
                AbstractC74981c next = it.next();
                if (next instanceof C74999c) {
                    next.mo118103a(a, 0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.SpecActNewPendant$d */
    public static final class C74950d implements C75069i.AbstractC75070a {

        /* renamed from: a */
        final /* synthetic */ SpecActNewPendant f168496a;

        static {
            Covode.recordClassIndex(87820);
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75069i.AbstractC75070a
        /* renamed from: a */
        public final void mo118066a() {
            String str;
            if (this.f168496a.f168493h && !this.f168496a.f168494i) {
                C75029a a = C75029a.C75030a.m131750a();
                AbstractC75024e eVar = a.f168647i;
                if (eVar != null) {
                    eVar.mo118072a(false, C75060a.m131814p(a.f168639a), C75060a.m131815q(a.f168639a));
                }
                AbstractC75024e eVar2 = a.f168647i;
                if (eVar2 != null) {
                    UgAwemeActivitySetting ugAwemeActivitySetting = a.f168639a;
                    if (ugAwemeActivitySetting == null) {
                        C89219l.m154715b();
                    }
                    boolean v = C75060a.m131820v(ugAwemeActivitySetting);
                    UgAwemeActivitySetting ugAwemeActivitySetting2 = a.f168639a;
                    if (ugAwemeActivitySetting2 == null) {
                        C89219l.m154715b();
                    }
                    eVar2.mo118073a(v, C75060a.m131819u(ugAwemeActivitySetting2));
                }
                AbstractC75024e eVar3 = a.f168647i;
                if (eVar3 != null && eVar3.mo118079n()) {
                    C62766b.C62768b.f142302a.mo100735a(C17867d.m33078a());
                    boolean a2 = C89219l.m154714a((Object) a.f168646h, (Object) true);
                    if (a.mo118164f()) {
                        str = "ongoing";
                    } else {
                        str = "finished";
                    }
                    C75068h.m131834a("non_tracker", a2 ? 1 : 0, str, a.f168639a);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75069i.AbstractC75070a
        /* renamed from: b */
        public final void mo118069b() {
            C75183a.C75184a.m131921a().mo118341a(this.f168496a.mo118059g(), C75062c.m131823a());
            if (!this.f168496a.f168493h && !this.f168496a.f168494i) {
                this.f168496a.mo118047a().mo118130a(false, C75060a.m131814p(this.f168496a.f168480a), C75060a.m131815q(this.f168496a.f168480a));
                AbstractC75020a a = this.f168496a.mo118047a();
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f168496a.f168480a;
                if (ugAwemeActivitySetting == null) {
                    C89219l.m154715b();
                }
                boolean v = C75060a.m131820v(ugAwemeActivitySetting);
                UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f168496a.f168480a;
                if (ugAwemeActivitySetting2 == null) {
                    C89219l.m154715b();
                }
                a.mo118137b(v, C75060a.m131819u(ugAwemeActivitySetting2));
                if (this.f168496a.mo118047a().mo118147j()) {
                    C62766b.C62768b.f142302a.mo100735a(C17867d.m33078a());
                    C75068h.m131834a("non_tracker", 0, "finished", this.f168496a.f168480a);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74950d(SpecActNewPendant specActNewPendant) {
            this.f168496a = specActNewPendant;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75069i.AbstractC75070a
        /* renamed from: a */
        public final void mo118068a(List<C75126k.C75135i> list) {
            UgActivityTasks i;
            C74951a.C74952a.m131613a().mo118090a(list);
            if (this.f168496a.f168494i) {
                if (!this.f168496a.f168493h) {
                    this.f168496a.mo118047a().mo118130a(false, C75060a.m131814p(this.f168496a.f168480a), C75060a.m131815q(this.f168496a.f168480a));
                    AbstractC75020a a = this.f168496a.mo118047a();
                    UgAwemeActivitySetting ugAwemeActivitySetting = this.f168496a.f168480a;
                    if (ugAwemeActivitySetting == null) {
                        C89219l.m154715b();
                    }
                    boolean v = C75060a.m131820v(ugAwemeActivitySetting);
                    UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f168496a.f168480a;
                    if (ugAwemeActivitySetting2 == null) {
                        C89219l.m154715b();
                    }
                    a.mo118137b(v, C75060a.m131819u(ugAwemeActivitySetting2));
                    if (this.f168496a.mo118047a().mo118147j()) {
                        C62766b.C62768b.f142302a.mo100735a(C17867d.m33078a());
                        C75068h.m131834a("non_tracker", 0, "finished", this.f168496a.f168480a);
                    }
                }
                C75040b a2 = C75040b.C75041a.m131765a();
                if (!a2.f168667d.isEmpty()) {
                    a2.f168666c = true;
                    a2.mo118172e().mo118150a(true);
                    if (list != null && !list.isEmpty()) {
                        Iterator<? extends UgActivityTasks> it = a2.f168667d.iterator();
                        loop0:
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            UgActivityTasks ugActivityTasks = (UgActivityTasks) it.next();
                            if (C89219l.m154714a((Object) ugActivityTasks.getTaskId(), (Object) "read_and_like_video")) {
                                for (C75126k.C75135i iVar : list) {
                                    if (C89219l.m154714a((Object) iVar.f168943c, (Object) "read_and_like_video")) {
                                        ugActivityTasks.setTime(Integer.valueOf(iVar.mo118293b()));
                                        break loop0;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                    if (!(a2.mo118159c() || (i = a2.mo118176i()) == null)) {
                        a2.mo118170a(i);
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75069i.AbstractC75070a
        /* renamed from: a */
        public final void mo118067a(int i, String str, Boolean bool, Integer num) {
            boolean z;
            if (this.f168496a.f168493h) {
                C75029a a = C75029a.C75030a.m131750a();
                a.mo118163e().mo118152b(a.f168640b);
                a.f168641c = true;
                a.f168642d = i;
                a.f168644f = num;
                a.f168646h = bool;
                if (!C89219l.m154714a((Object) bool, (Object) true) || !(num == null || a.mo118162d().getInt(C75083m.m131848a("new_pendant_click_time"), 0) == 0 || C75081k.m131844a() - a.mo118162d().getInt(C75083m.m131848a("new_pendant_click_time"), 0) < num.intValue() * 24 * 3600)) {
                    z = false;
                } else {
                    z = true;
                }
                a.f168643e = Boolean.valueOf(z);
                if (str != null) {
                    a.f168645g = str;
                }
                a.mo118163e().mo118150a(true);
                String str2 = "ongoing";
                if (a.f168640b) {
                    AbstractC75024e eVar = a.f168647i;
                    if (eVar != null) {
                        eVar.mo118076d(a.f168645g);
                    }
                    boolean a2 = C89219l.m154714a((Object) a.f168646h, (Object) true);
                    if (!a.mo118164f()) {
                        str2 = "finished";
                    }
                    C75068h.m131834a("tracker", a2 ? 1 : 0, str2, a.f168639a);
                } else if (C89219l.m154714a((Object) a.f168643e, (Object) false)) {
                    AbstractC75024e eVar2 = a.f168647i;
                    if (eVar2 != null) {
                        eVar2.mo118072a(false, C75060a.m131814p(a.f168639a), C75060a.m131815q(a.f168639a));
                    }
                    AbstractC75024e eVar3 = a.f168647i;
                    if (eVar3 != null) {
                        UgAwemeActivitySetting ugAwemeActivitySetting = a.f168639a;
                        if (ugAwemeActivitySetting == null) {
                            C89219l.m154715b();
                        }
                        boolean v = C75060a.m131820v(ugAwemeActivitySetting);
                        UgAwemeActivitySetting ugAwemeActivitySetting2 = a.f168639a;
                        if (ugAwemeActivitySetting2 == null) {
                            C89219l.m154715b();
                        }
                        eVar3.mo118073a(v, C75060a.m131819u(ugAwemeActivitySetting2));
                    }
                    AbstractC75024e eVar4 = a.f168647i;
                    if (eVar4 != null && eVar4.mo118079n()) {
                        C62766b.C62768b.f142302a.mo100735a(C17867d.m33078a());
                        boolean a3 = C89219l.m154714a((Object) a.f168646h, (Object) true);
                        if (!a.mo118164f()) {
                            str2 = "finished";
                        }
                        C75068h.m131834a("non_tracker", a3 ? 1 : 0, str2, a.f168639a);
                    }
                } else if (!a.mo118159c()) {
                    a.mo118161a(true, false);
                } else {
                    AbstractC75024e eVar5 = a.f168647i;
                    if (eVar5 != null) {
                        eVar5.mo118072a(false, C75060a.m131814p(a.f168639a), C75060a.m131815q(a.f168639a));
                    }
                    AbstractC75024e eVar6 = a.f168647i;
                    if (eVar6 != null) {
                        UgAwemeActivitySetting ugAwemeActivitySetting3 = a.f168639a;
                        if (ugAwemeActivitySetting3 == null) {
                            C89219l.m154715b();
                        }
                        boolean v2 = C75060a.m131820v(ugAwemeActivitySetting3);
                        UgAwemeActivitySetting ugAwemeActivitySetting4 = a.f168639a;
                        if (ugAwemeActivitySetting4 == null) {
                            C89219l.m154715b();
                        }
                        eVar6.mo118073a(v2, C75060a.m131819u(ugAwemeActivitySetting4));
                    }
                    AbstractC75024e eVar7 = a.f168647i;
                    if (eVar7 != null && eVar7.mo118079n()) {
                        C62766b.C62768b.f142302a.mo100735a(C17867d.m33078a());
                        boolean a4 = C89219l.m154714a((Object) a.f168646h, (Object) true);
                        if (!a.mo118164f()) {
                            str2 = "finished";
                        }
                        C75068h.m131834a("non_tracker", a4 ? 1 : 0, str2, a.f168639a);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75021b
    /* renamed from: m */
    public final void mo118078m() {
        AbstractC75020a a = mo118047a();
        if (a == null || !a.mo118132a() || !a.mo118147j()) {
            C74972b.m131623a("BubbleManager.tryShowBubble, notShow, b: widget not bound or not showing");
            return;
        }
        C74972b.f168549b++;
        if (View$OnClickListenerC75197b.f169086i) {
            C74972b.m131623a("BubbleManager.tryShowBubble, notShow, b: inAppPushIsShow");
        } else if (!C74972b.f168550c || !C74972b.f168551d) {
            Iterator<AbstractC74981c> it = C74972b.f168548a.iterator();
            while (it.hasNext()) {
                AbstractC74981c next = it.next();
                if (next.mo118102a() == a.mo118141d() && !(next instanceof C74999c)) {
                    if (next.mo118102a()) {
                        if (!C74972b.f168551d && next.mo118103a(a, C74972b.f168549b)) {
                            C74972b.f168551d = true;
                            return;
                        }
                    } else if (!C74972b.f168550c && next.mo118103a(a, C74972b.f168549b)) {
                        C74972b.f168550c = true;
                        return;
                    }
                }
            }
            C74972b.m131623a("BubbleManager.tryShowBubble, notShow ~~");
        } else {
            C74972b.m131623a("BubbleManager.tryShowBubble, notShow, b: staticBubble and dynamic all show");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.BasePendant
    /* renamed from: j */
    public final void mo118062j() {
        AbstractC75024e eVar;
        if (C75029a.C75030a.m131750a().mo118164f()) {
            C75029a a = C75029a.C75030a.m131750a();
            if (a.mo118164f()) {
                if (a.f168640b && (eVar = a.f168647i) != null) {
                    eVar.mo118076d(a.f168645g);
                }
                C75068h.m131834a("tracker", C89219l.m154714a(a.f168646h, true) ? 1 : 0, "ongoing", a.f168639a);
            }
        } else if (C75040b.C75041a.m131765a().mo118173f()) {
            C75040b a2 = C75040b.C75041a.m131765a();
            AbstractC75024e eVar2 = a2.f168669f;
            if (eVar2 != null) {
                eVar2.mo118072a(false, C75060a.m131814p(a2.f168664a), C75060a.m131815q(a2.f168664a));
            }
            AbstractC75024e eVar3 = a2.f168669f;
            if (eVar3 != null) {
                UgAwemeActivitySetting ugAwemeActivitySetting = a2.f168664a;
                if (ugAwemeActivitySetting == null) {
                    C89219l.m154715b();
                }
                boolean v = C75060a.m131820v(ugAwemeActivitySetting);
                UgAwemeActivitySetting ugAwemeActivitySetting2 = a2.f168664a;
                if (ugAwemeActivitySetting2 == null) {
                    C89219l.m154715b();
                }
                eVar3.mo118073a(v, C75060a.m131819u(ugAwemeActivitySetting2));
            }
            AbstractC75024e eVar4 = a2.f168669f;
            if (eVar4 != null && eVar4.mo118079n()) {
                C62766b.C62768b.f142302a.mo100735a(C17867d.m33078a());
                C75068h.m131834a("non_tracker", 0, "finished", a2.f168664a);
            }
        }
    }

    public /* synthetic */ SpecActNewPendant(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: e */
    public final void mo118077e(String str) {
        mo118047a().mo118127a(str);
    }

    /* renamed from: f */
    private final boolean m131572f(String str) {
        if (C89219l.m154714a((Object) "ForYou", (Object) str) || mo118047a().mo118141d()) {
            return true;
        }
        if (C89219l.m154714a((Object) "Follow", (Object) str)) {
            return C75060a.m131809k(this.f168480a);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75021b
    /* renamed from: c */
    public final void mo118075c(String str) {
        C89219l.m154721d(str, "");
        mo118050a(str);
        if (mo118047a().mo118132a() && !mo118047a().mo118141d()) {
            if (!m131572f(str)) {
                mo118047a().mo118146i();
            } else if (m131570b(this.f168484e)) {
                mo118047a().mo118145h();
            }
        }
    }

    /* renamed from: b */
    private final boolean m131570b(Aweme aweme) {
        if (C75062c.m131824a(aweme)) {
            return false;
        }
        if ((aweme != null && aweme.getAwemeType() == 101) || C39223a.m79601o().mo68703a()) {
            return false;
        }
        if (mo118047a().mo118141d()) {
            return true;
        }
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f168480a;
        if (ugAwemeActivitySetting == null) {
            C89219l.m154715b();
        }
        if (C75060a.m131820v(ugAwemeActivitySetting)) {
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f168480a;
            if (ugAwemeActivitySetting2 == null) {
                C89219l.m154715b();
            }
            if (C75060a.m131819u(ugAwemeActivitySetting2)) {
                AbstractC75020a a = mo118047a();
                UgAwemeActivitySetting ugAwemeActivitySetting3 = this.f168480a;
                if (ugAwemeActivitySetting3 == null) {
                    C89219l.m154715b();
                }
                if (!a.mo118133a(C75060a.m131818t(ugAwemeActivitySetting3))) {
                    if (!mo118047a().mo118144g()) {
                        return true;
                    }
                    return m131571c(aweme);
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m131571c(Aweme aweme) {
        if (!(aweme == null || aweme.getTextExtra() == null || aweme.getTextExtra().isEmpty())) {
            List<String> j = C75060a.m131808j(this.f168480a);
            if (!j.isEmpty()) {
                for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                    C89219l.m154716b(textExtraStruct, "");
                    if (j.contains(textExtraStruct.getCid())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75021b
    /* renamed from: a */
    public final void mo118071a(Aweme aweme) {
        String str;
        if (!mo118047a().mo118132a()) {
            return;
        }
        if (C75063d.m131826a() || C75063d.m131827b()) {
            this.f168484e = aweme;
            boolean c = m131571c(aweme);
            if (c && m131572f(this.f168485f)) {
                C33744d dVar = new C33744d();
                if (this.f168484e == null) {
                    str = "";
                } else {
                    Aweme aweme2 = this.f168484e;
                    if (aweme2 != null) {
                        str = aweme2.getAid();
                    } else {
                        str = null;
                    }
                }
                C39162r.m79460a("widget_time_tracker_show_tiktok_bonus", dVar.mo59983a("group_id", str).f79943a);
            }
            if (m131572f(this.f168485f)) {
                mo118047a().mo118131a(m131570b(aweme), c);
                if (mo118047a().mo118132a() && !mo118047a().mo118141d()) {
                    AbstractC75020a a = mo118047a();
                    UgAwemeActivitySetting ugAwemeActivitySetting = this.f168480a;
                    if (ugAwemeActivitySetting == null) {
                        C89219l.m154715b();
                    }
                    String q = C75060a.m131815q(ugAwemeActivitySetting);
                    UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f168480a;
                    if (ugAwemeActivitySetting2 == null) {
                        C89219l.m154715b();
                    }
                    a.mo118128a(q, C75060a.m131817s(ugAwemeActivitySetting2), C75060a.m131810l(this.f168480a));
                    return;
                }
                return;
            }
            mo118047a().mo118146i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75021b
    /* renamed from: b */
    public final void mo118074b(String str) {
        UgActivityTasks a;
        C89219l.m154721d(str, "");
        if (this.f168494i) {
            C75040b a2 = C75040b.C75041a.m131765a();
            C89219l.m154721d(str, "");
            if (a2.f168668e && (a = C75040b.m131751a(a2.f168667d)) != null) {
                a2.mo118171d().storeBoolean(C75083m.m131848a("do_like_or_comment_action"), true);
                C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("do_like_or_comment_action"), (Object) "true");
                long e = a2.mo118172e().mo118154e();
                Integer time = a.getTime();
                C89219l.m154716b(time, "");
                if (e < ((long) time.intValue())) {
                    C39162r.m79460a("interact_task_complete", new C33744d().mo59983a("task_name", str).f79943a);
                } else if (!a2.mo118171d().getBoolean(C75083m.m131848a("has_report_read_and_like_task"), false)) {
                    AbstractC75026g.C75027a.m131731a(a2, a);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.BasePendant
    /* renamed from: d */
    public final void mo118056d(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        if (!C75060a.m131803e(ugAwemeActivitySetting).isEmpty()) {
            this.f168494i = true;
            C75040b a = C75040b.C75041a.m131765a();
            C89219l.m154721d(ugAwemeActivitySetting, "");
            a.f168664a = ugAwemeActivitySetting;
            UgAwemeActivitySetting ugAwemeActivitySetting2 = a.f168664a;
            if (ugAwemeActivitySetting2 == null) {
                C89219l.m154715b();
            }
            a.f168667d = C75060a.m131803e(ugAwemeActivitySetting2);
            a.f168665b = a.mo118174g() + 1;
            a.f168668e = a.mo118171d().getBoolean(C75083m.m131848a("pendant_has_active"), false);
            if (!a.mo118172e().mo118153d()) {
                a.f168668e = false;
                a.mo118171d().storeBoolean(C75083m.m131848a("pendant_has_active"), a.f168668e);
            }
            a.mo118172e().mo118152b(a.f168668e);
            C75040b.C75041a.m131765a().f168669f = this;
        }
        if (C75060a.m131804f(ugAwemeActivitySetting) != null) {
            this.f168493h = true;
            C75029a a2 = C75029a.C75030a.m131750a();
            C89219l.m154721d(ugAwemeActivitySetting, "");
            a2.f168639a = ugAwemeActivitySetting;
            a2.f168640b = a2.mo118162d().getBoolean(C75083m.m131848a("new_pendant_has_active_manual"), false);
            if (!a2.mo118163e().mo118153d()) {
                a2.f168640b = false;
                a2.mo118162d().storeBoolean(C75083m.m131848a("new_pendant_has_active_manual"), a2.f168640b);
                a2.mo118162d().storeBoolean(C75083m.m131848a("task_finish"), false);
            }
            a2.mo118163e().mo118152b(a2.f168640b);
            C75029a.C75030a.m131750a().f168647i = this;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: d */
    public final void mo118076d(String str) {
        InputStream inputStream;
        C89219l.m154721d(str, "");
        C74949c cVar = new C74949c();
        C89219l.m154721d(str, "");
        try {
            AbstractC75020a a = mo118047a();
            if (a != null) {
                View$OnClickListenerC75084a aVar = (View$OnClickListenerC75084a) a;
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f168480a;
                if (ugAwemeActivitySetting == null) {
                    C89219l.m154715b();
                }
                if (C75060a.m131798b(ugAwemeActivitySetting) == 1) {
                    C75098b bVar = aVar.f168746a;
                    if (bVar != null) {
                        bVar.setProgressBackgroundColor(C75060a.m131813o(ugAwemeActivitySetting));
                    }
                    C75098b bVar2 = aVar.f168746a;
                    if (bVar2 != null) {
                        bVar2.setProgressForegroundColor(C75060a.m131812n(ugAwemeActivitySetting));
                    }
                }
                AbstractC75023d b = mo118051b();
                if (b != null) {
                    C62797j a2 = ((C75013a) b).mo118118a();
                    C89219l.m154721d(str, "");
                    if (a2.f142385b) {
                        C62772f fVar = a2.f142384a;
                        if (fVar != null) {
                            inputStream = fVar.mo100749a(str);
                        } else {
                            inputStream = null;
                        }
                        String a3 = a2.mo100740a();
                        if (inputStream != null && a3 != null) {
                            AbstractC75020a a4 = mo118047a();
                            if (a4 != null) {
                                C89219l.m154721d(inputStream, "");
                                C89219l.m154721d(a3, "");
                                C75098b bVar3 = ((View$OnClickListenerC75084a) a4).f168746a;
                                if (bVar3 != null) {
                                    C89219l.m154721d(inputStream, "");
                                    C89219l.m154721d(a3, "");
                                    try {
                                        OptimizedLottieAnimationView lottieView = bVar3.getLottieView();
                                        C2108f.m6593a(inputStream, "bigLottie").mo6130a((AbstractC2186i<C2044e>) new C75098b.C75102d(lottieView, inputStream, cVar)).mo6136c(new C75098b.C75103e(lottieView));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.specact.pendant.widget.SpecActWidget");
                            }
                        }
                    } else {
                        throw new Throwable("HAS NOT inited");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.specact.pendant.helper.PendantResourceLoader");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.specact.pendant.widget.SpecActWidget");
            }
        } catch (Throwable unused) {
            AbstractC75023d b2 = mo118051b();
            Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.specact.pendant.helper.PendantResourceLoader");
            ((C75013a) b2).mo118118a().mo100744b();
            LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi, "");
            localTestApi.getSpecActDebugService().mo106976a("SpecPendant", "setWidgetResource error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d7, code lost:
        if (r0.length() == 0) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.specact.pendant.SpecActNewPendant.onClick(android.view.View):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: a */
    public final void mo118070a(int i, int i2) {
        mo118047a().mo118124a(i, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: a */
    public final void mo118073a(boolean z, boolean z2) {
        mo118047a().mo118137b(z, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75024e
    /* renamed from: a */
    public final void mo118072a(boolean z, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        mo118047a().mo118130a(z, str, str2);
    }
}
