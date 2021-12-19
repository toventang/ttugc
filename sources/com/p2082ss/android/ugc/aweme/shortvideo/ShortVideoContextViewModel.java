package com.p2082ss.android.ugc.aweme.shortvideo;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel */
public class ShortVideoContextViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public ShortVideoContext f155842a;

    /* renamed from: b */
    private C0484a<String, Object> f155843b = new C0484a<>();

    /* renamed from: c */
    private C1213t<Boolean> f155844c;

    static {
        Covode.recordClassIndex(82135);
    }

    /* renamed from: b */
    public final boolean mo110051b() {
        Boolean bool = (Boolean) m123210a("has_go_next");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: c */
    public final void mo110052c() {
        if (this.f155844c == null) {
            this.f155844c = new C1213t<>();
        }
        this.f155844c.setValue(true);
    }

    /* renamed from: a */
    public final boolean mo110049a() {
        Boolean bool = (Boolean) m123210a("photo_mode");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    private Object m123210a(String str) {
        return this.f155843b.get(str);
    }

    /* renamed from: b */
    public final void mo110050b(boolean z) {
        m123211a("has_go_next", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo110047a(int i) {
        m123211a("shoot_mode", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo110048a(boolean z) {
        m123211a("photo_mode", Boolean.valueOf(z));
    }

    /* renamed from: a */
    private void m123211a(String str, Object obj) {
        this.f155843b.put(str, obj);
    }
}
