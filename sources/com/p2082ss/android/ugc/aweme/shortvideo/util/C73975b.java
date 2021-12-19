package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.b */
public final class C73975b implements Handler.Callback, IAVPerformance {

    /* renamed from: a */
    private HashMap<String, C73947ah> f166068a;

    /* renamed from: b */
    private HashMap<String, Boolean> f166069b;

    /* renamed from: c */
    private Handler f166070c;

    static {
        Covode.recordClassIndex(86725);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.b$a */
    public static class C73976a {

        /* renamed from: a */
        public static final C73975b f166071a = new C73975b((byte) 0);

        static {
            Covode.recordClassIndex(86726);
        }
    }

    private C73975b() {
        this.f166068a = new HashMap<>();
        this.f166069b = new HashMap<>();
        this.f166070c = new Handler(C74040v.m130196a(), this);
    }

    /* synthetic */ C73975b(byte b) {
        this();
    }

    /* renamed from: b */
    private void m130109b(Message message) {
        C73969av avVar = (C73969av) message.obj;
        C73947ah ahVar = this.f166068a.get(avVar.f166061b);
        if (ahVar != null && !m130108a(ahVar.f166023a, avVar)) {
            ahVar.f166023a.add(avVar);
        }
    }

    /* renamed from: a */
    private void m130105a(Message message) {
        C73969av avVar = (C73969av) message.obj;
        C73947ah ahVar = this.f166068a.get(avVar.f166061b);
        if (ahVar == null) {
            C73947ah ahVar2 = new C73947ah();
            ahVar2.f166023a.add(avVar);
            this.f166068a.put(avVar.f166061b, ahVar2);
        } else if (!m130108a(ahVar.f166023a, avVar)) {
            ahVar.f166023a.add(avVar);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                m130105a(message);
                return false;
            case 2:
                m130109b(message);
                return false;
            case 3:
                m130110c(message);
                return false;
            case 4:
                m130105a(message);
                return false;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                C73969av avVar = (C73969av) message.obj;
                PerformanceMonitor performanceMonitor = avVar.f166063d;
                String str = avVar.f166062c;
                if (performanceMonitor == null) {
                    m130110c(message);
                    return false;
                }
                ArrayList arrayList = new ArrayList(performanceMonitor.mo100787b());
                arrayList.remove(str);
                C73947ah ahVar = this.f166068a.get(avVar.f166061b);
                if (ahVar == null) {
                    return false;
                }
                ArrayList arrayList2 = new ArrayList();
                for (C73969av avVar2 : ahVar.f166023a) {
                    arrayList2.add(avVar2.f166062c);
                }
                if (arrayList2.containsAll(arrayList)) {
                    m130110c(message);
                    return false;
                }
                break;
            default:
                return false;
        }
        m130109b(message);
        return false;
    }

    /* renamed from: c */
    private void m130110c(Message message) {
        C73969av avVar = (C73969av) message.obj;
        C73947ah remove = this.f166068a.remove(avVar.f166061b);
        if (remove != null) {
            remove.f166023a.add(avVar);
            int size = remove.f166023a.size();
            if (size > 1) {
                C69840ar arVar = new C69840ar();
                int i = 0;
                while (i < size - 1) {
                    int i2 = i + 1;
                    arVar.mo110188a("step" + i2, Long.valueOf(remove.f166023a.get(i2).f166060a - remove.f166023a.get(i).f166060a));
                    i = i2;
                }
                arVar.mo110188a("totaltime", Long.valueOf(remove.f166023a.get(remove.f166023a.size() - 1).f166060a - remove.f166023a.get(0).f166060a));
                arVar.mo110187a("totalstep", Integer.valueOf(size));
                arVar.mo110189a(StringSet.type, avVar.f166061b);
                Boolean bool = this.f166069b.get(avVar.f166061b);
                if (bool == null || bool.booleanValue()) {
                    arVar.mo110185a("cold_start", (Boolean) true);
                    this.f166069b.put(avVar.f166061b, false);
                } else {
                    arVar.mo110185a("cold_start", (Boolean) false);
                }
                JSONObject a = arVar.mo110191a();
                C40982q.m82522a(avVar.f166061b, a);
                C80322d.m139252a("tool_performance_operation_cost_time", a);
                C63244g.m114602a();
                remove.f166023a.clear();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void recordPerformanceLog(String str, AbstractC89171a<? extends Map<String, String>> aVar) {
        C63244g.m114602a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(String str, String str2) {
        m130106a(str, str2, 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void start(String str, String str2) {
        m130106a(str, str2, 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void step(String str, String str2) {
        m130106a(str, str2, 2);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(PerformanceMonitor performanceMonitor, String str) {
        m130107a(performanceMonitor.mo100786a(), str, performanceMonitor, 6);
        performanceMonitor.mo100786a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void enter(Context context, String str) {
        this.f166070c.post(new RunnableC74004c(context, str));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void leave(Context context, String str) {
        this.f166070c.post(new RunnableC74006e(context, str));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void start(PerformanceMonitor performanceMonitor, String str) {
        m130107a(performanceMonitor.mo100786a(), str, performanceMonitor, 4);
        performanceMonitor.mo100786a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void step(PerformanceMonitor performanceMonitor, String str) {
        m130107a(performanceMonitor.mo100786a(), str, performanceMonitor, 5);
        performanceMonitor.mo100786a();
    }

    /* renamed from: a */
    private static boolean m130108a(List<C73969av> list, C73969av avVar) {
        for (C73969av avVar2 : list) {
            if (avVar2.f166062c.equals(avVar.f166062c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m130106a(String str, String str2, int i) {
        m130107a(str, str2, null, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void pause(Context context, String str, String str2, String str3) {
        this.f166070c.post(new RunnableC74005d(context, str, str2, str3));
    }

    /* renamed from: a */
    private void m130107a(String str, String str2, PerformanceMonitor performanceMonitor, int i) {
        if (!TextUtils.isEmpty(str)) {
            Message obtain = Message.obtain();
            obtain.what = i;
            C73969av avVar = new C73969av();
            avVar.f166060a = System.currentTimeMillis();
            avVar.f166061b = str;
            avVar.f166062c = str2;
            avVar.f166063d = performanceMonitor;
            obtain.obj = avVar;
            this.f166070c.sendMessage(obtain);
        }
    }
}
