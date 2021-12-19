package androidx.work;

import androidx.work.C1597e;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArrayCreatingInputMerger extends AbstractC1599f {
    static {
        Covode.recordClassIndex(1732);
    }

    @Override // androidx.work.AbstractC1599f
    /* renamed from: a */
    public final C1597e mo5334a(List<C1597e> list) {
        Object newInstance;
        C1597e.C1598a aVar = new C1597e.C1598a();
        HashMap hashMap = new HashMap();
        loop0:
        for (C1597e eVar : list) {
            Iterator it = Collections.unmodifiableMap(eVar.f5225b).entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Class<?> cls = value.getClass();
                    Object obj = hashMap.get(key);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (cls2.equals(cls)) {
                            if (cls2.isArray()) {
                                int length = Array.getLength(obj);
                                int length2 = Array.getLength(value);
                                Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                                System.arraycopy(obj, 0, newInstance2, 0, length);
                                System.arraycopy(value, 0, newInstance2, length, length2);
                                value = newInstance2;
                            } else {
                                newInstance = Array.newInstance(obj.getClass(), 2);
                                Array.set(newInstance, 0, obj);
                                Array.set(newInstance, 1, value);
                            }
                        } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            value = m5300a(obj, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = m5300a(value, obj);
                        }
                        hashMap.put(key, value);
                    } else if (!cls.isArray()) {
                        newInstance = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance, 0, value);
                    } else {
                        hashMap.put(key, value);
                    }
                    value = newInstance;
                    hashMap.put(key, value);
                }
            }
            throw new IllegalArgumentException();
        }
        aVar.mo5360a(hashMap);
        return aVar.mo5361a();
    }

    /* renamed from: a */
    private static Object m5300a(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }
}
