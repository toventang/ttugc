package com.p2082ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.clipparam.VEClipParam;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p2082ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.p2082ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.runtime.h */
public final class C85559h {

    /* renamed from: a */
    public static String f191710a = "VETimeEffectManager";

    /* renamed from: b */
    public static int f191711b;

    /* renamed from: c */
    public static int f191712c = 1;

    /* renamed from: d */
    public static int f191713d = 2;

    /* renamed from: e */
    public C85561b f191714e;

    /* renamed from: com.ss.android.vesdk.runtime.h$b */
    public static class C85561b {

        /* renamed from: a */
        public List<C85560a> f191725a;

        /* renamed from: b */
        public List<C85560a> f191726b;

        /* renamed from: c */
        public List<C85560a> f191727c;

        /* renamed from: d */
        public List<C85560a> f191728d;

        /* renamed from: e */
        int f191729e;

        /* renamed from: f */
        public int f191730f;

        /* renamed from: g */
        public VEBaseFilterParam f191731g;

        static {
            Covode.recordClassIndex(99736);
        }
    }

    static {
        Covode.recordClassIndex(99734);
    }

    public C85559h() {
        C85561b bVar = new C85561b();
        this.f191714e = bVar;
        bVar.f191725a = new ArrayList();
        this.f191714e.f191726b = new ArrayList();
        this.f191714e.f191727c = new ArrayList();
        this.f191714e.f191728d = new ArrayList();
        this.f191714e.f191731g = null;
        this.f191714e.f191729e = -1;
        this.f191714e.f191730f = -1;
    }

    /* renamed from: a */
    public final void mo131529a() {
        this.f191714e.f191725a.clear();
        this.f191714e.f191726b.clear();
        this.f191714e.f191727c.clear();
        this.f191714e.f191728d.clear();
        this.f191714e.f191731g = null;
        this.f191714e.f191729e = -1;
        this.f191714e.f191730f = -1;
    }

    /* renamed from: b */
    public final int mo131531b() {
        if (this.f191714e.f191731g == null) {
            return f191711b;
        }
        if (this.f191714e.f191731g instanceof VERepeatFilterParam) {
            return f191712c;
        }
        if (this.f191714e.f191731g instanceof VESlowMotionFilterParam) {
            return f191713d;
        }
        return f191711b;
    }

    /* renamed from: com.ss.android.vesdk.runtime.h$a */
    public static class C85560a {

        /* renamed from: a */
        int f191715a;

        /* renamed from: b */
        int f191716b;

        /* renamed from: c */
        String f191717c;

        /* renamed from: d */
        int f191718d;

        /* renamed from: e */
        int f191719e;

        /* renamed from: f */
        int f191720f;

        /* renamed from: g */
        int f191721g;

        /* renamed from: h */
        int f191722h;

        /* renamed from: i */
        double f191723i;

        /* renamed from: j */
        int f191724j;

        static {
            Covode.recordClassIndex(99735);
        }

        public final String toString() {
            return "Clip: clipType" + this.f191716b + " path=" + this.f191717c + " seqin=" + this.f191719e + " seqout=" + this.f191720f + " trimIn=" + this.f191721g + " trimOut=" + this.f191722h + " speed=" + this.f191723i + " clipRotate=" + this.f191724j;
        }

        public C85560a(int i, int i2, String str, int i3, int i4, int i5, int i6, int i7, double d, int i8) {
            this.f191715a = i;
            this.f191716b = i2;
            this.f191718d = i3;
            this.f191719e = i4;
            this.f191720f = i5;
            this.f191721g = i6;
            this.f191722h = i7;
            this.f191723i = d;
            this.f191717c = str;
            this.f191724j = i8;
        }
    }

