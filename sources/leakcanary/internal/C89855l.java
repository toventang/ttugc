package leakcanary.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4645m.C89863a;

/* renamed from: leakcanary.internal.l */
public final class C89855l extends BroadcastReceiver {

    /* renamed from: a */
    public static final C89857b f203748a = new C89857b((byte) 0);

    /* renamed from: leakcanary.internal.l$a */
    public enum EnumC89856a {
        DUMP_HEAP,
        CANCEL_NOTIFICATION;

        static {
            Covode.recordClassIndex(105953);
        }
    }

    static {
        Covode.recordClassIndex(105952);
    }

    /* renamed from: leakcanary.internal.l$b */
    public static final class C89857b {
        static {
            Covode.recordClassIndex(105954);
        }

        private C89857b() {
        }

        public /* synthetic */ C89857b(byte b) {
            this();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        C89863a.AbstractC89864a aVar;
        C89219l.m154719c(context, "");
        C89219l.m154719c(intent, "");
        String action = intent.getAction();
        if (C89219l.m154714a((Object) action, (Object) EnumC89856a.DUMP_HEAP.name())) {
            InternalLeakCanary.INSTANCE.onDumpHeapReceived();
        } else if (!C89219l.m154714a((Object) action, (Object) EnumC89856a.CANCEL_NOTIFICATION.name()) && (aVar = C89863a.f203762a) != null) {
            aVar.mo144406a("NotificationReceiver received unknown intent action for ".concat(String.valueOf(intent)));
        }
    }
}
