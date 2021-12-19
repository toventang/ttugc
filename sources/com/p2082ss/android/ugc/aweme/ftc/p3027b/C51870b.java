package com.p2082ss.android.ugc.aweme.ftc.p3027b;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.p2082ss.android.ugc.aweme.ftc.p3034f.AbstractC52535a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.b.b */
public final class C51870b {

    /* renamed from: e */
    public static final long f119514e = C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: f */
    public static final C51871a f119515f = new C51871a((byte) 0);

    /* renamed from: a */
    final ActivityC0945e f119516a;

    /* renamed from: b */
    final AbstractC14193m f119517b;

    /* renamed from: c */
    final AbstractC51869a f119518c;

    /* renamed from: d */
    public final ShortVideoContext f119519d;

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.b$a */
    public static final class C51871a {
        static {
            Covode.recordClassIndex(61240);
        }

        private C51871a() {
        }

        public /* synthetic */ C51871a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC52535a mo87578a() {
        return (AbstractC52535a) ApiCenter.C2545a.m7450a(this.f119516a).mo7015b(AbstractC52535a.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo87579b() {
        C75439a aVar = this.f119519d.f155817b.f155662r;
        if (aVar != null) {
            return aVar.getMaxDuration();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo87580c() {
        C75439a aVar = this.f119519d.f155817b.f155662r;
        if (aVar == null || aVar.isMultiBgVideo()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(61239);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.b$b */
    public static final class C51872b implements C70612k.AbstractC70613a {

        /* renamed from: a */
        final /* synthetic */ C51870b f119520a;

        static {
            Covode.recordClassIndex(61241);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51872b(C51870b bVar) {
            this.f119520a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.AbstractC70613a
        /* renamed from: a */
        public final void mo87581a(C70625d dVar) {
            this.f119520a.f119519d.f155811au = C70612k.m124745a(dVar);
        }
    }

    public C51870b(ActivityC0945e eVar, AbstractC14193m mVar, AbstractC51869a aVar, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(shortVideoContext, "");
        this.f119516a = eVar;
        this.f119517b = mVar;
        this.f119518c = aVar;
        this.f119519d = shortVideoContext;
    }
}
