package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.AbstractC24744h;

/* renamed from: com.facebook.share.internal.l */
public enum EnumC24965l implements AbstractC24744h {
    SHARE_STORY_ASSET;
    

    /* renamed from: a */
    private int f59229a = 20170417;

    @Override // com.facebook.internal.AbstractC24744h
    public final String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    @Override // com.facebook.internal.AbstractC24744h
    public final int getMinVersion() {
        return this.f59229a;
    }

    static {
        Covode.recordClassIndex(30269);
    }

    private EnumC24965l(String str) {
    }
}
