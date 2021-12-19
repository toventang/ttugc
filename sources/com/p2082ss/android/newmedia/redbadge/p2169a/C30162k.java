package com.p2082ss.android.newmedia.redbadge.p2169a;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.newmedia.redbadge.AbstractC30151a;
import com.p2082ss.android.newmedia.redbadge.p2171c.C30186a;
import com.p2082ss.android.newmedia.redbadge.p2171c.C30187b;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.k */
public class C30162k implements AbstractC30151a {

    /* renamed from: a */
    private static final String[] f71926a = {"_id", "class"};

    /* renamed from: b */
    private C30155d f71927b;

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final List<String> mo53567a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    static {
        Covode.recordClassIndex(36664);
    }

    public C30162k() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f71927b = new C30155d();
        }
    }

    /* renamed from: a */
    private static ContentValues m60996a(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final void mo53568a(Context context, ComponentName componentName, int i) {
        int i2 = i;
        MethodCollector.m26663i(13599);
        if (context == null || componentName == null) {
            MethodCollector.m26664o(13599);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (this.f71927b == null || !C30186a.m61058a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            try {
                Cursor query = contentResolver.query(parse, f71926a, "package=?", new String[]{componentName.getPackageName()}, null);
                if (query != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (query.moveToNext()) {
                        int i3 = query.getInt(0);
                        contentResolver.update(parse, m60996a(componentName, i2, false), "_id=?", new String[]{String.valueOf(i3)});
                        if (className.equals(query.getString(query.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, m60996a(componentName, i2, true));
                    }
                }
                C30187b.m61059a(query);
                MethodCollector.m26664o(13599);
            } catch (Throwable th) {
                C30187b.m61059a(null);
                MethodCollector.m26664o(13599);
                throw th;
            }
        } else {
            this.f71927b.mo53568a(context, componentName, i2);
            MethodCollector.m26664o(13599);
        }
    }
}
