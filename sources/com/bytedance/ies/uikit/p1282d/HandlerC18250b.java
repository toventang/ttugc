package com.bytedance.ies.uikit.p1282d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.ies.uikit.d.b */
public final class HandlerC18250b extends Handler {

    /* renamed from: d */
    private static HandlerC18250b f43492d;

    /* renamed from: a */
    public final Queue<C18248a> f43493a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public boolean f43494b;

    /* renamed from: c */
    public int f43495c = 5;

    static {
        Covode.recordClassIndex(20909);
    }

    /* renamed from: a */
    public static synchronized HandlerC18250b m33961a() {
        synchronized (HandlerC18250b.class) {
            MethodCollector.m26663i(11023);
            HandlerC18250b bVar = f43492d;
            if (bVar != null) {
                MethodCollector.m26664o(11023);
                return bVar;
            }
            HandlerC18250b bVar2 = new HandlerC18250b(Looper.getMainLooper());
            f43492d = bVar2;
            MethodCollector.m26664o(11023);
            return bVar2;
        }
    }

    /* renamed from: b */
    private void m33962b() {
        C18248a peek;
        while (!this.f43493a.isEmpty() && (peek = this.f43493a.peek()) != null) {
            if (peek.mo29119e()) {
                peek.mo29118d();
                this.f43493a.poll();
            } else if (!peek.mo29117c()) {
                Message obtain = Message.obtain();
                obtain.what = 291;
                obtain.obj = peek;
                sendMessage(obtain);
                return;
            } else {
                return;
            }
        }
    }

    private HandlerC18250b(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    public final void mo29121a(Context context) {
        for (C18248a aVar : this.f43493a) {
            if (aVar != null && aVar.f43465a == context) {
                aVar.f43473i = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo29122a(C18248a aVar) {
        if (!this.f43493a.contains(aVar) && this.f43493a.size() <= this.f43495c) {
            this.f43493a.offer(aVar);
            if (!this.f43494b) {
                sendEmptyMessage(1929);
            }
        }
    }

    /* renamed from: b */
    public final void mo29123b(final C18248a aVar) {
        if (!aVar.mo29117c() || aVar.mo29119e()) {
            aVar.mo29118d();
            this.f43494b = false;
            this.f43493a.remove(aVar);
            sendEmptyMessage(1929);
        } else if (!this.f43493a.contains(aVar)) {
            this.f43494b = false;
            removeMessages(1110);
            sendEmptyMessage(1929);
        } else {
            AnimatorSet a = aVar.mo29112a();
            a.addListener(new Animator.AnimatorListener() {
                /* class com.bytedance.ies.uikit.p1282d.HandlerC18250b.C182511 */

                static {
                    Covode.recordClassIndex(20910);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    aVar.f43476l = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    aVar.f43476l = false;
                    aVar.mo29118d();
                    HandlerC18250b.this.f43494b = false;
                    HandlerC18250b.this.removeMessages(1110);
                    HandlerC18250b.this.sendEmptyMessage(1929);
                }
            });
            a.start();
            this.f43493a.poll();
        }
    }

    public final void handleMessage(Message message) {
        MethodCollector.m26663i(11172);
        C18248a aVar = (C18248a) message.obj;
        int i = message.what;
        if (i == 291) {
            if (!aVar.mo29117c()) {
                if (!aVar.mo29119e()) {
                    if (aVar.f43470f != null && !C13627m.m24498a(aVar.f43475k)) {
                        aVar.f43470f.setText(aVar.f43475k);
                    }
                    aVar.f43474j = true;
                    aVar.f43466b.removeAllViews();
                    if (aVar.f43469e.getParent() == null) {
                        aVar.f43466b.addView(aVar.f43469e);
                    } else {
                        ((ViewGroup) aVar.f43469e.getParent()).removeView(aVar.f43469e);
                        aVar.f43466b.addView(aVar.f43469e);
                    }
                    if (aVar.f43479o == null) {
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 262280, -2);
                        layoutParams.flags = 262280;
                        layoutParams.gravity = aVar.f43467c;
                        if (layoutParams.gravity == 48) {
                            layoutParams.y = aVar.f43468d[0];
                        }
                        aVar.f43479o = layoutParams;
                    }
                    aVar.f43478n = (WindowManager) C18248a.m33949a(aVar.f43465a, "window");
                    if (aVar.f43466b.getParent() != null) {
                        C18248a.m33950a(aVar.f43478n, aVar.f43466b);
                    }
                    try {
                        WindowManager windowManager = aVar.f43478n;
                        ViewGroup viewGroup = aVar.f43466b;
                        WindowManager.LayoutParams layoutParams2 = aVar.f43479o;
                        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{viewGroup, layoutParams2}, 102800, "void", false, null).first).booleanValue()) {
                            windowManager.addView(viewGroup, layoutParams2);
                            C15346a.m28240a(null, windowManager, new Object[]{viewGroup, layoutParams2}, 102800, "com_bytedance_ies_uikit_toast_CustomToast_android_view_WindowManager_addView(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V");
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f43494b = true;
                if (aVar.f43471g == null) {
                    aVar.f43471g = new AnimatorSet();
                    aVar.f43471g.playTogether(ObjectAnimator.ofFloat(aVar.f43466b, "translationY", (float) (-aVar.f43485u), 0.0f), ObjectAnimator.ofFloat(aVar.f43466b, "alpha", 0.0f, 1.0f));
                    aVar.f43471g.setInterpolator(new AccelerateDecelerateInterpolator());
                    aVar.f43471g.setDuration(320L);
                }
                aVar.f43471g.start();
                Message obtain = Message.obtain();
                obtain.what = 1110;
                obtain.obj = aVar;
                sendMessageDelayed(obtain, aVar.f43472h);
            }
            MethodCollector.m26664o(11172);
        } else if (i != 1110) {
            if (i == 1929) {
                m33962b();
            }
            MethodCollector.m26664o(11172);
        } else {
            mo29123b(aVar);
            MethodCollector.m26664o(11172);
        }
    }
}
