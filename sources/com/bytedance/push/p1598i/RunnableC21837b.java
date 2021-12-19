package com.bytedance.push.p1598i;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.third.AbstractC21920d;
import com.p2082ss.android.message.C30066d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.push.i.b */
public final class RunnableC21837b implements Runnable {

    /* renamed from: a */
    static final Object f51734a = new Object();

    /* renamed from: b */
    int f51735b;

    /* renamed from: c */
    private final AbstractC21920d f51736c;

    /* renamed from: d */
    private int f51737d = 10;

    /* renamed from: e */
    private Context f51738e;

    /* renamed from: f */
    private final Handler f51739f;

    static {
        Covode.recordClassIndex(25489);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.p1598i.RunnableC21837b.run():void");
    }

    public RunnableC21837b(Context context, AbstractC21920d dVar) {
        C30066d.m60817a();
        this.f51739f = new Handler(C30066d.f71756b.getLooper()) {
            /* class com.bytedance.push.p1598i.RunnableC21837b.HandlerC218381 */

            static {
                Covode.recordClassIndex(25490);
            }

            public final void handleMessage(Message message) {
                super.handleMessage(message);
                RunnableC21837b bVar = RunnableC21837b.this;
                if (message.what == 1) {
                    try {
                        int i = message.arg1;
                        if (i == 10 || i != 11) {
                            String str = (String) message.obj;
                            try {
                                bVar.f51735b++;
                                if (bVar.f51735b <= 3 && !TextUtils.isEmpty(str)) {
                                    C30066d.m60817a().mo53432a(new Runnable() {
                                        /* class com.bytedance.push.p1598i.RunnableC21837b.RunnableC218392 */

                                        static {
                                            Covode.recordClassIndex(25491);
                                        }

                                        public final void run() {
                                            RunnableC21837b.this.run();
                                        }
                                    }, TimeUnit.SECONDS.toMillis(4) * ((long) bVar.f51735b));
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        };
        this.f51735b = 0;
        this.f51738e = context;
        this.f51736c = dVar;
    }
}
