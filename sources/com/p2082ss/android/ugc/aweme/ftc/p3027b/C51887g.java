package com.p2082ss.android.ugc.aweme.ftc.p3027b;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.vesdk.VEListener;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.b.g */
public final class C51887g {

    /* renamed from: a */
    final ActivityC0945e f119560a;

    /* renamed from: b */
    final AbstractC14177d f119561b;

    /* renamed from: c */
    final AbstractC84089j f119562c;

    /* renamed from: d */
    public final AbstractC51869a f119563d;

    /* renamed from: e */
    final ShortVideoContext f119564e;

    static {
        Covode.recordClassIndex(61256);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.g$b */
    static final class C51889b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51887g f119566a;

        static {
            Covode.recordClassIndex(61258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51889b(C51887g gVar) {
            super(0);
            this.f119566a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f119566a.mo87598a(new PrivacyCert(new C13349j("1004"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo87598a(PrivacyCert privacyCert) {
        AbstractC84089j jVar = this.f119562c;
        if (this.f119564e.f155817b.f155662r != null) {
            jVar.mo128897E().mo119595e();
        }
        this.f119561b.mo22796ad();
        this.f119561b.mo22740a(false, privacyCert);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.g$a */
    static final class C51888a extends AbstractC89220m implements AbstractC89172b<C40888d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51887g f119565a;

        static {
            Covode.recordClassIndex(61257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51888a(C51887g gVar) {
            super(1);
            this.f119565a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C40888d dVar) {
            C40888d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            this.f119565a.mo87598a(new PrivacyCert(new C13349j("1003"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            this.f119565a.f119563d.mo87574a(dVar2.f95707a, dVar2.f95709c, dVar2.f95710d);
            this.f119565a.f119563d.mo87571a(dVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.g$c */
    static final class C51890c implements VEListener.AbstractC85241j {

        /* renamed from: a */
        final /* synthetic */ C51887g f119567a;

        static {
            Covode.recordClassIndex(61259);
        }

        C51890c(C51887g gVar) {
            this.f119567a = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00df, code lost:
            if (r0 != false) goto L_0x00e1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0127  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0152  */
        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo56563a(int r21) {
            /*
            // Method dump skipped, instructions count: 594
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.p3027b.C51887g.C51890c.mo56563a(int):void");
        }
    }

    public C51887g(ActivityC0945e eVar, AbstractC14177d dVar, AbstractC84089j jVar, AbstractC51869a aVar, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(shortVideoContext, "");
        this.f119560a = eVar;
        this.f119561b = dVar;
        this.f119562c = jVar;
        this.f119563d = aVar;
        this.f119564e = shortVideoContext;
    }
}
