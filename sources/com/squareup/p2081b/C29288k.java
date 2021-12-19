package com.squareup.p2081b;

import android.content.Context;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.squareup.p2081b.AbstractC29315y;
import com.squareup.p2081b.C29299t;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.k */
public final class C29288k extends C29278g {
    static {
        Covode.recordClassIndex(35637);
    }

    C29288k(Context context) {
        super(context);
    }

    @Override // com.squareup.p2081b.AbstractC29315y, com.squareup.p2081b.C29278g
    /* renamed from: a */
    public final boolean mo51062a(C29312w wVar) {
        return "file".equals(wVar.f69562d.getScheme());
    }

    @Override // com.squareup.p2081b.AbstractC29315y, com.squareup.p2081b.C29278g
    /* renamed from: b */
    public final AbstractC29315y.C29316a mo51063b(C29312w wVar) {
        int i;
        InputStream c = mo51078c(wVar);
        C29299t.EnumC29305d dVar = C29299t.EnumC29305d.DISK;
        int attributeInt = new ExifInterface(wVar.f69562d.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            i = LiveFeedRefreshTimeSetting.DEFAULT;
        } else if (attributeInt == 6) {
            i = 90;
        } else if (attributeInt != 8) {
            i = 0;
        } else {
            i = 270;
        }
        return new AbstractC29315y.C29316a(null, c, dVar, i);
    }
}
