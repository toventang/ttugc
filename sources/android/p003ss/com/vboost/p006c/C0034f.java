package android.p003ss.com.vboost.p006c;

import android.p003ss.com.vboost.CapabilityType;
import android.p003ss.com.vboost.p004a.C0005a;
import android.p003ss.com.vboost.p005b.C0013d;
import android.p003ss.com.vboost.p005b.C0021j;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: android.ss.com.vboost.c.f */
public class C0034f extends C0027a implements AbstractC0037h {

    /* renamed from: c */
    private static final String f123c = C0034f.class.getSimpleName();

    /* renamed from: b */
    public boolean f124b;

    /* renamed from: d */
    private C0005a f125d;

    static {
        Covode.recordClassIndex(37);
    }

    /* renamed from: android.ss.com.vboost.c.f$1 */
    static /* synthetic */ class C00351 {

        /* renamed from: a */
        static final /* synthetic */ int[] f126a;

        /* renamed from: b */
        static final /* synthetic */ int[] f127b;

        /* JADX WARNING: Can't wrap try/catch for region: R(124:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(2:121|122)|123|125|126|127|128|129|130|131|132|133|134|135|136|(3:137|138|140)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(126:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(2:121|122)|123|125|126|127|128|129|130|131|132|133|134|135|136|137|138|140) */
        /* JADX WARNING: Can't wrap try/catch for region: R(127:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(2:121|122)|123|125|126|127|128|129|130|131|132|133|134|135|136|137|138|140) */
        /* JADX WARNING: Can't wrap try/catch for region: R(128:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(2:121|122)|123|125|126|127|128|129|130|131|132|133|134|135|136|137|138|140) */
        /* JADX WARNING: Can't wrap try/catch for region: R(129:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(2:121|122)|123|125|126|127|128|129|130|131|132|133|134|135|136|137|138|140) */
        /* JADX WARNING: Can't wrap try/catch for region: R(130:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(2:121|122)|123|125|126|127|128|129|130|131|132|133|134|135|136|137|138|140) */
        /* JADX WARNING: Can't wrap try/catch for region: R(131:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(2:121|122)|123|125|126|127|128|129|130|131|132|133|134|135|136|137|138|140) */
        /* JADX WARNING: Can't wrap try/catch for region: R(132:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(2:121|122)|123|125|126|127|128|129|130|131|132|133|134|135|136|137|138|140) */
        /* JADX WARNING: Can't wrap try/catch for region: R(133:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|125|126|127|128|129|130|131|132|133|134|135|136|137|138|140) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0213 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x021f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x022b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0237 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0243 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x024f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x025b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0267 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x0273 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x027f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x028b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x02a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x02b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x02bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x02c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x02d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x02da */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x010d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x013d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0155 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0161 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x016d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0179 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0185 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0191 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x019d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01cb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01d7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01e3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01ef */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01fb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0207 */
        static {
            /*
            // Method dump skipped, instructions count: 741
            */
            throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.p006c.C0034f.C00351.<clinit>():void");
        }
    }

    @Override // android.p003ss.com.vboost.p006c.AbstractC0037h
    /* renamed from: a */
    public final boolean mo28a(CapabilityType capabilityType) {
        C0005a aVar = this.f125d;
        if (aVar == null || !aVar.mo4a().contains(capabilityType)) {
            return false;
        }
        return true;
    }

    @Override // android.p003ss.com.vboost.p006c.AbstractC0037h
    /* renamed from: b */
    public final Object mo29b(C0038i iVar) {
        int i = C00351.f126a[iVar.f130a.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            C0013d.m27a();
        } else if (i == 6) {
            C0021j.m57a();
        } else if (i == 7) {
            C0013d.m27a();
            iVar.f133d.f138a.getDesc();
        }
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0034f(android.content.Context r11) {
        /*
        // Method dump skipped, instructions count: 867
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.p006c.C0034f.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0166  */
    @Override // android.p003ss.com.vboost.p006c.AbstractC0037h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo27a(android.p003ss.com.vboost.p006c.C0038i r14) {
        /*
        // Method dump skipped, instructions count: 570
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.p006c.C0034f.mo27a(android.ss.com.vboost.c.i):java.lang.Object");
    }
}
