package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.f */
public final class C83061f extends FrameLayout {

    /* renamed from: a */
    public int f185601a;

    /* renamed from: b */
    public int f185602b;

    /* renamed from: c */
    private ImageView f185603c;

    /* renamed from: d */
    private AVDmtImageTextView f185604d;

    /* renamed from: e */
    private View f185605e;

    /* renamed from: f */
    private LottieAnimationView f185606f;

    /* renamed from: g */
    private ObjectAnimator f185607g;

    /* renamed from: h */
    private C83031d f185608h;

    /* renamed from: i */
    private C83029b f185609i;

    static {
        Covode.recordClassIndex(96934);
    }

    public final C83029b getModel() {
        return this.f185609i;
    }

    /* renamed from: a */
    public final boolean mo128149a() {
        if (this.f185602b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final void m143400d() {
        ImageView imageView = this.f185603c;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        m143401e();
    }

    /* renamed from: e */
    private final void m143401e() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f185607g;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f185607g) == null)) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.f185603c;
        if (imageView != null) {
            imageView.setRotation(0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f185607g;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f185607g) == null)) {
            objectAnimator.end();
        }
        LottieAnimationView lottieAnimationView = this.f185606f;
        if (lottieAnimationView != null) {
            lottieAnimationView.mo5836d();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    private final void m143399c() {
        ImageView imageView = this.f185603c;
        if (imageView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
            this.f185607g = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(800L);
            }
            ObjectAnimator objectAnimator = this.f185607g;
            if (objectAnimator != null) {
                objectAnimator.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator2 = this.f185607g;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator3 = this.f185607g;
            if (objectAnimator3 != null) {
                objectAnimator3.start();
            }
        }
    }

    /* renamed from: b */
    private final void m143397b() {
        Resources resources;
        String str;
        AVDmtImageTextView aVDmtImageTextView = this.f185604d;
        Drawable drawable = null;
        if (aVDmtImageTextView != null) {
            Context context = aVDmtImageTextView.getContext();
            if (context != null) {
                str = context.getString(R.string.dgz);
            } else {
                str = null;
            }
            aVDmtImageTextView.setText(str);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f185604d;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.setIconImagePadding(10);
        }
        AVDmtImageTextView aVDmtImageTextView3 = this.f185604d;
        if (aVDmtImageTextView3 != null) {
            Context context2 = aVDmtImageTextView3.getContext();
            if (!(context2 == null || (resources = context2.getResources()) == null)) {
                drawable = resources.getDrawable(2131232504);
            }
            aVDmtImageTextView3.mo121336a(drawable);
        }
        ImageView imageView = this.f185603c;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        setSelectedView(false);
    }

    public final void setModel(C83029b bVar) {
        this.f185609i = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C83061f(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12043);
        this.f185601a = -1;
        MethodCollector.m26664o(12043);
    }

    /* renamed from: a */
    public final void mo128148a(C83029b bVar) {
        this.f185609i = bVar;
        if (mo128149a()) {
            m143397b();
        } else if (bVar != null) {
            m143398b(bVar);
        }
    }

    public final void setSelectedView(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f185604d;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo121340a(z);
        }
        if (!z || mo128149a()) {
            View view = this.f185605e;
            if (view != null) {
                view.setVisibility(8);
            }
            LottieAnimationView lottieAnimationView = this.f185606f;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f185605e;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView2 = this.f185606f;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.f$a */
    public static final class C83062a extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83061f f185610a;

        /* renamed from: b */
        final /* synthetic */ C83031d f185611b;

        static {
            Covode.recordClassIndex(96935);
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            TextStickerData data;
            C89219l.m154721d(view, "");
            if (this.f185610a.mo128149a()) {
                this.f185610a.mo128146a(2, false);
                C83031d dVar = this.f185611b;
                dVar.f185543t = 0;
                Iterator<T> it = dVar.f185547x.iterator();
                while (it.hasNext()) {
                    it.next().setSelectedView(false);
                }
                dVar.f185546w = null;
                C46239q qVar = dVar.f185542l;
                if (!(qVar == null || (data = qVar.getData()) == null || data.getAudioTrackIndex() < 0)) {
                    C83066j.m143418b(new ShortVideoCommonParams(dVar.mo128127b().mShootWay, C71817eu.m126790a(dVar.mo128127b()), C71817eu.m126792c(dVar.mo128127b()), dVar.mo128127b().creationId));
                    String speakerID = data.getSpeakerID();
                    if (speakerID != null) {
                        dVar.mo128134e(speakerID);
                    }
                    AbstractC31071f value = dVar.mo128120a().mo114778C().getValue();
                    if (value != null) {
                        value.mo56351e(data.getAudioTrackIndex());
                    }
                    data.setHasReadTextAudio(false);
                    data.setAudioTrackIndex(-1);
                    data.setSpeakerID(null);
                }
                this.f185610a.setSelectedView(true);
            }
            if (this.f185610a.f185601a == 2) {
                this.f185611b.f185543t = this.f185610a.f185602b;
            }
            if (this.f185610a.f185601a == 0) {
                this.f185610a.mo128146a(2, false);
                this.f185611b.mo128132d(this.f185610a.f185602b);
            }
            if (this.f185610a.f185601a == 1) {
                this.f185611b.mo128132d(this.f185610a.f185602b);
            }
        }

        C83062a(C83061f fVar, C83031d dVar) {
            this.f185610a = fVar;
            this.f185611b = dVar;
        }
    }

    /* renamed from: b */
    private void m143398b(C83029b bVar) {
        List<String> urlList;
        AVDmtImageTextView aVDmtImageTextView;
        C89219l.m154721d(bVar, "");
        if (bVar.f106810b != null) {
            AVDmtImageTextView aVDmtImageTextView2 = this.f185604d;
            if (aVDmtImageTextView2 != null) {
                aVDmtImageTextView2.setText(bVar.f106810b.getName());
            }
            if (bVar.f185506c.f185595a) {
                AVDmtImageTextView aVDmtImageTextView3 = this.f185604d;
                if (aVDmtImageTextView3 != null) {
                    aVDmtImageTextView3.mo121335a(2131232702);
                }
            } else {
                UrlModel iconUrl = bVar.f106810b.getIconUrl();
                if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || urlList.isEmpty() || (aVDmtImageTextView = this.f185604d) == null)) {
                    if (urlList == null) {
                        C89219l.m154715b();
                    }
                    aVDmtImageTextView.mo121338a(urlList.get(0));
                }
            }
            setSelectedView(false);
            C83031d dVar = this.f185608h;
            if (dVar == null) {
                C89219l.m154710a("scene");
            }
            if (dVar.mo128129b(bVar.f185506c.f185597c)) {
                mo128146a(1, false);
            } else {
                mo128146a(0, false);
            }
        }
    }

    public /* synthetic */ C83061f(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    public final void mo128146a(int i, boolean z) {
        this.f185601a = i;
        if (i != 0) {
            if (i == 1) {
                m143400d();
                if (z) {
                    setSelectedView(true);
                    return;
                }
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
            } else if (this.f185602b == 0) {
                setSelectedView(true);
                return;
            } else {
                ImageView imageView = this.f185603c;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView2 = this.f185603c;
                if (imageView2 != null) {
                    imageView2.setImageResource(2131230947);
                }
                m143399c();
                return;
            }
        }
        ImageView imageView3 = this.f185603c;
        if (imageView3 != null) {
            imageView3.setImageResource(2131232478);
        }
        ImageView imageView4 = this.f185603c;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        m143401e();
    }

    /* renamed from: a */
    public final void mo128147a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i, C83031d dVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(dVar, "");
        this.f185602b = i;
        this.f185608h = dVar;
        View a = C1764a.m5927a(layoutInflater, R.layout.dp, viewGroup, false);
        this.f185603c = (ImageView) a.findViewById(R.id.bsq);
        this.f185606f = (LottieAnimationView) a.findViewById(R.id.chf);
        this.f185605e = a.findViewById(R.id.b7v);
        LottieAnimationView lottieAnimationView = this.f185606f;
        if (lottieAnimationView != null) {
            lottieAnimationView.setAnimation("little_audio_wave_anim.json");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.mo5826a();
        }
        this.f185604d = (AVDmtImageTextView) a.findViewById(R.id.bmd);
        a.setOnClickListener(new C83062a(this, dVar));
        addView(a);
    }
}
