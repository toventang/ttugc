package com.p2082ss.android.ugc.aweme.simreporterdt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.simreporter.api.C74682a;
import com.p2082ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.p2082ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import com.p2082ss.android.ugc.aweme.simreporterdt.impl.C74698a;
import com.p2082ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService */
public final class SimDtReportService implements IPlayerEventReportService {

    /* renamed from: b */
    public C74696a f167878b;

    /* renamed from: c */
    public IPlayerEventReporter f167879c;

    /* renamed from: d */
    private final ExecutorService f167880d;

    /* renamed from: e */
    private ISimReporterConfig f167881e;

    /* renamed from: f */
    private final LinkedHashMap<String, Boolean> f167882f;

    /* renamed from: g */
    private final LinkedHashMap<String, Boolean> f167883g;

    /* renamed from: h */
    private final LinkedHashMap<String, Boolean> f167884h;

    /* renamed from: i */
    private final LinkedHashMap<String, String> f167885i;

    /* renamed from: j */
    private final LinkedHashMap<String, Long> f167886j;

    /* renamed from: k */
    private final LinkedHashMap<String, Long> f167887k;

    /* renamed from: l */
    private final LinkedHashMap<String, Long> f167888l;

    /* renamed from: m */
    private final LinkedHashMap<String, Long> f167889m;

    /* renamed from: n */
    private final LinkedHashMap<String, List<Long>> f167890n;

    /* renamed from: o */
    private final LinkedHashMap<String, List<Long>> f167891o;

    static {
        Covode.recordClassIndex(87518);
    }

