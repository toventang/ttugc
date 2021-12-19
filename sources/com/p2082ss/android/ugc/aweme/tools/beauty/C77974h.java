package com.p2082ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.h */
public final class C77974h {

    /* renamed from: a */
    public static final C77974h f174908a = new C77974h();

    private C77974h() {
    }

    static {
        Covode.recordClassIndex(91063);
    }

    /* renamed from: a */
    public static float m136234a(C77975a aVar) {
        C89219l.m154721d(aVar, "");
        if (!aVar.f174909a) {
            return ((((float) (aVar.f174913e - aVar.f174914f)) / 100.0f) * ((float) aVar.f174916h)) + ((float) aVar.f174914f);
        }
        if (aVar.f174916h >= 0) {
            return (((float) aVar.f174916h) / 50.0f) * ((float) aVar.f174913e);
        }
        return (((float) aVar.f174916h) / -50.0f) * ((float) aVar.f174914f);
    }

    /* renamed from: b */
    public static C77975a m136235b(C77975a aVar) {
        C89219l.m154721d(aVar, "");
        C77975a aVar2 = new C77975a(false, 0, 0, 0, 0, 0.0f, 0, 511);
        boolean z = true;
        if (aVar.f174909a) {
            aVar2.f174911c = 50;
            aVar2.f174912d = -50;
            if (aVar.f174915g >= 0.0f) {
                aVar2.f174916h = (int) (((aVar.f174915g / ((float) aVar.f174913e)) * 50.0f) + 0.5f);
            } else {
                aVar2.f174916h = -((int) (((aVar.f174915g / ((float) aVar.f174914f)) * 50.0f) + 0.5f));
            }
            if (aVar2.f174916h != 0) {
                z = false;
            }
            aVar2.f174917i = z;
        } else {
            aVar2.f174911c = 100;
            aVar2.f174912d = 0;
            aVar2.f174916h = (int) ((((aVar.f174915g - ((float) aVar.f174914f)) / ((float) (aVar.f174913e - aVar.f174914f))) * 100.0f) + 0.5f);
            if (aVar2.f174916h != 0) {
                z = false;
            }
            aVar2.f174917i = z;
        }
        return aVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.h$a */
    public static final class C77975a {

        /* renamed from: a */
        public boolean f174909a;

        /* renamed from: b */
        public int f174910b;

        /* renamed from: c */
        public int f174911c;

        /* renamed from: d */
        public int f174912d;

        /* renamed from: e */
        public int f174913e;

        /* renamed from: f */
        public int f174914f;

        /* renamed from: g */
        public float f174915g;

        /* renamed from: h */
        public int f174916h;

        /* renamed from: i */
        public boolean f174917i;

        static {
            Covode.recordClassIndex(91064);
        }

        public C77975a() {
            this(false, 0, 0, 0, 0, 0.0f, 0, 511);
        }

        private C77975a(boolean z, int i, int i2, int i3, int i4, float f, int i5) {
            this.f174909a = z;
            this.f174910b = i;
            this.f174911c = i2;
            this.f174912d = 0;
            this.f174913e = i3;
            this.f174914f = i4;
            this.f174915g = f;
            this.f174916h = i5;
            this.f174917i = false;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C77975a(boolean z, int i, int i2, int i3, int i4, float f, int i5, int i6) {
            this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? 100 : i, (i6 & 4) != 0 ? 100 : i2, (i6 & 16) == 0 ? i3 : 100, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? 0.0f : f, (i6 & 128) != 0 ? 0 : i5);
        }
    }
}
