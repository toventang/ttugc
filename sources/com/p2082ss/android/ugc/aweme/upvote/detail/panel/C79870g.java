package com.p2082ss.android.ugc.aweme.upvote.detail.panel;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.p2082ss.android.ugc.aweme.upvote.detail.AbstractC79721a;
import com.p2082ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.p2082ss.android.ugc.aweme.upvote.detail.cell.C79787d;
import com.p2082ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell;
import com.p2082ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79711e;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.upvote.p4190d.C79716b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC89671m;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g */
public final class C79870g extends AbstractC79808a {

    /* renamed from: j */
    public PowerList f179099j;

    /* renamed from: k */
    private final AbstractC89244h f179100k = C89250i.m154773a((AbstractC89171a) new C79871a(this));

    static {
        Covode.recordClassIndex(93095);
    }

    /* renamed from: z */
    public final C79871a.C798721 mo123395z() {
        return (C79871a.C798721) this.f179100k.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g$a */
    public static final class C79871a extends AbstractC89220m implements AbstractC89171a<C798721> {

        /* renamed from: a */
        final /* synthetic */ C79870g f179101a;

        static {
            Covode.recordClassIndex(93096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79871a(C79870g gVar) {
            super(0);
            this.f179101a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C798721 invoke() {
            C17693c cVar = new C17693c();
            cVar.f42321c = LoadingFooterCell.class;
            cVar.f42319a = 5;
            return new AbstractC17692b<Long>(this, cVar) {
                /* class com.p2082ss.android.ugc.aweme.upvote.detail.panel.C79870g.C79871a.C798721 */

                /* renamed from: a */
                public AbstractC89671m<? super AbstractC17700f<Long>> f179102a;

                /* renamed from: e */
                final /* synthetic */ C79871a f179103e;

                /* renamed from: f */
                private boolean f179104f = true;

                /* renamed from: g */
                private final C79873a f179105g = new C79873a(this);

                static {
                    Covode.recordClassIndex(93097);
                }

                /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g$a$1$a */
                public static final class C79873a implements AbstractC79721a {

                    /* renamed from: a */
                    final /* synthetic */ C798721 f179106a;

                    static {
                        Covode.recordClassIndex(93098);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    C79873a(C798721 r1) {
                        this.f179106a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.upvote.detail.AbstractC79721a
                    /* renamed from: a */
                    public final void mo123325a(Throwable th, long j) {
                        C89219l.m154721d(th, "");
                        if (!C798721.m138647a(this.f179106a).mo144217c() && !C798721.m138647a(this.f179106a).mo144215b()) {
                            C798721.m138647a(this.f179106a).resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a((Exception) th)));
                            this.f179106a.mo123396a(j, th);
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.upvote.detail.AbstractC79721a
                    /* renamed from: a */
                    public final void mo123324a(C79711e eVar, long j) {
                        C89219l.m154721d(eVar, "");
                        if (!(C798721.m138647a(this.f179106a).mo144217c() || C798721.m138647a(this.f179106a).mo144215b())) {
                            List<C79714h> upvotes = eVar.getUpvotes();
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) upvotes, 10));
                            for (T t : upvotes) {
                                arrayList.add(new C79787d(t, this.f179106a.f179103e.f179101a.mo123382w().f178883d, this.f179106a.mo123397a((C79714h) t)));
                            }
                            ArrayList arrayList2 = arrayList;
                            if (eVar.getHasMore()) {
                                C798721.m138647a(this.f179106a).resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, Long.valueOf(eVar.getCursor()), arrayList2, 1)));
                            } else {
                                C798721.m138647a(this.f179106a).resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                            }
                            this.f179106a.mo123396a(j, (Throwable) null);
                        }
                    }
                }

                /* renamed from: a */
                public static final /* synthetic */ AbstractC89671m m138647a(C798721 r1) {
                    AbstractC89671m<? super AbstractC17700f<Long>> mVar = r1.f179102a;
                    if (mVar == null) {
                        C89219l.m154710a("continuation");
                    }
                    return mVar;
                }

                /* renamed from: a */
                public final boolean mo123397a(C79714h hVar) {
                    if (!hVar.isPublished() || !this.f179103e.f179101a.mo123381v().f179098d || !C89219l.m154714a((Object) hVar.getCommentId(), (Object) this.f179103e.f179101a.mo123381v().f179097c)) {
                        return false;
                    }
                    return true;
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g$a$1$b */
                public static final class C79874b extends AbstractC89220m implements AbstractC89172b<C79884l, C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C798721 f179107a;

                    /* renamed from: b */
                    final /* synthetic */ Throwable f179108b;

                    static {
                        Covode.recordClassIndex(93099);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C79874b(C798721 r2, Throwable th) {
                        super(1);
                        this.f179107a = r2;
                        this.f179108b = th;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C79884l lVar) {
                        EnumC79894q qVar;
                        boolean z;
                        C89219l.m154721d(lVar, "");
                        C79711e value = this.f179107a.f179103e.f179101a.mo123382w().mo123317a().getValue();
                        if (this.f179108b != null) {
                            qVar = EnumC79894q.ERROR;
                        } else if (value == null || (value.getUpvotes().isEmpty() && !value.getHasMore())) {
                            qVar = EnumC79894q.EMPTY;
                        } else {
                            qVar = EnumC79894q.LOADED;
                        }
                        if (this.f179108b != null || this.f179107a.f179103e.f179101a.mo123382w().mo123321b()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        UpvoteDetailPanelViewModel x = this.f179107a.f179103e.f179101a.mo123383x();
                        C89219l.m154721d(qVar, "");
                        x.mo20662a(new UpvoteDetailPanelViewModel.C79801f(qVar, z));
                        return C89391z.f203057a;
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final void mo23345a(AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
                    C89219l.m154721d(dVar, "");
                    this.f179102a = (AbstractC89671m) dVar;
                    C79711e value = this.f179103e.f179101a.mo123382w().mo123317a().getValue();
                    boolean z = false;
                    if (!this.f179103e.f179101a.mo123381v().f179098d || !this.f179104f ? value != null : !(!(!((Boolean) C79716b.f178873b.getValue()).booleanValue()) || value == null)) {
                        z = true;
                    }
                    if (z) {
                        C79873a aVar = this.f179105g;
                        if (value == null) {
                            C89219l.m154715b();
                        }
                        aVar.mo123324a(value, 0);
                        return;
                    }
                    this.f179103e.f179101a.mo123382w().mo123319a(this.f179105g, this.f179103e.f179101a.mo123381v().f179097c, 0);
                }

                {
                    this.f179103e = r2;
                }

                /* renamed from: a */
                public final void mo123396a(long j, Throwable th) {
                    this.f179104f = false;
                    if (j <= 0) {
                        C79870g.m22977a(this.f179103e.f179101a.mo123383x(), new C79874b(this, th));
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: b */
                public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                    long longValue = ((Number) obj).longValue();
                    C89219l.m154721d(dVar, "");
                    this.f179102a = (AbstractC89671m) dVar;
                    UpvoteListViewModel.m138544a(this.f179103e.f179101a.mo123382w(), this.f179105g, null, longValue, 2);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g$b */
    public static final class C79875b extends RecyclerView.AbstractC1353c {

        /* renamed from: a */
        final /* synthetic */ C79870g f179109a;

        static {
            Covode.recordClassIndex(93100);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C79875b(C79870g gVar) {
            this.f179109a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            if (i == 0) {
                C79870g.m138644a(this.f179109a).mo4413b(0);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PowerList m138644a(C79870g gVar) {
        PowerList powerList = gVar.f179099j;
        if (powerList == null) {
            C89219l.m154710a("upvotePowerList");
        }
        return powerList;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.f_0);
        C89219l.m154716b(findViewById, "");
        PowerList powerList = (PowerList) findViewById;
        this.f179099j = powerList;
        if (powerList == null) {
            C89219l.m154710a("upvotePowerList");
        }
        powerList.mo28083a(UpvoteDetailPanelListCell.class);
        PowerList powerList2 = this.f179099j;
        if (powerList2 == null) {
            C89219l.m154710a("upvotePowerList");
        }
        powerList2.mo28082a(mo123395z());
        PowerList powerList3 = this.f179099j;
        if (powerList3 == null) {
            C89219l.m154710a("upvotePowerList");
        }
        powerList3.setItemAnimator(null);
        PowerList powerList4 = this.f179099j;
        if (powerList4 == null) {
            C89219l.m154710a("upvotePowerList");
        }
        RecyclerView.AbstractC1350a adapter = powerList4.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new C79875b(this));
        }
        AbstractC12818f.C12819a.m23063a(this, mo123383x(), C79880h.f179114a, (C12854k) null, new C79876c(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo123383x(), C79881i.f179115a, (C12854k) null, new C79877d(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo123383x(), C79882j.f179116a, C12856l.m23100a(), new C79878e(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo123384y(), C79883k.f179117a, C12856l.m23100a(), new C79879f(this), 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g$c */
    static final class C79876c extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, EnumC79894q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79870g f179110a;

        static {
            Covode.recordClassIndex(93101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79876c(C79870g gVar) {
            super(2);
            this.f179110a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, EnumC79894q qVar) {
            int i;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(qVar, "");
            PowerList a = C79870g.m138644a(this.f179110a);
            if (qVar == EnumC79894q.LOADED) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g$d */
    static final class C79877d extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79870g f179111a;

        static {
            Covode.recordClassIndex(93102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79877d(C79870g gVar) {
            super(2);
            this.f179111a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Boolean bool) {
            int a;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(pVar, "");
            if (booleanValue) {
                a = 0;
            } else {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                a = C89241a.m154730a(TypedValue.applyDimension(1, 68.0f, system.getDisplayMetrics()));
            }
            C23163i.m43668b(C79870g.m138644a(this.f179111a), null, null, null, Integer.valueOf(a), false, 23);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g$e */
    static final class C79878e extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79870g f179112a;

        static {
            Covode.recordClassIndex(93103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79878e(C79870g gVar) {
            super(2);
            this.f179112a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            if (aVar2.f31085a.booleanValue()) {
                this.f179112a.mo123395z().f42330c.mo28163e();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.g$f */
    static final class C79879f extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends C89378p<? extends Integer, ? extends String>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79870g f179113a;

        static {
            Covode.recordClassIndex(93104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79879f(C79870g gVar) {
            super(2);
            this.f179113a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends C89378p<? extends Integer, ? extends String>> aVar) {
            T t;
            C12776a<? extends C89378p<? extends Integer, ? extends String>> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                if (C89219l.m154714a((Object) this.f179113a.mo123382w().f178881b, t.component2())) {
                    this.f179113a.mo123395z().f42330c.mo28163e();
                }
            }
            return C89391z.f203057a;
        }
    }
}
