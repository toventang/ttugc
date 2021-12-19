package com.p2082ss.android.ugc.aweme.servicimpl;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.ApiCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.C21582f;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.beauty.C34806c;
import com.p2082ss.android.ugc.aweme.beauty.C34807d;
import com.p2082ss.android.ugc.aweme.beauty.C34810g;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50798l;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.p2730de.C40973h;
import com.p2082ss.android.ugc.aweme.photo.PhotoModule;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65344an;
import com.p2082ss.android.ugc.aweme.record.AbstractC66812f;
import com.p2082ss.android.ugc.aweme.servicimpl.AbstractC67954z;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74322m;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.DialogC74290k;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75626f;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.story.record.p4064d.C77497a;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77610d;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83409d;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.y */
public final class C67943y implements AbstractC20382b, AbstractC83405a {

    /* renamed from: a */
    public ShortVideoContextViewModel f152205a;

    /* renamed from: b */
    public AbstractC14177d f152206b;

    /* renamed from: c */
    public C82004a f152207c;

    /* renamed from: d */
    public final AbstractC83492a f152208d;

    /* renamed from: e */
    public final AbstractC84089j f152209e;

    /* renamed from: f */
    DialogC74290k f152210f;

    /* renamed from: g */
    final String f152211g;

    /* renamed from: h */
    public final boolean f152212h;

    /* renamed from: i */
    private final AbstractC89244h f152213i = C89250i.m154773a((AbstractC89171a) new C67949f(this));

    /* renamed from: j */
    private final AbstractC84917a f152214j = new C67947d(this);

    /* renamed from: k */
    private final AbstractC89244h f152215k = C89250i.m154773a((AbstractC89171a) new C67952g(this));

    /* renamed from: l */
    private final AbstractC89244h f152216l = C89250i.m154773a((AbstractC89171a) new C67953h(this));

    /* renamed from: m */
    private final String f152217m;

    /* renamed from: n */
    private final String f152218n;

    /* renamed from: o */
    private final boolean f152219o;

    /* renamed from: p */
    private final C21582f f152220p;

