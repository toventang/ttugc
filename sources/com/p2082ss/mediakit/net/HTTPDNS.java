package com.p2082ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import com.p2082ss.mediakit.net.AVMDLNetClient;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.mediakit.net.HTTPDNS */
public class HTTPDNS extends BaseDNS {
    private static String mGoogleDNSServer = "/resolve?name=";
    private static String mTTDNSServer = "/q?host=";
    private int mHttpDNSType = 2;
    private Object mSource;
    private long mSourceId;

    static {
        Covode.recordClassIndex(101248);
    }

    @Override // com.p2082ss.mediakit.net.BaseDNS
    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        int i = this.mHttpDNSType;
        if (i == 2 || i == 1) {
            sb.append("https://" + AVMDLDNSParser.mGlobalOwnDNSParseHost + mTTDNSServer);
        } else if (i == 3) {
            sb.append("https://" + AVMDLDNSParser.mGlobalGoogleDNSParseHost + mGoogleDNSServer);
        }
        sb.append(this.mHostname);
        int i2 = this.mHttpDNSType;
        if (i2 == 2 || i2 == 1) {
            sb.append("&source=vod");
        }
        return sb.toString();
    }

    @Override // com.p2082ss.mediakit.net.BaseDNS
    public void start() {
        String _getURL = _getURL();
        AVMDLLog.m147905d("HTTPDNS", "http dns url:".concat(String.valueOf(_getURL)));
        Method[] declaredMethods = this.mNetClient.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(_getURL, null, null, 0, new AVMDLNetClient.CompletionListener() {
                    /* class com.p2082ss.mediakit.net.HTTPDNS.C861171 */

                    static {
                        Covode.recordClassIndex(101249);
                    }

                    @Override // com.p2082ss.mediakit.net.AVMDLNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNS.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(_getURL, null, new AVMDLNetClient.CompletionListener() {
            /* class com.p2082ss.mediakit.net.HTTPDNS.C861182 */

            static {
                Covode.recordClassIndex(101250);
            }

            @Override // com.p2082ss.mediakit.net.AVMDLNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNS.this._handleResponse(jSONObject, error);
            }
        });
    }

    private AVMDLDNSInfo parserResult(JSONObject jSONObject) {
        long j;
        String str;
        int i = this.mHttpDNSType;
        String str2 = "";
        int i2 = 60;
        if (i != 2 && i != 1) {
            j = 0;
            str = null;
        } else if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        } else {
            if (jSONObject.has("ttl")) {
                i2 = jSONObject.optInt("ttl");
            }
            AVMDLLog.m147905d("HTTPDNS", C1764a.m5928a("receive expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(i2), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
            if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                i2 = AVMDLDNSParser.mGlobalForceExpiredTime;
            }
            j = System.currentTimeMillis() + ((long) (i2 * 1000));
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            str = null;
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                try {
                    str = optJSONArray.getString(i3);
                } catch (Exception e) {
                    e.printStackTrace();
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = TextUtils.isEmpty(str2) ? str2 + str : str2 + "," + str;
                }
            }
        }
        if (this.mHttpDNSType == 3) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("Answer");
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                    if (jSONObject2.has(StringSet.type) && jSONObject2.getInt(StringSet.type) == 1) {
                        if (jSONObject2.has("TTL")) {
                            i2 = jSONObject2.optInt("TTL");
                        }
                        if (jSONObject2.has("data")) {
                            str = jSONObject2.optString("data");
                        }
                        if (!TextUtils.isEmpty(str)) {
                            str2 = TextUtils.isEmpty(str2) ? str2 + str : str2 + "," + str;
                        }
                    }
                }
                AVMDLLog.m147905d("HTTPDNS", C1764a.m5928a("receive expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(i2), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                    i2 = AVMDLDNSParser.mGlobalForceExpiredTime;
                }
                j = System.currentTimeMillis() + ((long) (i2 * 1000));
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return new AVMDLDNSInfo(this.mHttpDNSType, this.mHostname, str2, j, this.mId);
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        AVMDLLog.m147905d("HTTPDNS", C1764a.m5928a("****http dns id:%s type:%d host:%s", new Object[]{this.mId, Integer.valueOf(this.mHttpDNSType), this.mHostname}));
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(this.mHttpDNSType, this.mHostname, (String) null, 0, this.mId);
        if (error != null) {
            aVMDLDNSInfo.mErrorStr = error.errStr;
            AVMDLLog.m147905d("HTTPDNS", C1764a.m5928a("handle response receive err:%s", new Object[]{error.errStr}));
        } else if (jSONObject == null || jSONObject.length() == 0) {
            new Error(this.mHttpDNSType, this.mHostname, this.mId, C1764a.m5928a("HTTP dns empty, type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
            AVMDLLog.m147905d("HTTPDNS", C1764a.m5928a("json null err", new Object[0]));
        } else {
            try {
                AVMDLDNSInfo parserResult = parserResult(jSONObject);
                if (parserResult == null) {
                    AVMDLLog.m147905d("HTTPDNS", C1764a.m5928a("info null err", new Object[0]));
                } else {
                    AVMDLLog.m147905d("HTTPDNS", C1764a.m5928a("****parse suc for host:%s iplist:%s", new Object[]{this.mHostname, parserResult.mIpList}));
                    IPCache.getInstance().put(this.mHostname, parserResult);
                    notifySuccess(parserResult);
                    return;
                }
            } catch (Throwable th) {
                AVMDLLog.m147905d("HTTPDNS", C1764a.m5928a("handle response exception:%s", new Object[]{th.toString()}));
            }
        }
        AVMDLLog.m147905d("HTTPDNS", C1764a.m5928a("****parse failed for host:%s", new Object[]{this.mHostname}));
        notifyError(aVMDLDNSInfo);
    }

    public HTTPDNS(String str, AVMDLNetClient aVMDLNetClient, int i, Handler handler) {
        super(str, aVMDLNetClient, handler);
        this.mHttpDNSType = i;
    }
}
