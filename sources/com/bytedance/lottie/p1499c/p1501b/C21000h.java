package com.bytedance.lottie.p1499c.p1501b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21044e;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1496a.AbstractC20935b;
import com.bytedance.lottie.p1495a.p1496a.C20944k;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;

/* renamed from: com.bytedance.lottie.c.b.h */
public final class C21000h implements AbstractC20993b {

    /* renamed from: a */
    public final String f49770a;

    /* renamed from: b */
    public final EnumC21001a f49771b;

    static {
        Covode.recordClassIndex(24616);
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f49771b + '}';
    }

    /* renamed from: com.bytedance.lottie.c.b.h$a */
    public enum EnumC21001a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        static {
            Covode.recordClassIndex(24617);
        }

        public static EnumC21001a forId(int i) {
            if (i == 1) {
                return Merge;
            }
            if (i == 2) {
                return Add;
            }
            if (i == 3) {
                return Subtract;
            }
            if (i == 4) {
                return Intersect;
            }
            if (i != 5) {
                return Merge;
            }
            return ExcludeIntersections;
        }
    }

    public C21000h(String str, EnumC21001a aVar) {
        this.f49770a = str;
        this.f49771b = aVar;
    }

    @Override // com.bytedance.lottie.p1499c.p1501b.AbstractC20993b
    /* renamed from: a */
    public final AbstractC20935b mo34483a(C21106i iVar, AbstractC21017a aVar) {
        if (iVar.f50042k) {
            return new C20944k(this);
        }
        C21044e.m39620a("Animation contains merge paths but they are disabled.");
        return null;
    }
}
