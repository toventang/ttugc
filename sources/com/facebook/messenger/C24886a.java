package com.facebook.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24756m;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.messenger.a */
public class C24886a {
    static {
        Covode.recordClassIndex(29076);
    }

    /* renamed from: a */
    public static void m47711a(Context context) {
        if (!C24677a.m47209a(C24886a.class)) {
            try {
                m47713a(context, "market://details?id=com.facebook.orca");
            } catch (ActivityNotFoundException unused) {
                m47713a(context, "http://play.google.com/store/apps/details?id=com.facebook.orca");
            } catch (Throwable th) {
                C24677a.m47208a(th, C24886a.class);
            }
        }
    }

    /* renamed from: b */
    private static Set<Integer> m47714b(Context context) {
        MethodCollector.m26663i(9643);
        ContentResolver contentResolver = context.getContentResolver();
        HashSet hashSet = new HashSet();
        Cursor query = contentResolver.query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[]{"version"}, null, null, null);
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("version");
                while (query.moveToNext()) {
                    hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
                }
                query.close();
            } catch (Throwable th) {
                query.close();
                MethodCollector.m26664o(9643);
                throw th;
            }
        }
        MethodCollector.m26664o(9643);
        return hashSet;
    }

    /* renamed from: a */
    private static void m47712a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static void m47713a(Context context, String str) {
        m47712a(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: a */
    public static void m47710a(Activity activity, C24887b bVar) {
        if (!C24677a.m47209a(C24886a.class)) {
            try {
                if (!C24756m.m47401a(activity, "com.facebook.orca")) {
                    m47711a(activity);
                } else if (m47714b(activity).contains(20150314)) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setFlags(1);
                        intent.setPackage("com.facebook.orca");
                        intent.putExtra("android.intent.extra.STREAM", bVar.f59073d);
                        intent.setType(bVar.f59074e);
                        C24699ae.m47299a();
                        String str = C24872m.f59041a;
                        if (str != null) {
                            intent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 20150314);
                            intent.putExtra("com.facebook.orca.extra.APPLICATION_ID", str);
                            intent.putExtra("com.facebook.orca.extra.METADATA", bVar.f59075f);
                            intent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", bVar.f59076g);
                        }
                        activity.startActivityForResult(intent, 12306);
                    } catch (ActivityNotFoundException unused) {
                        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage("com.facebook.orca");
                        C84349a.m145093a(launchIntentForPackage, activity);
                        activity.startActivity(launchIntentForPackage);
                    }
                } else {
                    m47711a(activity);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24886a.class);
            }
        }
    }
}
