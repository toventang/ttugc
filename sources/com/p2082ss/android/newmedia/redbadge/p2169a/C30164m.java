package com.p2082ss.android.newmedia.redbadge.p2169a;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.redbadge.AbstractC30151a;
import com.p2082ss.android.newmedia.redbadge.C30188d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.m */
public class C30164m implements AbstractC30151a {

    /* renamed from: a */
    private final Uri f71928a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    private AsyncQueryHandler f71929b;

    static {
        Covode.recordClassIndex(36666);
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final List<String> mo53567a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    /* renamed from: com.ss.android.newmedia.redbadge.a.m$a */
    static class C30166a extends AsyncQueryHandler {
        static {
            Covode.recordClassIndex(36668);
        }

        C30166a(ContentResolver contentResolver) {
            super(contentResolver);
        }

        /* access modifiers changed from: protected */
        public Handler createHandler(Looper looper) {
            return new C30167a(looper);
        }

        /* renamed from: com.ss.android.newmedia.redbadge.a.m$a$a */
        class C30167a extends AsyncQueryHandler.WorkerHandler {
            static {
                Covode.recordClassIndex(36669);
            }

            public final void handleMessage(Message message) {
                try {
                    super.handleMessage(message);
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }

            C30167a(Looper looper) {
                super(C30166a.this, looper);
            }
        }
    }

    @Override // com.p2082ss.android.newmedia.redbadge.AbstractC30151a
    /* renamed from: a */
    public final void mo53568a(Context context, ComponentName componentName, int i) {
        if (context != null && componentName != null) {
            boolean z = false;
            if (i < 0) {
                i = 0;
            }
            try {
                if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
                    if (this.f71929b == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (C58003a.f132201c) {
                            if (applicationContext == null) {
                                applicationContext = C58003a.f132199a;
                            }
                        }
                        this.f71929b = new C30166a(applicationContext.getContentResolver()) {
                            /* class com.p2082ss.android.newmedia.redbadge.p2169a.C30164m.C301651 */

                            static {
                                Covode.recordClassIndex(36667);
                            }
                        };
                    }
                    String packageName = componentName.getPackageName();
                    String className = componentName.getClassName();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("badge_count", Integer.valueOf(i));
                    contentValues.put("package_name", packageName);
                    contentValues.put("activity_name", className);
                    this.f71929b.startInsert(0, null, this.f71928a, contentValues);
                    return;
                }
                Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
                if (i > 0) {
                    z = true;
                }
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
                context.sendBroadcast(intent);
            } catch (Throwable th) {
                throw new C30188d(th.getMessage());
            }
        }
    }
}
