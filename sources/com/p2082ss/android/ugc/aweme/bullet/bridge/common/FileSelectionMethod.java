package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47909a;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod */
public final class FileSelectionMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35010a f82593b = new C35010a((byte) 0);

    /* renamed from: c */
    private final String f82594c = "fileSelection";

    static {
        Covode.recordClassIndex(42095);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod$a */
    public static final class C35010a {
        static {
            Covode.recordClassIndex(42096);
        }

        private C35010a() {
        }

        public /* synthetic */ C35010a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82594c;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod$b */
    public static final class C35011b extends AbstractC47909a {

        /* renamed from: a */
        final /* synthetic */ Activity f82595a;

        /* renamed from: b */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82596b;

        static {
            Covode.recordClassIndex(42097);
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod$b$a */
        static final class RunnableC35012a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35011b f82597a;

            /* renamed from: b */
            final /* synthetic */ int f82598b;

            /* renamed from: c */
            final /* synthetic */ String f82599c;

            static {
                Covode.recordClassIndex(42098);
            }

            RunnableC35012a(C35011b bVar, int i, String str) {
                this.f82597a = bVar;
                this.f82598b = i;
                this.f82599c = str;
            }

            public final void run() {
                this.f82597a.f110960c.mo79936a();
                this.f82597a.f82596b.mo61871a(this.f82598b, this.f82599c);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod$b$b */
        static final class RunnableC35013b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35011b f82600a;

            /* renamed from: b */
            final /* synthetic */ JSONArray f82601b;

            static {
                Covode.recordClassIndex(42099);
            }

            RunnableC35013b(C35011b bVar, JSONArray jSONArray) {
                this.f82600a = bVar;
                this.f82601b = jSONArray;
            }

            public final void run() {
                this.f82600a.f110960c.mo79936a();
                this.f82600a.f82596b.mo61873a(this.f82601b, 1, "uploadSuccess");
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47963m
        /* renamed from: a */
        public final void mo61887a(JSONArray jSONArray) {
            C89219l.m154721d(jSONArray, "");
            this.f82595a.runOnUiThread(new RunnableC35013b(this, jSONArray));
        }

        @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47963m
        /* renamed from: a */
        public final void mo61886a(int i, String str) {
            C89219l.m154721d(str, "");
            this.f82595a.runOnUiThread(new RunnableC35012a(this, i, str));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35011b(Activity activity, BaseBridgeMethod.AbstractC34965a aVar, WeakReference weakReference) {
            super(weakReference);
            this.f82595a = activity;
            this.f82596b = aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSelectionMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        for (Context e = mo26893e(); e != null; e = ((ContextWrapper) e).getBaseContext()) {
            if (e instanceof Activity) {
                Activity activity = (Activity) e;
                if (activity != null) {
                    new C35011b(activity, aVar, new WeakReference(activity)).mo79933a(jSONObject);
                    return;
                }
                return;
            } else if (!(e instanceof ContextWrapper)) {
                return;
            }
        }
    }
}
