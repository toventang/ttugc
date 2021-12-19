package com.p2082ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.d */
public final class C67191d implements AbstractC58259r {

    /* renamed from: a */
    public static final String f150612a = "is_active";

    /* renamed from: b */
    public static final String f150613b = "last_active_version";

    /* renamed from: c */
    public static final String f150614c = "last_channel";

    /* renamed from: d */
    public static final String f150615d = "last_device_id";

    /* renamed from: e */
    public static final String f150616e = "last_install_id";

    /* renamed from: f */
    public static final C67192a f150617f = new C67192a((byte) 0);

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

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.d$a */
    public static final class C67192a {
        static {
            Covode.recordClassIndex(78809);
        }

        private C67192a() {
        }

        public /* synthetic */ C67192a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.NORMAL;
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
        Covode.recordClassIndex(78808);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        AppLog.activeUser(C17867d.m33078a());
        C36145b.m73641b().mo63265a(C17867d.m33078a(), f150613b, C17867d.m33085f());
        C36145b.m73641b().mo63265a(C17867d.m33078a(), f150614c, C17867d.f42595s);
        C36145b.m73641b().mo63265a(C17867d.m33078a(), f150615d, AppLog.getServerDeviceId());
        C36145b.m73641b().mo63265a(C17867d.m33078a(), f150616e, AppLog.getInstallId());
        C29823c.m60081a(context, "monitor", "app_alert", 0, 0);
    }
}
