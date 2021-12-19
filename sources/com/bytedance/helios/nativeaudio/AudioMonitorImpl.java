package com.bytedance.helios.nativeaudio;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.p1087a.AbstractC15300c;
import com.bytedance.helios.api.p1087a.C15298b;
import com.bytedance.helios.api.p1088b.AbstractC15315l;
import com.bytedance.helios.api.p1088b.C15302a;
import com.bytedance.helios.api.p1088b.C15314k;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.api.p1091d.AbstractC15332a;
import com.bytedance.helios.sdk.C15434f;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.p1095c.C15391f;
import com.bytedance.helios.sdk.p1097d.AbstractC15412n;
import com.bytedance.helios.sdk.utils.C15484f;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.ArrayList;
import java.util.List;

public class AudioMonitorImpl extends AbstractC15332a implements AbstractC15300c {
    public final List<C15318n> mEventList = new ArrayList();

    private static native void startMonitor(AudioMonitorCallback audioMonitorCallback, boolean z, int i);

    public static String typeToString(int i) {
        return i != 0 ? i != 1 ? "Unknown" : "AAudio" : "OpenSLES";
    }

    @Override // com.bytedance.helios.api.p1087a.AbstractC15300c
    public List<C15318n> getHoldingResources() {
        return this.mEventList;
    }

    static {
        Covode.recordClassIndex(17581);
        ByteHook.m7797a();
        m28235x27db02c("nativeaudio");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.nativeaudio.AudioMonitorImpl$a */
    public static class RunnableC15334a implements Runnable {

        /* renamed from: a */
        private final C15318n f37411a;

        static {
            Covode.recordClassIndex(17583);
        }

        public final void run() {
            AbstractC15315l lVar = C15320o.f37387g;
            if (lVar != null) {
                List<C15314k> jsbEvents = lVar.getJsbEvents();
                if (jsbEvents.size() > 0) {
                    this.f37411a.f37351C = "jsb";
                    this.f37411a.f37352D = jsbEvents;
                    return;
                }
                this.f37411a.f37351C = "";
            }
        }

        public RunnableC15334a(C15318n nVar) {
            this.f37411a = nVar;
        }
    }

    @Override // com.bytedance.helios.api.p1091d.AbstractC15332a
    public void startMonitor() {
        MethodCollector.m26663i(8062);
        C15484f.m28490a("Helios-Log-Monitor-Ability-Api-Call", "startMonitor: ");
        startMonitor(new Callback(), true, 32);
        C15298b.get().addResourceChecker("nar", this);
        MethodCollector.m26664o(8062);
    }

    class Callback implements AudioMonitorCallback {
        static {
            Covode.recordClassIndex(17582);
        }

        Callback() {
        }

        public void onOpened(long j, int i, String str) {
            C15318n buildPrivacyEvent = AudioMonitorImpl.buildPrivacyEvent(j, i, str, true);
            C15484f.m28490a("Helios-Log-Monitor-Ability-Api-Call", "monitorTrigger factors=open calledTime=" + buildPrivacyEvent.f37366l + " runtimeObjHashcode=" + j + " eventCurrentPageHashCode=" + buildPrivacyEvent.f37364j + " type=" + i + " msg=" + str);
            AudioMonitorImpl.this.mEventList.add(buildPrivacyEvent);
            if (i == 0) {
                buildPrivacyEvent.f37356b = 100496;
            } else {
                buildPrivacyEvent.f37356b = 100498;
            }
            C15391f.m28290a(buildPrivacyEvent);
        }

        public void onClosed(long j, int i, String str) {
            C15318n event = AudioMonitorImpl.this.getEvent(j, i);
            if (event != null) {
                event.mo24851d(event.f37360f + "\n" + str);
                event.f37374t = 1;
                event.mo24854f(AbstractC15412n.f37629d[AbstractC15412n.C15413a.m28347a(!event.f37362h, true ^ C15434f.f37673b.mo25170d())]);
                event.mo24849b(AudioMonitorImpl.typeToString(i) + "Close");
                if (i == 0) {
                    event.f37356b = 100497;
                } else {
                    event.f37356b = 100499;
                }
                C15484f.m28490a("Helios-Log-Monitor-Ability-Api-Call", "monitorTrigger factors=close calledTime=" + event.f37366l + " runtimeObjHashcode=" + j + " eventCurrentPageHashCode=" + event.f37364j + " type=" + i + " msg=" + str);
                C15391f.m28290a(event);
                AudioMonitorImpl.this.removeEvent(j, i);
            }
        }
    }

    /* renamed from: com_bytedance_helios_nativeaudio_AudioMonitorImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m28235x27db02c(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public C15318n getEvent(long j, int i) {
        for (C15318n nVar : this.mEventList) {
            if (nVar.f37371q == j && TextUtils.equals(nVar.f37358d, typeToString(i))) {
                return nVar;
            }
        }
        return null;
    }

    public void removeEvent(long j, int i) {
        for (int size = this.mEventList.size() - 1; size >= 0; size--) {
            C15318n nVar = this.mEventList.get(size);
            if (nVar.f37371q == j && TextUtils.equals(nVar.f37358d, typeToString(i))) {
                this.mEventList.remove(size);
            }
        }
    }

    public static C15318n buildPrivacyEvent(long j, int i, String str, boolean z) {
        String str2;
        boolean z2 = !C15434f.f37673b.mo25170d();
        C15318n nVar = new C15318n();
        nVar.mo24847a("nar");
        nVar.f37374t = 0;
        nVar.mo24858i("SensitiveApiException");
        nVar.mo24850c(typeToString(i));
        StringBuilder append = new StringBuilder().append(typeToString(i));
        if (z) {
            str2 = "Open";
        } else {
            str2 = "Close";
        }
        nVar.mo24849b(append.append(str2).toString());
        nVar.f37371q = j;
        nVar.mo24851d("AudioMonitorImpl.java:\n" + C15335a.m28236a(str));
        nVar.f37362h = !z2;
        nVar.mo24854f(AbstractC15412n.C15413a.m28348a(z2));
        nVar.mo24859j(Thread.currentThread().getName());
        nVar.mo24855g(C15434f.f37673b.mo25171e());
        nVar.mo24852e(C15434f.f37673b.f37674c.toString());
        nVar.f37365k = C15434f.f37673b.mo25172f();
        nVar.f37366l = System.currentTimeMillis();
        nVar.f37349A = new C15302a(C15298b.get().getAnchorTaskName());
        HandlerThreadC15486g.m28499b().postDelayed(new RunnableC15334a(nVar), HeliosEnvImpl.INSTANCE.getCrpConfig().getReportDelayedMills());
        nVar.f37375u.add("pair_monitor");
        return nVar;
    }
}
