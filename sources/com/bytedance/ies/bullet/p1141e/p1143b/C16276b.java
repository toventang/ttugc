package com.bytedance.ies.bullet.p1141e.p1143b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1141e.p1144c.C16285a;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.service.base.AbstractC16697x;
import com.bytedance.ies.bullet.service.base.C16615b;
import com.bytedance.ies.bullet.service.base.EnumC16605al;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.e.b.b */
public final class C16276b {

    /* renamed from: a */
    public final C16274a f39090a;

    /* renamed from: b */
    private final int f39091b;

    static {
        Covode.recordClassIndex(18569);
    }

    public C16276b(int i) {
        this.f39091b = i;
        this.f39090a = new C16274a(i);
    }

    /* renamed from: com.bytedance.ies.bullet.e.b.b$a */
    public static final class C16277a extends AbstractC89220m implements AbstractC89183m<Boolean, C16615b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16276b f39092a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16697x f39093b;

        /* renamed from: c */
        final /* synthetic */ Uri f39094c;

        static {
            Covode.recordClassIndex(18570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16277a(C16276b bVar, AbstractC16697x xVar, Uri uri) {
            super(2);
            this.f39092a = bVar;
            this.f39093b = xVar;
            this.f39094c = uri;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, C16615b bVar) {
            boolean booleanValue = bool.booleanValue();
            C16615b bVar2 = bVar;
            C89219l.m154719c(bVar2, "");
            if (booleanValue) {
                this.f39093b.mo25870a();
                this.f39092a.f39090a.mo25866a(this.f39094c, bVar2);
            } else {
                AbstractC16697x.C16698a.m30989a(this.f39093b, EnumC16605al.FAIL_LOAD_ERROR);
                BulletContainerView a = C16285a.m30273a(bVar2.f39770c);
                if (a != null) {
                    a.mo25721a();
                }
            }
            return C89391z.f203057a;
        }
    }
}
