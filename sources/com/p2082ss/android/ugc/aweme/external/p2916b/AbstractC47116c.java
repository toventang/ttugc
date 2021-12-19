package com.p2082ss.android.ugc.aweme.external.p2916b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.external.C47147e;
import com.p2082ss.android.ugc.aweme.external.p2916b.C47112a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2730de.C40984s;
import com.p2082ss.android.ugc.aweme.p2730de.ExecutorC40975j;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.ISDKService;
import com.p2082ss.android.ugc.aweme.services.SDKServiceImpl;
import com.p2082ss.android.ugc.aweme.services.effect.EffectService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ChangeBanMusicConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.CommentVideoConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.DuetConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.EffectConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.LiveParams;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.MiniAppConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.QaStructConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ReactConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ReshootConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.StickerDownloadConfig;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.specialplus.C75205c;
import com.p2082ss.android.ugc.aweme.specialplus.C75210e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.p4548e.C88254b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89671m;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.b.c */
public abstract class AbstractC47116c implements IRecordService {

    /* renamed from: c */
    public static final C47117a f109705c = new C47117a((byte) 0);

    /* renamed from: a */
    public final C70005cr f109706a;

    /* renamed from: b */
    public final SDKServiceImpl f109707b = new SDKServiceImpl();

    /* renamed from: d */
    private final IAVSettingsService f109708d = ((C47147e) C47147e.f109770a.getValue()).avsettingsConfig();

    static {
        Covode.recordClassIndex(55720);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.c$a */
    public static final class C47117a {
        static {
            Covode.recordClassIndex(55721);
        }

        private C47117a() {
        }

        public /* synthetic */ C47117a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.c$d */
    public static final class C47120d implements ISDKService.SplitCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC89671m f109717a;

        static {
            Covode.recordClassIndex(55724);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final boolean checkIsCanceled() {
            return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onFail() {
            if (this.f109717a.mo144213a()) {
                this.f109717a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) new RuntimeException("split failed"))));
            }
        }

