package com.bytedance.apm.agent.instrumentation.okhttp3;

import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.p789q.C12588j;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90057i;
import okhttp3.AbstractC90191p;
import okhttp3.C90029ac;
import okhttp3.C90197r;
import okhttp3.C90198s;
import okhttp3.EnumC90211z;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

public class OkHttpEventListener extends AbstractC90191p {
    private static String sIgnoreMonitorLabel;
    private long connectStartTime;
    private long dnsStartTime;
    private boolean needToDeal = true;
    private OkHttpRecord okHttpRecord;
    public AbstractC90191p originListener;
    private long requestBodyEndTime;
    private JSONObject requestHeader;
    private long requestHeadersEndTime;
    private long requestHeadersStartTime;
    private long responseBodyStartTime;
    private JSONObject responseHeader;
    private long responseHeadersStartTime;
    private long secureConnectStartTime;
    private String url;

    static {
        Covode.recordClassIndex(14048);
    }

    private void record() {
        OkHttpRecord okHttpRecord2;
        String str;
        if (this.needToDeal && (okHttpRecord2 = this.okHttpRecord) != null) {
            okHttpRecord2.timeRequest.duration = System.currentTimeMillis() - this.okHttpRecord.timeRequest.start_time;
            try {
                JSONObject jSONObject = new JSONObject(this.okHttpRecord.toString());
                jSONObject.put("timing_totalSendBytes", this.okHttpRecord.recordResponse.sent_bytes);
                jSONObject.put("timing_totalReceivedBytes", this.okHttpRecord.recordResponse.received_bytes);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("request_log", jSONObject);
                jSONObject2.put("net_consume_type", "okhttp");
                JSONObject jSONObject3 = this.requestHeader;
                String str2 = "";
                if (jSONObject3 != null) {
                    str = jSONObject3.toString();
                } else {
                    str = str2;
                }
                jSONObject2.put("requestHeader", str);
                JSONObject jSONObject4 = this.responseHeader;
                if (jSONObject4 != null) {
                    str2 = jSONObject4.toString();
                }
                jSONObject2.put("responseHeader", str2);
                MonitorTool.monitorSLA(this.okHttpRecord.timeRequest.duration, this.okHttpRecord.timeRequest.start_time, this.url, this.okHttpRecord.socketInfo.remote, "", this.okHttpRecord.recordResponse.code, jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static void setIgnoreMonitorLabel(String str) {
        sIgnoreMonitorLabel = str;
    }

    public OkHttpEventListener(AbstractC90191p pVar) {
        this.originListener = pVar;
        this.okHttpRecord = new OkHttpRecord();
    }

    @Override // okhttp3.AbstractC90191p
    public void callEnd(AbstractC90049e eVar) {
        super.callEnd(eVar);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.callEnd(eVar);
        }
        record();
    }

    @Override // okhttp3.AbstractC90191p
    public void requestBodyStart(AbstractC90049e eVar) {
        super.requestBodyStart(eVar);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.requestBodyStart(eVar);
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void callStart(AbstractC90049e eVar) {
        super.callStart(eVar);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.callStart(eVar);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeRequest.start_time = System.currentTimeMillis();
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void requestHeadersStart(AbstractC90049e eVar) {
        super.requestHeadersStart(eVar);
        if (this.needToDeal) {
            this.requestHeadersStartTime = System.currentTimeMillis();
            this.okHttpRecord.timeRequest.request_sent_time = this.requestHeadersStartTime;
        }
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.requestHeadersStart(eVar);
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void responseBodyStart(AbstractC90049e eVar) {
        super.responseBodyStart(eVar);
        if (this.needToDeal) {
            this.responseBodyStartTime = System.currentTimeMillis();
        }
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.responseBodyStart(eVar);
        }
    }

    private JSONObject getHeaders(C90198s sVar) {
        JSONObject jSONObject = new JSONObject();
        if (sVar != null) {
            try {
                for (String str : sVar.mo145029a()) {
                    try {
                        jSONObject.put(str, sVar.mo145028a(str));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    @Override // okhttp3.AbstractC90191p
    public void responseHeadersStart(AbstractC90049e eVar) {
        long currentTimeMillis;
        long j;
        super.responseHeadersStart(eVar);
        if (this.needToDeal) {
            this.responseHeadersStartTime = System.currentTimeMillis();
            if (this.requestBodyEndTime != 0) {
                currentTimeMillis = System.currentTimeMillis();
                j = this.requestBodyEndTime;
            } else {
                currentTimeMillis = System.currentTimeMillis();
                j = this.requestHeadersEndTime;
            }
            OkHttpRecord.DetailedDuration detailedDuration = this.okHttpRecord.timeDetailedDuration;
            detailedDuration.ttfb = (int) (currentTimeMillis - j);
            this.okHttpRecord.timeRequest.response_recv_time = System.currentTimeMillis();
        }
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.responseHeadersStart(eVar);
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void secureConnectStart(AbstractC90049e eVar) {
        super.secureConnectStart(eVar);
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.tcp = (int) (System.currentTimeMillis() - this.connectStartTime);
            this.secureConnectStartTime = System.currentTimeMillis();
        }
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.secureConnectStart(eVar);
        }
    }

    private void dealSpecialHeader(C90029ac acVar) {
        int i;
        int i2;
        int i3;
        for (String str : acVar.mo144719a("server-timing")) {
            if (!TextUtils.isEmpty(str)) {
                this.okHttpRecord.headerRequest.serverTimings.add(str);
                String[] split = str.split(",");
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2) && str2.contains(";")) {
                        String[] split2 = str2.split(";");
                        if (split2.length >= 2) {
                            String replace = split2[0].replace(" ", "");
                            boolean z = true;
                            String replace2 = split2[1].replace(" ", "");
                            if (!TextUtils.isEmpty(replace)) {
                                replace.hashCode();
                                char c = 65535;
                                switch (replace.hashCode()) {
                                    case -1008619738:
                                        if (replace.equals("origin")) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                    case -138105374:
                                        if (replace.equals("cdn-cache")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 3108285:
                                        if (replace.equals("edge")) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                    case 100355670:
                                        if (replace.equals("inner")) {
                                            c = 3;
                                            break;
                                        }
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        if (!TextUtils.isEmpty(replace2)) {
                                            String[] split3 = replace2.split("=");
                                            if (split3.length >= 2) {
                                                OkHttpRecord.DetailedDuration detailedDuration = this.okHttpRecord.timeDetailedDuration;
                                                if (!TextUtils.isEmpty(split3[1])) {
                                                    i = Integer.parseInt(split3[1]);
                                                } else {
                                                    i = 0;
                                                }
                                                detailedDuration.origin = i;
                                                break;
                                            }
                                        }
                                        break;
                                    case 1:
                                        if (!TextUtils.isEmpty(replace2)) {
                                            String[] split4 = replace2.split("=");
                                            if (split4.length >= 2) {
                                                OkHttpRecord.DetailedDuration detailedDuration2 = this.okHttpRecord.timeDetailedDuration;
                                                if (TextUtils.isEmpty(split4[1]) || !split4[1].equalsIgnoreCase("hit")) {
                                                    z = false;
                                                }
                                                detailedDuration2.cdn_hit_cache = z;
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        if (!TextUtils.isEmpty(replace2)) {
                                            String[] split5 = replace2.split("=");
                                            if (split5.length >= 2) {
                                                OkHttpRecord.DetailedDuration detailedDuration3 = this.okHttpRecord.timeDetailedDuration;
                                                if (!TextUtils.isEmpty(split5[1])) {
                                                    i2 = Integer.parseInt(split5[1]);
                                                } else {
                                                    i2 = 0;
                                                }
                                                detailedDuration3.edge = i2;
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        if (!TextUtils.isEmpty(replace2)) {
                                            String[] split6 = replace2.split("=");
                                            if (split6.length >= 2) {
                                                OkHttpRecord.DetailedDuration detailedDuration4 = this.okHttpRecord.timeDetailedDuration;
                                                if (!TextUtils.isEmpty(split6[1])) {
                                                    i3 = Integer.parseInt(split6[1]);
                                                } else {
                                                    i3 = 0;
                                                }
                                                detailedDuration4.inner = i3;
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        int i4 = (this.okHttpRecord.timeDetailedDuration.ttfb - this.okHttpRecord.timeDetailedDuration.edge) - this.okHttpRecord.timeDetailedDuration.origin;
        if (i4 > 0) {
            this.okHttpRecord.timeDetailedDuration.rtt = i4;
        }
        int i5 = this.okHttpRecord.timeDetailedDuration.origin - this.okHttpRecord.timeDetailedDuration.inner;
        if (i5 > 0) {
            this.okHttpRecord.timeDetailedDuration.origin = i5;
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void callFailed(AbstractC90049e eVar, IOException iOException) {
        super.callFailed(eVar, iOException);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.callFailed(eVar, iOException);
        }
        record();
    }

    @Override // okhttp3.AbstractC90191p
    public void connectionReleased(AbstractC90049e eVar, AbstractC90057i iVar) {
        super.connectionReleased(eVar, iVar);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.connectionReleased(eVar, iVar);
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void dnsStart(AbstractC90049e eVar, String str) {
        super.dnsStart(eVar, str);
        if (this.needToDeal) {
            this.dnsStartTime = System.currentTimeMillis();
        }
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.dnsStart(eVar, str);
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void secureConnectEnd(AbstractC90049e eVar, C90197r rVar) {
        super.secureConnectEnd(eVar, rVar);
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.ssl = (int) (System.currentTimeMillis() - this.secureConnectStartTime);
        }
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.secureConnectEnd(eVar, rVar);
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void connectionAcquired(AbstractC90049e eVar, AbstractC90057i iVar) {
        super.connectionAcquired(eVar, iVar);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.connectionAcquired(eVar, iVar);
        }
        if (!this.needToDeal) {
            return;
        }
        if (this.dnsStartTime == 0) {
            this.okHttpRecord.socketInfo.socketReused = true;
        } else {
            this.okHttpRecord.socketInfo.socketReused = false;
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void requestBodyEnd(AbstractC90049e eVar, long j) {
        super.requestBodyEnd(eVar, j);
        if (this.needToDeal) {
            this.requestBodyEndTime = System.currentTimeMillis();
            this.okHttpRecord.timeDetailedDuration.send = (int) (System.currentTimeMillis() - this.requestHeadersStartTime);
        }
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.requestBodyEnd(eVar, j);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.sent_bytes += j;
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void responseBodyEnd(AbstractC90049e eVar, long j) {
        super.responseBodyEnd(eVar, j);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.responseBodyEnd(eVar, j);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.received_bytes += j;
            this.okHttpRecord.timeDetailedDuration.body_recv = (int) (System.currentTimeMillis() - this.responseBodyStartTime);
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void requestHeadersEnd(AbstractC90049e eVar, Request request) {
        super.requestHeadersEnd(eVar, request);
        if (this.needToDeal) {
            this.requestHeadersEndTime = System.currentTimeMillis();
            this.okHttpRecord.timeDetailedDuration.send = (int) (System.currentTimeMillis() - this.requestHeadersStartTime);
        }
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.requestHeadersEnd(eVar, request);
        }
        String header = request.header("User-Agent");
        String str = sIgnoreMonitorLabel;
        if (!(str == null || header == null || !header.contains(str))) {
            this.needToDeal = false;
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.sent_bytes += request.headers().mo145030b();
            this.url = request.url().toString();
            this.requestHeader = getHeaders(request.headers());
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void responseHeadersEnd(AbstractC90049e eVar, C90029ac acVar) {
        super.responseHeadersEnd(eVar, acVar);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.responseHeadersEnd(eVar, acVar);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.header_recv = (int) (System.currentTimeMillis() - this.responseHeadersStartTime);
            this.okHttpRecord.recordResponse.code = acVar.f204107c;
            this.okHttpRecord.recordResponse.received_bytes += acVar.f204110f.mo145030b();
            this.okHttpRecord.recordResponse.network_accessed = C12588j.m22688a(C12397c.f29931a);
            this.okHttpRecord.headerRequest.x_tt_trace_id = acVar.mo144718a("x-tt-trace-id", "");
            this.okHttpRecord.headerRequest.x_tt_trace_host = acVar.mo144718a("x-tt-trace-host", "");
            this.okHttpRecord.headerRequest.x_tt_trace_tag = acVar.mo144718a("x-tt-trace-tag", "");
            this.okHttpRecord.headerRequest.x_tt_content_encoding = acVar.mo144718a("x-tt-content-encoding", "");
            try {
                dealSpecialHeader(acVar);
            } catch (Exception unused) {
            }
            this.responseHeader = getHeaders(acVar.f204110f);
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void connectStart(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(eVar, inetSocketAddress, proxy);
        if (this.needToDeal) {
            this.connectStartTime = System.currentTimeMillis();
        }
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.connectStart(eVar, inetSocketAddress, proxy);
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void dnsEnd(AbstractC90049e eVar, String str, List<InetAddress> list) {
        super.dnsEnd(eVar, str, list);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.dnsEnd(eVar, str, list);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.dns = (int) (System.currentTimeMillis() - this.dnsStartTime);
            if (list != null && list.size() > 0) {
                for (InetAddress inetAddress : list) {
                    OkHttpRecord.DnsInfo dnsInfo = new OkHttpRecord.DnsInfo();
                    dnsInfo.address = inetAddress.getHostAddress();
                    this.okHttpRecord.addressList.add(dnsInfo);
                }
            }
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void connectEnd(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC90211z zVar) {
        boolean z;
        super.connectEnd(eVar, inetSocketAddress, proxy, zVar);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.connectEnd(eVar, inetSocketAddress, proxy, zVar);
        }
        if (this.needToDeal) {
            OkHttpRecord.RecordResponse recordResponse = this.okHttpRecord.recordResponse;
            if (proxy.address() != null) {
                z = true;
            } else {
                z = false;
            }
            recordResponse.via_Proxy = z;
            if (inetSocketAddress != null && inetSocketAddress.getAddress() != null) {
                this.okHttpRecord.socketInfo.remote = inetSocketAddress.getAddress().getHostAddress() + ":" + inetSocketAddress.getPort();
                this.okHttpRecord.socketInfo.host = inetSocketAddress.getAddress().getHostAddress();
                this.okHttpRecord.socketInfo.port = new StringBuilder().append(inetSocketAddress.getPort()).toString();
            }
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void connectFailed(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC90211z zVar, IOException iOException) {
        super.connectFailed(eVar, inetSocketAddress, proxy, zVar, iOException);
        AbstractC90191p pVar = this.originListener;
        if (pVar != null) {
            pVar.connectFailed(eVar, inetSocketAddress, proxy, zVar, iOException);
        }
    }
}
