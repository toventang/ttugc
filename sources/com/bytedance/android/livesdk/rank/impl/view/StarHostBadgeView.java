package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

public final class StarHostBadgeView extends LinearLayout {

    /* renamed from: a */
    private final AbstractC89244h f25519a;

    /* renamed from: b */
    private final AbstractC89244h f25520b;

    static {
        Covode.recordClassIndex(12154);
    }

    public StarHostBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final LiveTextView getBadgeView() {
        return (LiveTextView) this.f25519a.getValue();
    }

    private final LiveTextView getCountView() {
        return (LiveTextView) this.f25520b.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostBadgeView$a */
    static final class C10569a extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ StarHostBadgeView f25521a;

        static {
            Covode.recordClassIndex(12155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10569a(StarHostBadgeView starHostBadgeView) {
            super(0);
            this.f25521a = starHostBadgeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f25521a.findViewById(R.id.f6a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.StarHostBadgeView$b */
    static final class C10570b extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ StarHostBadgeView f25522a;

        static {
            Covode.recordClassIndex(12156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10570b(StarHostBadgeView starHostBadgeView) {
            super(0);
            this.f25522a = starHostBadgeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f25522a.findViewById(R.id.f46);
        }
    }

    private /* synthetic */ StarHostBadgeView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    private StarHostBadgeView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(46);
        this.f25519a = C11831d.m20835a(new C10569a(this));
        this.f25520b = C11831d.m20835a(new C10570b(this));
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bew, this, true);
        MethodCollector.m26664o(46);
    }

    /* renamed from: a */
    public final void mo17487a(int i, int i2, boolean z) {
        String str;
        String str2;
        int i3;
        LiveTextView badgeView = getBadgeView();
        String str3 = "#161823";
        if (z) {
            str = str3;
        } else {
            str = "#FFFFFF";
        }
        badgeView.setTextColor(Color.parseColor(str));
        LiveTextView countView = getCountView();
        if (!z) {
            str3 = "#E6FFFFFF";
        }
        countView.setTextColor(Color.parseColor(str3));
        LiveTextView countView2 = getCountView();
        if (!C3966y.m9672g()) {
            str2 = "x".concat(String.valueOf(i2));
        } else {
            str2 = String.valueOf(i2) + "x";
        }
        countView2.setText(str2);
        LiveTextView badgeView2 = getBadgeView();
        if (z) {
            if (i == 1) {
                i3 = R.drawable.bul;
            } else if (i != 2) {
                i3 = R.drawable.bup;
            } else {
                i3 = R.drawable.bun;
            }
        } else if (i == 1) {
            i3 = R.drawable.bum;
        } else if (i != 2) {
            i3 = R.drawable.buq;
        } else {
            i3 = R.drawable.buo;
        }
        badgeView2.setBackgroundResource(i3);
    }
}
