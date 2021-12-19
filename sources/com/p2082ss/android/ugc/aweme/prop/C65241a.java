package com.p2082ss.android.ugc.aweme.prop;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.cukaie.closet.internal.C14416d;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.account.AbstractC31670g;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.SafeHandler;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.AbstractC37571a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61177l;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61198q;
import com.p2082ss.android.ugc.aweme.music.p3481ui.ProgressDialogC61165e;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p2082ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68088c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3864e.C72869a;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75382h;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.sticker.model.C75446h;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.types.unlock.C76106a;
import com.p2082ss.android.ugc.aweme.sticker.types.unlock.C76107b;
import com.p2082ss.android.ugc.aweme.sticker.types.unlock.C76108c;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78598b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.prop.a */
public final class C65241a {

    /* renamed from: A */
    public C61177l f147191A;

    /* renamed from: B */
    public String f147192B;

    /* renamed from: C */
    public int f147193C;

    /* renamed from: D */
    public Effect f147194D;

    /* renamed from: E */
    public IFetchEffectListListener f147195E;

    /* renamed from: F */
    AbstractC75382h f147196F;

    /* renamed from: G */
    OnUnlockShareFinishListener f147197G;

    /* renamed from: H */
    public AbstractC61172g f147198H;

    /* renamed from: I */
    public AbstractC65258b f147199I;

    /* renamed from: J */
    private SafeHandler f147200J;

    /* renamed from: K */
    private Music f147201K;

    /* renamed from: L */
    private AbstractC65257a f147202L;

    /* renamed from: a */
    public AbstractC46415f f147203a;

    /* renamed from: b */
    public boolean f147204b;

    /* renamed from: c */
    public ArrayList<String> f147205c;

    /* renamed from: d */
    public String f147206d;

    /* renamed from: e */
    public ShootExtraData f147207e;

    /* renamed from: f */
    public int f147208f;

    /* renamed from: g */
    public ProgressDialogC74145d f147209g;

    /* renamed from: h */
    public ProgressDialogC61165e f147210h;

    /* renamed from: i */
    public boolean f147211i;

    /* renamed from: j */
    public Context f147212j;

    /* renamed from: k */
    public String f147213k;

    /* renamed from: l */
    public String f147214l;

    /* renamed from: m */
    public String f147215m;

    /* renamed from: n */
    public String f147216n;

    /* renamed from: o */
    public String f147217o;

    /* renamed from: p */
    public boolean f147218p;

    /* renamed from: q */
    public AbstractC78597a f147219q;

    /* renamed from: r */
    public AbstractC78598b f147220r;

    /* renamed from: s */
    public IAVEffectService f147221s;

    /* renamed from: t */
    public String f147222t;

    /* renamed from: u */
    public String f147223u;

    /* renamed from: v */
    public String f147224v;

    /* renamed from: w */
    public Effect f147225w;

    /* renamed from: x */
    public boolean f147226x;

    /* renamed from: y */
    public long f147227y;

    /* renamed from: z */
    public long f147228z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.prop.a$a */
    public interface AbstractC65257a {
        static {
            Covode.recordClassIndex(76734);
        }

