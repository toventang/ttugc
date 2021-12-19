package com.bytedance.ies.xbridge.p1349o;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18687l;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.o.c */
public final class C18809c {

    /* renamed from: a */
    public static final C18809c f44600a = new C18809c();

    private C18809c() {
    }

    static {
        Covode.recordClassIndex(21505);
    }

    /* renamed from: a */
    public static JSONObject m34905a(AbstractC18754n nVar) {
        C89219l.m154719c(nVar, "");
        JSONObject jSONObject = new JSONObject();
        AbstractC18687l a = nVar.mo29756a();
        while (a.mo29723a()) {
            String b = a.mo29724b();
            switch (C18810d.f44602b[nVar.mo29767j(b).ordinal()]) {
                case 1:
                    AbstractC18700m g = nVar.mo29764g(b);
                    if (g == null) {
                        break;
                    } else {
                        jSONObject.put(b, m34904a(g));
                        break;
                    }
                case 2:
                    AbstractC18754n h = nVar.mo29765h(b);
                    if (h == null) {
                        break;
                    } else {
                        jSONObject.put(b, m34905a(h));
                        break;
                    }
                case 3:
                    jSONObject.put(b, nVar.mo29763f(b));
                    break;
                case 4:
                    jSONObject.put(b, nVar.mo29760c(b));
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    jSONObject.put(b, nVar.mo29762e(b));
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    jSONObject.put(b, nVar.mo29761d(b));
                    break;
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONArray m34904a(AbstractC18700m mVar) {
        C89219l.m154719c(mVar, "");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = mVar.mo29733b().iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            switch (C18810d.f44601a[mVar.mo29739h(i).ordinal()]) {
                case 1:
                    AbstractC18700m e = mVar.mo29736e(i);
                    if (e == null) {
                        break;
                    } else {
                        jSONArray.put(m34904a(e));
                        break;
                    }
                case 2:
                    AbstractC18754n f = mVar.mo29737f(i);
                    if (f == null) {
                        break;
                    } else {
                        jSONArray.put(m34905a(f));
                        break;
                    }
                case 3:
                    jSONArray.put(mVar.mo29735d(i));
                    break;
                case 4:
                    jSONArray.put(mVar.mo29732b(i));
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    jSONArray.put(mVar.mo29734c(i));
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    jSONArray.put(mVar.mo29731a(i));
                    break;
            }
            i = i2;
        }
        return jSONArray;
    }
}
