package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1481d.C20744c;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.widget.spring.EnumC23427e;
import com.bytedance.tux.widget.spring.EnumC23429g;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.SafeHandler;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2530b.AbstractC37570a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.AbstractC37571a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41102a;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41135h;
import com.p2082ss.android.ugc.aweme.detail.C41247m;
import com.p2082ss.android.ugc.aweme.detail.base.C41112a;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.favorites.p2922d.C47420a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.GreenScreenMaterial;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59240f;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.C80638a;
import com.p2082ss.android.ugc.aweme.p4243y.C81779c;
import com.p2082ss.android.ugc.aweme.prop.C65241a;
import com.p2082ss.android.ugc.aweme.prop.p3605a.C65261a;
import com.p2082ss.android.ugc.aweme.prop.p3605a.C65262b;
import com.p2082ss.android.ugc.aweme.prop.p3607c.C65311c;
import com.p2082ss.android.ugc.aweme.prop.p3608d.C65315a;
import com.p2082ss.android.ugc.aweme.prop.view.AbstractC65327a;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.sticker.model.C75446h;
import com.p2082ss.android.ugc.aweme.sticker.types.unlock.C76106a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4161b.C79365a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.aweme.views.C81437h;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.AbstractC1729g;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.prop.b.j */
public class C65283j extends AbstractC41102a implements AbstractC65327a, AbstractC90252i, AbstractC90253j {

    /* renamed from: N */
    RemoteImageView f147292N;

    /* renamed from: O */
    public RemoteImageView f147293O;

    /* renamed from: P */
    GridView f147294P;

    /* renamed from: Q */
    View f147295Q;

    /* renamed from: R */
    CheckableImageView f147296R;

    /* renamed from: S */
    TextView f147297S;

    /* renamed from: T */
    ImageView f147298T;

    /* renamed from: U */
    FrameLayout f147299U;

    /* renamed from: V */
    SmartImageView f147300V;

    /* renamed from: W */
    TuxTextView f147301W;

    /* renamed from: X */
    CheckableImageView f147302X;

    /* renamed from: Y */
    ViewGroup f147303Y;

    /* renamed from: Z */
    ViewStub f147304Z;

    /* renamed from: a */
    public C23226a f147305a;

    /* renamed from: aA */
    private String f147306aA;

    /* renamed from: aB */
    private C65315a f147307aB;

    /* renamed from: aC */
    private String f147308aC;

    /* renamed from: aD */
    private C75446h f147309aD;

    /* renamed from: aE */
    private ViewGroup f147310aE;

    /* renamed from: aF */
    private boolean f147311aF;

    /* renamed from: aG */
    private boolean f147312aG;

    /* renamed from: aH */
    private C65262b f147313aH;

    /* renamed from: aI */
    private float f147314aI;

    /* renamed from: aJ */
    private float f147315aJ;

    /* renamed from: aK */
    private C65241a f147316aK;

    /* renamed from: aL */
    private String f147317aL;

    /* renamed from: aM */
    private C69905c f147318aM;

    /* renamed from: aN */
    private Serializable f147319aN;

    /* renamed from: aO */
    private int f147320aO;

    /* renamed from: aP */
    private String f147321aP;

    /* renamed from: aQ */
    private boolean f147322aQ;

    /* renamed from: aR */
    private boolean f147323aR;

    /* renamed from: aS */
    private Handler f147324aS = new SafeHandler(this);

    /* renamed from: aT */
    private AbstractC65279h f147325aT;

    /* renamed from: aU */
    private AbstractC80640c f147326aU;

    /* renamed from: aV */
    private C65277f f147327aV;

    /* renamed from: aW */
    private List<String> f147328aW;

    /* renamed from: aX */
    private boolean f147329aX = false;

