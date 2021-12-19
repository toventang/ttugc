package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer */
public final class AdBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: h */
    BottomSheetBehavior<FrameLayout> f91555h;

    /* renamed from: i */
    private boolean f91556i;

    /* renamed from: j */
    private AbstractC38772b f91557j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer$b */
    public interface AbstractC38772b {
        static {
            Covode.recordClassIndex(46314);
        }

        /* renamed from: a */
        void mo67308a();

        /* renamed from: b */
        void mo67309b();

        /* renamed from: c */
        void mo67310c();

        /* renamed from: d */
        void mo67311d();
    }

    static {
        Covode.recordClassIndex(46312);
    }

    public AdBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final BottomSheetBehavior<FrameLayout> getBehavior() {
        return this.f91555h;
    }

    public final AbstractC38772b getCallback() {
        return this.f91557j;
    }

    public final boolean getHideable() {
        return this.f91556i;
    }

    /* renamed from: a */
    public final boolean mo14580a() {
        if (this.f91555h.f62896j == 3) {
            return true;
        }
        return false;
    }

    public final void setCallback(AbstractC38772b bVar) {
        this.f91557j = bVar;
    }

    public final void setHideable(boolean z) {
        this.f91556i = z;
    }

    public final void setBehavior(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
        C89219l.m154721d(bottomSheetBehavior, "");
        this.f91555h = bottomSheetBehavior;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer$a */
    public static final class C38771a extends BottomSheetBehavior.AbstractC26607a {

        /* renamed from: a */
        final /* synthetic */ AdBottomSheetContainer$behavior$1 f91558a;

        /* renamed from: b */
        final /* synthetic */ AdBottomSheetContainer f91559b;

        static {
            Covode.recordClassIndex(46313);
        }

        C38771a(AdBottomSheetContainer$behavior$1 adBottomSheetContainer$behavior$1, AdBottomSheetContainer adBottomSheetContainer) {
            this.f91558a = adBottomSheetContainer$behavior$1;
            this.f91559b = adBottomSheetContainer;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37774a(View view, float f) {
            C89219l.m154721d(view, "");
            AbstractC38772b callback = this.f91559b.getCallback();
            if (callback != null) {
                callback.mo67311d();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37775a(View view, int i) {
            AbstractC38772b callback;
            C89219l.m154721d(view, "");
            if (i == 1) {
                if (!this.f91559b.getHideable()) {
                    this.f91558a.mo43978c(3);
                }
                AbstractC38772b callback2 = this.f91559b.getCallback();
                if (callback2 != null) {
                    callback2.mo67310c();
                }
            } else if (i == 3) {
                AbstractC38772b callback3 = this.f91559b.getCallback();
                if (callback3 != null) {
                    callback3.mo67308a();
                }
            } else if (i == 4 && (callback = this.f91559b.getCallback()) != null) {
                callback.mo67309b();
            }
        }
    }

    private /* synthetic */ AdBottomSheetContainer(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdBottomSheetContainer(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f91556i = true;
        AdBottomSheetContainer$behavior$1 adBottomSheetContainer$behavior$1 = new AdBottomSheetContainer$behavior$1(this);
        adBottomSheetContainer$behavior$1.f62901o = new C38771a(adBottomSheetContainer$behavior$1, this);
        this.f91556i = true;
        adBottomSheetContainer$behavior$1.mo43976b(0);
        this.f91555h = adBottomSheetContainer$behavior$1;
    }
}
