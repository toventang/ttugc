package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.AbstractC24744h;

/* renamed from: com.facebook.share.internal.f */
public enum EnumC24945f implements AbstractC24744h {
    OG_ACTION_DIALOG;
    

    /* renamed from: a */
    private int f59210a = 20130618;

    @Override // com.facebook.internal.AbstractC24744h
    public final String getAction() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    @Override // com.facebook.internal.AbstractC24744h
    public final int getMinVersion() {
        return this.f59210a;
    }

    static {
        Covode.recordClassIndex(30249);
    }

    private EnumC24945f(String str) {
    }
}
