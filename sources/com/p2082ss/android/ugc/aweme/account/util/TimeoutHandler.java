package com.p2082ss.android.ugc.aweme.account.util;

import android.os.Message;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.account.base.SafeHandler;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.util.TimeoutHandler */
public final class TimeoutHandler<T> extends SafeHandler implements AbstractC33974au {

    /* renamed from: b */
    public static final C33027a f78569b = new C33027a((byte) 0);

    /* renamed from: c */
    private boolean f78570c;

    /* renamed from: d */
    private AbstractC89171a<C89391z> f78571d;

    /* renamed from: e */
    private AbstractC89172b<? super T, C89391z> f78572e;

    static {
        Covode.recordClassIndex(39833);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.base.SafeHandler, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.util.TimeoutHandler$a */
    public static final class C33027a {
        static {
            Covode.recordClassIndex(39834);
        }

        private C33027a() {
        }

        public /* synthetic */ C33027a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.base.SafeHandler
    public final void destroy() {
        super.destroy();
        this.f78572e = null;
        this.f78571d = null;
    }

    public final void handleMessage(Message message) {
        C89219l.m154721d(message, "");
        int i = message.what;
        if (i == 1) {
            AbstractC89171a<C89391z> aVar = this.f78571d;
            if (aVar != null) {
                aVar.invoke();
            }
            destroy();
        } else if (i == 2) {
            Object obj = message.obj;
            if (!(obj instanceof Object)) {
                obj = null;
            }
            this.f78570c = true;
            AbstractC89172b<? super T, C89391z> bVar = this.f78572e;
            if (bVar != null) {
                bVar.invoke(obj);
            }
            destroy();
        }
    }
}
