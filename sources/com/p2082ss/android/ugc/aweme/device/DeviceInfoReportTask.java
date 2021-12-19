package com.p2082ss.android.ugc.aweme.device;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.device.C41459a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58243m;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.player.C62955d;
import com.p2082ss.android.ugc.aweme.utils.C80261bq;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.device.DeviceInfoReportTask */
public class DeviceInfoReportTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(49357);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (((Boolean) C58243m.f132664l.getValue()).booleanValue()) {
            return EnumC58151ae.APP_BACKGROUND;
        }
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        Context a;
        if (!C41459a.f96703a && (a = C17867d.m33078a()) != null) {
            C89219l.m154721d("KEVA_KEY_TIME_DeviceInfoReporter", "");
            long j = C62955d.f142890a.getLong("KEVA_KEY_TIME_DeviceInfoReporter", 0);
            if (j != 0) {
                Date date = new Date(j);
                Date date2 = new Date();
                Calendar instance = Calendar.getInstance();
                Calendar instance2 = Calendar.getInstance();
                instance.setTime(date);
                instance2.setTime(date2);
                if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
                    return;
                }
            }
            long time = new Date().getTime();
            C89219l.m154721d("KEVA_KEY_TIME_DeviceInfoReporter", "");
            C62955d.f142890a.storeLong("KEVA_KEY_TIME_DeviceInfoReporter", time);
            AbstractC88403ab.m153604a((Callable) new CallableC41462b(a)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88925a.m154180b(C88946a.f201991c)).mo116431a_(new AbstractC88406ae<C41459a.C41461a>(a) {
                /* class com.p2082ss.android.ugc.aweme.device.C41459a.C414601 */

                /* renamed from: a */
                final /* synthetic */ Context f96704a;

                static {
                    Covode.recordClassIndex(49359);
                }

                @Override // p4560f.p4561a.AbstractC88406ae
                public final void onError(Throwable th) {
                }

                @Override // p4560f.p4561a.AbstractC88406ae
                public final void onSubscribe(AbstractC88412b bVar) {
                }

                {
                    this.f96704a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88406ae
                public final /* synthetic */ void onSuccess(C41461a aVar) {
                    C33744d a;
                    boolean z;
                    C41461a aVar2 = aVar;
                    C80261bq.C80263a aVar3 = aVar2.f96705a;
                    C80261bq.C80265c cVar = aVar2.f96706b;
                    C80261bq.C80266d dVar = aVar2.f96707c;
                    C80261bq.C80264b bVar = aVar2.f96708d;
                    C33744d a2 = new C33744d().mo59983a("cpu_vendor", aVar3.f179744a).mo59980a("cpu_core_nums", aVar3.f179746c).mo59980a("cpu_freq", aVar3.f179745b).mo59980a("screen_dpi", cVar.f179749a).mo59980a("screen_width", cVar.f179750b).mo59980a("screen_height", cVar.f179751c).mo59981a("app_storage_size", dVar.f179758e).mo59981a("storage_total_external_size", dVar.f179755b).mo59981a("storage_available_external_size", dVar.f179754a).mo59981a("storage_total_internal_size", dVar.f179757d).mo59981a("storage_available_internal_size", dVar.f179756c).mo59981a("memory_total_size", bVar.f179747a).mo59981a("memory_available_size", bVar.f179748b).mo59983a("brand", Build.BRAND).mo59983a("os_version", Build.VERSION.RELEASE).mo59980a("os_api_level", Build.VERSION.SDK_INT).mo59983a("Board", Build.BOARD).mo59983a("brand", Build.BRAND).mo59983a("device", Build.DEVICE).mo59983a("hardware", Build.HARDWARE).mo59983a("manufacturer", Build.MANUFACTURER).mo59983a("model", Build.MODEL).mo59983a("product", Build.PRODUCT).mo59983a("abis", C80261bq.C80267e.f179760a.mo123667a()).mo59981a("build_time", Build.TIME).mo59980a("install_on_sdcard", dVar.f179759f).mo59979a("screen_xdpi", cVar.f179752d).mo59979a("screen_ydpi", cVar.f179753e).mo59980a("screen_width_dp", C13628n.m24522c(this.f96704a, (float) cVar.f179750b)).mo59980a("screen_height_dp", C13628n.m24522c(this.f96704a, (float) cVar.f179751c));
                    double d = (double) cVar.f179750b;
                    double d2 = (double) cVar.f179751c;
                    double d3 = (double) cVar.f179749a;
                    Double.isNaN(d);
                    Double.isNaN(d3);
                    double pow = Math.pow(d / d3, 2.0d);
                    double d4 = (double) cVar.f179749a;
                    Double.isNaN(d2);
                    Double.isNaN(d4);
                    double sqrt = Math.sqrt(pow + Math.pow(d2 / d4, 2.0d));
                    Bundle bundle = new Bundle();
                    bundle.putDouble("screen_inches", sqrt);
                    AppLog.setCustomerHeader(bundle);
                    if (C33744d.f79942b) {
                        a = a2.mo59984a("screen_inches", String.valueOf(sqrt), C33744d.AbstractC33745a.f79944a);
                    } else {
                        a = a2.mo59982a("screen_inches", Double.valueOf(sqrt));
                    }
                    if ((this.f96704a.getResources().getConfiguration().screenLayout & 15) >= 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C39162r.m79460a("device_info", a.mo59982a("is_tablet", Boolean.valueOf(z)).f79943a);
                }
            });
            C41459a.f96703a = true;
        }
    }
}
