package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.o */
public final class C8187o extends ConstraintLayout {

    /* renamed from: g */
    private LottieAnimationView f20312g;

    static {
        Covode.recordClassIndex(9010);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ boolean mo14421c() {
        mo9139b();
        return false;
    }

    /* renamed from: d */
    private void m16307d() {
        this.f20312g.mo5828a(new Animator.AnimatorListener() {
            /* class com.bytedance.android.livesdk.chatroom.widget.C8187o.C81881 */

            static {
                Covode.recordClassIndex(9011);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                C8187o.this.mo9139b();
            }
        });
        this.f20312g.mo5826a();
    }

    /* renamed from: b */
    public final void mo9139b() {
        this.f20312g.mo5836d();
        animate().alpha(0.0f).setDuration(200).setListener(new Animator.AnimatorListener() {
            /* class com.bytedance.android.livesdk.chatroom.widget.C8187o.C81892 */

            static {
                Covode.recordClassIndex(9012);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (C8187o.this.getParent() instanceof ViewGroup) {
                    ((ViewGroup) C8187o.this.getParent()).post(new RunnableC8191q(this));
                }
            }
        }).start();
    }

    private C8187o(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: a */
    public static void m16306a(ViewGroup viewGroup) {
        MethodCollector.m26663i(2730);
        if (viewGroup == null || viewGroup.getContext() == null) {
            MethodCollector.m26664o(2730);
            return;
        }
        C8187o oVar = new C8187o(viewGroup.getContext());
        viewGroup.addView(oVar, -1, -1);
        oVar.m16307d();
        oVar.setAlpha(0.0f);
        oVar.animate().alpha(1.0f).setDuration(300).start();
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", C7411d.m15284a().mo13614e());
        C6501b.C6502a.m13948a("draw_guide_show").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
        MethodCollector.m26664o(2730);
    }

    private C8187o(Context context, byte b) {
        this(context, (char) 0);
    }

    private C8187o(Context context, char c) {
        super(context, null, 0);
        inflate(getContext(), R.layout.bav, this);
        this.f20312g = (LottieAnimationView) findViewById(R.id.e2v);
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new View$OnTouchListenerC8190p(this));
    }
}
