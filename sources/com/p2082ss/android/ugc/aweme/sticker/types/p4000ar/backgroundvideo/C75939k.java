package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.bytedance.p1777x.p1780c.C23697c;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65369bi;
import com.p2082ss.android.ugc.aweme.services.IInternalAVService;
import com.p2082ss.android.ugc.aweme.services.ISDKService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69892bn;
import com.p2082ss.android.ugc.aweme.shortvideo.C69903by;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75928d;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75931e;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e.DialogC76024c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84090k;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k */
public final class C75939k implements AbstractC75934f {

    /* renamed from: a */
    public String f170570a;

    /* renamed from: b */
    public final ActivityC0218d f170571b;

    /* renamed from: c */
    private boolean f170572c;

    /* renamed from: d */
    private String f170573d = "";

    /* renamed from: e */
    private String f170574e = "";

    /* renamed from: f */
    private boolean f170575f;

    /* renamed from: g */
    private boolean f170576g;

    /* renamed from: h */
    private final AbstractC89244h f170577h = C89250i.m154773a((AbstractC89171a) new C75940a(this));

    /* renamed from: i */
    private final AbstractC89244h f170578i = C89250i.m154773a((AbstractC89171a) new C75941b(this));

    /* renamed from: j */
    private final AbstractC14177d f170579j;

    /* renamed from: k */
    private final AbstractC14193m f170580k;

    /* renamed from: l */
    private final AbstractC31193a f170581l;

    /* renamed from: m */
    private final AbstractC84089j f170582m;

