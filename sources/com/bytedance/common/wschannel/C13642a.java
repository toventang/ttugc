package com.bytedance.common.wschannel;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.common.wschannel.a */
public final class C13642a {

    /* renamed from: a */
    final int f33148a;

    /* renamed from: b */
    String f33149b;

    /* renamed from: c */
    String f33150c;

    /* renamed from: d */
    public Map<String, String> f33151d = new HashMap();

    /* renamed from: e */
    List<String> f33152e;

    /* renamed from: f */
    int f33153f;

    /* renamed from: g */
    int f33154g;

    /* renamed from: h */
    String f33155h;

    /* renamed from: i */
    int f33156i;

    static {
        Covode.recordClassIndex(15673);
    }

    /* renamed from: com.bytedance.common.wschannel.a$a */
    public static class C13643a {

        /* renamed from: a */
        Map<String, String> f33157a = new HashMap();

        /* renamed from: b */
        List<String> f33158b = new ArrayList();

        /* renamed from: c */
        public int f33159c;

        /* renamed from: d */
        public int f33160d;

        /* renamed from: e */
        public int f33161e;

        /* renamed from: f */
        public String f33162f;

        /* renamed from: g */
        public String f33163g;

        /* renamed from: h */
        public String f33164h;

        /* renamed from: i */
        private final int f33165i;

        static {
            Covode.recordClassIndex(15674);
        }

        /* renamed from: a */
        public final C13642a mo21924a() {
            return new C13642a(this.f33160d, this.f33159c, this.f33161e, this.f33162f, this.f33165i, this.f33163g, this.f33164h, this.f33158b, this.f33157a);
        }

        /* renamed from: a */
        public static C13643a m24565a(int i) {
            return new C13643a(i);
        }

        private C13643a(int i) {
            this.f33165i = i;
        }

        /* renamed from: a */
        public final C13643a mo21922a(List<String> list) {
            if (list != null) {
                this.f33158b.addAll(list);
            }
            return this;
        }

        /* renamed from: a */
        public final C13643a mo21923a(Map<String, String> map) {
            this.f33157a.putAll(map);
            return this;
        }

        /* renamed from: a */
        public final C13643a mo21921a(String str, String str2) {
            if (!C13627m.m24498a(str)) {
                this.f33157a.put(str, str2);
            }
            return this;
        }
    }

    public final String toString() {
        return "ChannelInfo{channelId = " + this.f33148a + ", deviceId = " + this.f33150c + ", installId = " + this.f33150c + ", fpid = " + this.f33153f + ", aid = " + this.f33154g + ", updateVersionCode = " + this.f33156i + ", appKey = " + this.f33155h + ", extra = " + this.f33151d + ", urls = " + this.f33152e + "}";
    }

    public C13642a(int i, int i2, int i3, String str, int i4, String str2, String str3, List<String> list, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        this.f33152e = arrayList;
        this.f33148a = i4;
        this.f33149b = str2;
        this.f33150c = str3;
        this.f33156i = i3;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (map != null) {
            this.f33151d.putAll(map);
        }
        this.f33153f = i;
        this.f33154g = i2;
        this.f33155h = str;
    }
}
