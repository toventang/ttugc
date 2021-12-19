package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4139d;

import android.text.TextUtils;
import com.bytedance.als.ApiCenter;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81785a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78994o;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78948b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83409d;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.a */
public final class C78937a implements AbstractC83405a {

    /* renamed from: a */
    public RecordMVViewModel f177426a;

    /* renamed from: b */
    public final AbstractC83492a f177427b;

    /* renamed from: c */
    public final C21582f f177428c;

    /* renamed from: d */
    private final AbstractC89244h f177429d = C89250i.m154773a((AbstractC89171a) new C78939b(this));

    static {
        Covode.recordClassIndex(92086);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.a$b */
    static final class C78939b extends AbstractC89220m implements AbstractC89171a<C78994o> {

        /* renamed from: a */
        final /* synthetic */ C78937a f177433a;

        static {
            Covode.recordClassIndex(92088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78939b(C78937a aVar) {
            super(0);
            this.f177433a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C78994o invoke() {
            return new C78994o(this.f177433a.f177428c);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final AbstractC83467k provideScene() {
        return (AbstractC83467k) this.f177429d.getValue();
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordMVViewModel m137735a(C78937a aVar) {
        RecordMVViewModel recordMVViewModel = aVar.f177426a;
        if (recordMVViewModel == null) {
            C89219l.m154710a("mvViewModel");
        }
        return recordMVViewModel;
    }

    public C78937a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f177428c = fVar;
        this.f177427b = (AbstractC83492a) fVar.mo35252b(AbstractC83492a.class, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final C83409d createBottomTabItem(C82004a aVar) {
        boolean z;
        C89219l.m154721d(aVar, "");
        String string = aVar.mo127169a().getString(R.string.f7v);
        C89219l.m154716b(string, "");
        RecordMVViewModel recordMVViewModel = this.f177426a;
        if (recordMVViewModel == null) {
            C89219l.m154710a("mvViewModel");
        }
        if (C78948b.m137764a(recordMVViewModel.mo122687a())) {
            RecordMVViewModel recordMVViewModel2 = this.f177426a;
            if (recordMVViewModel2 == null) {
                C89219l.m154710a("mvViewModel");
            }
            if (recordMVViewModel2.f177204a != null) {
                C78948b.f177442a = "mv_reuse";
                z = true;
                return new C83409d(string, "record_mode_mv", "mv", z, new C78938a(this, aVar));
            }
        }
        z = false;
        return new C83409d(string, "record_mode_mv", "mv", z, new C78938a(this, aVar));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final void initialize(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        JediViewModel a = C20531t.m38716a(aVar.mo127169a()).mo33800a(RecordMVViewModel.class);
        C89219l.m154716b(a, "");
        RecordMVViewModel recordMVViewModel = (RecordMVViewModel) a;
        this.f177426a = recordMVViewModel;
        if (recordMVViewModel == null) {
            C89219l.m154710a("mvViewModel");
        }
        ShortVideoContext b = aVar.mo127181b();
        C89219l.m154721d(b, "");
        recordMVViewModel.f177205b = b;
        RecordMVViewModel recordMVViewModel2 = this.f177426a;
        if (recordMVViewModel2 == null) {
            C89219l.m154710a("mvViewModel");
        }
        recordMVViewModel2.f177204a = ((ShortVideoContext) this.f177428c.mo35249a((Type) ShortVideoContext.class, (String) null)).f155827l;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.a$a */
    public static final class C78938a implements AbstractC83468l {

        /* renamed from: a */
        final /* synthetic */ C78937a f177430a;

        /* renamed from: b */
        final /* synthetic */ C82004a f177431b;

        /* renamed from: c */
        private Effect f177432c;

        static {
            Covode.recordClassIndex(92087);
        }

        C78938a(C78937a aVar, C82004a aVar2) {
            this.f177430a = aVar;
            this.f177431b = aVar2;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabUnselected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            AbstractC84089j value;
            AbstractC84089j value2;
            AbstractC75934f E;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            if (!(C78937a.m137735a(this.f177430a).mo122687a().f155817b.f155662r == null || (value2 = this.f177431b.mo127185f().getValue()) == null || (E = value2.mo128897E()) == null)) {
                E.mo119595e();
            }
            if (!(this.f177432c == null || !aVar.f186418b || (value = this.f177431b.mo127185f().getValue()) == null)) {
                C75346e.m132156a(value, this.f177432c);
            }
            if (!aVar.f186417a) {
                return false;
            }
            this.f177431b.mo127186g().mo22660j();
            return false;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabSelected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            Effect effect;
            String musicId;
            String stickerId;
            String musicId2;
            String str;
            String str2;
            String stickerId2;
            AbstractC84089j value;
            AbstractC84089j value2;
            AbstractC75934f E;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            ApiCenter a = ApiCenter.C2545a.m7450a(this.f177431b.mo127169a());
            AbstractC83492a aVar2 = this.f177430a.f177427b;
            Integer num = null;
            if (aVar2 != null) {
                aVar2.mo128516c(null);
            }
            ((AbstractC71864a) a.mo7013a(AbstractC71864a.class)).mo113512b(false);
            AbstractC83490a.C83491a.m143864a(this.f177431b.mo127169a()).tryHideMusicTips();
            if (!(C78937a.m137735a(this.f177430a).mo122687a().f155817b.f155662r == null || (value2 = this.f177431b.mo127185f().getValue()) == null || (E = value2.mo128897E()) == null)) {
                E.mo119594d();
            }
            AbstractC84089j value3 = this.f177431b.mo127185f().getValue();
            if (value3 != null) {
                effect = C75346e.m132154a(value3);
            } else {
                effect = null;
            }
            this.f177432c = effect;
            if (!(effect == null || (value = this.f177431b.mo127185f().getValue()) == null)) {
                C75346e.m132156a(value, (Effect) null);
            }
            Mission a2 = C63238c.f143585l.mo93813a(C78937a.m137735a(this.f177430a).mo122687a().f155794ad.f155707c);
            if (a2 != null && (!(((musicId = a2.getMusicId()) == null || musicId.length() == 0) && ((stickerId2 = a2.getStickerId()) == null || stickerId2.length() == 0)) && (((stickerId = a2.getStickerId()) == null || stickerId.length() == 0 || !a2.isStickerToasted()) && ((musicId2 = a2.getMusicId()) == null || musicId2.length() == 0 || !a2.isMusicToasted())))) {
                C69905c cVar = C70005cr.m123611a().f156482a;
                if (cVar != null) {
                    str = cVar.getMusicId();
                } else {
                    str = null;
                }
                if (TextUtils.equals(a2.getMusicId(), str)) {
                    C85041d.m146226b(this.f177431b.mo127169a(), R.string.d3u).mo129984b();
                    C84425b a3 = new C84425b().mo129403a("reason", 6).mo129406a("mission_id", a2.getMissionId()).mo129406a("page_source", a2.getEnterFrom());
                    AbstractC32846a e = C63238c.f143594u.mo93906e();
                    if (e != null) {
                        num = Integer.valueOf(e.mo58670m());
                    }
                    C84425b a4 = a3.mo129405a("creator_followers", num);
                    if (C63253l.f143623a.mo73330z().mo93832j()) {
                        str2 = "0";
                    } else {
                        str2 = "1";
                    }
                    C39162r.m79460a("mission_requirement_toast", a4.mo129406a("creator_type", str2).f188764a);
                }
            }
            AbstractC81785a aVar3 = (AbstractC81785a) a.mo7015b(AbstractC81785a.class);
            if (aVar3 != null) {
                aVar3.mo125490a(false);
            }
            AbstractC14177d dVar2 = (AbstractC14177d) a.mo7015b(AbstractC14177d.class);
            if (dVar2 != null) {
                dVar2.mo22742b(false, new PrivacyCert(new C13349j("1024"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            }
            return false;
        }
    }
}
