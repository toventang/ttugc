package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.bytedance.creativex.recorder.p940b.p941a.EnumC14169aa;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74227m;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3857b.C72782a;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.tools.C78610l;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.p4303j.AbstractC83734a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.C89386u;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ec */
public class C70768ec {

    /* renamed from: a */
    private final AbstractC83734a f158423a;

    /* renamed from: b */
    private final AbstractC83490a f158424b;

    /* renamed from: c */
    private final ShortVideoContext f158425c;

    /* renamed from: d */
    private final AbstractC74227m f158426d;

    /* renamed from: e */
    private final AbstractC14209z f158427e;

    /* renamed from: f */
    private final AbstractC84089j f158428f;

    /* renamed from: g */
    private final AbstractC83492a f158429g;

    static {
        Covode.recordClassIndex(83239);
    }

    public void onEvent(C78610l lVar) {
        long j;
        long j2;
        long j3;
        EnumC69901bw b;
        EnumC14169aa aaVar;
        String str;
        AbstractC83490a aVar;
        C75439a aVar2;
        boolean z;
        if (lVar.f176648a) {
            C69905c cVar = C70005cr.m123611a().f156482a;
            String str2 = this.f158425c.f155817b.f155669y;
            long maxShootingDuration = C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration(lVar.f176649b, this.f158425c);
            if (cVar == null || TextUtils.isEmpty(str2)) {
                j = maxShootingDuration;
                j2 = 0;
            } else {
                j2 = C69903by.m123467a(cVar, str2);
                if (this.f158423a != null && this.f158425c.f155817b.mo109891d().isEmpty()) {
                    AbstractC83734a aVar3 = this.f158423a;
                    if (j2 > maxShootingDuration) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar3.mo128701a(z);
                }
                j = Math.min(j2, maxShootingDuration);
            }
            C75439a aVar4 = this.f158425c.f155817b.f155662r;
            if (aVar4 != null) {
                long maxDuration = aVar4.getMaxDuration();
                if (maxDuration > 0 && (aVar2 = this.f158425c.f155817b.f155662r) != null && !aVar2.isMultiBgVideo()) {
                    j = Math.min(j, maxDuration);
                }
            }
            long resolveMaxDurationFor3MinWithMusic = C63244g.m114602a().mo73284l().getMaxDurationResolver().resolveMaxDurationFor3MinWithMusic(this.f158425c, j);
            if (this.f158425c.mo110022c()) {
                C89386u<Long, Long, Long> a = C72782a.m128363a(this.f158425c.f155743D.f155846a, str2, cVar, maxShootingDuration);
                j2 = a.getFirst().longValue();
                j3 = a.getSecond().longValue();
                resolveMaxDurationFor3MinWithMusic = a.getThird().longValue();
            } else {
                j3 = resolveMaxDurationFor3MinWithMusic;
            }
            if (this.f158425c.mo110022c()) {
                new C69902bx(this.f158425c);
                b = C69902bx.m123466b(maxShootingDuration, resolveMaxDurationFor3MinWithMusic);
            } else {
                new C69902bx(this.f158425c);
                b = C69902bx.m123466b(maxShootingDuration, j2);
            }
            AbstractC74227m mVar = this.f158426d;
            if (lVar.f176649b) {
                aaVar = EnumC14169aa.FORM_15S;
            } else {
                aaVar = EnumC14169aa.FORM_60S;
            }
            mVar.mo22874a(aaVar, !lVar.f176648a);
            this.f158425c.mo110024d(!lVar.f176649b);
            this.f158425c.mo110001a(j3);
            if (this.f158429g != null) {
                int i = this.f158425c.f155817b.f155661q;
                if (lVar.f176653f) {
                    if (this.f158425c.mo110025d()) {
                        i = C72782a.m128361a(this.f158425c.f155743D.f155846a);
                    } else if (!this.f158425c.f155752M || (this.f158425c.f155817b.mo109891d().isEmpty() && !this.f158425c.f155817b.f155653i)) {
                        i = 0;
                    }
                }
                this.f158429g.mo128513a(this.f158425c.f155817b.mo109893e(), (long) i, Long.valueOf(this.f158425c.f155817b.mo109899k()), this.f158428f.mo23167t().mo119294f(), C70769ed.f158430a);
            }
            this.f158426d.mo22875a(new C14190j(resolveMaxDurationFor3MinWithMusic));
            this.f158426d.mo116700g(lVar.f176650c);
            if (b == EnumC69901bw.MUSIC && !lVar.f176652e && (aVar = this.f158424b) != null) {
                aVar.showMusicTips(1);
            }
            ShortVideoContext shortVideoContext = this.f158425c;
            if (!(this.f158423a == null || !shortVideoContext.f155817b.mo109891d().isEmpty() || cVar == null)) {
                this.f158423a.mo128700a(maxShootingDuration, cVar);
            }
            C63244g.m114602a().mo73277e().setDurationMode(this.f158425c.f155817b.f155664t);
            IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C14401a((byte) 0).mo23215a(C63247i.f143610a, IVideoRecordPreferences.class);
            if (iVideoRecordPreferences != null && !iVideoRecordPreferences.isDurationModeManuallyChange(false)) {
                iVideoRecordPreferences.setDurationModeManuallyChange(true);
            }
            if (!lVar.mo122513a()) {
                C84425b bVar = new C84425b();
                if (lVar.f176649b) {
                    str = "15s";
                } else {
                    str = "60s";
                }
                C84425b a2 = bVar.mo129406a("to_status", str).mo129406a("creation_id", this.f158425c.f155830o).mo129406a("shoot_way", this.f158425c.f155831p);
                if (this.f158425c.f155740A != 0) {
                    a2.mo129403a("draft_id", this.f158425c.f155740A);
                }
                if (!TextUtils.isEmpty(this.f158425c.f155741B)) {
                    a2.mo129406a("new_draft_id", this.f158425c.f155741B);
                }
                C39162r.m79460a("video_duration_select", a2.f188764a);
            }
        }
    }

    public C70768ec(ShortVideoContext shortVideoContext, C21582f fVar) {
        this.f158425c = shortVideoContext;
        this.f158423a = (AbstractC83734a) fVar.mo35252b(AbstractC83734a.class, null);
        this.f158424b = (AbstractC83490a) fVar.mo35252b(AbstractC83490a.class, null);
        this.f158426d = (AbstractC74227m) fVar.mo35247a(AbstractC74227m.class);
        this.f158427e = (AbstractC14209z) fVar.mo35247a(AbstractC14209z.class);
        this.f158428f = (AbstractC84089j) fVar.mo35247a(AbstractC84089j.class);
        this.f158429g = (AbstractC83492a) fVar.mo35252b(AbstractC83492a.class, null);
    }
}
