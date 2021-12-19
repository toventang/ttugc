package com.p2082ss.android.ugc.aweme.music.search;

import android.text.TextUtils;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ext_power_list.C14533l;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.C60837p;
import com.p2082ss.android.ugc.aweme.music.EnumC60872q;
import com.p2082ss.android.ugc.aweme.music.assem.AbstractC60416h;
import com.p2082ss.android.ugc.aweme.music.assem.C60394b;
import com.p2082ss.android.ugc.aweme.music.assem.list.C60622s;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60603d;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.EnumC60605f;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.p2082ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel */
public final class SearchMusicListViewModel extends AssemListViewModel<C60622s, C60603d, C60892a> implements AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    final List<Music> f138347k = new ArrayList();

    /* renamed from: l */
    public String f138348l = "";

    /* renamed from: m */
    public boolean f138349m;

    /* renamed from: n */
    public boolean f138350n;

    /* renamed from: o */
    public final AbstractC12644a<AbstractC61057r> f138351o;

    /* renamed from: p */
    private volatile int f138352p;

    static {
        Covode.recordClassIndex(71465);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new RunnableC90250g(SearchMusicListViewModel.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$d */
    static final class C60879d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicListViewModel f138357a;

        static {
            Covode.recordClassIndex(71470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60879d(SearchMusicListViewModel searchMusicListViewModel) {
            super(0);
            this.f138357a = searchMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f138357a.f138349m = true;
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C60622s();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        C80298cg.m139205b(this);
    }

    /* renamed from: n */
    private static boolean m110499n() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: m */
    private final String m110498m() {
        C60394b bVar = (C60394b) C12801d.m23016a(this, C89204ab.m154669a(AbstractC60416h.class));
        if (bVar != null) {
            return bVar.f137576a;
        }
        return null;
    }

    /* renamed from: o */
    private static boolean m110500o() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean n = m110499n();
        C58029j.f132256h = n;
        return n;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: c */
    public final void mo20669c() {
        super.mo20669c();
        AssemViewModel.m23030a(this, C61058s.f138539a, null, new C60876b(this), new C60879d(this), new C60878c(this), 2);
        C80298cg.m139204a(this);
    }

    /* renamed from: j */
    public final String mo98536j() {
        C60394b bVar = (C60394b) C12801d.m23016a(this, C89204ab.m154669a(AbstractC60416h.class));
        if (bVar != null) {
            return bVar.f137577b;
        }
        return null;
    }

    /* renamed from: k */
    public final PinnedMusicList mo98537k() {
        C60394b bVar = (C60394b) C12801d.m23016a(this, C89204ab.m154669a(AbstractC60416h.class));
        if (bVar != null) {
            return bVar.f137583h;
        }
        return null;
    }

    /* renamed from: l */
    public final void mo98538l() {
        C17867d.m33078a();
        if (!m110500o()) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.dcq).mo123053a();
            mo20662a((AbstractC89172b) C60885i.f138364a);
        } else if (!TextUtils.isEmpty(m110498m())) {
            this.f138349m = true;
            mo23342g();
            mo20662a((AbstractC89172b) C60886j.f138365a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$c */
    static final class C60878c extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicListViewModel f138356a;

        static {
            Covode.recordClassIndex(71469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60878c(SearchMusicListViewModel searchMusicListViewModel) {
            super(1);
            this.f138356a = searchMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            C89219l.m154721d(lVar, "");
            this.f138356a.f138349m = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$g */
    public static final class C60882g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SearchMusicListViewModel f138361a;

        static {
            Covode.recordClassIndex(71473);
        }

        public C60882g(SearchMusicListViewModel searchMusicListViewModel) {
            this.f138361a = searchMusicListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f138361a.mo20662a((AbstractC89172b) C608831.f138362a);
            this.f138361a.f138350n = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$m */
    public static final class C60890m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SearchMusicListViewModel f138370a;

        static {
            Covode.recordClassIndex(71481);
        }

        public C60890m(SearchMusicListViewModel searchMusicListViewModel) {
            this.f138370a = searchMusicListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f138370a.mo20662a((AbstractC89172b) C608911.f138371a);
            this.f138370a.f138350n = false;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final void mo23334a(C14515a<C60603d> aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a((AbstractC89172b) new C60875a(aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$a */
    static final class C60875a extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        final /* synthetic */ C14515a f138353a;

        static {
            Covode.recordClassIndex(71466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60875a(C14515a aVar) {
            super(1);
            this.f138353a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, null, null, null, null, this.f138353a, 31);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$b */
    static final class C60876b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicListViewModel f138354a;

        static {
            Covode.recordClassIndex(71467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60876b(SearchMusicListViewModel searchMusicListViewModel) {
            super(1);
            this.f138354a = searchMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f138354a.f138349m = false;
            this.f138354a.mo20662a((AbstractC89172b) C608771.f138355a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$i */
    public static final class C60885i extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        public static final C60885i f138364a = new C60885i();

        static {
            Covode.recordClassIndex(71476);
        }

        C60885i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, true, null, null, null, new C12776a(null), null, 46);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$j */
    public static final class C60886j extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        public static final C60886j f138365a = new C60886j();

        static {
            Covode.recordClassIndex(71477);
        }

        C60886j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, null, null, null, null, null, 62);
        }
    }

    public SearchMusicListViewModel(AbstractC12644a<AbstractC61057r> aVar) {
        C89219l.m154721d(aVar, "");
        this.f138351o = aVar;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final Object mo23330a(AbstractC89124d<? super AbstractC17700f<C60892a>> dVar) {
        this.f138352p++;
        return m110496a(new C60892a(this.f138352p, mo98536j(), this.f138348l, 0, true));
    }

    @AbstractC90264r
    public final void onAntiCrawlerEvent(C34569a aVar) {
        C89219l.m154721d(aVar, "");
        String str = aVar.f81610a;
        if (str != null && C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/original/music/list/?", false)) {
            EventBus.m156962a().mo145397d(aVar);
            mo98538l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$e */
    public static final class C60880e extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicListViewModel f138358a;

        static {
            Covode.recordClassIndex(71471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60880e(SearchMusicListViewModel searchMusicListViewModel) {
            super(1);
            this.f138358a = searchMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            int i;
            List<Music> musicList;
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            EnumC60872q qVar = EnumC60872q.FULL;
            PinnedMusicList k = this.f138358a.mo98537k();
            if (k == null || (musicList = k.getMusicList()) == null) {
                i = 3;
            } else {
                i = musicList.size();
            }
            return C60622s.m110178a(sVar2, false, null, new C12776a(new C60837p(true, qVar, i)), null, null, null, 59);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$h */
    static final class C60884h extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        public static final C60884h f138363a = new C60884h();

        static {
            Covode.recordClassIndex(71475);
        }

        C60884h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, null, new C12776a(new C60837p(true, EnumC60872q.SUCCESS)), null, null, null, 59);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$k */
    public static final class C60887k extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f138366a;

        static {
            Covode.recordClassIndex(71478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60887k(ArrayList arrayList) {
            super(1);
            this.f138366a = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, new C12776a(Integer.valueOf(this.f138366a.size())), null, null, null, null, 61);
        }
    }

    /* renamed from: a */
    static Music m110497a(MusicModel musicModel) {
        Music convertToMusic = musicModel.convertToMusic();
        C89219l.m154716b(convertToMusic, "");
        convertToMusic.setDuration(convertToMusic.getDuration() / 1000);
        convertToMusic.setShootDuration(Integer.valueOf(convertToMusic.getShootDuration() / 1000));
        convertToMusic.setAuditionDuration(Integer.valueOf(convertToMusic.getAuditionDuration() / 1000));
        return convertToMusic;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$f */
    public static final class C60881f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SearchMusicListViewModel f138359a;

        /* renamed from: b */
        final /* synthetic */ C60603d f138360b;

        static {
            Covode.recordClassIndex(71472);
        }

        public C60881f(SearchMusicListViewModel searchMusicListViewModel, C60603d dVar) {
            this.f138359a = searchMusicListViewModel;
            this.f138360b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            PinnedMusicList k;
            this.f138359a.f138350n = false;
            SearchMusicListViewModel searchMusicListViewModel = this.f138359a;
            C60603d dVar = this.f138360b;
            PinnedMusicList k2 = searchMusicListViewModel.mo98537k();
            if ((k2 == null || k2.getMusicList() == null) && (k = searchMusicListViewModel.mo98537k()) != null) {
                k.setMusicList(new ArrayList());
            }
            PinnedMusicList k3 = searchMusicListViewModel.mo98537k();
            if (k3 != null) {
                List<Music> musicList = k3.getMusicList();
                if (musicList != null) {
                    musicList.add(0, SearchMusicListViewModel.m110497a(dVar.f137817a));
                }
                k3.setAvalibleCapicity(k3.getAvalibleCapicity() - 1);
            }
            ArrayList arrayList = new ArrayList();
            for (T t : searchMusicListViewModel.f138347k) {
                MusicModel convertToMusicModel = t.convertToMusicModel();
                C89219l.m154716b(convertToMusicModel, "");
                arrayList.add(new C60603d(convertToMusicModel, searchMusicListViewModel.mo98535a((Music) t)));
            }
            searchMusicListViewModel.mo23340a((Collection) arrayList);
            searchMusicListViewModel.mo20662a((AbstractC89172b) C60884h.f138363a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$l */
    public static final class C60888l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SearchMusicListViewModel f138367a;

        /* renamed from: b */
        final /* synthetic */ C60603d f138368b;

        static {
            Covode.recordClassIndex(71479);
        }

        public C60888l(SearchMusicListViewModel searchMusicListViewModel, C60603d dVar) {
            this.f138367a = searchMusicListViewModel;
            this.f138368b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f138367a.mo20662a((AbstractC89172b) C608891.f138369a);
            this.f138367a.f138350n = false;
            SearchMusicListViewModel searchMusicListViewModel = this.f138367a;
            Music a = SearchMusicListViewModel.m110497a(this.f138368b.f137817a);
            PinnedMusicList k = searchMusicListViewModel.mo98537k();
            if (k != null) {
                List<Music> musicList = k.getMusicList();
                if (musicList != null) {
                    musicList.remove(a);
                }
                k.setAvalibleCapicity(k.getAvalibleCapicity() + 1);
            }
            ArrayList arrayList = new ArrayList();
            for (T t : searchMusicListViewModel.f138347k) {
                MusicModel convertToMusicModel = t.convertToMusicModel();
                C89219l.m154716b(convertToMusicModel, "");
                arrayList.add(new C60603d(convertToMusicModel, searchMusicListViewModel.mo98535a((Music) t)));
            }
            searchMusicListViewModel.mo23340a((Collection) arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final EnumC60605f mo98535a(Music music) {
        List<Music> musicList;
        PinnedMusicList k = mo98537k();
        if (!(k == null || (musicList = k.getMusicList()) == null)) {
            Iterator<T> it = musicList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().getId() == music.getId()) {
                    z = true;
                }
            }
            if (z) {
                return EnumC60605f.PINNED;
            }
        }
        PinnedMusicList k2 = mo98537k();
        if (k2 == null || k2.getAvalibleCapicity() <= 0) {
            return EnumC60605f.DISABLE_PINNED;
        }
        return EnumC60605f.ENABLE_PINNED;
    }

    /* renamed from: a */
    private final AbstractC17700f<C60892a> m110496a(C60892a aVar) {
        if (C80580in.m139687c()) {
            return AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE);
        }
        String str = aVar.f138374c;
        if (str == null || str.length() == 0 || (!C89219l.m154714a((Object) this.f138348l, (Object) aVar.f138374c))) {
            return AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE);
        }
        try {
            if (aVar.f138372a == this.f138352p && aVar.f138377f) {
                this.f138347k.clear();
            }
            OriginalMusicList a = this.f138351o.mo20458a().mo98576a(aVar.f138373b, aVar.f138374c, aVar.f138375d, aVar.f138376e);
            if (a == null) {
                return AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE);
            }
            ArrayList arrayList = new ArrayList();
            List<Music> list = a.musicList;
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        MusicModel convertToMusicModel = t.convertToMusicModel();
                        C89219l.m154716b(convertToMusicModel, "");
                        arrayList.add(new C60603d(convertToMusicModel, mo98535a((Music) t)));
                        if (aVar.f138372a == this.f138352p) {
                            this.f138347k.add(t);
                        }
                    }
                }
            }
            if (aVar.f138372a == this.f138352p && aVar.f138377f) {
                mo20662a((AbstractC89172b) new C60887k(arrayList));
            }
            if (a.hasMore) {
                return AbstractC17700f.C17701a.m32841a(null, new C60892a(aVar.f138372a, aVar.f138373b, aVar.f138374c, a.cursor, false), arrayList, 1);
            }
            return AbstractC17700f.C17701a.m32838a(arrayList);
        } catch (Exception e) {
            if (aVar.f138377f) {
                this.f138347k.clear();
            }
            e.printStackTrace();
            return AbstractC17700f.C17701a.m32839a(e);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23331a(C60892a aVar, AbstractC89124d<? super AbstractC17700f<C60892a>> dVar) {
        return m110496a(aVar);
    }
}
