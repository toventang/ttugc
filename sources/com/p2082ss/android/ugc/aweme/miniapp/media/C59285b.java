package com.p2082ss.android.ugc.aweme.miniapp.media;

import android.app.Activity;
import android.content.Intent;
import android.media.ExifInterface;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.C59309a;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p078c.p083d.C1762a;

/* renamed from: com.ss.android.ugc.aweme.miniapp.media.b */
public final class C59285b {

    /* renamed from: a */
    C63787p f135509a;

    /* renamed from: b */
    private Activity f135510b;

    static {
        Covode.recordClassIndex(69660);
    }

    /* renamed from: a */
    public static int m108984a(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public final List<C59309a.C59310a> mo96879a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        List<Uri> parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new LinkedList();
        }
        for (Uri uri : parcelableArrayListExtra) {
            arrayList.add(new C59309a.C59310a(C1762a.m5918a(this.f135510b, uri), "", 0, 0, 0, 0, ""));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[SYNTHETIC, Splitter:B:30:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097 A[SYNTHETIC, Splitter:B:41:0x0097] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo96878a(android.graphics.Bitmap r7) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.miniapp.media.C59285b.mo96878a(android.graphics.Bitmap):java.lang.String");
    }

    public C59285b(Activity activity, Fragment fragment) {
        this.f135510b = activity;
        this.f135509a = new C63787p(activity, fragment, null, null);
    }
}