        /* renamed from: a */
        void mo104415a(AbstractC1729g<AbstractC46415f, Void> gVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.a$b */
    public interface AbstractC65258b extends IEffectDownloadProgressListener {
        static {
            Covode.recordClassIndex(76735);
        }

        /* renamed from: a */
        void mo104416a(Effect effect);

        /* renamed from: a */
        void mo104417a(String str, Effect effect);
    }

    static {
        Covode.recordClassIndex(76718);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.prop.a$c */
    public class C65259c implements AbstractC39159o {

        /* renamed from: a */
        Effect f147254a;

        /* renamed from: b */
        String f147255b;

        static {
            Covode.recordClassIndex(76736);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
        /* renamed from: c */
        public final void mo57528c() {
            C29339a.m58754b(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C65259c.RunnableC652601 */

                static {
                    Covode.recordClassIndex(76737);
                }

                public final void run() {
                    C65241a aVar = C65241a.this;
                    Effect effect = C65259c.this.f147254a;
                    String str = C65259c.this.f147255b;
                    IStickerUtilsService stickerInfo = AVExternalServiceImpl.m113114a().infoService().stickerInfo();
                    if (stickerInfo.hasUnlocked(effect)) {
                        C72869a.f163501a = aVar.f147222t;
                        aVar.mo104410a(effect, str, false);
                    } else if (TextUtils.equals(aVar.f147222t, "prop_reuse") && stickerInfo.isStickerPreviewable(effect)) {
                        C72869a.f163501a = aVar.f147222t;
                        aVar.mo104410a(effect, str, false);
                    }
                }
            });
        }

        @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
        /* renamed from: a_ */
        public final void mo57526a_(Exception exc) {
            if ((C65241a.this.f147212j instanceof Activity) && !((Activity) C65241a.this.f147212j).isFinishing()) {
                C72869a.m128691a((Activity) C65241a.this.f147212j);
            }
        }

        C65259c(Effect effect, String str) {
            this.f147254a = effect;
            this.f147255b = str;
        }
    }

    /* renamed from: d */
    private static boolean m116903d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m116904e() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean d = m116903d();
        C58029j.f132256h = d;
        return d;
    }

    /* renamed from: f */
    private void m116905f() {
        if (this.f147212j instanceof AbstractC1204m) {
            SafeHandler safeHandler = new SafeHandler((AbstractC1204m) this.f147212j);
            this.f147200J = safeHandler;
            safeHandler.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.prop.C65241a.RunnableC652536 */

                static {
                    Covode.recordClassIndex(76730);
                }

                public final void run() {
                    if (C65241a.this.f147211i && (C65241a.this.f147212j instanceof Activity) && !((Activity) C65241a.this.f147212j).isFinishing()) {
                        C65241a aVar = C65241a.this;
                        aVar.f147210h = ProgressDialogC61165e.C61167b.m110784a(aVar.f147212j);
                        C65241a.this.f147210h.setMessage(C65241a.this.f147212j.getResources().getString(R.string.g1j));
                    }
                }
            }, 300);
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo104406a() {
        HashMap hashMap = new HashMap();
        hashMap.put("scene", this.f147223u);
        if (!TextUtils.isEmpty(this.f147224v)) {
            hashMap.put("grade_key", this.f147224v);
        }
        return hashMap;
    }

    /* renamed from: g */
    private boolean m116906g() {
        if (!C80720e.m139939e()) {
            new C79459a(this.f147212j).mo123050a(R.string.feu).mo123053a();
            return false;
        } else if (C80720e.m139940f() >= 20971520) {
            return true;
        } else {
            new C79459a(this.f147212j).mo123050a(R.string.fev).mo123053a();
            return false;
        }
    }

    /* renamed from: b */
    public final C61177l mo104413b() {
        MusicModel convertToMusicModel;
        if (this.f147191A == null) {
            Context context = this.f147212j;
            String str = this.f147205c.get(0);
            Music music = this.f147201K;
            if (music == null) {
                convertToMusicModel = null;
            } else {
                convertToMusicModel = music.convertToMusicModel();
            }
            this.f147191A = new C61177l(context, str, convertToMusicModel);
        }
        return this.f147191A;
    }

    /* renamed from: c */
    private void m116902c() {
        if (m116906g()) {
            C17867d.m33078a();
            if (!m116904e() || !this.f147226x) {
                return;
            }
            if (this.f147209g == null) {
                Context context = this.f147212j;
                ProgressDialogC74145d a = ProgressDialogC74145d.m130371a(context, context.getResources().getString(R.string.bde));
                this.f147209g = a;
                a.setProgress(1);
                this.f147209g.setIndeterminate(false);
                return;
            }
            Context context2 = this.f147212j;
            if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                this.f147209g.setProgress(1);
            }
        }
    }

    public C65241a(Context context) {
        this(context, "prop_reuse");
    }

    /* renamed from: a */
    public final void mo104408a(Music music) {
        if (!CommerceMediaServiceImpl.m77578f().mo66514b(music)) {
            this.f147201K = music;
        }
    }

