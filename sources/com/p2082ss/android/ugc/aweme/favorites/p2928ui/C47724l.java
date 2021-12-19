package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.favorites.p2919a.C47180c;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.MusicCategory;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.music.presenter.C60854k;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.l */
public class C47724l extends AbstractC47599a implements AbstractC47432f, AbstractC61180m, AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    private MusicDownloadPlayHelper f110628k;

    /* renamed from: l */
    private MusicModel f110629l;

    static {
        Covode.recordClassIndex(56346);
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

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new RunnableC90250g(C47724l.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(49, new RunnableC90250g(C47724l.class, "onMusicCollectEvent", C60793b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: r */
    public final void mo62890r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        super.mo59525f();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: h */
    public final MusicModel mo62885h() {
        return this.f110629l;
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

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: n */
    public final AbstractC39060f mo79782n() {
        return new C47180c(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f
    /* renamed from: a */
    public final void mo79703a() {
        super.onPause();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f110628k;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.aw_();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: l */
    public final void mo79781l() {
        if (this.f110455j != null) {
            this.f110455j.mo67838a((AbstractC39085b) new C60854k());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f110628k;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.aw_();
            this.f110628k.mo63045d();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f110628k;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.f138618n = false;
        }
    }

    /* renamed from: t */
    public final RecyclerView.AbstractC1350a mo79833t() {
        if (this.f110452c == null) {
            return new C47180c(this);
        }
        return this.f110452c;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: c */
    public final void mo79779c() {
        if (this.f110455j != null) {
            C18285c.m34003a("discovery_favorite_sounds_native_first_list_screen");
            this.f110455j.mo57616a(1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: k */
    public final void mo79780k() {
        if (this.f110455j != null) {
            this.f110455j.mo57616a(4);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f110628k;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.aw_();
            this.f110628k.f138618n = true;
        }
        if (this.f110452c != null) {
            ((C47180c) this.f110452c).mo79579l();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: q */
    public final void mo79785q() {
        C22999a aVar = new C22999a();
        aVar.f54431a = R.raw.icon_large_bookmark;
        aVar.f54435e = Integer.valueOf((int) R.attr.bd);
        this.f110451b.setStatus(new TuxStatusView.C23263c().mo37877a(aVar).mo37879a(getString(R.string.bs9)).mo37878a((CharSequence) getString(R.string.bs7)));
        this.f110451b.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: a */
    public final void mo79778a(View view) {
        super.mo79778a(view);
        C80330da.C80331a.m139266a("discovery_favorite_sounds_native_list_fps").mo123698a(this.f110450a);
    }

    @AbstractC90264r
    public void onAntiCrawlerEvent(C34569a aVar) {
        String str = aVar.f81610a;
        if (str != null && str.contains("/aweme/v1/user/music/collect/?")) {
            EventBus.m156962a().mo145397d(aVar);
            mo79779c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z && this.f110452c != null) {
            ((C47180c) this.f110452c).mo79579l();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f
    /* renamed from: a */
    public final void mo79704a(MusicModel musicModel) {
        if (musicModel != null) {
            this.f110629l = musicModel;
            this.f110628k.mo63041a(musicModel, 1, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: c */
    public final void mo62883c(final MusicModel musicModel) {
        final ActivityC0945e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String uuid = UUID.randomUUID().toString();
            final RecordConfig.Builder shootWay = new RecordConfig.Builder().creationId(uuid).shootWay("collection_music");
            shootWay.recordPresetResource(new RecordPresetResource(null, null, musicModel.getMusicId(), musicModel));
            AVExternalServiceImpl.m113114a().asyncService("MusicCollect", new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47724l.C477262 */

                static {
                    Covode.recordClassIndex(56348);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    asyncAVService.uiService().recordService().startRecord(activity, shootWay.build(), musicModel, true);
                }
            });
            C39162r.m79460a("shoot", new C33744d().mo59983a("creation_id", uuid).mo59983a("enter_from", "personal_homepage").mo59983a("content_source", "shoot").mo59983a("shoot_way", "collection_music").mo59983a("music_id", musicModel.getMusicId()).mo59983a("group_id", C70747dv.m124972a()).f79943a);
        }
    }

    @AbstractC90264r
    public void onMusicCollectEvent(C60793b bVar) {
        if (af_()) {
            List items = ((AbstractC39100a) this.f110455j.f92286h).getItems();
            MusicModel musicModel = bVar.f138151b;
            if (musicModel != null) {
                int size = items.size();
                Music music = musicModel.getMusic();
                if (music != null && music.getCollectStatus() != 1) {
                    if (!(this.f110455j == null || this.f110455j.f92286h == null || items.size() <= 0)) {
                        Iterator it = items.iterator();
                        while (it.hasNext()) {
                            Music music2 = (Music) it.next();
                            if (music2 != null && !TextUtils.isEmpty(music.getMid()) && music.getMid().equals(music2.getMid())) {
                                it.remove();
                            }
                        }
                    }
                    if (size != items.size()) {
                        this.f110452c.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f110628k.mo63043b();
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List list, boolean z) {
        C18285c.m34003a("discovery_favorite_sounds_native_render");
        super.mo59512a(list, z);
        this.f110450a.post(RunnableC47728n.f110639a);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = new MusicDownloadPlayHelper(this);
        this.f110628k = musicDownloadPlayHelper;
        musicDownloadPlayHelper.f138612h = new C47727m(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f
    /* renamed from: a */
    public final void mo79705a(MusicModel musicModel, int i, boolean z) {
        if (getActivity() == null || !MSAdaptionService.m97895c().mo89375b((Context) getActivity())) {
            MusicDownloadPlayHelper musicDownloadPlayHelper = this.f110628k;
            if (musicDownloadPlayHelper != null) {
                musicDownloadPlayHelper.f138615k = "music_collection";
                this.f110628k.f138617m = i;
                this.f110628k.f138616l = new MusicCategory("favorite_song");
                this.f110628k.mo98619a(musicModel, 7, true, false, z);
                return;
            }
            return;
        }
        Toast makeText = Toast.makeText(getActivity(), getActivity().getString(R.string.bed), 0);
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(makeText);
        }
        makeText.show();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62880a(String str, final MusicModel musicModel, String str2) {
        final ActivityC0945e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String uuid = UUID.randomUUID().toString();
            final RecordConfig.Builder musicOrigin = new RecordConfig.Builder().creationId(uuid).shootWay("collection_music").musicPath(str).musicOrigin(str2);
            AVExternalServiceImpl.m113114a().asyncService("MusicCollect", new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47724l.C477251 */

                static {
                    Covode.recordClassIndex(56347);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    asyncAVService.uiService().recordService().startRecord(activity, musicOrigin.build(), musicModel, true);
                }
            });
            C39162r.m79460a("shoot", new C33744d().mo59983a("creation_id", uuid).mo59983a("enter_from", "personal_homepage").mo59983a("content_source", "shoot").mo59983a("shoot_way", "collection_music").mo59983a("music_id", musicModel.getMusicId()).mo59983a("group_id", C70747dv.m124972a()).f79943a);
        }
    }
}
