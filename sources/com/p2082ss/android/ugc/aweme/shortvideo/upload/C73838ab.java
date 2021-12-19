package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ab */
public final class C73838ab {
    static {
        Covode.recordClassIndex(86584);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ab$a */
    static final class C73839a extends AbstractC89220m implements AbstractC89172b<String, List<? extends C73922v>> {

        /* renamed from: a */
        public static final C73839a f165762a = new C73839a();

        static {
            Covode.recordClassIndex(86585);
        }

        C73839a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ List<? extends C73922v> invoke(String str) {
            return m129902a(str);
        }

        /* renamed from: a */
        public static List<C73922v> m129902a(String str) {
            C89219l.m154721d(str, "");
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        int optInt = jSONObject.optInt("max_speed");
                        JSONObject optJSONObject = jSONObject.optJSONObject("setting");
                        if (optJSONObject != null) {
                            String jSONObject2 = optJSONObject.toString();
                            C89219l.m154716b(jSONObject2, "");
                            arrayList.add(new C73922v(optInt, jSONObject2));
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static final String m129901a(UploadSpeedInfo uploadSpeedInfo) {
        String a;
        Object next;
        if (uploadSpeedInfo == null || uploadSpeedInfo.getSpeed() <= 0 || (a = C16048b.m29633a().mo25417a(true, "ve_synthesis_settings_by_upload_speed", "")) == null || a.length() == 0) {
            return null;
        }
        List<C73922v> a2 = C73839a.m129902a(a);
        if ((!a2.isEmpty()) && a2 != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : a2) {
                if (((long) t.f165961a) > uploadSpeedInfo.getSpeed()) {
                    arrayList.add(t);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int i = ((C73922v) next).f165961a;
                    do {
                        Object next2 = it.next();
                        int i2 = ((C73922v) next2).f165961a;
                        if (i > i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it.hasNext());
                }
            }
            C73922v vVar = (C73922v) next;
            if (vVar != null) {
                uploadSpeedInfo.setUsedCompilerSettingGroup(vVar.f165961a);
                return vVar.f165962b;
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ab$b */
    public static final class C73840b<T> implements Comparator {
        static {
            Covode.recordClassIndex(86586);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.f147623c), Integer.valueOf(t2.f147623c));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ab$c */
    public static final class C73841c<T> implements Comparator {
        static {
            Covode.recordClassIndex(86587);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.f147623c), Integer.valueOf(t2.f147623c));
        }
    }
}
