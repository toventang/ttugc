package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.widget.AbstractC0817b;
import androidx.core.widget.C0823h;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.C17179a;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.C17182c;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.NiceWidthTextView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn */
public class FansFollowUserBtn extends FollowUserBtn {

    /* renamed from: g */
    public static final C51660a f119018g = new C51660a((byte) 0);

    /* renamed from: a */
    public boolean f119019a;

    /* renamed from: h */
    private final AbstractC89244h f119020h = C89250i.m154773a((AbstractC89171a) new C51662c(this));

    /* renamed from: i */
    private final AbstractC89244h f119021i = C89250i.m154773a((AbstractC89171a) new C51661b(this));

    /* renamed from: j */
    private final AbstractC89244h f119022j = C89250i.m154773a((AbstractC89171a) C51663d.f119027a);

    /* renamed from: k */
    private float f119023k = 64.0f;

    /* renamed from: l */
    private int f119024l = R.drawable.vc;

    static {
        Covode.recordClassIndex(61015);
    }

    private final int getHorizontalWidthForFour() {
        return ((Number) this.f119021i.getValue()).intValue();
    }

    private final int getHorizontalWidthForTwo() {
        return ((Number) this.f119020h.getValue()).intValue();
    }

    public int getFollowButtonTextColorRes() {
        return R.color.bx;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    public int getLayout() {
        return R.layout.mp;
    }

    /* access modifiers changed from: protected */
    public final int getVerticalOutsidePadding() {
        return ((Number) this.f119022j.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn$a */
    public static final class C51660a {
        static {
            Covode.recordClassIndex(61016);
        }

        private C51660a() {
        }

        public /* synthetic */ C51660a(byte b) {
            this();
        }
    }

    public float getDefaultWidth() {
        return this.f119023k;
    }

    public final int getMaxWidth() {
        return this.f118355f;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn$b */
    static final class C51661b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ FansFollowUserBtn f119025a;

        static {
            Covode.recordClassIndex(61017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51661b(FansFollowUserBtn fansFollowUserBtn) {
            super(0);
            this.f119025a = fansFollowUserBtn;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f119025a.mo87377a(4));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn$c */
    static final class C51662c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ FansFollowUserBtn f119026a;

        static {
            Covode.recordClassIndex(61018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51662c(FansFollowUserBtn fansFollowUserBtn) {
            super(0);
            this.f119026a = fansFollowUserBtn;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f119026a.mo87377a(2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn$d */
    static final class C51663d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C51663d f119027a = new C51663d();

        static {
            Covode.recordClassIndex(61019);
        }

        C51663d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C34728n.m70946a(4.0d));
        }
    }

    public final int getDefaultMeasureNiceWidth() {
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        return mo27129a(niceWidthTextView);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    /* renamed from: a */
    public void mo86692a() {
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        niceWidthTextView.setText(getResources().getText(R.string.baw));
    }

    public final void setClickedBgResId(int i) {
        this.f119024l = i;
    }

    public void setDefaultWidth(float f) {
        this.f119023k = f;
    }

    public final void setForceDark(boolean z) {
        this.f119019a = z;
    }

    public final void setTypeAppearance(int i) {
        C0823h.m2907a(this.f118351b, i);
    }

    public final void setFontType(String str) {
        C89219l.m154721d(str, "");
        this.f118351b.setFontType(str);
    }

    public final void setTextSize(float f) {
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        niceWidthTextView.setTextSize(f);
    }

    public final void setTypeface(Typeface typeface) {
        C89219l.m154721d(typeface, "");
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        niceWidthTextView.setTypeface(typeface);
    }

    public final void setAutoSize(int[] iArr) {
        C89219l.m154721d(iArr, "");
        NiceWidthTextView niceWidthTextView = this.f118351b;
        if (Build.VERSION.SDK_INT >= 27) {
            niceWidthTextView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 2);
        } else if (niceWidthTextView instanceof AbstractC0817b) {
            niceWidthTextView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 2);
        }
    }

    /* renamed from: a */
    public final int mo87377a(int i) {
        float b = C13628n.m24520b(getContext(), getDefaultWidth());
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        return (int) Math.max(0.0f, ((b - niceWidthTextView.getPaint().measureText(C89361p.m154867a((CharSequence) "-", i))) - C13628n.m24520b(getContext(), 14.0f)) / 2.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    public void setText(String str) {
        C89219l.m154721d(str, "");
        setVisibility(0);
        setFollowButtonStyle(-1);
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        niceWidthTextView.setText(str);
        this.f118351b.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
        NiceWidthTextView niceWidthTextView2 = this.f118351b;
        C89219l.m154716b(niceWidthTextView2, "");
        niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.vc));
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
        int a = C17182c.m31717a(textView, arrayList, (int) C13628n.m24520b(getContext(), getDefaultWidth()), (int) C13628n.m24520b(getContext(), getDefaultWidth()));
        if (a > this.f118355f) {
            return a;
        }
        return this.f118355f;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    public void setFollowButtonStyle(int i) {
        if (i == -1) {
            this.f118351b.setPadding(0, 0, 0, 0);
            NiceWidthTextView niceWidthTextView = this.f118351b;
            C89219l.m154716b(niceWidthTextView, "");
            niceWidthTextView.setGravity(17);
            this.f118351b.setCompoundDrawables(null, null, null, null);
            return;
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        Drawable drawable = context.getResources().getDrawable(i);
        C89219l.m154716b(drawable, "");
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f118351b.setPadding(mo86691a(drawable), 0, 0, 0);
        this.f118351b.setCompoundDrawables(drawable, null, null, null);
        NiceWidthTextView niceWidthTextView2 = this.f118351b;
        C89219l.m154716b(niceWidthTextView2, "");
        niceWidthTextView2.setGravity(16);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Class<?> cls = getClass();
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        C17179a.m31715a(cls, new C17179a.C17180a(mo27129a(niceWidthTextView)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FansFollowUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn
    /* renamed from: a */
    public final void mo86693a(Context context, AttributeSet attributeSet) {
        this.f118351b = (NiceWidthTextView) C1764a.m5927a(LayoutInflater.from(context), getLayout(), this, true).findViewById(R.id.xn);
        this.f118351b.f40923a = this;
        this.f118352c = 0;
        NiceWidthTextView niceWidthTextView = this.f118351b;
        C89219l.m154716b(niceWidthTextView, "");
        niceWidthTextView.setCompoundDrawablePadding((int) C13628n.m24520b(context, 2.0f));
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn, com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo73175a(int i, int i2) {
        setVisibility(0);
        if (i == 0) {
            setFollowButtonTextAndIcon(i2);
            this.f118351b.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
            NiceWidthTextView niceWidthTextView = this.f118351b;
            C89219l.m154716b(niceWidthTextView, "");
            niceWidthTextView.setBackground(getResources().getDrawable(R.drawable.b0u));
        } else if (i == 1) {
            setFollowButtonStyle(-1);
            NiceWidthTextView niceWidthTextView2 = this.f118351b;
            C89219l.m154716b(niceWidthTextView2, "");
            niceWidthTextView2.setText(getResources().getText(R.string.bz9));
            if (this.f119019a) {
                this.f118351b.setTextColor(C0643b.m2378c(getContext(), R.color.a_));
                NiceWidthTextView niceWidthTextView3 = this.f118351b;
                C89219l.m154716b(niceWidthTextView3, "");
                niceWidthTextView3.setBackground(getResources().getDrawable(R.drawable.ve));
            } else {
                this.f118351b.setTextColor(getResources().getColor(getFollowButtonTextColorRes()));
                NiceWidthTextView niceWidthTextView4 = this.f118351b;
                C89219l.m154716b(niceWidthTextView4, "");
                niceWidthTextView4.setBackground(getResources().getDrawable(R.drawable.vc));
            }
        } else if (i == 2) {
            setFollowButtonStyle(-1);
            mo86692a();
            this.f118351b.setTextColor(getResources().getColor(getFollowButtonTextColorRes()));
            NiceWidthTextView niceWidthTextView5 = this.f118351b;
            C89219l.m154716b(niceWidthTextView5, "");
            niceWidthTextView5.setBackground(getResources().getDrawable(this.f119024l));
        } else if (i == 3) {
            setVisibility(8);
        } else if (i == 4) {
            setFollowButtonStyle(-1);
            NiceWidthTextView niceWidthTextView6 = this.f118351b;
            C89219l.m154716b(niceWidthTextView6, "");
            niceWidthTextView6.setText(getResources().getText(R.string.byz));
            this.f118351b.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
            NiceWidthTextView niceWidthTextView7 = this.f118351b;
            C89219l.m154716b(niceWidthTextView7, "");
            niceWidthTextView7.setBackground(getResources().getDrawable(this.f119024l));
        }
        this.f118352c = i;
        mo86694b(getVerticalOutsidePadding(), getVerticalOutsidePadding());
    }
}
