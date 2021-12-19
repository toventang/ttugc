package com.p2082ss.android.ugc.aweme.request_combine.request.p3678a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.AbstractC39264b;
import com.p2082ss.android.ugc.aweme.journey.C56850b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.a */
public final class C67129a implements AbstractC58259r {

    /* renamed from: a */
    public final EnumC58147aa f150544a;

    static {
        Covode.recordClassIndex(78732);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return this.f150544a;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.a$a */
    public static final class C67130a implements AbstractC39264b {

        /* renamed from: a */
        final /* synthetic */ C67129a f150545a;

        static {
            Covode.recordClassIndex(78733);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.AbstractC39264b
        /* renamed from: a */
        public final void mo68586a() {
            if (this.f150545a.f150544a == EnumC58147aa.NORMAL) {
                AbstractC81915c.m141875b(new C56850b());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C67130a(C67129a aVar) {
            this.f150545a = aVar;
        }
    }

    public C67129a(EnumC58147aa aaVar) {
        C89219l.m154721d(aaVar, "");
        this.f150544a = aaVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        C39223a.m79596j().mo68700a(new C67130a(this));
    }
}
