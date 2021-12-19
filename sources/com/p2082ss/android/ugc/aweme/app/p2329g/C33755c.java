package com.p2082ss.android.ugc.aweme.app.p2329g;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.app.g.c */
public final class C33755c {

    /* renamed from: b */
    private static C33755c f79960b;

    /* renamed from: a */
    public HandlerThreadC33754b f79961a;

    /* renamed from: c */
    private ArrayList<String> f79962c;

    /* renamed from: d */
    private C33753a f79963d;

    static {
        Covode.recordClassIndex(40650);
    }

    /* renamed from: a */
    public static boolean m69098a() {
        if (f79960b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C33755c m69099b() {
        C33755c cVar = f79960b;
        if (cVar != null) {
            return cVar;
        }
        throw new RuntimeException("UserActionPredict not init");
    }

    /* renamed from: a */
    public final void mo59990a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C33753a aVar = new C33753a(str, System.currentTimeMillis());
            if (!this.f79962c.contains(aVar.f79956a)) {
                this.f79963d = aVar;
                HandlerThreadC33754b bVar = this.f79961a;
                if (bVar.f79958a != null) {
                    Message obtainMessage = bVar.f79958a.obtainMessage(0);
                    obtainMessage.obj = aVar;
                    obtainMessage.setTarget(bVar.f79958a);
                    bVar.f79958a.sendMessage(obtainMessage);
                }
            }
        }
    }
}
