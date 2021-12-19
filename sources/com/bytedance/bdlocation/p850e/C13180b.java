package com.bytedance.bdlocation.p850e;

import android.text.TextUtils;
import com.bytedance.bdlocation.C13182f;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.p850e.p852b.C13181a;
import com.bytedance.bdlocation.p853f.C13183a;
import com.bytedance.bdlocation.service.C13190a;
import com.bytedance.bdlocation.service.C13211k;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.bdlocation.e.b */
public final class C13180b {
    static {
        Covode.recordClassIndex(15127);
    }

    /* renamed from: a */
    public static String m23702a() {
        String str = C13153b.f32062u;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        C13162b.m23685a("BDLocation", "Set the domain name of the business itself when initialization is required:BDLocationConfig.setBaseUrl(\"xxxx\")", null);
        return "";
    }

    /* renamed from: b */
    public static List<C22027b> m23705b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C22027b("Content-Type", "application/json"));
        return arrayList;
    }

    /* renamed from: a */
    public static String m23703a(String str, TypedString typedString, Map<String, String> map, List<C22027b> list) {
        AbstractC13168a aVar = C13153b.f32066y;
        if (aVar == null) {
            return ((INetworkApi) RetrofitUtils.m43281a(m23702a(), INetworkApi.class)).postBody(-1, str, map, typedString, list).execute().f52262b;
        }
        try {
            return aVar.mo21274a(m23702a(), str, map, typedString, list, true);
        } catch (Exception e) {
            C13162b.m23685a("BDLocation", "BDRegionLocation", e);
            C13162b.m23690d("BDRegionLocation Upload: Exception", "ServerApi--submitResult---end");
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m23704a(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            C13181a aVar = (C13181a) C13182f.f32181a.mo46670a(str, C13181a.class);
            if (aVar == null) {
                return true;
            }
            if (aVar.f32178a == 0) {
                C13162b.m23689c("BDRegionLocation Upload: success", aVar.f32180c + "---end");
                if (C13211k.f32286a.equals(str2)) {
                    C13183a aVar2 = C13190a.m23731a().f32206a;
                    aVar2.mo21284a("last_upload_interval", System.currentTimeMillis());
                    aVar2.mo21283a("uploadCount", aVar2.mo21281a("uploadCount") + 1);
                }
                C13162b.m23683a(str3);
                return true;
            }
            C13162b.m23683a(str4);
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            C13162b.m23689c("BDRegionLocation Upload: Exception", "ServerApi--analysisUploadLocationResult---end" + e.getMessage());
            C13162b.m23683a(str4);
            return false;
        }
    }
}
