package com.bytedance.android.live.effect.p241b;

import com.bytedance.android.live.effect.api.p240a.AbstractC4149b;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.b.a */
public final class C4178a implements AbstractC4149b {

    /* renamed from: a */
    private final WeakReference<AbstractC11683e> f11614a;

    static {
        Covode.recordClassIndex(4748);
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
    /* renamed from: a */
    public final int mo9082a(boolean z) {
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
    /* renamed from: a */
    public final int mo9078a() {
        return m10187b();
    }

    /* renamed from: b */
    private final int m10187b() {
        if (this.f11614a.get() == null) {
            return -1;
        }
        return 0;
    }

    public C4178a(AbstractC11683e eVar) {
        this.f11614a = new WeakReference<>(eVar);
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
    /* renamed from: b */
    public final int mo9085b(String[] strArr) {
        AbstractC11683e eVar = this.f11614a.get();
        if (eVar != null) {
            return eVar.mo8855b(strArr);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
    /* renamed from: c */
    public final int mo9087c(String[] strArr) {
        AbstractC11683e eVar = this.f11614a.get();
        if (eVar != null) {
            return eVar.mo8862c(strArr);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
    /* renamed from: a */
    public final int mo9083a(String[] strArr) {
        C89219l.m154721d(strArr, "");
        AbstractC11683e eVar = this.f11614a.get();
        if (eVar != null) {
            return eVar.mo8845a(strArr);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
    /* renamed from: a */
    public final int mo9081a(String str, boolean z) {
        C89219l.m154721d(str, "");
        return m10187b();
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
    /* renamed from: b */
    public final int mo9086b(String[] strArr, String[] strArr2) {
        AbstractC11683e eVar = this.f11614a.get();
        if (eVar != null) {
            return eVar.mo8856b(strArr, strArr2);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
    /* renamed from: a */
    public final int mo9084a(String[] strArr, String[] strArr2) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(strArr2, "");
        AbstractC11683e eVar = this.f11614a.get();
        if (eVar != null) {
            return eVar.mo8846a(strArr, strArr2);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
    /* renamed from: a */
    public final int mo9079a(String str, String str2, float f) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC11683e eVar = this.f11614a.get();
        if (eVar != null) {
            return eVar.mo8843a(str, str2, f);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
    /* renamed from: a */
    public final int mo9080a(String str, String str2, int[] iArr) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(iArr, "");
        AbstractC11683e eVar = this.f11614a.get();
        if (eVar != null) {
            return eVar.mo8844a(str, str2, iArr);
        }
        return -1;
    }
}
