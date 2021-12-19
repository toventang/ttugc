package com.p2082ss.android.ugc.aweme.profile.widgets.p3583b;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce.C37500k;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p2082ss.android.ugc.aweme.experiment.C46937fn;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.music.AbstractC60708b;
import com.p2082ss.android.ugc.aweme.profile.effect.C63713e;
import com.p2082ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63748i;
import com.p2082ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63782l;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63997au;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64117cn;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.SwipableViewPager;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64207ac;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.profile.tab.MusProfileNavigator;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.EnumC64592g;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.AbstractC64716c;
import com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.AbstractC65121b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80541ho;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i */
public final class C64534i extends AbstractC64513a implements AbstractC64553r {

    /* renamed from: A */
    public C37500k f146227A;

    /* renamed from: B */
    public C63713e f146228B;

    /* renamed from: C */
    public boolean f146229C;

    /* renamed from: D */
    public boolean f146230D;

    /* renamed from: E */
    public boolean f146231E;

    /* renamed from: F */
    private AbstractC63985aq.AbstractC63986a f146232F = new C64537c(this);

    /* renamed from: x */
    public C63997au f146233x;

    /* renamed from: y */
    public C63997au f146234y;

    /* renamed from: z */
    public AbstractC64118co f146235z;

    static {
        Covode.recordClassIndex(75998);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: G */
    public final boolean mo104087G() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: F */
    public final AbstractC63985aq.AbstractC63986a mo104086F() {
        return this.f146232F;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$a */
    static final class C64535a implements AbstractC63985aq.AbstractC63987b {

        /* renamed from: a */
        final /* synthetic */ C64534i f146236a;

        static {
            Covode.recordClassIndex(75999);
        }

        C64535a(C64534i iVar) {
            this.f146236a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq.AbstractC63987b
        /* renamed from: a */
        public final void mo103569a() {
            this.f146236a.mo104085E();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64553r
    /* renamed from: V */
    public final int mo104125V() {
        return mo104112z().getTabCount();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64553r
    /* renamed from: W */
    public final List<Aweme> mo104126W() {
        C63997au auVar = this.f146233x;
        if (auVar != null) {
            return auVar.mo103556C();
        }
        return null;
    }

    /* renamed from: X */
    private String m116460X() {
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145633h;
        }
        return null;
    }

    /* renamed from: P */
    public final String mo104115P() {
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145629d;
        }
        return null;
    }

    /* renamed from: Q */
    public final String mo104120Q() {
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145630e;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: v */
    public final String mo104108v() {
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145628c;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: w */
    public final User mo104109w() {
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null) {
            return iVar.f146329a;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: x */
    public final String mo104110x() {
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145626a;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: y */
    public final String mo104111y() {
        C64207ac acVar = (C64207ac) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145627b;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: K */
    public final boolean mo104091K() {
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            if (!(b instanceof C17873f.AbstractC17876c) && !C63873h.f144797a.isDetailActivity(b)) {
                return C63873h.f144797a.isUserProfileActivity(b);
            }
            if (!ScrollSwitchStateManager.C52950a.m97811a(b).mo89350b("page_feed")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R */
    public final void mo104121R() {
        List<Integer> list = this.f146185l;
        if (list != null && !list.isEmpty()) {
            mo104096a(mo104109w());
            MusProfileNavigator z = mo104112z();
            SwipableViewPager A = mo104081A();
            List<Integer> list2 = this.f146185l;
            if (list2 == null) {
                C89219l.m154715b();
            }
            list2.contains(3);
            z.mo103437a((ViewPager) A, false, (MusProfileNavigator.AbstractC63898a) this);
            mo104088H();
            C64117cn<AbstractC64118co> cnVar = this.f146187n;
            if (cnVar != null) {
                cnVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64553r
    /* renamed from: S */
    public final void mo104122S() {
        if (C80580in.m139685b(mo104109w(), false)) {
            mo104130c(true);
            C63997au auVar = this.f146233x;
            if (auVar != null) {
                auVar.mo103574n();
            }
            C63997au auVar2 = this.f146234y;
            if (auVar2 != null) {
                auVar2.mo103574n();
                return;
            }
            return;
        }
        C63997au auVar3 = this.f146233x;
        if (auVar3 != null) {
            auVar3.mo98052k();
        }
        C63997au auVar4 = this.f146234y;
        if (auVar4 != null) {
            auVar4.mo98052k();
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public final void mo20525j() {
        List<Integer> list;
        super.mo20525j();
        if (this.f146229C && (list = this.f146185l) != null) {
            boolean contains = list.contains(16);
            int i = 1;
            if (contains) {
                String P = mo104115P();
                String x = mo104110x();
                User w = mo104109w();
                if (w != null && w.getFollowStatus() == 0) {
                    i = 0;
                }
                C64314y.m116184a(P, x, (Integer) 0, Integer.valueOf(i), mo104120Q());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: D */
    public final boolean mo104084D() {
        int i;
        mo104128a(true, true);
        if (C46937fn.f109393c && this.f146184k != null) {
            int i2 = this.f146188o;
            List<AbstractC64118co> list = this.f146184k;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (i2 < i) {
                List<AbstractC64118co> list2 = this.f146184k;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                if (list2.get(this.f146188o) instanceof AbstractC63985aq) {
                    List<AbstractC64118co> list3 = this.f146184k;
                    if (list3 == null) {
                        C89219l.m154715b();
                    }
                    AbstractC64118co coVar = list3.get(this.f146188o);
                    Objects.requireNonNull(coVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
                    AbstractC63985aq aqVar = (AbstractC63985aq) coVar;
                    if (aqVar != null) {
                        aqVar.mo103565w();
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: U */
    public final void mo104124U() {
        List<Integer> list;
        String str;
        if (this.f146185l == null || ((list = this.f146185l) != null && list.size() == 0)) {
            C39162r.m79462a("profile_tab_show", C89387v.m154943a(Integer.valueOf(mo104112z().getTabCount()), "tab_cnt"), C89387v.m154943a("", "tab_name"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<Integer> list2 = this.f146185l;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue == 0) {
                    str = UGCMonitor.TYPE_POST;
                } else if (intValue == 1) {
                    str = "like";
                } else if (intValue == 3) {
                    str = "ost";
                } else if (intValue == 6) {
                    str = "effect";
                } else if (intValue == 14) {
                    str = "private_post";
                } else if (intValue != 16) {
                    str = "no matched";
                } else {
                    str = "user_shop";
                }
                arrayList.add(str);
            }
        }
        C39162r.m79462a("profile_tab_show", C89387v.m154943a(Integer.valueOf(mo104112z().getTabCount()), "tab_cnt"), C89387v.m154943a(C89070n.m154551a(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 63), "tab_name"));
    }

    /* renamed from: T */
    public final void mo104123T() {
        C37500k kVar;
        C63713e eVar;
        User w;
        AbstractC64118co coVar;
        boolean z;
        User w2;
        GeneralPermission generalPermission;
        C63997au auVar;
        boolean b;
        boolean z2;
        User w3;
        C63997au auVar2;
        boolean b2;
        boolean z3;
        User w4;
        int i = this.f146188o;
        C64117cn<AbstractC64118co> cnVar = this.f146187n;
        boolean z4 = true;
        if (cnVar != null && i == cnVar.mo103731e(1) && (auVar2 = this.f146234y) != null && auVar2.ci_()) {
            C63997au auVar3 = this.f146234y;
            if (auVar3 == null) {
                C89219l.m154715b();
            }
            if (mo104109w() == null) {
                b2 = this.f146230D;
            } else {
                b2 = C80580in.m139685b(mo104109w(), false);
            }
            auVar3.mo98050c_(b2);
            C63997au auVar4 = this.f146234y;
            if (auVar4 == null) {
                C89219l.m154715b();
            }
            if (mo104109w() == null || (w4 = mo104109w()) == null || !w4.isBlocked()) {
                z3 = false;
            } else {
                z3 = true;
            }
            auVar4.mo102301c(z3);
            C63997au auVar5 = this.f146234y;
            if (auVar5 == null) {
                C89219l.m154715b();
            }
            auVar5.bS_();
        }
        int i2 = this.f146188o;
        C64117cn<AbstractC64118co> cnVar2 = this.f146187n;
        if (cnVar2 != null && i2 == cnVar2.mo103731e(0) && (auVar = this.f146233x) != null && auVar.ci_()) {
            C63997au auVar6 = this.f146233x;
            if (auVar6 == null) {
                C89219l.m154715b();
            }
            if (mo104109w() == null) {
                b = this.f146230D;
            } else {
                b = C80580in.m139685b(mo104109w(), false);
            }
            auVar6.mo98050c_(b);
            C63997au auVar7 = this.f146233x;
            if (auVar7 == null) {
                C89219l.m154715b();
            }
            if (mo104109w() == null || (w3 = mo104109w()) == null || !w3.isBlocked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            auVar7.mo102301c(z2);
            C63997au auVar8 = this.f146233x;
            if (auVar8 == null) {
                C89219l.m154715b();
            }
            auVar8.bS_();
        }
        int i3 = this.f146188o;
        C64117cn<AbstractC64118co> cnVar3 = this.f146187n;
        if (cnVar3 != null && i3 == cnVar3.mo103731e(3) && (coVar = this.f146235z) != null && coVar.ci_()) {
            User w5 = mo104109w();
            if (w5 == null || (generalPermission = w5.getGeneralPermission()) == null || generalPermission.getOriginalList() != 1) {
                AbstractC64118co coVar2 = this.f146235z;
                if (coVar2 == null) {
                    C89219l.m154715b();
                }
                coVar2.mo98050c_(C80580in.m139685b(mo104109w(), false));
                AbstractC64118co coVar3 = this.f146235z;
                if (coVar3 == null) {
                    C89219l.m154715b();
                }
                if (mo104109w() == null || (w2 = mo104109w()) == null || !w2.isBlocked()) {
                    z = false;
                } else {
                    z = true;
                }
                coVar3.mo102301c(z);
                AbstractC64118co coVar4 = this.f146235z;
                if (coVar4 == null) {
                    C89219l.m154715b();
                }
                coVar4.bS_();
            } else {
                AbstractC64118co coVar5 = this.f146235z;
                if (!(coVar5 instanceof AbstractC60708b)) {
                    coVar5 = null;
                }
                AbstractC60708b bVar = (AbstractC60708b) coVar5;
                if (bVar != null) {
                    bVar.mo98051f();
                    return;
                }
                return;
            }
        }
        int i4 = this.f146188o;
        C64117cn<AbstractC64118co> cnVar4 = this.f146187n;
        if (cnVar4 != null && i4 == cnVar4.mo103731e(6) && (eVar = this.f146228B) != null && eVar.ci_()) {
            C63713e eVar2 = this.f146228B;
            if (eVar2 == null) {
                C89219l.m154715b();
            }
            eVar2.mo98050c_(C80580in.m139685b(mo104109w(), false));
            C63713e eVar3 = this.f146228B;
            if (eVar3 == null) {
                C89219l.m154715b();
            }
            if (mo104109w() == null || (w = mo104109w()) == null || !w.isBlocked()) {
                z4 = false;
            }
            eVar3.mo102301c(z4);
            C63713e eVar4 = this.f146228B;
            if (eVar4 == null) {
                C89219l.m154715b();
            }
            eVar4.bS_();
        }
        int i5 = this.f146188o;
        C64117cn<AbstractC64118co> cnVar5 = this.f146187n;
        if (cnVar5 != null && i5 == cnVar5.mo103731e(16) && mo104109w() != null && (kVar = this.f146227A) != null) {
            kVar.bS_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$b */
    static final class C64536b implements AbstractC63985aq.AbstractC63988c {

        /* renamed from: a */
        final /* synthetic */ C64534i f146237a;

        static {
            Covode.recordClassIndex(76000);
        }

        C64536b(C64534i iVar) {
            this.f146237a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq.AbstractC63988c
        /* renamed from: a */
        public final void mo103570a(boolean z) {
            this.f146237a.mo104132e(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$c */
    public static final class C64537c implements AbstractC63985aq.AbstractC63986a {

        /* renamed from: a */
        final /* synthetic */ C64534i f146238a;

        static {
            Covode.recordClassIndex(76001);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64537c(C64534i iVar) {
            this.f146238a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq.AbstractC63986a
        /* renamed from: a */
        public final void mo103567a(int i) {
            if (this.f146238a.f146186m != null) {
                DampScrollableLayout dampScrollableLayout = this.f146238a.f146186m;
                if (dampScrollableLayout == null) {
                    C89219l.m154715b();
                }
                dampScrollableLayout.setCanScrollUp(true);
            }
            if (i == 0) {
                this.f146238a.mo104082B().mo104033c(false);
                this.f146238a.mo104082B().mo104030a(false);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq.AbstractC63986a
        /* renamed from: a */
        public final void mo103568a(boolean z, int i) {
            User w;
            if (this.f146238a.f146186m != null) {
                DampScrollableLayout dampScrollableLayout = this.f146238a.f146186m;
                if (dampScrollableLayout == null) {
                    C89219l.m154715b();
                }
                dampScrollableLayout.setCanScrollUp(true);
            }
            if (i == 0) {
                this.f146238a.mo104082B().mo104033c(true);
                if (!z && C63748i.m115281b() && (w = this.f146238a.mo104109w()) != null && w.getFollowerCount() < 1000 && w.getAccountType() != 2 && w.getAccountType() != 3) {
                    if (!C63748i.m115282c()) {
                        this.f146238a.f146231E = true;
                        if (w.getTabType() == 0 || C80580in.m139685b(w, false)) {
                            ((AbstractC65121b) C12801d.m23023b(this.f146238a, C89204ab.m154669a(AbstractC65121b.class))).mo104326a();
                            this.f146238a.f146231E = false;
                        }
                    }
                    ((AbstractC65121b) C12801d.m23023b(this.f146238a, C89204ab.m154669a(AbstractC65121b.class))).mo104328b();
                }
                this.f146238a.mo104082B().mo104030a(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: c */
    public final void mo104101c(int i) {
        super.mo104101c(i);
        mo104123T();
    }

    /* renamed from: e */
    public final void mo104132e(boolean z) {
        mo104100b(!z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64553r
    /* renamed from: a */
    public final void mo104116a(String str) {
        C63997au auVar = this.f146234y;
        if (auVar != null) {
            auVar.mo103673b(str);
        }
        C63997au auVar2 = this.f146233x;
        if (auVar2 != null) {
            auVar2.mo103673b(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64553r
    /* renamed from: b */
    public final void mo104129b(String str) {
        C63997au auVar = this.f146233x;
        if (auVar != null) {
            auVar.mo103559a(str, false);
        }
        C63997au auVar2 = this.f146234y;
        if (auVar2 != null) {
            auVar2.mo103559a(str, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$g */
    static final class C64541g extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64534i f146242a;

        static {
            Covode.recordClassIndex(76005);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64541g(C64534i iVar) {
            super(1);
            this.f146242a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            if (!(aVar == null || this.f146242a.az_() == null || !this.f146242a.f31048h)) {
                this.f146242a.mo104123T();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$i */
    static final class C64543i extends AbstractC89220m implements AbstractC89172b<Aweme, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64534i f146244a;

        static {
            Covode.recordClassIndex(76007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64543i(C64534i iVar) {
            super(1);
            this.f146244a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Aweme aweme) {
            User user;
            Aweme aweme2 = aweme;
            C64534i iVar = this.f146244a;
            if (aweme2 != null) {
                user = aweme2.getAuthor();
            } else {
                user = null;
            }
            iVar.f146230D = C80580in.m139685b(user, false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$j */
    static final class C64544j extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64534i f146245a;

        static {
            Covode.recordClassIndex(76008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64544j(C64534i iVar) {
            super(1);
            this.f146245a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                this.f146245a.f146229C = aVar2.f31085a.booleanValue();
                C64534i iVar = this.f146245a;
                iVar.mo104098a(iVar.f146229C);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.tab.MusProfileNavigator.AbstractC63898a, com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: b */
    public final void mo103446b(int i) {
        super.mo103446b(i);
        if (this.f146231E && i == 0) {
            ((AbstractC65121b) C12801d.m23023b(this, C89204ab.m154669a(AbstractC65121b.class))).mo104326a();
            this.f146231E = false;
        }
    }

    /* renamed from: c */
    public final void mo104130c(boolean z) {
        C63997au auVar = this.f146234y;
        if (auVar != null) {
            auVar.mo98050c_(z);
        }
        C63997au auVar2 = this.f146233x;
        if (auVar2 != null) {
            auVar2.mo98050c_(z);
        }
        AbstractC64118co coVar = this.f146235z;
        if (coVar != null) {
            coVar.mo98050c_(z);
        }
        C63713e eVar = this.f146228B;
        if (eVar != null) {
            eVar.mo98050c_(z);
        }
    }

    /* renamed from: d */
    public final void mo104131d(boolean z) {
        C63997au auVar = this.f146234y;
        if (auVar != null) {
            auVar.mo102299b(z);
        }
        C63997au auVar2 = this.f146233x;
        if (auVar2 != null) {
            auVar2.mo102299b(z);
        }
        C63713e eVar = this.f146228B;
        if (eVar != null) {
            eVar.mo102299b(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$e */
    static final class C64539e extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64534i f146240a;

        static {
            Covode.recordClassIndex(76003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64539e(C64534i iVar) {
            super(1);
            this.f146240a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            if (aVar != null) {
                DampScrollableLayout dampScrollableLayout = this.f146240a.f146186m;
                if (dampScrollableLayout != null) {
                    dampScrollableLayout.mo68057a();
                }
                C63997au auVar = this.f146240a.f146234y;
                if (auVar != null) {
                    auVar.mo103655B();
                }
                C63997au auVar2 = this.f146240a.f146233x;
                if (auVar2 != null) {
                    auVar2.mo103655B();
                }
                this.f146240a.f146230D = false;
                this.f146240a.mo104081A().setCurrentItem(0, false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$d */
    static final class C64538d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64534i f146239a;

        static {
            Covode.recordClassIndex(76002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64538d(C64534i iVar) {
            super(1);
            this.f146239a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            if (aVar != null) {
                DampScrollableLayout dampScrollableLayout = this.f146239a.f146186m;
                if (dampScrollableLayout != null) {
                    dampScrollableLayout.mo68057a();
                }
                C63997au auVar = this.f146239a.f146234y;
                if (auVar != null) {
                    auVar.mo103655B();
                }
                C63997au auVar2 = this.f146239a.f146233x;
                if (auVar2 != null) {
                    auVar2.mo103655B();
                }
                C63713e eVar = this.f146239a.f146228B;
                if (eVar != null) {
                    eVar.f144449c = true;
                    eVar.mo102298a().mo33689c(EffectProfileListViewModel.C63683b.f144396a);
                }
                this.f146239a.mo104081A().setCurrentItem(0, false);
                this.f146239a.mo104131d(true);
                C63997au auVar3 = this.f146239a.f146233x;
                if (auVar3 != null) {
                    auVar3.mo59525f();
                }
                C63997au auVar4 = this.f146239a.f146234y;
                if (auVar4 != null) {
                    auVar4.mo59525f();
                }
                C63713e eVar2 = this.f146239a.f146228B;
                if (eVar2 != null) {
                    eVar2.mo102300c();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        super.mo20630b(view);
        mo104112z().setVisibility(8);
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64545j.f146246a, new C64541g(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64549n.f146250a, new C64542h(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64550o.f146251a, new C64543i(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64551p.f146252a, new C64544j(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64552q.f146253a, new C64538d(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64546k.f146247a, new C64539e(this));
        C12801d.m23021a(this, C89204ab.m154669a(AbstractC64206ab.class), C64547l.f146248a, C64548m.f146249a, new C64540f(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$h */
    static final class C64542h extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64534i f146243a;

        static {
            Covode.recordClassIndex(76006);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64542h(C64534i iVar) {
            super(1);
            this.f146243a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            Boolean bool;
            Boolean bool2;
            boolean z;
            String str;
            int i;
            if (aVar != null) {
                List<Integer> list = this.f146243a.f146185l;
                EnumC64592g gVar = null;
                if (list != null) {
                    bool = Boolean.valueOf(list.contains(16));
                } else {
                    bool = null;
                }
                C64615i iVar = (C64615i) C12801d.m23029f(this.f146243a, C89204ab.m154669a(AbstractC64616j.class));
                boolean z2 = true;
                if (iVar == null || !iVar.f146331c) {
                    this.f146243a.mo104083C();
                    C64534i iVar2 = this.f146243a;
                    iVar2.mo104127a(iVar2.mo104110x(), this.f146243a.mo104111y());
                    C63997au auVar = this.f146243a.f146234y;
                    if (auVar != null) {
                        auVar.mo103557a(this.f146243a.mo104109w());
                    }
                    C63997au auVar2 = this.f146243a.f146233x;
                    if (auVar2 != null) {
                        auVar2.mo103557a(this.f146243a.mo104109w());
                    }
                    this.f146243a.mo104121R();
                    List<Integer> list2 = this.f146243a.f146185l;
                    if (list2 != null) {
                        bool2 = Boolean.valueOf(list2.contains(16));
                    } else {
                        bool2 = null;
                    }
                    if (C89219l.m154714a((Object) bool, (Object) false) && C89219l.m154714a((Object) bool2, (Object) true)) {
                        String P = this.f146243a.mo104115P();
                        String x = this.f146243a.mo104110x();
                        User w = this.f146243a.mo104109w();
                        if (w == null || w.getFollowStatus() != 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        C64314y.m116184a(P, x, (Integer) 0, Integer.valueOf(i), this.f146243a.mo104120Q());
                    }
                    C64534i iVar3 = this.f146243a;
                    iVar3.mo104130c(C80580in.m139685b(iVar3.mo104109w(), false));
                    C64534i iVar4 = this.f146243a;
                    User w2 = iVar4.mo104109w();
                    if (w2 != null) {
                        z = w2.isBlock();
                    } else {
                        z = false;
                    }
                    iVar4.mo104131d(z);
                    this.f146243a.mo104123T();
                    User w3 = this.f146243a.mo104109w();
                    if (w3 != null) {
                        str = w3.getUid();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.equals(str, this.f146243a.mo104110x())) {
                        AbstractC64616j.C64617a.m116533a((AbstractC64616j) C12801d.m23018a(this.f146243a, C89204ab.m154669a(AbstractC64616j.class)), null, 3);
                    } else {
                        C64615i iVar5 = (C64615i) C12801d.m23029f(this.f146243a, C89204ab.m154669a(AbstractC64616j.class));
                        if (iVar5 != null) {
                            gVar = iVar5.f146333e;
                        }
                        if (gVar == EnumC64592g.CHANGE_TAB) {
                            C64534i iVar6 = this.f146243a;
                            iVar6.mo104099b(iVar6.mo104109w());
                        }
                        if (C80580in.m139685b(this.f146243a.mo104109w(), false)) {
                            this.f146243a.mo104112z().setScrollable(false);
                            this.f146243a.mo104081A().setScrollable(false);
                        }
                        C64534i iVar7 = this.f146243a;
                        User w4 = iVar7.mo104109w();
                        if (!(w4 == null || w4.getGeneralPermission() == null)) {
                            GeneralPermission generalPermission = w4.getGeneralPermission();
                            String str2 = "";
                            C89219l.m154716b(generalPermission, str2);
                            if (!TextUtils.isEmpty(generalPermission.getProfileToast())) {
                                C79459a aVar2 = new C79459a(iVar7.az_());
                                GeneralPermission generalPermission2 = w4.getGeneralPermission();
                                C89219l.m154716b(generalPermission2, str2);
                                aVar2.mo123052a(generalPermission2.getProfileToast()).mo123053a();
                                C33744d a = new C33744d().mo59983a("enter_from", "others_homepage");
                                if (w4.getGeneralPermission() != null) {
                                    GeneralPermission generalPermission3 = w4.getGeneralPermission();
                                    C89219l.m154716b(generalPermission3, str2);
                                    int followToastType = generalPermission3.getFollowToastType();
                                    if (followToastType == 1) {
                                        str2 = "ban";
                                    } else if (followToastType == 2) {
                                        str2 = "suspend";
                                    } else if (followToastType == 3) {
                                        str2 = "viewmodeA";
                                    } else if (followToastType == 4) {
                                        str2 = "viewmodeB";
                                    }
                                }
                                C39162r.m79460a("show_punish_toast", a.mo59983a("show_type", str2).f79943a);
                            }
                        }
                        C64534i iVar8 = this.f146243a;
                        User w5 = iVar8.mo104109w();
                        if (w5 != null && w5.isShowFavoriteList()) {
                            z2 = false;
                        }
                        iVar8.mo104132e(z2);
                        this.f146243a.mo104089I();
                        AbstractC64716c cVar = (AbstractC64716c) C12801d.m23025c(this.f146243a, C89204ab.m154669a(AbstractC64716c.class));
                        if (cVar != null) {
                            cVar.mo104178a(this.f146243a.mo104109w());
                        }
                        this.f146243a.mo104124U();
                    }
                } else {
                    C63997au auVar3 = this.f146243a.f146233x;
                    if (auVar3 != null) {
                        auVar3.mo103657E();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64513a
    /* renamed from: e */
    public final void mo104103e(int i) {
        String str;
        boolean z = false;
        boolean z2 = true;
        if (i == 0) {
            if (this.f146233x == null) {
                C63997au a = m116461a(0, 1);
                this.f146233x = a;
                if (a == null) {
                    C89219l.m154715b();
                }
                a.mo103558a(this.f146232F);
                C63997au auVar = this.f146233x;
                if (auVar == null) {
                    C89219l.m154715b();
                }
                if (this.f146188o != mo104090J()) {
                    z2 = false;
                }
                auVar.mo103563d(z2);
                C63997au auVar2 = this.f146233x;
                if (auVar2 == null) {
                    C89219l.m154715b();
                }
                auVar2.mo103561c(C80541ho.m139617a(0));
                C63997au auVar3 = this.f146233x;
                if (auVar3 == null) {
                    C89219l.m154715b();
                }
                auVar3.mo103562c_(mo104108v());
                C63997au auVar4 = this.f146233x;
                if (auVar4 == null) {
                    C89219l.m154715b();
                }
                auVar4.mo103673b(m116460X());
            }
            C63997au auVar5 = this.f146233x;
            if (auVar5 == null) {
                C89219l.m154715b();
            }
            auVar5.mo65249a(mo104110x(), mo104111y());
            mo104097a((AbstractC64118co) this.f146233x, (Integer) 0);
            if (this.f146233x == null) {
                C89219l.m154715b();
            }
            C63782l.m115339a(C63782l.m115342d(), "others_homepage");
        } else if (i != 12) {
            int i2 = 2;
            if (i == 2) {
                if (this.f146234y == null) {
                    C63997au a2 = m116461a(1, 2);
                    this.f146234y = a2;
                    if (a2 == null) {
                        C89219l.m154715b();
                    }
                    a2.mo103558a(this.f146232F);
                    C63997au auVar6 = this.f146234y;
                    if (auVar6 == null) {
                        C89219l.m154715b();
                    }
                    int i3 = this.f146188o;
                    if (!mo104090J()) {
                        i2 = 1;
                    }
                    if (i3 == i2) {
                        z = true;
                    }
                    auVar6.mo103563d(z);
                    C63997au auVar7 = this.f146234y;
                    if (auVar7 == null) {
                        C89219l.m154715b();
                    }
                    auVar7.mo103561c(C80541ho.m139617a(1));
                    C63997au auVar8 = this.f146234y;
                    if (auVar8 == null) {
                        C89219l.m154715b();
                    }
                    auVar8.mo103562c_(mo104108v());
                    C63997au auVar9 = this.f146234y;
                    if (auVar9 == null) {
                        C89219l.m154715b();
                    }
                    auVar9.mo103673b(m116460X());
                }
                C63997au auVar10 = this.f146234y;
                if (auVar10 == null) {
                    C89219l.m154715b();
                }
                auVar10.mo65249a(mo104110x(), mo104111y());
                C63997au auVar11 = this.f146234y;
                if (auVar11 == null) {
                    C89219l.m154715b();
                }
                auVar11.f145310J = new C64536b(this);
                mo104097a((AbstractC64118co) this.f146234y, (Integer) 1);
            } else if (i == 3) {
                if (this.f146235z == null) {
                    AbstractC64118co coVar = mo104104f(-1);
                    this.f146235z = coVar;
                    if (coVar == null) {
                        C89219l.m154715b();
                    }
                    coVar.mo103561c(C80541ho.m139617a(3));
                }
                AbstractC64118co coVar2 = this.f146235z;
                String str2 = null;
                if (!(coVar2 instanceof AbstractC60708b)) {
                    coVar2 = null;
                }
                AbstractC60708b bVar = (AbstractC60708b) coVar2;
                if (bVar != null) {
                    bVar.mo98047a(new C64535a(this));
                    User w = mo104109w();
                    if (w != null) {
                        str = w.getUniqueId();
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        User w2 = mo104109w();
                        if (w2 != null) {
                            str2 = w2.getShortId();
                        }
                    } else {
                        User w3 = mo104109w();
                        if (w3 != null) {
                            str2 = w3.getUniqueId();
                        }
                    }
                    bVar.mo98049b(str2);
                    AbstractC64118co coVar3 = this.f146235z;
                    if (coVar3 == null) {
                        C89219l.m154715b();
                    }
                    coVar3.mo65249a(mo104110x(), mo104111y());
                }
                mo104097a(this.f146235z, (Integer) 3);
            } else if (i == 4) {
                if (this.f146228B == null) {
                    C63713e N = mo104094N();
                    this.f146228B = N;
                    if (N == null) {
                        C89219l.m154715b();
                    }
                    N.mo103561c(C80541ho.m139617a(6));
                }
                C63713e eVar = this.f146228B;
                if (eVar == null) {
                    C89219l.m154715b();
                }
                eVar.mo65249a(mo104110x(), mo104111y());
                mo104097a((AbstractC64118co) this.f146228B, (Integer) 6);
            }
        } else {
            if (this.f146227A == null) {
                Bundle bundle = new Bundle();
                bundle.putString("sec_user_id", mo104111y());
                bundle.putString("author_id", mo104110x());
                bundle.putBoolean("is_my_profile", false);
                bundle.putString("enter_from", mo104115P());
                bundle.putString("show_window_source", mo104120Q());
                User w4 = mo104109w();
                if (w4 != null) {
                    bundle.putInt("follow_status", w4.getFollowStatus());
                }
                this.f146227A = C37500k.C37503c.m75626a(bundle);
            }
            mo104097a((AbstractC64118co) this.f146227A, (Integer) 16);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.i$f */
    static final class C64540f extends AbstractC89220m implements AbstractC89183m<String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64534i f146241a;

        static {
            Covode.recordClassIndex(76004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64540f(C64534i iVar) {
            super(2);
            this.f146241a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, String str2) {
            this.f146241a.mo104127a(str, str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final C63997au m116461a(int i, int i2) {
        Fragment fragment;
        AbstractC0952i childFragmentManager;
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        if (a == null || (childFragmentManager = a.getChildFragmentManager()) == null) {
            fragment = null;
        } else {
            fragment = childFragmentManager.mo3551a(this.f146183j + i2);
        }
        C63997au auVar = (C63997au) fragment;
        if (auVar != null) {
            return auVar;
        }
        C63997au a2 = C63997au.m115737a(-1, i, mo104110x(), mo104111y(), false, true, new Bundle());
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: a */
    public final void mo104127a(String str, String str2) {
        String str3;
        AbstractC64118co coVar = this.f146235z;
        if (coVar != null) {
            coVar.mo65249a(str, str2);
        }
        AbstractC64118co coVar2 = this.f146235z;
        String str4 = null;
        if (!(coVar2 instanceof AbstractC60708b)) {
            coVar2 = null;
        }
        AbstractC60708b bVar = (AbstractC60708b) coVar2;
        if (bVar != null) {
            User w = mo104109w();
            if (w != null) {
                str3 = w.getUniqueId();
            } else {
                str3 = null;
            }
            if (TextUtils.isEmpty(str3)) {
                User w2 = mo104109w();
                if (w2 != null) {
                    str4 = w2.getShortId();
                }
            } else {
                User w3 = mo104109w();
                if (w3 != null) {
                    str4 = w3.getUniqueId();
                }
            }
            bVar.mo98049b(str4);
        }
        C63713e eVar = this.f146228B;
        if (eVar != null) {
            eVar.mo65249a(str, str2);
        }
        C63997au auVar = this.f146234y;
        if (auVar != null) {
            auVar.mo65249a(str, str2);
        }
        C63997au auVar2 = this.f146233x;
        if (auVar2 != null) {
            auVar2.mo65249a(str, str2);
        }
        C37500k kVar = this.f146227A;
        if (kVar != null) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            kVar.mo65249a(str, str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64553r
    /* renamed from: a */
    public final void mo104128a(boolean z, boolean z2) {
        int i;
        if (this.f146184k != null) {
            int i2 = this.f146188o;
            List<AbstractC64118co> list = this.f146184k;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (i2 < i) {
                List<AbstractC64118co> list2 = this.f146184k;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                if (list2.get(this.f146188o) instanceof AbstractC63985aq) {
                    List<AbstractC64118co> list3 = this.f146184k;
                    if (list3 == null) {
                        C89219l.m154715b();
                    }
                    AbstractC64118co coVar = list3.get(this.f146188o);
                    Objects.requireNonNull(coVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
                    AbstractC63985aq aqVar = (AbstractC63985aq) coVar;
                    if (aqVar != null) {
                        if (z) {
                            aqVar.mo103560a(false, z2);
                        } else {
                            aqVar.mo103566y();
                        }
                    }
                }
            }
        }
    }
}
