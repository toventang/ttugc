package com.twitter.sdk.android.core.models;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28026s;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.kakao.usermgmt.StringSet;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BindingValuesAdapter implements AbstractC28018k<C87801c>, AbstractC28026s<C87801c> {
    static {
        Covode.recordClassIndex(103795);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.AbstractC28026s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC28019l mo16610a(C87801c cVar) {
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* synthetic */ C87801c mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        if (!(lVar instanceof C28022o)) {
            return new C87801c();
        }
        Set<Map.Entry<String, AbstractC28019l>> entrySet = lVar.mo46789j().f65804a.entrySet();
        HashMap hashMap = new HashMap(32);
        for (Map.Entry<String, AbstractC28019l> entry : entrySet) {
            String key = entry.getKey();
            C28022o j = entry.getValue().mo46789j();
            AbstractC28019l c = j.mo46803c(StringSet.type);
            Object obj = null;
            if (c != null && (c instanceof C28025r)) {
                String c2 = c.mo46689c();
                c2.hashCode();
                switch (c2.hashCode()) {
                    case -1838656495:
                        if (!c2.equals("STRING")) {
                            break;
                        } else {
                            obj = jVar.mo46724a(j.mo46803c("string_value"), String.class);
                            continue;
                        }
                    case 2614219:
                        if (!c2.equals("USER")) {
                            break;
                        } else {
                            obj = jVar.mo46724a(j.mo46803c("user_value"), C87803e.class);
                            continue;
                        }
                    case 69775675:
                        if (!c2.equals("IMAGE")) {
                            break;
                        } else {
                            obj = jVar.mo46724a(j.mo46803c("image_value"), C87802d.class);
                            continue;
                        }
                    case 782694408:
                        if (!c2.equals("BOOLEAN")) {
                            break;
                        } else {
                            obj = jVar.mo46724a(j.mo46803c("boolean_value"), Boolean.class);
                            continue;
                        }
                }
            }
            hashMap.put(key, obj);
        }
        return new C87801c(hashMap);
    }
}
