package com.bytedance.android.livesdkapi.depend.p680d.p682b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.depend.d.b.d */
public final class C11637d {

    /* renamed from: a */
    public View f27778a;

    /* renamed from: b */
    public Map<String, String> f27779b = new HashMap();

    static {
        Covode.recordClassIndex(13304);
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.b.d$a */
    public static final class C11638a {

        /* renamed from: a */
        public View f27780a;

        /* renamed from: b */
        public Map<String, String> f27781b = new HashMap();

        static {
            Covode.recordClassIndex(13305);
        }

        /* renamed from: a */
        public final C11637d mo18424a() {
            C11637d dVar = new C11637d();
            dVar.f27778a = this.f27780a;
            dVar.mo18421a(this.f27781b);
            return dVar;
        }

        /* renamed from: a */
        public final C11638a mo18422a(View view) {
            C89219l.m154721d(view, "");
            this.f27780a = view;
            return this;
        }

        /* renamed from: a */
        public final C11638a mo18423a(Map<String, String> map) {
            C89219l.m154721d(map, "");
            this.f27781b.putAll(map);
            return this;
        }
    }

    /* renamed from: a */
    public final void mo18421a(Map<String, String> map) {
        C89219l.m154721d(map, "");
        this.f27779b = map;
    }
}
