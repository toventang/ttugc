package com.bytedance.bpea.core.p868a;

import com.bytedance.bpea.core.checker.p871a.AbstractC13370a;
import com.bytedance.bpea.core.checker.p871a.C13373d;
import com.bytedance.bpea.core.checker.p871a.C13376g;
import com.bytedance.bpea.core.p869b.C13360a;
import com.bytedance.bpea.core.p870c.C13362b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.a.f */
public final class C13359f {

    /* renamed from: a */
    public static final C13359f f32644a = new C13359f();

    /* renamed from: b */
    private static final C13358e f32645b = new C13358e();

    /* renamed from: c */
    private static final C13358e f32646c = new C13358e();

    private C13359f() {
    }

    static {
        Covode.recordClassIndex(15355);
    }

    /* renamed from: a */
    public static void m24039a(String str) {
        C89219l.m154719c(str, "");
        C13358e eVar = f32645b;
        C89219l.m154719c(str, "");
        try {
            JSONObject jSONObject = new JSONObject(str);
            eVar.f32639a = jSONObject.optString("limitVersion");
            eVar.f32640b = jSONObject.optString("maxAppVersion");
            eVar.f32641c = jSONObject.optJSONObject("certToLimit");
            eVar.f32642d = jSONObject.optJSONObject("limitToCondition");
            eVar.f32643e = jSONObject.optJSONObject("conditions");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static C13360a<List<AbstractC13370a>> m24040b(String str) {
        String str2 = "";
        C89219l.m154719c(str, str2);
        try {
            C13358e eVar = f32645b;
            String a = eVar.mo21600a(str);
            boolean z = true;
            if (a == null || a.length() == 0) {
                a = f32646c.mo21600a(str);
            }
            if (a != null) {
                if (a.length() != 0) {
                    z = false;
                }
            }
            if (z) {
                return new C13360a<>(-2101, null, null, 6);
            }
            if (C89219l.m154714a((Object) "-1", (Object) a)) {
                C89219l.m154719c("current cert mapped downgrade limit named -1", str2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C13376g());
                return new C13360a<>(0, null, arrayList, 3);
            }
            JSONArray b = eVar.mo21601b(a);
            if (b == null && (b = f32646c.mo21601b(a)) == null) {
                return new C13360a<>(-2102, null, null, 6);
            }
            ArrayList arrayList2 = new ArrayList();
            int length = b.length();
            for (int i = 0; i < length; i++) {
                String optString = b.optString(i);
                C13358e eVar2 = f32645b;
                C89219l.m154709a((Object) optString, str2);
                JSONObject c = eVar2.mo21602c(optString);
                if (c == null && (c = f32646c.mo21602c(optString)) == null) {
                    return new C13360a<>(-2103, null, null, 6);
                }
                AbstractC13370a a2 = C13373d.m24052a(c);
                if (a2 == null) {
                    return new C13360a<>(-2104, null, null, 6);
                }
                arrayList2.add(a2);
            }
            return new C13360a<>(0, null, arrayList2, 3);
        } catch (Throwable th) {
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage != null) {
                str2 = localizedMessage;
            }
            System.currentTimeMillis();
            C13362b.m24046a(str2);
            return new C13360a<>(-1, th.getLocalizedMessage(), null, 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[Catch:{ all -> 0x0091 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.bpea.core.p869b.C13360a<java.util.List<com.bytedance.bpea.core.checker.p871a.AbstractC13370a>> m24041c(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bpea.core.p868a.C13359f.m24041c(java.lang.String):com.bytedance.bpea.core.b.a");
    }
}
