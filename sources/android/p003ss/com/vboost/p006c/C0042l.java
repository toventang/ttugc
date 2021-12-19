package android.p003ss.com.vboost.p006c;

import android.content.Context;
import android.os.Build;
import android.p003ss.com.vboost.CapabilityType;
import android.p003ss.com.vboost.EnumC0009b;
import android.p003ss.com.vboost.EnumC0058e;
import android.p003ss.com.vboost.p004a.C0005a;
import android.p003ss.com.vboost.p004a.C0007c;
import android.p003ss.com.vboost.p004a.C0008d;
import android.p003ss.com.vboost.p004a.EnumC0006b;
import android.p003ss.com.vboost.p006c.C0040k;
import android.p003ss.com.vboost.p008e.C0059a;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.samsung.sdk.sperf.CustomParams;
import com.samsung.sdk.sperf.PerformanceManager;
import com.samsung.sdk.sperf.SPerf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: android.ss.com.vboost.c.l */
public class C0042l extends C0027a implements AbstractC0037h {

    /* renamed from: b */
    private static final String f144b = C0042l.class.getSimpleName();

    /* renamed from: e */
    private static int f145e = 6000;

    /* renamed from: c */
    private PerformanceManager f146c;

    /* renamed from: d */
    private C0005a f147d;

    static {
        Covode.recordClassIndex(45);
    }

    /* renamed from: android.ss.com.vboost.c.l$1 */
    static /* synthetic */ class C00431 {

        /* renamed from: a */
        static final /* synthetic */ int[] f148a;

        /* renamed from: b */
        static final /* synthetic */ int[] f149b;

        /* JADX WARNING: Can't wrap try/catch for region: R(135:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(136:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(137:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(138:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(139:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(140:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(141:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(142:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(143:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(144:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(145:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(2:131|132)|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(3:157|158|160)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(148:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|160) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01f1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0209 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0215 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x0221 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x022b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x0237 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x0243 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x024f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x025b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0267 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x0273 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x027f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x028b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x02a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x02b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x02bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x02c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x02d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x02da */
        /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x02e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x02ee */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x02f8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x0302 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x030c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x010d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x013d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0155 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0161 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x016d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0179 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0185 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0191 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x019d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01cd */
        static {
            /*
            // Method dump skipped, instructions count: 791
            */
            throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.p006c.C0042l.C00431.<clinit>():void");
        }
    }

    @Override // android.p003ss.com.vboost.p006c.AbstractC0037h
    /* renamed from: a */
    public final boolean mo28a(CapabilityType capabilityType) {
        C0005a aVar = this.f147d;
        if (aVar == null || !aVar.mo4a().contains(capabilityType)) {
            return false;
        }
        return true;
    }

