package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.AbstractC87729h;
import java.util.UUID;

/* access modifiers changed from: package-private */
/* renamed from: com.twitter.sdk.android.core.internal.scribe.x */
public final class C87790x extends AbstractC87767g<C87787v> {
    static {
        Covode.recordClassIndex(103788);
    }

    /* access modifiers changed from: protected */
    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87767g
    /* renamed from: b */
    public final String mo142225b() {
        return "se_" + UUID.randomUUID().toString() + "_" + this.f199356c.mo142175a() + ".tap";
    }

    C87790x(Context context, AbstractC87766f<C87787v> fVar, AbstractC87729h hVar, C87784s sVar, int i) {
        super(context, fVar, hVar, sVar, i);
    }
}
