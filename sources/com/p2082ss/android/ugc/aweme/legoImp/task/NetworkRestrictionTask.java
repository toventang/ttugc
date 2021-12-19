package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.network.p3503a.C61475c;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.NetworkRestrictionTask */
public final class NetworkRestrictionTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68545);
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
        return EnumC58151ae.IDLE;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        int intValue;
        Object obj;
        if (context != null && (intValue = ((Number) C61475c.f139557a.getValue()).intValue()) != 0) {
            try {
                Object a = m106210a(context, "connectivity");
                if (!(a instanceof ConnectivityManager)) {
                    a = null;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) a;
                if (connectivityManager != null && connectivityManager.isActiveNetworkMetered()) {
                    int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                    int i = 2;
                    if (restrictBackgroundStatus != 2) {
                        if (restrictBackgroundStatus == 3) {
                            i = 1;
                        } else {
                            return;
                        }
                    }
                    obj = C89379q.m157068constructorimpl(Integer.valueOf(i));
                    if (C89379q.m157074isSuccessimpl(obj)) {
                        int intValue2 = ((Number) obj).intValue();
                        if ((intValue & intValue2) == intValue2) {
                            JSONObject put = new JSONObject().put("restrict_status", intValue2);
                            C89219l.m154716b(put, "");
                            C12290b.m22066a("restrict_background_status", put, (JSONObject) null, (JSONObject) null);
                        }
                    }
                    Throwable r0 = C89379q.m157071exceptionOrNullimpl(obj);
                    if (r0 != null && (intValue & 4) == 4) {
                        JSONObject put2 = new JSONObject().put("e", r0.getMessage());
                        C89219l.m154716b(put2, "");
                        JSONObject put3 = new JSONObject().put("restrict_status", 4);
                        C89219l.m154716b(put3, "");
                        C12290b.m22066a("restrict_background_status", put3, (JSONObject) null, put2);
                    }
                }
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    /* renamed from: a */
    private static Object m106210a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1338);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(1338);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
