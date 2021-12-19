package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.statisticlogger.C18228e;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.deviceregister.p2134a.C29869d;
import com.p2082ss.android.ugc.aweme.experiment.C46906es;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58179c;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask */
public class NpthCoreInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68546);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask$a */
    public static class C58370a implements ICommonParams {

        /* renamed from: a */
        public String f132912a;

        static {
            Covode.recordClassIndex(68547);
        }

        @Override // com.bytedance.crash.ICommonParams
        public final List<String> getPatchInfo() {
            return null;
        }

        @Override // com.bytedance.crash.ICommonParams
        public final Map<String, Integer> getPluginInfo() {
            return null;
        }

        @Override // com.bytedance.crash.ICommonParams
        public final String getSessionId() {
            return C18228e.f43418b;
        }

        @Override // com.bytedance.crash.ICommonParams
        public final String getDeviceId() {
            return DeviceRegisterManager.getDeviceId();
        }

        @Override // com.bytedance.crash.ICommonParams
        public final long getUserId() {
            try {
                return Long.parseLong(AppLog.getUserId());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return 0;
            }
        }

        @Override // com.bytedance.crash.ICommonParams
        public final Map<String, Object> getCommonParams() {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            C29803q.m60037b(hashMap2, true);
            hashMap.putAll(hashMap2);
            if (!hashMap.containsKey("release_build")) {
                hashMap.put("release_build", C29869d.f71252f);
            }
            if ("3902".equals(this.f132912a)) {
                hashMap.put("aid", "3902");
            }
            return hashMap;
        }

        C58370a(String str) {
            this.f132912a = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (C46906es.m90212c()) {
            return EnumC58151ae.MAIN;
        }
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        String str;
        Npth.setApplication((Application) context);
        if (!C29843f.m60132b(context).contains("miniapp")) {
            String b = C29843f.m60132b(context);
            if (TextUtils.isEmpty(b) || !b.contains("bm")) {
                str = null;
            } else {
                str = "3902";
            }
            if (((Boolean) C58179c.f132482g.getValue()).booleanValue()) {
                Npth.setNpthStartEventDelayTime(5000);
            } else if (((Boolean) C58179c.f132483h.getValue()).booleanValue()) {
                Npth.setNpthStartEventDelayTime(7000);
            }
            Npth.init(context, new C58370a(str), true, true, true);
            if (!((Boolean) C46906es.f109316a.getValue()).booleanValue()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38964a("npth_tools", false, (Context) null);
                C58032m.m104852a(uptimeMillis, "npth_tools");
            }
        }
    }
}
