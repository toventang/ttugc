package com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import android.os.SystemClock;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59398d;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59399e;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.C59632b;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.C59774b;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import com.p2082ss.android.ugc.aweme.network.p3503a.C61482f;
import com.p2082ss.android.ugc.aweme.utils.C80454fs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel */
public final class MixVideosViewModel extends AssemViewModel<C59857d> {

    /* renamed from: j */
    public final String f136228j = "PLAYLIST_VIDEO_LIST";

    /* renamed from: k */
    public final String f136229k = "PLAYLIST_DETAIL";

    /* renamed from: l */
    public String f136230l = "";

    /* renamed from: m */
    public String f136231m = "";

    /* renamed from: n */
    public Aweme f136232n;

    /* renamed from: o */
    public Aweme f136233o;

    /* renamed from: p */
    public boolean f136234p;

    /* renamed from: q */
    public boolean f136235q;

    /* renamed from: r */
    public long f136236r;

    /* renamed from: s */
    public long f136237s;

    /* renamed from: t */
    public String f136238t = "";

    /* renamed from: u */
    public String f136239u = "";

    /* renamed from: v */
    public String f136240v = "";

    /* renamed from: w */
    public String f136241w = "";

    /* renamed from: x */
    public long f136242x = -1;

    /* renamed from: y */
    private final AbstractC89244h f136243y = C12646c.m22777a(this, C59839q.f136308a);

    /* renamed from: z */
    private final AbstractC89244h f136244z = C89250i.m154773a((AbstractC89171a) new C59807b(this));

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$d */
    public static final class C59812d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C59812d f136261a = new C59812d();

        static {
            Covode.recordClassIndex(70217);
        }

        C59812d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$e */
    static final class C59813e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C59813e f136262a = new C59813e();

        static {
            Covode.recordClassIndex(70218);
        }

        C59813e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$i */
    static final class C59821i<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C59821i f136278a = new C59821i();

        static {
            Covode.recordClassIndex(70226);
        }

        C59821i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$m */
    static final class C59831m<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C59831m f136296a = new C59831m();

        static {
            Covode.recordClassIndex(70236);
        }

        C59831m() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$u */
    public static final class C59843u<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C59843u f136312a = new C59843u();

        static {
            Covode.recordClassIndex(70248);
        }

        C59843u() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$w */
    public static final class C59848w<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C59848w f136318a = new C59848w();

        static {
            Covode.recordClassIndex(70253);
        }

