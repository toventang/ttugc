package p4646ms.p4647bd.p4648o;

import android.content.Context;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;

/* renamed from: ms.bd.o.v1 */
public class C89947v1 {

    /* renamed from: a */
    private static int f203833a;

    static {
        Covode.recordClassIndex(106044);
    }

    /* renamed from: a */
    public static String m156063a(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                f203833a = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable unused) {
            }
        }
        return new StringBuilder().append(f203833a).toString();
    }
}
