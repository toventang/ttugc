package com.facebook.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.d */
public final class C24730d {

    /* renamed from: a */
    private static final Map<Class<?>, AbstractC24738a> f58709a;

    /* renamed from: com.facebook.internal.d$a */
    public interface AbstractC24738a {
        static {
            Covode.recordClassIndex(28891);
        }

        /* renamed from: a */
        void mo40566a(Bundle bundle, String str, Object obj);
    }

    static {
        Covode.recordClassIndex(28883);
        HashMap hashMap = new HashMap();
        f58709a = hashMap;
        hashMap.put(Boolean.class, new AbstractC24738a() {
            /* class com.facebook.internal.C24730d.C247311 */

            static {
                Covode.recordClassIndex(28884);
            }

            @Override // com.facebook.internal.C24730d.AbstractC24738a
            /* renamed from: a */
            public final void mo40566a(Bundle bundle, String str, Object obj) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        });
        hashMap.put(Integer.class, new AbstractC24738a() {
            /* class com.facebook.internal.C24730d.C247322 */

            static {
                Covode.recordClassIndex(28885);
            }

            @Override // com.facebook.internal.C24730d.AbstractC24738a
            /* renamed from: a */
            public final void mo40566a(Bundle bundle, String str, Object obj) {
                bundle.putInt(str, ((Integer) obj).intValue());
            }
        });
        hashMap.put(Long.class, new AbstractC24738a() {
            /* class com.facebook.internal.C24730d.C247333 */

            static {
                Covode.recordClassIndex(28886);
            }

            @Override // com.facebook.internal.C24730d.AbstractC24738a
            /* renamed from: a */
            public final void mo40566a(Bundle bundle, String str, Object obj) {
                bundle.putLong(str, ((Long) obj).longValue());
            }
        });
        hashMap.put(Double.class, new AbstractC24738a() {
            /* class com.facebook.internal.C24730d.C247344 */

            static {
                Covode.recordClassIndex(28887);
            }

            @Override // com.facebook.internal.C24730d.AbstractC24738a
            /* renamed from: a */
            public final void mo40566a(Bundle bundle, String str, Object obj) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }
        });
        hashMap.put(String.class, new AbstractC24738a() {
            /* class com.facebook.internal.C24730d.C247355 */

            static {
                Covode.recordClassIndex(28888);
            }

            @Override // com.facebook.internal.C24730d.AbstractC24738a
            /* renamed from: a */
            public final void mo40566a(Bundle bundle, String str, Object obj) {
                bundle.putString(str, (String) obj);
            }
        });
        hashMap.put(String[].class, new AbstractC24738a() {
            /* class com.facebook.internal.C24730d.C247366 */

            static {
                Covode.recordClassIndex(28889);
            }

            @Override // com.facebook.internal.C24730d.AbstractC24738a
            /* renamed from: a */
            public final void mo40566a(Bundle bundle, String str, Object obj) {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }
        });
        hashMap.put(JSONArray.class, new AbstractC24738a() {
            /* class com.facebook.internal.C24730d.C247377 */

            static {
                Covode.recordClassIndex(28890);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.os.Bundle */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.internal.C24730d.AbstractC24738a
            /* renamed from: a */
            public final void mo40566a(Bundle bundle, String str, Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                    } else {
                        throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                    }
                }
                bundle.putStringArrayList(str, arrayList);
            }
        });
    }

    /* renamed from: a */
    public static Bundle m47358a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m47358a((JSONObject) obj));
                } else {
                    AbstractC24738a aVar = f58709a.get(obj.getClass());
                    if (aVar != null) {
                        aVar.mo40566a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return bundle;
    }
}
