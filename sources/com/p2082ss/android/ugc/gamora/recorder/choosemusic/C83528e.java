package com.p2082ss.android.ugc.gamora.recorder.choosemusic;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65338ah;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.AbstractC83566a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.vesdk.VEListener;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.e */
public final class C83528e {

    /* renamed from: a */
    final ActivityC0945e f186532a;

    /* renamed from: b */
    public final AbstractC14177d f186533b;

    /* renamed from: c */
    final AbstractC84089j f186534c;

    /* renamed from: d */
    public final AbstractC83566a f186535d;

    /* renamed from: e */
    public final AbstractC83490a f186536e;

    /* renamed from: f */
    final ShortVideoContext f186537f;

    /* renamed from: g */
    private final AbstractC83406b f186538g;

    static {
        Covode.recordClassIndex(97414);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.e$b */
    static final class C83530b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83528e f186540a;

        static {
            Covode.recordClassIndex(97416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83530b(C83528e eVar) {
            super(0);
            this.f186540a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f186540a.mo128553a(new PrivacyCert(new C13349j("1010"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.e$c */
    static final class C83531c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83528e f186541a;

        static {
            Covode.recordClassIndex(97417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83531c(C83528e eVar) {
            super(0);
            this.f186541a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f186541a.f186533b.mo22742b(false, new PrivacyCert(new C13349j("1029"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    static boolean m143906a() {
        boolean z;
        if (!C68027bm.m120329a() || C63244g.m114602a().mo73255A().mo93901a()) {
            z = false;
        } else {
            z = true;
        }
        if (!C65338ah.m117024a() || z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m143905a(ShortVideoContext shortVideoContext) {
        Mission mission = PublishExtensionModel.fromString(shortVideoContext.f155794ad.f155707c).mission;
        if (mission != null && !mission.isMusicToasted()) {
            return mission.getMusicId();
        }
        return null;
    }

    /* renamed from: b */
    static String m143907b(ShortVideoContext shortVideoContext) {
        Mission mission = PublishExtensionModel.fromString(shortVideoContext.f155794ad.f155707c).mission;
        if (mission == null) {
            return null;
        }
        return mission.getMissionId();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.e$a */
    static final class C83529a extends AbstractC89220m implements AbstractC89172b<C40888d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83528e f186539a;

        static {
            Covode.recordClassIndex(97415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83529a(C83528e eVar) {
            super(1);
            this.f186539a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C40888d dVar) {
            C40888d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            this.f186539a.mo128553a(new PrivacyCert(new C13349j("1009"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            this.f186539a.f186536e.onChooseMusicDone(dVar2.f95707a, dVar2.f95708b, dVar2.f95709c, dVar2.f95710d);
            AbstractC83566a aVar = this.f186539a.f186535d;
            if (aVar != null) {
                aVar.mo128581a(!dVar2.f95707a);
            }
            if (dVar2.f95707a) {
                AbstractC83566a aVar2 = this.f186539a.f186535d;
                if (aVar2 != null) {
                    aVar2.mo128581a(false);
                }
            } else {
                AbstractC83566a aVar3 = this.f186539a.f186535d;
                if (aVar3 != null) {
                    aVar3.mo128581a(true);
                }
            }
            this.f186539a.f186536e.handleChooseMusic(dVar2);
            this.f186539a.mo128554a(dVar2.f95707a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo128553a(PrivacyCert privacyCert) {
        this.f186533b.mo22796ad();
        if (!m143906a()) {
            if (this.f186537f.f155817b.f155662r != null) {
                this.f186534c.mo128897E().mo119595e();
            }
            if (this.f186538g.isCurrentTabNeedCamera()) {
                this.f186533b.mo22740a(false, privacyCert);
            }
        }
    }

    /* renamed from: a */
    public final void mo128554a(boolean z) {
        if (C75346e.m132154a(this.f186534c) != null) {
            this.f186536e.setStickerMusicCancelState(new C89378p<>(C75346e.m132154a(this.f186534c), Boolean.valueOf(z)));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.e$d */
    static final class C83532d implements VEListener.AbstractC85241j {

        /* renamed from: a */
        final /* synthetic */ C83528e f186542a;

        static {
            Covode.recordClassIndex(97418);
        }

        C83532d(C83528e eVar) {
            this.f186542a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:116:0x0308, code lost:
            if (r11 != null) goto L_0x02b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x009e, code lost:
            if (r1.mo93969f() != false) goto L_0x00a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0114, code lost:
            if (r1 != false) goto L_0x0116;
         */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0159  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x019a  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01e8  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01f7  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0241  */
        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo56563a(int r22) {
            /*
            // Method dump skipped, instructions count: 848
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.choosemusic.C83528e.C83532d.mo56563a(int):void");
        }
    }

    public C83528e(ActivityC0945e eVar, AbstractC14177d dVar, AbstractC84089j jVar, AbstractC83566a aVar, AbstractC83490a aVar2, AbstractC83406b bVar, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(shortVideoContext, "");
        this.f186532a = eVar;
        this.f186533b = dVar;
        this.f186534c = jVar;
        this.f186535d = aVar;
        this.f186536e = aVar2;
        this.f186538g = bVar;
        this.f186537f = shortVideoContext;
    }
}