        C47120d(AbstractC89671m mVar) {
            this.f109717a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onSuccess(int i, int i2) {
            if (this.f109717a.mo144213a()) {
                this.f109717a.resumeWith(C89379q.m157068constructorimpl(C89387v.m154943a(Integer.valueOf(i), Integer.valueOf(i2))));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.c$g */
    public static final class C47129g implements ISDKService.SplitCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC47116c f109742a;

        /* renamed from: b */
        final /* synthetic */ ReactConfig f109743b;

        /* renamed from: c */
        final /* synthetic */ RecordConfig f109744c;

        /* renamed from: d */
        final /* synthetic */ IRecordService.UICallback f109745d;

        /* renamed from: e */
        final /* synthetic */ Context f109746e;

        static {
            Covode.recordClassIndex(55733);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final boolean checkIsCanceled() {
            return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onFail() {
            IRecordService.UICallback uICallback = this.f109745d;
            if (uICallback != null) {
                uICallback.preFail(-1);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.external.b.c$g$a */
        static final class CallableC47130a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C47129g f109747a;

            static {
                Covode.recordClassIndex(55734);
            }

            CallableC47130a(C47129g gVar) {
                this.f109747a = gVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Intent a = AbstractC47116c.m90334a(this.f109747a.f109744c);
                ReactionParams params = this.f109747a.f109743b.getParams();
                User reactionFromAuthor = this.f109747a.f109743b.getReactionFromAuthor();
                Bundle bundle = new Bundle();
                Objects.requireNonNull(params, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("reaction_params", params);
                bundle.putSerializable("reaction_from_author", reactionFromAuthor);
                AbstractC63154aa b = C63238c.f143566D.mo73306b();
                String str = params.wavPath;
                C89219l.m154716b(str, "");
                MusicWaveBean musicWaveBean = (MusicWaveBean) b.mo101536a(C70612k.C70614b.m124757a(str));
                if (musicWaveBean != null) {
                    bundle.putSerializable("music_wave_data", musicWaveBean);
                }
                a.putExtras(bundle);
                IRecordService.UICallback uICallback = this.f109747a.f109745d;
                if (uICallback != null) {
                    uICallback.preSuccess();
                }
                this.f109747a.f109742a.f109706a.mo70083a(C63238c.f143581h.mo101543b(this.f109747a.f109744c.getMusicModel()));
                this.f109747a.f109742a.f109706a.mo110456f();
                VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f109747a.f109746e, a);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onSuccess(int i, int i2) {
            this.f109743b.getParams().videoWidth = AbstractC47116c.m90333a(i);
            this.f109743b.getParams().videoHeight = AbstractC47116c.m90333a(i2);
            C1731i.m5640b(new CallableC47130a(this), ExecutorC40975j.f95810a);
        }

        C47129g(AbstractC47116c cVar, ReactConfig reactConfig, RecordConfig recordConfig, IRecordService.UICallback uICallback, Context context) {
            this.f109742a = cVar;
            this.f109743b = reactConfig;
            this.f109744c = recordConfig;
            this.f109745d = uICallback;
            this.f109746e = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.c$f */
    public static final class C47124f implements ISDKService.SplitCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC47116c f109729a;

        /* renamed from: b */
        final /* synthetic */ DuetConfig f109730b;

        /* renamed from: c */
        final /* synthetic */ RecordConfig f109731c;

        /* renamed from: d */
        final /* synthetic */ Context f109732d;

        /* renamed from: e */
        final /* synthetic */ IRecordService.UICallback f109733e;

        /* renamed from: f */
        final /* synthetic */ String f109734f;

        static {
            Covode.recordClassIndex(55728);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final boolean checkIsCanceled() {
            IRecordService.UICallback uICallback = this.f109733e;
            if (uICallback != null) {
                return uICallback.checkIsCanceled();
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onFail() {
            IRecordService.UICallback uICallback = this.f109733e;
            if (uICallback != null) {
                uICallback.preFail(-1);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.external.b.c$f$b */
        static final class CallableC47128b<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C47124f f109740a;

            /* renamed from: b */
            final /* synthetic */ Intent f109741b;

            static {
                Covode.recordClassIndex(55732);
            }

            CallableC47128b(C47124f fVar, Intent intent) {
                this.f109740a = fVar;
                this.f109741b = intent;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                IRecordService.UICallback uICallback = this.f109740a.f109733e;
                if (uICallback != null) {
                    uICallback.preSuccess();
                }
                this.f109740a.f109729a.f109706a.mo70083a(C63238c.f143581h.mo101543b(this.f109740a.f109731c.getMusicModel()));
                if (!TextUtils.equals(this.f109740a.f109734f, "challenge")) {
                    this.f109740a.f109729a.f109706a.mo110456f();
                }
                IRecordService.UICallback uICallback2 = this.f109740a.f109733e;
                if (uICallback2 == null || !uICallback2.checkIsCanceled()) {
                    VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f109740a.f109732d, this.f109741b);
                    IRecordService.UICallback uICallback3 = this.f109740a.f109733e;
                    if (uICallback3 != null) {
                        uICallback3.postSuccess();
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.external.b.c$f$a */
        public static final class C47125a implements IFetchEffectListener {

            /* renamed from: a */
            final /* synthetic */ C47124f f109735a;

            /* renamed from: b */
            final /* synthetic */ Intent f109736b;

            static {
                Covode.recordClassIndex(55729);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
                C89219l.m154721d(effect, "");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(Effect effect) {
                final Effect effect2 = effect;
                C89219l.m154721d(effect2, "");
                C1731i.m5640b(new Callable(this) {
                    /* class com.p2082ss.android.ugc.aweme.external.p2916b.AbstractC47116c.C47124f.C47125a.CallableC471261 */

                    /* renamed from: a */
                    final /* synthetic */ C47125a f109737a;

                    static {
                        Covode.recordClassIndex(55730);
                    }

                    {
                        this.f109737a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        IRecordService.UICallback uICallback = this.f109737a.f109735a.f109733e;
                        if (uICallback != null) {
                            uICallback.preSuccess();
                        }
                        this.f109737a.f109735a.f109729a.f109706a.mo70083a((C69905c) null);
                        if (!TextUtils.equals(this.f109737a.f109735a.f109734f, "challenge")) {
                            this.f109737a.f109735a.f109729a.f109706a.mo110456f();
                        }
                        MusicModel musicModel = this.f109737a.f109735a.f109731c.getMusicModel();
                        if (musicModel != null) {
                            this.f109737a.f109735a.f109729a.f109706a.mo70083a(C63238c.f143581h.mo101543b(musicModel));
                        }
                        Intent intent = this.f109737a.f109736b;
                        Effect effect = effect2;
                        Integer duetGameScore = this.f109737a.f109735a.f109730b.getDuetGameScore();
                        if (duetGameScore == null) {
                            C89219l.m154715b();
                        }
                        intent.putExtras(AbstractC47116c.m90335a(effect, duetGameScore.intValue()));
                        IRecordService.UICallback uICallback2 = this.f109737a.f109735a.f109733e;
                        if (uICallback2 == null || !uICallback2.checkIsCanceled()) {
                            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f109737a.f109735a.f109732d, this.f109737a.f109736b);
                            IRecordService.UICallback uICallback3 = this.f109737a.f109735a.f109733e;
                            if (uICallback3 != null) {
                                uICallback3.postSuccess();
                            }
                        }
                        return C89391z.f203057a;
                    }
                }, ExecutorC40975j.f95810a);
            }

            C47125a(C47124f fVar, Intent intent) {
                this.f109735a = fVar;
                this.f109736b = intent;
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C89219l.m154721d(exceptionResult, "");
                IRecordService.UICallback uICallback = this.f109735a.f109733e;
                if (uICallback != null) {
                    uICallback.preFail(-2);
                }
                C471272 r1 = new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.external.p2916b.AbstractC47116c.C47124f.C47125a.C471272 */

                    /* renamed from: a */
                    final /* synthetic */ C47125a f109739a;

                    static {
                        Covode.recordClassIndex(55731);
                    }

                    {
                        this.f109739a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        Context applicationContext = this.f109739a.f109735a.f109732d.getApplicationContext();
                        if (C58003a.f132201c && applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                        new C79459a(applicationContext).mo123050a(R.string.bqf).mo123053a();
                        return C89391z.f203057a;
                    }
                };
                C89219l.m154721d(r1, "");
                C40984s.m82525a(new C40984s.RunnableC40985a(r1));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onSuccess(int i, int i2) {
            this.f109730b.setDuetVideoWidth(AbstractC47116c.m90333a(i));
            this.f109730b.setDuetVideoHeight(AbstractC47116c.m90333a(i2));
            Intent a = AbstractC47116c.m90334a(this.f109731c);
            DuetConfig duetConfig = this.f109730b;
            Bundle bundle = new Bundle();
            duetConfig.getDuetChallenge();
            duetConfig.getAuthor();
            bundle.putString("duet_hash_tag", duetConfig.getDuetChallenge());
            bundle.putString("duet_video_path", duetConfig.getMp4Path());
            bundle.putString("duet_audio_path", duetConfig.getWavPath());
            bundle.putInt("duet_video_width", duetConfig.getDuetVideoWidth());
            bundle.putBoolean("duet_default_mic", duetConfig.getDefaultUseMic());
            bundle.putInt("duet_video_height", duetConfig.getDuetVideoHeight());
            bundle.putBoolean("duet_from_duet_sticker", duetConfig.isFromDuetSticker());
            bundle.putBoolean("duet_from_duet_button", duetConfig.isFromDuetButton());
            bundle.putString("duet_from", duetConfig.getDuetFrom());
            bundle.putSerializable("duet_author", duetConfig.getAuthor());
            MusicWaveBean musicWaveBean = (MusicWaveBean) C63253l.f143623a.mo73306b().mo101536a(C70612k.C70614b.m124757a(duetConfig.getWavPath()));
            if (musicWaveBean != null) {
                bundle.putSerializable("music_wave_data", musicWaveBean);
            }
            bundle.putParcelable("duet_layout_effect", duetConfig.getDuetLayout());
            a.putExtras(bundle);
            if (this.f109730b.getMStickerDownloadConfig() != null) {
                StickerDownloadConfig mStickerDownloadConfig = this.f109730b.getMStickerDownloadConfig();
                if (mStickerDownloadConfig != null) {
                    AbstractC47116c.m90338a(this.f109732d, mStickerDownloadConfig, new C47125a(this, a));
                    return;
                }
                return;
            }
            C1731i.m5640b(new CallableC47128b(this, a), ExecutorC40975j.f95810a);
        }

        C47124f(AbstractC47116c cVar, DuetConfig duetConfig, RecordConfig recordConfig, Context context, IRecordService.UICallback uICallback, String str) {
            this.f109729a = cVar;
            this.f109730b = duetConfig;
            this.f109731c = recordConfig;
            this.f109732d = context;
            this.f109733e = uICallback;
            this.f109734f = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.c$h */
    static final class C47131h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC47116c f109748a;

        /* renamed from: b */
        final /* synthetic */ Intent f109749b;

        /* renamed from: c */
        final /* synthetic */ StitchParams f109750c;

        /* renamed from: d */
        final /* synthetic */ Context f109751d;

        static {
            Covode.recordClassIndex(55735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47131h(AbstractC47116c cVar, Intent intent, StitchParams stitchParams, Context context) {
            super(0);
            this.f109748a = cVar;
            this.f109749b = intent;
            this.f109750c = stitchParams;
            this.f109751d = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String a = m90339a(this.f109749b, "creation_id");
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.shootWay("stitch");
            builder.stitchParams(this.f109750c);
            builder.creationId(a);
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f109751d, AbstractC47116c.m90334a(builder.build()));
            return C89391z.f203057a;
        }

        /* renamed from: a */
        private static String m90339a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public AbstractC47116c() {
        C70005cr a = C70005cr.m123611a();
        C89219l.m154716b(a, "");
        this.f109706a = a;
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.c$c */
    public static final class C47119c implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ StickerDownloadConfig f109715a;

        /* renamed from: b */
        final /* synthetic */ IFetchEffectListener f109716b;

        static {
            Covode.recordClassIndex(55723);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            C89219l.m154721d(effect, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            C89219l.m154721d(effect, "");
            this.f109715a.getOnSuccess();
            this.f109716b.onSuccess(effect);
        }

        C47119c(StickerDownloadConfig stickerDownloadConfig, IFetchEffectListener iFetchEffectListener) {
            this.f109715a = stickerDownloadConfig;
            this.f109716b = iFetchEffectListener;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            AbstractC89172b<Integer, C89391z> onFail = this.f109715a.getOnFail();
            if (onFail != null) {
                onFail.invoke(Integer.valueOf(exceptionResult.getErrorCode()));
            }
            this.f109716b.onFail(effect, exceptionResult);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public Intent getRecordBasicIntent(RecordConfig recordConfig) {
        C89219l.m154721d(recordConfig, "");
        return m90334a(recordConfig);
    }

    /* renamed from: a */
    public static int m90333a(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return ((int) Math.round((d * 1.0d) / 16.0d)) * 16;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.external.b.c$e */
    public static final class C47121e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f109718a;

        /* renamed from: b */
        final /* synthetic */ AbstractC47116c f109719b;

        /* renamed from: c */
        final /* synthetic */ Activity f109720c;

        /* renamed from: d */
        final /* synthetic */ ChangeBanMusicConfig f109721d;

        /* renamed from: e */
        final /* synthetic */ IRecordService.UICallback f109722e;

        /* renamed from: f */
        final /* synthetic */ Aweme f109723f;

        static {
            Covode.recordClassIndex(55725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47121e(AbstractC47116c cVar, Activity activity, ChangeBanMusicConfig changeBanMusicConfig, IRecordService.UICallback uICallback, Aweme aweme, AbstractC89124d dVar) {
            super(2, dVar);
            this.f109719b = cVar;
            this.f109720c = activity;
            this.f109721d = changeBanMusicConfig;
            this.f109722e = uICallback;
            this.f109723f = aweme;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C47121e(this.f109719b, this.f109720c, this.f109721d, this.f109722e, this.f109723f, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C47121e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.external.p2916b.AbstractC47116c.C47121e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    protected static Intent m90334a(RecordConfig recordConfig) {
        Set<Map.Entry<String, String>> entrySet;
        Set<Map.Entry<String, String>> entrySet2;
        C89219l.m154721d(recordConfig, "");
        Intent intent = new Intent();
        Boolean isInterceptBackground = recordConfig.isInterceptBackground();
        if (isInterceptBackground != null) {
            intent.putExtra("intercept_background", isInterceptBackground.booleanValue());
        }
        String shootway = recordConfig.getShootway();
        if (shootway != null) {
            intent.putExtra("shoot_way", shootway);
        }
        String shootFrom = recordConfig.getShootFrom();
        if (shootFrom != null) {
            intent.putExtra("shoot_from", shootFrom);
        }
        String enterFrom = recordConfig.getEnterFrom();
        if (enterFrom != null) {
            intent.putExtra("enter_from", enterFrom);
        }
        String enterMethod = recordConfig.getEnterMethod();
        if (enterMethod != null) {
            intent.putExtra("enter_method", enterMethod);
        }
        String creationId = recordConfig.getCreationId();
        if (creationId != null) {
            intent.putExtra("creation_id", creationId);
        }
        String shoutoutMode = recordConfig.getShoutoutMode();
        if (shoutoutMode != null) {
            intent.putExtra("shoutouts_mode", shoutoutMode);
        }
        String shoutoutOrderID = recordConfig.getShoutoutOrderID();
        if (shoutoutOrderID != null) {
            intent.putExtra("shout_out_order_id", shoutoutOrderID);
        }
        intent.putExtra("restore", recordConfig.getRestoreType());
        String musicOrigin = recordConfig.getMusicOrigin();
        if (musicOrigin != null) {
            intent.putExtra("music_origin", musicOrigin);
        }
        intent.putExtra("need_refresh_filter_data", recordConfig.getPrepareFilter());
        C89378p<String, String> mentionUser = recordConfig.getMentionUser();
        if (mentionUser != null) {
            intent.putExtra("extra_mention_uid", mentionUser.getFirst());
            intent.putExtra("extra_mention_user_name", mentionUser.getSecond());
        }
        String previousPage = recordConfig.getPreviousPage();
        if (previousPage != null) {
            intent.putExtra("extra_previous_page", previousPage);
        }
        String commerceData = recordConfig.getCommerceData();
        if (commerceData != null) {
            intent.putExtra("commerce_data_in_tools_line", commerceData);
        }
        Integer tabs = recordConfig.getTabs();
        if (tabs != null) {
            intent.putExtra("tabs", tabs.intValue());
        }
        String sticker = recordConfig.getSticker();
        if (sticker != null) {
            intent.putExtra("sticker_id", sticker);
        }
        Boolean showCancelAfterPinProp = recordConfig.getShowCancelAfterPinProp();
        if (showCancelAfterPinProp != null) {
            intent.putExtra("show_cancel_after_pin_prop", showCancelAfterPinProp.booleanValue());
        }
        String isFilterBusniessSticker = recordConfig.isFilterBusniessSticker();
        if (isFilterBusniessSticker != null) {
            intent.putExtra("filter_business_sticker", isFilterBusniessSticker);
        }
        Long videoDownloadDuration = recordConfig.getVideoDownloadDuration();
        if (videoDownloadDuration != null) {
            intent.putExtra("video_download_duration", videoDownloadDuration.longValue());
        }
        Long effectDownloadDuration = recordConfig.getEffectDownloadDuration();
        if (effectDownloadDuration != null) {
            intent.putExtra("effect_download_duration", effectDownloadDuration.longValue());
        }
        Long musicDownloadDuration = recordConfig.getMusicDownloadDuration();
        if (musicDownloadDuration != null) {
            intent.putExtra("music_download_duration", musicDownloadDuration.longValue());
        }
        Long startRecordTime = recordConfig.getStartRecordTime();
        if (startRecordTime != null) {
            intent.putExtra("extra_start_record_time", startRecordTime.longValue());
        }
        Long decompressTime = recordConfig.getDecompressTime();
        if (decompressTime != null) {
            intent.putExtra("extra_decompress_time", decompressTime.longValue());
        }
        Boolean presetSticker = recordConfig.getPresetSticker();
        if (presetSticker != null) {
            intent.putExtra("use_preset_sticker_at_first", presetSticker.booleanValue());
        }
        Integer translationType = recordConfig.getTranslationType();
        if (translationType != null) {
            intent.putExtra("translation_type", translationType.intValue());
        }
        Boolean permissionActivityRequired = recordConfig.getPermissionActivityRequired();
        if (permissionActivityRequired != null) {
            intent.putExtra("extra_need_permission_activity", permissionActivityRequired.booleanValue());
        }
        if (C89219l.m154714a((Object) recordConfig.getFromMain(), (Object) true)) {
            intent.putExtra("from", "main");
        }
        Boolean fromSystem = recordConfig.getFromSystem();
        if (fromSystem != null) {
            intent.putExtra("enter_record_directly_from_system", fromSystem.booleanValue());
        }
        Boolean fromOtherPlatform = recordConfig.getFromOtherPlatform();
        if (fromOtherPlatform != null) {
            intent.putExtra("enter_record_from_other_platform", fromOtherPlatform.booleanValue());
        }
        Boolean autoStartRecording = recordConfig.getAutoStartRecording();
        if (autoStartRecording != null) {
            intent.putExtra("auto_start_recording", autoStartRecording.booleanValue());
        }
        Integer cameraFacing = recordConfig.getCameraFacing();
        if (cameraFacing != null) {
            intent.putExtra("extra_camera_facing", cameraFacing.intValue());
        }
        ArrayList<String> stickers = recordConfig.getStickers();
        if (stickers != null) {
            intent.putStringArrayListExtra("reuse_sticker_ids", stickers);
        }
        String giphyGifIds = recordConfig.getGiphyGifIds();
        if (giphyGifIds != null) {
            intent.putExtra("reuse_giphy_gifs", giphyGifIds);
        }
        ShootExtraData shootExtraData = recordConfig.getShootExtraData();
        if (shootExtraData != null) {
            Objects.requireNonNull(shootExtraData, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_shoot_data", (Parcelable) shootExtraData);
        }
        String musicPath = recordConfig.getMusicPath();
        if (musicPath != null) {
            intent.putExtra("path", musicPath);
        }
        String musicSticker = recordConfig.getMusicSticker();
        if (musicSticker != null) {
            intent.putExtra("music_reuse_sticker_id", musicSticker);
        }
        String stickerWithMusicFilePath = recordConfig.getStickerWithMusicFilePath();
        if (stickerWithMusicFilePath != null) {
            intent.putExtra("sticker_with_music_file_path", stickerWithMusicFilePath);
        }
        Effect musicWithStickerEffect = recordConfig.getMusicWithStickerEffect();
        if (musicWithStickerEffect != null) {
            Objects.requireNonNull(musicWithStickerEffect, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("music_with_sticker_effect", (Parcelable) musicWithStickerEffect);
        }
        Music stickerMusic = recordConfig.getStickerMusic();
        if (stickerMusic != null) {
            intent.putExtra("sticker_music", stickerMusic);
        }
        String musicId = recordConfig.getMusicId();
        if (musicId != null) {
            intent.putExtra("music_id", musicId);
        }
        String shareId = recordConfig.getShareId();
        if (shareId != null) {
            intent.putExtra("share_id", shareId);
        }
        String clientId = recordConfig.getClientId();
        if (clientId != null) {
            intent.putExtra("channel", clientId);
        }
        String challengeId = recordConfig.getChallengeId();
        if (challengeId != null) {
            intent.putExtra("challenge_id", challengeId);
        }
        String autoUseMusic = recordConfig.getAutoUseMusic();
        if (autoUseMusic != null) {
            intent.putExtra("direct_use_sticker_music", autoUseMusic);
        }
        String autoUseSticker = recordConfig.getAutoUseSticker();
        if (autoUseSticker != null) {
            intent.putExtra("first_face_sticker", autoUseSticker);
        }
        Boolean showPreloadingDialog = recordConfig.getShowPreloadingDialog();
        if (showPreloadingDialog != null) {
            intent.putExtra("show_preloading_dialog", showPreloadingDialog.booleanValue());
        }
        Effect mvSticker = recordConfig.getMvSticker();
        if (mvSticker != null) {
            intent.putExtra("reuse_mvtheme_enter", true);
            intent.putExtra("extra_bind_mv_id", mvSticker.getEffectId());
            Objects.requireNonNull(mvSticker, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_mv_effect", (Parcelable) mvSticker);
        }
        String mvStickerId = recordConfig.getMvStickerId();
        if (mvStickerId != null) {
            intent.putExtra("extra_bind_mv_id", mvStickerId);
        }
        MiniAppConfig miniAppConfig = recordConfig.getMiniAppConfig();
        if (miniAppConfig != null) {
            intent.putExtra("sticker_id", miniAppConfig.getStickerId());
            intent.putExtra("micro_app_info", miniAppConfig.getAppInfo());
            intent.putExtra("micro_app_class", miniAppConfig.getAppClass());
        }
        CommentVideoConfig commentVideoConfig = recordConfig.getCommentVideoConfig();
        if (commentVideoConfig != null) {
            intent.putExtra("comment_video_model", commentVideoConfig.getCommentVideoModel());
        }
        QaStructConfig qaStructConfig = recordConfig.getQaStructConfig();
        if (qaStructConfig != null) {
            intent.putExtra("question_answer_video_model", qaStructConfig.getQaStruct());
        }
        Effect firstSticker = recordConfig.getFirstSticker();
        if (firstSticker != null) {
            Objects.requireNonNull(firstSticker, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("first_sticker", (Parcelable) firstSticker);
        }
        RecordPresetResource recordPresetResource = recordConfig.getRecordPresetResource();
        if (recordPresetResource != null) {
            Objects.requireNonNull(recordPresetResource, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("record_preset_resource", (Parcelable) recordPresetResource);
        }
        Map<String, String> extraParams = recordConfig.getExtraParams();
        if (extraParams != null) {
            intent.putExtra("extra_sticker_from", extraParams.get("scene"));
            intent.putExtra("grade_key", extraParams.get("grade_key"));
        }
        String donationId = recordConfig.getDonationId();
        if (donationId != null) {
            intent.putExtra("donation_id", donationId);
        }
        Integer defaultTab = recordConfig.getDefaultTab();
        if (defaultTab != null) {
            if (defaultTab.intValue() == 1) {
                intent.putExtra("extra_to_status", true);
            } else if (defaultTab.intValue() == 2) {
                intent.putExtra("to_live", true);
            }
        }
        LiveParams liveParams = recordConfig.getLiveParams();
        if (liveParams != null) {
            String sourceParams = liveParams.getSourceParams();
            if (sourceParams != null) {
                intent.putExtra("extra_live_source_params", sourceParams);
            }
            Boolean onlyShowLiveTab = liveParams.getOnlyShowLiveTab();
            if (onlyShowLiveTab != null) {
                intent.putExtra("extra_only_show_live_tab", onlyShowLiveTab.booleanValue());
            }
        }
        if (recordConfig.getShowStickerPanel()) {
            intent.putExtra("sticker_pannel_show", true);
        }
        HashMap<String, String> starAtlasConfig = recordConfig.getStarAtlasConfig();
        if (!(starAtlasConfig == null || (entrySet2 = starAtlasConfig.entrySet()) == null)) {
            for (Map.Entry<String, String> entry : entrySet2) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
        }
        HashMap<String, String> missionConfig = recordConfig.getMissionConfig();
        if (!(missionConfig == null || (entrySet = missionConfig.entrySet()) == null)) {
            for (Map.Entry<String, String> entry2 : entrySet) {
                intent.putExtra(entry2.getKey(), entry2.getValue());
            }
        }
        EffectConfig effectConfig = recordConfig.getEffectConfig();
        if (effectConfig != null) {
            intent.putExtra("effect_meta_info", effectConfig.getEffectMetaInfo());
            intent.putExtra("effect_image", effectConfig.getEffectImage());
        }
        StitchParams stitchParams = recordConfig.getStitchParams();
        if (stitchParams != null) {
            Objects.requireNonNull(stitchParams, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("stitch_params", (Parcelable) stitchParams);
        }
        Boolean fromSpecialPlus = recordConfig.getFromSpecialPlus();
        if (fromSpecialPlus != null) {
            intent.putExtra("from_special_plus", fromSpecialPlus.booleanValue());
        }
        Integer videoLength = recordConfig.getVideoLength();
        if (videoLength != null) {
            intent.putExtra("extra_video_length", videoLength.intValue());
        }
        String sharedARSessionId = recordConfig.getSharedARSessionId();
        if (sharedARSessionId != null) {
            intent.putExtra("session", sharedARSessionId);
        }
        String sharedARHostId = recordConfig.getSharedARHostId();
        if (sharedARHostId != null) {
            intent.putExtra("host_uid", sharedARHostId);
        }
        Effect ttepPreviewEffect = recordConfig.getTtepPreviewEffect();
        if (ttepPreviewEffect != null) {
            Objects.requireNonNull(ttepPreviewEffect, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_ttep_preview_effect", (Parcelable) ttepPreviewEffect);
        }
        intent.putExtra("extra_ttep_enter_preview_page", recordConfig.getEnterTTEPPreviewPage());
        intent.putExtra("auto_selected_anchor", recordConfig.getAutoSelectedAnchor());
        intent.putExtra("open_platform_extra", recordConfig.getOpenPlatformExtra());
        intent.putExtra("open_platform_client_key", recordConfig.getOpenPlatformClientKey());
        return intent;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startRecord(Context context, Intent intent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intent);
    }

    /* renamed from: a */
    public static Bundle m90335a(Effect effect, int i) {
        long j;
        Bundle bundle = new Bundle();
        GameDuetResource gameDuetResource = new GameDuetResource(i, effect);
        try {
            j = Long.parseLong(effect.getEffectId());
        } catch (Exception unused) {
            j = 0;
        }
        bundle.putParcelable("duet_sticker_game", gameDuetResource);
        bundle.putLong("first_face_sticker", j);
        return bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startRecord(Context context, RecordConfig recordConfig) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(recordConfig, "");
        Intent a = m90334a(recordConfig);
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            m90337a(context, a, recordConfig.getKeepChallenges(), recordConfig.getReshootConfig());
        } else {
            m90336a(context, a, recordConfig.getKeepChallenges());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startSuperEntrace(Activity activity, RecordConfig recordConfig) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(recordConfig, "");
        recordConfig.setPrepareFilter(false);
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startSuperEntranceRecordActivity(activity, m90334a(recordConfig));
        C88254b.C88255a.m153365a().setSuperEntranceRecordClicked(activity, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startSpecialPlusEntrance(Context context, RecordConfig recordConfig) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(recordConfig, "");
        recordConfig.setSticker(C75210e.C75211a.m131957a().getEffectId());
        recordConfig.setFromSpecialPlus(true);
        recordConfig.setEnterFrom("super_entrance");
        recordConfig.setPresetSticker(true);
        Intent a = m90334a(recordConfig);
        Effect a2 = new C75205c().mo118387a();
        if (a2 != null) {
            recordConfig.setFirstSticker(a2);
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, a);
        C75210e.C75211a.m131957a().setSpecialPlusClicked();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startStitch(Context context, Intent intent, StitchParams stitchParams) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        C89219l.m154721d(stitchParams, "");
        C80558hx.m139642a(0, new C47131h(this, intent, stitchParams, context));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void preloadDuetLayout(int i, int i2, AbstractC89172b<? super Effect, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
        if (i == 0 || i2 == 0) {
            bVar.invoke(null);
        } else if (((double) ((((float) i) * 1.0f) / ((float) i2))) <= 1.0d) {
            bVar.invoke(null);
        } else {
            Application a = C17879g.m33104a();
            C89219l.m154716b(a, "");
            AbstractC46415f a2 = C46404c.m89554a(a, null);
            a2.mo78907a("duet-layout", false, (IFetchEffectChannelListener) new C47112a.C47113a(bVar, a2));
        }
    }

    /* renamed from: a */
    private final void m90336a(Context context, Intent intent, Boolean bool) {
        this.f109706a.mo70083a((C69905c) null);
        if (!C89219l.m154714a((Object) bool, (Object) true)) {
            this.f109706a.mo110456f();
        }
        if (C63244g.m114602a().mo73286n().mo120441b()) {
            C84911q.m145921a("cannot enter main record page during entering story page");
        } else {
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intent);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startRecord(Context context, RecordConfig recordConfig, Uri uri) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(recordConfig, "");
        C89219l.m154721d(uri, "");
        Intent a = m90334a(recordConfig);
        if (uri.isHierarchical()) {
            for (String str : uri.getQueryParameterNames()) {
                a.putExtra(str, uri.getQueryParameter(str));
            }
        }
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            m90337a(context, a, recordConfig.getKeepChallenges(), recordConfig.getReshootConfig());
        } else {
            m90336a(context, a, recordConfig.getKeepChallenges());
        }
    }

    /* renamed from: a */
    protected static void m90338a(Context context, StickerDownloadConfig stickerDownloadConfig, IFetchEffectListener iFetchEffectListener) {
        AbstractC46415f createMvEffectPlatform;
        Integer type;
        Integer type2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(stickerDownloadConfig, "");
        C89219l.m154721d(iFetchEffectListener, "");
        Integer type3 = stickerDownloadConfig.getType();
        if ((type3 != null && type3.intValue() == 1) || (((type = stickerDownloadConfig.getType()) != null && type.intValue() == 3) || ((type2 = stickerDownloadConfig.getType()) != null && type2.intValue() == 4))) {
            createMvEffectPlatform = EffectService.getInstance().createMvEffectPlatform(context, stickerDownloadConfig.getRegion());
        } else {
            createMvEffectPlatform = EffectService.getInstance().createEffectPlatform(context, stickerDownloadConfig.getRegion());
        }
        createMvEffectPlatform.mo78906a(stickerDownloadConfig.getStickerId(), (Map<String, String>) null, new C47119c(stickerDownloadConfig, iFetchEffectListener));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startRecord(Context context, RecordConfig recordConfig, Challenge challenge) {
        String str;
        String str2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(recordConfig, "");
        C89219l.m154721d(challenge, "");
        recordConfig.setPrepareFilter(false);
        AVChallenge a = C63238c.f143581h.mo101533a(challenge);
        if (recordConfig.getRecordPresetResource() != null) {
            if (a != null) {
                str = a.stickerId;
                str2 = a.musicId;
            } else {
                str = null;
                str2 = null;
            }
            recordConfig.setRecordPresetResource(new RecordPresetResource(str, null, str2, null));
        }
        this.f109706a.f156492l = null;
        this.f109706a.mo110450a(a);
        this.f109706a.mo70083a((C69905c) null);
        Intent a2 = m90334a(recordConfig);
        if (a != null) {
            Objects.requireNonNull(a, "null cannot be cast to non-null type java.io.Serializable");
            a2.putExtra("extra_open_record_challenge", (Serializable) a);
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, a2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.external.b.c$b */
    public static final class C47118b {

        /* renamed from: a */
        public final int f109709a = 0;

        /* renamed from: b */
        public final String f109710b;

        /* renamed from: c */
        public final String f109711c;

        /* renamed from: d */
        public final String f109712d;

        /* renamed from: e */
        public final String f109713e;

        /* renamed from: f */
        public final boolean f109714f;

        static {
            Covode.recordClassIndex(55722);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C47118b)) {
                return false;
            }
            C47118b bVar = (C47118b) obj;
            return this.f109709a == bVar.f109709a && C89219l.m154714a(this.f109710b, bVar.f109710b) && C89219l.m154714a(this.f109711c, bVar.f109711c) && C89219l.m154714a(this.f109712d, bVar.f109712d) && C89219l.m154714a(this.f109713e, bVar.f109713e) && this.f109714f == bVar.f109714f;
        }

        public final int hashCode() {
            int i = this.f109709a * 31;
            String str = this.f109710b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f109711c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f109712d;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f109713e;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            int i3 = (hashCode3 + i2) * 31;
            boolean z = this.f109714f;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            return i3 + i4;
        }

        public final String toString() {
            return "SplitConfig(minDuration=" + this.f109709a + ", outputDir=" + this.f109710b + ", originVideo=" + this.f109711c + ", outAudio=" + this.f109712d + ", outVideo=" + this.f109713e + ", useSplitVideo=" + this.f109714f + ")";
        }

        public C47118b(String str, String str2, String str3, String str4) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            this.f109710b = str;
            this.f109711c = str2;
            this.f109712d = str3;
            this.f109713e = str4;
            this.f109714f = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startChangeBanMusic(Aweme aweme, Activity activity, ChangeBanMusicConfig changeBanMusicConfig, IRecordService.UICallback uICallback) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(changeBanMusicConfig, "");
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, null, null, new C47121e(this, activity, changeBanMusicConfig, uICallback, aweme, null), 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startReact(Context context, RecordConfig recordConfig, ReactConfig reactConfig, IRecordService.UICallback uICallback) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(recordConfig, "");
        C89219l.m154721d(reactConfig, "");
        SDKServiceImpl sDKServiceImpl = this.f109707b;
        int minDuration = reactConfig.getMinDuration();
        String outputDir = reactConfig.getOutputDir();
        String originVideo = reactConfig.getOriginVideo();
        String str = reactConfig.getParams().wavPath;
        C89219l.m154716b(str, "");
        String str2 = reactConfig.getParams().videoPath;
        C89219l.m154716b(str2, "");
        sDKServiceImpl.split(context, minDuration, outputDir, originVideo, str, str2, new C47129g(this, reactConfig, recordConfig, uICallback, context));
    }

    /* renamed from: a */
    private final void m90337a(Context context, Intent intent, Boolean bool, ReshootConfig reshootConfig) {
        boolean a;
        this.f109706a.mo70083a((C69905c) null);
        if (!C89219l.m154714a((Object) bool, (Object) true)) {
            this.f109706a.mo110456f();
        }
        Boolean backMain = reshootConfig.getBackMain();
        if (backMain != null) {
            a = backMain.booleanValue();
        } else {
            a = C63238c.m114591a();
        }
        if (context instanceof Activity) {
            VideoRecordEntranceServiceImpl instance = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
            Activity activity = (Activity) context;
            boolean enableReshoot = reshootConfig.getEnableReshoot();
            Boolean reshootClear = reshootConfig.getReshootClear();
            if (reshootClear == null) {
                C89219l.m154715b();
            }
            instance.startToolPermissionActivity(activity, intent, enableReshoot, reshootClear.booleanValue(), a);
            return;
        }
        VideoRecordEntranceServiceImpl instance2 = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
        boolean enableReshoot2 = reshootConfig.getEnableReshoot();
        Boolean reshootClear2 = reshootConfig.getReshootClear();
        if (reshootClear2 == null) {
            C89219l.m154715b();
        }
        instance2.notifyToolPermissionActivity(context, intent, enableReshoot2, reshootClear2.booleanValue(), a);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startRecord(Activity activity, RecordConfig recordConfig, MusicModel musicModel, boolean z) {
        boolean z2;
        boolean z3;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(recordConfig, "");
        C89219l.m154721d(musicModel, "");
        Intent a = m90334a(recordConfig);
        C70005cr a2 = C70005cr.m123611a();
        C89219l.m154716b(a2, "");
        boolean z4 = true;
        if (C89219l.m154714a((Object) "direct_shoot", (Object) a2.f156486e)) {
            C70005cr a3 = C70005cr.m123611a();
            C89219l.m154716b(a3, "");
            if (2 == a3.f156487f) {
                if (C70005cr.m123611a().f156482a == null) {
                    z4 = false;
                }
                a.putExtra("extra_clear_dialog_show_needed", z4);
            }
        }
        if (musicModel.getMusicWaveBean() != null) {
            a.putExtra("music_wave_data", musicModel.getMusicWaveBean());
        }
        this.f109706a.mo70083a(C63238c.f143581h.mo101543b(musicModel));
        a.putExtra("music_model", musicModel);
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            ReshootConfig reshootConfig = recordConfig.getReshootConfig();
            VideoRecordEntranceServiceImpl instance = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
            boolean enableReshoot = reshootConfig.getEnableReshoot();
            Boolean reshootClear = reshootConfig.getReshootClear();
            if (reshootClear != null) {
                z2 = reshootClear.booleanValue();
            } else {
                z2 = false;
            }
            Boolean backMain = reshootConfig.getBackMain();
            if (backMain != null) {
                z3 = backMain.booleanValue();
            } else {
                z3 = false;
            }
            instance.startToolPermissionActivity(activity, a, enableReshoot, z2, z3);
            return;
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(activity, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService
    public void startDuet(Context context, RecordConfig recordConfig, DuetConfig duetConfig, IRecordService.UICallback uICallback, String str, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(recordConfig, "");
        C89219l.m154721d(duetConfig, "");
        this.f109707b.split(context, duetConfig.getMinDuration(), duetConfig.getOutputDir(), duetConfig.getOriginVideo(), duetConfig.getWavPath(), duetConfig.getMp4Path(), new C47124f(this, duetConfig, recordConfig, context, uICallback, str2));
    }
}
