package net.openid.appauth;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: net.openid.appauth.s */
public final class C90013s {

    /* renamed from: a */
    public static final Set<String> f204047a = new HashSet(Arrays.asList("token_type", "access_token", "expires_in", "refresh_token", "id_token", "scope"));

    /* renamed from: b */
    public final C90011r f204048b;

    /* renamed from: c */
    public final String f204049c;

    /* renamed from: d */
    public final String f204050d;

    /* renamed from: e */
    public final Long f204051e;

    /* renamed from: f */
    public final String f204052f;

    /* renamed from: g */
    public final String f204053g;

    /* renamed from: h */
    public final String f204054h;

    /* renamed from: i */
    public final Map<String, String> f204055i;

    static {
        Covode.recordClassIndex(106184);
    }

    /* renamed from: net.openid.appauth.s$a */
    public static final class C90014a {

        /* renamed from: a */
        C90011r f204056a;

        /* renamed from: b */
        String f204057b;

        /* renamed from: c */
        String f204058c;

        /* renamed from: d */
        Long f204059d;

        /* renamed from: e */
        String f204060e;

        /* renamed from: f */
        String f204061f;

        /* renamed from: g */
        String f204062g;

        /* renamed from: h */
        Map<String, String> f204063h = Collections.emptyMap();

        static {
            Covode.recordClassIndex(106185);
        }

        public C90014a(C90011r rVar) {
            this.f204056a = (C90011r) C90009p.m156198a(rVar, "request cannot be null");
        }
    }

    C90013s(C90011r rVar, String str, String str2, Long l, String str3, String str4, String str5, Map<String, String> map) {
        this.f204048b = rVar;
        this.f204049c = str;
        this.f204050d = str2;
        this.f204051e = l;
        this.f204052f = str3;
        this.f204053g = str4;
        this.f204054h = str5;
        this.f204055i = map;
    }
}
