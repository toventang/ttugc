package com.p2082ss.android.ugc.aweme.setting;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.setting.model.C68185n;

/* renamed from: com.ss.android.ugc.aweme.setting.ce */
public final class C68052ce {

    /* renamed from: a */
    public static int f152436a = 10800000;

    /* renamed from: b */
    public static C68052ce f152437b = new C68052ce();

    /* renamed from: c */
    public SparseArray<C68185n> f152438c = new SparseArray<>(4);

    /* renamed from: com.ss.android.ugc.aweme.setting.ce$a */
    public interface AbstractC68053a {
        static {
            Covode.recordClassIndex(80249);
        }

        void cG_();
    }

    private C68052ce() {
    }

    /* renamed from: b */
    public static boolean m120353b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(80248);
    }

    /* renamed from: a */
    public final void mo108670a() {
        for (int i = 0; i < this.f152438c.size(); i++) {
            C68185n valueAt = this.f152438c.valueAt(i);
            if (valueAt != null && System.currentTimeMillis() - valueAt.f152666b > ((long) f152436a)) {
                valueAt.f152668d.cG_();
            }
        }
    }

    /* renamed from: a */
    public final void mo108671a(int i, AbstractC68053a aVar) {
        this.f152438c.put(i, new C68185n(System.currentTimeMillis(), aVar));
    }

    /* renamed from: a */
    public final void mo108672a(int i, boolean z) {
        if (this.f152438c.get(i) != null) {
            this.f152438c.get(i).f152666b = System.currentTimeMillis();
            this.f152438c.get(i).f152665a = z;
            if (z) {
                this.f152438c.get(i).f152667c = 0;
            }
        }
    }
}
