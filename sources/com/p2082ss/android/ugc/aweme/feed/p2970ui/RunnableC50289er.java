package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.animation.ScaleAnimation;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.er */
final /* synthetic */ class RunnableC50289er implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC50266eg.RunnableC502704 f116116a;

    /* renamed from: b */
    private final String f116117b;

    /* renamed from: c */
    private final Aweme f116118c;

    static {
        Covode.recordClassIndex(59415);
    }

    RunnableC50289er(View$OnClickListenerC50266eg.RunnableC502704 r1, String str, Aweme aweme) {
        this.f116116a = r1;
        this.f116117b = str;
        this.f116118c = aweme;
    }

    public final void run() {
        View$OnClickListenerC50266eg.RunnableC502704 r4 = this.f116116a;
        AbstractC88979t.m154294a(new AbstractC88983w<Pair<String, Drawable>>() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502704.C502742 */

            static {
                Covode.recordClassIndex(59400);
            }

            @Override // p4560f.p4561a.AbstractC88983w
            public final void subscribe(AbstractC88982v<Pair<String, Drawable>> vVar) {
                vVar.mo143031a(new Pair<>(C68863ah.f154028b.mo109365b((Activity) View$OnClickListenerC50266eg.this.f113959R), C68863ah.f154028b.mo109353a((Activity) View$OnClickListenerC50266eg.this.f113959R)));
            }
        }).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) new AbstractC88986z<Pair<String, Drawable>>(this.f116117b, this.f116118c) {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502704.C502711 */

            /* renamed from: a */
            final /* synthetic */ String f116086a;

            /* renamed from: b */
            final /* synthetic */ Aweme f116087b;

            static {
                Covode.recordClassIndex(59397);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88986z
            public final /* synthetic */ void onNext(Pair<String, Drawable> pair) {
                Pair<String, Drawable> pair2 = pair;
                String str = (String) pair2.first;
                Drawable drawable = (Drawable) pair2.second;
                if (drawable != null) {
                    View$OnClickListenerC50266eg.this.f116067a.setImageDrawable(drawable);
                    C39162r.m79460a("share_highlight", new C33744d().mo59983a("enter_from", this.f116086a).mo59983a("group_id", C59208ac.m108771e(this.f116087b)).mo59983a("author_id", C59208ac.m108758a(this.f116087b)).mo59983a("show_content", str).f79943a);
                }
                View$OnClickListenerC50266eg.this.f116069c.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150).withEndAction(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502704.C502711.RunnableC502721 */

                    static {
                        Covode.recordClassIndex(59398);
                    }

                    public final void run() {
                        View$OnClickListenerC50266eg.this.f116069c.animate().scaleX(0.95f).scaleY(0.95f).setDuration(150).withEndAction(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg.RunnableC502704.C502711.RunnableC502721.RunnableC502731 */

                            static {
                                Covode.recordClassIndex(59399);
                            }

                            public final void run() {
                                ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.02f, 0.95f, 1.02f, 1, 0.5f, 1, 0.5f);
                                scaleAnimation.setDuration(600);
                                scaleAnimation.setRepeatMode(2);
                                scaleAnimation.setRepeatCount(-1);
                                View$OnClickListenerC50266eg.this.f116069c.startAnimation(scaleAnimation);
                            }
                        }).start();
                    }
                }).start();
            }

            {
                this.f116086a = r2;
                this.f116087b = r3;
            }
        });
    }
}