    private SimDtReportService(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService$a */
    public static final class C74686a extends LinkedHashMap<String, List<Long>> {
        static {
            Covode.recordClassIndex(87519);
        }

        C74686a() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, List<Long>>> entrySet() {
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
        public final Collection<List<Long>> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(List list) {
            return super.containsValue((Object) list);
        }

        public final /* bridge */ List get(String str) {
            return (List) super.get((Object) str);
        }

        public final /* bridge */ List remove(String str) {
            return (List) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final boolean containsValue(Object obj) {
            if (!C89206ad.m154681c(obj)) {
                return false;
            }
            return containsValue((List) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry<java.lang.String, ? extends java.util.List<java.lang.Long>>] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<Long>> entry) {
            C89219l.m154719c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ List getOrDefault(String str, List list) {
            return (List) super.getOrDefault((Object) str, (Object) list);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> getOrDefault(Object obj, List<Long> list) {
            if (!(obj instanceof String)) {
                return list;
            }
            return getOrDefault((String) obj, (List) list);
        }

        public final boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || C89206ad.m154681c(obj2)) {
                return remove((String) obj, (List) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, List list) {
            return super.remove((Object) str, (Object) list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService$b */
    public static final class C74687b extends LinkedHashMap<String, List<Long>> {
        static {
            Covode.recordClassIndex(87520);
        }

        C74687b() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, List<Long>>> entrySet() {
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
        public final Collection<List<Long>> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(List list) {
            return super.containsValue((Object) list);
        }

        public final /* bridge */ List get(String str) {
            return (List) super.get((Object) str);
        }

        public final /* bridge */ List remove(String str) {
            return (List) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final boolean containsValue(Object obj) {
            if (!C89206ad.m154681c(obj)) {
                return false;
            }
            return containsValue((List) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry<java.lang.String, ? extends java.util.List<java.lang.Long>>] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<Long>> entry) {
            C89219l.m154719c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ List getOrDefault(String str, List list) {
            return (List) super.getOrDefault((Object) str, (Object) list);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> getOrDefault(Object obj, List<Long> list) {
            if (!(obj instanceof String)) {
                return list;
            }
            return getOrDefault((String) obj, (List) list);
        }

        public final boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || C89206ad.m154681c(obj2)) {
                return remove((String) obj, (List) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, List list) {
            return super.remove((Object) str, (Object) list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService$c */
    public static final class C74688c extends LinkedHashMap<String, Long> {
        static {
            Covode.recordClassIndex(87521);
        }

        C74688c() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Long>> entrySet() {
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
        public final Collection<Long> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Long l) {
            return super.containsValue((Object) l);
        }

        public final /* bridge */ Long get(String str) {
            return (Long) super.get((Object) str);
        }

        public final /* bridge */ Long remove(String str) {
            return (Long) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return containsValue((Long) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            C89219l.m154719c(entry, "");
            if (size() > 10) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Long getOrDefault(String str, Long l) {
            return (Long) super.getOrDefault((Object) str, (Object) l);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long getOrDefault(Object obj, Long l) {
            if (!(obj instanceof String)) {
                return l;
            }
            return getOrDefault((String) obj, l);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Long)) {
                return remove((String) obj, (Long) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Long l) {
            return super.remove((Object) str, (Object) l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService$d */
    public static final class C74689d extends LinkedHashMap<String, Boolean> {
        static {
            Covode.recordClassIndex(87522);
        }

        C74689d() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Boolean>> entrySet() {
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
        public final Collection<Boolean> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Boolean bool) {
            return super.containsValue((Object) bool);
        }

        public final /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public final /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return containsValue((Boolean) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            C89219l.m154719c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, (Object) bool);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
            if (!(obj instanceof String)) {
                return bool;
            }
            return getOrDefault((String) obj, bool);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Boolean)) {
                return remove((String) obj, (Boolean) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Boolean bool) {
            return super.remove((Object) str, (Object) bool);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService$e */
    public static final class C74690e extends LinkedHashMap<String, Long> {
        static {
            Covode.recordClassIndex(87523);
        }

        C74690e() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Long>> entrySet() {
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
        public final Collection<Long> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Long l) {
            return super.containsValue((Object) l);
        }

        public final /* bridge */ Long get(String str) {
            return (Long) super.get((Object) str);
        }

        public final /* bridge */ Long remove(String str) {
            return (Long) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return containsValue((Long) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            C89219l.m154719c(entry, "");
            if (size() > 10) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Long getOrDefault(String str, Long l) {
            return (Long) super.getOrDefault((Object) str, (Object) l);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long getOrDefault(Object obj, Long l) {
            if (!(obj instanceof String)) {
                return l;
            }
            return getOrDefault((String) obj, l);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Long)) {
                return remove((String) obj, (Long) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Long l) {
            return super.remove((Object) str, (Object) l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService$f */
    public static final class C74691f extends LinkedHashMap<String, Boolean> {
        static {
            Covode.recordClassIndex(87524);
        }

        C74691f() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Boolean>> entrySet() {
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
        public final Collection<Boolean> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Boolean bool) {
            return super.containsValue((Object) bool);
        }

        public final /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public final /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return containsValue((Boolean) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            C89219l.m154719c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, (Object) bool);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
            if (!(obj instanceof String)) {
                return bool;
            }
            return getOrDefault((String) obj, bool);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Boolean)) {
                return remove((String) obj, (Boolean) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Boolean bool) {
            return super.remove((Object) str, (Object) bool);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService$g */
    public static final class C74692g extends LinkedHashMap<String, Boolean> {
        static {
            Covode.recordClassIndex(87525);
        }

        C74692g() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Boolean>> entrySet() {
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
        public final Collection<Boolean> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Boolean bool) {
            return super.containsValue((Object) bool);
        }

        public final /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public final /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return containsValue((Boolean) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            C89219l.m154719c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, (Object) bool);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
            if (!(obj instanceof String)) {
                return bool;
            }
            return getOrDefault((String) obj, bool);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Boolean)) {
                return remove((String) obj, (Boolean) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Boolean bool) {
            return super.remove((Object) str, (Object) bool);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService$h */
    public static final class C74693h extends LinkedHashMap<String, Long> {
        static {
            Covode.recordClassIndex(87526);
        }

        C74693h() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Long>> entrySet() {
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
        public final Collection<Long> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Long l) {
            return super.containsValue((Object) l);
        }

        public final /* bridge */ Long get(String str) {
            return (Long) super.get((Object) str);
        }

        public final /* bridge */ Long remove(String str) {
            return (Long) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return containsValue((Long) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            C89219l.m154719c(entry, "");
            if (size() > 10) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Long getOrDefault(String str, Long l) {
            return (Long) super.getOrDefault((Object) str, (Object) l);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long getOrDefault(Object obj, Long l) {
            if (!(obj instanceof String)) {
                return l;
            }
            return getOrDefault((String) obj, l);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Long)) {
                return remove((String) obj, (Long) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Long l) {
            return super.remove((Object) str, (Object) l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService$i */
    public static final class C74694i extends LinkedHashMap<String, String> {
        static {
            Covode.recordClassIndex(87527);
        }

        C74694i() {
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
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsValue((String) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ String get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            C89219l.m154719c(entry, "");
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
            if (!(obj instanceof String)) {
                return str;
            }
            return getOrDefault((String) obj, str);
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

    /* renamed from: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService$j */
    public static final class C74695j extends LinkedHashMap<String, Long> {
        static {
            Covode.recordClassIndex(87528);
        }

        C74695j() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Long>> entrySet() {
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
        public final Collection<Long> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Long l) {
            return super.containsValue((Object) l);
        }

        public final /* bridge */ Long get(String str) {
            return (Long) super.get((Object) str);
        }

        public final /* bridge */ Long remove(String str) {
            return (Long) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return containsValue((Long) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            C89219l.m154719c(entry, "");
            if (size() > 10) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Long getOrDefault(String str, Long l) {
            return (Long) super.getOrDefault((Object) str, (Object) l);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long getOrDefault(Object obj, Long l) {
            if (!(obj instanceof String)) {
                return l;
            }
            return getOrDefault((String) obj, l);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Long)) {
                return remove((String) obj, (Long) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Long l) {
            return super.remove((Object) str, (Object) l);
        }
    }

    private /* synthetic */ SimDtReportService() {
        this(new C74698a());
    }

    private SimDtReportService(IPlayerEventReporter iPlayerEventReporter) {
        this.f167879c = iPlayerEventReporter;
        this.f167878b = new C74696a();
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        ExecutorService a2 = C40780g.m82242a(a.mo70028a());
        C89219l.m154709a((Object) a2, "");
        this.f167880d = a2;
        this.f167881e = new C74682a();
        this.f167882f = new C74689d();
        this.f167883g = new C74691f();
        this.f167884h = new C74692g();
        this.f167885i = new C74694i();
        this.f167886j = new C74695j();
        this.f167887k = new C74690e();
        this.f167888l = new C74693h();
        this.f167889m = new C74688c();
        this.f167890n = new C74687b();
        this.f167891o = new C74686a();
    }
}
