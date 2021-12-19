package com.p2082ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.arch.C34496g;
import com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p2082ss.android.ugc.aweme.favorites.api.MixCollectionApi;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47437c;
import com.p2082ss.android.ugc.aweme.feed.model.MixStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel */
public final class MediaMixListViewModel extends JediBaseViewModel<MediaMixState> {

    /* renamed from: m */
    public static final C47746a f110668m = new C47746a((byte) 0);

    /* renamed from: a */
    public ArrayList<Long> f110669a;

    /* renamed from: b */
    public ArrayList<String> f110670b;

    /* renamed from: c */
    public int f110671c;

    /* renamed from: d */
    public String f110672d;

    /* renamed from: e */
    public String f110673e;

    /* renamed from: f */
    public final MixCollectionApi f110674f;

    /* renamed from: g */
    public final Set<String> f110675g = new LinkedHashSet();

    /* renamed from: k */
    public final List<String> f110676k = new ArrayList();

    /* renamed from: l */
    public final ListMiddleware<MediaMixState, MixStruct, C34496g> f110677l = new ListMiddleware<>(new C47747b(this), new C47752c(this), C47756d.f110687a, C47757e.f110688a);

    static {
        Covode.recordClassIndex(56368);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$a */
    public static final class C47746a {
        static {
            Covode.recordClassIndex(56369);
        }

        private C47746a() {
        }

        public /* synthetic */ C47746a(byte b) {
            this();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new MediaMixState(null, null, null, null, 15, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        this.f110677l.mo33809a(C47801c.f110750a, C47758f.f110689a);
        mo33684a(this.f110677l);
    }

    public MediaMixListViewModel() {
        String str = Api.f79771d;
        C89219l.m154716b(str, "");
        this.f110674f = (MixCollectionApi) C18097a.m33696a().mo28816a(str).mo28858a(MixCollectionApi.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$b */
    static final class C47747b extends AbstractC89220m implements AbstractC89172b<MediaMixState, AbstractC88979t<C89378p<? extends List<? extends MixStruct>, ? extends C34496g>>> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f110678a;

        /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$b$a */
        final /* synthetic */ class C47751a implements AbstractC88434g {

            /* renamed from: a */
            private final /* synthetic */ AbstractC89172b f110682a;

            static {
                Covode.recordClassIndex(56374);
            }

            C47751a(AbstractC89172b bVar) {
                this.f110682a = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                return this.f110682a.invoke(obj);
            }
        }

        static {
            Covode.recordClassIndex(56370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47747b(MediaMixListViewModel mediaMixListViewModel) {
            super(1);
            this.f110678a = mediaMixListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends MixStruct>, ? extends C34496g>> invoke(MediaMixState mediaMixState) {
            String str;
            AbstractC88979t<R> d;
            String str2;
            C89219l.m154721d(mediaMixState, "");
            if (this.f110678a.f110671c == 1) {
                MixCollectionApi mixCollectionApi = this.f110678a.f110674f;
                ArrayList<Long> arrayList = this.f110678a.f110669a;
                if (arrayList != null) {
                    str2 = arrayList.toString();
                } else {
                    str2 = null;
                }
                d = mixCollectionApi.getSearchMixCollection(str2).mo143292d(new C47751a(C47437c.m90459a(C477481.f110679a)));
            } else if (this.f110678a.f110671c == 2) {
                MixCollectionApi mixCollectionApi2 = this.f110678a.f110674f;
                String str3 = this.f110678a.f110672d;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = this.f110678a.f110673e;
                if (str4 == null) {
                    str4 = "";
                }
                d = mixCollectionApi2.getProfileVideoMixList(str3, str4, 15, 0).mo143292d(new C47751a(C47437c.m90459a(C477492.f110680a)));
            } else {
                MixCollectionApi mixCollectionApi3 = this.f110678a.f110674f;
                ArrayList<String> arrayList2 = this.f110678a.f110670b;
                if (arrayList2 == null || (str = arrayList2.toString()) == null) {
                    str = "";
                }
                C89219l.m154716b(str, "");
                d = mixCollectionApi3.getMixCollection(15, 0, str).mo143292d(new C47751a(C47437c.m90459a(C477503.f110681a)));
            }
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$c */
    static final class C47752c extends AbstractC89220m implements AbstractC89172b<MediaMixState, AbstractC88979t<C89378p<? extends List<? extends MixStruct>, ? extends C34496g>>> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f110683a;

        static {
            Covode.recordClassIndex(56375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47752c(MediaMixListViewModel mediaMixListViewModel) {
            super(1);
            this.f110683a = mediaMixListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends MixStruct>, ? extends C34496g>> invoke(MediaMixState mediaMixState) {
            AbstractC88979t<R> d;
            String str;
            MediaMixState mediaMixState2 = mediaMixState;
            C89219l.m154721d(mediaMixState2, "");
            if (this.f110683a.f110671c == 1) {
                MixCollectionApi mixCollectionApi = this.f110683a.f110674f;
                ArrayList<Long> arrayList = this.f110683a.f110669a;
                if (arrayList != null) {
                    str = arrayList.toString();
                } else {
                    str = null;
                }
                d = mixCollectionApi.getSearchMixCollection(str).mo143292d(new C47747b.C47751a(C47437c.m90459a(C477531.f110684a)));
            } else if (this.f110683a.f110671c == 2) {
                MixCollectionApi mixCollectionApi2 = this.f110683a.f110674f;
                String str2 = this.f110683a.f110672d;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = this.f110683a.f110673e;
                if (str3 == null) {
                    str3 = "";
                }
                d = mixCollectionApi2.getProfileVideoMixList(str2, str3, 15, mediaMixState2.getListState().getPayload().f81481c).mo143292d(new C47747b.C47751a(C47437c.m90459a(C477542.f110685a)));
            } else {
                d = this.f110683a.f110674f.getMixCollection(15, mediaMixState2.getListState().getPayload().f81481c, "").mo143292d(new C47747b.C47751a(C47437c.m90459a(C477553.f110686a)));
            }
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$f */
    static final class C47758f extends AbstractC89220m implements AbstractC89183m<MediaMixState, ListState<MixStruct, C34496g>, MediaMixState> {

        /* renamed from: a */
        public static final C47758f f110689a = new C47758f();

        static {
            Covode.recordClassIndex(56381);
        }

        C47758f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ MediaMixState invoke(MediaMixState mediaMixState, ListState<MixStruct, C34496g> listState) {
            MediaMixState mediaMixState2 = mediaMixState;
            ListState<MixStruct, C34496g> listState2 = listState;
            C89219l.m154721d(mediaMixState2, "");
            C89219l.m154721d(listState2, "");
            return MediaMixState.copy$default(mediaMixState2, null, null, null, listState2, 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$d */
    static final class C47756d extends AbstractC89220m implements AbstractC89183m<List<? extends MixStruct>, List<? extends MixStruct>, List<? extends MixStruct>> {

        /* renamed from: a */
        public static final C47756d f110687a = new C47756d();

        static {
            Covode.recordClassIndex(56379);
        }

        C47756d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ List<? extends MixStruct> invoke(List<? extends MixStruct> list, List<? extends MixStruct> list2) {
            List<? extends MixStruct> list3 = list2;
            C89219l.m154721d(list, "");
            C89219l.m154721d(list3, "");
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t : list3) {
                if (hashSet.add(t.mixId)) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$e */
    static final class C47757e extends AbstractC89220m implements AbstractC89183m<List<? extends MixStruct>, List<? extends MixStruct>, List<? extends MixStruct>> {

        /* renamed from: a */
        public static final C47757e f110688a = new C47757e();

        static {
            Covode.recordClassIndex(56380);
        }

        C47757e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ List<? extends MixStruct> invoke(List<? extends MixStruct> list, List<? extends MixStruct> list2) {
            List<? extends MixStruct> list3 = list;
            List<? extends MixStruct> list4 = list2;
            C89219l.m154721d(list3, "");
            C89219l.m154721d(list4, "");
            List d = C89070n.m154572d((Collection) list3, (Iterable) list4);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : d) {
                if (hashSet.add(((MixStruct) obj).mixId)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }
}
