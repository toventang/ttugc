package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify */
public class AvatarImageWithVerify extends FrameLayout {

    /* renamed from: a */
    private SmartAvatarImageView f81861a;

    /* renamed from: b */
    private ImageView f81862b;

    /* renamed from: c */
    private UserVerify f81863c;

    /* renamed from: d */
    private final int f81864d;

    /* renamed from: e */
    private final int f81865e;

    /* renamed from: f */
    private int[] f81866f;

    static {
        Covode.recordClassIndex(41632);
    }

    /* access modifiers changed from: protected */
    public int getVerifyIconMarginEnd() {
        return -this.f81865e;
    }

    public SmartAvatarImageView getAvatarImageView() {
        return this.f81861a;
    }

    public int getVerifyIconSize() {
        return this.f81864d;
    }

    /* renamed from: a */
    public final void mo61285a() {
        this.f81862b.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getAvatarLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public void setRequestImgSize(int[] iArr) {
        this.f81866f = iArr;
    }

    private void setFailureImage(int i) {
        ((C24246a) this.f81861a.getHierarchy()).mo39962b(i, C24229q.AbstractC24231b.f57458h);
    }

    public void setPlaceHolder(int i) {
        ((C24246a) this.f81861a.getHierarchy()).mo39954a(i, C24229q.AbstractC24231b.f57458h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setUserData(com.p2082ss.android.ugc.aweme.utils.UserVerify r5) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify.setUserData(com.ss.android.ugc.aweme.utils.UserVerify):void");
    }

    public AvatarImageWithVerify(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageWithVerify(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(12832);
        this.f81864d = (int) C17867d.m33078a().getResources().getDimension(R.dimen.g7);
        this.f81865e = (int) C13628n.m24520b(C17867d.m33078a(), 2.0f);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(getContext());
        this.f81861a = smartAvatarImageView;
        ((C24246a) smartAvatarImageView.getHierarchy()).mo39954a(R.color.j, C24229q.AbstractC24231b.f57458h);
        addView(this.f81861a, getAvatarLayoutParams());
        int verifyIconSize = getVerifyIconSize();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(verifyIconSize, verifyIconSize);
        layoutParams.gravity = 8388693;
        int verifyIconMarginEnd = getVerifyIconMarginEnd();
        int i2 = Build.VERSION.SDK_INT;
        layoutParams.setMarginEnd(verifyIconMarginEnd);
        ImageView imageView = new ImageView(getContext());
        this.f81862b = imageView;
        try {
            imageView.setImageDrawable(getResources().getDrawable(2131232493));
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
        this.f81862b.setVisibility(8);
        addView(this.f81862b, layoutParams);
        MethodCollector.m26664o(12832);
    }
}
