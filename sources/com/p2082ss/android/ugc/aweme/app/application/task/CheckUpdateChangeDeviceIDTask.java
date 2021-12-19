package com.p2082ss.android.ugc.aweme.app.application.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.application.task.CheckUpdateChangeDeviceIDTask */
public final class CheckUpdateChangeDeviceIDTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(40551);
    }

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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
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

    /* renamed from: com.ss.android.ugc.aweme.app.application.task.CheckUpdateChangeDeviceIDTask$a */
    static final class RunnableC33658a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f79856a;

        static {
            Covode.recordClassIndex(40552);
        }

        RunnableC33658a(Context context) {
            this.f79856a = context;
        }

        public final void run() {
            C39223a.m79603q().mo68629b();
            C39223a.m79603q().mo68632c(this.f79856a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (!C39223a.m79603q().mo68628a()) {
            if (C80580in.m139687c()) {
                C39223a.m79603q().mo68627a(true, new RunnableC33658a(context));
                return;
            }
            C39223a.m79603q().mo68629b();
        }
        C39223a.m79603q().mo68632c(context);
    }
}
