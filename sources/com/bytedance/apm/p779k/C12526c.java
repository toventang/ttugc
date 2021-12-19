package com.bytedance.apm.p779k;

import android.os.Process;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.apm.api.IFdCheck;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.c */
public final class C12526c extends AbstractC12513a {

    /* renamed from: c */
    private static IFdCheck f30437c;

    /* renamed from: a */
    private int f30438a = 800;

    /* renamed from: b */
    private long f30439b = 600000;

    static {
        Covode.recordClassIndex(14342);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: b */
    public final boolean mo20036b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: c */
    public final long mo20037c() {
        return this.f30439b;
    }

    public C12526c() {
        this.f30391p = "fd";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: e */
    public final void mo20039e() {
        super.mo20039e();
        if (System.currentTimeMillis() - C12397c.m22292i() > 1200000) {
            int i = 0;
            try {
                i = new File("/proc/" + Process.myPid() + "/fd").listFiles().length;
            } catch (Throwable unused) {
            }
            if (i == 0) {
                return;
            }
            if (i < this.f30438a) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fd_count", i);
                    jSONObject.put("is_main_process", C12397c.m22285b());
                    jSONObject.put("process_name", C12397c.m22278a());
                    m22485a(new C12412f("fd", jSONObject));
                } catch (Exception unused2) {
                }
            } else {
                if (f30437c == null) {
                    f30437c = (IFdCheck) C21520c.m40424a(IFdCheck.class);
                }
                IFdCheck iFdCheck = f30437c;
                if (iFdCheck != null) {
                    try {
                        String a = C12585h.m22679a(iFdCheck.getFdList(), "\n");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("fd_count", i);
                        jSONObject2.put("fd_detail", a);
                        m22485a(new C12412f("fd", jSONObject2));
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p779k.AbstractC12513a
    /* renamed from: a */
    public final void mo20034a(JSONObject jSONObject) {
        super.mo20034a(jSONObject);
        this.f30438a = jSONObject.optInt("fd_count_threshold", 800);
        this.f30439b = jSONObject.optLong("collect_interval", 10) * 60000;
    }
}
