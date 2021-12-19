package com.p2082ss.android.ugc.tools.infosticker.view.internal.search;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20391d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84538f;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84541i;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84698i;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel */
public final class InfoStickerSearchListViewModel extends HumbleViewModel implements AbstractC84698i<InfoStickerEffect>, AbstractC84700k<InfoStickerEffect>, AbstractC84700k {

    /* renamed from: a */
    public final C1213t<String> f189627a;

    /* renamed from: b */
    public final C1213t<List<InfoStickerEffect>> f189628b;

    /* renamed from: c */
    public final C1213t<EnumC85026a> f189629c;

    /* renamed from: d */
    public final C1213t<EnumC85026a> f189630d;

    /* renamed from: e */
    public final C1213t<Map<InfoStickerEffect, C89378p<EnumC84444c, Integer>>> f189631e;

    /* renamed from: f */
    public final C1213t<C20391d<List<InfoStickerEffect>>> f189632f;

    /* renamed from: g */
    public final C1213t<C20391d<List<InfoStickerEffect>>> f189633g;

    /* renamed from: h */
    private final RecommendListModel f189634h;

    /* renamed from: i */
    private final SearchStateViewModel f189635i;

    /* renamed from: j */
    private PersonalizedSearchListViewModel f189636j;

    /* renamed from: k */
    private SearchStateViewModel f189637k;

    /* renamed from: l */
    private boolean f189638l;

    /* renamed from: m */
    private final C1213t<String> f189639m;

    /* renamed from: n */
    private final AbstractC1214u<List<InfoStickerEffect>> f189640n;

    /* renamed from: o */
    private final AbstractC1214u<EnumC85026a> f189641o;

    /* renamed from: p */
    private final AbstractC1214u<EnumC85026a> f189642p;

    /* renamed from: q */
    private final AbstractC1214u<Object> f189643q;

    /* renamed from: r */
    private final AbstractC1214u<Map<InfoStickerEffect, C89378p<EnumC84444c, Integer>>> f189644r;

    /* renamed from: s */
    private final AbstractC1204m f189645s;

