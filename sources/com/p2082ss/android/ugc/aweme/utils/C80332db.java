package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.db */
public final class C80332db {

    /* renamed from: a */
    public LruCache<String, Bitmap> f179860a;

    /* renamed from: b */
    public List<String> f179861b;

    /* renamed from: c */
    public volatile boolean f179862c;

    /* renamed from: d */
    public final int f179863d;

    static {
        Covode.recordClassIndex(93600);
    }

    private /* synthetic */ C80332db() {
        this(1000);
    }

    public C80332db(int i) {
        this.f179863d = i;
        this.f179860a = new LruCache<>(i);
        this.f179861b = new ArrayList();
        this.f179862c = true;
    }

    /* renamed from: a */
    public final Bitmap mo123709a(String str) {
        C89219l.m154721d(str, "");
        if (this.f179862c) {
            return this.f179860a.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static String m139268a(String str, int i) {
        C89219l.m154721d(str, "");
        return str + '#' + i;
    }
}
