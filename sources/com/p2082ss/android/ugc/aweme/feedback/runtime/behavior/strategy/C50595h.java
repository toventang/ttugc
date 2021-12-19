package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.C50580b;
import com.p2082ss.android.ugc.aweme.runtime.behavior.C67212c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.h */
public final class C50595h extends AbstractC50584a {

    /* renamed from: a */
    public static final C50596a f116902a = new C50596a((byte) 0);

    static {
        Covode.recordClassIndex(59751);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "abnor_player";
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.h$a */
    public static final class C50596a {
        static {
            Covode.recordClassIndex(59752);
        }

        private C50596a() {
        }

        public /* synthetic */ C50596a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: b */
    public final long mo85930b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: c */
    public final String mo85931c() {
        long currentTimeMillis = System.currentTimeMillis() - mo85930b();
        List<C67212c> a = C50580b.m94818a("block", currentTimeMillis);
        List<C67212c> a2 = C50580b.m94818a("error", currentTimeMillis);
        JSONObject jSONObject = new JSONObject();
        if (!a.isEmpty()) {
            jSONObject.put("block_count", a.size());
        }
        if (!a2.isEmpty()) {
            jSONObject.put("error_count", a2.size());
            JSONArray jSONArray = new JSONArray();
            for (C67212c cVar : a2) {
                if (cVar != null) {
                    jSONArray.put(new JSONObject(cVar.f150639d));
                }
            }
            jSONObject.put("error_code_msg", jSONArray);
        }
        String jSONObject2 = jSONObject.toString();
        C89219l.m154716b(jSONObject2, "");
        return jSONObject2;
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final boolean mo85929a(String str) {
        C89219l.m154721d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != 93832333) {
            if (hashCode == 96784904 && str.equals("error")) {
                return true;
            }
            return false;
        } else if (str.equals("block")) {
            return true;
        } else {
            return false;
        }
    }
}
