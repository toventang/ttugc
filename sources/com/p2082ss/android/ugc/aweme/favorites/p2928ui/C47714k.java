package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bridge.magpie.C13427b;
import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.bridge.magpie.p885d.AbstractC13444c;
import com.bytedance.bridge.magpie.p885d.AbstractC13445d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.C15531c;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.p1107a.AbstractC15507c;
import com.bytedance.hybrid.spark.page.C15593c;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39108i;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47436b;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.MusicCategory;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.music.presenter.C60854k;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.k */
public final class C47714k extends AbstractC34586a implements AbstractC39102c<Music>, AbstractC39103d<Music>, AbstractC47713j, AbstractC61180m, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public MusicDownloadPlayHelper f110606a;

    /* renamed from: b */
    public final C39101b<AbstractC39100a<Music, CollectedMusicList>> f110607b = new C39101b<>();

    /* renamed from: c */
    MusicModel f110608c;

    /* renamed from: d */
    private boolean f110609d;

    /* renamed from: e */
    private boolean f110610e;

    /* renamed from: j */
    private long f110611j = -1;

    /* renamed from: k */
    private SparseArray f110612k;

    static {
        Covode.recordClassIndex(56336);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62876a(MusicModel musicModel, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62878a(MusicModel musicModel, Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final void mo62668a(List<Music> list, int i) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.common.e.i] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final boolean mo62670a(C39108i<Music> iVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: b */
    public final void mo62671b(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<Music> list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new RunnableC90250g(C47714k.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(49, new RunnableC90250g(C47714k.class, "onMusicCollectEvent", C60793b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: r */
    public final void mo62890r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: h */
    public final MusicModel mo62885h() {
        return this.f110608c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo79826a(Map<String, ? extends Object> map) {
        AbstractC21154h kitView;
        this.f110609d = true;
        C15593c k = m90717k();
        if (k != null && (kitView = k.getKitView()) != null) {
            kitView.updateData(map);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    public final boolean bT_() {
        return af_();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: i */
    public final Activity mo62886i() {
        return getActivity();
    }

    /* renamed from: k */
    private final C15593c m90717k() {
        View view = getView();
        if (!(view instanceof C15593c)) {
            view = null;
        }
        return (C15593c) view;
    }

    /* renamed from: l */
    private static boolean m90718l() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo79827c() {
        this.f110608c = null;
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f110606a;
        if (musicDownloadPlayHelper == null) {
            C89219l.m154710a("musicDownloadPlayHelper");
        }
        musicDownloadPlayHelper.aw_();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        m90716d(new ArrayList(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo79828d() {
        AbstractC21154h kitView;
        C15593c k = m90717k();
        if (k != null && (kitView = k.getKitView()) != null) {
            kitView.mo34726a("onPageJumped", C89086z.INSTANCE);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mo79827c();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f110606a;
        if (musicDownloadPlayHelper == null) {
            C89219l.m154710a("musicDownloadPlayHelper");
        }
        musicDownloadPlayHelper.mo63045d();
        SparseArray sparseArray = this.f110612k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: a */
    public static boolean m90715a() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean l = m90718l();
        C58029j.f132256h = l;
        return l;
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47713j
    public final void bm_() {
        AbstractC39100a aVar;
        List items;
        if (!this.f110609d || !((aVar = (AbstractC39100a) this.f110607b.f92286h) == null || (items = aVar.getItems()) == null || !items.isEmpty())) {
            if (!this.f110610e) {
                this.f110611j = System.currentTimeMillis();
            }
            this.f110607b.mo57616a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.k$a */
    public static final class C47715a implements AbstractC63212bb.AbstractC63213a {

        /* renamed from: a */
        final /* synthetic */ C47714k f110613a;

        /* renamed from: b */
        final /* synthetic */ int f110614b;

        /* renamed from: c */
        final /* synthetic */ Music f110615c;

        static {
            Covode.recordClassIndex(56337);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
        public final void onSuccess() {
            boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            if (this.f110613a.getActivity() == null || !MSAdaptionService.m97895c().mo89375b((Context) this.f110613a.getActivity())) {
                C47714k.m90712a(this.f110613a).f138615k = "music_collection";
                C47714k.m90712a(this.f110613a).f138617m = this.f110614b;
                C47714k.m90712a(this.f110613a).f138616l = new MusicCategory("favorite_song", null, 2, null);
                C47714k.m90712a(this.f110613a).mo98619a(this.f110615c.convertToMusicModel(), 7, true, false, downloadEffectOrMusicAfterEnterCamera);
                return;
            }
            ActivityC0945e activity = this.f110613a.getActivity();
            ActivityC0945e activity2 = this.f110613a.getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            Toast makeText = Toast.makeText(activity, activity2.getString(R.string.bed), 0);
            if (Build.VERSION.SDK_INT == 25) {
                C80567ic.m139657a(makeText);
            }
            makeText.show();
        }

        C47715a(C47714k kVar, int i, Music music) {
            this.f110613a = kVar;
            this.f110614b = i;
            this.f110615c = music;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.k$b */
    public static final class C47716b extends AbstractC15507c {

        /* renamed from: a */
        final /* synthetic */ C47714k f110616a;

        static {
            Covode.recordClassIndex(56338);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47716b(C47714k kVar) {
            this.f110616a = kVar;
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo25381a(AbstractC21154h hVar) {
            C89219l.m154721d(hVar, "");
            super.mo25381a(hVar);
            C47714k kVar = this.f110616a;
            C13431b bVar = new C13431b();
            bVar.mo21654a("loadMore");
            bVar.f32748d = new C47719e(kVar);
            C13431b bVar2 = new C13431b();
            bVar2.mo21654a("jumpToMusicDetail");
            bVar2.f32748d = new C47720f(kVar);
            C13431b bVar3 = new C13431b();
            bVar3.mo21654a("play");
            bVar3.f32748d = new C47721g(kVar);
            C13431b bVar4 = new C13431b();
            bVar4.mo21654a("pause");
            bVar4.f32748d = new C47722h(kVar);
            C13431b bVar5 = new C13431b();
            bVar5.mo21654a("handleCreate");
            bVar5.f32748d = new C47723i(kVar);
            C13427b bVar6 = (C13427b) hVar.getHybridContext().mo34746a(C13427b.class);
            if (bVar6 != null) {
                bVar6.mo21646a(bVar);
                bVar6.mo21646a(bVar2);
                bVar6.mo21646a(bVar3);
                bVar6.mo21646a(bVar4);
                bVar6.mo21646a(bVar5);
            }
            C18285c.m34006b("discovery_favorite_sounds_lynx_load");
            C47714k kVar2 = this.f110616a;
            AbstractC39100a aVar = (AbstractC39100a) kVar2.f110607b.f92286h;
            C89219l.m154716b(aVar, "");
            List items = aVar.getItems();
            C89219l.m154716b(items, "");
            kVar2.mo79826a(C89041ag.m154421a(C89387v.m154943a("isRTL", Boolean.valueOf(C80471gb.m139482a())), C89387v.m154943a("data", C47714k.m90713a(items))));
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: b */
        public final void mo25384b(AbstractC21154h hVar, String str) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(str, "");
            C18285c.m34004a("discovery_favorite_sounds_lynx_load", -1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.k$e */
    public static final class C47719e implements AbstractC13444c {

        /* renamed from: a */
        final /* synthetic */ C47714k f110623a;

        static {
            Covode.recordClassIndex(56341);
        }

        C47719e(C47714k kVar) {
            this.f110623a = kVar;
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13444c
        /* renamed from: a */
        public final void mo21670a(String str, String str2, AbstractC13445d dVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(dVar, "");
            if (!this.f110623a.f110607b.mo67842j()) {
                AbstractC39100a aVar = (AbstractC39100a) this.f110623a.f110607b.f92286h;
                C89219l.m154716b(aVar, "");
                if (aVar.isHasMore()) {
                    this.f110623a.f110607b.mo57616a(4);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.k$f */
    public static final class C47720f implements AbstractC13444c {

        /* renamed from: a */
        final /* synthetic */ C47714k f110624a;

        static {
            Covode.recordClassIndex(56342);
        }

        C47720f(C47714k kVar) {
            this.f110624a = kVar;
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13444c
        /* renamed from: a */
        public final void mo21670a(String str, String str2, AbstractC13445d dVar) {
            Object obj;
            Context context;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(dVar, "");
            String string = new JSONObject(str2).getString("mid");
            AbstractC39100a aVar = (AbstractC39100a) this.f110624a.f110607b.f92286h;
            C89219l.m154716b(aVar, "");
            List items = aVar.getItems();
            C89219l.m154716b(items, "");
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Music music = (Music) obj;
                C89219l.m154716b(music, "");
                if (C89219l.m154714a((Object) music.getMid(), (Object) string)) {
                    break;
                }
            }
            Music music2 = (Music) obj;
            if (music2 != null) {
                C47714k kVar = this.f110624a;
                View view = kVar.getView();
                if (!(view == null || (context = view.getContext()) == null)) {
                    C47436b.m90457a(context, kVar.getView(), music2, "collection_music", "", C60826d.m110428a(music2.convertToMusicModel(), context, true));
                    kVar.mo79827c();
                    kVar.mo79828d();
                }
                C47714k.m90714a(music2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.k$g */
    public static final class C47721g implements AbstractC13444c {

        /* renamed from: a */
        final /* synthetic */ C47714k f110625a;

        static {
            Covode.recordClassIndex(56343);
        }

        C47721g(C47714k kVar) {
            this.f110625a = kVar;
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13444c
        /* renamed from: a */
        public final void mo21670a(String str, String str2, AbstractC13445d dVar) {
            Object obj;
            Context context;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(dVar, "");
            String string = new JSONObject(str2).getString("mid");
            AbstractC39100a aVar = (AbstractC39100a) this.f110625a.f110607b.f92286h;
            C89219l.m154716b(aVar, "");
            List items = aVar.getItems();
            C89219l.m154716b(items, "");
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Music music = (Music) obj;
                C89219l.m154716b(music, "");
                if (C89219l.m154714a((Object) music.getMid(), (Object) string)) {
                    break;
                }
            }
            Music music2 = (Music) obj;
            if (music2 != null) {
                C47714k kVar = this.f110625a;
                View view = kVar.getView();
                if (!(view == null || (context = view.getContext()) == null)) {
                    if (!C47714k.m90715a()) {
                        new C79459a(context).mo123050a(R.string.dcq).mo123053a();
                    } else {
                        kVar.mo79827c();
                        MusicModel convertToMusicModel = music2.convertToMusicModel();
                        if (C60826d.m110428a(convertToMusicModel, context, true)) {
                            kVar.f110608c = convertToMusicModel;
                            MusicDownloadPlayHelper musicDownloadPlayHelper = kVar.f110606a;
                            if (musicDownloadPlayHelper == null) {
                                C89219l.m154710a("musicDownloadPlayHelper");
                            }
                            musicDownloadPlayHelper.mo63041a(music2.convertToMusicModel(), 1, false);
                        }
                    }
                }
                C47714k.m90714a(music2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.k$h */
    public static final class C47722h implements AbstractC13444c {

        /* renamed from: a */
        final /* synthetic */ C47714k f110626a;

        static {
            Covode.recordClassIndex(56344);
        }

        C47722h(C47714k kVar) {
            this.f110626a = kVar;
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13444c
        /* renamed from: a */
        public final void mo21670a(String str, String str2, AbstractC13445d dVar) {
            Object obj;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(dVar, "");
            String string = new JSONObject(str2).getString("mid");
            AbstractC39100a aVar = (AbstractC39100a) this.f110626a.f110607b.f92286h;
            C89219l.m154716b(aVar, "");
            List items = aVar.getItems();
            C89219l.m154716b(items, "");
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Music music = (Music) obj;
                C89219l.m154716b(music, "");
                if (C89219l.m154714a((Object) music.getMid(), (Object) string)) {
                    break;
                }
            }
            Music music2 = (Music) obj;
            if (music2 != null) {
                this.f110626a.mo79827c();
                C47714k.m90714a(music2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.k$i */
    public static final class C47723i implements AbstractC13444c {

        /* renamed from: a */
        final /* synthetic */ C47714k f110627a;

        static {
            Covode.recordClassIndex(56345);
        }

        C47723i(C47714k kVar) {
            this.f110627a = kVar;
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13444c
        /* renamed from: a */
        public final void mo21670a(String str, String str2, AbstractC13445d dVar) {
            Object obj;
            Context context;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(dVar, "");
            String string = new JSONObject(str2).getString("mid");
            AbstractC39100a aVar = (AbstractC39100a) this.f110627a.f110607b.f92286h;
            C89219l.m154716b(aVar, "");
            List items = aVar.getItems();
            C89219l.m154716b(items, "");
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Music music = (Music) obj;
                C89219l.m154716b(music, "");
                if (C89219l.m154714a((Object) music.getMid(), (Object) string)) {
                    break;
                }
            }
            Music music2 = (Music) obj;
            if (music2 != null) {
                AbstractC39100a aVar2 = (AbstractC39100a) this.f110627a.f110607b.f92286h;
                C89219l.m154716b(aVar2, "");
                int indexOf = aVar2.getItems().indexOf(music2);
                C47714k kVar = this.f110627a;
                View view = kVar.getView();
                if (!(view == null || (context = view.getContext()) == null)) {
                    if (!C47714k.m90715a()) {
                        new C79459a(context).mo123050a(R.string.dcq).mo123053a();
                    } else if (MusicService.m81198m().mo69308a(kVar.f110608c, context, true)) {
                        Activity j = C17873f.m33102j();
                        if (j == null || j.isFinishing()) {
                            C17867d.m33078a();
                        }
                        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                        createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService().mo101685a(new C47715a(kVar, indexOf, music2));
                    }
                }
                C47714k.m90714a(music2);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MusicDownloadPlayHelper m90712a(C47714k kVar) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = kVar.f110606a;
        if (musicDownloadPlayHelper == null) {
            C89219l.m154710a("musicDownloadPlayHelper");
        }
        return musicDownloadPlayHelper;
    }

    /* renamed from: a */
    public static void m90714a(Music music) {
        C47434a.m90448a(music.getMid(), "collection_music", "");
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z && !isDetached() && af_()) {
            mo79827c();
            mo79828d();
        }
    }

    @AbstractC90264r
    public final void onAntiCrawlerEvent(C34569a aVar) {
        C89219l.m154721d(aVar, "");
        String str = aVar.f81610a;
        if (str != null && C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/user/music/collect/?", false)) {
            EventBus.m156962a().mo145397d(aVar);
            if (!this.f110610e) {
                this.f110611j = System.currentTimeMillis();
            }
            this.f110607b.mo57616a(1);
        }
    }

    @AbstractC90264r
    public final void onMusicCollectEvent(C60793b bVar) {
        C89219l.m154721d(bVar, "");
        if (af_()) {
            if (!this.f110610e) {
                this.f110611j = System.currentTimeMillis();
            }
            this.f110607b.mo57616a(1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: c */
    public final void mo62883c(MusicModel musicModel) {
        C89219l.m154721d(musicModel, "");
        ActivityC0945e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            AVExternalServiceImpl.m113114a().asyncService("MusicCollect", new C47718d(activity, new RecordConfig.Builder().creationId(uuid).shootWay("collection_music").recordPresetResource(new RecordPresetResource(null, null, musicModel.getMusicId(), musicModel)).build(), musicModel));
            mo79828d();
            C39162r.m79460a("shoot", new C33744d().mo59983a("creation_id", uuid).mo59983a("enter_from", "personal_homepage").mo59983a("content_source", "shoot").mo59983a("shoot_way", "collection_music").mo59983a("music_id", musicModel.getMusicId()).mo59983a("group_id", C70747dv.m124972a()).f79943a);
        }
    }

    /* renamed from: a */
    static List<Map<String, Object>> m90713a(List<Music> list) {
        Object obj;
        String a;
        boolean z;
        ExternalMusicInfo externalMusicInfo;
        String partnerName;
        UrlModel coverThumb;
        List<String> urlList;
        List<String> urlList2;
        List<String> urlList3;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            C89378p[] pVarArr = new C89378p[8];
            boolean z2 = false;
            pVarArr[0] = C89387v.m154943a("mid", t.getMid());
            UrlModel coverMedium = t.getCoverMedium();
            String str = null;
            if ((coverMedium == null || (urlList3 = coverMedium.getUrlList()) == null || (obj = C89070n.m154561b((List) urlList3, 0)) == null) && ((coverThumb = t.getCoverThumb()) == null || (urlList2 = coverThumb.getUrlList()) == null || (obj = C89070n.m154561b((List) urlList2, 0)) == null)) {
                UrlModel coverLarge = t.getCoverLarge();
                if (!(coverLarge == null || (urlList = coverLarge.getUrlList()) == null)) {
                    str = C89070n.m154561b((List) urlList, 0);
                }
            } else {
                str = obj;
            }
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            pVarArr[1] = C89387v.m154943a("coverUrl", str);
            pVarArr[2] = C89387v.m154943a("musicName", t.getMusicName());
            pVarArr[3] = C89387v.m154943a("musicAuthor", t.getAuthorName());
            if (C16048b.m29633a().mo25421a(true, "remove_15s_cap_music", true)) {
                a = C60826d.m110423a(t.getPresenterDuration() * 1000);
            } else {
                a = C60826d.m110423a(t.getDuration() * 1000);
            }
            pVarArr[4] = C89387v.m154943a("musicLen", a);
            String musicName = t.getMusicName();
            C89219l.m154716b(musicName, str2);
            if (musicName.length() <= 0 || (!t.isOriginMusic() && !t.isArtistMusic())) {
                z = false;
            } else {
                z = true;
            }
            pVarArr[5] = C89387v.m154943a("isOriginal", Boolean.valueOf(z));
            List<ExternalMusicInfo> externalMusicInfos = t.getExternalMusicInfos();
            if (!(externalMusicInfos == null || (externalMusicInfo = (ExternalMusicInfo) C89070n.m154583g((List) externalMusicInfos)) == null || (partnerName = externalMusicInfo.getPartnerName()) == null)) {
                str2 = partnerName;
            }
            pVarArr[6] = C89387v.m154943a("partnerTag", str2);
            if (t.getMatchedPGCSoundInfo() != null) {
                z2 = true;
            }
            pVarArr[7] = C89387v.m154943a("isUgcToPgcMeta", Boolean.valueOf(z2));
            arrayList.add(C89041ag.m154421a(pVarArr));
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.k$c */
    public static final class C47717c extends SimpleServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f110617a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig f110618b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f110619c;

        static {
            Covode.recordClassIndex(56339);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f110617a, this.f110618b, this.f110619c, true);
        }

        C47717c(ActivityC0945e eVar, RecordConfig recordConfig, MusicModel musicModel) {
            this.f110617a = eVar;
            this.f110618b = recordConfig;
            this.f110619c = musicModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.k$d */
    public static final class C47718d extends SimpleServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Activity f110620a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig f110621b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f110622c;

        static {
            Covode.recordClassIndex(56340);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f110620a, this.f110621b, this.f110622c, true);
        }

        C47718d(Activity activity, RecordConfig recordConfig, MusicModel musicModel) {
            this.f110620a = activity;
            this.f110621b = recordConfig;
            this.f110622c = musicModel;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Music> list, boolean z) {
        if (list != null) {
            m90716d(list, z);
        }
    }

    /* renamed from: d */
    private final void m90716d(List<Music> list, boolean z) {
        mo79826a(C89041ag.m154421a(C89387v.m154943a("data", m90713a(list)), C89387v.m154943a("hasMore", Boolean.valueOf(z))));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<Music> list, boolean z) {
        AbstractC21154h kitView;
        C89219l.m154721d(list, "");
        if (!this.f110610e) {
            C18285c.m34003a("discovery_favorite_sounds_lynx_render");
            m90716d(list, z);
            C18285c.m34006b("discovery_favorite_sounds_lynx_render");
            if (this.f110611j != -1) {
                C18285c.m34004a("discovery_favorite_sounds_lynx_first_list_screen", System.currentTimeMillis() - this.f110611j);
            }
            C15593c k = m90717k();
            View view = null;
            if (!(k == null || (kitView = k.getKitView()) == null)) {
                view = kitView.mo34724a();
            }
            if (view instanceof ViewGroup) {
                loop0:
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i = 0;
                    int childCount = viewGroup.getChildCount();
                    while (true) {
                        if (i >= childCount) {
                            break loop0;
                        } else if (viewGroup.getChildAt(i) instanceof RecyclerView) {
                            View childAt = viewGroup.getChildAt(i);
                            Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                            RecyclerView recyclerView = (RecyclerView) childAt;
                            if (recyclerView != null) {
                                C80330da.C80331a.m139266a("discovery_favorite_sounds_lynx_list_fps").mo123698a(recyclerView);
                            }
                        } else if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    view = viewGroup.getChildAt(i);
                    Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            this.f110610e = true;
            return;
        }
        m90716d(list, z);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        this.f110606a = new MusicDownloadPlayHelper(this);
        this.f110607b.mo67839a_(this);
        this.f110607b.mo67838a((AbstractC39085b) new C60854k());
        SparkContext sparkContext = new SparkContext();
        sparkContext.mo25238a("aweme://lynxview/?hide_nav_bar=1&channel=discovery_favorite_music_collection&bundle=pages%2Fmusic_collection%2Ftemplate.js&dynamic=1&group=discovery_favorite_music_collection&surl=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F10%2Fgecko%2Fresource%2Fdiscovery_favorite_music_collection%2Fpages%2Fmusic_collection%2Ftemplate.js");
        sparkContext.mo25237a(new C47716b(this));
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        C15593c b = C15531c.C15532a.m28665a(context, sparkContext).mo25317b();
        b.mo25371a(sparkContext);
        C18285c.m34003a("discovery_favorite_sounds_lynx_load");
        b.mo25374c();
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62880a(String str, MusicModel musicModel, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(str2, "");
        ActivityC0945e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            AVExternalServiceImpl.m113114a().asyncService("MusicCollect", new C47717c(activity, new RecordConfig.Builder().creationId(uuid).shootWay("collection_music").musicPath(str).musicOrigin(str2).build(), musicModel));
            mo79828d();
            C39162r.m79460a("shoot", new C33744d().mo59983a("creation_id", uuid).mo59983a("enter_from", "personal_homepage").mo59983a("content_source", "shoot").mo59983a("shoot_way", "collection_music").mo59983a("music_id", musicModel.getMusicId()).mo59983a("group_id", C70747dv.m124972a()).f79943a);
        }
    }
}
