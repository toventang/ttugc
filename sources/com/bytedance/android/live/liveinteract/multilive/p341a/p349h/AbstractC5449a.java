package com.bytedance.android.live.liveinteract.multilive.p341a.p349h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5392h;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5393i;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5590c;
import com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a;
import com.bytedance.android.live.liveinteract.multilive.p362e.C5631d;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.a */
public abstract class AbstractC5449a extends AbstractC5612a {
    static {
        Covode.recordClassIndex(6044);
    }

    /* renamed from: f */
    private final C5631d mo11264f() {
        View view;
        FrameLayout e = mo11309e();
        if (e != null && e.getChildCount() == 0) {
            return null;
        }
        FrameLayout e2 = mo11309e();
        if (e2 != null) {
            view = e2.getChildAt(0);
        } else {
            view = null;
        }
        if (view instanceof C5631d) {
            return (C5631d) view;
        }
        return null;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.a$a */
    static final class C5450a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5449a f14020a;

        static {
            Covode.recordClassIndex(6045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5450a(AbstractC5449a aVar) {
            super(1);
            this.f14020a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f14020a.mo11257a(bool.booleanValue());
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC5449a(DataChannel dataChannel) {
        super(dataChannel);
        C89219l.m154721d(dataChannel, "");
    }

    /* renamed from: a */
    public final void mo11257a(boolean z) {
        C5631d f = mo11264f();
        if (f != null) {
            f.mo11412a(Boolean.valueOf(z));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: b */
    public final void mo11258b(boolean z) {
        super.mo11258b(z);
        C5631d f = mo11264f();
        if (f != null) {
            f.f14311c = z;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public void mo11256a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        super.mo11256a(viewGroup);
        mo11393k();
        this.f14261h.mo28312a(this, C5590c.class, new C5450a(this));
    }

    /* renamed from: a */
    public final void mo11255a(int i) {
        C4386c a = C4386c.m10499a();
        C89219l.m154716b(a, "");
        T t = a.f17248n;
        if (t == null || t.intValue() != 2) {
            if (!LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(C3966y.m9669e(), EnumC11229b.LINK_MIC);
                return;
            }
            C5713h.f14480b = "plus_button";
            this.f14261h.mo28320c(C5392h.class, new C5393i(i));
        }
    }
}
