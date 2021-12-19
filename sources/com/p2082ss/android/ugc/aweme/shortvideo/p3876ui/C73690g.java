package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g */
public final class C73690g {

    /* renamed from: a */
    public static final C73690g f165525a = new C73690g();

    private C73690g() {
    }

    static {
        Covode.recordClassIndex(86428);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$b */
    public static final class C73692b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f165529a;

        /* renamed from: b */
        final /* synthetic */ View f165530b;

        static {
            Covode.recordClassIndex(86430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73692b(ActivityC0945e eVar, View view) {
            super(0);
            this.f165529a = eVar;
            this.f165530b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            final AbstractC23317a d = ((C23329a) new C23329a(this.f165529a).mo38041b(this.f165530b).mo38034a(EnumC23352h.TOP)).mo38023e(R.string.eq5).mo38030a(3000L).mo38012d();
            this.f165530b.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73690g.C73692b.RunnableC736931 */

                /* renamed from: a */
                final /* synthetic */ C73692b f165531a;

                static {
                    Covode.recordClassIndex(86431);
                }

                {
                    this.f165531a = r1;
                }

                public final void run() {
                    if (!this.f165531a.f165529a.isFinishing() && this.f165531a.f165530b.getVisibility() == 0) {
                        d.mo38001a();
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.g$a */
    public static final class View$OnTouchListenerC73691a implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f165526a;

        /* renamed from: b */
        final /* synthetic */ View f165527b;

        /* renamed from: c */
        final /* synthetic */ View f165528c;

        static {
            Covode.recordClassIndex(86429);
        }

        View$OnTouchListenerC73691a(ImageView imageView, View view, View view2) {
            this.f165526a = imageView;
            this.f165527b = view;
            this.f165528c = view2;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                ImageView imageView = this.f165526a;
                C89219l.m154716b(imageView, "");
                imageView.setAlpha(0.75f);
                View view2 = this.f165527b;
                C89219l.m154716b(view2, "");
                view2.setAlpha(0.75f);
                if (this.f165528c.getBackground() == null) {
                    return false;
                }
                Drawable background = this.f165528c.getBackground();
                C89219l.m154716b(background, "");
                background.setAlpha(191);
                return false;
            } else if (action != 1 && action != 3) {
                return false;
            } else {
                ImageView imageView2 = this.f165526a;
                C89219l.m154716b(imageView2, "");
                imageView2.setAlpha(1.0f);
                View view3 = this.f165527b;
                C89219l.m154716b(view3, "");
                view3.setAlpha(1.0f);
                if (this.f165528c.getBackground() == null) {
                    return false;
                }
                Drawable background2 = this.f165528c.getBackground();
                C89219l.m154716b(background2, "");
                background2.setAlpha(255);
                return false;
            }
        }
    }
}
