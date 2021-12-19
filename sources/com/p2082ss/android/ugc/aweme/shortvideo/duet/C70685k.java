package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.AVCircleProgressView;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p2082ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.k */
public final class C70685k extends RecyclerView.ViewHolder {

    /* renamed from: f */
    public static final C70687a f158218f = new C70687a((byte) 0);

    /* renamed from: a */
    AVDmtImageTextView f158219a;

    /* renamed from: b */
    public StickerWrapper f158220b;

    /* renamed from: c */
    public final FrameLayout f158221c;

    /* renamed from: d */
    public final AbstractC46415f f158222d;

    /* renamed from: e */
    public final AbstractC70688b f158223e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.k$b */
    public interface AbstractC70688b {
        static {
            Covode.recordClassIndex(83159);
        }

        /* renamed from: a */
        void mo111513a(int i, boolean z);
    }

    static {
        Covode.recordClassIndex(83156);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.k$a */
    public static final class C70687a {
        static {
            Covode.recordClassIndex(83158);
        }

        private C70687a() {
        }

        public /* synthetic */ C70687a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Object m124928a(String str) {
            C89219l.m154721d(str, "");
            String obj = C89361p.m154910b((CharSequence) str).toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = obj.toLowerCase();
            C89219l.m154716b(lowerCase, "");
            switch (lowerCase.hashCode()) {
                case -1984141450:
                    if (lowerCase.equals("vertical")) {
                        return 2131232269;
                    }
                    return str;
                case -865465250:
                    if (lowerCase.equals("triple")) {
                        return 2131232268;
                    }
                    return str;
                case 346401221:
                    if (lowerCase.equals("picture_in_picture")) {
                        return 2131232267;
                    }
                    return str;
                case 1387629604:
                    if (lowerCase.equals("horizontal")) {
                        return 2131232265;
                    }
                    return str;
                case 1415681320:
                    if (lowerCase.equals("green_screen")) {
                        return 2131232263;
                    }
                    return str;
                default:
                    return str;
            }
        }
    }

    /* renamed from: c */
    public final void mo111512c(boolean z) {
        this.f158219a.mo121340a(z);
    }

    /* renamed from: a */
    public static final /* synthetic */ StickerWrapper m124922a(C70685k kVar) {
        StickerWrapper stickerWrapper = kVar.f158220b;
        if (stickerWrapper == null) {
            C89219l.m154710a("duetLayoutEffect");
        }
        return stickerWrapper;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.k$c */
    public static final class C70689c implements IEffectDownloadProgressListener {

        /* renamed from: a */
        final /* synthetic */ C70685k f158225a;

        /* renamed from: b */
        final /* synthetic */ boolean f158226b;

        static {
            Covode.recordClassIndex(83160);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            C70685k.m124922a(this.f158225a).f169183c = 2;
            C70685k kVar = this.f158225a;
            kVar.mo111509a(C70685k.m124922a(kVar));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            C70685k.m124922a(this.f158225a).f169183c = 1;
            C70685k kVar = this.f158225a;
            kVar.mo111509a(C70685k.m124922a(kVar));
            this.f158225a.mo111511b(this.f158226b);
        }

        C70689c(C70685k kVar, boolean z) {
            this.f158225a = kVar;
            this.f158226b = z;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            new C79459a(this.f158225a.f158221c.getContext()).mo123050a(R.string.bb_).mo123053a();
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i, long j) {
            C70685k.m124922a(this.f158225a).f169183c = 5;
            C70685k.m124922a(this.f158225a).f169185e = i;
            C70685k kVar = this.f158225a;
            kVar.mo111509a(C70685k.m124922a(kVar));
        }
    }

    /* renamed from: b */
    public final void mo111511b(boolean z) {
        this.f158219a.mo121340a(true);
        this.f158223e.mo111513a(getAdapterPosition(), z);
        mo111512c(true);
    }

    /* renamed from: a */
    public final void mo111510a(boolean z) {
        StickerWrapper stickerWrapper = this.f158220b;
        if (stickerWrapper == null) {
            C89219l.m154710a("duetLayoutEffect");
        }
        if (stickerWrapper.f169183c != 2) {
            StickerWrapper stickerWrapper2 = this.f158220b;
            if (stickerWrapper2 == null) {
                C89219l.m154710a("duetLayoutEffect");
            }
            if (stickerWrapper2.f169183c == 1) {
                mo111511b(z);
                return;
            }
            StickerWrapper stickerWrapper3 = this.f158220b;
            if (stickerWrapper3 == null) {
                C89219l.m154710a("duetLayoutEffect");
            }
            Effect effect = stickerWrapper3.f169181a;
            C89219l.m154716b(effect, "");
            this.f158222d.mo78887a(effect, new C70689c(this, z));
        }
    }

    /* renamed from: a */
    public final void mo111509a(StickerWrapper stickerWrapper) {
        AVDmtImageTextView aVDmtImageTextView = this.f158219a;
        int i = stickerWrapper.f169183c;
        int i2 = stickerWrapper.f169185e;
        StickerImageView stickerImageView = aVDmtImageTextView.f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        if (i == 1) {
            ImageView imageView = stickerImageView.f163434b;
            if (imageView == null) {
                C89219l.m154710a("downloadImg");
            }
            imageView.setVisibility(4);
            AVCircleProgressView aVCircleProgressView = stickerImageView.f163435c;
            if (aVCircleProgressView == null) {
                C89219l.m154710a("progressView");
            }
            aVCircleProgressView.setVisibility(4);
        } else if (i == 2) {
            ImageView imageView2 = stickerImageView.f163434b;
            if (imageView2 == null) {
                C89219l.m154710a("downloadImg");
            }
            imageView2.setVisibility(4);
            AVCircleProgressView aVCircleProgressView2 = stickerImageView.f163435c;
            if (aVCircleProgressView2 == null) {
                C89219l.m154710a("progressView");
            }
            aVCircleProgressView2.setVisibility(0);
            AVCircleProgressView aVCircleProgressView3 = stickerImageView.f163435c;
            if (aVCircleProgressView3 == null) {
                C89219l.m154710a("progressView");
            }
            aVCircleProgressView3.setProgress(0);
        } else if (i == 3) {
            if (stickerImageView.f163436d) {
                ImageView imageView3 = stickerImageView.f163434b;
                if (imageView3 == null) {
                    C89219l.m154710a("downloadImg");
                }
                imageView3.setVisibility(0);
            } else {
                ImageView imageView4 = stickerImageView.f163434b;
                if (imageView4 == null) {
                    C89219l.m154710a("downloadImg");
                }
                imageView4.setVisibility(4);
            }
            AVCircleProgressView aVCircleProgressView4 = stickerImageView.f163435c;
            if (aVCircleProgressView4 == null) {
                C89219l.m154710a("progressView");
            }
            aVCircleProgressView4.setVisibility(4);
        } else if (i == 4) {
            ImageView imageView5 = stickerImageView.f163434b;
            if (imageView5 == null) {
                C89219l.m154710a("downloadImg");
            }
            imageView5.setVisibility(4);
            AVCircleProgressView aVCircleProgressView5 = stickerImageView.f163435c;
            if (aVCircleProgressView5 == null) {
                C89219l.m154710a("progressView");
            }
            aVCircleProgressView5.setVisibility(4);
        } else if (i == 5) {
            ImageView imageView6 = stickerImageView.f163434b;
            if (imageView6 == null) {
                C89219l.m154710a("downloadImg");
            }
            imageView6.setVisibility(4);
            AVCircleProgressView aVCircleProgressView6 = stickerImageView.f163435c;
            if (aVCircleProgressView6 == null) {
                C89219l.m154710a("progressView");
            }
            if (aVCircleProgressView6.getVisibility() != 0) {
                AVCircleProgressView aVCircleProgressView7 = stickerImageView.f163435c;
                if (aVCircleProgressView7 == null) {
                    C89219l.m154710a("progressView");
                }
                aVCircleProgressView7.setVisibility(0);
            }
            AVCircleProgressView aVCircleProgressView8 = stickerImageView.f163435c;
            if (aVCircleProgressView8 == null) {
                C89219l.m154710a("progressView");
            }
            aVCircleProgressView8.setProgress(i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70685k(FrameLayout frameLayout, AbstractC46415f fVar, AbstractC70688b bVar) {
        super(frameLayout);
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f158221c = frameLayout;
        this.f158222d = fVar;
        this.f158223e = bVar;
        View findViewById = frameLayout.findViewById(R.id.cl2);
        C89219l.m154716b(findViewById, "");
        this.f158219a = (AVDmtImageTextView) findViewById;
        this.itemView.setOnClickListener(new AbstractView$OnClickListenerC81432d(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.duet.C70685k.C706861 */

            /* renamed from: a */
            final /* synthetic */ C70685k f158224a;

            static {
                Covode.recordClassIndex(83157);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f158224a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                C89219l.m154721d(view, "");
                this.f158224a.mo111510a(true);
            }
        });
    }
}
