package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75654n;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75723b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75710p;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76211b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.SharedPoolStickerListViewModel;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.EnumC76135n;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g */
public class C76275g extends AbstractC76255a<C76211b> {

    /* renamed from: v */
    public static final C76276a f171337v = new C76276a((byte) 0);

    /* renamed from: l */
    private boolean f171338l;

    /* renamed from: m */
    private final AbstractC89244h f171339m = C89250i.m154773a((AbstractC89171a) new C76294r(this));

    /* renamed from: n */
    private final AbstractC89244h f171340n = C89250i.m154773a((AbstractC89171a) new C76283h(this));

    /* renamed from: o */
    private final AbstractC89244h f171341o = C89250i.m154773a((AbstractC89171a) new C76284i(this));

    /* renamed from: q */
    public String f171342q;

    /* renamed from: r */
    public String f171343r;

    /* renamed from: s */
    public boolean f171344s;

    /* renamed from: t */
    public boolean f171345t;

    /* renamed from: u */
    public int f171346u = -1;

    static {
        Covode.recordClassIndex(89226);
    }

    /* renamed from: t */
    private final LiveData<EnumC76135n> m133718t() {
        return (LiveData) this.f171339m.getValue();
    }

    /* renamed from: u */
    private final EffectCategoryModel m133719u() {
        return (EffectCategoryModel) this.f171340n.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo119989a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final AbstractC76397b<Effect> mo119994p() {
        return (AbstractC76397b) this.f171341o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$a */
    public static final class C76276a {
        static {
            Covode.recordClassIndex(89227);
        }

        private C76276a() {
        }

        public /* synthetic */ C76276a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$i */
    static final class C76284i extends AbstractC89220m implements AbstractC89171a<AbstractC76397b<Effect>> {

        /* renamed from: a */
        final /* synthetic */ C76275g f171356a;

        static {
            Covode.recordClassIndex(89235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76284i(C76275g gVar) {
            super(0);
            this.f171356a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC76397b<Effect> invoke() {
            return this.f171356a.mo119988n();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$r */
    static final class C76294r extends AbstractC89220m implements AbstractC89171a<LiveData<EnumC76135n>> {

        /* renamed from: a */
        final /* synthetic */ C76275g f171367a;

        static {
            Covode.recordClassIndex(89245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76294r(C76275g gVar) {
            super(0);
            this.f171367a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveData<EnumC76135n> invoke() {
            return this.f171367a.mo119980g().f171021e;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    /* renamed from: k */
    public void mo119983k() {
        String str = this.f171343r;
        if (str != null) {
            mo119994p().mo119126a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$h */
    static final class C76283h extends AbstractC89220m implements AbstractC89171a<EffectCategoryModel> {

        /* renamed from: a */
        final /* synthetic */ C76275g f171355a;

        static {
            Covode.recordClassIndex(89234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76283h(C76275g gVar) {
            super(0);
            this.f171355a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EffectCategoryModel invoke() {
            return C89070n.m154561b((List) C75723b.m132877a(this.f171355a.mo119977d().mo119291c().mo119464j()), this.f171355a.f171305e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    /* renamed from: j */
    public final void mo119982j() {
        if (getActivity() != null && mo119985m() && mo119981i().f171029f.f169835i) {
            mo119995q();
        }
    }

    /* renamed from: s */
    public final void mo119997s() {
        AbstractC76122i iVar;
        if (this.f171304d != null && (iVar = mo119980g().f171017a) != null) {
            iVar.mo119864a(this.f171342q);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C76211b mo119991o() {
        return new C76211b(mo119977d(), mo119979f(), mo119994p(), mo119981i().f171029f, mo119980g().f171020d, mo119980g().f171018b, mo119980g(), this.f171342q, this.f171305e);
    }

    /* renamed from: r */
    public final void mo119996r() {
        C76211b bVar;
        List<T> list;
        String str = this.f171342q;
        if (str != null && (bVar = (C76211b) this.f171304d) != null && (list = bVar.f171234h) != null && !list.isEmpty()) {
            int k = mo119974b().mo4371k();
            int m = mo119974b().mo4373m();
            AbstractC76122i iVar = mo119980g().f171017a;
            if (iVar != null) {
                iVar.mo119862a(k, m, str, new C76285j(bVar));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AbstractC76397b<Effect> mo119988n() {
        String str;
        AbstractC75655o d = mo119977d();
        AbstractC75300d e = mo119978e();
        AbstractC76151g f = mo119979f();
        StickerStatesStoreViewModel stickerStatesStoreViewModel = (StickerStatesStoreViewModel) C1181ae.m3880a(requireActivity()).mo3983a(StickerStatesStoreViewModel.class);
        AbstractC75710p e2 = mo119977d().mo119291c().mo119459e();
        EffectCategoryModel u = m133719u();
        if (u == null || (str = u.getKey()) == null) {
            str = "";
        }
        return new SharedPoolStickerListViewModel(this, d, e, f, stickerStatesStoreViewModel.mo120113a(e2, str));
    }

    /* renamed from: q */
    public final void mo119995q() {
        if ((!mo119981i().f171029f.f169835i || this.f171309i) && !this.f171338l) {
            this.f171338l = true;
            mo119977d().mo119302n().mo119327d().observe(this, new C76287l(this));
            mo119994p().mo120101m().observe(this, new C76288m(this));
            mo119994p().mo120100l().observe(this, new C76289n(this));
            mo119994p().mo120099k().observe(this, new C76290o(this));
            mo119994p().mo120102n().observe(this, new C76291p(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$c */
    public static final class View$OnAttachStateChangeListenerC76278c implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C76275g f171349a;

        static {
            Covode.recordClassIndex(89229);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC76278c(C76275g gVar) {
            this.f171349a = gVar;
        }

        public final void onViewDetachedFromWindow(View view) {
            C89219l.m154721d(view, "");
            this.f171349a.mo119997s();
        }

        public final void onViewAttachedToWindow(View view) {
            C89219l.m154721d(view, "");
            if (this.f171349a.getUserVisibleHint()) {
                this.f171349a.mo119996r();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$e */
    public static final class C76280e implements RecyclerView.AbstractC1368k {

        /* renamed from: a */
        final /* synthetic */ C76275g f171352a;

        static {
            Covode.recordClassIndex(89231);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1368k
        /* renamed from: b */
        public final void mo4748b(View view) {
            C89219l.m154721d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76280e(C76275g gVar) {
            this.f171352a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1368k
        /* renamed from: a */
        public final void mo4747a(View view) {
            C89219l.m154721d(view, "");
            if (this.f171352a.getUserVisibleHint()) {
                this.f171352a.mo119993c(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$q */
    public static final class C76293q extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C76275g f171365a;

        /* renamed from: b */
        private int f171366b;

        static {
            Covode.recordClassIndex(89244);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76293q(C76275g gVar) {
            this.f171365a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 0) {
                C24413h c = C24182c.m45844c();
                C89219l.m154716b(c, "");
                if (c.mo40237d()) {
                    C24182c.m45844c().mo40233c();
                }
            } else if (i != 1) {
                if (i == 2) {
                    C24182c.m45844c().mo40230b();
                }
            } else if (this.f171366b == 2) {
                C24182c.m45844c().mo40230b();
            } else {
                C24413h c2 = C24182c.m45844c();
                C89219l.m154716b(c2, "");
                if (c2.mo40237d()) {
                    C24182c.m45844c().mo40233c();
                }
            }
            this.f171366b = i;
            if (this.f171365a.f171345t) {
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).mo4373m() - 1 == this.f171365a.f171311k) {
                    C76275g gVar = this.f171365a;
                    gVar.mo119989a(gVar.f171311k);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$s */
    public static final class C76295s extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C76275g f171368a;

        static {
            Covode.recordClassIndex(89246);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76295s(C76275g gVar) {
            this.f171368a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 0) {
                C24413h c = C24182c.m45844c();
                C89219l.m154716b(c, "");
                if (c.mo40237d()) {
                    C24182c.m45844c().mo40233c();
                }
            } else if (i != 1) {
                if (i == 2) {
                    C24182c.m45844c().mo40230b();
                }
            } else if (this.f171368a.f171346u == 2) {
                C24182c.m45844c().mo40230b();
            } else {
                C24413h c2 = C24182c.m45844c();
                C89219l.m154716b(c2, "");
                if (c2.mo40237d()) {
                    C24182c.m45844c().mo40233c();
                }
            }
            this.f171368a.f171346u = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$j */
    public static final class C76285j extends AbstractC89220m implements AbstractC89172b<Integer, Effect> {

        /* renamed from: a */
        final /* synthetic */ C76211b f171357a;

        static {
            Covode.recordClassIndex(89236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76285j(C76211b bVar) {
            super(1);
            this.f171357a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Effect invoke(Integer num) {
            return this.f171357a.mo119955a(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$k */
    public static final class C76286k extends AbstractC89220m implements AbstractC89172b<Integer, Effect> {

        /* renamed from: a */
        final /* synthetic */ C76211b f171358a;

        static {
            Covode.recordClassIndex(89237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76286k(C76211b bVar) {
            super(1);
            this.f171358a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Effect invoke(Integer num) {
            return this.f171358a.mo119955a(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$n */
    public static final class C76289n<T> implements AbstractC1214u<List<? extends Effect>> {

        /* renamed from: a */
        final /* synthetic */ C76275g f171361a;

        static {
            Covode.recordClassIndex(89240);
        }

        C76289n(C76275g gVar) {
            this.f171361a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            if (list2 != null) {
                this.f171361a.mo119973a(list2);
                this.f171361a.mo119992b(3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$p */
    public static final class C76291p<T> implements AbstractC1214u<C20391d<? extends Effect>> {

        /* renamed from: a */
        final /* synthetic */ C76275g f171363a;

        static {
            Covode.recordClassIndex(89242);
        }

        C76291p(C76275g gVar) {
            this.f171363a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C20391d<? extends Effect> dVar) {
            C20391d<? extends Effect> dVar2 = dVar;
            if (dVar2 != null) {
                dVar2.mo33724a(new AbstractC89172b<Effect, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76275g.C76291p.C762921 */

                    /* renamed from: a */
                    final /* synthetic */ C76291p f171364a;

                    static {
                        Covode.recordClassIndex(89243);
                    }

                    {
                        this.f171364a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Effect effect) {
                        C89219l.m154721d(effect, "");
                        C85052j.C85053a.m146245a(this.f171364a.f171363a.requireContext(), (int) R.string.bl8, 0).mo129996a();
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            mo119996r();
        } else {
            mo119997s();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$f */
    static final class C76281f<T> implements AbstractC1214u<EnumC76135n> {

        /* renamed from: a */
        final /* synthetic */ C76275g f171353a;

        static {
            Covode.recordClassIndex(89232);
        }

        C76281f(C76275g gVar) {
            this.f171353a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(EnumC76135n nVar) {
            EnumC76135n nVar2 = nVar;
            if (nVar2 != null && nVar2.ordinal() == EnumC76135n.SHOWN.ordinal()) {
                this.f171353a.mo119995q();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$o */
    public static final class C76290o<T> implements AbstractC1214u<C89386u<? extends Effect, ? extends EnumC84444c, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C76275g f171362a;

        static {
            Covode.recordClassIndex(89241);
        }

        C76290o(C76275g gVar) {
            this.f171362a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C89386u<? extends Effect, ? extends EnumC84444c, ? extends Integer> uVar) {
            int a;
            C89386u<? extends Effect, ? extends EnumC84444c, ? extends Integer> uVar2 = uVar;
            if (uVar2 != null) {
                Effect effect = (Effect) uVar2.component1();
                C76211b bVar = (C76211b) this.f171362a.f171304d;
                if (bVar != 0 && (a = bVar.mo119954a(effect)) >= 0) {
                    C76275g.m133717a(bVar, a, effect);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    /* renamed from: a */
    public void mo119973a(List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        ADAPTER adapter = this.f171304d;
        if (adapter != null && getActivity() != null && !list.isEmpty()) {
            adapter.f171235i = this.f171305e;
            adapter.mo119952a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$g */
    static final class C76282g<T> implements AbstractC1214u<EnumC76135n> {

        /* renamed from: a */
        final /* synthetic */ C76275g f171354a;

        static {
            Covode.recordClassIndex(89233);
        }

        C76282g(C76275g gVar) {
            this.f171354a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(EnumC76135n nVar) {
            ADAPTER adapter;
            List<T> list;
            EnumC76135n nVar2 = nVar;
            if (nVar2 != null && nVar2.ordinal() == EnumC76135n.SHOWN.ordinal() && (adapter = this.f171354a.f171304d) != null && (list = adapter.f171234h) != null && (!list.isEmpty())) {
                this.f171354a.mo119992b(3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$l */
    public static final class C76287l<T> implements AbstractC1214u<C75654n> {

        /* renamed from: a */
        final /* synthetic */ C76275g f171359a;

        static {
            Covode.recordClassIndex(89238);
        }

        C76287l(C76275g gVar) {
            this.f171359a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C75654n nVar) {
            C76211b bVar;
            C75654n nVar2 = nVar;
            if (nVar2 != null && (bVar = (C76211b) this.f171359a.f171304d) != 0) {
                Effect effect = nVar2.f170067a;
                Effect effect2 = nVar2.f170068b;
                int a = bVar.mo119954a(effect);
                int a2 = bVar.mo119954a(effect2);
                if (a >= 0) {
                    C76275g.m133717a(bVar, a, effect);
                }
                if (a2 >= 0) {
                    C76275g.m133717a(bVar, a2, effect2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo119992b(int i) {
        EnumC76135n nVar;
        AbstractC76122i iVar;
        LiveData<EnumC76135n> t = m133718t();
        if (t != null) {
            nVar = t.getValue();
        } else {
            nVar = null;
        }
        if (nVar == EnumC76135n.SHOWN && getUserVisibleHint() && (iVar = mo119980g().f171017a) != null) {
            iVar.mo119861a(i);
        }
    }

    /* renamed from: c */
    public final void mo119993c(View view) {
        C76211b bVar;
        List<T> list;
        AbstractC76122i iVar;
        String str = this.f171342q;
        if (str != null && (bVar = (C76211b) this.f171304d) != null && (list = bVar.f171234h) != null && !list.isEmpty()) {
            mo119971a();
            int d = RecyclerView.m4277d(view);
            if (d != 0 && (iVar = mo119980g().f171017a) != null) {
                iVar.mo119863a(d, str, new C76286k(bVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$m */
    public static final class C76288m<T> implements AbstractC1214u<EnumC85026a> {

        /* renamed from: a */
        final /* synthetic */ C76275g f171360a;

        static {
            Covode.recordClassIndex(89239);
        }

        C76288m(C76275g gVar) {
            this.f171360a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(EnumC85026a aVar) {
            EnumC85026a aVar2 = aVar;
            if (aVar2 != null) {
                int i = C76296h.f171369a[aVar2.ordinal()];
                if (i == 1) {
                    this.f171360a.mo119976c().setState(EnumC85026a.LOADING);
                } else if (i == 2) {
                    this.f171360a.mo119976c().setState(EnumC85026a.ERROR);
                    this.f171360a.mo119992b(1);
                } else if (i == 3) {
                    this.f171360a.mo119976c().setState(EnumC85026a.EMPTY);
                    this.f171360a.mo119992b(0);
                } else if (i == 4) {
                    this.f171360a.mo119976c().setState(EnumC85026a.NONE);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        EffectCategoryModel u;
        super.onActivityCreated(bundle);
        if (getActivity() != null && mo119985m() && (u = m133719u()) != null) {
            this.f171342q = u.getName();
            this.f171343r = u.getKey();
            C76211b bVar = null;
            if (mo119971a().getAdapter() == null) {
                mo119971a().setItemAnimator(null);
                RecyclerView a = mo119971a();
                C76211b o = mo119991o();
                this.f171304d = o;
                a.setAdapter(o);
                mo119971a().mo4405a(new C76293q(this));
            } else {
                RecyclerView.AbstractC1350a adapter = mo119971a().getAdapter();
                if (adapter instanceof C76211b) {
                    bVar = adapter;
                }
                this.f171304d = bVar;
            }
            String str = this.f171343r;
            if (str == null || C89361p.m154870a((CharSequence) str)) {
                mo119976c().setState(EnumC85026a.LOADING);
            } else {
                mo119983k();
                if (m133718t() != null) {
                    LiveData<EnumC76135n> t = m133718t();
                    if (t != null) {
                        t.observe(this, new C76281f(this));
                    }
                } else {
                    mo119995q();
                }
                LiveData<EnumC76135n> t2 = m133718t();
                if (t2 != null) {
                    t2.observe(this, new C76282g(this));
                }
            }
            C76280e eVar = new C76280e(this);
            mo119971a().mo4405a(new C76277b(this, eVar));
            mo119971a().addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC76278c(this));
            mo119971a().mo4404a(new C76279d(this, eVar));
            mo119971a().mo4403a(eVar);
            this.f171344s = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$b */
    public static final class C76277b extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C76275g f171347a;

        /* renamed from: b */
        final /* synthetic */ C76280e f171348b;

        static {
            Covode.recordClassIndex(89228);
        }

        C76277b(C76275g gVar, C76280e eVar) {
            this.f171347a = gVar;
            this.f171348b = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (this.f171347a.f171344s) {
                this.f171347a.f171344s = false;
                recyclerView.mo4416b(this.f171348b);
            }
            super.mo4753a(recyclerView, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$d */
    public static final class C76279d implements RecyclerView.AbstractC1370m {

        /* renamed from: a */
        final /* synthetic */ C76275g f171350a;

        /* renamed from: b */
        final /* synthetic */ C76280e f171351b;

        static {
            Covode.recordClassIndex(89230);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: a */
        public final void mo4750a(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: b */
        public final void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(motionEvent, "");
        }

        C76279d(C76275g gVar, C76280e eVar) {
            this.f171350a = gVar;
            this.f171351b = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: a */
        public final boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(motionEvent, "");
            if (this.f171350a.f171344s) {
                this.f171350a.f171344s = false;
                recyclerView.mo4416b(this.f171351b);
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (getActivity() != null && mo119985m()) {
            if (mo119981i().f171029f.f169835i) {
                mo119976c().setState(EnumC85026a.LOADING);
            }
            if (mo119981i().f171029f.f169836j) {
                mo119971a().mo4405a(new C76295s(this));
            }
        }
    }

    /* renamed from: a */
    public static void m133717a(RecyclerView.AbstractC1350a<?> aVar, int i, Effect effect) {
        aVar.notifyItemChanged(i + 1, effect);
    }
}
