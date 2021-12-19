package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.AbstractC16249c;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.FollowPACheckMethod */
public final class FollowPACheckMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C42920a f100074b = new C42920a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f100075c;

    /* renamed from: d */
    private final String f100076d = "followPACheckMethod";

    static {
        Covode.recordClassIndex(51030);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.FollowPACheckMethod$a */
    public static final class C42920a {
        static {
            Covode.recordClassIndex(51031);
        }

        private C42920a() {
        }

        public /* synthetic */ C42920a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100076d;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.FollowPACheckMethod$b */
    static final class C42921b extends AbstractC89220m implements AbstractC89171a<AbstractC16249c<? extends Context>> {

        /* renamed from: a */
        final /* synthetic */ C16248b f100077a;

        static {
            Covode.recordClassIndex(51032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42921b(C16248b bVar) {
            super(0);
            this.f100077a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC16249c<? extends Context> invoke() {
            return this.f100077a.mo25830b(Context.class);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowPACheckMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        this.f100075c = C89250i.m154773a((AbstractC89171a) new C42921b(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Context context;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        AbstractC16249c cVar = (AbstractC16249c) this.f100075c.getValue();
        if (cVar != null) {
            context = (Context) cVar.mo25823b();
        } else {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<Integer> privacyAccountFollowCount = inst.getPrivacyAccountFollowCount();
            C89219l.m154716b(privacyAccountFollowCount, "");
            Integer c = privacyAccountFollowCount.mo59941c();
            if (c != null && c.intValue() == 0) {
                new C17197a.C17200a(activity).mo27194b(R.string.esu).mo27190a(R.string.cbc, (DialogInterface.OnClickListener) null, false).mo27193a().mo27184b();
            } else if (c.intValue() > 0 && c.intValue() < 4) {
                new C23144b(activity).mo37640e(R.string.esv).mo37637b();
            }
            privacyAccountFollowCount.mo59940b(Integer.valueOf(c.intValue() + 1));
        }
    }
}
