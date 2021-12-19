package com.p2082ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import com.p2082ss.mediakit.net.AVMDLNetClient;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.mediakit.net.HTTPDNSHosts */
public class HTTPDNSHosts {
    private static String mTTDNSServer = "/q?host=";
    protected boolean mCancelled;
    protected Handler mHandler;
    public String[] mHostnames;
    private int mHttpDNSType = 2;
    public String mId;
    protected AVMDLNetClient mNetClient;

    static {
        Covode.recordClassIndex(101251);
    }

    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://" + AVMDLDNSParser.mGlobalOwnDNSParseHost + mTTDNSServer);
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.mHostnames;
            if (i >= strArr.length) {
                return sb.toString();
            }
            if (!TextUtils.isEmpty(strArr[i])) {
                if (i2 == 0) {
                    sb.append(this.mHostnames[i]);
                } else {
                    sb.append("," + this.mHostnames[i]);
                }
                i2++;
            }
            i++;
        }
    }

    public void start() {
        String _getURL = _getURL();
        AVMDLLog.m147905d("BatchParseHTTPDNSHosts", "batch http dns  url:".concat(String.valueOf(_getURL)));
        Method[] declaredMethods = this.mNetClient.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                this.mNetClient.startTask(_getURL, null, null, 0, new AVMDLNetClient.CompletionListener() {
                    /* class com.p2082ss.mediakit.net.HTTPDNSHosts.C861191 */

                    static {
                        Covode.recordClassIndex(101252);
                    }

                    @Override // com.p2082ss.mediakit.net.AVMDLNetClient.CompletionListener
                    public void onCompletion(JSONObject jSONObject, Error error) {
                        HTTPDNSHosts.this._handleResponse(jSONObject, error);
                    }
                });
                return;
            }
        }
        this.mNetClient.startTask(_getURL, null, new AVMDLNetClient.CompletionListener() {
            /* class com.p2082ss.mediakit.net.HTTPDNSHosts.C861202 */

            static {
                Covode.recordClassIndex(101253);
            }

            @Override // com.p2082ss.mediakit.net.AVMDLNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                HTTPDNSHosts.this._handleResponse(jSONObject, error);
            }
        });
    }

    private void parseResult(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("dns");
                for (int i = 0; i < jSONArray.length(); i++) {
                    AVMDLDNSInfo parserResultForSingleHost = parserResultForSingleHost(jSONArray.getJSONObject(i));
                    if (parserResultForSingleHost != null) {
                        IPCache.getInstance().put(parserResultForSingleHost.mHost, parserResultForSingleHost);
                    }
                }
            } catch (Exception e) {
                AVMDLLog.m147905d("BatchParseHTTPDNSHosts", "parse json exception".concat(String.valueOf(e)));
            }
        }
    }

    private AVMDLDNSInfo parserResultForSingleHost(JSONObject jSONObject) {
        long j;
        String str;
        int i;
        String str2;
        int i2 = this.mHttpDNSType;
        String str3 = "";
        if (i2 != 2 && i2 != 1) {
            str = null;
            j = 0;
            if (!TextUtils.isEmpty(str)) {
            }
            AVMDLLog.m147905d("BatchParseHTTPDNSHosts", "parse result is null");
        } else if (!(jSONObject == null || jSONObject.length() == 0)) {
            if (jSONObject.has("ttl")) {
                i = jSONObject.optInt("ttl");
            } else {
                i = 60;
            }
            str = jSONObject.has("host") ? jSONObject.optString("host") : null;
            j = System.currentTimeMillis() + ((long) (i * 1000));
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (!(optJSONArray == null || optJSONArray.length() == 0)) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    try {
                        str2 = optJSONArray.getString(i3);
                    } catch (Exception e) {
                        e.printStackTrace();
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        str3 = TextUtils.isEmpty(str3) ? str3 + str2 : str3 + "," + str2;
                    }
                }
                if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
                    AVMDLLog.m147905d("BatchParseHTTPDNSHosts", "parse result is null");
                } else {
                    AVMDLLog.m147905d("BatchParseHTTPDNSHosts", C1764a.m5928a("parse result host:%s ips:%s expiredT:%d", new Object[]{str, str3, Long.valueOf(j)}));
                    return new AVMDLDNSInfo(this.mHttpDNSType, str, str3, j, this.mId);
                }
            }
        }
        return null;
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        AVMDLLog.m147905d("BatchParseHTTPDNSHosts", C1764a.m5928a("****http dns id:%s type:%d", new Object[]{this.mId, Integer.valueOf(this.mHttpDNSType)}));
        if (error != null) {
            AVMDLLog.m147905d("BatchParseHTTPDNSHosts", C1764a.m5928a("handle response receive err:%s", new Object[]{error.errStr}));
        } else if (jSONObject == null || jSONObject.length() == 0) {
            AVMDLLog.m147905d("BatchParseHTTPDNSHosts", C1764a.m5928a("json null err", new Object[0]));
        } else {
            try {
                parseResult(jSONObject);
            } catch (Throwable th) {
                AVMDLLog.m147905d("BatchParseHTTPDNSHosts", C1764a.m5928a("handle response exception:%s", new Object[]{th.toString()}));
            }
            AVMDLLog.m147905d("BatchParseHTTPDNSHosts", C1764a.m5928a("****parse end", new Object[0]));
        }
    }

    public HTTPDNSHosts(String[] strArr, AVMDLNetClient aVMDLNetClient, int i, Handler handler) {
        if (i != 2) {
            AVMDLLog.m147905d("BatchParseHTTPDNSHosts", "create fail type is not own");
            throw new Exception("type is not own");
        } else if (strArr == null || strArr.length == 0) {
            AVMDLLog.m147905d("BatchParseHTTPDNSHosts", "host array is valid");
            throw new Exception("host array is valid");
        } else {
            this.mHttpDNSType = i;
            this.mHostnames = strArr;
            this.mNetClient = aVMDLNetClient;
            if (aVMDLNetClient == null) {
                this.mNetClient = new AVMDLHTTPNetwork();
            }
            this.mHttpDNSType = i;
            this.mHandler = handler;
        }
    }
}
