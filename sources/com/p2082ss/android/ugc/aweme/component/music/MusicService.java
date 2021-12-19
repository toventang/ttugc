package com.p2082ss.android.ugc.aweme.component.music;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.aweme.ttsetting.C18161a;
import com.bytedance.scene.AbstractC22233n;
import com.bytedance.scene.C22217i;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34598e;
import com.p2082ss.android.ugc.aweme.choosemusic.activity.C35727e;
import com.p2082ss.android.ugc.aweme.choosemusic.activity.C35743f;
import com.p2082ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.p2082ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.choosemusic.bullet.jsb.ShootMusicMethod;
import com.p2082ss.android.ugc.aweme.choosemusic.model.AbstractC35864a;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35917s;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35919t;
import com.p2082ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a.AbstractC35878f;
import com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a.C35872c;
import com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a.C35877e;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.music.AbstractC60326a;
import com.p2082ss.android.ugc.aweme.music.C60789f;
import com.p2082ss.android.ugc.aweme.music.api.MusicApi;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.MusicCoverInfo;
import com.p2082ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import com.p2082ss.android.ugc.aweme.music.p3468c.AbstractC60747a;
import com.p2082ss.android.ugc.aweme.music.p3470e.C60756c;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AIMusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61137d;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61064a;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c;
import com.p2082ss.android.ugc.aweme.music.service.IMusicService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.settings.C68758v;
import com.p2082ss.android.ugc.aweme.settings.C68760x;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import com.p2082ss.android.ugc.musicprovider.C84158e;
import com.p2082ss.android.ugc.musicprovider.p4320c.C84131a;
import com.p2082ss.android.ugc.musicprovider.p4320c.C84141c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.component.music.MusicService */
public class MusicService implements IMusicService {

    /* renamed from: a */
    public C60789f f94267a;

    /* renamed from: b */
    private int f94268b = 2;

    /* renamed from: c */
    private AbstractC60747a f94269c;

