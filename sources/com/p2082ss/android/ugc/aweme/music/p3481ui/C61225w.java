package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.C60789f;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import com.p2082ss.android.ugc.musicprovider.C84157d;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.music.ui.w */
public final class C61225w {

    /* renamed from: a */
    public Activity f139005a;

    /* renamed from: b */
    public AbstractC61231a f139006b;

    /* renamed from: c */
    public Effect f139007c;

    /* renamed from: d */
    public Effect f139008d;

    /* renamed from: e */
    private C84157d f139009e;

    /* renamed from: f */
    private C60789f f139010f;

    /* renamed from: g */
    private C61144bf f139011g;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.w$a */
    public interface AbstractC61231a {
        static {
            Covode.recordClassIndex(71841);
        }

        /* renamed from: a */
        void mo98595a(MusicModel musicModel);

        /* renamed from: a */
        void mo98596a(MusicModel musicModel, boolean z);

        /* renamed from: a */
        void mo98597a(Effect effect, MusicModel musicModel);

        /* renamed from: a */
        void mo98598a(String str, MusicModel musicModel, int i);

        /* renamed from: a_ */
        void mo98599a_(int i, boolean z);

        void bY_();

        boolean bZ_();

        /* renamed from: d_ */
        void mo98602d_(boolean z);
    }

    static {
        Covode.recordClassIndex(71835);
    }

    /* renamed from: a */
    public static boolean m110862a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo98758b() {
        this.f139005a = null;
        C60789f fVar = this.f139010f;
        if (fVar != null) {
            fVar.mo98198a();
        }
        C61144bf bfVar = this.f139011g;
        if (bfVar != null) {
            bfVar.mo98630a();
        }
        if (this.f139006b != null) {
            this.f139006b = null;
        }
    }

    /* renamed from: a */
    public final void mo98757a(String str) {
        C60789f fVar = this.f139010f;
        if (fVar != null && this.f139011g == null) {
            fVar.mo98199a(str);
        }
        C61144bf bfVar = this.f139011g;
        if (bfVar != null) {
            bfVar.mo98635b();
        }
    }

    public C61225w(Activity activity, AbstractC61231a aVar) {
        this(activity, aVar, true);
    }

    /* renamed from: a */
    public static void m110861a(String str, long j) {
        double d;
        long length = new File(str).length();
        if (j == 0) {
            d = 0.0d;
        } else {
            d = (double) (length / j);
        }
        C34611o.m70668a("aweme_music_detail_download_success_rate", new C33743c().mo59975a("duration", Long.valueOf(j)).mo59972a("speed", Double.valueOf(d)).mo59975a("size", Long.valueOf(length)).mo59976a("fileName", str).mo59977a());
    }

    public C61225w(Activity activity, AbstractC61231a aVar, boolean z) {
        this.f139005a = activity;
        this.f139009e = new C84157d();
        C60789f fVar = new C60789f(this.f139005a, z, true, true, "music_detail_page");
        this.f139010f = fVar;
        fVar.f138135a = 2;
        this.f139006b = aVar;
    }

    /* renamed from: a */
    public final void mo98755a(MusicModel musicModel, String str, int i, boolean z) {
        m110863b(musicModel, str, i, z);
    }

    /* renamed from: b */
    private void m110863b(MusicModel musicModel, String str, int i, boolean z) {
        this.f139009e.mo128984b();
        if (this.f139005a != null) {
            IExternalService a = AVExternalServiceImpl.m113114a();
            if (a == null || !a.configService().avsettingsConfig().needLoginBeforeRecord()) {
                AbstractC63212bb shortVideoPluginService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getShortVideoPluginService();
                C17867d.m33078a();
                shortVideoPluginService.mo101685a(new AbstractC63212bb.AbstractC63213a(musicModel, str, true, i, z) {
                    /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.C612261 */

                    /* renamed from: a */
                    final /* synthetic */ MusicModel f139012a;

                    /* renamed from: b */
                    final /* synthetic */ String f139013b;

                    /* renamed from: c */
                    final /* synthetic */ boolean f139014c = true;

                    /* renamed from: d */
                    final /* synthetic */ boolean f139015d = false;

                    /* renamed from: e */
                    final /* synthetic */ int f139016e;

                    /* renamed from: f */
                    final /* synthetic */ boolean f139017f;

                    static {
                        Covode.recordClassIndex(71836);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
                    public final void onSuccess() {
                        C61225w wVar = C61225w.this;
                        MusicModel musicModel = this.f139012a;
                        String str = this.f139013b;
                        boolean z = this.f139014c;
                        boolean z2 = this.f139015d;
                        int i = this.f139016e;
                        boolean z3 = this.f139017f;
                        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132256h = C61225w.m110862a();
                        }
                        if (!C58029j.f132256h) {
                            new C79459a(wVar.f139005a).mo123050a(R.string.dcq).mo123053a();
                        } else {
                            wVar.mo98756a(musicModel, str, false, z, z2, i, z3);
                        }
                    }

                    {
                        this.f139012a = r3;
                        this.f139013b = r4;
                        this.f139016e = r6;
                        this.f139017f = r7;
                    }
                });
                return;
            }
            this.f139006b.bY_();
        }
    }

