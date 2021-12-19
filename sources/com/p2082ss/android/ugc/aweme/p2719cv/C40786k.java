package com.p2082ss.android.ugc.aweme.p2719cv;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.cv.k */
public final class C40786k implements AbstractC40766c {
    static {
        Covode.recordClassIndex(48638);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
    /* renamed from: c */
    public final boolean mo70009c() {
        if (ApmDelegate.C12507a.f30372a.mo20329a("task_blocked")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
    /* renamed from: d */
    public final boolean mo70011d() {
        if (ApmDelegate.C12507a.f30372a.mo20329a("task_rejected")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
    /* renamed from: a */
    public final boolean mo70005a() {
        if (ApmDelegate.C12507a.f30372a.mo20329a("task_wait_timeout")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
    /* renamed from: b */
    public final boolean mo70007b() {
        if (ApmDelegate.C12507a.f30372a.mo20329a("task_execute_timeout")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
    /* renamed from: c */
    public final void mo70008c(JSONObject jSONObject) {
        C34611o.m70668a("task_blocked", jSONObject);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
    /* renamed from: d */
    public final void mo70010d(JSONObject jSONObject) {
        C34611o.m70668a("task_rejected", jSONObject);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
    /* renamed from: a */
    public final void mo70004a(JSONObject jSONObject) {
        if (jSONObject != null) {
            C34611o.m70668a("task_wait_timeout", jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2719cv.AbstractC40766c
    /* renamed from: b */
    public final void mo70006b(JSONObject jSONObject) {
        if (jSONObject != null) {
            C34611o.m70668a("task_execute_timeout", jSONObject);
        }
    }
}
