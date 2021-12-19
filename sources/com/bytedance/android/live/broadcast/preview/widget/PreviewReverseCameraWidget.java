package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewReverseCameraWidget extends PreviewToolBaseWidget implements AbstractC33974au {

    /* renamed from: a */
    private int f9971a = 1;

    /* renamed from: b */
    private final int f9972b = R.string.gv2;

    /* renamed from: c */
    private final int f9973c = 2131234585;

    /* renamed from: d */
    private final AbstractC89171a<AbstractC11683e> f9974d;

    static {
        Covode.recordClassIndex(4109);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final int mo8870a() {
        return this.f9972b;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: b */
    public final int mo8872b() {
        return this.f9973c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewReverseCameraWidget(AbstractC89171a<? extends AbstractC11683e> aVar) {
        C89219l.m154721d(aVar, "");
        this.f9974d = aVar;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final void mo8871a(View view) {
        C89219l.m154721d(view, "");
        int i = 1 - this.f9971a;
        PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-382").usage("").tag("[offline test only] broadcast preview reverse camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
        this.f9971a = i;
        C6501b.C6502a.m13948a("camera_switch").mo12643a(this.dataChannel).mo12654b("live").mo12656c("click").mo12655b();
        C6805b<Integer> bVar = AbstractC6804a.f17058i;
        C89219l.m154716b(bVar, "");
        bVar.mo13069b(Integer.valueOf(this.f9971a));
        AbstractC11683e invoke = this.f9974d.invoke();
        if (invoke != null) {
            invoke.mo8850a(i, build);
        }
        C4217d.m10322e().mo9851c();
    }
}
