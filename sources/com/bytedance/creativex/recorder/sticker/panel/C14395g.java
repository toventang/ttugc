package com.bytedance.creativex.recorder.sticker.panel;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.creativex.recorder.sticker.panel.C14389e;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3804d.p3805a.C70626a;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a.C72744a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72875f;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75275d;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75314e;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.creativex.recorder.sticker.panel.g */
public final class C14395g extends C14389e {

    /* renamed from: c */
    static final /* synthetic */ AbstractC89286i[] f34841c = {new C89232y(C14395g.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C14395g.class, "tikTokCameraApiComponent", "getTikTokCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C89232y(C14395g.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: d */
    final ActivityC0945e f34842d = ((ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null));

    /* renamed from: e */
    private final AbstractC89248d f34843e = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: f */
    private final AbstractC89248d f34844f = C21572a.m40505b(getDiContainer(), AbstractC14209z.class);

    /* renamed from: k */
    private final AbstractC75314e f34845k = ((AbstractC75314e) getDiContainer().mo35252b(AbstractC75314e.class, null));

    /* renamed from: l */
    private final AbstractC14315b f34846l = ((AbstractC14315b) getDiContainer().mo35252b(AbstractC14315b.class, null));

    /* renamed from: m */
    private final AbstractC89248d f34847m = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    static {
        Covode.recordClassIndex(16470);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final AbstractC14177d mo23206f() {
        return (AbstractC14177d) this.f34843e.mo23374a(this, f34841c[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final AbstractC14209z mo23207g() {
        return (AbstractC14209z) this.f34844f.mo23374a(this, f34841c[1]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final ShortVideoContext mo23208h() {
        return (ShortVideoContext) this.f34847m.mo23374a(this, f34841c[2]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final ASCameraView mo23209i() {
        return mo23206f().mo22747A();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.creativex.recorder.sticker.panel.C14389e, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        C2559g<AbstractC75275d> a;
        C2559g<AbstractC75620c> f;
        super.onCreate();
        AbstractC14315b bVar = this.f34846l;
        if (bVar != null) {
            ((C14389e) this).f34826a.mo23122d().mo6997a(this, new C14396a(bVar, this));
            AbstractC14330a aVar = ((C14389e) this).f34826a;
            if (!(aVar == null || (f = aVar.mo23124f()) == null)) {
                f.mo6997a(this, new C14397b(bVar, this));
            }
            AbstractC75314e eVar = this.f34845k;
            if (eVar != null && (a = eVar.mo118896a()) != null) {
                a.mo6997a(this, new C14398c(bVar));
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.g$c */
    static final class C14398c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ AbstractC14315b f34852a;

        static {
            Covode.recordClassIndex(16473);
        }

        C14398c(AbstractC14315b bVar) {
            this.f34852a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj instanceof AbstractC75275d.C75277b) {
                this.f34852a.mo23096a(new AbstractC14318d.C14319a());
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.g$a */
    static final class C14396a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ AbstractC14315b f34848a;

        /* renamed from: b */
        final /* synthetic */ C14395g f34849b;

        static {
            Covode.recordClassIndex(16471);
        }

        C14396a(AbstractC14315b bVar, C14395g gVar) {
            this.f34848a = bVar;
            this.f34849b = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String stickerId;
            String str;
            String str2;
            Boolean bool = (Boolean) obj;
            this.f34848a.mo23099a(!bool.booleanValue());
            C89219l.m154716b(bool, "");
            if (bool.booleanValue() && !C63244g.m114602a().mo73255A().mo93901a()) {
                C14395g gVar = this.f34849b;
                Mission a = C63238c.f143585l.mo93813a(gVar.mo23208h().f155794ad.f155707c);
                if (a != null && (stickerId = a.getStickerId()) != null && stickerId.length() != 0) {
                    Integer num = null;
                    if (!a.isStickerToasted()) {
                        Effect a2 = C75346e.m132154a(((C14389e) gVar).f34826a);
                        if (a2 != null) {
                            str2 = a2.getEffectId();
                        } else {
                            str2 = null;
                        }
                        if (!TextUtils.equals(str2, a.getStickerId())) {
                            a.setStickerToasted(true);
                            gVar.mo23208h().f155794ad.f155707c = C63238c.f143585l.mo93816a(gVar.mo23208h().f155794ad.f155707c, a);
                        }
                    }
                    if (!a.isStickerToasted()) {
                        C85041d.m146226b(gVar.f34842d, R.string.d3p).mo129984b();
                        C84425b a3 = new C84425b().mo129403a("reason", 0).mo129406a("mission_id", a.getMissionId()).mo129406a("page_source", a.getEnterFrom());
                        AbstractC32846a e = C63238c.f143594u.mo93906e();
                        if (e != null) {
                            num = Integer.valueOf(e.mo58670m());
                        }
                        C84425b a4 = a3.mo129405a("creator_followers", num);
                        if (C63253l.f143623a.mo73330z().mo93832j()) {
                            str = "0";
                        } else {
                            str = "1";
                        }
                        C39162r.m79460a("mission_requirement_toast", a4.mo129406a("creator_type", str).f188764a);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.g$b */
    static final class C14397b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ AbstractC14315b f34850a;

        /* renamed from: b */
        final /* synthetic */ C14395g f34851b;

        static {
            Covode.recordClassIndex(16472);
        }

        C14397b(AbstractC14315b bVar, C14395g gVar) {
            this.f34850a = bVar;
            this.f34851b = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect;
            String str;
            String str2;
            AbstractC14318d dVar;
            C72744a am;
            AbstractC75620c cVar = (AbstractC75620c) obj;
            C14395g gVar = this.f34851b;
            C89219l.m154716b(cVar, "");
            AbstractC14315b bVar = this.f34850a;
            EnumC75295a aVar = EnumC75295a.UI_CLICK;
            Integer num = null;
            if (cVar instanceof C75618a) {
                C75618a aVar2 = (C75618a) cVar;
                effect = aVar2.f170022a;
                if (C75466g.m132359k(effect)) {
                    gVar.mo23206f().mo22834v();
                    AbstractC31193a effectController = gVar.mo23209i().getEffectController();
                    ViewGroup.LayoutParams layoutParams = gVar.mo23206f().mo22750D().getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    bVar.mo23096a(new C70626a(effectController, new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams)));
                } else {
                    List<String> tags = effect.getTags();
                    if (tags == null) {
                        tags = new ArrayList<>();
                    }
                    if (tags.contains("transfer_touch")) {
                        bVar.mo23096a(new C72875f(gVar.f34842d, gVar.mo23209i().getEffectController()));
                    } else if (!effect.getTypes().contains("FaceReplace3D")) {
                        gVar.mo23205a(effect, bVar);
                    } else if (effect.getTags() != null) {
                        AbstractC14209z g = gVar.mo23207g();
                        if (g == null || (am = g.mo22940am()) == null || (dVar = am.f163110g) == null) {
                            dVar = new AbstractC14318d.C14319a();
                        }
                        bVar.mo23096a(dVar);
                    }
                }
                aVar = aVar2.f170024c;
            } else {
                if (cVar instanceof C75621d) {
                    gVar.mo23205a(null, bVar);
                    aVar = ((C75621d) cVar).f170030c;
                }
                effect = null;
            }
            if (aVar != EnumC75295a.MANUAL_SET) {
                if (effect != null) {
                    str = effect.getEffectId();
                } else {
                    str = null;
                }
                PublishExtensionModel fromString = PublishExtensionModel.fromString(gVar.mo23208h().f155794ad.f155707c);
                Mission mission = fromString.mission;
                if (mission != null && !mission.isStickerToasted() && !TextUtils.equals(mission.getStickerId(), str)) {
                    mission.setStickerToasted(true);
                    C84425b a = new C84425b().mo129403a("value", 0).mo129406a("mission_id", mission.getMissionId()).mo129406a("page_source", mission.getEnterFrom());
                    AbstractC32846a e = C63238c.f143594u.mo93906e();
                    if (e != null) {
                        num = Integer.valueOf(e.mo58670m());
                    }
                    C84425b a2 = a.mo129405a("creator_followers", num);
                    if (C63253l.f143623a.mo73330z().mo93832j()) {
                        str2 = "0";
                    } else {
                        str2 = "1";
                    }
                    C39162r.m79460a("mission_requirement_modified", a2.mo129406a("creator_type", str2).f188764a);
                    fromString.mission = mission;
                    gVar.mo23208h().f155794ad.f155707c = PublishExtensionModel.toString(fromString);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23205a(Effect effect, AbstractC14315b bVar) {
        AbstractC14318d aVar;
        C72744a am;
        AbstractC14209z g = mo23207g();
        if (g != null && (am = g.mo22940am()) != null && !C75466g.m132361m(effect)) {
            aVar = am.f163110g;
        } else if (effect == null || !effect.getTypes().contains("TouchGes")) {
            aVar = new AbstractC14318d.C14319a();
        } else {
            mo23206f().mo22834v();
            AbstractC31193a effectController = mo23209i().getEffectController();
            ViewGroup.LayoutParams layoutParams = mo23206f().mo22750D().getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            aVar = new C70626a(effectController, new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams));
        }
        C89219l.m154716b(aVar, "");
        bVar.mo23096a(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14395g(C21582f fVar, AbstractC22186b bVar, int i, AbstractC89172b<? super C14389e.C14390a, C89391z> bVar2) {
        super(fVar, bVar, i, bVar2);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
    }
}
