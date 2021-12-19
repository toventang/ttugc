package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager */
public final class DetailLoadStateManager extends AbstractC1174ac {

    /* renamed from: b */
    public static final C41342a f96501b = new C41342a((byte) 0);

    /* renamed from: a */
    public final C1213t<Boolean> f96502a = new C1213t<>();

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager$a */
    public static final class C41342a {
        static {
            Covode.recordClassIndex(49235);
        }

        /* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager$a$a */
        public static final class C41343a implements C1175ad.AbstractC1177b {
            static {
                Covode.recordClassIndex(49236);
            }

            C41343a() {
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154721d(cls, "");
                return new DetailLoadStateManager();
            }
        }

        private C41342a() {
        }

        public /* synthetic */ C41342a(byte b) {
            this();
        }

        /* renamed from: a */
        public static DetailLoadStateManager m83213a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, new C41343a()).mo3983a(DetailLoadStateManager.class);
            C89219l.m154716b(a, "");
            return (DetailLoadStateManager) a;
        }
    }

    static {
        Covode.recordClassIndex(49234);
    }
}
