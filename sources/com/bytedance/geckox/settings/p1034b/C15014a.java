package com.bytedance.geckox.settings.p1034b;

import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.p1016d.C14904b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.p1024k.AbstractC14964b;
import com.bytedance.geckox.p1024k.AbstractC14965c;
import com.bytedance.geckox.p1024k.C14966d;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.SettingsRequestBody;
import com.bytedance.geckox.statistic.C15035c;
import com.bytedance.geckox.statistic.model.C15039a;
import com.bytedance.geckox.statistic.model.SettingsUpdateData;
import com.bytedance.geckox.utils.C15044a;
import com.bytedance.geckox.utils.C15059j;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import com.bytedance.p1603q.p1604a.C21926a;
import com.bytedance.p1603q.p1604a.C21927b;
import com.bytedance.p1603q.p1604a.C21928c;
import com.bytedance.p1603q.p1604a.C21929d;
import com.google.gson.p2019b.C27895a;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.bytedance.geckox.settings.b.a */
public class C15014a extends AbstractC21935d<String, GlobalConfigSettings> {

    /* renamed from: a */
    private GeckoGlobalConfig f36682a;

    /* renamed from: b */
    private int f36683b;

    /* renamed from: j */
    private SettingsUpdateData f36684j = new SettingsUpdateData();

    static {
        Covode.recordClassIndex(17159);
    }

    /* renamed from: a */
    private GlobalConfigSettings m27629a() {
        C14966d dVar;
        Pair<String, String> requestTagHeader;
        String str = "https://" + this.f36682a.getHost() + "/gecko/api/settings/v1";
        this.f36684j.f36714ac = C15059j.m27729a(this.f36682a.getContext());
        try {
            SettingsRequestBody settingsRequestBody = new SettingsRequestBody();
            settingsRequestBody.setCommon(new Common(this.f36682a.getAppId(), this.f36682a.getAppVersion(), this.f36682a.getDeviceId(), C15044a.m27705b(this.f36682a.getContext()), C15059j.m27729a(this.f36682a.getContext())));
            SettingsRequestBody.Settings settings = new SettingsRequestBody.Settings(this.f36683b, this.f36682a.getEnv().getVal());
            this.f36684j.settingsInfo = C14904b.f36400a.f36401b.mo46674b(settings);
            settingsRequestBody.setSettings(settings);
            String b = C14904b.f36400a.f36401b.mo46674b(settingsRequestBody);
            C14957a.m27543a("settings request:", b);
            AbstractC14965c netWork = this.f36682a.getNetWork();
            GeckoGlobalConfig d = C14930f.m27473a().mo24033d();
            if (d == null || !(netWork instanceof AbstractC14964b)) {
                dVar = netWork.mo24081a(str, b);
            } else {
                AbstractC14964b bVar = (AbstractC14964b) netWork;
                GeckoGlobalConfig.IRequestTagHeaderProvider requestTagHeaderProvider = d.getRequestTagHeaderProvider();
                HashMap hashMap = new HashMap();
                if (!(requestTagHeaderProvider == null || (requestTagHeader = requestTagHeaderProvider.getRequestTagHeader(true)) == null)) {
                    hashMap.put(requestTagHeader.first, requestTagHeader.second);
                }
                dVar = bVar.mo24083a();
            }
            this.f36684j.httpStatus = dVar.f36556c;
            this.f36684j.logId = C15039a.m27689a(dVar.f36554a);
            if (dVar.f36556c == 200) {
                String str2 = dVar.f36555b;
                C14957a.m27543a("settings response:", str2);
                try {
                    Response response = (Response) C14904b.f36400a.f36401b.mo46671a(str2, new C27895a<Response<GlobalConfigSettings>>() {
                        /* class com.bytedance.geckox.settings.p1034b.C15014a.C150151 */

                        static {
                            Covode.recordClassIndex(17160);
                        }
                    }.type);
                    this.f36684j.errCode = response.status;
                    this.f36684j.errorMsg = response.msg;
                    C15035c.m27680a(this.f36684j);
                    if (response.status != 0 && response.status != 1103) {
                        throw new C21929d(response.status, "request failed, url:" + str + ", code=" + response.status + ", " + response.msg);
                    } else if (response.data != null) {
                        return response.data;
                    } else {
                        throw new C21926a("get settings error,response data is null");
                    }
                } catch (Exception e) {
                    String str3 = "json parse failed：" + str2 + " caused by:" + e.getMessage();
                    this.f36684j.errorMsg = str3;
                    C15035c.m27680a(this.f36684j);
                    throw new C21927b(str3, e);
                }
            } else {
                this.f36684j.errCode = dVar.f36556c;
                this.f36684j.errorMsg = dVar.f36557d;
                throw new NetworkErrorException("net work get failed, code: " + dVar.f36556c + ", url:" + str);
            }
        } catch (IOException e2) {
            this.f36684j.errorMsg = e2.getMessage();
            C15035c.m27680a(this.f36684j);
            throw new C21928c("request failed：url:".concat(String.valueOf(str)), e2);
        } catch (C21928c e3) {
            this.f36684j.errorMsg = e3.getMessage();
            C15035c.m27680a(this.f36684j);
            throw e3;
        } catch (Exception e4) {
            this.f36684j.errorMsg = e4.getMessage();
            C15035c.m27680a(this.f36684j);
            throw new C21928c("request failed：url:".concat(String.valueOf(str)), e4);
        }
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        this.f36682a = (GeckoGlobalConfig) objArr[0];
        this.f36683b = ((Integer) objArr[1]).intValue();
        this.f36684j.apiVersion = "settings_v1";
        this.f36684j.aid = this.f36682a.getAppId();
        this.f36684j.appVersion = this.f36682a.getAppVersion();
        this.f36684j.deviceId = this.f36682a.getDeviceId();
        this.f36684j.region = this.f36682a.getRegion();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final /* synthetic */ Object mo24020a(AbstractC21931b<GlobalConfigSettings> bVar, String str) {
        this.f36684j.reqType = ((Integer) bVar.mo35693a("req_type")).intValue();
        return m27629a();
    }
}
