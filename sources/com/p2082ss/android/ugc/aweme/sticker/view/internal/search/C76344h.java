package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71977b;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75572h;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75575k;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75474b;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75480a;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75481b;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75490g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75654n;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76235h;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76337f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.C76401f;
import com.p2082ss.android.ugc.aweme.sticker.widget.C76412b;
import com.p2082ss.android.ugc.aweme.sticker.widget.C76416c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.tools.view.widget.C85059n;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.h */
public final class C76344h extends AbstractC76225f<Effect> {

    /* renamed from: m */
    public static final C76349a f171493m = new C76349a((byte) 0);

    /* renamed from: a */
    public String f171494a;

    /* renamed from: b */
    public boolean f171495b;

    /* renamed from: c */
    public final AbstractC75655o f171496c;

    /* renamed from: d */
    public final AbstractC76151g f171497d;

    /* renamed from: e */
    final C75572h f171498e;

    /* renamed from: f */
    public final AbstractC75474b f171499f;

    /* renamed from: g */
    public final int f171500g;

    /* renamed from: l */
    public final AbstractC89171a<String> f171501l;

    /* renamed from: n */
    private String f171502n;

    /* renamed from: o */
    private final HashSet<String> f171503o;

    /* renamed from: p */
    private List<? extends Effect> f171504p;

    /* renamed from: q */
    private final C1213t<AbstractC76337f> f171505q;

