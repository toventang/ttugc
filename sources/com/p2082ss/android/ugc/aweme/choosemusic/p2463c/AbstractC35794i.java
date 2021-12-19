package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.arch.C33933a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35899b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35755a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35991u;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.i */
public abstract class AbstractC35794i<T> extends AbstractC34586a implements AbstractC1214u<C33942b>, C33933a.AbstractC33934a<T>, AbstractC35827b, AbstractC60731k<C35757c>, AbstractC61180m, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    protected ChooseMusicDownloadPlayHelper f84489a;

    /* renamed from: b */
    protected MusicModel f84490b;

    /* renamed from: c */
    public boolean f84491c = true;

    /* renamed from: d */
    protected C35899b f84492d;

    /* renamed from: e */
    public DataCenter f84493e;

    /* renamed from: j */
    protected AbstractC33936c<T> f84494j;

    /* renamed from: k */
    protected int f84495k;

    /* renamed from: l */
    protected int f84496l;

    /* renamed from: m */
    private C33933a f84497m;

    static {
        Covode.recordClassIndex(43033);
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

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC33936c<T> mo62831b(View view);

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: c */
    public final void mo62883c(MusicModel musicModel) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo62884g() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(49, new RunnableC90250g(AbstractC35794i.class, "onMusicCollectEvent", C60793b.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo62834o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract String mo62835p();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo62836q();

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: r */
    public final void mo62890r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: h */
    public final MusicModel mo62885h() {
        return this.f84490b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62830a(String str, final MusicModel musicModel, String str2, final Activity activity) {
        if (this.f84496l == 1) {
            final RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.musicOrigin(str2).musicModel(musicModel).musicPath(str).shootWay("single_song");
            AVExternalServiceImpl.m113114a().asyncService("BaseMuiscList", new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i.C357962 */

                static {
                    Covode.recordClassIndex(43035);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    asyncAVService.uiService().recordService().startRecord(activity, builder.build(), musicModel, true);
                    activity.finish();
                }
            });
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        activity.setResult(-1, intent);
        activity.finish();
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
    public RecyclerView.AbstractC1350a mo62887k() {
        AbstractC33936c<T> cVar = this.f84494j;
        if (cVar != null) {
            return cVar.mo60179c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final ShareInfo mo62888n() {
        DataCenter dataCenter = this.f84493e;
        if (dataCenter != null) {
            return (ShareInfo) dataCenter.mo60192a("data_share_info");
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84489a;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.aw_();
            this.f84489a.mo63045d();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84489a;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.f138618n = false;
        }
    }

    /* renamed from: l */
    private boolean mo62679l() {
        if (getActivity().getIntent() != null) {
            return getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public void mo60168a() {
        this.f84492d = new C35899b(getContext(), this.f84493e);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84489a;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.aw_();
            this.f84489a.f138618n = true;
        }
        RecyclerView.AbstractC1350a k = mo62887k();
        if (k instanceof C35703b) {
            ((C35703b) k).mo62745a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: e */
    public DataCenter mo60172e() {
        if (this.f84493e == null) {
            this.f84493e = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        }
        this.f84493e.mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("play_compeleted", (AbstractC1214u<C33942b>) this);
        this.f84493e.mo60189a("music_loading", (AbstractC1214u<C33942b>) this);
        this.f84493e.mo60189a("data_share_info", (AbstractC1214u<C33942b>) this);
        return this.f84493e;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
    /* renamed from: a */
    public final void mo62874a(MusicDownloadPlayHelper.AbstractC61086a aVar) {
        this.f84489a.f138612h = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final AbstractC33936c<T> mo60167a(View view) {
        if (this.f84494j == null) {
            this.f84494j = mo62831b(view);
        }
        return this.f84494j;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
    /* renamed from: b */
    public final void mo62881b(MusicModel musicModel) {
        this.f84489a.f138615k = mo62835p();
        this.f84489a.mo97993a(musicModel, mo62834o(), true, mo62679l());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62873a(C35755a aVar) {
        int i;
        if (aVar.f84357a == 1) {
            if (aVar.f84360d == 1) {
                i = R.string.ah3;
            } else {
                i = R.string.a92;
            }
        } else if (aVar.f84360d == 1) {
            i = R.string.ah8;
        } else {
            i = R.string.a93;
        }
        new C79459a(getActivity()).mo123050a(i).mo123053a();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f84496l = i;
        int i2 = 0;
        if (getArguments() != null) {
            i2 = getArguments().getInt("sound_page_scene", 0);
        }
        this.f84495k = i2;
    }

    @AbstractC90264r(mo145423b = true)
    public void onMusicCollectEvent(C60793b bVar) {
        if (this.f84493e != null && bVar != null && "music_detail".equals(bVar.f138152c)) {
            this.f84493e.mo60191a("music_collect_status", new C35755a(0, bVar.f138150a, -1, -1, bVar.f138151b));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
    /* renamed from: a */
    public final void mo62875a(MusicModel musicModel) {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f84489a;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.aw_();
        }
    }

    /* renamed from: a */
    public void onChanged(C33942b bVar) {
        MusicModel.CollectionType collectionType;
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            switch (str.hashCode()) {
                case -2102085437:
                    if (str.equals("data_share_info")) {
                        AbstractC33936c<T> cVar = this.f84494j;
                        if (cVar instanceof C35991u) {
                            C35991u uVar = (C35991u) cVar;
                            if (!CommerceMediaServiceImpl.m77578f().mo66513b() && !CommerceMediaServiceImpl.m77578f().mo66517e()) {
                                uVar.f84950a.setEndBtnIcon(2131232350);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case -1635157503:
                    if (str.equals("music_collect_status")) {
                        C35755a aVar = (C35755a) bVar.mo60212a();
                        AbstractC33936c<T> cVar2 = this.f84494j;
                        if (!(cVar2 == null || cVar2.mo60179c() == null)) {
                            List<T> e = this.f84494j.mo60179c().mo63369e();
                            if (!C13603b.m24435a((Collection) e)) {
                                if (aVar.f84357a == 1) {
                                    if (e.size() > aVar.f84359c) {
                                        this.f84494j.mo60179c().notifyItemChanged(aVar.f84359c);
                                    }
                                } else if (aVar.f84359c == -1) {
                                    MusicModel a = C35937c.m73324a(e, aVar.f84361e.getMusicId());
                                    if (a != null) {
                                        if (aVar.f84360d == 1) {
                                            collectionType = MusicModel.CollectionType.COLLECTED;
                                        } else {
                                            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                        }
                                        a.setCollectionType(collectionType);
                                        int indexOf = e.indexOf(a);
                                        if (indexOf >= 0 && indexOf < e.size() && mo62884g()) {
                                            this.f84494j.mo60179c().notifyItemChanged(indexOf);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (getUserVisibleHint()) {
                            mo62873a(aVar);
                            return;
                        }
                        return;
                    }
                    return;
                case -1322093457:
                    if (str.equals("play_compeleted") && (mo62887k() instanceof C35703b)) {
                        ((C35703b) mo62887k()).mo62745a();
                        return;
                    }
                    return;
                case 502104354:
                    if (str.equals("music_loading") && this.f84494j != null) {
                        Integer num = (Integer) this.f84493e.mo60192a("music_position");
                        if (num != null) {
                            num.intValue();
                        }
                        ((C35703b) mo62887k()).mo62747a(((Boolean) this.f84493e.mo60192a("music_loading")).booleanValue());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k
    /* renamed from: a */
    public final /* synthetic */ void mo62879a(C35757c cVar) {
        C35757c cVar2 = cVar;
        String str = cVar2.f84364b;
        MusicModel musicModel = cVar2.f84363a;
        if ("follow_type".equals(str)) {
            this.f84492d.mo63022a(musicModel, musicModel.getMusicId(), 1, cVar2.f84365c, cVar2.f84366d);
        } else if ("unfollow_type".equals(str)) {
            this.f84492d.mo63022a(musicModel, musicModel.getMusicId(), 0, cVar2.f84365c, cVar2.f84366d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f84497m == null) {
            this.f84497m = new C33933a(this);
        }
        this.f84497m.mo60166a(view);
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = new ChooseMusicDownloadPlayHelper(this, new ChooseMusicDownloadPlayHelper.AbstractC35934a() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35794i.C357951 */

            static {
                Covode.recordClassIndex(43034);
            }

            @Override // com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.AbstractC35934a
            /* renamed from: a */
            public final void mo62891a() {
                if (AbstractC35794i.this.f84490b != null) {
                    AbstractC35794i.this.f84493e.mo60191a("play_compeleted", AbstractC35794i.this.f84490b.getMusicId());
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.AbstractC35934a
            /* renamed from: b */
            public final void mo62892b() {
                if (AbstractC35794i.this.f84490b != null) {
                    AbstractC35794i.this.f84493e.mo60191a("play_error", AbstractC35794i.this.f84490b.getMusicId());
                }
            }
        });
        this.f84489a = chooseMusicDownloadPlayHelper;
        chooseMusicDownloadPlayHelper.mo63043b();
        this.f84489a.mo98622b(this.f84496l);
        RecyclerView.AbstractC1350a k = mo62887k();
        if (k instanceof C35703b) {
            this.f84489a.f84802a = ((C35703b) k).f84222e;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b
    /* renamed from: a */
    public final void mo62877a(MusicModel musicModel, C35754b bVar) {
        this.f84490b = musicModel;
        this.f84493e.mo60191a("music_loading", (Object) true);
        if (this.f84491c) {
            this.f84489a.f84802a = bVar;
            this.f84489a.mo63041a(musicModel, mo62834o(), false);
            return;
        }
        this.f84489a.mo97993a(musicModel, mo62834o(), true, mo62679l());
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, mo62836q(), viewGroup, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
    /* renamed from: a */
    public final void mo62880a(String str, MusicModel musicModel, String str2) {
        ActivityC0945e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AVExternalServiceImpl.m113114a().publishService().setCurMusic(musicModel, true, false);
            mo62830a(str, musicModel, str2, activity);
        }
    }
}
