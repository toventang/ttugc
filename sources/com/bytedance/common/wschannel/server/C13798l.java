package com.bytedance.common.wschannel.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.common.wschannel.C13758l;
import com.bytedance.common.wschannel.server.C13790h;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.server.l */
public final class C13798l extends BroadcastReceiver {

    /* renamed from: b */
    public static boolean f33556b;

    /* renamed from: a */
    public C13772b f33557a;

    /* renamed from: c */
    private boolean f33558c = true;

    /* renamed from: d */
    private C13790h.EnumC13791a f33559d;

    static {
        Covode.recordClassIndex(15846);
    }

    public C13798l() {
    }

    public C13798l(Context context, C13772b bVar) {
        this.f33559d = C13790h.m24890b(context);
        this.f33557a = bVar;
    }

    public final void onReceive(final Context context, Intent intent) {
        if (context != null && intent != null && this.f33557a != null && !TextUtils.isEmpty(intent.getAction()) && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (this.f33558c) {
                this.f33558c = false;
                if (C13790h.m24890b(context) == this.f33559d) {
                    return;
                }
            }
            RunnableC13596e.m24423a(new Runnable() {
                /* class com.bytedance.common.wschannel.server.C13798l.RunnableC137991 */

                static {
                    Covode.recordClassIndex(15847);
                }

                public final void run() {
                    try {
                        boolean a = C13758l.m24811a(context).mo22109a();
                        if (a != C13798l.f33556b) {
                            C13798l.f33556b = a;
                        }
                    } catch (Throwable unused) {
                    }
                    if (C13798l.f33556b) {
                        try {
                            Logger.debug();
                            Context context = context;
                            boolean a2 = C13790h.m24889a(context);
                            C13790h.EnumC13791a b = C13790h.m24890b(context);
                            int i = 1;
                            if (!a2) {
                                i = 2;
                            } else if (C13790h.EnumC13791a.WIFI == b) {
                                i = 3;
                            } else if (C13790h.EnumC13791a.NONE != b) {
                                i = 4;
                            }
                            Message obtain = Message.obtain();
                            obtain.what = 3;
                            obtain.arg1 = i;
                            C13798l.this.f33557a.handleMsg(obtain);
                        } catch (Exception unused2) {
                        }
                    }
                }
            });
        }
    }
}
