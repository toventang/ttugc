package com.p2082ss.android.ugc.aweme.shortvideo.p3875u;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import java.io.File;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.u.c */
public final /* synthetic */ class CallableC73300c implements Callable {

    /* renamed from: a */
    private final String f164613a;

    /* renamed from: b */
    private final Bitmap f164614b;

    static {
        Covode.recordClassIndex(86019);
    }

    CallableC73300c(String str, Bitmap bitmap) {
        this.f164613a = str;
        this.f164614b = bitmap;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f164613a;
        Bitmap bitmap = this.f164614b;
        if (TextUtils.isEmpty(str) || bitmap == null) {
            return null;
        }
        C84891c.m145848a(bitmap, new File(str), 60, Bitmap.CompressFormat.PNG);
        return null;
    }
}
