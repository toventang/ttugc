package com.bytedance.ies.sdk.datachannel;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.sdk.datachannel.f */
public final class C17846f {
    static {
        Covode.recordClassIndex(20414);
    }

    /* renamed from: b */
    private static final AbstractC17845e m33057b(Fragment fragment) {
        if (fragment != null) {
            try {
                if (!fragment.isDetached()) {
                    if (fragment instanceof AbstractC17845e) {
                        return (AbstractC17845e) fragment;
                    }
                    return m33057b(fragment.getParentFragment());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final DataChannel m33055a(Fragment fragment) {
        ActivityC0945e eVar;
        ActivityC0945e eVar2;
        if (fragment != null) {
            eVar = fragment.getActivity();
        } else {
            eVar = null;
        }
        if (eVar instanceof AbstractC17845e) {
            ActivityC0945e activity = fragment.getActivity();
            if (activity != null) {
                return ((AbstractC17845e) activity).mo8509h();
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        AbstractC17845e b = m33057b(fragment);
        if (b == null) {
            if (fragment != null) {
                eVar2 = fragment.getActivity();
            } else {
                eVar2 = null;
            }
            b = m33056a(eVar2);
            if (b == null) {
                return null;
            }
        }
        return b.mo8509h();
    }

    /* renamed from: c */
    private static final AbstractC17845e m33058c(Fragment fragment) {
        if (fragment != null) {
            try {
                if (!fragment.isDetached()) {
                    AbstractC0952i childFragmentManager = fragment.getChildFragmentManager();
                    C89219l.m154709a((Object) childFragmentManager, "");
                    List<Fragment> f = childFragmentManager.mo3565f();
                    C89219l.m154709a((Object) f, "");
                    for (T t : f) {
                        if (t instanceof AbstractC17845e) {
                            return t;
                        }
                        AbstractC17845e c = m33058c(t);
                        if (c != null) {
                            return c;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static final AbstractC17845e m33056a(ActivityC0945e eVar) {
        if (eVar == null) {
            return null;
        }
        AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
        C89219l.m154709a((Object) supportFragmentManager, "");
        List<Fragment> f = supportFragmentManager.mo3565f();
        C89219l.m154709a((Object) f, "");
        for (T t : f) {
            if (t instanceof AbstractC17845e) {
                return t;
            }
            AbstractC17845e c = m33058c(t);
            if (c != null) {
                return c;
            }
        }
        return null;
    }
}
