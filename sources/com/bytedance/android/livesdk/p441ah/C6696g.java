package com.bytedance.android.livesdk.p441ah;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.EnumC4408av;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p441ah.C6689d;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ah.g */
public final class C6696g extends AbstractC11293v {

    /* renamed from: k */
    public static final C6697a f16607k = new C6697a((byte) 0);

    /* renamed from: a */
    public String f16608a;

    /* renamed from: b */
    public View f16609b;

    /* renamed from: c */
    public ViewGroup f16610c;

    /* renamed from: d */
    public ViewGroup f16611d;

    /* renamed from: e */
    public LiveTextView f16612e;

    /* renamed from: f */
    public LiveTextView f16613f;

    /* renamed from: g */
    public C6689d f16614g;

    /* renamed from: h */
    public int f16615h;

    /* renamed from: i */
    public Activity f16616i;

    /* renamed from: j */
    public long f16617j;

    /* renamed from: l */
    private FrameLayout f16618l;

    /* renamed from: m */
    private FrameLayout f16619m;

    /* renamed from: n */
    private HashMap f16620n;

    static {
        Covode.recordClassIndex(7434);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f16620n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f16620n == null) {
            this.f16620n = new HashMap();
        }
        View view = (View) this.f16620n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16620n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.ah.g$a */
    public static final class C6697a {
        static {
            Covode.recordClassIndex(7435);
        }

        private C6697a() {
        }

        public /* synthetic */ C6697a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ah.g$b */
    public static final class C6698b implements C6689d.AbstractC6690a {

        /* renamed from: a */
        final /* synthetic */ C6696g f16621a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f16622b;

        static {
            Covode.recordClassIndex(7436);
        }

        @Override // com.bytedance.android.livesdk.p441ah.C6689d.AbstractC6690a
        /* renamed from: a */
        public final void mo12835a() {
            C3854a.m9453a(4, "picture_in_picture", "startCountDownTime onFinish() ");
            this.f16621a.f16614g = null;
            this.f16622b.invoke();
        }

        @Override // com.bytedance.android.livesdk.p441ah.C6689d.AbstractC6690a
        /* renamed from: b */
        public final void mo12837b(int i) {
            C3854a.m9453a(4, "picture_in_picture", "startCountDownTime start time length is ".concat(String.valueOf(i)));
            this.f16621a.mo12851b(i);
        }

        @Override // com.bytedance.android.livesdk.p441ah.C6689d.AbstractC6690a
        /* renamed from: a */
        public final void mo12836a(int i) {
            C3854a.m9453a(4, "picture_in_picture", "startCountDownTime start time length is ".concat(String.valueOf(i)));
            this.f16621a.mo12851b(i);
        }

        C6698b(C6696g gVar, AbstractC89171a aVar) {
            this.f16621a = gVar;
            this.f16622b = aVar;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.bce);
        bVar.f27015b = R.style.a3b;
        bVar.f27014a = 1;
        bVar.f27019f = 0.0f;
        bVar.f27021h = -1;
        bVar.f27022i = -1;
        bVar.f27020g = 17;
        return bVar;
    }

