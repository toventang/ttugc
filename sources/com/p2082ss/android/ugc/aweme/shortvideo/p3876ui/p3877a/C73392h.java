package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14100b;
import com.bytedance.creativex.recorder.p938a.p939a.C14102d;
import com.bytedance.creativex.recorder.p938a.p939a.EnumC14101c;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14182g;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.creativex.recorder.p940b.p941a.C14178e;
import com.bytedance.creativex.recorder.p940b.p941a.C14196o;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14331b;
import com.bytedance.creativex.recorder.sticker.p948b.C14335a;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.asve.recorder.C31214j;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.beauty.C34805b;
import com.p2082ss.android.ugc.aweme.beauty.C34806c;
import com.p2082ss.android.ugc.aweme.beauty.C34807d;
import com.p2082ss.android.ugc.aweme.beauty.C34810g;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.C41101a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.p2082ss.android.ugc.aweme.draft.C43207g;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.p2730de.C40973h;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.AVPreferences;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70659a;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71820a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a.C72744a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73996bl;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74049z;
import com.p2082ss.android.ugc.aweme.shortvideo.util.performance.C74029a;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.C75447n;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75588b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75658r;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.tools.C78608j;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85346av;
import dmt.p4542av.video.C88151a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h */
public final class C73392h extends AbstractC2562j<AbstractC73376c> implements AbstractC21566a, AbstractC73376c {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f164901a = {new C89232y(C73392h.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C89232y(C73392h.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C73392h.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new C89232y(C73392h.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new C89232y(C73392h.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C89232y(C73392h.class, "stickerMobHelper", "getStickerMobHelper()Lcom/ss/android/ugc/aweme/sticker/mob/IStickerMob;", 0)};

    /* renamed from: b */
    public final AbstractC73376c f164902b = this;

    /* renamed from: c */
    public final ActivityC0945e f164903c = ((ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null));

    /* renamed from: d */
    public final ShortVideoContext f164904d = ((ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null));

    /* renamed from: e */
    final AbstractC89244h f164905e = C89250i.m154773a((AbstractC89171a) new C73393a(this));

    /* renamed from: f */
    final AbstractC89248d f164906f = C21572a.m40504a(getDiContainer(), AbstractC75429h.class);

    /* renamed from: g */
    long f164907g;

    /* renamed from: h */
    private final AbstractC89248d f164908h = C21572a.m40504a(getDiContainer(), AbstractC14209z.class);

    /* renamed from: i */
    private final AbstractC89248d f164909i = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: j */
    private final AbstractC89248d f164910j = C21572a.m40504a(getDiContainer(), AbstractC14210a.class);

    /* renamed from: k */
    private final AbstractC89248d f164911k = C21572a.m40504a(getDiContainer(), AbstractC14099a.class);

    /* renamed from: l */
    private final AbstractC89248d f164912l = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);

    /* renamed from: m */
    private final C88411a f164913m = new C88411a();

    /* renamed from: n */
    private final C21582f f164914n;

    static {
        Covode.recordClassIndex(86129);
    }

    /* renamed from: e */
    private final AbstractC14193m m129519e() {
        return (AbstractC14193m) this.f164909i.mo23374a(this, f164901a[1]);
    }

    /* renamed from: a */
    public final AbstractC14209z mo116029a() {
        return (AbstractC14209z) this.f164908h.mo23374a(this, f164901a[0]);
    }

    /* renamed from: b */
    public final AbstractC14210a mo116031b() {
        return (AbstractC14210a) this.f164910j.mo23374a(this, f164901a[2]);
    }

    /* renamed from: c */
    public final AbstractC14099a mo116032c() {
        return (AbstractC14099a) this.f164911k.mo23374a(this, f164901a[3]);
    }

    /* renamed from: d */
    public final AbstractC84089j mo116033d() {
        return (AbstractC84089j) this.f164912l.mo23374a(this, f164901a[4]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC73376c getApiComponent() {
        return this.f164902b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f164914n;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$a */
    static final class C73393a extends AbstractC89220m implements AbstractC89171a<AbstractC83490a> {

        /* renamed from: a */
        final /* synthetic */ C73392h f164915a;

        static {
            Covode.recordClassIndex(86130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73393a(C73392h hVar) {
            super(0);
            this.f164915a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC83490a invoke() {
            return AbstractC83490a.C83491a.m143865b(this.f164915a.f164903c);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        this.f164913m.mo142944a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$q */
    static final class CallableC73410q<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f164934a;

        static {
            Covode.recordClassIndex(86147);
        }

        CallableC73410q(String str) {
            this.f164934a = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                if (TextUtils.isEmpty(this.f164934a)) {
                    return null;
                }
                C84902i.m145886a(new File(this.f164934a));
                return null;
            } catch (Exception unused) {
                C63244g.m114602a().mo73263I().mo101628a("delete failed");
                return null;
            }
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        m129519e().mo22907n().mo6997a(this, new C73395c(this));
        m129519e().mo22870F().mo6997a(this, new C73396d(this));
        m129519e().mo22909p().mo6997a(this, new C73397e(this));
        mo116029a().mo22831s().mo6997a(this, new C73398f(this));
        m129519e().mo22905l().mo6997a(this, new C73399g(this));
        AbstractC88412b a = m129519e().mo22898f().mo143254a(new C73400h(this), C84909p.f189747a);
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f164913m);
        mo116029a().mo22747A().mo56916a(new C73407o(this));
        mo116029a().mo22816f().mo7036a(this, new C73405m(this));
        mo116029a().mo22822j().mo6997a(this, new C73406n(this));
        mo116032c().mo22658h().mo6997a(this, new C73394b(this));
        mo116033d().mo23119b().mo6997a(this, new C73401i(this));
        mo116033d().mo23124f().mo6997a(this, new C73402j(this));
        AbstractC88412b a2 = mo116033d().mo23125g().mo143254a(new C73403k(this), C84909p.f189747a);
        C89219l.m154716b(a2, "");
        C88934a.m154195a(a2, this.f164913m);
    }

    /* renamed from: a */
    public static ComposerBeautyBuriedInfo m129515a(ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy) {
        ComposerBeautyBuriedInfo composerBeautyBuriedInfo = (ComposerBeautyBuriedInfo) C40973h.m82495a(C40973h.m82494a().mo46674b(composerBeautyBuriedInfoCopy), ComposerBeautyBuriedInfo.class);
        C89219l.m154716b(composerBeautyBuriedInfo, "");
        return composerBeautyBuriedInfo;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$f */
    static final class C73398f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73392h f164920a;

        static {
            Covode.recordClassIndex(86135);
        }

        C73398f(C73392h hVar) {
            this.f164920a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C78608j jVar = (C78608j) obj;
            C73392h hVar = this.f164920a;
            C89219l.m154716b(jVar, "");
            if (hVar.f164904d.f155817b.mo109890c() || C70659a.m124890a(hVar.f164904d) || hVar.f164904d.mo110022c()) {
                int i = jVar.f176647a;
                if (i == 1) {
                    C73392h.m129518a(hVar.f164904d, "on");
                } else if (i == 2) {
                    C73392h.m129518a(hVar.f164904d, "off");
                }
            }
        }
    }

    /* renamed from: a */
    public static C34810g m129516a(C41101a aVar) {
        C34810g gVar = (C34810g) C40973h.m82495a(C40973h.m82494a().mo46674b(aVar), C34810g.class);
        C89219l.m154716b(gVar, "");
        return gVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$i */
    static final class C73401i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73392h f164923a;

        static {
            Covode.recordClassIndex(86138);
        }

        C73401i(C73392h hVar) {
            this.f164923a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC14331b bVar = (AbstractC14331b) obj;
            if (bVar instanceof AbstractC14331b.C14332a) {
                C73392h hVar = this.f164923a;
                C80322d.m139251a("light_warn_notice_show", C89041ag.m154428c(C89387v.m154943a("enter_from", "video_shoot_page"), C89387v.m154943a("shoot_way", hVar.f164904d.f155831p), C89387v.m154943a("creation_id", hVar.f164904d.f155830o), C89387v.m154943a("content_source", hVar.f164904d.mo110034j().getContentSource()), C89387v.m154943a("content_type", hVar.f164904d.mo110034j().getContentType()), C89387v.m154943a("tab_name", FaceStickerBean.sCurPropSource), C89387v.m154943a("prop_id", ((AbstractC14331b.C14332a) bVar).f34705a.getEffectId())));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$m */
    static final class C73405m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73392h f164927a;

        static {
            Covode.recordClassIndex(86142);
        }

        C73405m(C73392h hVar) {
            this.f164927a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                boolean z = false;
                if (this.f164927a.mo116029a().mo22801ai() == 2) {
                    C63244g.m114602a().mo73277e().setRecordUseSuccessCameraType(1);
                } else {
                    C63244g.m114602a().mo73277e().setRecordUseSuccessCameraType(0);
                }
                AbstractC63186am amVar = C63238c.f143592s;
                if (this.f164927a.mo116029a().mo22757K() == 1) {
                    z = true;
                }
                amVar.mo93842b(z);
            }
        }
    }

    /* renamed from: a */
    public static String m129517a(Integer num) {
        if (num != null) {
            num.intValue();
            if (num.intValue() == 0) {
                return "-1";
            }
            String valueOf = String.valueOf(num.intValue());
            if (valueOf == null) {
                return "";
            }
            return valueOf;
        }
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$b */
    static final class C73394b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73392h f164916a;

        static {
            Covode.recordClassIndex(86131);
        }

        C73394b(C73392h hVar) {
            this.f164916a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            int i;
            AbstractC14100b bVar = (AbstractC14100b) obj;
            if (bVar.f34299a == EnumC14101c.BEAUTY_ON_OFF && (bVar instanceof C14102d)) {
                C84425b a = new C84425b().mo129406a("creation_id", this.f164916a.f164904d.f155830o).mo129406a("shoot_way", this.f164916a.f164904d.f155831p).mo129406a("content_source", this.f164916a.f164904d.mo110034j().getContentSource()).mo129406a("content_type", this.f164916a.f164904d.mo110034j().getContentType()).mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_page", "video_shoot_page").mo129406a("shoot_tab_name", this.f164916a.f164904d.mo110042r());
                if (this.f164916a.f164904d.f155817b.f155637B) {
                    str = "on";
                } else {
                    str = "off";
                }
                C39162r.m79460a("click_beautify_entrance", a.mo129406a("to_status", str).f188764a);
                AVPreferences e = C63244g.m114602a().mo73277e();
                if (((C14102d) bVar).f34301b) {
                    i = 1;
                } else {
                    i = 2;
                }
                e.setBeautificationMode(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$e */
    static final class C73397e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73392h f164919a;

        static {
            Covode.recordClassIndex(86134);
        }

        C73397e(C73392h hVar) {
            this.f164919a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String id;
            Integer num;
            C73392h hVar = this.f164919a;
            FaceStickerBean i = hVar.mo116033d().mo23127i();
            T value = hVar.mo116031b().getCurSelectedFilter().f7727a.getValue();
            String str = "";
            if (i == null) {
                id = str;
            } else {
                id = i.getId();
            }
            if (value != null) {
                str = String.valueOf(value.getId());
            }
            ASCameraView A = hVar.mo116029a().mo22747A();
            C39162r.m79460a("video_shoot_page_end", new C84425b().mo129406a("creation_id", hVar.f164904d.f155830o).mo129406a("shoot_way", hVar.f164904d.f155831p).mo129406a("prop_list", id).mo129406a("filter_id_list", str).mo129403a("fps", A.getFPS()).mo129406a("beautify_used", String.valueOf(C34806c.m71113b(C34806c.f82229b))).mo129406a("beautify_info", C34806c.f82228a).f188764a);
            ShortVideoContext shortVideoContext = hVar.f164904d;
            AbstractC31133a mediaController = A.getMediaController();
            FaceStickerBean i2 = hVar.mo116033d().mo23127i();
            T value2 = hVar.mo116031b().getCurSelectedFilter().f7727a.getValue();
            if (value2 != null) {
                num = Integer.valueOf(value2.getId());
            } else {
                num = null;
            }
            C71820a.m126811a(shortVideoContext, mediaController, i2, num, C73392h.m129515a(hVar.mo116032c().mo22659i().mo121632p()), C73392h.m129516a(hVar.mo116032c().mo22659i().mo121631o()), "exit_record_page", C73404l.f164926a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$g */
    static final class C73399g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73392h f164921a;

        static {
            Covode.recordClassIndex(86136);
        }

        C73399g(C73392h hVar) {
            this.f164921a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C73392h hVar = this.f164921a;
            C39162r.m79460a("video_record_end", new C84425b().mo129406a("creation_id", hVar.f164904d.f155830o).mo129406a("shoot_way", hVar.f164904d.f155831p).mo129406a("content_type", "video").mo129406a("prop_list", RecordScene.getStickerIdsByModel(hVar.f164904d.f155817b.f155650f)).mo129406a("filter_id_list", hVar.f164904d.f155817b.f155642G.f155725b.toString()).mo129403a("fps", hVar.mo116029a().mo22747A().getFPS()).mo129407a("reshoot", hVar.f164904d.f155817b.f155653i).mo129406a("beautify_used", String.valueOf(C34806c.m71113b(C34806c.f82229b))).mo129406a("beautify_info", C34806c.f82228a).f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$h */
    static final class C73400h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C73392h f164922a;

        static {
            Covode.recordClassIndex(86137);
        }

        C73400h(C73392h hVar) {
            this.f164922a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC14182g gVar = (AbstractC14182g) obj;
            if (gVar instanceof AbstractC14182g.C14184b) {
                int i = ((AbstractC14182g.C14184b) gVar).f34457a;
                C73991bj.m130131b("start Record ret :".concat(String.valueOf(i)));
                C80510gr.m139535a("record_error", "2", "start failed , ve result = ".concat(String.valueOf(i)), (String) null, 8);
            } else if (gVar instanceof AbstractC14182g.C14183a) {
                int i2 = ((AbstractC14182g.C14183a) gVar).f34456a;
                C63244g.m114602a().mo73263I().mo101635a("record", new C69840ar().mo110189a("error", String.valueOf(i2)).mo110191a());
                C80510gr.m139535a("record_error", "2", "running error , ve result = ".concat(String.valueOf(i2)), (String) null, 8);
            } else if (gVar instanceof AbstractC14182g.C14185c) {
                this.f164922a.mo116030a("end_duration", ((AbstractC14182g.C14185c) gVar).f34458a);
            } else if (gVar instanceof AbstractC14182g.C14186d) {
                this.f164922a.mo116030a("stop_record", ((AbstractC14182g.C14186d) gVar).f34459a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$k */
    static final class C73403k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C73392h f164925a;

        static {
            Covode.recordClassIndex(86140);
        }

        C73403k(C73392h hVar) {
            this.f164925a = hVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C89378p pVar = (C89378p) obj;
            EffectTemplate effectTemplate = (EffectTemplate) pVar.component1();
            C14335a aVar = (C14335a) pVar.component2();
            int i = aVar.f34706a;
            int i2 = aVar.f34707b;
            String str2 = aVar.f34709d;
            C73392h hVar = this.f164925a;
            if (i == 17) {
                String str3 = null;
                if (i2 == 3) {
                    if (effectTemplate == null || (str = effectTemplate.getEffectId()) == null) {
                        str = "";
                    } else {
                        C63244g.m114602a().mo73263I().mo101628a("sticker_id: ".concat(String.valueOf(str)));
                    }
                    long currentTimeMillis = System.currentTimeMillis() - hVar.f164907g;
                    C63244g.m114602a().mo73263I().mo101635a("type_av_sticker_show_time", new C69840ar().mo110188a("duration", Long.valueOf(currentTimeMillis)).mo110191a());
                    ((AbstractC75429h) hVar.f164906f.mo23374a(hVar, C73392h.f164901a[5])).mo118956a(str, currentTimeMillis);
                    String.valueOf(currentTimeMillis);
                    C63244g.m114602a().mo73263I().mo101629a("3d_sticker_show_rate", 0, (JSONObject) null);
                    hVar.f164907g = 0;
                    return;
                }
                if (i2 == 4) {
                    if (effectTemplate != null) {
                        str3 = effectTemplate.getUnzipPath();
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        C1731i.m5640b(new CallableC73410q(str3), C40780g.m82241a());
                    }
                }
                C85041d.m146226b(hVar.f164903c, R.string.cnc).mo129984b();
                C63244g.m114602a().mo73263I().mo101629a("3d_sticker_show_rate", i2, new C69840ar().mo110189a("resource_name", str2).mo110191a());
                hVar.f164907g = 0;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$n */
    static final class C73406n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73392h f164928a;

        static {
            Covode.recordClassIndex(86143);
        }

        C73406n(C73392h hVar) {
            this.f164928a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14178e eVar = (C14178e) obj;
            C84425b a = new C84425b().mo129406a("creation_id", this.f164928a.f164904d.f155830o).mo129406a("shoot_way", this.f164928a.f164904d.f155831p).mo129403a("draft_id", this.f164928a.f164904d.f155740A).mo129406a("to_status", eVar.f34452c).mo129406a("enter_from", "video_shoot_page").mo129406a("camera_type", eVar.f34451b).mo129404a("duration", eVar.f34450a).mo129406a("shoot_page", "video_shoot_page").mo129406a("shoot_tab_name", this.f164928a.f164904d.mo110042r());
            if (this.f164928a.f164904d.f155740A != 0) {
                a.mo129403a("draft_id", this.f164928a.f164904d.f155740A);
            }
            if (!TextUtils.isEmpty(this.f164928a.f164904d.f155741B)) {
                a.mo129406a("new_draft_id", this.f164928a.f164904d.f155741B);
            }
            if (C63244g.m114602a().mo73255A().mo93901a()) {
                a.mo129406a("from_group_id", C70747dv.m124972a());
            }
            C80322d.m139251a("flip_camera", a.f188764a);
        }
    }

    public C73392h(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f164914n = fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$j */
    static final class C73402j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73392h f164924a;

        static {
            Covode.recordClassIndex(86139);
        }

        C73402j(C73392h hVar) {
            this.f164924a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            String str2;
            boolean z;
            boolean z2;
            String str3;
            AVChallenge aVChallenge;
            AVChallenge aVChallenge2;
            AbstractC83490a aVar;
            C69905c currentMusic;
            AbstractC75620c cVar = (AbstractC75620c) obj;
            C73392h hVar = this.f164924a;
            C89219l.m154716b(cVar, "");
            hVar.f164907g = System.currentTimeMillis();
            Effect a = cVar.mo119346a();
            Boolean bool = null;
            if (a != null) {
                str = a.getEffectId();
            } else {
                str = null;
            }
            C88151a.m153230a("sticker_id", str);
            if (a == null || (str2 = a.getEffectId()) == null) {
                str2 = "";
            }
            AVServiceImpl.m113116a().setLastStickerId(hVar.f164903c, str2, 1);
            if (a != null && a.isBusiness() && C84904k.m145909a(hVar.f164904d.f155817b.f155650f) && ((aVar = (AbstractC83490a) hVar.f164905e.getValue()) == null || (currentMusic = aVar.getCurrentMusic()) == null || !currentMusic.isCommerceMusic())) {
                AbstractC83490a b = AbstractC83490a.C83491a.m143865b(hVar.f164903c);
                C70005cr.m123611a().mo70083a((C69905c) null);
                if (b != null) {
                    b.handleCancelMusicResultEvent();
                    b.changeHasMusic(null);
                }
            }
            if (cVar instanceof C75621d) {
                C70005cr a2 = C70005cr.m123611a();
                C89219l.m154716b(a2, "");
                a2.f156493m = false;
                C70005cr a3 = C70005cr.m123611a();
                C89219l.m154716b(a3, "");
                a3.f156490i = false;
                C70005cr a4 = C70005cr.m123611a();
                C89219l.m154716b(a4, "");
                a4.f156491j = false;
            } else {
                C70005cr a5 = C70005cr.m123611a();
                C89219l.m154716b(a5, "");
                if (a == null || !a.isBusiness()) {
                    z = false;
                } else {
                    z = true;
                }
                a5.f156493m = Boolean.valueOf(z);
            }
            if (!C75466g.m132373y(a)) {
                boolean z3 = cVar instanceof C75618a;
                if (!z3 || ((C75618a) cVar).f170024c != EnumC75295a.MANUAL_SET) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                String str4 = hVar.f164904d.f155830o;
                String str5 = hVar.f164904d.f155837v;
                String str6 = hVar.f164904d.f155831p;
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getBusiStickerService().mo93801a(str2, Boolean.valueOf(z3), Boolean.valueOf(z2), str4, str5, str6);
                String str7 = hVar.f164904d.f155831p;
                C70005cr a6 = C70005cr.m123611a();
                C89219l.m154716b(a6, "");
                List<AVChallenge> list = a6.f156485d;
                if (list == null || (aVChallenge2 = (AVChallenge) C89070n.m154583g((List) list)) == null) {
                    str3 = null;
                } else {
                    str3 = aVChallenge2.cid;
                }
                C70005cr a7 = C70005cr.m123611a();
                C89219l.m154716b(a7, "");
                List<AVChallenge> list2 = a7.f156485d;
                if (!(list2 == null || (aVChallenge = (AVChallenge) C89070n.m154583g((List) list2)) == null)) {
                    bool = Boolean.valueOf(aVChallenge.isCommerce);
                }
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin2, "");
                createIAVServiceProxybyMonsterPlugin2.getBusiStickerService().mo93799a(Boolean.valueOf(z2), str7, str3, str2, bool);
            }
            hVar.mo116033d().mo23118a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$c */
    static final class C73395c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73392h f164917a;

        static {
            Covode.recordClassIndex(86132);
        }

        C73395c(C73392h hVar) {
            this.f164917a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Float f;
            String str;
            String str2;
            Long l;
            String valueOf;
            float f2;
            Integer num;
            String str3;
            C73392h hVar = this.f164917a;
            C43207g.m86165c(C70638dj.f158102e, hVar.f164904d.f155830o);
            ASCameraView A = hVar.mo116029a().mo22747A();
            ComposerBeautyBuriedInfo a = C73392h.m129515a(hVar.mo116032c().mo22659i().mo121632p());
            C34810g a2 = C73392h.m129516a(hVar.mo116032c().mo22659i().mo121631o());
            long endFrameTimeUS = A.getEndFrameTimeUS() / 1000;
            FaceStickerBean i = hVar.mo116033d().mo23127i();
            if (!(C31214j.f74812a == null || C31214j.f74813b == null)) {
                C84425b a3 = new C84425b().mo129406a("creation_id", hVar.f164904d.mo110034j().getCreationId()).mo129406a("content_type", hVar.f164904d.mo110034j().getContentType()).mo129406a("content_source", hVar.f164904d.mo110034j().getContentSource()).mo129403a("record_mode", hVar.f164904d.f155763X);
                Integer num2 = C31214j.f74812a;
                if (num2 == null) {
                    C89219l.m154715b();
                }
                C84425b a4 = a3.mo129403a("record_block_tms", num2.intValue());
                Integer num3 = C31214j.f74813b;
                if (num3 == null) {
                    C89219l.m154715b();
                }
                C84425b a5 = a4.mo129403a("record_block_duration", num3.intValue()).mo129404a("record_duration", A.getEndFrameTimeUS() / 1000).mo129403a("is_composer", C34806c.m71115c(a)).mo129403a("beautify_used", C34806c.m71113b(a)).mo129406a("beautify_info", C34806c.m71111a(a));
                T value = hVar.mo116031b().getCurSelectedFilter().f7727a.getValue();
                if (value != null) {
                    num = Integer.valueOf(value.getId());
                } else {
                    num = null;
                }
                C84425b a6 = a5.mo129406a("filter_id", C73392h.m129517a(num));
                if (i == null || (str3 = String.valueOf(i.getStickerId())) == null) {
                    str3 = "";
                }
                C39162r.m79460a("video_record_block", a6.mo129406a("prop_id", str3).mo129403a("eyes", hVar.mo116032c().mo22687l()).mo129403a("smooth", hVar.mo116032c().mo22686k()).f188764a);
                C31214j.f74812a = null;
                C31214j.f74813b = null;
            }
            String[] t = A.getMediaController().mo56633t();
            if (t == null || t.length == 0) {
                f = "";
            } else {
                String str4 = t[t.length - 1];
                if (str4 != null && str4.length() > 0) {
                    File file = new File(str4);
                    if (file.exists() && file.isFile() && file.length() > 0) {
                        long length = file.length();
                        if (length > 0 && endFrameTimeUS > 0) {
                            f2 = ((((float) length) * 8.0f) / 1000.0f) / (((float) endFrameTimeUS) / 1000.0f);
                            f = Float.valueOf(f2);
                        }
                    }
                }
                f2 = 0.0f;
                f = Float.valueOf(f2);
            }
            T value2 = hVar.mo116031b().getCurSelectedFilter().f7727a.getValue();
            C84425b bVar = new C84425b();
            CameraComponentModel cameraComponentModel = hVar.f164904d.f155817b;
            C89219l.m154716b(cameraComponentModel, "");
            C84425b a7 = bVar.mo129404a("source_duration", cameraComponentModel.mo109896h()).mo129406a("creation_id", hVar.f164904d.f155830o).mo129406a("shoot_way", hVar.f164904d.f155831p).mo129406a("resolution", C65357b.m117049e());
            if (i == null || (str = i.getId()) == null) {
                str = "";
            }
            C84425b a8 = a7.mo129406a("effect_id", str);
            if (i == null || (str2 = i.getRecId()) == null) {
                str2 = "";
            }
            C84425b a9 = a8.mo129406a("effect_rec_id", str2);
            if (i != null) {
                l = Long.valueOf(i.getStickerId());
            } else {
                l = "";
            }
            C84425b a10 = a9.mo129405a("effect_sticker_id", l);
            if (value2 == null) {
                valueOf = "";
            } else {
                int id = value2.getId();
                if (id == 0) {
                    valueOf = "-1";
                } else {
                    valueOf = String.valueOf(id);
                }
            }
            Map<String, String> map = a10.mo129406a("filter_id", valueOf).mo129403a("beauty_status", C34806c.m71109a(a, a2)).mo129403a("lag_count", A.getMediaController().mo56622i()).mo129403a("lag_max", A.getMediaController().mo56623j()).mo129406a("fps", String.valueOf(A.getMediaController().mo56625l())).mo129405a("file_bitrate", f).mo129406a("bitrate", String.valueOf(C65357b.m117047c())).mo129403a("lag_total_duration", A.getMediaController().mo56624k()).mo129404a("duration", endFrameTimeUS).mo129406a("write_fps", String.valueOf(A.getMediaController().mo56630q())).mo129403a("frame_total", A.getMediaController().mo56631r()).mo129403a("beautify_used", C34806c.m71113b(a)).mo129406a("beautify_info", C34806c.m71111a(a)).mo129403a("is_composer", C34806c.m71115c(a)).f188764a;
            C89219l.m154716b(map, "");
            C74029a.m130192a("tool_performance_video_record", map);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$d */
    static final class C73396d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73392h f164918a;

        static {
            Covode.recordClassIndex(86133);
        }

        C73396d(C73392h hVar) {
            this.f164918a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            String str2;
            Integer num;
            String str3;
            String str4;
            String str5;
            String gradeKey;
            String str6;
            String propSource;
            String str7;
            LiveData<C75588b> g;
            C75588b value;
            C75658r value2;
            Long l;
            Integer valueOf;
            Long l2;
            String str8;
            String str9;
            String str10;
            Long l3;
            String str11;
            Integer num2;
            String str12;
            String str13;
            float f;
            float f2;
            String str14;
            AbstractC50705m mVar;
            AbstractC50705m mVar2;
            String str15;
            String str16;
            C14196o oVar = (C14196o) obj;
            C73392h hVar = this.f164918a;
            C89219l.m154716b(oVar, "");
            if (hVar.f164904d.f155817b.f155651g < hVar.f164904d.f155817b.f155646b) {
                FaceStickerBean i = hVar.mo116033d().mo23127i();
                if (i == FaceStickerBean.NONE) {
                    i = null;
                }
                T value3 = hVar.mo116031b().getCurSelectedFilter().f7727a.getValue();
                boolean z = !C34805b.m71108b();
                C84425b a = new C84425b().mo129406a("creation_id", hVar.f164904d.f155830o).mo129406a("enter_from", "video_shoot_page").mo129406a("content_type", hVar.f164904d.mo110034j().getContentType()).mo129406a("content_source", hVar.f164904d.mo110034j().getContentSource()).mo129406a("shoot_way", hVar.f164904d.f155831p);
                if (hVar.mo116029a().mo22757K() == 1) {
                    str = "front";
                } else {
                    str = "back";
                }
                C84425b a2 = a.mo129406a("camera", str).mo129406a("speed_mode", hVar.mo116029a().mo22754H().toString());
                if (value3 == null || (str2 = value3.getEnName()) == null) {
                    str2 = "";
                }
                C84425b a3 = a2.mo129406a("filter_name", str2);
                if (value3 != null) {
                    num = Integer.valueOf(value3.getId());
                } else {
                    num = null;
                }
                C84425b a4 = a3.mo129406a("filter_id", C73392h.m129517a(num));
                int i2 = hVar.f164904d.f155763X;
                String str17 = "press";
                if (i2 == 0) {
                    str3 = "click";
                } else if (i2 == 1) {
                    str3 = str17;
                } else if (i2 == 8) {
                    str3 = "video";
                } else if (i2 == 14) {
                    str3 = "video_180";
                } else if (i2 == 10) {
                    str3 = "video_15";
                } else if (i2 != 11) {
                    str3 = "";
                } else {
                    str3 = "video_60";
                }
                C84425b a5 = a4.mo129406a("record_mode", str3);
                int i3 = oVar.f34469a;
                if (i3 == 1) {
                    str17 = "click";
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        str17 = "";
                    } else {
                        str17 = "countdown";
                    }
                }
                C84425b a6 = a5.mo129406a("record_type", str17);
                if (i == null || (str4 = String.valueOf(i.getStickerId())) == null) {
                    str4 = "";
                }
                C84425b a7 = a6.mo129406a("prop_id", str4).mo129406a("is_westwindow_exist", hVar.f164904d.f155782aP);
                String str18 = "0";
                if (i == null || (str5 = i.getRecId()) == null) {
                    str5 = str18;
                }
                C84425b a8 = a7.mo129406a("prop_rec_id", str5);
                if (i == null) {
                    gradeKey = "";
                } else {
                    gradeKey = i.getGradeKey();
                }
                C84425b a9 = a8.mo129406a("prop_index", gradeKey);
                CommentVideoModel commentVideoModel = hVar.f164904d.f155825j;
                if (commentVideoModel == null || (str6 = commentVideoModel.getEnterMethod()) == null) {
                    str6 = "";
                }
                C84425b a10 = a9.mo129406a("enter_method", str6);
                if (hVar.f164904d.f155740A != 0) {
                    a10.mo129403a("draft_id", hVar.f164904d.f155740A);
                }
                String str19 = hVar.f164904d.f155741B;
                C89219l.m154716b(str19, "");
                if (str19.length() > 0) {
                    a10.mo129406a("new_draft_id", hVar.f164904d.f155741B);
                }
                if (i == null) {
                    propSource = "";
                } else {
                    propSource = i.getPropSource();
                }
                String a11 = C75447n.m132310a(propSource, true);
                GreenScreenMaterial greenScreenMaterial = hVar.f164904d.f155836u;
                if (greenScreenMaterial != null) {
                    str7 = greenScreenMaterial.getMediasource();
                } else {
                    str7 = null;
                }
                a10.mo129406a("prop_selected_from", str7);
                if (!TextUtils.isEmpty(a11)) {
                    a10.mo129406a("prop_selected_from", a11);
                }
                C89219l.m154716b(a10, "");
                FaceStickerBean i4 = hVar.mo116033d().mo23127i();
                if (!(i4 == null || (g = hVar.mo116033d().mo23167t().mo119302n().mo119330g()) == null || (value = g.getValue()) == null)) {
                    C89219l.m154716b(value, "");
                    LiveData<C75658r> f3 = hVar.mo116033d().mo23167t().mo119302n().mo119329f();
                    if (!(f3 == null || (value2 = f3.getValue()) == null)) {
                        C89219l.m154716b(value2, "");
                        if (!value.f169919d && !C89219l.m154714a(i4, FaceStickerBean.NONE)) {
                            int i5 = value2.f170073a;
                            if (i5 >= 0) {
                                a10.mo129406a("prop_tab_order", String.valueOf(i5));
                            }
                            int i6 = value.f169918c;
                            if (i6 >= 0) {
                                a10.mo129406a("prop_impr_position", String.valueOf(i6));
                            }
                        }
                    }
                }
                FaceStickerBean i7 = hVar.mo116033d().mo23127i();
                if (i7 != null) {
                    l = Long.valueOf(i7.getStickerId());
                } else {
                    l = null;
                }
                String valueOf2 = String.valueOf(l);
                if (hVar.f164904d.f155834s != null && valueOf2 != null && hVar.f164904d.f155831p.equals("draft_again") && !TextUtils.isEmpty(valueOf2)) {
                    int indexOf = TextUtils.indexOf(hVar.f164904d.f155834s, valueOf2);
                    if (indexOf == 0) {
                        str16 = "first";
                    } else if (indexOf == -1) {
                        str16 = "not_drafts";
                    } else {
                        str16 = "other";
                    }
                    a10.mo129406a("prop_from", str16);
                }
                if (hVar.mo116029a().mo22940am() != null) {
                    C72744a am = hVar.mo116029a().mo22940am();
                    if (am == null) {
                        C89219l.m154715b();
                    }
                    ReactionWindowInfo reactionWindowInfo = am.f163106c.getReactionWindowInfo();
                    ReactionParams reactionParams = hVar.f164904d.f155817b.f155660p.f155723a;
                    if (reactionParams == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(reactionWindowInfo, "");
                    C89219l.m154721d(reactionWindowInfo, "");
                    reactionParams.addReactionWindowInfo(new CopiedReactionWindowInfo(reactionWindowInfo.getWidth(), reactionWindowInfo.getHeight(), reactionWindowInfo.getAngle(), reactionWindowInfo.getType()));
                    C84425b a12 = a10.mo129403a("height", reactionWindowInfo.getHeight()).mo129403a("width", reactionWindowInfo.getWidth()).mo129406a("angle", new StringBuilder().append(reactionWindowInfo.getAngle()).toString());
                    if (reactionWindowInfo.getType() == 1) {
                        str15 = "round";
                    } else {
                        str15 = "square";
                    }
                    a12.mo129406a("window_type", str15);
                }
                if (z) {
                    a10.mo129403a("smooth", hVar.mo116032c().mo22686k()).mo129403a("shape", hVar.mo116032c().mo22688m()).mo129403a("eyes", hVar.mo116032c().mo22687l()).mo129403a("tanning", hVar.mo116032c().mo22689n());
                }
                T value4 = hVar.mo116031b().getCurSelectedFilter().f7727a.getValue();
                if (value4 != null) {
                    C14215e value5 = hVar.mo116031b().getCurrentFilterSource().getValue();
                    if (value5 == null || (mVar2 = value5.f34499c) == null) {
                        f = -1.0f;
                    } else {
                        f = mVar2.mo86055a(value4);
                    }
                    C14215e value6 = hVar.mo116031b().getCurrentFilterSource().getValue();
                    if (value6 == null || (mVar = value6.f34499c) == null) {
                        f2 = -1.0f;
                    } else {
                        f2 = C50691c.m94984a(mVar, value4);
                    }
                    a10.mo129405a("filter_value", Float.valueOf(f2));
                    if (((double) Math.abs(C50648c.m94906a(value4) - f)) < 0.01d || C50648c.m94906a(value4) == -1.0f) {
                        str14 = "1";
                    } else {
                        str14 = str18;
                    }
                    a10.mo129406a("is_original_filter", str14);
                } else {
                    a10.mo129406a("filter_value", "");
                }
                a10.mo129406a("camera_type", C74049z.m130207a(hVar.mo116029a().mo22747A().getCurrentCameraType()));
                if (oVar.f34470b == 0) {
                    valueOf = "";
                } else {
                    valueOf = Integer.valueOf(oVar.f34470b);
                }
                a10.mo129405a("countdown_type", valueOf);
                String str20 = "upload";
                if (hVar.f164904d.f155816az != 0) {
                    if (hVar.f164904d.f155816az == 1) {
                        str13 = str20;
                    } else {
                        str13 = "shoot";
                    }
                    a10.mo129406a("picture_source", str13);
                }
                if (hVar.f164904d.f155817b.f155653i) {
                    a10.mo129406a("action_type", "reshoot");
                }
                String str21 = "off";
                if (C70659a.m124890a(hVar.f164904d)) {
                    a10.mo129406a("duet_layout", hVar.f164904d.f155817b.f155659o.f155688j);
                    if (hVar.f164904d.f155817b.f155656l) {
                        str12 = str21;
                    } else {
                        str12 = "on";
                    }
                    a10.mo129406a("mic_status", str12);
                }
                a10.mo129406a("from_group_id", C70747dv.m124972a());
                if (TextUtils.equals(hVar.f164904d.f155837v, "super_entrance")) {
                    a10.mo129403a("is_special_icon", 1);
                }
                String str22 = hVar.f164904d.f155761V;
                if (str22 == null) {
                    str22 = "";
                }
                a10.mo129406a("from_prop_id", str22);
                String str23 = hVar.f164904d.f155761V;
                if (i != null) {
                    l2 = Long.valueOf(i.getStickerId());
                } else {
                    l2 = null;
                }
                if (C89219l.m154714a((Object) str23, (Object) String.valueOf(l2))) {
                    str8 = "1";
                } else {
                    str8 = str18;
                }
                a10.mo129406a("is_default_prop", str8);
                if (i == null || !i.isBusi()) {
                    str9 = str18;
                } else {
                    str9 = "1";
                }
                a10.mo129406a("is_commercial_prop", str9);
                GreenScreenMaterial greenScreenMaterial2 = hVar.f164904d.f155836u;
                if (greenScreenMaterial2 != null) {
                    str10 = greenScreenMaterial2.getResId();
                } else {
                    str10 = null;
                }
                a10.mo129406a("giphy_id", str10);
                String str24 = hVar.f164904d.f155761V;
                if (i != null) {
                    l3 = Long.valueOf(i.getStickerId());
                } else {
                    l3 = null;
                }
                if (C89219l.m154714a((Object) str24, (Object) String.valueOf(l3))) {
                    str11 = "1";
                } else {
                    str11 = str18;
                }
                a10.mo129406a("is_default_prop", str11);
                if (i != null && i.isBusi()) {
                    str18 = "1";
                }
                a10.mo129406a("is_commercial_prop", str18);
                if (hVar.f164904d.mo110033i()) {
                    a10.mo129406a("shoot_entrance", hVar.f164904d.f155831p);
                    a10.mo129403a("reviewed", hVar.f164904d.f155765Z.getReviewed());
                    if (!TextUtils.isEmpty(hVar.f164904d.f155765Z.getOrderId())) {
                        a10.mo129406a(C74418d.MOD_ORDER_ID, hVar.f164904d.f155765Z.getOrderId());
                    }
                }
                a10.mo129406a("shoot_page", "video_shoot_page");
                a10.mo129406a("shoot_tab_name", hVar.f164904d.mo110042r());
                C39162r.m79460a("record_video", a10.f188764a);
                if (hVar.f164904d.f155816az == 0) {
                    hVar.f164904d.f155767aA.add("");
                } else {
                    ArrayList<String> arrayList = hVar.f164904d.f155767aA;
                    if (hVar.f164904d.f155816az != 1) {
                        str20 = "shoot";
                    }
                    arrayList.add(str20);
                }
                C34806c.m71114b(C73392h.m129515a(hVar.mo116032c().mo22659i().mo121632p()), C73392h.m129516a(hVar.mo116032c().mo22659i().mo121631o()));
                if (hVar.f164904d.f155790aX == null) {
                    hVar.f164904d.f155790aX = C34807d.m71116a(hVar.mo116032c().mo22659i().mo121635s());
                }
                if (C63253l.f143623a.mo73311g().mo93796b(C40963b.m82473a())) {
                    str21 = "on";
                }
                C39162r.m79460a("earphone_status", new C84425b().mo129406a("plugin_type", "record_video").mo129406a("to_status", str21).f188764a);
                ShortVideoContext shortVideoContext = hVar.f164904d;
                AbstractC31133a mediaController = hVar.mo116029a().mo22747A().getMediaController();
                FaceStickerBean i8 = hVar.mo116033d().mo23127i();
                T value7 = hVar.mo116031b().getCurSelectedFilter().f7727a.getValue();
                if (value7 != null) {
                    num2 = Integer.valueOf(value7.getId());
                } else {
                    num2 = null;
                }
                C71820a.m126811a(shortVideoContext, mediaController, i8, num2, C73392h.m129515a(hVar.mo116032c().mo22659i().mo121632p()), C73392h.m129516a(hVar.mo116032c().mo22659i().mo121631o()), "start_record", C73409p.f164933a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$l */
    static final class C73404l extends AbstractC89220m implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C73404l f164926a = new C73404l();

        static {
            Covode.recordClassIndex(86141);
        }

        C73404l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(map2, "");
            C74029a.m130192a(str2, map2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$p */
    static final class C73409p extends AbstractC89220m implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C73409p f164933a = new C73409p();

        static {
            Covode.recordClassIndex(86146);
        }

        C73409p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(map2, "");
            C74029a.m130192a(str2, map2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    static void m129518a(ShortVideoContext shortVideoContext, String str) {
        String str2;
        C84425b a = new C84425b().mo129406a("content_type", "video").mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("to_status", str).mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("enter_from", "video_shoot_page");
        if (shortVideoContext.f155752M) {
            str2 = "click_draft";
        } else {
            str2 = "";
        }
        C84425b a2 = a.mo129406a("enter_method", str2);
        if (shortVideoContext.f155740A != 0) {
            a2.mo129403a("draft_id", shortVideoContext.f155740A);
        }
        if (!TextUtils.isEmpty(shortVideoContext.f155741B)) {
            a2.mo129406a("new_draft_id", shortVideoContext.f155741B);
        }
        C39162r.m79460a("mute_microphone", a2.f188764a);
    }

    /* renamed from: a */
    public final void mo116030a(String str, long j) {
        CameraComponentModel b = mo116029a().mo22803b();
        C69840ar arVar = new C69840ar();
        arVar.mo110189a("error_type", str);
        arVar.mo110188a("error_duration", Long.valueOf(j));
        arVar.mo110187a("segment_count", Integer.valueOf(b.f155650f.size()));
        Workspace workspace = b.f155652h;
        C89219l.m154716b(workspace, "");
        File e = workspace.mo110096e();
        C89219l.m154716b(e, "");
        if (e.isDirectory()) {
            arVar.mo110189a("file_path", C73996bl.m130140a(e.list(), ","));
        }
        C63244g.m114602a().mo73263I().mo101635a("aweme_draft_edit_error", arVar.mo110191a());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$o */
    static final class C73407o extends AbstractC89220m implements AbstractC89188r<Integer, Integer, String, C85346av, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73392h f164929a;

        static {
            Covode.recordClassIndex(86144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73407o(C73392h hVar) {
            super(4);
            this.f164929a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, String str, C85346av avVar) {
            Integer num3;
            String valueOf;
            int intValue = num.intValue();
            num2.intValue();
            C85346av avVar2 = avVar;
            String str2 = "";
            C89219l.m154721d(avVar2, str2);
            if (intValue == 1076) {
                C31214j.f74814c = avVar2.mo130679C();
                C31214j.f74815d = avVar2.mo130680D();
                C31214j.f74816e = avVar2.mo130681E();
                C31214j.f74817f = avVar2.mo130682F();
                final ComposerBeautyBuriedInfo a = C73392h.m129515a(this.f164929a.mo116032c().mo22659i().mo121632p());
                final C34810g a2 = C73392h.m129516a(this.f164929a.mo116032c().mo22659i().mo121631o());
                C84425b a3 = new C84425b().mo129406a("creation_id", this.f164929a.f164904d.mo110034j().getCreationId()).mo129406a("content_type", this.f164929a.f164904d.mo110034j().getContentType()).mo129406a("content_source", this.f164929a.f164904d.mo110034j().getContentSource()).mo129403a("record_mode", this.f164929a.f164904d.f155763X).mo129404a("record_duration", this.f164929a.mo116029a().mo22747A().getEndFrameTimeUS() / 1000);
                T value = this.f164929a.mo116031b().getCurSelectedFilter().f7727a.getValue();
                if (value != null) {
                    num3 = Integer.valueOf(value.getId());
                } else {
                    num3 = null;
                }
                C84425b a4 = a3.mo129406a("filter_id", C73392h.m129517a(num3));
                FaceStickerBean i = this.f164929a.mo116033d().mo23127i();
                if (!(i == null || (valueOf = String.valueOf(i.getStickerId())) == null)) {
                    str2 = valueOf;
                }
                final C84425b a5 = a4.mo129406a("prop_id", str2).mo129403a("eyes", this.f164929a.mo116032c().mo22687l()).mo129403a("smooth", this.f164929a.mo116032c().mo22686k()).mo129403a("reshape", this.f164929a.mo116032c().mo22688m()).mo129405a("record_preview_frame_rate_start", Double.valueOf(C31214j.f74814c)).mo129405a("record_preview_frame_rate_end", Double.valueOf(C31214j.f74815d)).mo129405a("record_render_frame_time", Double.valueOf(C31214j.f74816e)).mo129405a("record_effect_render_time", Double.valueOf(C31214j.f74817f));
                C1731i.m5640b(new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73392h.C73407o.CallableC734081 */

                    static {
                        Covode.recordClassIndex(86145);
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        C39162r.m79460a("record_frame_rate_info", a5.mo129403a("is_composer", C34806c.m71115c(a)).mo129403a("beautify_used", C34806c.m71113b(a)).mo129406a("beautify_info", C34806c.m71111a(a)).mo129403a("beautify_status", C34806c.m71109a(a, a2)).f188764a);
                        return C89391z.f203057a;
                    }
                }, C39162r.m79452a());
            }
            return C89391z.f203057a;
        }
    }
}
