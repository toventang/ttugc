package com.bytedance.android.live.p176b;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdk.container.AbstractC8220c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.b.g */
public interface AbstractC2930g extends AbstractC2953a {
    static {
        Covode.recordClassIndex(3369);
    }

    AbstractC8220c createHybridView(Context context, Uri uri);

    Fragment createPageFragment(Uri uri, Context context);

    boolean handleScheme(Uri uri, Context context);

    boolean isContainerScheme(Uri uri);
}
