package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.C71167b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.C71168c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.C71169d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.C71211a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDEditText;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.C71372a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.widget.AVTextView;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout */
public final class LiveCDEditStickerLayout extends FrameLayout implements View.OnClickListener, AbstractC71208e, AbstractC84917a {

    /* renamed from: A */
    public static final C71183a f159478A = new C71183a((byte) 0);

    /* renamed from: w */
    public static int f159479w;

    /* renamed from: x */
    static int f159480x = 1;

    /* renamed from: y */
    static int f159481y = 2;

    /* renamed from: z */
    static int f159482z = 200;

    /* renamed from: B */
    private RelativeLayout f159483B;

    /* renamed from: C */
    private AbstractC89183m<? super LiveCDEditStickerView, ? super Boolean, C89391z> f159484C;

    /* renamed from: D */
    private AbstractC89172b<? super LiveCDEditStickerView, C89391z> f159485D;

    /* renamed from: E */
    private boolean f159486E;

    /* renamed from: F */
    private int f159487F;

    /* renamed from: G */
    private C71211a f159488G;

    /* renamed from: H */
    private int f159489H;

    /* renamed from: a */
    public FrameLayout f159490a;

    /* renamed from: b */
    public AVTextView f159491b;

    /* renamed from: c */
    public AVTextView f159492c;

    /* renamed from: d */
    public AVTextView f159493d;

    /* renamed from: e */
    public boolean f159494e;

    /* renamed from: f */
    public boolean f159495f;

    /* renamed from: g */
    public final AbstractC89171a<C89391z> f159496g;

    /* renamed from: h */
    C71203a f159497h;

    /* renamed from: i */
    public C71203a f159498i;

    /* renamed from: j */
    volatile int f159499j;

    /* renamed from: k */
    int f159500k;

    /* renamed from: l */
    boolean f159501l;

    /* renamed from: m */
    boolean f159502m;

    /* renamed from: n */
    PointF f159503n;

    /* renamed from: o */
    LiveCDEditStickerView f159504o;

    /* renamed from: p */
    public int f159505p;

    /* renamed from: q */
    public boolean f159506q;

    /* renamed from: r */
    public Animator f159507r;

    /* renamed from: s */
    public final C71372a f159508s;

    /* renamed from: t */
    public VideoPublishEditModel f159509t;

    /* renamed from: u */
    public C71169d f159510u;

    /* renamed from: v */
    public boolean f159511v;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$k */
    public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC71196k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f159525a;

        static {
            Covode.recordClassIndex(83705);
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC71196k(AbstractC89171a aVar) {
            this.f159525a = aVar;
        }

        public final /* synthetic */ void onGlobalLayout() {
            C89219l.m154716b(this.f159525a.invoke(), "");
        }
    }

    public LiveCDEditStickerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$a */
    public static final class C71183a {
        static {
            Covode.recordClassIndex(83692);
        }

        private C71183a() {
        }

