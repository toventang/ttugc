package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.dk */
public final /* synthetic */ class CallableC70639dk implements Callable {

    /* renamed from: a */
    private final String f158119a;

    static {
        Covode.recordClassIndex(83105);
    }

    CallableC70639dk(String str) {
        this.f158119a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f158119a;
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C14401a((byte) 0).mo23215a(C63247i.f143610a, IVideoRecordPreferences.class);
        if (str == null) {
            str = "";
        }
        iVideoRecordPreferences.setCreativeToolRootDir(str);
        return null;
    }
}
