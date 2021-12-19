package com.p2082ss.android.ugc.aweme.friends.invite;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.widget.C0823h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.C17182c;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.I18nFollowAndInviteUserBtn */
public final class I18nFollowAndInviteUserBtn extends FollowUserBtn {

    /* renamed from: g */
    public static final C51537a f118777g = new C51537a((byte) 0);

    /* renamed from: a */
    public boolean f118778a = m95704b();

    static {
        Covode.recordClassIndex(60802);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.I18nFollowAndInviteUserBtn$a */
    public static final class C51537a {
        static {
            Covode.recordClassIndex(60803);
        }

        private C51537a() {
        }

        public /* synthetic */ C51537a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    /* renamed from: a */
    public final void mo86692a() {
        if (this.f118778a) {
            NiceWidthTextView niceWidthTextView = this.f118351b;
            C89219l.m154716b(niceWidthTextView, "");
            niceWidthTextView.setText(getResources().getText(R.string.d2m));
            return;
        }
        super.mo86692a();
    }

    /* renamed from: d */
    public final void mo87034d() {
        setVisibility(0);
        this.f118351b.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        niceWidthTextView.setText(getResources().getString(R.string.cnk));
        NiceWidthTextView niceWidthTextView2 = this.f118351b;
        C89219l.m154716b(niceWidthTextView2, "");
        niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.a9m));
        this.f118352c = 1000;
    }

    /* renamed from: e */
    public final void mo87035e() {
        setVisibility(0);
        this.f118351b.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        niceWidthTextView.setText(getResources().getString(R.string.cnt));
        NiceWidthTextView niceWidthTextView2 = this.f118351b;
        C89219l.m154716b(niceWidthTextView2, "");
        niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.b0v));
        this.f118352c = 1001;
    }

    public final void setShowMessage(boolean z) {
        this.f118778a = z;
    }

    /* renamed from: a */
    private final void m96016a(int i) {
        if (this.f118351b != null) {
            C0823h.m2907a(this.f118351b, i);
            this.f118351b.setPadding(8, 0, 8, 0);
            this.f118351b.setFontType(C17303d.f41573g);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.rebranding.AbstractC17181b, com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    /* renamed from: a */
    public final int mo27129a(TextView textView) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.string.bz9));
        arrayList.add(Integer.valueOf((int) R.string.baw));
        arrayList.add(Integer.valueOf((int) R.string.byz));
        arrayList.add(Integer.valueOf((int) R.string.bay));
        arrayList.add(Integer.valueOf((int) R.string.bxw));
        int a = C17182c.m31717a(textView, arrayList, (int) C13628n.m24520b(getContext(), 64.0f), (int) C13628n.m24520b(getContext(), 120.0f));
        if (a > this.f118355f) {
            return a;
        }
        return this.f118355f;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    public final void setFollowButtonTextAndIcon(int i) {
        if (i == 1) {
            NiceWidthTextView niceWidthTextView = this.f118351b;
            C89219l.m154716b(niceWidthTextView, "");
            niceWidthTextView.setText(getResources().getText(R.string.bxw));
            Paint paint = new Paint();
            paint.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            if (paint.measureText(getContext().getString(R.string.bxw)) >= 110.0f) {
                m96016a(R.style.xu);
                return;
            }
            return;
        }
        super.setFollowButtonTextAndIcon(i);
        m96016a(R.style.y0);
    }

    public I18nFollowAndInviteUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn, com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo73175a(int i, int i2) {
        m96016a(R.style.y0);
        super.mo73175a(i, i2);
    }
}
