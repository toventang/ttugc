package com.bytedance.globalpayment.iap.common.ability.p1061h;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.JsonName;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.h.b */
public class C15157b {

    /* renamed from: a */
    private static final String f36991a = C15157b.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17325);
    }

    /* renamed from: a */
    public static <T> T m27885a(String str, Class<T> cls) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            T newInstance = cls.newInstance();
            Field[] fields = cls.getFields();
            for (Field field : fields) {
                JsonName jsonName = (JsonName) field.getAnnotation(JsonName.class);
                if (jsonName != null) {
                    Object opt = jSONObject.opt(jsonName.value());
                    if (opt instanceof JSONObject) {
                        field.set(newInstance, m27885a(opt.toString(), field.getType()));
                    } else if (!(opt instanceof JSONArray)) {
                        field.set(newInstance, opt);
                    }
                }
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            C15253a.m28071a().mo24705e();
            e.getLocalizedMessage();
            return null;
        } catch (InstantiationException e2) {
            C15253a.m28071a().mo24705e();
            e2.getLocalizedMessage();
            return null;
        } catch (JSONException e3) {
            C15253a.m28071a().mo24705e();
            e3.getLocalizedMessage();
            return null;
        }
    }
}
