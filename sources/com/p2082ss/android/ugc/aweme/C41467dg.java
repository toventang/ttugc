package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.ITakeInSameOptimize;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dg */
public final class C41467dg implements ITakeInSameOptimize {

    /* renamed from: a */
    public static final C41467dg f96718a = new C41467dg();

    /* renamed from: b */
    public static final C41468a f96719b = new C41468a((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.services.ITakeInSameOptimize
    public final boolean enableCombineMusicAndEffectDownload() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ITakeInSameOptimize
    public final boolean enableTakeInSameRecordOptimize(Context context) {
        C89219l.m154721d(context, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.dg$a */
    public static final class C41468a {
        static {
            Covode.recordClassIndex(49367);
        }

        private C41468a() {
        }

        public /* synthetic */ C41468a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(49366);
    }
}
