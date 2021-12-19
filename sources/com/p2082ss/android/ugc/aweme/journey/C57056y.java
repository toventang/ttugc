package com.p2082ss.android.ugc.aweme.journey;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.p3291a.C56837c;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.services.MandatoryLoginService;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.y */
public final class C57056y implements AbstractC58259r {

    /* renamed from: a */
    public static volatile boolean f129918a;

    /* renamed from: b */
    public static C56837c f129919b;

    /* renamed from: c */
    public static final C57057a f129920c = new C57057a((byte) 0);

    /* renamed from: d */
    private final AbstractC56869p f129921d;

    /* renamed from: e */
    private final boolean f129922e;

    static {
        Covode.recordClassIndex(66946);
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

    /* renamed from: com.ss.android.ugc.aweme.journey.y$a */
    public static final class C57057a {
        static {
            Covode.recordClassIndex(66947);
        }

        private C57057a() {
        }

        public /* synthetic */ C57057a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m103411a(Context context) {
            C89219l.m154721d(context, "");
            C57056y.f129918a = true;
            C57056y.f129919b = new C56837c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        if (this.f129922e) {
            return EnumC58147aa.NORMAL;
        }
        return EnumC58147aa.IDLE;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    public C57056y() {
        AbstractC56869p a = AbstractC56869p.C56870a.m103133a();
        this.f129921d = a;
        boolean z = false;
        if (a.mo63252c() != 0 && !a.f129508a && !f129918a && !MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin()) {
            z = true;
        }
        this.f129922e = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        if (this.f129922e) {
            C57057a.m103411a(context);
        }
    }
}
