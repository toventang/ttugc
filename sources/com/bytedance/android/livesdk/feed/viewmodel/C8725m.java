package com.bytedance.android.livesdk.feed.viewmodel;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.m */
public final /* synthetic */ class C8725m implements AbstractC8593h.AbstractC8594a {

    /* renamed from: a */
    private final TabFeedViewModel f21533a;

    static {
        Covode.recordClassIndex(9598);
    }

    public C8725m(TabFeedViewModel tabFeedViewModel) {
        this.f21533a = tabFeedViewModel;
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8593h.AbstractC8594a
    /* renamed from: a */
    public final void mo14897a() {
        int i;
        TabFeedViewModel tabFeedViewModel = this.f21533a;
        if (!TextUtils.isEmpty(tabFeedViewModel.f21508C)) {
            String str = null;
            try {
                str = Uri.parse(tabFeedViewModel.f21508C).getQueryParameter("style");
            } catch (Exception unused) {
            }
            if ("5".equals(str)) {
                List e = tabFeedViewModel.f21481a.mo14956e();
                if (!C13603b.m24435a((Collection) e)) {
                    int i2 = 0;
                    boolean z = true;
                    while (i2 < e.size()) {
                        if (((FeedItem) e.get(i2)).type == 6) {
                            if (i2 % 2 == 1) {
                                if (z) {
                                    if (i2 < e.size() - 1) {
                                        i = i2 + 1;
                                        Collections.swap(e, i2, i);
                                    } else {
                                        Collections.swap(e, i2, i2 - 1);
                                    }
                                }
                                z = !z;
                            } else {
                                if (!z) {
                                    if (i2 < e.size() - 1) {
                                        i = i2 + 1;
                                        Collections.swap(e, i2, i);
                                    } else {
                                        Collections.swap(e, i2, i2 - 1);
                                    }
                                }
                                z = !z;
                            }
                            i2 = i;
                            z = !z;
                        }
                        i2++;
                    }
                }
            }
        }
    }
}
