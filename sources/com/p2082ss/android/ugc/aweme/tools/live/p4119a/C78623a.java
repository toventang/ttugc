package com.p2082ss.android.ugc.aweme.tools.live.p4119a;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81785a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75934f;
import com.p2082ss.android.ugc.aweme.tools.live.C78615a;
import com.p2082ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80573ig;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83409d;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VESafeAreaParams;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.live.a.a */
public final class C78623a implements AbstractC83405a {

    /* renamed from: a */
    public final AbstractC83492a f176677a;

    /* renamed from: b */
    public final C21582f f176678b;

    /* renamed from: c */
    private final AbstractC84089j f176679c;

    /* renamed from: d */
    private final AbstractC89244h f176680d = C89250i.m154773a((AbstractC89171a) C78625b.f176684a);

    static {
        Covode.recordClassIndex(91762);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a.a$b */
    static final class C78625b extends AbstractC89220m implements AbstractC89171a<C78615a> {

        /* renamed from: a */
        public static final C78625b f176684a = new C78625b();

        static {
            Covode.recordClassIndex(91764);
        }

        C78625b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C78615a invoke() {
            return new C78615a();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final AbstractC83467k provideScene() {
        return (AbstractC83467k) this.f176680d.getValue();
    }

    public C78623a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f176678b = fVar;
        this.f176677a = (AbstractC83492a) fVar.mo35252b(AbstractC83492a.class, null);
        this.f176679c = (AbstractC84089j) fVar.mo35252b(AbstractC84089j.class, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final C83409d createBottomTabItem(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        return new C83409d(C80573ig.m139668a(R.string.cvr), C80573ig.m139668a(R.string.f7u), "live", aVar.mo127181b().f155798ah, new C78624a(this, aVar));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final void initialize(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        RecordLiveViewModel recordLiveViewModel = (RecordLiveViewModel) C1181ae.m3881a(aVar.mo127169a(), (C1175ad.AbstractC1177b) null).mo3983a(RecordLiveViewModel.class);
        IRecordingOperationPanel iRecordingOperationPanel = aVar.f183531a;
        if (iRecordingOperationPanel == null) {
            C89219l.m154710a("recordingOperationPanel");
        }
        recordLiveViewModel.f176661a = iRecordingOperationPanel;
        AbstractC14177d d = aVar.mo127183d();
        C89219l.m154721d(d, "");
        recordLiveViewModel.f176662b = d;
        recordLiveViewModel.f176664d = aVar.mo127181b();
        AbstractC31133a c = aVar.mo127182c();
        C89219l.m154721d(c, "");
        recordLiveViewModel.f176663c = c;
        C63238c.f143592s.mo93834a(aVar.mo127169a());
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a.a$a */
    public static final class C78624a implements AbstractC83468l {

        /* renamed from: a */
        final /* synthetic */ C78623a f176681a;

        /* renamed from: b */
        final /* synthetic */ C82004a f176682b;

        /* renamed from: c */
        private Effect f176683c;

        static {
            Covode.recordClassIndex(91763);
        }

        C78624a(C78623a aVar, C82004a aVar2) {
            this.f176681a = aVar;
            this.f176682b = aVar2;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabUnselected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            AbstractC84089j value;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            AbstractC83492a aVar2 = this.f176681a.f176677a;
            if (aVar2 != null) {
                aVar2.mo128511a(2, false);
            }
            if (!(this.f176683c == null || !aVar.f186418b || (value = this.f176682b.mo127185f().getValue()) == null)) {
                C75346e.m132156a(value, this.f176683c);
            }
            if (aVar.f186417a) {
                this.f176682b.mo127186g().mo22660j();
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabSelected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            String musicId;
            String stickerId;
            String musicId2;
            Long l;
            String stickerId2;
            AbstractC75934f E;
            AbstractC75934f E2;
            Effect effect;
            AbstractC84089j value;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            AbstractC83492a aVar2 = this.f176681a.f176677a;
            if (aVar2 != null) {
                aVar2.mo128516c(null);
            }
            AbstractC83492a aVar3 = this.f176681a.f176677a;
            if (aVar3 != null) {
                aVar3.mo128511a(2, true);
            }
            this.f176682b.mo127186g().mo22650a("live");
            AbstractC1174ac a = C1181ae.m3881a(this.f176682b.mo127169a(), (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a, "");
            ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) a;
            ApiCenter a2 = ApiCenter.C2545a.m7450a(this.f176682b.mo127169a());
            ((AbstractC71864a) a2.mo7013a(AbstractC71864a.class)).mo113512b(false);
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f155842a;
            C89219l.m154716b(shortVideoContext, "");
            if (shortVideoContext.f155817b.f155650f.isEmpty()) {
                this.f176682b.mo127183d().mo22777a(0);
                AbstractC84089j value2 = this.f176682b.mo127185f().getValue();
                if (value2 != null) {
                    effect = C75346e.m132154a(value2);
                } else {
                    effect = null;
                }
                this.f176683c = effect;
                if (!(effect == null || (value = this.f176682b.mo127185f().getValue()) == null)) {
                    C75346e.m132156a(value, (Effect) null);
                }
                this.f176682b.mo127186g().mo22682e(false);
            }
            Mission a3 = C63238c.f143585l.mo93813a(this.f176682b.mo127181b().f155794ad.f155707c);
            if (a3 != null && (!(((musicId = a3.getMusicId()) == null || musicId.length() == 0) && ((stickerId2 = a3.getStickerId()) == null || stickerId2.length() == 0)) && (((stickerId = a3.getStickerId()) == null || stickerId.length() == 0 || !a3.isStickerToasted()) && ((musicId2 = a3.getMusicId()) == null || musicId2.length() == 0 || !a3.isMusicToasted())))) {
                if (!a3.isMusicToasted()) {
                    String musicId3 = a3.getMusicId();
                    C69905c cVar = C70005cr.m123611a().f156482a;
                    if (cVar != null) {
                        l = Long.valueOf(cVar.f156195id);
                    } else {
                        l = null;
                    }
                    if (!TextUtils.equals(musicId3, String.valueOf(l))) {
                        a3.setMusicToasted(true);
                        this.f176682b.mo127181b().f155794ad.f155707c = C63238c.f143585l.mo93816a(this.f176682b.mo127181b().f155794ad.f155707c, a3);
                    }
                }
                C85041d.m146226b(this.f176682b.mo127169a(), R.string.d3r).mo129984b();
            }
            this.f176682b.mo127183d().mo22747A().getMediaController().mo56588a(0, (VESafeAreaParams[]) null);
            ((AbstractC83746a) a2.mo7013a(AbstractC83746a.class)).mo128716b(false);
            ShortVideoContext shortVideoContext2 = shortVideoContextViewModel.f155842a;
            C89219l.m154716b(shortVideoContext2, "");
            if (shortVideoContext2.f155817b.f155662r != null) {
                AbstractC84089j value3 = this.f176682b.mo127185f().getValue();
                if (!(value3 == null || (E2 = value3.mo128897E()) == null)) {
                    E2.mo119594d();
                }
                AbstractC84089j value4 = this.f176682b.mo127185f().getValue();
                if (!(value4 == null || (E = value4.mo128897E()) == null)) {
                    E.mo119592b();
                }
            }
            AbstractC81785a aVar4 = (AbstractC81785a) a2.mo7015b(AbstractC81785a.class);
            if (aVar4 != null) {
                aVar4.mo125490a(false);
            }
            return false;
        }
    }
}
