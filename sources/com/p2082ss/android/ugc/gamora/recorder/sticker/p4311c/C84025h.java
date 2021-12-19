package com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.p036g.AbstractC0688a;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14202u;
import com.bytedance.creativex.recorder.p940b.p941a.C14206w;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f;
import com.bytedance.creativex.recorder.sticker.p948b.C14339e;
import com.bytedance.creativex.recorder.sticker.types.p949ar.arcore.ARCoreStickerHandler;
import com.bytedance.creativex.recorder.sticker.types.p949ar.arcore.SharedARStickerHandler;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ttve.nativePort.TEEffectUtils;
import com.p2082ss.android.ugc.aweme.experiment.C46981gn;
import com.p2082ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.mediachoose.C59164c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2308aj.C33475b;
import com.p2082ss.android.ugc.aweme.p2477ci.C36081b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65344an;
import com.p2082ss.android.ugc.aweme.property.C65365be;
import com.p2082ss.android.ugc.aweme.property.C65369bi;
import com.p2082ss.android.ugc.aweme.sharedar.AbstractC69547b;
import com.p2082ss.android.ugc.aweme.sharedar.C69548c;
import com.p2082ss.android.ugc.aweme.sharedar.C69571i;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C70641dm;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70659a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterialKt;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73488bb;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73773g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72867e;
import com.p2082ss.android.ugc.aweme.sticker.effectconfig.AbstractC75328a;
import com.p2082ss.android.ugc.aweme.sticker.effectconfig.AbstractC75339c;
import com.p2082ss.android.ugc.aweme.sticker.effectconfig.C75329b;
import com.p2082ss.android.ugc.aweme.sticker.effectconfig.EffectConfigViewModel;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3947a.C75255b;
import com.p2082ss.android.ugc.aweme.sticker.p3947a.p3948a.C75251c;
import com.p2082ss.android.ugc.aweme.sticker.p3947a.p3949b.C75256a;
import com.p2082ss.android.ugc.aweme.sticker.p3947a.p3950c.C75261a;
import com.p2082ss.android.ugc.aweme.sticker.p3947a.p3951d.C75266a;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.C75281a;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.C75285b;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.C75293e;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.AbstractC75296b;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75342a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3960h.C75383a;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75403e;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75436n;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.p3966a.C75416a;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.p3966a.C75418c;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.p3966a.C75419d;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.p3981q.C75660a;
import com.p2082ss.android.ugc.aweme.sticker.p3981q.C75665b;
import com.p2082ss.android.ugc.aweme.sticker.p3981q.C75667c;
import com.p2082ss.android.ugc.aweme.sticker.p3981q.C75669e;
import com.p2082ss.android.ugc.aweme.sticker.p3981q.C75671f;
import com.p2082ss.android.ugc.aweme.sticker.p3981q.p3982a.C75663b;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75575k;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.View$OnClickListenerC75500b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75593g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75588b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75651k;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75658r;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.ARStickerHandler;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75640p;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75607a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75617c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75622d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75624e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75629i;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75630j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75631k;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.SavePhotoStickerHandler;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75714s;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75731b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75732c;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75733d;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75736g;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75737h;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75739j;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.C75741k;
import com.p2082ss.android.ugc.aweme.sticker.senor.presenter.LandmarkARPresenter;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.LockStickerHandler;
import com.p2082ss.android.ugc.aweme.sticker.types.multi.C76097c;
import com.p2082ss.android.ugc.aweme.sticker.types.multi.MultiStickerListViewModel;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75926c;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75938j;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75939k;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.AbstractC75997b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.C76002c;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76018b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4006b.C76033a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4007c.C76049b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4008d.C76054a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4009e.C76056b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4010f.C76058a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76196m;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76356i;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o;
import com.p2082ss.android.ugc.aweme.utils.C80249bj;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.sticker.C83948a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.C83962c;
import com.p2082ss.android.ugc.gamora.recorder.sticker.C84095d;
import com.p2082ss.android.ugc.gamora.recorder.sticker.C84096e;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a.C83985e;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.p4362a.C84921e;
import com.p2082ss.android.vesdk.AbstractC85313aj;
import com.p2082ss.android.vesdk.C85378ay;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h */
public final class C84025h extends AbstractC14343f<AbstractC84089j> implements AbstractC84089j {

