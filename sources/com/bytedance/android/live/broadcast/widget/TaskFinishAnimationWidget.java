package com.bytedance.android.live.broadcast.widget;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.broadcast.api.model.C3068a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.gift.assets.C8787d;
import com.bytedance.android.livesdk.livebuild.AbstractC9306b;
import com.bytedance.android.livesdk.livebuild.AbstractC9307c;
import com.bytedance.android.livesdk.livebuild.C9305a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p522f.C8464a;
import com.bytedance.android.livesdk.p672z.C11604a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1204e.p1205a.C17305a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;

public class TaskFinishAnimationWidget extends LiveRecyclableWidget implements WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: a */
    public TextView f10418a;

    /* renamed from: b */
    public AlphaAnimation f10419b;

    /* renamed from: c */
    public Runnable f10420c;

    /* renamed from: d */
    public AlphaAnimation f10421d;

    /* renamed from: e */
    public final WeakHandler f10422e = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: f */
    private LottieAnimationView f10423f;

    /* renamed from: g */
    private C88411a f10424g = new C88411a();

    static {
        Covode.recordClassIndex(4290);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.b4e;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        C88411a aVar = this.f10424g;
        if (aVar != null) {
            aVar.mo142944a();
        }
        AlphaAnimation alphaAnimation = this.f10421d;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
            this.f10421d = null;
        }
        AlphaAnimation alphaAnimation2 = this.f10419b;
        if (alphaAnimation2 != null) {
            alphaAnimation2.cancel();
            this.f10419b = null;
        }
        if (this.f10420c != null) {
            this.f10420c = null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        this.f10418a = (TextView) findViewById(R.id.eob);
        this.f10423f = (LottieAnimationView) findViewById(R.id.eoa);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        this.f10424g.mo142945a(C6779a.m14563a().mo13052a(C3068a.class).mo143289d(new AbstractC88433f<C3068a>() {
            /* class com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.C37661 */

            static {
                Covode.recordClassIndex(4291);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C3068a aVar) {
                C3068a aVar2 = aVar;
                TaskFinishAnimationWidget taskFinishAnimationWidget = TaskFinishAnimationWidget.this;
                if (aVar2 != null && !TextUtils.isEmpty(aVar2.f8906b)) {
                    SpannableString spannableString = new SpannableString(aVar2.f8905a + "\n" + aVar2.f8906b);
                    if (!TextUtils.isEmpty(aVar2.f8905a)) {
                        spannableString.setSpan(new AbsoluteSizeSpan(C3966y.m9653a(11.0f)), 0, aVar2.f8905a.length(), 18);
                    }
                    taskFinishAnimationWidget.f10418a.setText(spannableString);
                    ((IGiftService) C6193a.m13435a(IGiftService.class)).getAssetsManager().mo15075a((long) LiveBroadcastTaskResourceIdSetting.INSTANCE.getValue(), new C8787d() {
                        /* class com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.C37683 */

                        static {
                            Covode.recordClassIndex(4293);
                        }

                        @Override // com.bytedance.android.livesdk.gift.assets.C8787d, com.bytedance.android.livesdk.gift.assets.AbstractC8784a
                        /* renamed from: a */
                        public final void mo8564a(Throwable th) {
                            C3854a.m9460b("TaskFinishAnimationWidget", th.toString(), th);
                        }

                        @Override // com.bytedance.android.livesdk.gift.assets.C8787d, com.bytedance.android.livesdk.gift.assets.AbstractC8784a
                        /* renamed from: a */
                        public final void mo8563a(String str) {
                            C17305a.m32043a().mo27615a(TaskFinishAnimationWidget.this.f10422e, new Callable(str) {
                                /* class com.bytedance.android.livesdk.utils.C11212af.CallableC112131 */

                                /* renamed from: a */
                                final /* synthetic */ String f26855a;

                                /* renamed from: b */
                                final /* synthetic */ int f26856b = 7;

                                static {
                                    Covode.recordClassIndex(12841);
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return C11212af.m19869a(this.f26855a, this.f26856b);
                                }

                                {
                                    this.f26855a = r2;
                                }
                            }, 100);
                        }
                    }, 4);
                }
            }
        }));
        this.f10423f.mo5828a(new Animator.AnimatorListener() {
            /* class com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.C37672 */

            static {
                Covode.recordClassIndex(4292);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                C13628n.m24510a(TaskFinishAnimationWidget.this.f10418a, 8);
            }

            public final void onAnimationStart(Animator animator) {
                C13628n.m24510a(TaskFinishAnimationWidget.this.f10418a, 0);
                TaskFinishAnimationWidget taskFinishAnimationWidget = TaskFinishAnimationWidget.this;
                taskFinishAnimationWidget.f10421d = new AlphaAnimation(0.0f, 1.0f);
                taskFinishAnimationWidget.f10419b = new AlphaAnimation(1.0f, 0.0f);
                taskFinishAnimationWidget.f10421d.setDuration(200);
                taskFinishAnimationWidget.f10419b.setDuration(200);
                taskFinishAnimationWidget.f10420c = new Runnable() {
                    /* class com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.RunnableC37694 */

                    static {
                        Covode.recordClassIndex(4294);
                    }

                    public final void run() {
                        if (TaskFinishAnimationWidget.this.isViewValid()) {
                            TaskFinishAnimationWidget.this.f10418a.startAnimation(TaskFinishAnimationWidget.this.f10419b);
                        }
                    }
                };
                TaskFinishAnimationWidget.this.f10418a.startAnimation(TaskFinishAnimationWidget.this.f10421d);
                TaskFinishAnimationWidget.this.f10418a.postDelayed(TaskFinishAnimationWidget.this.f10420c, 1700);
            }
        });
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        AbstractC9306b<?> bVar;
        if (message != null && message.what == 100 && (message.obj instanceof C11604a)) {
            C11604a aVar = (C11604a) message.obj;
            LottieAnimationView lottieAnimationView = this.f10423f;
            Object obj = null;
            if (aVar != null && aVar.f27762b != null && aVar.f27763c != null && lottieAnimationView != null) {
                C13628n.m24510a(lottieAnimationView, 0);
                lottieAnimationView.mo5836d();
                lottieAnimationView.setProgress(0.0f);
                HashMap<String, Bitmap> hashMap = aVar.f27765e;
                if (hashMap != null) {
                    lottieAnimationView.setImageAssetDelegate(new C8464a.C8465a(hashMap));
                }
                C2044e eVar = C8464a.f20920a.get(aVar.f27762b);
                if (eVar == null) {
                    try {
                        if (!(C9305a.f22743a == null || !C9305a.f22743a.containsKey(AbstractC9307c.class) || (bVar = C9305a.f22743a.get(AbstractC9307c.class)) == null)) {
                            obj = bVar.mo15441a();
                        }
                        ((AbstractC9307c) obj).fromJson(lottieAnimationView.getContext(), aVar.f27764d, new C8464a.C8466b(aVar, lottieAnimationView));
                    } catch (Exception unused) {
                    }
                } else {
                    lottieAnimationView.setComposition(eVar);
                    lottieAnimationView.mo5826a();
                }
            }
        }
    }
}
