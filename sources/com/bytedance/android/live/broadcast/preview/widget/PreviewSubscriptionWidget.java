package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.preview.p204d.C3495a;
import com.bytedance.android.live.broadcast.preview.p204d.C3497b;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewSubscriptionWidget extends PreviewToolBaseWidget implements AbstractC33974au {

    /* renamed from: c */
    public static final C3636a f10044c = new C3636a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f10045a = C11831d.m20835a(C3637b.f10050a);

    /* renamed from: b */
    public final AbstractC0952i f10046b;

    /* renamed from: d */
    private final C3497b f10047d = new C3497b();

    /* renamed from: e */
    private final int f10048e = R.string.ela;

    /* renamed from: f */
    private final int f10049f = 2131234704;

    static {
        Covode.recordClassIndex(4145);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSubscriptionWidget$a */
    public static final class C3636a {
        static {
            Covode.recordClassIndex(4146);
        }

        private C3636a() {
        }

        public /* synthetic */ C3636a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final int mo8870a() {
        return this.f10048e;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: b */
    public final int mo8872b() {
        return this.f10049f;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSubscriptionWidget$b */
    static final class C3637b extends AbstractC89220m implements AbstractC89171a<C3495a> {

        /* renamed from: a */
        public static final C3637b f10050a = new C3637b();

        static {
            Covode.recordClassIndex(4147);
        }

        C3637b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C3495a invoke() {
            return new C3495a();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.f10047d.mo8277a();
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSubscriptionWidget$c */
    static final class C3638c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewSubscriptionWidget f10051a;

        static {
            Covode.recordClassIndex(4148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3638c(PreviewSubscriptionWidget previewSubscriptionWidget) {
            super(0);
            this.f10051a = previewSubscriptionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C3495a aVar = (C3495a) this.f10051a.f10045a.getValue();
            AbstractC0952i iVar = this.f10051a.f10046b;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(iVar, "");
            C89219l.m154721d("PreviewSubscriptionWidget", "");
            if (!aVar.mo18054n()) {
                aVar.show(iVar, "PreviewSubscriptionWidget");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C6805b<Boolean> bVar = AbstractC6804a.f16954bC;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue()) {
            mo8933d();
        }
        C6501b a2 = C6501b.C6502a.m13948a("livesdk_subscribe_icon_show");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        a2.mo12662g(String.valueOf(b.mo13161c())).mo12651a("show_entrance", "live_take_page").mo12655b();
    }

    public PreviewSubscriptionWidget(AbstractC0952i iVar) {
        C89219l.m154721d(iVar, "");
        this.f10046b = iVar;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final void mo8871a(View view) {
        C89219l.m154721d(view, "");
        C6805b<Boolean> bVar = AbstractC6804a.f16954bC;
        C89219l.m154716b(bVar, "");
        C6806c.m14603a((C6800c) bVar, (Object) false);
        C6501b a = C6501b.C6502a.m13948a("livesdk_subscribe_icon_click");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        a.mo12662g(String.valueOf(b.mo13161c())).mo12651a("click_position", "live_take_page").mo12655b();
        mo8934e();
        C3497b bVar2 = this.f10047d;
        Context context = this.context;
        C89219l.m154716b(context, "");
        bVar2.mo8278a(context, true, (AbstractC89171a<C89391z>) new C3638c(this));
    }
}