        C59848w() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(70205);
    }

    /* renamed from: g */
    public final AbstractC17692b<Long> mo23342g() {
        return (AbstractC17692b) this.f136244z.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$q */
    static final class C59839q extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC59856c>> {

        /* renamed from: a */
        public static final C59839q f136308a = new C59839q();

        static {
            Covode.recordClassIndex(70244);
        }

        C59839q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12644a<AbstractC59856c> invoke() {
            return new C59854b();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C59857d mo20674f() {
        return new C59857d();
    }

    /* renamed from: j */
    public final List<Aweme> mo97239j() {
        return ((C59857d) mo20671d().mo20680a()).f136333a;
    }

    /* renamed from: l */
    public final String mo97241l() {
        String str;
        if (this.f136232n == null || (str = this.f136240v) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: k */
    public final String mo97240k() {
        Aweme aweme = this.f136232n;
        if (aweme != null) {
            String authorUid = aweme.getAuthorUid();
            if (authorUid == null) {
                return "";
            }
            return authorUid;
        }
        String str = this.f136239u;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    public final void mo97242m() {
        mo20670c(C59801a.f136245a);
        this.f136240v = "";
        this.f136239u = "";
        this.f136232n = null;
        this.f136235q = false;
        this.f136234p = false;
        this.f136237s = 0;
        this.f136236r = 0;
        this.f136231m = "";
        this.f136230l = "";
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$b */
    static final class C59807b extends AbstractC89220m implements AbstractC89171a<C598081> {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136253a;

        static {
            Covode.recordClassIndex(70212);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59807b(MixVideosViewModel mixVideosViewModel) {
            super(0);
            this.f136253a = mixVideosViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C598081 invoke() {
            C17693c cVar = new C17693c();
            cVar.f42320b = false;
            cVar.f42319a = 4;
            if (C59632b.m109217a()) {
                cVar.f42327i = "mix_video_dialog_v2";
                cVar.f42322d = true;
                cVar.f42323e = true;
                cVar.f42326h = new OptimizeAbility(true, 16);
            }
            return new AbstractC17692b<Long>(this, cVar) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59807b.C598081 */

                /* renamed from: a */
                final /* synthetic */ C59807b f136254a;

                static {
                    Covode.recordClassIndex(70213);
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final void mo23345a(AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
                    Long l;
                    C89219l.m154721d(dVar, "");
                    MixVideosViewModel mixVideosViewModel = this.f136254a.f136253a;
                    C89219l.m154721d(dVar, "");
                    C89233z.C89236c cVar = new C89233z.C89236c();
                    cVar.element = C59860g.f136349a;
                    if (!C13627m.m24498a(mixVideosViewModel.f136231m)) {
                        cVar.element = C59860g.f136352d;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    mixVideosViewModel.mo97238i();
                    List<Aweme> list = ((C59857d) mixVideosViewModel.mo20671d().mo20680a()).f136333a;
                    if (list == null) {
                        MixFeedApi.C59385a.m109095a().getMixVideos2(mixVideosViewModel.f136230l, mixVideosViewModel.f136231m, 0, cVar.element, mixVideosViewModel.mo97240k(), mixVideosViewModel.mo97241l()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C59832n(mixVideosViewModel, cVar, dVar, elapsedRealtime), new C59837o(dVar));
                    } else if (list.isEmpty()) {
                        dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE)));
                    } else {
                        if (mixVideosViewModel.f136235q || mixVideosViewModel.f136234p) {
                            Long l2 = null;
                            if (mixVideosViewModel.f136235q) {
                                l = Long.valueOf(mixVideosViewModel.f136237s);
                            } else {
                                l = null;
                            }
                            if (mixVideosViewModel.f136234p) {
                                l2 = Long.valueOf(mixVideosViewModel.f136236r);
                            }
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C59774b(it.next()));
                            }
                            dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32840a(l2, l, arrayList)));
                        } else {
                            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new C59774b(it2.next()));
                            }
                            dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                        }
                        if (mixVideosViewModel.f136233o != null) {
                            mixVideosViewModel.mo97231a(mixVideosViewModel.f136233o);
                        }
                    }
                }

                {
                    this.f136254a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final /* synthetic */ void mo23346a(AbstractC89124d dVar, Object obj) {
                    ((Number) obj).longValue();
                    C89219l.m154721d(dVar, "");
                    MixVideosViewModel mixVideosViewModel = this.f136254a.f136253a;
                    C89219l.m154721d(dVar, "");
                    int i = C59860g.f136350b;
                    MixFeedApi.C59385a.m109095a().getMixVideos2(mixVideosViewModel.f136230l, "", mixVideosViewModel.f136236r, i, mixVideosViewModel.mo97240k(), mixVideosViewModel.mo97241l()).mo143264a(C59813e.f136262a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C59814f(mixVideosViewModel, i, dVar), new C59817g(dVar));
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: b */
                public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                    ((Number) obj).longValue();
                    C89219l.m154721d(dVar, "");
                    MixVideosViewModel mixVideosViewModel = this.f136254a.f136253a;
                    C89219l.m154721d(dVar, "");
                    int i = C59860g.f136351c;
                    MixFeedApi.C59385a.m109095a().getMixVideos2(mixVideosViewModel.f136230l, "", mixVideosViewModel.f136237s, i, mixVideosViewModel.mo97240k(), mixVideosViewModel.mo97241l()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C59822j(mixVideosViewModel, i, dVar), new C59825k(dVar));
                }
            };
        }
    }

    /* renamed from: h */
    public final void mo23343h() {
        C89219l.m154716b(MixFeedApi.C59385a.m109095a().manageMixFeed(MixFeedApi.EnumC59386b.MIXDELETE.getOperation(), this.f136230l, null, null, null, "").mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C59841s(this), new C59842t(this)), "");
    }

    /* renamed from: i */
    public final void mo97238i() {
        C89219l.m154716b(MixFeedApi.C59385a.m109095a().getMixDetail(mo97240k(), mo97241l(), this.f136230l).mo142924c(C59843u.f136312a).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C59844v(this, SystemClock.elapsedRealtime()), C59848w.f136318a), "");
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$t */
    static final class C59842t<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136311a;

        static {
            Covode.recordClassIndex(70247);
        }

        C59842t(MixVideosViewModel mixVideosViewModel) {
            this.f136311a = mixVideosViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f136311a.mo97235a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$c */
    public static final class C59809c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136255a;

        /* renamed from: b */
        final /* synthetic */ int f136256b;

        static {
            Covode.recordClassIndex(70214);
        }

        public C59809c(MixVideosViewModel mixVideosViewModel, int i) {
            this.f136255a = mixVideosViewModel;
            this.f136256b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C59399e eVar = (C59399e) obj;
            this.f136255a.mo20667b(new AbstractC89172b<C59857d, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59809c.C598101 */

                /* renamed from: a */
                final /* synthetic */ C59809c f136257a;

                static {
                    Covode.recordClassIndex(70215);
                }

                {
                    this.f136257a = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$c$1$a */
                static final class C59811a extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

                    /* renamed from: a */
                    final /* synthetic */ C598101 f136259a;

                    /* renamed from: b */
                    final /* synthetic */ List f136260b;

                    static {
                        Covode.recordClassIndex(70216);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C59811a(C598101 r2, List list) {
                        super(1);
                        this.f136259a = r2;
                        this.f136260b = list;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C59857d invoke(C59857d dVar) {
                        C59857d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        return C59857d.m109313a(dVar2, MixVideosViewModel.m109289a(this.f136260b, dVar2.f136333a), null, null, this.f136259a.f136257a.f136256b, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C59857d dVar) {
                    C89219l.m154721d(dVar, "");
                    List<? extends Aweme> list = eVar.f135686a;
                    this.f136257a.f136255a.f136236r = eVar.f135689e;
                    this.f136257a.f136255a.f136234p = eVar.f135687b;
                    if (list != null) {
                        this.f136257a.f136255a.mo20662a(new C59811a(this, list));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$f */
    static final class C59814f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136263a;

        /* renamed from: b */
        final /* synthetic */ int f136264b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89124d f136265c;

        static {
            Covode.recordClassIndex(70219);
        }

        C59814f(MixVideosViewModel mixVideosViewModel, int i, AbstractC89124d dVar) {
            this.f136263a = mixVideosViewModel;
            this.f136264b = i;
            this.f136265c = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C59399e eVar = (C59399e) obj;
            this.f136263a.mo20667b(new AbstractC89172b<C59857d, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59814f.C598151 */

                /* renamed from: a */
                final /* synthetic */ C59814f f136266a;

                static {
                    Covode.recordClassIndex(70220);
                }

                {
                    this.f136266a = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$f$1$a */
                static final class C59816a extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

                    /* renamed from: a */
                    final /* synthetic */ C598151 f136268a;

                    /* renamed from: b */
                    final /* synthetic */ List f136269b;

                    /* renamed from: c */
                    final /* synthetic */ List f136270c;

                    static {
                        Covode.recordClassIndex(70221);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C59816a(C598151 r2, List list, List list2) {
                        super(1);
                        this.f136268a = r2;
                        this.f136269b = list;
                        this.f136270c = list2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C59857d invoke(C59857d dVar) {
                        ArrayList arrayList;
                        C59857d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        List<Aweme> list = dVar2.f136333a;
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(it.next().getAid());
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = C89086z.INSTANCE;
                        }
                        List list2 = this.f136269b;
                        List list3 = this.f136270c;
                        ArrayList arrayList3 = new ArrayList();
                        for (T t : list3) {
                            if (!arrayList.contains(t.getAid())) {
                                arrayList3.add(t);
                            }
                        }
                        list2.addAll(arrayList3);
                        return C59857d.m109313a(dVar2, MixVideosViewModel.m109289a(this.f136269b, dVar2.f136333a), null, null, this.f136268a.f136266a.f136264b, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C59857d dVar) {
                    C89219l.m154721d(dVar, "");
                    List<? extends Aweme> list = eVar.f135686a;
                    ArrayList<T> arrayList = new ArrayList();
                    this.f136266a.f136263a.f136236r = eVar.f135689e;
                    this.f136266a.f136263a.f136234p = eVar.f135687b;
                    if (list != null) {
                        this.f136266a.f136263a.mo20662a(new C59816a(this, arrayList, list));
                    }
                    if (this.f136266a.f136263a.f136234p) {
                        AbstractC89124d dVar2 = this.f136266a.f136265c;
                        Long valueOf = Long.valueOf(eVar.f135689e);
                        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
                        for (T t : arrayList) {
                            arrayList2.add(new C59774b(t));
                        }
                        dVar2.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(valueOf, null, arrayList2, 2)));
                    } else {
                        AbstractC89124d dVar3 = this.f136266a.f136265c;
                        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
                        for (T t2 : arrayList) {
                            arrayList3.add(new C59774b(t2));
                        }
                        dVar3.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList3)));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$h */
    static final class C59818h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136272a;

        /* renamed from: b */
        final /* synthetic */ int f136273b;

        static {
            Covode.recordClassIndex(70223);
        }

        C59818h(MixVideosViewModel mixVideosViewModel, int i) {
            this.f136272a = mixVideosViewModel;
            this.f136273b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C59399e eVar = (C59399e) obj;
            this.f136272a.mo20667b(new AbstractC89172b<C59857d, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59818h.C598191 */

                /* renamed from: a */
                final /* synthetic */ C59818h f136274a;

                static {
                    Covode.recordClassIndex(70224);
                }

                {
                    this.f136274a = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$h$1$a */
                static final class C59820a extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

                    /* renamed from: a */
                    final /* synthetic */ C598191 f136276a;

                    /* renamed from: b */
                    final /* synthetic */ List f136277b;

                    static {
                        Covode.recordClassIndex(70225);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C59820a(C598191 r2, List list) {
                        super(1);
                        this.f136276a = r2;
                        this.f136277b = list;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C59857d invoke(C59857d dVar) {
                        C59857d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        return C59857d.m109313a(dVar2, MixVideosViewModel.m109289a(dVar2.f136333a, this.f136277b), null, null, this.f136276a.f136274a.f136273b, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C59857d dVar) {
                    C89219l.m154721d(dVar, "");
                    List<? extends Aweme> list = eVar.f135686a;
                    this.f136274a.f136272a.f136237s = eVar.f135688c;
                    this.f136274a.f136272a.f136235q = eVar.f135687b;
                    if (list != null) {
                        this.f136274a.f136272a.mo20662a(new C59820a(this, list));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$j */
    static final class C59822j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136279a;

        /* renamed from: b */
        final /* synthetic */ int f136280b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89124d f136281c;

        static {
            Covode.recordClassIndex(70227);
        }

        C59822j(MixVideosViewModel mixVideosViewModel, int i, AbstractC89124d dVar) {
            this.f136279a = mixVideosViewModel;
            this.f136280b = i;
            this.f136281c = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C59399e eVar = (C59399e) obj;
            this.f136279a.mo20667b(new AbstractC89172b<C59857d, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59822j.C598231 */

                /* renamed from: a */
                final /* synthetic */ C59822j f136282a;

                static {
                    Covode.recordClassIndex(70228);
                }

                {
                    this.f136282a = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$j$1$a */
                static final class C59824a extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

                    /* renamed from: a */
                    final /* synthetic */ C598231 f136284a;

                    /* renamed from: b */
                    final /* synthetic */ List f136285b;

                    static {
                        Covode.recordClassIndex(70229);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C59824a(C598231 r2, List list) {
                        super(1);
                        this.f136284a = r2;
                        this.f136285b = list;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C59857d invoke(C59857d dVar) {
                        C59857d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        return C59857d.m109313a(dVar2, MixVideosViewModel.m109289a(dVar2.f136333a, this.f136285b), null, null, this.f136284a.f136282a.f136280b, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C59857d dVar) {
                    C89219l.m154721d(dVar, "");
                    List<? extends Aweme> list = eVar.f135686a;
                    this.f136282a.f136279a.f136237s = eVar.f135688c;
                    this.f136282a.f136279a.f136235q = eVar.f135687b;
                    if (list != null) {
                        this.f136282a.f136279a.mo20662a(new C59824a(this, list));
                    }
                    List<? extends Aweme> list2 = eVar.f135686a;
                    if (this.f136282a.f136279a.f136235q) {
                        if (list2 != null) {
                            AbstractC89124d dVar2 = this.f136282a.f136281c;
                            Long valueOf = Long.valueOf(eVar.f135688c);
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C59774b(it.next()));
                            }
                            dVar2.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, valueOf, arrayList, 1)));
                        }
                    } else if (list2 != null) {
                        AbstractC89124d dVar3 = this.f136282a.f136281c;
                        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new C59774b(it2.next()));
                        }
                        dVar3.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$s */
    static final class C59841s<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136310a;

        static {
            Covode.recordClassIndex(70246);
        }

        C59841s(MixVideosViewModel mixVideosViewModel) {
            this.f136310a = mixVideosViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (((C59396b) obj).status_code == 0) {
                this.f136310a.mo97235a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$v */
    public static final class C59844v<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136313a;

        /* renamed from: b */
        final /* synthetic */ long f136314b;

        static {
            Covode.recordClassIndex(70249);
        }

        C59844v(MixVideosViewModel mixVideosViewModel, long j) {
            this.f136313a = mixVideosViewModel;
            this.f136314b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C59398d dVar = (C59398d) obj;
            this.f136313a.mo20667b(new AbstractC89172b<C59857d, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59844v.C598451 */

                /* renamed from: a */
                final /* synthetic */ C59844v f136315a;

                static {
                    Covode.recordClassIndex(70250);
                }

                {
                    this.f136315a = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$v$1$a */
                static final class C59847a extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

                    /* renamed from: a */
                    final /* synthetic */ C59867d f136317a;

                    static {
                        Covode.recordClassIndex(70252);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C59847a(C59867d dVar) {
                        super(1);
                        this.f136317a = dVar;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C59857d invoke(C59857d dVar) {
                        C59857d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        return C59857d.m109313a(dVar2, null, null, null, 0, false, 0, this.f136317a, null, null, 447);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C59857d dVar) {
                    C89219l.m154721d(dVar, "");
                    C59867d dVar2 = dVar.f135684a;
                    if (dVar2 != null) {
                        this.f136315a.f136313a.mo20662a(new C59847a(dVar2));
                    }
                    if (this.f136315a.f136313a.f136242x > 0) {
                        C80454fs.m139461a(this.f136315a.f136313a.f136241w, this.f136315a.f136313a.f136229k, this.f136315a.f136313a.f136242x, this.f136315a.f136314b, SystemClock.elapsedRealtime(), C61482f.m111327a(), new C80454fs.AbstractC80455a() {
                            /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59844v.C598451.C598461 */

                            static {
                                Covode.recordClassIndex(70251);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.utils.C80454fs.AbstractC80455a
                            /* renamed from: a */
                            public final void mo62626a(String str, Map<String, String> map) {
                                C89219l.m154721d(str, "");
                                C89219l.m154721d(map, "");
                                C39162r.m79460a(str, map);
                            }
                        });
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$y */
    public static final class C59850y extends AbstractC89220m implements AbstractC89172b<C59857d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136321a;

        static {
            Covode.recordClassIndex(70255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59850y(MixVideosViewModel mixVideosViewModel) {
            super(1);
            this.f136321a = mixVideosViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59857d dVar) {
            C89219l.m154721d(dVar, "");
            this.f136321a.mo20662a(C598511.f136322a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$a */
    static final class C59801a extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

        /* renamed from: a */
        public static final C59801a f136245a = new C59801a();

        static {
            Covode.recordClassIndex(70206);
        }

        C59801a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59857d invoke(C59857d dVar) {
            C59857d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C59857d.m109313a(dVar2, null, null, null, 0, false, 0, null, null, null, 436);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$aa */
    public static final class C59802aa extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

        /* renamed from: a */
        final /* synthetic */ C59867d f136246a;

        static {
            Covode.recordClassIndex(70207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59802aa(C59867d dVar) {
            super(1);
            this.f136246a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59857d invoke(C59857d dVar) {
            C59857d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C59857d.m109313a(dVar2, null, null, null, 0, false, 0, this.f136246a, null, null, 447);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$ac */
    static final class C59804ac extends AbstractC89220m implements AbstractC89172b<C59857d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136249a;

        /* renamed from: b */
        final /* synthetic */ C59858e f136250b;

        static {
            Covode.recordClassIndex(70209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59804ac(MixVideosViewModel mixVideosViewModel, C59858e eVar) {
            super(1);
            this.f136249a = mixVideosViewModel;
            this.f136250b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59857d dVar) {
            C89219l.m154721d(dVar, "");
            this.f136249a.mo20662a(new AbstractC89172b<C59857d, C59857d>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59804ac.C598051 */

                /* renamed from: a */
                final /* synthetic */ C59804ac f136251a;

                static {
                    Covode.recordClassIndex(70210);
                }

                {
                    this.f136251a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C59857d invoke(C59857d dVar) {
                    C59857d dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    return C59857d.m109313a(dVar2, null, null, null, 0, false, 0, null, new C12792n(this.f136251a.f136250b), null, 383);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$ad */
    public static final class C59806ad extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

        /* renamed from: a */
        public static final C59806ad f136252a = new C59806ad();

        static {
            Covode.recordClassIndex(70211);
        }

        C59806ad() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59857d invoke(C59857d dVar) {
            C59857d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C59857d.m109313a(dVar2, null, null, null, 0, true, 0, null, null, null, 495);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$g */
    static final class C59817g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f136271a;

        static {
            Covode.recordClassIndex(70222);
        }

        C59817g(AbstractC89124d dVar) {
            this.f136271a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f136271a.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(((Throwable) obj).getMessage()))));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$k */
    static final class C59825k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f136286a;

        static {
            Covode.recordClassIndex(70230);
        }

        C59825k(AbstractC89124d dVar) {
            this.f136286a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f136286a.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(((Throwable) obj).getMessage()))));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$o */
    static final class C59837o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f136306a;

        static {
            Covode.recordClassIndex(70242);
        }

        C59837o(AbstractC89124d dVar) {
            this.f136306a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f136306a.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(((Throwable) obj).getMessage()))));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$p */
    public static final class C59838p extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

        /* renamed from: a */
        public static final C59838p f136307a = new C59838p();

        static {
            Covode.recordClassIndex(70243);
        }

        C59838p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59857d invoke(C59857d dVar) {
            C59857d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C59857d.m109313a(dVar2, null, null, null, 0, false, 0, null, null, null, 495);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$x */
    public static final class C59849x extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136319a;

        /* renamed from: b */
        final /* synthetic */ Aweme f136320b;

        static {
            Covode.recordClassIndex(70254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59849x(MixVideosViewModel mixVideosViewModel, Aweme aweme) {
            super(1);
            this.f136319a = mixVideosViewModel;
            this.f136320b = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59857d invoke(C59857d dVar) {
            C59857d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C59857d.m109313a(dVar2, null, new C12776a(this.f136320b), null, 0, false, 0, null, null, null, 509);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$z */
    public static final class C59852z extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136323a;

        /* renamed from: b */
        final /* synthetic */ Aweme f136324b;

        static {
            Covode.recordClassIndex(70257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59852z(MixVideosViewModel mixVideosViewModel, Aweme aweme) {
            super(1);
            this.f136323a = mixVideosViewModel;
            this.f136324b = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59857d invoke(C59857d dVar) {
            C59857d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C59857d.m109313a(dVar2, null, new C12776a(this.f136324b), null, 0, false, 0, null, null, null, 509);
        }
    }

    /* renamed from: a */
    public final void mo97231a(Aweme aweme) {
        if (aweme != null) {
            mo20662a(new C59852z(this, aweme));
        }
    }

    /* renamed from: b */
    public final int mo97236b(Aweme aweme) {
        int a;
        C89219l.m154721d(aweme, "");
        List<Aweme> list = ((C59857d) mo20671d().mo20680a()).f136333a;
        if (list == null || (a = m109288a(list, aweme)) < 0) {
            return -1;
        }
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$ab */
    public static final class C59803ab extends AbstractC89220m implements AbstractC89172b<C59857d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f136247a;

        /* renamed from: b */
        final /* synthetic */ String f136248b;

        static {
            Covode.recordClassIndex(70208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59803ab(String str, String str2) {
            super(1);
            this.f136247a = str;
            this.f136248b = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59857d dVar) {
            String str;
            PlayListInfo playListInfo;
            C59857d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            List<Aweme> list = dVar2.f136333a;
            if (list != null) {
                for (Aweme aweme : list) {
                    PlayListInfo playListInfo2 = aweme.playlist_info;
                    if (playListInfo2 != null) {
                        str = playListInfo2.getMixId();
                    } else {
                        str = null;
                    }
                    if (C89361p.m154872a(str, this.f136247a, false) && (playListInfo = aweme.playlist_info) != null) {
                        playListInfo.setMixName(this.f136248b);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$n */
    static final class C59832n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136297a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f136298b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89124d f136299c;

        /* renamed from: d */
        final /* synthetic */ long f136300d;

        static {
            Covode.recordClassIndex(70237);
        }

        C59832n(MixVideosViewModel mixVideosViewModel, C89233z.C89236c cVar, AbstractC89124d dVar, long j) {
            this.f136297a = mixVideosViewModel;
            this.f136298b = cVar;
            this.f136299c = dVar;
            this.f136300d = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C59399e eVar = (C59399e) obj;
            this.f136297a.mo20667b(new AbstractC89172b<C59857d, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59832n.C598331 */

                /* renamed from: a */
                final /* synthetic */ C59832n f136301a;

                static {
                    Covode.recordClassIndex(70238);
                }

                {
                    this.f136301a = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$n$1$a */
                static final class C59835a extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

                    /* renamed from: a */
                    final /* synthetic */ C598331 f136304a;

                    /* renamed from: b */
                    final /* synthetic */ List f136305b;

                    static {
                        Covode.recordClassIndex(70240);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C59835a(C598331 r2, List list) {
                        super(1);
                        this.f136304a = r2;
                        this.f136305b = list;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C59857d invoke(C59857d dVar) {
                        C59857d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        return C59857d.m109313a(dVar2, this.f136305b, null, null, this.f136304a.f136301a.f136298b.element, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C59857d dVar) {
                    Long l;
                    C89219l.m154721d(dVar, "");
                    List<? extends Aweme> list = eVar.f135686a;
                    if (this.f136301a.f136298b.element == C59860g.f136352d) {
                        this.f136301a.f136297a.f136234p = eVar.f135690f;
                        this.f136301a.f136297a.f136235q = eVar.f135691g;
                    } else if (this.f136301a.f136298b.element == C59860g.f136349a) {
                        this.f136301a.f136297a.f136235q = eVar.f135687b;
                    }
                    this.f136301a.f136297a.f136236r = eVar.f135689e;
                    this.f136301a.f136297a.f136237s = eVar.f135688c;
                    if (list != null) {
                        this.f136301a.f136297a.mo20662a(new C59835a(this, list));
                    }
                    List<? extends Aweme> list2 = eVar.f135686a;
                    if (list2 == null || list2.isEmpty()) {
                        this.f136301a.f136299c.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE)));
                        this.f136301a.f136297a.mo20662a(C598341.f136303a);
                    } else {
                        if (this.f136301a.f136297a.f136235q || this.f136301a.f136297a.f136234p) {
                            Long l2 = null;
                            if (this.f136301a.f136297a.f136235q) {
                                l = Long.valueOf(eVar.f135688c);
                            } else {
                                l = null;
                            }
                            if (this.f136301a.f136297a.f136234p) {
                                l2 = Long.valueOf(eVar.f135689e);
                            }
                            AbstractC89124d dVar2 = this.f136301a.f136299c;
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C59774b(it.next()));
                            }
                            dVar2.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32840a(l2, l, arrayList)));
                        } else {
                            AbstractC89124d dVar3 = this.f136301a.f136299c;
                            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new C59774b(it2.next()));
                            }
                            dVar3.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                        }
                        if (this.f136301a.f136297a.f136232n != null) {
                            this.f136301a.f136297a.mo97231a(this.f136301a.f136297a.f136232n);
                        } else if (!list2.isEmpty()) {
                            this.f136301a.f136297a.mo97231a((Aweme) list2.get(0));
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            if (this.f136297a.f136242x > 0) {
                C80454fs.m139461a(this.f136297a.f136241w, this.f136297a.f136228j, this.f136297a.f136242x, this.f136300d, SystemClock.elapsedRealtime(), C61482f.m111327a(), new C80454fs.AbstractC80455a() {
                    /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59832n.C598362 */

                    static {
                        Covode.recordClassIndex(70241);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.utils.C80454fs.AbstractC80455a
                    /* renamed from: a */
                    public final void mo62626a(String str, Map<String, String> map) {
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(map, "");
                        C39162r.m79460a(str, map);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$r */
    public static final class C59840r extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

        /* renamed from: a */
        final /* synthetic */ boolean f136309a;

        static {
            Covode.recordClassIndex(70245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59840r(boolean z) {
            super(1);
            this.f136309a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59857d invoke(C59857d dVar) {
            C59857d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C59857d.m109313a(dVar2, null, null, new C12776a(Boolean.valueOf(this.f136309a)), 0, false, 0, null, null, null, 507);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$l */
    static final class C59826l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosViewModel f136287a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f136288b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f136289c;

        /* renamed from: d */
        final /* synthetic */ long f136290d;

        static {
            Covode.recordClassIndex(70231);
        }

        C59826l(MixVideosViewModel mixVideosViewModel, C89233z.C89236c cVar, C89233z.C89238e eVar, long j) {
            this.f136287a = mixVideosViewModel;
            this.f136288b = cVar;
            this.f136289c = eVar;
            this.f136290d = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final T t = (T) ((C59399e) obj);
            this.f136287a.mo20667b(new AbstractC89172b<C59857d, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59826l.C598271 */

                /* renamed from: a */
                final /* synthetic */ C59826l f136291a;

                static {
                    Covode.recordClassIndex(70232);
                }

                {
                    this.f136291a = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$l$1$a */
                static final class C59828a extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {

                    /* renamed from: a */
                    final /* synthetic */ C598271 f136293a;

                    /* renamed from: b */
                    final /* synthetic */ List f136294b;

                    static {
                        Covode.recordClassIndex(70233);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C59828a(C598271 r2, List list) {
                        super(1);
                        this.f136293a = r2;
                        this.f136294b = list;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C59857d invoke(C59857d dVar) {
                        C59857d dVar2 = dVar;
                        C89219l.m154721d(dVar2, "");
                        return C59857d.m109313a(dVar2, this.f136294b, null, null, this.f136293a.f136291a.f136288b.element, false, 0, null, null, null, 502);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C59857d dVar) {
                    C89219l.m154721d(dVar, "");
                    List<? extends Aweme> list = t.f135686a;
                    if (this.f136291a.f136288b.element == C59860g.f136352d) {
                        this.f136291a.f136287a.f136234p = t.f135690f;
                        this.f136291a.f136287a.f136235q = t.f135691g;
                    } else if (this.f136291a.f136288b.element == C59860g.f136349a) {
                        this.f136291a.f136287a.f136235q = t.f135687b;
                    }
                    this.f136291a.f136287a.f136236r = t.f135689e;
                    this.f136291a.f136287a.f136237s = t.f135688c;
                    if (list != null) {
                        this.f136291a.f136287a.mo20662a(new C59828a(this, list));
                    }
                    return C89391z.f203057a;
                }
            });
            List<? extends Aweme> list = t.f135686a;
            if (list == null || list.isEmpty()) {
                this.f136287a.mo20662a(C598292.f136295a);
            }
            this.f136289c.element = t;
            if (this.f136287a.f136242x > 0) {
                C80454fs.m139461a(this.f136287a.f136241w, this.f136287a.f136228j, this.f136287a.f136242x, this.f136290d, SystemClock.elapsedRealtime(), C61482f.m111327a(), new C80454fs.AbstractC80455a() {
                    /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.C59826l.C598303 */

                    static {
                        Covode.recordClassIndex(70235);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.utils.C80454fs.AbstractC80455a
                    /* renamed from: a */
                    public final void mo62626a(String str, Map<String, String> map) {
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(map, "");
                        C39162r.m79460a(str, map);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo97233a(C59858e eVar) {
        C89219l.m154721d(eVar, "");
        mo20667b(new C59804ac(this, eVar));
    }

    /* renamed from: a */
    public final void mo97235a(boolean z) {
        mo20662a(new C59840r(z));
    }

    /* renamed from: a */
    public static List<Aweme> m109289a(List<? extends Aweme> list, List<? extends Aweme> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static int m109288a(List<? extends Aweme> list, Aweme aweme) {
        String str;
        if (list != null) {
            int i = 0;
            for (Aweme aweme2 : list) {
                String aid = aweme2.getAid();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) aid, (Object) str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo97237b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int i = C59860g.f136351c;
        MixFeedApi.C59385a.m109095a().getMixVideos2(this.f136230l, "", this.f136237s, i, mo97240k(), mo97241l()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C59818h(this, i), C59821i.f136278a);
    }

    /* renamed from: a */
    public final void mo97232a(Aweme aweme, String str) {
        C89219l.m154721d(str, "");
        if (aweme != null) {
            this.f136232n = aweme;
            this.f136231m = aweme.getAid().toString();
        }
        this.f136230l = str;
        mo23342g().f42330c.mo28163e();
    }

    /* renamed from: a */
    public final void mo97234a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = C59860g.f136349a;
        if (!C13627m.m24498a(this.f136231m)) {
            cVar.element = C59860g.f136352d;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mo97238i();
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        MixFeedApi.C59385a.m109095a().getMixVideos2(this.f136230l, this.f136231m, 0, cVar.element, str, str2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C59826l(this, cVar, eVar, elapsedRealtime), C59831m.f136296a);
    }
}