    static {
        Covode.recordClassIndex(80112);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$g */
    static final class C67952g extends AbstractC89220m implements AbstractC89171a<C67944a> {

        /* renamed from: a */
        final /* synthetic */ C67943y f152232a;

        static {
            Covode.recordClassIndex(80121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67952g(C67943y yVar) {
            super(0);
            this.f152232a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67944a invoke() {
            return new C67944a();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$h */
    static final class C67953h extends AbstractC89220m implements AbstractC89171a<MediaPlayer> {

        /* renamed from: a */
        final /* synthetic */ C67943y f152233a;

        static {
            Covode.recordClassIndex(80122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67953h(C67943y yVar) {
            super(0);
            this.f152233a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MediaPlayer invoke() {
            return C77610d.m135602a(C67943y.m120241a(this.f152233a).mo127169a());
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final AbstractC83467k provideScene() {
        return (C67944a) this.f152215k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$a */
    public final class C67944a extends AbstractC83467k {
        static {
            Covode.recordClassIndex(80113);
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
        /* renamed from: a */
        public final String mo108523a() {
            return "PhotoScene";
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
        /* renamed from: b */
        public final void mo108524b() {
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
        /* renamed from: d */
        public final void mo108525d() {
        }

        @Override // com.bytedance.scene.AbstractC22219j
        /* renamed from: o */
        public final void mo36481o() {
            super.mo36481o();
            C67943y.m120241a(C67943y.this).mo127181b().f155753N = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C67944a() {
        }

        @Override // com.bytedance.scene.AbstractC22219j
        /* renamed from: a */
        public final void mo22704a(Bundle bundle) {
            super.mo22704a(bundle);
        }

        @Override // com.bytedance.scene.AbstractC22219j
        /* renamed from: a */
        public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            MethodCollector.m26663i(4741);
            C89219l.m154721d(layoutInflater, "");
            C89219l.m154721d(viewGroup, "");
            View view = new View(mo36485s());
            MethodCollector.m26664o(4741);
            return view;
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        C82004a aVar = this.f152207c;
        if (aVar == null) {
            C89219l.m154710a("tabEnv");
        }
        AbstractC1196i lifecycle = aVar.mo127169a().getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$f */
    static final class C67949f extends AbstractC89220m implements AbstractC89171a<PhotoModule> {

        /* renamed from: a */
        final /* synthetic */ C67943y f152229a;

        static {
            Covode.recordClassIndex(80118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67949f(C67943y yVar) {
            super(0);
            this.f152229a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PhotoModule invoke() {
            AbstractC66812f photoModule = C63244g.m114602a().mo73284l().getPhotoModule(C67943y.m120241a(this.f152229a).mo127169a(), C67943y.m120242b(this.f152229a).mo22747A().getMediaController(), new AbstractC66812f.AbstractC66813a(this) {
                /* class com.p2082ss.android.ugc.aweme.servicimpl.C67943y.C67949f.C679501 */

                /* renamed from: a */
                final /* synthetic */ C67949f f152230a;

                static {
                    Covode.recordClassIndex(80119);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f152230a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$f$1$a */
                static final class C67951a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C679501 f152231a;

                    static {
                        Covode.recordClassIndex(80120);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C67951a(C679501 r2) {
                        super(1);
                        this.f152231a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Boolean bool) {
                        DialogC74290k kVar;
                        C67943y yVar = this.f152231a.f152230a.f152229a;
                        DialogC74290k kVar2 = yVar.f152210f;
                        if (!(kVar2 == null || !kVar2.isShowing() || (kVar = yVar.f152210f) == null)) {
                            kVar.dismiss();
                        }
                        C67943y.m120243c(this.f152231a.f152230a.f152229a).mo110050b(false);
                        if (!C89219l.m154714a((Object) bool, (Object) true)) {
                            AbstractC14193m e = C67943y.m120241a(this.f152231a.f152230a.f152229a).mo127184e();
                            C14207x xVar = new C14207x("on photo token");
                            xVar.f34485a = 3;
                            C89219l.m154716b(xVar, "");
                            e.mo22879a(xVar);
                        }
                        return C89391z.f203057a;
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66812f.AbstractC66813a
                /* renamed from: a */
                public final void mo105765a(String str, List<String> list) {
                    String str2;
                    String str3;
                    Integer num;
                    Long l;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    String str8;
                    AbstractC84089j jVar;
                    FaceStickerBean i;
                    FaceStickerBean i2;
                    String str9;
                    FaceStickerBean i3;
                    FaceStickerBean i4;
                    C89219l.m154721d(str, "");
                    C67943y yVar = this.f152230a.f152229a;
                    C82004a aVar = yVar.f152207c;
                    if (aVar == null) {
                        C89219l.m154710a("tabEnv");
                    }
                    ShortVideoContext b = aVar.mo127181b();
                    C82004a aVar2 = yVar.f152207c;
                    if (aVar2 == null) {
                        C89219l.m154710a("tabEnv");
                    }
                    AbstractC14210a aVar3 = aVar2.f183539i;
                    if (aVar3 == null) {
                        C89219l.m154710a("filterModule");
                    }
                    C82004a aVar4 = yVar.f152207c;
                    if (aVar4 == null) {
                        C89219l.m154710a("tabEnv");
                    }
                    AbstractC89244h<AbstractC84089j> f = aVar4.mo127185f();
                    C82004a aVar5 = yVar.f152207c;
                    if (aVar5 == null) {
                        C89219l.m154710a("tabEnv");
                    }
                    AbstractC14099a g = aVar5.mo127186g();
                    C84425b a = new C84425b().mo129406a("creation_id", b.f155830o).mo129406a("shoot_way", b.f155831p);
                    AbstractC14177d dVar = yVar.f152206b;
                    if (dVar == null) {
                        C89219l.m154710a("cameraApiComponent");
                    }
                    if (dVar.mo22757K() == 1) {
                        str2 = "front";
                    } else {
                        str2 = "back";
                    }
                    C84425b a2 = a.mo129406a("camera", str2);
                    T value = aVar3.getCurSelectedFilter().f7727a.getValue();
                    FaceStickerBean faceStickerBean = null;
                    if (value != null) {
                        str3 = value.getEnName();
                    } else {
                        str3 = null;
                    }
                    C84425b a3 = a2.mo129406a("filter_name", str3);
                    T value2 = aVar3.getCurSelectedFilter().f7727a.getValue();
                    if (value2 != null) {
                        num = Integer.valueOf(value2.getId());
                    } else {
                        num = null;
                    }
                    C84425b a4 = a3.mo129405a("filter_id", num).mo129406a("record_mode", UGCMonitor.TYPE_PHOTO);
                    AbstractC84089j value3 = f.getValue();
                    if (value3 == null || (i4 = value3.mo23127i()) == null) {
                        l = "";
                    } else {
                        l = Long.valueOf(i4.getStickerId());
                    }
                    C84425b a5 = a4.mo129406a("prop_id", l.toString());
                    AbstractC84089j value4 = f.getValue();
                    if (value4 == null || (i3 = value4.mo23127i()) == null || (str4 = i3.getGradeKey()) == null) {
                        str4 = "";
                    }
                    C84425b a6 = a5.mo129406a("prop_index", str4).mo129403a("smooth", g.mo22686k()).mo129403a("eyes", g.mo22687l()).mo129403a("shape", g.mo22688m()).mo129403a("tanning", g.mo22689n());
                    CommentVideoModel commentVideoModel = b.f155825j;
                    if (commentVideoModel == null || (str5 = commentVideoModel.getEnterMethod()) == null) {
                        str5 = "";
                    }
                    C84425b a7 = a6.mo129406a("enter_method", str5).mo129406a("from_group_id", C70747dv.m124972a());
                    if (b.f155740A != 0) {
                        a7.mo129403a("draft_id", b.f155740A);
                    }
                    String str10 = b.f155741B;
                    C89219l.m154716b(str10, "");
                    if (str10.length() > 0) {
                        a7.mo129406a("new_draft_id", b.f155741B);
                    }
                    C82004a aVar6 = yVar.f152207c;
                    if (aVar6 == null) {
                        C89219l.m154710a("tabEnv");
                    }
                    String str11 = aVar6.f183541k;
                    if (str11 == null) {
                        C89219l.m154710a("filterIntensityStoreTAG");
                    }
                    C50798l a8 = C50798l.C50799a.m95127a(str11);
                    T value5 = aVar3.getCurSelectedFilter().f7727a.getValue();
                    String str12 = "1";
                    if (value5 != null) {
                        C67948e eVar = new C67948e(yVar, a8, a7);
                        float a9 = C50648c.m94909a(value5, a8, eVar);
                        a7.mo129403a("filter_value", a8.mo86059a(value5, eVar));
                        if (((double) Math.abs(C50648c.m94906a(value5) - a9)) < 0.01d || C50648c.m94906a(value5) == -1.0f) {
                            str9 = str12;
                        } else {
                            str9 = "0";
                        }
                        a7.mo129406a("is_original_filter", str9);
                    }
                    if (TextUtils.equals(b.f155837v, "super_entrance")) {
                        a7.mo129403a("is_special_icon", 1);
                    }
                    String str13 = b.f155761V;
                    if (str13 == null) {
                        str13 = "";
                    }
                    a7.mo129406a("from_prop_id", str13);
                    String str14 = b.f155761V;
                    AbstractC84089j value6 = f.getValue();
                    if (value6 == null || (i2 = value6.mo23127i()) == null) {
                        str6 = null;
                    } else {
                        str6 = i2.getId();
                    }
                    if (C89219l.m154714a((Object) str14, (Object) str6)) {
                        str7 = str12;
                    } else {
                        str7 = "0";
                    }
                    a7.mo129406a("is_default_prop", str7);
                    AbstractC84089j value7 = f.getValue();
                    if (value7 == null || (i = value7.mo23127i()) == null || !i.isBusi()) {
                        str12 = "0";
                    }
                    a7.mo129406a("is_commercial_prop", str12);
                    a7.mo129406a("is_westwindow_exist", b.f155782aP);
                    a7.mo129406a("shoot_page", "video_shoot_page");
                    if (C89219l.m154714a((Object) "quick_photo", (Object) yVar.f152211g)) {
                        str8 = "fast_shoot";
                    } else {
                        str8 = null;
                    }
                    a7.mo129406a("shoot_tab_name", str8);
                    C39162r.m79460a("record_video", a7.f188764a);
                    C82004a aVar7 = yVar.f152207c;
                    if (aVar7 == null) {
                        C89219l.m154710a("tabEnv");
                    }
                    ComposerBeautyBuriedInfo composerBeautyBuriedInfo = (ComposerBeautyBuriedInfo) C40973h.m82495a(C40973h.m82494a().mo46674b(aVar7.mo127186g().mo22659i().mo121632p()), ComposerBeautyBuriedInfo.class);
                    C89219l.m154716b(composerBeautyBuriedInfo, "");
                    C82004a aVar8 = yVar.f152207c;
                    if (aVar8 == null) {
                        C89219l.m154710a("tabEnv");
                    }
                    C34810g gVar = (C34810g) C40973h.m82495a(C40973h.m82494a().mo46674b(aVar8.mo127186g().mo22659i().mo121631o()), C34810g.class);
                    C89219l.m154716b(gVar, "");
                    C34806c.m71114b(composerBeautyBuriedInfo, gVar);
                    if (b.f155790aX == null) {
                        C82004a aVar9 = yVar.f152207c;
                        if (aVar9 == null) {
                            C89219l.m154710a("tabEnv");
                        }
                        b.f155790aX = C34807d.m71116a(aVar9.mo127186g().mo22659i().mo121635s());
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    C67943y yVar2 = this.f152230a.f152229a;
                    if (!(!C65344an.m117030a() || (jVar = yVar2.f152209e) == null || jVar.mo128901I() == null)) {
                        AbstractC14177d dVar2 = yVar2.f152206b;
                        if (dVar2 == null) {
                            C89219l.m154710a("cameraApiComponent");
                        }
                        AbstractC78554o E = dVar2.mo22751E();
                        AbstractC84089j jVar2 = yVar2.f152209e;
                        if (jVar2 == null) {
                            C89219l.m154715b();
                        }
                        C77497a.m135512a(E, arrayList, jVar2);
                    }
                    ActivityC0945e a10 = C67943y.m120241a(this.f152230a.f152229a).mo127169a();
                    ShortVideoContext b2 = C67943y.m120241a(this.f152230a.f152229a).mo127181b();
                    AbstractC84089j value8 = C67943y.m120241a(this.f152230a.f152229a).mo127185f().getValue();
                    if (value8 != null) {
                        faceStickerBean = value8.mo23127i();
                    }
                    C67885aa.m120150a(new AbstractC67954z.C67955a(a10, str, arrayList, b2, faceStickerBean, C67943y.m120241a(this.f152230a.f152229a).mo127183d().mo22751E().mo122474e(), new C67951a(this)));
                }
            });
            Objects.requireNonNull(photoModule, "null cannot be cast to non-null type com.ss.android.ugc.aweme.photo.PhotoModule");
            return photoModule;
        }
    }

    /* renamed from: a */
    public final void mo108522a() {
        boolean z = false;
        if (this.f152210f == null) {
            C82004a aVar = this.f152207c;
            if (aVar == null) {
                C89219l.m154710a("tabEnv");
            }
            DialogC74290k kVar = new DialogC74290k(aVar.mo127169a());
            kVar.setCancelable(false);
            this.f152210f = kVar;
        }
        DialogC74290k kVar2 = this.f152210f;
        if (kVar2 != null) {
            kVar2.show();
        }
        MediaPlayer mediaPlayer = (MediaPlayer) this.f152216l.getValue();
        if (mediaPlayer != null) {
            C82004a aVar2 = this.f152207c;
            if (aVar2 == null) {
                C89219l.m154710a("tabEnv");
            }
            C77610d.m135604a(mediaPlayer, aVar2.mo127169a());
        }
        C82004a aVar3 = this.f152207c;
        if (aVar3 == null) {
            C89219l.m154710a("tabEnv");
        }
        AbstractC84089j value = aVar3.mo127185f().getValue();
        if (!(value == null || C75346e.m132154a(value) == null)) {
            z = true;
        }
        PhotoModule photoModule = (PhotoModule) this.f152213i.getValue();
        C82004a aVar4 = this.f152207c;
        if (aVar4 == null) {
            C89219l.m154710a("tabEnv");
        }
        int i = aVar4.mo127181b().f155817b.f155647c;
        C82004a aVar5 = this.f152207c;
        if (aVar5 == null) {
            C89219l.m154710a("tabEnv");
        }
        photoModule.mo100817a(i, aVar5.mo127181b().f155817b.f155648d, z);
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$c */
    static final class C67946c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C67943y f152224a;

        static {
            Covode.recordClassIndex(80115);
        }

        C67946c(C67943y yVar) {
            this.f152224a = yVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f152224a.mo108522a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C82004a m120241a(C67943y yVar) {
        C82004a aVar = yVar.f152207c;
        if (aVar == null) {
            C89219l.m154710a("tabEnv");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC14177d m120242b(C67943y yVar) {
        AbstractC14177d dVar = yVar.f152206b;
        if (dVar == null) {
            C89219l.m154710a("cameraApiComponent");
        }
        return dVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ ShortVideoContextViewModel m120243c(C67943y yVar) {
        ShortVideoContextViewModel shortVideoContextViewModel = yVar.f152205a;
        if (shortVideoContextViewModel == null) {
            C89219l.m154710a("shortVideoContextViewModel");
        }
        return shortVideoContextViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$e */
    public static final class C67948e implements AbstractC50703k {

        /* renamed from: a */
        final /* synthetic */ C67943y f152226a;

        /* renamed from: b */
        final /* synthetic */ AbstractC50706n f152227b;

        /* renamed from: c */
        final /* synthetic */ C84425b f152228c;

        static {
            Covode.recordClassIndex(80117);
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k
        /* renamed from: a */
        public final float mo23007a(FilterBean filterBean) {
            C89219l.m154721d(filterBean, "");
            C74322m mVar = C67943y.m120241a(this.f152226a).f183540j;
            if (mVar == null) {
                C89219l.m154710a("videoRecorder");
            }
            return mVar.f167132a.mo56792b(filterBean.getFilterFolder());
        }

        C67948e(C67943y yVar, AbstractC50706n nVar, C84425b bVar) {
            this.f152226a = yVar;
            this.f152227b = nVar;
            this.f152228c = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final C83409d createBottomTabItem(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        return new C83409d(this.f152217m, this.f152218n, this.f152211g, this.f152219o, new C67945b(this, aVar));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final void initialize(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        this.f152207c = aVar;
        AbstractC1174ac a = C1181ae.m3881a(aVar.mo127169a(), (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        this.f152205a = (ShortVideoContextViewModel) a;
        this.f152206b = aVar.mo127183d();
        aVar.mo127184e().mo22914u().mo6997a(aVar.mo127169a(), new C67946c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$b */
    public static final class C67945b implements AbstractC83468l {

        /* renamed from: a */
        final /* synthetic */ C67943y f152222a;

        /* renamed from: b */
        final /* synthetic */ C82004a f152223b;

        static {
            Covode.recordClassIndex(80114);
        }

        C67945b(C67943y yVar, C82004a aVar) {
            this.f152222a = yVar;
            this.f152223b = aVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabUnselected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            C67943y.m120243c(this.f152222a).mo110048a(false);
            if (this.f152223b.mo127181b().f155752M) {
                return true;
            }
            this.f152223b.mo127181b().f155753N = false;
            return true;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabSelected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            AbstractC75655o t;
            Effect effect;
            AbstractC75655o t2;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            if (this.f152222a.f152212h) {
                AbstractC1196i lifecycle = this.f152223b.mo127169a().getLifecycle();
                C89219l.m154716b(lifecycle, "");
                if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
                    C67943y.m120242b(this.f152222a).mo22740a(false, PrivacyCert.Builder.Companion.with("bpea-287").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                }
            }
            this.f152223b.mo127181b().f155763X = 2;
            C71833a.m126852b(2);
            this.f152223b.mo127186g().mo22650a("record");
            ApiCenter a = ApiCenter.C2545a.m7450a(this.f152223b.mo127169a());
            ((AbstractC71864a) a.mo7013a(AbstractC71864a.class)).mo113512b(true);
            ((AbstractC83869f) a.mo7013a(AbstractC83869f.class)).mo128761b(false);
            C67943y.m120243c(this.f152222a).mo110048a(true);
            C67943y.m120242b(this.f152222a).mo22777a(0);
            ((AbstractC83746a) a.mo7013a(AbstractC83746a.class)).mo128712a(1, true);
            C63238c.f143576c.mo93768a(this.f152223b.mo127181b().f155831p, "photo_shoot");
            ((AbstractC83746a) a.mo7013a(AbstractC83746a.class)).mo128716b(false);
            if (!this.f152223b.mo127181b().f155752M) {
                this.f152223b.mo127181b().f155753N = false;
            }
            AbstractC83492a aVar2 = this.f152222a.f152208d;
            Effect effect2 = null;
            if (aVar2 != null) {
                AbstractC84089j jVar = this.f152222a.f152209e;
                if (jVar == null || (t2 = jVar.mo23167t()) == null) {
                    effect = null;
                } else {
                    effect = t2.mo119294f();
                }
                aVar2.mo128516c(effect);
            }
            AbstractC83492a aVar3 = this.f152222a.f152208d;
            if (aVar3 != null) {
                String e = this.f152223b.mo127181b().f155817b.mo109893e();
                AbstractC84089j jVar2 = this.f152222a.f152209e;
                if (!(jVar2 == null || (t = jVar2.mo23167t()) == null)) {
                    effect2 = t.mo119294f();
                }
                AbstractC83492a.C83493a.m143875a(aVar3, e, 0, null, effect2);
            }
            return true;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$d */
    static final class C67947d implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C67943y f152225a;

        static {
            Covode.recordClassIndex(80116);
        }

        C67947d(C67943y yVar) {
            this.f152225a = yVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            AbstractC84089j value;
            if ((i == 25 || i == 24) && C67943y.m120243c(this.f152225a).mo110049a() && (value = C67943y.m120241a(this.f152225a).mo127185f().getValue()) != null) {
                C89219l.m154721d(value, "");
                AbstractC75633m a = value.mo23154a(C75346e.C75348b.f169354a);
                if (!(a instanceof AbstractC75626f) || !((AbstractC75626f) a).mo119334b()) {
                    this.f152225a.mo108522a();
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    public C67943y(String str, String str2, String str3, boolean z, boolean z2, C21582f fVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(fVar, "");
        this.f152217m = str;
        this.f152218n = str2;
        this.f152211g = str3;
        this.f152219o = z;
        this.f152212h = z2;
        this.f152220p = fVar;
        this.f152208d = (AbstractC83492a) fVar.mo35252b(AbstractC83492a.class, null);
        this.f152209e = (AbstractC84089j) fVar.mo35252b(AbstractC84089j.class, null);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