    /* renamed from: A */
    static final /* synthetic */ AbstractC89286i[] f187578A = {new C89232y(C84025h.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C84025h.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new C89232y(C84025h.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0)};

    /* renamed from: B */
    public final ShortVideoContext f187579B;

    /* renamed from: C */
    public StickerVideoStatusHandler f187580C;

    /* renamed from: D */
    public C75630j f187581D;

    /* renamed from: E */
    public C83992b f187582E;

    /* renamed from: F */
    public int f187583F;

    /* renamed from: G */
    public List<String> f187584G;

    /* renamed from: H */
    public final C2563k<Boolean> f187585H = new C2563k<>();

    /* renamed from: I */
    public final C2563k<Boolean> f187586I = new C2563k<>();

    /* renamed from: J */
    public ArrayList<C75938j> f187587J = new ArrayList<>();

    /* renamed from: K */
    public GreenScreenMaterial f187588K = new GreenScreenMaterial(0, 0, 0, null, null, null, null, null, 255, null);

    /* renamed from: L */
    public boolean f187589L;

    /* renamed from: M */
    public final C1213t<Boolean> f187590M;

    /* renamed from: N */
    boolean f187591N;

    /* renamed from: O */
    private final AbstractC84919c f187592O = ((AbstractC84919c) getDiContainer().mo35252b(AbstractC84919c.class, null));

    /* renamed from: P */
    private AbstractC75593g f187593P;

    /* renamed from: Q */
    private final AbstractC89248d f187594Q = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: R */
    private final AbstractC89248d f187595R = C21572a.m40505b(getDiContainer(), AbstractC14210a.class);

    /* renamed from: S */
    private final AbstractC89248d f187596S = C21572a.m40504a(getDiContainer(), AbstractC14099a.class);

    /* renamed from: T */
    private final C75419d f187597T;

    /* renamed from: U */
    private final AbstractC89244h f187598U;

    /* renamed from: V */
    private final AbstractC85313aj f187599V;

    /* renamed from: W */
    private final C2563k<Effect> f187600W;

    /* renamed from: X */
    private final AbstractC89244h f187601X;

    /* renamed from: Y */
    private final AbstractC89244h f187602Y;

    /* renamed from: Z */
    private final AbstractC89244h f187603Z;

    /* renamed from: aa */
    private final AbstractC89244h f187604aa;

    /* renamed from: ab */
    private final AbstractC84014f f187605ab;

    /* renamed from: ac */
    private final AbstractC89244h f187606ac;

    /* renamed from: ad */
    private final AbstractC83989b f187607ad;

    static {
        Covode.recordClassIndex(97918);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: C */
    public final AbstractC84013e mo128895C() {
        return (AbstractC84013e) this.f187601X.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: D */
    public final AbstractC84011c mo128896D() {
        return (AbstractC84011c) this.f187602Y.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: E */
    public final AbstractC75934f mo128897E() {
        return (AbstractC75934f) this.f187603Z.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: F */
    public final AbstractC69547b mo128898F() {
        return (AbstractC69547b) this.f187604aa.getValue();
    }

    @Override // com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f, com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i
    /* renamed from: u */
    public final AbstractC75300d mo23168u() {
        return (AbstractC75300d) this.f187606ac.getValue();
    }

    /* renamed from: y */
    public final AbstractC14177d mo128910y() {
        return (AbstractC14177d) this.f187594Q.mo23374a(this, f187578A[0]);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$j */
    static final class C84066j extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f187650a;

        static {
            Covode.recordClassIndex(97959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84066j(FrameLayout frameLayout) {
            super(0);
            this.f187650a = frameLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ ViewGroup invoke() {
            return this.f187650a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ C2559g mo128893A() {
        return this.f187586I;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: B */
    public final /* bridge */ /* synthetic */ LiveData mo128894B() {
        return this.f187590M;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: I */
    public final List<String> mo128901I() {
        return this.f187584G;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC2547b getApiComponent() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ C2559g mo128911z() {
        return this.f187585H;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ag */
    public static final class C84034ag implements AbstractC75328a {

        /* renamed from: a */
        final /* synthetic */ C84025h f187616a;

        static {
            Covode.recordClassIndex(97927);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.effectconfig.AbstractC75328a
        /* renamed from: a */
        public final void mo118909a() {
            this.f187616a.mo128904L();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84034ag(C84025h hVar) {
            this.f187616a = hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$av */
    public static final class C84049av implements AbstractC75328a {

        /* renamed from: a */
        final /* synthetic */ C84025h f187632a;

        static {
            Covode.recordClassIndex(97942);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.effectconfig.AbstractC75328a
        /* renamed from: a */
        public final void mo118909a() {
            this.f187632a.mo128905M();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84049av(C84025h hVar) {
            this.f187632a = hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$f */
    public static final class C84062f implements UploadPicStickerARPresenter.AbstractC75978b {

        /* renamed from: a */
        final /* synthetic */ C84025h f187646a;

        static {
            Covode.recordClassIndex(97955);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.UploadPicStickerARPresenter.AbstractC75978b
        /* renamed from: a */
        public final void mo119674a() {
            this.f187646a.f187579B.f155816az = 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84062f(C84025h hVar) {
            this.f187646a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.UploadPicStickerARPresenter.AbstractC75978b
        /* renamed from: a */
        public final void mo119675a(boolean z) {
            int i;
            ShortVideoContext shortVideoContext = this.f187646a.f187579B;
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            shortVideoContext.f155816az = i;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$l */
    static final class C84068l extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C84068l f187652a = new C84068l();

        static {
            Covode.recordClassIndex(97961);
        }

        C84068l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$o */
    static final class C84071o extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C84071o f187655a = new C84071o();

        static {
            Covode.recordClassIndex(97964);
        }

        C84071o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$x */
    static final class C84080x<T> implements AbstractC27255q {

        /* renamed from: a */
        final /* synthetic */ C84025h f187664a;

        static {
            Covode.recordClassIndex(97973);
        }

        C84080x(C84025h hVar) {
            this.f187664a = hVar;
        }

        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* synthetic */ Object mo5560b() {
            return this.f187664a.mo128897E();
        }
    }

    /* renamed from: N */
    private final C84035ah m144540N() {
        return new C84035ah(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$k */
    static final class C84067k extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187651a;

        static {
            Covode.recordClassIndex(97960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84067k(C84025h hVar) {
            super(0);
            this.f187651a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C70636dh.m124833c(this.f187651a.f34724b));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$n */
    static final class C84070n extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187654a;

        static {
            Covode.recordClassIndex(97963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84070n(C84025h hVar) {
            super(0);
            this.f187654a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.f187654a.f187589L);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$q */
    static final class C84073q extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187657a;

        static {
            Covode.recordClassIndex(97966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84073q(C84025h hVar) {
            super(0);
            this.f187657a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f187657a.f34727e.mo56983h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$r */
    static final class C84074r extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187658a;

        static {
            Covode.recordClassIndex(97967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84074r(C84025h hVar) {
            super(0);
            this.f187658a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f187658a.mo23120b(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$t */
    static final /* synthetic */ class C84076t extends C89217j implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C84076t f187660a = new C84076t();

        static {
            Covode.recordClassIndex(97969);
        }

        C84076t() {
            super(0, C85378ay.class, "getEffectSDKVer", "getEffectSDKVer()Ljava/lang/String;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            MethodCollector.m26663i(8623);
            String effectVersion = TEEffectUtils.getEffectVersion();
            MethodCollector.m26664o(8623);
            return effectVersion;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$w */
    static final class C84079w extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187663a;

        static {
            Covode.recordClassIndex(97972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84079w(C84025h hVar) {
            super(0);
            this.f187663a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f187663a.mo23162c(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$y */
    static final class C84081y extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187665a;

        static {
            Covode.recordClassIndex(97974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84081y(C84025h hVar) {
            super(0);
            this.f187665a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C73773g.m129835a(this.f187665a.f34724b, C73773g.C73779f.f165644a, C73773g.C73780g.f165645a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: G */
    public final void mo128899G() {
        this.f187585H.mo6999a((Boolean) false);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: H */
    public final void mo128900H() {
        this.f187586I.mo6999a((Boolean) true);
    }

    @Override // com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f, com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        this.f34727e.getEffectController().mo56800b(this.f187599V);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ab */
    static final class C84029ab extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187610a;

        static {
            Covode.recordClassIndex(97922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84029ab(C84025h hVar) {
            super(0);
            this.f187610a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.f187610a.mo23165r().mo109891d().isEmpty());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ac */
    public static final class C84030ac implements AbstractC75403e {

        /* renamed from: a */
        final /* synthetic */ C84025h f187611a;

        static {
            Covode.recordClassIndex(97923);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75403e
        /* renamed from: a */
        public final void mo118948a() {
            this.f187611a.f34726d.mo22742b(false, new PrivacyCert(new C13349j("1034"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75403e
        /* renamed from: b */
        public final void mo118949b() {
            this.f187611a.f34726d.mo22740a(false, new PrivacyCert(new C13349j("1015"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84030ac(C84025h hVar) {
            this.f187611a = hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$af */
    static final class C84033af extends AbstractC89220m implements AbstractC89171a<C75939k> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187615a;

        static {
            Covode.recordClassIndex(97926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84033af(C84025h hVar) {
            super(0);
            this.f187615a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75939k invoke() {
            return new C75939k(this.f187615a.f34724b, this.f187615a.f34726d, this.f187615a.mo23164q(), this.f187615a.f34727e.getEffectController(), this.f187615a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$az */
    static final class C84053az extends AbstractC89220m implements AbstractC89171a<C69548c> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187636a;

        static {
            Covode.recordClassIndex(97946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84053az(C84025h hVar) {
            super(0);
            this.f187636a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C69548c invoke() {
            return new C69548c(this.f187636a.f34724b, this.f187636a.mo128910y(), this.f187636a.mo23164q());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ba */
    static final class C84055ba extends AbstractC89220m implements AbstractC89171a<AbstractC84011c> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187638a;

        static {
            Covode.recordClassIndex(97948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84055ba(C84025h hVar) {
            super(0);
            this.f187638a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84011c invoke() {
            AbstractC84012d dVar = (AbstractC84012d) this.f187638a.getDiContainer().mo35252b(AbstractC84012d.class, null);
            if (dVar == null) {
                dVar = new C83968a();
            }
            return dVar.mo128840a(this.f187638a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$bb */
    static final class C84056bb extends AbstractC89220m implements AbstractC89171a<AbstractC84013e> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187639a;

        static {
            Covode.recordClassIndex(97949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84056bb(C84025h hVar) {
            super(0);
            this.f187639a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84013e invoke() {
            Object b = this.f187639a.getDiContainer().mo35252b(AbstractC84013e.class, null);
            if (b == null) {
                return new C83985e(this.f187639a.f187579B, this.f187639a);
            }
            return b;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$bc */
    static final class C84057bc extends AbstractC89220m implements AbstractC89171a<C75281a> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187640a;

        static {
            Covode.recordClassIndex(97950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84057bc(C84025h hVar) {
            super(0);
            this.f187640a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75281a invoke() {
            return new C75281a(this.f187640a.mo23167t(), new C84096e(this.f187640a.f34724b));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$bd */
    static final class C84058bd extends AbstractC89220m implements AbstractC89171a<C76058a> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187641a;

        static {
            Covode.recordClassIndex(97951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84058bd(C84025h hVar) {
            super(0);
            this.f187641a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76058a invoke() {
            return new C76058a(new C75671f(this.f187641a.mo128910y().mo22747A().getAudioController()));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$s */
    static final class C84075s<T> implements AbstractC27255q {

        /* renamed from: a */
        final /* synthetic */ C84025h f187659a;

        static {
            Covode.recordClassIndex(97968);
        }

        C84075s(C84025h hVar) {
            this.f187659a = hVar;
        }

        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* synthetic */ Object mo5560b() {
            AbstractC75720y j = this.f187659a.mo23167t().mo119291c().mo119464j();
            C89219l.m154721d(j, "");
            List<String> value = j.mo119472d().getValue();
            if (value == null) {
                return C89086z.INSTANCE;
            }
            return value;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: K */
    public final void mo128903K() {
        this.f34726d.mo22818g().mo7036a(this.f34724b, new C84037aj(this));
    }

    @Override // com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f, com.bytedance.als.AbstractC2562j
    public final void onStop() {
        super.onStop();
        if (C65369bi.m117065a()) {
            mo23126h().mo119309a();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: J */
    public final void mo128902J() {
        AbstractC75593g gVar;
        StickerVideoStatusHandler stickerVideoStatusHandler = this.f187580C;
        if (stickerVideoStatusHandler != null && C75466g.m132356h(stickerVideoStatusHandler.f169973a) && (gVar = stickerVideoStatusHandler.f169977e) != null && !gVar.mo87555c()) {
            stickerVideoStatusHandler.f169975c = true;
        }
        C75630j jVar = this.f187581D;
        if (jVar != null) {
            jVar.mo119363b();
        }
    }

    /* renamed from: L */
    public final void mo128904L() {
        Effect value = mo23167t().mo119302n().mo119323b().getValue();
        if (value != null) {
            this.f34731i.f169900g.post(new RunnableC84048au(value, this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$au */
    public static final class RunnableC84048au implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Effect f187630a;

        /* renamed from: b */
        final /* synthetic */ C84025h f187631b;

        static {
            Covode.recordClassIndex(97941);
        }

        RunnableC84048au(Effect effect, C84025h hVar) {
            this.f187630a = effect;
            this.f187631b = hVar;
        }

        public final void run() {
            int i;
            if (C75344c.m132147a(this.f187631b.mo23167t(), this.f187630a)) {
                AbstractC75655o t = this.f187631b.mo23167t();
                C89219l.m154721d(t, "");
                C75651k value = t.mo119302n().mo119325c().getValue();
                if (value != null) {
                    i = value.f170064b;
                } else {
                    i = 0;
                }
            } else {
                i = -1;
            }
            AbstractC75300d u = this.f187631b.mo23168u();
            Effect effect = this.f187630a;
            C89219l.m154716b(effect, "");
            u.mo118613a(C75342a.m132143a(effect, i, EnumC75295a.RECOVER, null, null, null, null, 0, false, 252));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$g */
    public static final class C84063g implements AbstractC75997b {

        /* renamed from: a */
        final /* synthetic */ C84025h f187647a;

        static {
            Covode.recordClassIndex(97956);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.AbstractC75997b
        /* renamed from: a */
        public final Bundle mo119697a() {
            Bundle bundle = new Bundle();
            if (!C63253l.f143623a.mo73309e().mo93761c() || C63244g.m114602a().mo73255A().mo93901a() || !C75466g.m132347a("gs_enable_tt_effect_page_filter", this.f187647a.mo23166s()) || !(!C89219l.m154714a((Object) this.f187647a.f187579B.f155831p, (Object) "duet"))) {
                bundle.putInt("key_choose_scene", 3);
                bundle.putInt("key_support_flag", 1);
            } else {
                bundle.putInt("key_choose_scene", 12);
                bundle.putInt("key_support_flag", 17);
            }
            bundle.putParcelable("key_short_video_context", this.f187647a.f187579B);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putInt("upload_photo_min_height", 480);
            bundle.putInt("upload_photo_min_width", 360);
            return bundle;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84063g(C84025h hVar) {
            this.f187647a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.AbstractC75997b
        /* renamed from: a */
        public final List<C75938j> mo119698a(Intent intent) {
            C89219l.m154721d(intent, "");
            ArrayList<MediaModel> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) parcelableArrayListExtra, 10));
            for (MediaModel mediaModel : parcelableArrayListExtra) {
                C89219l.m154716b(mediaModel, "");
                String str = mediaModel.f134662b;
                C89219l.m154716b(str, "");
                long j = mediaModel.f134668h;
                int i = mediaModel.f134667g;
                int i2 = 1;
                if (i != 1) {
                    if (i != 2) {
                        i2 = 0;
                    } else {
                        i2 = 3;
                    }
                }
                String str2 = mediaModel.f134661a;
                C89219l.m154716b(str2, "");
                String str3 = mediaModel.f134676p;
                if (str3 == null) {
                    str3 = "GIPHY";
                }
                arrayList.add(new C75938j(str, j, i2, str2, str3, "media_gallery"));
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$i */
    static final class C84065i extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187649a;

        static {
            Covode.recordClassIndex(97958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84065i(C84025h hVar) {
            super(0);
            this.f187649a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            C84025h hVar = this.f187649a;
            Effect g = hVar.mo23167t().mo119295g();
            boolean z = true;
            if (!C63253l.f143623a.mo73309e().mo93761c() || C63244g.m114602a().mo73255A().mo93901a() || !C75466g.m132347a("gs_enable_tt_effect_page_filter", g) || !(!C89219l.m154714a((Object) hVar.f187579B.f155831p, (Object) "duet"))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        if (C65365be.m117061a()) {
            Context applicationContext = this.f34724b.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154716b(applicationContext, "");
            mo23167t().mo119291c().mo119463i().mo119431a(new C76356i(applicationContext));
        }
        this.f34727e.getEffectController().mo56781a(this.f187599V);
        mo23164q().mo22891c().mo7036a(this, new C84038ak(this));
        this.f34739q.mo6997a(this, new C84040am(this));
        mo23164q().mo22911r().mo6997a(this, new C84041an(this));
        mo23164q().mo22888b().mo6997a(this, new C84042ao(this));
        mo23164q().mo22902i().mo6997a(this, new C84043ap(this));
        mo23164q().mo22903j().mo6997a(this, new C84044aq(this));
        mo23164q().mo22905l().mo6997a(this, new C84045ar(this));
        AbstractC88412b a = mo23164q().mo22866B().mo143254a(new C84046as(this), C84909p.f189747a);
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f34730h);
        mo23164q().mo22900g().mo6997a(this, new C84047at(this));
        mo128910y().mo22816f().mo7036a(this, new C84039al(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (r3.mo128846b(r5.f187513l.f155757R) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r1 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00df, code lost:
        if (r1 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        r7 = com.p2082ss.android.ugc.aweme.port.p3561in.C63238c.f143581h.mo101543b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e7, code lost:
        if (r7 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        r4 = com.p2082ss.android.ugc.aweme.port.p3561in.C63238c.f143581h.mo101748b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        if (new java.io.File(r4).exists() == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        r1 = r7.getMusicId();
        p4600h.p4611f.p4613b.C89219l.m154716b(r1, "");
        r5.mo128870a(r1, new com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.C83996d(r5, r7, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010b, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        if (r8 != null) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0189  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo128905M() {
        /*
        // Method dump skipped, instructions count: 473
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84025h.mo128905M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a7, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r1, (java.lang.Object) r0) != false) goto L_0x00a9;
     */
    @Override // com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean mo23170w() {
        /*
        // Method dump skipped, instructions count: 502
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84025h.mo23170w():com.ss.android.ugc.aweme.sticker.model.FaceStickerBean");
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: a */
    public final void mo128906a(AbstractC75593g gVar) {
        this.f187593P = gVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$a */
    public static final class C84027a extends AbstractC75730a {

        /* renamed from: a */
        final /* synthetic */ C84025h f187608a;

        static {
            Covode.recordClassIndex(97920);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84027a(C84025h hVar) {
            this.f187608a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a
        /* renamed from: a */
        public final boolean mo109792a(String str, Effect effect) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(effect, "");
            if (TextUtils.isEmpty(this.f187608a.f187579B.f155757R) || !C89219l.m154714a((Object) this.f187608a.f187579B.f155757R, (Object) effect.getEffectId())) {
                return effect.isBusiness();
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ah */
    public static final class C84035ah implements AbstractC76018b {

        /* renamed from: a */
        final /* synthetic */ C84025h f187617a;

        static {
            Covode.recordClassIndex(97928);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84035ah(C84025h hVar) {
            this.f187617a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76018b
        /* renamed from: a */
        public final void mo119718a(String str) {
            C89219l.m154721d(str, "");
            this.f187617a.mo23162c(false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$al */
    static final class C84039al<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187621a;

        static {
            Covode.recordClassIndex(97932);
        }

        C84039al(C84025h hVar) {
            this.f187621a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C84090k.m144599a(this.f187621a, (PrivacyCert) null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$am */
    static final class C84040am<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187622a;

        static {
            Covode.recordClassIndex(97933);
        }

        C84040am(C84025h hVar) {
            this.f187622a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14339e.m26184b(this.f187622a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$z */
    static final class C84082z extends AbstractC89220m implements AbstractC89183m<List<? extends String>, AbstractC89172b<? super List<? extends AVChallenge>, ? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C84082z f187666a = new C84082z();

        static {
            Covode.recordClassIndex(97975);
        }

        C84082z() {
            super(2);
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$z$a */
        static final class C84083a<T> implements AbstractC0688a {

            /* renamed from: a */
            final /* synthetic */ AbstractC89172b f187667a;

            static {
                Covode.recordClassIndex(97976);
            }

            C84083a(AbstractC89172b bVar) {
                this.f187667a = bVar;
            }

            @Override // androidx.core.p036g.AbstractC0688a
            /* renamed from: a */
            public final /* synthetic */ void mo2720a(Object obj) {
                this.f187667a.invoke(C89070n.m154516a(obj));
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(List<? extends String> list, AbstractC89172b<? super List<? extends AVChallenge>, ? extends C89391z> bVar) {
            List<? extends String> list2 = list;
            AbstractC89172b<? super List<? extends AVChallenge>, ? extends C89391z> bVar2 = bVar;
            C89219l.m154721d(list2, "");
            C89219l.m154721d(bVar2, "");
            String str = (String) C89070n.m154583g((List) list2);
            if (str != null) {
                C63244g.m114602a().mo73296x().mo93808a(str, new C84083a(bVar2));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ad */
    static final class C84031ad extends AbstractC89220m implements AbstractC89172b<AbstractC75296b<?>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC75300d f187612a;

        static {
            Covode.recordClassIndex(97924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84031ad(AbstractC75300d dVar) {
            super(1);
            this.f187612a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC75296b<?> bVar) {
            AbstractC75296b<?> bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f187612a.mo118613a(bVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ao */
    static final class C84042ao<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187624a;

        static {
            Covode.recordClassIndex(97935);
        }

        C84042ao(C84025h hVar) {
            this.f187624a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187624a.mo128895C().mo128855a(this.f187624a.f187579B);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$at */
    static final class C84047at<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187629a;

        static {
            Covode.recordClassIndex(97940);
        }

        C84047at(C84025h hVar) {
            this.f187629a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C75630j jVar = this.f187629a.f187581D;
            if (jVar != null) {
                jVar.mo119363b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$m */
    static final class C84069m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187653a;

        static {
            Covode.recordClassIndex(97962);
        }

        C84069m(C84025h hVar) {
            this.f187653a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187653a.mo23167t().mo119284a(((StickerTagChangeData) obj).getTabKey());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$p */
    static final class C84072p extends AbstractC89220m implements AbstractC89172b<Effect, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187656a;

        static {
            Covode.recordClassIndex(97965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84072p(C84025h hVar) {
            super(1);
            this.f187656a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Effect effect) {
            C89219l.m154721d(effect, "");
            this.f187656a.f34743u.mo7000b(effect);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: f */
    public final void mo128909f(boolean z) {
        this.f187590M.setValue(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ae */
    static final class C84032ae extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187613a;

        /* renamed from: b */
        final /* synthetic */ String f187614b;

        static {
            Covode.recordClassIndex(97925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84032ae(C84025h hVar, String str) {
            super(1);
            this.f187613a = hVar;
            this.f187614b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            this.f187613a.f34727e.getEffectController().mo56757a(this.f187614b, str2);
            this.f187613a.f187583F = 1;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$an */
    static final class C84041an<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187623a;

        static {
            Covode.recordClassIndex(97934);
        }

        C84041an(C84025h hVar) {
            this.f187623a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187623a.mo128895C().mo128854a((int) ((Long) obj).longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ax */
    static final class C84051ax<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187634a;

        static {
            Covode.recordClassIndex(97944);
        }

        C84051ax(C84025h hVar) {
            this.f187634a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Double d = (Double) obj;
            if (this.f187634a.mo23165r().f155662r != null && d != null) {
                this.f187634a.mo128897E().mo119589a(d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ay */
    static final class C84052ay<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C84025h f187635a;

        static {
            Covode.recordClassIndex(97945);
        }

        C84052ay(C84025h hVar) {
            this.f187635a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<String> list = (List) obj;
            if (list != null && !list.isEmpty()) {
                this.f187635a.mo128895C().mo128856a(list);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$u */
    static final /* synthetic */ class C84077u extends C89217j implements AbstractC89172b<Effect, C89391z> {

        /* renamed from: a */
        public static final C84077u f187661a = new C84077u();

        static {
            Covode.recordClassIndex(97970);
        }

        C84077u() {
            super(1, C76054a.class, "openUrl", "openUrl(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Effect effect) {
            Effect effect2 = effect;
            if (effect2 != null && effect2.getEffectType() == 2) {
                C63244g.m114602a().mo73295w().mo93773b(effect2.getSchema());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$v */
    static final class C84078v extends AbstractC89220m implements AbstractC89172b<AbstractC75296b<?>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187662a;

        static {
            Covode.recordClassIndex(97971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84078v(C84025h hVar) {
            super(1);
            this.f187662a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC75296b<?> bVar) {
            AbstractC75296b<?> bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f187662a.mo23168u().mo118613a(bVar2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f
    /* renamed from: d */
    public final void mo23163d(boolean z) {
        if (z) {
            super.mo23163d(z);
        } else if (C75466g.m132356h(C75346e.m132154a(this))) {
            super.mo23163d(z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ak */
    static final class C84038ak<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187620a;

        static {
            Covode.recordClassIndex(97931);
        }

        C84038ak(C84025h hVar) {
            this.f187620a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            StickerVideoStatusHandler stickerVideoStatusHandler = this.f187620a.f187580C;
            if (stickerVideoStatusHandler != null) {
                C89219l.m154716b(bool, "");
                boolean booleanValue = bool.booleanValue();
                if (!C75466g.m132356h(stickerVideoStatusHandler.f169973a)) {
                    return;
                }
                if (booleanValue) {
                    stickerVideoStatusHandler.f169976d.mo119368b();
                    return;
                }
                stickerVideoStatusHandler.f169975c = false;
                if (stickerVideoStatusHandler.f169974b == 1) {
                    stickerVideoStatusHandler.f169976d.mo119365a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$aq */
    static final class C84044aq<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187626a;

        static {
            Covode.recordClassIndex(97937);
        }

        C84044aq(C84025h hVar) {
            this.f187626a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            List<String> list;
            AbstractC78554o E;
            if (C76002c.m133280a(C75346e.m132154a(this.f187626a)) && this.f187626a.f187583F > 0) {
                if (!(!C65344an.m117030a() || (list = this.f187626a.f187584G) == null || (E = this.f187626a.f34726d.mo22751E()) == null)) {
                    E.mo122470a(list, true);
                }
                this.f187626a.f187583F = 0;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ar */
    static final class C84045ar<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187627a;

        static {
            Covode.recordClassIndex(97938);
        }

        C84045ar(C84025h hVar) {
            this.f187627a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Bundle bundle;
            C14207x xVar = (C14207x) obj;
            if (C75466g.m132347a("gs_enable_tt_effect_page_filter", this.f187627a.mo23166s())) {
                GreenScreenMaterial copy$default = GreenScreenMaterial.copy$default(this.f187627a.f187588K, 0, 0, 0, null, null, null, null, null, 255, null);
                if (xVar != null) {
                    bundle = xVar.f34489e;
                } else {
                    bundle = null;
                }
                GreenScreenMaterialKt.asBundle(copy$default, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$b */
    static final class C84054b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C75622d f187637a;

        static {
            Covode.recordClassIndex(97947);
        }

        C84054b(C75622d dVar) {
            this.f187637a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (C89219l.m154714a(obj, (Object) false)) {
                for (AbstractC75517h hVar : this.f187637a.f170033a) {
                    if (hVar instanceof View$OnClickListenerC75500b) {
                        View$OnClickListenerC75500b bVar = (View$OnClickListenerC75500b) hVar;
                        if (bVar.f169663E) {
                            bVar.mo119173c();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$e */
    static final class C84061e extends AbstractC89220m implements AbstractC89172b<List<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187644a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78554o f187645b;

        static {
            Covode.recordClassIndex(97954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84061e(C84025h hVar, AbstractC78554o oVar) {
            super(1);
            this.f187644a = hVar;
            this.f187645b = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.ss.android.ugc.aweme.tools.extract.o */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            C89219l.m154721d(list2, "");
            if (!C65344an.m117030a()) {
                AbstractC78554o oVar = this.f187645b;
                if (oVar != 0) {
                    oVar.mo122470a((List<String>) list2, false);
                }
            } else {
                C84025h hVar = this.f187644a;
                int size = list2.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(list2.get(i));
                }
                hVar.f187584G = arrayList;
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j
    /* renamed from: e */
    public final void mo128908e(boolean z) {
        this.f187589L = z;
        if (C75466g.m132357i(C75346e.m132154a(this))) {
            C76058a aVar = (C76058a) this.f187598U.getValue();
            if (z) {
                if (!aVar.f170886a) {
                    aVar.f170887b.mo119370b(AbstractC75640p.AbstractC75641a.C75645d.f170060a);
                    aVar.f170886a = true;
                }
            } else if (aVar.f170886a) {
                aVar.f170887b.mo119369a(AbstractC75640p.AbstractC75641a.C75646e.f170061a);
                aVar.f170886a = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ai */
    static final class C84036ai implements AbstractC85313aj {

        /* renamed from: a */
        final /* synthetic */ C84025h f187618a;

        static {
            Covode.recordClassIndex(97929);
        }

        C84036ai(C84025h hVar) {
            this.f187618a = hVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85313aj
        /* renamed from: a */
        public final void mo128912a(boolean z) {
            boolean z2;
            if (z && !(this.f187618a.f34733k.f34710a instanceof LandmarkARPresenter)) {
                T value = this.f187618a.f34732j.f7727a.getValue();
                if (value != null) {
                    z2 = value.booleanValue();
                } else {
                    z2 = false;
                }
                this.f187618a.f34733k.mo23146a(new LandmarkARPresenter(this.f187618a.f34724b, this.f187618a.f34724b, z2, new C75663b(this.f187618a.f34727e.getEffectController(), this.f187618a.f34727e.getCameraController()), (byte) 0), true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$aj */
    static final class C84037aj<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187619a;

        static {
            Covode.recordClassIndex(97930);
        }

        C84037aj(C84025h hVar) {
            this.f187619a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C84025h hVar;
            Effect s;
            if (C89219l.m154714a(obj, (Object) true) && (s = (hVar = this.f187619a).mo23166s()) != null) {
                if (TextUtils.equals(s.getEffectId(), hVar.f187579B.f155757R)) {
                    boolean isEmpty = TextUtils.isEmpty(hVar.f187579B.f155769aC);
                    boolean isEmpty2 = TextUtils.isEmpty(hVar.f187579B.f155770aD);
                    if (!isEmpty || !isEmpty2) {
                        AbstractC1174ac a = C1181ae.m3881a(hVar.f34724b, (C1175ad.AbstractC1177b) null).mo3983a(EffectConfigViewModel.class);
                        C89219l.m154716b(a, "");
                        EffectConfigViewModel effectConfigViewModel = (EffectConfigViewModel) a;
                        C84034ag agVar = new C84034ag(hVar);
                        if (!isEmpty) {
                            if (!isEmpty2) {
                                effectConfigViewModel.mo118906a(agVar);
                                return;
                            } else {
                                effectConfigViewModel.mo118907b(agVar);
                                return;
                            }
                        } else if (!isEmpty2) {
                            effectConfigViewModel.mo118908c(agVar);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                hVar.mo128904L();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$aw */
    static final class C84050aw<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187633a;

        static {
            Covode.recordClassIndex(97943);
        }

        C84050aw(C84025h hVar) {
            this.f187633a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                C84025h hVar = this.f187633a;
                if (hVar.f187591N) {
                    hVar.f187591N = false;
                    boolean isEmpty = TextUtils.isEmpty(hVar.f187579B.f155769aC);
                    boolean isEmpty2 = TextUtils.isEmpty(hVar.f187579B.f155770aD);
                    if (!isEmpty || !isEmpty2) {
                        AbstractC1174ac a = C1181ae.m3881a(hVar.f34724b, (C1175ad.AbstractC1177b) null).mo3983a(EffectConfigViewModel.class);
                        C89219l.m154716b(a, "");
                        EffectConfigViewModel effectConfigViewModel = (EffectConfigViewModel) a;
                        C84049av avVar = new C84049av(hVar);
                        if (!isEmpty) {
                            if (!isEmpty2) {
                                effectConfigViewModel.mo118906a(avVar);
                            } else {
                                effectConfigViewModel.mo118907b(avVar);
                            }
                        } else if (!isEmpty2) {
                            effectConfigViewModel.mo118908c(avVar);
                        }
                    } else {
                        hVar.mo128905M();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo128907a(C75938j jVar) {
        String str;
        GreenScreenMaterial greenScreenMaterial = this.f187588K;
        greenScreenMaterial.setType(jVar.f170566d);
        Effect s = mo23166s();
        if (s == null || (str = s.getEffectId()) == null) {
            str = "";
        }
        greenScreenMaterial.setStickerId(str);
        greenScreenMaterial.setResId(jVar.f170567e);
        greenScreenMaterial.setAuthorName(jVar.f170568f);
        greenScreenMaterial.setLocalPath(jVar.f170564b.toString());
        greenScreenMaterial.setMediasource(jVar.f170569g);
        if (C75466g.m132347a("gs_enable_tt_effect_page_filter", mo23166s())) {
            this.f187579B.f155836u = this.f187588K;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$ap */
    static final class C84043ap<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84025h f187625a;

        static {
            Covode.recordClassIndex(97936);
        }

        C84043ap(C84025h hVar) {
            this.f187625a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            C14206w wVar = (C14206w) obj;
            if (C76002c.m133280a(C75346e.m132154a(this.f187625a))) {
                C89219l.m154716b(wVar, "");
                wVar.f34484c.putInt("upload_type_sticker_media_size", this.f187625a.f187583F);
            }
            FaceStickerBean i = this.f187625a.mo23127i();
            C75588b value = this.f187625a.mo23167t().mo119302n().mo119330g().getValue();
            C75658r value2 = this.f187625a.mo23167t().mo119302n().mo119329f().getValue();
            if (!(value == null || value.f169919d || value2 == null || !(!C89219l.m154714a(i, FaceStickerBean.NONE)) || i == null)) {
                Effect effect = value.f169916a;
                if (effect != null) {
                    str = effect.getId();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) i.getId())) {
                    C89219l.m154716b(wVar, "");
                    Bundle bundle = wVar.f34484c;
                    bundle.putInt("tabOrder", value2.f170073a);
                    bundle.putInt("imprPosition", value.f169918c);
                }
            }
            AbstractC84013e C = this.f187625a.mo128895C();
            Objects.requireNonNull(C, "null cannot be cast to non-null type com.ss.android.ugc.gamora.recorder.sticker.sticker_core.internal.RecordStickerInteractor");
            ((C83985e) C).f187482a = null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$as */
    static final class C84046as<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C84025h f187628a;

        static {
            Covode.recordClassIndex(97939);
        }

        C84046as(C84025h hVar) {
            this.f187628a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            TimeSpeedModelExtension timeSpeedModelExtension;
            if (obj instanceof AbstractC14202u.C14203a) {
                ShortVideoContext shortVideoContext = this.f187628a.f187579B;
                C70650dt d = shortVideoContext.f155817b.mo109891d();
                C89219l.m154716b(d, "");
                C75439a aVar = shortVideoContext.f155817b.f155662r;
                C89219l.m154721d(d, "");
                C1731i.m5640b(new C75926c.CallableC75927a(d, aVar), C1731i.f5562a);
                C72867e.m128688b(shortVideoContext.f155830o);
            } else if (obj instanceof AbstractC14202u.C14204b) {
                C70650dt d2 = this.f187628a.mo23165r().mo109891d();
                C75439a aVar2 = this.f187628a.mo23165r().f155662r;
                C89219l.m154716b(d2, "");
                C89219l.m154721d(d2, "");
                if (!d2.isEmpty()) {
                    Object obj2 = d2.get(d2.size() - 1);
                    C89219l.m154716b(obj2, "");
                    C75439a backgroundVideo = ((TimeSpeedModelExtension) obj2).getBackgroundVideo();
                    if (backgroundVideo != null) {
                        C89219l.m154716b(backgroundVideo, "");
                        if (!C89219l.m154714a(backgroundVideo, aVar2)) {
                            Iterator<T> it = C89070n.m154571d((Iterable) d2, d2.size() - 1).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    C75926c.m133132a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                                    break;
                                }
                                T next = it.next();
                                C89219l.m154716b(next, "");
                                if (C89219l.m154714a(next.getBackgroundVideo(), backgroundVideo)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (C13617h.m24466b(d2) && (timeSpeedModelExtension = (TimeSpeedModelExtension) d2.get(d2.size() - 1)) != null && timeSpeedModelExtension.getSavePhotoStickerInfo() != null) {
                    C72867e.m128690d(timeSpeedModelExtension.getSavePhotoStickerInfo().getCapturedPhotoDir());
                }
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f
    /* renamed from: a */
    public final void mo23160a(AbstractC75711q.AbstractC75712a aVar) {
        C89219l.m154721d(aVar, "");
        C63244g.m114602a().mo73255A().mo93906e();
        AbstractC75711q g = mo23167t().mo119291c().mo119461g();
        C75739j jVar = new C75739j();
        ShortVideoContext shortVideoContext = this.f187579B;
        if (shortVideoContext.f155817b.mo109889b() || shortVideoContext.mo110022c()) {
            C75714s.m132844a(g, jVar);
        }
        C75732c cVar = new C75732c();
        if (this.f187579B.mo110033i()) {
            C75714s.m132844a(g, cVar);
        }
        C75731b bVar = new C75731b();
        ShortVideoContext shortVideoContext2 = this.f187579B;
        if (shortVideoContext2.f155817b.mo109889b() || shortVideoContext2.f155817b.mo109890c() || shortVideoContext2.f155817b.f155653i || shortVideoContext2.mo110022c()) {
            C75714s.m132844a(g, bVar);
        }
        C75733d dVar = C75733d.f170152a;
        if (this.f187579B.f155817b.mo109889b()) {
            C75714s.m132844a(g, dVar);
        }
        C75736g gVar = new C75736g();
        if (this.f187579B.mo110022c()) {
            C75714s.m132844a(g, gVar);
        }
        C69571i iVar = new C69571i();
        ShortVideoContext shortVideoContext3 = this.f187579B;
        if (shortVideoContext3.f155817b.mo109889b() || shortVideoContext3.f155817b.mo109890c() || shortVideoContext3.mo110022c() || C70641dm.m124848c(shortVideoContext3)) {
            C75714s.m132844a(g, iVar);
        }
        C75741k kVar = C75741k.f170156a;
        ShortVideoContext shortVideoContext4 = this.f187579B;
        if (shortVideoContext4.f155817b.mo109890c() || C70659a.m124890a(shortVideoContext4) || shortVideoContext4.mo110022c()) {
            C75714s.m132844a(g, kVar);
        }
        C75714s.m132844a(g, C75383a.f169426a);
        C75737h hVar = C75737h.f170153a;
        ShortVideoContext shortVideoContext5 = this.f187579B;
        if (shortVideoContext5.f155817b.mo109889b() || shortVideoContext5.f155817b.mo109890c() || shortVideoContext5.mo110022c()) {
            C75714s.m132844a(g, hVar);
        }
        C84027a aVar2 = new C84027a(this);
        if (C89219l.m154714a((Object) "1", (Object) this.f187579B.f155813aw)) {
            C75714s.m132844a(g, aVar2);
        }
        C84095d dVar2 = C84095d.f187673a;
        if (C70641dm.m124848c(this.f187579B)) {
            C75714s.m132844a(g, dVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$h */
    static final class C84064h extends AbstractC89220m implements AbstractC89183m<Long, String, C89391z> {

        /* renamed from: a */
        public static final C84064h f187648a = new C84064h();

        static {
            Covode.recordClassIndex(97957);
        }

        C84064h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Long l, String str) {
            long longValue = l.longValue();
            C63244g.m114602a().mo73263I().mo101629a("upload_pic_sticker_loading_time", 0, new C69840ar().mo110188a("duration", Long.valueOf(longValue)).mo110189a("stickid", str).mo110191a());
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f
    /* renamed from: a */
    public final void mo23159a(AbstractC75655o oVar, AbstractC75300d dVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        super.mo23159a(oVar, dVar);
        dVar.mo118612a(new C75293e(oVar, this.f34725c));
        if (C63244g.m114602a().mo73291s().mo101749b()) {
            dVar.mo118612a(new C75285b(this.f34724b, this.f187579B, new C84031ad(dVar)));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$c */
    static final class C84059c extends AbstractC89220m implements AbstractC89183m<String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187642a;

        static {
            Covode.recordClassIndex(97952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84059c(C84025h hVar) {
            super(2);
            this.f187642a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C84025h hVar = this.f187642a;
            if (str4 != null) {
                if (str4.toString().equals("")) {
                    if (hVar.f187588K.getType() == 1) {
                        hVar.f34727e.getEffectController().mo56757a(str3, str4.toString());
                    }
                    hVar.mo128907a(new C75938j(str4, 0, 1, null, null, null, 56));
                } else {
                    if (hVar.f187588K.getType() == 3) {
                        hVar.f34727e.getEffectController().mo56772a(hVar.f34724b, (String) null, (String) null);
                    }
                    C36081b.m73539a(str4, C36081b.f85246a, new C84032ae(hVar, str3));
                    hVar.mo128907a(new C75938j(str4, 0, 1, null, null, null, 56));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$d */
    static final class C84060d extends AbstractC89220m implements AbstractC89183m<String, C75938j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187643a;

        static {
            Covode.recordClassIndex(97953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84060d(C84025h hVar) {
            super(2);
            this.f187643a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, C75938j jVar) {
            String str2 = str;
            C75938j jVar2 = jVar;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(jVar2, "");
            C84025h hVar = this.f187643a;
            if (jVar2.f170564b != null) {
                if (jVar2.f170564b.toString().equals("")) {
                    if (hVar.f187588K.getType() == 3) {
                        hVar.f34727e.getEffectController().mo56772a(hVar.f34724b, (String) null, (String) null);
                    }
                    hVar.mo128907a(new C75938j(jVar2.f170564b, 0, 1, null, null, null, 56));
                } else {
                    File file = new File(jVar2.f170564b.toString());
                    if (file.exists()) {
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.toURI().toURL().toString());
                        C89219l.m154716b(fileExtensionFromUrl, "");
                        Objects.requireNonNull(fileExtensionFromUrl, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = fileExtensionFromUrl.toLowerCase();
                        C89219l.m154716b(lowerCase, "");
                        if (!(!C89219l.m154714a((Object) lowerCase, (Object) "gif"))) {
                            if (hVar.f187588K.getType() == 1) {
                                hVar.f34727e.getEffectController().mo56773a(hVar.f34724b, (String) null, (String) null, (String) null);
                            }
                            hVar.f34727e.getEffectController().mo56772a(hVar.f34724b, str2, jVar2.f170564b.toString());
                            hVar.mo128907a(jVar2);
                            hVar.f187583F = 0;
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f, com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a
    /* renamed from: a */
    public final void mo23117a(C75972r.AbstractC75974b bVar, FrameLayout frameLayout) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(frameLayout, "");
        super.mo23117a(bVar, frameLayout);
        this.f34726d.mo22818g().mo7036a(this, new C84050aw(this));
        this.f34726d.mo22755I().mo7036a(this, new C84051ax(this));
        mo23167t().mo119291c().mo119464j().mo119472d().observe(this, new C84052ay(this));
    }

    @Override // com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f
    /* renamed from: a */
    public final void mo23155a(FrameLayout frameLayout, C75972r.AbstractC75974b bVar) {
        C84028aa aaVar;
        C84081y yVar;
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(bVar, "");
        super.mo23155a(frameLayout, bVar);
        AbstractC78554o E = this.f34726d.mo22751E();
        AbstractC75573i iVar = this.f34731i.f169899f;
        if (iVar != null) {
            C75574j m = iVar.mo119167m();
            C75575k kVar = m.f169851m.f169833g;
            AbstractC84089j jVar = (AbstractC84089j) getDiContainer().mo35248a(AbstractC84089j.class, (String) null);
            mo23157a(new C75624e(C84082z.f187666a));
            AbstractC84919c a = new C84921e().mo59545a(this.f34724b);
            if (a == null) {
                a = (AbstractC84919c) getDiContainer().mo35252b(AbstractC84919c.class, null);
            }
            C75622d a2 = this.f187607ad.mo122961a(this.f34724b, mo23167t(), mo23168u(), (AbstractC84398d) getDiContainer().mo35248a(AbstractC84398d.class, (String) null), (ShortVideoContext) getDiContainer().mo35248a(ShortVideoContext.class, (String) null), (AbstractC14330a) getDiContainer().mo35248a(AbstractC14330a.class, (String) null), a);
            mo23157a(a2);
            jVar.mo128911z().mo6997a(this, new C84054b(a2));
            iVar.mo119129a().observe(this, new C84069m(this));
            mo23157a(new SavePhotoStickerHandler(this.f34724b, new C76049b(this.f34727e.getEffectController(), this.f34726d, this.f187579B, new C84075s(this)), C80249bj.f179731a));
            mo23157a(new C76033a(C84076t.f187660a, this.f34724b, mo23167t(), this.f34727e.getEffectController(), kVar));
            mo23158a(new ARStickerHandler(this.f34724b, this.f34724b, this.f34732j, new C75660a(this.f34727e.getEffectController(), this.f34727e.getCameraController()), this.f34733k), true);
            mo23158a(new C75629i(this.f34724b, new C75667c(this.f34727e.getEffectController())), true);
            mo23158a(new C75631k(C84077u.f187661a), true);
            if (m.f169847i) {
                mo23158a(new LockStickerHandler(this.f34724b, mo23167t(), new C84078v(this), new C84079w(this)), true);
            }
            C84030ac acVar = new C84030ac(this);
            ActivityC0218d dVar = this.f34724b;
            ShortVideoContext shortVideoContext = this.f187579B;
            C84080x xVar = new C84080x(this);
            C84035ah N = m144540N();
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(shortVideoContext, "");
            C89219l.m154721d(xVar, "");
            C89219l.m154721d(N, "");
            String str = shortVideoContext.f155830o;
            C75416a aVar = new C75416a(shortVideoContext);
            C83962c.C83963a aVar2 = new C83962c.C83963a();
            C83962c.C83965b bVar2 = new C83962c.C83965b(shortVideoContext);
            C83962c.C83966c cVar = new C83962c.C83966c(shortVideoContext);
            C59164c cVar2 = new C59164c(dVar);
            C83962c.C83967d dVar2 = new C83962c.C83967d(dVar);
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(xVar, "");
            C89219l.m154721d(N, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(cVar2, "");
            C89219l.m154721d(dVar2, "");
            C89219l.m154721d(cVar2, "");
            mo23157a(new BackgroundVideoStickerPresenter(dVar, str, a, xVar, N, aVar, aVar2, bVar2, cVar, acVar, new C76056b.C76057a(cVar2), dVar2));
            if (C89219l.m154714a((Object) this.f187579B.f155831p, (Object) "direct_shoot")) {
                aaVar = new C84028aa(this);
            } else {
                aaVar = null;
            }
            if (C46981gn.m90261a()) {
                yVar = new C84081y(this);
            } else {
                yVar = null;
            }
            ActivityC0218d dVar3 = this.f34724b;
            C33475b bVar3 = new C33475b();
            C84035ah N2 = m144540N();
            C75418c cVar3 = new C75418c(this.f187579B);
            C84059c cVar4 = new C84059c(this);
            C84060d dVar4 = new C84060d(this);
            C84061e eVar = new C84061e(this, E);
            C84062f fVar = new C84062f(this);
            C84063g gVar = new C84063g(this);
            LiveData<List<String>> d = mo23167t().mo119291c().mo119464j().mo119472d();
            mo23157a(new UploadPicStickerARPresenter(dVar3, a, bVar3, N2, cVar3, gVar, fVar, eVar, C84064h.f187648a, aaVar, cVar4, dVar4, this.f187597T, d, mo23167t(), acVar, new C84065i(this), this.f187587J, yVar, 3072));
            mo23157a(new C75607a(this.f34724b, mo23167t(), new C75665b(this.f34727e.getEffectController()), new C84066j(frameLayout), bVar, C80249bj.f179731a, new C84067k(this)));
            mo23157a(new C75617c(this.f34724b, this.f34732j, C84068l.f187652a, this.f34734l, this.f34733k, (byte) 0));
            StickerVideoStatusHandler stickerVideoStatusHandler = new StickerVideoStatusHandler(this.f34724b, new C75669e(this.f34727e.getEffectController()), this.f187593P);
            this.f187580C = stickerVideoStatusHandler;
            mo23157a(stickerVideoStatusHandler);
            mo23157a(new VoiceRecognizeStickerHandler(this.f34724b, new C75671f(this.f34727e.getAudioController()), mo23164q().mo22891c(), this.f34724b, new C84070n(this)));
            mo23157a(new C75436n(this.f187579B));
            if (!C63244g.m114602a().mo73255A().mo93901a()) {
                IInternalCommerceService h = AVCommerceServiceImpl.m102988h();
                C89219l.m154716b(h, "");
                if (!h.mo93965b() && AVCommerceServiceImpl.m102988h().mo93968e()) {
                    mo23157a(new C83948a(this.f34724b, new C84029ab(this)));
                }
            }
            C75630j jVar2 = new C75630j(C84071o.f187655a, new C84072p(this), new C84073q(this), new C84074r(this));
            this.f187581D = jVar2;
            mo23158a((AbstractC75633m) jVar2, false);
            mo23157a(new ARCoreStickerHandler(this.f34724b, this.f34724b, mo128910y()));
            ActivityC0218d dVar5 = this.f34724b;
            AbstractC69547b F = mo128898F();
            AbstractC14177d y = mo128910y();
            AbstractC14193m q = mo23164q();
            AbstractC89248d dVar6 = this.f187595R;
            AbstractC89286i<?>[] iVarArr = f187578A;
            mo23157a(new SharedARStickerHandler(dVar5, F, y, q, (AbstractC14210a) dVar6.mo23374a(this, iVarArr[1]), (AbstractC14099a) this.f187596S.mo23374a(this, iVarArr[2])));
            ActivityC0218d dVar7 = this.f34724b;
            AbstractC75655o t = mo23167t();
            AbstractC75429h hVar = this.f34725c;
            AbstractC75300d u = mo23168u();
            AbstractC84398d dVar8 = (AbstractC84398d) getDiContainer().mo35248a(AbstractC84398d.class, (String) null);
            C89219l.m154721d(dVar7, "");
            C89219l.m154721d(t, "");
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(u, "");
            C89219l.m154721d(dVar8, "");
            C89219l.m154721d(kVar, "");
            C76196m mVar = new C76196m(dVar8);
            mo23157a(new C76097c(dVar7, t, hVar, mVar, kVar, new MultiStickerListViewModel(dVar7, t, u, mVar)));
            C75255b bVar4 = new C75255b();
            bVar4.mo118599a(new C75266a(mo128910y()));
            bVar4.mo118599a(new C75256a(mo128910y(), C2556g.m7467a(this)));
            bVar4.mo118599a(new C75261a(mo128910y(), C2556g.m7467a(this)));
            bVar4.mo118599a(new C75251c(mo128910y()));
            mo23157a(bVar4);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$aa */
    static final class C84028aa extends AbstractC89220m implements AbstractC89187q<Effect, Handler, DialogInterface.OnDismissListener, Dialog> {

        /* renamed from: a */
        final /* synthetic */ C84025h f187609a;

        static {
            Covode.recordClassIndex(97921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84028aa(C84025h hVar) {
            super(3);
            this.f187609a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ Dialog invoke(Effect effect, Handler handler, DialogInterface.OnDismissListener onDismissListener) {
            Effect effect2 = effect;
            Handler handler2 = handler;
            DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
            C89219l.m154721d(effect2, "");
            C89219l.m154721d(handler2, "");
            C89219l.m154721d(onDismissListener2, "");
            return C63244g.m114602a().mo73264J().mo101712a(effect2, onDismissListener2, handler2, this.f187609a.f34724b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84025h(C21582f fVar, AbstractC83989b bVar, AbstractC89172b<? super AbstractC14343f.C14344a, C89391z> bVar2) {
        super(fVar, bVar2);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f187607ad = bVar;
        ShortVideoContext shortVideoContext = (ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null);
        this.f187579B = shortVideoContext;
        this.f187597T = new C75419d(shortVideoContext);
        this.f187598U = C89250i.m154773a((AbstractC89171a) new C84058bd(this));
        this.f187599V = new C84036ai(this);
        this.f187600W = new C2563k<>();
        this.f187590M = new C1213t<>();
        C1175ad a = C1181ae.m3881a(this.f34724b, (C1175ad.AbstractC1177b) null);
        C89219l.m154716b(a, "");
        if (!TextUtils.isEmpty(shortVideoContext.f155769aC) || !TextUtils.isEmpty(shortVideoContext.f155770aD)) {
            mo23167t().mo119287a(false);
        }
        ActivityC0218d dVar = this.f34724b;
        C840261 r3 = new AbstractC75339c() {
            /* class com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84025h.C840261 */

            static {
                Covode.recordClassIndex(97919);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.effectconfig.AbstractC75339c
            /* renamed from: a */
            public final void mo118915a(String str, String str2) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
            }
        };
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(r3, "");
        C75329b bVar3 = new C75329b(dVar, shortVideoContext, r3, (EffectConfigViewModel) a.mo3983a(EffectConfigViewModel.class));
        bVar3.f169335c.f169330a.observe(bVar3.f169333a, new C75329b.C75330a(bVar3));
        bVar3.f169335c.f169331b.observe(bVar3.f169333a, new C75329b.C75333b(bVar3));
        bVar3.f169335c.f169332c.observe(bVar3.f169333a, new C75329b.C75336c(bVar3));
        this.f187601X = C89250i.m154774a(EnumC89331m.NONE, new C84056bb(this));
        this.f187602Y = C89250i.m154774a(EnumC89331m.NONE, new C84055ba(this));
        this.f187603Z = C89250i.m154774a(EnumC89331m.NONE, new C84033af(this));
        this.f187604aa = C89250i.m154774a(EnumC89331m.NONE, new C84053az(this));
        this.f187605ab = new C73488bb(this.f34724b, this, shortVideoContext, this);
        this.f187606ac = C89250i.m154774a(EnumC89331m.NONE, new C84057bc(this));
        this.f187591N = true;
    }
}