    static {
        Covode.recordClassIndex(47941);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: b */
    public final void mo69313b() {
        this.f94268b = 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: c */
    public final int mo69314c() {
        return this.f94268b;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: h */
    public final AbstractC60747a mo69319h() {
        return this.f94269c;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: l */
    public final Class<?> mo69323l() {
        return ChooseMusicActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final void mo69303a(Context context, String str, boolean z, final ProgressDialog progressDialog, final AbstractC61064a aVar) {
        MusicModel convertToMusicModel;
        if (str == null) {
            try {
                aVar.mo98583a(new Exception());
            } catch (Exception e) {
                e.printStackTrace();
                aVar.mo98583a(e);
            }
        } else {
            final Music music = MusicApi.m110045a(str, 0).music;
            if (music == null || (convertToMusicModel = music.convertToMusicModel()) == null) {
                aVar.mo98583a(new Exception());
                return;
            }
            C60789f fVar = new C60789f(context, z);
            this.f94267a = fVar;
            fVar.mo98200a(convertToMusicModel, new AbstractC61065b() {
                /* class com.p2082ss.android.ugc.aweme.component.music.MusicService.C401561 */

                static {
                    Covode.recordClassIndex(47942);
                }

                @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                /* renamed from: a */
                public final void mo69324a() {
                }

                @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                /* renamed from: a */
                public final void mo69325a(int i) {
                }

                @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                /* renamed from: b */
                public final void mo69328b() {
                    ProgressDialog progressDialog = progressDialog;
                    if (progressDialog != null) {
                        progressDialog.show();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                /* renamed from: a */
                public final void mo69326a(C84125a aVar) {
                    ProgressDialog progressDialog = progressDialog;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    AbstractC61064a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo98583a(aVar);
                    }
                    MusicService.this.f94267a = null;
                }

                @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                /* renamed from: a */
                public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
                    MusicModel musicModel;
                    ProgressDialog progressDialog = progressDialog;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    if (aVar != null) {
                        try {
                            Music music = music;
                            if (music != null) {
                                musicModel = music.convertToMusicModel();
                            } else {
                                musicModel = null;
                            }
                            aVar.mo98584a(str, musicModel);
                        } catch (Exception e) {
                            aVar.mo98583a(e);
                        }
                    }
                    MusicService.this.f94267a = null;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final boolean mo69307a(MusicModel musicModel, Context context) {
        return C60826d.m110428a(musicModel, context, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final void mo69301a(Context context, MusicModel musicModel, int i, AbstractC61065b bVar) {
        if (musicModel != null) {
            C60789f fVar = new C60789f(context, true, false);
            fVar.f138135a = i;
            fVar.mo98200a(musicModel, bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final void mo69302a(Context context, String str, UrlModel urlModel, AbstractC61065b bVar) {
        C60789f fVar = new C60789f(context, false, false);
        C89219l.m154721d(str, "");
        C89219l.m154721d(urlModel, "");
        String b = C84158e.m144733a().mo128986b(str);
        CountDownLatch countDownLatch = new CountDownLatch(0);
        C89219l.m154716b(b, "");
        C60756c cVar = new C60756c(urlModel, b, str, countDownLatch);
        cVar.mo98173a(fVar.f138136b);
        cVar.f138055b = bVar;
        cVar.mo98174c();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final void mo69305a(AbstractC60747a aVar) {
        this.f94269c = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final void mo69300a(Activity activity, ViewGroup viewGroup, Bundle bundle, AbstractC89183m<Integer, Intent, C89391z> mVar, AbstractC89171a<C89391z> aVar) {
        MethodCollector.m26663i(3255);
        String string = activity.getString(R.string.ad6);
        if (CommerceMediaServiceImpl.m77578f().mo66513b()) {
            string = activity.getString(R.string.d_n);
        }
        bundle.putString("title", string);
        ActivityC0945e eVar = (ActivityC0945e) activity;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (viewGroup.findViewById(C35743f.m72934a()) == null) {
            C35727e eVar2 = new C35727e();
            eVar2.f52554r = bundle;
            FrameLayout frameLayout = new FrameLayout(eVar);
            frameLayout.setId(C35743f.m72934a());
            viewGroup.addView(frameLayout, -1, -1);
            C22217i.C22218a a = C22217i.m41761a(eVar, C35727e.class);
            a.f52533e = false;
            C22217i.C22218a a2 = a.mo36468a("attachChooseMusicScene");
            a2.f52534f = new C35743f.C35750g(eVar2);
            a2.f52530b = false;
            a2.f52531c = false;
            a2.f52535g = true;
            a2.f52532d = frameLayout.getId();
            AbstractC22233n a3 = a2.mo36469a();
            C89219l.m154716b(a3, "");
            AbstractC1174ac a4 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(ChooseMusicWithSceneViewModel.class);
            C89219l.m154716b(a4, "");
            ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) a4;
            C1213t<AbstractC35864a> d = chooseMusicWithSceneViewModel.mo62972d();
            C1213t<AbstractC35864a> c = chooseMusicWithSceneViewModel.mo62971c();
            C1213t<C35917s> b = chooseMusicWithSceneViewModel.mo62970b();
            C35743f.C35749f fVar = new C35743f.C35749f(d, eVar, a3, viewGroup, frameLayout, c, mVar);
            C35743f.C35748e eVar3 = new C35743f.C35748e(b, eVar, mVar);
            C35919t tVar = new C35919t(fVar, eVar3);
            C89219l.m154721d(tVar, "");
            chooseMusicWithSceneViewModel.mo62967a().setValue(tVar);
            c.observe(eVar, new C35743f.C35745b(fVar));
            d.observe(eVar, new C35743f.C35746c(aVar));
            b.observe(eVar, new C35743f.C35747d(eVar3));
        }
        MethodCollector.m26664o(3255);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final List<AbstractC16183k> mo69298a(C16248b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ShootMusicMethod(bVar));
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final void mo69299a() {
        C18161a.m33802a(new C61137d.C61138a());
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final boolean mo69308a(MusicModel musicModel, Context context, boolean z) {
        return C60826d.m110428a(musicModel, context, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final void mo69306a(Integer num) {
        C35872c.C35873a.m73265a().mo62973a(new C35877e(num.intValue(), null, false, 0), AbstractC35878f.C35880b.f84674a).mo143300g();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: d */
    public final void mo69315d() {
        C60789f fVar = this.f94267a;
        if (fVar != null) {
            fVar.mo98198a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: g */
    public final int mo69318g() {
        return C68760x.m121192a();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: e */
    public final String mo69316e() {
        ThirdMusicCoverItem a = C61137d.m110754a();
        if (a != null) {
            return a.musicCoverDisplayText;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: f */
    public final boolean mo69317f() {
        if (C16048b.m29633a().mo25412a(true, "music_player_loader_mode", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: j */
    public final void mo69321j() {
        C34597d.m70636c().mo61058b("has_receive_new_coupon", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: k */
    public final void mo69322k() {
        C35872c.C35873a.m73265a().f84663b.mo33461c();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: i */
    public final void mo69320i() {
        C34598e c = C34597d.m70636c();
        c.mo61056b("cold_start_times", c.mo61048a("cold_start_times", 0) + 1);
    }

    /* renamed from: m */
    public static IMusicService m81198m() {
        MethodCollector.m26663i(3270);
        Object a = C81908b.m141854a(IMusicService.class, false);
        if (a != null) {
            IMusicService iMusicService = (IMusicService) a;
            MethodCollector.m26664o(3270);
            return iMusicService;
        }
        if (C81908b.f183162aR == null) {
            synchronized (IMusicService.class) {
                try {
                    if (C81908b.f183162aR == null) {
                        C81908b.f183162aR = new MusicService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3270);
                    throw th;
                }
            }
        }
        MusicService musicService = (MusicService) C81908b.f183162aR;
        MethodCollector.m26664o(3270);
        return musicService;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: b */
    public final AbstractC60326a mo69310b(AbstractC61180m mVar) {
        return new AVMusicDownloadPlayHelper(mVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: b */
    public final String mo69311b(MusicModel musicModel) {
        if (musicModel.isPlayUrlValid()) {
            return C84158e.m144733a().mo128985a(musicModel.getUrl().getUrlList().get(0));
        }
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final AbstractC60326a mo69292a(AbstractC61180m mVar) {
        return new AIMusicDownloadPlayHelper(mVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: b */
    public final List<String> mo69312b(String str) {
        ThirdMusicCoverItem a = C61137d.m110754a();
        if (a == null) {
            return null;
        }
        List<MusicCoverInfo> list = a.musicCoverInfoList;
        if (C13603b.m24435a((Collection) list)) {
            return null;
        }
        for (MusicCoverInfo musicCoverInfo : list) {
            if (musicCoverInfo != null && TextUtils.equals(musicCoverInfo.partnerName, str)) {
                return musicCoverInfo.coverUrlList;
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final Music mo69293a(String str) {
        try {
            Music music = MusicApi.m110045a(str, 0).music;
            if (music != null) {
                return music;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final AbstractC61066c mo69294a(Context context) {
        if (mo69317f()) {
            return new C84131a((byte) 0);
        }
        return new C84141c(context, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final String mo69296a(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C1764a.m5929a(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C1764a.m5929a(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final String mo69297a(MusicModel musicModel) {
        if (C68758v.m121190a()) {
            return C84158e.m144733a().mo128986b(musicModel.getMusicId());
        }
        if (musicModel.isPlayUrlValid()) {
            return C84158e.m144733a().mo128986b(musicModel.getUrl().getUrlList().get(0));
        }
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final void mo69304a(TextView textView, Music music) {
        C61137d.m110755a(textView, music);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final C1731i<CollectedMusicList> mo69288a(int i, int i2) {
        return ChooseMusicApi.m72936a(i, 12, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final C1731i<BaseResponse> mo69290a(String str, int i) {
        return ChooseMusicApi.f84343a.collectMusic(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final MusicList mo69295a(int i, String str) {
        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            return MusicApi.f137504a.fetchCommerceStickPointMusicList(0, 20, i, str).get();
        }
        return MusicApi.f137504a.fetchStickPointMusicList(0, 20, i, str).get();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final C1731i<List<MusicModel>> mo69289a(int i, int i2, boolean z, int i3) {
        return ChooseMusicApi.m72937a(i, i2, z, i3, false).mo5532a(new AbstractC1729g<com.p2082ss.android.ugc.aweme.music.model.MusicList, List<MusicModel>>() {
            /* class com.p2082ss.android.ugc.aweme.component.music.MusicService.C401583 */

            static {
                Covode.recordClassIndex(47944);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ List<MusicModel> then(C1731i<com.p2082ss.android.ugc.aweme.music.model.MusicList> iVar) {
                if (iVar.mo5539b() || iVar.mo5544c() || iVar.mo5545d() == null) {
                    return null;
                }
                return C35937c.m73326a(iVar.mo5545d().items);
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: b */
    public final C1731i<SuggestMusicList> mo69309b(int i, int i2, boolean z, int i3) {
        return ChooseMusicApi.m72937a(i, i2, z, i3, true).mo5532a(new AbstractC1729g<com.p2082ss.android.ugc.aweme.music.model.MusicList, SuggestMusicList>() {
            /* class com.p2082ss.android.ugc.aweme.component.music.MusicService.C401594 */

            static {
                Covode.recordClassIndex(47945);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ SuggestMusicList then(C1731i<com.p2082ss.android.ugc.aweme.music.model.MusicList> iVar) {
                if (iVar.mo5539b() || iVar.mo5544c() || iVar.mo5545d() == null) {
                    return null;
                }
                SuggestMusicList suggestMusicList = new SuggestMusicList();
                suggestMusicList.musicList = C35937c.m73326a(iVar.mo5545d().items);
                suggestMusicList.cursor = iVar.mo5545d().getCursor();
                suggestMusicList.hasMore = iVar.mo5545d().isHasMore();
                return suggestMusicList;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicService
    /* renamed from: a */
    public final C1731i<SuggestMusicList> mo69291a(String str, String str2, String str3, long j, int i, int i2) {
        return ChooseMusicApi.f84343a.getRecommenMusicListFromAI(i2, i, "shoot_page", str, new StringBuilder().append(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().recommentMusicByAIPolicy()).toString(), str2, str3, j).mo5532a(new AbstractC1729g<com.p2082ss.android.ugc.aweme.music.model.MusicList, SuggestMusicList>() {
            /* class com.p2082ss.android.ugc.aweme.component.music.MusicService.C401572 */

            static {
                Covode.recordClassIndex(47943);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ SuggestMusicList then(C1731i<com.p2082ss.android.ugc.aweme.music.model.MusicList> iVar) {
                if (iVar.mo5544c() || iVar.mo5539b() || iVar.mo5545d() == null) {
                    return null;
                }
                SuggestMusicList suggestMusicList = new SuggestMusicList();
                suggestMusicList.musicList = C35937c.m73326a(iVar.mo5545d().items);
                suggestMusicList.musicType = Integer.valueOf(iVar.mo5545d().mMusicType);
                suggestMusicList.logPb = iVar.mo5545d().logPb;
                suggestMusicList.hasMore = iVar.mo5545d().isHasMore();
                suggestMusicList.cursor = iVar.mo5545d().getCursor();
                return suggestMusicList;
            }
        });
    }
}
