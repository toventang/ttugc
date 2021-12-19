package com.p2082ss.android.ugc.aweme.homepage.business;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.business.HomeToastTask */
public final class HomeToastTask implements AbstractC58264w {

    /* renamed from: a */
    private final boolean f121794a = false;

    static {
        Covode.recordClassIndex(62493);
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
    /* renamed from: com.ss.android.ugc.aweme.homepage.business.HomeToastTask$a */
    public static final class RunnableC52964a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f121795a;

        /* renamed from: b */
        final /* synthetic */ long f121796b;

        /* renamed from: c */
        final /* synthetic */ Context f121797c;

        static {
            Covode.recordClassIndex(62494);
        }

        RunnableC52964a(Context context, long j, Context context2) {
            this.f121795a = context;
            this.f121796b = j;
            this.f121797c = context2;
        }

        public final void run() {
            String string;
            Context context = this.f121795a;
            if (context != null && (string = context.getString(R.string.f92, Long.valueOf(this.f121796b))) != null) {
                C89219l.m154716b(string, "");
                Context context2 = this.f121797c;
                if (!(context2 instanceof ActivityC0945e)) {
                    context2 = null;
                }
                ActivityC0945e eVar = (ActivityC0945e) context2;
                if (eVar != null) {
                    new C23144b(eVar).mo37635a(string).mo37637b();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C51423a.m95787a("ToastTask");
        long e = C36145b.m73641b().mo63273e(context, "red_point_count");
        if (e > 0) {
            if (!C80580in.m139687c()) {
                Context j = C17873f.m33102j();
                if (j == null) {
                    j = context;
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC52964a(j, e, context));
            }
            C33830n.m69192a("log_red_badge", "click", new C33743c().mo59976a("count", String.valueOf(e)).mo59977a());
            C39162r.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("click").setValue(String.valueOf(e)));
            C36145b.m73641b().mo63263a(context, "red_point_count", 0L);
        }
    }
}
