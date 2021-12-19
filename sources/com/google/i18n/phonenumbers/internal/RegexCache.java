package com.google.i18n.phonenumbers.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class RegexCache {
    private LRUCache<String, Pattern> cache;

    static {
        Covode.recordClassIndex(33695);
    }

    /* access modifiers changed from: package-private */
    public boolean containsRegex(String str) {
        return this.cache.containsKey(str);
    }

    public RegexCache(int i) {
        this.cache = new LRUCache<>(i);
    }

    /* access modifiers changed from: package-private */
    public static class LRUCache<K, V> {
        private LinkedHashMap<K, V> map;
        public int size;

        static {
            Covode.recordClassIndex(33696);
        }

        public LRUCache(int i) {
            this.size = i;
            this.map = new LinkedHashMap<K, V>(((i * 4) / 3) + 1, 0.75f, true) {
                /* class com.google.i18n.phonenumbers.internal.RegexCache.LRUCache.C280441 */

                static {
                    Covode.recordClassIndex(33697);
                }

                /* access modifiers changed from: protected */
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<K, V> entry) {
                    if (size() > LRUCache.this.size) {
                        return true;
                    }
                    return false;
                }
            };
        }

        public synchronized boolean containsKey(K k) {
            boolean containsKey;
            MethodCollector.m26663i(13151);
            containsKey = this.map.containsKey(k);
            MethodCollector.m26664o(13151);
            return containsKey;
        }

        public synchronized V get(K k) {
            V v;
            MethodCollector.m26663i(13149);
            v = this.map.get(k);
            MethodCollector.m26664o(13149);
            return v;
        }

        public synchronized void put(K k, V v) {
            MethodCollector.m26663i(13150);
            this.map.put(k, v);
            MethodCollector.m26664o(13150);
        }
    }

    public Pattern getPatternForRegex(String str) {
        Pattern pattern = this.cache.get(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        this.cache.put(str, compile);
        return compile;
    }
}
