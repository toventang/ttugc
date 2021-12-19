package com.bytedance.android.live.broadcast.preview.p202c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.c.a */
public interface AbstractC3411a {
    static {
        Covode.recordClassIndex(3895);
    }

    /* renamed from: a */
    boolean mo8723a(C3412a aVar);

    /* renamed from: com.bytedance.android.live.broadcast.preview.c.a$a */
    public static final class C3412a {

        /* renamed from: a */
        public final Context f9641a;

        /* renamed from: b */
        public final DataChannel f9642b;

        /* renamed from: c */
        public final AbstractC89171a<C89391z> f9643c;

        static {
            Covode.recordClassIndex(3896);
        }

        public C3412a(Context context, DataChannel dataChannel, AbstractC89171a<C89391z> aVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(aVar, "");
            this.f9641a = context;
            this.f9642b = dataChannel;
            this.f9643c = aVar;
        }
    }
}
