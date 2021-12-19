package com.p2082ss.android.ugc.aweme.mix.videodetail;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.widget.C23669c;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailLoadStateManager;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59858e;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59859f;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59860g;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59412a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.videodetail.k */
public final class C59969k implements AbstractC41262aa, AbstractC41262aa.AbstractC41263a {

    /* renamed from: a */
    private ActivityC0945e f136560a;

    /* renamed from: b */
    private AbstractC20527q f136561b;

    /* renamed from: c */
    private boolean f136562c;

    /* renamed from: d */
    private final MixVideosViewModel f136563d;

    static {
        Covode.recordClassIndex(70388);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean deleteItem(String str) {
        C89219l.m154721d(str, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final int getPageType(int i) {
        return 19;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.k$c */
    static final class C59972c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C59972c f136566a = new C59972c();

        static {
            Covode.recordClassIndex(70391);
        }

        C59972c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final Object getViewModel() {
        return this.f136563d;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        return this.f136562c;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadLatest() {
        if (!this.f136563d.f136234p) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadMore() {
        if (!this.f136563d.f136235q) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.k$b */
    static final class C59971b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        public static final C59971b f136565a = new C59971b();

        static {
            Covode.recordClassIndex(70390);
        }

        C59971b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            return C89391z.f203057a;
        }
    }

    public C59969k(MixVideosViewModel mixVideosViewModel) {
        C89219l.m154721d(mixVideosViewModel, "");
        this.f136563d = mixVideosViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.k$a */
    static final class C59970a extends AbstractC89220m implements AbstractC89172b<C59858e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC41267ad f136564a;

        static {
            Covode.recordClassIndex(70389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59970a(AbstractC41267ad adVar) {
            super(1);
            this.f136564a = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59858e eVar) {
            C59858e eVar2 = eVar;
            if (eVar2 != null) {
                Integer num = eVar2.f136342a;
                int i = C59859f.f136345a;
                if (num != null && num.intValue() == i) {
                    this.f136564a.mo59512a(eVar2.f136343b, eVar2.f136344c);
                } else {
                    int i2 = C59859f.f136346b;
                    if (num != null && num.intValue() == i2) {
                        this.f136564a.mo59517b(eVar2.f136343b, eVar2.f136344c);
                    } else {
                        int i3 = C59859f.f136347c;
                        if (num != null && num.intValue() == i3) {
                            this.f136564a.mo59523c(eVar2.f136343b, eVar2.f136344c);
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        String aid;
        String str = "";
        C89219l.m154721d(adVar, str);
        if ((C59412a.m109111a() == 1 || C59412a.m109111a() == 2) && this.f136560a != null) {
            Aweme aweme = this.f136563d.f136232n;
            if (!(aweme == null || (aid = aweme.getAid()) == null)) {
                str = aid;
            }
            Aweme b = AwemeService.m70060b().mo60684b(str);
            ArrayList arrayList = new ArrayList();
            if (b != null) {
                arrayList.add(b);
            }
            adVar.mo59512a((List) arrayList, true);
            C18285c.m34006b("playlist_first_render_cost_time");
        }
        AssemViewModel.m23030a(this.f136563d, C59973l.f136567a, null, C59971b.f136565a, C59972c.f136566a, new C59970a(adVar), 2);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        if (this.f136563d == null) {
            return false;
        }
        ActivityC0945e activity = fragment.getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        this.f136560a = activity;
        if (activity != null) {
            DetailLoadStateManager.C41342a.m83213a(activity).f96502a.setValue(Boolean.valueOf(this.f136563d.f136234p));
        }
        this.f136561b = new JediWidget();
        C23669c a = C23669c.C23671a.m44763a(fragment, fragment.getView());
        AbstractC20527q qVar = this.f136561b;
        if (qVar == null) {
            C89219l.m154710a("jediView");
        }
        Objects.requireNonNull(qVar, "null cannot be cast to non-null type com.bytedance.widget.Widget");
        a.mo39102a((Widget) qVar);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        MixVideosViewModel mixVideosViewModel;
        C89219l.m154721d(bVar, "");
        if (i == 1) {
            MixVideosViewModel mixVideosViewModel2 = this.f136563d;
            if (mixVideosViewModel2 != null) {
                String uid = bVar.getUid();
                C89219l.m154716b(uid, "");
                String secUid = bVar.getSecUid();
                C89219l.m154716b(secUid, "");
                mixVideosViewModel2.mo97234a(uid, secUid);
            }
        } else if (i == 2) {
            MixVideosViewModel mixVideosViewModel3 = this.f136563d;
            String uid2 = bVar.getUid();
            C89219l.m154716b(uid2, "");
            String secUid2 = bVar.getSecUid();
            C89219l.m154716b(secUid2, "");
            C89219l.m154721d(uid2, "");
            C89219l.m154721d(secUid2, "");
            int i3 = C59860g.f136350b;
            MixFeedApi.C59385a.m109095a().getMixVideos2(mixVideosViewModel3.f136230l, "", mixVideosViewModel3.f136236r, i3, mixVideosViewModel3.mo97240k(), mixVideosViewModel3.mo97241l()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new MixVideosViewModel.C59809c(mixVideosViewModel3, i3), MixVideosViewModel.C59812d.f136261a);
        } else if (i == 4 && (mixVideosViewModel = this.f136563d) != null) {
            String uid3 = bVar.getUid();
            C89219l.m154716b(uid3, "");
            String secUid3 = bVar.getSecUid();
            C89219l.m154716b(secUid3, "");
            mixVideosViewModel.mo97237b(uid3, secUid3);
        }
    }
}
