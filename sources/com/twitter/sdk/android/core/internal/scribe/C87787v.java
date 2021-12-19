package com.twitter.sdk.android.core.internal.scribe;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.v */
public class C87787v {
    @AbstractC27891c(mo46611a = "event_namespace")

    /* renamed from: a */
    final C87764e f199410a;
    @AbstractC27891c(mo46611a = "ts")

    /* renamed from: b */
    final String f199411b;
    @AbstractC27891c(mo46611a = "format_version")

    /* renamed from: c */
    final String f199412c = "2";
    @AbstractC27891c(mo46611a = "_category_")

    /* renamed from: d */
    final String f199413d;
    @AbstractC27891c(mo46611a = "items")

    /* renamed from: e */
    final List<Object> f199414e;

    static {
        Covode.recordClassIndex(103785);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        C87764e eVar = this.f199410a;
        int i5 = 0;
        if (eVar != null) {
            i = eVar.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str = this.f199411b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.f199412c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.f199413d;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        List<Object> list = this.f199414e;
        if (list != null) {
            i5 = list.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        return "event_namespace=" + this.f199410a + ", ts=" + this.f199411b + ", format_version=" + this.f199412c + ", _category_=" + this.f199413d + ", items=" + ("[" + TextUtils.join(", ", this.f199414e) + "]");
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.v$a */
    public static class C87788a implements AbstractC87766f<C87787v> {

        /* renamed from: a */
        private final C27910f f199415a;

        static {
            Covode.recordClassIndex(103786);
        }

        public C87788a(C27910f fVar) {
            this.f199415a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87766f
        /* renamed from: a */
        public final /* synthetic */ byte[] mo142220a(C87787v vVar) {
            return this.f199415a.mo46674b(vVar).getBytes("UTF-8");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C87787v vVar = (C87787v) obj;
        String str = this.f199413d;
        if (str == null ? vVar.f199413d != null : !str.equals(vVar.f199413d)) {
            return false;
        }
        C87764e eVar = this.f199410a;
        if (eVar == null ? vVar.f199410a != null : !eVar.equals(vVar.f199410a)) {
            return false;
        }
        String str2 = this.f199412c;
        if (str2 == null ? vVar.f199412c != null : !str2.equals(vVar.f199412c)) {
            return false;
        }
        String str3 = this.f199411b;
        if (str3 == null ? vVar.f199411b != null : !str3.equals(vVar.f199411b)) {
            return false;
        }
        List<Object> list = this.f199414e;
        List<Object> list2 = vVar.f199414e;
        if (list == null ? list2 == null : list.equals(list2)) {
            return true;
        }
        return false;
    }

    public C87787v(String str, C87764e eVar, long j, List<Object> list) {
        this.f199413d = str;
        this.f199410a = eVar;
        this.f199411b = String.valueOf(j);
        this.f199414e = Collections.unmodifiableList(list);
    }
}
