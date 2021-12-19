package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.AbstractC24744h;

/* renamed from: com.facebook.share.internal.a */
public enum EnumC24935a implements AbstractC24744h {
    SHARE_CAMERA_EFFECT;
    

    /* renamed from: a */
    private int f59203a = 20170417;

    @Override // com.facebook.internal.AbstractC24744h
    public final String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    @Override // com.facebook.internal.AbstractC24744h
    public final int getMinVersion() {
        return this.f59203a;
    }

    static {
        Covode.recordClassIndex(30239);
    }

    private EnumC24935a(String str) {
    }
}