    /* renamed from: a */
    private static List<C85560a> m147464a(VEBaseFilterParam vEBaseFilterParam, List<C85560a> list) {
        ArrayList arrayList = new ArrayList();
        if (vEBaseFilterParam instanceof VERepeatFilterParam) {
            VERepeatFilterParam vERepeatFilterParam = (VERepeatFilterParam) vEBaseFilterParam;
            int i = vERepeatFilterParam.seqIn;
            int i2 = vERepeatFilterParam.seqIn + vERepeatFilterParam.repeatDuration;
            float f = (float) vERepeatFilterParam.repeatTime;
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            for (C85560a aVar : list) {
                if (aVar.f191719e >= i2 || aVar.f191720f <= i) {
                    arrayList2.add(new C85560a(f191711b, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, aVar.f191721g, aVar.f191722h, aVar.f191723i, aVar.f191724j));
                } else if (aVar.f191719e >= i && aVar.f191720f <= i2) {
                    arrayList2.add(new C85560a(f191712c, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, aVar.f191721g, aVar.f191722h, aVar.f191723i, aVar.f191724j));
                } else if (aVar.f191719e < i && aVar.f191720f > i2) {
                    int i4 = aVar.f191721g;
                    double d = (double) (i - aVar.f191719e);
                    double d2 = aVar.f191723i;
                    Double.isNaN(d);
                    int i5 = i4 + ((int) (d * d2));
                    int i6 = aVar.f191721g;
                    double d3 = (double) (i2 - aVar.f191719e);
                    double d4 = aVar.f191723i;
                    Double.isNaN(d3);
                    int i7 = i6 + ((int) (d3 * d4));
                    arrayList2.add(new C85560a(f191711b, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, aVar.f191721g, i5, aVar.f191723i, aVar.f191724j));
                    arrayList2.add(new C85560a(f191712c, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, i5, i7, aVar.f191723i, aVar.f191724j));
                    arrayList2.add(new C85560a(f191711b, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, i7, aVar.f191722h, aVar.f191723i, aVar.f191724j));
                } else if (aVar.f191719e == i && aVar.f191720f > i2) {
                    int i8 = aVar.f191721g;
                    double d5 = (double) (i2 - aVar.f191719e);
                    double d6 = aVar.f191723i;
                    Double.isNaN(d5);
                    int i9 = i8 + ((int) (d5 * d6));
                    arrayList2.add(new C85560a(f191712c, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, aVar.f191721g, i9, aVar.f191723i, aVar.f191724j));
                    arrayList2.add(new C85560a(f191711b, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, i9, aVar.f191722h, aVar.f191723i, aVar.f191724j));
                } else if (aVar.f191719e < i && aVar.f191720f == i2) {
                    int i10 = aVar.f191721g;
                    double d7 = (double) (i - aVar.f191719e);
                    double d8 = aVar.f191723i;
                    Double.isNaN(d7);
                    int i11 = i10 + ((int) (d7 * d8));
                    arrayList2.add(new C85560a(f191711b, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, aVar.f191721g, i11, aVar.f191723i, aVar.f191724j));
                    arrayList2.add(new C85560a(f191712c, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, i11, aVar.f191722h, aVar.f191723i, aVar.f191724j));
                } else if (aVar.f191719e < i && aVar.f191720f > i && aVar.f191720f < i2) {
                    int i12 = aVar.f191721g;
                    double d9 = (double) (i - aVar.f191719e);
                    double d10 = aVar.f191723i;
                    Double.isNaN(d9);
                    int i13 = i12 + ((int) (d9 * d10));
                    arrayList2.add(new C85560a(f191711b, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, aVar.f191721g, i13, aVar.f191723i, aVar.f191724j));
                    arrayList2.add(new C85560a(f191712c, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, i13, aVar.f191722h, aVar.f191723i, aVar.f191724j));
                } else if (aVar.f191719e < i2 && aVar.f191720f > i2 && aVar.f191719e > i) {
                    int i14 = aVar.f191721g;
                    double d11 = (double) (i2 - aVar.f191719e);
                    double d12 = aVar.f191723i;
                    Double.isNaN(d11);
                    int i15 = i14 + ((int) (d11 * d12));
                    arrayList2.add(new C85560a(f191712c, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, aVar.f191721g, i15, aVar.f191723i, aVar.f191724j));
                    arrayList2.add(new C85560a(f191711b, aVar.f191716b, aVar.f191717c, i3, aVar.f191719e, aVar.f191720f, i15, aVar.f191722h, aVar.f191723i, aVar.f191724j));
                }
                i3++;
            }
            ArrayList arrayList3 = new ArrayList();
            boolean z = false;
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                if (((C85560a) arrayList2.get(i17)).f191715a == f191712c) {
                    arrayList3.add(arrayList2.get(i17));
                    if (!z) {
                        z = true;
                        i16 = i17;
                    }
                }
            }
            for (int i18 = 0; ((float) i18) < f - 1.0f; i18++) {
                arrayList2.addAll(i16, arrayList3);
            }
            arrayList.addAll(arrayList2);
        } else if (vEBaseFilterParam instanceof VESlowMotionFilterParam) {
            VESlowMotionFilterParam vESlowMotionFilterParam = (VESlowMotionFilterParam) vEBaseFilterParam;
            int i19 = vESlowMotionFilterParam.seqIn;
            int i20 = vESlowMotionFilterParam.seqIn + vESlowMotionFilterParam.slowMotionDuration;
            float f2 = vESlowMotionFilterParam.slowMotionSpeed;
            ArrayList arrayList4 = new ArrayList();
            int i21 = 0;
            for (C85560a aVar2 : list) {
                if (aVar2.f191719e >= i20 || aVar2.f191720f <= i19) {
                    arrayList4.add(new C85560a(f191711b, aVar2.f191716b, aVar2.f191717c, i21, aVar2.f191719e, aVar2.f191720f, aVar2.f191721g, aVar2.f191722h, aVar2.f191723i, aVar2.f191724j));
                } else if (aVar2.f191719e >= i19 && aVar2.f191720f <= i20) {
                    int i22 = f191713d;
                    int i23 = aVar2.f191716b;
                    String str = aVar2.f191717c;
                    int i24 = aVar2.f191719e;
                    int i25 = aVar2.f191720f;
                    int i26 = aVar2.f191721g;
                    int i27 = aVar2.f191722h;
                    double d13 = aVar2.f191723i;
                    double d14 = (double) f2;
                    Double.isNaN(d14);
                    arrayList4.add(new C85560a(i22, i23, str, i21, i24, i25, i26, i27, d14 * d13, aVar2.f191724j));
                } else if (aVar2.f191719e < i19 && aVar2.f191720f > i20) {
                    int i28 = aVar2.f191721g;
                    double d15 = (double) (i19 - aVar2.f191719e);
                    double d16 = aVar2.f191723i;
                    Double.isNaN(d15);
                    int i29 = i28 + ((int) (d15 * d16));
                    int i30 = aVar2.f191721g;
                    double d17 = (double) (i20 - aVar2.f191719e);
                    double d18 = aVar2.f191723i;
                    Double.isNaN(d17);
                    int i31 = i30 + ((int) (d17 * d18));
                    arrayList4.add(new C85560a(f191711b, aVar2.f191716b, aVar2.f191717c, i21, aVar2.f191719e, aVar2.f191720f, aVar2.f191721g, i29, aVar2.f191723i, aVar2.f191724j));
                    int i32 = f191713d;
                    int i33 = aVar2.f191716b;
                    String str2 = aVar2.f191717c;
                    int i34 = aVar2.f191719e;
                    int i35 = aVar2.f191720f;
                    double d19 = aVar2.f191723i;
                    double d20 = (double) f2;
                    Double.isNaN(d20);
                    arrayList4.add(new C85560a(i32, i33, str2, i21, i34, i35, i29, i31, d19 * d20, aVar2.f191724j));
                    arrayList4.add(new C85560a(f191711b, aVar2.f191716b, aVar2.f191717c, i21, aVar2.f191719e, aVar2.f191720f, i31, aVar2.f191722h, aVar2.f191723i, aVar2.f191724j));
                } else if (aVar2.f191719e == i19 && aVar2.f191720f > i20) {
                    int i36 = aVar2.f191721g;
                    double d21 = (double) (i20 - aVar2.f191719e);
                    double d22 = aVar2.f191723i;
                    Double.isNaN(d21);
                    int i37 = i36 + ((int) (d21 * d22));
                    int i38 = f191713d;
                    int i39 = aVar2.f191716b;
                    String str3 = aVar2.f191717c;
                    int i40 = aVar2.f191719e;
                    int i41 = aVar2.f191720f;
                    int i42 = aVar2.f191721g;
                    double d23 = aVar2.f191723i;
                    double d24 = (double) f2;
                    Double.isNaN(d24);
                    arrayList4.add(new C85560a(i38, i39, str3, i21, i40, i41, i42, i37, d24 * d23, aVar2.f191724j));
                    arrayList4.add(new C85560a(f191711b, aVar2.f191716b, aVar2.f191717c, i21, aVar2.f191719e, aVar2.f191720f, i37, aVar2.f191722h, aVar2.f191723i, aVar2.f191724j));
                } else if (aVar2.f191719e < i19 && aVar2.f191720f == i20) {
                    int i43 = aVar2.f191721g;
                    double d25 = (double) (i19 - aVar2.f191719e);
                    double d26 = aVar2.f191723i;
                    Double.isNaN(d25);
                    int i44 = i43 + ((int) (d25 * d26));
                    arrayList4.add(new C85560a(f191711b, aVar2.f191716b, aVar2.f191717c, i21, aVar2.f191719e, aVar2.f191720f, aVar2.f191721g, i44, aVar2.f191723i, aVar2.f191724j));
                    int i45 = f191713d;
                    int i46 = aVar2.f191716b;
                    String str4 = aVar2.f191717c;
                    int i47 = aVar2.f191719e;
                    int i48 = aVar2.f191720f;
                    int i49 = aVar2.f191722h;
                    double d27 = aVar2.f191723i;
                    double d28 = (double) f2;
                    Double.isNaN(d28);
                    arrayList4.add(new C85560a(i45, i46, str4, i21, i47, i48, i44, i49, d27 * d28, aVar2.f191724j));
                } else if (aVar2.f191719e < i19 && aVar2.f191720f > i19 && aVar2.f191720f < i20) {
                    int i50 = aVar2.f191721g;
                    double d29 = (double) (i19 - aVar2.f191719e);
                    double d30 = aVar2.f191723i;
                    Double.isNaN(d29);
                    int i51 = i50 + ((int) (d29 * d30));
                    arrayList4.add(new C85560a(f191711b, aVar2.f191716b, aVar2.f191717c, i21, aVar2.f191719e, aVar2.f191720f, aVar2.f191721g, i51, aVar2.f191723i, aVar2.f191724j));
                    int i52 = f191713d;
                    int i53 = aVar2.f191716b;
                    String str5 = aVar2.f191717c;
                    int i54 = aVar2.f191719e;
                    int i55 = aVar2.f191720f;
                    int i56 = aVar2.f191722h;
                    double d31 = aVar2.f191723i;
                    double d32 = (double) f2;
                    Double.isNaN(d32);
                    arrayList4.add(new C85560a(i52, i53, str5, i21, i54, i55, i51, i56, d31 * d32, aVar2.f191724j));
                } else if (aVar2.f191719e < i20 && aVar2.f191720f > i20 && aVar2.f191719e > i19) {
                    int i57 = aVar2.f191721g;
                    double d33 = (double) (i20 - aVar2.f191719e);
                    double d34 = aVar2.f191723i;
                    Double.isNaN(d33);
                    int i58 = i57 + ((int) (d33 * d34));
                    int i59 = f191713d;
                    int i60 = aVar2.f191716b;
                    String str6 = aVar2.f191717c;
                    int i61 = aVar2.f191719e;
                    int i62 = aVar2.f191720f;
                    int i63 = aVar2.f191721g;
                    double d35 = aVar2.f191723i;
                    double d36 = (double) f2;
                    Double.isNaN(d36);
                    arrayList4.add(new C85560a(i59, i60, str6, i21, i61, i62, i63, i58, d36 * d35, aVar2.f191724j));
                    arrayList4.add(new C85560a(f191711b, aVar2.f191716b, aVar2.f191717c, i21, aVar2.f191719e, aVar2.f191720f, i58, aVar2.f191722h, aVar2.f191723i, aVar2.f191724j));
                }
                i21++;
            }
            arrayList.addAll(arrayList4);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static void m147466b(List<C85560a> list, List<C85560a> list2, List<VEClipParam> list3, List<VEClipParam> list4) {
        if (list.size() > 0 && list2.size() > 0) {
            boolean[] zArr = new boolean[list.size()];
            for (int i = 0; i < list2.size(); i++) {
                C85560a aVar = list2.get(i);
                if (!zArr[aVar.f191718d]) {
                    zArr[aVar.f191718d] = true;
                } else {
                    VEClipParam vEClipParam = new VEClipParam();
                    vEClipParam.clipType = aVar.f191716b;
                    vEClipParam.path = aVar.f191717c;
                    vEClipParam.trimIn = aVar.f191721g;
                    vEClipParam.trimOut = aVar.f191722h;
                    vEClipParam.speed = aVar.f191723i;
                    vEClipParam.clipRotate = aVar.f191724j;
                    vEClipParam.clipIndex = i;
                    list3.add(vEClipParam);
                }
                VEClipParam vEClipParam2 = new VEClipParam();
                vEClipParam2.clipType = aVar.f191716b;
                vEClipParam2.path = aVar.f191717c;
                vEClipParam2.trimIn = aVar.f191721g;
                vEClipParam2.trimOut = aVar.f191722h;
                vEClipParam2.speed = aVar.f191723i;
                vEClipParam2.clipRotate = aVar.f191724j;
                vEClipParam2.clipIndex = i;
                list4.add(vEClipParam2);
            }
        }
    }

    /* renamed from: a */
    public static void m147465a(List<C85560a> list, List<C85560a> list2, List<VEClipParam> list3, List<VEClipParam> list4) {
        boolean[] zArr = new boolean[list.size()];
        int i = 0;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            C85560a aVar = list2.get(i2);
            if (!zArr[aVar.f191718d]) {
                zArr[aVar.f191718d] = true;
            } else {
                VEClipParam vEClipParam = new VEClipParam();
                vEClipParam.path = aVar.f191717c;
                vEClipParam.trimIn = aVar.f191721g;
                vEClipParam.trimOut = aVar.f191722h;
                vEClipParam.speed = aVar.f191723i;
                vEClipParam.clipRotate = aVar.f191724j;
                vEClipParam.clipIndex = i2 - i;
                i++;
                list3.add(vEClipParam);
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            VEClipParam vEClipParam2 = new VEClipParam();
            vEClipParam2.path = list.get(i3).f191717c;
            vEClipParam2.trimIn = list.get(i3).f191721g;
            vEClipParam2.trimOut = list.get(i3).f191722h;
            vEClipParam2.speed = list.get(i3).f191723i;
            vEClipParam2.clipRotate = list.get(i3).f191724j;
            vEClipParam2.clipIndex = i3;
            list4.add(vEClipParam2);
        }
    }

    /* renamed from: a */
    public final void mo131530a(int i, int i2, List<VEClipParam> list, List<VEClipParam> list2, VEBaseFilterParam vEBaseFilterParam, List<VEClipParam> list3, List<VEClipParam> list4, List<VEClipParam> list5, List<VEClipParam> list6) {
        mo131529a();
        if (list == null || list.size() == 0) {
            C85315al.m146642d(f191710a, "addTimeEffect init param error");
            return;
        }
        this.f191714e.f191729e = i;
        this.f191714e.f191730f = i2;
        for (int i3 = 0; i3 < list.size(); i3++) {
            VEClipParam vEClipParam = list.get(i3);
            this.f191714e.f191725a.add(new C85560a(f191711b, vEClipParam.clipType, vEClipParam.path, i3, vEClipParam.seqIn, vEClipParam.seqOut, vEClipParam.trimIn, vEClipParam.trimOut, vEClipParam.speed, vEClipParam.clipRotate));
        }
        for (int i4 = 0; i4 < list2.size(); i4++) {
            VEClipParam vEClipParam2 = list2.get(i4);
            this.f191714e.f191726b.add(new C85560a(f191711b, vEClipParam2.clipType, vEClipParam2.path, i4, vEClipParam2.seqIn, vEClipParam2.seqOut, vEClipParam2.trimIn, vEClipParam2.trimOut, vEClipParam2.speed, vEClipParam2.clipRotate));
        }
        this.f191714e.f191731g = vEBaseFilterParam;
        this.f191714e.f191727c.clear();
        this.f191714e.f191727c.addAll(m147464a(vEBaseFilterParam, this.f191714e.f191725a));
        C85315al.m146642d(f191710a, "addTimeEffect  mTrack.videoClips=" + this.f191714e.f191725a.size() + " mTrack.timeEffectClips=" + this.f191714e.f191727c.size());
        m147466b(this.f191714e.f191725a, this.f191714e.f191727c, list3, list4);
        this.f191714e.f191728d.clear();
        if (this.f191714e.f191726b.size() > 0) {
            this.f191714e.f191728d.addAll(m147464a(vEBaseFilterParam, this.f191714e.f191726b));
            C85315al.m146642d(f191710a, "addTimeEffect  mTrack.audioClips=" + this.f191714e.f191726b.size() + " mTrack.audioTimeEffectClips=" + this.f191714e.f191728d.size());
            m147466b(this.f191714e.f191726b, this.f191714e.f191728d, list5, list6);
        }
    }
}
