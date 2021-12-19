package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import android.content.SharedPreferences;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.C14219i;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14202u;
import com.bytedance.creativex.recorder.p940b.p941a.C14171ac;
import com.bytedance.creativex.recorder.p940b.p941a.C14206w;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ttve.editorInfo.C30652a;
import com.p2082ss.android.ugc.asve.recorder.camera.p2222a.C31163b;
import com.p2082ss.android.ugc.aweme.beauty.C34805b;
import com.p2082ss.android.ugc.aweme.beauty.C34809f;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65370bj;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72621b;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75714s;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75738i;
import com.p2082ss.android.ugc.aweme.tools.C78599g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e */
public final class C73378e extends AbstractC2562j<AbstractC73377d> implements AbstractC21566a, AbstractC73377d {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f164874a = {new C89232y(C73378e.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C73378e.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C73378e.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new C89232y(C73378e.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C89232y(C73378e.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new C89232y(C73378e.class, "recordModeApiComponent", "getRecordModeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0)};

    /* renamed from: b */
    public final AbstractC73377d f164875b = this;

    /* renamed from: c */
    public final ShortVideoContext f164876c = ((ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null));

    /* renamed from: d */
    private final ActivityC0945e f164877d = ((ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null));

    /* renamed from: e */
    private final AbstractC89248d f164878e = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: f */
    private final AbstractC89248d f164879f = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: g */
    private final AbstractC89248d f164880g = C21572a.m40504a(getDiContainer(), AbstractC14210a.class);

    /* renamed from: h */
    private final AbstractC89248d f164881h = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);

    /* renamed from: i */
    private final AbstractC89248d f164882i = C21572a.m40504a(getDiContainer(), AbstractC14099a.class);

    /* renamed from: j */
    private final AbstractC89248d f164883j = C21572a.m40505b(getDiContainer(), AbstractC73411i.class);

    /* renamed from: k */
    private final C88411a f164884k = new C88411a();

    /* renamed from: l */
    private final C21582f f164885l;

    static {
        Covode.recordClassIndex(86115);
    }

    /* renamed from: h */
    private final AbstractC14193m m129505h() {
        return (AbstractC14193m) this.f164879f.mo23374a(this, f164874a[1]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC14177d mo116020a() {
        return (AbstractC14177d) this.f164878e.mo23374a(this, f164874a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC14210a mo116022b() {
        return (AbstractC14210a) this.f164880g.mo23374a(this, f164874a[2]);
    }

    /* renamed from: c */
    public final AbstractC84089j mo116023c() {
        return (AbstractC84089j) this.f164881h.mo23374a(this, f164874a[3]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final AbstractC14099a mo116024d() {
        return (AbstractC14099a) this.f164882i.mo23374a(this, f164874a[4]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC73377d getApiComponent() {
        return this.f164875b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f164885l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final CameraModule mo116025e() {
        return mo116020a().mo22810c();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        this.f164884k.mo142944a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo116026f() {
        if (C34805b.m71107a() && !C34809f.m71120a()) {
            mo116024d().mo22651a(this.f164876c.f155817b.f155637B);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        C2559g<Boolean> a;
        super.onCreate();
        mo116022b().getFilterUpdateEvent().mo6997a(this, new C73379a(this));
        m129505h().mo22912s().mo6997a(this, new C73380b(this));
        m129505h().mo22902i().mo6997a(this, new C73381c(this));
        m129505h().mo22912s().mo6997a(this, new C73382d(this));
        m129505h().mo22913t().mo6997a(this, C73383e.f164890a);
        m129505h().mo22906m().mo6997a(this, new C73384f(this));
        AbstractC88412b a2 = m129505h().mo22866B().mo143254a(C73385g.f164892a, C84909p.f189747a);
        C89219l.m154716b(a2, "");
        C88934a.m154195a(a2, this.f164884k);
        AbstractC73411i iVar = (AbstractC73411i) this.f164883j.mo23374a(this, f164874a[5]);
        if (!(iVar == null || (a = iVar.mo116036a()) == null)) {
            a.mo6997a(this, new C73386h(this));
        }
        mo116023c().mo23124f().mo6997a(this, new C73387i(this));
        mo116023c().mo23122d().mo6997a(this.f164877d, new C73388j(this));
    }

    /* renamed from: g */
    public final void mo116027g() {
        if (this.f164876c.f155763X != 15) {
            long j = this.f164876c.f155817b.f155646b;
            SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
            edit.putLong("max_duration", j);
            C13611a.m24460a(edit);
            String str = this.f164876c.f155817b.f155659o.f155681c;
            String str2 = this.f164876c.f155817b.f155659o.f155682d;
            SharedPreferences.Editor edit2 = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
            edit2.putString("duet_video_path", str);
            edit2.putString("duet_audio_path", str2);
            C13611a.m24460a(edit2);
            ReactionParams reactionParams = this.f164876c.f155817b.f155660p.f155723a;
            SharedPreferences.Editor edit3 = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
            edit3.putString("reaction", C63244g.m114602a().mo73261G().mo46674b(reactionParams));
            C13611a.m24460a(edit3);
            StitchParams stitchParams = this.f164876c.f155743D.f155846a;
            SharedPreferences.Editor edit4 = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
            edit4.putString("stitch_params", C63244g.m114602a().mo73261G().mo46674b(stitchParams));
            C13611a.m24460a(edit4);
            boolean z = this.f164876c.f155817b.f155637B;
            SharedPreferences.Editor edit5 = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
            edit5.putInt("face_beauty", z ? 1 : 0);
            C13611a.m24460a(edit5);
            if (this.f164876c.mo110033i()) {
                SharedPreferences.Editor edit6 = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
                edit6.putBoolean("shoutout_params", true);
                C13611a.m24460a(edit6);
            }
            SharedARModel sharedARModel = this.f164876c.f155756Q;
            if (sharedARModel != null) {
                SharedPreferences.Editor edit7 = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
                edit7.putString("shared_ar", C63244g.m114602a().mo73261G().mo46674b(sharedARModel));
                C13611a.m24460a(edit7);
            }
            C71833a.m126844a(this.f164876c.f155817b.f155649e);
            C71833a.m126848a(this.f164876c.f155817b.f155669y, C70005cr.m123611a().f156482a, this.f164876c.f155817b.f155661q);
            C70650dt dtVar = this.f164876c.f155817b.f155650f;
            Objects.requireNonNull(dtVar, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> /* = java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> */");
            C71833a.m126849a(dtVar);
            ExtractFramesModel e = mo116020a().mo22751E().mo122474e();
            SharedPreferences.Editor edit8 = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
            edit8.putString("shot_extract_frame", C63244g.m114602a().mo73261G().mo46674b(e));
            C13611a.m24460a(edit8);
            String strArray = this.f164876c.f155817b.f155642G.f155724a.toString();
            String strArray2 = this.f164876c.f155817b.f155642G.f155725b.toString();
            String strArray3 = this.f164876c.f155817b.f155642G.f155726c.toString();
            SharedPreferences.Editor edit9 = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
            edit9.putString("filter_labels", strArray);
            edit9.putString("filter_ids", strArray2);
            edit9.putString("filter_values", strArray3);
            C13611a.m24460a(edit9);
            if (C65370bj.m117066a()) {
                if (this.f164876c.f155817b.f155640E == null) {
                    this.f164876c.mo110012a(C30652a.m63003a());
                } else {
                    Map<String, Object> map = this.f164876c.f155817b.f155640E;
                    Map<String, Object> a = C30652a.m63003a();
                    C89219l.m154716b(a, "");
                    map.putAll(a);
                }
                C71833a.m126850a(this.f164876c.f155817b.f155640E);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$e */
    static final class C73383e<T> implements AbstractC2565m {

        /* renamed from: a */
        public static final C73383e f164890a = new C73383e();

        static {
            Covode.recordClassIndex(86120);
        }

        C73383e() {
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C72621b.f162801a.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$g */
    static final class C73385g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C73385g f164892a = new C73385g();

        static {
            Covode.recordClassIndex(86122);
        }

        C73385g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj instanceof AbstractC14202u.C14203a) {
                C40970e.m82485a("clearEdit() called");
                C71833a.m126843a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$c */
    static final class C73381c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73378e f164888a;

        static {
            Covode.recordClassIndex(86118);
        }

        C73381c(C73378e eVar) {
            this.f164888a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14206w wVar = (C14206w) obj;
            ShortVideoContext shortVideoContext = this.f164888a.f164876c;
            C89219l.m154716b(wVar, "");
            shortVideoContext.f155812av.add(Integer.valueOf(wVar.f34483b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$d */
    static final class C73382d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73378e f164889a;

        static {
            Covode.recordClassIndex(86119);
        }

        C73382d(C73378e eVar) {
            this.f164889a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            CameraComponentModel cameraComponentModel = this.f164889a.f164876c.f155817b;
            C89219l.m154716b(cameraComponentModel, "");
            if (cameraComponentModel.mo109891d().isEmpty()) {
                C71833a.m126843a();
            } else {
                this.f164889a.mo116027g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$f */
    static final class C73384f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73378e f164891a;

        static {
            Covode.recordClassIndex(86121);
        }

        C73384f(C73378e eVar) {
            this.f164891a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14207x xVar = (C14207x) obj;
            C89219l.m154716b(xVar, "");
            if (xVar.f34485a != 1) {
                this.f164891a.mo116027g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$a */
    static final class C73379a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73378e f164886a;

        static {
            Covode.recordClassIndex(86116);
        }

        C73379a(C73378e eVar) {
            this.f164886a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14219i iVar = (C14219i) obj;
            C89219l.m154716b(iVar, "");
            if (C89219l.m154714a((Object) iVar.f34505b.f34497a, (Object) "live")) {
                C63238c.f143592s.mo93837a(iVar.f34504a, C50691c.m94985a(iVar.f34505b.f34498b.mo86071f(), iVar.f34504a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$b */
    static final class C73380b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73378e f164887a;

        static {
            Covode.recordClassIndex(86117);
        }

        C73380b(C73378e eVar) {
            this.f164887a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f164887a.f164876c.f155767aA.size() > 0) {
                this.f164887a.f164876c.f155767aA.remove(this.f164887a.f164876c.f155767aA.size() - 1);
            }
            ShortVideoContext shortVideoContext = this.f164887a.f164876c;
            if (shortVideoContext.f155812av.size() > 0) {
                shortVideoContext.f155812av.remove(shortVideoContext.f155812av.size() - 1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$j */
    static final class C73388j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73378e f164895a;

        static {
            Covode.recordClassIndex(86125);
        }

        C73388j(C73378e eVar) {
            this.f164895a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C73378e eVar = this.f164895a;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                eVar.mo116020a().mo22779a(new C14171ac(false, false, 6));
            } else {
                eVar.mo116020a().mo22779a(new C14171ac(true, false, 6));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$h */
    static final class C73386h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73378e f164893a;

        static {
            Covode.recordClassIndex(86123);
        }

        C73386h(C73378e eVar) {
            this.f164893a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                return;
            }
            if (bool.booleanValue()) {
                C75714s.m132844a(this.f164893a.mo116023c().mo23167t().mo119291c().mo119461g(), C75738i.f170154a);
                return;
            }
            AbstractC75711q g = this.f164893a.mo116023c().mo23167t().mo119291c().mo119461g();
            C75738i iVar = C75738i.f170154a;
            C89219l.m154721d(g, "");
            C89219l.m154721d(iVar, "");
            AbstractC75711q.AbstractC75712a a = g.mo119441a();
            a.mo119446b(iVar);
            a.mo119443a();
        }
    }

    public C73378e(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f164885l = fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$i */
    static final class C73387i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73378e f164894a;

        static {
            Covode.recordClassIndex(86124);
        }

        C73387i(C73378e eVar) {
            this.f164894a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC75620c cVar = (AbstractC75620c) obj;
            if (cVar != null) {
                C73378e eVar = this.f164894a;
                if (cVar instanceof C75618a) {
                    Effect effect = ((C75618a) cVar).f170022a;
                    eVar.mo116021a(effect);
                    if (C75466g.m132359k(effect)) {
                        if (C34805b.m71107a() && !C34809f.m71120a()) {
                            eVar.mo116024d().mo22651a(eVar.f164876c.f155817b.f155637B);
                        }
                        if (eVar.mo116025e().mo115026g() != 0) {
                            AbstractC14177d a = eVar.mo116020a();
                            C78599g b = C78599g.m137208b();
                            C89219l.m154716b(b, "");
                            int unused = a.mo22773a(b, new PrivacyCert(new C13349j("1047"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}), (String) null);
                        }
                    } else if (!effect.getTypes().contains("FaceReplace3D")) {
                        eVar.mo116026f();
                    } else if (effect.getTags() != null) {
                        AbstractC14210a b2 = eVar.mo116022b();
                        List<String> tags = effect.getTags();
                        if (tags == null) {
                            tags = new ArrayList<>();
                        }
                        b2.setFilterDisable(!tags.contains("disable_beautify_filter"), "build_in");
                    }
                } else if (cVar instanceof C75621d) {
                    eVar.mo116021a(null);
                    eVar.mo116026f();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116021a(Effect effect) {
        if (C75466g.m132347a("camera_front", effect)) {
            if (mo116025e().mo115026g() != 1) {
                AbstractC14177d a = mo116020a();
                C78599g a2 = C78599g.m137207a();
                C89219l.m154716b(a2, "");
                int unused = a.mo22773a(a2, new PrivacyCert(new C13349j("1045"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}), (String) null);
            }
        } else if (C75466g.m132347a("camera_back", effect) && mo116025e().mo115026g() != 0) {
            AbstractC14177d a3 = mo116020a();
            C78599g b = C78599g.m137208b();
            C89219l.m154716b(b, "");
            int unused2 = a3.mo22773a(b, new PrivacyCert(new C13349j("1046"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}), (String) null);
        }
        mo116020a().mo22809b(C75466g.m132358j(effect));
        if (effect == null || !effect.getTypes().contains("StabilizationOff")) {
            if (!mo116025e().f163083e.f74706a) {
                C31163b bVar = mo116025e().f163083e;
                bVar.f74706a = true;
                if (C31163b.f74704b != C31163b.f74705c) {
                    bVar.mo56706a(C31163b.f74705c);
                }
                mo116020a().mo22777a(0);
            }
        } else if (mo116025e().f163083e.f74706a) {
            C31163b bVar2 = mo116025e().f163083e;
            bVar2.f74706a = false;
            if (C31163b.f74704b) {
                bVar2.mo56706a(false);
            }
            mo116020a().mo22777a(0);
        }
    }
}
