package com.p2082ss.ttuploader.net;

import android.os.Handler;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.ttuploader.TTUploadLog;
import com.p2082ss.ttuploader.net.TTVNetClient;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.net.HTTPDNS */
public class HTTPDNS extends BaseDNS {
    private static String mGlobalGoogleDNSParseHost = "";
    private static String mGlobalOwnDNSParseHost = "";
    private static String mGoogleDNSServerPath = "/resolve?name=";
    private static String mTTDNSServerPath = "/q?host=";
    private int mHttpDNSType = 2;
    private Object mSource;
    private long mSourceId;

    @Override // com.p2082ss.ttuploader.net.BaseDNS
    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    static {
        Covode.recordClassIndex(101505);
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        int i = this.mHttpDNSType;
        if (i == 2 || i == 1) {
            sb.append("https://" + mGlobalOwnDNSParseHost + mTTDNSServerPath);
        } else if (i == 3) {
            sb.append("https://" + mGlobalGoogleDNSParseHost + mGoogleDNSServerPath);
        }
        sb.append(this.mHostname);
        return sb.toString();
    }

    @Override // com.p2082ss.ttuploader.net.BaseDNS
    public void start() {
        String _getURL = _getURL();
        Method[] declaredMethods = this.mNetClient.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(_getURL, null, null, 0, new TTVNetClient.CompletionListener() {
                    /* class com.p2082ss.ttuploader.net.HTTPDNS.C862921 */

                    static {
                        Covode.recordClassIndex(101506);
                    }

                    @Override // com.p2082ss.ttuploader.net.TTVNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNS.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(_getURL, null, new TTVNetClient.CompletionListener() {
            /* class com.p2082ss.ttuploader.net.HTTPDNS.C862932 */

            static {
                Covode.recordClassIndex(101507);
            }

            @Override // com.p2082ss.ttuploader.net.TTVNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNS.this._handleResponse(jSONObject, error);
            }
        });
    }

    private TTUploadDNSInfo parserResult(JSONObject jSONObject) {
        long j;
        String str;
        int i = this.mHttpDNSType;
        String str2 = "";
        int i2 = 60;
        if (i == 2 || i == 1) {
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                TTUploadLog.m148564d("HTTPDNS", C1764a.m5928a("no ips in json, type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
                return null;
            }
            if (jSONObject.has("ttl")) {
                i2 = jSONObject.optInt("ttl");
            }
            j = ((long) (i2 * 1000)) + System.currentTimeMillis();
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
        } else {
            j = 0;
            str = null;
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
                j = System.currentTimeMillis() + ((long) (i2 * 1000));
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return new TTUploadDNSInfo(this.mHttpDNSType, this.mHostname, str2, j, this.mId);
    }

    public static void setDNSServerHost(String str, String str2) {
        MethodCollector.m26663i(12831);
        synchronized (HTTPDNS.class) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    mGlobalOwnDNSParseHost = str;
                }
                if (!TextUtils.isEmpty(str2)) {
                    mGlobalGoogleDNSParseHost = str2;
                }
            } finally {
                MethodCollector.m26664o(12831);
            }
        }
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        TTUploadLog.m148564d("HTTPDNS", C1764a.m5928a("****http dns id:%s", new Object[]{this.mId}));
        TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(this.mHttpDNSType, this.mHostname, null, 0, this.mId);
        if (error != null) {
            tTUploadDNSInfo.mErrorStr = error.errStr;
        } else if (jSONObject == null || jSONObject.length() == 0) {
            TTUploadLog.m148564d("HTTPDNS", C1764a.m5928a("http dns json is empty type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
        } else {
            TTUploadDNSInfo parserResult = parserResult(jSONObject);
            if (parserResult != null) {
                IPCache.getInstance().put(this.mHostname, parserResult);
                notifySuccess(parserResult);
                return;
            }
        }
        notifyError(tTUploadDNSInfo);
    }

    public HTTPDNS(String str, TTVNetClient tTVNetClient, int i, Handler handler) {
        super(str, tTVNetClient, handler);
        this.mHttpDNSType = i;
    }
}
