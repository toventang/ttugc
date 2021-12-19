package com.p2082ss.android.ugc.aweme.ftc.p3038j;

import com.bytedance.als.ApiCenter;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.aweme.ftc.p3026a.AbstractC51821a;
import com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a;
import com.p2082ss.android.ugc.aweme.ftc.p3039k.AbstractC52653d;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81785a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69797ae;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3857b.C72782a;
import com.p2082ss.android.ugc.aweme.tools.C78610l;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83409d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.j.a */
public final class C52640a implements AbstractC83405a {

    /* renamed from: a */
    public AbstractC14177d f121169a;

    /* renamed from: b */
    private final String f121170b;

    /* renamed from: c */
    private final String f121171c;

    /* renamed from: d */
    private final String f121172d;

    /* renamed from: e */
    private final boolean f121173e;

    static {
        Covode.recordClassIndex(62036);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final AbstractC83467k provideScene() {
        return null;
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC14177d m97518a(C52640a aVar) {
        AbstractC14177d dVar = aVar.f121169a;
        if (dVar == null) {
            C89219l.m154710a("cameraApiComponent");
        }
        return dVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final void initialize(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        this.f121169a = aVar.mo127183d();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final C83409d createBottomTabItem(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        return new C83409d(this.f121170b, this.f121171c, this.f121172d, this.f121173e, new C52641a(this, aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.j.a$a */
    public static final class C52641a implements AbstractC83468l {

        /* renamed from: a */
        final /* synthetic */ C52640a f121174a;

        /* renamed from: b */
        final /* synthetic */ C82004a f121175b;

        static {
            Covode.recordClassIndex(62037);
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabUnselected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            return false;
        }

        C52641a(C52640a aVar, C82004a aVar2) {
            this.f121174a = aVar;
            this.f121175b = aVar2;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabSelected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            int i;
            AbstractC81785a aVar2;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            this.f121175b.mo127186g().mo22650a("record");
            String str = dVar.f186283c;
            C89219l.m154721d(str, "");
            if (C89219l.m154714a((Object) str, (Object) C69797ae.f155980a)) {
                i = 10;
            } else if (C89219l.m154714a((Object) str, (Object) C69797ae.m123322a())) {
                i = 11;
            } else {
                i = 8;
            }
            this.f121175b.mo127181b().f155763X = i;
            ApiCenter a = ApiCenter.C2545a.m7450a(this.f121175b.mo127169a());
            C52640a.m97518a(this.f121174a).mo22740a(false, new PrivacyCert(new C13349j("1017"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            ((AbstractC71864a) a.mo7013a(AbstractC71864a.class)).mo113512b(true);
            AbstractC52568a aVar3 = (AbstractC52568a) a.mo7013a(AbstractC52568a.class);
            aVar3.mo88326c();
            aVar3.mo88320a();
            C52640a.m97518a(this.f121174a).mo22777a(0);
            ((AbstractC52568a) a.mo7013a(AbstractC52568a.class)).mo88323a(true);
            if (C63244g.m114602a().mo73277e().getSpeedPanelOpen(false)) {
                ((AbstractC52653d) a.mo7013a(AbstractC52653d.class)).mo88356a(true);
            }
            C82004a aVar4 = this.f121175b;
            String str2 = dVar.f186283c;
            this.f121175b.mo127181b();
            boolean z = aVar.f186422f;
            if (C89219l.m154714a((Object) C69797ae.m123322a(), (Object) str2) || C89219l.m154714a((Object) C69797ae.f155980a, (Object) str2)) {
                C78610l lVar = new C78610l(!C89219l.m154714a((Object) C69797ae.m123322a(), (Object) str2), true);
                lVar.f176652e = z;
                lVar.f176651d = 2;
                ((AbstractC51821a) ApiCenter.C2545a.m7450a(aVar4.mo127169a()).mo7013a(AbstractC51821a.class)).mo87557a(lVar);
            }
            C82004a aVar5 = this.f121175b;
            String str3 = dVar.f186283c;
            ShortVideoContext b = this.f121175b.mo127181b();
            if ((C89219l.m154714a((Object) C69797ae.m123322a(), (Object) str3) || C89219l.m154714a((Object) C69797ae.f155980a, (Object) str3)) && b.f155817b.mo109888a()) {
                if (b.mo110025d()) {
                    b.mo110023d(C72782a.m128361a(b.f155743D.f155846a));
                } else if (!b.f155752M || b.f155817b.mo109891d().isEmpty()) {
                    b.mo110023d(0);
                }
                C71833a.m126848a(b.f155817b.f155669y, C70005cr.m123611a().f156482a, b.f155817b.f155661q);
                aVar5.mo127182c().mo56600a(b.f155817b.f155669y, (long) b.f155817b.f155661q, b.f155817b.f155651g, false);
            }
            C71833a.m126852b(i);
            if (this.f121175b.mo127181b().f155817b.f155650f.isEmpty() && (aVar2 = (AbstractC81785a) a.mo7015b(AbstractC81785a.class)) != null) {
                aVar2.mo125490a(true);
            }
            return true;
        }
    }

    public C52640a(String str, String str2, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f121170b = str;
        this.f121171c = str2;
        this.f121172d = str3;
        this.f121173e = z;
    }
}
