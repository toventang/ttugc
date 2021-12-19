package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod */
public final class ShowToastMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35099a f82826b = new C35099a((byte) 0);

    /* renamed from: c */
    private final String f82827c = "showToast";

    static {
        Covode.recordClassIndex(42238);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod$a */
    public static final class C35099a {
        static {
            Covode.recordClassIndex(42239);
        }

        private C35099a() {
        }

        public /* synthetic */ C35099a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82827c;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod$b */
    static final class RunnableC35100b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ShowToastMethod f82828a;

        /* renamed from: b */
        final /* synthetic */ Context f82829b;

        /* renamed from: c */
        final /* synthetic */ boolean f82830c;

        /* renamed from: d */
        final /* synthetic */ String f82831d;

        /* renamed from: e */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82832e;

        static {
            Covode.recordClassIndex(42240);
        }

        RunnableC35100b(ShowToastMethod showToastMethod, Context context, boolean z, String str, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82828a = showToastMethod;
            this.f82829b = context;
            this.f82830c = z;
            this.f82831d = str;
            this.f82832e = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod.RunnableC35100b.run():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowToastMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        Context e = mo26893e();
        String optString = jSONObject.optString("message");
        boolean optBoolean = jSONObject.optBoolean("onWindow");
        if (e != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC35100b(this, e, optBoolean, optString, aVar));
        } else {
            aVar.mo61871a(0, "");
        }
    }
}
