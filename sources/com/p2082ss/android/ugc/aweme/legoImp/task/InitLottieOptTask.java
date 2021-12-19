package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.SystemClock;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p104g.C2150e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46875ee;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitLottieOptTask */
public final class InitLottieOptTask implements AbstractC58264w {

    /* renamed from: a */
    public static final C58343a f132856a = new C58343a((byte) 0);

    /* renamed from: b */
    private static final C2150e.AbstractC2151a f132857b = C58344b.f132858a;

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitLottieOptTask$a */
    public static final class C58343a {
        static {
            Covode.recordClassIndex(68476);
        }

        private C58343a() {
        }

        public /* synthetic */ C58343a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
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

    static {
        Covode.recordClassIndex(68475);
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitLottieOptTask$b */
    static final class C58344b implements C2150e.AbstractC2151a {

        /* renamed from: a */
        public static final C58344b f132858a = new C58344b();

        static {
            Covode.recordClassIndex(68477);
        }

        C58344b() {
        }

        @Override // com.airbnb.lottie.p104g.C2150e.AbstractC2151a
        /* renamed from: a */
        public final void mo6077a() {
            SystemClock.uptimeMillis();
            if (C46875ee.f109228a) {
                C2144d.C2146b bVar = new C2144d.C2146b();
                bVar.mo6064a();
                bVar.mo6066b();
                bVar.mo6065a(C46875ee.f109228a);
                bVar.mo6067b(C46875ee.f109229b);
                bVar.mo6068c(C46875ee.f109230c);
                bVar.mo6069d(C46875ee.f109231d);
                bVar.mo6070e(C46875ee.f109232e);
                bVar.mo6071f(C46875ee.f109233f);
                bVar.mo6072g(C46875ee.f109234g);
                bVar.mo6073h(C46875ee.f109235h);
                bVar.mo6074i(C46875ee.f109236i);
                bVar.mo6075j(C46875ee.f109237j);
                C2144d.m6680a(bVar);
            } else {
                C2144d.C2146b bVar2 = new C2144d.C2146b();
                bVar2.mo6064a();
                bVar2.mo6066b();
                C2144d.m6680a(bVar2);
            }
            C2144d.C2145a.f6489k = C46875ee.f109238k;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        SystemClock.uptimeMillis();
        C2150e.f6508a = f132857b;
    }
}