    /* renamed from: aY */
    private IAVEffectService.EffectPlatformLoader f147330aY = new IAVEffectService.EffectPlatformLoader() {
        /* class com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j.C652841 */

        static {
            Covode.recordClassIndex(76763);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.EffectPlatformLoader
        public final void load(AbstractC1729g<AbstractC46415f, Void> gVar) {
            C1743j jVar = new C1743j();
            if (C65283j.this.f147353av == null) {
                IAVEffectService iAVEffectService = C65283j.this.f147354aw;
                Context applicationContext = C65283j.this.getContext().getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                iAVEffectService.buildEffectPlatform(applicationContext, new C65306y(this, jVar, gVar), C65307z.f147409a);
                return;
            }
            jVar.mo5555a(C65283j.this.f147353av);
            jVar.f5610a.mo5532a((AbstractC1729g) gVar);
        }
    };

    /* renamed from: aZ */
    private AbstractC37570a f147331aZ = null;

    /* renamed from: aa */
    ViewStub f147332aa;

    /* renamed from: ab */
    ViewStub f147333ab;

    /* renamed from: ac */
    ViewStub f147334ac;

    /* renamed from: ad */
    ViewStub f147335ad;

    /* renamed from: ae */
    SpringLayout f147336ae;

    /* renamed from: af */
    ViewGroup f147337af;

    /* renamed from: ag */
    LinearLayout f147338ag;

    /* renamed from: ah */
    RemoteImageView f147339ah;

    /* renamed from: ai */
    TextView f147340ai;

    /* renamed from: aj */
    TextView f147341aj;

    /* renamed from: ak */
    TextView f147342ak;

    /* renamed from: al */
    LinearLayout f147343al;

    /* renamed from: am */
    TuxTextView f147344am;

    /* renamed from: an */
    public int f147345an;

    /* renamed from: ao */
    boolean f147346ao;

    /* renamed from: ap */
    public C75445g f147347ap;

    /* renamed from: aq */
    String f147348aq;

    /* renamed from: ar */
    String f147349ar;

    /* renamed from: as */
    String f147350as;

    /* renamed from: at */
    String f147351at;

    /* renamed from: au */
    int f147352au;

    /* renamed from: av */
    public AbstractC46415f f147353av;

    /* renamed from: aw */
    public IAVEffectService f147354aw = AVExternalServiceImpl.m113114a().abilityService().effectService();

    /* renamed from: ax */
    AbstractC37571a f147355ax = CommerceStickerServiceImpl.m75788c().mo65425b();

    /* renamed from: ay */
    private C65261a f147356ay;

    /* renamed from: az */
    private String f147357az;

    /* renamed from: b */
    View f147358b;

    /* renamed from: ba */
    private RelativeLayout f147359ba;

    /* renamed from: bb */
    private final AbstractView$OnClickListenerC80259bp f147360bb = new AbstractView$OnClickListenerC80259bp() {
        /* class com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j.C652852 */

        static {
            Covode.recordClassIndex(76764);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            C65283j jVar = C65283j.this;
            if (jVar.getActivity() == null || !MSAdaptionService.m97895c().mo89375b((Context) jVar.getActivity())) {
                String uuid = UUID.randomUUID().toString();
                C33744d a = new C33744d().mo59983a("creation_id", uuid).mo59983a("shoot_way", "prop_page").mo59983a("enter_from", "prop_page");
                if (jVar.mo104441a() == null) {
                    str = "";
                } else {
                    str = jVar.mo104441a().get(0);
                }
                C33744d a2 = a.mo59983a("prop_id", str).mo59982a("is_ui_shoot", (Object) true).mo59981a("time_elapsed_since_launch_app", AVExternalServiceImpl.m113114a().infoService().getDurationSinceAppForeground(uuid)).mo59983a("group_id", jVar.f147349ar).mo59983a("shoot_enter_from", jVar.f147350as).mo59980a("is_bundled", jVar.f147352au);
                if (!TextUtils.isEmpty(jVar.f147351at)) {
                    a2.mo59983a("from_banner_id", jVar.f147351at);
                }
                AVExternalServiceImpl.m113114a().getAVMobService().onEventV3("shoot", a2.f79943a);
                if (!jVar.f147355ax.mo65427a(view.getContext(), jVar.f147347ap, "prop_collection")) {
                    IAVSettingsService avsettingsConfig = AVExternalServiceImpl.m113114a().configService().avsettingsConfig();
                    if (avsettingsConfig == null || !avsettingsConfig.needLoginBeforeRecord()) {
                        jVar.mo104448a(false, uuid, AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
                    } else {
                        C58957c.m108320a(jVar.getActivity(), "prop_page", "prop_reuse_icon", (Bundle) null, (AbstractC34543f) null);
                    }
                }
            } else {
                Toast makeText = Toast.makeText(jVar.getActivity(), jVar.getString(R.string.bed), 0);
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(makeText);
                }
                makeText.show();
            }
        }
    };

    /* renamed from: bc */
    private boolean f147361bc = false;

    /* renamed from: bd */
    private long f147362bd = -1;

    /* renamed from: be */
    private boolean f147363be = false;

    /* renamed from: c */
    ViewGroup f147364c;

    /* renamed from: d */
    RemoteImageView f147365d;

    /* renamed from: e */
    RemoteImageView f147366e;

    /* renamed from: j */
    RemoteImageView f147367j;

    /* renamed from: k */
    TextView f147368k;

    /* renamed from: l */
    TextView f147369l;

    /* renamed from: m */
    TextView f147370m;

    /* renamed from: n */
    View f147371n;

    /* renamed from: o */
    View f147372o;

    /* renamed from: p */
    DmtStatusView f147373p;

    /* renamed from: q */
    RemoteImageView f147374q;

    /* renamed from: r */
    ViewGroup f147375r;

    /* renamed from: s */
    ViewStub f147376s;

    /* renamed from: t */
    View f147377t;

    /* renamed from: u */
    ImageView f147378u;

    static {
        Covode.recordClassIndex(76762);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final String mo62627a(int i) {
        return "prop_page";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new RunnableC90250g(C65283j.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(166, new RunnableC90250g(C65283j.class, "receiveJumpMessage", C76106a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: h */
    public final int mo62639h() {
        return R.layout.a1n;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: k */
    public final void mo62642k() {
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: n */
    public final boolean mo70352n() {
        return false;
    }

    /* renamed from: a */
    public final void mo104447a(boolean z) {
        getContext();
        if (!m116951j()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            if (!this.f147329aX) {
                this.f147373p.mo27387h();
            }
        } else {
            if (!this.f147329aX) {
                this.f147373p.mo27384f();
            }
            this.f147307aB.mo57616a(this.f147308aC, 0);
        }
        if (z) {
            this.f147373p.mo27382d();
            if (this.f96076I != null) {
                C35658s sVar = (C35658s) this.f96076I.get(this.f147313aH.f147260b);
                if (sVar != null) {
                    sVar.mo62677j();
                } else {
                    this.f147336ae.setRefreshing(false);
                }
            } else {
                SpringLayout springLayout = this.f147336ae;
                if (springLayout != null) {
                    springLayout.setRefreshing(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo104448a(boolean z, String str, boolean z2) {
        if (this.f147316aK == null) {
            C65241a aVar = new C65241a(getActivity(), "prop_page");
            this.f147316aK = aVar;
            aVar.f147207e.setShootEnterFrom(this.f147350as);
            this.f147316aK.f147207e.setFromBannerId(this.f147351at);
            this.f147316aK.f147207e.setBundled(Integer.valueOf(this.f147352au));
            this.f147316aK.f147215m = "prop_auto";
            this.f147316aK.f147213k = str;
            this.f147316aK.f147193C = this.f147320aO;
        }
        this.f147316aK.f147219q = new C65304w(this);
        ArrayList<String> a = mo104441a();
        if (a != null && a.size() != 0) {
            Serializable serializable = this.f147319aN;
            if (serializable instanceof Music) {
                this.f147316aK.mo104408a((Music) serializable);
            }
            this.f147316aK.mo104411a(a, "prop_page", this.f147306aA, z, this.f147320aO, z2);
        }
    }

    /* renamed from: a */
    public final void mo104446a(String str) {
        C75445g gVar = this.f147347ap;
        if (gVar != null && !TextUtils.isEmpty(gVar.ownerId) && !TextUtils.isEmpty(this.f147347ap.ownerName)) {
            C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("prop_id", this.f147347ap.f169545id).mo59983a("to_user_id", this.f147347ap.ownerId).mo59983a("enter_from", "prop_page").mo59983a("enter_method", str).f79943a);
            C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://user/profile/" + this.f147347ap.ownerId).mo63248a("sec_user_id", this.f147347ap.mSecUid).mo63248a("enter_from", "prop_page").mo63249a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.prop.view.AbstractC65327a
    /* renamed from: a */
    public final void mo104445a(Exception exc) {
        C51423a.m95790a((Throwable) exc);
        SpringLayout springLayout = this.f147336ae;
        if (springLayout != null) {
            springLayout.setRefreshing(false);
        }
        if (af_()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            if (this.f147329aX) {
                this.f147373p.mo27382d();
            } else {
                this.f147373p.mo27387h();
            }
        }
        ImageView imageView = this.f147298T;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        m116948b(this.f147361bc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo104454e() {
        mo104447a(false);
    }

    /* renamed from: g */
    private static boolean m116950g() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: i */
    public final String mo62640i() {
        C75445g gVar = this.f147347ap;
        if (gVar != null) {
            return gVar.f169545id;
        }
        return "";
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AbstractC46415f fVar = this.f147353av;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    /* renamed from: j */
    private static boolean m116951j() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean g = m116950g();
        C58029j.f132256h = g;
        return g;
    }

    /* renamed from: q */
    private void m116953q() {
        if (AVExternalServiceImpl.m113114a().provideTakeInSameOptimize().enableTakeInSameRecordOptimize(C17867d.m33078a())) {
            mo104448a(true, "", false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo104453d() {
        mo104447a(true);
        C39162r.m79460a("refresh_page", new C33744d().mo59983a("enter_from", "prop_page").f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C65241a aVar = this.f147316aK;
        if (aVar != null && aVar.f147191A != null) {
            aVar.f147191A.mo98630a();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f147362bd = System.currentTimeMillis();
        if (this.f147363be) {
            C65241a aVar = this.f147316aK;
            if (aVar.f147225w != null) {
                aVar.mo104410a(aVar.f147225w, UUID.randomUUID().toString(), false);
            }
            this.f147363be = false;
            this.f147361bc = false;
        }
        m116948b(this.f147361bc);
    }

    /* renamed from: m */
    private ArrayList<C75445g> m116952m() {
        C75446h hVar = this.f147309aD;
        if (hVar == null || hVar.mStickers == null || this.f147309aD.mStickers.size() == 0) {
            return null;
        }
        ArrayList<C75445g> arrayList = new ArrayList<>(this.f147309aD.mStickers.size());
        for (C75445g gVar : this.f147309aD.mStickers) {
            if (!gVar.mIsSelect) {
                arrayList.add(gVar);
            } else {
                arrayList.add(0, gVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ArrayList<String> mo104441a() {
        C75446h hVar = this.f147309aD;
        if (hVar == null || hVar.mStickers == null || this.f147309aD.mStickers.size() == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>(this.f147309aD.mStickers.size());
        for (C75445g gVar : this.f147309aD.mStickers) {
            if (!gVar.mIsSelect) {
                arrayList.add(gVar.f169545id);
            } else {
                arrayList.add(0, gVar.f169545id);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo104452c() {
        List<Aweme> list;
        C59240f a = new C59240f().mo96797a("prop_page");
        a.f135198t = "prop_page";
        a.f135195q = this.f147347ap.f169545id;
        a.f135197s = C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108760a(this.f147349ar, 0));
        a.f135186a = this.f147349ar;
        a.f135196r = 1009;
        a.mo96792f();
        SecApiImpl.m119993a().reportData("share");
        ShareService shareService = C68863ah.f154027a;
        ActivityC0945e activity = getActivity();
        C75445g gVar = this.f147347ap;
        String str = this.f147349ar;
        AbstractC41135h hVar = (AbstractC41135h) this.f96076I.get(this.f96074G);
        if (hVar instanceof C35658s) {
            list = ((C35658s) hVar).mo62689p();
        } else {
            list = null;
        }
        shareService.mo109405a(activity, gVar, str, list, this.f147348aq);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        String str;
        C75445g gVar = this.f147347ap;
        if (gVar == null) {
            str = "";
        } else {
            str = gVar.f169545id;
        }
        this.f96080M = -1;
        super.onStop();
        mo70353o();
        if (this.f147362bd != -1) {
            C39162r.m79460a("stay_time", new C33744d().mo59983a("prop_id", str).mo59983a("enter_from", "prop_page").mo59983a("duration", String.valueOf(System.currentTimeMillis() - this.f147362bd)).mo59983a("group_id", this.f147349ar).mo59983a("log_pb", this.f147348aq).f79943a);
            this.f147362bd = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo104449b() {
        String str;
        if (this.f147347ap != null) {
            this.f147322aQ = false;
            this.f147323aR = false;
            if (!C31575b.m65865g().isLogin()) {
                C58957c.m108320a(getActivity(), "prop_page", "click_favorite_prop", (Bundle) null, new C65305x(this));
                return;
            }
            if (this.f147347ap.isFavorite) {
                str = "cancel_favorite_prop";
            } else {
                str = "favourite_prop";
            }
            C39162r.m79460a(str, new C33744d().mo59983a("enter_from", "prop_page").mo59983a("prop_id", this.f147347ap.f169545id).f79943a);
            C65315a aVar = this.f147307aB;
            getActivity();
            C75445g gVar = this.f147347ap;
            gVar.isFavorite = !gVar.isFavorite;
            aVar.f147428a.load(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005c: INVOKE  
                  (wrap: com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$EffectPlatformLoader : 0x0055: IGET  (r1v2 com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$EffectPlatformLoader) = (r3v2 'aVar' com.ss.android.ugc.aweme.prop.d.a) com.ss.android.ugc.aweme.prop.d.a.a com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$EffectPlatformLoader)
                  (wrap: com.ss.android.ugc.aweme.prop.d.a$2 : 0x0059: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.prop.d.a$2) = (r3v2 'aVar' com.ss.android.ugc.aweme.prop.d.a), (r2v1 'gVar' com.ss.android.ugc.aweme.sticker.model.g) call: com.ss.android.ugc.aweme.prop.d.a.2.<init>(com.ss.android.ugc.aweme.prop.d.a, com.ss.android.ugc.aweme.sticker.model.g):void type: CONSTRUCTOR)
                 type: INTERFACE call: com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.EffectPlatformLoader.load(b.g):void in method: com.ss.android.ugc.aweme.prop.b.j.b():void, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0059: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.prop.d.a$2) = (r3v2 'aVar' com.ss.android.ugc.aweme.prop.d.a), (r2v1 'gVar' com.ss.android.ugc.aweme.sticker.model.g) call: com.ss.android.ugc.aweme.prop.d.a.2.<init>(com.ss.android.ugc.aweme.prop.d.a, com.ss.android.ugc.aweme.sticker.model.g):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.prop.b.j.b():void, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 25 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.prop.d.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 31 more
                */
            /*
                this = this;
                com.ss.android.ugc.aweme.sticker.model.g r0 = r5.f147347ap
                if (r0 != 0) goto L_0x0005
                return
            L_0x0005:
                r0 = 0
                r5.f147322aQ = r0
                r5.f147323aR = r0
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
                boolean r0 = r0.isLogin()
                java.lang.String r4 = "prop_page"
                if (r0 != 0) goto L_0x0026
                androidx.fragment.app.e r3 = r5.getActivity()
                r2 = 0
                com.ss.android.ugc.aweme.prop.b.x r1 = new com.ss.android.ugc.aweme.prop.b.x
                r1.<init>(r5)
                java.lang.String r0 = "click_favorite_prop"
                com.p2082ss.android.ugc.aweme.login.C58957c.m108320a(r3, r4, r0, r2, r1)
                return
            L_0x0026:
                com.ss.android.ugc.aweme.sticker.model.g r0 = r5.f147347ap
                boolean r0 = r0.isFavorite
                if (r0 == 0) goto L_0x0060
                java.lang.String r3 = "cancel_favorite_prop"
            L_0x002e:
                com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d
                r1.<init>()
                java.lang.String r0 = "enter_from"
                com.ss.android.ugc.aweme.app.f.d r2 = r1.mo59983a(r0, r4)
                com.ss.android.ugc.aweme.sticker.model.g r0 = r5.f147347ap
                java.lang.String r1 = r0.f169545id
                java.lang.String r0 = "prop_id"
                com.ss.android.ugc.aweme.app.f.d r0 = r2.mo59983a(r0, r1)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f79943a
                com.p2082ss.android.ugc.aweme.common.C39162r.m79460a(r3, r0)
                com.ss.android.ugc.aweme.prop.d.a r3 = r5.f147307aB
                r5.getActivity()
                com.ss.android.ugc.aweme.sticker.model.g r2 = r5.f147347ap
                boolean r0 = r2.isFavorite
                r0 = r0 ^ 1
                r2.isFavorite = r0
                com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$EffectPlatformLoader r1 = r3.f147428a
                com.ss.android.ugc.aweme.prop.d.a$2 r0 = new com.ss.android.ugc.aweme.prop.d.a$2
                r0.<init>(r2)
                r1.load(r0)
                return
            L_0x0060:
                java.lang.String r3 = "favourite_prop"
                goto L_0x002e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j.mo104449b():void");
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
        /* renamed from: l */
        public final AbstractC0974l mo62643l() {
            boolean z;
            C65261a aVar = this.f147356ay;
            if (aVar != null) {
                return aVar;
            }
            C75446h hVar = this.f147309aD;
            this.f96076I = new ArrayList(hVar.mStickers.size() - 1);
            for (C75445g gVar : hVar.mStickers) {
                AbstractC41135h hVar2 = (AbstractC41135h) getChildFragmentManager().mo3551a(AbstractC41102a.f96067v + gVar.f169545id);
                C65276e eVar = hVar2;
                if (hVar2 == null) {
                    this.f147327aV = new C65277f(this.f147357az);
                    String str = gVar.f169545id;
                    String str2 = this.f147321aP;
                    String str3 = this.f147349ar;
                    C65277f fVar = this.f147327aV;
                    C65276e eVar2 = new C65276e();
                    Bundle bundle = new Bundle();
                    bundle.putInt("detail_aweme_list_type", 15);
                    bundle.putString("event_label", "sticker_prop_detail");
                    bundle.putString("detail_id", str);
                    bundle.putString("detail_aweme_from", str2);
                    bundle.putString("detail_aweme_from_aid", str3);
                    eVar2.setArguments(bundle);
                    eVar2.f84111G = fVar;
                    eVar = eVar2;
                }
                if (eVar instanceof C65276e) {
                    C35658s sVar = (C35658s) eVar;
                    if (this.f96074G == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sVar.f84141z = z;
                    sVar.f84105A = true;
                }
                this.f96076I.add(eVar);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.f96076I) {
                arrayList.add(obj);
            }
            C65261a aVar2 = new C65261a(getChildFragmentManager(), arrayList);
            this.f147356ay = aVar2;
            return aVar2;
        }

        @AbstractC90264r
        public void receiveJumpMessage(C76106a aVar) {
            this.f147363be = true;
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
        /* renamed from: a */
        public final AbstractC52856g mo70349a(ViewGroup viewGroup) {
            return this.f147326aU.mo70369a(viewGroup);
        }

        @Override // com.p2082ss.android.ugc.aweme.prop.view.AbstractC65327a
        /* renamed from: b */
        public final void mo104451b(C75445g gVar) {
            if (gVar.isFavorite) {
                this.f147322aQ = true;
                if (!this.f147346ao) {
                    return;
                }
                return;
            }
            new C23144b(this).mo37640e(R.string.a93).mo37637b();
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
        /* renamed from: a */
        public final void mo70351a(View view) {
            super.mo70351a(view);
            this.f147325aT = new C65270c();
            if (this.f147361bc) {
                this.f147326aU = new C41112a(requireContext(), 2131231562);
            } else {
                this.f147326aU = new C80638a(requireContext(), getLayoutInflater(), R.string.b7r);
            }
        }

        @AbstractC90264r
        public void onEvent(C56257j jVar) {
            IIMService createIIMServicebyMonsterPlugin;
            if (af_() && TextUtils.equals("sticker", jVar.f128321d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
                createIIMServicebyMonsterPlugin.showIMSnackbar(getActivity(), this.f147371n, jVar);
            }
        }

        /* renamed from: b */
        private void m116948b(boolean z) {
            int i;
            RelativeLayout relativeLayout;
            int i2 = 2131233912;
            if (z && (relativeLayout = this.f147359ba) != null) {
                this.f147326aU.mo70371b(relativeLayout);
                C41112a aVar = new C41112a(getContext(), 2131233912);
                this.f147326aU = aVar;
                aVar.mo70370a(this.f147359ba);
                this.f147359ba.findViewById(R.id.e6q).setOnClickListener(this.f147360bb);
            }
            View view = this.f147295Q;
            if (view != null) {
                view.setEnabled(!z);
                if (z) {
                    this.f147295Q.setAlpha(0.34f);
                } else {
                    this.f147295Q.setAlpha(1.0f);
                }
            }
            RemoteImageView remoteImageView = this.f147366e;
            if (remoteImageView != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                remoteImageView.setVisibility(i);
            }
            RemoteImageView remoteImageView2 = this.f147365d;
            if (remoteImageView2 != null) {
                if (!z) {
                    i2 = 2131231562;
                }
                C34577e.m70591a(remoteImageView2, i2);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
        /* renamed from: a */
        public final void mo62630a(Bundle bundle) {
            if (bundle != null) {
                this.f147349ar = bundle.getString("aweme_id");
                this.f147348aq = bundle.getString("extra_log_pb");
                this.f147357az = bundle.getString("extra_music_from");
                this.f147306aA = bundle.getString("extra_sticker_from");
                this.f147318aM = (C69905c) bundle.getSerializable("sticker_music");
                this.f147319aN = bundle.getSerializable("music_model");
                this.f147328aW = bundle.getStringArrayList("extra_stickers");
                int i = bundle.getInt("media_type", 0);
                this.f147345an = i;
                if (i != 3) {
                    i = 0;
                }
                this.f147345an = i;
                this.f147320aO = bundle.getInt("EXTRA_VIDEO_LENGTH", 0);
                this.f147321aP = bundle.getString("extra_previous_page", "");
                this.f147350as = bundle.getString("shoot_enter_from");
                this.f147351at = bundle.getString("from_banner_id");
                this.f147352au = bundle.getInt("is_bundled", 0);
                StringBuilder sb = new StringBuilder();
                List<String> list = this.f147328aW;
                if (list != null && list.size() > 0) {
                    this.f147317aL = this.f147328aW.get(0);
                    Iterator<String> it = this.f147328aW.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next() + ",");
                    }
                }
                if (sb.toString().endsWith(",")) {
                    this.f147308aC = sb.toString().substring(0, sb.toString().length() - 1);
                }
                this.f96078K = bundle.getString("sticker_id");
                C65311c.f147417b = this.f147345an;
                this.f96075H = false;
            }
        }

        /* renamed from: a */
        public final void mo104442a(C75445g gVar) {
            CheckableImageView checkableImageView;
            int i;
            int i2;
            if (gVar != null && this.f147297S != null && (checkableImageView = this.f147296R) != null) {
                boolean z = gVar.isFavorite;
                int i3 = R.drawable.b2e;
                if (z) {
                    i = R.drawable.b2e;
                } else {
                    i = 2131233168;
                }
                checkableImageView.setImageResource(i);
                CheckableImageView checkableImageView2 = this.f147302X;
                if (checkableImageView2 != null) {
                    if (!gVar.isFavorite) {
                        i3 = 2131233168;
                    }
                    checkableImageView2.setImageResource(i3);
                }
                TextView textView = this.f147297S;
                if (gVar.isFavorite) {
                    i2 = R.string.d_m;
                } else {
                    i2 = R.string.p_;
                }
                textView.setText(i2);
                if (gVar.isFavorite) {
                    this.f147323aR = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final /* synthetic */ void mo104450b(int i) {
            if (i != this.f147313aH.f147260b) {
                C65262b bVar = this.f147313aH;
                if (bVar.f147259a != null && i < bVar.f147259a.size()) {
                    for (C75445g gVar : bVar.f147259a) {
                        gVar.mIsSelect = false;
                    }
                    bVar.f147259a.get(i).mIsSelect = true;
                    bVar.f147260b = i;
                    bVar.notifyDataSetChanged();
                }
                m116949c(this.f147313aH.f147259a.get(i));
                if (this.f147355ax.mo65428a(this.f147313aH.f147259a.get(i))) {
                    this.f147361bc = true;
                } else {
                    this.f147361bc = false;
                }
                m116948b(this.f147361bc);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x027c  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0283  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m116949c(com.p2082ss.android.ugc.aweme.sticker.model.C75445g r18) {
            /*
            // Method dump skipped, instructions count: 896
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j.m116949c(com.ss.android.ugc.aweme.sticker.model.g):void");
        }

        @Override // com.p2082ss.android.ugc.aweme.prop.view.AbstractC65327a
        /* renamed from: a */
        public final void mo104444a(C75446h hVar) {
            SpringLayout springLayout = this.f147336ae;
            if (springLayout != null) {
                springLayout.setRefreshing(false);
            }
            if (af_()) {
                if (hVar == null || hVar.mStickers == null || hVar.mStickers.size() == 0) {
                    this.f147329aX = false;
                    this.f147373p.mo27385g();
                    ViewGroup viewGroup = this.f147337af;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f147309aD = hVar;
                if (!this.f147311aF) {
                    super.mo62642k();
                }
                boolean booleanValue = SharePrefCache.inst().getStickerArtEntry().mo59941c().booleanValue();
                String stickerArtistIconUrl = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().getStickerArtistIconUrl();
                if (!TextUtils.isEmpty(SharePrefCache.inst().getStickerArtlistUrl().mo59941c()) && !TextUtils.isEmpty(stickerArtistIconUrl) && booleanValue) {
                    this.f147293O.setVisibility(0);
                    C24185e b = C24182c.m45843b();
                    b.f57309m = this.f147293O.getController();
                    b.f57303g = new AbstractC24203d<AbstractC24457f>() {
                        /* class com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j.C652896 */

                        static {
                            Covode.recordClassIndex(76768);
                        }

                        @Override // com.facebook.drawee.p1851c.AbstractC24203d
                        public final void onFailure(String str, Throwable th) {
                        }

                        @Override // com.facebook.drawee.p1851c.AbstractC24203d
                        public final void onIntermediateImageFailed(String str, Throwable th) {
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
                        @Override // com.facebook.drawee.p1851c.AbstractC24203d
                        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
                        }

                        @Override // com.facebook.drawee.p1851c.AbstractC24203d
                        public final void onRelease(String str) {
                        }

                        @Override // com.facebook.drawee.p1851c.AbstractC24203d
                        public final void onSubmit(String str, Object obj) {
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                        @Override // com.facebook.drawee.p1851c.AbstractC24203d
                        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                            AbstractC24457f fVar2 = fVar;
                            if (C65283j.this.getContext() != null && fVar2 != null && fVar2.getWidth() != 0 && fVar2.getHeight() != 0) {
                                C65283j.this.f147293O.setLayoutParams(new FrameLayout.LayoutParams((int) ((C13628n.m24520b(C65283j.this.getContext(), 25.0f) * ((float) fVar2.getWidth())) / ((float) fVar2.getHeight())), (int) C13628n.m24520b(C65283j.this.getContext(), 25.0f)));
                            }
                        }
                    };
                    this.f147293O.setController(b.mo39799b(Uri.parse(stickerArtistIconUrl)).mo39827e());
                }
                this.f147293O.setOnClickListener(new View$OnClickListenerC65302u(this));
                this.f147311aF = true;
                m116949c(hVar.mStickers.get(0));
                hVar.mStickers.get(0).mIsSelect = true;
                if (hVar.mStickers.size() == 1) {
                    this.f147294P.setVisibility(8);
                    this.f147377t.setVisibility(8);
                    ViewGroup viewGroup2 = this.f147303Y;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(8);
                    }
                } else {
                    ViewGroup viewGroup3 = this.f147303Y;
                    if (viewGroup3 != null) {
                        viewGroup3.setVisibility(0);
                    }
                    this.f147294P.setVisibility(0);
                    this.f147377t.setVisibility(0);
                    C65262b bVar = this.f147313aH;
                    List<C75445g> list = hVar.mStickers;
                    if (!(list == null || list.size() == 0)) {
                        bVar.f147259a.clear();
                        bVar.f147259a.addAll(list);
                        bVar.notifyDataSetChanged();
                    }
                    this.f147294P.setNumColumns(hVar.mStickers.size());
                    int b2 = (int) C13628n.m24520b(getActivity(), 42.0f);
                    int b3 = (int) C13628n.m24520b(getActivity(), 16.0f);
                    int size = hVar.mStickers.size();
                    this.f147294P.setLayoutParams(new LinearLayout.LayoutParams((b2 * size) + ((size - 1) * b3) + (b3 * 2), -2));
                }
                m116953q();
                this.f147329aX = true;
                this.f147373p.mo27382d();
                ImageView imageView = this.f147298T;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (this.f147355ax.mo65428a(hVar.mStickers.get(0))) {
                    this.f147361bc = true;
                }
                m116948b(this.f147361bc);
                C75445g gVar = hVar.mStickers.get(0);
                if (C33918a.m69450a()) {
                    final C81779c b4 = C33918a.m69453b();
                    if (!(b4 == null || b4.f182885s == null || b4.f182876j == null || !b4.f182876j.contains(gVar.f169545id))) {
                        if (!TextUtils.isEmpty(b4.f182880n)) {
                            this.f147301W.setVisibility(0);
                            this.f147299U.setVisibility(0);
                            this.f147301W.setText(b4.f182880n);
                        } else {
                            this.f147301W.setVisibility(8);
                        }
                        this.f147300V.setVisibility(0);
                        C20766v a = C20761r.m39061a(b4.f182885s.f182888a).mo34179a("StickerPropDetailFragment");
                        Context context = getContext();
                        C20745e.C20746a aVar = new C20745e.C20746a();
                        aVar.f48961e = C20744c.m39047a(context, 2.0f);
                        aVar.f48958b = C20744c.m39047a(context, 0.0f);
                        a.f49126w = aVar.mo34169a();
                        a.f49092E = this.f147300V;
                        a.mo34186c();
                        this.f147299U.setOnClickListener(new View.OnClickListener() {
                            /* class com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j.View$OnClickListenerC652918 */

                            static {
                                Covode.recordClassIndex(76770);
                            }

                            public final void onClick(View view) {
                                ClickAgent.onClick(view);
                                ChallengeDetailLegacyServiceImpl.m72544a().mo57209a(C65283j.this.getContext(), b4.f182885s.f182889b);
                            }
                        });
                        this.f147299U.setVisibility(0);
                    }
                } else {
                    this.f147299U.setVisibility(8);
                }
                C18285c.m34007c("sd_start_activity_to_show_header_duration");
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
        /* renamed from: a */
        public final void mo62628a(float f, float f2) {
            this.f147312aG = C41247m.m83131a(f, f2, this.f147312aG, this);
        }

        @Override // com.p2082ss.android.ugc.aweme.prop.view.AbstractC65327a
        /* renamed from: a */
        public final void mo104443a(C75445g gVar, ExceptionResult exceptionResult) {
            if (getActivity() != null) {
                AbstractC81915c.m141874a(new C47420a(gVar));
                mo104442a(gVar);
                int errorCode = exceptionResult.getErrorCode();
                if (errorCode == 2004 || errorCode == 2002) {
                    new C23144b(this).mo37635a(getResources().getString(R.string.bqf)).mo37637b();
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
        /* renamed from: b */
        public final void mo62635b(int i, int i2) {
            super.mo62635b(i, i2);
            float f = 0.0f;
            if (this.f147315aJ == 0.0f) {
                if (this.f147375r.getVisibility() == 0) {
                    this.f147315aJ = (float) (this.f147375r.getBottom() - this.f96068A.getBottom());
                } else if (this.f147368k.getVisibility() == 0) {
                    this.f147315aJ = (float) (this.f147368k.getBottom() - this.f96068A.getBottom());
                }
            }
            if (this.f147314aI == 0.0f) {
                this.f147314aI = (float) (this.f147371n.getBottom() - this.f96068A.getBottom());
            }
            float f2 = (float) i;
            float f3 = this.f147315aJ;
            float f4 = (f2 - f3) / (this.f147314aI - f3);
            if (f4 >= 0.0f) {
                f = f4;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            this.f96068A.setAlpha(f);
            this.f96085z.setAlpha(f);
            this.f147371n.setAlpha(1.0f - (f2 / this.f147314aI));
            this.f147293O.setAlpha(1.0f - f);
            CheckableImageView checkableImageView = this.f147302X;
            if (checkableImageView != null) {
                if (((double) f) == 1.0d) {
                    checkableImageView.setVisibility(0);
                } else {
                    checkableImageView.setVisibility(8);
                }
            }
            this.f147312aG = C41247m.m83132a(f, this.f147312aG, this);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle bundle) {
            int a = this.f147325aT.mo104435a();
            C1764a.m5927a(LayoutInflater.from(getContext()), a, (ViewGroup) view.findViewById(R.id.be4), true);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.e6t);
            this.f147359ba = relativeLayout;
            this.f147326aU.mo70370a(relativeLayout);
            this.f147358b = view.findViewById(R.id.e6q);
            this.f147364c = (ViewGroup) view.findViewById(R.id.c4_);
            this.f147365d = (RemoteImageView) view.findViewById(R.id.e6u);
            this.f147366e = (RemoteImageView) view.findViewById(R.id.e9b);
            this.f147367j = (RemoteImageView) view.findViewById(R.id.e9a);
            this.f147368k = (TextView) view.findViewById(R.id.e9c);
            this.f147369l = (TextView) view.findViewById(R.id.f03);
            this.f147370m = (TextView) view.findViewById(R.id.f_6);
            this.f147371n = view.findViewById(R.id.bdv);
            this.f147372o = view.findViewById(R.id.bnr);
            this.f147373p = (DmtStatusView) view.findViewById(R.id.e7i);
            this.f147374q = (RemoteImageView) view.findViewById(R.id.ry);
            this.f147375r = (ViewGroup) view.findViewById(R.id.c6w);
            this.f147376s = (ViewStub) view.findViewById(R.id.fhl);
            this.f147377t = view.findViewById(R.id.elm);
            this.f147378u = (ImageView) view.findViewById(R.id.l0);
            this.f147292N = (RemoteImageView) view.findViewById(R.id.c01);
            this.f147293O = (RemoteImageView) view.findViewById(R.id.c02);
            this.f147294P = (GridView) view.findViewById(R.id.e8t);
            this.f147295Q = view.findViewById(R.id.e99);
            this.f147296R = (CheckableImageView) view.findViewById(R.id.e9_);
            this.f147297S = (TextView) view.findViewById(R.id.f4m);
            this.f147298T = (ImageView) view.findViewById(R.id.dxf);
            this.f147299U = (FrameLayout) view.findViewById(R.id.ct);
            this.f147300V = (SmartImageView) view.findViewById(R.id.cu);
            this.f147301W = (TuxTextView) view.findViewById(R.id.ak7);
            this.f147302X = (CheckableImageView) view.findViewById(R.id.azj);
            this.f147303Y = (ViewGroup) view.findViewById(R.id.bby);
            this.f147304Z = (ViewStub) view.findViewById(R.id.c7_);
            this.f147332aa = (ViewStub) view.findViewById(R.id.f7);
            this.f147333ab = (ViewStub) view.findViewById(R.id.fhe);
            this.f147334ac = (ViewStub) view.findViewById(R.id.c4t);
            this.f147335ad = (ViewStub) view.findViewById(R.id.c6u);
            this.f147336ae = (SpringLayout) view.findViewById(R.id.dhb);
            this.f147337af = (ViewGroup) view.findViewById(R.id.dq9);
            this.f147338ag = (LinearLayout) view.findViewById(R.id.asz);
            this.f147339ah = (RemoteImageView) view.findViewById(R.id.an_);
            this.f147340ai = (TextView) view.findViewById(R.id.anl);
            this.f147341aj = (TextView) view.findViewById(R.id.ank);
            this.f147342ak = (TextView) view.findViewById(R.id.an8);
            this.f147343al = (LinearLayout) view.findViewById(R.id.fd6);
            this.f147344am = (TuxTextView) view.findViewById(R.id.f63);
            this.f96072E = (ImageView) view.findViewById(R.id.pi);
            this.f96072E.setOnClickListener(new View$OnClickListenerC65294m(this));
            this.f147295Q.setOnClickListener(new View$OnClickListenerC65295n(this));
            this.f147298T.setOnClickListener(new View$OnClickListenerC65296o(this));
            this.f147375r.setOnClickListener(new View$OnClickListenerC65297p(this));
            super.onViewCreated(view, bundle);
            getActivity();
            if (!m116951j()) {
                new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            }
            C65315a aVar = new C65315a(this.f147330aY, TextUtils.equals(this.f147306aA, "from_sticker_master_profile"));
            this.f147307aB = aVar;
            aVar.mo67839a_(this);
            this.f147331aZ = CommerceStickerServiceImpl.m75788c().mo65419a(this.f147332aa, this.f147304Z, this.f147333ab, this.f147334ac, this.f147335ad);
            MtEmptyView a2 = MtEmptyView.m31926a(getContext());
            a2.setStatus(new C17273d.C17274a(getContext()).mo27457a(2131232012).mo27462b(R.string.blf).mo27464c(R.string.ble).f41365a);
            this.f147373p.setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27406b(a2).mo27407b(C81437h.m141212a(getContext(), new View$OnClickListenerC65292k(this))));
            this.f147295Q.setVisibility(0);
            this.f147296R.setOnStateChangeListener(new CheckableImageView.AbstractC61078a() {
                /* class com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j.C652863 */

                static {
                    Covode.recordClassIndex(76765);
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
                public final void bX_() {
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
                /* renamed from: a */
                public final void mo62594a(int i) {
                    if (i == 1) {
                        C65283j jVar = C65283j.this;
                        jVar.mo104442a(jVar.f147347ap);
                    }
                }
            });
            CheckableImageView checkableImageView = this.f147302X;
            if (checkableImageView != null) {
                checkableImageView.setOnStateChangeListener(new CheckableImageView.AbstractC61078a() {
                    /* class com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j.C652874 */

                    static {
                        Covode.recordClassIndex(76766);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
                    public final void bX_() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
                    /* renamed from: a */
                    public final void mo62594a(int i) {
                        if (i == 1) {
                            C65283j jVar = C65283j.this;
                            jVar.mo104442a(jVar.f147347ap);
                        }
                    }
                });
                this.f147302X.setOnClickListener(new View$OnClickListenerC65293l(this));
            }
            this.f96085z.setAlpha(0.0f);
            this.f96085z.setOnClickListener(new View$OnClickListenerC65298q(this));
            C65262b bVar = new C65262b(getActivity(), this.f147325aT);
            this.f147313aH = bVar;
            this.f147294P.setAdapter((ListAdapter) bVar);
            this.f147294P.setOnItemClickListener(new C65299r(this));
            this.f147358b.setVisibility(0);
            this.f147364c.setBackground(null);
            if (C79365a.m138152a()) {
                this.f147336ae.setOnRefreshListener(new C65300s(this));
            } else {
                this.f147336ae.setNestedHeader(null);
                this.f147336ae.setOverScrollMode(EnumC23427e.NONE);
                this.f147336ae.setScrollMode(EnumC23429g.NONE);
            }
            mo104447a(false);
            this.f147358b.setOnClickListener(this.f147360bb);
            int i = this.f147345an;
            C652885 r0 = new AbstractC65268a() {
                /* class com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j.C652885 */

                static {
                    Covode.recordClassIndex(76767);
                }

                @Override // com.p2082ss.android.ugc.aweme.prop.p3606b.AbstractC65268a
                /* renamed from: a */
                public final void mo104434a(int i) {
                    String str;
                    int i2;
                    C33744d dVar = new C33744d();
                    if (C65283j.this.f147347ap == null) {
                        str = "";
                    } else {
                        str = C65283j.this.f147347ap.f169545id;
                    }
                    C39162r.m79460a("select_media_type", dVar.mo59983a("prop_id", str).mo59983a("previous_media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[C65283j.this.f147345an]).mo59983a("media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[i]).f79943a);
                    if (i != C65283j.this.f147345an) {
                        C65283j.this.f147345an = i;
                        TuxTextView tuxTextView = C65283j.this.f147344am;
                        if (C65283j.this.f147345an == 3) {
                            i2 = R.string.c40;
                        } else {
                            i2 = R.string.ra;
                        }
                        tuxTextView.setText(i2);
                        C65311c.f147417b = C65283j.this.f147345an;
                        C65283j.this.mo104447a(false);
                    }
                    try {
                        if (C65283j.this.f147305a != null) {
                            C65283j.this.f147305a.mo37810b();
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            C65271d.f147277b = i;
            C65271d dVar = new C65271d();
            dVar.f147279a = r0;
            this.f147305a = new C23226a.C23227a().mo37817a(dVar).mo37812a(1).f55057a;
            this.f147343al.setOnClickListener(new View$OnClickListenerC65301t(this));
        }
    }
