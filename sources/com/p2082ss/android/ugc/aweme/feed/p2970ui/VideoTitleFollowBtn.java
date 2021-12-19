package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn;
import com.p2082ss.android.ugc.aweme.utils.C80552hu;
import com.p2082ss.android.ugc.aweme.utils.p4204e.C80369a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoTitleFollowBtn */
public final class VideoTitleFollowBtn extends FollowUserBtn {

    /* renamed from: a */
    public static final C50031a f115486a = new C50031a((byte) 0);

    /* renamed from: g */
    private int f115487g = 14;

    /* renamed from: h */
    private int f115488h = 10;

    static {
        Covode.recordClassIndex(59156);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoTitleFollowBtn$a */
    public static final class C50031a {
        static {
            Covode.recordClassIndex(59157);
        }

        private C50031a() {
        }

        public /* synthetic */ C50031a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m93924a(VideoTitleFollowBtn videoTitleFollowBtn) {
        videoTitleFollowBtn.m93923a(C80369a.m139345a(videoTitleFollowBtn.getContext()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoTitleFollowBtn(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        this.f118354e = mo27129a(this.f118351b);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.rebranding.AbstractC17181b, com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    /* renamed from: a */
    public final int mo27129a(TextView textView) {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return C89241a.m154730a(TypedValue.applyDimension(1, 88.0f, system.getDisplayMetrics()));
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
        m93924a(this);
    }

    /* renamed from: a */
    private void m93923a(int i) {
        if (this.f118351b != null) {
            NiceWidthTextView niceWidthTextView = this.f118351b;
            C89219l.m154716b(niceWidthTextView, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            C23163i.m43660a((View) niceWidthTextView, valueOf, (Integer) null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()))), (Integer) null, false, 16);
            NiceWidthTextView niceWidthTextView2 = this.f118351b;
            C89219l.m154716b(niceWidthTextView2, "");
            C80552hu.m139635a(niceWidthTextView2, this.f115488h, this.f115487g, i);
            this.f118351b.setFontType(C17303d.f41573g);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoTitleFollowBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        this.f118354e = mo27129a(this.f118351b);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn, com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo73175a(int i, int i2) {
        super.mo73175a(i, i2);
        if (i == 1 || i == 2) {
            this.f118351b.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
            this.f118351b.setBackground(getResources().getDrawable(R.drawable.uk));
        }
        m93924a(this);
    }
}
