package com.p2082ss.android.newmedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.newmedia.d */
public final class C30128d {
    static {
        Covode.recordClassIndex(36627);
    }

    /* renamed from: b */
    public static String m60947b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        long longValue = Long.valueOf(str).longValue();
        StringBuilder sb = new StringBuilder();
        do {
            long j = longValue % 23;
            longValue /= 23;
            if (j > 9) {
                sb.insert(0, (char) ((int) ((j + 97) - 10)));
            } else {
                sb.insert(0, j);
            }
        } while (longValue != 0);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m60944a(Activity activity) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            C13628n.m24507a(activity, 2131231583, (int) R.string.dol);
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.PICK");
        try {
            activity.startActivityForResult(intent, 10003);
        } catch (Exception unused) {
            C13628n.m24507a(activity, 2131231583, (int) R.string.doj);
        }
    }

    /* renamed from: a */
    public static boolean m60946a(String str) {
        if (C13627m.m24498a(str)) {
            return false;
        }
        if (str.toLowerCase().startsWith("http://") || str.toLowerCase().startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Uri m60943a(Context context, File file) {
        if (context == null || Build.VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
    }

    /* renamed from: a */
    public static void m60945a(Activity activity, Fragment fragment, int i) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            C13628n.m24507a(activity, 2131231583, (int) R.string.dol);
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        if (fragment != null) {
            try {
                fragment.startActivityForResult(intent, i);
            } catch (Exception unused) {
                C13628n.m24507a(activity, 2131231583, (int) R.string.doj);
            }
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
