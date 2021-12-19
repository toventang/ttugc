package com.p2082ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.search.i */
public enum EnumC67453i {
    TOP("general"),
    USER("user"),
    VIDEO("video"),
    SOUND("music"),
    LIVE("live"),
    SHOP("shop"),
    HASHTAG("hashtag");
    
    public static final C67454a Companion = new C67454a((byte) 0);
    public static final Map<String, EnumC67453i> MAP;

    /* renamed from: b */
    private final String f151125b;

    /* renamed from: com.ss.android.ugc.aweme.search.i$a */
    public static final class C67454a {
        static {
            Covode.recordClassIndex(79091);
        }

        private C67454a() {
        }

        public /* synthetic */ C67454a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC67453i m119523a(String str) {
            C89219l.m154721d(str, "");
            return EnumC67453i.MAP.get(str);
        }
    }

    public final String getTabName() {
        return this.f151125b;
    }

    static {
        Covode.recordClassIndex(79090);
        EnumC67453i[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(values.length), 16));
        for (EnumC67453i iVar : values) {
            linkedHashMap.put(iVar.f151125b, iVar);
        }
        MAP = linkedHashMap;
    }

    private EnumC67453i(String str) {
        this.f151125b = str;
    }
}
