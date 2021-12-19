package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.bytedance.creativex.recorder.p940b.p941a.EnumC14169aa;
import com.bytedance.cukaie.closet.C14401a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a;
import com.p2082ss.android.ugc.aweme.ftc.p3027b.C51874d;
import com.p2082ss.android.ugc.aweme.ftc.p3034f.AbstractC52535a;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3857b.C72782a;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.tools.C78610l;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.C89386u;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.as */
public final class C69841as {

    /* renamed from: a */
    private static final long f156066a = C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: b */
    private final AbstractC52535a f156067b;

    /* renamed from: c */
    private final AbstractC51869a f156068c;

    /* renamed from: d */
    private final ShortVideoContext f156069d;

    /* renamed from: e */
    private final AbstractC14193m f156070e;

    static {
        Covode.recordClassIndex(82249);
    }

    public final void onEvent(C78610l lVar) {
        long j;
        long j2;
        long j3;
        long j4;
        EnumC69901bw b;
        EnumC14169aa aaVar;
        String str;
        AbstractC51869a aVar;
        C75439a aVar2;
        boolean z;
        if (lVar.f176648a) {
            C69905c cVar = C70005cr.m123611a().f156482a;
            String str2 = this.f156069d.f155817b.f155669y;
            if (lVar.f176649b) {
                j = 15000;
            } else {
                j = f156066a;
            }
            if (cVar == null || TextUtils.isEmpty(str2)) {
                j2 = j;
                j3 = 0;
            } else {
                j3 = C69903by.m123467a(cVar, str2);
                if (this.f156067b != null && this.f156069d.f155817b.mo109891d().isEmpty()) {
                    AbstractC52535a aVar3 = this.f156067b;
                    if (j3 > j) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar3.mo88307a(z);
                }
                j2 = Math.min(j3, j);
            }
            C75439a aVar4 = this.f156069d.f155817b.f155662r;
            if (aVar4 != null) {
                long maxDuration = aVar4.getMaxDuration();
                if (maxDuration > 0 && (aVar2 = this.f156069d.f155817b.f155662r) != null && !aVar2.isMultiBgVideo()) {
                    j2 = Math.min(j2, maxDuration);
                }
            }
            if (this.f156069d.mo110022c()) {
                C89386u<Long, Long, Long> a = C72782a.m128363a(this.f156069d.f155743D.f155846a, str2, cVar, j);
                j3 = a.getFirst().longValue();
                j4 = a.getSecond().longValue();
                j2 = a.getThird().longValue();
            } else {
                j4 = j2;
            }
            if (this.f156069d.mo110022c()) {
                b = C51874d.m96562b(j, j2);
            } else {
                b = C51874d.m96562b(j, j3);
            }
            AbstractC14193m mVar = this.f156070e;
            if (lVar.f176649b) {
                aaVar = EnumC14169aa.FORM_15S;
            } else {
                aaVar = EnumC14169aa.FORM_60S;
            }
            mVar.mo22874a(aaVar, !lVar.f176648a);
            this.f156069d.mo110024d(!lVar.f176649b);
            this.f156069d.mo110001a(j4);
            this.f156070e.mo22875a(new C14190j(j2));
            if (b == EnumC69901bw.MUSIC && !lVar.f176652e && (aVar = this.f156068c) != null) {
                aVar.mo87573a((Integer) 1);
            }
            ShortVideoContext shortVideoContext = this.f156069d;
            if (!(this.f156067b == null || !shortVideoContext.f155817b.mo109891d().isEmpty() || cVar == null)) {
                if (((long) cVar.shootDuration) > j || Math.abs(cVar.shootDuration - cVar.duration) >= 1000) {
                    this.f156067b.mo88307a(true);
                } else {
                    this.f156067b.mo88307a(false);
                }
            }
            C63244g.m114602a().mo73277e().setDurationMode(this.f156069d.f155817b.f155664t);
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
                C84425b a2 = bVar.mo129406a("to_status", str).mo129406a("creation_id", this.f156069d.f155830o).mo129406a("shoot_way", this.f156069d.f155831p);
                if (this.f156069d.f155740A != 0) {
                    a2.mo129403a("draft_id", this.f156069d.f155740A);
                }
                if (!TextUtils.isEmpty(this.f156069d.f155741B)) {
                    a2.mo129406a("new_draft_id", this.f156069d.f155741B);
                }
                C39162r.m79460a("change_record_mode", a2.f188764a);
            }
        }
    }

    public C69841as(ShortVideoContext shortVideoContext, C21582f fVar) {
        this.f156069d = shortVideoContext;
        this.f156067b = (AbstractC52535a) fVar.mo35252b(AbstractC52535a.class, null);
        this.f156068c = (AbstractC51869a) fVar.mo35252b(AbstractC51869a.class, null);
        this.f156070e = (AbstractC14193m) fVar.mo35247a(AbstractC14193m.class);
    }
}
