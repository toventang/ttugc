package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70659a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73513bl;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3857b.C72782a;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import java.util.Collection;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dm */
public final class C70641dm {
    static {
        Covode.recordClassIndex(83107);
    }

    /* renamed from: c */
    public static final boolean m124848c(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null || !shortVideoContext.f155780aN) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.dm$a */
    static final class C70642a extends AbstractC89220m implements AbstractC89172b<Boolean, Long> {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f158125a;

        static {
            Covode.recordClassIndex(83108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70642a(ShortVideoContext shortVideoContext) {
            super(1);
            this.f158125a = shortVideoContext;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Long invoke(Boolean bool) {
            return Long.valueOf(mo111448a(bool.booleanValue()));
        }

        /* renamed from: a */
        public final long mo111448a(boolean z) {
            return C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration(z, this.f158125a);
        }
    }

    /* renamed from: a */
    public static final boolean m124846a(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        C70650dt<TimeSpeedModelExtension> dtVar = shortVideoContext.f155817b.f155650f;
        C89219l.m154716b(dtVar, "");
        if ((dtVar instanceof Collection) && dtVar.isEmpty()) {
            return false;
        }
        for (TimeSpeedModelExtension timeSpeedModelExtension : dtVar) {
            C89219l.m154716b(timeSpeedModelExtension, "");
            if (C73513bl.m129647a(timeSpeedModelExtension)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m124847b(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return false;
        }
        if (shortVideoContext.f155817b.mo109890c() || C70659a.m124890a(shortVideoContext) || ((shortVideoContext.mo110022c() && C72782a.m128364b(shortVideoContext.f155743D.f155846a)) || shortVideoContext.f155817b.f155665u == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final void m124849d(ShortVideoContext shortVideoContext) {
        long min;
        long j;
        if (shortVideoContext != null) {
            C70642a aVar = new C70642a(shortVideoContext);
            int i = shortVideoContext.f155763X;
            boolean z = true;
            if (i == 10) {
                min = Math.min(shortVideoContext.f155817b.f155646b, aVar.mo111448a(true));
            } else if (i == 11) {
                min = Math.min(shortVideoContext.f155817b.f155646b, aVar.mo111448a(false));
            } else if (i != 14) {
                min = shortVideoContext.f155817b.f155646b;
            } else {
                min = Math.min(shortVideoContext.f155817b.f155646b, aVar.mo111448a(false));
            }
            shortVideoContext.mo110001a(min);
            C75439a aVar2 = shortVideoContext.f155817b.f155662r;
            if (aVar2 != null) {
                j = aVar2.getMaxDuration();
            } else {
                j = 0;
            }
            C75439a aVar3 = shortVideoContext.f155817b.f155662r;
            if (aVar3 == null || aVar3.isMultiBgVideo()) {
                z = false;
            }
            if (j > 0 && z) {
                shortVideoContext.mo110001a(Math.min(shortVideoContext.f155817b.f155646b, j));
            }
        }
    }

    /* renamed from: a */
    public static final void m124845a(Intent intent, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(intent, "");
        C89219l.m154721d(shortVideoContext, "");
        intent.putExtra("is_west_window_exist", shortVideoContext.f155782aP);
        intent.putExtra("record_timer", shortVideoContext.f155775aI);
    }
}
