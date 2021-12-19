package com.p2082ss.android.ugc.aweme.music.assem.list;

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
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60603d;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.EnumC60605f;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.p2082ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
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
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel */
public final class OriginMusicListViewModel extends AssemListViewModel<C60622s, C60603d, C60437a> implements AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    public PinnedMusicList f137607k;

    /* renamed from: l */
    final List<Music> f137608l = new ArrayList();

    /* renamed from: m */
    public boolean f137609m;

    /* renamed from: n */
    public boolean f137610n;

    /* renamed from: o */
    public final AbstractC12644a<AbstractC60621r> f137611o;

    /* renamed from: p */
    private volatile int f137612p;

    static {
        Covode.recordClassIndex(70966);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new RunnableC90250g(OriginMusicListViewModel.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$d */
    static final class C60421d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ OriginMusicListViewModel f137617a;

        static {
            Covode.recordClassIndex(70971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60421d(OriginMusicListViewModel originMusicListViewModel) {
            super(0);
            this.f137617a = originMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f137617a.f137609m = true;
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C60622s();
    }

    /* renamed from: n */
    private static boolean m110076n() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: p */
    private final boolean m110078p() {
        PinnedMusicList pinnedMusicList = this.f137607k;
        if (pinnedMusicList == null || pinnedMusicList.getAvalibleCapicity() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final EnumC60605f mo98059m() {
        if (m110078p()) {
            return EnumC60605f.ENABLE_PINNED;
        }
        return EnumC60605f.DISABLE_PINNED;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: o */
    private static boolean m110077o() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean n = m110076n();
        C58029j.f132256h = n;
        return n;
    }

    /* renamed from: j */
    public final String mo98056j() {
        C60394b bVar = (C60394b) C12801d.m23016a(this, C89204ab.m154669a(AbstractC60416h.class));
        if (bVar != null) {
            return bVar.f137576a;
        }
        return null;
    }

    /* renamed from: k */
    public final String mo98057k() {
        C60394b bVar = (C60394b) C12801d.m23016a(this, C89204ab.m154669a(AbstractC60416h.class));
        if (bVar != null) {
            return bVar.f137577b;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: c */
    public final void mo20669c() {
        super.mo20669c();
        AssemViewModel.m23030a(this, C60623t.f137842a, null, new C60418b(this), new C60421d(this), new C60420c(this), 2);
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: l */
    public final void mo98058l() {
        C17867d.m33078a();
        if (!m110077o()) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.dcq).mo123053a();
            mo20662a((AbstractC89172b) C60427i.f137624a);
        } else if (!TextUtils.isEmpty(mo98056j()) && !this.f137609m) {
            this.f137609m = true;
            mo23342g();
            mo20662a((AbstractC89172b) C60428j.f137625a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$c */
    static final class C60420c extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OriginMusicListViewModel f137616a;

        static {
            Covode.recordClassIndex(70970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60420c(OriginMusicListViewModel originMusicListViewModel) {
            super(1);
            this.f137616a = originMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            C89219l.m154721d(lVar, "");
            this.f137616a.f137609m = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$g */
    public static final class C60424g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ OriginMusicListViewModel f137621a;

        static {
            Covode.recordClassIndex(70974);
        }

        public C60424g(OriginMusicListViewModel originMusicListViewModel) {
            this.f137621a = originMusicListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f137621a.mo20662a((AbstractC89172b) C604251.f137622a);
            this.f137621a.f137610n = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$m */
    public static final class C60431m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ OriginMusicListViewModel f137629a;

        static {
            Covode.recordClassIndex(70981);
        }

        public C60431m(OriginMusicListViewModel originMusicListViewModel) {
            this.f137629a = originMusicListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f137629a.mo20662a((AbstractC89172b) C604321.f137630a);
            this.f137629a.f137610n = false;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final void mo23334a(C14515a<C60603d> aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a((AbstractC89172b) new C60417a(aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$a */
    static final class C60417a extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        final /* synthetic */ C14515a f137613a;

        static {
            Covode.recordClassIndex(70967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60417a(C14515a aVar) {
            super(1);
            this.f137613a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, null, null, null, null, this.f137613a, 31);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$b */
    static final class C60418b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OriginMusicListViewModel f137614a;

        static {
            Covode.recordClassIndex(70968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60418b(OriginMusicListViewModel originMusicListViewModel) {
            super(1);
            this.f137614a = originMusicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f137614a.f137609m = false;
            this.f137614a.mo20662a((AbstractC89172b) C604191.f137615a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$i */
    public static final class C60427i extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        public static final C60427i f137624a = new C60427i();

        static {
            Covode.recordClassIndex(70977);
        }

        C60427i() {
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
    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$j */
    public static final class C60428j extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        public static final C60428j f137625a = new C60428j();

        static {
            Covode.recordClassIndex(70978);
        }

        C60428j() {
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

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$q */
    static final class C60436q extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        public static final C60436q f137634a = new C60436q();

        static {
            Covode.recordClassIndex(70986);
        }

        C60436q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, null, null, new C12776a(false), null, null, 55);
        }
    }

    public OriginMusicListViewModel(AbstractC12644a<AbstractC60621r> aVar) {
        C89219l.m154721d(aVar, "");
        this.f137611o = aVar;
    }

    /* renamed from: a */
    private final PinnedMusicList m110075a(String str) {
        try {
            return this.f137611o.mo20458a().mo98117a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return new PinnedMusicList();
        }
    }

    @AbstractC90264r
    public final void onAntiCrawlerEvent(C34569a aVar) {
        C89219l.m154721d(aVar, "");
        String str = aVar.f81610a;
        if (str != null && C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/original/music/list/?", false)) {
            EventBus.m156962a().mo145397d(aVar);
            mo98058l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$e */
    public static final class C60422e extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        final /* synthetic */ OriginMusicListViewModel f137618a;

        static {
            Covode.recordClassIndex(70972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60422e(OriginMusicListViewModel originMusicListViewModel) {
            super(1);
            this.f137618a = originMusicListViewModel;
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
            PinnedMusicList pinnedMusicList = this.f137618a.f137607k;
            if (pinnedMusicList == null || (musicList = pinnedMusicList.getMusicList()) == null) {
                i = 3;
            } else {
                i = musicList.size();
            }
            return C60622s.m110178a(sVar2, false, null, new C12776a(new C60837p(true, qVar, i)), null, null, null, 59);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$h */
    static final class C60426h extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        public static final C60426h f137623a = new C60426h();

        static {
            Covode.recordClassIndex(70976);
        }

        C60426h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, null, new C12776a(new C60837p(true, EnumC60872q.SUCCESS)), new C12776a(true), null, null, 51);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$k */
    public static final class C60429k extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f137626a;

        static {
            Covode.recordClassIndex(70979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60429k(ArrayList arrayList) {
            super(1);
            this.f137626a = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, new C12776a(Integer.valueOf(this.f137626a.size())), null, null, null, null, 61);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$n */
    static final class C60433n extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        public static final C60433n f137631a = new C60433n();

        static {
            Covode.recordClassIndex(70983);
        }

        C60433n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, null, new C12776a(new C60837p(false, EnumC60872q.SUCCESS)), new C12776a(false), null, null, 51);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$o */
    static final class C60434o extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        public static final C60434o f137632a = new C60434o();

        static {
            Covode.recordClassIndex(70984);
        }

        C60434o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, null, new C12776a(new C60837p(false, EnumC60872q.SUCCESS)), null, null, null, 59);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$p */
    static final class C60435p extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {

        /* renamed from: a */
        public static final C60435p f137633a = new C60435p();

        static {
            Covode.recordClassIndex(70985);
        }

        C60435p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60622s invoke(C60622s sVar) {
            C60622s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            return C60622s.m110178a(sVar2, false, null, new C12776a(new C60837p(false, EnumC60872q.SUCCESS)), null, null, null, 59);
        }
    }

    /* renamed from: a */
    static Music m110074a(MusicModel musicModel) {
        Music convertToMusic = musicModel.convertToMusic();
        C89219l.m154716b(convertToMusic, "");
        convertToMusic.setDuration(convertToMusic.getDuration() / 1000);
        convertToMusic.setShootDuration(Integer.valueOf(convertToMusic.getShootDuration() / 1000));
        convertToMusic.setAuditionDuration(Integer.valueOf(convertToMusic.getAuditionDuration() / 1000));
        return convertToMusic;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final Object mo23330a(AbstractC89124d<? super AbstractC17700f<C60437a>> dVar) {
        this.f137612p++;
        return m110073a(new C60437a(this.f137612p, mo98056j(), mo98057k(), 0, true));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$f */
    public static final class C60423f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ OriginMusicListViewModel f137619a;

        /* renamed from: b */
        final /* synthetic */ C60603d f137620b;

        static {
            Covode.recordClassIndex(70973);
        }

        public C60423f(OriginMusicListViewModel originMusicListViewModel, C60603d dVar) {
            this.f137619a = originMusicListViewModel;
            this.f137620b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<Music> musicList;
            PinnedMusicList pinnedMusicList;
            this.f137619a.f137610n = false;
            OriginMusicListViewModel originMusicListViewModel = this.f137619a;
            C60603d dVar = this.f137620b;
            PinnedMusicList pinnedMusicList2 = originMusicListViewModel.f137607k;
            if ((pinnedMusicList2 == null || pinnedMusicList2.getMusicList() == null) && (pinnedMusicList = originMusicListViewModel.f137607k) != null) {
                pinnedMusicList.setMusicList(new ArrayList());
            }
            PinnedMusicList pinnedMusicList3 = originMusicListViewModel.f137607k;
            if (pinnedMusicList3 != null) {
                List<Music> musicList2 = pinnedMusicList3.getMusicList();
                if (musicList2 != null) {
                    musicList2.add(0, OriginMusicListViewModel.m110074a(dVar.f137817a));
                }
                pinnedMusicList3.setAvalibleCapicity(pinnedMusicList3.getAvalibleCapicity() - 1);
            }
            ArrayList arrayList = new ArrayList();
            PinnedMusicList pinnedMusicList4 = originMusicListViewModel.f137607k;
            if (!(pinnedMusicList4 == null || (musicList = pinnedMusicList4.getMusicList()) == null)) {
                Iterator<T> it = musicList.iterator();
                while (it.hasNext()) {
                    MusicModel convertToMusicModel = it.next().convertToMusicModel();
                    C89219l.m154716b(convertToMusicModel, "");
                    arrayList.add(new C60603d(convertToMusicModel, EnumC60605f.PINNED));
                }
            }
            for (T t : originMusicListViewModel.f137608l) {
                if (!originMusicListViewModel.mo98055a((Music) t)) {
                    MusicModel convertToMusicModel2 = t.convertToMusicModel();
                    C89219l.m154716b(convertToMusicModel2, "");
                    arrayList.add(new C60603d(convertToMusicModel2, originMusicListViewModel.mo98059m()));
                }
            }
            originMusicListViewModel.mo23340a((Collection) arrayList);
            originMusicListViewModel.mo20662a((AbstractC89172b) C60426h.f137623a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel$l */
    public static final class C60430l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ OriginMusicListViewModel f137627a;

        /* renamed from: b */
        final /* synthetic */ C60603d f137628b;

        static {
            Covode.recordClassIndex(70980);
        }

        public C60430l(OriginMusicListViewModel originMusicListViewModel, C60603d dVar) {
            this.f137627a = originMusicListViewModel;
            this.f137628b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Integer num;
            List<Music> musicList;
            List<Music> musicList2;
            this.f137627a.f137610n = false;
            OriginMusicListViewModel originMusicListViewModel = this.f137627a;
            Music a = OriginMusicListViewModel.m110074a(this.f137628b.f137817a);
            PinnedMusicList pinnedMusicList = originMusicListViewModel.f137607k;
            if (pinnedMusicList == null || (musicList2 = pinnedMusicList.getMusicList()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(musicList2.indexOf(a));
            }
            PinnedMusicList pinnedMusicList2 = originMusicListViewModel.f137607k;
            if (pinnedMusicList2 != null) {
                List<Music> musicList3 = pinnedMusicList2.getMusicList();
                if (musicList3 != null) {
                    musicList3.remove(a);
                }
                pinnedMusicList2.setAvalibleCapicity(pinnedMusicList2.getAvalibleCapicity() + 1);
            }
            ArrayList<T> arrayList = new ArrayList();
            PinnedMusicList pinnedMusicList3 = originMusicListViewModel.f137607k;
            if (!(pinnedMusicList3 == null || (musicList = pinnedMusicList3.getMusicList()) == null)) {
                Iterator<T> it = musicList.iterator();
                while (it.hasNext()) {
                    MusicModel convertToMusicModel = it.next().convertToMusicModel();
                    C89219l.m154716b(convertToMusicModel, "");
                    arrayList.add(new C60603d(convertToMusicModel, EnumC60605f.PINNED));
                }
            }
            for (T t : originMusicListViewModel.f137608l) {
                if (!originMusicListViewModel.mo98055a((Music) t)) {
                    MusicModel convertToMusicModel2 = t.convertToMusicModel();
                    C89219l.m154716b(convertToMusicModel2, "");
                    arrayList.add(new C60603d(convertToMusicModel2, originMusicListViewModel.mo98059m()));
                }
            }
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
            for (T t2 : arrayList) {
                arrayList2.add(t2.f137817a.getMusicId());
            }
            if (num != null && num.intValue() == 0) {
                originMusicListViewModel.mo20662a((AbstractC89172b) C60433n.f137631a);
            } else {
                originMusicListViewModel.mo20662a((AbstractC89172b) C60434o.f137632a);
            }
            originMusicListViewModel.mo20662a((AbstractC89172b) C60435p.f137633a);
            originMusicListViewModel.mo23340a((Collection) arrayList);
        }
    }

    /* renamed from: a */
    private final AbstractC17700f<C60437a> m110073a(C60437a aVar) {
        PinnedMusicList pinnedMusicList;
        List<Music> musicList;
        if (C80580in.m139687c()) {
            return AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE);
        }
        try {
            if (aVar.f137635a == this.f137612p && aVar.f137640f) {
                this.f137607k = m110075a(aVar.f137637c);
                this.f137608l.clear();
            }
            OriginalMusicList a = this.f137611o.mo20458a().mo98116a(aVar.f137636b, aVar.f137637c, aVar.f137638d, aVar.f137639e);
            if (a == null) {
                return AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE);
            }
            ArrayList arrayList = new ArrayList();
            if (aVar.f137635a == this.f137612p && aVar.f137640f && (pinnedMusicList = this.f137607k) != null && (musicList = pinnedMusicList.getMusicList()) != null) {
                Iterator<T> it = musicList.iterator();
                while (it.hasNext()) {
                    MusicModel convertToMusicModel = it.next().convertToMusicModel();
                    C89219l.m154716b(convertToMusicModel, "");
                    arrayList.add(new C60603d(convertToMusicModel, EnumC60605f.PINNED));
                }
            }
            List<Music> list = a.musicList;
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        if (aVar.f137635a == this.f137612p) {
                            this.f137608l.add(t);
                        }
                        if (!mo98055a((Music) t)) {
                            MusicModel convertToMusicModel2 = t.convertToMusicModel();
                            C89219l.m154716b(convertToMusicModel2, "");
                            arrayList.add(new C60603d(convertToMusicModel2, mo98059m()));
                        }
                    }
                }
            }
            if (aVar.f137635a == this.f137612p && aVar.f137640f) {
                mo20662a((AbstractC89172b) new C60429k(arrayList));
            }
            if (a.hasMore) {
                return AbstractC17700f.C17701a.m32841a(null, new C60437a(aVar.f137635a, aVar.f137636b, aVar.f137637c, a.cursor, false), arrayList, 1);
            }
            return AbstractC17700f.C17701a.m32838a(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
            return AbstractC17700f.C17701a.m32839a(e);
        }
    }

    /* renamed from: a */
    public final void mo98054a(PinnedMusicList pinnedMusicList) {
        int i;
        int i2;
        EnumC60605f fVar;
        List<Music> musicList;
        List<Music> musicList2;
        List<Music> musicList3;
        C89219l.m154721d(pinnedMusicList, "");
        List<Music> musicList4 = pinnedMusicList.getMusicList();
        boolean z = false;
        if (musicList4 != null) {
            i = musicList4.size();
        } else {
            i = 0;
        }
        PinnedMusicList pinnedMusicList2 = this.f137607k;
        if (pinnedMusicList2 == null || (musicList3 = pinnedMusicList2.getMusicList()) == null) {
            i2 = 0;
        } else {
            i2 = musicList3.size();
        }
        if (i == i2) {
            List<Music> musicList5 = pinnedMusicList.getMusicList();
            if (musicList5 != null) {
                for (T t : musicList5) {
                    PinnedMusicList pinnedMusicList3 = this.f137607k;
                    if (!(pinnedMusicList3 == null || (musicList2 = pinnedMusicList3.getMusicList()) == null || musicList2.contains(t))) {
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f137607k = pinnedMusicList;
        ArrayList arrayList = new ArrayList();
        PinnedMusicList pinnedMusicList4 = this.f137607k;
        if (!(pinnedMusicList4 == null || (musicList = pinnedMusicList4.getMusicList()) == null)) {
            Iterator<T> it = musicList.iterator();
            while (it.hasNext()) {
                MusicModel convertToMusicModel = it.next().convertToMusicModel();
                C89219l.m154716b(convertToMusicModel, "");
                arrayList.add(new C60603d(convertToMusicModel, EnumC60605f.PINNED));
            }
        }
        for (T t2 : this.f137608l) {
            if (!mo98055a((Music) t2)) {
                MusicModel convertToMusicModel2 = t2.convertToMusicModel();
                C89219l.m154716b(convertToMusicModel2, "");
                if (m110078p()) {
                    fVar = EnumC60605f.ENABLE_PINNED;
                } else {
                    fVar = EnumC60605f.DISABLE_PINNED;
                }
                arrayList.add(new C60603d(convertToMusicModel2, fVar));
            }
        }
        mo23340a((Collection) arrayList);
        mo20662a((AbstractC89172b) C60436q.f137634a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo98055a(Music music) {
        List<Music> musicList;
        PinnedMusicList pinnedMusicList = this.f137607k;
        boolean z = false;
        if (!(pinnedMusicList == null || (musicList = pinnedMusicList.getMusicList()) == null)) {
            Iterator<T> it = musicList.iterator();
            while (it.hasNext()) {
                if (it.next().getId() == music.getId()) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23331a(C60437a aVar, AbstractC89124d<? super AbstractC17700f<C60437a>> dVar) {
        return m110073a(aVar);
    }
}
