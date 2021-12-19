package com.p2082ss.android.newmedia.redbadge.p2169a;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.redbadge.AbstractC30151a;
import com.p2082ss.android.newmedia.redbadge.C30188d;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.i */
public class C30160i implements AbstractC30151a {
    static {
        Covode.recordClassIndex(36662);
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final List<String> mo53567a() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final void mo53568a(Context context, ComponentName componentName, int i) {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("tag", componentName.getPackageName() + "/" + componentName.getClassName());
            contentValues.put("count", Integer.valueOf(i));
            try {
                context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
            } catch (Throwable th) {
                throw new C30188d(th.getMessage());
            }
        }
    }
}