    @Override // android.p003ss.com.vboost.p006c.AbstractC0037h
    /* renamed from: b */
    public final Object mo29b(C0038i iVar) {
        if (this.f146c == null) {
            return null;
        }
        int i = C00431.f148a[iVar.f130a.ordinal()];
        if (i != 10) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    return Integer.valueOf(this.f146c.stop());
                default:
                    return 0;
            }
        } else {
            CustomParams customParams = new CustomParams();
            customParams.add(8, 0, 99999999);
            return Integer.valueOf(this.f146c.start(customParams));
        }
    }

    C0042l(Context context) {
        if (Build.VERSION.SDK_INT >= 29 && SPerf.initialize(context)) {
            PerformanceManager instance = PerformanceManager.getInstance();
            this.f146c = instance;
            if (instance != null) {
                HashSet<CapabilityType> hashSet = new HashSet();
                hashSet.add(CapabilityType.PRESET_SCENE);
                hashSet.add(CapabilityType.CPU_FREQ_MIN);
                hashSet.add(CapabilityType.CPU_FREQ_MAX);
                hashSet.add(CapabilityType.CPU_CORE_MIN);
                hashSet.add(CapabilityType.CPU_CORE_MAX);
                hashSet.add(CapabilityType.GPU_FREQ_MIN);
                hashSet.add(CapabilityType.GPU_FREQ_MAX);
                hashSet.add(CapabilityType.BUS_FREQ_MIN);
                hashSet.add(CapabilityType.BUS_FREQ_MAX);
                hashSet.add(CapabilityType.TASK_PRIORITY);
                hashSet.add(CapabilityType.CPU_AFFINITY);
                hashSet.add(CapabilityType.IDLE_STATE);
                m60a(hashSet);
                C0005a aVar = new C0005a();
                this.f147d = aVar;
                aVar.mo8a(hashSet);
                for (CapabilityType capabilityType : hashSet) {
                    switch (C00431.f148a[capabilityType.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            C0007c cVar = new C0007c(true, 5, 1000);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(cVar);
                            this.f147d.mo5a(capabilityType, arrayList);
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            this.f147d.mo7a(new C0008d(0, 5));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            this.f147d.mo6a(EnumC0006b.BIND_CLUSTER);
                            break;
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put(EnumC0058e.LEVEL_9, new C0032d(0, Integer.MAX_VALUE, EnumC0036g.PLATFORM, EnumC0058e.LEVEL_9));
                hashMap.put(EnumC0058e.LEVEL_8, new C0032d(0, Integer.MAX_VALUE, EnumC0036g.PLATFORM, EnumC0058e.LEVEL_8));
                hashMap.put(EnumC0058e.LEVEL_7, new C0032d(3, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_8));
                hashMap.put(EnumC0058e.LEVEL_6, new C0032d(3, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_8));
                hashMap.put(EnumC0058e.LEVEL_5, new C0032d(2, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_5));
                hashMap.put(EnumC0058e.LEVEL_4, new C0032d(2, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_4));
                hashMap.put(EnumC0058e.LEVEL_3, new C0032d(1, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_3));
                hashMap.put(EnumC0058e.LEVEL_2, new C0032d(1, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_2));
                hashMap.put(EnumC0058e.LEVEL_1, new C0032d(0, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_1));
                hashMap.put(EnumC0058e.LEVEL_0, new C0032d(0, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_0));
                C0040k.C0041a.f143a.mo34a(EnumC0036g.VENDOR, CapabilityType.CPU_FREQ_MIN, hashMap);
                C0040k.C0041a.f143a.mo34a(EnumC0036g.VENDOR, CapabilityType.CPU_FREQ_MAX, hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(EnumC0058e.LEVEL_9, new C0032d(0, Integer.MAX_VALUE, EnumC0036g.PLATFORM, EnumC0058e.LEVEL_9));
                hashMap2.put(EnumC0058e.LEVEL_8, new C0032d(0, Integer.MAX_VALUE, EnumC0036g.PLATFORM, EnumC0058e.LEVEL_8));
                hashMap2.put(EnumC0058e.LEVEL_7, new C0032d(3, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_8));
                hashMap2.put(EnumC0058e.LEVEL_6, new C0032d(3, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_8));
                hashMap2.put(EnumC0058e.LEVEL_5, new C0032d(2, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_5));
                hashMap2.put(EnumC0058e.LEVEL_4, new C0032d(2, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_4));
                hashMap2.put(EnumC0058e.LEVEL_3, new C0032d(1, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_3));
                hashMap2.put(EnumC0058e.LEVEL_2, new C0032d(1, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_2));
                hashMap2.put(EnumC0058e.LEVEL_1, new C0032d(0, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_1));
                hashMap2.put(EnumC0058e.LEVEL_0, new C0032d(0, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_0));
                C0040k.C0041a.f143a.mo34a(EnumC0036g.VENDOR, CapabilityType.GPU_FREQ_MIN, hashMap2);
                C0040k.C0041a.f143a.mo34a(EnumC0036g.VENDOR, CapabilityType.GPU_FREQ_MAX, hashMap2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put(EnumC0058e.LEVEL_9, new C0032d(3, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_9));
                hashMap3.put(EnumC0058e.LEVEL_8, new C0032d(3, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_8));
                hashMap3.put(EnumC0058e.LEVEL_7, new C0032d(2, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_7));
                hashMap3.put(EnumC0058e.LEVEL_6, new C0032d(2, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_6));
                hashMap3.put(EnumC0058e.LEVEL_5, new C0032d(2, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_5));
                hashMap3.put(EnumC0058e.LEVEL_4, new C0032d(1, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_4));
                hashMap3.put(EnumC0058e.LEVEL_3, new C0032d(1, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_3));
                hashMap3.put(EnumC0058e.LEVEL_2, new C0032d(1, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_2));
                hashMap3.put(EnumC0058e.LEVEL_1, new C0032d(0, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_1));
                hashMap3.put(EnumC0058e.LEVEL_0, new C0032d(0, 1000, EnumC0036g.VENDOR, EnumC0058e.LEVEL_0));
                C0040k.C0041a.f143a.mo34a(EnumC0036g.VENDOR, CapabilityType.BUS_FREQ_MIN, hashMap3);
                C0040k.C0041a.f143a.mo34a(EnumC0036g.VENDOR, CapabilityType.BUS_FREQ_MAX, hashMap3);
                HashMap hashMap4 = new HashMap();
                hashMap4.put(EnumC0058e.LEVEL_9, new C0032d(4, 99999999, EnumC0036g.VENDOR, EnumC0058e.LEVEL_9));
                hashMap4.put(EnumC0058e.LEVEL_8, new C0032d(4, 99999999, EnumC0036g.VENDOR, EnumC0058e.LEVEL_8));
                hashMap4.put(EnumC0058e.LEVEL_7, new C0032d(3, 99999999, EnumC0036g.VENDOR, EnumC0058e.LEVEL_7));
                hashMap4.put(EnumC0058e.LEVEL_6, new C0032d(3, 99999999, EnumC0036g.VENDOR, EnumC0058e.LEVEL_6));
                hashMap4.put(EnumC0058e.LEVEL_5, new C0032d(2, 99999999, EnumC0036g.VENDOR, EnumC0058e.LEVEL_5));
                hashMap4.put(EnumC0058e.LEVEL_4, new C0032d(2, 99999999, EnumC0036g.VENDOR, EnumC0058e.LEVEL_4));
                hashMap4.put(EnumC0058e.LEVEL_3, new C0032d(1, 99999999, EnumC0036g.VENDOR, EnumC0058e.LEVEL_3));
                hashMap4.put(EnumC0058e.LEVEL_2, new C0032d(1, 99999999, EnumC0036g.VENDOR, EnumC0058e.LEVEL_2));
                hashMap4.put(EnumC0058e.LEVEL_1, new C0032d(0, 99999999, EnumC0036g.VENDOR, EnumC0058e.LEVEL_1));
                hashMap4.put(EnumC0058e.LEVEL_0, new C0032d(0, 99999999, EnumC0036g.VENDOR, EnumC0058e.LEVEL_0));
                C0040k.C0041a.f143a.mo34a(EnumC0036g.VENDOR, CapabilityType.TASK_PRIORITY, hashMap4);
                if (C0059a.m96a()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("vendor", "ss");
                        C0059a.m95a("vboost_event_active", jSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // android.p003ss.com.vboost.p006c.AbstractC0037h
    /* renamed from: a */
    public final Object mo27a(C0038i iVar) {
        if (this.f146c == null) {
            return null;
        }
        switch (C00431.f148a[iVar.f130a.ordinal()]) {
            case 1:
                CustomParams customParams = new CustomParams();
                customParams.add(1, iVar.f132c, (int) iVar.f135f);
                return Integer.valueOf(this.f146c.start(customParams));
            case 2:
                CustomParams customParams2 = new CustomParams();
                customParams2.add(3, iVar.f132c, (int) iVar.f135f);
                return Integer.valueOf(this.f146c.start(customParams2));
            case 3:
                CustomParams customParams3 = new CustomParams();
                customParams3.add(5, iVar.f132c, (int) iVar.f135f);
                return Integer.valueOf(this.f146c.start(customParams3));
            case 4:
                CustomParams customParams4 = new CustomParams();
                customParams4.add(0, iVar.f132c, (int) iVar.f135f);
                return Integer.valueOf(this.f146c.start(customParams4));
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                CustomParams customParams5 = new CustomParams();
                customParams5.add(2, iVar.f132c, (int) iVar.f135f);
                return Integer.valueOf(this.f146c.start(customParams5));
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                CustomParams customParams6 = new CustomParams();
                customParams6.add(4, iVar.f132c, (int) iVar.f135f);
                return Integer.valueOf(this.f146c.start(customParams6));
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                CustomParams customParams7 = new CustomParams();
                customParams7.add(7, iVar.f132c, (int) iVar.f135f);
                return Integer.valueOf(this.f146c.start(customParams7));
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                CustomParams customParams8 = new CustomParams();
                customParams8.add(6, iVar.f132c, (int) iVar.f135f);
                return Integer.valueOf(this.f146c.start(customParams8));
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                if (iVar.f132c > 5) {
                    iVar.f132c = 5;
                }
                if (iVar.f132c < 0) {
                    iVar.f132c = 0;
                }
                CustomParams customParams9 = new CustomParams();
                customParams9.add(9, iVar.f132c, 99999999);
                return Integer.valueOf(this.f146c.start(customParams9));
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                if (iVar.f136g == EnumC0009b.GOLD || iVar.f136g == EnumC0009b.SUPER) {
                    CustomParams customParams10 = new CustomParams();
                    customParams10.add(8, 1, 99999999);
                    return Integer.valueOf(this.f146c.start(customParams10));
                }
                CustomParams customParams11 = new CustomParams();
                customParams11.add(8, 2, 99999999);
                return Integer.valueOf(this.f146c.start(customParams11));
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                C0039j jVar = iVar.f133d;
                jVar.f138a.getDesc();
                switch (C00431.f149b[jVar.f138a.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                    case 15:
                    case 16:
                    case 17:
                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                    case 19:
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case BuildConfig.VERSION_CODE /*{ENCODED_INT: 44}*/:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        m80a(0, f145e);
                        m80a(1, f145e);
                        m80a(2, f145e);
                        break;
                }
                return 1;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                CustomParams customParams12 = new CustomParams();
                customParams12.add(10, iVar.f132c, (int) iVar.f135f);
                return Integer.valueOf(this.f146c.start(customParams12));
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private int m80a(int i, int i2) {
        PerformanceManager performanceManager;
        if (i < 0 || i > 2 || (performanceManager = this.f146c) == null) {
            return -1;
        }
        int i3 = 64;
        if (i != 0) {
            if (i == 1) {
                i3 = 128;
            } else if (i == 2) {
                i3 = 256;
            }
        }
        return performanceManager.start(i3, i2);
    }
}