    /* renamed from: a */
    public final void mo98756a(final MusicModel musicModel, String str, boolean z, boolean z2, boolean z3, final int i, final boolean z4) {
        if (musicModel != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            C51423a.m95791b(4, "Music Download", "ID：" + musicModel.getId());
            if (!AVExternalServiceImpl.m113114a().provideTakeInSameOptimize().enableCombineMusicAndEffectDownload() || z3) {
                this.f139010f.mo98201a(musicModel, new AbstractC61065b() {
                    /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.C612303 */

                    static {
                        Covode.recordClassIndex(71840);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                    /* renamed from: a */
                    public final void mo69324a() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                    /* renamed from: b */
                    public final void mo69328b() {
                        if (C61225w.this.f139005a != null) {
                            C61225w.this.f139005a.runOnUiThread(new RunnableC61096ad(this, musicModel));
                            C61225w.this.f139006b.mo98595a(musicModel);
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                    /* renamed from: a */
                    public final void mo69325a(int i) {
                        if (C61225w.this.f139005a != null) {
                            C61225w.this.f139005a.runOnUiThread(new RunnableC61098af(this, i));
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                    /* renamed from: a */
                    public final void mo69326a(C84125a aVar) {
                        if (C61225w.this.f139005a != null) {
                            C61225w.this.f139005a.runOnUiThread(new RunnableC61099ag(this));
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                    /* renamed from: a */
                    public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
                        if (C61225w.this.f139006b.bZ_()) {
                            if (C61225w.this.f139005a != null) {
                                C61225w.this.f139005a.runOnUiThread(new RunnableC61097ae(this, musicModel, musicWaveBean, str, i));
                            }
                            C61225w.m110861a(str, System.currentTimeMillis() - currentTimeMillis);
                        }
                    }
                }, z2, true);
                return;
            }
            C612272 r5 = new AbstractC61172g() {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.C612272 */

                static {
                    Covode.recordClassIndex(71837);
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
                /* renamed from: b */
                public final void mo98718b(Effect effect) {
                    C61225w.this.f139008d = effect;
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
                /* renamed from: b */
                public final void mo98717b(C61198q qVar) {
                    C61225w.this.f139008d = null;
                    if (C61225w.this.f139005a != null) {
                        C61225w.this.f139005a.runOnUiThread(new RunnableC61241z(this, z4));
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
                /* renamed from: a */
                public final void mo98714a(C61198q qVar) {
                    C61225w.this.f139008d = null;
                    String str = qVar.f138944a;
                    MusicWaveBean musicWaveBean = qVar.f138945b;
                    C61225w.this.f139007c = qVar.f138948e;
                    if (C61225w.this.f139006b.bZ_()) {
                        if (C61225w.this.f139005a != null) {
                            C61225w.this.f139005a.runOnUiThread(new RunnableC61240y(this, z4, musicModel, musicWaveBean, str, i));
                        }
                        C61225w.m110861a(str, System.currentTimeMillis() - currentTimeMillis);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
                /* renamed from: a */
                public final void mo98715a(Effect effect) {
                    if (C61225w.this.f139005a != null) {
                        C61225w.this.f139005a.runOnUiThread(new RunnableC61239x(this, musicModel, z4));
                        C61225w.this.f139006b.mo98595a(musicModel);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
                /* renamed from: a */
                public final void mo98716a(final String str, Effect effect) {
                    if (C61225w.this.f139006b != null) {
                        if (TextUtils.isEmpty(str)) {
                            C61225w.this.f139008d = null;
                            if (C61225w.this.f139006b.bZ_() && C61225w.this.f139005a != null) {
                                C61225w.this.f139005a.runOnUiThread(new RunnableC61094ab(this, musicModel));
                                return;
                            }
                            return;
                        }
                        Effect effect2 = C61225w.this.f139008d;
                        C61225w.this.f139008d = null;
                        if (effect == null && (effect = effect2) == null) {
                            AVExternalServiceImpl.m113114a().abilityService().effectService().buildEffectPlatform(C61225w.this.f139005a, new IAVEffectService.IAVEffectReadyCallback<AbstractC46415f>() {
                                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.C612272.C612281 */

                                static {
                                    Covode.recordClassIndex(71838);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                                public final /* synthetic */ void finish(AbstractC46415f fVar) {
                                    AbstractC46415f fVar2 = fVar;
                                    if (fVar2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(str);
                                        fVar2.mo78912a((List<String>) arrayList, (Map<String, String>) null, false, (IFetchEffectListListener) new IFetchEffectListListener() {
                                            /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w.C612272.C612281.C612291 */

                                            static {
                                                Covode.recordClassIndex(71839);
                                            }

                                            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                                            public final void onFail(ExceptionResult exceptionResult) {
                                            }

                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                            public final /* synthetic */ void onSuccess(List<Effect> list) {
                                                List<Effect> list2 = list;
                                                if (list2 != null && list2.size() > 0 && list2.get(0) != null) {
                                                    C612272.this.mo98716a(str, list2.get(0));
                                                }
                                            }
                                        });
                                    }
                                }
                            }, null);
                        } else if (C61225w.this.f139006b.bZ_() && C61225w.this.f139005a != null) {
                            C61225w.this.f139005a.runOnUiThread(new RunnableC61095ac(this, effect, musicModel));
                        }
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
                /* renamed from: a */
                public final void mo98713a(int i, Effect effect, Long l) {
                    if (C61225w.this.f139005a != null) {
                        C61225w.this.f139005a.runOnUiThread(new RunnableC61093aa(this, i, z4));
                    }
                }
            };
            if (this.f139011g == null) {
                this.f139011g = new C61144bf(this.f139005a, str, musicModel, this.f139010f);
            }
            C61144bf bfVar = this.f139011g;
            if (z) {
                r5 = null;
            }
            bfVar.mo98631a(r5, z4);
        }
    }
}
