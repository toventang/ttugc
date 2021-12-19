package com.p2082ss.android.ugc.aweme.commercialize.playfun.p2607b;

import android.graphics.Point;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38176c;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38177d;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38304j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.b.a */
public final class C38293a implements AbstractC38304j {

    /* renamed from: a */
    public static final C38293a f90497a = new C38293a();

    private C38293a() {
    }

    static {
        Covode.recordClassIndex(45780);
    }

    /* renamed from: a */
    public static boolean m77672a() {
        if (!C38295b.m77675a()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.b.a$a */
    public static final class CallableC38294a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f90498a;

        /* renamed from: b */
        final /* synthetic */ AwemePlayFunModel f90499b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f90500c;

        /* renamed from: d */
        final /* synthetic */ Aweme f90501d;

        /* renamed from: e */
        final /* synthetic */ String f90502e;

        static {
            Covode.recordClassIndex(45781);
        }

        CallableC38294a(boolean z, AwemePlayFunModel awemePlayFunModel, AwemeRawAd awemeRawAd, Aweme aweme, String str) {
            this.f90498a = z;
            this.f90499b = awemePlayFunModel;
            this.f90500c = awemeRawAd;
            this.f90501d = aweme;
            this.f90502e = str;
        }

        /* access modifiers changed from: public */
        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89391z call() {
            int i;
            List<String> list;
            try {
                boolean z = true;
                if (this.f90498a) {
                    i = 0;
                } else {
                    i = 1;
                }
                JSONObject jSONObject = new JSONObject();
                UrlModel imageInfo = this.f90499b.getImageInfo();
                if (imageInfo != null) {
                    list = imageInfo.getUrlList();
                } else {
                    list = null;
                }
                if (list != null) {
                    if (!list.isEmpty()) {
                        z = false;
                    }
                }
                if (!z) {
                    jSONObject.put("material_url", list.get(0));
                }
                Long creativeId = this.f90500c.getCreativeId();
                C89219l.m154716b(creativeId, "");
                jSONObject.put("creative_id", creativeId.longValue());
                jSONObject.put("log_extra", this.f90500c.getLogExtra());
                jSONObject.put("aweme_id", this.f90501d.getAid());
                IMonitorDepend iMonitorDepend = C16091a.f38742b;
                if (iMonitorDepend == null) {
                    return null;
                }
                iMonitorDepend.monitorStatusRate(this.f90502e, i, jSONObject);
                return C89391z.f203057a;
            } catch (Exception unused) {
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: a */
    private static void m77671a(String str, Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        ExecutorService executorService;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            C89219l.m154716b(awemeRawAd, "");
            AwemePlayFunModel playFunModel = awemeRawAd.getPlayFunModel();
            if (playFunModel != null) {
                CallableC38294a aVar = new CallableC38294a(z, playFunModel, awemeRawAd, aweme, str);
                IAppLogDepend iAppLogDepend = C16091a.f38741a;
                if (iAppLogDepend != null) {
                    executorService = iAppLogDepend.getLogThreadPool();
                } else {
                    executorService = null;
                }
                C1731i.m5640b(aVar, executorService);
            }
        }
    }

    /* renamed from: a */
    public static void m77669a(Aweme aweme, boolean z, String str) {
        AwemeRawAd awemeRawAd;
        if (!m77672a() && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            C38177d.f90185a.mo66478a(new C38176c("playfun", "preload_result", !z ? 1 : 0, System.currentTimeMillis()).mo66471a(aweme.getAid()).mo66473b(awemeRawAd.getCreativeIdStr()).mo66474c(awemeRawAd.getLogExtra()).mo66475d(str));
            m77671a("aweme_ad_play_fun_preload_error_rate", aweme, z);
        }
    }

    /* renamed from: a */
    public static void m77670a(Aweme aweme, boolean z, String str, Point point, Point point2) {
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(str, "");
        if (!m77672a() && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            int i = !z ? 1 : 0;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("state", str);
            if (point != null) {
                hashMap.put("egg_coordinate_x", String.valueOf(point.x));
                hashMap.put("egg_coordinate_y", String.valueOf(point.y));
            }
            if (point2 != null) {
                hashMap.put("text_coordinate_x", String.valueOf(point2.x));
                hashMap.put("text_coordinate_y", String.valueOf(point2.y));
            }
            C38177d.f90185a.mo66478a(new C38176c("playfun", "show_result", i, System.currentTimeMillis()).mo66471a(aweme.getAid()).mo66473b(awemeRawAd.getCreativeIdStr()).mo66474c(awemeRawAd.getLogExtra()).mo66472a(hashMap));
            if (C89219l.m154714a((Object) str, (Object) "display")) {
                m77671a("aweme_ad_play_fun_show_error_rate", aweme, z);
            }
        }
    }
}
