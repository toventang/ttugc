package androidx.work;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: androidx.work.f */
public abstract class AbstractC1599f {

    /* renamed from: a */
    private static final String f5227a = AbstractC1600g.m5318a("InputMerger");

    /* renamed from: a */
    public abstract C1597e mo5334a(List<C1597e> list);

    static {
        Covode.recordClassIndex(1752);
    }

    /* renamed from: a */
    public static AbstractC1599f m5315a(String str) {
        try {
            return (AbstractC1599f) Class.forName(str).newInstance();
        } catch (Exception e) {
            AbstractC1600g.m5317a();
            new Throwable[1][0] = e;
            return null;
        }
    }
}
