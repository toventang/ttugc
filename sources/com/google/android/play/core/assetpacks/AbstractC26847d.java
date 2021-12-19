package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.d */
public abstract class AbstractC26847d {
    static {
        Covode.recordClassIndex(32322);
    }

    /* renamed from: a */
    public abstract long mo44474a();

    /* renamed from: b */
    public abstract Map<String, AssetPackState> mo44475b();

    /* renamed from: a */
    static AbstractC26847d m53312a(Bundle bundle, C26791ay ayVar, List<String> list, AbstractC26881z zVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m53161a(bundle, str, ayVar, zVar));
        }
        for (String str2 : list) {
            hashMap.put(str2, AssetPackState.m53162a(str2, 4, 0, 0, 0, 0.0d, 1));
        }
        return new C26775ai(bundle.getLong("total_bytes_to_download"), hashMap);
    }
}
