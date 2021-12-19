package com.bytedance.android.livesdk.container.p509f;

import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.container.AbstractC8241e;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.config.live.LivePopupConfig;
import com.bytedance.android.livesdk.container.custom.p506a.AbstractC8234b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1339a.p1340a.C18738d;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.f.a */
public final class C8243a {

    /* renamed from: a */
    public static final C8243a f20470a = new C8243a();

    private C8243a() {
    }

    static {
        Covode.recordClassIndex(9078);
    }

    /* renamed from: com.bytedance.android.livesdk.container.f.a$b */
    public static final class C8245b implements AbstractC8234b {

        /* renamed from: a */
        final /* synthetic */ int f20472a;

        static {
            Covode.recordClassIndex(9080);
        }

        C8245b(int i) {
            this.f20472a = i;
        }

        @Override // com.bytedance.android.livesdk.container.custom.p506a.AbstractC8234b
        /* renamed from: a */
        public final void mo14587a(View view) {
            C89219l.m154721d(view, "");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + this.f20472a, view.getPaddingRight(), view.getPaddingBottom());
        }

        @Override // com.bytedance.android.livesdk.container.custom.p506a.AbstractC8234b
        /* renamed from: b */
        public final void mo14588b(View view) {
            C89219l.m154721d(view, "");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() - this.f20472a, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.f.a$a */
    public static final class View$OnClickListenerC8244a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC8241e f20471a;

        static {
            Covode.recordClassIndex(9079);
        }

        public View$OnClickListenerC8244a(AbstractC8241e eVar) {
            this.f20471a = eVar;
        }

        public final void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("container_id", this.f20471a.getHybridContainerId());
            C18484a aVar = new C18484a("container_popupTapSpace", currentTimeMillis, new C18738d(jSONObject));
            aVar.mo29624a(this.f20471a.getHybridContainerId());
            C18494b.m34415a(aVar);
        }
    }

    /* renamed from: a */
    public static void m16385a(PopupConfig popupConfig) {
        int minMarginTop;
        LivePopupConfig extraConfig = popupConfig.getExtraConfig();
        if (extraConfig != null && (minMarginTop = extraConfig.getMinMarginTop()) > 0) {
            AbstractC2953a a = C6193a.m13435a(AbstractC2928f.class);
            C89219l.m154716b(a, "");
            Iterator<T> it = ((AbstractC2928f) a).getHybridDialogManager().mo7677b().iterator();
            while (it.hasNext()) {
                it.next().mo14581a(new C8245b(minMarginTop));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.f.a$c */
    public static final class C8246c extends LiveBottomSheetBehavior.AbstractC4107a {

        /* renamed from: a */
        public int f20473a = 3;

        /* renamed from: b */
        final /* synthetic */ List f20474b;

        /* renamed from: c */
        final /* synthetic */ AbstractC8241e f20475c;

        static {
            Covode.recordClassIndex(9081);
        }

        public C8246c(List list, AbstractC8241e eVar) {
            this.f20474b = list;
            this.f20475c = eVar;
        }

        @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AbstractC4107a
        /* renamed from: a */
        public final void mo9571a(View view, float f) {
            C89219l.m154721d(view, "");
            for (AbstractC8241e eVar : this.f20474b) {
                View c = eVar.mo14594c();
                if (c != null) {
                    C0792v.m2767d(c, (int) (((float) c.getHeight()) * f));
                }
            }
        }

        @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AbstractC4107a
        /* renamed from: a */
        public final void mo9572a(View view, int i) {
            Object obj;
            C89219l.m154721d(view, "");
            if (i == 5) {
                for (AbstractC8241e eVar : this.f20474b) {
                    if (eVar != null && this.f20473a == 2 && (!C89219l.m154714a((Object) eVar.getHybridContainerId(), (Object) this.f20475c.getHybridContainerId()))) {
                        try {
                            eVar.mo14465b();
                            obj = C89379q.m157068constructorimpl(C89391z.f203057a);
                        } catch (Throwable th) {
                            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                        }
                        C89379q.m157067boximpl(obj);
                    }
                }
            }
            this.f20473a = i;
        }
    }
}
