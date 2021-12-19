package com.p2082ss.android.ugc.aweme.feed.p2944e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.e.m */
public final class C49440m {

    /* renamed from: c */
    public static final C49441a f113622c = new C49441a((byte) 0);

    /* renamed from: a */
    final LinkedHashMap<String, String> f113623a = new C49443c();

    /* renamed from: b */
    final LinkedHashMap<String, String> f113624b = new C49442b();

    static {
        Covode.recordClassIndex(58253);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.m$a */
    public static final class C49441a {
        static {
            Covode.recordClassIndex(58254);
        }

        private C49441a() {
        }

        public /* synthetic */ C49441a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.m$b */
    public static final class C49442b extends LinkedHashMap<String, String> {
        static {
            Covode.recordClassIndex(58255);
        }

        C49442b() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, String>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<String> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(String str) {
            return super.containsValue((Object) str);
        }

        public final /* bridge */ String get(String str) {
            return (String) super.get((Object) str);
        }

        public final /* bridge */ String remove(String str) {
            return (String) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return containsKey((String) obj);
            }
            return false;
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return containsValue((String) obj);
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ String get(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return get((String) obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return remove((String) obj);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            C89219l.m154721d(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ String getOrDefault(String str, String str2) {
            return (String) super.getOrDefault((Object) str, (Object) str2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ String getOrDefault(Object obj, String str) {
            if (obj == null || (obj instanceof String)) {
                return getOrDefault((String) obj, str);
            }
            return str;
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof String)) {
                return remove((String) obj, (String) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, String str2) {
            return super.remove((Object) str, (Object) str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.m$c */
    public static final class C49443c extends LinkedHashMap<String, String> {
        static {
            Covode.recordClassIndex(58256);
        }

        C49443c() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, String>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<String> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(String str) {
            return super.containsValue((Object) str);
        }

        public final /* bridge */ String get(String str) {
            return (String) super.get((Object) str);
        }

        public final /* bridge */ String remove(String str) {
            return (String) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return containsKey((String) obj);
            }
            return false;
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return containsValue((String) obj);
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ String get(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return get((String) obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (obj == null || (obj instanceof String)) {
                return remove((String) obj);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            C89219l.m154721d(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ String getOrDefault(String str, String str2) {
            return (String) super.getOrDefault((Object) str, (Object) str2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ String getOrDefault(Object obj, String str) {
            if (obj == null || (obj instanceof String)) {
                return getOrDefault((String) obj, str);
            }
            return str;
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof String)) {
                return remove((String) obj, (String) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, String str2) {
            return super.remove((Object) str, (Object) str2);
        }
    }

    /* renamed from: a */
    public final boolean mo81119a(String str) {
        if (str == null || !this.f113624b.containsKey(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo81118a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f113624b.put(str2, str);
        }
    }
}
