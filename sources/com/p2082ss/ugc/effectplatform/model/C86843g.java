package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.util.C87000n;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.model.g */
public final class C86843g {

    /* renamed from: e */
    public static final C86844a f195765e = new C86844a((byte) 0);

    /* renamed from: a */
    public String f195766a;

    /* renamed from: b */
    public int f195767b;

    /* renamed from: c */
    public boolean f195768c;

    /* renamed from: d */
    public final String f195769d;

    /* renamed from: f */
    private String f195770f;

    /* renamed from: g */
    private String f195771g;

    static {
        Covode.recordClassIndex(102568);
    }

    /* renamed from: com.ss.ugc.effectplatform.model.g$a */
    public static final class C86844a {
        static {
            Covode.recordClassIndex(102569);
        }

        private C86844a() {
        }

        public /* synthetic */ C86844a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C86843g m150415a(String str) {
            C89219l.m154719c(str, "");
            return new C86843g(str, (byte) 0);
        }

        /* renamed from: b */
        public static String m150416b(String str) {
            int a;
            C89361p.m154885a((CharSequence) str, "/");
            int a2 = C89361p.m154885a((CharSequence) str, "_v");
            if (C89361p.m154908a((CharSequence) str, (CharSequence) "size", false)) {
                a = C89361p.m154885a((CharSequence) str, "_size");
            } else {
                a = C89361p.m154885a((CharSequence) str, "_model");
            }
            if (a2 <= 0) {
                return "1.0";
            }
            int i = a2 + 2;
            if (str != null) {
                String substring = str.substring(i, a);
                C89219l.m154709a((Object) substring, "");
                return C89361p.m154879i(substring);
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: a */
    public final String mo140166a() {
        String d;
        String str = this.f195770f;
        if ((str == null || C89361p.m154870a((CharSequence) str)) && (d = C88045d.m153116d(this.f195769d)) != null) {
            this.f195770f = C87000n.m150684a(d);
        }
        return this.f195770f;
    }

    /* renamed from: b */
    public final String mo140168b() {
        String d;
        String str = this.f195771g;
        if ((str == null || C89361p.m154870a((CharSequence) str)) && (d = C88045d.m153116d(this.f195769d)) != null) {
            this.f195771g = C86844a.m150416b(d);
        }
        return this.f195771g;
    }

    /* renamed from: d */
    public final String mo140171d() {
        String d;
        String str = this.f195766a;
        if ((str == null || C89361p.m154870a((CharSequence) str)) && (d = C88045d.m153116d(this.f195769d)) != null) {
            this.f195766a = C87000n.m150688d(d);
        }
        return this.f195766a;
    }

    /* renamed from: c */
    public final int mo140170c() {
        String d;
        if (this.f195767b == -1) {
            int i = 0;
            if (C88045d.m153118f(this.f195769d) && (d = C88045d.m153116d(this.f195769d)) != null) {
                i = C87000n.m150687c(d);
            }
            this.f195767b = i;
        }
        return this.f195767b;
    }

    public final String toString() {
        return "LocalModelInfo{name=" + mo140166a() + '\'' + ",version=" + mo140168b() + '\'' + ",size=" + mo140170c() + '\'' + '}';
    }

    /* renamed from: a */
    public final void mo140167a(String str) {
        C89219l.m154719c(str, "");
        this.f195770f = str;
    }

    /* renamed from: b */
    public final void mo140169b(String str) {
        C89219l.m154719c(str, "");
        this.f195771g = str;
    }

    private C86843g(String str) {
        this.f195769d = str;
        this.f195767b = -1;
    }

    public /* synthetic */ C86843g(String str, byte b) {
        this(str);
    }
}