    /* renamed from: a */
    private static boolean m116901a(Effect effect) {
        if (effect != null && !TextUtils.isEmpty(effect.getExtra())) {
            try {
                if ("true".equals(new JSONObject(effect.getExtra()).optString("no_apply_sound_in_effect_reuse"))) {
                    return true;
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo104407a(int i) {
        Context context;
        if (this.f147209g != null && (context = this.f147212j) != null && (context instanceof Activity) && !((Activity) context).isFinishing() && this.f147209g.isShowing()) {
            this.f147209g.setProgress(i);
        }
    }

    public C65241a(Context context, String str) {
        this(context, str, "");
    }

    /* renamed from: b */
    public final void mo104414b(Effect effect, String str) {
        new C65259c(effect, str).mo57528c();
    }

    /* renamed from: a */
    public final void mo104409a(final Effect effect, final String str) {
        if (C31575b.m65865g().isLogin()) {
            mo104414b(effect, str);
            return;
        }
        C58957c.m108318a((Activity) this.f147212j, "prop_page", "prop_page");
        C31373a.C31374a.m65592a(new AbstractC31670g() {
            /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C6524511 */

            static {
                Covode.recordClassIndex(76722);
            }

            @Override // com.p2082ss.android.ugc.aweme.account.AbstractC31670g
            public final void onStart() {
            }

            @Override // com.p2082ss.android.ugc.aweme.account.AbstractC31670g
            /* renamed from: a */
            public final void mo57662a() {
                if (C31575b.m65865g().isLogin()) {
                    if (!C80580in.m139687c()) {
                        C65241a.this.mo104414b(effect, str);
                    } else {
                        return;
                    }
                }
                C31373a.C31374a.m65595b(this);
            }
        });
    }

    private C65241a(Context context, String str, String str2) {
        this.f147206d = "";
        this.f147207e = new ShootExtraData();
        this.f147208f = 0;
        this.f147211i = false;
        this.f147213k = "";
        this.f147216n = "";
        this.f147221s = AVExternalServiceImpl.m113114a().abilityService().effectService();
        this.f147222t = "";
        this.f147223u = "";
        this.f147224v = "";
        this.f147226x = true;
        this.f147193C = 0;
        this.f147194D = null;
        this.f147202L = new AbstractC65257a() {
            /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C652421 */

            static {
                Covode.recordClassIndex(76719);
            }

            @Override // com.p2082ss.android.ugc.aweme.prop.C65241a.AbstractC65257a
            /* renamed from: a */
            public final void mo104415a(final AbstractC1729g<AbstractC46415f, Void> gVar) {
                final C1743j jVar = new C1743j();
                if (C65241a.this.f147203a == null) {
                    C65241a.this.f147221s.buildEffectPlatform(C65241a.this.f147212j, "prop_page".equals(C65241a.this.f147222t), new IAVEffectService.IAVEffectReadyCallback<AbstractC46415f>() {
                        /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C652421.C652431 */

                        static {
                            Covode.recordClassIndex(76720);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                        public final /* synthetic */ void finish(AbstractC46415f fVar) {
                            AbstractC46415f fVar2 = fVar;
                            if (fVar2 != null) {
                                C65241a.this.f147203a = fVar2;
                                jVar.mo5555a(fVar2);
                                jVar.f5610a.mo5532a((AbstractC1729g) gVar);
                                return;
                            }
                            C65241a.this.f147199I.onFail(null, new ExceptionResult(new RuntimeException("effect so fail")));
                            if (C65241a.this.f147209g != null) {
                                C65241a.this.f147209g.dismiss();
                            }
                        }
                    }, C65267b.f147273a);
                    return;
                }
                jVar.mo5555a(C65241a.this.f147203a);
                jVar.f5610a.mo5532a((AbstractC1729g) gVar);
            }
        };
        this.f147195E = new IFetchEffectListListener() {
            /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C652547 */

            static {
                Covode.recordClassIndex(76731);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                C65241a.this.f147199I.onFail(null, exceptionResult);
                if (C65241a.this.f147209g != null) {
                    C65241a.this.f147209g.dismiss();
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(List<Effect> list) {
                Map<String, String> a = C65241a.this.mo104406a();
                if (AVExternalServiceImpl.m113114a().provideTakeInSameOptimize().enableCombineMusicAndEffectDownload()) {
                    C65241a.this.mo104413b().mo98634a(a, C65241a.this.f147198H, false, C65241a.this.f147205c.get(C65241a.this.f147208f));
                } else {
                    AVExternalServiceImpl.m113114a().abilityService().effectService().fetchEffectResource(C65241a.this.f147205c.get(C65241a.this.f147208f), true, a, C65241a.this.f147203a, C65241a.this.f147199I);
                }
            }
        };
        this.f147197G = new OnUnlockShareFinishListener() {
            /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C652558 */

            static {
                Covode.recordClassIndex(76732);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onVKShareSucceed(Effect effect) {
            }

            @Override // com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onShareAppFailed() {
                if ((C65241a.this.f147212j instanceof Activity) && !((Activity) C65241a.this.f147212j).isFinishing()) {
                    C72869a.m128691a((Activity) C65241a.this.f147212j);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onShareAppSucceed(Effect effect) {
                if (C65241a.this.f147196F != null) {
                    C76108c cVar = new C76108c();
                    cVar.f170995a = UnLockSticker.STICKER_UNLOCKED;
                    cVar.f170996b = effect;
                    cVar.f170997c = C65241a.this.f147222t;
                    AbstractC81915c.m141875b(cVar);
                    C72869a.f163501a = C65241a.this.f147222t;
                    C65241a.this.f147225w = effect;
                    if (TextUtils.equals(C65241a.this.f147222t, "prop_page")) {
                        AbstractC81915c.m141874a(new C76106a());
                    } else if (TextUtils.equals(C65241a.this.f147222t, "prop_reuse")) {
                        AbstractC81915c.m141874a(new C76107b());
                    }
                }
            }
        };
        this.f147198H = new AbstractC61172g() {
            /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C6524612 */

            static {
                Covode.recordClassIndex(76723);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
            /* renamed from: a */
            public final void mo98715a(Effect effect) {
                C65241a.this.f147199I.onStart(effect);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
            /* renamed from: b */
            public final void mo98718b(Effect effect) {
                C65241a.this.f147199I.mo104416a(effect);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
            /* renamed from: b */
            public final void mo98717b(C61198q qVar) {
                C65241a.this.f147199I.onFail(qVar.f138948e, qVar.f138950g);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
            /* renamed from: a */
            public final void mo98714a(C61198q qVar) {
                C65241a.this.f147192B = qVar.f138944a;
                C65241a.this.f147199I.onSuccess(qVar.f138948e);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
            /* renamed from: a */
            public final void mo98716a(String str, Effect effect) {
                C65241a.this.f147199I.mo104417a(str, effect);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
            /* renamed from: a */
            public final void mo98713a(int i, Effect effect, Long l) {
                C65241a.this.f147199I.onProgress(effect, i, l.longValue());
            }
        };
        this.f147199I = new AbstractC65258b() {
            /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C652472 */

            static {
                Covode.recordClassIndex(76724);
            }

            @Override // com.p2082ss.android.ugc.aweme.prop.C65241a.AbstractC65258b
            /* renamed from: a */
            public final void mo104416a(Effect effect) {
                C65241a.this.f147194D = effect;
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
                C65241a.this.f147228z = 0;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final boolean mo104418a(C1731i<C75446h> iVar) {
                List<C75445g> list;
                if (!(iVar.mo5539b() || iVar.mo5544c() || iVar.mo5545d() == null || (list = iVar.mo5545d().mStickers) == null || list.size() == 0)) {
                    AbstractC37571a b = CommerceStickerServiceImpl.m75788c().mo65425b();
                    C75445g gVar = list.get(0);
                    if (b.mo65428a(gVar)) {
                        b.mo65427a(C65241a.this.f147212j, gVar, "homepage_hot");
                        return true;
                    }
                }
                return false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(Effect effect) {
                Effect effect2 = effect;
                C65241a.this.f147205c.size();
                C65241a.this.f147205c.get(0);
                C65241a.this.f147194D = null;
                C65241a.this.f147204b = true;
                C65241a.this.f147225w = effect2;
                C65241a.this.mo104407a(100);
                C80273bt.m139146b(C65241a.this.f147209g);
                C65241a.this.f147211i = false;
                C80273bt.m139146b(C65241a.this.f147210h);
                if (TextUtils.isEmpty(C65241a.this.f147213k)) {
                    C65241a.this.f147213k = UUID.randomUUID().toString();
                }
                if (C65241a.this.f147219q != null) {
                    C65241a.this.f147219q.onIntercept(C65241a.this.f147213k, effect2);
                } else {
                    String str = "homepage_hot";
                    if (C65241a.this.f147214l.equals("green_screen")) {
                        C33744d a = new C33744d().mo59983a("content_type", "video").mo59983a("content_source", "shoot");
                        if (!TextUtils.isEmpty(C65241a.this.f147217o)) {
                            str = C65241a.this.f147217o;
                        }
                        C39162r.m79460a("shoot", a.mo59983a("enter_from", str).mo59983a("creation_id", C65241a.this.f147213k).mo59983a("group_id", C65241a.this.f147216n).mo59983a("giphy_id", C65241a.this.f147206d).f79943a);
                    } else {
                        C33744d a2 = new C33744d().mo59983a("creation_id", C65241a.this.f147213k).mo59983a("shoot_way", C65241a.this.f147214l).mo59983a("prop_id", effect2.getEffectId()).mo59983a("giphy_id", C65241a.this.f147206d);
                        if (!TextUtils.isEmpty(C65241a.this.f147217o)) {
                            str = C65241a.this.f147217o;
                        }
                        C39162r.m79460a("shoot", a2.mo59983a("enter_from", str).mo59981a("time_elapsed_since_launch_app", AVExternalServiceImpl.m113114a().infoService().getDurationSinceAppForeground(C65241a.this.f147213k)).f79943a);
                    }
                }
                if (TextUtils.equals(C65241a.this.f147222t, "prop_page")) {
                    FaceStickerBean.sCurPropSource = "prop_page";
                }
                if (!AVExternalServiceImpl.m113114a().infoService().stickerInfo().isLockSticker(effect2) || ((!TextUtils.equals(C65241a.this.f147222t, "prop_reuse") && !TextUtils.equals(C65241a.this.f147222t, "prop_page")) || C80580in.m139687c())) {
                    C65241a aVar = C65241a.this;
                    aVar.mo104410a(effect2, aVar.f147213k, false);
                } else if (effect2.isBusiness()) {
                    C1731i.m5640b(new CallableC65308c(effect2), C1731i.f5562a).mo5534a(new C65314d(this, effect2), C1731i.f5564c, null);
                } else {
                    C65241a aVar2 = C65241a.this;
                    aVar2.mo104409a(effect2, aVar2.f147213k);
                }
                if (C65241a.this.f147220r != null) {
                    C65241a.this.f147220r.onFinish(0);
                }
                AVExternalServiceImpl.m113114a().infoService().endDownloadEffectAlog(effect2, C65241a.this.f147228z, System.currentTimeMillis() - C65241a.this.f147227y, 0, null);
            }

            @Override // com.p2082ss.android.ugc.aweme.prop.C65241a.AbstractC65258b
            /* renamed from: a */
            public final void mo104417a(final String str, Effect effect) {
                if (TextUtils.isEmpty(str)) {
                    onFail(effect, new ExceptionResult(-1));
                    return;
                }
                Effect effect2 = C65241a.this.f147194D;
                C65241a.this.f147194D = null;
                if (effect == null && (effect = effect2) == null) {
                    AVExternalServiceImpl.m113114a().abilityService().effectService().buildEffectPlatform(C65241a.this.f147212j, new IAVEffectService.IAVEffectReadyCallback<AbstractC46415f>() {
                        /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C652472.C652481 */

                        static {
                            Covode.recordClassIndex(76725);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                        public final /* synthetic */ void finish(AbstractC46415f fVar) {
                            AbstractC46415f fVar2 = fVar;
                            if (fVar2 != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(str);
                                fVar2.mo78912a((List<String>) arrayList, C65241a.this.mo104406a(), false, (IFetchEffectListListener) new IFetchEffectListListener() {
                                    /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C652472.C652481.C652491 */

                                    static {
                                        Covode.recordClassIndex(76726);
                                    }

                                    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                                    public final void onFail(ExceptionResult exceptionResult) {
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                    public final /* synthetic */ void onSuccess(List<Effect> list) {
                                        List<Effect> list2 = list;
                                        if (list2 != null && list2.size() > 0 && list2.get(0) != null) {
                                            C652472.this.mo104417a(str, list2.get(0));
                                        }
                                    }
                                });
                            }
                        }
                    }, null);
                    return;
                }
                C65241a.this.f147211i = false;
                C80273bt.m139146b(C65241a.this.f147210h);
                if (TextUtils.isEmpty(C65241a.this.f147213k)) {
                    C65241a.this.f147213k = UUID.randomUUID().toString();
                }
                if (C65241a.this.f147219q != null) {
                    C65241a.this.f147219q.onIntercept(C65241a.this.f147213k, effect);
                } else {
                    String str2 = "homepage_hot";
                    if (C65241a.this.f147214l.equals("green_screen")) {
                        C33744d a = new C33744d().mo59983a("content_type", "video").mo59983a("content_source", "shoot");
                        if (!TextUtils.isEmpty(C65241a.this.f147217o)) {
                            str2 = C65241a.this.f147217o;
                        }
                        C39162r.m79460a("shoot", a.mo59983a("enter_from", str2).mo59983a("creation_id", C65241a.this.f147213k).mo59983a("group_id", C65241a.this.f147216n).mo59983a("giphy_id", C65241a.this.f147206d).f79943a);
                    } else {
                        C33744d a2 = new C33744d().mo59983a("creation_id", C65241a.this.f147213k).mo59983a("shoot_way", C65241a.this.f147214l).mo59983a("prop_id", str).mo59983a("giphy_id", C65241a.this.f147206d);
                        if (!TextUtils.isEmpty(C65241a.this.f147217o)) {
                            str2 = C65241a.this.f147217o;
                        }
                        C39162r.m79460a("shoot", a2.mo59983a("enter_from", str2).mo59981a("time_elapsed_since_launch_app", AVExternalServiceImpl.m113114a().infoService().getDurationSinceAppForeground(C65241a.this.f147213k)).f79943a);
                    }
                }
                if (TextUtils.equals(C65241a.this.f147222t, "prop_page")) {
                    FaceStickerBean.sCurPropSource = "prop_page";
                }
                if (!AVExternalServiceImpl.m113114a().infoService().stickerInfo().isLockSticker(effect) || ((!TextUtils.equals(C65241a.this.f147222t, "prop_reuse") && !TextUtils.equals(C65241a.this.f147222t, "prop_page")) || C80580in.m139687c())) {
                    C65241a aVar = C65241a.this;
                    aVar.mo104410a(effect, aVar.f147213k, true);
                } else if (effect.isBusiness()) {
                    C1731i.m5640b(new CallableC65321e(effect), C1731i.f5562a).mo5534a(new C65322f(this, effect), C1731i.f5564c, null);
                } else {
                    C65241a aVar2 = C65241a.this;
                    aVar2.mo104409a(effect, aVar2.f147213k);
                }
                if (C65241a.this.f147220r != null) {
                    C65241a.this.f147220r.onFinish(0);
                }
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                exceptionResult.getMsg();
                exceptionResult.getErrorCode();
                C65241a.this.f147211i = false;
                C80273bt.m139146b(C65241a.this.f147210h);
                C65241a.this.f147194D = null;
                int errorCode = exceptionResult.getErrorCode();
                if (errorCode == 2004 || errorCode == 2002 || errorCode == 2003 || errorCode == 2006) {
                    C65241a.this.f147208f++;
                    if (!C65241a.this.f147218p || C65241a.this.f147208f >= C65241a.this.f147205c.size()) {
                        if (!C65241a.this.f147204b) {
                            if (errorCode == 2004 || errorCode == 2002) {
                                new C79459a(C65241a.this.f147212j).mo123052a(C65241a.this.f147212j.getResources().getString(R.string.blg)).mo123053a();
                            } else if (errorCode == 2003) {
                                new C79459a(C65241a.this.f147212j).mo123052a(C65241a.this.f147212j.getResources().getString(R.string.b6b)).mo123053a();
                            } else if (errorCode == 2006) {
                                if (!C52912c.f121688a.f121689b.getStickerUpdateApp().booleanValue() || C13603b.m24435a((Collection) C65241a.this.f147205c) || TextUtils.isEmpty(C65241a.this.f147205c.get(0))) {
                                    new C79459a(C65241a.this.f147212j).mo123052a(C65241a.this.f147212j.getResources().getString(R.string.h2p)).mo123053a();
                                    if (C65241a.this.f147220r != null) {
                                        C65241a.this.f147220r.onFinish(errorCode);
                                    }
                                } else {
                                    if (C65241a.this.f147212j instanceof Activity) {
                                        String str = C65241a.this.f147205c.get(0);
                                        if (Build.VERSION.SDK_INT < 21) {
                                            new C79459a(C65241a.this.f147212j).mo123052a(C65241a.this.f147212j.getResources().getString(R.string.h2p)).mo123053a();
                                        } else {
                                            Activity activity = (Activity) C65241a.this.f147212j;
                                            C17197a.C17200a aVar = new C17197a.C17200a(activity);
                                            aVar.mo27189a(R.string.g4a).mo27194b(R.string.g49).mo27190a(R.string.g4b, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(activity, str) {
                                                /* class com.p2082ss.android.ugc.aweme.prop.C65241a.DialogInterface$OnClickListenerC652514 */

                                                /* renamed from: a */
                                                final /* synthetic */ Activity f147243a;

                                                /* renamed from: b */
                                                final /* synthetic */ String f147244b;

                                                static {
                                                    Covode.recordClassIndex(76728);
                                                }

                                                {
                                                    this.f147243a = r1;
                                                    this.f147244b = r2;
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    UgCommonServiceImpl.m138290j().mo123100b().mo123139a(this.f147243a, true, this.f147244b);
                                                    new C14401a(new C14416d()).mo23215a(this.f147243a, ReuseStickerUpdateSP.class);
                                                    System.currentTimeMillis();
                                                    C17867d.m33084e();
                                                }
                                            }, false).mo27195b(R.string.g4_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                                /* class com.p2082ss.android.ugc.aweme.prop.C65241a.DialogInterface$OnClickListenerC652503 */

                                                static {
                                                    Covode.recordClassIndex(76727);
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                }
                                            }, false);
                                            Dialog c = aVar.mo27193a().mo27185c();
                                            c.setCanceledOnTouchOutside(false);
                                            if (!((Activity) C65241a.this.f147212j).isFinishing()) {
                                                c.show();
                                            }
                                        }
                                    }
                                    if (C65241a.this.f147220r != null) {
                                        C65241a.this.f147220r.onFinish(2006);
                                    }
                                }
                            }
                        }
                        if (!(C65241a.this.f147220r == null || errorCode == 2006)) {
                            C65241a.this.f147220r.onFinish(errorCode);
                        }
                        AVExternalServiceImpl.m113114a().infoService().endDownloadEffectAlog(C65241a.this.f147225w, C65241a.this.f147228z, System.currentTimeMillis() - C65241a.this.f147227y, -1, exceptionResult);
                    }
                    AVExternalServiceImpl.m113114a().abilityService().effectService().fetchEffectResource(C65241a.this.f147205c.get(C65241a.this.f147208f), true, C65241a.this.mo104406a(), C65241a.this.f147203a, C65241a.this.f147199I);
                    C65241a.this.f147220r.onFinish(errorCode);
                    AVExternalServiceImpl.m113114a().infoService().endDownloadEffectAlog(C65241a.this.f147225w, C65241a.this.f147228z, System.currentTimeMillis() - C65241a.this.f147227y, -1, exceptionResult);
                }
                new C79459a(C65241a.this.f147212j).mo123052a(C65241a.this.f147212j.getResources().getString(R.string.bqd)).mo123053a();
                C80273bt.m139146b(C65241a.this.f147209g);
                C65241a.this.f147220r.onFinish(errorCode);
                AVExternalServiceImpl.m113114a().infoService().endDownloadEffectAlog(C65241a.this.f147225w, C65241a.this.f147228z, System.currentTimeMillis() - C65241a.this.f147227y, -1, exceptionResult);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
            public final void onProgress(Effect effect, int i, long j) {
                C65241a.this.mo104407a(i);
                if (C65241a.this.f147228z == 0) {
                    C65241a.this.f147228z = j;
                    AVExternalServiceImpl.m113114a().infoService().startDownloadEffectAlog(effect, j);
                }
            }
        };
        this.f147212j = context;
        this.f147214l = str;
        this.f147216n = str2;
    }

    /* renamed from: a */
    public final void mo104410a(Effect effect, String str, boolean z) {
        String str2;
        String str3;
        MusicModel musicModel = null;
        if (this.f147221s.isEffectControlGame(effect)) {
            this.f147201K = null;
        }
        C72869a.f163501a = this.f147222t;
        final RecordConfig.Builder videoLength = new RecordConfig.Builder().shootWay(this.f147214l).creationId(str).startRecordTime(this.f147227y).effectDownloadDuration(System.currentTimeMillis() - this.f147227y).translationType(C68088c.m120390a()).stickers(this.f147205c).giphyGifIds(this.f147206d).shootExtraData(this.f147207e).prepareFilter(true).firstSticker(effect).stickerMusic(this.f147201K).stickerWithMusicFilePath(this.f147192B).stickerParams(mo104406a()).videoLength(Integer.valueOf(this.f147193C));
        String str4 = this.f147217o;
        if (str4 != null) {
            videoLength.enterFrom(str4);
        }
        if (this.f147201K != null && !m116901a(effect)) {
            if (MusicService.m81198m().mo69308a(this.f147201K.convertToMusicModel(), this.f147212j, false)) {
                videoLength.autoUseMusic(new StringBuilder().append(this.f147201K.getId()).toString());
            }
        }
        if (z) {
            if (effect != null) {
                str2 = effect.getEffectId();
            } else {
                str2 = null;
            }
            if (this.f147201K == null || m116901a(effect)) {
                str3 = null;
            } else {
                str3 = new StringBuilder().append(this.f147201K.getId()).toString();
            }
            Music music = this.f147201K;
            if (music != null) {
                musicModel = music.convertToMusicModel();
            }
            videoLength.recordPresetResource(new RecordPresetResource(str2, effect, str3, musicModel));
        }
        if (this.f147215m != null && !m116901a(effect)) {
            videoLength.musicOrigin(this.f147215m);
        }
        String str5 = "reuse_sticker";
        if (this.f147214l.equals("prop_page") || this.f147214l.equals("scan")) {
            IExternalService a = AVExternalServiceImpl.m113114a();
            if (!TextUtils.isEmpty(this.f147214l)) {
                str5 = this.f147214l;
            }
            a.asyncService(str5, new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C652569 */

                static {
                    Covode.recordClassIndex(76733);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    asyncAVService.uiService().recordService().startRecord(C65241a.this.f147212j, videoLength.build());
                }
            });
            return;
        }
        IExternalService a2 = AVExternalServiceImpl.m113114a();
        if (!TextUtils.isEmpty(this.f147214l)) {
            str5 = this.f147214l;
        }
        a2.asyncServiceWithOutPanel(str5, new SimpleServiceLoadCallback() {
            /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C6524410 */

            static {
                Covode.recordClassIndex(76721);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().startRecord(C65241a.this.f147212j, videoLength.build());
            }
        });
    }

    /* renamed from: a */
    public final void mo104412a(final boolean z, ArrayList<String> arrayList, boolean z2, final boolean z3) {
        this.f147218p = z2;
        this.f147227y = System.currentTimeMillis();
        AVExternalServiceImpl.m113114a().provideAVPerformance().start("av_video_record_init", "clickReuseSticker");
        this.f147205c = arrayList;
        m116902c();
        if (z && !z3) {
            this.f147211i = true;
            m116905f();
        }
        ArrayList<String> arrayList2 = this.f147205c;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.f147204b = false;
            this.f147202L.mo104415a(new AbstractC1729g<AbstractC46415f, Void>() {
                /* class com.p2082ss.android.ugc.aweme.prop.C65241a.C652525 */

                /* renamed from: a */
                final /* synthetic */ boolean f147245a = false;

                static {
                    Covode.recordClassIndex(76729);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // p077b.AbstractC1729g
                public final /* synthetic */ Void then(C1731i<AbstractC46415f> iVar) {
                    AbstractC61172g gVar;
                    if (C65241a.this.f147203a != null) {
                        Map<String, String> a = C65241a.this.mo104406a();
                        if (this.f147245a) {
                            C65241a.this.f147221s.fetchEffectListResource(C65241a.this.f147205c, a, false, C65241a.this.f147203a, C65241a.this.f147195E);
                        } else if (AVExternalServiceImpl.m113114a().provideTakeInSameOptimize().enableCombineMusicAndEffectDownload()) {
                            C61177l b = C65241a.this.mo104413b();
                            if (z3) {
                                gVar = null;
                            } else {
                                gVar = C65241a.this.f147198H;
                            }
                            b.mo98634a(a, gVar, z, C65241a.this.f147205c.get(0));
                        } else {
                            C65241a.this.f147221s.fetchEffectResource(C65241a.this.f147205c.get(0), true, a, C65241a.this.f147203a, C65241a.this.f147199I);
                        }
                    }
                    return null;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo104411a(ArrayList<String> arrayList, String str, String str2, boolean z, int i, boolean z2) {
        boolean z3;
        this.f147222t = str;
        this.f147223u = str2;
        this.f147193C = i;
        if (z || z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f147226x = z3;
        mo104412a(z2, arrayList, false, z);
    }
}
