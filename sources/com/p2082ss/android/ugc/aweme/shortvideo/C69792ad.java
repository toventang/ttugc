package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3857b.C72782a;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.p4303j.AbstractC83734a;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ad */
public final class C69792ad {

    /* renamed from: b */
    public static final long f155971b = C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: c */
    public static final C69793a f155972c = new C69793a((byte) 0);

    /* renamed from: a */
    public final ShortVideoContext f155973a;

    /* renamed from: d */
    private final ActivityC0945e f155974d;

    /* renamed from: e */
    private final AbstractC14193m f155975e;

    /* renamed from: f */
    private final AbstractC83490a f155976f;

    /* renamed from: g */
    private final C21582f f155977g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ad$a */
    public static final class C69793a {
        static {
            Covode.recordClassIndex(82199);
        }

        private C69793a() {
        }

        public /* synthetic */ C69793a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(82198);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ad$b */
    public static final class C69794b implements C70612k.AbstractC70613a {

        /* renamed from: a */
        final /* synthetic */ C69792ad f155978a;

        static {
            Covode.recordClassIndex(82200);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69794b(C69792ad adVar) {
            this.f155978a = adVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.AbstractC70613a
        /* renamed from: a */
        public final void mo87581a(C70625d dVar) {
            this.f155978a.f155973a.f155811au = C70612k.m124745a(dVar);
        }
    }

    /* renamed from: a */
    public final void mo110146a(C40888d dVar) {
        long j;
        long j2;
        long j3;
        long j4;
        C75439a aVar;
        EnumC69901bw a;
        AbstractC83734a aVar2;
        C89219l.m154721d(dVar, "");
        if (dVar.f95707a) {
            if (!this.f155974d.isFinishing()) {
                C70643dn.m124856a(this.f155973a);
                C70641dm.m124849d(this.f155973a);
                this.f155975e.mo22875a(new C14190j(this.f155973a.f155817b.f155646b));
                this.f155976f.handleCancelMusicResultEvent();
            }
        } else if (!TextUtils.isEmpty(dVar.f95710d) && !this.f155974d.isFinishing()) {
            String str = dVar.f95710d;
            C69905c cVar = dVar.f95709c;
            String str2 = dVar.f95708b;
            if (this.f155973a.f155817b.f155664t) {
                j = f155971b;
            } else {
                j = 15000;
            }
            if (C72782a.m128364b(this.f155973a.f155743D.f155846a)) {
                StitchParams stitchParams = this.f155973a.f155743D.f155846a;
                if (stitchParams == null) {
                    C89219l.m154715b();
                }
                C89386u<Long, Long, Long> a2 = C72782a.m128363a(stitchParams, str, cVar, j);
                j3 = a2.component1().longValue();
                j2 = a2.component2().longValue();
                j4 = a2.component3().longValue();
            } else {
                if (cVar == null || TextUtils.isEmpty(str)) {
                    j2 = j;
                    j3 = 0;
                } else {
                    j3 = C69903by.m123467a(cVar, str);
                    j2 = Math.min(j3, j);
                }
                C75439a aVar3 = this.f155973a.f155817b.f155662r;
                if (aVar3 != null) {
                    long maxDuration = aVar3.getMaxDuration();
                    if (maxDuration > 0 && (aVar = this.f155973a.f155817b.f155662r) != null && !aVar.isMultiBgVideo()) {
                        j2 = Math.min(j2, maxDuration);
                    }
                }
                j4 = j2;
            }
            this.f155973a.f155823h = str2;
            this.f155973a.mo110011a(str);
            this.f155973a.mo110001a(j2);
            C70612k.m124747a(this.f155973a.f155817b.f155669y, new C69794b(this));
            this.f155976f.handleChooseMusicResultEvent(cVar, str);
            if (!(cVar == null || (aVar2 = (AbstractC83734a) this.f155977g.mo35252b(AbstractC83734a.class, null)) == null)) {
                aVar2.mo128700a(j, cVar);
            }
            if (this.f155973a.mo110022c()) {
                new C69902bx(this.f155973a);
                a = C69902bx.m123465a(j, j4);
            } else {
                new C69902bx(this.f155973a);
                a = C69902bx.m123465a(j, j3);
            }
            if (a == EnumC69901bw.MUSIC && dVar.f95711e) {
                this.f155976f.showMusicTips(1);
            }
            this.f155975e.mo22875a(new C14190j(j4));
        }
    }

    public C69792ad(ActivityC0945e eVar, AbstractC14193m mVar, AbstractC83490a aVar, ShortVideoContext shortVideoContext, C21582f fVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(fVar, "");
        this.f155974d = eVar;
        this.f155975e = mVar;
        this.f155976f = aVar;
        this.f155973a = shortVideoContext;
        this.f155977g = fVar;
    }
}
