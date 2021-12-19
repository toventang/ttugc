package com.bytedance.scene.navigation;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;

/* renamed from: com.bytedance.scene.navigation.g */
public final class C22258g {

    /* renamed from: a */
    public final String f52651a;

    /* renamed from: b */
    public final Bundle f52652b;

    /* renamed from: c */
    public boolean f52653c;

    /* renamed from: d */
    public boolean f52654d;

    /* renamed from: e */
    public int f52655e;

    static {
        Covode.recordClassIndex(26070);
    }

    /* renamed from: a */
    public final Bundle mo36561a() {
        if (!TextUtils.isEmpty(this.f52651a)) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_rootScene", this.f52651a);
            bundle.putBundle("extra_rootScene_arguments", this.f52652b);
            bundle.putBoolean("extra_drawWindowBackground", this.f52653c);
            bundle.putBoolean("extra_fixSceneBackground_enabled", this.f52654d);
            bundle.putInt("extra_sceneBackground", this.f52655e);
            return bundle;
        }
        throw new IllegalArgumentException("call setRootScene first");
    }

    public C22258g(Class<? extends AbstractC22219j> cls) {
        this(cls, (Bundle) null);
    }

    C22258g(String str, Bundle bundle) {
        this.f52653c = true;
        this.f52654d = true;
        this.f52651a = str;
        this.f52652b = bundle;
    }

    public C22258g(Class<? extends AbstractC22219j> cls, Bundle bundle) {
        this.f52653c = true;
        this.f52654d = true;
        if (!cls.isAssignableFrom(C22239d.class)) {
            this.f52651a = cls.getName();
            this.f52652b = bundle;
            return;
        }
        throw new IllegalArgumentException("cant use NavigationScene as root scene");
    }
}