    static {
        Covode.recordClassIndex(98845);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: e */
    public final LiveData<Object> mo129562e() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$PersonalizedSearchListViewModel */
    static final class PersonalizedSearchListViewModel extends BaseInfoStickerListViewModel<InfoStickerEffect> implements AbstractC33974au {

        /* renamed from: d */
        public final C1213t<Object> f189646d;

        /* renamed from: e */
        public final C1213t<EnumC85026a> f189647e;

        /* renamed from: f */
        public final AbstractC89172b<InfoStickerEffect, Boolean> f189648f;

        /* renamed from: g */
        private AbstractC84451j<InfoStickerEffect, InfoStickerListModel> f189649g;

        /* renamed from: h */
        private final AbstractC84538f f189650h;

        /* renamed from: i */
        private final String f189651i;

        /* renamed from: j */
        private final String f189652j;

        /* renamed from: k */
        private final String f189653k;

        static {
            Covode.recordClassIndex(98846);
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
        /* renamed from: d */
        public final LiveData<EnumC85026a> mo129561d() {
            return this.f189647e;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
        /* renamed from: e */
        public final LiveData<Object> mo129562e() {
            return this.f189646d;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        /* renamed from: h */
        public final AbstractC88403ab<List<InfoStickerEffect>> mo129565h() {
            AbstractC84538f fVar = this.f189650h;
            String str = this.f189652j;
            if (str == null) {
                str = "";
            }
            String str2 = this.f189653k;
            if (str2 == null) {
                str2 = "";
            }
            AbstractC84451j<InfoStickerEffect, InfoStickerListModel> a = fVar.mo129485a(str, str2, this.f189651i);
            this.f189649g = a;
            AbstractC88403ab<R> c = a.mo129432a().mo142920b(new C84858a(this)).mo142925c(new C84859b(this));
            C89219l.m154716b(c, "");
            return c;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        /* renamed from: i */
        public final AbstractC88403ab<List<InfoStickerEffect>> mo129566i() {
            AbstractC88403ab<C89378p<List<InfoStickerEffect>, InfoStickerListModel>> a;
            AbstractC88403ab<C89378p<List<InfoStickerEffect>, InfoStickerListModel>> b;
            AbstractC88403ab<R> c;
            AbstractC84451j<InfoStickerEffect, InfoStickerListModel> jVar = this.f189649g;
            if (jVar != null && (a = jVar.mo129432a()) != null && (b = a.mo142920b(new C84860c(this))) != null && (c = b.mo142925c(C84861d.f189657a)) != null) {
                return c;
            }
            AbstractC88403ab<List<InfoStickerEffect>> a2 = AbstractC88403ab.m153603a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
            C89219l.m154716b(a2, "");
            return a2;
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$PersonalizedSearchListViewModel$d */
        static final class C84861d<T, R> implements AbstractC88434g<C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends InfoStickerEffect>> {

            /* renamed from: a */
            public static final C84861d f189657a = new C84861d();

            static {
                Covode.recordClassIndex(98850);
            }

            C84861d() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ List<? extends InfoStickerEffect> apply(C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar2 = pVar;
                C89219l.m154721d(pVar2, "");
                return pVar2.component1();
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$PersonalizedSearchListViewModel$a */
        static final class C84858a<T> implements AbstractC88433f<C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>> {

            /* renamed from: a */
            final /* synthetic */ PersonalizedSearchListViewModel f189654a;

            static {
                Covode.recordClassIndex(98847);
            }

            C84858a(PersonalizedSearchListViewModel personalizedSearchListViewModel) {
                this.f189654a = personalizedSearchListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                Boolean has_more;
                InfoStickerListModel infoStickerListModel = (InfoStickerListModel) pVar.component2();
                this.f189654a.f189646d.setValue(infoStickerListModel);
                if (infoStickerListModel != null && (has_more = infoStickerListModel.getHas_more()) != null && !has_more.booleanValue()) {
                    this.f189654a.f189647e.setValue(EnumC85026a.EMPTY);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$PersonalizedSearchListViewModel$b */
        static final class C84859b<T, R> implements AbstractC88434g<C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends InfoStickerEffect>> {

            /* renamed from: a */
            final /* synthetic */ PersonalizedSearchListViewModel f189655a;

            static {
                Covode.recordClassIndex(98848);
            }

            C84859b(PersonalizedSearchListViewModel personalizedSearchListViewModel) {
                this.f189655a = personalizedSearchListViewModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ List<? extends InfoStickerEffect> apply(C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar2 = pVar;
                C89219l.m154721d(pVar2, "");
                AbstractC89172b<InfoStickerEffect, Boolean> bVar = this.f189655a.f189648f;
                ArrayList arrayList = new ArrayList();
                for (T t : (List) pVar2.component1()) {
                    if (bVar.invoke(t).booleanValue()) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$PersonalizedSearchListViewModel$c */
        static final class C84860c<T> implements AbstractC88433f<C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>> {

            /* renamed from: a */
            final /* synthetic */ PersonalizedSearchListViewModel f189656a;

            static {
                Covode.recordClassIndex(98849);
            }

            C84860c(PersonalizedSearchListViewModel personalizedSearchListViewModel) {
                this.f189656a = personalizedSearchListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                Boolean has_more;
                InfoStickerListModel infoStickerListModel = (InfoStickerListModel) pVar.component2();
                this.f189656a.f189646d.setValue(infoStickerListModel);
                if (infoStickerListModel != null && (has_more = infoStickerListModel.getHas_more()) != null && !has_more.booleanValue()) {
                    this.f189656a.f189647e.setValue(EnumC85026a.EMPTY);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$RecommendListModel */
    static final class RecommendListModel extends BaseInfoStickerListViewModel<InfoStickerEffect> implements AbstractC33974au {

        /* renamed from: d */
        public final C1213t<Object> f189658d;

        /* renamed from: e */
        public final C1213t<EnumC85026a> f189659e;

        /* renamed from: f */
        private AbstractC84451j<InfoStickerEffect, InfoStickerListModel> f189660f;

        /* renamed from: g */
        private final AbstractC84538f f189661g;

        /* renamed from: h */
        private final String f189662h;

        /* renamed from: i */
        private final String f189663i;

        static {
            Covode.recordClassIndex(98851);
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
        /* renamed from: d */
        public final LiveData<EnumC85026a> mo129561d() {
            return this.f189659e;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
        /* renamed from: e */
        public final LiveData<Object> mo129562e() {
            return this.f189658d;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        /* renamed from: h */
        public final AbstractC88403ab<List<InfoStickerEffect>> mo129565h() {
            AbstractC84538f fVar = this.f189661g;
            String str = this.f189662h;
            if (str == null) {
                str = "";
            }
            String str2 = this.f189663i;
            if (str2 == null) {
                str2 = "";
            }
            AbstractC84451j<InfoStickerEffect, InfoStickerListModel> a = fVar.mo129484a(2, str, str2);
            this.f189660f = a;
            AbstractC88403ab<R> c = a.mo129432a().mo142920b(new C84862a(this)).mo142925c(C84863b.f189665a);
            C89219l.m154716b(c, "");
            return c;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        /* renamed from: i */
        public final AbstractC88403ab<List<InfoStickerEffect>> mo129566i() {
            AbstractC88403ab<C89378p<List<InfoStickerEffect>, InfoStickerListModel>> a;
            AbstractC88403ab<C89378p<List<InfoStickerEffect>, InfoStickerListModel>> b;
            AbstractC88403ab<R> c;
            AbstractC84451j<InfoStickerEffect, InfoStickerListModel> jVar = this.f189660f;
            if (jVar != null && (a = jVar.mo129432a()) != null && (b = a.mo142920b(new C84864c(this))) != null && (c = b.mo142925c(C84865d.f189667a)) != null) {
                return c;
            }
            AbstractC88403ab<List<InfoStickerEffect>> a2 = AbstractC88403ab.m153603a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
            C89219l.m154716b(a2, "");
            return a2;
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$RecommendListModel$b */
        static final class C84863b<T, R> implements AbstractC88434g<C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends InfoStickerEffect>> {

            /* renamed from: a */
            public static final C84863b f189665a = new C84863b();

            static {
                Covode.recordClassIndex(98853);
            }

            C84863b() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ List<? extends InfoStickerEffect> apply(C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar2 = pVar;
                C89219l.m154721d(pVar2, "");
                return pVar2.component1();
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$RecommendListModel$d */
        static final class C84865d<T, R> implements AbstractC88434g<C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends InfoStickerEffect>> {

            /* renamed from: a */
            public static final C84865d f189667a = new C84865d();

            static {
                Covode.recordClassIndex(98855);
            }

            C84865d() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ List<? extends InfoStickerEffect> apply(C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar2 = pVar;
                C89219l.m154721d(pVar2, "");
                return pVar2.component1();
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$RecommendListModel$a */
        static final class C84862a<T> implements AbstractC88433f<C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>> {

            /* renamed from: a */
            final /* synthetic */ RecommendListModel f189664a;

            static {
                Covode.recordClassIndex(98852);
            }

            C84862a(RecommendListModel recommendListModel) {
                this.f189664a = recommendListModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                Boolean has_more;
                InfoStickerListModel infoStickerListModel = (InfoStickerListModel) pVar.component2();
                this.f189664a.f189658d.setValue(infoStickerListModel);
                if (infoStickerListModel != null && (has_more = infoStickerListModel.getHas_more()) != null && !has_more.booleanValue()) {
                    this.f189664a.f189659e.setValue(EnumC85026a.EMPTY);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$RecommendListModel$c */
        static final class C84864c<T> implements AbstractC88433f<C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>> {

            /* renamed from: a */
            final /* synthetic */ RecommendListModel f189666a;

            static {
                Covode.recordClassIndex(98854);
            }

            C84864c(RecommendListModel recommendListModel) {
                this.f189666a = recommendListModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
                Boolean has_more;
                InfoStickerListModel infoStickerListModel = (InfoStickerListModel) pVar.component2();
                this.f189666a.f189658d.setValue(infoStickerListModel);
                if (infoStickerListModel != null && (has_more = infoStickerListModel.getHas_more()) != null && !has_more.booleanValue()) {
                    this.f189666a.f189659e.setValue(EnumC85026a.EMPTY);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84698i
    /* renamed from: a */
    public final LiveData<String> mo129620a() {
        return this.f189639m;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: b */
    public final LiveData<List<InfoStickerEffect>> mo129559b() {
        return this.f189628b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: c */
    public final LiveData<EnumC85026a> mo129560c() {
        return this.f189629c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: d */
    public final LiveData<EnumC85026a> mo129561d() {
        return this.f189630d;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84698i
    /* renamed from: h */
    public final LiveData<String> mo129621h() {
        return this.f189627a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: j */
    public final LiveData<Map<InfoStickerEffect, C89378p<EnumC84444c, Integer>>> mo129569j() {
        return this.f189631e;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: k */
    public final LiveData<C20391d<List<InfoStickerEffect>>> mo129570k() {
        return this.f189632f;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: l */
    public final LiveData<C20391d<List<InfoStickerEffect>>> mo129571l() {
        return this.f189633g;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: f */
    public final void mo129563f() {
        if (this.f189638l) {
            this.f189634h.mo129563f();
            return;
        }
        PersonalizedSearchListViewModel personalizedSearchListViewModel = this.f189636j;
        if (personalizedSearchListViewModel != null) {
            personalizedSearchListViewModel.mo129563f();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: g */
    public final void mo129564g() {
        if (this.f189638l) {
            this.f189634h.mo129564g();
            return;
        }
        PersonalizedSearchListViewModel personalizedSearchListViewModel = this.f189636j;
        if (personalizedSearchListViewModel != null) {
            personalizedSearchListViewModel.mo129564g();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84698i
    /* renamed from: i */
    public final void mo129622i() {
        String str;
        LiveData j;
        LiveData j2;
        this.f189638l = true;
        PersonalizedSearchListViewModel personalizedSearchListViewModel = this.f189636j;
        SearchStateViewModel searchStateViewModel = this.f189637k;
        if (personalizedSearchListViewModel != null) {
            LiveData b = personalizedSearchListViewModel.mo129559b();
            if (b != null) {
                b.removeObserver(this.f189640n);
            }
            LiveData<EnumC85026a> c = personalizedSearchListViewModel.mo129560c();
            if (c != null) {
                c.removeObserver(this.f189641o);
            }
            LiveData<EnumC85026a> d = personalizedSearchListViewModel.mo129561d();
            if (d != null) {
                d.removeObserver(this.f189642p);
            }
            LiveData<Object> e = personalizedSearchListViewModel.mo129562e();
            if (e != null) {
                e.removeObserver(this.f189643q);
            }
        }
        if (!(searchStateViewModel == null || (j2 = searchStateViewModel.mo129569j()) == null)) {
            j2.removeObserver(this.f189644r);
        }
        RecommendListModel recommendListModel = this.f189634h;
        SearchStateViewModel searchStateViewModel2 = this.f189635i;
        if (recommendListModel != null) {
            LiveData b2 = recommendListModel.mo129559b();
            if (b2 != null) {
                b2.observe(this.f189645s, this.f189640n);
            }
            LiveData<EnumC85026a> c2 = recommendListModel.mo129560c();
            if (c2 != null) {
                c2.observe(this.f189645s, this.f189641o);
            }
            LiveData<EnumC85026a> d2 = recommendListModel.mo129561d();
            if (d2 != null) {
                d2.observe(this.f189645s, this.f189642p);
            }
            LiveData<Object> e2 = recommendListModel.mo129562e();
            if (e2 != null) {
                e2.observe(this.f189645s, this.f189643q);
            }
        }
        if (!(searchStateViewModel2 == null || (j = searchStateViewModel2.mo129569j()) == null)) {
            j.observe(this.f189645s, this.f189644r);
        }
        C1213t<String> tVar = this.f189627a;
        Object value = this.f189634h.f189658d.getValue();
        if (!(value instanceof InfoStickerListModel)) {
            value = null;
        }
        InfoStickerListModel infoStickerListModel = (InfoStickerListModel) value;
        if (infoStickerListModel == null || (str = infoStickerListModel.getSubtitle()) == null) {
            str = "";
        }
        tVar.setValue(str);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: a */
    public final void mo129558a(AbstractC84456m mVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(mVar, "");
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$SearchStateViewModel */
    static final class SearchStateViewModel extends BaseInfoStickerStateViewModel<InfoStickerEffect> implements AbstractC33974au {

        /* renamed from: d */
        private final AbstractC84538f f189668d;

        static {
            Covode.recordClassIndex(98856);
        }

        @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* Return type fixed from 'f.a.t' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
        /* renamed from: b */
        public final /* synthetic */ AbstractC88979t<C20375am<InfoStickerEffect, EnumC84444c, Integer>> mo129568b(InfoStickerEffect infoStickerEffect) {
            InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
            C89219l.m154721d(infoStickerEffect2, "");
            AbstractC88979t<R> d = this.f189668d.mo129486a(infoStickerEffect2).mo143292d(C84866a.f189669a);
            C89219l.m154716b(d, "");
            return d;
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.InfoStickerSearchListViewModel$SearchStateViewModel$a */
        static final class C84866a<T, R> implements AbstractC88434g<C84541i, C20375am<InfoStickerEffect, EnumC84444c, Integer>> {

            /* renamed from: a */
            public static final C84866a f189669a = new C84866a();

            static {
                Covode.recordClassIndex(98857);
            }

            C84866a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ C20375am<InfoStickerEffect, EnumC84444c, Integer> apply(C84541i iVar) {
                EnumC84444c cVar;
                C84541i iVar2 = iVar;
                C89219l.m154721d(iVar2, "");
                InfoStickerEffect infoStickerEffect = iVar2.f188940a;
                int i = C84875c.f189692a[iVar2.f188941b.f188956a.ordinal()];
                if (i == 1) {
                    cVar = EnumC84444c.UNKNOWN;
                } else if (i == 2) {
                    cVar = EnumC84444c.DOWNLOADING;
                } else if (i == 3) {
                    cVar = EnumC84444c.NOT_DOWNLOAD;
                } else if (i == 4) {
                    cVar = EnumC84444c.DOWNLOAD_SUCCESS;
                } else if (i != 5) {
                    cVar = EnumC84444c.UNKNOWN;
                } else {
                    cVar = EnumC84444c.DOWNLOAD_FAILED;
                }
                return new C20375am(infoStickerEffect, cVar, iVar2.f188942c);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: a */
    public final /* synthetic */ void mo129567a(Object obj) {
        C89219l.m154721d(obj, "");
        if (this.f189638l) {
            this.f189635i.mo129567a(obj);
            return;
        }
        SearchStateViewModel searchStateViewModel = this.f189637k;
        if (searchStateViewModel != null) {
            searchStateViewModel.mo129567a(obj);
        }
    }
}
