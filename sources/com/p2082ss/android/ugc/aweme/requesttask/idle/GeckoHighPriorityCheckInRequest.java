package com.p2082ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.experiment.C46838dl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47811f;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import java.util.List;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest */
public final class GeckoHighPriorityCheckInRequest implements AbstractC58264w {
    static {
        Covode.recordClassIndex(78797);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest$b */
    public static final class RunnableC67185b implements Runnable {

        /* renamed from: a */
        public static final RunnableC67185b f150604a = new RunnableC67185b();

        static {
            Covode.recordClassIndex(78799);
        }

        RunnableC67185b() {
        }

        public final void run() {
            if (!TextUtils.isEmpty(AppLog.getServerDeviceId())) {
                AppLog.getServerDeviceId();
                C80333dc.m139283d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest$a */
    public static final class C67184a implements AbstractC88986z<Boolean> {

        /* renamed from: a */
        final /* synthetic */ GeckoHighPriorityCheckInRequest f150602a;

        /* renamed from: b */
        final /* synthetic */ Context f150603b;

        static {
            Covode.recordClassIndex(78798);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Boolean bool) {
            if (bool.booleanValue()) {
                GeckoHighPriorityCheckInRequest.m119027b(this.f150603b);
            }
        }

        C67184a(GeckoHighPriorityCheckInRequest geckoHighPriorityCheckInRequest, Context context) {
            this.f150602a = geckoHighPriorityCheckInRequest;
            this.f150603b = context;
        }
    }

    /* renamed from: b */
    public static void m119027b(Context context) {
        C89219l.m154721d(context, "");
        try {
            new Handler(Looper.getMainLooper()).post(RunnableC67185b.f150604a);
        } catch (Exception e) {
            C47811f.m90833a(e);
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        if (!C80333dc.f179864a) {
            if (C46838dl.m90154a()) {
                C17873f.m33099g().mo143062b(new C67184a(this, context));
            } else {
                m119027b(context);
            }
        }
    }
}
