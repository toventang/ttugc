package com.p2082ss.android.ugc.aweme.shortvideo.p3836i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i.o */
public final class C71891o {

    /* renamed from: a */
    public static final C71891o f161074a = new C71891o();

    private C71891o() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.i.o$a */
    public static final class C71892a<K, V> extends LinkedHashMap<K, V> {
        static {
            Covode.recordClassIndex(84441);
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<K, V>> entrySet() {
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
        public final Set<K> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<V> values() {
            return getValues();
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final V put(K k, V v) {
            if (v == null) {
                return null;
            }
            return (V) super.put(k, v);
        }
    }

    static {
        Covode.recordClassIndex(84440);
    }

    /* renamed from: b */
    public static String m126965b(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.mRecordFilterIds == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("");
        String str = videoPublishEditModel.mRecordFilterIds;
        C89219l.m154716b(str, "");
        for (String str2 : C89361p.m154921c(str, new String[]{","})) {
            if (true ^ C89219l.m154714a((Object) str2, (Object) "null")) {
                sb.append(str2).append(",");
            }
        }
        if (sb.length() <= 0) {
            return sb.toString();
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
        String substring = sb2.substring(0, sb.length() - 1);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: a */
    public static Map<String, String> m126964a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.mBeautyMetadatas == null || videoPublishEditModel.mBeautyMetadatas.isEmpty()) {
            return C89041ag.m154415a();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList<BeautyMetadata> arrayList6 = videoPublishEditModel.mBeautyMetadatas;
        C89219l.m154716b(arrayList6, "");
        for (T t : arrayList6) {
            if (t.getBeautyName().length() > 0) {
                arrayList.add(t.getBeautyName());
                arrayList2.add(t.getBeautyStrength());
                arrayList3.add(t.getBeautyId());
                arrayList4.add(t.getBeautyRes());
                arrayList5.add(t.getBeautyValid());
            }
        }
        if (arrayList.isEmpty()) {
            return C89041ag.m154415a();
        }
        return C89041ag.m154421a(C89387v.m154943a("te_record_beauty_name", C89070n.m154551a(arrayList, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)), C89387v.m154943a("te_record_beauty_strength", C89070n.m154551a(arrayList2, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)), C89387v.m154943a("te_record_beauty_id", C89070n.m154551a(arrayList3, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)), C89387v.m154943a("te_record_beauty_res", C89070n.m154551a(arrayList4, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)), C89387v.m154943a("te_record_beauty_res_valid", C89070n.m154551a(arrayList5, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)));
    }
}
