package com.appsflyer.share;

import android.content.Context;
import com.C1764a;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class LinkGenerator {

    /* renamed from: ı */
    private String f7134;

    /* renamed from: Ɩ */
    private String f7135;

    /* renamed from: ǃ */
    private String f7136;

    /* renamed from: ɨ */
    private String f7137;

    /* renamed from: ɩ */
    String f7138;

    /* renamed from: ɪ */
    private String f7139;

    /* renamed from: ɹ */
    private String f7140;

    /* renamed from: ɾ */
    private Map<String, String> f7141 = new HashMap();

    /* renamed from: Ι */
    private String f7142;

    /* renamed from: ι */
    String f7143;

    /* renamed from: І */
    private String f7144;

    /* renamed from: і */
    private String f7145;

    /* renamed from: Ӏ */
    private String f7146;

    /* renamed from: ӏ */
    private Map<String, String> f7147 = new HashMap();

    static {
        Covode.recordClassIndex(2622);
    }

    public String getBrandDomain() {
        return this.f7139;
    }

    public String getCampaign() {
        return this.f7136;
    }

    public String getChannel() {
        return this.f7142;
    }

    public String getMediaSource() {
        return this.f7134;
    }

    public Map<String, String> getParameters() {
        return this.f7141;
    }

    public String generateLink() {
        return m7166().toString();
    }

    /* renamed from: ǃ */
    private StringBuilder m7166() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.f7138;
        if (str2 == null || !str2.startsWith("http")) {
            sb.append(ServerConfigHandler.getUrl(Constants.f7128));
        } else {
            sb.append(this.f7138);
        }
        if (this.f7143 != null) {
            sb.append('/').append(this.f7143);
        }
        this.f7147.put("pid", this.f7134);
        sb.append('?').append("pid=").append(m7167(this.f7134, "media source"));
        String str3 = this.f7145;
        if (str3 != null) {
            this.f7147.put("af_referrer_uid", str3);
            sb.append('&').append("af_referrer_uid=").append(m7167(this.f7145, "referrerUID"));
        }
        String str4 = this.f7142;
        if (str4 != null) {
            this.f7147.put("af_channel", str4);
            sb.append('&').append("af_channel=").append(m7167(this.f7142, "channel"));
        }
        String str5 = this.f7140;
        if (str5 != null) {
            this.f7147.put("af_referrer_customer_id", str5);
            sb.append('&').append("af_referrer_customer_id=").append(m7167(this.f7140, "referrerCustomerId"));
        }
        String str6 = this.f7136;
        if (str6 != null) {
            this.f7147.put("c", str6);
            sb.append('&').append("c=").append(m7167(this.f7136, "campaign"));
        }
        String str7 = this.f7144;
        if (str7 != null) {
            this.f7147.put("af_referrer_name", str7);
            sb.append('&').append("af_referrer_name=").append(m7167(this.f7144, "referrerName"));
        }
        String str8 = this.f7146;
        if (str8 != null) {
            this.f7147.put("af_referrer_image_url", str8);
            sb.append('&').append("af_referrer_image_url=").append(m7167(this.f7146, "referrerImageURL"));
        }
        if (this.f7137 != null) {
            StringBuilder append = new StringBuilder().append(this.f7137);
            String str9 = "";
            if (this.f7137.endsWith("/")) {
                str = str9;
            } else {
                str = "/";
            }
            append.append(str);
            String str10 = this.f7135;
            if (str10 != null) {
                append.append(str10);
            }
            this.f7147.put("af_dp", append.toString());
            sb.append('&').append("af_dp=").append(m7167(this.f7137, "baseDeeplink"));
            if (this.f7135 != null) {
                if (!this.f7137.endsWith("/")) {
                    str9 = "%2F";
                }
                sb.append(str9).append(m7167(this.f7135, "deeplinkPath"));
            }
        }
        for (String str11 : this.f7141.keySet()) {
            if (!sb.toString().contains(new StringBuilder().append(str11).append("=").append(m7167(this.f7141.get(str11), str11)).toString())) {
                sb.append('&').append(str11).append('=').append(m7167(this.f7141.get(str11), str11));
            }
        }
        return sb;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.f7137 = str;
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.f7139 = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.f7136 = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.f7142 = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f7135 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.f7140 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f7146 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f7144 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.f7145 = str;
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.f7141.putAll(map);
        }
        return this;
    }

    public LinkGenerator(String str) {
        this.f7134 = str;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.f7141.put(str, str2);
        return this;
    }

    /* renamed from: Ι */
    private static String m7167(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException unused) {
            AFLogger.afInfoLog(new StringBuilder("Illegal ").append(str2).append(": ").append(str).toString());
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        if (!this.f7141.isEmpty()) {
            for (Map.Entry<String, String> entry : this.f7141.entrySet()) {
                this.f7147.put(entry.getKey(), entry.getValue());
            }
        }
        m7166();
        String str = this.f7139;
        Map<String, String> map = this.f7147;
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, AppsFlyerLibCore.getInstance(), context, AppsFlyerLib.getInstance().isTrackingStopped());
        createOneLinkHttpTask.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        createOneLinkHttpTask.setListener(responseListener);
        createOneLinkHttpTask.setBrandDomain(str);
        AFExecutor.getInstance().getThreadPoolExecutor().execute(createOneLinkHttpTask);
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.f7138 = C1764a.m5928a("https://%s/%s", new Object[]{ServerConfigHandler.getUrl("%sapp.%s"), str3});
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.f7138 = C1764a.m5928a("https://%s/%s", new Object[]{str2, str});
        }
        return this;
    }
}
