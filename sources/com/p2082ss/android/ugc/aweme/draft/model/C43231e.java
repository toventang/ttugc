package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Arrays;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.e */
public final class C43231e {
    @AbstractC27891c(mo46611a = "matrix")

    /* renamed from: a */
    public final String[] f100937a;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: b */
    public final double[] f100938b;
    @AbstractC27891c(mo46611a = "seg_user_cher")

    /* renamed from: c */
    public final boolean[] f100939c;

    static {
        Covode.recordClassIndex(51433);
    }

    public final String toString() {
        return "DraftCherEffectParam(matrix=" + Arrays.toString(this.f100937a) + ", duration=" + Arrays.toString(this.f100938b) + ", segUseCher=" + Arrays.toString(this.f100939c) + ")";
    }

    private /* synthetic */ C43231e() {
        this(new String[0], new double[0], new boolean[0]);
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f100937a) * 31) + Arrays.hashCode(this.f100938b)) * 31) + Arrays.hashCode(this.f100939c);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftCherEffectParam");
        C43231e eVar = (C43231e) obj;
        if (Arrays.equals(this.f100937a, eVar.f100937a) && Arrays.equals(this.f100938b, eVar.f100938b) && Arrays.equals(this.f100939c, eVar.f100939c)) {
            return true;
        }
        return false;
    }

    public C43231e(String[] strArr, double[] dArr, boolean[] zArr) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(dArr, "");
        C89219l.m154721d(zArr, "");
        this.f100937a = strArr;
        this.f100938b = dArr;
        this.f100939c = zArr;
    }
}
