package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.AbstractC24744h;

/* renamed from: com.facebook.share.internal.j */
public enum EnumC24953j implements AbstractC24744h {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);
    

    /* renamed from: a */
    private int f59217a;

    @Override // com.facebook.internal.AbstractC24744h
    public final String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    @Override // com.facebook.internal.AbstractC24744h
    public final int getMinVersion() {
        return this.f59217a;
    }

    static {
        Covode.recordClassIndex(30257);
    }

    private EnumC24953j(int i) {
        this.f59217a = i;
    }
}
