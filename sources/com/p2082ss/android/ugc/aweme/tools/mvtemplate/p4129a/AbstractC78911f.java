package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a;

import android.content.Intent;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.f */
public abstract class AbstractC78911f<RETURN_VALUE> {
    static {
        Covode.recordClassIndex(92060);
    }

    private AbstractC78911f() {
    }

    public /* synthetic */ AbstractC78911f(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.f$a */
    public static final class C78912a extends AbstractC78911f<Intent> {

        /* renamed from: a */
        public final ActivityC0945e f177379a;

        /* renamed from: b */
        public final ShortVideoContext f177380b;

        /* renamed from: c */
        public final ArrayList<MediaModel> f177381c;

        /* renamed from: d */
        public final boolean f177382d;

        /* renamed from: e */
        public final AbstractC89171a<C89391z> f177383e;

        /* renamed from: f */
        public final AbstractC89171a<C89391z> f177384f;

        static {
            Covode.recordClassIndex(92061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78912a(ActivityC0945e eVar, ShortVideoContext shortVideoContext, ArrayList<MediaModel> arrayList, boolean z, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
            super((byte) 0);
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(shortVideoContext, "");
            C89219l.m154721d(arrayList, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(aVar2, "");
            this.f177379a = eVar;
            this.f177380b = shortVideoContext;
            this.f177381c = arrayList;
            this.f177382d = z;
            this.f177383e = aVar;
            this.f177384f = aVar2;
        }
    }
}
