package com.p2082ss.android.ugc.aweme.live;

import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.live.settings.C58758a;
import com.p2082ss.android.ugc.aweme.live.settings.C58760c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.aj */
public final class C58501aj implements AbstractC58646i {
    static {
        Covode.recordClassIndex(68792);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58646i
    /* renamed from: a */
    public final AbstractC58644h mo95877a() {
        return C58498ah.f133172a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58646i
    /* renamed from: b */
    public final AbstractC58719m mo95881b() {
        return C58758a.f133725a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58646i
    /* renamed from: a */
    public final void mo95880a(C58760c cVar) {
        C28022o oVar;
        if (cVar != null && cVar.status_code == 0 && (oVar = cVar.f133728a) != null) {
            C11755f.m20714a(C17867d.m33078a(), oVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58646i
    /* renamed from: a */
    public final Map<String, Object> mo95879a(List<String> list) {
        HashMap hashMap = new HashMap();
        AbstractC11846d a = C11755f.m20713a();
        if (a == null) {
            return hashMap;
        }
        JSONObject p = a.mo13035p();
        for (String str : list) {
            Object opt = p.opt(str);
            if (opt != null) {
                hashMap.put(str, opt);
            }
        }
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58646i
    /* renamed from: a */
    public final <T> T mo95878a(String str, T t) {
        return (T) Live.getService().mo12981a(str, (Object) t);
    }
}
