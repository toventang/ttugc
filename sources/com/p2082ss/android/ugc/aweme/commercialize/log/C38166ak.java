package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.view.View;
import com.bytedance.android.p126a.p127a.p131d.C2626b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b;
import com.p2082ss.android.p2092ad.splash.core.p2104i.C29506c;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ak */
public final class C38166ak implements AbstractC29505b {

    /* renamed from: a */
    public static final C38166ak f90146a = new C38166ak();

    private C38166ak() {
    }

    static {
        Covode.recordClassIndex(45645);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: a */
    public final void mo51601a(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        mo51602a(view, "show", j, list, str, z, j2, jSONObject, cVar);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: b */
    public final void mo51603b(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        mo51602a(view, "click", j, list, str, z, j2, jSONObject, cVar);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: c */
    public final void mo51604c(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        mo51602a(view, "play", j, list, str, z, j2, jSONObject, cVar);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: d */
    public final void mo51605d(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        mo51602a(view, "play_over", j, list, str, z, j2, jSONObject, cVar);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: a */
    public final void mo51602a(View view, String str, long j, List<String> list, String str2, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        long j3;
        C2626b.C2627a aVar = new C2626b.C2627a();
        aVar.f7898f = str;
        aVar.f7893a = j;
        C2626b.C2627a a = aVar.mo7145a(list);
        a.f7896d = str2;
        a.f7894b = z;
        a.f7895c = j2;
        a.f7897e = jSONObject;
        a.f7900h = true;
        if (cVar != null) {
            j3 = cVar.f70263a;
        } else {
            j3 = -1;
        }
        a.f7899g = j3;
        C38168am.f90152b.mo66468a().mo7147a(a.mo7146a());
    }
}
