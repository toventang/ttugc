package com.p2082ss.android.vesdk;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.TESystemUtils;

/* renamed from: com.ss.android.vesdk.l */
public class C85521l {

    /* renamed from: a */
    public int f191575a;

    /* renamed from: b */
    public int f191576b;

    /* renamed from: c */
    public int f191577c;

    /* renamed from: d */
    public int f191578d;

    /* renamed from: e */
    public int f191579e;

    /* renamed from: f */
    public int f191580f;

    /* renamed from: g */
    public boolean f191581g;

    /* renamed from: h */
    public boolean f191582h;

    /* renamed from: i */
    public boolean f191583i;

    static {
        Covode.recordClassIndex(99681);
    }

    /* renamed from: com.ss.android.vesdk.l$a */
    public static class C85522a {

        /* renamed from: a */
        public C85521l f191584a = new C85521l((byte) 0);

        static {
            Covode.recordClassIndex(99682);
        }

        public C85522a() {
        }

        /* renamed from: a */
        public final C85522a mo131430a(int i) {
            this.f191584a.f191579e = i;
            return this;
        }

        /* renamed from: b */
        public final C85522a mo131432b(boolean z) {
            this.f191584a.f191582h = z;
            return this;
        }

        public C85522a(C85521l lVar) {
            this.f191584a = lVar;
        }

        /* renamed from: a */
        public final C85522a mo131431a(boolean z) {
            if (z) {
                Pair<Integer, Integer> suggestedOutputProperty = TESystemUtils.getSuggestedOutputProperty();
                if (suggestedOutputProperty != null) {
                    this.f191584a.f191576b = ((Integer) suggestedOutputProperty.first).intValue();
                    this.f191584a.f191580f = ((Integer) suggestedOutputProperty.second).intValue();
                }
            } else {
                this.f191584a.f191576b = 44100;
                this.f191584a.f191580f = 256;
            }
            this.f191584a.f191581g = z;
            return this;
        }
    }

    private C85521l() {
        this.f191575a = 2;
        this.f191576b = 44100;
        this.f191577c = 16;
        this.f191578d = 1;
        this.f191580f = 256;
        this.f191583i = true;
    }

    /* synthetic */ C85521l(byte b) {
        this();
    }
}