    static {
        Covode.recordClassIndex(89299);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.h$a */
    public static final class C76349a {
        static {
            Covode.recordClassIndex(89304);
        }

        private C76349a() {
        }

        public /* synthetic */ C76349a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo120075a(C76363k kVar) {
        C89219l.m154721d(kVar, "");
        mo119952a((List) kVar.f171543b);
        this.f171494a = kVar.f171544c;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.h$b */
    static final class C76350b extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C76344h f171511a;

        static {
            Covode.recordClassIndex(89305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76350b(C76344h hVar) {
            super(1);
            this.f171511a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(C75466g.m132368t((Effect) this.f171511a.mo119955a(num.intValue())));
        }
    }

    /* renamed from: a */
    public final int mo119954a(Effect effect) {
        if (this.f171500g == 3) {
            return C89070n.m154546a((List) this.f171504p, (Object) effect);
        }
        return super.mo119954a((Object) effect);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f
    /* renamed from: a */
    public final void mo119948a(C76210a<Effect> aVar) {
        C89219l.m154721d(aVar, "");
        super.mo119948a((C76210a) aVar);
        aVar.mo119158a(this.f171498e.f169833g.f169868m);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.h$c */
    static final class C76351c extends AbstractC89220m implements AbstractC89172b<ViewGroup, C76210a<Effect>> {

        /* renamed from: a */
        final /* synthetic */ C76344h f171512a;

        static {
            Covode.recordClassIndex(89306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76351c(C76344h hVar) {
            super(1);
            this.f171512a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76210a<Effect> invoke(ViewGroup viewGroup) {
            C89378p a;
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            int i = this.f171512a.f171500g;
            if (i == 1) {
                C75575k kVar = this.f171512a.f171498e.f169833g;
                Context context = viewGroup2.getContext();
                C89219l.m154716b(context, "");
                a = C76412b.m133923a(kVar, context);
            } else if (i != 3) {
                C75575k kVar2 = this.f171512a.f171498e.f169833g;
                Context context2 = viewGroup2.getContext();
                C89219l.m154716b(context2, "");
                a = C76416c.m133927a(kVar2, context2);
            } else {
                C75575k kVar3 = this.f171512a.f171498e.f169833g;
                Context context3 = viewGroup2.getContext();
                C89219l.m154716b(context3, "");
                a = C76412b.m133923a(kVar3, context3);
            }
            FrameLayout frameLayout = (FrameLayout) a.component1();
            C85037b bVar = (C85037b) a.component2();
            return new C75481b(this, bVar, frameLayout, frameLayout, bVar, this.f171512a.f171496c, this.f171512a.f171497d, this.f171512a.f171236j) {
                /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76344h.C76351c.C763521 */

                /* renamed from: e */
                final /* synthetic */ C76351c f171513e;

                /* renamed from: i */
                final /* synthetic */ C85037b f171514i;

                /* renamed from: j */
                final /* synthetic */ FrameLayout f171515j;

                static {
                    Covode.recordClassIndex(89307);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.AbstractView$OnClickListenerC75488e
                /* renamed from: b */
                public final void mo119163b(boolean z) {
                    super.mo119163b(z);
                    if ((this.f171514i instanceof C85059n) && (this.f171513e.f171512a.f171236j instanceof TTSearchStickerViewModel)) {
                        ((C85059n) this.f171514i).mo130000a(z, ((SearchStickerViewModel) this.f171513e.f171512a.f171236j).mo120042j().f170142b);
                    }
                }

                {
                    this.f171513e = r7;
                    this.f171514i = r8;
                    this.f171515j = r9;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.h$d */
    static final class C76353d extends AbstractC89220m implements AbstractC89172b<ViewGroup, C76210a<Effect>> {

        /* renamed from: a */
        final /* synthetic */ C76344h f171516a;

        static {
            Covode.recordClassIndex(89308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76353d(C76344h hVar) {
            super(1);
            this.f171516a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76210a<Effect> invoke(ViewGroup viewGroup) {
            C89378p a;
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            int i = this.f171516a.f171500g;
            if (i == 1) {
                C75575k kVar = this.f171516a.f171498e.f169833g;
                Context context = viewGroup2.getContext();
                C89219l.m154716b(context, "");
                a = C76412b.m133923a(kVar, context);
            } else if (i != 3) {
                C75575k kVar2 = this.f171516a.f171498e.f169833g;
                Context context2 = viewGroup2.getContext();
                C89219l.m154716b(context2, "");
                a = C76416c.m133927a(kVar2, context2);
            } else {
                C75575k kVar3 = this.f171516a.f171498e.f169833g;
                Context context3 = viewGroup2.getContext();
                C89219l.m154716b(context3, "");
                a = C76412b.m133923a(kVar3, context3);
            }
            FrameLayout frameLayout = (FrameLayout) a.component1();
            C85037b bVar = (C85037b) a.component2();
            if (this.f171516a.f171498e.f169833g.f169875t) {
                C763541 r1 = new C75480a(this, bVar, frameLayout, frameLayout, bVar, this.f171516a.f171496c, this.f171516a.f171497d, this.f171516a.f171236j) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76344h.C76353d.C763541 */

                    /* renamed from: e */
                    final /* synthetic */ C76353d f171517e;

                    /* renamed from: i */
                    final /* synthetic */ C85037b f171518i;

                    /* renamed from: j */
                    final /* synthetic */ FrameLayout f171519j;

                    static {
                        Covode.recordClassIndex(89309);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.AbstractView$OnClickListenerC75488e
                    /* renamed from: b */
                    public final void mo119163b(boolean z) {
                        super.mo119163b(z);
                        if ((this.f171518i instanceof C85059n) && (this.f171517e.f171516a.f171236j instanceof TTSearchStickerViewModel)) {
                            ((C85059n) this.f171518i).mo130000a(z, ((SearchStickerViewModel) this.f171517e.f171516a.f171236j).mo120042j().f170142b);
                        }
                    }

                    {
                        this.f171517e = r7;
                        this.f171518i = r8;
                        this.f171519j = r9;
                    }
                };
                r1.f169630a = this.f171516a.f171499f;
                return r1;
            }
            C763552 r12 = new C75490g(this, bVar, frameLayout, frameLayout, bVar, this.f171516a.f171496c, this.f171516a.f171497d, this.f171516a.f171236j) {
                /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76344h.C76353d.C763552 */

                /* renamed from: e */
                final /* synthetic */ C76353d f171520e;

                /* renamed from: i */
                final /* synthetic */ C85037b f171521i;

                /* renamed from: j */
                final /* synthetic */ FrameLayout f171522j;

                static {
                    Covode.recordClassIndex(89310);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.AbstractView$OnClickListenerC75488e
                /* renamed from: b */
                public final void mo119163b(boolean z) {
                    super.mo119163b(z);
                    if ((this.f171521i instanceof C85059n) && (this.f171520e.f171516a.f171236j instanceof TTSearchStickerViewModel)) {
                        ((C85059n) this.f171521i).mo130000a(z, ((SearchStickerViewModel) this.f171520e.f171516a.f171236j).mo120042j().f170142b);
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
                @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75490g, com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo119155a(Effect effect, int i) {
                    mo119155a(effect, i);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75490g
                /* renamed from: b */
                public final C76401f<Effect> mo119165b(Effect effect, int i) {
                    String str;
                    C89219l.m154721d(effect, "");
                    int i2 = this.f171209h;
                    Bundle bundle = new Bundle();
                    bundle.putString("search_id", this.f171520e.f171516a.f171494a);
                    if (this.f171520e.f171516a.f171500g == 3) {
                        str = "recommend";
                    } else {
                        str = "search";
                    }
                    bundle.putString("search_method", str);
                    bundle.putString("is_panel_unfold", this.f171520e.f171516a.f171501l.invoke());
                    return new C76401f<>(effect, i, i2, false, false, true, bundle, this, null, 792);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75490g
                /* renamed from: a */
                public final void mo119164a(Effect effect, int i) {
                    String valueOf;
                    String str;
                    C89219l.m154721d(effect, "");
                    super.mo119155a(effect, i);
                    long use_number = effect.getUse_number();
                    C85037b bVar = this.f171521i;
                    if (bVar instanceof C85059n) {
                        C85059n nVar = (C85059n) bVar;
                        if (0 <= use_number && 1000 > use_number) {
                            valueOf = String.valueOf(use_number);
                        } else if (1000 <= use_number && 1000000 > use_number) {
                            valueOf = C1720b.m5623a(use_number, 1000, "k");
                        } else if (1000000 <= use_number && 100000000 > use_number) {
                            valueOf = C1720b.m5623a(use_number, 1000, "m");
                        } else {
                            valueOf = C1720b.m5623a(use_number, 1000000000, "b");
                        }
                        C89219l.m154721d(valueOf, "");
                        String str2 = valueOf + ' ';
                        if (use_number > 1) {
                            str = str2 + nVar.getContext().getString(C71977b.f161305k);
                        } else {
                            str = str2 + nVar.getContext().getString(C71977b.f161306l);
                        }
                        StyleTextView styleTextView = nVar.f190343b;
                        if (styleTextView == null) {
                            C89219l.m154710a("stickerUseNumberText");
                        }
                        styleTextView.setText(str);
                    }
                    if ((this.f171521i instanceof C85059n) && (this.f171520e.f171516a.f171236j instanceof TTSearchStickerViewModel)) {
                        ((C85059n) this.f171521i).mo129999a(((SearchStickerViewModel) this.f171520e.f171516a.f171236j).mo120042j().f170142b);
                    }
                }

                {
                    this.f171520e = r7;
                    this.f171521i = r8;
                    this.f171522j = r9;
                }
            };
            r12.f169630a = this.f171516a.f171499f;
            return r12;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f
    /* renamed from: a */
    public final void mo119951a(AbstractC76235h<Effect, C76210a<Effect>> hVar) {
        C89219l.m154721d(hVar, "");
        super.mo119951a((AbstractC76235h) hVar);
        hVar.mo119957a(new C76350b(this), new C76351c(this));
        hVar.mo119957a(AbstractC76235h.C76236a.C76237a.f171252a, new C76353d(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f
    /* renamed from: a */
    public final void mo119952a(List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        if (this.f171500g == 3) {
            this.f171502n = "recommend";
            this.f171504p = list;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().setSearchType("prop_recommend");
            }
        } else {
            this.f171502n = "search";
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setSearchType("prop_search");
            }
        }
        super.mo119952a((List) list);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C76210a) viewHolder, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f
    /* renamed from: a */
    public final void mo119949a(C76210a<Effect> aVar, int i) {
        C89219l.m154721d(aVar, "");
        super.onBindViewHolder(aVar, i);
        Effect effect = (Effect) mo119955a(i);
        if (effect != null && i > 0 && !this.f171503o.contains(effect.getEffectId())) {
            this.f171503o.add(effect.getEffectId());
            this.f171505q.setValue(new AbstractC76337f.C76342e(this.f171502n, this.f171494a, this.f171501l.invoke(), effect, i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C76344h(final ActivityC0945e eVar, AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar, C75572h hVar, C1213t<AbstractC76337f> tVar, final RecyclerView.AbstractC1362i iVar, int i, AbstractC89171a<String> aVar) {
        super(bVar, hVar);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(aVar, "");
        this.f171496c = oVar;
        this.f171497d = gVar;
        this.f171498e = hVar;
        this.f171499f = null;
        this.f171505q = tVar;
        this.f171500g = i;
        this.f171501l = aVar;
        this.f171502n = "search";
        this.f171494a = "0";
        this.f171503o = new HashSet<>();
        this.f171504p = new ArrayList();
        this.f171235i = -1;
        oVar.mo119302n().mo119327d().observe(eVar, new AbstractC1214u<C75654n>(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76344h.C763451 */

            /* renamed from: a */
            final /* synthetic */ C76344h f171506a;

            static {
                Covode.recordClassIndex(89300);
            }

            {
                this.f171506a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C75654n nVar) {
                C75654n nVar2 = nVar;
                if (nVar2 != null) {
                    Effect effect = nVar2.f170067a;
                    Effect effect2 = nVar2.f170068b;
                    int a = this.f171506a.mo119954a(effect);
                    int a2 = this.f171506a.mo119954a(effect2);
                    if (a >= 0) {
                        this.f171506a.notifyItemChanged(a + 1, effect);
                    }
                    if (a2 >= 0) {
                        this.f171506a.notifyItemChanged(a2 + 1, effect2);
                    }
                }
            }
        });
        bVar.mo120099k().observe(eVar, new AbstractC1214u<C89386u<? extends Effect, ? extends EnumC84444c, ? extends Integer>>(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76344h.C763462 */

            /* renamed from: a */
            final /* synthetic */ C76344h f171507a;

            static {
                Covode.recordClassIndex(89301);
            }

            {
                this.f171507a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C89386u<? extends Effect, ? extends EnumC84444c, ? extends Integer> uVar) {
                C89386u<? extends Effect, ? extends EnumC84444c, ? extends Integer> uVar2 = uVar;
                if (uVar2 != null) {
                    Effect effect = (Effect) uVar2.component1();
                    int a = this.f171507a.mo119954a(effect);
                    if (a >= 0) {
                        this.f171507a.f171495b = true;
                        this.f171507a.notifyItemChanged(a + 1, effect);
                    }
                    if (this.f171507a.f171500g != 3 && (iVar instanceof LinearLayoutManager) && uVar2.getSecond() == EnumC84444c.DOWNLOAD_SUCCESS) {
                        ((LinearLayoutManager) iVar).mo4347a(a + 1, 0);
                    }
                }
            }
        });
        bVar.mo120102n().observe(eVar, new AbstractC1214u<C20391d<? extends Effect>>() {
            /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76344h.C763473 */

            static {
                Covode.recordClassIndex(89302);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C20391d<? extends Effect> dVar) {
                C20391d<? extends Effect> dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.mo33724a(new AbstractC89172b<Effect, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76344h.C763473.C763481 */

                        /* renamed from: a */
                        final /* synthetic */ C763473 f171510a;

                        static {
                            Covode.recordClassIndex(89303);
                        }

                        {
                            this.f171510a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(Effect effect) {
                            C89219l.m154721d(effect, "");
                            C85052j.C85053a.m146245a(eVar, (int) R.string.bl8, 0).mo129996a();
                            return C89391z.f203057a;
                        }
                    });
                }
            }
        });
    }

    public /* synthetic */ C76344h(ActivityC0945e eVar, AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b bVar, C75572h hVar, C1213t tVar, RecyclerView.AbstractC1362i iVar, int i, AbstractC89171a aVar, byte b) {
        this(eVar, oVar, gVar, bVar, hVar, tVar, iVar, i, aVar);
    }
}
