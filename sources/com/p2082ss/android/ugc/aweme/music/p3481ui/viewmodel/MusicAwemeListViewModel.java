package com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3485d.C61158b;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4567d.AbstractC88432e;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88676at;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel */
public final class MusicAwemeListViewModel extends CommonListViewModel<Object, MusicAwemeListState> {

    /* renamed from: f */
    public static final C61208a f138977f = new C61208a((byte) 0);

    /* renamed from: a */
    public final C61158b f138978a = new C61158b();

    /* renamed from: b */
    public ArrayList<Object> f138979b = new ArrayList<>();

    /* renamed from: c */
    public boolean f138980c;

    /* renamed from: d */
    public int f138981d;

    /* renamed from: e */
    public boolean f138982e;

    static {
        Covode.recordClassIndex(71815);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel$a */
    public static final class C61208a {
        static {
            Covode.recordClassIndex(71816);
        }

        private C61208a() {
        }

        public /* synthetic */ C61208a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: a */
    public final AbstractC89172b<MusicAwemeListState, AbstractC88979t<C89378p<List<Object>, C20465o>>> mo33725a() {
        return new C61217d(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: b */
    public final AbstractC89172b<MusicAwemeListState, AbstractC88979t<C89378p<List<Object>, C20465o>>> mo33726b() {
        return new C61211c(this);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new MusicAwemeListState(null, 0, false, null, 15, null);
    }

    /* renamed from: b */
    public final ArrayList<Object> mo98746b(int i) {
        ArrayList<Object> arrayList = new ArrayList<>();
        if (this.f138979b.size() >= i) {
            arrayList.addAll(this.f138979b.subList(0, i));
        } else {
            arrayList.addAll(this.f138979b);
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel$d */
    static final class C61217d extends AbstractC89220m implements AbstractC89172b<MusicAwemeListState, AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ MusicAwemeListViewModel f138996a;

        static {
            Covode.recordClassIndex(71825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61217d(MusicAwemeListViewModel musicAwemeListViewModel) {
            super(1);
            this.f138996a = musicAwemeListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C20465o>> invoke(MusicAwemeListState musicAwemeListState) {
            MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
            C89219l.m154721d(musicAwemeListState2, "");
            AbstractC88979t<R> d = this.f138996a.f138978a.mo98698a(musicAwemeListState2.getMusicId(), 0, 20).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel.MusicAwemeListViewModel.C61217d.C612181 */

                /* renamed from: a */
                final /* synthetic */ C61217d f138997a;

                static {
                    Covode.recordClassIndex(71826);
                }

                {
                    this.f138997a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    boolean z;
                    MusicAwemeList musicAwemeList = (MusicAwemeList) obj;
                    C89219l.m154721d(musicAwemeList, "");
                    MusicAwemeListViewModel musicAwemeListViewModel = this.f138997a.f138996a;
                    boolean z2 = false;
                    if (musicAwemeList.hasMore == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    musicAwemeListViewModel.f138982e = z;
                    int a = C16048b.m29633a().mo25412a(true, "music_detail_more_sounds", 0);
                    int i = a - (a % 3);
                    if (i <= 1) {
                        i = 12;
                    }
                    this.f138997a.f138996a.f138979b.addAll(musicAwemeList.items);
                    final C89233z.C89238e eVar = new C89233z.C89238e();
                    eVar.element = (T) this.f138997a.f138996a.mo98746b(i);
                    this.f138997a.f138996a.f138979b.removeAll(eVar.element);
                    this.f138997a.f138996a.mo33689c(new AbstractC89172b<MusicAwemeListState, MusicAwemeListState>() {
                        /* class com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel.MusicAwemeListViewModel.C61217d.C612181.C612191 */

                        static {
                            Covode.recordClassIndex(71827);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ MusicAwemeListState invoke(MusicAwemeListState musicAwemeListState) {
                            MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
                            C89219l.m154721d(musicAwemeListState2, "");
                            return MusicAwemeListState.copy$default(musicAwemeListState2, null, eVar.element.size(), false, null, 13, null);
                        }
                    });
                    if (this.f138997a.f138996a.f138982e || this.f138997a.f138996a.f138979b.size() != 0) {
                        z2 = true;
                    }
                    return C89387v.m154943a(eVar.element, new C20465o(z2, (int) musicAwemeList.cursor));
                }
            });
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel$b */
    static final class C61209b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ MusicAwemeListViewModel f138983a;

        /* renamed from: b */
        final /* synthetic */ MusicAwemeListState f138984b;

        static {
            Covode.recordClassIndex(71817);
        }

        C61209b(MusicAwemeListViewModel musicAwemeListViewModel, MusicAwemeListState musicAwemeListState) {
            this.f138983a = musicAwemeListViewModel;
            this.f138984b = musicAwemeListState;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<List<Object>> vVar) {
            C89219l.m154721d(vVar, "");
            List<Object> arrayList = new ArrayList<>();
            final C89233z.C89236c cVar = new C89233z.C89236c();
            cVar.element = this.f138984b.getOutBound();
            if (this.f138984b.isNeedControl()) {
                if (cVar.element + 12 <= ((ListState) this.f138984b.getSubstate()).getList().size()) {
                    cVar.element += 12;
                } else if (this.f138983a.f138979b.size() != 0) {
                    arrayList = this.f138983a.mo98746b(12);
                    cVar.element += arrayList.size();
                    this.f138983a.f138979b.removeAll(arrayList);
                } else {
                    cVar.element = ((ListState) this.f138984b.getSubstate()).getList().size();
                }
                this.f138983a.mo33689c(new AbstractC89172b<MusicAwemeListState, MusicAwemeListState>() {
                    /* class com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel.MusicAwemeListViewModel.C61209b.C612101 */

                    static {
                        Covode.recordClassIndex(71818);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ MusicAwemeListState invoke(MusicAwemeListState musicAwemeListState) {
                        MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
                        C89219l.m154721d(musicAwemeListState2, "");
                        return MusicAwemeListState.copy$default(musicAwemeListState2, null, cVar.element, false, null, 9, null);
                    }
                });
            } else {
                arrayList = this.f138983a.mo98746b(12);
                this.f138983a.f138979b.removeAll(arrayList);
            }
            vVar.mo143031a(arrayList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListViewModel$c */
    static final class C61211c extends AbstractC89220m implements AbstractC89172b<MusicAwemeListState, AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ MusicAwemeListViewModel f138986a;

        static {
            Covode.recordClassIndex(71819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61211c(MusicAwemeListViewModel musicAwemeListViewModel) {
            super(1);
            this.f138986a = musicAwemeListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C20465o>> invoke(MusicAwemeListState musicAwemeListState) {
            final MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
            C89219l.m154721d(musicAwemeListState2, "");
            final C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) new ArrayList();
            if (this.f138986a.f138979b.size() >= 12 || !this.f138986a.f138982e || (musicAwemeListState2.isNeedControl() && musicAwemeListState2.getOutBound() < ((ListState) musicAwemeListState2.getSubstate()).getList().size())) {
                AbstractC88979t a = AbstractC88979t.m154294a(new C61209b(this.f138986a, musicAwemeListState2));
                C89219l.m154716b(a, "");
                AbstractC88979t d = a.mo143292d(new AbstractC88434g(this) {
                    /* class com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel.MusicAwemeListViewModel.C61211c.C612121 */

                    /* renamed from: a */
                    final /* synthetic */ C61211c f138987a;

                    static {
                        Covode.recordClassIndex(71820);
                    }

                    {
                        this.f138987a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88434g
                    public final /* synthetic */ Object apply(Object obj) {
                        boolean z;
                        C89219l.m154721d(obj, "");
                        if (this.f138987a.f138986a.f138982e || this.f138987a.f138986a.f138979b.size() != 0) {
                            z = ((ListState) musicAwemeListState2.getSubstate()).getPayload().f48406a.f48382a;
                        } else {
                            z = false;
                        }
                        return C89387v.m154943a(obj, new C20465o(z, ((ListState) musicAwemeListState2.getSubstate()).getPayload().f48407b));
                    }
                });
                C89219l.m154716b(d, "");
                return d;
            }
            AbstractC88979t<MusicAwemeList> a2 = this.f138986a.f138978a.mo98698a(musicAwemeListState2.getMusicId(), (long) ((ListState) musicAwemeListState2.getSubstate()).getPayload().f48407b, 12);
            C612132 r1 = new AbstractC88432e(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel.MusicAwemeListViewModel.C61211c.C612132 */

                /* renamed from: a */
                final /* synthetic */ C61211c f138989a;

                static {
                    Covode.recordClassIndex(71821);
                }

                {
                    this.f138989a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88432e
                /* renamed from: a */
                public final boolean mo17930a() {
                    if (this.f138989a.f138986a.f138979b.size() >= 12 || this.f138989a.f138986a.f138980c || !this.f138989a.f138986a.f138982e || this.f138989a.f138986a.f138981d > 1) {
                        return true;
                    }
                    return false;
                }
            };
            C88466b.m153697a((Object) r1, "stop is null");
            AbstractC88979t d2 = C88925a.m154171a(new C88676at(a2, r1)).mo143268a(new AbstractC88438k(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel.MusicAwemeListViewModel.C61211c.C612143 */

                /* renamed from: a */
                final /* synthetic */ C61211c f138990a;

                static {
                    Covode.recordClassIndex(71822);
                }

                {
                    this.f138990a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88438k
                /* renamed from: a */
                public final /* synthetic */ boolean mo7718a(Object obj) {
                    boolean z;
                    MusicAwemeList musicAwemeList = (MusicAwemeList) obj;
                    C89219l.m154721d(musicAwemeList, "");
                    MusicAwemeListViewModel musicAwemeListViewModel = this.f138990a.f138986a;
                    if (musicAwemeList.hasMore == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    musicAwemeListViewModel.f138982e = z;
                    if (musicAwemeList.items.size() > 0 || !this.f138990a.f138986a.f138982e) {
                        this.f138990a.f138986a.f138981d = 0;
                    } else {
                        this.f138990a.f138986a.f138981d++;
                        if (this.f138990a.f138986a.f138981d > 1) {
                            this.f138990a.f138986a.f138981d = 0;
                            return true;
                        }
                    }
                    this.f138990a.f138986a.f138979b.addAll(musicAwemeList.items);
                    if (this.f138990a.f138986a.f138979b.size() >= 12 || !this.f138990a.f138986a.f138982e) {
                        ArrayList<Object> b = this.f138990a.f138986a.mo98746b(12);
                        eVar.element.clear();
                        eVar.element.addAll(b);
                        this.f138990a.f138986a.f138979b.removeAll(b);
                        return true;
                    }
                    this.f138990a.f138986a.f138980c = false;
                    return false;
                }
            }).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel.MusicAwemeListViewModel.C61211c.C612154 */

                /* renamed from: a */
                final /* synthetic */ C61211c f138992a;

                static {
                    Covode.recordClassIndex(71823);
                }

                {
                    this.f138992a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    MusicAwemeList musicAwemeList = (MusicAwemeList) obj;
                    C89219l.m154721d(musicAwemeList, "");
                    boolean z = true;
                    this.f138992a.f138986a.f138980c = true;
                    if (musicAwemeListState2.isNeedControl()) {
                        final int outBound = musicAwemeListState2.getOutBound() + 12;
                        int size = ((ListState) musicAwemeListState2.getSubstate()).getList().size() + eVar.element.size();
                        if (outBound >= size) {
                            outBound = size;
                        }
                        this.f138992a.f138986a.mo33689c(new AbstractC89172b<MusicAwemeListState, MusicAwemeListState>() {
                            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel.MusicAwemeListViewModel.C61211c.C612154.C612161 */

                            static {
                                Covode.recordClassIndex(71824);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ MusicAwemeListState invoke(MusicAwemeListState musicAwemeListState) {
                                MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
                                C89219l.m154721d(musicAwemeListState2, "");
                                return MusicAwemeListState.copy$default(musicAwemeListState2, null, outBound, false, null, 9, null);
                            }
                        });
                    }
                    T t = eVar.element;
                    if (!this.f138992a.f138986a.f138982e && this.f138992a.f138986a.f138979b.size() <= 0) {
                        z = false;
                    }
                    return C89387v.m154943a(t, new C20465o(z, (int) musicAwemeList.cursor));
                }
            });
            C89219l.m154716b(d2, "");
            return d2;
        }
    }
}
