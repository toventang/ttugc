package com.p2082ss.android.ugc.aweme.following.p3003ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityC0580d;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.AbstractC17181b;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.C17179a;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.C17182c;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.NiceWidthTextView;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn */
public class FollowUserBtn extends RelativeLayout implements AbstractC17181b, AbstractC51346a {

    /* renamed from: a */
    private boolean f118350a;

    /* renamed from: b */
    protected NiceWidthTextView f118351b;

    /* renamed from: c */
    protected int f118352c;

    /* renamed from: d */
    protected int f118353d;

    /* renamed from: e */
    protected int f118354e;

    /* renamed from: f */
    public int f118355f;

    static {
        Covode.recordClassIndex(60548);
    }

    /* access modifiers changed from: protected */
    public int getFollowedTextColorResId() {
        return R.color.bx;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        return R.layout.mo;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowBgResId() {
        return R.drawable.b0u;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowTextColorResId() {
        return R.color.a9;
    }

    /* renamed from: c */
    public void mo86695c() {
        this.f118351b.setFontDefinition(52);
    }

    public ViewGroup.LayoutParams getButtonLayoutParams() {
        return this.f118351b.getLayoutParams();
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    public AbstractC1204m getLifeCycleOwner() {
        return (ActivityC0580d) C34729o.m70962d(this);
    }

    /* renamed from: b */
    public static boolean m95704b() {
        if (!IMUnder16ProxyImpl.m102047n().mo93022d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int getFollowedBgResId() {
        if (this.f118350a) {
            return R.drawable.vd;
        }
        return R.drawable.b0w;
    }

    /* renamed from: a */
    public void mo86692a() {
        this.f118351b.setText(getResources().getText(R.string.baw));
    }

    public void setForceDarkMode(boolean z) {
        this.f118350a = z;
    }

    public FollowUserBtn(Context context) {
        this(context, null);
    }

    public void setForceWidth(int i) {
        if (this.f118353d != i) {
            this.f118353d = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f118351b.setOnClickListener(onClickListener);
    }

    public void setFollowStatus(int i) {
        if (this.f118352c != i) {
            mo73175a(i, -1);
        }
    }

    public void setButtonLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.f118355f = layoutParams.width;
        C17179a.m31715a(getClass(), new C17179a.C17180a(mo27129a(this.f118351b)));
        this.f118351b.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void setDoubleFollowButtonText(String str) {
        this.f118351b.setText(getResources().getText(R.string.baw));
    }

    public void setFollowButtonTextAndIcon(int i) {
        this.f118351b.setText(getResources().getText(R.string.bxs));
        setFollowButtonStyle(-1);
    }

    public void setText(String str) {
        setVisibility(0);
        setFollowButtonStyle(-1);
        this.f118351b.setText(str);
        this.f118351b.setTextColor(getResources().getColor(getUnFollowTextColorResId()));
        this.f118351b.setBackground(getResources().getDrawable(getUnFollowBgResId()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo86691a(Drawable drawable) {
        NiceWidthTextView niceWidthTextView = this.f118351b;
        int i = 0;
        if (niceWidthTextView == null || TextUtils.isEmpty(niceWidthTextView.getText())) {
            return 0;
        }
        TextPaint paint = this.f118351b.getPaint();
        Rect rect = new Rect();
        paint.getTextBounds(this.f118351b.getText().toString(), 0, this.f118351b.getText().toString().length(), rect);
        int width = rect.width();
        if (this.f118354e == 0) {
            this.f118354e = mo27129a(this.f118351b);
        }
        int i2 = this.f118354e;
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        }
        return (int) ((((float) ((i2 - width) - i)) - C13628n.m24520b(getContext(), 4.0f)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    public void setFollowButtonStyle(int i) {
        if (i == -1) {
            this.f118351b.setPadding(0, 0, 0, 0);
            this.f118351b.setGravity(17);
            this.f118351b.setCompoundDrawables(null, null, null, null);
            return;
        }
        Drawable drawable = getContext().getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f118351b.setPadding(mo86691a(drawable), 0, 0, 0);
        this.f118351b.setCompoundDrawables(drawable, null, null, null);
        this.f118351b.setGravity(16);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.rebranding.AbstractC17181b
    /* renamed from: a */
    public int mo27129a(TextView textView) {
        int i = this.f118353d;
        if (i != -1) {
            return i;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.string.bz9));
        arrayList.add(Integer.valueOf((int) R.string.baw));
        arrayList.add(Integer.valueOf((int) R.string.byz));
        arrayList.add(Integer.valueOf((int) R.string.bay));
        arrayList.add(Integer.valueOf((int) R.string.bxw));
        return C17182c.m31717a(textView, arrayList, (int) C13628n.m24520b(getContext(), 60.0f), (int) C13628n.m24520b(getContext(), 120.0f));
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public void mo73175a(int i, int i2) {
        mo86406a(i, i2, null);
    }

    public FollowUserBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86694b(final int i, final int i2) {
        post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn.RunnableC513441 */

            /* renamed from: a */
            final /* synthetic */ int f118356a = 0;

            /* renamed from: b */
            final /* synthetic */ int f118357b = 0;

            static {
                Covode.recordClassIndex(60549);
            }

            public final void run() {
                Rect rect = new Rect();
                FollowUserBtn.this.getHitRect(rect);
                rect.left -= this.f118356a;
                rect.right += this.f118357b;
                rect.top -= i;
                rect.bottom += i2;
                ((View) FollowUserBtn.this.getParent()).setTouchDelegate(new TouchDelegate(rect, FollowUserBtn.this));
            }
        });
    }

    /* renamed from: a */
    public void mo86693a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ut});
        this.f118353d = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        obtainStyledAttributes.recycle();
        NiceWidthTextView niceWidthTextView = (NiceWidthTextView) C1862a.m6032a(context, getLayout(), this, true).findViewById(R.id.xn);
        this.f118351b = niceWidthTextView;
        niceWidthTextView.f40923a = this;
        this.f118354e = mo27129a(this.f118351b);
        C17179a.m31715a(getClass(), new C17179a.C17180a(mo27129a(this.f118351b)));
        this.f118352c = 0;
    }

    public FollowUserBtn(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(6650);
        this.f118353d = -1;
        mo86693a(context, attributeSet);
        MethodCollector.m26664o(6650);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public void mo86406a(int i, int i2, String str) {
        int followedBgResId = getFollowedBgResId();
        setVisibility(0);
        if (i == 0) {
            if (i2 != -1) {
                setFollowButtonTextAndIcon(i2);
            }
            this.f118351b.setTextColor(getResources().getColor(getUnFollowTextColorResId()));
            this.f118351b.setBackground(getResources().getDrawable(getUnFollowBgResId()));
        } else if (i == 1) {
            if (i2 != -1) {
                setFollowButtonStyle(-1);
            }
            this.f118351b.setText(getResources().getText(R.string.bz9));
            this.f118351b.setTextColor(getResources().getColor(getFollowedTextColorResId()));
            this.f118351b.setBackground(getResources().getDrawable(followedBgResId));
        } else if (i == 2) {
            if (i2 != -1) {
                setFollowButtonStyle(-1);
            }
            setDoubleFollowButtonText(str);
            this.f118351b.setTextColor(getResources().getColor(getFollowedTextColorResId()));
            this.f118351b.setBackground(getResources().getDrawable(followedBgResId));
        } else if (i == 3) {
            setVisibility(8);
        } else if (i == 4) {
            if (i2 != -1) {
                setFollowButtonStyle(-1);
            }
            this.f118351b.setText(getResources().getText(R.string.byz));
            this.f118351b.setTextColor(getResources().getColor(getFollowedTextColorResId()));
            this.f118351b.setBackground(getResources().getDrawable(followedBgResId));
        }
        this.f118352c = i;
    }
}
