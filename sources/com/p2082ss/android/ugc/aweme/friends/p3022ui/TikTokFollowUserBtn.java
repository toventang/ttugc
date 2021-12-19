package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.utils.C80552hu;
import com.p2082ss.android.ugc.aweme.utils.p4204e.C80369a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.TikTokFollowUserBtn */
public final class TikTokFollowUserBtn extends FansFollowUserBtn {

    /* renamed from: i */
    public static final C51671a f119110i = new C51671a((byte) 0);

    /* renamed from: m */
    private static final int f119111m = ((int) C13628n.m24520b(C17867d.m33078a(), 12.0f));

    /* renamed from: h */
    public boolean f119112h = m95704b();

    /* renamed from: j */
    private int f119113j = 14;

    /* renamed from: k */
    private int f119114k = 10;

    /* renamed from: l */
    private int f119115l = f119111m;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.TikTokFollowUserBtn$a */
    public static final class C51671a {
        static {
            Covode.recordClassIndex(61034);
        }

        private C51671a() {
        }

        public /* synthetic */ C51671a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.FansFollowUserBtn, com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    /* renamed from: a */
    public final void mo86692a() {
        setDoubleFollowButtonText(null);
    }

    static {
        Covode.recordClassIndex(61033);
    }

    public final void setMaxTextSize(int i) {
        this.f119113j = i;
    }

    public final void setMinTextSize(int i) {
        this.f119114k = i;
    }

    /* renamed from: a */
    private static /* synthetic */ void m96382a(TikTokFollowUserBtn tikTokFollowUserBtn) {
        tikTokFollowUserBtn.m96383b(C80369a.m139345a(tikTokFollowUserBtn.getContext()));
    }

    public final void setButtonHorizontalPadding(int i) {
        this.f119115l = (int) C13628n.m24520b(C17867d.m33078a(), (float) i);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    public final void setFollowStatus(int i) {
        super.setFollowStatus(i);
        m96382a(this);
        mo86694b(getVerticalOutsidePadding(), getVerticalOutsidePadding());
    }

    /* renamed from: b */
    private void m96383b(int i) {
        if (this.f118351b != null) {
            NiceWidthTextView niceWidthTextView = this.f118351b;
            int i2 = this.f119115l;
            niceWidthTextView.setPadding(i2, 0, i2, 0);
            NiceWidthTextView niceWidthTextView2 = this.f118351b;
            C89219l.m154716b(niceWidthTextView2, "");
            C80552hu.m139635a(niceWidthTextView2, this.f119114k, this.f119113j, i);
            this.f118351b.setFontType(C17303d.f41573g);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    public final void setFollowButtonTextAndIcon(int i) {
        if (i != 1) {
            super.setFollowButtonTextAndIcon(i);
        } else if (getResources() != null) {
            NiceWidthTextView niceWidthTextView = this.f118351b;
            C89219l.m154716b(niceWidthTextView, "");
            niceWidthTextView.setText(getResources().getText(R.string.bxw));
        } else {
            return;
        }
        m96382a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r1 == null) goto L_0x0039;
     */
    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setDoubleFollowButtonText(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = r4.f119112h
            if (r0 == 0) goto L_0x0047
            if (r5 == 0) goto L_0x0045
            java.lang.Long r0 = p4600h.p4622m.C89361p.m154865g(r5)
        L_0x000a:
            r3 = 2131825818(0x7f11149a, float:1.9284503E38)
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0025
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = r0.getString(r3)
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r2)
        L_0x001c:
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r4.f118351b
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)
            r0.setText(r1)
            return
        L_0x0025:
            r0 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r0)
            if (r1 == 0) goto L_0x0039
            android.content.Context r0 = r4.getContext()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)
            java.lang.String r1 = r1.getEntranceButtonText(r0, r5)
            if (r1 != 0) goto L_0x001c
        L_0x0039:
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = r0.getString(r3)
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r2)
            goto L_0x001c
        L_0x0045:
            r0 = 0
            goto L_0x000a
        L_0x0047:
            super.mo86692a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3022ui.TikTokFollowUserBtn.setDoubleFollowButtonText(java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TikTokFollowUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }
}
