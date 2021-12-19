package com.p2082ss.android.ugc.aweme.music.service;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.SafeHandler;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w;
import com.p2082ss.android.ugc.aweme.music.p3481ui.ProgressDialogC61165e;
import com.p2082ss.android.ugc.aweme.music.service.IMusicRecordService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ReshootConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.UUID;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.music.service.e */
public final class C61068e implements IMusicRecordService {

    /* renamed from: a */
    public boolean f138544a = true;

    /* renamed from: b */
    public long f138545b;

    /* renamed from: c */
    public ProgressDialog f138546c;

    /* renamed from: d */
    public ProgressDialogC61165e f138547d;

    /* renamed from: e */
    public C61225w f138548e;

    /* renamed from: f */
    public SafeHandler f138549f;

    /* renamed from: g */
    public boolean f138550g;

    static {
        Covode.recordClassIndex(71666);
    }

    /* renamed from: a */
    public final void mo98594a(boolean z) {
        if (z) {
            this.f138550g = false;
            C80273bt.m139146b(this.f138547d);
            this.f138547d = null;
        }
        ProgressDialog progressDialog = this.f138546c;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: a */
    public static ArrayList<String> m110615a(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String[] split = str.split(",");
        for (String str2 : split) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo98593a(boolean z, Activity activity, MusicModel musicModel, String str, int i, C1731i iVar) {
        String str2;
        if (this.f138544a) {
            if (iVar.mo5535a()) {
                Music music = (Music) iVar.mo5545d();
                if (music == null || TextUtils.isEmpty(music.getOwnerBanShowInfo())) {
                    C61225w wVar = this.f138548e;
                    if (!TextUtils.isEmpty(str)) {
                        ArrayList<String> a = m110615a(str);
                        if (!a.isEmpty()) {
                            str2 = a.get(0);
                            wVar.mo98755a(musicModel, str2, i, z);
                        }
                    }
                    str2 = null;
                    wVar.mo98755a(musicModel, str2, i, z);
                } else {
                    mo98594a(z);
                    new C23144b(activity).mo37635a(music.getOwnerBanShowInfo()).mo37637b();
                }
            } else {
                mo98594a(z);
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicRecordService
    public final void startRecord(AbstractC1204m mVar, final Activity activity, MusicModel musicModel, final String str, final String str2, final IMusicRecordService.AbstractC61062a aVar, final int i, final boolean z) {
        if (C31575b.m65865g().getCurUser().isLive()) {
            new C79459a(activity).mo123050a(R.string.co0).mo123053a();
        } else if (AVExternalServiceImpl.m113114a().publishService().checkIsAlreadyPublished(activity)) {
            if (musicModel == null || MusicService.m81198m().mo69308a(musicModel, activity, true)) {
                this.f138548e = new C61225w(activity, new C61225w.AbstractC61231a() {
                    /* class com.p2082ss.android.ugc.aweme.music.service.C61068e.C610691 */

                    static {
                        Covode.recordClassIndex(71667);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
                    /* renamed from: a */
                    public final void mo98595a(MusicModel musicModel) {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
                    public final boolean bZ_() {
                        return C61068e.this.f138544a;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
                    public final void bY_() {
                        C58957c.m108318a(activity, "single_song", "click_music_shoot");
                    }

                    /* renamed from: b */
                    private void m110618b(boolean z) {
                        C61068e.this.mo98594a(z);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
                    /* renamed from: d_ */
                    public final void mo98602d_(boolean z) {
                        if (z) {
                            m110618b(z);
                        } else if (C61068e.this.f138546c != null) {
                            C61068e.this.f138546c.dismiss();
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
                    /* renamed from: a */
                    public final void mo98597a(final Effect effect, final MusicModel musicModel) {
                        C59213ah.f134852a = "single_song";
                        m110618b(true);
                        AVExternalServiceImpl.m113114a().asyncService("MusicRecordService", new SimpleServiceLoadCallback() {
                            /* class com.p2082ss.android.ugc.aweme.music.service.C61068e.C610691.C610723 */

                            static {
                                Covode.recordClassIndex(71670);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                            public final void onLoad(AsyncAVService asyncAVService, long j) {
                                String str;
                                RecordConfig.Builder videoLength = new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).startRecordTime(C61068e.this.f138545b).decompressTime(j).reshootConfig(new ReshootConfig(true, true)).shootWay("single_song").musicWithSticker(effect).translationType(3).musicOrigin("single_song").videoLength(Integer.valueOf(i));
                                if (!TextUtils.isEmpty(str)) {
                                    videoLength.stickers(C61068e.m110615a(str));
                                    if (!TextUtils.isEmpty(str2)) {
                                        videoLength.giphyGifIds(str2);
                                    }
                                    ArrayList<String> a = C61068e.m110615a(str);
                                    if (!a.isEmpty()) {
                                        videoLength.musicSticker(a.get(0));
                                    }
                                }
                                String musicSticker = videoLength.build().getMusicSticker();
                                Effect effect = effect;
                                MusicModel musicModel = musicModel;
                                if (musicModel != null) {
                                    str = musicModel.getMusicId();
                                } else {
                                    str = null;
                                }
                                videoLength.recordPresetResource(new RecordPresetResource(musicSticker, effect, str, musicModel));
                                asyncAVService.uiService().recordService().startRecord(activity, videoLength.build(), musicModel, true);
                            }
                        });
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
                    /* renamed from: a */
                    public final void mo98596a(MusicModel musicModel, boolean z) {
                        if (z && (activity instanceof AbstractC1204m)) {
                            C61068e.this.f138550g = true;
                            C61068e.this.f138549f = new SafeHandler((AbstractC1204m) activity);
                            C61068e.this.f138549f.postDelayed(new Runnable() {
                                /* class com.p2082ss.android.ugc.aweme.music.service.C61068e.C610691.RunnableC610701 */

                                static {
                                    Covode.recordClassIndex(71668);
                                }

                                public final void run() {
                                    if (C61068e.this.f138550g && activity != null && !activity.isFinishing()) {
                                        C61068e.this.f138547d = ProgressDialogC61165e.C61167b.m110784a(activity);
                                        C61068e.this.f138547d.setMessage(activity.getResources().getString(R.string.g1j));
                                    }
                                }
                            }, 300);
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
                    /* renamed from: a_ */
                    public final void mo98599a_(int i, boolean z) {
                        if (!z && C61068e.this.f138546c != null) {
                            C61068e.this.f138546c.setProgress(i);
                            if (i >= 98 && C61068e.this.f138546c != null) {
                                C61068e.this.f138546c.setCancelable(true);
                            }
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.AbstractC61231a
                    /* renamed from: a */
                    public final void mo98598a(final String str, final MusicModel musicModel, final int i) {
                        m110618b(z);
                        if (C61068e.this.f138546c != null) {
                            C61068e.this.f138546c.dismiss();
                        }
                        C59213ah.f134852a = "single_song";
                        boolean isRecording = AVExternalServiceImpl.m113114a().configService().shortVideoConfig().isRecording();
                        final long currentTimeMillis = System.currentTimeMillis() - C61068e.this.f138545b;
                        if (!isRecording || activity == null) {
                            AVExternalServiceImpl.m113114a().asyncService("MusicRecordService", new SimpleServiceLoadCallback() {
                                /* class com.p2082ss.android.ugc.aweme.music.service.C61068e.C610691.C610712 */

                                static {
                                    Covode.recordClassIndex(71669);
                                }

                                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                                public final void onLoad(AsyncAVService asyncAVService, long j) {
                                    RecordConfig.Builder videoLength = new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).musicPath(str).startRecordTime(C61068e.this.f138545b).decompressTime(j).musicDownloadDuration(currentTimeMillis).reshootConfig(new ReshootConfig(true, true)).shootWay("single_song").musicWithSticker(C61068e.this.f138548e.f139007c).translationType(3).musicOrigin("single_song").videoLength(Integer.valueOf(i));
                                    if (!TextUtils.isEmpty(str)) {
                                        videoLength.stickers(C61068e.m110615a(str));
                                        if (!TextUtils.isEmpty(str2)) {
                                            videoLength.giphyGifIds(str2);
                                        }
                                        ArrayList<String> a = C61068e.m110615a(str);
                                        if (!a.isEmpty()) {
                                            videoLength.musicSticker(a.get(0));
                                        }
                                    }
                                    asyncAVService.uiService().recordService().startRecord(activity, videoLength.build(), musicModel, true);
                                }
                            });
                            return;
                        }
                        AVExternalServiceImpl.m113114a().publishService().addMusic(musicModel);
                        Intent intent = new Intent();
                        intent.putExtra("path", str);
                        intent.putExtra("music_model", musicModel);
                        intent.putExtra("music_origin", 0);
                        activity.setResult(-1, intent);
                        activity.finish();
                    }
                });
                mVar.getLifecycle().mo4012a(new MusicRecordService$2(this));
                this.f138546c = ProgressDialogC61165e.C61167b.m110785a(activity, ProgressDialogC61165e.EnumC61166a.VISIBLE_AFTER_5S, new C61075h(this, musicModel));
                C1731i.m5640b(new CallableC61073f(musicModel), C1731i.f5562a).mo5534a(new C61074g(this, z, activity, musicModel, str, i), C1731i.f5564c, null);
            }
        }
    }
}
