package com.bytedance.sdk.bdlynx.p1692f;

import android.content.Context;
import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.bdpbase.util.DevicesUtil;
import com.bytedance.bdp.bdpbase.util.UIUtils;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpHostInfo;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpInfoService;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1677a.C22588a;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.f.a */
public final class C22660a {

    /* renamed from: a */
    public static final C22660a f53527a = new C22660a();

    /* renamed from: b */
    private static JSONObject f53528b;

    /* renamed from: c */
    private static final AbstractC89244h f53529c = C89250i.m154773a((AbstractC89171a) C22661a.f53530a);

    /* renamed from: b */
    private static BdpInfoService m42731b() {
        return (BdpInfoService) f53529c.getValue();
    }

    private C22660a() {
    }

    /* renamed from: com.bytedance.sdk.bdlynx.f.a$a */
    static final class C22661a extends AbstractC89220m implements AbstractC89171a<BdpInfoService> {

        /* renamed from: a */
        public static final C22661a f53530a = new C22661a();

        static {
            Covode.recordClassIndex(26478);
        }

        C22661a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BdpInfoService invoke() {
            return BdpManager.getInst().getService(BdpInfoService.class);
        }
    }

    static {
        Covode.recordClassIndex(26477);
    }

    /* renamed from: a */
    public static JSONObject m42730a() {
        JSONObject jSONObject = f53528b;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            BdpInfoService b = m42731b();
            C89219l.m154709a((Object) b, "");
            BdpHostInfo hostInfo = b.getHostInfo();
            C89219l.m154709a((Object) hostInfo, "");
            jSONObject.put("deviceId", hostInfo.getDeviceId());
            BdpInfoService b2 = m42731b();
            C89219l.m154709a((Object) b2, "");
            BdpHostInfo hostInfo2 = b2.getHostInfo();
            C89219l.m154709a((Object) hostInfo2, "");
            jSONObject.put("aid", hostInfo2.getAppId());
            BdpInfoService b3 = m42731b();
            C89219l.m154709a((Object) b3, "");
            BdpHostInfo hostInfo3 = b3.getHostInfo();
            C89219l.m154709a((Object) hostInfo3, "");
            jSONObject.put("appName", hostInfo3.getAppName());
            BdpInfoService b4 = m42731b();
            C89219l.m154709a((Object) b4, "");
            BdpHostInfo hostInfo4 = b4.getHostInfo();
            C89219l.m154709a((Object) hostInfo4, "");
            jSONObject.put("appVersion", hostInfo4.getVersionName());
            jSONObject.put("deviceModel", DevicesUtil.getModel());
            jSONObject.put("osVersion", DevicesUtil.getSystem());
            Context context = C22588a.f53372a;
            if (context != null) {
                jSONObject.put("statusBarHeight", UIUtils.px2dip(context, (float) DevicesUtil.getStatusBarHeight(context)));
                jSONObject.put("screenWidth", UIUtils.px2dip(context, (float) DevicesUtil.getScreenWidth(context)));
                jSONObject.put("screenHeight", UIUtils.px2dip(context, (float) DevicesUtil.getScreenHight(context)));
            }
            f53528b = jSONObject;
        }
        return jSONObject;
    }
}
