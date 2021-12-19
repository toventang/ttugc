package com.p2082ss.android.ugc.aweme.feed;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C0823h;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarBorderView;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.AvatarImageWithLive */
public class AvatarImageWithLive extends RelativeLayout {

    /* renamed from: a */
    private SmartAvatarBorderView f111234a;

    /* renamed from: b */
    private TextView f111235b;

    static {
        Covode.recordClassIndex(56736);
    }

    public SmartAvatarBorderView getAvatarImageView() {
        return this.f111234a;
    }

    private RelativeLayout.LayoutParams getAvatarLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* renamed from: a */
    private String m91014a() {
        try {
            return LiveOuterService.m107269s().mo95830d().mo13037r().mo12968a(this.f111235b.getContext());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m91016b() {
        try {
            return LiveOuterService.m107269s().mo95830d().mo13038s().mo13045a();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private void m91017c() {
        String str;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "homepage_hot");
            if ("LIVE".equals(m91014a())) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_english", str);
            LiveOuterService.m107269s().mo95830d().mo13037r().mo12969a("livesdk_live_show_language", hashMap);
        } catch (Exception unused) {
        }
    }

    private RelativeLayout.LayoutParams getLiveLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m91013a(29), m91013a(12));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        layoutParams.topMargin = m91013a(1);
        return layoutParams;
    }

    public AvatarImageWithLive(Context context) {
        this(context, null);
    }

    public void setBorderColor(int i) {
        SmartAvatarBorderView smartAvatarBorderView = this.f111234a;
        if (smartAvatarBorderView != null) {
            smartAvatarBorderView.setBorderColor(i);
        }
    }

    /* renamed from: a */
    private int m91013a(int i) {
        return (int) C13628n.m24520b(getContext(), (float) i);
    }

    /* renamed from: a */
    public final void mo80035a(boolean z) {
        if (!z) {
            this.f111235b.setVisibility(8);
            LivePerformanceManager.getInstance().resetInitValue();
            return;
        }
        this.f111235b.setVisibility(0);
        try {
            if (m91016b()) {
                m91015b(true);
                this.f111235b.setBackgroundResource(2131233199);
            } else {
                m91015b(false);
                this.f111235b.setBackgroundResource(2131231736);
            }
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
        C6204h.m13476a(RunnableC49268b.f113254a);
    }

    /* renamed from: b */
    private void m91015b(boolean z) {
        if (z) {
            this.f111235b.setText(m91014a());
            this.f111235b.setTextColor(-1);
            this.f111235b.setMaxLines(1);
            this.f111235b.setEllipsize(TextUtils.TruncateAt.END);
            this.f111235b.setPadding(m91013a(2), 0, m91013a(2), 0);
            this.f111235b.setGravity(17);
            C0823h.m2911b(this.f111235b, 1);
            C0823h.m2908a(this.f111235b, 6, 9, 1, 2);
            m91017c();
            return;
        }
        C0823h.m2911b(this.f111235b, 0);
        this.f111235b.setText("");
    }

    public AvatarImageWithLive(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AvatarImageWithLive(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(4102);
        SmartAvatarBorderView smartAvatarBorderView = new SmartAvatarBorderView(getContext());
        this.f111234a = smartAvatarBorderView;
        ((C24246a) smartAvatarBorderView.getHierarchy()).mo39954a(R.color.j, C24229q.AbstractC24231b.f57458h);
        addView(this.f111234a, getAvatarLayoutParams());
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f111235b = appCompatTextView;
        appCompatTextView.setVisibility(8);
        addView(this.f111235b, getLiveLayoutParams());
        MethodCollector.m26664o(4102);
    }
}
