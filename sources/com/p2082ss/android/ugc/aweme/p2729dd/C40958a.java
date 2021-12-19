package com.p2082ss.android.ugc.aweme.p2729dd;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feedback.C50568c;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.dd.a */
public final class C40958a {

    /* renamed from: a */
    public static C40958a f95791a;

    /* renamed from: b */
    final Context f95792b = C17867d.m33078a();

    static {
        Covode.recordClassIndex(48810);
    }

    public C40958a() {
        AbstractC88979t.m154294a(new C40960b(this)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143062b((AbstractC88986z) new AbstractC88986z<C50568c>() {
            /* class com.p2082ss.android.ugc.aweme.p2729dd.C40958a.C409591 */

            static {
                Covode.recordClassIndex(48811);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88986z
            public final /* bridge */ /* synthetic */ void onNext(C50568c cVar) {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
            }
        });
    }

    /* renamed from: a */
    public final void mo70142a(JSONObject jSONObject) {
        if (jSONObject != null) {
            C50568c cVar = new C50568c();
            cVar.f116861a = jSONObject.optInt("update_sdk", 1);
            cVar.f116862b = jSONObject.optInt("pre_download_version", 0);
            cVar.f116863c = jSONObject.optInt("pre_download_start_time", 0);
            cVar.f116864d = jSONObject.optInt("pre_download_delay_days", 0);
            cVar.f116865e = jSONObject.optLong("pre_download_delay_second", -1);
            C36145b.m73641b().mo63264a(this.f95792b, "update_params", cVar);
        }
    }
}