    /* renamed from: d */
    public final void mo9929d() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        FrameLayout frameLayout = this.f16619m;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.leftMargin = 0;
            FrameLayout frameLayout2 = this.f16619m;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams);
            }
            FrameLayout frameLayout3 = this.f16619m;
            if (frameLayout3 != null) {
                frameLayout3.setTranslationX(0.0f);
            }
            FrameLayout frameLayout4 = this.f16619m;
            if (frameLayout4 != null) {
                frameLayout4.setTranslationY(0.0f);
            }
        }
        View view = this.f16609b;
        if (view != null) {
            layoutParams2 = view.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.rightMargin = 0;
            marginLayoutParams2.bottomMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            if (view != null) {
                view.setLayoutParams(layoutParams2);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
            }
        }
        ViewGroup viewGroup = this.f16611d;
        if (viewGroup != null) {
            layoutParams3 = viewGroup.getLayoutParams();
        }
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.topMargin = 0;
            marginLayoutParams3.rightMargin = 0;
            marginLayoutParams3.bottomMargin = 0;
            marginLayoutParams3.leftMargin = 0;
            if (viewGroup != null) {
                viewGroup.setLayoutParams(layoutParams3);
                viewGroup.setTranslationX(0.0f);
                viewGroup.setTranslationY(0.0f);
            }
        }
        C3854a.m9453a(4, "picture_in_picture", " adapterPipLayout, ");
        FrameLayout frameLayout5 = this.f16619m;
        if (frameLayout5 != null) {
            frameLayout5.measure(0, 0);
        }
    }

    /* renamed from: e */
    private void m14230e() {
        Integer num;
        Bitmap bitmap;
        Resources resources;
        MethodCollector.m26663i(3313);
        FrameLayout frameLayout = this.f16618l;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a, "");
        AbstractC5777j b = ((AbstractC4357d) a).getLivePlayControllerManager().mo11553b(this.f16608a);
        if (b != null) {
            View o = b.mo12931o();
            if (o != null) {
                Integer num2 = null;
                if ((o instanceof TextureRenderView) && (bitmap = ((TextureRenderView) o).getBitmap()) != null) {
                    ImageView imageView = new ImageView(this.f16616i);
                    imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    Activity activity = this.f16616i;
                    if (activity != null) {
                        resources = activity.getResources();
                    } else {
                        resources = null;
                    }
                    imageView.setBackground(new BitmapDrawable(resources, bitmap));
                    FrameLayout frameLayout2 = this.f16618l;
                    if (frameLayout2 != null) {
                        frameLayout2.addView(imageView);
                    }
                    C3854a.m9453a(4, "picture_in_picture", "  mPipVideoViewContainer?.addView(imageView)width: " + imageView.getWidth() + ",height: " + imageView.getHeight());
                }
                this.f16609b = o;
                if (o.getParent() instanceof ViewGroup) {
                    ViewParent parent = o.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(o);
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                        MethodCollector.m26664o(3313);
                        throw nullPointerException;
                    }
                }
                FrameLayout frameLayout3 = this.f16618l;
                if (frameLayout3 != null) {
                    frameLayout3.addView(o);
                }
                mo9929d();
                StringBuilder append = new StringBuilder("  mPipVideoViewContainer?.addView(mVideoView)width: ").append(o.getWidth()).append(",height: ").append(o.getHeight()).append(",mPipVideoViewContainer width: ");
                FrameLayout frameLayout4 = this.f16618l;
                if (frameLayout4 != null) {
                    num = Integer.valueOf(frameLayout4.getWidth());
                } else {
                    num = null;
                }
                StringBuilder append2 = append.append(num).append(",mPipVideoViewContainer height: ");
                FrameLayout frameLayout5 = this.f16618l;
                if (frameLayout5 != null) {
                    num2 = Integer.valueOf(frameLayout5.getHeight());
                }
                C3854a.m9453a(3, "picture_in_picture", append2.append(num2).toString());
                MethodCollector.m26664o(3313);
                return;
            }
            MethodCollector.m26664o(3313);
            return;
        }
        MethodCollector.m26664o(3313);
    }

    /* renamed from: a */
    private final void m14229a(AbstractC89171a<C89391z> aVar) {
        if (this.f16614g == null) {
            C6689d dVar = new C6689d(new C6698b(this, aVar));
            this.f16614g = dVar;
            dVar.mo12834a();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f16617j = 0;
        C6689d dVar = this.f16614g;
        if (dVar != null) {
            dVar.f16592a.removeCallbacks(dVar.f16593b);
            dVar.f16592a.removeCallbacks(dVar.f16594c);
        }
        this.f16614g = null;
        this.f16608a = null;
    }

    /* renamed from: b */
    public final void mo12851b(int i) {
        LiveTextView liveTextView = this.f16613f;
        if (liveTextView != null) {
            liveTextView.setText(C3966y.m9660a((int) R.string.ef6, Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public final void mo12850a(int i, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f16615h = i;
        C13628n.m24510a(this.f16611d, 0);
        C13628n.m24510a(this.f16618l, 8);
        mo9929d();
        LiveTextView liveTextView = this.f16612e;
        if (liveTextView != null) {
            if (i == 1) {
                liveTextView.setText(C3966y.m9657a((int) R.string.ef7));
            } else if (i == 2) {
                liveTextView.setText(C3966y.m9657a((int) R.string.ef5));
            } else if (i == 3) {
                liveTextView.setText(C3966y.m9657a((int) R.string.ef8));
            }
        }
        m14229a(aVar);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewParent parent;
        MethodCollector.m26663i(2854);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f16619m = (FrameLayout) view.findViewById(R.id.dnb);
        this.f16618l = (FrameLayout) view.findViewById(R.id.d27);
        this.f16611d = (ViewGroup) view.findViewById(R.id.cas);
        this.f16612e = (LiveTextView) view.findViewById(R.id.d23);
        this.f16613f = (LiveTextView) view.findViewById(R.id.aex);
        mo9929d();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getUserRole(b.mo13161c()) == EnumC4408av.GUEST_AUDIENCE) {
            AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
            C89219l.m154716b(a, "");
            SurfaceView linkInAnchorSurface = ((AbstractC4409b) a).getLinkInAnchorSurface();
            FrameLayout frameLayout = this.f16618l;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(-16777216);
            }
            if (linkInAnchorSurface == null || this.f16617j == 0) {
                m14230e();
                MethodCollector.m26664o(2854);
                return;
            }
            this.f16609b = linkInAnchorSurface;
            FrameLayout frameLayout2 = this.f16618l;
            if (frameLayout2 != null && frameLayout2.getChildCount() > 0) {
                frameLayout2.removeAllViews();
            }
            C3854a.m9453a(3, "picture_in_picture", "  addLinkRoomVideoView");
            View view2 = this.f16609b;
            ViewParent viewParent = null;
            if (view2 != null) {
                viewParent = view2.getParent();
            }
            if (viewParent instanceof ViewGroup) {
                View view3 = this.f16609b;
                if (view3 == null || (parent = view3.getParent()) == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    MethodCollector.m26664o(2854);
                    throw nullPointerException;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                this.f16610c = viewGroup;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f16609b);
                }
            }
            FrameLayout frameLayout3 = this.f16618l;
            if (frameLayout3 != null) {
                frameLayout3.addView(this.f16609b);
            }
            mo9929d();
            MethodCollector.m26664o(2854);
            return;
        }
        m14230e();
        MethodCollector.m26664o(2854);
    }
}
