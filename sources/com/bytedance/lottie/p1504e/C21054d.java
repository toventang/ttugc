package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20977a;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20979c;
import com.bytedance.lottie.p1499c.p1500a.C20980d;
import com.bytedance.lottie.p1499c.p1500a.C20982f;
import com.bytedance.lottie.p1499c.p1500a.C20984h;
import com.bytedance.lottie.p1505f.C21087h;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.List;

/* renamed from: com.bytedance.lottie.e.d */
public final class C21054d {
    static {
        Covode.recordClassIndex(24670);
    }

    /* renamed from: b */
    static C20982f m39638b(JsonReader jsonReader, C21088g gVar) {
        return new C20982f(m39636a(jsonReader, C21087h.m39715a(), gVar, C21073v.f49946a));
    }

    /* renamed from: c */
    static C20984h m39639c(JsonReader jsonReader, C21088g gVar) {
        return new C20984h(m39636a(jsonReader, C21087h.m39715a(), gVar, C21046aa.f49936a));
    }

    /* renamed from: d */
    static C20977a m39640d(JsonReader jsonReader, C21088g gVar) {
        return new C20977a(m39637a(jsonReader, gVar, C21056f.f49937a));
    }

    /* renamed from: a */
    static C20980d m39635a(JsonReader jsonReader, C21088g gVar) {
        return new C20980d(m39637a(jsonReader, gVar, C21063m.f49941a));
    }

    /* renamed from: a */
    static C20979c m39634a(JsonReader jsonReader, C21088g gVar, int i) {
        return new C20979c(m39637a(jsonReader, gVar, new C21060j(i)));
    }

    /* renamed from: a */
    public static C20978b m39633a(JsonReader jsonReader, C21088g gVar, boolean z) {
        float f;
        if (z) {
            f = C21087h.m39715a();
        } else {
            f = 1.0f;
        }
        return new C20978b(m39636a(jsonReader, f, gVar, C21059i.f49939a));
    }

    /* renamed from: a */
    static <T> List<C21089a<T>> m39637a(JsonReader jsonReader, C21088g gVar, AbstractC21051af<T> afVar) {
        return C21067p.m39663a(jsonReader, gVar, 1.0f, afVar);
    }

    /* renamed from: a */
    private static <T> List<C21089a<T>> m39636a(JsonReader jsonReader, float f, C21088g gVar, AbstractC21051af<T> afVar) {
        return C21067p.m39663a(jsonReader, gVar, f, afVar);
    }
}
