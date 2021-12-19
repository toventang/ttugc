package com.bytedance.android.livesdk.dialogv2.p517c;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.gift.p548d.C8802f;
import com.bytedance.android.livesdk.gift.p548d.C8805i;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.c.e */
public final class C8371e extends C8350a {

    /* renamed from: l */
    private final View f20703l;

    static {
        Covode.recordClassIndex(9209);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: a */
    public final void mo14680a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: d */
    public final void mo14685d() {
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: f */
    public final void mo14687f() {
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: g */
    public final void mo14688g() {
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: h */
    public final void mo14689h() {
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.e$b */
    public static final class C8373b implements C3951p.AbstractC3953a {
        static {
            Covode.recordClassIndex(9211);
        }

        C8373b() {
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9301a(ImageModel imageModel) {
            C3854a.m9456a("onLoadStarted");
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9303a(ImageModel imageModel, Exception exc) {
            C3854a.m9456a("onLoadFailed");
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9302a(ImageModel imageModel, int i, int i2) {
            C3854a.m9456a("onLoadSuccess");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.e$a */
    static final class C8372a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DataChannel f20704a;

        static {
            Covode.recordClassIndex(9210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8372a(DataChannel dataChannel) {
            super(1);
            this.f20704a = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            DataChannel dataChannel = this.f20704a;
            if (dataChannel != null) {
                dataChannel.mo28320c(C8802f.class, new C8805i("gift"));
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8371e(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f20703l = view;
        this.f20649b = (LiveTextView) view.findViewById(R.id.crv);
        this.f20650c = (HSImageView) view.findViewById(R.id.cru);
        LiveTextView liveTextView = this.f20649b;
        if (liveTextView != null) {
            liveTextView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: a */
    public final void mo14681a(AbstractC8812b<? extends C9543b> bVar, int i, DataChannel dataChannel) {
        ImageModel imageModel;
        String str;
        C11279p.m20007a(this.f20703l, new C8372a(dataChannel));
        LiveTextView liveTextView = this.f20649b;
        if (liveTextView != null) {
            if (bVar == null || (str = bVar.mo14673a()) == null) {
                str = "";
            }
            liveTextView.setText(str);
        }
        HSImageView hSImageView = this.f20650c;
        if (bVar != null) {
            imageModel = bVar.mo14675c();
        } else {
            imageModel = null;
        }
        C3951p.m9627a(hSImageView, imageModel, 2131234646, new C8373b());
    }
}
