package com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50700h;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50701i;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50686a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50694b;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50819f;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel */
public final class FilterBoxViewModel extends HumbleViewModel implements AbstractC33974au, AbstractC50854g {

    /* renamed from: a */
    public final C1213t<C89378p<AbstractC50819f.EnumC50820a, C50686a>> f117296a = new C1213t<>();

    /* renamed from: b */
    public AbstractC50700h f117297b;

    /* renamed from: c */
    private AbstractC88412b f117298c;

    /* renamed from: d */
    private final AbstractC50701i f117299d;

    static {
        Covode.recordClassIndex(60013);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.AbstractC50854g
    /* renamed from: a */
    public final LiveData<C89378p<AbstractC50819f.EnumC50820a, C50686a>> mo86232a() {
        return this.f117296a;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.AbstractC50854g
    /* renamed from: c */
    public final void mo86236c() {
        AbstractC50700h hVar = this.f117297b;
        if (hVar != null) {
            hVar.mo86048b();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        AbstractC88412b bVar = this.f117298c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f117298c = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.AbstractC50854g
    /* renamed from: b */
    public final void mo86234b() {
        AbstractC88412b bVar = this.f117298c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f117298c = null;
        this.f117297b = null;
        if (!isDestroyed()) {
            this.f117296a.setValue(C89387v.m154943a(AbstractC50819f.EnumC50820a.LOADING, null));
            this.f117298c = this.f117299d.mo86050a().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88392a.m153583a()).mo142915a(new C50841a(this), new C50842b(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel$b */
    static final class C50842b<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ FilterBoxViewModel f117301a;

        static {
            Covode.recordClassIndex(60015);
        }

        C50842b(FilterBoxViewModel filterBoxViewModel) {
            this.f117301a = filterBoxViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f117301a.f117296a.setValue(C89387v.m154943a(AbstractC50819f.EnumC50820a.ERROR, null));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.AbstractC50854g
    /* renamed from: a */
    public final void mo86233a(C50694b bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC50700h hVar = this.f117297b;
        if (hVar != null) {
            hVar.mo86047a(bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.AbstractC50854g
    /* renamed from: b */
    public final void mo86235b(C50694b bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC50700h hVar = this.f117297b;
        if (hVar != null) {
            hVar.mo86049b(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel$a */
    static final class C50841a<T> implements AbstractC88433f<AbstractC50700h> {

        /* renamed from: a */
        final /* synthetic */ FilterBoxViewModel f117300a;

        static {
            Covode.recordClassIndex(60014);
        }

        C50841a(FilterBoxViewModel filterBoxViewModel) {
            this.f117300a = filterBoxViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC50700h hVar) {
            AbstractC50700h hVar2 = hVar;
            this.f117300a.f117297b = hVar2;
            C50686a a = hVar2.mo86046a();
            if (a.f117026b.isEmpty()) {
                this.f117300a.f117296a.setValue(C89387v.m154943a(AbstractC50819f.EnumC50820a.EMPTY, null));
            } else {
                this.f117300a.f117296a.setValue(C89387v.m154943a(AbstractC50819f.EnumC50820a.OK, a));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterBoxViewModel(AbstractC1204m mVar, AbstractC50701i iVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(iVar, "");
        this.f117299d = iVar;
    }
}
