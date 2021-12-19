package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.AbstractC45988a;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.f */
public final class C46219f extends FrameLayout implements AbstractC45988a {

    /* renamed from: a */
    C45995c f107660a;

    /* renamed from: b */
    private MaskBlurLightTextView f107661b;

    /* renamed from: c */
    private View f107662c;

    /* renamed from: d */
    private ImageView f107663d;

    /* renamed from: e */
    private ObjectAnimator f107664e;

    /* renamed from: f */
    private AbstractC45988a f107665f;

    /* renamed from: g */
    private Drawable f107666g;

    /* renamed from: h */
    private Drawable f107667h;

    static {
        Covode.recordClassIndex(54781);
    }

    public final void setBackground(Drawable drawable) {
    }

    public final C45995c getFontData() {
        return this.f107660a;
    }

    /* renamed from: a */
    public final boolean mo78473a() {
        C45995c cVar = this.f107660a;
        if (cVar == null || !cVar.mo77602b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo78475c() {
        if (this.f107660a != null) {
            Typeface b = C45989b.m88764a().mo77592b(this.f107660a.f107121e);
            if (b != null) {
                this.f107661b.setTypeface(b);
            }
            if (this.f107660a.mo77601a()) {
                this.f107661b.setMaskBlurColor(-6400);
            }
        }
    }

    /* renamed from: b */
    public final void mo78474b() {
        C45995c cVar = this.f107660a;
        if (cVar != null) {
            int i = cVar.f107124h;
            if (i == 1) {
                this.f107663d.setVisibility(4);
            } else if (i == 2) {
                this.f107663d.setVisibility(0);
                ObjectAnimator objectAnimator = this.f107664e;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                this.f107664e = null;
                this.f107663d.setRotation(0.0f);
                this.f107663d.setImageDrawable(C0643b.m2369a(getContext(), 2131232478));
            } else if (i == 3) {
                this.f107663d.setVisibility(0);
                this.f107663d.setImageDrawable(C0643b.m2369a(getContext(), 2131232692));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f107663d, "rotation", 0.0f, 360.0f);
                this.f107664e = ofFloat;
                ofFloat.setDuration(800L);
                this.f107664e.setRepeatMode(1);
                this.f107664e.setRepeatCount(-1);
                this.f107664e.start();
            }
        }
    }

    public final void setDownloadCallback(AbstractC45988a aVar) {
        this.f107665f = aVar;
    }

    public C46219f(Context context) {
        this(context, (byte) 0);
    }

    public final void setBackground(int i) {
        Drawable drawable;
        if (i != 1) {
            drawable = this.f107667h;
        } else {
            drawable = this.f107666g;
        }
        this.f107662c.setBackground(drawable);
    }

    /* access modifiers changed from: package-private */
    public final void setFontData(C45995c cVar) {
        if (cVar != null) {
            this.f107660a = cVar;
            if (!TextUtils.isEmpty(cVar.f107118b)) {
                this.f107661b.setText(this.f107660a.f107118b);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.AbstractC45988a
    /* renamed from: a */
    public final void mo77586a(boolean z) {
        C45995c cVar = this.f107660a;
        if (cVar != null) {
            cVar.f107124h = 2;
            mo78474b();
        }
        AbstractC45988a aVar = this.f107665f;
        if (aVar != null) {
            aVar.mo77586a(z);
        }
        if (z) {
            C45866d.m88492e().mo77256a(getContext(), getContext().getResources().getString(R.string.bzp));
        }
    }

    private C46219f(Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(10589);
        View inflate = LayoutInflater.from(context).inflate(R.layout.ze, this);
        this.f107661b = (MaskBlurLightTextView) inflate.findViewById(R.id.ejn);
        this.f107663d = (ImageView) inflate.findViewById(R.id.e7e);
        this.f107662c = inflate.findViewById(R.id.f80);
        int a = (int) C84912r.m145930a(getContext(), 4.0f);
        this.f107666g = C84916a.m145947a(-1, 16777215, (int) C84912r.m145930a(getContext(), 2.0f), a);
        this.f107667h = C84916a.m145947a(889192447, 16777215, 1, a);
        MethodCollector.m26664o(10589);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.AbstractC45988a
    /* renamed from: a */
    public final void mo77585a(C45995c cVar, boolean z, boolean z2) {
        mo78474b();
        if (this.f107660a.mo77602b()) {
            AbstractC45988a aVar = this.f107665f;
            if (aVar != null) {
                C45995c cVar2 = this.f107660a;
                aVar.mo77585a(cVar2, cVar2.mo77602b(), z2);
            }
            mo78475c();
        } else if (z2) {
            C45866d.m88492e().mo77256a(getContext(), getContext().getResources().getString(R.string.bzp));
        }
    }
}
