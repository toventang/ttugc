package com.bytedance.sysoptimizer;

import android.content.Context;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.HashMap;

public class LayoutInflaterAsyncCrashOptimizer {
    private static boolean hasFixed;

    static {
        Covode.recordClassIndex(26574);
    }

    public static final class FixLayoutInflaterAsyncHashMap<K, V> extends HashMap<K, V> {
        static {
            Covode.recordClassIndex(26575);
        }

        public final synchronized void clear() {
            MethodCollector.m26663i(8256);
            super.clear();
            MethodCollector.m26664o(8256);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final synchronized V remove(Object obj) {
            V v;
            MethodCollector.m26663i(8121);
            v = (V) super.remove(obj);
            MethodCollector.m26664o(8121);
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final synchronized V put(K k, V v) {
            V v2;
            MethodCollector.m26663i(7971);
            v2 = (V) super.put(k, v);
            MethodCollector.m26664o(7971);
            return v2;
        }
    }

    public static synchronized void fix(Context context) {
        synchronized (LayoutInflaterAsyncCrashOptimizer.class) {
            MethodCollector.m26663i(7965);
            if (hasFixed) {
                MethodCollector.m26664o(7965);
                return;
            }
            hasFixed = true;
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("sConstructorMap");
                declaredField.setAccessible(true);
                declaredField.set(null, new FixLayoutInflaterAsyncHashMap());
                MethodCollector.m26664o(7965);
            } catch (Exception e) {
                e.printStackTrace();
                MethodCollector.m26664o(7965);
            }
        }
    }
}
