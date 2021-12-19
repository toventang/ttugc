package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3206a;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.AbstractC12799b;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.C55619b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e */
public final class C55422e extends AbstractC12769a implements AbstractC55450h {

    /* renamed from: j */
    EditText f126673j;

    /* renamed from: k */
    public View f126674k;

    /* renamed from: l */
    private final C12814b f126675l;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$l */
    public static final class C55434l extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {
        public static final C55434l INSTANCE = new C55434l();

        static {
            Covode.recordClassIndex(65205);
        }

        public C55434l() {
            super(1);
        }

        public final C55619b invoke(C55619b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65193);
    }

    /* renamed from: v */
    public final ContactListViewModel mo92463v() {
        return (ContactListViewModel) this.f126675l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$h */
    public static final class C55430h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126681a;

        static {
            Covode.recordClassIndex(65201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55430h(AbstractC12748a aVar) {
            super(0);
            this.f126681a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f126681a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$d */
    public static final class C55426d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55426d INSTANCE = new C55426d();

        static {
            Covode.recordClassIndex(65197);
        }

        public C55426d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$g */
    public static final class C55429g extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55429g INSTANCE = new C55429g();

        static {
            Covode.recordClassIndex(65200);
        }

        public C55429g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$i */
    public static final class C55431i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126682a;

        static {
            Covode.recordClassIndex(65202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55431i(AbstractC12748a aVar) {
            super(0);
            this.f126682a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f126682a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$j */
    public static final class C55432j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126683a;

        static {
            Covode.recordClassIndex(65203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55432j(AbstractC12748a aVar) {
            super(0);
            this.f126683a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f126683a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$n */
    public static final class C55436n extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55436n INSTANCE = new C55436n();

        static {
            Covode.recordClassIndex(65207);
        }

        public C55436n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$q */
    public static final class C55439q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55439q INSTANCE = new C55439q();

        static {
            Covode.recordClassIndex(65210);
        }

        public C55439q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$t */
    public static final class C55442t extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55442t INSTANCE = new C55442t();

        static {
            Covode.recordClassIndex(65213);
        }

        public C55442t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$k */
    public static final class C55433k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126684a;

        static {
            Covode.recordClassIndex(65204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55433k(AbstractC12748a aVar) {
            super(0);
            this.f126684a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f126684a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$m */
    public static final class C55435m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126685a;

        static {
            Covode.recordClassIndex(65206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55435m(AbstractC12748a aVar) {
            super(0);
            this.f126685a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f126685a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$a */
    public static final class C55423a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f126676a;

        static {
            Covode.recordClassIndex(65194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55423a(AbstractC89277c cVar) {
            super(0);
            this.f126676a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f126676a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$b */
    public static final class C55424b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126677a;

        static {
            Covode.recordClassIndex(65195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55424b(AbstractC12748a aVar) {
            super(0);
            this.f126677a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126677a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$c */
    public static final class C55425c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126678a;

        static {
            Covode.recordClassIndex(65196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55425c(AbstractC12748a aVar) {
            super(0);
            this.f126678a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126678a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$o */
    public static final class C55437o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126686a;

        static {
            Covode.recordClassIndex(65208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55437o(AbstractC12748a aVar) {
            super(0);
            this.f126686a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126686a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$p */
    public static final class C55438p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126687a;

        static {
            Covode.recordClassIndex(65209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55438p(AbstractC12748a aVar) {
            super(0);
            this.f126687a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126687a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$r */
    public static final class C55440r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126688a;

        static {
            Covode.recordClassIndex(65211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55440r(AbstractC12748a aVar) {
            super(0);
            this.f126688a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126688a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$s */
    public static final class C55441s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126689a;

        static {
            Covode.recordClassIndex(65212);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55441s(AbstractC12748a aVar) {
            super(0);
            this.f126689a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126689a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C55449g mo20658e() {
        return new C55449g(null, new C12776a(false));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3206a.AbstractC55450h
    /* renamed from: w */
    public final void mo92464w() {
        EditText editText = this.f126673j;
        if (editText == null) {
            C89219l.m154710a("searchEditText");
        }
        if (editText.hasFocus()) {
            editText.clearFocus();
        }
        EditText editText2 = this.f126673j;
        if (editText2 == null) {
            C89219l.m154710a("searchEditText");
        }
        KeyboardUtils.m70897c(editText2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$e */
    public static final class C55427e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126679a;

        static {
            Covode.recordClassIndex(65198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55427e(AbstractC12748a aVar) {
            super(0);
            this.f126679a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126679a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$f */
    public static final class C55428f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126680a;

        static {
            Covode.recordClassIndex(65199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55428f(AbstractC12748a aVar) {
            super(0);
            this.f126680a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126680a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C55422e() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ContactListViewModel.class);
        C55423a aVar = new C55423a(a);
        C55434l lVar = C55434l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C55436n.INSTANCE, new C55437o(this), new C55438p(this), C55439q.INSTANCE, lVar, new C55440r(this), new C55441s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C55442t.INSTANCE, new C55424b(this), new C55425c(this), C55426d.INSTANCE, lVar, new C55427e(this), new C55428f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C55429g.INSTANCE, new C55430h(this), new C55431i(this), new C55432j(this), lVar, new C55433k(this), new C55435m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f126675l = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$u */
    public static final class C55443u implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C55422e f126690a;

        static {
            Covode.recordClassIndex(65214);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C55443u(C55422e eVar) {
            this.f126690a = eVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            ContactListViewModel v = this.f126690a.mo92463v();
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            v.mo92519j().mo92711a(str);
        }

        public final void onTextChanged(final CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            View view = this.f126690a.f126674k;
            if (view == null) {
                C89219l.m154710a("closeBtn");
            }
            if (charSequence == null || charSequence.length() == 0) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            view.setVisibility(i4);
            C55422e eVar = this.f126690a;
            C554441 r5 = new AbstractC89172b<C55449g, C55449g>() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3206a.C55422e.C55443u.C554441 */

                static {
                    Covode.recordClassIndex(65215);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C55449g invoke(C55449g gVar) {
                    String str;
                    C55449g gVar2 = gVar;
                    if (gVar2 == null) {
                        return null;
                    }
                    CharSequence charSequence = charSequence;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    return C55449g.m101227a(gVar2, str, null, 2);
                }
            };
            Class<C55422e> cls = C55422e.class;
            Class<?>[] interfaces = cls.getInterfaces();
            C89219l.m154709a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (AbstractC12799b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        C89219l.m154709a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (AbstractC12799b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    C12753e eVar2 = eVar.bD_().f30985g;
                    Object f = C89070n.m154579f((List) arrayList2);
                    if (f != null) {
                        eVar2.mo20613a((Class) f, r5);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$x */
    static final class C55447x extends AbstractC89220m implements AbstractC89172b<C55449g, C55449g> {

        /* renamed from: a */
        public static final C55447x f126694a = new C55447x();

        static {
            Covode.recordClassIndex(65218);
        }

        C55447x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C55449g invoke(C55449g gVar) {
            C55449g gVar2 = gVar;
            if (gVar2 != null) {
                return C55449g.m101227a(gVar2, null, new C12776a(true), 1);
            }
            return null;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        String str;
        C89219l.m154721d(view, "");
        View t = mo20528t();
        if (t == null) {
            C89219l.m154715b();
        }
        DmtEditText dmtEditText = (DmtEditText) t.findViewById(R.id.drm);
        Context context = dmtEditText.getContext();
        if (context != null) {
            str = context.getString(R.string.ffs);
        } else {
            str = null;
        }
        dmtEditText.setHint(str);
        dmtEditText.addTextChangedListener(new C55443u(this));
        C89219l.m154716b(dmtEditText, "");
        this.f126673j = dmtEditText;
        View t2 = mo20528t();
        if (t2 == null) {
            C89219l.m154715b();
        }
        TuxIconView tuxIconView = (TuxIconView) t2.findViewById(R.id.x7);
        tuxIconView.setOnClickListener(new View$OnClickListenerC55445v(this));
        C89219l.m154716b(tuxIconView, "");
        this.f126674k = tuxIconView;
        AbstractC12818f.C12819a.m23063a(this, mo92463v(), C55448f.f126695a, C12856l.m23100a(), new C55446w(this), 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$v */
    static final class View$OnClickListenerC55445v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C55422e f126692a;

        static {
            Covode.recordClassIndex(65216);
        }

        View$OnClickListenerC55445v(C55422e eVar) {
            this.f126692a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C55422e eVar = this.f126692a;
            View view2 = eVar.f126674k;
            if (view2 == null) {
                C89219l.m154710a("closeBtn");
            }
            view2.setVisibility(8);
            EditText editText = eVar.f126673j;
            if (editText == null) {
                C89219l.m154710a("searchEditText");
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            eVar.mo92464w();
            C55447x xVar = C55447x.f126694a;
            Class<C55422e> cls = C55422e.class;
            Class<?>[] interfaces = cls.getInterfaces();
            C89219l.m154709a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (AbstractC12799b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        C89219l.m154709a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (AbstractC12799b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    C12753e eVar2 = eVar.bD_().f30985g;
                    Object f = C89070n.m154579f((List) arrayList2);
                    if (f != null) {
                        eVar2.mo20613a((Class) f, xVar);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.e$w */
    static final class C55446w extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55422e f126693a;

        static {
            Covode.recordClassIndex(65217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55446w(C55422e eVar) {
            super(2);
            this.f126693a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends IMUser> aVar) {
            C89219l.m154721d(pVar, "");
            this.f126693a.mo92464w();
            return C89391z.f203057a;
        }
    }
}
