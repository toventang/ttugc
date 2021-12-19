package com.p2082ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.ReportActivityStatusTask */
public final class ReportActivityStatusTask implements AbstractC58264w {

    /* renamed from: a */
    public final String f150607a;

    /* renamed from: b */
    public final Bundle f150608b;

    static {
        Covode.recordClassIndex(78802);
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
        return EnumC58151ae.SPARSE;
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
        boolean z;
        String str = this.f150607a;
        int i = 1;
        if (this.f150608b != null) {
            z = true;
        } else {
            z = false;
        }
        C67204i iVar = new C67204i(str, z);
        try {
            C51423a.m95791b(4, iVar.f150625a, "The activity is recovered by the system or config change:" + iVar.f150626b);
            if (!iVar.f150626b) {
                i = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activity", iVar.f150625a);
            jSONObject.put("activity_status", new StringBuilder().append(iVar.f150626b).toString());
            C12290b.m22060a("activity_monitor", i, jSONObject);
        } catch (Throwable th) {
            C51423a.m95790a(th);
        }
    }

    public ReportActivityStatusTask(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        this.f150607a = str;
        this.f150608b = bundle;
    }
}
