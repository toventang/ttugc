package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.g */
public final class C24946g {

    /* renamed from: com.facebook.share.internal.g$a */
    public interface AbstractC24947a {
        static {
            Covode.recordClassIndex(30251);
        }

        /* renamed from: a */
        JSONObject mo40816a(SharePhoto sharePhoto);
    }

    static {
        Covode.recordClassIndex(30250);
    }

    private C24946g() {
    }

    /* renamed from: a */
    private static JSONArray m47820a(List list, AbstractC24947a aVar) {
        if (C24677a.m47209a(C24946g.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Object obj : list) {
                jSONArray.put(m47819a(obj, aVar));
            }
            return jSONArray;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24946g.class);
            return null;
        }
    }

    /* renamed from: a */
    private static Object m47819a(Object obj, AbstractC24947a aVar) {
        if (C24677a.m47209a(C24946g.class)) {
            return null;
        }
        if (obj == null) {
            try {
                return JSONObject.NULL;
            } catch (Throwable th) {
                C24677a.m47208a(th, C24946g.class);
                return null;
            }
        } else {
            if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer)) {
                if (!(obj instanceof Long)) {
                    if (obj instanceof SharePhoto) {
                        if (aVar != null) {
                            return aVar.mo40816a((SharePhoto) obj);
                        }
                        return null;
                    } else if (obj instanceof ShareOpenGraphObject) {
                        return m47822a((ShareOpenGraphObject) obj, aVar);
                    } else {
                        if (obj instanceof List) {
                            return m47820a((List) obj, aVar);
                        }
                        throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
                    }
                }
            }
            return obj;
        }
    }

    /* renamed from: a */
    public static JSONObject m47821a(ShareOpenGraphAction shareOpenGraphAction, AbstractC24947a aVar) {
        if (C24677a.m47209a(C24946g.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphAction.f59289a.keySet()) {
                jSONObject.put(str, m47819a(shareOpenGraphAction.mo40870a(str), aVar));
            }
            return jSONObject;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24946g.class);
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m47822a(ShareOpenGraphObject shareOpenGraphObject, AbstractC24947a aVar) {
        if (C24677a.m47209a(C24946g.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphObject.f59289a.keySet()) {
                jSONObject.put(str, m47819a(shareOpenGraphObject.mo40870a(str), aVar));
            }
            return jSONObject;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24946g.class);
            return null;
        }
    }
}
