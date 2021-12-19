package com.p2082ss.ttvideoengine;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictor;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorRecordOld;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorResultCollection;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.ah */
public final class C86312ah implements AbstractC86353as {

    /* renamed from: a */
    private WeakReference<C86313ai> f192833a;

    /* renamed from: b */
    private ISpeedPredictor f192834b;

    /* renamed from: c */
    private long f192835c;

    /* renamed from: d */
    private ISpeedPredictor f192836d;

    static {
        Covode.recordClassIndex(101540);
    }

    /* renamed from: a */
    private Map<String, Integer> m148619a() {
        AbstractC86517e eVar;
        List<C86534o> b;
        C86313ai aiVar = this.f192833a.get();
        if (aiVar == null || (eVar = aiVar.f192919ad) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (eVar.mo137742a() && (b = eVar.mo137745b()) != null && b.size() > 0) {
            for (C86534o oVar : b) {
                hashMap.put(oVar.mo137726b(15), Integer.valueOf(oVar.mo137723a()));
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    private static String m148622c(String str) {
        if (str == null || str.length() <= 0) {
            return "unknown";
        }
        try {
            return new JSONObject(str).optString("protocol");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    private static long m148621b(String str) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        try {
            try {
                return Long.parseLong(new JSONObject(str).optJSONObject("tcpInfo").optString("tcpRtt"));
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    private void m148620a(Map<String, Integer> map) {
        C86313ai aiVar = this.f192833a.get();
        if (aiVar != null && map != null) {
            long m = aiVar.mo137257m(62);
            long m2 = aiVar.mo137257m(61);
            int l = aiVar.mo137254l(0) * 1000;
            int l2 = aiVar.mo137254l(0) * 1000;
            map.put("playerVideoBufLen", Integer.valueOf((int) m));
            map.put("playerAudioBufLen", Integer.valueOf((int) m2));
            map.put("playerVideoMaxBufLen", Integer.valueOf(l));
            map.put("playerAudioMaxBufLen", Integer.valueOf(l2));
        }
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86353as
    /* renamed from: a */
    public final void mo137136a(String str) {
        C86641i.m150113b("TTVideoEngine", C1764a.m5929a(Locale.US, "speed notify, what:%d, info:%s", new Object[]{2, str}));
        C86313ai aiVar = this.f192833a.get();
        if (aiVar != null) {
            aiVar.f192920ae.mo137514A(str);
            ISpeedPredictor iSpeedPredictor = this.f192836d;
            if (iSpeedPredictor != null && C86313ai.f192851cf == 2) {
                Map<String, Integer> a = m148619a();
                m148620a(a);
                iSpeedPredictor.update(str, a);
                if (str != null) {
                    C86641i.m150113b("TTVideoEngine", C1764a.m5929a(Locale.US, "[ABR]: speedRecordsJson:%s", new Object[]{str}));
                }
                aiVar.f192956bP++;
                Map<String, String> downloadSpeed = iSpeedPredictor.getDownloadSpeed(0);
                float predictSpeed = iSpeedPredictor.getPredictSpeed(0);
                Map<String, String> downloadSpeed2 = iSpeedPredictor.getDownloadSpeed(1);
                float predictSpeed2 = iSpeedPredictor.getPredictSpeed(1);
                StringBuffer stringBuffer = new StringBuffer(" ");
                StringBuffer stringBuffer2 = new StringBuffer(" ");
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                float a2 = m148617a(downloadSpeed, stringBuffer, hashMap);
                float a3 = m148617a(downloadSpeed2, stringBuffer2, hashMap2);
                if (a2 > 0.0f && aiVar.f192956bP > 0) {
                    aiVar.f192954bN += (a2 - aiVar.f192954bN) / ((float) aiVar.f192956bP);
                }
                if (predictSpeed > 0.0f && aiVar.f192956bP > 0) {
                    aiVar.f192955bO += (predictSpeed - aiVar.f192955bO) / ((float) aiVar.f192956bP);
                }
                SpeedPredictorResultCollection multidimensionalDownloadSpeedsObj = iSpeedPredictor.getMultidimensionalDownloadSpeedsObj();
                SpeedPredictorResultCollection multidimensionalPredictSpeedsObj = iSpeedPredictor.getMultidimensionalPredictSpeedsObj();
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f192835c;
                long j2 = currentTimeMillis - j;
                if (j == 0) {
                    j2 = 0;
                }
                this.f192835c = currentTimeMillis;
                if (aiVar.mo137254l(525) == 0) {
                    C86641i.m150113b("TTVideoEngine", C1764a.m5929a(Locale.US, "[SPEEDPREDICT] use sing predictor data outing", new Object[0]));
                    aiVar.f192920ae.mo137560a(stringBuffer.toString(), stringBuffer2.toString(), a2, a3, predictSpeed, predictSpeed2, j2, hashMap, hashMap2);
                    aiVar.f192920ae.mo137528O(0);
                } else if (aiVar.mo137254l(525) == 1) {
                    C86641i.m150113b("TTVideoEngine", C1764a.m5929a(Locale.US, "[SPEEDPREDICT] use multi data outing", new Object[0]));
                    if (!(multidimensionalPredictSpeedsObj == null || multidimensionalPredictSpeedsObj.getResultCollection() == null || multidimensionalPredictSpeedsObj.getResultCollection().isEmpty())) {
                        aiVar.f192920ae.mo137549a(multidimensionalDownloadSpeedsObj, multidimensionalPredictSpeedsObj, j2);
                    }
                    aiVar.f192920ae.mo137528O(1);
                }
                aiVar.f192920ae.mo137529P(2);
            }
        }
    }

    /* renamed from: a */
    private static long m148618a(String str, String str2) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        try {
            try {
                return Long.parseLong(new JSONObject(str).optJSONObject("tcpInfo").optString(str2));
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    C86312ah(C86313ai aiVar, ISpeedPredictor iSpeedPredictor, ISpeedPredictor iSpeedPredictor2) {
        this.f192833a = new WeakReference<>(aiVar);
        this.f192834b = iSpeedPredictor;
        this.f192836d = iSpeedPredictor2;
    }

    /* renamed from: a */
    private static float m148617a(Map<String, String> map, StringBuffer stringBuffer, Map<String, String> map2) {
        float f;
        if (!(map == null || map.size() <= 1 || map.get("download_speed") == null)) {
            try {
                f = Float.parseFloat(map.get("download_speed"));
            } catch (NumberFormatException e) {
                C86641i.m150117e("TTVideoEngine", C1764a.m5929a(Locale.US, "[SPEEDPREDICT] exception %s", new Object[]{e.toString()}));
                f = 0.0f;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!entry.getKey().equals("stream_id") && !entry.getKey().equals("download_speed")) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
            if (!map.get("stream_id").equals("-1")) {
                stringBuffer.delete(0, stringBuffer.capacity()).append(map.get("stream_id"));
                return f;
            }
        }
        return 0.0f;
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86353as
    /* renamed from: a */
    public final void mo137135a(long j, long j2, String str, String str2, String str3) {
        int i;
        C86641i.m150113b("TTVideoEngine", C1764a.m5929a(Locale.US, "speed notify, what:%d, code:%d, para:%d, inf:%s, extraInfoJsonStr:%s", new Object[]{2, Long.valueOf(j), Long.valueOf(j2), str, str3}));
        C86313ai aiVar = this.f192833a.get();
        if (aiVar != null) {
            aiVar.f192920ae.mo137573b(j, j2);
            ISpeedPredictor iSpeedPredictor = this.f192836d;
            if (iSpeedPredictor != null) {
                SpeedPredictorRecordOld speedPredictorRecordOld = new SpeedPredictorRecordOld();
                speedPredictorRecordOld.setSteamId(str);
                speedPredictorRecordOld.setBytes(j);
                speedPredictorRecordOld.setTime(j2);
                long b = m148621b(str3);
                long a = m148618a(str3, "tcpLastRecvDate");
                speedPredictorRecordOld.setTcpInfoRtt(b);
                speedPredictorRecordOld.setLastRecvDate(a);
                speedPredictorRecordOld.setProtocol(m148622c(str3));
                if (TextUtils.isEmpty(str2) || !str2.equals(DataType.AUDIO)) {
                    i = 1;
                } else {
                    i = 0;
                }
                speedPredictorRecordOld.setTrackType(i ^ 1);
                speedPredictorRecordOld.setTimestamp(System.currentTimeMillis());
                if (speedPredictorRecordOld.getTime() != 0) {
                    DecimalFormat decimalFormat = new DecimalFormat("#.000000000");
                    double bytes = (double) speedPredictorRecordOld.getBytes();
                    double time = (double) speedPredictorRecordOld.getTime();
                    Double.isNaN(bytes);
                    Double.isNaN(time);
                    C86641i.m150113b("TTVideoEngine", C1764a.m5929a(Locale.US, "[ABR]: speedRecord:%s", new Object[]{decimalFormat.format(bytes / time)}));
                }
                Map<String, Integer> a2 = m148619a();
                m148620a(a2);
                iSpeedPredictor.update(speedPredictorRecordOld, a2);
                aiVar.f192956bP++;
                Map<String, String> downloadSpeed = iSpeedPredictor.getDownloadSpeed(0);
                float predictSpeed = iSpeedPredictor.getPredictSpeed(0);
                Map<String, String> downloadSpeed2 = iSpeedPredictor.getDownloadSpeed(1);
                float predictSpeed2 = iSpeedPredictor.getPredictSpeed(1);
                StringBuffer stringBuffer = new StringBuffer(" ");
                StringBuffer stringBuffer2 = new StringBuffer(" ");
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                float a3 = m148617a(downloadSpeed, stringBuffer, hashMap);
                float a4 = m148617a(downloadSpeed2, stringBuffer2, hashMap2);
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = this.f192835c;
                long j4 = currentTimeMillis - j3;
                if (j3 == 0) {
                    j4 = 0;
                }
                this.f192835c = currentTimeMillis;
                if (a3 > 0.0f && aiVar.f192956bP > 0) {
                    aiVar.f192954bN += (a3 - aiVar.f192954bN) / ((float) aiVar.f192956bP);
                }
                if (predictSpeed > 0.0f && aiVar.f192956bP > 0) {
                    aiVar.f192955bO += (predictSpeed - aiVar.f192955bO) / ((float) aiVar.f192956bP);
                }
                aiVar.f192920ae.mo137560a(stringBuffer.toString(), stringBuffer2.toString(), a3, a4, predictSpeed, predictSpeed2, j4, hashMap, hashMap2);
                aiVar.f192920ae.mo137529P(1);
                aiVar.f192920ae.mo137528O(0);
            }
        }
    }
}
