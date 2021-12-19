package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.d */
public final class C75063d {

    /* renamed from: a */
    public static final C75063d f168716a = new C75063d();

    private C75063d() {
    }

    static {
        Covode.recordClassIndex(87935);
    }

    /* renamed from: c */
    public static String m131828c() {
        if (m131826a()) {
            return "feed";
        }
        if (m131827b()) {
            return "follow";
        }
        return "others";
    }

    /* renamed from: a */
    public static boolean m131826a() {
        Fragment curFragment;
        ActivityC0945e a = C75064e.m131829a();
        if (a instanceof AbstractC59103j) {
            AbstractC59103j jVar = (AbstractC59103j) a;
            if ((jVar.getCurFragment() instanceof AbstractC59105l) && (curFragment = jVar.getCurFragment()) != null) {
                return ((AbstractC59105l) curFragment).mo96548m();
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m131827b() {
        Fragment curFragment;
        ActivityC0945e a = C75064e.m131829a();
        if (a instanceof AbstractC59103j) {
            AbstractC59103j jVar = (AbstractC59103j) a;
            if ((jVar.getCurFragment() instanceof AbstractC59105l) && (curFragment = jVar.getCurFragment()) != null) {
                return ((AbstractC59105l) curFragment).mo96549n();
            }
        }
        return false;
    }
}
