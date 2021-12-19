package com.bytedance.android.livesdk.olddialog.giftpanellist.p601c;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8811a;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.service.p625c.p626a.C10703a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.g */
public final class C10027g extends AbstractC10019b {

    /* renamed from: a */
    ImageView f24362a = ((ImageView) this.f24349m.findViewById(R.id.b_w));

    /* renamed from: b */
    private LiveTextView f24363b = ((LiveTextView) this.f24349m.findViewById(R.id.crt));

    /* renamed from: c */
    private ImageView f24364c = ((ImageView) this.f24349m.findViewById(R.id.a7c));

    static {
        Covode.recordClassIndex(11581);
    }

    /* renamed from: a */
    public final void mo16855a() {
        if (!mo16841e()) {
            this.f24344h.postDelayed(new RunnableC10030i(this), 50);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: b */
    public final void mo16838b() {
        super.mo16838b();
        this.f24362a.setVisibility(0);
        if (!mo16841e()) {
            this.f24344h.setVisibility(8);
        }
        this.f24343g.setVisibility(8);
        this.f24363b.setTextColor(C3966y.m9663b((int) R.color.xd));
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: c */
    public final void mo16839c() {
        super.mo16839c();
        this.f24344h.setVisibility(0);
        this.f24362a.setVisibility(8);
        this.f24343g.setVisibility(0);
        this.f24363b.setTextColor(C3966y.m9663b((int) R.color.xc));
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: e */
    public final boolean mo16841e() {
        ImageModel imageModel;
        if (this.f24346j == null || !(this.f24346j.f21695b instanceof C9904t) || (imageModel = ((C9904t) this.f24346j.f21695b).f24011p) == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: d */
    public final void mo16840d() {
        if (this.f24346j.f21695b instanceof C9904t) {
            C9904t tVar = (C9904t) this.f24346j.f21695b;
            ImageModel imageModel = tVar.f24011p;
            if (mo16841e()) {
                final long j = tVar.f23999d;
                final boolean z = false;
                try {
                    z = C3941k.m9612a(Uri.parse(imageModel.mUrls.get(0)));
                } catch (Exception unused) {
                }
                C3951p.m9626a(this.f24362a, imageModel, -1, -1, true, R.drawable.c5_, new C3951p.AbstractC3953a() {
                    /* class com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.C10027g.C100281 */

                    static {
                        Covode.recordClassIndex(11582);
                    }

                    @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                    /* renamed from: a */
                    public final void mo9301a(ImageModel imageModel) {
                        C10703a.C10704a.C10705a.f25783a.mo17631a(j, C10027g.this.f24354r);
                    }

                    @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                    /* renamed from: a */
                    public final void mo9303a(ImageModel imageModel, Exception exc) {
                        String str;
                        if (exc.getMessage() != null) {
                            str = exc.getMessage();
                        } else {
                            str = "Download Error";
                        }
                        C10703a.m19271a(j, str);
                    }

                    @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                    /* renamed from: a */
                    public final void mo9302a(ImageModel imageModel, int i, int i2) {
                        if (C10027g.this.f24347k != null && C10027g.this.f24347k.mo16816a() == C10027g.this.f24346j) {
                            C10027g.this.f24344h.setVisibility(8);
                        }
                        C10703a.C10704a.C10705a.f25783a.mo17632a(j, z);
                    }
                });
            } else {
                C3951p.m9630b(this.f24362a, tVar.f23997b);
            }
        }
        super.mo16840d();
    }

    public C10027g(View view) {
        super(view);
        this.f24363b.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: a */
    public final void mo16836a(AbstractC8812b bVar, int i) {
        super.mo16836a(bVar, i);
        this.f24362a.setVisibility(8);
        if (this.f24347k != null) {
            if (this.f24347k.mo16816a() == this.f24346j) {
                this.f24344h.setVisibility(8);
                this.f24362a.setVisibility(0);
            }
            if (this.f24347k.mo16825b(this.f24346j.mo14676d()) && !mo16841e()) {
                this.f24344h.postDelayed(new RunnableC10029h(this), 50);
            }
        }
        this.f24364c.setVisibility(0);
        this.f24363b.setText(C3966y.m9660a((int) R.string.gnv, String.valueOf(((AbstractC8811a) this.f24346j).mo14677e())));
    }
}
