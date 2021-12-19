package com.bytedance.push.notification;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1589b.AbstractC21762a;
import com.bytedance.push.p1589b.C21764c;

/* renamed from: com.bytedance.push.notification.b */
public final class C21864b implements Handler.Callback, AbstractC21867c {

    /* renamed from: a */
    public final AbstractC21762a f51791a;

    /* renamed from: b */
    public Handler f51792b;

    static {
        Covode.recordClassIndex(25517);
    }

    public final boolean handleMessage(Message message) {
        return false;
    }

    C21864b(AbstractC21762a aVar) {
        this.f51791a = aVar;
    }

    @Override // com.bytedance.push.p1589b.AbstractC21762a
    /* renamed from: a */
    public final Bitmap mo35399a(C21764c cVar) {
        return this.f51791a.mo35399a(cVar);
    }
}
