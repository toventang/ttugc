package com.bytedance.helios.sdk.p1099f.p1103d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.ApiConfig;
import com.bytedance.helios.api.config.FrequencyConfig;
import com.bytedance.helios.api.config.FrequencyGroupModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.helios.sdk.f.d.a */
public final class C15471a {

    /* renamed from: a */
    public static final Map<String, CopyOnWriteArrayList<Long>> f37704a = new LinkedHashMap();

    /* renamed from: b */
    public static final Map<Integer, List<FrequencyConfig>> f37705b;

    /* renamed from: c */
    public static final C15471a f37706c = new C15471a();

    private C15471a() {
    }

    static {
        Covode.recordClassIndex(17723);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ApiConfig apiConfig = HeliosEnvImpl.INSTANCE.getApiConfig();
        List<FrequencyGroupModel> frequencyGroupModels = HeliosEnvImpl.INSTANCE.getFrequencyGroupModels();
        for (T t : apiConfig.getApiInfoList()) {
            FrequencyConfig frequencyConfig = t.getFrequencyConfig();
            if (frequencyConfig != null) {
                Iterator<T> it = t.getApiIds().iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    Integer valueOf = Integer.valueOf(intValue);
                    List list = (List) linkedHashMap.get(Integer.valueOf(intValue));
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(frequencyConfig);
                    linkedHashMap.put(valueOf, list);
                }
            }
        }
        for (T t2 : frequencyGroupModels) {
            Iterator<T> it2 = t2.getApiIds().iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                Integer valueOf2 = Integer.valueOf(intValue2);
                List list2 = (List) linkedHashMap.get(Integer.valueOf(intValue2));
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(t2.getFrequencyConfig());
                linkedHashMap.put(valueOf2, list2);
            }
        }
        f37705b = linkedHashMap;
    }
}
