package com.bytedance.android.livesdk.olddialog.giftpanellist.p601c;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.m */
public final class C10035m extends AbstractC10019b {

    /* renamed from: a */
    public final AbstractC10037n f24375a;

    /* renamed from: b */
    private final View f24376b;

    static {
        Covode.recordClassIndex(11589);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: a */
    public final void mo16847a(long j) {
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: a */
    public final void mo16837a(AbstractC10019b.AbstractC10022a aVar) {
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: b */
    public final void mo16838b() {
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: b */
    public final void mo16849b(long j) {
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: c */
    public final void mo16839c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: d */
    public final void mo16840d() {
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: h */
    public final void mo16851h() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: g */
    public final void mo16850g() {
        this.f24343g = (LiveTextView) this.f24349m.findViewById(R.id.crv);
        LiveTextView liveTextView = this.f24343g;
        C89219l.m154716b(liveTextView, "");
        liveTextView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        this.f24344h = (HSImageView) this.f24349m.findViewById(R.id.cru);
        HSImageView hSImageView = this.f24344h;
        C89219l.m154716b(hSImageView, "");
        hSImageView.setVisibility(0);
    }

    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.m$a */
    static final class C10036a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10035m f24377a;

        static {
            Covode.recordClassIndex(11590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10036a(C10035m mVar) {
            super(1);
            this.f24377a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            this.f24377a.f24375a.mo16828a();
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10035m(View view, AbstractC10037n nVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(nVar, "");
        this.f24376b = view;
        this.f24375a = nVar;
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: a */
    public final void mo16836a(AbstractC8812b<?> bVar, int i) {
        ImageModel imageModel;
        String str;
        C11279p.m20007a(this.f24376b, new C10036a(this));
        LiveTextView liveTextView = this.f24343g;
        if (liveTextView != null) {
            if (bVar == null || (str = bVar.mo14673a()) == null) {
                str = "";
            }
            liveTextView.setText(str);
        }
        HSImageView hSImageView = this.f24344h;
        if (bVar != null) {
            imageModel = bVar.mo14675c();
        } else {
            imageModel = null;
        }
        C3951p.m9622a(hSImageView, imageModel, 2131234646);
    }
}
