package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel;

import android.content.Context;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel */
public final class SharePanelAndroidViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public static final C56069a f127866a = new C56069a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f127867b = C89250i.m154773a((AbstractC89171a) C56070b.f127868a);

    static {
        Covode.recordClassIndex(65866);
    }

    /* renamed from: a */
    public final C1213t<Boolean> mo92934a() {
        return (C1213t) this.f127867b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel$a */
    public static final class C56069a {
        static {
            Covode.recordClassIndex(65867);
        }

        private C56069a() {
        }

        public /* synthetic */ C56069a(byte b) {
            this();
        }

        /* renamed from: a */
        public static SharePanelAndroidViewModel m101961a(Context context) {
            return (SharePanelAndroidViewModel) C56082b.m101980a(context, SharePanelAndroidViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel$b */
    static final class C56070b extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C56070b f127868a = new C56070b();

        static {
            Covode.recordClassIndex(65868);
        }

        C56070b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }
}