    static {
        Covode.recordClassIndex(88880);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f
    /* renamed from: a */
    public final void mo119587a() {
        this.f170572c = true;
    }

    /* renamed from: f */
    public final DialogC76024c mo119606f() {
        return (DialogC76024c) this.f170577h.getValue();
    }

    /* renamed from: g */
    public final SafeHandler mo119607g() {
        return (SafeHandler) this.f170578i.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f
    /* renamed from: b */
    public final void mo119592b() {
        this.f170572c = this.f170575f;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k$a */
    static final class C75940a extends AbstractC89220m implements AbstractC89171a<DialogC76024c> {

        /* renamed from: a */
        final /* synthetic */ C75939k f170583a;

        static {
            Covode.recordClassIndex(88881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75940a(C75939k kVar) {
            super(0);
            this.f170583a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC76024c invoke() {
            return new DialogC76024c(this.f170583a.f170571b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k$b */
    static final class C75941b extends AbstractC89220m implements AbstractC89171a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C75939k f170584a;

        static {
            Covode.recordClassIndex(88882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75941b(C75939k kVar) {
            super(0);
            this.f170584a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.f170584a.f170571b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k$c */
    static final class C75942c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75939k f170585a;

        static {
            Covode.recordClassIndex(88883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75942c(C75939k kVar) {
            super(0);
            this.f170585a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f170585a.mo119606f().show();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k$e */
    static final class C75945e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75939k f170591a;

        static {
            Covode.recordClassIndex(88886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75945e(C75939k kVar) {
            super(0);
            this.f170591a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f170591a.mo119606f().show();
            return C89391z.f203057a;
        }
    }

    /* renamed from: i */
    private final double m133154i() {
        return (double) this.f170579j.mo22754H().value();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f
    /* renamed from: d */
    public final void mo119594d() {
        if (this.f170575f) {
            m133151a(this.f170571b, null, null, null);
            mo119592b();
        }
    }

    /* renamed from: h */
    private final ShortVideoContext m133153h() {
        AbstractC1174ac a = C1181ae.m3881a(this.f170571b, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
        C89219l.m154716b(shortVideoContext, "");
        return shortVideoContext;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f
    /* renamed from: e */
    public final void mo119595e() {
        if (this.f170575f) {
            m133151a(this.f170571b, this.f170570a, this.f170573d, this.f170574e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f
    /* renamed from: c */
    public final void mo119593c() {
        AbstractC1174ac a = C1181ae.m3881a(this.f170571b, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
        if (shortVideoContext != null && this.f170575f) {
            C70650dt<TimeSpeedModelExtension> dtVar = shortVideoContext.f155817b.f155650f;
            C89219l.m154716b(dtVar, "");
            C75439a aVar = shortVideoContext.f155817b.f155662r;
            C89219l.m154721d(dtVar, "");
            if (aVar != null) {
                boolean z = true;
                for (TimeSpeedModelExtension timeSpeedModelExtension : dtVar) {
                    C89219l.m154716b(timeSpeedModelExtension, "");
                    if (C89219l.m154714a(timeSpeedModelExtension.getBackgroundVideo(), aVar)) {
                        z = false;
                    }
                }
                if (z) {
                    C75926c.m133132a(aVar.getVideoPath(), aVar.getAudioPath());
                }
            }
            shortVideoContext.mo110010a((C75439a) null);
            this.f170573d = "";
            this.f170574e = "";
            m133151a(this.f170571b, null, null, null);
            C84911q.m145921a("BackgroundVideo remove BGV");
            this.f170575f = false;
            m133150a(0);
        }
    }

    /* renamed from: a */
    private final void m133150a(long j) {
        long j2;
        long j3;
        ShortVideoContext h = m133153h();
        if (h.f155817b.f155664t) {
            j2 = C75948l.f170597a;
        } else {
            j2 = 15000;
        }
        C69905c cVar = C70005cr.m123611a().f156482a;
        String str = h.f155817b.f155669y;
        if (cVar == null || TextUtils.isEmpty(str)) {
            j3 = h.f155817b.f155651g;
        } else {
            j2 = C89271h.m154770b(j2, C69903by.m123467a(cVar, str));
            j3 = h.f155817b.f155651g;
        }
        long j4 = j2 - j3;
        if (!this.f170576g && j > 0) {
            j4 = C89271h.m154770b(j4, j);
        }
        long resolveMaxDurationFor3MinWithMusic = C63244g.m114602a().mo73284l().getMaxDurationResolver().resolveMaxDurationFor3MinWithMusic(h, h.f155817b.f155651g + j4);
        h.mo110001a(resolveMaxDurationFor3MinWithMusic);
        this.f170580k.mo22875a(new C14190j(resolveMaxDurationFor3MinWithMusic));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f
    /* renamed from: a */
    public final void mo119589a(Double d) {
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (this.f170575f) {
                C84911q.m145921a("BackgroundVideo set speed：".concat(String.valueOf(doubleValue)));
                this.f170581l.mo56761a(d.doubleValue());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f
    /* renamed from: a */
    public final void mo119588a(Effect effect) {
        C89219l.m154721d(effect, "");
        if (this.f170572c) {
            mo119605b(this.f170573d, this.f170574e);
            this.f170572c = false;
            return;
        }
        boolean h = C75466g.m132356h(effect);
        this.f170576g = h;
        if (h) {
            C75931e eVar = new C75931e(this.f170571b, effect);
            C75942c cVar = new C75942c(this);
            C75943d dVar = new C75943d(this, effect);
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(dVar, "");
            cVar.invoke();
            if (!C84902i.m145892a(C70638dj.f158105h)) {
                C84902i.m145883a(C70638dj.f158105h, false);
            }
            String[] a = eVar.mo119586a();
            String str = a[0];
            String str2 = a[1];
            if (C84902i.m145892a(str2)) {
                eVar.f170555b = str;
                eVar.f170556c = str2;
            } else if (!TextUtils.isEmpty(str)) {
                String a2 = C69892bn.m123462a(str);
                eVar.f170555b = eVar.f170554a + File.separator + a2 + "_background_v";
                eVar.f170556c = eVar.f170554a + File.separator + a2 + "_background_a";
            }
            if (!C84902i.m145892a(eVar.f170554a) || !C84902i.m145892a(eVar.f170555b) || !C84902i.m145892a(eVar.f170556c) || VEUtils.getVideoFileInfo(eVar.f170555b) == null || VEUtils.getAudioFileInfo(eVar.f170556c) == null) {
                if (!C84902i.m145892a(eVar.f170554a)) {
                    C84902i.m145883a(eVar.f170554a, false);
                    if (!C84902i.m145892a(eVar.f170554a)) {
                        C84911q.m145926b("BackgroundVideo, splitDir create fail");
                        dVar.invoke(false, eVar.f170557d, eVar.f170558e);
                        return;
                    }
                }
                if (!C84902i.m145892a(str)) {
                    C84911q.m145926b("BackgroundVideo, default video not exist");
                    dVar.invoke(false, eVar.f170557d, eVar.f170558e);
                    return;
                }
                IInternalAVService a3 = AVServiceImpl.m113116a();
                C89219l.m154716b(a3, "");
                ISDKService sDKService = a3.getSDKService();
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                Context applicationContext = application.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                C89219l.m154716b(applicationContext, "");
                sDKService.split(applicationContext, 1000, eVar.f170554a, str, eVar.f170556c, eVar.f170555b, new C75931e.C75933b(eVar, dVar));
                return;
            }
            C84896h.m145865a(eVar.f170555b, eVar.f170557d);
            C84902i.m145893a(eVar.f170556c, eVar.f170558e);
            dVar.invoke(true, eVar.f170557d, eVar.f170558e);
            return;
        }
        C75928d dVar2 = new C75928d(this.f170571b, effect);
        C75945e eVar2 = new C75945e(this);
        C75946f fVar = new C75946f(this, effect);
        C89219l.m154721d(eVar2, "");
        C89219l.m154721d(fVar, "");
        eVar2.invoke();
        if (!C84902i.m145892a(C70638dj.f158105h)) {
            C84902i.m145883a(C70638dj.f158105h, false);
        }
        if (!C84902i.m145892a(dVar2.f170544a) || !C84902i.m145892a(dVar2.f170545b) || !C84902i.m145892a(dVar2.f170546c) || VEUtils.getVideoFileInfo(dVar2.f170545b) == null || VEUtils.getAudioFileInfo(dVar2.f170546c) == null) {
            if (!C84902i.m145892a(dVar2.f170544a)) {
                C84902i.m145883a(dVar2.f170544a, false);
                if (!C84902i.m145892a(dVar2.f170544a)) {
                    C84911q.m145926b("BackgroundVideo, splitDir create fail");
                    fVar.invoke(false, dVar2.f170547d, dVar2.f170548e);
                    return;
                }
            }
            String a4 = dVar2.mo119585a();
            if (!C84902i.m145892a(a4)) {
                C84911q.m145926b("BackgroundVideo, default video not exist");
                fVar.invoke(false, dVar2.f170547d, dVar2.f170548e);
                return;
            }
            IInternalAVService a5 = AVServiceImpl.m113116a();
            C89219l.m154716b(a5, "");
            ISDKService sDKService2 = a5.getSDKService();
            Application application2 = C63247i.f143610a;
            C89219l.m154716b(application2, "");
            Context applicationContext2 = application2.getApplicationContext();
            if (C58003a.f132201c && applicationContext2 == null) {
                applicationContext2 = C58003a.f132199a;
            }
            C89219l.m154716b(applicationContext2, "");
            sDKService2.split(applicationContext2, 1000, dVar2.f170544a, a4, dVar2.f170546c, dVar2.f170545b, new C75928d.C75930b(dVar2, fVar));
            return;
        }
        C84896h.m145865a(dVar2.f170545b, dVar2.f170547d);
        C84902i.m145893a(dVar2.f170546c, dVar2.f170548e);
        fVar.invoke(true, dVar2.f170547d, dVar2.f170548e);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f
    /* renamed from: a */
    public final void mo119591a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f170573d = str;
        this.f170574e = str2;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f
    /* renamed from: a */
    public final void mo119590a(String str, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        AVServiceImpl.m113116a().getVideoLegalCheckerAndToastService(this.f170571b).isVideoLengthOrTypeSupportedAndShowErrToast(str, true, 3600000, aVar);
    }

    /* renamed from: c */
    private static int m133152c(String str, String str2) {
        if (C23697c.m44781a(str) || C23697c.m44781a(str2)) {
            C84911q.m145926b("BackgroundVideo path invalid, videoPath: " + str + " audioPath: " + str2);
            return -1;
        }
        if (str == null) {
            C89219l.m154715b();
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo != null) {
            return videoFileInfo.duration;
        }
        C84911q.m145926b("BackgroundVideo getVideoInfo fail, videoPath: " + str + " audioPath: " + str2);
        return -1;
    }

    /* renamed from: b */
    public final void mo119605b(String str, String str2) {
        if (!this.f170580k.mo22891c().f7727a.getValue().booleanValue()) {
            C75346e.m132160b(this.f170582m);
            return;
        }
        AbstractC1174ac a = C1181ae.m3881a(this.f170571b, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
        if (shortVideoContext == null) {
            C84911q.m145921a("BackgroundVideo set BGV error, shortVideo context is null");
            return;
        }
        int c = m133152c(str, str2);
        if (c > 0) {
            this.f170573d = str;
            this.f170574e = str2;
            long j = (long) c;
            shortVideoContext.mo110010a(new C75439a(str, str2, j, this.f170576g, 0, null, 48, null));
            m133150a(j);
            C84911q.m145921a("BackgroundVideo set BGV, videoPath: " + str + " audioPath: " + str2);
            m133151a(this.f170571b, this.f170570a, str, str2);
            mo119589a(Double.valueOf(m133154i()));
            this.f170575f = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k$d */
    static final class C75943d extends AbstractC89220m implements AbstractC89187q<Boolean, String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75939k f170586a;

        /* renamed from: b */
        final /* synthetic */ Effect f170587b;

        static {
            Covode.recordClassIndex(88884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75943d(C75939k kVar, Effect effect) {
            super(3);
            this.f170586a = kVar;
            this.f170587b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Boolean bool, String str, String str2) {
            boolean booleanValue = bool.booleanValue();
            final String str3 = str;
            final String str4 = str2;
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            if (this.f170586a.f170571b != null && !this.f170586a.f170571b.isFinishing()) {
                this.f170586a.mo119606f().dismiss();
                if (booleanValue) {
                    this.f170586a.f170570a = BackgroundVideoStickerPresenter.C75913a.m133122a(this.f170587b);
                    this.f170586a.mo119607g().post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75939k.C75943d.RunnableC759441 */

                        /* renamed from: a */
                        final /* synthetic */ C75943d f170588a;

                        static {
                            Covode.recordClassIndex(88885);
                        }

                        {
                            this.f170588a = r1;
                        }

                        public final void run() {
                            this.f170588a.f170586a.mo119605b(str3, str4);
                        }
                    });
                } else {
                    C84911q.m145926b("BackgroundVideo default video parse fail");
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k$f */
    static final class C75946f extends AbstractC89220m implements AbstractC89187q<Boolean, String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75939k f170592a;

        /* renamed from: b */
        final /* synthetic */ Effect f170593b;

        static {
            Covode.recordClassIndex(88887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75946f(C75939k kVar, Effect effect) {
            super(3);
            this.f170592a = kVar;
            this.f170593b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Boolean bool, String str, String str2) {
            boolean booleanValue = bool.booleanValue();
            final String str3 = str;
            final String str4 = str2;
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            if (this.f170592a.f170571b != null && !this.f170592a.f170571b.isFinishing()) {
                this.f170592a.mo119606f().dismiss();
                if (booleanValue) {
                    this.f170592a.f170570a = BackgroundVideoStickerPresenter.C75913a.m133122a(this.f170593b);
                    this.f170592a.mo119607g().post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75939k.C75946f.RunnableC759471 */

                        /* renamed from: a */
                        final /* synthetic */ C75946f f170594a;

                        static {
                            Covode.recordClassIndex(88888);
                        }

                        {
                            this.f170594a = r1;
                        }

                        public final void run() {
                            this.f170594a.f170592a.mo119605b(str3, str4);
                        }
                    });
                } else {
                    C84911q.m145926b("BackgroundVideo default video parse fail");
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m133151a(Context context, String str, String str2, String str3) {
        T value = this.f170580k.mo22891c().f7727a.getValue();
        if (C65369bi.m117065a()) {
            this.f170579j.mo22747A().mo56932c(true);
        }
        C89219l.m154716b(value, "");
        if (value.booleanValue()) {
            this.f170581l.mo56773a(context, str, str2, str3);
        }
        C84090k.m144601b(this.f170582m);
    }

    public C75939k(ActivityC0218d dVar, AbstractC14177d dVar2, AbstractC14193m mVar, AbstractC31193a aVar, AbstractC84089j jVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(jVar, "");
        this.f170571b = dVar;
        this.f170579j = dVar2;
        this.f170580k = mVar;
        this.f170581l = aVar;
        this.f170582m = jVar;
    }
}
