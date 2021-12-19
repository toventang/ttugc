package com.p2082ss.android.ugc.aweme.video.simplayer.p4228tt;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4417j.C86537q;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.tt.a */
public final class C81032a {

    /* renamed from: a */
    public static final C81032a f181151a = new C81032a();

    /* renamed from: b */
    private static final EnumC86649v f181152b = EnumC86649v.H_High;

    /* renamed from: c */
    private static final C81033a f181153c = new C81033a();

    /* renamed from: com.ss.android.ugc.aweme.video.simplayer.tt.a$a */
    public static final class C81033a extends LinkedHashMap<String, C86535p> {
        static {
            Covode.recordClassIndex(94352);
        }

        C81033a() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, C86535p>> entrySet() {
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
        public final Collection<C86535p> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(C86535p pVar) {
            return super.containsValue((Object) pVar);
        }

        public final /* bridge */ C86535p get(String str) {
            return (C86535p) super.get((Object) str);
        }

        public final /* bridge */ C86535p remove(String str) {
            return (C86535p) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof C86535p)) {
                return false;
            }
            return containsValue((C86535p) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ C86535p get(Object obj) {
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
        public final boolean removeEldestEntry(Map.Entry<String, C86535p> entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }

        public final /* bridge */ C86535p getOrDefault(String str, C86535p pVar) {
            return (C86535p) super.getOrDefault((Object) str, (Object) pVar);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ C86535p getOrDefault(Object obj, C86535p pVar) {
            if (!(obj instanceof String)) {
                return pVar;
            }
            return getOrDefault((String) obj, pVar);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof C86535p)) {
                return remove((String) obj, (C86535p) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, C86535p pVar) {
            return super.remove((Object) str, (Object) pVar);
        }
    }

    private C81032a() {
    }

    static {
        Covode.recordClassIndex(94351);
    }

    /* renamed from: a */
    public static C86535p m140692a(String str) {
        C89219l.m154719c(str, "");
        if (!TextUtils.isEmpty(str)) {
            try {
                C86537q qVar = new C86537q();
                qVar.mo137796a(new JSONObject(str));
                C86535p pVar = new C86535p();
                pVar.mo137788a(qVar);
                return pVar;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
