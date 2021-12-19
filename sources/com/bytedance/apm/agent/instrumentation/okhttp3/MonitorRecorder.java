package com.bytedance.apm.agent.instrumentation.okhttp3;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionData;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import okhttp3.AbstractC90025ab;
import okhttp3.C90029ac;
import okhttp3.C90195q;
import okhttp3.C90205x;
import okhttp3.Request;
import org.json.JSONObject;

public class MonitorRecorder {
    static {
        Covode.recordClassIndex(14046);
    }

    /* renamed from: com_bytedance_apm_agent_instrumentation_okhttp3_MonitorRecorder_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m22048x9bc42fe(String str, String str2, Throwable th) {
        return 0;
    }

    public static void reportExceptionMonitor(TransactionState transactionState, Exception exc) {
    }

    public static void reportMonitorData(TransactionState transactionState, C90029ac acVar) {
        if (transactionState != null && acVar != null) {
            reportMonitorData(transactionState, "okhttp");
        }
    }

    public static void recordResponse(C90029ac acVar, TransactionState transactionState) {
        if (acVar != null && transactionState != null) {
            transactionState.setStatusCode(acVar.f204107c);
            if (acVar.f204111g != null) {
                transactionState.setBytesReceived(acVar.f204111g.contentLength());
            }
        }
    }

    public static void recordRequest(Request request, TransactionState transactionState) {
        if (request != null && transactionState != null) {
            transactionState.addAssistData("NetworkLib", "OkHttp3");
            transactionState.setUrl(request.url().toString());
            transactionState.setMethod(request.method());
            transactionState.setStartTime(System.currentTimeMillis());
            transactionState.setCarrier("");
            transactionState.setWanType("");
            AbstractC90025ab body = request.body();
            if (body == null) {
                return;
            }
            if (body instanceof C90195q) {
                transactionState.setBytesSent(body.contentLength());
            } else if (body instanceof C90205x) {
                try {
                    transactionState.setBytesSent(body.contentLength());
                } catch (IOException e) {
                    m22048x9bc42fe("TransactionData:", "can not get MultipartBody content length", e);
                }
            }
        }
    }

    public static void reportMonitorData(TransactionState transactionState, String str) {
        long startTime;
        if (transactionState != null) {
            TransactionData end = transactionState.end();
            if (C12397c.m22288e()) {
                String[] strArr = new String[1];
                String str2 = "auto plugin, reportMonitorData: " + end.toString();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sent_bytes", end.getBytesSent());
                jSONObject2.put("received_bytes", end.getBytesReceived());
                jSONObject.put("response", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("request_log", jSONObject);
                jSONObject3.put("net_consume_type", str);
                long totalTime = end.getTotalTime();
                if (transactionState.getStartTime() == 0) {
                    startTime = end.getRequestStart();
                } else {
                    startTime = transactionState.getStartTime();
                }
                MonitorTool.monitorSLA(totalTime, startTime, end.getUrl(), "", "", end.getStatusCode(), jSONObject3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