        public /* synthetic */ C71183a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView, h.z> */
    public final AbstractC89172b<LiveCDEditStickerView, C89391z> getBeforeChangeListener() {
        return this.f159485D;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.AbstractC71208e
    public final int getHintState() {
        return this.f159489H;
    }

    public final int getHintTextState() {
        return this.f159489H;
    }

    public final C71211a getLiveCDStickerController() {
        return this.f159488G;
    }

    public final LiveCDEditStickerView getMChild() {
        return this.f159504o;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView, ? super java.lang.Boolean, h.z>, h.f.a.m<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView, java.lang.Boolean, h.z> */
    public final AbstractC89183m<LiveCDEditStickerView, Boolean, C89391z> getOnCompleteListener() {
        return this.f159484C;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.AbstractC71208e
    /* renamed from: a */
    public final boolean mo112535a(MotionEvent motionEvent) {
        AVTextView aVTextView;
        C89219l.m154721d(motionEvent, "");
        LiveCDEditStickerView liveCDEditStickerView = this.f159504o;
        if ((liveCDEditStickerView == null || !liveCDEditStickerView.f159534e) && (aVTextView = this.f159493d) != null && C71210g.m125830a(aVTextView, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            AVTextView aVTextView2 = this.f159493d;
            if (aVTextView2 == null) {
                return true;
            }
            aVTextView2.performClick();
            return true;
        }
        AVTextView aVTextView3 = this.f159492c;
        if (aVTextView3 == null || !C71210g.m125830a(aVTextView3, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            RelativeLayout relativeLayout = this.f159483B;
            if (relativeLayout == null) {
                C89219l.m154710a("container");
            }
            if (!C71210g.m125830a(relativeLayout, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return false;
            }
            AVTextView aVTextView4 = this.f159492c;
            if (aVTextView4 == null) {
                return true;
            }
            aVTextView4.performClick();
            return true;
        }
        AVTextView aVTextView5 = this.f159492c;
        if (aVTextView5 == null) {
            return true;
        }
        aVTextView5.performClick();
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$e */
    public static final class C71187e implements AbstractC71205c {

        /* renamed from: b */
        final /* synthetic */ LiveCDEditStickerLayout f159516b;

        static {
            Covode.recordClassIndex(83696);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.AbstractC71205c
        /* renamed from: a */
        public final void mo112555a() {
            this.f159516b.mo112531a(1);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$e$a */
        static final class RunnableC71188a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C71187e f159517a;

            static {
                Covode.recordClassIndex(83697);
            }

            RunnableC71188a(C71187e eVar) {
                this.f159517a = eVar;
            }

            public final void run() {
                LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159517a.f159516b;
                LiveCDEditStickerView mChild = this.f159517a.f159516b.getMChild();
                if (mChild == null) {
                    C89219l.m154715b();
                }
                liveCDEditStickerLayout.mo112532a(mChild);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.AbstractC71205c
        /* renamed from: b */
        public final void mo112556b() {
            LiveCDEditStickerView mChild = this.f159516b.getMChild();
            if (mChild != null) {
                mChild.post(new RunnableC71188a(this));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71187e(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f159516b = liveCDEditStickerLayout;
        }
    }

    /* renamed from: c */
    private final void m125784c() {
        Context context = getContext();
        if (context instanceof AbstractC84919c) {
            ((AbstractC84919c) context).mo87533b(this);
        }
    }

    static {
        Covode.recordClassIndex(83691);
    }

    /* renamed from: d */
    private final void m125785d() {
        this.f159494e = true;
        LiveCDEditStickerView liveCDEditStickerView = this.f159504o;
        if (liveCDEditStickerView != null) {
            this.f159507r = m125781a(liveCDEditStickerView, new C71184b(this));
            mo112529a();
        }
    }

    /* renamed from: e */
    private final void m125786e() {
        LiveCDEditStickerView liveCDEditStickerView = this.f159504o;
        if (liveCDEditStickerView != null) {
            liveCDEditStickerView.setScaleX(1.0f);
            liveCDEditStickerView.setScaleY(1.0f);
            liveCDEditStickerView.setRotation(0.0f);
            liveCDEditStickerView.setTranslationX(0.0f);
            liveCDEditStickerView.setTranslationY(0.0f);
            this.f159486E = false;
            this.f159500k = 0;
            this.f159498i = new C71203a((byte) 0);
        }
    }

    /* renamed from: a */
    public final void mo112529a() {
        InputMethodManager inputMethodManager = (InputMethodManager) m125783a(getContext(), "input_method");
        Context context = getContext();
        C89219l.m154716b(context, "");
        Activity a = C67279a.m119194a(context);
        if (a != null && inputMethodManager != null) {
            Window window = a.getWindow();
            C89219l.m154716b(window, "");
            View decorView = window.getDecorView();
            C89219l.m154716b(decorView, "");
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    public final boolean mo112537b() {
        String str;
        String titleText;
        long currentTimeMillis;
        int i;
        C71211a liveCDStickerController;
        LiveCDEditStickerView mChild;
        LiveCDEditStickerView liveCDEditStickerView;
        LiveCDEditStickerView liveCDEditStickerView2 = this.f159504o;
        String str2 = null;
        if (liveCDEditStickerView2 != null) {
            str = liveCDEditStickerView2.getTitleText();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) || (liveCDEditStickerView = this.f159504o) == null || liveCDEditStickerView.mo112568e()) {
            LiveCDEditStickerView liveCDEditStickerView3 = this.f159504o;
            if (liveCDEditStickerView3 == null || (titleText = liveCDEditStickerView3.getTitleText()) == null || C89361p.m154870a((CharSequence) titleText)) {
                mo112531a(4);
                return false;
            }
            LiveCDEditStickerView liveCDEditStickerView4 = this.f159504o;
            if (liveCDEditStickerView4 != null && !liveCDEditStickerView4.mo112568e()) {
                mo112531a(3);
                return false;
            } else if (this.f159495f) {
                return false;
            } else {
                this.f159508s.mo112864b();
                this.f159505p = f159479w;
                C71169d dVar = this.f159510u;
                if (dVar != null) {
                    LiveCDEditStickerLayout liveCDEditStickerLayout = dVar.f159421b;
                    if (liveCDEditStickerLayout == null || (mChild = liveCDEditStickerLayout.getMChild()) == null) {
                        currentTimeMillis = System.currentTimeMillis();
                    } else {
                        currentTimeMillis = mChild.getSelectTimeMiles();
                    }
                    long currentTimeMillis2 = (currentTimeMillis - System.currentTimeMillis()) / 1000;
                    if (currentTimeMillis2 < 0) {
                        currentTimeMillis2 = -1;
                    }
                    C84425b a = new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("enter_method", "click_main_panel").mo129406a("shoot_way", dVar.f159420a.mShootWay).mo129406a("creation_id", dVar.f159420a.creationId).mo129406a("content_source", C70968bl.m125262b(dVar.f159420a)).mo129406a("content_type", C70968bl.m125249a(dVar.f159420a)).mo129406a("edit_type", "title");
                    LiveCDEditStickerLayout liveCDEditStickerLayout2 = dVar.f159421b;
                    if (!(liveCDEditStickerLayout2 == null || (liveCDStickerController = liveCDEditStickerLayout2.getLiveCDStickerController()) == null)) {
                        str2 = liveCDStickerController.f159573a;
                    }
                    C84425b a2 = a.mo129406a("prop_id", str2);
                    LiveCDEditStickerLayout liveCDEditStickerLayout3 = dVar.f159421b;
                    if (liveCDEditStickerLayout3 == null || !liveCDEditStickerLayout3.f159511v) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    C39162r.m79460a("livesdk_cd_sticker_edit_complete", a2.mo129403a("is_first_edit", i).mo129404a("countdown_time", currentTimeMillis2).f188764a);
                }
                mo112534a(false);
                return true;
            }
        } else {
            mo112531a(2);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$j */
    static final class C71195j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LiveCDEditStickerLayout f159524a;

        static {
            Covode.recordClassIndex(83704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71195j(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            super(0);
            this.f159524a = liveCDEditStickerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            LiveCDEditStickerView liveCDEditStickerView;
            float f;
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159524a;
            if (liveCDEditStickerLayout.f159504o != null && ((liveCDEditStickerView = liveCDEditStickerLayout.f159504o) == null || liveCDEditStickerView.getState() != 2)) {
                Rect rect = new Rect();
                FrameLayout frameLayout = liveCDEditStickerLayout.f159490a;
                if (frameLayout == null) {
                    C89219l.m154710a("root");
                }
                frameLayout.getWindowVisibleDisplayFrame(rect);
                if (liveCDEditStickerLayout.getHeight() - rect.height() > LiveCDEditStickerLayout.f159482z) {
                    liveCDEditStickerLayout.f159499j = liveCDEditStickerLayout.getHeight() - rect.height();
                    LiveCDEditStickerView liveCDEditStickerView2 = liveCDEditStickerLayout.f159504o;
                    if (liveCDEditStickerView2 != null) {
                        liveCDEditStickerLayout.f159497h.f159559d = (float) ((liveCDEditStickerLayout.getWidth() - liveCDEditStickerView2.getWidth()) / 2);
                        liveCDEditStickerLayout.f159497h.f159560e = (float) (((liveCDEditStickerLayout.getHeight() - liveCDEditStickerLayout.f159499j) - liveCDEditStickerView2.getHeight()) / 2);
                    }
                    int i = liveCDEditStickerLayout.f159505p;
                    if (i == LiveCDEditStickerLayout.f159481y) {
                        liveCDEditStickerLayout.f159505p = LiveCDEditStickerLayout.f159479w;
                        liveCDEditStickerLayout.f159502m = false;
                        if (!liveCDEditStickerLayout.f159501l) {
                            LiveCDEditStickerView liveCDEditStickerView3 = liveCDEditStickerLayout.f159504o;
                            if (liveCDEditStickerView3 != null) {
                                liveCDEditStickerView3.setVisibility(0);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(liveCDEditStickerView3, "scaleX", liveCDEditStickerLayout.f159498i.f159556a, liveCDEditStickerLayout.f159497h.f159556a);
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(liveCDEditStickerView3, "scaleY", liveCDEditStickerLayout.f159498i.f159557b, liveCDEditStickerLayout.f159497h.f159557b);
                                float[] fArr = new float[2];
                                fArr[0] = liveCDEditStickerLayout.f159498i.f159558c;
                                if (liveCDEditStickerLayout.f159498i.f159558c > 180.0f) {
                                    f = 360.0f;
                                } else {
                                    f = liveCDEditStickerLayout.f159497h.f159558c;
                                }
                                fArr[1] = f;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(liveCDEditStickerView3, "rotation", fArr);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(liveCDEditStickerView3, "x", liveCDEditStickerLayout.f159498i.f159559d, liveCDEditStickerLayout.f159497h.f159559d);
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(liveCDEditStickerView3, "y", liveCDEditStickerLayout.f159498i.f159560e, liveCDEditStickerLayout.f159497h.f159560e);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.setDuration(300L);
                                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                                animatorSet.addListener(new C71186d(liveCDEditStickerLayout));
                                animatorSet.start();
                            }
                            liveCDEditStickerLayout.f159501l = true;
                        }
                    } else if (i == LiveCDEditStickerLayout.f159480x) {
                        liveCDEditStickerLayout.f159505p = LiveCDEditStickerLayout.f159479w;
                        liveCDEditStickerLayout.f159502m = false;
                        if (!liveCDEditStickerLayout.f159501l) {
                            LiveCDEditStickerView liveCDEditStickerView4 = liveCDEditStickerLayout.f159504o;
                            if (liveCDEditStickerView4 != null) {
                                liveCDEditStickerLayout.f159498i.f159559d = (float) ((liveCDEditStickerLayout.getWidth() - liveCDEditStickerView4.getWidth()) / 2);
                                liveCDEditStickerLayout.f159498i.f159560e = ((liveCDEditStickerLayout.f159503n.x - ((float) liveCDEditStickerView4.getHeight())) / 2.0f) + liveCDEditStickerLayout.f159503n.y;
                                liveCDEditStickerView4.setX(liveCDEditStickerLayout.f159497h.f159559d);
                                liveCDEditStickerView4.setY(liveCDEditStickerLayout.f159497h.f159560e);
                                liveCDEditStickerView4.setVisibility(0);
                                liveCDEditStickerLayout.requestLayout();
                                LiveCDEditStickerView liveCDEditStickerView5 = liveCDEditStickerLayout.f159504o;
                                if (liveCDEditStickerView5 != null) {
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(liveCDEditStickerView5, "scaleX", 0.0f, 1.0f);
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(liveCDEditStickerView5, "scaleY", 0.0f, 1.0f);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    animatorSet2.setDuration(300L);
                                    animatorSet2.play(ofFloat6).with(ofFloat7);
                                    animatorSet2.addListener(new C71185c(liveCDEditStickerView5, liveCDEditStickerLayout));
                                    animatorSet2.start();
                                }
                            }
                            liveCDEditStickerLayout.f159501l = true;
                        }
                    }
                    liveCDEditStickerLayout.f159500k = rect.height();
                }
            }
            return C89391z.f203057a;
        }
    }

    public final void setBeforeChangeListener(AbstractC89172b<? super LiveCDEditStickerView, C89391z> bVar) {
        this.f159485D = bVar;
    }

    public final void setFirstEdit(boolean z) {
        this.f159511v = z;
    }

    public final void setHintTextState(int i) {
        this.f159489H = i;
    }

    public final void setLiveCDStickerController(C71211a aVar) {
        this.f159488G = aVar;
    }

    public final void setMChild(LiveCDEditStickerView liveCDEditStickerView) {
        this.f159504o = liveCDEditStickerView;
    }

    public final void setMaxLine(int i) {
        this.f159487F = i;
    }

    public final void setOnCompleteListener(AbstractC89183m<? super LiveCDEditStickerView, ? super Boolean, C89391z> mVar) {
        this.f159484C = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$b */
    public static final class C71184b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LiveCDEditStickerLayout f159512a;

        static {
            Covode.recordClassIndex(83693);
        }

        C71184b(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f159512a = liveCDEditStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f159512a.f159507r = null;
            this.f159512a.getMChild();
            this.f159512a.mo112536b(false);
            this.f159512a.setVisibility(4);
            this.f159512a.f159494e = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$d */
    public static final class C71186d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LiveCDEditStickerLayout f159515a;

        static {
            Covode.recordClassIndex(83695);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71186d(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f159515a = liveCDEditStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            LiveCDEditStickerView mChild = this.f159515a.getMChild();
            if (mChild != null) {
                mChild.mo112566c();
            }
            LiveCDEditStickerView mChild2 = this.f159515a.getMChild();
            if (mChild2 != null) {
                mChild2.mo112565b();
            }
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159515a;
            LiveCDEditStickerView mChild3 = liveCDEditStickerLayout.getMChild();
            if (mChild3 == null) {
                C89219l.m154715b();
            }
            liveCDEditStickerLayout.mo112532a(mChild3);
            LiveCDEditStickerLayout.m125782a(this.f159515a).setVisibility(0);
            this.f159515a.mo112531a(0);
            this.f159515a.f159495f = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$f */
    public static final class C71189f implements AbstractC71207d {

        /* renamed from: a */
        final /* synthetic */ LiveCDEditStickerLayout f159518a;

        static {
            Covode.recordClassIndex(83698);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71189f(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f159518a = liveCDEditStickerLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.AbstractC71207d
        /* renamed from: a */
        public final void mo112558a(String str) {
            float f;
            LiveCDEditStickerView mChild;
            this.f159518a.mo112531a(-1);
            AVTextView aVTextView = this.f159518a.f159492c;
            if (aVTextView != null) {
                if (TextUtils.isEmpty(str) || (mChild = this.f159518a.getMChild()) == null || !mChild.mo112568e()) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                aVTextView.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$g */
    public static final class C71190g extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ LiveCDEditStickerLayout f159519a;

        static {
            Covode.recordClassIndex(83699);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71190g(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f159519a = liveCDEditStickerLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            AVTextView aVTextView = this.f159519a.f159492c;
            if (aVTextView != null) {
                aVTextView.performClick();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$h */
    public static final class C71191h extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ LiveCDEditStickerLayout f159520a;

        static {
            Covode.recordClassIndex(83700);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71191h(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f159520a = liveCDEditStickerLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            LiveCDEditStickerView mChild;
            if (this.f159520a.mo112537b() && (mChild = this.f159520a.getMChild()) != null) {
                mChild.mo112569f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$i */
    public static final class C71192i extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ LiveCDEditStickerLayout f159521a;

        static {
            Covode.recordClassIndex(83701);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71192i(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f159521a = liveCDEditStickerLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            String str;
            C71211a liveCDStickerController;
            LiveCDEditStickerView mChild = this.f159521a.getMChild();
            if (mChild != null) {
                mChild.mo112570g();
            }
            C17197a.C17200a aVar = new C17197a.C17200a(this.f159521a.getContext());
            Context context = this.f159521a.getContext();
            C89219l.m154716b(context, "");
            aVar.f41070a = context.getResources().getString(R.string.auq);
            Context context2 = this.f159521a.getContext();
            C89219l.m154716b(context2, "");
            aVar.f41071b = context2.getResources().getString(R.string.aun);
            Context context3 = this.f159521a.getContext();
            C89219l.m154716b(context3, "");
            C17197a.C17200a a = aVar.mo27192a(context3.getResources().getString(R.string.aup), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC71193a(this), false);
            Context context4 = this.f159521a.getContext();
            C89219l.m154716b(context4, "");
            a.mo27196b(context4.getResources().getString(R.string.auo), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC71194b(this), false).mo27193a().mo27185c();
            C71169d dVar = this.f159521a.f159510u;
            if (dVar != null) {
                C84425b a2 = new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("enter_method", "click_main_panel").mo129406a("shoot_way", dVar.f159420a.mShootWay).mo129406a("creation_id", dVar.f159420a.creationId).mo129406a("content_source", C70968bl.m125262b(dVar.f159420a)).mo129406a("content_type", C70968bl.m125249a(dVar.f159420a));
                LiveCDEditStickerLayout liveCDEditStickerLayout = dVar.f159421b;
                if (liveCDEditStickerLayout == null || (liveCDStickerController = liveCDEditStickerLayout.getLiveCDStickerController()) == null) {
                    str = null;
                } else {
                    str = liveCDStickerController.f159573a;
                }
                C39162r.m79460a("livesdk_cd_sticker_cancel", a2.mo129406a("prop_id", str).f188764a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$i$a */
        static final class DialogInterface$OnClickListenerC71193a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C71192i f159522a;

            static {
                Covode.recordClassIndex(83702);
            }

            DialogInterface$OnClickListenerC71193a(C71192i iVar) {
                this.f159522a = iVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C71169d dVar = this.f159522a.f159521a.f159510u;
                if (dVar != null) {
                    dVar.mo112484a(true);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$i$b */
        static final class DialogInterface$OnClickListenerC71194b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C71192i f159523a;

            static {
                Covode.recordClassIndex(83703);
            }

            DialogInterface$OnClickListenerC71194b(C71192i iVar) {
                this.f159523a = iVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                this.f159523a.f159521a.f159505p = LiveCDEditStickerLayout.f159479w;
                LiveCDEditStickerView mChild = this.f159523a.f159521a.getMChild();
                if (mChild != null) {
                    mChild.mo112569f();
                }
                this.f159523a.f159521a.mo112534a(true);
                this.f159523a.f159521a.f159508s.mo112864b();
                C71169d dVar = this.f159523a.f159521a.f159510u;
                if (dVar != null) {
                    dVar.mo112484a(false);
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AVTextView m125782a(LiveCDEditStickerLayout liveCDEditStickerLayout) {
        AVTextView aVTextView = liveCDEditStickerLayout.f159491b;
        if (aVTextView == null) {
            C89219l.m154710a("liveCDHint");
        }
        return aVTextView;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout$c */
    public static final class C71185c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LiveCDEditStickerView f159513a;

        /* renamed from: b */
        final /* synthetic */ LiveCDEditStickerLayout f159514b;

        static {
            Covode.recordClassIndex(83694);
        }

        public final void onAnimationEnd(Animator animator) {
            LiveCDEditStickerView mChild = this.f159514b.getMChild();
            if (mChild != null) {
                mChild.mo112566c();
            }
            LiveCDEditStickerView mChild2 = this.f159514b.getMChild();
            if (mChild2 != null) {
                mChild2.mo112565b();
            }
            this.f159514b.mo112532a(this.f159513a);
            LiveCDEditStickerLayout.m125782a(this.f159514b).setVisibility(0);
            this.f159514b.mo112531a(0);
            this.f159514b.f159495f = false;
        }

        C71185c(LiveCDEditStickerView liveCDEditStickerView, LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f159513a = liveCDEditStickerView;
            this.f159514b = liveCDEditStickerLayout;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo112536b(boolean z) {
        MethodCollector.m26663i(13412);
        LiveCDEditStickerView liveCDEditStickerView = this.f159504o;
        if (liveCDEditStickerView != null) {
            RelativeLayout relativeLayout = this.f159483B;
            if (relativeLayout == null) {
                C89219l.m154710a("container");
            }
            relativeLayout.removeView(liveCDEditStickerView);
            AVTextView aVTextView = this.f159491b;
            if (aVTextView == null) {
                C89219l.m154710a("liveCDHint");
            }
            aVTextView.setVisibility(8);
            liveCDEditStickerView.setEditEnable(false);
            m125786e();
            AbstractC89183m<? super LiveCDEditStickerView, ? super Boolean, C89391z> mVar = this.f159484C;
            if (mVar != null) {
                mVar.invoke(this.f159504o, Boolean.valueOf(z));
            }
            this.f159504o = null;
            MethodCollector.m26664o(13412);
            return;
        }
        MethodCollector.m26664o(13412);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.AbstractC71208e
    /* renamed from: a */
    public final void mo112531a(int i) {
        this.f159489H = i;
        if (i == -1) {
            AVTextView aVTextView = this.f159491b;
            if (aVTextView == null) {
                C89219l.m154710a("liveCDHint");
            }
            aVTextView.setText("");
        } else if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AVTextView aVTextView2 = this.f159491b;
                    if (aVTextView2 == null) {
                        C89219l.m154710a("liveCDHint");
                    }
                    aVTextView2.setText(R.string.aut);
                } else if (i == 3) {
                    AVTextView aVTextView3 = this.f159491b;
                    if (aVTextView3 == null) {
                        C89219l.m154710a("liveCDHint");
                    }
                    aVTextView3.setText(R.string.aur);
                } else if (i == 4) {
                    AVTextView aVTextView4 = this.f159491b;
                    if (aVTextView4 == null) {
                        C89219l.m154710a("liveCDHint");
                    }
                    aVTextView4.setText(R.string.aus);
                }
            } else if (this.f159508s.mo112863a()) {
                AVTextView aVTextView5 = this.f159491b;
                if (aVTextView5 == null) {
                    C89219l.m154710a("liveCDHint");
                }
                aVTextView5.setText("");
            } else {
                AVTextView aVTextView6 = this.f159491b;
                if (aVTextView6 == null) {
                    C89219l.m154710a("liveCDHint");
                }
                aVTextView6.setText(R.string.avn);
            }
        } else if (this.f159508s.mo112863a()) {
            AVTextView aVTextView7 = this.f159491b;
            if (aVTextView7 == null) {
                C89219l.m154710a("liveCDHint");
            }
            aVTextView7.setText("");
        } else {
            AVTextView aVTextView8 = this.f159491b;
            if (aVTextView8 == null) {
                C89219l.m154710a("liveCDHint");
            }
            aVTextView8.setText(R.string.bxm);
        }
    }

    /* renamed from: a */
    public final void mo112532a(View view) {
        AVTextView aVTextView = this.f159491b;
        if (aVTextView == null) {
            C89219l.m154710a("liveCDHint");
        }
        ViewGroup.LayoutParams layoutParams = aVTextView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float height = (float) (iArr[1] + view.getHeight());
        RelativeLayout relativeLayout = this.f159483B;
        if (relativeLayout == null) {
            C89219l.m154710a("container");
        }
        marginLayoutParams.topMargin = (int) (height + C30745b.m63132b(relativeLayout.getContext(), 8.0f));
        marginLayoutParams.width = C40979n.m82507b(getContext());
        AVTextView aVTextView2 = this.f159491b;
        if (aVTextView2 == null) {
            C89219l.m154710a("liveCDHint");
        }
        aVTextView2.setLayoutParams(marginLayoutParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.AbstractC71208e
    /* renamed from: a */
    public final void mo112534a(boolean z) {
        LiveCDEditStickerView liveCDEditStickerView;
        this.f159501l = false;
        LiveCDEditStickerView liveCDEditStickerView2 = this.f159504o;
        if (liveCDEditStickerView2 != null) {
            liveCDEditStickerView2.setTouchEnable(true);
        }
        LiveCDEditStickerView liveCDEditStickerView3 = this.f159504o;
        if (liveCDEditStickerView3 != null) {
            liveCDEditStickerView3.setState(0);
        }
        AVTextView aVTextView = this.f159491b;
        if (aVTextView == null) {
            C89219l.m154710a("liveCDHint");
        }
        aVTextView.setVisibility(8);
        this.f159511v = false;
        if (!this.f159502m) {
            LiveCDEditStickerView liveCDEditStickerView4 = this.f159504o;
            if (liveCDEditStickerView4 != null && liveCDEditStickerView4.f159534e) {
                if (z && (liveCDEditStickerView = this.f159504o) != null) {
                    LiveCDEditText liveCDEditText = liveCDEditStickerView.f159531b;
                    if (liveCDEditText == null) {
                        C89219l.m154710a("edLiveTitle");
                    }
                    liveCDEditText.setText(liveCDEditStickerView.f159533d.f159562a);
                    liveCDEditStickerView.f159536g = liveCDEditStickerView.f159533d.f159563b;
                    C71167b a = C71168c.m125750a(liveCDEditStickerView.f159536g, System.currentTimeMillis());
                    liveCDEditStickerView.mo112564a(a.f159414a, a.f159415b, a.f159416c, a.f159417d, false);
                    AbstractC71207d dVar = liveCDEditStickerView.f159538i;
                    if (dVar != null) {
                        LiveCDEditText liveCDEditText2 = liveCDEditStickerView.f159531b;
                        if (liveCDEditText2 == null) {
                            C89219l.m154710a("edLiveTitle");
                        }
                        dVar.mo112558a(String.valueOf(liveCDEditText2.getText()));
                    }
                }
                m125785d();
            } else if (z) {
                C71169d dVar2 = this.f159510u;
                if (dVar2 != null) {
                    dVar2.mo112485b(true);
                }
                mo112536b(z);
                mo112529a();
                setVisibility(4);
            } else {
                m125785d();
            }
            this.f159502m = true;
        }
        Context context = getContext();
        if (context instanceof AbstractC84919c) {
            ((AbstractC84919c) context).mo87535c(this);
        }
    }

    /* renamed from: a */
    public final void mo112530a(float f, float f2) {
        this.f159503n.x = f;
        this.f159503n.y = f2;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        LiveCDEditStickerView liveCDEditStickerView;
        if (i != 4 || (liveCDEditStickerView = this.f159504o) == null || liveCDEditStickerView.getVisibility() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        LiveCDEditStickerView liveCDEditStickerView2 = this.f159504o;
        if (liveCDEditStickerView2 != null) {
            liveCDEditStickerView2.mo112570g();
        }
        LiveCDEditStickerView liveCDEditStickerView3 = this.f159504o;
        if (liveCDEditStickerView3 == null || !liveCDEditStickerView3.f159534e) {
            AVTextView aVTextView = this.f159493d;
            if (aVTextView != null) {
                aVTextView.performClick();
            }
        } else {
            AVTextView aVTextView2 = this.f159492c;
            if (aVTextView2 != null) {
                aVTextView2.performClick();
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m125783a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13397);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(13397);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private final Animator m125781a(View view, Animator.AnimatorListener animatorListener) {
        float f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", this.f159497h.f159556a, this.f159498i.f159556a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", this.f159497h.f159557b, this.f159498i.f159557b);
        float[] fArr = new float[2];
        if (this.f159498i.f159558c > 180.0f) {
            f = 360.0f;
        } else {
            f = this.f159497h.f159558c;
        }
        fArr[0] = f;
        fArr[1] = this.f159498i.f159558c;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", this.f159497h.f159559d, this.f159498i.f159559d);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", this.f159497h.f159560e, this.f159498i.f159560e);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.addListener(animatorListener);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
        animatorSet.start();
        return animatorSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        if (p4600h.C89391z.f203057a == null) goto L_0x0084;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.AbstractC71208e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112533a(com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView r11, com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.C71203a r12) {
        /*
        // Method dump skipped, instructions count: 384
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout.mo112533a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.a):void");
    }

    private /* synthetic */ LiveCDEditStickerLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LiveCDEditStickerLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13479);
        this.f159496g = new C71195j(this);
        this.f159497h = new C71203a((byte) 0);
        this.f159498i = new C71203a((byte) 0);
        this.f159486E = true;
        this.f159503n = new PointF(0.0f, 0.0f);
        this.f159505p = f159479w;
        this.f159487F = 2;
        this.f159508s = new C71372a();
        this.f159511v = true;
        setBackgroundColor(C0643b.m2378c(getContext(), R.color.bk));
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.afy, this, false);
        if (a != null) {
            RelativeLayout relativeLayout = (RelativeLayout) a;
            this.f159483B = relativeLayout;
            if (relativeLayout == null) {
                C89219l.m154710a("container");
            }
            addView(relativeLayout);
            RelativeLayout relativeLayout2 = this.f159483B;
            if (relativeLayout2 == null) {
                C89219l.m154710a("container");
            }
            View findViewById = relativeLayout2.findViewById(R.id.ca1);
            C89219l.m154716b(findViewById, "");
            this.f159491b = (AVTextView) findViewById;
            RelativeLayout relativeLayout3 = this.f159483B;
            if (relativeLayout3 == null) {
                C89219l.m154710a("container");
            }
            this.f159492c = (AVTextView) relativeLayout3.findViewById(R.id.ey4);
            RelativeLayout relativeLayout4 = this.f159483B;
            if (relativeLayout4 == null) {
                C89219l.m154710a("container");
            }
            this.f159493d = (AVTextView) relativeLayout4.findViewById(R.id.ey3);
            setOnClickListener(this);
            RelativeLayout relativeLayout5 = this.f159483B;
            if (relativeLayout5 == null) {
                C89219l.m154710a("container");
            }
            relativeLayout5.setOnClickListener(new C71190g(this));
            AVTextView aVTextView = this.f159492c;
            if (aVTextView != null) {
                aVTextView.setOnClickListener(new C71191h(this));
            }
            AVTextView aVTextView2 = this.f159493d;
            if (aVTextView2 != null) {
                aVTextView2.setOnClickListener(new C71192i(this));
            }
            setVisibility(4);
            m125784c();
            MethodCollector.m26664o(13479);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
        MethodCollector.m26664o(13479);
        throw nullPointerException;
    }
}
