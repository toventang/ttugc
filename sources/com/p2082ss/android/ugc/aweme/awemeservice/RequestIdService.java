package com.p2082ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.RequestIdService */
public class RequestIdService implements IRequestIdService {

    /* renamed from: a */
    private Map<String, IRequestIdService.C34287a> f81042a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41209);
    }

    /* renamed from: a */
    public static IRequestIdService m70076a() {
        MethodCollector.m26663i(11976);
        Object a = C81908b.m141854a(IRequestIdService.class, false);
        if (a != null) {
            IRequestIdService iRequestIdService = (IRequestIdService) a;
            MethodCollector.m26664o(11976);
            return iRequestIdService;
        }
        if (C81908b.f183135R == null) {
            synchronized (IRequestIdService.class) {
                try {
                    if (C81908b.f183135R == null) {
                        C81908b.f183135R = new RequestIdService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11976);
                    throw th;
                }
            }
        }
        RequestIdService requestIdService = (RequestIdService) C81908b.f183135R;
        MethodCollector.m26664o(11976);
        return requestIdService;
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    /* renamed from: a */
    public final IRequestIdService.C34287a mo60692a(String str) {
        IRequestIdService.C34287a aVar = this.f81042a.get(str);
        if (aVar == null) {
            return new IRequestIdService.C34287a();
        }
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    /* renamed from: a */
    public final String mo60693a(Aweme aweme, int i) {
        IRequestIdService.C34287a a;
        if (aweme == null || (a = mo60692a(aweme.getAid() + i)) == null) {
            return "";
        }
        return a.f81071a;
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    /* renamed from: b */
    public final JSONObject mo60695b(Aweme aweme, int i) {
        String str;
        if (aweme == null) {
            return new JSONObject();
        }
        String str2 = aweme.getAid() + i;
        JSONObject jSONObject = new JSONObject();
        try {
            IRequestIdService.C34287a a = mo60692a(str2);
            String str3 = a.f81071a;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("request_id", str3);
            }
            if (a.f81072b != null) {
                jSONObject.put("order", a.f81072b);
            }
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject.put("is_photo", str);
            if (aweme.playlist_info == null || TextUtils.isEmpty(aweme.playlist_info.getMixId())) {
                return jSONObject;
            }
            jSONObject.put("playlist_id", aweme.playlist_info.getMixId());
            return jSONObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    /* renamed from: a */
    public final void mo60694a(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f81042a.put(str, new IRequestIdService.C34287a(str2, i));
        }
    }
}
