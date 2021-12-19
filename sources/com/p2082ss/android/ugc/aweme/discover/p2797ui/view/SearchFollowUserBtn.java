package com.p2082ss.android.ugc.aweme.discover.p2797ui.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.C0823h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.C17179a;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.C17182c;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.view.SearchFollowUserBtn */
public final class SearchFollowUserBtn extends FollowUserBtn {

    /* renamed from: a */
    public static final C42988a f100230a = new C42988a((byte) 0);

    static {
        Covode.recordClassIndex(51121);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.view.SearchFollowUserBtn$a */
    public static final class C42988a {
        static {
            Covode.recordClassIndex(51122);
        }

        private C42988a() {
        }

        public /* synthetic */ C42988a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    public final ViewGroup.LayoutParams getButtonLayoutParams() {
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        ViewGroup.LayoutParams layoutParams = niceWidthTextView.getLayoutParams();
        C89219l.m154716b(layoutParams, "");
        return layoutParams;
    }

    /* renamed from: a */
    private final void m85805a(int i) {
        if (this.f118351b != null) {
            C0823h.m2907a(this.f118351b, i);
            this.f118351b.setPadding(8, 0, 8, 0);
            this.f118351b.setFontType(C17303d.f41573g);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    public final void setButtonLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(layoutParams, "");
        this.f118355f = layoutParams.width;
        Class<?> cls = getClass();
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        C17179a.m31715a(cls, new C17179a.C17180a(mo27129a(niceWidthTextView)));
        NiceWidthTextView niceWidthTextView2 = this.f118351b;
        C89219l.m154716b(niceWidthTextView2, "");
        niceWidthTextView2.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.rebranding.AbstractC17181b, com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    /* renamed from: a */
    public final int mo27129a(TextView textView) {
        C89219l.m154721d(textView, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.string.bz9));
        arrayList.add(Integer.valueOf((int) R.string.baw));
        arrayList.add(Integer.valueOf((int) R.string.byz));
        arrayList.add(Integer.valueOf((int) R.string.bay));
        arrayList.add(Integer.valueOf((int) R.string.bxw));
        int a = C17182c.m31717a(textView, arrayList, (int) C13628n.m24520b(getContext(), 106.0f), (int) C13628n.m24520b(getContext(), 106.0f));
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
            if (paint.measureText(getContext().getString(R.string.bxw)) >= 90.0f) {
                m85805a(R.style.xu);
                return;
            }
            return;
        }
        super.setFollowButtonTextAndIcon(i);
        m85805a(R.style.y2);
    }

    public SearchFollowUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn, com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo73175a(int i, int i2) {
        m85805a(R.style.y2);
        super.mo73175a(i, i2);
    }
}
