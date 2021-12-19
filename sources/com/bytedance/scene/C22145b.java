package com.bytedance.scene;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.b */
public final class C22145b implements AbstractC22285z {

    /* renamed from: a */
    private final Activity f52374a;

    static {
        Covode.recordClassIndex(25949);
    }

    public C22145b(Activity activity) {
        this.f52374a = activity;
    }

    @Override // com.bytedance.scene.AbstractC22285z
    /* renamed from: a */
    public final <T extends View> T mo36333a(int i) {
        T t = (T) this.f52374a.findViewById(i);
        if (t != null) {
            return t;
        }
        try {
            throw new IllegalArgumentException(" " + this.f52374a.getResources().getResourceName(i) + " view not found");
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(" " + i + " view not found");
        }
    }
}
