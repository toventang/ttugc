package com.zhihu.matisse;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: com.zhihu.matisse.a */
public final class C87936a {

    /* renamed from: a */
    private final WeakReference<Activity> f199696a;

    /* renamed from: b */
    private final WeakReference<Fragment> f199697b;

    static {
        Covode.recordClassIndex(103951);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Fragment mo142435b() {
        WeakReference<Fragment> weakReference = this.f199697b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Activity mo142433a() {
        return this.f199696a.get();
    }

    private C87936a(Activity activity) {
        this(activity, null);
    }

    /* renamed from: a */
    public static C87936a m152942a(Activity activity) {
        return new C87936a(activity);
    }

    private C87936a(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    /* renamed from: a */
    public static C87936a m152943a(Fragment fragment) {
        return new C87936a(fragment);
    }

    /* renamed from: a */
    public final C87942c mo142434a(Set<EnumC87938b> set) {
        return new C87942c(this, set);
    }

    private C87936a(Activity activity, Fragment fragment) {
        this.f199696a = new WeakReference<>(activity);
        this.f199697b = new WeakReference<>(fragment);
    }
}
