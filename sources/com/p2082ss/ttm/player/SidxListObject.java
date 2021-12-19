package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.ttm.player.SidxListObject */
public class SidxListObject extends NativeObject {

    /* renamed from: a */
    public int f192545a;

    /* renamed from: b */
    public int f192546b;

    /* renamed from: c */
    public int f192547c;

    /* renamed from: d */
    public int f192548d;

    /* renamed from: e */
    public long f192549e;

    /* renamed from: f */
    public String f192550f;

    /* renamed from: g */
    private List<C86231a> f192551g = new ArrayList();

    static {
        Covode.recordClassIndex(101402);
    }

    /* renamed from: com.ss.ttm.player.SidxListObject$a */
    public static class C86231a {

        /* renamed from: a */
        public int f192552a;

        /* renamed from: b */
        public long f192553b;

        /* renamed from: c */
        public long f192554c;

        /* renamed from: d */
        public long f192555d;

        /* renamed from: e */
        public long f192556e;

        static {
            Covode.recordClassIndex(101403);
        }

        public C86231a(int i, long j, long j2, long j3, long j4) {
            this.f192552a = i;
            this.f192553b = j;
            this.f192554c = j2;
            this.f192555d = j3;
            this.f192556e = j4;
        }
    }

    public void addItem(int i, long j, long j2, long j3, long j4) {
        this.f192551g.add(new C86231a(i, j, j2, j3, j4));
    }

    public SidxListObject(int i, int i2, int i3, int i4, long j, String str) {
        this.f192545a = i;
        this.f192546b = i2;
        this.f192547c = i3;
        this.f192548d = i4;
        this.f192549e = j;
        this.f192550f = str;
    }
}
