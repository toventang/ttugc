package p4600h.p4620k;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

/* renamed from: h.k.b */
public interface AbstractC89276b<R> extends AbstractC89275a {
    static {
        Covode.recordClassIndex(105360);
    }

    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    String getName();

    List<Object> getParameters();

    AbstractC89292l getReturnType();

    List<Object> getTypeParameters();

    EnumC89293m getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
