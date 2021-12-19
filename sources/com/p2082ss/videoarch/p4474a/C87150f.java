package com.p2082ss.videoarch.p4474a;

import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.p2082ss.videoarch.p4474a.p4475a.C87119b;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.a.f */
public final class C87150f implements InvocationHandler {

    /* renamed from: a */
    private final WeakReference<C87154g> f196954a;

    static {
        Covode.recordClassIndex(102951);
    }

    public C87150f(C87154g gVar) {
        this.f196954a = new WeakReference<>(gVar);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C87154g gVar = this.f196954a.get();
        if (gVar == null) {
            return null;
        }
        if (method.getName().equals("updateFrameTerminatedDTS") && objArr.length >= 3) {
            ((Integer) objArr[0]).intValue();
            long longValue = ((Long) objArr[1]).longValue();
            ((Long) objArr[2]).longValue();
            gVar.f196988J = longValue;
        } else if (method.getName().equals("frameDTSNotify") && objArr.length >= 3) {
            int intValue = ((Integer) objArr[0]).intValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            ((Long) objArr[2]).longValue();
            if (gVar.f196991M == 1 && intValue == 0) {
                if (gVar.f196994P.equals("origin")) {
                    C87119b bVar = gVar.f197054b;
                    if (bVar.f196550cb == null) {
                        bVar.f196550cb = new LinkedBlockingQueue<>(600);
                    }
                    if (bVar.f196550cb.remainingCapacity() == 0 && bVar.f196550cb.size() > 0) {
                        bVar.f196550cb.poll();
                    }
                    bVar.f196550cb.offer(Long.valueOf(longValue2));
                }
            } else if (intValue == 1 && gVar.f196987I == 1) {
                if (gVar.f197054b.f196486bQ < 0) {
                    gVar.f197054b.f196486bQ = longValue2;
                } else if (longValue2 < gVar.f196989K) {
                    C87119b bVar2 = gVar.f197054b;
                    long j = gVar.f196989K;
                    JSONObject b = bVar2.mo140859b();
                    if (b != null) {
                        try {
                            b.put("event_key", "timestamp_rollback").put("packet_type", DataType.AUDIO).put("timestamp_type", "dts").put("latest_ts", longValue2).put("previous_ts", j);
                            bVar2.f196469b.mo12858a(b, "live_client_monitor_log");
                            if (bVar2.f196415Z > 0) {
                                bVar2.f196415Z++;
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
                gVar.f196989K = longValue2;
            }
        }
        return null;
    }
}
