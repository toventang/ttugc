package com.bytedance.keva.ext.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FixedSizeCache<K, V> {
    private final ConcurrentHashMap<K, V> map;
    private final int maxSize;
    private int size;

    static {
        Covode.recordClassIndex(24252);
    }

    public final int maxSize() {
        return this.maxSize;
    }

    public final synchronized int size() {
        int i;
        MethodCollector.m26663i(9254);
        i = this.size;
        MethodCollector.m26664o(9254);
        return i;
    }

    public final synchronized Map<K, V> snapshot() {
        ConcurrentHashMap concurrentHashMap;
        MethodCollector.m26663i(9255);
        concurrentHashMap = new ConcurrentHashMap(this.map);
        MethodCollector.m26664o(9255);
        return concurrentHashMap;
    }

    public final V get(K k) {
        return this.map.get(k);
    }

    public final V remove(K k) {
        return this.map.remove(k);
    }

    public FixedSizeCache(int i) {
        if (i > 0) {
            this.maxSize = i;
            this.map = new ConcurrentHashMap<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void put(K k, V v) {
        MethodCollector.m26663i(9107);
        synchronized (this) {
            try {
                int i = this.size;
                if (i + 1 <= this.maxSize) {
                    this.size = i + 1;
                    this.map.put(k, v);
                    MethodCollector.m26664o(9107);
                }
            } finally {
                MethodCollector.m26664o(9107);
            }
        }
    }
}
