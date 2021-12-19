package org.chromium;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.base.C87463k;
import com.ttnet.org.chromium.net.AbstractC87670v;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: org.chromium.b */
public class C90227b extends AbstractC87670v {

    /* renamed from: a */
    private static C90227b f204963a;

    static {
        Covode.recordClassIndex(106486);
    }

    private C90227b() {
    }

    /* renamed from: a */
    public static C90227b m156901a() {
        MethodCollector.m26663i(6024);
        if (f204963a == null) {
            synchronized (C90227b.class) {
                try {
                    if (f204963a == null) {
                        f204963a = new C90227b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6024);
                    throw th;
                }
            }
        }
        C90227b bVar = f204963a;
        MethodCollector.m26664o(6024);
        return bVar;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87670v
    /* renamed from: a */
    public final void mo142093a(String str, String str2) {
        C90228c.m156904a().mo145263a(str, str2);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87670v
    /* renamed from: a */
    public final void mo142094a(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        int i3 = i;
        C90228c a = C90228c.m156904a();
        if (C90229d.m156924a().loggerDebug()) {
            C90229d.m156924a().loggerD("CronetAppProviderManager", "handleApiResult ");
        }
        try {
            if (a.f204965a != null) {
                Object obj = null;
                if (!z) {
                    switch (i3) {
                        case 1:
                            i3 = 1;
                            break;
                        case 2:
                            i3 = 2;
                            break;
                        case 3:
                            i3 = 3;
                            break;
                        case 4:
                            i3 = 4;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            i3 = 5;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            i3 = 6;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            i3 = 7;
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            i3 = 8;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            i3 = 9;
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            i3 = 10;
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            i3 = 11;
                            break;
                        default:
                            if (C90229d.m156924a().loggerDebug()) {
                                C90229d.m156924a().loggerD("monitor", "Unknown error code: ".concat(String.valueOf(i3)));
                                break;
                            }
                            break;
                    }
                    NetworkExceptionImpl networkExceptionImpl = new NetworkExceptionImpl("Exception in CronetUrlRequest: ".concat(String.valueOf(str7)), i3, i2);
                    switch (networkExceptionImpl.getErrorCode()) {
                        case 1:
                            obj = new UnknownHostException(networkExceptionImpl.getMessage());
                            break;
                        case 2:
                        case 3:
                            obj = new ConnectException(networkExceptionImpl.getMessage());
                            break;
                        case 4:
                            obj = new SocketTimeoutException(networkExceptionImpl.getMessage());
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            obj = new ConnectException(networkExceptionImpl.getMessage());
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            obj = new ConnectTimeoutException(networkExceptionImpl.getMessage());
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            obj = new SocketException("reset by peer " + networkExceptionImpl.getMessage());
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            obj = new NoRouteToHostException(networkExceptionImpl.getMessage());
                            break;
                        default:
                            obj = networkExceptionImpl;
                            break;
                    }
                }
                C87463k.m151800a(a.f204965a).mo141524a("handleApiResult", new Class[]{Boolean.TYPE, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, String.class, String.class, Exception.class}, Boolean.valueOf(z), str, str2, str3, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Boolean.valueOf(z2), Long.valueOf(j11), Long.valueOf(j12), str4, str5, str6, obj);
            }
        } catch (Throwable unused) {
        }
    }
}
